
public class patterns {
    public static void main(String[] args) {
        pattern1();
        pattern2();
        pattern3();
        pattern4();
        pattern5();
        pattern6();
        pattern7();
        pattern8();
        pattern9();

    }
    static void pattern1() {
        for (int row = 1; row <= 4; row++) {
            //for every row, run the col
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            //when one row is printed , we need to add newline
            System.out.println();
        }
        System.out.println();
    }
    static  void pattern2 ()
{
    for (int row = 1; row <=4 ; row++) {
        for (int col = 1; col <= 4 ; col++) {
            System.out.print("* ");
        }
        System.out.println();
    }
    System.out.println();
}
static void pattern3 ()
{
    for (int row = 1; row <=4 ; row++) {
        for (int col = 1; col <= 4+1-row; col++) {
            System.out.print("* ");
        }
        System.out.println();
    }
    System.out.println();
}
static void  pattern4 ()
{
    for (int row = 1; row <=4 ; row++) {
        for (int col = 1; col <=row ; col++) {
            System.out.print(col);
        }
        System.out.println();
    }
    System.out.println();
}
static void pattern5 ()
{
    for (int row = 0; row <= 4 ; row++) {
        for (int col = 0; col <=4-row ; col++) {
            System.out.print(col+ " ");
        }
        System.out.println();
    }
    System.out.println();
}
static void  pattern6 ()
{
   for (int row = 0; row < 2* 4 ; row++) {
       int totalColsInRow = row > 4 ? 2* 4 -row: row ;
       for (int col = 0; col < totalColsInRow; col++) {
           System.out.print("* ");
       }
       System.out.println();
       }
   }
    static void  pattern7()
    {
        for (int row = 0; row < 2* 4 ; row++) {
            int totalColsInRow = row > 4 ? 2* 4 -row: row ;

            int noOfSpaces = 4 - totalColsInRow ;
            for (int s = 0; s < noOfSpaces ; s++) {
                System.out.print(" ");
            }
            for (int col = 0; col < totalColsInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern8 ()
    {
        for (int row = 1; row <=4 ; row++) {

            for (int space = 0; space < 4-row; space++) {
                System.out.print(" ");
            }
            for (int col = row; col >= 1; col--) {
                System.out.print(col);
            }
            for (int col = 2; col <= 4; col++) {
                System.out.print(col);
            }
            System.out.println();
            System.out.println();
        }
    }
    static void pattern9 ()
    {
       // int n= 2*4 ;
        for (int row = 0; row <= 4 ; row++) {
            for (int col = 0; col <= 4 ; col++) {
                int atEveryIndex = Math.min(Math.min(row,col) ,Math.min(8-row,8-col));
                System.out.print(atEveryIndex);
            }
            System.out.println();
        }
    }
    }






