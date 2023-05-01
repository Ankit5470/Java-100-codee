class multiarry
{     
        public static void main(String args[])
        {
            int arr[][];
            // int [][] arr; or int[] arr[];
            arr=new int[3][3];
            //int arr[][]= new int [3][3];

            arr[0][0]=10;
            arr[0][1]=20;
            arr[0][2]=30;
            arr[1][0]=40;
            arr[1][1]=15;
            arr[1][2]=25;
            arr[2][0]=35;
            arr[2][1]=45;
            arr[2][2]=100;

            for(int i=0;i<3;i++)
            {
                    for(int j=0;j<3;j++)
                    {
                     System.out.println(arr[i][j]);
                     System.out.println("\t");
                    }
                    System.out.println();
             }
                         
        }

}