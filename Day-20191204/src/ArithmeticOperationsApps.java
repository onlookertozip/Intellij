import java.util.Scanner;

public class ArithmeticOperationsApps {
	public static void main (String[] args)
	 {
	ArithmeticOperations ao=new ArithmeticOperations();
	  Scanner scan = new Scanner(System.in);
	  int num1=0, num2=0;
	  int result = 0;
	  String operator = null;
	  

	  //ù��° ������ �Էºκ�
	  System.out.print("ù��° ������ >>"); 
	  num1 = scan.nextInt();
	  
	  //������ �Էºκ�
	  System.out.print("������ >>");
	  operator = scan.next();
	  
	  //�ι�° ������ �Էºκ�
	  System.out.print("�ι�° ���� �� >>");
	  num2 = scan.nextInt();
	 
	  //����� ��
	  System.out.println("================================================");
	  System.out.println(num1+" "+operator+" "+num2+"�� ����մϴ�.");
	  System.out.println("================================================");
	  
	  
	  if(operator.equals("+"))
	  {
	   result = ao.addition(num1, num2);
	   System.out.println(num1 + "+" + num2 + "=" + result+"�Դϴ�.");
	  }
	  else if(operator.equals("-"))
	  {
	   result = ao.subtraction(num1, num2);
	   System.out.println(num1+"-"+num2+"="+result+"�Դϴ�.");
	 
	  }
	  else if(operator.equals("*"))
	  {
	   result = ao.multiplication(num1, num2);
	   System.out.println(num1+"*"+num2+"="+result+"�Դϴ�.");
	  }
	  else if(operator.equals("/"))
	  {
	   System.out.println("������ �����"+num1+"/"+num2+"="+(float)ao.division(num1, num2)+"�Դϴ�.");
	  }
	  else
	  {
	   System.out.println("��Ȯ�ϰ� ������ �����ڸ� �Է����ּ���.");
	  }
	 }

}
