package X;

/* renamed from: X.0tS  reason: invalid class name and case insensitive filesystem */
public class C18620tS implements C009604b {
    public Object A00;
    public final int A01;

    public C18620tS(AnonymousClass01z r1, int i) {
        this.A01 = i;
        this.A00 = r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0065, code lost:
        r2.append(r0);
        r2.append(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00df, code lost:
        r2.A1N(r3, r8.A00, r8.A01);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00e6, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001d, code lost:
        r2.append(r0);
        r2.append(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0023, code lost:
        X.AnonymousClass000.A1A(r2, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0026, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ void BQj(java.lang.Object r8) {
        /*
            r7 = this;
            int r0 = r7.A01
            switch(r0) {
                case 0: goto L_0x006c;
                case 1: goto L_0x0027;
                default: goto L_0x0005;
            }
        L_0x0005:
            X.04d r8 = (X.C009804d) r8
            java.lang.Object r2 = r7.A00
            X.01z r2 = (X.AnonymousClass01z) r2
            java.util.ArrayDeque r0 = r2.A0B
            java.lang.Object r0 = r0.pollFirst()
            X.0bG r0 = (X.C08750bG) r0
            java.lang.String r4 = "FragmentManager"
            if (r0 != 0) goto L_0x0053
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "No IntentSenders were started for "
        L_0x001d:
            r2.append(r0)
            r2.append(r7)
        L_0x0023:
            X.AnonymousClass000.A1A(r2, r4)
            return
        L_0x0027:
            X.04d r8 = (X.C009804d) r8
            java.lang.Object r2 = r7.A00
            X.01z r2 = (X.AnonymousClass01z) r2
            java.util.ArrayDeque r0 = r2.A0B
            java.lang.Object r0 = r0.pollFirst()
            X.0bG r0 = (X.C08750bG) r0
            java.lang.String r4 = "FragmentManager"
            if (r0 != 0) goto L_0x0040
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "No Activities were started for result for "
            goto L_0x001d
        L_0x0040:
            java.lang.String r1 = r0.A01
            int r3 = r0.A00
            X.021 r0 = r2.A0T
            X.02E r2 = r0.A01(r1)
            if (r2 != 0) goto L_0x00df
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Activity result delivered for unknown Fragment "
            goto L_0x0065
        L_0x0053:
            java.lang.String r1 = r0.A01
            int r3 = r0.A00
            X.021 r0 = r2.A0T
            X.02E r2 = r0.A01(r1)
            if (r2 != 0) goto L_0x00df
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Intent Sender result delivered for unknown Fragment "
        L_0x0065:
            r2.append(r0)
            r2.append(r1)
            goto L_0x0023
        L_0x006c:
            java.util.Map r8 = (java.util.Map) r8
            java.util.Set r1 = r8.keySet()
            r0 = 0
            java.lang.String[] r0 = new java.lang.String[r0]
            java.lang.Object[] r5 = r1.toArray(r0)
            java.lang.String[] r5 = (java.lang.String[]) r5
            java.util.Collection r0 = r8.values()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r0)
            int r0 = r3.size()
            int[] r6 = new int[r0]
            r2 = 0
        L_0x008b:
            int r0 = r3.size()
            if (r2 >= r0) goto L_0x00a2
            java.lang.Object r0 = r3.get(r2)
            boolean r1 = X.AnonymousClass000.A1X(r0)
            r0 = -1
            if (r1 == 0) goto L_0x009d
            r0 = 0
        L_0x009d:
            r6[r2] = r0
            int r2 = r2 + 1
            goto L_0x008b
        L_0x00a2:
            java.lang.Object r4 = r7.A00
            X.01z r4 = (X.AnonymousClass01z) r4
            java.util.ArrayDeque r0 = r4.A0B
            java.lang.Object r0 = r0.pollFirst()
            X.0bG r0 = (X.C08750bG) r0
            java.lang.String r3 = "FragmentManager"
            if (r0 != 0) goto L_0x00c2
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "No permissions were requested for "
            r1.append(r0)
            r1.append(r7)
        L_0x00be:
            X.AnonymousClass000.A1A(r1, r3)
            return
        L_0x00c2:
            java.lang.String r2 = r0.A01
            int r1 = r0.A00
            X.021 r0 = r4.A0T
            X.02E r0 = r0.A01(r2)
            if (r0 != 0) goto L_0x00db
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Permission request result delivered for unknown Fragment "
            r1.append(r0)
            r1.append(r2)
            goto L_0x00be
        L_0x00db:
            r0.A0s(r1, r5, r6)
            return
        L_0x00df:
            int r1 = r8.A00
            android.content.Intent r0 = r8.A01
            r2.A1N(r3, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18620tS.BQj(java.lang.Object):void");
    }
}
