package com.elastic;

import com.elastic.client.highlevelclient.HighLevelClient;
import com.elastic.client.lowlevelclient.LowLevelClient;
import org.junit.Test;


/**
 * 测试类描述
 * Unit test for simple App.
 */
public class SingleThreadTest {


	@Test
	public void testLowLevelClient() {
		for (int i = 0; i < 10; i++) {
			System.out.println(LowLevelClient.getClient().toString());
		}
	}

	@Test
	public void testHighLevelClient() {
		try {
			for (int i = 0; i < 10; i++) {
				System.out.println(HighLevelClient.getClient().toString());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
