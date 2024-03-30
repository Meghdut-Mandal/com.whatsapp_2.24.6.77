package X;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Vector;

/* renamed from: X.6YB  reason: invalid class name */
public final class AnonymousClass6YB {
    public static final Map A0A;
    public ArrayList A00;
    public ArrayList A01;
    public final HashMap A02 = AnonymousClass001.A0J();
    public final HashMap A03 = AnonymousClass001.A0J();
    public final HashSet A04 = C36441kJ.A16();
    public final HashSet A05 = C36441kJ.A16();
    public final Vector A06 = new Vector();
    public final Vector A07 = new Vector();
    public final Vector A08 = new Vector();
    public final Vector A09 = new Vector();

    static {
        AnonymousClass011[] r2 = new AnonymousClass011[5];
        C90464aC.A1E(C36441kJ.A19("min", 2), "MIN", r2);
        C90464aC.A1F(C36441kJ.A19("max", 2), "MAX", r2);
        C36341k9.A1J(C36441kJ.A19("log", 2), "LOG", r2, 2);
        C90474aD.A1G(C36441kJ.A19("pow", 2), "POW", r2);
        C90484aE.A1H(C36441kJ.A19("mod", 2), "MOD", r2);
        A0A = C000400e.A07(r2);
    }

    public static final int A01(AnonymousClass6YB r3, String str, boolean z) {
        HashMap hashMap = r3.A03;
        if (!hashMap.containsKey(str)) {
            Vector vector = r3.A07;
            vector.add(new C133096Wr());
            int A0C = C90504aG.A0C(vector);
            C36341k9.A1K(str, hashMap, A0C);
            if (z) {
                r3.A04.add(str);
            }
            return A0C;
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Multiple declarations of symbol ");
        A0u.append(str);
        throw AnonymousClass78L.A00(" found in the configuration file.", A0u);
    }

    private final int A02(AnonymousClass5T2 r3, int i, int i2) {
        Vector vector = this.A07;
        vector.add(new C133096Wr(r3, i, i2));
        return C90504aG.A0C(vector);
    }

    private final void A09(int i) {
        Iterator it = ((AbstractCollection) this.A08.get(i)).iterator();
        while (it.hasNext()) {
            Number number = (Number) it.next();
            ArrayList arrayList = this.A00;
            if (arrayList == null) {
                throw C36331k8.A0d("isComputedFeatureEvaluated");
            }
            int A072 = C36411kG.A07(number);
            if (!AnonymousClass000.A1X(arrayList.get(A072))) {
                A09(A072);
            }
        }
        AnonymousClass011 r0 = (AnonymousClass011) this.A06.get(i);
        int A0H = C90484aE.A0H(r0);
        int A082 = C90474aD.A08(r0);
        ArrayList arrayList2 = this.A01;
        if (arrayList2 == null) {
            throw C36331k8.A0d("outputValues");
        }
        C133096Wr A0B = A0B(A082);
        ArrayList arrayList3 = this.A01;
        if (arrayList3 == null) {
            throw C36331k8.A0d("outputValues");
        }
        arrayList2.set(A0H, Double.valueOf(A0B.A03(this, arrayList3, A082)));
        ArrayList arrayList4 = this.A00;
        if (arrayList4 == null) {
            throw C36331k8.A0d("isComputedFeatureEvaluated");
        }
        arrayList4.set(i, C36371kC.A0m());
        ArrayList arrayList5 = this.A01;
        if (arrayList5 == null) {
            throw C36331k8.A0d("outputValues");
        }
        Object obj = arrayList5.get(A0H);
        AnonymousClass00C.A08(obj);
        ((Number) obj).doubleValue();
    }

    public final double A0A(String str) {
        HashMap hashMap = this.A03;
        if (hashMap.containsKey(str)) {
            if (!this.A04.contains(str)) {
                ArrayList arrayList = this.A00;
                if (arrayList == null) {
                    throw C36331k8.A0d("isComputedFeatureEvaluated");
                }
                HashMap hashMap2 = this.A02;
                Object obj = arrayList.get(AnonymousClass000.A0I(C90494aF.A0Y(str, hashMap2)));
                AnonymousClass00C.A08(obj);
                if (!AnonymousClass000.A1X(obj)) {
                    A09(AnonymousClass000.A0I(C000200c.A00(str, hashMap2)));
                }
            }
            ArrayList arrayList2 = this.A01;
            if (arrayList2 == null) {
                throw C36331k8.A0d("outputValues");
            }
            Object obj2 = arrayList2.get(AnonymousClass000.A0I(C000200c.A00(str, hashMap)));
            AnonymousClass00C.A08(obj2);
            return C90504aG.A01(obj2);
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Symbol ");
        A0u.append(str);
        throw AnonymousClass78L.A00(" does not exist.", A0u);
    }

    public final C133096Wr A0B(int i) {
        if (i >= 0) {
            Vector vector = this.A07;
            if (i < vector.size()) {
                Object obj = vector.get(i);
                AnonymousClass00C.A08(obj);
                return (C133096Wr) obj;
            }
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("getNodeByIndex was called with unexpected index=");
        A0u.append(i);
        A0u.append(", size of allNodes is ");
        throw new AnonymousClass78L(C36381kD.A10(A0u, this.A07.size()));
    }

    public static final int A00(AnonymousClass6YB r4, C1277369l r5, String str) {
        int A062 = r4.A06(r5, str);
        while (r5.A02() == '|') {
            if (C1277369l.A00(r5) <= 1 || r5.A03(1) != '|') {
                StringBuilder A0u = AnonymousClass000.A0u();
                C1277369l.A01(r5, "Invalid operator found at index ", str, A0u);
                throw AnonymousClass78L.A00("'s expression", A0u);
            }
            r5.A04();
            AnonymousClass5T2 r1 = AnonymousClass5T2.OR;
            r5.A04();
            A062 = r4.A02(r1, A062, r4.A06(r5, str));
        }
        return A062;
    }

    private final int A03(C1277369l r4, String str) {
        AnonymousClass5T2 r1;
        int A072 = A07(r4, str);
        while (true) {
            char A022 = r4.A02();
            if (A022 == '+') {
                r1 = AnonymousClass5T2.ADD;
            } else if (A022 != '-') {
                return A072;
            } else {
                r1 = AnonymousClass5T2.SUB;
            }
            r4.A04();
            A072 = A02(r1, A072, A07(r4, str));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x005e, code lost:
        throw new X.AnonymousClass78L(r1.toString());
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int A04(X.C1277369l r8, java.lang.String r9) {
        /*
            r7 = this;
            int r6 = r7.A08(r8, r9)
        L_0x0004:
            char r5 = r8.A02()
            java.lang.String r3 = "'s expression"
            java.lang.String r2 = " in "
            r4 = 61
            r1 = 1
            if (r5 != r4) goto L_0x002e
            int r0 = X.C1277369l.A00(r8)
            if (r0 <= r1) goto L_0x0044
            char r0 = r8.A03(r1)
            if (r0 != r4) goto L_0x0044
            r8.A04()
            X.5T2 r1 = X.AnonymousClass5T2.EQ
        L_0x0022:
            r8.A04()
            int r0 = r7.A08(r8, r9)
            int r6 = r7.A02(r1, r6, r0)
            goto L_0x0004
        L_0x002e:
            r0 = 33
            if (r5 != r0) goto L_0x007a
            int r0 = X.C1277369l.A00(r8)
            if (r0 <= r1) goto L_0x005f
            char r0 = r8.A03(r1)
            if (r0 != r4) goto L_0x005f
            r8.A04()
            X.5T2 r1 = X.AnonymousClass5T2.NE
            goto L_0x0022
        L_0x0044:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Invalid operator found at index "
            r1.append(r0)
            int r0 = r8.A00
            r1.append(r0)
            X.AnonymousClass000.A1D(r2, r9, r3, r1)
            java.lang.String r1 = r1.toString()
            X.78L r0 = new X.78L
            r0.<init>(r1)
            throw r0
        L_0x005f:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Unexpected '!' found at index "
            r1.append(r0)
            int r0 = r8.A00
            r1.append(r0)
            X.AnonymousClass000.A1D(r2, r9, r3, r1)
            java.lang.String r1 = r1.toString()
            X.78L r0 = new X.78L
            r0.<init>(r1)
            throw r0
        L_0x007a:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6YB.A04(X.69l, java.lang.String):int");
    }

    private final int A05(C1277369l r9, String str) {
        int length;
        char A022 = r9.A02();
        if (A022 == '(') {
            r9.A04();
            int A002 = A00(this, r9, str);
            if (r9.A02() == ')') {
                r9.A04();
                return A002;
            }
            StringBuilder A0u = AnonymousClass000.A0u();
            C1277369l.A01(r9, "Unexpected character found at index ", str, A0u);
            throw AnonymousClass78L.A00("'s expression. Expected ')'.", A0u);
        } else if ('a' > A022 ? 'A' > A022 || (A022 >= '[' && A022 != '_') : A022 >= '{') {
            char A032 = r9.A03(0);
            if ('0' > A032 || A032 >= ':') {
                StringBuilder A0u2 = AnonymousClass000.A0u();
                A0u2.append("Unexpected character '");
                A0u2.append(A022);
                C1277369l.A01(r9, "' found at index ", str, A0u2);
                throw AnonymousClass78L.A00("'s expression", A0u2);
            }
            String str2 = r9.A01;
            String A0d = C90494aF.A0d(str2, r9.A00);
            while (true) {
                length = str2.length();
                if (!AnonymousClass000.A1R(length - r9.A00)) {
                    break;
                }
                char A033 = r9.A03(0);
                if ('0' > A033) {
                    if (A033 != '.') {
                        break;
                    }
                } else if (A033 >= ':') {
                    break;
                }
                r9.A04();
            }
            String A16 = C36431kI.A16(0, A0d.length() - (length - r9.A00), A0d);
            try {
                double parseDouble = Double.parseDouble(A16);
                Vector vector = this.A07;
                vector.add(new C133096Wr(parseDouble));
                return C90504aG.A0C(vector);
            } catch (NumberFormatException unused) {
                StringBuilder A0u3 = AnonymousClass000.A0u();
                A0u3.append("Failed to convert '");
                A0u3.append(A16);
                A0u3.append("' to double in ");
                A0u3.append(str);
                throw AnonymousClass78L.A00("'s expression", A0u3);
            }
        } else {
            String str3 = r9.A01;
            String A0d2 = C90494aF.A0d(str3, r9.A00);
            while (AnonymousClass000.A1R(str3.length() - r9.A00)) {
                char A034 = r9.A03(0);
                char c = '{';
                if ('a' > A034) {
                    if ('A' > A034) {
                        if ('0' > A034) {
                            break;
                        }
                        c = ':';
                    } else {
                        if (A034 >= '[' && A034 != '_') {
                            break;
                        }
                        r9.A04();
                    }
                }
                if (A034 >= c) {
                    break;
                }
                r9.A04();
            }
            String A162 = C36431kI.A16(0, A0d2.length() - C90494aF.A0d(str3, r9.A00).length(), A0d2);
            if (r9.A02() == '(') {
                r9.A04();
                ArrayList A0I = AnonymousClass001.A0I();
                while (r9.A02() != ')') {
                    AnonymousClass000.A1F(A0I, A00(this, r9, str));
                    if (r9.A02() == ',') {
                        r9.A04();
                        if (r9.A02() == ')') {
                            StringBuilder A0u4 = AnonymousClass000.A0u();
                            C1277369l.A01(r9, "Function argument list ends in comma at index ", str, A0u4);
                            throw AnonymousClass78L.A00("'s expression", A0u4);
                        }
                    }
                }
                r9.A04();
                AnonymousClass011 A0j = C36421kH.A0j(C36431kI.A1D(Locale.ROOT, A162), A0I.size());
                Map map = A0A;
                if (map.containsKey(A0j)) {
                    AnonymousClass5T2 valueOf = AnonymousClass5T2.valueOf((String) C000200c.A00(A0j, map));
                    int size = A0I.size();
                    if (size == 1) {
                        int A0I2 = AnonymousClass000.A0I(A0I.get(0));
                        Vector vector2 = this.A07;
                        vector2.add(new C133096Wr(valueOf, A0I2));
                        return C90504aG.A0C(vector2);
                    } else if (size == 2) {
                        return A02(valueOf, AnonymousClass000.A0I(A0I.get(0)), AnonymousClass000.A0I(A0I.get(1)));
                    } else {
                        StringBuilder A0v = AnonymousClass000.A0v(str);
                        A0v.append("'s expression contains function call to '");
                        A0v.append(A162);
                        C36341k9.A1N("' with ", A0v, A0I);
                        throw AnonymousClass78L.A00(" arguments which has been found in the lookup table but the number of arguments is unexpected.", A0v);
                    }
                } else {
                    StringBuilder A0v2 = AnonymousClass000.A0v(str);
                    A0v2.append("'s expression contains an unexpected function call to '");
                    A0v2.append(A162);
                    C36341k9.A1N("' with ", A0v2, A0I);
                    throw AnonymousClass78L.A00(" arguments", A0v2);
                }
            } else if (!AnonymousClass00C.A0J(str, A162)) {
                HashMap hashMap = this.A03;
                if (hashMap.containsKey(A162)) {
                    if (this.A04.contains(A162)) {
                        this.A05.add(A162);
                    } else {
                        HashMap hashMap2 = this.A02;
                        ((Vector) this.A08.get(AnonymousClass000.A0I(C90494aF.A0Y(str, hashMap2)))).addElement(Integer.valueOf(AnonymousClass000.A0I(C000200c.A00(A162, hashMap2))));
                    }
                    return AnonymousClass000.A0I(C000200c.A00(A162, hashMap));
                }
                StringBuilder A0u5 = AnonymousClass000.A0u();
                A0u5.append("Unexpected symbol ");
                A0u5.append(A162);
                A0u5.append(" found in ");
                A0u5.append(str);
                throw AnonymousClass78L.A00("'s expression", A0u5);
            } else {
                throw AnonymousClass78L.A00("'s expression contains itself", AnonymousClass000.A0v(str));
            }
        }
    }

    private final int A06(C1277369l r5, String str) {
        int A042 = A04(r5, str);
        while (r5.A02() == '&') {
            if (C1277369l.A00(r5) <= 1 || r5.A03(1) != '&') {
                StringBuilder A0u = AnonymousClass000.A0u();
                C1277369l.A01(r5, "Invalid operator found at index ", str, A0u);
                throw AnonymousClass78L.A00("'s expression", A0u);
            }
            r5.A04();
            AnonymousClass5T2 r1 = AnonymousClass5T2.AND;
            r5.A04();
            A042 = A02(r1, A042, A04(r5, str));
        }
        return A042;
    }

    private final int A07(C1277369l r7, String str) {
        int i;
        AnonymousClass5T2 r4;
        int A052;
        if (r7.A02() == '!') {
            r7.A04();
            int A053 = A05(r7, str);
            AnonymousClass5T2 r2 = AnonymousClass5T2.NOT;
            Vector vector = this.A07;
            vector.add(new C133096Wr(r2, A053));
            i = C90504aG.A0C(vector);
        } else {
            i = A05(r7, str);
        }
        while (true) {
            char A022 = r7.A02();
            if (A022 == '*') {
                r4 = AnonymousClass5T2.MUL;
            } else if (A022 != '/') {
                return i;
            } else {
                r4 = AnonymousClass5T2.DIV;
            }
            r7.A04();
            if (r7.A02() == '!') {
                r7.A04();
                int A054 = A05(r7, str);
                AnonymousClass5T2 r22 = AnonymousClass5T2.NOT;
                Vector vector2 = this.A07;
                vector2.add(new C133096Wr(r22, A054));
                A052 = C90504aG.A0C(vector2);
            } else {
                A052 = A05(r7, str);
            }
            i = A02(r4, i, A052);
        }
    }

    private final int A08(C1277369l r6, String str) {
        AnonymousClass5T2 r1;
        int A032 = A03(r6, str);
        while (true) {
            char A022 = r6.A02();
            if (A022 == '>') {
                if (C1277369l.A00(r6) <= 1 || r6.A03(1) != '=') {
                    r1 = AnonymousClass5T2.GT;
                } else {
                    r6.A04();
                    r1 = AnonymousClass5T2.GE;
                }
            } else if (A022 != '<') {
                return A032;
            } else {
                if (C1277369l.A00(r6) <= 1 || r6.A03(1) != '=') {
                    r1 = AnonymousClass5T2.LT;
                } else {
                    r6.A04();
                    r1 = AnonymousClass5T2.LE;
                }
            }
            r6.A04();
            A032 = A02(r1, A032, A03(r6, str));
        }
    }
}
