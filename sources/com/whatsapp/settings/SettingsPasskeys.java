package com.whatsapp.settings;

import X.AnonymousClass00C;
import X.AnonymousClass00T;
import X.AnonymousClass155;
import X.AnonymousClass4H8;
import X.AnonymousClass4LG;
import X.C18800tq;
import X.C18830tt;
import X.C21010yW;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36381kD;
import X.C36441kJ;
import X.C65963Ud;
import X.C84424De;
import X.C84434Df;
import X.C89364Wg;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.os.Bundle;
import com.whatsapp.R;

public final class SettingsPasskeys extends AnonymousClass155 {
    public C21010yW A00;
    public boolean A01;
    public final AnonymousClass00T A02;

    public Dialog onCreateDialog(int i) {
        if (i == 1) {
            String string = getString(R.string.f12nameremoved);
            ProgressDialog progressDialog = new ProgressDialog(this);
            C36331k8.A0p(progressDialog, string);
            AnonymousClass00C.A0B(progressDialog);
            return progressDialog;
        }
        Dialog onCreateDialog = super.onCreateDialog(i);
        AnonymousClass00C.A08(onCreateDialog);
        return onCreateDialog;
    }

    public void A2F() {
        if (!this.A01) {
            this.A01 = true;
            C18800tq A0B = C36331k8.A0B(this);
            C36321k7.A0c(A0B, this);
            C18830tt r1 = A0B.A00;
            C36321k7.A0X(A0B, r1, this, C36321k7.A05(A0B, r1, this));
            this.A00 = C36351kA.A0g(A0B);
        }
    }

    public SettingsPasskeys(int i) {
        this.A01 = false;
        C89364Wg.A00(this, 27);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.f9nameremoved);
        AnonymousClass00T r3 = this.A02;
        C65963Ud.A01(this, ((SettingsPasskeysViewModel) r3.getValue()).A00, new AnonymousClass4LG(this), 4);
        C36341k9.A0N(this).A0I(R.string.f12nameremoved);
        C36381kD.A0g(r3).A00(20, (Throwable) null);
    }

    public SettingsPasskeys() {
        this(0);
        this.A02 = C36441kJ.A0a(new C84434Df(this), new C84424De(this), new AnonymousClass4H8(this), C36441kJ.A1A(SettingsPasskeysViewModel.class));
    }
}
