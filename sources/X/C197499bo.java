package X;

import java.io.IOException;

/* renamed from: X.9bo  reason: invalid class name and case insensitive filesystem */
public final class C197499bo {
    public final C21888AcG A00;
    public final String[] A01;

    public static C197499bo A01(String... strArr) {
        String str;
        try {
            int length = strArr.length;
            C21671AUq[] aUqArr = new C21671AUq[length];
            AU1 au1 = new AU1();
            for (int i = 0; i < length; i++) {
                String str2 = strArr[i];
                String[] strArr2 = C21655ATw.A04;
                C200069gY A04 = au1.A04(1);
                byte[] bArr = A04.A06;
                int i2 = A04.A00;
                A04.A00 = i2 + 1;
                byte b = (byte) 34;
                bArr[i2] = b;
                au1.A00++;
                int length2 = str2.length();
                int i3 = 0;
                for (int i4 = 0; i4 < length2; i4++) {
                    char charAt = str2.charAt(i4);
                    if (charAt < 128) {
                        str = strArr2[charAt];
                        if (str == null) {
                        }
                    } else if (charAt == 8232) {
                        str = "\\u2028";
                    } else if (charAt == 8233) {
                        str = "\\u2029";
                    }
                    if (i3 < i4) {
                        au1.A07(str2, i3, i4);
                    }
                    au1.A07(str, 0, str.length());
                    i3 = i4 + 1;
                }
                if (i3 < length2) {
                    au1.A07(str2, i3, length2);
                }
                C200069gY A042 = au1.A04(1);
                byte[] bArr2 = A042.A06;
                int i5 = A042.A00;
                A042.A00 = i5 + 1;
                bArr2[i5] = b;
                au1.A00++;
                au1.A00();
                C21671AUq aUq = C21671AUq.A02;
                aUqArr[i] = new C21671AUq(au1.A08(au1.A00));
            }
            return new C197499bo(C21888AcG.A02.A01(aUqArr), (String[]) strArr.clone());
        } catch (IOException e) {
            throw C90524aI.A0Y(e);
        }
    }

    public C197499bo(C21888AcG acG, String[] strArr) {
        this.A01 = strArr;
        this.A00 = acG;
    }

    public static C197499bo A00(String str, String str2) {
        return A01(str, str2);
    }
}
