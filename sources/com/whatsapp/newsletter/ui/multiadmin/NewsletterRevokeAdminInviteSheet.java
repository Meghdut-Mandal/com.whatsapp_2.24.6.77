package com.whatsapp.newsletter.ui.multiadmin;

import X.AnonymousClass001;
import X.AnonymousClass00C;
import X.AnonymousClass00T;
import X.AnonymousClass17Y;
import X.AnonymousClass3E8;
import X.AnonymousClass3TE;
import X.AnonymousClass3Y4;
import X.AnonymousClass4RH;
import X.AnonymousClass4RK;
import X.AnonymousClass4WX;
import X.C000800j;
import X.C001400p;
import X.C19970wo;
import X.C21060yb;
import X.C28981Uw;
import X.C34301gn;
import X.C36331k8;
import X.C36351kA;
import X.C36381kD;
import X.C36401kF;
import X.C36431kI;
import X.C51872oW;
import X.C62403Ga;
import X.C64573On;
import X.C85304Go;
import X.C85314Gp;
import X.C85474Hf;
import X.C90424a8;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;
import com.whatsapp.jid.UserJid;
import com.whatsapp.wds.components.button.WDSButton;
import java.lang.ref.WeakReference;
import java.util.List;

public final class NewsletterRevokeAdminInviteSheet extends Hilt_NewsletterRevokeAdminInviteSheet implements AnonymousClass4RH, AnonymousClass4RK {
    public AnonymousClass17Y A00;
    public WaImageView A01;
    public C21060yb A02;
    public C19970wo A03;
    public C62403Ga A04;
    public C64573On A05;
    public AnonymousClass3E8 A06;
    public WDSButton A07;
    public WaImageView A08;
    public WaTextView A09;
    public WaTextView A0A;
    public WDSButton A0B;
    public final AnonymousClass00T A0C;
    public final AnonymousClass00T A0D;
    public final AnonymousClass00T A0E;
    public final AnonymousClass00T A0F = AnonymousClass3TE.A01(this, "newsletter_name");

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        AnonymousClass00C.A0D(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.f9nameremoved, viewGroup);
        this.A08 = C36431kI.A0X(inflate, R.id.nl_image);
        this.A0A = C36401kF.A0Q(inflate, R.id.admin_invite_title);
        this.A09 = C36401kF.A0Q(inflate, R.id.expire_text);
        this.A07 = C36431kI.A0y(inflate, R.id.primary_button);
        this.A0B = C36431kI.A0y(inflate, R.id.view_newsletter_button);
        this.A01 = C36431kI.A0X(inflate, R.id.close_button);
        return inflate;
    }

    public void A1J() {
        this.A0A = null;
        this.A09 = null;
        this.A01 = null;
        super.A1J();
    }

    public void A1S(Bundle bundle, View view) {
        AnonymousClass00C.A0D(view, 0);
        super.A1S(bundle, view);
        WaTextView waTextView = this.A0A;
        if (waTextView != null) {
            C36401kF.A1A(waTextView, this.A0F);
        }
        WaTextView waTextView2 = this.A09;
        if (waTextView2 != null) {
            A1m();
            C19970wo r2 = this.A03;
            if (r2 != null) {
                C64573On.A00(waTextView2, r2, C36351kA.A08(this.A0D));
            } else {
                throw C36331k8.A0d("time");
            }
        }
        WDSButton wDSButton = this.A07;
        if (wDSButton != null) {
            wDSButton.setText(R.string.f12nameremoved);
            wDSButton.setAction(C34301gn.DESTRUCTIVE);
            AnonymousClass3Y4.A00(wDSButton, this, 32);
        }
        WaImageView waImageView = this.A01;
        if (waImageView != null) {
            AnonymousClass3Y4.A00(waImageView, this, 33);
        }
        AnonymousClass3E8 r1 = this.A06;
        if (r1 != null) {
            C28981Uw A0i = C36431kI.A0i(this.A0E);
            WaImageView waImageView2 = this.A08;
            if (A0i != null && waImageView2 != null) {
                r1.A03.A01(A0i, new C90424a8(waImageView2, r1, 1), (String) null, true, true);
                return;
            }
            return;
        }
        throw C36331k8.A0d("newsletterAdminInviteSheetPhotoLoader");
    }

    public void Bfa(UserJid userJid) {
        AnonymousClass00C.A0D(userJid, 0);
        WeakReference A0F2 = AnonymousClass001.A0F(C36381kD.A0A(A1D()));
        C28981Uw A0i = C36431kI.A0i(this.A0E);
        if (A0i != null) {
            C62403Ga r2 = this.A04;
            if (r2 != null) {
                r2.A00(A0i, userJid, new AnonymousClass4WX(A0F2, this, 1));
                return;
            }
            throw C36331k8.A0d("newsletterAdminInvitationHandler");
        }
    }

    public void Bji(C51872oW r3, String str, List list) {
        C36331k8.A1I(list, r3);
        if (r3 == C51872oW.REVOKE) {
            Bfa((UserJid) list.get(0));
        }
    }

    public final C64573On A1m() {
        C64573On r0 = this.A05;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("newsletterMultiAdminUtils");
    }

    public NewsletterRevokeAdminInviteSheet() {
        C000800j r2 = C000800j.NONE;
        this.A0E = C001400p.A00(r2, new C85304Go(this));
        this.A0C = C001400p.A00(r2, new C85314Gp(this));
        this.A0D = C001400p.A00(r2, new C85474Hf(this, "invite_expiration_ts"));
    }
}
