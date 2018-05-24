package WellForge;

import java.io.BufferedReader;

import java.io.FileReader;

public class FlatfileReader {
	public static void main(String[] args) throws Exception {
		FileReader fr=new FileReader("C:\\Users\\Baburao\\Desktop\\Interview Questions.txt");
		BufferedReader rd=new BufferedReader(fr);
		String x="";
		while((x=rd.readLine())!=null){
			System.out.println("\\Interview Questions.txt:"+x);
		}
		rd.close();
	}

}
