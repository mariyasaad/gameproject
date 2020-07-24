package application;

public abstract class Enemy {
	private int x ; 
	private int y ; 
	private int TheHealth ; 
	int level ; 
	public abstract void move();
	public abstract void DoSound();
	public Enemy() {
		
		
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getTheHealth() {
		return TheHealth;
	}
	public void setTheHealth(int theHealth) {
		TheHealth = theHealth;
	}
	

}
