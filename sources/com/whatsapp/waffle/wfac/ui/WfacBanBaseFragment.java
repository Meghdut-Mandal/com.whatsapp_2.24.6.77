package com.whatsapp.waffle.wfac.ui;

import X.AnonymousClass00C;
import X.AnonymousClass3TI;
import X.C20810yC;
import X.C21060yb;
import X.C24801Dv;
import X.C32681e1;
import X.C36331k8;
import X.C36341k9;
import X.C36381kD;
import X.C36391kE;
import X.C62273Fm;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.base.WaFragment;

public abstract class WfacBanBaseFragment extends WaFragment {
    public C24801Dv A00;
    public C21060yb A01;
    public C20810yC A02;
    public C32681e1 A03;
    public C62273Fm A04;
    public WfacBanViewModel A05;

    public void A1S(Bundle bundle, View view) {
        AnonymousClass00C.A0D(view, 0);
        this.A05 = (WfacBanViewModel) C36381kD.A0P(this).A00(WfacBanViewModel.class);
    }

    public final C62273Fm A1Z() {
        C62273Fm r0 = this.A04;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("wfacLogger");
    }

    public void A1U(Menu menu, MenuInflater menuInflater) {
        C36331k8.A1I(menu, menuInflater);
        AnonymousClass3TI.A01("WfacBanBaseFragment/onCreateOptionsMenu/add register new number menu item");
        C36391kE.A1F(menu, 101, R.string.f12nameremoved);
    }

    public boolean A1X(MenuItem menuItem) {
        StringBuilder A0i = C36341k9.A0i(menuItem);
        A0i.append("WfacBanBaseFragment/onOptionsItemSelected/option item : ");
        AnonymousClass3TI.A01(C36381kD.A10(A0i, menuItem.getItemId()));
        if (menuItem.getItemId() != 101) {
            return false;
        }
        WfacBanViewModel wfacBanViewModel = this.A05;
        if (wfacBanViewModel == null) {
            throw C36331k8.A0d("viewModel");
        }
        wfacBanViewModel.A0U(A0i());
        C62273Fm A1Z = A1Z();
        WfacBanViewModel wfacBanViewModel2 = this.A05;
        if (wfacBanViewModel2 == null) {
            throw C36331k8.A0d("viewModel");
        }
        int A0S = wfacBanViewModel2.A0S();
        WfacBanViewModel wfacBanViewModel3 = this.A05;
        if (wfacBanViewModel3 == null) {
            throw C36331k8.A0d("viewModel");
        }
        A1Z.A01("reg_new_number_started", A0S, wfacBanViewModel3.A00);
        return true;
    }
}
