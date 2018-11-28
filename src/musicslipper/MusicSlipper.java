package musicslipper;

import storefront.Sellable;

public abstract class MusicSlipper extends Sellable{

	private String song;

	public void setSong(String in) {
		song = in;
	}
	
	public String getSong() {
		return song;
	}
	
	public void print() {
		System.out.println(getName() + ", " + getSong() + ": " + getPrice());
	}
	
}
