package X;

import java.util.HashSet;
import java.util.Set;

/* renamed from: X.ASo  reason: case insensitive filesystem */
public class C21622ASo implements C23057B2d {
    public String BER() {
        return "p";
    }

    public Set BE3(AnonymousClass3T1 r5) {
        String str;
        String str2;
        String str3;
        if (r5.A0t == null) {
            return null;
        }
        HashSet A16 = C36441kJ.A16();
        A16.add("");
        C202319lY r2 = r5.A0M;
        if (r2 != null) {
            if (C202319lY.A02(r2)) {
                str = "c";
            } else {
                str = "i";
            }
            A16.add(str);
            if (r2.A0K()) {
                int i = r2.A02;
                if (i == 12) {
                    str3 = "n";
                } else if (i == 17) {
                    str3 = "q";
                }
                A16.add(str3);
            }
            if (r2.A0Q) {
                str2 = "s";
            } else {
                str2 = "r";
            }
            A16.add(str2);
        }
        return A16;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0009, code lost:
        if (r1 == false) goto L_0x000b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass9IU BES(X.AnonymousClass1S3 r6) {
        /*
            r5 = this;
            java.lang.Boolean r0 = r6.A07
            if (r0 == 0) goto L_0x000b
            boolean r1 = r0.booleanValue()
            r0 = 1
            if (r1 != 0) goto L_0x000c
        L_0x000b:
            r0 = 0
        L_0x000c:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x0018
            r0 = 0
            return r0
        L_0x0018:
            java.util.HashSet r3 = X.C36441kJ.A16()
            java.util.HashSet r2 = X.C36441kJ.A16()
            X.9Nh r4 = r6.A05
            if (r4 == 0) goto L_0x005d
            boolean r0 = r4.A04
            java.lang.String r1 = "n"
            if (r0 == 0) goto L_0x0072
            java.lang.String r0 = "q"
            r2.add(r0)
            r2.add(r1)
        L_0x0032:
            java.util.ArrayList r1 = X.AnonymousClass001.A0I()
            boolean r0 = r4.A06
            if (r0 == 0) goto L_0x003f
            java.lang.String r0 = "s"
            r1.add(r0)
        L_0x003f:
            X.978 r0 = r4.A00
            if (r0 == 0) goto L_0x0048
            java.lang.String r0 = "r"
            r1.add(r0)
        L_0x0048:
            boolean r0 = r4.A02
            if (r0 == 0) goto L_0x0051
            java.lang.String r0 = "c"
            r1.add(r0)
        L_0x0051:
            boolean r0 = r4.A03
            if (r0 == 0) goto L_0x005a
            java.lang.String r0 = "i"
            r1.add(r0)
        L_0x005a:
            r3.addAll(r1)
        L_0x005d:
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L_0x0068
            java.lang.String r0 = ""
            r3.add(r0)
        L_0x0068:
            X.9IU r0 = new X.9IU
            r0.<init>()
            r0.A00 = r3
            r0.A01 = r2
            return r0
        L_0x0072:
            boolean r0 = r4.A05
            if (r0 == 0) goto L_0x0032
            r3.add(r1)
            goto L_0x0032
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21622ASo.BES(X.1S3):X.9IU");
    }
}
