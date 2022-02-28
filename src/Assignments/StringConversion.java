package Assignments;

public class StringConversion {
	
	public void stringToStringBuffer() {
		String str1 = "Something to convert"; 
        StringBuffer sb = new StringBuffer(); 
        sb.append(str1);
        System.out.println("String to StringBuffer\t:  \""+ sb+"\"");
    
	}	
	public void stringToStringBuilder() {
		String strs[] = {"blue", "red", "yellow", "green", "orange", "cyan" };
	      StringBuilder sb = new StringBuilder();
	      sb.append(strs[0]);
	      sb.append(" "+strs[1]);
	      sb.append(" "+strs[2]);
	      sb.append(" "+strs[3]);
	      sb.append(" "+strs[4]);
	      sb.append(" "+strs[5]);
	      System.out.println(sb.toString());
	}	
	public static void main(String[] args) {
		StringConversion s = new StringConversion();
		s.stringToStringBuffer();
		s.stringToStringBuilder();
	}
}
