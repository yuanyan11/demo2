package day03;
import java.util.Scanner;
public class Demo8 {	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//��6��
		/*String str="  T��  ",str1="  ����Ь  ",str2="  ������  ";
		int money=245,money1=570,money2=320;
		int count=2,count1=1,count2=1;
		System.out.println("��Ʒ����   ����   ����");
		System.out.println(str +"     245  "+"   2  ");
		System.out.println(str1 +"   570  "+"  1  ");
		System.out.println(str2 +"   320 "+"   1  ");		
		System.out.println("ʵ�����ѽ�"+(money*count
				+money1*count1+money2*count2)*0.8);*/
		//��1��
		int a[]= {6,9,8,12};//����һ�����飻
		int i,j;
		int temp;
		for (i=0;i<a.length;i++)//ѭ������
		{
			for(j=0;j<a.length-1;j++)//����
			{
				if(a[j+1]>a[j])//����
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;	
				}
			}
		}
		for(int c=0;c<a.length;c++)//�Ӵ�С���� 
	    System.out.print(a[c]+" ");//��ӡ*/
			 //��3��
			/* System.out.println("������");
				Scanner p= new Scanner(System.in);
				int  year=p.nextInt();
				System.out.println("������");
				Scanner p1= new Scanner(System.in);
				int  morth=p.nextInt();
				System.out.println("������");
				Scanner p2= new Scanner(System.in);
				int  day=p.nextInt();
		if(year % 4==0 && year % 100 !=0)
		{
			
		}*/
		//������
		/*System.out.println("������һ����");
		Scanner p= new Scanner(System.in);
		int  sub=p.nextInt();
		int y;
		 
		do {
			 y =sub %10;
			 System.out.print(y);
			sub =sub/10;
			 }while (sub != 0) ;*/
		//��4��
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
		System.out.println("200֮��3 �ı���֮�ͣ�"+sum);*/
		//��5��
		/*Scanner p = new Scanner(System.in); 
		System.out.print("����0��99999֮�����������");
        
		String  n;
		n = p.next(); 
		int b =n.length();
		System.out.println("�����������λ��Ϊ��"+b);*/
		//��2��
		/*{
			Scanner p = new Scanner(System.in);
			System.out.print("��������ݣ�");
			int year = p.nextInt();
			System.out.print("�������·ݣ�");
			int month = p.nextInt();
			System.out.print("�������գ�");
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
			System.out.println(year + "��" + month + "��" + day + "��" + year + "��ĵ�" + count + "��");
			} else
			System.out.println("�����������");
			}*/
	}

	}

