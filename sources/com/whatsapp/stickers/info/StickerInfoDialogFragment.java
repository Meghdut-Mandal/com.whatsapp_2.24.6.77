package com.whatsapp.stickers.info;

import X.AnonymousClass001;
import X.AnonymousClass0FM;
import X.AnonymousClass0YZ;
import X.AnonymousClass11F;
import X.AnonymousClass17Y;
import X.AnonymousClass190;
import X.AnonymousClass1AP;
import X.AnonymousClass1BF;
import X.AnonymousClass1HA;
import X.AnonymousClass1RJ;
import X.AnonymousClass1YD;
import X.AnonymousClass3H7;
import X.AnonymousClass3LW;
import X.AnonymousClass3QU;
import X.AnonymousClass4V7;
import X.AnonymousClass4XQ;
import X.AnonymousClass6WF;
import X.C012005e;
import X.C120215r9;
import X.C135066c4;
import X.C19730wQ;
import X.C19770wU;
import X.C23871Ae;
import X.C23981Ap;
import X.C24281Bv;
import X.C24801Dv;
import X.C35771jE;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36381kD;
import X.C36401kF;
import X.C39001qm;
import X.C49562jK;
import X.C63563Kn;
import X.C64473Oc;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.whatsapp.R;
import java.util.Collections;

public class StickerInfoDialogFragment extends Hilt_StickerInfoDialogFragment {
    public int A00;
    public View A01;
    public Button A02;
    public Button A03;
    public Button A04;
    public C24801Dv A05;
    public AnonymousClass17Y A06;
    public C19730wQ A07;
    public C63563Kn A08;
    public AnonymousClass3H7 A09;
    public AnonymousClass190 A0A;
    public AnonymousClass11F A0B;
    public AnonymousClass1BF A0C;
    public AnonymousClass6WF A0D;
    public C23871Ae A0E;
    public C24281Bv A0F;
    public C120215r9 A0G;
    public C64473Oc A0H;
    public C135066c4 A0I;
    public C23981Ap A0J;
    public AnonymousClass1HA A0K;
    public AnonymousClass1AP A0L;
    public AnonymousClass3QU A0M;
    public AnonymousClass1YD A0N;
    public AnonymousClass1RJ A0O;
    public AnonymousClass1RJ A0P;
    public AnonymousClass1RJ A0Q;
    public C19770wU A0R;
    public boolean A0S = true;
    public final DialogInterface.OnClickListener A0T = new AnonymousClass4XQ(this, 3);
    public final DialogInterface.OnClickListener A0U = new AnonymousClass4XQ(this, 4);

    public static StickerInfoDialogFragment A03(C135066c4 r3, String str, boolean z) {
        StickerInfoDialogFragment stickerInfoDialogFragment = new StickerInfoDialogFragment();
        Bundle A072 = AnonymousClass001.A07();
        A072.putBoolean("fromMe", z);
        A072.putParcelable("sticker", r3);
        A072.putString("raw-chat-jid", str);
        stickerInfoDialogFragment.A17(A072);
        return stickerInfoDialogFragment;
    }

    public static void A05(C135066c4 r2, AnonymousClass3QU r3, StickerInfoDialogFragment stickerInfoDialogFragment) {
        if (r3.A08) {
            AnonymousClass1AP r4 = stickerInfoDialogFragment.A0L;
            r4.A0N.Boy(new C35771jE(r4, Collections.singleton(r2), 7));
            return;
        }
        stickerInfoDialogFragment.A0L.A0D(Collections.singleton(r2));
        if (!AnonymousClass3H7.A00(stickerInfoDialogFragment)) {
            boolean z = r3.A07;
            AnonymousClass1YD r0 = stickerInfoDialogFragment.A0N;
            if (z) {
                r0.A02("starred", 1);
            } else {
                r0.A03("starred", 1);
            }
        }
    }

    public static void A06(StickerInfoDialogFragment stickerInfoDialogFragment, int i, boolean z) {
        Intent intent;
        if (z) {
            if (!(stickerInfoDialogFragment.A0i() instanceof AnonymousClass4V7) || AnonymousClass3H7.A00(stickerInfoDialogFragment)) {
                intent = AnonymousClass190.A1D(stickerInfoDialogFragment.A0a(), "meta-avatar", "info_dialog");
            } else {
                stickerInfoDialogFragment.A0E.A01(6);
                stickerInfoDialogFragment.A0N.A02((String) null, i);
                return;
            }
        } else if (!stickerInfoDialogFragment.A02.A0E(7755) || stickerInfoDialogFragment.A1D() == null) {
            stickerInfoDialogFragment.A0D.A04("sticker_info_dialog", AnonymousClass001.A0F(stickerInfoDialogFragment.A0i()));
            return;
        } else {
            intent = AnonymousClass190.A11(stickerInfoDialogFragment.A1D(), "sticker_info_dialog");
        }
        stickerInfoDialogFragment.A1C(intent);
    }

    public void A1M() {
        super.A1M();
        AnonymousClass0FM r0 = (AnonymousClass0FM) this.A02;
        if (r0 != null) {
            AnonymousClass0YZ r1 = r0.A00;
            Button button = r1.A0H;
            this.A02 = button;
            this.A03 = r1.A0F;
            this.A04 = r1.A0G;
            if (this.A0K != null && this.A0I != null && this.A0M == null) {
                button.setVisibility(8);
                this.A03.setVisibility(8);
                this.A04.setVisibility(8);
                C36331k8.A1F(new C49562jK(this.A0C, this.A0I, this.A0J, this.A0L, this), this.A0R);
            }
        }
    }

    public Dialog A1a(Bundle bundle) {
        Bundle A0b = A0b();
        this.A00 = C36341k9.A0G(this).getDimensionPixelSize(R.dimen.f7nameremoved);
        this.A0I = (C135066c4) A0b.getParcelable("sticker");
        this.A0B = C36351kA.A0i(A0b, "raw-chat-jid");
        this.A0S = A0b.getBoolean("fromMe", true);
        C39001qm A052 = AnonymousClass3LW.A05(this);
        View inflate = C36381kD.A0J(this).inflate(R.layout.f9nameremoved, (ViewGroup) null);
        this.A0Q = C36341k9.A0X(inflate, R.id.sticker_view);
        this.A01 = C012005e.A02(inflate, R.id.progress_view);
        this.A0O = C36341k9.A0X(inflate, R.id.sticker_info_container);
        C36401kF.A11(this.A0T, (DialogInterface.OnClickListener) null, A052, R.string.f12nameremoved);
        A052.A0g(this.A0U, R.string.f12nameremoved);
        this.A0P = C36341k9.A0X(inflate, R.id.sticker_options_list_view);
        A052.setView(inflate);
        return A052.create();
    }
}
