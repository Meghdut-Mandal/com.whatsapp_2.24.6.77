package com.whatsapp.businessdirectory.view.custom;

import X.AnonymousClass04H;
import X.AnonymousClass08M;
import X.C012005e;
import X.C33541fX;
import X.C36361kB;
import X.C36391kE;
import X.C36441kJ;
import X.C39421sF;
import X.C39461sN;
import X.C40541vi;
import X.C48892iE;
import X.C55492ui;
import X.C58122zM;
import X.C88434Sr;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;

public class FilterBottomSheetDialogFragment extends Hilt_FilterBottomSheetDialogFragment {
    public C58122zM A00;
    public C40541vi A01;
    public C88434Sr A02 = null;
    public C39461sN A03;
    public final C33541fX A04 = new C48892iE(this, 6);

    public void A1Q(Bundle bundle) {
        super.A1Q(bundle);
        this.A03 = (C39461sN) new AnonymousClass04H(new C39421sF(bundle, this, this.A00, A0b().getParcelableArrayList("arg-categories"), A0b().getParcelableArrayList("arg-selected-categories")), this).A00(C39461sN.class);
    }

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        int i = 0;
        View inflate = layoutInflater.inflate(R.layout.f9nameremoved, viewGroup, false);
        View A022 = C012005e.A02(inflate, R.id.view_handle);
        if (A1o()) {
            i = 8;
        }
        A022.setVisibility(i);
        C36361kB.A18(C012005e.A02(inflate, R.id.iv_close), this, 42);
        C36391kE.A0O(inflate, R.id.tv_title).setText(R.string.f12nameremoved);
        this.A01 = new C40541vi(this);
        C36441kJ.A0c(inflate, R.id.rv_categories).setAdapter(this.A01);
        C55492ui.A01(A0m(), this.A03.A01, this, 41);
        View A023 = C012005e.A02(inflate, R.id.btn_clear);
        C33541fX r1 = this.A04;
        A023.setOnClickListener(r1);
        C012005e.A02(inflate, R.id.btn_apply).setOnClickListener(r1);
        return inflate;
    }

    public void A1R(Bundle bundle) {
        super.A1R(bundle);
        C39461sN r3 = this.A03;
        AnonymousClass08M r2 = r3.A02;
        r2.A03("saved_all_categories", r3.A00);
        r2.A03("saved_selected_categories", C36441kJ.A15(r3.A03));
    }
}
