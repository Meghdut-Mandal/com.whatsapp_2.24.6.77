package com.whatsapp.newsletter.multiadmin;

import X.AnonymousClass00C;
import X.AnonymousClass00T;
import X.AnonymousClass16D;
import X.AnonymousClass1LX;
import X.AnonymousClass3Y4;
import X.C000800j;
import X.C001400p;
import X.C36331k8;
import X.C36351kA;
import X.C36361kB;
import X.C36431kI;
import X.C85264Gk;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.WaImageView;
import com.whatsapp.wds.components.button.WDSButton;

public final class NewsletterSendAdminInviteSheet extends Hilt_NewsletterSendAdminInviteSheet {
    public WaImageView A00;
    public AnonymousClass16D A01;
    public AnonymousClass1LX A02;
    public WDSButton A03;
    public WDSButton A04;
    public final AnonymousClass00T A05 = C001400p.A00(C000800j.NONE, new C85264Gk(this));

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        AnonymousClass00C.A0D(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.f9nameremoved, viewGroup);
        this.A04 = C36431kI.A0y(inflate, R.id.primary_button);
        this.A03 = C36431kI.A0y(inflate, R.id.learn_more_button);
        this.A00 = C36431kI.A0X(inflate, R.id.close_button);
        return inflate;
    }

    public void A1J() {
        this.A04 = null;
        this.A03 = null;
        this.A00 = null;
        super.A1J();
    }

    public void A1S(Bundle bundle, View view) {
        AnonymousClass00C.A0D(view, 0);
        super.A1S(bundle, view);
        WDSButton wDSButton = this.A04;
        if (wDSButton != null) {
            AnonymousClass3Y4.A00(wDSButton, this, 24);
        }
        WDSButton wDSButton2 = this.A03;
        if (wDSButton2 != null) {
            AnonymousClass3Y4.A00(wDSButton2, this, 22);
        }
        WaImageView waImageView = this.A00;
        if (waImageView != null) {
            AnonymousClass3Y4.A00(waImageView, this, 23);
        }
        C36351kA.A19(C36361kB.A0G(view, R.id.nux_bullets), R.id.bullet_3);
    }

    public void A1b() {
        AnonymousClass1LX r0 = this.A02;
        if (r0 != null) {
            r0.A00.A00("newsletter_multi_admin", (Object) null);
            super.A1b();
            return;
        }
        throw C36331k8.A0d("nuxManager");
    }
}
