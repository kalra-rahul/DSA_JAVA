public class BasicRecursion {
    public static void printDescNum(int num){
        if(num == 0){
            return;
        }
        System.out.println(num);
        printDescNum(num-1);
    }

    public static void printAscNum(int num){
        if(num == 0){
            return;
        }
        printAscNum(num-1);
        System.out.println(num);
    }

    public static int printFactorial(int n){
        if(n==0){
            return 1;
        }
        int fact = n * printFactorial(n-1);
        System.out.println(fact);
        return fact;
    }

    public static int sumNaturalNum(int n){
        if(n==1){
            return n;
        }
        int sum = n + sumNaturalNum(n-1);
        System.out.println(sum);
        return sum;
    }

    // 0,1,1,2,3,5,8,13
    public static int printNthfabonacci(int n){
        if(n==0 || n==1){
            return n;
        }
        int fab = printNthfabonacci(n-1)+printNthfabonacci(n-2);
        return fab;
    }

    public static int powerOfNum(int n, int p){
        if(p==1){
            return n;
        }
        int pow = n * powerOfNum(n, p-1);
        return pow;
    }



    public static void main(String args[]){
        //printDescNum(5);
        //printAscNum(5);
        // printFactorial(5);
        //sumNaturalNum(5);
        //System.out.println(printNthfabonacci(6));
        System.out.println(powerOfNum(2,2));
    }
    
}
