package com.jdc.mkt.lambda;

import org.junit.jupiter.api.Test;

import com.jdc.mkt.LambdaDemo;

public class LambdaTest {

	@Test
	void beforeAndAfterLambda() {
		LambdaDemo demo = new LambdaDemo();
		demo.beforeLambda("Before Lambda");
		demo.afterLambda("After Lambda");
	}
}
