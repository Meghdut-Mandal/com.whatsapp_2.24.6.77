package com.whatsapp.framework.alerts.ui;

import X.AnonymousClass001;
import X.AnonymousClass00C;
import X.AnonymousClass04H;
import X.AnonymousClass1EW;
import X.AnonymousClass4K5;
import X.AnonymousClass4ZE;
import X.C167977zV;
import X.C36331k8;
import X.C36361kB;
import X.C39531sb;
import X.C58242zY;
import X.C589131n;
import X.C66033Uk;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;

public final class AlertCardListFragment extends Hilt_AlertCardListFragment {
    public C58242zY A00;
    public AnonymousClass1EW A01;
    public C589131n A02;
    public C167977zV A03;
    public C39531sb A04;
    public RecyclerView A05;

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        AnonymousClass00C.A0D(layoutInflater, 0);
        return layoutInflater.inflate(R.layout.f9nameremoved, viewGroup, false);
    }

    public void A1S(Bundle bundle, View view) {
        AnonymousClass00C.A0D(view, 0);
        this.A05 = (RecyclerView) C36361kB.A0F(view, R.id.alert_card_list);
        C167977zV r1 = new C167977zV(this, AnonymousClass001.A0I());
        this.A03 = r1;
        RecyclerView recyclerView = this.A05;
        if (recyclerView == null) {
            throw C36331k8.A0d("alertsList");
        }
        recyclerView.setAdapter(r1);
    }

    public void A1L() {
        super.A1L();
        C39531sb r0 = this.A04;
        if (r0 == null) {
            throw C36331k8.A0d("alertListViewModel");
        }
        r0.A00.A0C(r0.A01.A04());
        C39531sb r02 = this.A04;
        if (r02 == null) {
            throw C36331k8.A0d("alertListViewModel");
        }
        C66033Uk.A00(this, r02.A00, new AnonymousClass4K5(this), 43);
    }

    public void A1Q(Bundle bundle) {
        super.A1Q(bundle);
        this.A04 = (C39531sb) new AnonymousClass04H(new AnonymousClass4ZE(this, 2), A0i()).A00(C39531sb.class);
    }
}
