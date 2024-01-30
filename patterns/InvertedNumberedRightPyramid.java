import java.io.*;

public class InvertedNumberedRightPyramid {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            int n = Integer.parseInt(br.readLine());
            for(int i=0; i<n; i++) {
                for(int j=0; j<n-i; j++) {
                    System.out.print(j+1 + " ");
                }
                System.out.println();
            }
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
