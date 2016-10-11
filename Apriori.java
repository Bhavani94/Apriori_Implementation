package cse601_hw2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Apriori {
	public static Map<String,String> parserMap = new HashMap<>();
	public static Map<String,String> diseaseIdentifier = new HashMap<>();
	public static void parser(String fileName){
		try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
			String sCurrentLine;
			String[] term;
			StringBuilder sb;
			while ((sCurrentLine = br.readLine()) != null) {
				sb = new StringBuilder();
//				System.out.println(sCurrentLine);
				term = sCurrentLine.split("\t");
				for(int i=1;i<term.length;i++){
					if(term[i].equals("UP")){
						sb.append("G"+Integer.toString(i));
//						System.out.println(sb);
					}
				}
				parserMap.put(term[0], sb.toString());
				diseaseIdentifier.put(term[0], term[term.length-1]);
//				System.out.println(diseaseIdentifier.get(term[0]));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void combination(){
		Map<String , Integer> combiMapper = new HashMap<>();
		
	}
	
	public void elimination(){
		
	}
	
	public int minSupport(int n, int count){
		return (n * count / 100);
	}
	
	public static void main(String[] args) {
		String fileName = "gene_expression.txt";
	    parser(fileName);
	}
	

}
