package com.whatsapp.businessdirectory.view.fragment;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass01I;
import X.AnonymousClass01N;
import X.AnonymousClass02E;
import X.AnonymousClass08M;
import X.AnonymousClass1N2;
import X.AnonymousClass1QW;
import X.AnonymousClass5DV;
import X.AnonymousClass60Q;
import X.AnonymousClass60R;
import X.AnonymousClass66G;
import X.AnonymousClass6QG;
import X.AnonymousClass6QK;
import X.C001700s;
import X.C02380Ab;
import X.C121385t3;
import X.C129006Eo;
import X.C134986bw;
import X.C142646pD;
import X.C143466qb;
import X.C143576qm;
import X.C1497172m;
import X.C160407kx;
import X.C160617lI;
import X.C162877pI;
import X.C165157sy;
import X.C28201Rs;
import X.C33751fs;
import X.C33771fu;
import X.C36321k7;
import X.C36361kB;
import X.C36421kH;
import X.C36441kJ;
import X.C88434Sr;
import X.C90504aG;
import X.C95434kv;
import X.C96194mw;
import X.C96464nN;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import com.whatsapp.businessdirectory.util.DirectoryGPSLocationManager;
import com.whatsapp.businessdirectory.util.LocationUpdateListener;
import com.whatsapp.businessdirectory.view.activity.BusinessDirectoryActivity;
import com.whatsapp.businessdirectory.view.custom.FilterBottomSheetDialogFragment;
import com.whatsapp.businessdirectory.viewmodel.BusinessDirectoryContextualSearchViewModel;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class BusinessDirectoryContextualSearchFragment extends Hilt_BusinessDirectoryContextualSearchFragment implements C160617lI, C160407kx, C88434Sr {
    public AnonymousClass60Q A00;
    public AnonymousClass60R A01;
    public C33771fu A02;
    public C142646pD A03;
    public AnonymousClass66G A04;
    public LocationUpdateListener A05;
    public AnonymousClass5DV A06;
    public C143576qm A07;
    public BusinessDirectoryContextualSearchViewModel A08;
    public C33751fs A09;
    public AnonymousClass1QW A0A;
    public C96464nN A0B;
    public AnonymousClass1N2 A0C;
    public DirectoryGPSLocationManager A0D;

    public void A1A(Bundle bundle) {
        this.A0Y = true;
        A00(this).A05 = this;
        AnonymousClass02E A0N = A0k().A0N("filter-bottom-sheet");
        if (A0N != null) {
            ((FilterBottomSheetDialogFragment) A0N).A02 = this;
        }
        this.A07.A00();
    }

    public void A1R(Bundle bundle) {
        BusinessDirectoryContextualSearchViewModel businessDirectoryContextualSearchViewModel = this.A08;
        AnonymousClass08M r2 = businessDirectoryContextualSearchViewModel.A0I;
        r2.A03("saved_search_session_started", Boolean.valueOf(businessDirectoryContextualSearchViewModel.A05));
        r2.A03("saved_search_state", Integer.valueOf(businessDirectoryContextualSearchViewModel.A01));
        r2.A03("saved_search_query", BusinessDirectoryContextualSearchViewModel.A03(businessDirectoryContextualSearchViewModel));
        r2.A03("search_context_category", businessDirectoryContextualSearchViewModel.A02);
        businessDirectoryContextualSearchViewModel.A0T.A0A(r2);
        r2.A03("SEARCH_CONTEXT_CATEGORY_EXISTS", Boolean.valueOf(AnonymousClass000.A1V(businessDirectoryContextualSearchViewModel.A02)));
        r2.A03("saved_state_query_id", businessDirectoryContextualSearchViewModel.A0K.A00);
    }

    public void B7F() {
        this.A08.A0V.A00.A0F();
    }

    public void BSI() {
        this.A08.A0T(62);
    }

    public void BWz() {
        this.A08.A0V.A04();
    }

    public void BaD() {
        C143466qb r2 = this.A08.A0V;
        r2.A05.A02(true);
        r2.A00.A0F();
    }

    public void BaH() {
        this.A08.A0V.A05();
    }

    public void BaI() {
        this.A08.BaJ();
    }

    public void BaK(C121385t3 r2) {
        this.A08.A0V.A07(r2);
    }

    public void BbF(Set set) {
        BusinessDirectoryContextualSearchViewModel businessDirectoryContextualSearchViewModel = this.A08;
        AnonymousClass6QK r0 = businessDirectoryContextualSearchViewModel.A0T;
        r0.A01 = set;
        businessDirectoryContextualSearchViewModel.A0M.A02((Boolean) null, C129006Eo.A00(businessDirectoryContextualSearchViewModel), r0.A06(), 46);
        String A032 = BusinessDirectoryContextualSearchViewModel.A03(businessDirectoryContextualSearchViewModel);
        if (A032 == null) {
            A032 = "";
        }
        BusinessDirectoryContextualSearchViewModel.A0F(businessDirectoryContextualSearchViewModel, A032, 1);
        this.A08.A0T(64);
    }

    public void Bcg(AnonymousClass6QG r3) {
        this.A08.BTX(0);
    }

    public void BfT() {
        this.A08.A0V.A00.A0F();
    }

    public void Bwx() {
        C95434kv r2 = this.A08.A0V.A00;
        C1497172m.A00(r2.A08, r2, 26);
    }

    public static BusinessDirectoryActivity A00(BusinessDirectoryContextualSearchFragment businessDirectoryContextualSearchFragment) {
        if (businessDirectoryContextualSearchFragment.A0i() instanceof BusinessDirectoryActivity) {
            return (BusinessDirectoryActivity) businessDirectoryContextualSearchFragment.A0i();
        }
        throw AnonymousClass001.A09("BusinessDirectorySearchFragment should be attached to BusinessDirectoryActivity");
    }

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C001700s r3;
        View inflate = layoutInflater.inflate(R.layout.f9nameremoved, viewGroup, false);
        RecyclerView A0J = C90504aG.A0J(inflate, R.id.contextual_search_list);
        A1D();
        C36321k7.A0Q(A0J);
        A0J.setAdapter(this.A06);
        this.A06.BnA(new C96194mw(A0J, this));
        C162877pI r0 = new C162877pI(this, 0);
        this.A0B = r0;
        A0J.A0v(r0);
        boolean A032 = this.A0A.A03();
        AnonymousClass01N r1 = this.A0P;
        if (A032) {
            r1.A04(this.A0D);
            DirectoryGPSLocationManager directoryGPSLocationManager = this.A0D;
            directoryGPSLocationManager.A02 = C36361kB.A0j();
            r3 = directoryGPSLocationManager.A04;
        } else {
            r1.A04(this.A05);
            r3 = this.A05.A00;
        }
        C02380Ab A0m = A0m();
        C143576qm r12 = this.A07;
        Objects.requireNonNull(r12);
        C165157sy.A00(A0m, r3, r12, 22);
        C165157sy.A00(A0m(), this.A08.A0G, this, 26);
        C165157sy.A00(A0m(), this.A08.A0H, this, 25);
        C165157sy.A00(A0m(), this.A08.A0E, this, 30);
        C165157sy.A00(A0m(), this.A08.A0a, this, 27);
        C165157sy.A00(A0m(), this.A08.A0b, this, 29);
        C165157sy.A00(A0m(), this.A08.A0F, this, 30);
        C165157sy.A00(A0m(), this.A08.A0d, this, 28);
        C165157sy.A00(A0m(), this.A08.A0c, this, 24);
        C28201Rs r32 = this.A08.A0Z;
        C02380Ab A0m2 = A0m();
        C143576qm r13 = this.A07;
        Objects.requireNonNull(r13);
        C165157sy.A00(A0m2, r32, r13, 23);
        return inflate;
    }

    public void A1H() {
        super.A1H();
        if (equals(A00(this).A05)) {
            A00(this).A05 = null;
        }
        this.A04.A01(this.A07);
        AnonymousClass01I A0h = A0h();
        if (A0h == null || A0h.isFinishing()) {
            this.A08.A0P.A00();
        }
    }

    public void A1L() {
        super.A1L();
        BusinessDirectoryContextualSearchViewModel businessDirectoryContextualSearchViewModel = this.A08;
        int i = businessDirectoryContextualSearchViewModel.A01;
        int i2 = 1;
        C142646pD r2 = businessDirectoryContextualSearchViewModel.A0M;
        Integer A002 = C129006Eo.A00(businessDirectoryContextualSearchViewModel);
        if (i == 1) {
            i2 = 2;
        }
        r2.A08(A002, (Integer) null, (Map) null, i2, i2, 0);
    }

    public void A1O(Context context) {
        super.A1O(context);
        A00(this).A05 = this;
    }

    public void A1Q(Bundle bundle) {
        super.A1Q(bundle);
        this.A0D = this.A00.A00(this.A03);
        this.A08 = (BusinessDirectoryContextualSearchViewModel) C36441kJ.A0b(this).A00(BusinessDirectoryContextualSearchViewModel.class);
        C143576qm A002 = this.A01.A00(this, this.A0D, this.A05, this);
        this.A07 = A002;
        this.A04.A00(A002);
        Bundle bundle2 = this.A0A;
        if (bundle2 != null && (bundle2.getParcelable("SEARCH_CONTEXT_CATEGORY") instanceof C134986bw)) {
            C134986bw r5 = (C134986bw) this.A0A.getParcelable("SEARCH_CONTEXT_CATEGORY");
            BusinessDirectoryContextualSearchViewModel businessDirectoryContextualSearchViewModel = this.A08;
            AnonymousClass08M r3 = businessDirectoryContextualSearchViewModel.A0I;
            if (!(!r3.A03.containsKey("search_context_category"))) {
                r5 = (C134986bw) r3.A03.get("search_context_category");
            }
            businessDirectoryContextualSearchViewModel.A02 = r5;
            if (r5 != null) {
                businessDirectoryContextualSearchViewModel.A0T.A01 = C36421kH.A0g(new C134986bw[]{r5});
            }
        }
    }
}
