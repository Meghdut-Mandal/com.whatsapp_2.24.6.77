package com.whatsapp.payments.ui;

import X.AE0;
import X.AEA;
import X.AF7;
import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass16T;
import X.AnonymousClass17Y;
import X.AnonymousClass19A;
import X.AnonymousClass8gQ;
import X.AnonymousClass8gR;
import X.AnonymousClass9DW;
import X.B7Z;
import X.B9J;
import X.BA9;
import X.C135086c7;
import X.C146356vT;
import X.C165567td;
import X.C165577te;
import X.C165587tf;
import X.C165617ti;
import X.C167557yG;
import X.C173858Tk;
import X.C175748az;
import X.C175818b6;
import X.C179108jC;
import X.C18800tq;
import X.C18830tt;
import X.C195479Ul;
import X.C202059ky;
import X.C202269lR;
import X.C207249un;
import X.C24611Dc;
import X.C27111My;
import X.C29121Vk;
import X.C29131Vl;
import X.C29221Vu;
import X.C36321k7;
import X.C36351kA;
import android.os.Bundle;
import android.text.TextUtils;
import com.whatsapp.R;

public class IndiaUpiCheckBalanceActivity extends C179108jC {
    public AnonymousClass9DW A00;
    public C175748az A01;
    public AnonymousClass16T A02;
    public C135086c7 A03;
    public C167557yG A04;
    public boolean A05;
    public final C24611Dc A06;

    public static void A0z(IndiaUpiCheckBalanceActivity indiaUpiCheckBalanceActivity, String str) {
        C175748az r1 = indiaUpiCheckBalanceActivity.A01;
        indiaUpiCheckBalanceActivity.A4H((C175818b6) r1.A08, str, r1.A0B, (String) indiaUpiCheckBalanceActivity.A03.A00, (String) C207249un.A06(r1), 4);
    }

    public void A2F() {
        if (!this.A05) {
            this.A05 = true;
            C27111My A0L = C36351kA.A0L(this);
            C18800tq r2 = A0L.A5g;
            C165567td.A11(r2, this);
            C18830tt r1 = r2.A00;
            C165567td.A0v(r2, r1, this, C36321k7.A05(r2, r1, this));
            C173858Tk.A0h(A0L, r2, r1, this);
            C173858Tk.A0i(A0L, r2, r1, this, C165577te.A0f(r2));
            C173858Tk.A0q(r2, r1, this);
            C173858Tk.A0p(r2, r1, this);
            C173858Tk.A0k(A0L, r2, r1, this);
            this.A02 = C165587tf.A0Q(r2);
            this.A00 = (AnonymousClass9DW) A0L.A2o.get();
        }
    }

    public void BgO(C202059ky r3) {
        throw AnonymousClass001.A0E(this.A06.A03("onSetPin unsupported"));
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.A01 = (C175748az) C173858Tk.A07(this);
        AnonymousClass17Y r5 = this.A05;
        AnonymousClass19A r6 = this.A0H;
        C29131Vl r15 = this.A0D;
        C202269lR r7 = this.A0L;
        C29121Vk r10 = this.A0M;
        C195479Ul r11 = this.A06;
        AF7 af7 = this.A0S;
        C29221Vu r9 = this.A0K;
        AE0 ae0 = this.A0M;
        this.A08 = new AnonymousClass8gR(this, r5, r6, r7, ae0, r9, r10, r11, this, af7, this.A0V, r15);
        this.A03 = C165617ti.A0P(C146356vT.A00(), String.class, A3t(ae0.A0A()), "upiSequenceNumber");
        AnonymousClass17Y r52 = this.A05;
        AnonymousClass19A r72 = this.A0H;
        C29131Vl r12 = this.A0D;
        C167557yG r2 = (C167557yG) C165617ti.A0A(new B9J(new AnonymousClass8gQ(this, r52, this.A02, r72, this.A0L, this.A0K, this.A0M, this.A06, r12), this, 1), this).A00(C167557yG.class);
        this.A04 = r2;
        r2.A01.A08(this, new BA9(this, 21));
        C167557yG r22 = this.A04;
        r22.A07.A08(this, new BA9(this, 20));
        A3G(getString(R.string.f12nameremoved));
        this.A08.A02();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0048, code lost:
        return A49(new X.AVX(r10, r0), r5, r6, r7, r8, r9);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.app.Dialog onCreateDialog(int r11) {
        /*
            r10 = this;
            r0 = 27
            r3 = r10
            r7 = r11
            if (r11 == r0) goto L_0x0050
            r0 = 28
            if (r11 == r0) goto L_0x0049
            switch(r11) {
                case 10: goto L_0x0029;
                case 11: goto L_0x0049;
                case 12: goto L_0x0012;
                default: goto L_0x000d;
            }
        L_0x000d:
            android.app.Dialog r0 = super.onCreateDialog(r11)
            return r0
        L_0x0012:
            r0 = 2131895302(0x7f122406, float:1.9425433E38)
            java.lang.String r5 = r10.getString(r0)
            r0 = 2131895301(0x7f122405, float:1.9425431E38)
            java.lang.String r6 = r10.getString(r0)
            r8 = 2131896681(0x7f122969, float:1.942823E38)
            r9 = 2131891806(0x7f12165e, float:1.9418342E38)
            r0 = 48
            goto L_0x003f
        L_0x0029:
            r0 = 2131895300(0x7f122404, float:1.942543E38)
            java.lang.String r5 = r10.getString(r0)
            r0 = 2131895299(0x7f122403, float:1.9425427E38)
            java.lang.String r6 = r10.getString(r0)
            r8 = 2131892706(0x7f1219e2, float:1.9420168E38)
            r9 = 2131896389(0x7f122845, float:1.9427638E38)
            r0 = 47
        L_0x003f:
            X.AVX r4 = new X.AVX
            r4.<init>(r10, r0)
            X.0FM r0 = r3.A49(r4, r5, r6, r7, r8, r9)
            return r0
        L_0x0049:
            X.8az r0 = r10.A01
            android.app.Dialog r0 = r10.A47(r0, r11)
            return r0
        L_0x0050:
            X.1qm r2 = X.AnonymousClass3LW.A00(r10)
            r0 = 2131887857(0x7f1206f1, float:1.9410333E38)
            r2.A0c(r0)
            r0 = 2131887858(0x7f1206f2, float:1.9410335E38)
            r2.A0d(r0)
            r1 = 2131891806(0x7f12165e, float:1.9418342E38)
            r0 = 36
            X.B83.A01(r2, r10, r0, r1)
            X.0FM r0 = r2.create()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.IndiaUpiCheckBalanceActivity.onCreateDialog(int):android.app.Dialog");
    }

    public IndiaUpiCheckBalanceActivity(int i) {
        this.A05 = false;
        B7Z.A00(this, 9);
    }

    public void BZk(C202059ky r4, String str) {
        if (!TextUtils.isEmpty(str)) {
            this.A06.A06("onListKeys called");
            A0z(this, str);
        } else if (r4 != null && !AEA.A02(this, "upi-list-keys", r4.A00, false)) {
            if (this.A04.A05("upi-list-keys")) {
                C173858Tk.A0w(this);
                return;
            }
            C24611Dc r2 = this.A06;
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append(C173858Tk.A0I(str, A0u));
            C165567td.A18(r2, " failed; ; showErrorAndFinish", A0u);
            A4D();
        }
    }

    public IndiaUpiCheckBalanceActivity() {
        this(0);
        this.A06 = C165587tf.A0X("IndiaUpiCheckPinActivity");
    }
}
