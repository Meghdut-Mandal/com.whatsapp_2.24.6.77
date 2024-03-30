package com.whatsapp.businessapisearch.view.fragment;

import X.AnonymousClass001;
import X.AnonymousClass04H;
import X.AnonymousClass08S;
import X.AnonymousClass0UE;
import X.AnonymousClass1N2;
import X.AnonymousClass5DU;
import X.AnonymousClass5E8;
import X.AnonymousClass625;
import X.C115835jW;
import X.C162517oi;
import X.C165157sy;
import X.C20810yC;
import X.C36341k9;
import X.C90504aG;
import X.C95324ka;
import X.C95384kj;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import com.whatsapp.businessapisearch.view.activity.BusinessApiSearchActivity;
import java.util.ArrayList;

public class BusinessApiHomeFragment extends Hilt_BusinessApiHomeFragment {
    public RecyclerView A00;
    public C115835jW A01;
    public AnonymousClass5DU A02;
    public C95384kj A03;
    public C20810yC A04;
    public AnonymousClass625 A05;
    public AnonymousClass1N2 A06;
    public final AnonymousClass0UE A07 = new C162517oi(this, 4);

    public void A1A(Bundle bundle) {
        this.A0Y = true;
        A1Y().A03 = this;
    }

    public void A1Q(Bundle bundle) {
        super.A1Q(bundle);
        int i = A0b().getInt("arg_home_view_state");
        C95384kj r0 = (C95384kj) new AnonymousClass04H(new C95324ka(bundle, this, this.A01, A0b().getString("entrypoint_type"), i), this).A00(C95384kj.class);
        this.A03 = r0;
        r0.A0I.A08(this, new C165157sy(this, 4));
        this.A03.A06.A08(this, new C165157sy(this, 3));
    }

    public void A1R(Bundle bundle) {
        C95384kj r0 = this.A03;
        r0.A07.A03("arg_home_view_state", Integer.valueOf(r0.A00));
    }

    public void A1Z() {
        C95384kj r5 = this.A03;
        if (r5.A00 == 0) {
            r5.A00 = 1;
            AnonymousClass08S r4 = r5.A05;
            if (r4.A04() != null) {
                ArrayList A0t = C90504aG.A0t(r4);
                if (A0t.isEmpty() || !(A0t.get(0) instanceof AnonymousClass5E8)) {
                    A0t.add(0, new AnonymousClass5E8(r5.A01));
                }
                C36341k9.A16(r5.A0I, 3);
                r4.A0D(A0t);
                return;
            }
            return;
        }
        C36341k9.A17(r5.A0I, 4);
    }

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.f9nameremoved, viewGroup, false);
        RecyclerView A0J = C90504aG.A0J(inflate, R.id.home_list);
        this.A00 = A0J;
        A0J.setPadding(A0J.getPaddingLeft(), 0, this.A00.getPaddingRight(), this.A00.getPaddingBottom());
        A1D();
        this.A00.setLayoutManager(new LinearLayoutManager(1));
        if (A0b().getInt("arg_home_view_state") == 1) {
            this.A00.A0v(this.A07);
        }
        this.A00.setAdapter(this.A02);
        C165157sy.A00(A0m(), this.A03.A05, this, 5);
        C165157sy.A00(A0m(), this.A03.A0C.A01, this, 2);
        return inflate;
    }

    public void A1H() {
        super.A1H();
        A1Y().A03 = null;
    }

    public void A1O(Context context) {
        super.A1O(context);
        A1Y().A03 = this;
    }

    public BusinessApiSearchActivity A1Y() {
        if (A0i() instanceof BusinessApiSearchActivity) {
            return (BusinessApiSearchActivity) A0i();
        }
        throw AnonymousClass001.A09("BusinessApiHomeFragment should be attached to BusinessApiSearchActivity");
    }
}
