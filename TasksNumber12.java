1) public class Main {
    public static void main(String[] args) {
     int a= 8;
     int b= 4;
     int sum= a+b;
     int multi= a*b;
     int div= a/b;
     int modul= a%b;
     System.out.println("Сумма: "+sum);
     System.out.println("Умножение: "+multi);
     System.out.println("Деление: "+div);
     System.out.println("Остаток: "+modul);
    }
}


2) public class Main {
    public static void main(String[] args) {
    for(int i= 1; i<=20; i++){
       if (i%2!=0) {
           System.out.println(i);
       }
    }
      }
}

3) public class Main {
    public static void main(String[] args) {
    int a=2;
    int b=4;
        System.out.println(a + " " +b);
    int vremennaya= a;
    a=b;
    b=vremennaya;
        System.out.println(a + " " +b);
      }
}

4)     public class Main {
        public static void main(String[] args) {
        int a=23333;
        int b=4554;
        int c=1112;
        int max=a;
        if(b>max){
            max=b;
        }
        if(c>max){
            max=c;
        }
        System.out.println(max);
          }
    }


5)     public class Main {
        public static void main(String[] args) {
            int a = -5;
            if (a>=0) {
                System.out.println("Число является положительным");
            }
            if (a<0) System.out.println("Число отрицательное");
        }
    }



6)     public class Main {
        public static void main(String[] args) {
            String name = "Almas";
            System.out.println(name.replace('A',  'B').replace('a', 'b'));
        }
    }


7)     public class Main {
        public static void main(String[] args) {
        int[] massive= {1,2,3,4,5,6,7,8,9};
        int sum=0;
        for (int i = 0; i< massive.length; i++){
            sum+=massive[i];
        }
            System.out.println(sum);
        }
    }


8)       public class Main {
        public static void main(String[] args) {
            int[] massive = {1, 2, 3, 4, 5, 6, 10, 8, 14};
            int max = 0;
            int max2 = 0;
            for (int i = 0; i < massive.length; i++) {
                if (massive[i] > max) {
                    max2 = max;
                    max = massive[i];
                } else if (massive[i] > max2) {
                    max2 = massive[i];
                }
            }
            System.out.println(max2);
        }
    }



    //Далее задачи Литкод, мне дались они сложнее, так как возможно слабая математика и алгоритмическая подкованность, более менее с подсказками смог решить только 3, остальные посмотрел решения, но не допер детально, чтобы прямо понять суть.


    3)     public class Main {
        public static void main(String[] args) {
            int num= 123;
            int count=0;
            while(num>0) {
                if (num%2==0) {
                    num=num/2;
                }
                else {
                    num=num-1;
                }
                count++;
            }
            System.out.println(count);
        }} 



    4)     public class Main {
        public static void main(String[] args) {
            String[] word1= {"ab","c"};
            String[] word2= {"a","bc"};
            boolean result = false;
            StringBuilder ver1= new StringBuilder();
            StringBuilder ver2= new StringBuilder();
            for (String v:word1) {
                ver1.append(v);
            }
            for (String v:word2) {
                ver2.append(v);
            }
if (ver1.toString().equals(ver2.toString())) {
result = true;}
else result = false;
System.out.println(result);
        }}


    1)     public class Main {
        public static void main(String[] args) {
           String s="abc";
           int[] indices= {0,1,2};
           char[] symbols= new char[3];
           for (int i = 0; i < indices.length; i++) {
               symbols[indices[i]]=s.charAt(i);
           }
          String finalize=new String(symbols);
           System.out.println(finalize);
        }}


    5)    
