package cp212.swulab4;
/*
*	Name: Atikan Moopayak
*	Lab: 4
*	Class:	CP212 Object Oriented Programming
*	Date: 31/01/2022
*/

class Stat {
private int num1, num2, num3;
public static final int NUMINT =3;

	public Stat(int i, int j, int k){
		num1 = setNum1(i);
		num2 = setNum2(j);
		num3 = setNum3(k);
	}
	
	public int getNum1() {
		return num1;
	}

	public int setNum1(int i) {
		return num1 = i;
	}

	public int getNum2() {
		return num2;
	}

	public int setNum2(int j) {
		return num2 = j;
	}

	public int getNum3() {
		return num3;
	}

	public int setNum3(int k) {
		return num3 = k;
	}

	public int getSum(){
		return num1+num2+num3;
	}
	
	public double getAvg(){
		return ((double)getSum())/NUMINT;
	}
	
	public double getStd(){
		double sumsquare = Math.pow(num1-getAvg(),2) + Math.pow(num2-getAvg(),2) +Math.pow(num3-getAvg(),2);

		return Math.sqrt(sumsquare/(double)(NUMINT-1));
	}
}
