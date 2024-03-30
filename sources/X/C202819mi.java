package X;

import java.io.OutputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.9mi  reason: invalid class name and case insensitive filesystem */
public abstract class C202819mi {
    public static final byte[] A00 = {112, 114, 111, 0};
    public static final byte[] A01 = {112, 114, 109, 0};

    public static String A00(String str, String str2, byte[] bArr) {
        String str3;
        byte[] bArr2 = AnonymousClass9BH.A02;
        String str4 = ":";
        if (Arrays.equals(bArr, bArr2) || Arrays.equals(bArr, AnonymousClass9BH.A03)) {
            str3 = str4;
        } else {
            str3 = "!";
        }
        if (str.length() > 0) {
            if (str2.equals("classes.dex")) {
                return str;
            }
            if (!str2.contains("!") && !str2.contains(str4)) {
                if (str2.endsWith(".apk")) {
                    return str2;
                }
                StringBuilder A0v = AnonymousClass000.A0v(str);
                if (!Arrays.equals(bArr, bArr2) && !Arrays.equals(bArr, AnonymousClass9BH.A03)) {
                    str4 = "!";
                }
                return AnonymousClass000.A0p(str4, str2, A0v);
            }
        }
        if ("!".equals(str3)) {
            return str2.replace(str4, "!");
        }
        if (str4.equals(str3)) {
            return str2.replace("!", str4);
        }
        return str2;
    }

    public static void A01(AnonymousClass9O0 r8, OutputStream outputStream) {
        int i = r8.A04;
        byte[] bArr = new byte[(((((i * 2) + 8) - 1) & -8) / 8)];
        Iterator A10 = C36371kC.A10(r8.A08);
        while (A10.hasNext()) {
            Map.Entry A11 = AnonymousClass000.A11(A10);
            int A08 = C165577te.A08(A11);
            int A0G = C90484aE.A0G(A11);
            if ((A0G & 2) != 0) {
                int i2 = A08 / 8;
                C165587tf.A1T(bArr, 1 << (A08 % 8), bArr[i2], i2);
            }
            if ((A0G & 4) != 0) {
                int i3 = A08 + i;
                int i4 = i3 / 8;
                C165587tf.A1T(bArr, 1 << (i3 % 8), bArr[i4], i4);
            }
        }
        outputStream.write(bArr);
    }

    public static void A02(AnonymousClass9O0 r3, OutputStream outputStream) {
        Iterator A10 = C36371kC.A10(r3.A08);
        int i = 0;
        while (A10.hasNext()) {
            Map.Entry A11 = AnonymousClass000.A11(A10);
            int A08 = C165577te.A08(A11);
            if ((C90484aE.A0G(A11) & 1) != 0) {
                AnonymousClass93Q.A00(outputStream, A08 - i);
                AnonymousClass93Q.A00(outputStream, 0);
                i = A08;
            }
        }
    }

    public static void A03(AnonymousClass9O0 r4, OutputStream outputStream, String str) {
        Charset charset = StandardCharsets.UTF_8;
        AnonymousClass93Q.A00(outputStream, str.getBytes(charset).length);
        AnonymousClass93Q.A00(outputStream, r4.A00);
        AnonymousClass93Q.A01(outputStream, 4, (long) r4.A03);
        AnonymousClass93Q.A01(outputStream, 4, r4.A05);
        AnonymousClass93Q.A01(outputStream, 4, (long) r4.A04);
        outputStream.write(str.getBytes(charset));
    }
}
