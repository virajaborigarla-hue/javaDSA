

public class ArrayMax {
    public static void main(String[] args) {
        int[] a={10,40,30,60,90};
        int min=Integer.MIN_VALUE;
        int max=Integer.MAX_VALUE;
        int sum=0;
        for(int i=0;i<a.length;i++){
            if(max>a[i]){
                max=a[i];
            }
            if(min<a[i]){
                min=a[i];
            }
            sum=sum+a[i];
        }
        System.out.println(sum-max);
        System.out.println(sum-min);

    }
    
}
