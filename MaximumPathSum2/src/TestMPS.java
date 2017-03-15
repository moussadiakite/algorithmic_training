import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TestMPS {
	public static void main(String[] args){
		int numberOfRows = 100;
		BufferedReader br = null;
		FileReader fr = null;
		String fileName = "p067_triangle.txt";
		int[] triangle = new int[numberOfRows * (numberOfRows + 1) / 2];
		
		try {
			fr = new FileReader(fileName);
			br = new BufferedReader(fr);

			String sCurrentLine;
			String[] values;
			int line = 1;

			while ((sCurrentLine = br.readLine()) != null) {
				values = sCurrentLine.split(" ");
				for(int column = 1; column <= values.length; column++)
					triangle[line * (line - 1) / 2 + column - 1] = Integer.parseInt(values[column - 1]);
				line++;
			}

		} catch (IOException e) {

			e.printStackTrace();

		} finally {

			try {

				if (br != null)
					br.close();

				if (fr != null)
					fr.close();

			} catch (IOException ex) {

				ex.printStackTrace();

			}

		}
		System.out.println("the maximum total from top to bottom of the triangle is " + MaximumPathSum2.maximumTotal(numberOfRows, triangle));
	}
}
