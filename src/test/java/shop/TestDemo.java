package shop;

import java.util.Scanner;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring-mybatis.xml" })
public class TestDemo {
	public static void main(String[] args) {
		for (int i=1;i<=10 ;i++ ){
			   for (int j=10;j>i ;j-- ){
				   System.out.print(" ");
			   }
			   for (int k=0;k<2*i-1 ;k++ ){
				   System.out.print("*");
			   }
			   System.out.println("");
		} 
	}
}
	
