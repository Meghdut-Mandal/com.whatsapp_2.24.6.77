package com.whatsapp.newsletter.ui.multiadmin;

import X.AnonymousClass00C;
import X.AnonymousClass00T;
import X.AnonymousClass17Y;
import X.AnonymousClass30H;
import X.AnonymousClass3E8;
import X.AnonymousClass3TE;
import X.AnonymousClass3Y4;
import X.AnonymousClass4OL;
import X.AnonymousClass4PA;
import X.AnonymousClass4RH;
import X.AnonymousClass4WX;
import X.AnonymousClass8fU;
import X.C000800j;
import X.C001400p;
import X.C18800tq;
import X.C19730wQ;
import X.C19770wU;
import X.C19970wo;
import X.C28981Uw;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36391kE;
import X.C36401kF;
import X.C36431kI;
import X.C51872oW;
import X.C62133Ex;
import X.C62403Ga;
import X.C64573On;
import X.C85294Gn;
import X.C85474Hf;
import X.C90424a8;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;
import com.whatsapp.newsletter.NewsletterLinkLauncher;
import com.whatsapp.wds.components.button.WDSButton;
import java.util.List;

public final class NewsletterAcceptAdminInviteSheet extends Hilt_NewsletterAcceptAdminInviteSheet implements AnonymousClass4RH {
    public AnonymousClass17Y A00;
    public C19730wQ A01;
    public WaImageView A02;
    public C19970wo A03;
    public NewsletterLinkLauncher A04;
    public C62403Ga A05;
    public C64573On A06;
    public AnonymousClass3E8 A07;
    public WDSButton A08;
    public WDSButton A09;
    public WaImageView A0A;
    public WaTextView A0B;
    public WaTextView A0C;
    public final AnonymousClass00T A0D;
    public final AnonymousClass00T A0E;
    public final AnonymousClass00T A0F;
    public final AnonymousClass00T A0G = AnonymousClass3TE.A01(this, "newsletter_name");

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        AnonymousClass00C.A0D(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.f9nameremoved, viewGroup);
        this.A0A = C36431kI.A0X(inflate, R.id.nl_image);
        this.A0C = C36401kF.A0Q(inflate, R.id.admin_invite_title);
        this.A0B = C36401kF.A0Q(inflate, R.id.expire_text);
        this.A08 = C36431kI.A0y(inflate, R.id.primary_button);
        this.A09 = C36431kI.A0y(inflate, R.id.view_newsletter_button);
        this.A02 = C36431kI.A0X(inflate, R.id.close_button);
        return inflate;
    }

    public void A1J() {
        this.A0C = null;
        this.A0B = null;
        this.A08 = null;
        this.A09 = null;
        this.A02 = null;
        super.A1J();
    }

    public void A1S(Bundle bundle, View view) {
        AnonymousClass00C.A0D(view, 0);
        super.A1S(bundle, view);
        WaTextView waTextView = this.A0C;
        if (waTextView != null) {
            C36401kF.A1A(waTextView, this.A0G);
        }
        WaTextView waTextView2 = this.A0B;
        if (waTextView2 != null) {
            if (this.A06 != null) {
                C19970wo r2 = this.A03;
                if (r2 != null) {
                    C64573On.A00(waTextView2, r2, C36351kA.A08(this.A0D));
                } else {
                    throw C36331k8.A0d("time");
                }
            } else {
                throw C36331k8.A0d("newsletterMultiAdminUtils");
            }
        }
        AnonymousClass00T r22 = this.A0E;
        if (!C36331k8.A1b(r22)) {
            C36341k9.A0X(view, R.id.hidden_additional_nux_bullets).A01().setVisibility(0);
        }
        WDSButton wDSButton = this.A08;
        if (wDSButton != null) {
            wDSButton.setText(R.string.f12nameremoved);
            AnonymousClass3Y4.A00(wDSButton, this, 30);
        }
        WDSButton wDSButton2 = this.A09;
        if (wDSButton2 != null) {
            wDSButton2.setVisibility(0);
            AnonymousClass3Y4.A00(wDSButton2, this, 31);
        }
        WaImageView waImageView = this.A02;
        if (waImageView != null) {
            AnonymousClass3Y4.A00(waImageView, this, 29);
        }
        AnonymousClass3E8 r1 = this.A07;
        if (r1 != null) {
            C28981Uw A0i = C36431kI.A0i(this.A0F);
            WaImageView waImageView2 = this.A0A;
            if (!(A0i == null || waImageView2 == null)) {
                r1.A03.A01(A0i, new C90424a8(waImageView2, r1, 1), (String) null, true, true);
            }
            r22.getValue();
            return;
        }
        throw C36331k8.A0d("newsletterAdminInviteSheetPhotoLoader");
    }

    public void Bji(C51872oW r2, String str, List list) {
        AnonymousClass00C.A0D(r2, 1);
        if (r2 == C51872oW.ACCEPT_INVITE) {
            A03(this);
        }
    }

    public static final void A03(NewsletterAcceptAdminInviteSheet newsletterAcceptAdminInviteSheet) {
        AnonymousClass8fU r4;
        C28981Uw A0i = C36431kI.A0i(newsletterAcceptAdminInviteSheet.A0F);
        if (A0i != null) {
            C62403Ga r2 = newsletterAcceptAdminInviteSheet.A05;
            if (r2 != null) {
                AnonymousClass4WX r42 = new AnonymousClass4WX(A0i, newsletterAcceptAdminInviteSheet, 0);
                AnonymousClass4PA r0 = r2.A00;
                if (r0 != null) {
                    r0.cancel();
                }
                r2.A01.A05(R.string.f12nameremoved, R.string.f12nameremoved);
                C62133Ex r1 = r2.A03;
                C90424a8 r7 = new C90424a8(r42, r2, 0);
                if (!C36391kE.A1Z(r1.A06)) {
                    r4 = null;
                } else {
                    AnonymousClass30H r12 = r1.A03;
                    if (r12 != null) {
                        C19770wU A0Z = C36341k9.A0Z(r12.A00.A00);
                        C18800tq r13 = r12.A00.A00;
                        r4 = new AnonymousClass8fU(C36391kE.A0g(r13), A0i, r7, (AnonymousClass4OL) r13.A5l.get(), r13.Azc(), A0Z);
                        r4.A01();
                    } else {
                        throw C36331k8.A0d("newsletterAcceptAdminInviteHandler");
                    }
                }
                r2.A00 = r4;
                return;
            }
            throw C36331k8.A0d("newsletterAdminInvitationHandler");
        }
    }

    public final AnonymousClass17Y A1m() {
        AnonymousClass17Y r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        throw C36321k7.A06();
    }

    public NewsletterAcceptAdminInviteSheet() {
        C000800j r2 = C000800j.NONE;
        this.A0F = C001400p.A00(r2, new C85294Gn(this));
        this.A0D = C001400p.A00(r2, new C85474Hf(this, "invite_expiration_ts"));
        this.A0E = AnonymousClass3TE.A03(this, "from_tos_accepted", false);
    }
}
