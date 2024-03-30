package com.whatsapp.backup.encryptedbackup;

import X.AnonymousClass000;
import X.AnonymousClass00C;
import X.AnonymousClass298;
import X.AnonymousClass3LW;
import X.AnonymousClass3T3;
import X.AnonymousClass4IU;
import X.AnonymousClass4IV;
import X.C001700s;
import X.C012005e;
import X.C21060yb;
import X.C222013h;
import X.C36321k7;
import X.C36331k8;
import X.C36371kC;
import X.C36401kF;
import X.C39001qm;
import X.C48732hx;
import X.C53272r3;
import X.C55492ui;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;

public final class EnableDoneFragment extends Hilt_EnableDoneFragment {
    public C21060yb A00;

    public static final void A00(EnableDoneFragment enableDoneFragment, int i) {
        int i2 = R.string.f12nameremoved;
        if (i != 4) {
            if (i == 8) {
                i2 = R.string.f12nameremoved;
            } else {
                return;
            }
        }
        String A0n = enableDoneFragment.A0n(i2);
        C39001qm A05 = AnonymousClass3LW.A05(enableDoneFragment);
        C39001qm.A0A(A05, A0n);
        C36371kC.A0O(A05).show();
        C21060yb r0 = enableDoneFragment.A00;
        if (r0 != null) {
            AnonymousClass3T3.A03(r0);
            C36321k7.A1Q("encb/EnableDoneFragment/error modal shown with message: ", A0n, AnonymousClass000.A0u());
            return;
        }
        throw C36331k8.A0W();
    }

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        AnonymousClass00C.A0D(layoutInflater, 0);
        return layoutInflater.inflate(R.layout.f9nameremoved, viewGroup, false);
    }

    public void A1S(Bundle bundle, View view) {
        AnonymousClass00C.A0D(view, 0);
        super.A1Q(bundle);
        EncBackupViewModel encBackupViewModel = (EncBackupViewModel) C36331k8.A0A(this);
        C48732hx.A00(C012005e.A02(view, R.id.enable_done_create_button), encBackupViewModel, 10);
        C001700s r3 = encBackupViewModel.A04;
        C55492ui.A01(A0m(), r3, new AnonymousClass4IU(this), 7);
        C48732hx.A00(C012005e.A02(view, R.id.enable_done_cancel_button), encBackupViewModel, 11);
        C55492ui.A01(A0m(), r3, new AnonymousClass4IV(this), 6);
        if (C222013h.A05) {
            C53272r3.A00(A0a(), C36401kF.A0G(view, R.id.enable_done_image), AnonymousClass298.A00);
        }
    }
}
