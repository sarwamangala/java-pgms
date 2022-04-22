package com.xworkz;

public class Film {
	public  String language;
	public String director;
	public int population;
	public  String heroine;
	public String noHero;
	public int heroAge;
	public String fName;
	public String hName;
	
	public Film(String dire, int pop, String heroi, int age, String hero) {
		System.out.println("famous  director constructor");
		director=dire;
		population=pop;
		heroine=heroi;
		heroAge=age;
	noHero=hero;
	}
	public void famousActors() {
		System.out.println("can create the new film");
	}
		public void famousHero() {
			System.out.println("yes");
		}
		public void famousHeroine() {
			System.out.println(heroine+"\t" +population+"\t"+heroine);
		}
}