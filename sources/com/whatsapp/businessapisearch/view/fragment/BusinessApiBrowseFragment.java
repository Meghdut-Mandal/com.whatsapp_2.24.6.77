package com.whatsapp.businessapisearch.view.fragment;

import X.AnonymousClass001;
import X.AnonymousClass00C;
import X.AnonymousClass01I;
import X.AnonymousClass0CZ;
import X.AnonymousClass1JT;
import X.AnonymousClass5DU;
import X.AnonymousClass5DW;
import X.AnonymousClass5X0;
import X.AnonymousClass625;
import X.AnonymousClass6OF;
import X.AnonymousClass7S5;
import X.C115765jP;
import X.C1254960a;
import X.C1255760k;
import X.C134986bw;
import X.C162437oa;
import X.C165147sx;
import X.C165157sy;
import X.C18830tt;
import X.C32581dr;
import X.C32591ds;
import X.C36321k7;
import X.C36331k8;
import X.C36371kC;
import X.C90504aG;
import X.C95374ki;
import X.C96464nN;
import android.app.Application;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import com.whatsapp.businessapisearch.view.activity.BusinessApiSearchActivity;

public final class BusinessApiBrowseFragment extends Hilt_BusinessApiBrowseFragment {
    public static String A07 = "search_by_category";
    public static C95374ki A08;
    public static C134986bw A09;
    public static C96464nN A0A;
    public C115765jP A00;
    public C1255760k A01;
    public AnonymousClass5DU A02;
    public AnonymousClass6OF A03;
    public AnonymousClass625 A04;
    public String A05;
    public RecyclerView A06;

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        BusinessApiSearchActivity A002;
        AnonymousClass00C.A0D(layoutInflater, 0);
        View A0J = C36371kC.A0J(layoutInflater, viewGroup, R.layout.f9nameremoved, false);
        RecyclerView A0J2 = C90504aG.A0J(A0J, R.id.home_list);
        this.A06 = A0J2;
        String str = null;
        if (A0J2 != null) {
            A0J2.getContext();
            C36321k7.A0Q(A0J2);
            AnonymousClass5DU r0 = this.A02;
            if (r0 != null) {
                A0J2.setAdapter(r0);
                if (A09 != null) {
                    if ("search_by_category".equals(A07)) {
                        AnonymousClass5DW r02 = new AnonymousClass5DW();
                        A0A = r02;
                        A0J2.A0v(r02);
                    }
                    A002 = A00(this);
                    C134986bw r03 = A09;
                    if (r03 != null) {
                        str = r03.A01;
                    }
                } else {
                    A002 = A00(this);
                    str = A0n(R.string.f12nameremoved);
                }
                A002.setTitle(str);
            } else {
                throw C36331k8.A0d("listAdapter");
            }
        }
        C95374ki r04 = A08;
        if (r04 == null) {
            throw C36331k8.A0d("viewModel");
        }
        C165157sy.A00(A0m(), r04.A02, new AnonymousClass7S5(this), 0);
        C95374ki r05 = A08;
        if (r05 == null) {
            throw C36331k8.A0d("viewModel");
        }
        C165157sy.A00(A0m(), r05.A06, AnonymousClass5X0.A02(this, 12), 1);
        C95374ki r06 = A08;
        if (r06 == null) {
            throw C36331k8.A0d("viewModel");
        }
        C165147sx.A02(A0m(), r06.A03.A02, AnonymousClass5X0.A02(this, 13), 49);
        A00(this).A05.A01(new C162437oa(this, 0), A0m());
        A00(this).A3j();
        return A0J;
    }

    public void A1Q(Bundle bundle) {
        C134986bw r0;
        String string;
        Bundle bundle2 = this.A0A;
        String str = null;
        if (bundle2 != null) {
            r0 = (C134986bw) bundle2.getParcelable("INITIAL_API_CATEGORY");
        } else {
            r0 = null;
        }
        A09 = r0;
        Bundle bundle3 = this.A0A;
        if (bundle3 != null) {
            str = bundle3.getString("ENTRYPOINT_TYPE");
        }
        this.A05 = str;
        Bundle bundle4 = this.A0A;
        if (!(bundle4 == null || (string = bundle4.getString("API_BIZ_SEARCH_USE_CASE")) == null)) {
            A07 = string;
        }
        C115765jP r1 = this.A00;
        if (r1 != null) {
            String str2 = this.A05;
            C134986bw r8 = A09;
            String str3 = A07;
            Application A002 = AnonymousClass1JT.A00(r1.A00.A02.AfJ);
            C32591ds r2 = r1.A00;
            C18830tt r12 = r2.A02.A00;
            C95374ki r22 = new C95374ki(A002, (C1254960a) r12.A1e.get(), (C1255760k) r12.A0W.get(), C18830tt.A2J(r12), C32581dr.A0H(r2.A01), r8, (AnonymousClass6OF) r12.A0V.get(), str2, str3);
            A08 = r22;
            r22.A0S(A09);
            super.A1Q(bundle);
            return;
        }
        throw C36331k8.A0d("viewModelFactory");
    }

    public static final BusinessApiSearchActivity A00(BusinessApiBrowseFragment businessApiBrowseFragment) {
        if (businessApiBrowseFragment.A0i() instanceof BusinessApiSearchActivity) {
            AnonymousClass01I A0i = businessApiBrowseFragment.A0i();
            AnonymousClass00C.A0E(A0i, "null cannot be cast to non-null type com.whatsapp.businessapisearch.view.activity.BusinessApiSearchActivity");
            return (BusinessApiSearchActivity) A0i;
        }
        throw AnonymousClass001.A09("BusinessApiBrowseFragment should be attached to BusinessApiSearchActivity");
    }

    public void A1H() {
        super.A1H();
        this.A06 = null;
    }

    public void A1J() {
        super.A1J();
        RecyclerView recyclerView = this.A06;
        if (recyclerView != null) {
            C96464nN r0 = A0A;
            if (r0 != null) {
                recyclerView.A0w(r0);
            }
            C96464nN r1 = A0A;
            if (r1 != null) {
                RecyclerView recyclerView2 = this.A06;
                AnonymousClass00C.A0B(recyclerView2);
                recyclerView2.A0w(r1);
            }
            RecyclerView recyclerView3 = this.A06;
            AnonymousClass00C.A0B(recyclerView3);
            recyclerView3.setAdapter((AnonymousClass0CZ) null);
            this.A06 = null;
        }
    }
}
