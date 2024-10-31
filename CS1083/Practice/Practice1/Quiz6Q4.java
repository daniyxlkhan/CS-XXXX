public class Quiz6Q4 {
        public static void main(String[] args) {
          String myStr = "Hello World";
          System.err.println(func3("Hello World", 0));
        }

        public static String func3(String s, int count) {
          if (count >= s.length() / 2) {
              return s;
          } else {
              String ns = s.charAt(s.length() - count - 1) +
                      s.substring(count + 1, s.length() - count - 1) +
                      s.charAt(count);
              if (s.length() - count + 1 < s.length()) {
                  ns += s.substring(s.length() - count + 1);
              }
              return func3(ns, count + 1);
          }
      }
      
}
