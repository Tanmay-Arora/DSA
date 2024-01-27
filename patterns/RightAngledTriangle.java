import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


class RightAngledTriangle {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            int n = Integer.parseInt(br.readLine());
            for(int i=0; i<n; i++) {
                for(int j=0; j<i+1; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        } catch(IOException e) {
            e.printStackTrace();
        }

    }    
}
