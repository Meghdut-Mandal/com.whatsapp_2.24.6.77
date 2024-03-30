package com.whatsapp.businessdirectory.view.fragment;

import X.AnonymousClass593;
import X.AnonymousClass5DV;
import X.C009504a;
import X.C009904e;
import X.C010104g;
import X.C012005e;
import X.C1258661p;
import X.C142616pA;
import X.C143576qm;
import X.C165157sy;
import X.C165397tM;
import X.C19420v0;
import X.C36441kJ;
import X.C90504aG;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import com.whatsapp.businessdirectory.viewmodel.LocationOptionPickerViewModel;

public class LocationOptionPickerFragment extends Hilt_LocationOptionPickerFragment {
    public AnonymousClass5DV A00;
    public C1258661p A01;
    public C143576qm A02;
    public LocationOptionPickerViewModel A03;
    public C19420v0 A04;
    public RecyclerView A05;
    public final C009904e A06 = BnD(new C165397tM(this, 3), new C009504a());
    public final C009904e A07 = BnD(new C165397tM(this, 2), new C009504a());
    public final C009904e A08 = BnD(new C165397tM(this, 4), new C010104g());

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        int i = 0;
        View inflate = layoutInflater.inflate(R.layout.f9nameremoved, viewGroup, false);
        RecyclerView A0J = C90504aG.A0J(inflate, R.id.rv_location_options);
        this.A05 = A0J;
        A0J.setAdapter(this.A00);
        View A022 = C012005e.A02(inflate, R.id.view_handle);
        if (A1o()) {
            i = 8;
        }
        A022.setVisibility(i);
        this.A03.A00.A08(this, new C165157sy(this, 39));
        this.A03.A07.A08(this, new C165157sy(this, 38));
        Bundle bundle2 = this.A0A;
        if (bundle2 != null) {
            LocationOptionPickerViewModel locationOptionPickerViewModel = this.A03;
            int i2 = bundle2.getInt("source", -1);
            C142616pA r4 = locationOptionPickerViewModel.A01;
            Integer valueOf = Integer.valueOf(i2);
            Integer A032 = locationOptionPickerViewModel.A03.A03();
            AnonymousClass593 r1 = new AnonymousClass593();
            r1.A0C = 35;
            r1.A0F = valueOf;
            r1.A09 = A032;
            C142616pA.A01(r4, r1);
        }
        return inflate;
    }

    public void A1Q(Bundle bundle) {
        super.A1Q(bundle);
        this.A03 = (LocationOptionPickerViewModel) C36441kJ.A0b(this).A00(LocationOptionPickerViewModel.class);
    }
}
