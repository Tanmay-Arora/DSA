import java.io.*;

public class DiamondStarPattern {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            int n = Integer.parseInt(br.readLine());
            for(int i=0; i<2*n; i++) {
                if(i<n) {
                    for(int j=0; j<n-i-1; j++) {
                        System.out.print(" ");
                    }

                    for(int j=0; j<2*i+1; j++) {
                        System.out.print("*");
                    }
                }
                else {
                    for(int j=0; j<i-n; j++) {
                        System.out.print(" ");
                    }

                    for(int j=0; j<2*(2*n-i-1)+1; j++) {
                        System.out.print("*");
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
