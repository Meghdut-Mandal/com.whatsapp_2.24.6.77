package X;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: X.6TE  reason: invalid class name */
public class AnonymousClass6TE {
    public String A00;
    public List A01;
    public AnonymousClass6O4 A02;
    public C120565ri A03;

    /* JADX WARNING: Removed duplicated region for block: B:9:0x0023 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r4) {
        /*
            r3 = this;
            boolean r0 = r4 instanceof X.AnonymousClass6TE
            r2 = 0
            if (r0 == 0) goto L_0x0024
            X.6TE r4 = (X.AnonymousClass6TE) r4
            X.6O4 r1 = r3.A02
            X.6O4 r0 = r4.A02
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0024
            java.lang.String r1 = r3.A00
            java.lang.String r0 = r4.A00
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0024
            java.util.List r1 = r3.A01
            java.util.List r0 = r4.A01
            if (r1 != 0) goto L_0x0025
            if (r0 != 0) goto L_0x0024
        L_0x0023:
            r2 = 1
        L_0x0024:
            return r2
        L_0x0025:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0024
            goto L_0x0023
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6TE.equals(java.lang.Object):boolean");
    }

    public AnonymousClass6TE(String str, List list, AnonymousClass6O4 r6) {
        Integer num;
        this.A02 = r6;
        this.A00 = str;
        this.A01 = list;
        if (C132956Vy.A02()) {
            num = C023109s.A00;
        } else {
            num = C023109s.A0C;
        }
        this.A03 = new C120565ri(num, C023109s.A0C);
    }

    public int hashCode() {
        Object[] A0M = AnonymousClass001.A0M();
        A0M[0] = this.A02;
        A0M[1] = this.A00;
        return Arrays.deepHashCode(A0M);
    }

    public AnonymousClass6TE(String str, List list, AnonymousClass6O4 r3, C120565ri r4) {
        this.A02 = r3;
        this.A00 = str;
        this.A01 = list;
        this.A03 = r4;
    }

    public AnonymousClass6TE() {
        Integer num;
        this.A02 = new AnonymousClass6O4();
        this.A00 = "";
        this.A01 = Collections.emptyList();
        if (C132956Vy.A02()) {
            num = C023109s.A00;
        } else {
            num = C023109s.A0C;
        }
        this.A03 = new C120565ri(num, C023109s.A0C);
    }
}
