package X;

import java.util.Iterator;
import java.util.Set;

/* renamed from: X.9Y9  reason: invalid class name */
public class AnonymousClass9Y9 {
    public C203549oH A00 = new C203549oH();

    public boolean equals(Object obj) {
        if (!(obj instanceof AnonymousClass9Y9)) {
            return false;
        }
        return this.A00.equals(((AnonymousClass9Y9) obj).A00);
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        return this.A00.toString();
    }

    public void A00(C22640As6 as6) {
        C1888891d r1;
        try {
            C203549oH r2 = this.A00;
            int i = as6.A00;
            if (i == 0) {
                Set<Object> set = r2.A04;
                C22610Arc A002 = C22610Arc.A00(as6.A01);
                if (!set.isEmpty()) {
                    for (Object A003 : set) {
                        if (C22610Arc.A00(A003).equals(A002)) {
                            r1 = new C1888891d("OtherName is from an excluded subtree.");
                        }
                    }
                    return;
                }
                return;
            } else if (i == 1) {
                Set set2 = r2.A02;
                String A004 = C22640As6.A00(as6);
                if (!set2.isEmpty()) {
                    Iterator it = set2.iterator();
                    while (it.hasNext()) {
                        if (C203549oH.A04(A004, AnonymousClass001.A0C(it))) {
                            r1 = new C1888891d("Email address is from an excluded subtree.");
                        }
                    }
                    return;
                }
                return;
            } else if (i == 2) {
                Set set3 = r2.A01;
                String A005 = C22640As6.A00(as6);
                if (!set3.isEmpty()) {
                    Iterator it2 = set3.iterator();
                    while (it2.hasNext()) {
                        String A0C = AnonymousClass001.A0C(it2);
                        if (C203549oH.A06(A005, A0C) || A005.equalsIgnoreCase(A0C)) {
                            r1 = new C1888891d("DNS is from an excluded subtree.");
                        }
                    }
                    return;
                }
                return;
            } else if (i == 4) {
                r2.A0A(C22641As7.A01(as6.A01));
                return;
            } else if (i == 6) {
                Set set4 = r2.A05;
                String A006 = C22640As6.A00(as6);
                if (!set4.isEmpty()) {
                    Iterator it3 = set4.iterator();
                    while (it3.hasNext()) {
                        if (C203549oH.A05(A006, AnonymousClass001.A0C(it3))) {
                            r1 = new C1888891d("URI is from an excluded subtree.");
                        }
                    }
                    return;
                }
                return;
            } else if (i == 7) {
                Set<byte[]> set5 = r2.A03;
                byte[] A03 = C22659AsP.A03(as6.A01);
                if (!set5.isEmpty()) {
                    for (byte[] A09 : set5) {
                        if (C203549oH.A09(A03, A09)) {
                            r1 = new C1888891d("IP is from an excluded subtree.");
                        }
                    }
                    return;
                }
                return;
            } else {
                return;
            }
            throw r1;
        } catch (C1888891d e) {
            throw new C1890291t(e.getMessage(), e);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:47:0x008f A[Catch:{ 91d -> 0x011b }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01(X.C22640As6 r6) {
        /*
            r5 = this;
            X.9oH r2 = r5.A00     // Catch:{ 91d -> 0x011b }
            int r1 = r6.A00     // Catch:{ 91d -> 0x011b }
            if (r1 == 0) goto L_0x00e7
            r0 = 1
            if (r1 == r0) goto L_0x00b5
            r0 = 2
            if (r1 == r0) goto L_0x007d
            r0 = 4
            if (r1 == r0) goto L_0x0073
            r0 = 6
            if (r1 == r0) goto L_0x0049
            r0 = 7
            if (r1 != r0) goto L_0x011a
            java.util.Set r3 = r2.A09     // Catch:{ 91d -> 0x011b }
            X.11z r0 = r6.A01     // Catch:{ 91d -> 0x011b }
            byte[] r2 = X.C22659AsP.A03(r0)     // Catch:{ 91d -> 0x011b }
            if (r3 == 0) goto L_0x011a
            java.util.Iterator r1 = r3.iterator()     // Catch:{ 91d -> 0x011b }
        L_0x0023:
            boolean r0 = r1.hasNext()     // Catch:{ 91d -> 0x011b }
            if (r0 == 0) goto L_0x0036
            java.lang.Object r0 = r1.next()     // Catch:{ 91d -> 0x011b }
            byte[] r0 = (byte[]) r0     // Catch:{ 91d -> 0x011b }
            boolean r0 = X.C203549oH.A09(r2, r0)     // Catch:{ 91d -> 0x011b }
            if (r0 == 0) goto L_0x0023
            return
        L_0x0036:
            int r0 = r2.length     // Catch:{ 91d -> 0x011b }
            if (r0 != 0) goto L_0x0040
            int r0 = r3.size()     // Catch:{ 91d -> 0x011b }
            if (r0 != 0) goto L_0x0040
            return
        L_0x0040:
            java.lang.String r0 = "IP is not from a permitted subtree."
            X.91d r1 = new X.91d     // Catch:{ 91d -> 0x011b }
            r1.<init>(r0)     // Catch:{ 91d -> 0x011b }
            goto L_0x0119
        L_0x0049:
            java.util.Set r3 = r2.A0B     // Catch:{ 91d -> 0x011b }
            java.lang.String r2 = X.C22640As6.A00(r6)     // Catch:{ 91d -> 0x011b }
            if (r3 == 0) goto L_0x011a
            java.util.Iterator r1 = r3.iterator()     // Catch:{ 91d -> 0x011b }
        L_0x0055:
            boolean r0 = r1.hasNext()     // Catch:{ 91d -> 0x011b }
            if (r0 == 0) goto L_0x0066
            java.lang.String r0 = X.AnonymousClass001.A0C(r1)     // Catch:{ 91d -> 0x011b }
            boolean r0 = X.C203549oH.A05(r2, r0)     // Catch:{ 91d -> 0x011b }
            if (r0 == 0) goto L_0x0055
            return
        L_0x0066:
            int r0 = r2.length()     // Catch:{ 91d -> 0x011b }
            if (r0 != 0) goto L_0x0112
            int r0 = r3.size()     // Catch:{ 91d -> 0x011b }
            if (r0 != 0) goto L_0x0112
            return
        L_0x0073:
            X.11z r0 = r6.A01     // Catch:{ 91d -> 0x011b }
            X.As7 r0 = X.C22641As7.A01(r0)     // Catch:{ 91d -> 0x011b }
            r2.A0B(r0)     // Catch:{ 91d -> 0x011b }
            return
        L_0x007d:
            java.util.Set r4 = r2.A07     // Catch:{ 91d -> 0x011b }
            java.lang.String r3 = X.C22640As6.A00(r6)     // Catch:{ 91d -> 0x011b }
            if (r4 == 0) goto L_0x011a
            java.util.Iterator r2 = r4.iterator()     // Catch:{ 91d -> 0x011b }
        L_0x0089:
            boolean r0 = r2.hasNext()     // Catch:{ 91d -> 0x011b }
            if (r0 == 0) goto L_0x00a0
            java.lang.String r1 = X.AnonymousClass001.A0C(r2)     // Catch:{ 91d -> 0x011b }
            boolean r0 = X.C203549oH.A06(r3, r1)     // Catch:{ 91d -> 0x011b }
            if (r0 != 0) goto L_0x011a
            boolean r0 = r3.equalsIgnoreCase(r1)     // Catch:{ 91d -> 0x011b }
            if (r0 == 0) goto L_0x0089
            return
        L_0x00a0:
            int r0 = r3.length()     // Catch:{ 91d -> 0x011b }
            if (r0 != 0) goto L_0x00ad
            int r0 = r4.size()     // Catch:{ 91d -> 0x011b }
            if (r0 != 0) goto L_0x00ad
            return
        L_0x00ad:
            java.lang.String r0 = "DNS is not from a permitted subtree."
            X.91d r1 = new X.91d     // Catch:{ 91d -> 0x011b }
            r1.<init>(r0)     // Catch:{ 91d -> 0x011b }
            goto L_0x0119
        L_0x00b5:
            java.util.Set r3 = r2.A08     // Catch:{ 91d -> 0x011b }
            java.lang.String r2 = X.C22640As6.A00(r6)     // Catch:{ 91d -> 0x011b }
            if (r3 == 0) goto L_0x011a
            java.util.Iterator r1 = r3.iterator()     // Catch:{ 91d -> 0x011b }
        L_0x00c1:
            boolean r0 = r1.hasNext()     // Catch:{ 91d -> 0x011b }
            if (r0 == 0) goto L_0x00d2
            java.lang.String r0 = X.AnonymousClass001.A0C(r1)     // Catch:{ 91d -> 0x011b }
            boolean r0 = X.C203549oH.A04(r2, r0)     // Catch:{ 91d -> 0x011b }
            if (r0 == 0) goto L_0x00c1
            return
        L_0x00d2:
            int r0 = r2.length()     // Catch:{ 91d -> 0x011b }
            if (r0 != 0) goto L_0x00df
            int r0 = r3.size()     // Catch:{ 91d -> 0x011b }
            if (r0 != 0) goto L_0x00df
            return
        L_0x00df:
            java.lang.String r0 = "Subject email address is not from a permitted subtree."
            X.91d r1 = new X.91d     // Catch:{ 91d -> 0x011b }
            r1.<init>(r0)     // Catch:{ 91d -> 0x011b }
            goto L_0x0119
        L_0x00e7:
            java.util.Set r1 = r2.A0A     // Catch:{ 91d -> 0x011b }
            X.11z r0 = r6.A01     // Catch:{ 91d -> 0x011b }
            X.Arc r2 = X.C22610Arc.A00(r0)     // Catch:{ 91d -> 0x011b }
            if (r1 == 0) goto L_0x011a
            java.util.Iterator r1 = r1.iterator()     // Catch:{ 91d -> 0x011b }
        L_0x00f5:
            boolean r0 = r1.hasNext()     // Catch:{ 91d -> 0x011b }
            if (r0 == 0) goto L_0x010a
            java.lang.Object r0 = r1.next()     // Catch:{ 91d -> 0x011b }
            X.Arc r0 = X.C22610Arc.A00(r0)     // Catch:{ 91d -> 0x011b }
            boolean r0 = r0.equals(r2)     // Catch:{ 91d -> 0x011b }
            if (r0 == 0) goto L_0x00f5
            return
        L_0x010a:
            java.lang.String r0 = "Subject OtherName is not from a permitted subtree."
            X.91d r1 = new X.91d     // Catch:{ 91d -> 0x011b }
            r1.<init>(r0)     // Catch:{ 91d -> 0x011b }
            goto L_0x0119
        L_0x0112:
            java.lang.String r0 = "URI is not from a permitted subtree."
            X.91d r1 = new X.91d     // Catch:{ 91d -> 0x011b }
            r1.<init>(r0)     // Catch:{ 91d -> 0x011b }
        L_0x0119:
            throw r1     // Catch:{ 91d -> 0x011b }
        L_0x011a:
            return
        L_0x011b:
            r2 = move-exception
            java.lang.String r1 = r2.getMessage()
            X.91t r0 = new X.91t
            r0.<init>(r1, r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9Y9.A01(X.As6):void");
    }
}
