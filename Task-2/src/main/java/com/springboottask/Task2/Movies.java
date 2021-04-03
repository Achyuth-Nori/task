package com.springboottask.Task2;


	import javax.persistence.CollectionTable;
	import javax.persistence.ElementCollection;
	import javax.persistence.JoinColumn;
	import java.util.ArrayList;

	public class Movies {

	    private String title;
	    private float year;

	    @ElementCollection
	    @CollectionTable(name="cast" , joinColumns=@JoinColumn(name="title"))
	    ArrayList<String> cast = new ArrayList<String>();

	    @ElementCollection
	    @CollectionTable(name="genres" , joinColumns=@JoinColumn(name="title"))
	    ArrayList<String> genres = new ArrayList <String> ();

	    // Getter Methods
	    public String getTitle() {
	        return title;
	    }
	    public float getYear() {
	        return year;
	    }
	    // Setter Methods
	    public void setTitle(String title) {
	        this.title = title;
	    }
	    public void setYear(float year) {
	        this.year = year;
	    }

}
