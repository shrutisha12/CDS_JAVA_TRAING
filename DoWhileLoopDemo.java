public class DoWhileLoopDemo {
    public static void main(String[] args){

        int i=10;
        int sum=0;
        do{
            System.out.println(i);
            i--;
            sum=sum+i;
        }while(i>=1);
        if(sum%2==0){
            System.out.println("sum is even : " +sum);}
            else{
                System.out.println( "Sum Is Odd : " +sum);
            }
        }
    }

