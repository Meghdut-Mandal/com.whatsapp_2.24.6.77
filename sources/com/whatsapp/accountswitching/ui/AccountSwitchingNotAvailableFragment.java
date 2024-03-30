package com.whatsapp.accountswitching.ui;

import X.AnonymousClass00C;
import X.AnonymousClass6TO;
import X.C19420v0;
import X.C36331k8;
import X.C36341k9;
import X.C36371kC;
import X.C36391kE;
import X.C66923Xv;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.util.Log;

public final class AccountSwitchingNotAvailableFragment extends Hilt_AccountSwitchingNotAvailableFragment {
    public AnonymousClass6TO A00;
    public C19420v0 A01;

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        AnonymousClass00C.A0D(layoutInflater, 0);
        return layoutInflater.inflate(R.layout.f9nameremoved, viewGroup, false);
    }

    public void A1S(Bundle bundle, View view) {
        AnonymousClass00C.A0D(view, 0);
        super.A1S(bundle, view);
        Log.i("AccountSwitchingNotAvailableFragment/dialog shown");
        View findViewById = view.findViewById(R.id.account_switching_notify_me_button);
        View findViewById2 = view.findViewById(R.id.account_switching_dismiss_button);
        C19420v0 r0 = this.A01;
        if (r0 != null) {
            if (C36371kC.A1U(C36341k9.A0E(r0), "notify_account_switching_available")) {
                C36391kE.A0P(view, R.id.account_switching_not_available_subtitle).setText(R.string.f12nameremoved);
                AnonymousClass00C.A0B(findViewById);
                findViewById.setVisibility(8);
            } else {
                C66923Xv.A01(findViewById, this, 29);
            }
            C66923Xv.A01(findViewById2, this, 28);
            AnonymousClass6TO r3 = this.A00;
            if (r3 != null) {
                r3.A02((Boolean) null, 7, 20);
                return;
            }
            throw C36331k8.A0d("accountSwitchingLogger");
        }
        throw C36331k8.A0d("waSharedPreferences");
    }

    public static final void A03(AccountSwitchingNotAvailableFragment accountSwitchingNotAvailableFragment) {
        Log.i("AccountSwitchingNotAvailableFragment/actionButton clicked");
        C19420v0 r0 = accountSwitchingNotAvailableFragment.A01;
        if (r0 != null) {
            C36331k8.A0w(C19420v0.A00(r0), "notify_account_switching_available", true);
            AnonymousClass6TO r3 = accountSwitchingNotAvailableFragment.A00;
            if (r3 != null) {
                r3.A02((Boolean) null, 7, 22);
                super.A1c();
                return;
            }
            throw C36331k8.A0d("accountSwitchingLogger");
        }
        throw C36331k8.A0d("waSharedPreferences");
    }

    public void onCancel(DialogInterface dialogInterface) {
        AnonymousClass6TO r3 = this.A00;
        if (r3 != null) {
            r3.A02((Boolean) null, 7, 21);
            A1c();
            return;
        }
        throw C36331k8.A0d("accountSwitchingLogger");
    }
}
