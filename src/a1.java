public class a1 {

    public static void main(String[] args) {
        boolean flag = true;
        int i =1 ;
        while (flag){
            if (i%2==1&&i%3==2&&i%4==3&&i%5==4&&i%6==5&&i%7==6&&i%8==7&&i%9==8&&i%10==9){
                System.out.println(i);
                flag=false;
            }else {
                i++;
            }
        }
    }
}



class Father {
    public void f1() {
        System.out.println("father-f1()");
    }

    public void f1(int i) {
        System.out.println("father-f1()  para-int " + i);
    }
}

//被调用的子类
class Son extends Father {
    public void f1() { //覆盖父类的方法
        System.out.println("Son-f1()");
    }
    public void f1(char c) {
        System.out.println("Son-s1() para-char " + c);
    }
}