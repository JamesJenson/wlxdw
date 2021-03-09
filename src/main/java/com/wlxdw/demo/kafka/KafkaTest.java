package com.wlxdw.demo.kafka;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.CommonClientConfigs;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.clients.producer.RecordMetadata;
import org.apache.kafka.common.config.SaslConfigs;
import org.springframework.web.bind.annotation.*;

import java.util.Properties;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/**
 * @auther: yuzx
 * @date: 2021/3/8 11:04
 * @description: kafka测试研究
 */
@RestController
@Slf4j
@RequestMapping("/wlxdw/kafka")
@Api(value = "kafka测试接口", tags = {"kafka测试接口"})
public class KafkaTest {

    @GetMapping("/test")
    @ApiOperation(value = "测试接口",notes = "测试接口")
    public void sendKafka(@RequestParam(value = "message") String message) {
        Properties props = new Properties();
        //公网接入域名地址,即公网路由地址
        props.put("bootstrap.servers", "10.161.163.24:9092");
        props.put("acks", "all");
        props.put("retries",0);
        props.put("batch.size", 16384);
        props.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
        props.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer");
        props.put("request.timeout.ms", 10000);
        props.put("max.block.ms", 30000);
        props.put(CommonClientConfigs.SECURITY_PROTOCOL_CONFIG, "SASL_PLAINTEXT");
        props.put(SaslConfigs.SASL_MECHANISM, "PLAIN");
        //用户名密码，注：用户名是需要拼接，并非管控台的用户名：instanceId#username
        props.put("sasl.jaas.config",
                "org.apache.kafka.common.security.plain.PlainLoginModule required username=\"ckafka-jyyex2zm#smartsyn\" password=\"Smart_syn\";");
        Producer<String, String> producer = new KafkaProducer<String, String>(props);
        for (int i = 0; i < 100; i++) {
            Future<RecordMetadata> future = producer.send(new ProducerRecord<>("policySyn", UUID.randomUUID().toString()));
            try {
                System.out.println("produce offset:" + future.get().offset());
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }
        producer.close();
    }
}
