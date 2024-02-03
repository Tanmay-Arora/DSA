import java.io.*;

public class IncreasingLetterTrianglePattern {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            int n = Integer.parseInt(br.readLine());
            for(int i=0; i<n; i++) {
                int k = 65;
                for(int j=0; j<i+1; j++) {
                    System.out.print((char) k++);
                }
                System.out.println();
            }
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
}
