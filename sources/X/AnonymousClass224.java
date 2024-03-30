package X;

import android.app.Activity;
import com.whatsapp.R;

/* renamed from: X.224  reason: invalid class name */
public final class AnonymousClass224 extends C36541kT {
    public final C24801Dv A00;
    public final C20810yC A01;
    public final AnonymousClass3KE A02;
    public final C32681e1 A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass224(Activity activity, C24801Dv r8, C21060yb r9, C19970wo r10, C18820ts r11, C20810yC r12, AnonymousClass3KE r13, C32681e1 r14) {
        super(activity, r9, r10, r11, R.layout.f9nameremoved);
        C36321k7.A19(r10, r9, r11, r12);
        C36321k7.A10(r14, r8);
        this.A01 = r12;
        this.A03 = r14;
        this.A00 = r8;
        this.A02 = r13;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0026, code lost:
        if (r11.length() == 0) goto L_0x0028;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r13) {
        /*
            r12 = this;
            super.onCreate(r13)
            X.3KE r0 = r12.A02
            java.lang.String r11 = r0.A03
            java.lang.String r9 = r0.A00
            boolean r8 = r0.A04
            java.lang.String r5 = r0.A02
            java.lang.String r4 = r0.A01
            r0 = 2131434163(0x7f0b1ab3, float:1.8490132E38)
            android.view.View r6 = X.AnonymousClass0PN.A00(r12, r0)
            java.lang.String r2 = "null cannot be cast to non-null type com.whatsapp.WaTextView"
            X.AnonymousClass00C.A0E(r6, r2)
            android.widget.TextView r6 = (android.widget.TextView) r6
            r10 = 0
            r7 = 1
            if (r11 == 0) goto L_0x0028
            int r1 = r11.length()
            r0 = 0
            if (r1 != 0) goto L_0x0029
        L_0x0028:
            r0 = 1
        L_0x0029:
            r3 = 8
            if (r0 == 0) goto L_0x00fb
            r6.setVisibility(r3)
        L_0x0030:
            r0 = 2131434161(0x7f0b1ab1, float:1.8490128E38)
            android.view.View r6 = X.AnonymousClass0PN.A00(r12, r0)
            X.AnonymousClass00C.A0E(r6, r2)
            android.widget.TextView r6 = (android.widget.TextView) r6
            if (r9 == 0) goto L_0x00f6
            int r0 = r9.length()
            if (r0 == 0) goto L_0x00f6
            X.1e1 r1 = r12.A03
            android.content.Context r0 = r6.getContext()
            android.text.SpannableString r0 = r1.A00(r0, r9)
            X.C36431kI.A1M(r6, r0)
            android.text.method.LinkMovementMethod r0 = new android.text.method.LinkMovementMethod
            r0.<init>()
            r6.setMovementMethod(r0)
            X.0yb r0 = r12.A01
            X.C36371kC.A1I(r6, r0)
        L_0x005e:
            if (r8 == 0) goto L_0x00a2
            r0 = 2131429339(0x7f0b07db, float:1.8480348E38)
            X.C36411kG.A17(r12, r0, r3)
        L_0x0066:
            r0 = 2131429689(0x7f0b0939, float:1.8481058E38)
            android.view.View r2 = X.AnonymousClass0PN.A00(r12, r0)
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.wds.components.button.WDSButton"
            X.AnonymousClass00C.A0E(r2, r0)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r2.setText(r5)
            r0 = 20
            X.9v1 r1 = new X.9v1
            r1.<init>(r0, r4, r12)
            r2.setOnClickListener(r1)
            r0 = 2131434967(0x7f0b1dd7, float:1.8491763E38)
            android.view.View r0 = X.AnonymousClass0PN.A00(r12, r0)
            r0.setOnClickListener(r1)
            r0 = 2131427960(0x7f0b0278, float:1.847755E38)
            X.C36411kG.A17(r12, r0, r3)
            r0 = 2131427959(0x7f0b0277, float:1.8477549E38)
            X.C36411kG.A17(r12, r0, r3)
            r1 = 18
            X.4XV r0 = new X.4XV
            r0.<init>(r12, r1)
            r12.setOnCancelListener(r0)
            return
        L_0x00a2:
            X.0ts r0 = r12.A02
            java.util.Locale r1 = X.C36401kF.A0x(r0)
            r0 = 2
            java.text.DateFormat r9 = java.text.DateFormat.getDateInstance(r0, r1)
            android.app.Activity r8 = r12.A00
            r6 = 2131894451(0x7f1220b3, float:1.9423707E38)
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.util.Date r0 = new java.util.Date
            r0.<init>()
            java.lang.String r0 = r9.format(r0)
            r1[r10] = r0
            r0 = 2131896687(0x7f12296f, float:1.9428242E38)
            java.lang.String r8 = X.C36341k9.A0e(r8, r1, r0, r7, r6)
            X.AnonymousClass00C.A08(r8)
            r0 = 2131429339(0x7f0b07db, float:1.8480348E38)
            android.view.View r7 = X.AnonymousClass0PN.A00(r12, r0)
            X.AnonymousClass00C.A0E(r7, r2)
            android.widget.TextView r7 = (android.widget.TextView) r7
            X.1e1 r6 = r12.A03
            android.content.Context r2 = r7.getContext()
            r0 = 46
            X.3wX r1 = X.C81143wX.A00(r12, r0)
            java.lang.String r0 = "date-settings"
            android.text.SpannableStringBuilder r0 = r6.A02(r2, r1, r8, r0)
            r7.setText(r0)
            X.0yC r0 = r12.A01
            X.C36331k8.A10(r7, r0)
            X.0yb r0 = r12.A01
            X.C36371kC.A1I(r7, r0)
            goto L_0x0066
        L_0x00f6:
            r6.setVisibility(r3)
            goto L_0x005e
        L_0x00fb:
            r6.setText(r11)
            goto L_0x0030
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass224.onCreate(android.os.Bundle):void");
    }
}
