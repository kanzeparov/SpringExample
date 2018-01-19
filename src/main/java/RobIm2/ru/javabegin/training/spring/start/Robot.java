package RobIm2.ru.javabegin.training.spring.start;

import RobIm2.ru.javabegin.training.spring.interfaces.Hand;
import RobIm2.ru.javabegin.training.spring.interfaces.Head;
import RobIm2.ru.javabegin.training.spring.interfaces.Leg;

public class Robot {
	
	private Hand hand;
	private Leg leg;
	private Head head;
	
	public Robot(Hand hand, Leg leg, Head head) {
		super();
		this.hand = hand;
		this.leg = leg;
		this.head = head;
	}

	public void action(){
		head.calc();
		hand.catchSomething();
		leg.go();
	}

}
