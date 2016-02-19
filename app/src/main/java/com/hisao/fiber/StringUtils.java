package com.hisao.fiber;

/**
 * Created by viniciushisao
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;


public class StringUtils {
    public static String convertToString(BufferedReader br) {
        StringBuilder sb = new StringBuilder();

        try {
            String line;
            try {
                while ((line = br.readLine()) != null) {
                    sb.append(line);
                }
            } catch (IOException var12) {
                var12.printStackTrace();
            }
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException var11) {
                    var11.printStackTrace();
                }
            }

        }

        return sb.toString();
    }

    public static String convertToString(InputStream is) {
        return convertToString(new BufferedReader(new InputStreamReader(is)));
    }
}
