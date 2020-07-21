package BMI;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double BMI;
        System.out.println("请输入体重（KG）：");
        double weight=sc.nextDouble();
        System.out.println("请输入身高（M）：");
        double height=sc.nextDouble();
        BMI=weight/(height*height);
        System.out.println("您的BMI为："+BMI);
        if(BMI<18.5)
        {
            System.out.println("您的体重为偏瘦");
        }
        else if(BMI>18.5&&BMI<24)
        {
            System.out.println("恭喜您，体重正常");
        }
        else
        {
            System.out.println("你的体重为超重，请加强锻炼");
        }
    }
}
