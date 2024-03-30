package X;

import java.lang.ref.WeakReference;

/* renamed from: X.715  reason: invalid class name */
public final class AnonymousClass715 implements C158697hv {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass6WF A01;
    public final /* synthetic */ C23871Ae A02;
    public final /* synthetic */ AnonymousClass1HC A03;
    public final /* synthetic */ WeakReference A04;
    public final /* synthetic */ boolean A05;

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x007d, code lost:
        if ((r0 instanceof java.io.IOException) != false) goto L_0x007f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BU1(X.C111855cx r11) {
        /*
            r10 = this;
            r6 = 0
            X.6WF r5 = r10.A01
            java.lang.ref.WeakReference r0 = r10.A04
            X.14u r8 = X.AnonymousClass6WF.A00(r0)
            if (r8 != 0) goto L_0x0016
            java.lang.String r0 = "Unable to obtain Activity reference."
            com.whatsapp.util.Log.e((java.lang.String) r0)
            java.util.concurrent.atomic.AtomicBoolean r0 = r5.A02
            r0.set(r6)
            return
        L_0x0016:
            X.1HC r4 = r10.A03
            int r3 = r10.A00
            X.5IX r1 = X.AnonymousClass5IX.A00
            java.lang.String r0 = A00(r11)
            r4.A05(r1, r0, r3)
            java.lang.String r0 = "editor_callback"
            r4.A01(r3, r0)
            boolean r2 = r11 instanceof X.C107345Ns
            if (r2 == 0) goto L_0x005d
            X.5l6 r1 = r5.A00
            java.lang.String r0 = "com.bloks.www.avatar.editor.cds.launcher.async"
            r1.A00 = r0
            java.util.concurrent.atomic.AtomicLong r7 = r5.A03
            X.0wo r0 = r5.A01
            long r0 = X.C19970wo.A00(r0)
            r7.set(r0)
            r8.Bnv()
            X.1Ae r8 = r10.A02
            r7 = 0
            boolean r1 = r10.A05
            r0 = 2
            r8.A05(r7, r7, r0, r1)
            r0 = 4
            r8.A04(r7, r7, r0, r1)
        L_0x004d:
            java.util.concurrent.atomic.AtomicBoolean r0 = r5.A02
            r0.set(r6)
            if (r2 == 0) goto L_0x005a
            X.2pF r0 = X.C52322pF.SUCCESS
        L_0x0056:
            r4.A02(r0, r3)
            return
        L_0x005a:
            X.2pF r0 = X.C52322pF.FAIL
            goto L_0x0056
        L_0x005d:
            X.1Ae r7 = r10.A02
            boolean r1 = r10.A05
            r8.Bnv()
            X.AnonymousClass6WF.A02(r8, r11)
            X.5Nr r0 = X.C107335Nr.A00
            boolean r0 = r11.equals(r0)
            r8 = 0
            if (r0 != 0) goto L_0x009e
            boolean r0 = r11 instanceof X.C107315Np
            if (r0 == 0) goto L_0x008c
            r0 = r11
            X.5Np r0 = (X.C107315Np) r0
            X.5vX r0 = r0.A00
            java.lang.Exception r0 = r0.A02
        L_0x007b:
            boolean r0 = r0 instanceof java.io.IOException
            if (r0 == 0) goto L_0x009e
        L_0x007f:
            java.lang.Integer r9 = java.lang.Integer.valueOf(r8)
            java.lang.String r8 = A00(r11)
            r0 = 3
            r7.A05(r9, r8, r0, r1)
            goto L_0x004d
        L_0x008c:
            X.5Ns r0 = X.C107345Ns.A00
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x00a5
            boolean r0 = r11 instanceof X.C107325Nq
            if (r0 == 0) goto L_0x00a0
            r0 = r11
            X.5Nq r0 = (X.C107325Nq) r0
            java.lang.Exception r0 = r0.A00
            goto L_0x007b
        L_0x009e:
            r8 = 1
            goto L_0x007f
        L_0x00a0:
            X.0jS r0 = X.C36441kJ.A18()
            throw r0
        L_0x00a5:
            java.lang.String r0 = "Success type should not be converted to error type."
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass715.BU1(X.5cx):void");
    }

    public AnonymousClass715(AnonymousClass6WF r1, C23871Ae r2, AnonymousClass1HC r3, WeakReference weakReference, int i, boolean z) {
        this.A01 = r1;
        this.A04 = weakReference;
        this.A03 = r3;
        this.A00 = i;
        this.A02 = r2;
        this.A05 = z;
    }

    public static final String A00(C111855cx r2) {
        String str;
        if (r2.equals(C107335Nr.A00)) {
            return "activity_no_longer_active";
        }
        if (r2.equals(C107345Ns.A00)) {
            return "success";
        }
        if (r2 instanceof C107315Np) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("bk_layout_data_error (");
            Exception exc = ((C107315Np) r2).A00.A02;
            if (exc == null || (str = exc.getMessage()) == null) {
                str = "no exception attached";
            }
            return C36321k7.A0E(str, A0u);
        } else if (r2 instanceof C107325Nq) {
            return "unknown_error";
        } else {
            throw C36441kJ.A18();
        }
    }
}
