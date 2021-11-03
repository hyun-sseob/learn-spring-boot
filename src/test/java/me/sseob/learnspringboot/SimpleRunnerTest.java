package me.sseob.learnspringboot;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SimpleRunnerTest {

	@Autowired
	Environment environment;

	@Test
	public void contextLoadsTest(){
		assertThat(environment.getProperty("sseob.name"))
				.isEqualTo("hyunseob");
	}
}