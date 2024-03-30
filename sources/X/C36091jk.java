package X;

import android.os.Handler;

/* renamed from: X.1jk  reason: invalid class name and case insensitive filesystem */
public class C36091jk implements Handler.Callback {
    public Object A00;
    public final int A01;

    public C36091jk(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0065, code lost:
        if (r4 != null) goto L_0x0067;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean handleMessage(android.os.Message r8) {
        /*
            r7 = this;
            int r0 = r7.A01
            switch(r0) {
                case 0: goto L_0x0017;
                case 1: goto L_0x002f;
                case 2: goto L_0x0082;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r1 = r7.A00
            com.whatsapp.search.SearchViewModel r1 = (com.whatsapp.search.SearchViewModel) r1
            int r0 = r8.what
            if (r0 != 0) goto L_0x0080
            X.1Rt r0 = new X.1Rt
            r0.<init>()
            com.whatsapp.search.SearchViewModel.A04(r0, r1)
        L_0x0015:
            r0 = 1
            return r0
        L_0x0017:
            java.lang.Object r3 = r7.A00
            com.whatsapp.HomeActivity r3 = (com.whatsapp.HomeActivity) r3
            int r0 = r8.what
            if (r0 != 0) goto L_0x0015
            com.whatsapp.HomeActivity.A0w(r3)
            X.17Y r2 = r3.A05
            r1 = 32
            X.1j1 r0 = new X.1j1
            r0.<init>((com.whatsapp.HomeActivity) r3, (int) r1)
            r2.A0H(r0)
            goto L_0x0015
        L_0x002f:
            java.lang.Object r1 = r7.A00
            X.1RO r1 = (X.AnonymousClass1RO) r1
            r6 = 0
            X.AnonymousClass00C.A0D(r1, r6)
            r0 = 1
            X.AnonymousClass00C.A0D(r8, r0)
            X.C18740tg.A01()
            java.lang.Object r5 = r8.obj
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.inflater.WaAsyncInflateRequest"
            X.AnonymousClass00C.A0E(r5, r0)
            X.1RT r5 = (X.AnonymousClass1RT) r5
            android.view.View r4 = r5.A01
            if (r4 != 0) goto L_0x0067
            java.lang.String r0 = "Couldn't async inflate the view, will proceed with the inflation on the main thread"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            X.00T r0 = r1.A01
            java.lang.Object r2 = r0.getValue()
            X.AnonymousClass00C.A08(r2)
            android.view.LayoutInflater r2 = (android.view.LayoutInflater) r2
            int r1 = r5.A00
            android.view.ViewGroup r0 = r5.A02
            android.view.View r4 = r2.inflate(r1, r0, r6)
            r5.A01 = r4
            if (r4 == 0) goto L_0x0074
        L_0x0067:
            X.1RR r3 = r5.A03
            if (r3 == 0) goto L_0x0074
            int r2 = r5.A00
            java.lang.String r1 = r5.A05
            android.view.ViewGroup r0 = r5.A02
            r3.BZA(r4, r0, r1, r2)
        L_0x0074:
            r0 = 0
            r5.A03 = r0
            r5.A04 = r0
            r5.A02 = r0
            r5.A00 = r6
            r5.A01 = r0
            goto L_0x0015
        L_0x0080:
            r0 = 0
            return r0
        L_0x0082:
            java.lang.Object r0 = r7.A00
            X.0y3 r0 = (X.C20720y3) r0
            boolean r0 = r0.A0I(r8)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C36091jk.handleMessage(android.os.Message):boolean");
    }
}
