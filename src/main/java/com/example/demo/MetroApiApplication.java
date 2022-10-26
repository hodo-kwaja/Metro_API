package com.example.demo;

import MetroNavi.MetroNavi;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MetroApiApplication {
	public static void main(String[] args) {
/*		String[][] str = {{"천안", "신창", "13", "53", "W"}, {"천안", "신림", "13", "53", "W"}, {"사당", "강남", "17", "23", "W"}};
		for(String[] s : str) {
			System.out.println(s[0] + " " + s[1]);
			MetroNavi.main(s);
		}*/
		SpringApplication.run(MetroApiApplication.class, args);
	}
}
