import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class TestNS {
	public static void main(String[] args){
		BufferedReader br = null;
		FileReader fr = null;
		String fileName = "p022_names.txt";
		ArrayList<String> names = new ArrayList();
		try {
			fr = new FileReader(fileName);
			br = new BufferedReader(fr);

			String sCurrentLine;
			String[] values;
			int line = 1;

			while ((sCurrentLine = br.readLine()) != null) {
				values = sCurrentLine.split(",");
				for(int i = 0; i < values.length; i++)
					names.add(values[i]);
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
		System.out.println("The total of all the name scores in the file is " + NameScores.sum(names));
	}
}
