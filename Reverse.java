public class Reverse {
    public static void main(String[] args) {
        String s=new String("Hello how are you");
        System.out.println(s);
        String[] words = s.split(" ");
    for (int i=words.length-1; i>= 0;i--) 
        {
            System.out.print(words[i] + " ");
        }
    }
}
    

