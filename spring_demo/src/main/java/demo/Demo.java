package demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan(basePackages = "demo")
@Configuration
public class Demo {
	public hh getHh() {
		return hh;
	}

	public void setHh(hh hh) {
		this.hh = hh;
	}

	@Autowired
	public hh hh;
	public static void main(String[] args) {
		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(Demo.class);
		/**
		 * 需要扫描以下才可以哈
		 */
		autowiredDemo test = (autowiredDemo) annotationConfigApplicationContext.getBean("autowiredDemo");
		System.out.println();
//		GenericXmlApplicationContext genericXmlApplicationContext = new GenericXmlApplicationContext();
//		genericXmlApplicationContext.load("");
//		genericXmlApplicationContext.refresh();
//		Object bean = genericXmlApplicationContext.getBean("");
	}
	@Bean
	public hh hh() {
		return new hh();
	}
	@Bean
	public test test() {
		return new test();
	}

	@Bean
	MyAware myAware() {
		return new MyAware();
	}

}
