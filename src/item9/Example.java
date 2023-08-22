package item9;

import java.io.*;

public class Example {

    public static void main(String[] args) {

    }

    //try-finally 방식
    static String firstLineOfFile(String path) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(path));

        try {
            return br.readLine();
        } finally {
            br.close();
        }
    }

    // try-with-resources 방식 (복수 자원)
    static void copy(String src, String dst) throws IOException{
        try(InputStream in = new FileInputStream(src);
            OutputStream out = new FileOutputStream(dst)) {
            byte[] buf = new byte[1000];
            int n;
            while ((n = in.read(buf)) >= 0) {
                out.write(buf, 0, n);
            }
        }
    }
}
