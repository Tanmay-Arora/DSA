import java.io.*;

public class IncreaingNumberTrianglePattern {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            int n = Integer.parseInt(br.readLine());
            int count = 1;
            for(int i=0; i<n; i++) {
                for(int j=0; j<i+1; j++) {
                    System.out.print(count++ + " ");
                }
                System.out.println();
            }
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
}
