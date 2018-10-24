package com.techlab.factoryTest;

import com.techlab.factory.AutoMobileFactory;
import com.techlab.factory.AutoType;
import com.techlab.factory.IAutoFactory;
import com.techlab.factory.IAutoMobile;

public class Test {

	public static void main(String[] args) {
		AutoMobileFactory autoMobileFactory = AutoMobileFactory.getInstance();
		AutoMobileFactory autoMobileFactory1 = AutoMobileFactory.getInstance();

		IAutoFactory bmwFactory = autoMobileFactory.make(AutoType.BMW);
		IAutoFactory audiFactory = autoMobileFactory.make(AutoType.AUDI);
		IAutoFactory toyotaFactory = autoMobileFactory.make(AutoType.TOYOTA);

		IAutoMobile autoBMW = bmwFactory.make();
		IAutoMobile autoAudi = audiFactory.make();
		IAutoMobile autotoyota = toyotaFactory.make();

		autoBMW.start();
		autoBMW.stop();

		System.out.println("-----------------------------------" + autoMobileFactory.hashCode());
		autoAudi.start();
		autoAudi.stop();

		System.out.println("-----------------------------------" + autoMobileFactory1.hashCode());
		autotoyota.start();
		autotoyota.stop();

	}
}
