package X;

/* renamed from: X.6H0  reason: invalid class name */
public abstract class AnonymousClass6H0 {
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0020, code lost:
        if ((r7 & 6) == 4) goto L_0x0022;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(androidx.compose.foundation.lazy.LazyListState r3, X.C161337ma r4, X.AnonymousClass1JI r5, int r6, int r7) {
        /*
            r0 = 0
            X.C36321k7.A0v(r3, r0, r5)
            r0 = 960037695(0x3939033f, float:1.7644184E-4)
            r4.Bun(r0)
            r0 = 456600914(0x1b372d52, float:1.5152049E-22)
            r4.Bum(r0)
            r0 = r7 & 14
            r0 = r0 ^ 6
            r2 = 4
            if (r0 <= r2) goto L_0x001d
            boolean r0 = r4.B2f(r3)
            if (r0 != 0) goto L_0x0022
        L_0x001d:
            r1 = r7 & 6
            r0 = 0
            if (r1 != r2) goto L_0x0023
        L_0x0022:
            r0 = 1
        L_0x0023:
            java.lang.Object r1 = r4.BnZ()
            if (r0 != 0) goto L_0x002d
            java.lang.Object r0 = X.C129736Ig.A00
            if (r1 != r0) goto L_0x0038
        L_0x002d:
            X.6sI r1 = new X.6sI
            r1.<init>(r3)
            r0 = r4
            X.6fF r0 = (X.C136916fF) r0
            r0.A0R(r1)
        L_0x0038:
            X.7ck r1 = (X.C157307ck) r1
            X.C136916fF.A0N(r4)
            r0 = r7 & 112(0x70, float:1.57E-43)
            r0 = r0 | 512(0x200, float:7.175E-43)
            A01(r4, r1, r5, r6, r0)
            X.6fO r1 = r4.B6Z()
            if (r1 == 0) goto L_0x0051
            X.7Yl r0 = new X.7Yl
            r0.<init>(r3, r5, r6, r7)
            r1.A06 = r0
        L_0x0051:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6H0.A00(androidx.compose.foundation.lazy.LazyListState, X.7ma, X.1JI, int, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x003a, code lost:
        if ((r10 & 48) == 32) goto L_0x003c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(X.C161337ma r6, X.C157307ck r7, X.AnonymousClass1JI r8, int r9, int r10) {
        /*
            r0 = 38618290(0x24d44b2, float:1.5080736E-37)
            r6.Bun(r0)
            X.4gm r0 = X.C131966Ro.A01
            r4 = r6
            X.6fF r4 = (X.C136916fF) r4
            java.lang.Object r3 = X.AnonymousClass6G0.A01(r4, r0)
            android.content.Context r3 = (android.content.Context) r3
            r0 = 0
            X.AnonymousClass00C.A0D(r3, r0)
        L_0x0015:
            boolean r0 = r3 instanceof android.content.ContextWrapper
            if (r0 == 0) goto L_0x007a
            boolean r0 = r3 instanceof android.app.Activity
            if (r0 == 0) goto L_0x0070
            android.app.Activity r3 = (android.app.Activity) r3
            r0 = 456601423(0x1b372f4f, float:1.5152691E-22)
            r6.Bum(r0)
            boolean r5 = r6.B2f(r3)
            r0 = r10 & 112(0x70, float:1.57E-43)
            r0 = r0 ^ 48
            r2 = 32
            if (r0 <= r2) goto L_0x0037
            boolean r0 = r6.B2d(r9)
            if (r0 != 0) goto L_0x003c
        L_0x0037:
            r1 = r10 & 48
            r0 = 0
            if (r1 != r2) goto L_0x003d
        L_0x003c:
            r0 = 1
        L_0x003d:
            r5 = r5 | r0
            java.lang.Object r2 = r6.BnZ()
            if (r5 != 0) goto L_0x0048
            java.lang.Object r0 = X.C129736Ig.A00
            if (r2 != r0) goto L_0x0053
        L_0x0048:
            r8.A01(r3)
            X.34D r2 = new X.34D
            r2.<init>(r8, r9)
            r6.Bwv(r2)
        L_0x0053:
            X.34D r2 = (X.AnonymousClass34D) r2
            r0 = 0
            X.C136916fF.A0M(r4, r0)
            r1 = 0
            com.whatsapp.contact.picker.invite.compose.perf.scroll.DropFrameWatcherKt$DropFrameWatcher$3 r0 = new com.whatsapp.contact.picker.invite.compose.perf.scroll.DropFrameWatcherKt$DropFrameWatcher$3
            r0.<init>(r3, r7, r2, r1)
            X.C132846Vm.A03(r6, r7, r0)
            X.6fO r1 = r6.B6Z()
            if (r1 == 0) goto L_0x006f
            X.7Ym r0 = new X.7Ym
            r0.<init>(r7, r8, r9, r10)
            r1.A06 = r0
        L_0x006f:
            return
        L_0x0070:
            android.content.ContextWrapper r3 = (android.content.ContextWrapper) r3
            android.content.Context r3 = r3.getBaseContext()
            X.AnonymousClass00C.A08(r3)
            goto L_0x0015
        L_0x007a:
            java.lang.String r0 = "no activity"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6H0.A01(X.7ma, X.7ck, X.1JI, int, int):void");
    }
}
