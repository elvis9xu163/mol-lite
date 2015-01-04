package com.xjd.mol;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.fest.assertions.api.Assertions.assertThat;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath*:config/mol-*.xml")
public class BaseTest {

	@Autowired
	ApplicationContext springContext;

	@Test
	public void baseTest() {
		assertThat(springContext).isNotNull();
	}
}
