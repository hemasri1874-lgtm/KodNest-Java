class Pgm6{
    public static void main(String[] args) {
        int a[] = {10,20,10,30,10,30};
        Freq fs = new Freq();
        fs.count(a,20);
    }
}
class Freq{
    int count=0;
    void count(int a[],int key){
        for(int i=0;i<=a.length-1;i++){
            if(a[i] == key){
                count++;
            }
        }
        System.out.println(key + ": " + count);
    }
}