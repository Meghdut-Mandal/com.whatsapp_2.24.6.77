package com.whatsapp.accountsync;

import X.AnonymousClass17Y;
import X.AnonymousClass190;
import X.C101064wu;
import X.C106925Lw;
import X.C163027pX;
import X.C18800tq;
import X.C19730wQ;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36391kE;
import X.C36441kJ;
import android.accounts.Account;
import android.accounts.AccountManager;
import android.os.Bundle;
import com.whatsapp.R;

public class LoginActivity extends C101064wu {
    public AnonymousClass17Y A00;
    public C19730wQ A01;
    public boolean A02;

    public void A2F() {
        if (!this.A02) {
            this.A02 = true;
            C18800tq A0B = C36331k8.A0B(this);
            this.A04 = C36341k9.A0Z(A0B);
            this.A00 = C36351kA.A0M(A0B);
            this.A01 = C36351kA.A0N(A0B);
        }
    }

    public LoginActivity(int i) {
        this.A02 = false;
        C163027pX.A00(this, 8);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle(R.string.f12nameremoved);
        setContentView((int) R.layout.f9nameremoved);
        boolean z = false;
        for (Account account : AccountManager.get(this).getAccounts()) {
            if ("com.whatsapp".contains(account.type)) {
                z = true;
            }
        }
        if (z) {
            this.A00.A06(R.string.f12nameremoved, 1);
        } else if (C36441kJ.A0n(this.A01) == null) {
            startActivity(AnonymousClass190.A09(this).putExtra("show_registration_first_dlg", true));
        } else {
            C36391kE.A1Q(new C106925Lw(this, this), this.A04);
            return;
        }
        finish();
    }

    public LoginActivity() {
        this(0);
    }
}
