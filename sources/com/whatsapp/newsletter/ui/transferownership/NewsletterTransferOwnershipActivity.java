package com.whatsapp.newsletter.ui.transferownership;

import X.AnonymousClass00C;
import X.AnonymousClass00T;
import X.C18800tq;
import X.C18830tt;
import X.C28981Uw;
import X.C30231Zs;
import X.C36321k7;
import X.C36331k8;
import X.C36351kA;
import X.C36411kG;
import X.C36421kH;
import X.C36431kI;
import X.C46502Ya;
import X.C62133Ex;
import X.C81123wV;
import X.C84254Cn;
import X.C84264Co;
import X.C84274Cp;
import X.C89344We;
import X.C90434a9;
import android.content.Intent;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.jid.PhoneUserJid;

public final class NewsletterTransferOwnershipActivity extends C46502Ya {
    public C62133Ex A00;
    public boolean A01;
    public final AnonymousClass00T A02;
    public final AnonymousClass00T A03;
    public final AnonymousClass00T A04;

    public static final void A01(NewsletterTransferOwnershipActivity newsletterTransferOwnershipActivity, Boolean bool, boolean z) {
        C81123wV.A00(newsletterTransferOwnershipActivity.A05, newsletterTransferOwnershipActivity, 32);
        Intent A0D = C36431kI.A0D();
        A0D.putExtra("transfer_ownership_admin_short_name", C36431kI.A1E(newsletterTransferOwnershipActivity.A03));
        A0D.putExtra("transfer_ownership_successful", z);
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            A0D.putExtra("transfer_ownership_admin_dismiss_requested", true);
            A0D.putExtra("transfer_ownership_admin_dismiss_successful", booleanValue);
        }
        C36331k8.A0o(newsletterTransferOwnershipActivity, A0D);
    }

    public static final void A07(NewsletterTransferOwnershipActivity newsletterTransferOwnershipActivity, boolean z) {
        if (!((CompoundButton) newsletterTransferOwnershipActivity.A04.getValue()).isChecked()) {
            A01(newsletterTransferOwnershipActivity, (Boolean) null, z);
            return;
        }
        C62133Ex r4 = newsletterTransferOwnershipActivity.A00;
        if (r4 != null) {
            C28981Uw A0i = C36431kI.A0i(newsletterTransferOwnershipActivity.A04);
            AnonymousClass00C.A0E(A0i, "null cannot be cast to non-null type com.whatsapp.jid.NewsletterJid");
            PhoneUserJid A0j = C36411kG.A0j(newsletterTransferOwnershipActivity);
            AnonymousClass00C.A0E(A0j, "null cannot be cast to non-null type com.whatsapp.jid.UserJid");
            r4.A00(A0i, A0j, new C90434a9(newsletterTransferOwnershipActivity, 8));
            return;
        }
        throw C36331k8.A0d("newsletterMultiAdminManager");
    }

    public void A2F() {
        if (!this.A01) {
            this.A01 = true;
            C18800tq A0B = C36331k8.A0B(this);
            C36321k7.A0c(A0B, this);
            C18830tt r1 = A0B.A00;
            C36321k7.A0X(A0B, r1, this, C36321k7.A05(A0B, r1, this));
            this.A00 = C36351kA.A0T(A0B);
            this.A01 = C36421kH.A0Q(A0B);
            this.A02 = (C30231Zs) A0B.AUm.get();
            this.A00 = (C62133Ex) r1.A2t.get();
        }
    }

    public NewsletterTransferOwnershipActivity(int i) {
        this.A01 = false;
        C89344We.A00(this, 31);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ((TextView) this.A04.getValue()).setText(R.string.f12nameremoved);
    }

    public NewsletterTransferOwnershipActivity() {
        this(0);
        this.A02 = C36431kI.A1I(new C84254Cn(this));
        this.A03 = C36431kI.A1I(new C84264Co(this));
        this.A04 = C36431kI.A1I(new C84274Cp(this));
    }
}
