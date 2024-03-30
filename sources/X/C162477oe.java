package X;

/* renamed from: X.7oe  reason: invalid class name and case insensitive filesystem */
public class C162477oe extends AnonymousClass0UK {
    public Object A00;
    public Object A01;
    public final int A02;

    public C162477oe(Object obj, Object obj2, int i) {
        this.A02 = i;
        this.A01 = obj2;
        this.A00 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00b6, code lost:
        r0 = r6.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00d5, code lost:
        return ((androidx.recyclerview.widget.GridLayoutManager) r0).A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001b, code lost:
        if (r2 == 0) goto L_0x001d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001d, code lost:
        return r5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A00(int r7) {
        /*
            r6 = this;
            int r0 = r6.A02
            switch(r0) {
                case 0: goto L_0x00b9;
                case 1: goto L_0x0005;
                case 2: goto L_0x0005;
                case 3: goto L_0x001e;
                case 4: goto L_0x004c;
                case 5: goto L_0x0072;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r6.A01
            com.whatsapp.expressionstray.avatars.AvatarExpressionsFragment r0 = (com.whatsapp.expressionstray.avatars.AvatarExpressionsFragment) r0
            X.4mM r0 = r0.A0D
            if (r0 == 0) goto L_0x00b6
            int r2 = r0.getItemViewType(r7)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            r0 = 2
            r5 = 1
            if (r1 == 0) goto L_0x00b6
            if (r2 == r0) goto L_0x001d
            if (r2 != 0) goto L_0x00b6
        L_0x001d:
            return r5
        L_0x001e:
            java.lang.Object r0 = r6.A00
            androidx.recyclerview.widget.RecyclerView r0 = (androidx.recyclerview.widget.RecyclerView) r0
            X.0CZ r0 = r0.A0G
            if (r0 == 0) goto L_0x004a
            int r0 = r0.getItemViewType(r7)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x002e:
            r5 = 1
            if (r0 == 0) goto L_0x001d
            int r0 = r0.intValue()
            if (r0 == 0) goto L_0x001d
            if (r0 != r5) goto L_0x001d
            java.lang.Object r0 = r6.A01
            X.02E r0 = (X.AnonymousClass02E) r0
            android.content.Context r0 = r0.A0a()
            int r0 = X.C36341k9.A04(r0)
            r5 = 2
            if (r0 != r5) goto L_0x001d
            r5 = 4
            return r5
        L_0x004a:
            r0 = 0
            goto L_0x002e
        L_0x004c:
            java.lang.Object r0 = r6.A01
            com.whatsapp.expressionstray.stickers.StickerExpressionsFragment r0 = (com.whatsapp.expressionstray.stickers.StickerExpressionsFragment) r0
            X.4mM r0 = r0.A0D
            if (r0 == 0) goto L_0x00b6
            int r2 = r0.getItemViewType(r7)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            r0 = 2
            r5 = 1
            if (r1 == 0) goto L_0x00b6
            if (r2 == r0) goto L_0x001d
            if (r2 == 0) goto L_0x001d
            r0 = 6
            if (r2 == r0) goto L_0x001d
            r0 = 7
            if (r2 == r0) goto L_0x001d
            r0 = 4
            if (r2 == r0) goto L_0x001d
            r0 = 9
            if (r2 != r0) goto L_0x00b6
            return r5
        L_0x0072:
            java.lang.Object r1 = r6.A01
            com.whatsapp.search.SearchGridLayoutManager r1 = (com.whatsapp.search.SearchGridLayoutManager) r1
            java.lang.Object r0 = r6.A00
            android.content.Context r0 = (android.content.Context) r0
            int r4 = X.C36341k9.A04(r0)
            X.0CZ r0 = r1.A00
            int r3 = r0.getItemViewType(r7)
            r2 = -1
            r5 = 3
            r0 = 2
            r1 = 1
            if (r3 == r2) goto L_0x00b4
            if (r3 == r1) goto L_0x00b4
            if (r3 == r0) goto L_0x00b4
            if (r3 == r5) goto L_0x00b4
            r0 = 4
            if (r3 == r0) goto L_0x00b4
            r0 = 99
            if (r3 == r0) goto L_0x00b4
            r0 = 100
            if (r3 == r0) goto L_0x00b4
            switch(r3) {
                case 6: goto L_0x00b4;
                case 7: goto L_0x00b4;
                case 8: goto L_0x00ad;
                case 9: goto L_0x00b0;
                case 10: goto L_0x00b0;
                case 11: goto L_0x00b4;
                case 12: goto L_0x00b4;
                case 13: goto L_0x00b4;
                case 14: goto L_0x00b4;
                case 15: goto L_0x00b4;
                case 16: goto L_0x00b4;
                case 17: goto L_0x00b4;
                case 18: goto L_0x00b4;
                case 19: goto L_0x00b4;
                case 20: goto L_0x00b4;
                case 21: goto L_0x00b4;
                case 22: goto L_0x00b4;
                case 23: goto L_0x00b4;
                case 24: goto L_0x00b4;
                case 25: goto L_0x00b4;
                case 26: goto L_0x00b4;
                case 27: goto L_0x00b4;
                case 28: goto L_0x00b4;
                case 29: goto L_0x00b4;
                case 30: goto L_0x00b4;
                case 31: goto L_0x00b4;
                case 32: goto L_0x00b4;
                case 33: goto L_0x00b4;
                case 34: goto L_0x00b4;
                case 35: goto L_0x00b4;
                case 36: goto L_0x00b4;
                case 37: goto L_0x00b4;
                case 38: goto L_0x00b4;
                case 39: goto L_0x00b4;
                case 40: goto L_0x00b4;
                case 41: goto L_0x00b4;
                case 42: goto L_0x00b4;
                case 43: goto L_0x00b4;
                case 44: goto L_0x00b4;
                case 45: goto L_0x00b4;
                case 46: goto L_0x00b4;
                default: goto L_0x009e;
            }
        L_0x009e:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Invalid viewType: "
            java.lang.String r0 = X.AnonymousClass000.A0r(r0, r1, r3)
            java.lang.UnsupportedOperationException r0 = X.AnonymousClass001.A0E(r0)
            throw r0
        L_0x00ad:
            if (r4 != r1) goto L_0x00b2
            return r5
        L_0x00b0:
            if (r4 != r1) goto L_0x00d6
        L_0x00b2:
            r5 = 2
            return r5
        L_0x00b4:
            r5 = 6
            return r5
        L_0x00b6:
            java.lang.Object r0 = r6.A00
            goto L_0x00d1
        L_0x00b9:
            java.lang.Object r0 = r6.A00
            androidx.recyclerview.widget.RecyclerView r0 = (androidx.recyclerview.widget.RecyclerView) r0
            X.0CZ r0 = r0.A0G
            X.4mm r0 = (X.C96094mm) r0
            long r3 = X.C96094mm.A00(r0, r7)
            r1 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r3 = r3 & r1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x00d6
            java.lang.Object r0 = r6.A01
        L_0x00d1:
            androidx.recyclerview.widget.GridLayoutManager r0 = (androidx.recyclerview.widget.GridLayoutManager) r0
            int r5 = r0.A01
            return r5
        L_0x00d6:
            r5 = 1
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C162477oe.A00(int):int");
    }
}
