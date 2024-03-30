package X;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Locale;

/* renamed from: X.6Tk  reason: invalid class name and case insensitive filesystem */
public class C132386Tk {
    public static final C132386Tk A01 = new C132386Tk("USD");
    public static final C132386Tk A02 = new C132386Tk("XXX");
    public final String A00;

    public static int A00(String str) {
        Number A10 = C36441kJ.A10(str.toUpperCase(Locale.US), C190899At.A00);
        if (A10 == null) {
            return 2;
        }
        return A10.intValue();
    }

    public String A01(C18820ts r13) {
        HashMap hashMap = C190899At.A01;
        String str = this.A00;
        Number A10 = C36441kJ.A10(str, hashMap);
        if (A10 == null) {
            return str;
        }
        String A0A = r13.A0A(A10.intValue());
        if (A0A.isEmpty()) {
            return str;
        }
        C201129iv r8 = C201129iv.A03;
        if (C201129iv.A00(r8, A0A)) {
            return A0A;
        }
        int length = A0A.length();
        StringBuilder A0h = C90524aI.A0h(length + 2);
        int i = 0;
        while (i < length) {
            int codePointAt = A0A.codePointAt(i);
            String[] strArr = (String[]) AnonymousClass99Z.A00.get(Integer.valueOf(codePointAt));
            if (strArr != null && strArr.length != 0) {
                if (strArr.length != 1) {
                    int length2 = strArr.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length2) {
                            break;
                        }
                        String str2 = strArr[i2];
                        if (!C201129iv.A00(r8, str2)) {
                            i2++;
                        } else if (str2 != null) {
                            A0h.append(str2);
                        }
                    }
                } else {
                    A0h.append(strArr[0]);
                }
                i += Character.charCount(codePointAt);
            }
            A0h.appendCodePoint(codePointAt);
            i += Character.charCount(codePointAt);
        }
        return A0h.toString();
    }

    public String A02(C18820ts r13, BigDecimal bigDecimal, int i, boolean z) {
        C130766Mi r5;
        C130766Mi r4;
        C130766Mi r7;
        C130766Mi r6;
        String str;
        String str2;
        C122465ut r3;
        C1261062o A002 = C131926Ri.A00(r13, z);
        C131486Pf r32 = new C131486Pf(A002.A00(), C36401kF.A0x(r13));
        boolean z2 = A002.A02;
        if (z2) {
            boolean z3 = C130766Mi.A03;
            r6 = C90484aE.A0V(r13, 9);
            r7 = C90484aE.A0V(r13, 11);
            str2 = r13.A0A(10);
            r4 = C90484aE.A0V(r13, 6);
            r5 = C90484aE.A0V(r13, 8);
            str = r13.A0A(7);
        } else {
            r5 = C130766Mi.A02;
            r4 = r5;
            r7 = r5;
            r6 = r5;
            str = "";
            str2 = str;
        }
        String A012 = A01(r13);
        r32.A03(i);
        String A022 = r32.A02(bigDecimal);
        if (!z2) {
            return A022;
        }
        if (bigDecimal.compareTo(BigDecimal.ZERO) < 0) {
            r3 = A002.A00;
        } else {
            r3 = A002.A01;
        }
        return C131926Ri.A01(r3, r4, r5, r6, r7, str, str2, A012, A022);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.A00.equals(((C132386Tk) obj).A00);
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public C132386Tk(String str) {
        if (str.length() == 3) {
            this.A00 = str.toUpperCase(Locale.US);
            return;
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("invalid currency code; currencyCode=");
        throw AnonymousClass000.A0c(str, A0u);
    }

    public String A03(C18820ts r14, BigDecimal bigDecimal, boolean z) {
        C130766Mi r6;
        C130766Mi r5;
        C130766Mi r8;
        C130766Mi r7;
        String str;
        String str2;
        C122465ut r4;
        int scale = bigDecimal.scale();
        C1261062o A002 = C131926Ri.A00(r14, z);
        C131486Pf r3 = new C131486Pf(A002.A00(), C36401kF.A0x(r14));
        boolean z2 = A002.A02;
        if (z2) {
            boolean z3 = C130766Mi.A03;
            r7 = C90484aE.A0V(r14, 9);
            r8 = C90484aE.A0V(r14, 11);
            str2 = r14.A0A(10);
            r5 = C90484aE.A0V(r14, 6);
            r6 = C90484aE.A0V(r14, 8);
            str = r14.A0A(7);
        } else {
            r6 = C130766Mi.A02;
            r5 = r6;
            r8 = r6;
            r7 = r6;
            str = "";
            str2 = str;
        }
        String A012 = A01(r14);
        r3.A03(scale);
        String A022 = r3.A02(bigDecimal);
        if (!z2) {
            return A022;
        }
        if (bigDecimal.compareTo(BigDecimal.ZERO) < 0) {
            r4 = A002.A00;
        } else {
            r4 = A002.A01;
        }
        return C131926Ri.A01(r4, r5, r6, r7, r8, str, str2, A012, A022);
    }
}
