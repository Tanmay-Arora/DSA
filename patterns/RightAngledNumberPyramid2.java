import java.io.*;

public class RightAngledNumberPyramid2 {

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            int n = Integer.parseInt(br.readLine());
            for(int i=0; i<n; i++) {
                for(int j=0; j<i+1; j++) {
                    System.out.print(i+1 + " ");
                }
                System.out.println();
            }
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
    
}
