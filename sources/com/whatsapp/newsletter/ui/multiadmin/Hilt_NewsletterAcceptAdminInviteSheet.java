package com.whatsapp.newsletter.ui.multiadmin;

import X.AnonymousClass3E8;
import X.C18800tq;
import X.C18830tt;
import X.C32541dn;
import X.C32581dr;
import X.C36331k8;
import X.C36351kA;
import X.C36361kB;
import X.C36391kE;
import X.C36431kI;
import X.C62403Ga;
import X.C64573On;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.whatsapp.newsletter.NewsletterLinkLauncher;
import com.whatsapp.wds.components.bottomsheet.WDSBottomSheetDialogFragment;

public abstract class Hilt_NewsletterAcceptAdminInviteSheet extends WDSBottomSheetDialogFragment {
    public ContextWrapper A00;
    public boolean A01;
    public boolean A02 = false;

    private void A05() {
        if (this.A00 == null) {
            this.A00 = C36431kI.A11(super.A1D(), this);
            this.A01 = C32541dn.A00(super.A1D());
        }
    }

    public void A1h() {
        if (!this.A02) {
            this.A02 = true;
            NewsletterAcceptAdminInviteSheet newsletterAcceptAdminInviteSheet = (NewsletterAcceptAdminInviteSheet) this;
            C18800tq r2 = ((C32581dr) C36391kE.A0U(this)).A1K;
            C18830tt r1 = r2.A00;
            C36361kB.A1E(r1, newsletterAcceptAdminInviteSheet);
            newsletterAcceptAdminInviteSheet.A03 = C36351kA.A0V(r2);
            newsletterAcceptAdminInviteSheet.A00 = C36351kA.A0M(r2);
            newsletterAcceptAdminInviteSheet.A01 = C36351kA.A0N(r2);
            newsletterAcceptAdminInviteSheet.A04 = (NewsletterLinkLauncher) r2.A5f.get();
            newsletterAcceptAdminInviteSheet.A05 = (C62403Ga) r1.AA8.get();
            newsletterAcceptAdminInviteSheet.A07 = (AnonymousClass3E8) r1.AAA.get();
            newsletterAcceptAdminInviteSheet.A06 = (C64573On) r1.AAD.get();
        }
    }

    public Context A1D() {
        if (super.A1D() == null && !this.A01) {
            return null;
        }
        A05();
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
            r2.A05()
            r2.A1h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.newsletter.ui.multiadmin.Hilt_NewsletterAcceptAdminInviteSheet.A1F(android.app.Activity):void");
    }

    public void A1O(Context context) {
        super.A1O(context);
        A05();
        A1h();
    }
}
