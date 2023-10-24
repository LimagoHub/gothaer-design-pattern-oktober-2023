package de.application;

import de.processors.MyProcessor;
import de.subscriber.EndSubscriber;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SubmissionPublisher;
import java.util.concurrent.TimeUnit;

public class Main {

	public static void main(String[] args) throws Exception{
		

		
		
		List<String> liste = List.of("1","2","drei","4","fünf","1","2","drei","4","fünf");
		
		EndSubscriber<String> endSubscriber = new EndSubscriber<>();

		
		
		SubmissionPublisher<String> publisher ;
		
		publisher = new SubmissionPublisher<String>(/*service, 100*/);
		
		
		publisher.subscribe(endSubscriber);
		
		liste.forEach(publisher::submit);

		Thread.sleep(1000);
		
		System.out.println("Ende");
		
	}

}
