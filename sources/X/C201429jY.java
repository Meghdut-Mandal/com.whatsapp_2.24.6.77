package X;

import android.os.Build;
import java.util.AbstractCollection;

/* renamed from: X.9jY  reason: invalid class name and case insensitive filesystem */
public class C201429jY {
    public static C201429jY A03 = A00(Build.MANUFACTURER, Build.MODEL);
    public static C201429jY A04 = new C201429jY(Build.PRODUCT);
    public final String A00;
    public final String A01;
    public final String A02;

    public static C201429jY A00(String str, String str2) {
        return new C201429jY(str, str2);
    }

    public static void A01(String str, String str2, AbstractCollection abstractCollection) {
        abstractCollection.add(new C201429jY(str, str2));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0017, code lost:
        if (r6.A01.isEmpty() != false) goto L_0x0019;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof X.C201429jY
            r5 = 0
            if (r0 == 0) goto L_0x0056
            X.9jY r7 = (X.C201429jY) r7
            java.lang.String r4 = r6.A00
            boolean r0 = r4.isEmpty()
            r2 = 1
            if (r0 != 0) goto L_0x0019
            java.lang.String r0 = r6.A01
            boolean r0 = r0.isEmpty()
            r1 = 1
            if (r0 == 0) goto L_0x001a
        L_0x0019:
            r1 = 0
        L_0x001a:
            java.lang.String r3 = r7.A00
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L_0x006c
            java.lang.String r0 = r7.A01
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x006c
        L_0x002a:
            if (r1 == 0) goto L_0x0057
            if (r2 == 0) goto L_0x0057
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            r1.append(r4)
            r0 = 58
            r1.append(r0)
            java.lang.String r0 = r6.A01
            java.lang.String r2 = X.AnonymousClass000.A0q(r0, r1)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            r1.append(r3)
            r0 = 58
            r1.append(r0)
            java.lang.String r0 = r7.A01
            java.lang.String r0 = X.AnonymousClass000.A0q(r0, r1)
            boolean r5 = r2.equals(r0)
        L_0x0056:
            return r5
        L_0x0057:
            java.lang.String r2 = r6.A02
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x0056
            java.lang.String r1 = r7.A02
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0056
            boolean r5 = r2.equals(r1)
            return r5
        L_0x006c:
            r2 = 0
            goto L_0x002a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C201429jY.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        String str;
        String str2 = this.A00;
        if (!str2.isEmpty()) {
            String str3 = this.A01;
            if (!str3.isEmpty()) {
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append(str2);
                A0u.append(':');
                str = AnonymousClass000.A0q(str3, A0u);
                return str.hashCode();
            }
        }
        str = this.A02;
        return str.hashCode();
    }

    public C201429jY(String str, String str2) {
        this.A02 = "";
        this.A00 = str;
        this.A01 = str2;
    }

    public C201429jY(String str) {
        this.A02 = str;
        this.A00 = "";
        this.A01 = "";
    }
}
