public class Main {
    public static void main(String[] args) {
        //task 1,2
        System.out.println("Task 1,2");
        int[] a;
        a = new int[3];
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        System.out.print(a[0] + ","+a[1]+","+a[2]);

        System.out.println("");
        double[] b = {1.57, 7.654, 9.986};
            System.out.print(b[0] + ","+b[1]+","+b[2]);
        System.out.println("");
        boolean[] c = new boolean[2];
        c[0] = true;
        c[1] = false;
        System.out.print(c[0] + ","+c[1]);

        //task 3
        System.out.println("");
        System.out.println("Task 3");
            System.out.print(a[2] + ","+a[1]+","+a[0]);
        System.out.println("");
        System.out.print(b[2] + ","+b[1]+","+b[0]);
        System.out.println("");
        System.out.print(c[1] + ","+c[0]);
        System.out.println("");
        //Task 4
        System.out.println("Task 4");
        for (int i=0;i<a.length;i++){
            if (a[i]%2!=0) {
                a[i]=a[i]+1;
            } else {
                a[i]=a[i];
            }
            System.out.print(a[i]+" ");
        }


    }
    }