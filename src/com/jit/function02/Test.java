package com.jit.function02;
/*remove spaces present in string*/
import java.util.function.Function;

class Test {
	public static void main(String[] args) {
      String s = "Durga Software Solutions";
      Function<String, String> string = st -> st.replaceAll(" ", "");
      System.out.println(string.apply(s));
	}
}