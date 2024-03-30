package com.google.android.material.bottomsheet;

import X.AnonymousClass0FL;
import android.app.Dialog;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatDialogFragment;
import androidx.fragment.app.DialogFragment;

public abstract class BottomSheetDialogFragment extends AppCompatDialogFragment {
    public void A1b() {
        Dialog dialog = this.A02;
        if (dialog instanceof AnonymousClass0FL) {
            AnonymousClass0FL r1 = (AnonymousClass0FL) dialog;
            if (r1.A01 == null) {
                AnonymousClass0FL.A01(r1);
            }
        }
        DialogFragment.A00(this, false, false);
    }

    public void A1c() {
        Dialog dialog = this.A02;
        if (dialog instanceof AnonymousClass0FL) {
            AnonymousClass0FL r1 = (AnonymousClass0FL) dialog;
            if (r1.A01 == null) {
                AnonymousClass0FL.A01(r1);
            }
        }
        super.A1c();
    }

    public Dialog A1a(Bundle bundle) {
        return new AnonymousClass0FL(A1D(), A1Y());
    }

    public BottomSheetDialogFragment(int i) {
        super(i);
    }

    public BottomSheetDialogFragment() {
    }
}
