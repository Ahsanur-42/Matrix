import java.util.Scanner;
public class MatrixPractice3 
{
    int mat1[][] = new int[3][3];
    int mat2[][] = new int[3][3];
    int outmat[][] = new int[3][3];
    MatrixPractice3()
    {
        System.out.println("Enter first Matrix: ");
        Scanner input = new Scanner(System.in);
        for(int i=0;i<3;i++)
        for(int j=0;j<3;j++)
        mat1[i][j] = input.nextInt();

        System.out.println("Enter second Matrix: ");
        for(int i=0;i<3;i++)
        for(int j=0;j<3;j++)
        mat2[i][j] = input.nextInt();
    }
    MatrixPractice3(int m1[][],int m2[][])
    {
        mat1 = m1;
        mat2 = m2;
    }
        void addMatrix()
        {
            for(int i=0;i<3;i++)
            for(int j=0;j<3;j++)
            outmat[i][j] = mat1[i][j]+mat2[i][j];
            
            System.out.println("Addition Matrix is: ");
            for(int i=0;i<3;i++)
            {
                for(int j=0;j<3;j++)
                {
                    System.out.print(outmat[i][j]+" ");
                }
                System.out.println(" ");
            }
        }
        void subMatrix()
        {
            for(int i=0;i<3;i++)
            for(int j=0;j<3;j++)
            outmat[i][j] = mat1[i][j]-mat2[i][j];

            System.out.println("Substraction Matrix is: ");
            for(int i=0;i<3;i++)
            {
                for(int j=0;j<3;j++)
                {
                    System.out.print(outmat[i][j]+" ");
                }
               System.out.println(" ");
            }

        }
        int temp=0;
        void multiMatrix()
        {
            for(int i=0;i<3;i++)
            {
                 for(int j=0;j<3;j++)
                 {
                    temp=0;
                    for(int k=0;k<3;k++)
                    {
                        temp+=mat1[i][k]*mat2[k][j];
                    }
                    outmat[i][j]=temp;
                 }
            }
            System.out.println("Multiplication Matrix is: ");
            for(int i=0;i<3;i++)
            {
                for(int j=0;j<3;j++)
                {
                    System.out.print(outmat[i][j]+" ");
                    
                }
                System.out.println(" ");
            }
            
        }
    
    public static void main(String []arg)
    {
        MatrixPractice3 obj = new MatrixPractice3();
        System.out.println(" ");
        obj.addMatrix();
        obj.subMatrix();
        obj.multiMatrix();

        System.out.println(" ");
        System.out.println("Another Result!");
        System.out.println(" ");

        int m1[][] = {{1,1,1},{0,0,0},{1,1,1}};
        int m2[][] = {{0,0,0},{1,1,1},{0,0,0}};
        MatrixPractice3 obj2 = new MatrixPractice3(m1,m2);
        obj2.addMatrix();
        obj2.subMatrix();
        obj2.multiMatrix();
    }
}