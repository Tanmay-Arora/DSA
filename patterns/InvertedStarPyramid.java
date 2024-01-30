import java.io.*;

public class InvertedStarPyramid {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            int n = Integer.parseInt(br.readLine());
            for(int i=0; i<n; i++) {
                for(int j=0; j<i; j++) {
                    System.out.print(" ");
                }
                for(int j=0; j<(2*(n-i)-1); j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}
