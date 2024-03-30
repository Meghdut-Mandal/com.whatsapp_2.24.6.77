package com.whatsapp.picker.search;

import X.AnonymousClass00C;
import X.AnonymousClass01I;
import X.AnonymousClass15D;
import X.AnonymousClass1RC;
import X.AnonymousClass2M8;
import X.AnonymousClass4ZV;
import X.C133356Xz;
import X.C224314h;
import X.C36331k8;
import X.C78053rU;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;

public abstract class PickerSearchDialogFragment extends Hilt_PickerSearchDialogFragment {
    public C78053rU A00;

    public void onDismiss(DialogInterface dialogInterface) {
        AnonymousClass2M8 r0;
        AnonymousClass00C.A0D(dialogInterface, 0);
        super.onDismiss(dialogInterface);
        C78053rU r2 = this.A00;
        if (r2 != null) {
            r2.A06 = false;
            if (r2.A07 && (r0 = r2.A00) != null) {
                r0.A0E();
            }
            r2.A03 = null;
            C133356Xz r02 = r2.A09;
            if (r02 != null) {
                r02.A00 = null;
                C36331k8.A1E(r02.A02);
            }
        }
        this.A00 = null;
    }

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        AnonymousClass15D r2;
        AnonymousClass01I A0h = A0h();
        if ((A0h instanceof AnonymousClass15D) && (r2 = (AnonymousClass15D) A0h) != null) {
            r2.Bch(this);
        }
        return null;
    }

    public void A1Q(Bundle bundle) {
        super.A1Q(bundle);
        A1d(0, R.style.f13nameremoved);
    }

    public Dialog A1a(Bundle bundle) {
        Dialog A1a = super.A1a(bundle);
        AnonymousClass00C.A08(A1a);
        AnonymousClass1RC.A02(C224314h.A01(A1D(), R.attr.f4nameremoved), A1a);
        A1a.setOnKeyListener(new AnonymousClass4ZV(this, 3));
        return A1a;
    }
}
