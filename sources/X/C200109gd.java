package X;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Hashtable;

/* renamed from: X.9gd  reason: invalid class name and case insensitive filesystem */
public abstract class C200109gd {
    public static Hashtable A00(Hashtable hashtable) {
        Hashtable hashtable2 = new Hashtable();
        Enumeration keys = hashtable.keys();
        while (keys.hasMoreElements()) {
            Object nextElement = keys.nextElement();
            hashtable2.put(nextElement, hashtable.get(nextElement));
        }
        return hashtable2;
    }

    public AnonymousClass122 A03(String str) {
        Hashtable hashtable = ((C22691Asv) this).A00;
        if (AnonymousClass11q.A01(str).startsWith("OID.")) {
            str = str.substring(4);
        } else if (str.charAt(0) < '0' || str.charAt(0) > '9') {
            AnonymousClass122 r0 = (AnonymousClass122) hashtable.get(AnonymousClass11q.A00(str));
            if (r0 != null) {
                return r0;
            }
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("Unknown object id - ");
            A0u.append(str);
            throw AnonymousClass000.A0c(" - passed to distinguished name", A0u);
        }
        return C165617ti.A0f(str);
    }

    public String A01(C22641As7 as7) {
        StringBuffer stringBuffer;
        if (this instanceof C22689Ast) {
            C22689Ast ast = (C22689Ast) this;
            stringBuffer = C165607th.A0x();
            C22633Arz[] A0A = as7.A0A();
            boolean z = true;
            for (int length = A0A.length - 1; length >= 0; length--) {
                if (z) {
                    z = false;
                } else {
                    stringBuffer.append(',');
                }
                C202769md.A04(stringBuffer, ast.A00, A0A[length]);
            }
        } else {
            C22691Asv asv = (C22691Asv) this;
            stringBuffer = C165607th.A0x();
            C22633Arz[] A0A2 = as7.A0A();
            boolean z2 = true;
            for (C22633Arz A04 : A0A2) {
                if (z2) {
                    z2 = false;
                } else {
                    stringBuffer.append(',');
                }
                C202769md.A04(stringBuffer, asv.A01, A04);
            }
        }
        return stringBuffer.toString();
    }

    public C219411z A02(String str, AnonymousClass122 r8) {
        int length = str.length();
        if (length != 0) {
            if (str.charAt(0) == '#') {
                try {
                    int i = (length - 1) / 2;
                    byte[] bArr = new byte[i];
                    for (int i2 = 0; i2 != i; i2++) {
                        int i3 = (i2 * 2) + 1;
                        char charAt = str.charAt(i3);
                        char charAt2 = str.charAt(i3 + 1);
                        C165587tf.A1T(bArr, C202769md.A00(charAt2), C202769md.A00(charAt) << 4, i2);
                    }
                    return AnonymousClass121.A00(bArr);
                } catch (IOException unused) {
                    StringBuilder A0u = AnonymousClass000.A0u();
                    A0u.append("can't recode value for oid ");
                    throw new AnonymousClass92R(AnonymousClass000.A0q(r8.A01, A0u));
                }
            } else if (str.charAt(0) == '\\') {
                str = str.substring(1);
            }
        }
        if (r8.A0G(C22691Asv.A0D) || r8.A0G(C22691Asv.A08)) {
            return new C22671Asb(str);
        }
        if (r8.A0G(C22691Asv.A07)) {
            return new C22655AsL(str);
        }
        if (r8.A0G(C22691Asv.A03) || r8.A0G(C22691Asv.A0U) || r8.A0G(C22691Asv.A0B) || r8.A0G(C22691Asv.A0Z)) {
            return new C22668AsY(str);
        }
        return new C22669AsZ(str);
    }
}
