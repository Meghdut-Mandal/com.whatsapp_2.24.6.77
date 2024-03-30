package X;

import java.io.IOException;
import java.util.Hashtable;

/* renamed from: X.9md  reason: invalid class name and case insensitive filesystem */
public abstract class C202769md {
    public static int A00(char c) {
        int i;
        if ('0' <= c) {
            if (c <= '9') {
                return c - '0';
            }
            if ('a' <= c && c <= 'f') {
                i = c - 'a';
                return i + 10;
            }
        }
        i = c - 'A';
        return i + 10;
    }

    public static void A03(StringBuffer stringBuffer, Hashtable hashtable, C22624Arq arq) {
        AnonymousClass122 r1 = arq.A01;
        String str = (String) hashtable.get(r1);
        if (str == null) {
            str = r1.A01;
        }
        stringBuffer.append(str);
        stringBuffer.append('=');
        stringBuffer.append(A02(arq.A00));
    }

    public static void A04(StringBuffer stringBuffer, Hashtable hashtable, C22633Arz arz) {
        if (arz.A00.A00.length > 1) {
            C22624Arq[] A0B = arz.A0B();
            boolean z = true;
            for (int i = 0; i != A0B.length; i++) {
                if (z) {
                    z = false;
                } else {
                    stringBuffer.append('+');
                }
                A03(stringBuffer, hashtable, A0B[i]);
            }
        } else if (arz.A0A() != null) {
            A03(stringBuffer, hashtable, arz.A0A());
        }
    }

    public static boolean A05(C22633Arz arz, C22633Arz arz2) {
        if (arz.A00.A00.length == arz2.A00.A00.length) {
            C22624Arq[] A0B = arz.A0B();
            C22624Arq[] A0B2 = arz2.A0B();
            int length = A0B.length;
            if (length == A0B2.length) {
                int i = 0;
                while (i != length) {
                    C22624Arq arq = A0B[i];
                    C22624Arq arq2 = A0B2[i];
                    if (arq == arq2 || (arq != null && arq2 != null && arq.A01.A0G(arq2.A01) && A01(A02(arq.A00)).equals(A01(A02(arq2.A00))))) {
                        i++;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public static String A01(String str) {
        int length = str.length();
        int i = 0;
        if (length > 0 && str.charAt(0) == '#') {
            try {
                AnonymousClass121 A00 = AnonymousClass121.A00(C202439lp.A02(str, length - 1));
                if (A00 instanceof B0I) {
                    str = ((B0I) A00).BHz();
                }
            } catch (IOException e) {
                throw AnonymousClass000.A0f(e, "unknown encoding in name: ", AnonymousClass000.A0u());
            }
        }
        String A002 = AnonymousClass11q.A00(str);
        int length2 = A002.length();
        if (length2 < 2) {
            return A002;
        }
        int i2 = length2 - 1;
        while (i < i2 && A002.charAt(i) == '\\' && A002.charAt(i + 1) == ' ') {
            i += 2;
        }
        int i3 = i + 1;
        int i4 = i2;
        while (i4 > i3 && A002.charAt(i4 - 1) == '\\' && A002.charAt(i4) == ' ') {
            i4 -= 2;
        }
        if (i > 0 || i4 < i2) {
            A002 = A002.substring(i, i4 + 1);
        }
        if (A002.indexOf("  ") < 0) {
            return A002;
        }
        StringBuffer A0x = C165607th.A0x();
        char A003 = C165597tg.A00(A002);
        A0x.append(A003);
        for (int i5 = 1; i5 < A002.length(); i5++) {
            char charAt = A002.charAt(i5);
            if (A003 != ' ' || charAt != ' ') {
                A0x.append(charAt);
                A003 = charAt;
            }
        }
        return A0x.toString();
    }

    public static String A02(C219411z r8) {
        int i;
        StringBuffer A0x = C165607th.A0x();
        int i2 = 0;
        if (!(r8 instanceof B0I) || (r8 instanceof C22670Asa)) {
            try {
                A0x.append('#');
                byte[] A1V = C165597tg.A1V(r8);
                A0x.append(AnonymousClass11q.A02(C202439lp.A03(A1V, 0, A1V.length)));
            } catch (IOException unused) {
                throw AnonymousClass001.A08("Other value has no encoded form");
            }
        } else {
            String BHz = ((B0I) r8).BHz();
            if (BHz.length() > 0 && BHz.charAt(0) == '#') {
                A0x.append('\\');
            }
            A0x.append(BHz);
        }
        int length = A0x.length();
        int i3 = 2;
        if (!(A0x.length() >= 2 && A0x.charAt(0) == '\\' && A0x.charAt(1) == '#')) {
            i3 = 0;
        }
        while (i != length) {
            char charAt = A0x.charAt(i);
            if (!(charAt == '\"' || charAt == '\\' || charAt == '+' || charAt == ',')) {
                switch (charAt) {
                    case ';':
                    case AnonymousClass8SX.POLL_CREATION_MESSAGE_V2_FIELD_NUMBER:
                    case '=':
                    case '>':
                        break;
                    default:
                        i++;
                        continue;
                }
            }
            A0x.insert(i, "\\");
            i += 2;
            length++;
        }
        if (A0x.length() > 0) {
            while (A0x.length() > i2 && A0x.charAt(i2) == ' ') {
                A0x.insert(i2, "\\");
                i2 += 2;
            }
        }
        int length2 = A0x.length() - 1;
        while (length2 >= 0 && A0x.charAt(length2) == ' ') {
            A0x.insert(length2, '\\');
            length2--;
        }
        return A0x.toString();
    }
}
