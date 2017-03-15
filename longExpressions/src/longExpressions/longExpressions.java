package longExpressions;

import java.util.Random;
import java.util.Scanner;

public class longExpressions {
	public static void main(String[] args){
		//Operators
		String[] all = {"+", "-", "*", "/", "%", "<", ">", "<=", ">=", "==", "!=", "||", "&&", "!", "-", "true", "false", "0.0", "0"};
		String[] operands = {"true", "0.0", "false", "0"};
		
		//Interaction with user
		Scanner my_scan = new Scanner(System.in);
		System.out.println("Entrez une longueur pour l'expression");
		int expressionLength = my_scan.nextInt();
		
		//Random managing
		Random r = new Random();
		
		int allLength = all.length;
		int my_integer = r.nextInt(20);
		float my_float = r.nextFloat()*20;
		int choice = r.nextInt(allLength);
		String expression = "";
		
		//Generate expression
		while(1 == 1){
			expression = "";
			for(int i = 0; i != expressionLength; i++){
				my_integer = r.nextInt(20);
				my_float = r.nextFloat()*20;
				choice = r.nextInt(all.length);
				expression += all[choice];
			}
		}
	}
}
