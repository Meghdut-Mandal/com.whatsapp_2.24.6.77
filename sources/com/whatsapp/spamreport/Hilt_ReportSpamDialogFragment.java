package com.whatsapp.spamreport;

import X.C18800tq;
import X.C18830tt;
import X.C32541dn;
import X.C32581dr;
import X.C32881eL;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36371kC;
import X.C36391kE;
import X.C36431kI;
import X.C63633Ku;
import X.C74123l6;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.whatsapp.base.WaDialogFragment;

public abstract class Hilt_ReportSpamDialogFragment extends WaDialogFragment {
    public ContextWrapper A00;
    public boolean A01;
    public boolean A02 = false;

    private void A03() {
        if (this.A00 == null) {
            this.A00 = C36431kI.A11(super.A1D(), this);
            this.A01 = C32541dn.A00(super.A1D());
        }
    }

    public void A1h() {
        if (!this.A02) {
            this.A02 = true;
            ReportSpamDialogFragment reportSpamDialogFragment = (ReportSpamDialogFragment) this;
            C32581dr r4 = (C32581dr) C36391kE.A0T(this);
            C18800tq r2 = r4.A1K;
            C36321k7.A0f(r2, reportSpamDialogFragment);
            C18830tt r3 = r2.A00;
            C36371kC.A1J(r3, reportSpamDialogFragment);
            reportSpamDialogFragment.A01 = C36351kA.A0M(r2);
            reportSpamDialogFragment.A00 = C36391kE.A0V(r2);
            reportSpamDialogFragment.A0L = C36351kA.A0p(r3);
            reportSpamDialogFragment.A0G = C36351kA.A0h(r2);
            reportSpamDialogFragment.A09 = C36351kA.A0W(r2);
            reportSpamDialogFragment.A0C = C36351kA.A0a(r2);
            reportSpamDialogFragment.A0E = C36351kA.A0g(r2);
            reportSpamDialogFragment.A04 = C36341k9.A0R(r2);
            reportSpamDialogFragment.A0H = (C32881eL) r2.A4L.get();
            reportSpamDialogFragment.A0I = C32581dr.A0a(r4);
            reportSpamDialogFragment.A08 = C36351kA.A0U(r2);
            reportSpamDialogFragment.A05 = C36341k9.A0S(r2);
            reportSpamDialogFragment.A0K = C36351kA.A0n(r2);
            reportSpamDialogFragment.A0B = r2.A7B();
            reportSpamDialogFragment.A07 = (C63633Ku) r3.ACP.get();
            reportSpamDialogFragment.A0F = C32581dr.A0W(r4);
            reportSpamDialogFragment.A0A = C36351kA.A0Y(r2);
            reportSpamDialogFragment.A02 = C36361kB.A0U(r2);
            reportSpamDialogFragment.A06 = C36361kB.A0X(r3);
            reportSpamDialogFragment.A0D = C36351kA.A0b(r2);
            reportSpamDialogFragment.A03 = new C74123l6();
        }
    }

    public Context A1D() {
        if (super.A1D() == null && !this.A01) {
            return null;
        }
        A03();
        return this.A00;
    }

    public LayoutInflater A1E(Bundle bundle) {
        return C36331k8.A08(super.A1E(bundle), this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000c, code lost:
        if (r1 == r3) goto L_0x000e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A1F(android.app.Activity r3) {
        /*
            r2 = this;
            super.A1F(r3)
            android.content.ContextWrapper r0 = r2.A00
            if (r0 == 0) goto L_0x000e
            android.content.Context r1 = X.C32551do.A00(r0)
            r0 = 0
            if (r1 != r3) goto L_0x000f
        L_0x000e:
            r0 = 1
        L_0x000f:
            X.C36331k8.A1U(r0)
            r2.A03()
            r2.A1h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.spamreport.Hilt_ReportSpamDialogFragment.A1F(android.app.Activity):void");
    }

    public void A1O(Context context) {
        super.A1O(context);
        A03();
        A1h();
    }
}
