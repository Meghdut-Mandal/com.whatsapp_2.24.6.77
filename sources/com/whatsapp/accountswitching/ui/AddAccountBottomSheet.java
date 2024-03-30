package com.whatsapp.accountswitching.ui;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass00C;
import X.AnonymousClass3YD;
import X.AnonymousClass6TO;
import X.C36331k8;
import X.C36361kB;
import X.C36371kC;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.util.Log;

public final class AddAccountBottomSheet extends Hilt_AddAccountBottomSheet {
    public int A00;
    public AnonymousClass6TO A01;
    public AnonymousClass005 A02;
    public String A03;

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        AnonymousClass00C.A0D(layoutInflater, 0);
        return C36371kC.A0J(layoutInflater, viewGroup, R.layout.f9nameremoved, false);
    }

    public void A1S(Bundle bundle, View view) {
        AnonymousClass00C.A0D(view, 0);
        super.A1S(bundle, view);
        Log.i("AddAccountBottomSheet/onViewCreated");
        Bundle bundle2 = this.A0A;
        if (bundle2 == null) {
            bundle2 = AnonymousClass001.A07();
        }
        this.A00 = bundle2.getInt("source", 0);
        Bundle bundle3 = this.A0A;
        if (bundle3 == null) {
            bundle3 = AnonymousClass001.A07();
        }
        this.A03 = bundle3.getString("landing_screen");
        AnonymousClass3YD.A00(C36361kB.A0G(view, R.id.add_account_companion_container), this, 0, true);
        C36361kB.A0G(view, R.id.add_account_regular_container).setOnClickListener(new AnonymousClass3YD(0, this, false));
        AnonymousClass6TO r3 = this.A01;
        if (r3 != null) {
            r3.A02((Boolean) null, this.A00, 27);
            return;
        }
        throw C36331k8.A0d("accountSwitchingLogger");
    }

    public void onDismiss(DialogInterface dialogInterface) {
        AnonymousClass00C.A0D(dialogInterface, 0);
        super.onDismiss(dialogInterface);
        Log.i("AddAccountBottomSheet/onDismiss");
        AnonymousClass6TO r3 = this.A01;
        if (r3 != null) {
            r3.A02((Boolean) null, this.A00, 28);
            return;
        }
        throw C36331k8.A0d("accountSwitchingLogger");
    }
}
