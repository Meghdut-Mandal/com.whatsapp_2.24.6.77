package com.whatsapp.catalogcategory.view.fragment;

import X.AnonymousClass001;
import X.AnonymousClass00C;
import X.AnonymousClass00T;
import X.AnonymousClass97B;
import X.BA7;
import X.C001600r;
import X.C115875ja;
import X.C1503574y;
import X.C167947zS;
import X.C174378Wq;
import X.C187808yZ;
import X.C22142AhR;
import X.C22143AhS;
import X.C22368AlV;
import X.C22369AlW;
import X.C22370AlX;
import X.C24801Dv;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36431kI;
import X.C90514aH;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import com.whatsapp.catalogcategory.view.CategoryThumbnailLoader;
import com.whatsapp.catalogcategory.view.viewmodel.CatalogAllCategoryViewModel;
import java.util.ArrayList;

public final class CatalogAllCategoryFragment extends Hilt_CatalogAllCategoryFragment {
    public RecyclerView A00;
    public C24801Dv A01;
    public C115875ja A02;
    public C167947zS A03;
    public final AnonymousClass00T A04 = C36431kI.A1I(new C22142AhR(this));
    public final AnonymousClass00T A05 = C36431kI.A1I(new C22143AhS(this));

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        AnonymousClass00C.A0D(layoutInflater, 0);
        View A0Q = C90514aH.A0Q(layoutInflater, viewGroup, R.layout.f9nameremoved);
        RecyclerView recyclerView = (RecyclerView) C36361kB.A0G(A0Q, R.id.list_all_category);
        recyclerView.getContext();
        C36351kA.A1F(recyclerView, 1);
        recyclerView.A0U = true;
        this.A00 = recyclerView;
        C167947zS r1 = new C167947zS((CategoryThumbnailLoader) this.A04.getValue(), AnonymousClass97B.A00(this.A05.getValue(), 27));
        this.A03 = r1;
        RecyclerView recyclerView2 = this.A00;
        if (recyclerView2 == null) {
            throw C36331k8.A0d("recyclerView");
        }
        recyclerView2.setAdapter(r1);
        return A0Q;
    }

    public void A1S(Bundle bundle, View view) {
        AnonymousClass00C.A0D(view, 0);
        AnonymousClass00T r4 = this.A05;
        BA7.A01(A0m(), ((CatalogAllCategoryViewModel) r4.getValue()).A01, new C22368AlV(this), 36);
        BA7.A01(A0m(), ((CatalogAllCategoryViewModel) r4.getValue()).A00, new C22369AlW(this), 35);
        BA7.A01(A0m(), ((CatalogAllCategoryViewModel) r4.getValue()).A02, new C22370AlX(this), 34);
    }

    public void A1Q(Bundle bundle) {
        super.A1Q(bundle);
        String string = A0b().getString("parent_category_id");
        Parcelable parcelable = A0b().getParcelable("category_biz_id");
        String string2 = A0b().getString("category_display_context", "CATALOG_CATEGORY_FLOW");
        AnonymousClass00C.A0B(string2);
        C187808yZ valueOf = C187808yZ.valueOf(string2);
        if (string == null || parcelable == null) {
            throw AnonymousClass001.A08("Required categoryParentId and bizJid not found");
        }
        CatalogAllCategoryViewModel catalogAllCategoryViewModel = (CatalogAllCategoryViewModel) this.A05.getValue();
        C36341k9.A16((C001600r) catalogAllCategoryViewModel.A08.getValue(), C90514aH.A1Y(valueOf) ? 1 : 0);
        if (valueOf == C187808yZ.CATALOG_CATEGORY_FLOW) {
            C001600r r4 = (C001600r) catalogAllCategoryViewModel.A07.getValue();
            ArrayList A0I = AnonymousClass001.A0I();
            int i = 0;
            do {
                A0I.add(new C174378Wq());
                i++;
            } while (i < 5);
            r4.A0D(A0I);
        }
        catalogAllCategoryViewModel.A06.Boy(new C1503574y(catalogAllCategoryViewModel, parcelable, valueOf, string, 5));
    }
}
