package X;

import java.util.List;

/* renamed from: X.0mE  reason: invalid class name and case insensitive filesystem */
public final class C14810mE extends AnonymousClass00R implements C009003v {
    public final /* synthetic */ List $delimitersList;
    public final /* synthetic */ boolean $ignoreCase = false;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14810mE(List list) {
        super(2);
        this.$delimitersList = list;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0099, code lost:
        if (r10 == r2) goto L_0x0066;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:?, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r18, java.lang.Object r19) {
        /*
            r17 = this;
            r12 = r18
            java.lang.CharSequence r12 = (java.lang.CharSequence) r12
            int r2 = X.AnonymousClass000.A0I(r19)
            r13 = 0
            X.AnonymousClass00C.A0D(r12, r13)
            r0 = r17
            java.util.List r4 = r0.$delimitersList
            boolean r7 = r0.$ignoreCase
            if (r7 != 0) goto L_0x004c
            int r0 = r4.size()
            r1 = 1
            if (r0 != r1) goto L_0x004c
            int r0 = r4.size()
            if (r0 == 0) goto L_0x00d7
            if (r0 != r1) goto L_0x00d0
            java.lang.Object r3 = r4.get(r13)
            java.lang.String r3 = (java.lang.String) r3
            int r0 = X.AnonymousClass099.A0C(r12, r3, r2, r13)
            if (r0 < 0) goto L_0x0066
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
        L_0x0033:
            X.011 r0 = new X.011
            r0.<init>(r1, r3)
            java.lang.Object r1 = r0.first
            java.lang.Object r0 = r0.second
            java.lang.String r0 = (java.lang.String) r0
            int r0 = r0.length()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            X.011 r2 = new X.011
            r2.<init>(r1, r0)
            return r2
        L_0x004c:
            if (r2 >= r13) goto L_0x004f
            r2 = 0
        L_0x004f:
            int r0 = r12.length()
            X.0mZ r1 = new X.0mZ
            r1.<init>(r2, r0)
            boolean r0 = r12 instanceof java.lang.String
            int r10 = r1.A00
            int r2 = r1.A01
            int r1 = r1.A02
            if (r0 == 0) goto L_0x009d
            if (r1 <= 0) goto L_0x0068
            if (r10 <= r2) goto L_0x006c
        L_0x0066:
            r2 = 0
            return r2
        L_0x0068:
            if (r1 >= 0) goto L_0x0066
            if (r2 > r10) goto L_0x0066
        L_0x006c:
            java.util.Iterator r5 = r4.iterator()
        L_0x0070:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0099
            java.lang.Object r3 = r5.next()
            r6 = r3
            java.lang.String r6 = (java.lang.String) r6
            r9 = r12
            java.lang.String r9 = (java.lang.String) r9
            int r11 = r6.length()
            r0 = 2
            X.AnonymousClass00C.A0D(r9, r0)
            if (r7 != 0) goto L_0x0093
            boolean r0 = r6.regionMatches(r13, r9, r10, r11)
        L_0x008e:
            if (r0 == 0) goto L_0x0070
            if (r3 == 0) goto L_0x0099
            goto L_0x00c6
        L_0x0093:
            r8 = 0
            boolean r0 = r6.regionMatches(r7, r8, r9, r10, r11)
            goto L_0x008e
        L_0x0099:
            if (r10 == r2) goto L_0x0066
            int r10 = r10 + r1
            goto L_0x006c
        L_0x009d:
            if (r1 <= 0) goto L_0x00a2
            if (r10 <= r2) goto L_0x00a6
            goto L_0x0066
        L_0x00a2:
            if (r1 >= 0) goto L_0x0066
            if (r2 > r10) goto L_0x0066
        L_0x00a6:
            java.util.Iterator r5 = r4.iterator()
        L_0x00aa:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x00cc
            java.lang.Object r3 = r5.next()
            r11 = r3
            java.lang.String r11 = (java.lang.String) r11
            int r15 = r11.length()
            r14 = r10
            r16 = r7
            boolean r0 = X.AnonymousClass099.A0N(r11, r12, r13, r14, r15, r16)
            if (r0 == 0) goto L_0x00aa
            if (r3 == 0) goto L_0x00cc
        L_0x00c6:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r10)
            goto L_0x0033
        L_0x00cc:
            if (r10 == r2) goto L_0x0066
            int r10 = r10 + r1
            goto L_0x00a6
        L_0x00d0:
            java.lang.String r0 = "List has more than one element."
            java.lang.IllegalArgumentException r1 = X.AnonymousClass001.A08(r0)
            throw r1
        L_0x00d7:
            java.lang.String r0 = "List is empty."
            java.util.NoSuchElementException r1 = new java.util.NoSuchElementException
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14810mE.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
