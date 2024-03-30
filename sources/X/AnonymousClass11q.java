package X;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.AccessController;

/* renamed from: X.11q  reason: invalid class name */
public abstract class AnonymousClass11q {
    public static String A00;

    static {
        try {
            A00 = (String) AccessController.doPrivileged(new AnonymousClass11r());
        } catch (Exception unused) {
            try {
                A00 = String.format("%n", new Object[0]);
            } catch (Exception unused2) {
                A00 = "\n";
            }
        }
    }

    public static String A00(String str) {
        char[] charArray = str.toCharArray();
        boolean z = false;
        for (int i = 0; i != charArray.length; i++) {
            char c = charArray[i];
            if ('A' <= c && 'Z' >= c) {
                charArray[i] = (char) ((c - 'A') + 97);
                z = true;
            }
        }
        return z ? new String(charArray) : str;
    }

    public static String A01(String str) {
        char[] charArray = str.toCharArray();
        boolean z = false;
        for (int i = 0; i != charArray.length; i++) {
            char c = charArray[i];
            if ('a' <= c && 'z' >= c) {
                charArray[i] = (char) ((c - 'a') + 65);
                z = true;
            }
        }
        return z ? new String(charArray) : str;
    }

    public static String A02(byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[length];
        for (int i = 0; i != length; i++) {
            cArr[i] = (char) (bArr[i] & 255);
        }
        return new String(cArr);
    }

    public static byte[] A03(String str) {
        int length = str.length();
        byte[] bArr = new byte[length];
        for (int i = 0; i != length; i++) {
            bArr[i] = (byte) str.charAt(i);
        }
        return bArr;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: java.lang.String[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String[] A05(java.lang.String r6) {
        /*
            r5 = 46
            java.util.Vector r4 = new java.util.Vector
            r4.<init>()
            r2 = 1
        L_0x0008:
            r3 = 0
            if (r2 == 0) goto L_0x0024
            int r1 = r6.indexOf(r5)
            if (r1 <= 0) goto L_0x001f
            java.lang.String r0 = r6.substring(r3, r1)
            r4.addElement(r0)
            int r0 = r1 + 1
            java.lang.String r6 = r6.substring(r0)
            goto L_0x0008
        L_0x001f:
            r4.addElement(r6)
            r2 = 0
            goto L_0x0008
        L_0x0024:
            int r2 = r4.size()
            java.lang.String[] r1 = new java.lang.String[r2]
        L_0x002a:
            if (r3 == r2) goto L_0x0035
            java.lang.Object r0 = r4.elementAt(r3)
            r1[r3] = r0
            int r3 = r3 + 1
            goto L_0x002a
        L_0x0035:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass11q.A05(java.lang.String):java.lang.String[]");
    }

    public static byte[] A04(char[] cArr) {
        char c;
        int i;
        int i2;
        IllegalStateException illegalStateException;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i3 = 0;
        while (true) {
            try {
                int length = cArr.length;
                if (i3 >= length) {
                    return byteArrayOutputStream.toByteArray();
                }
                char c2 = cArr[i3];
                if (c2 >= 128) {
                    int i4 = (c2 >> 6) | 192;
                    char c3 = c2;
                    if (c2 >= 2048) {
                        if (c2 >= 55296 && c2 <= 57343) {
                            i3++;
                            if (i3 >= length) {
                                illegalStateException = new IllegalStateException("invalid UTF-16 codepoint");
                                break;
                            }
                            char c4 = cArr[i3];
                            if (c2 > 56319) {
                                illegalStateException = new IllegalStateException("invalid UTF-16 codepoint");
                                break;
                            }
                            i = (((c2 & 1023) << 10) | (c4 & 1023)) + 0;
                            byteArrayOutputStream.write((i >> 18) | 240);
                            i2 = ((i >> 12) & 63) | 128;
                        } else {
                            i2 = (c2 >> 12) | 224;
                            i = c2;
                        }
                        byteArrayOutputStream.write(i2);
                        i4 = ((i >> 6) & 63) | 128;
                        c3 = i;
                    }
                    byteArrayOutputStream.write(i4);
                    c = (c3 & true) | true;
                } else {
                    c = c2;
                }
                byteArrayOutputStream.write(c);
                i3++;
            } catch (IOException unused) {
                throw new IllegalStateException("cannot encode string to byte array!");
            }
        }
        throw illegalStateException;
    }
}
