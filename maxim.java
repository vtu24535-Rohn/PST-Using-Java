public class maxim{
    public static void main(String[] args) {
        int[] a= {1342,32,4452,5432333,23432,657,213,32242,23};
        int max=a[0];
        for(int i=0; i<a.length;i++){
            if(max<a[i]){
                max=a[i];
            }
        }
        System.out.println(max);
    }
}