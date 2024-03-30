package X;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: X.6uH  reason: invalid class name and case insensitive filesystem */
public class C145636uH implements C158257gd {
    public final int A00;
    public final AnonymousClass72T A01;
    public final String A02;
    public final Set A03;

    /* JADX WARNING: Removed duplicated region for block: B:19:0x004e A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean BLd(X.C1261562t r4) {
        /*
            r3 = this;
            r2 = 0
            java.lang.String r0 = r3.A02     // Catch:{ IllegalArgumentException -> 0x0050 }
            java.lang.Object r0 = r4.A00(r0)     // Catch:{ IllegalArgumentException -> 0x0050 }
            X.72T r1 = new X.72T
            r1.<init>(r0)
            int r0 = r3.A00
            switch(r0) {
                case 4: goto L_0x001b;
                case 5: goto L_0x0022;
                case 6: goto L_0x002b;
                case 7: goto L_0x0034;
                case 8: goto L_0x003d;
                case 9: goto L_0x0046;
                default: goto L_0x0011;
            }
        L_0x0011:
            java.util.Set r0 = r3.A03
            X.C18740tg.A06(r0)
            boolean r0 = r0.contains(r1)
            return r0
        L_0x001b:
            X.72T r0 = r3.A01
            boolean r0 = r1.equals(r0)
            return r0
        L_0x0022:
            X.72T r0 = r3.A01
            boolean r0 = r1.equals(r0)
            r0 = r0 ^ 1
            return r0
        L_0x002b:
            X.72T r0 = r3.A01
            int r0 = r1.compareTo(r0)
            if (r0 >= 0) goto L_0x004f
            goto L_0x004e
        L_0x0034:
            X.72T r0 = r3.A01
            int r0 = r1.compareTo(r0)
            if (r0 <= 0) goto L_0x004f
            goto L_0x004e
        L_0x003d:
            X.72T r0 = r3.A01
            int r0 = r1.compareTo(r0)
            if (r0 > 0) goto L_0x004f
            goto L_0x004e
        L_0x0046:
            X.72T r0 = r3.A01
            int r0 = r1.compareTo(r0)
            if (r0 < 0) goto L_0x004f
        L_0x004e:
            r2 = 1
        L_0x004f:
            return r2
        L_0x0050:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C145636uH.BLd(X.62t):boolean");
    }

    public int hashCode() {
        Object[] objArr = new Object[5];
        objArr[0] = this.A02;
        AnonymousClass000.A1K(objArr, this.A00);
        objArr[2] = this.A01;
        objArr[3] = this.A03;
        return AnonymousClass000.A0M(String.class, objArr, 4);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C145636uH)) {
            return false;
        }
        C145636uH r4 = (C145636uH) obj;
        if (!this.A02.equals(r4.A02) || this.A00 != r4.A00) {
            return false;
        }
        AnonymousClass72T r1 = this.A01;
        AnonymousClass72T r0 = r4.A01;
        if (r1 == null) {
            if (r0 != null) {
                return false;
            }
        } else if (!r1.equals(r0)) {
            return false;
        }
        Set set = this.A03;
        Set set2 = r4.A03;
        if (set == null) {
            if (set2 != null) {
                return false;
            }
        } else if (!set.equals(set2)) {
            return false;
        }
        Class<String> cls = String.class;
        if (cls.equals(cls)) {
            return true;
        }
        return false;
    }

    public C145636uH(int i, String str, Object obj) {
        this.A00 = i;
        this.A02 = str;
        this.A01 = new AnonymousClass72T(obj);
        this.A03 = null;
    }

    public C145636uH(String str, List list) {
        this.A00 = 10;
        this.A02 = str;
        this.A03 = new HashSet(list.size());
        for (Object r2 : list) {
            this.A03.add(new AnonymousClass72T(r2));
        }
        this.A01 = null;
    }
}
