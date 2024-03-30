package com.whatsapp.status.grid;

import X.AnonymousClass000;
import X.AnonymousClass00C;
import X.C36341k9;
import X.C36371kC;
import X.C36381kD;
import X.C36441kJ;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import com.whatsapp.WaTextView;
import com.whatsapp.base.WaFragment;

public final class StatusGridPageFragment extends WaFragment {
    public int A00 = -1;
    public RecyclerView A01;

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        AnonymousClass00C.A0D(layoutInflater, 0);
        return layoutInflater.inflate(R.layout.f9nameremoved, viewGroup);
    }

    public void A1J() {
        this.A01 = null;
        super.A1J();
    }

    public void A1R(Bundle bundle) {
        AnonymousClass00C.A0D(bundle, 0);
        bundle.putInt("page_index", this.A00);
    }

    public void A1S(Bundle bundle, View view) {
        int i;
        ViewGroup viewGroup;
        AnonymousClass00C.A0D(view, 0);
        this.A01 = C36441kJ.A0c(view, R.id.status_list);
        if (bundle != null) {
            i = bundle.getInt("page_index");
        } else {
            i = A0b().getInt("page_index", -1);
        }
        this.A00 = i;
        if ((view instanceof ViewGroup) && (viewGroup = (ViewGroup) view) != null) {
            WaTextView waTextView = new WaTextView(C36371kC.A0B(viewGroup));
            waTextView.setTextSize(C36441kJ.A00(C36341k9.A0F(viewGroup), R.dimen.f7nameremoved));
            waTextView.setTextAlignment(4);
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("Status Page ");
            waTextView.setText(C36381kD.A10(A0u, this.A00));
            viewGroup.addView(waTextView);
        }
    }
}
