package com.regularexpression;

import java.io.*;
import java.nio.*;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FileOp {
    public static CharSequence fromFile(String filename) throws IOException {
        FileInputStream fis = new FileInputStream(filename);
        FileChannel fc = fis.getChannel();

        // Create a read-only CharBuffer on the file
        ByteBuffer bbuf = fc.map(FileChannel.MapMode.READ_ONLY, 0, (int) fc.size());
        CharBuffer cbuf = Charset.forName("8859_1").newDecoder().decode(bbuf);
        return cbuf;
    }

    public static String file() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\sivanandhanr\\sample.txt"));
        String line = "";
        try {
            StringBuilder text = new StringBuilder();
            String readStringLine = reader.readLine();
            line = readStringLine.toString();
        } finally {
            reader.close();
        }
        return line;
    }

    public static void main(String[] args) throws IOException {

        String str = file();
        System.out.println(str);
        String s1 = str;
        s1 = s1.replaceAll("[^0-9]", "");
        System.out.println(s1);

        Pattern p2 = Pattern.compile("\\W+");
        Matcher m2 = p2.matcher(str);

        while (m2.find()) {
            System.out.println(m2.group());
        }

    }
}


