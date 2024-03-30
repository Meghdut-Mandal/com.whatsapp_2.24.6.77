package X;

import java.util.Map;

/* renamed from: X.0YG  reason: invalid class name */
public abstract class AnonymousClass0YG {
    public abstract Object A05(String str);

    public abstract Map A06();

    public abstract boolean A08(String str);

    public static final Object A02(C04530Kz r3, Object obj) {
        C15950oJ r32 = r3.A00;
        if (r32 == null) {
            return obj;
        }
        AnonymousClass006.A01(r32);
        AnonymousClass0LA r33 = (AnonymousClass0LA) r32;
        Object obj2 = r33.A01.get(((Number) obj).intValue());
        if (obj2 != null || !r33.A02.containsKey("gms_unknown")) {
            return obj2;
        }
        return "gms_unknown";
    }

    public static final void A03(C04530Kz r2, Object obj, StringBuilder sb) {
        String obj2;
        int i = r2.A02;
        if (i == 11) {
            Class cls = r2.A08;
            AnonymousClass006.A01(cls);
            obj2 = cls.cast(obj).toString();
        } else if (i == 7) {
            obj2 = "\"";
            sb.append(obj2);
            sb.append(C07000Vy.A00((String) obj));
        } else {
            sb.append(obj);
            return;
        }
        sb.append(obj2);
    }

    public Object A04(C04530Kz r5) {
        String str = r5.A09;
        if (r5.A08 == null) {
            return A05(str);
        }
        A05(str);
        try {
            char upperCase = Character.toUpperCase(str.charAt(0));
            String substring = str.substring(1);
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("get");
            A0u.append(upperCase);
            A0u.append(substring);
            return AnonymousClass000.A0h(getClass(), this, A0u.toString());
        } catch (Exception e) {
            throw AnonymousClass001.A0B(e);
        }
    }

    public boolean A07(C04530Kz r3) {
        if (r3.A07 != 11) {
            return A08(r3.A09);
        }
        if (r3.A0A) {
            throw AnonymousClass001.A0E("Concrete type arrays not supported");
        }
        throw AnonymousClass001.A0E("Concrete types not supported");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0092, code lost:
        if (r6 != null) goto L_0x009d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0094, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0095, code lost:
        r3.append(r0);
        r3.append("\"");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x009d, code lost:
        r0 = android.util.Base64.encodeToString(r6, r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
            r9 = this;
            java.util.Map r5 = r9.A06()
            r0 = 100
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r0)
            java.util.Iterator r8 = X.AnonymousClass000.A10(r5)
        L_0x000f:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x00a6
            java.lang.String r2 = X.AnonymousClass001.A0C(r8)
            java.lang.Object r7 = r5.get(r2)
            X.0Kz r7 = (X.C04530Kz) r7
            boolean r0 = r9.A07(r7)
            if (r0 == 0) goto L_0x000f
            java.lang.Object r0 = r9.A04(r7)
            java.lang.Object r6 = A02(r7, r0)
            int r0 = r3.length()
            java.lang.String r4 = ","
            if (r0 != 0) goto L_0x00a2
            java.lang.String r0 = "{"
            r3.append(r0)
        L_0x003a:
            java.lang.String r1 = "\""
            r3.append(r1)
            r3.append(r2)
            java.lang.String r0 = "\":"
            r3.append(r0)
            if (r6 != 0) goto L_0x004f
            java.lang.String r0 = "null"
        L_0x004b:
            r3.append(r0)
            goto L_0x000f
        L_0x004f:
            int r0 = r7.A07
            switch(r0) {
                case 8: goto L_0x008c;
                case 9: goto L_0x0084;
                case 10: goto L_0x007e;
                default: goto L_0x0054;
            }
        L_0x0054:
            boolean r0 = r7.A05
            if (r0 == 0) goto L_0x007a
            java.util.AbstractList r6 = (java.util.AbstractList) r6
            java.lang.String r0 = "["
            r3.append(r0)
            int r2 = r6.size()
            r1 = 0
        L_0x0064:
            if (r1 >= r2) goto L_0x0077
            if (r1 <= 0) goto L_0x006b
            r3.append(r4)
        L_0x006b:
            java.lang.Object r0 = r6.get(r1)
            if (r0 == 0) goto L_0x0074
            A03(r7, r0, r3)
        L_0x0074:
            int r1 = r1 + 1
            goto L_0x0064
        L_0x0077:
            java.lang.String r0 = "]"
            goto L_0x004b
        L_0x007a:
            A03(r7, r6, r3)
            goto L_0x000f
        L_0x007e:
            java.util.HashMap r6 = (java.util.HashMap) r6
            X.AnonymousClass0QP.A00(r3, r6)
            goto L_0x000f
        L_0x0084:
            r3.append(r1)
            byte[] r6 = (byte[]) r6
            r0 = 10
            goto L_0x0092
        L_0x008c:
            r3.append(r1)
            byte[] r6 = (byte[]) r6
            r0 = 0
        L_0x0092:
            if (r6 != 0) goto L_0x009d
            r0 = 0
        L_0x0095:
            r3.append(r0)
            r3.append(r1)
            goto L_0x000f
        L_0x009d:
            java.lang.String r0 = android.util.Base64.encodeToString(r6, r0)
            goto L_0x0095
        L_0x00a2:
            r3.append(r4)
            goto L_0x003a
        L_0x00a6:
            int r0 = r3.length()
            if (r0 <= 0) goto L_0x00b3
            java.lang.String r0 = "}"
        L_0x00ae:
            java.lang.String r0 = X.AnonymousClass000.A0q(r0, r3)
            return r0
        L_0x00b3:
            java.lang.String r0 = "{}"
            goto L_0x00ae
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0YG.toString():java.lang.String");
    }
}
