package com.whatsapp.status;

import X.AnonymousClass000;
import X.AnonymousClass00C;
import X.AnonymousClass01I;
import X.AnonymousClass02E;
import X.AnonymousClass141;
import X.AnonymousClass16D;
import X.AnonymousClass171;
import X.AnonymousClass3LW;
import X.AnonymousClass4XP;
import X.C022609n;
import X.C18740tg;
import X.C28301Sc;
import X.C29731Xt;
import X.C36321k7;
import X.C36331k8;
import X.C36361kB;
import X.C36371kC;
import X.C36381kD;
import X.C36401kF;
import X.C36411kG;
import X.C39001qm;
import X.C80793vy;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;

public final class StatusConfirmMuteDialogFragment extends Hilt_StatusConfirmMuteDialogFragment {
    public AnonymousClass16D A00;
    public AnonymousClass171 A01;
    public C28301Sc A02;
    public C29731Xt A03;
    public C022609n A04;

    public void onDismiss(DialogInterface dialogInterface) {
        AnonymousClass00C.A0D(dialogInterface, 0);
        super.onDismiss(dialogInterface);
        C022609n r0 = this.A04;
        if (r0 != null) {
            r0.BVg(this, false);
        }
    }

    public Dialog A1a(Bundle bundle) {
        C022609n r0 = this.A04;
        if (r0 != null) {
            r0.BVg(this, true);
        }
        UserJid A022 = UserJid.Companion.A02(C36411kG.A0x(this));
        C18740tg.A06(A022);
        AnonymousClass16D r02 = this.A00;
        if (r02 != null) {
            AnonymousClass141 A0D = r02.A0D(A022);
            C39001qm A042 = AnonymousClass3LW.A04(this);
            Object[] objArr = new Object[1];
            AnonymousClass171 r03 = this.A01;
            if (r03 != null) {
                A042.A0q(C36401kF.A0q(this, C36381kD.A0v(r03, A0D), objArr, 0, R.string.f12nameremoved));
                Object[] objArr2 = new Object[1];
                AnonymousClass171 r04 = this.A01;
                if (r04 != null) {
                    C36361kB.A1F(r04, A0D, objArr2, 0);
                    A042.A0p(A0o(R.string.f12nameremoved, objArr2));
                    A042.A0f(new AnonymousClass4XP(this, 41), R.string.f12nameremoved);
                    C39001qm.A0J(A042, this, A022, 24, R.string.f12nameremoved);
                    return C36371kC.A0O(A042);
                }
                throw C36331k8.A0c();
            }
            throw C36331k8.A0c();
        }
        throw C36331k8.A0Z();
    }

    public static final void A03(UserJid userJid, StatusConfirmMuteDialogFragment statusConfirmMuteDialogFragment) {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("statusesfragment/mute status for ");
        UserJid userJid2 = userJid;
        C36321k7.A1N(userJid, A0u);
        C28301Sc r0 = statusConfirmMuteDialogFragment.A02;
        if (r0 != null) {
            C36361kB.A1I(userJid);
            r0.A06.A00(userJid, true);
            Bundle A0b = statusConfirmMuteDialogFragment.A0b();
            C29731Xt r4 = statusConfirmMuteDialogFragment.A03;
            if (r4 != null) {
                String string = A0b.getString("message_id");
                Long valueOf = Long.valueOf(A0b.getLong("status_item_index"));
                String string2 = A0b.getString("psa_campaign_id");
                r4.A0C.Boy(new C80793vy(userJid2, r4, valueOf, A0b.getString("psa_campaign_ids"), string2, string, 1, A0b.getBoolean("is_message_sampled")));
                statusConfirmMuteDialogFragment.A1b();
                return;
            }
            throw C36331k8.A0d("statusesStatsManager");
        }
        throw C36331k8.A0d("statusManager");
    }

    public void A1H() {
        super.A1H();
        this.A04 = null;
    }

    public void A1Q(Bundle bundle) {
        C022609n r1;
        super.A1Q(bundle);
        try {
            AnonymousClass01I A0h = A0h();
            if (!(A0h instanceof C022609n) || (r1 = (C022609n) A0h) == null) {
                AnonymousClass02E A0f = A0f();
                AnonymousClass00C.A0E(A0f, "null cannot be cast to non-null type com.whatsapp.status.StatusConfirmMuteDialogFragment.Host");
                r1 = (C022609n) A0f;
            }
            this.A04 = r1;
        } catch (ClassCastException unused) {
            throw new ClassCastException("Calling fragment must implement Host interface");
        }
    }
}
