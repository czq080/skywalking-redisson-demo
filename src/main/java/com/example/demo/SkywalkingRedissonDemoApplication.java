package com.example.demo;

import org.redisson.Redisson;
import org.redisson.api.RedissonClient;
import org.redisson.config.Config;

import java.util.concurrent.CountDownLatch;

public class SkywalkingRedissonDemoApplication {

	public static void main(String[] args) throws InterruptedException {
		Config config = new Config();
		config.useSingleServer().setDatabase(1).setAddress("redis://127.0.0.1:6379");
		RedissonClient redisson = Redisson.create(config);
		CountDownLatch countDownLatch = new CountDownLatch(1);
		countDownLatch.await();
	}

}
