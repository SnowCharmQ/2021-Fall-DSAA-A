package Lab6;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class StringProblemA {
    static QReader in = new QReader();
    static QWriter out = new QWriter();

    public static void main(String[] args) {
        String ss = in.next();
        long sum = 1;
        for (int i = 1; i < ss.length(); i++) {
            ArrayList<String> list = new ArrayList<>();
            for (int j = 0; j < ss.length() - i + 1; j++) {
                String sub = ss.substring(j, j + i);
                if (!list.contains(sub)) list.add(sub);
            }
            sum += list.size();
        }
        out.println(sum);
        out.close();
    }

    static class QReader {
        private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        private StringTokenizer tokenizer = new StringTokenizer("");

        private String innerNextLine() {
            try {
                return reader.readLine();
            } catch (IOException e) {
                return null;
            }
        }

        public boolean hasNext() {
            while (!tokenizer.hasMoreTokens()) {
                String nextLine = innerNextLine();
                if (nextLine == null) {
                    return false;
                }
                tokenizer = new StringTokenizer(nextLine);
            }
            return true;
        }

        public String next() {
            hasNext();
            return tokenizer.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

    }

    static class QWriter implements Closeable {
        private BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        public void print(Object object) {
            try {
                writer.write(object.toString());
            } catch (IOException ignored) {
            }
        }

        public void println(Object object) {
            try {
                writer.write(object.toString());
                writer.write("\n");
            } catch (IOException ignored) {
            }
        }

        @Override
        public void close() {
            try {
                writer.close();
            } catch (IOException ignored) {
            }
        }

        public void flush() {
            try {
                writer.flush();
            } catch (IOException ignored) {
            }
        }
    }
}


/**************************************************************
 Problem: 1446
 User: 12013006
 Language: Java
 Result: Accepted
 Time:164 ms
 Memory:19540 kb
 ****************************************************************/

