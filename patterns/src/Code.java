void main() {





}

/**
       *
      ***
     *****
    *******
   *********

 */

static void pattern7(){

    for(int i=1;i<=5;i++){
        for(int j=4;j>=i;j--){
            System.out.print(" ");
        }
        for(int k=1;k<=i;k++){
            System.out.print("*");
        }

        for(int l =2;l<=i;l++){
            System.out.print("*");
        }
        System.out.println("");
    }

/**


        *
       * *
      * * *
     * * * *
    * * * * *

 */
static void pattern6(){

    for(int i=1;i<=5;i++){
        for(int j=4;j>=i;j--){
            System.out.print(" ");
        }
        for(int k=1;k<=i;k++){
            System.out.print("* ");
        }
        System.out.println("");
    }


/**

    *****
     ****
      ***
       **
        *
 */

static void pattern5(){

    for(int i=1;i<=5;i++){
        for(int j=2;j<i+1;j++){
            System.out.print(" ");
        }
        for(int k =5;k>=i;k--){
            System.out.print("*");
        }
        System.out.println("");
    }
}

/**
      *
     **
    ***
   ****
  *****

 */

static void pattern4(){

    for(int i=1;i<=5;i++){
        for(int j=4;j>=i;j--){
            System.out.print(" ");
        }
        for(int k=1;k<=i;k++){
            System.out.print("*");
        }
        System.out.println("");
    }
}

/**

 * * * * *
 * * * *
 * * *
 * *
 *

 */
static void pattern3(int n){
    for(int i=1;i<=n;i++){
        for(int j=n;j>=i;j--){
            System.out.print("* ");
        }
        System.out.println("");
    }
}

/**

  *
  **
  ***

 */
static void pattern2(int n){
    for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println("");
    }
}

static void pattern1(int n) {
    for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= n; j++) {
            System.out.print("* ");
        }
        System.out.println();
    }
}


