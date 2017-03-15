public class TestLPP {
	public static void main(String[] args){
		long n = 3;
		//numberLength
		//System.out.println("The lenght of " + n + " is " + LargestPalindromeProduct.numberLength(n));
		//isPalindrome
		//System.out.println(n + " is a palindromic number: " + LargestPalindromeProduct.isPalindrome(n));
		System.out.println("Le plus grand palindrome obtenu par le produit de 2 nombres à " + n + " chiffres est " + LargestPalindromeProduct.largestPalindromeProduct(n));
	}
}
