package com.whatsapp.businessdirectory.view.fragment;

import X.AnonymousClass00F;
import X.C012005e;
import X.C16550pQ;
import X.C36361kB;
import X.C36441kJ;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.whatsapp.R;
import com.whatsapp.RoundedBottomSheetDialogFragment;
import com.whatsapp.businessdirectory.viewmodel.BusinessDirectoryEducationNuxViewModel;

public class BusinessDirectoryEducationNuxFragment extends RoundedBottomSheetDialogFragment implements C16550pQ {
    public BusinessDirectoryEducationNuxViewModel A00;

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View A0E = C36361kB.A0E(layoutInflater, viewGroup, R.layout.f9nameremoved);
        C012005e.A0F(AnonymousClass00F.A04(A0a(), R.color.f6nameremoved), A0E);
        View A02 = C012005e.A02(A0E, R.id.btn_continue);
        C36361kB.A18(C012005e.A02(A0E, R.id.nux_close_button), this, 45);
        C36361kB.A18(A02, this, 46);
        return A0E;
    }

    public void A1Q(Bundle bundle) {
        super.A1Q(bundle);
        this.A00 = (BusinessDirectoryEducationNuxViewModel) C36441kJ.A0b(this).A00(BusinessDirectoryEducationNuxViewModel.class);
    }

    public void A1n(View view) {
        super.A1n(view);
        BottomSheetBehavior.A02(view).A0d(true);
    }
}
