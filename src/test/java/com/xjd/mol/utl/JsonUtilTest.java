package com.xjd.mol.utl;

import com.xjd.mol.BaseTest;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class JsonUtilTest extends BaseTest {

	@Test
	public void testToString() throws Exception {
		Map<String, String> map = new HashMap<String, String>();
		map.put("pwd", "HELLO");
		map.put("other", "你好");
		System.out.println(JsonUtil.toString(map));


	}

	@Test
	public void testToString2() {
		TestBean testBean = new TestBean();
		testBean.setPwd("HELLO");
		System.out.println(JsonUtil.toString(testBean));
	}

	public static class TestBean {
		private String pwd;

		public String getPwd() {
			return pwd;
		}

		public void setPwd(String pwd) {
			this.pwd = pwd;
		}

		@Override
		public String toString() {
			return "TestBean{" +
					"pwd='" + pwd + '\'' +
					'}';
		}
	}
}