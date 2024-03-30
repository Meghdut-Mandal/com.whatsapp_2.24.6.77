package com.whatsapp.backup.encryptedbackup;

import X.AnonymousClass00C;
import X.AnonymousClass04R;
import X.AnonymousClass6IP;
import X.C135426cg;
import X.C36331k8;
import X.C36361kB;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.base.WaFragment;

public final class ConfirmDisableFragment extends WaFragment {
    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        AnonymousClass00C.A0D(layoutInflater, 0);
        return layoutInflater.inflate(R.layout.f9nameremoved, viewGroup, false);
    }

    public void A1S(Bundle bundle, View view) {
        AnonymousClass00C.A0D(view, 0);
        super.A1Q(bundle);
        AnonymousClass04R A0A = C36331k8.A0A(this);
        AnonymousClass6IP.A00(new C135426cg(A0A, 2), C36361kB.A0G(view, R.id.confirm_disable_disable_button));
        AnonymousClass6IP.A00(new C135426cg(A0A, 1), C36361kB.A0G(view, R.id.confirm_disable_cancel_button));
    }
}
