package com.appiumtest;

import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class First {

	public static void main(String[] args) {

		try {
			DesiredCapabilities cap = new DesiredCapabilities();
			cap.setCapability("deviceName", "ILoveYou");
			cap.setCapability("udid", "47121028");
			cap.setCapability("platformName", "Android");
			cap.setCapability("platformVersion", "9");
			cap.setCapability("appPackage", "com.android.camera");
			cap.setCapability("appActivity", "com.android.camera.Camera");
			URL url = new URL("http://0.0.0.0:4723/wd/hub");
			AppiumDriver<MobileElement> driver = new AndroidDriver<MobileElement>(url, cap);
			System.out.println("Hey Im passed");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
