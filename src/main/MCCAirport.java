package main;

import java.util.Random;

public class MCCAirport {
	
	final static double LANDING_TIME = 3;
	final static double TAKE_OFF_TIME = 2;
	final static double LANDING_RATE = 10;
	final static double TAKE_OFF_RATE = 10;
	
	final static int ITERATIONS = 1440;
	//main method
	public static void main(String[] args) {
		ArrayQueue<Integer> landing = new ArrayQueue<>();
		ArrayQueue<Integer> takeoff = new ArrayQueue<>();
		  int maxTime = 10;
		  int landingTime = 0;
		  int tkOffTime = 0;
		  int landings = 0;
		  int takeOffs = 0;
		 
		 
		  for(int i = 0; i < ITERATIONS; i++) {
		  //random generator
		  if(randomgenerator(LANDING_RATE)) {
			  landing.enqueue(i);
		  }
		  if(randomgenerator(TAKE_OFF_RATE)) {
			  takeOffs.enqueue(i);  
		  }
		  
		  while(true) {
			  while(!landing.isEmpty() && planeFail(landing.peek(),i,maxTime))
			  {
				  landing.dequeue(i);
		  
		  }
			
	}
		  }
	
	while (!landings.isEmpty()) {
		
	}
	
	 public static boolean randomgenerator(double parameter) {
		  Random generator = new Random(System.currentTimeMillis());
		  if(Math.random() < (parameter/60)){
			  return true;
		  }
		  else {
			  return false;
		  }
		  }
		  public static boolean planeFail(int timeIn,int timeOut,int timeGap) {
			  if(timeOut - timeIn > timeGap) {
				  return true;
			  }
			  else {
				  return false;
			  }
		  }
}
