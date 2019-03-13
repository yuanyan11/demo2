package day03;
import java.util.Scanner;
public class Demo8 {	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//第6题
		/*String str="  T恤  ",str1="  网球鞋  ",str2="  网球拍  ";
		int money=245,money1=570,money2=320;
		int count=2,count1=1,count2=1;
		System.out.println("商品名称   单价   数量");
		System.out.println(str +"     245  "+"   2  ");
		System.out.println(str1 +"   570  "+"  1  ");
		System.out.println(str2 +"   320 "+"   1  ");		
		System.out.println("实际消费金额："+(money*count
				+money1*count1+money2*count2)*0.8);*/
		//第1题
		int a[]= {6,9,8,12};//定义一组数组；
		int i,j;
		int temp;
		for (i=0;i<a.length;i++)//循环次数
		{
			for(j=0;j<a.length-1;j++)//排序
			{
				if(a[j+1]>a[j])//交互
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;	
				}
			}
		}
		for(int c=0;c<a.length;c++)//从大到小排序 
	    System.out.print(a[c]+" ");//打印*/
			 //第3题
			/* System.out.println("输入年");
				Scanner p= new Scanner(System.in);
				int  year=p.nextInt();
				System.out.println("输入月");
				Scanner p1= new Scanner(System.in);
				int  morth=p.nextInt();
				System.out.println("输入日");
				Scanner p2= new Scanner(System.in);
				int  day=p.nextInt();
		if(year % 4==0 && year % 100 !=0)
		{
			
		}*/
		//第三题
		/*System.out.println("请输入一个数");
		Scanner p= new Scanner(System.in);
		int  sub=p.nextInt();
		int y;
		 
		do {
			 y =sub %10;
			 System.out.print(y);
			sub =sub/10;
			 }while (sub != 0) ;*/
		//第4题
		/*int sum=1;
		int  i=1;
		while(i<200)
		{
			if(i%3==0)
			{
				sum=sum+i;
			}
			i++;
		}
		System.out.println("200之内3 的倍数之和："+sum);*/
		//第5题
		/*Scanner p = new Scanner(System.in); 
		System.out.print("输入0—99999之间的任意数：");
        
		String  n;
		n = p.next(); 
		int b =n.length();
		System.out.println("你输入的数字位数为："+b);*/
		//第2题
		/*{
			Scanner p = new Scanner(System.in);
			System.out.print("请输入年份：");
			int year = p.nextInt();
			System.out.print("请输入月份：");
			int month = p.nextInt();
			System.out.print("请输入日：");
			int day = p.nextInt();
			int count = 0;
			int days = 0;
			if (year > 0 && month > 0 && month < 13 && day > 0 && day < 32) {
			for (int i = 1; i < month; i++) {
			switch (i) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
			days = 31;
			break;
			case 4:
			case 6:
			case 9:
			case 11:
			days = 30;
			break;
			case 2: {
			if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
			days = 29;
			} else {
			days = 28;
			}
			break;
			}
			}
			count = count + days;
			}
			count = count + day;
			System.out.println(year + "年" + month + "月" + day + "日" + year + "年的第" + count + "天");
			} else
			System.out.println("数据输入错误！");
			}*/
	}

	}

