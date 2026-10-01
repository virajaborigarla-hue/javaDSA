public class ArrayMin {
    public static void main(String[] args){
        int[] a={10,40,30,60,90};
        int min=Integer.MAX_VALUE;
        for(int i=0;i<a.length;i++){
            if(min>a[i]){
                min=a[i];
            }
        }
            System.out.println(min);
    }
    
}
