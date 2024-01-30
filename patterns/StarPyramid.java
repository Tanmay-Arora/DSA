import java.io.*;

public class StarPyramid {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            int n = Integer.parseInt(br.readLine());
            for(int i=0; i<n; i++) {
                for(int j=0; j<n-i-1; j++) {
                    System.out.print(" ");
                }
                for(int j=0; j<(2*i+1); j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
