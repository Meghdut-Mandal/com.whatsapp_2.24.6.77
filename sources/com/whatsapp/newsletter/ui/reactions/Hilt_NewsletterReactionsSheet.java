package com.whatsapp.newsletter.ui.reactions;

import X.AnonymousClass1GQ;
import X.AnonymousClass3ET;
import X.C165577te;
import X.C18800tq;
import X.C18830tt;
import X.C191619Dr;
import X.C32541dn;
import X.C32571dq;
import X.C32581dr;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36431kI;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.whatsapp.wds.components.bottomsheet.WDSBottomSheetDialogFragment;

public abstract class Hilt_NewsletterReactionsSheet extends WDSBottomSheetDialogFragment {
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
            NewsletterReactionsSheet newsletterReactionsSheet = (NewsletterReactionsSheet) this;
            C32581dr r4 = (C32581dr) ((C32571dq) generatedComponent());
            C18800tq r2 = r4.A1K;
            C18830tt r1 = r2.A00;
            C36361kB.A1E(r1, newsletterReactionsSheet);
            newsletterReactionsSheet.A06 = C36341k9.A0S(r2);
            newsletterReactionsSheet.A03 = C36351kA.A0J(r2);
            newsletterReactionsSheet.A08 = C36341k9.A0T(r2);
            newsletterReactionsSheet.A04 = (C191619Dr) r4.A0j.get();
            newsletterReactionsSheet.A0A = (AnonymousClass3ET) r1.A4m.get();
            newsletterReactionsSheet.A09 = (AnonymousClass1GQ) r2.A5a.get();
            newsletterReactionsSheet.A07 = C165577te.A0Q(r2);
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
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.newsletter.ui.reactions.Hilt_NewsletterReactionsSheet.A1F(android.app.Activity):void");
    }

    public void A1O(Context context) {
        super.A1O(context);
        A03();
        A1h();
    }
}