package com.whatsapp.account.delete;

import X.AnonymousClass001;
import X.AnonymousClass00C;
import X.AnonymousClass02E;
import X.AnonymousClass155;
import X.AnonymousClass1C4;
import X.AnonymousClass1EV;
import X.AnonymousClass1GQ;
import X.AnonymousClass34N;
import X.AnonymousClass3UF;
import X.AnonymousClass4TQ;
import X.C001700s;
import X.C18740tg;
import X.C18800tq;
import X.C18830tt;
import X.C19460v5;
import X.C19470v6;
import X.C29501Ww;
import X.C30231Zs;
import X.C34191gb;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36371kC;
import X.C36391kE;
import X.C36401kF;
import X.C36411kG;
import X.C36421kH;
import X.C36431kI;
import X.C36441kJ;
import X.C48812i6;
import X.C61573Co;
import X.C66923Xv;
import X.C88904Um;
import X.C89314Wb;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import com.whatsapp.R;
import com.whatsapp.phonematching.ConnectionProgressDialogFragment;
import com.whatsapp.phonematching.ConnectionUnavailableDialogFragment;

public class DeleteAccountActivity extends AnonymousClass155 implements C88904Um {
    public C19460v5 A00;
    public AnonymousClass1C4 A01;
    public AnonymousClass1GQ A02;
    public C30231Zs A03;
    public AnonymousClass1EV A04;
    public C61573Co A05;
    public C29501Ww A06;
    public boolean A07;
    public final C001700s A08;
    public final AnonymousClass4TQ A09;

    public void A2F() {
        if (!this.A07) {
            this.A07 = true;
            C18800tq A0B = C36331k8.A0B(this);
            C36321k7.A0c(A0B, this);
            C18830tt r1 = A0B.A00;
            C36321k7.A0X(A0B, r1, this, C36321k7.A05(A0B, r1, this));
            this.A01 = C36421kH.A0Q(A0B);
            this.A02 = C36371kC.A0f(A0B);
            this.A06 = C36401kF.A0d(A0B);
            this.A03 = (C30231Zs) A0B.AUm.get();
            this.A04 = C36371kC.A0h(A0B);
            this.A00 = C19470v6.A00;
        }
    }

    public void BaU() {
        A33(C36441kJ.A0H(this, DeleteAccountFeedback.class), true);
    }

    public void BnG(C61573Co r4) {
        C30231Zs r2 = this.A03;
        AnonymousClass4TQ r1 = this.A09;
        AnonymousClass00C.A0D(r1, 0);
        r2.A00.add(r1);
        this.A05 = r4;
    }

    public boolean Bpq(String str, String str2) {
        return this.A01.A06(str, str2);
    }

    public void BwN(C61573Co r4) {
        C30231Zs r2 = this.A03;
        AnonymousClass4TQ r1 = this.A09;
        AnonymousClass00C.A0D(r1, 0);
        r2.A00.remove(r1);
        this.A05 = null;
    }

    public DeleteAccountActivity(int i) {
        this.A07 = false;
        C89314Wb.A00(this, 10);
    }

    public void B5d() {
        DialogFragment dialogFragment = (DialogFragment) getSupportFragmentManager().A0N("PROGRESS");
        if (dialogFragment != null) {
            dialogFragment.A1c();
        }
    }

    public void BUN() {
        Bundle A072 = AnonymousClass001.A07();
        ConnectionUnavailableDialogFragment connectionUnavailableDialogFragment = new ConnectionUnavailableDialogFragment();
        connectionUnavailableDialogFragment.A17(A072);
        connectionUnavailableDialogFragment.A1f(getSupportFragmentManager(), "CONNECTION ERROR");
    }

    public void BbB() {
        BO5(R.string.f12nameremoved);
    }

    public void Btz() {
        Bundle A072 = AnonymousClass001.A07();
        ConnectionProgressDialogFragment connectionProgressDialogFragment = new ConnectionProgressDialogFragment();
        connectionProgressDialogFragment.A17(A072);
        connectionProgressDialogFragment.A1f(getSupportFragmentManager(), "PROGRESS");
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.f9nameremoved);
        setTitle(R.string.f12nameremoved);
        C36321k7.A0P(this);
        ImageView A0Q = C36411kG.A0Q(this, R.id.change_number_icon);
        C36321k7.A0L(this, A0Q, this.A00, R.drawable.ic_settings_change_number);
        AnonymousClass3UF.A0A(this, A0Q);
        C36391kE.A0Q(this, R.id.delete_account_instructions).setText(R.string.f12nameremoved);
        C66923Xv.A01(findViewById(R.id.delete_account_change_number_option), this, 21);
        C36431kI.A1K(this, C36391kE.A0Q(this, R.id.delete_whatsapp_account_warning_text), getString(R.string.f12nameremoved));
        C36431kI.A1K(this, C36391kE.A0Q(this, R.id.delete_message_history_warning_text), getString(R.string.f12nameremoved));
        C36431kI.A1K(this, C36391kE.A0Q(this, R.id.delete_whatsapp_group_warning_text), getString(R.string.f12nameremoved));
        C36431kI.A1K(this, C36391kE.A0Q(this, R.id.delete_google_drive_warning_text), getString(R.string.f12nameremoved));
        C36431kI.A1K(this, C36391kE.A0Q(this, R.id.delete_payments_account_warning_text), getString(R.string.f12nameremoved));
        if (!C34191gb.A08(getApplicationContext()) || this.A09.A0c() == null) {
            C36341k9.A13(this, R.id.delete_google_drive_warning_text, 8);
        }
        if (!this.A04.A03() && !this.A04.A02()) {
            C36341k9.A13(this, R.id.delete_payments_account_warning_text, 8);
        } else if (this.A04.A02()) {
            C36431kI.A1K(this, C36391kE.A0Q(this, R.id.delete_payments_account_warning_text), getString(R.string.f12nameremoved));
        }
        boolean A1Z = C36391kE.A1Z(this.A02);
        View findViewById = findViewById(R.id.delete_channels_warning_text);
        if (A1Z) {
            C36431kI.A1K(this, (TextView) findViewById, getString(R.string.f12nameremoved));
        } else {
            findViewById.setVisibility(8);
        }
        AnonymousClass02E A0L = getSupportFragmentManager().A0L(R.id.delete_account_match_phone_number_fragment);
        C18740tg.A06(A0L);
        C48812i6.A00(findViewById(R.id.delete_account_submit), A0L, this, 2);
    }

    public DeleteAccountActivity() {
        this(0);
        this.A08 = C36431kI.A0S();
        this.A09 = new AnonymousClass34N(this, 0);
    }
}
