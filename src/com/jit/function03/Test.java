package com.jit.function03;
/*find number of spaces in given string*/
import java.util.function.Function;

class Test {
	public static void main(String[] args) {
      String s = "Durga Software Solutions";
      Function<String, Integer> string = st -> st.length() - st.replaceAll(" ", "").length();
      System.out.println(string.apply(s));
	}
}