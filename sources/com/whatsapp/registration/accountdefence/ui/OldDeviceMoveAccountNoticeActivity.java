package com.whatsapp.registration.accountdefence.ui;

import X.AnonymousClass13I;
import X.AnonymousClass155;
import X.AnonymousClass19A;
import X.AnonymousClass1RU;
import X.AnonymousClass3SK;
import X.AnonymousClass3Y6;
import X.C03570Gk;
import X.C16160oi;
import X.C18740tg;
import X.C18800tq;
import X.C18830tt;
import X.C25271Fq;
import X.C32681e1;
import X.C33101ei;
import X.C36321k7;
import X.C36331k8;
import X.C36351kA;
import X.C36361kB;
import X.C36371kC;
import X.C36391kE;
import X.C36401kF;
import X.C36441kJ;
import X.C81143wX;
import X.C87464Ox;
import X.C89364Wg;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaImageButton;
import com.whatsapp.util.Log;
import com.whatsapp.wds.components.button.WDSButton;

public class OldDeviceMoveAccountNoticeActivity extends AnonymousClass155 implements C87464Ox, C16160oi {
    public TextEmojiLabel A00;
    public AnonymousClass1RU A01;
    public C33101ei A02;
    public C25271Fq A03;
    public AnonymousClass19A A04;
    public AnonymousClass13I A05;
    public C32681e1 A06;
    public String A07;
    public WaImageButton A08;
    public WDSButton A09;
    public WDSButton A0A;
    public boolean A0B;

    public void A2F() {
        if (!this.A0B) {
            this.A0B = true;
            C18800tq A0B2 = C36331k8.A0B(this);
            C36321k7.A0c(A0B2, this);
            C18830tt r1 = A0B2.A00;
            C36321k7.A0X(A0B2, r1, this, C36321k7.A05(A0B2, r1, this));
            this.A06 = C36351kA.A0p(r1);
            this.A05 = (AnonymousClass13I) A0B2.A4a.get();
            this.A04 = C36361kB.A0c(A0B2);
            this.A03 = C36391kE.A0d(A0B2);
            this.A02 = (C33101ei) A0B2.A3f.get();
            this.A01 = C36351kA.A0R(A0B2);
        }
    }

    public OldDeviceMoveAccountNoticeActivity(int i) {
        this.A0B = false;
        C89364Wg.A00(this, 0);
    }

    public boolean Bge() {
        Bnv();
        return true;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String stringExtra = getIntent().getStringExtra("server_token");
        C18740tg.A06(stringExtra);
        this.A07 = stringExtra;
        setContentView((int) R.layout.f9nameremoved);
        if (this.A0D.A0E(3159)) {
            C36401kF.A0H(this, R.id.move_button).setText(R.string.f12nameremoved);
        }
        WDSButton wDSButton = (WDSButton) C03570Gk.A0B(this, R.id.stay_button);
        this.A0A = wDSButton;
        AnonymousClass3Y6.A00(wDSButton, this, 44);
        WaImageButton waImageButton = (WaImageButton) C03570Gk.A0B(this, R.id.close_button);
        this.A08 = waImageButton;
        AnonymousClass3Y6.A00(waImageButton, this, 45);
        WDSButton wDSButton2 = (WDSButton) C03570Gk.A0B(this, R.id.move_button);
        this.A09 = wDSButton2;
        AnonymousClass3Y6.A00(wDSButton2, this, 46);
        TextEmojiLabel A0e = C36441kJ.A0e(this, R.id.backup_description);
        this.A00 = A0e;
        SpannableStringBuilder A022 = this.A06.A02(A0e.getContext(), C81143wX.A00(this, 38), getString(R.string.f12nameremoved), "create-backup");
        C36331k8.A1A(this.A0D, this.A00);
        C36331k8.A16(this.A00, this.A08);
        this.A00.setText(A022);
    }

    public void onResume() {
        super.onResume();
        if (this.A05.A00 || C36371kC.A1U(C36331k8.A06(this), "show_post_reg_logged_out_dialog")) {
            Log.i("OldDeviceMoveAccountNoticeActivity/show-login-failed");
            this.A09.A25(false);
            this.A03.A03(20, "OldDeviceMoveAccountNoticeLoginFailed");
            AnonymousClass3SK.A01(this, this.A01, this.A0D);
        }
    }

    public OldDeviceMoveAccountNoticeActivity() {
        this(0);
    }
}
