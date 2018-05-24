package WellForge;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;

import jdk.jfr.events.FileWriteEvent;


public class FlatfileWriter {
	public static void main(String[] args) throws Exception {
		FileWriter fr=new FileWriter("C:\\Users\\Baburao\\Desktop\\Interview Questions.txt");
		BufferedWriter br=new BufferedWriter(fr);
		br.newLine();
		br.write("WellsFarges Questions");
		br.newLine();
		br.write("Testing");
		br.newLine();
		br.close();
	}

}
