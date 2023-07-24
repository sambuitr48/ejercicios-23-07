package cycle;

public class Numbers {
    public int start;
    public int end;

    public void showCycle(){
        System.out.println("the numbers are: ");
        for (int i = start; i <= end; i++){
            if (i==5){
                i++;
            }
            System.out.println(i);
        }
    }
}