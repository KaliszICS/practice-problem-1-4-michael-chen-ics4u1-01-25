import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class PracticeProblem {

	public static void main(String args[]) {
		
	}

	public static String getName(int Line, String file) {
		Scanner s = null;
		try {
			if (Files.lines(Paths.get(file)).count() < Line || Line <= 0) {
				return "";
			}
			s = new Scanner(new BufferedReader(new FileReader(file)));
			for (int i = 0; i < Line - 1; i++) {
				s.nextLine();
			}
			String[] last = s.nextLine().split(" ");
			return last[0] + " " + last[1];
		} catch (IOException e) {
			return e.getMessage();
		} finally {
			if (s != null) {
				s.close();
			}
		}
	}

	public static int getAge(int Line, String file) {
		Scanner s = null;
		try {
			if (Files.lines(Paths.get(file)).count() < Line || Line <= 0) {
				return -1;
			}
			s = new Scanner(new BufferedReader(new FileReader(file)));
			for (int i = 0; i < Line - 1; i++) {
				s.nextLine();
			}
			return Integer.parseInt(s.nextLine().split(" ")[2]);
		} catch (IOException e) {
			return -1;
		} finally {
			if (s != null) {
				s.close();
			}
		}
	}

	public static int getNumber(int Line, String file) {
		Scanner s = null;
		try {
			if (Files.lines(Paths.get(file)).count() < Line || Line <= 0) {
				return -1;
			}
			s = new Scanner(new BufferedReader(new FileReader(file)));
			for (int i = 0; i < Line - 1; i++) {
				s.nextLine();
			}
			return Integer.parseInt(s.nextLine().split(" ")[3]);
		} catch (IOException e) {
			return -1;
		} finally {
			if (s != null) {
				s.close();
			}
		}
	}

	public static void fileAppend(String output, String filename) {
		BufferedWriter fw = null;
		try {
			fw = new BufferedWriter(new FileWriter(filename, true));
			fw.write(output);
		} catch (IOException e) {
			System.out.println(e);
		} finally {
			try {
				if (fw != null) {
					fw.close();
				}
			}
			catch (IOException e) {
				System.out.println(e);
			}
		}
	}
}
