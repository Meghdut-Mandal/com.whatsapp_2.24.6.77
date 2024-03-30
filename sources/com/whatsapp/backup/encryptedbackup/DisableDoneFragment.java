package com.whatsapp.backup.encryptedbackup;

import X.AnonymousClass00C;
import X.AnonymousClass297;
import X.C012005e;
import X.C222013h;
import X.C36331k8;
import X.C36401kF;
import X.C48732hx;
import X.C53272r3;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.base.WaFragment;

public final class DisableDoneFragment extends WaFragment {
    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        AnonymousClass00C.A0D(layoutInflater, 0);
        return layoutInflater.inflate(R.layout.f9nameremoved, viewGroup, false);
    }

    public void A1S(Bundle bundle, View view) {
        AnonymousClass00C.A0D(view, 0);
        super.A1Q(bundle);
        C48732hx.A00(C012005e.A02(view, R.id.disable_done_done_button), C36331k8.A0A(this), 9);
        if (C222013h.A05) {
            C53272r3.A00(A0a(), C36401kF.A0G(view, R.id.disable_done_image), AnonymousClass297.A00);
        }
    }
}
