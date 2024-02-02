import java.io.*;

public class BinaryNumberTrianglePattern {

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            int n = Integer.parseInt(br.readLine());
            for(int i=0; i<n; i++) {
                for(int j=0; j<i+1; j++) {
                    int k = i+j;
                    if(k%2 == 0) {
                        System.out.print(1);
                    }
                    else {
                        System.out.print(0);
                    }
                }
                System.out.println();
            }
        } catch (IOException e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
    
}
