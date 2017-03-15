package fibo;

public class TestFibo {
	public static void main(String[] args){
		System.out.println("La somme des nombres pairs de Fibonacci dont les valeurs n'excedent pas 4 millions est " + Fibo.sum(4000000));
	}
}
