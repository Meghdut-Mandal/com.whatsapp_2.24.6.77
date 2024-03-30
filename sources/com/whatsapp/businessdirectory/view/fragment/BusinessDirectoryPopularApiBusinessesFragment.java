package com.whatsapp.businessdirectory.view.fragment;

import X.AnonymousClass00C;
import X.AnonymousClass01I;
import X.AnonymousClass7SF;
import X.C165157sy;
import X.C36321k7;
import X.C36331k8;
import X.C36441kJ;
import X.C90504aG;
import X.C95884mR;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import com.whatsapp.businessdirectory.viewmodel.BusinessDirectoryPopularApiBusinessesViewModel;

public final class BusinessDirectoryPopularApiBusinessesFragment extends Hilt_BusinessDirectoryPopularApiBusinessesFragment {
    public BusinessDirectoryPopularApiBusinessesViewModel A00;
    public C95884mR A01;
    public RecyclerView A02;

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        AnonymousClass00C.A0D(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.f9nameremoved, viewGroup, false);
        RecyclerView A0J = C90504aG.A0J(inflate, R.id.search_list);
        this.A02 = A0J;
        if (A0J != null) {
            A1D();
            C36321k7.A0Q(A0J);
        }
        RecyclerView recyclerView = this.A02;
        if (recyclerView != null) {
            C95884mR r0 = this.A01;
            if (r0 != null) {
                recyclerView.setAdapter(r0);
            } else {
                throw C36331k8.A0d("directoryListAdapter");
            }
        }
        BusinessDirectoryPopularApiBusinessesViewModel businessDirectoryPopularApiBusinessesViewModel = this.A00;
        if (businessDirectoryPopularApiBusinessesViewModel != null) {
            C165157sy.A00(A0m(), businessDirectoryPopularApiBusinessesViewModel.A00, new AnonymousClass7SF(this), 31);
            AnonymousClass01I A0h = A0h();
            if (A0h != null) {
                A0h.setTitle(R.string.f12nameremoved);
            }
            AnonymousClass00C.A0B(inflate);
            return inflate;
        }
        throw C36331k8.A0a();
    }

    public void A1Q(Bundle bundle) {
        super.A1Q(bundle);
        BusinessDirectoryPopularApiBusinessesViewModel businessDirectoryPopularApiBusinessesViewModel = (BusinessDirectoryPopularApiBusinessesViewModel) C36441kJ.A0b(this).A00(BusinessDirectoryPopularApiBusinessesViewModel.class);
        AnonymousClass00C.A0D(businessDirectoryPopularApiBusinessesViewModel, 0);
        this.A00 = businessDirectoryPopularApiBusinessesViewModel;
    }
}
