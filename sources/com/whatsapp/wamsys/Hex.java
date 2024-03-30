package com.whatsapp.wamsys;

public class Hex {
    public static final char[] FIRST_CHAR;
    public static final char[] HEX_DIGITS;
    public static final char[] SECOND_CHAR;

    public static String encodeHex(byte[] bArr, boolean z) {
        char[] cArr = new char[(r7 * 2)];
        int i = 0;
        for (byte b : bArr) {
            byte b2 = b & 255;
            if (b2 == 0 && z) {
                break;
            }
            int i2 = i + 1;
            cArr[i] = FIRST_CHAR[b2];
            i = i2 + 1;
            cArr[i2] = SECOND_CHAR[b2];
        }
        return new String(cArr, 0, i);
    }

    static {
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        HEX_DIGITS = cArr;
        char[] cArr2 = new char[256];
        FIRST_CHAR = cArr2;
        char[] cArr3 = new char[256];
        SECOND_CHAR = cArr3;
        int i = 0;
        do {
            cArr2[i] = cArr[(i >> 4) & 15];
            cArr3[i] = cArr[i & 15];
            i++;
        } while (i < 256);
    }
}
