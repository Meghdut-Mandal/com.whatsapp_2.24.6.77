package X;

import android.content.Context;

/* renamed from: X.3fE  reason: invalid class name and case insensitive filesystem */
public final class C70483fE implements C22928Aye {
    public final Context A00;
    public final AnonymousClass3OV A01;
    public final AnonymousClass1A5 A02;
    public final AnonymousClass147 A03;
    public final AnonymousClass2bI A04;

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0060  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List getCTAViews() {
        /*
            r14 = this;
            X.2bI r8 = r14.A04
            X.11F r1 = r8.A0J()
            r10 = 0
            if (r1 == 0) goto L_0x00da
            X.1A5 r0 = r14.A02
            X.141 r0 = r0.A01(r1)
            X.3IL r0 = r0.A0F
            boolean r2 = X.AnonymousClass000.A1V(r0)
        L_0x0015:
            r1 = 1
            java.lang.Object[] r0 = X.AnonymousClass001.A0M()
            if (r2 == 0) goto L_0x003e
            android.content.Context r5 = r14.A00
            X.2mj r4 = new X.2mj
            r4.<init>(r5)
            r3 = 44
            X.3YF r2 = new X.3YF
            r2.<init>(r4, r8, r3)
            r4.setOnClickListener(r2)
            r0[r10] = r4
            X.3OV r4 = r14.A01
            X.147 r6 = r14.A03
            r7 = 0
            r9 = 4
            X.2mh r5 = r4.A01(r5, r6, r7, r8, r9, r10)
        L_0x0039:
            java.util.List r0 = X.C36341k9.A0m(r5, r0, r1)
            return r0
        L_0x003e:
            android.content.Context r6 = r14.A00
            X.2mg r5 = new X.2mg
            r5.<init>(r6)
            X.3Qa r2 = r8.A1J
            X.11F r4 = r2.A00
            if (r4 != 0) goto L_0x00aa
            java.lang.String r2 = "SafetyToolsButton/bind Null chat jid"
            X.C18740tg.A0D(r10, r2)
        L_0x0050:
            com.whatsapp.util.Log.e((java.lang.String) r2)
        L_0x0053:
            r0[r10] = r5
            X.2mi r5 = new X.2mi
            r5.<init>(r6)
            X.147 r12 = X.C65533Sl.A01(r4)
            if (r12 == 0) goto L_0x0039
            android.app.Activity r4 = X.C36391kE.A0E(r5)
            X.014 r4 = (X.AnonymousClass014) r4
            X.4Nv r2 = r5.getViewModelFactory()
            X.3fM r2 = (X.C70563fM) r2
            X.1Qd r2 = r2.A00
            X.0tq r3 = r2.A01
            X.0wU r13 = X.C36341k9.A0Z(r3)
            X.12q r8 = X.C36351kA.A0a(r3)
            X.004 r2 = r3.A8e
            java.lang.Object r10 = r2.get()
            X.1YR r10 = (X.AnonymousClass1YR) r10
            X.1LV r7 = X.C36361kB.A0U(r3)
            X.1Op r11 = X.C36381kD.A0c(r3)
            X.17X r9 = X.C36351kA.A0b(r3)
            X.1uA r6 = new X.1uA
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)
            r5.A01 = r6
            java.lang.String r7 = "viewModel"
            X.00r r6 = r6.A00
            X.4Jk r3 = new X.4Jk
            r3.<init>(r5)
            r2 = 40
            X.C88554Td.A00(r4, r6, r3, r2)
            X.1uA r2 = r5.A01
            if (r2 != 0) goto L_0x00c2
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r7)
            throw r0
        L_0x00aa:
            X.147 r2 = X.C65533Sl.A01(r4)
            if (r2 != 0) goto L_0x00b8
            java.lang.String r2 = "SafetyToolsButton/Not group jid"
            X.C18740tg.A0D(r10, r2)
            java.lang.String r2 = "SafetyToolsButton/bind Not group jid"
            goto L_0x0050
        L_0x00b8:
            android.app.Activity r3 = X.C36391kE.A0E(r5)
            r2 = 10
            X.C66963Xz.A00(r5, r3, r2)
            goto L_0x0053
        L_0x00c2:
            X.00r r6 = r2.A01
            X.4Jl r3 = new X.4Jl
            r3.<init>(r5)
            r2 = 41
            X.C88554Td.A00(r4, r6, r3, r2)
            r3 = 43
            X.3YF r2 = new X.3YF
            r2.<init>(r5, r4, r3)
            r5.setOnClickListener(r2)
            goto L_0x0039
        L_0x00da:
            r2 = 0
            goto L_0x0015
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70483fE.getCTAViews():java.util.List");
    }

    public C70483fE(Context context, AnonymousClass3OV r2, AnonymousClass1A5 r3, AnonymousClass147 r4, AnonymousClass2bI r5) {
        C36321k7.A0x(r2, r3);
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = context;
        this.A04 = r5;
        this.A03 = r4;
    }
}
