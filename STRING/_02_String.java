package JAVA.STRING;
public class _02_String {
        public static void main(String args[]){
    
            StringBuilder sb = new StringBuilder("suman");
            System.out.println(sb);
            //char at index 0
            // System.out.println(sb.charAt(0));
            // set char at index 0
            // sb.setCharAt(2,'p');
            // System.out.println(sb);
            // sb.insert(0,'S');
            // System.out.println(sb);
            // sb.delete(0,1);
            // System.out.println(sb);
            // sb.append("kumar");
            // System.out.println(sb);
            // System.out.println(sb.length());
    
            //Q.1 reverse string
    
            for(int i=0; i<sb.length()/2;i++)
            {
                int front = i;
                int back = sb.length()-1-i;
    
                char frontChar =sb.charAt(front);
                char backChar =sb.charAt(back);
                System.out.println();
                sb.setCharAt(front,backChar);
                sb.setCharAt(back,frontChar);
            }
            System.out.println(sb);
        }
        
    }
