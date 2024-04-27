import java.util.Random;

public class HeikinCKadai {
    public static void main(String[] args){
        int[][] student = new int [2][101];
        int[][] number = new int [2][101];
        int sum = 0;
        int counter = 0;
        int j=0;
        for(int i=1;i<=100;i++){
        Random R = new Random();
        int random = R.nextInt(101);
        //学籍番号を決める
        student[0][i] = i;
        //点数を決める
        student[1][i] = random;
        if(student[1][i]>=80){
            number[0][j]=i;
            number[1][j]=student[1][i];
            j++;
        }
        sum = sum+random;
        counter++;
        System.out.println("学籍="+student[0][i]+" 点数"+student[1][i]);
        }
        int average = sum/counter;
        System.out.println("平均点="+average);

        System.out.println("80点以上の学生");
        for(int i=1;i<=counter;i++){
            if(student[1][i]>=80){
            System.out.println("学籍番号:"+student[0][i]+" 点数:"+student[1][i]);
            }
        }
    }
}
