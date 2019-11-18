package de.bundeswehr;

public class BlackMagic {

	int num = 1;

	public void voodo() {
		int num = 2;
		System.out.println(num);		//2
		System.out.println(this.num);	//1
	}

}
