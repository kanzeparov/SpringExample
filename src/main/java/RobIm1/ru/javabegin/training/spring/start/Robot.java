package RobIm1.ru.javabegin.training.spring.start;

import RobIm1.ru.javabegin.training.spring.objects.SonyHand;
import RobIm1.ru.javabegin.training.spring.objects.SonyLeg;
import RobIm1.ru.javabegin.training.spring.objects.SonyHead;

public class Robot {
	
	private SonyHand hand = new SonyHand();
	private SonyLeg leg = new SonyLeg();
	private SonyHead head = new SonyHead();
	
	public void action(){
		head.calc();
		hand.catchSomething();
		leg.go();
	}

}
