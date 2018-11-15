package exercise2;

class Person {
	private static int PopulationSize = 0;
	private static long TotalAge = 0;
	private int age;
	public Person(int age){
		this.age = age;
		PopulationSize++;
		TotalAge += age;
	}
	public static int computePopulationSize(){
		return PopulationSize;
	}
	public static float computePopulationAverage(){
		return (float)TotalAge/PopulationSize;
	}
	public static void resetPopulation(){
		PopulationSize = 0;
		TotalAge=0;
	}
}
