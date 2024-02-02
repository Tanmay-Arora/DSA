import java.io.*;

public class NumberCrownPattern {

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            int n = Integer.parseInt(br.readLine());
            for(int i=0; i<n; i++) {
                for(int j=0; j<2*n; j++) {
                    if(j<n) {
                        if(j<i+1) {
                            System.out.print(j+1);
                        }
                        else {
                            System.out.print(" ");
                        }
                    }
                    else {
                        if(j<2*n-i-1) {
                            System.out.print(" ");
                        }
                        else {
                            System.out.print(2*n-j);
                        }
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
