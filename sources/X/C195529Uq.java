package X;

import java.lang.ref.WeakReference;

/* renamed from: X.9Uq  reason: invalid class name and case insensitive filesystem */
public abstract class C195529Uq {
    public void A00() {
        WeakReference weakReference = ((C166487w0) this).A00;
        if (weakReference.get() != null && ((C167717yg) weakReference.get()).A0I) {
            C167717yg r2 = (C167717yg) weakReference.get();
            C001700s r1 = r2.A0D;
            if (r1 == null) {
                r1 = C36431kI.A0S();
                r2.A0D = r1;
            }
            C167717yg.A01(r1, true);
        }
    }

    public void A01(int i, CharSequence charSequence) {
        WeakReference weakReference = ((C166487w0) this).A00;
        if (weakReference.get() != null && !((C167717yg) weakReference.get()).A0J && ((C167717yg) weakReference.get()).A0I) {
            C167717yg r2 = (C167717yg) weakReference.get();
            C195249Th r1 = new C195249Th(i, charSequence);
            C001700s r0 = r2.A08;
            if (r0 == null) {
                r0 = C36431kI.A0S();
                r2.A08 = r0;
            }
            C167717yg.A01(r0, r1);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002f, code lost:
        if ((r1 & 32768) != 0) goto L_0x0031;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A02(X.AnonymousClass9G0 r5) {
        /*
            r4 = this;
            r0 = r4
            X.7w0 r0 = (X.C166487w0) r0
            java.lang.ref.WeakReference r3 = r0.A00
            java.lang.Object r0 = r3.get()
            if (r0 == 0) goto L_0x004a
            java.lang.Object r0 = r3.get()
            X.7yg r0 = (X.C167717yg) r0
            boolean r0 = r0.A0I
            if (r0 == 0) goto L_0x004a
            int r1 = r5.A00
            r0 = -1
            if (r1 != r0) goto L_0x0037
            X.6Uo r2 = r5.A01
            java.lang.Object r0 = r3.get()
            X.7yg r0 = (X.C167717yg) r0
            int r1 = r0.A0S()
            r0 = r1 & 32767(0x7fff, float:4.5916E-41)
            if (r0 == 0) goto L_0x0031
            r0 = 32768(0x8000, float:4.5918E-41)
            r1 = r1 & r0
            r0 = 2
            if (r1 == 0) goto L_0x0032
        L_0x0031:
            r0 = -1
        L_0x0032:
            X.9G0 r5 = new X.9G0
            r5.<init>(r2, r0)
        L_0x0037:
            java.lang.Object r1 = r3.get()
            X.7yg r1 = (X.C167717yg) r1
            X.00s r0 = r1.A0A
            if (r0 != 0) goto L_0x0047
            X.00s r0 = X.C36431kI.A0S()
            r1.A0A = r0
        L_0x0047:
            X.C167717yg.A01(r0, r5)
        L_0x004a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C195529Uq.A02(X.9G0):void");
    }
}
