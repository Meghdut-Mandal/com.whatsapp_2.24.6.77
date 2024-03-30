package org.apache.xml.security.utils;

import java.io.IOException;
import java.io.StringReader;

public class RFC2253Parser {
    public static boolean a = true;
    public static int b;

    public static int a(String str, int i, int i2) {
        int i3 = 0;
        while (i < i2) {
            if (str.charAt(i) == '\"') {
                i3++;
            }
            i++;
        }
        return i3;
    }

    public static String a(String str) {
        if (str == null || str.equals("")) {
            return "";
        }
        try {
            String f = f(str);
            StringBuffer stringBuffer = new StringBuffer();
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (true) {
                int indexOf = f.indexOf(",", i);
                if (indexOf >= 0) {
                    i3 += a(f, i, indexOf);
                    if (!(indexOf <= 0 || f.charAt(indexOf - 1) == '\\' || i3 % 2 == 1)) {
                        StringBuffer stringBuffer2 = new StringBuffer();
                        stringBuffer2.append(b(f.substring(i2, indexOf).trim()));
                        stringBuffer2.append(",");
                        stringBuffer.append(stringBuffer2.toString());
                        i2 = indexOf + 1;
                        i3 = 0;
                    }
                    i = indexOf + 1;
                } else {
                    stringBuffer.append(b(g(f.substring(i2))));
                    return stringBuffer.toString();
                }
            }
        } catch (IOException unused) {
            return str;
        }
    }

    public static String a(String str, String str2, String str3) {
        StringBuffer stringBuffer = new StringBuffer();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int indexOf = str.indexOf(str2, i);
            if (indexOf >= 0) {
                i3 += a(str, i, indexOf);
                if (!(indexOf <= 0 || str.charAt(indexOf - 1) == '\\' || i3 % 2 == 1)) {
                    StringBuffer stringBuffer2 = new StringBuffer();
                    stringBuffer2.append(g(str.substring(i2, indexOf)));
                    stringBuffer2.append(str3);
                    stringBuffer.append(stringBuffer2.toString());
                    i2 = indexOf + 1;
                    i3 = 0;
                }
                i = indexOf + 1;
            } else {
                stringBuffer.append(g(str.substring(i2)));
                return stringBuffer.toString();
            }
        }
    }

    public static String b(String str) {
        StringBuffer stringBuffer = new StringBuffer();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int indexOf = str.indexOf("+", i);
            if (indexOf >= 0) {
                i3 += a(str, i, indexOf);
                if (!(indexOf <= 0 || str.charAt(indexOf - 1) == '\\' || i3 % 2 == 1)) {
                    StringBuffer stringBuffer2 = new StringBuffer();
                    stringBuffer2.append(c(g(str.substring(i2, indexOf))));
                    stringBuffer2.append("+");
                    stringBuffer.append(stringBuffer2.toString());
                    i2 = indexOf + 1;
                    i3 = 0;
                }
                i = indexOf + 1;
            } else {
                stringBuffer.append(c(g(str.substring(i2))));
                return stringBuffer.toString();
            }
        }
    }

    public static String c(String str) {
        int indexOf = str.indexOf("=");
        if (indexOf == -1 || (indexOf > 0 && str.charAt(indexOf - 1) == '\\')) {
            return str;
        }
        String d = d(str.substring(0, indexOf));
        String e = (d.charAt(0) < '0' || d.charAt(0) > '9') ? e(str.substring(indexOf + 1)) : str.substring(indexOf + 1);
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(d);
        stringBuffer.append("=");
        stringBuffer.append(e);
        return stringBuffer.toString();
    }

    public static String d(String str) {
        String trim = str.toUpperCase().trim();
        return trim.startsWith("OID") ? trim.substring(3) : trim;
    }

    public static String e(String str) {
        String g = g(str);
        if (g.startsWith("\"")) {
            StringBuffer stringBuffer = new StringBuffer();
            StringReader stringReader = new StringReader(g.substring(1, g.length() - 1));
            while (true) {
                int read = stringReader.read();
                if (read <= -1) {
                    break;
                }
                char c = (char) read;
                if (c == ',' || c == '=' || c == '+' || c == '<' || c == '>' || c == '#' || c == ';') {
                    stringBuffer.append('\\');
                }
                stringBuffer.append(c);
            }
            g = g(stringBuffer.toString());
        }
        if (!a) {
            return g.startsWith("\\#") ? g.substring(1) : g;
        }
        if (!g.startsWith("#")) {
            return g;
        }
        StringBuffer stringBuffer2 = new StringBuffer();
        stringBuffer2.append('\\');
        stringBuffer2.append(g);
        return stringBuffer2.toString();
    }

    public static String f(String str) {
        return a(str, ";", ",");
    }

    public static String g(String str) {
        String trim = str.trim();
        int indexOf = str.indexOf(trim) + trim.length();
        if (str.length() <= indexOf || !trim.endsWith("\\") || trim.endsWith("\\\\") || str.charAt(indexOf) != ' ') {
            return trim;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(trim);
        stringBuffer.append(" ");
        return stringBuffer.toString();
    }
}
