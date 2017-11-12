package quiz.context;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import quiz.config.SpringConfig;

public class QuizMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
		//context.getBean(requiredType)
	}

}
