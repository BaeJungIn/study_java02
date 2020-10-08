package bank;



public class BankFunction {
   BankMain bm;
   BankMember member;
   public boolean Login(String id, String pw) {
      boolean result = false;
      if(member.getId().equals(id) && member.getPw().equals(pw)) {
         System.out.println(member.getId()+"�� ȯ���մϴ�,");
         result = true;
      }else {
         System.out.println("���̵�� ��й�ȣ�� Ȯ���ϼ���.");
      }

      return result;
   }
   
   public void make() {
      System.out.println("�Է��� ���� ���� �Է��ϼ��� : ");
      int su = bm.inputNum();
      bm.list = new BankList[su];
      
      for(int i=0; i<bm.list.length; i++) {
         System.out.println("���̵� :");
         String id = bm.inputId();
         System.out.println("���¹�ȣ : ");
         String number = bm.inputNumber();
         System.out.println("�ʱ��Աݾ� : ");
         
         int money = bm.inputMoney();
         System.out.println("�̸� : ");
         String name = bm.inputName();
         bm.list[i] = new BankList(name, money, number);
      
      }
      System.out.println("���°� �����Ǿ����ϴ�.");

   }
   
   public void list() {
      for(int i=0; i<bm.list.length; i++) {
         System.out.println(bm.list[i].number+"\t"+bm.list[i].name+"\t"+bm.list[i].money);         
      }

   }
   
   public void input() {
      System.out.println("���¸� �Է��ϼ��� : ");
      String number = bm.inputNumber();
      if(bm.list.equals(number)) {
      System.out.println("�ݾ��� �Է��ϼ��� : ");
      int money = bm.inputMoney();
      
      for(int i=0; i<bm.list.length; i++) {
         money += bm.list[i].money;
         System.out.println("���¹�ȣ : "+number);
         System.out.println("���ݾ� : "+money);
      }
      System.out.println("������ �����Ǿ����ϴ�.");  
      
      

   }
   }
   
   public void output() {
      System.out.println("���¸� �Է��ϼ��� : ");
      String number = bm.inputNumber();
      if(bm.list.equals(number)) {
      System.out.println("����� �ݾ��� �Է��ϼ��� : ");
      int money = bm.inputMoney();
      
      for(int i=0; i<bm.list.length; i++) {
         money -= bm.list[i].money;
         System.out.println("���¹�ȣ : "+number);
         System.out.println("��ݾ� : "+money);
      }
      System.out.println("����� �����Ǿ����ϴ�.");
      
   }
   }

}