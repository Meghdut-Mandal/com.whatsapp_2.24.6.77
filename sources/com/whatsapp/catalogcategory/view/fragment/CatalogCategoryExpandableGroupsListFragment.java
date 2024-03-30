package com.whatsapp.catalogcategory.view.fragment;

import X.AnonymousClass001;
import X.AnonymousClass00C;
import X.AnonymousClass00T;
import X.AnonymousClass8X5;
import X.AnonymousClass8X7;
import X.AnonymousClass9EQ;
import X.BA7;
import X.C001600r;
import X.C115875ja;
import X.C1502274l;
import X.C166367vc;
import X.C174378Wq;
import X.C18740tg;
import X.C207529vM;
import X.C207539vN;
import X.C207549vO;
import X.C207559vP;
import X.C22144AhT;
import X.C22145AhU;
import X.C22371AlY;
import X.C22372AlZ;
import X.C22373Ala;
import X.C24801Dv;
import X.C36331k8;
import X.C36361kB;
import X.C36431kI;
import X.C90514aH;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import com.whatsapp.R;
import com.whatsapp.catalogcategory.view.CategoryThumbnailLoader;
import com.whatsapp.catalogcategory.view.viewmodel.CatalogCategoryGroupsViewModel;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;

public final class CatalogCategoryExpandableGroupsListFragment extends Hilt_CatalogCategoryExpandableGroupsListFragment {
    public int A00 = -1;
    public ExpandableListView A01;
    public C24801Dv A02;
    public C115875ja A03;
    public C166367vc A04;
    public UserJid A05;
    public String A06;
    public final AnonymousClass00T A07 = C36431kI.A1I(new C22144AhT(this));
    public final AnonymousClass00T A08 = C36431kI.A1I(new C22145AhU(this));

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        AnonymousClass00C.A0D(layoutInflater, 0);
        View A0Q = C90514aH.A0Q(layoutInflater, viewGroup, R.layout.f9nameremoved);
        this.A01 = (ExpandableListView) C36361kB.A0G(A0Q, R.id.expandable_list_catalog_category);
        C166367vc r1 = new C166367vc((CategoryThumbnailLoader) this.A07.getValue());
        this.A04 = r1;
        ExpandableListView expandableListView = this.A01;
        if (expandableListView == null) {
            throw C36331k8.A0d("expandableListView");
        }
        expandableListView.setAdapter(r1);
        ExpandableListView expandableListView2 = this.A01;
        if (expandableListView2 == null) {
            throw C36331k8.A0d("expandableListView");
        }
        expandableListView2.setOnChildClickListener(new C207529vM(this));
        ExpandableListView expandableListView3 = this.A01;
        if (expandableListView3 == null) {
            throw C36331k8.A0d("expandableListView");
        }
        expandableListView3.setOnGroupClickListener(new C207539vN(this));
        ExpandableListView expandableListView4 = this.A01;
        if (expandableListView4 == null) {
            throw C36331k8.A0d("expandableListView");
        }
        expandableListView4.setOnGroupExpandListener(new C207559vP(this));
        ExpandableListView expandableListView5 = this.A01;
        if (expandableListView5 == null) {
            throw C36331k8.A0d("expandableListView");
        }
        expandableListView5.setOnGroupCollapseListener(new C207549vO(this));
        return A0Q;
    }

    public void A1S(Bundle bundle, View view) {
        AnonymousClass00C.A0D(view, 0);
        AnonymousClass00T r4 = this.A08;
        BA7.A01(A0m(), ((CatalogCategoryGroupsViewModel) r4.getValue()).A00, new C22371AlY(this), 39);
        BA7.A01(A0m(), ((CatalogCategoryGroupsViewModel) r4.getValue()).A01, new C22372AlZ(this), 38);
        BA7.A01(A0m(), ((CatalogCategoryGroupsViewModel) r4.getValue()).A02, new C22373Ala(this), 40);
    }

    public void A1L() {
        super.A1L();
        int i = this.A00;
        if (i != -1) {
            ExpandableListView expandableListView = this.A01;
            if (expandableListView == null) {
                throw C36331k8.A0d("expandableListView");
            }
            expandableListView.expandGroup(i);
        }
        CatalogCategoryGroupsViewModel catalogCategoryGroupsViewModel = (CatalogCategoryGroupsViewModel) this.A08.getValue();
        UserJid userJid = this.A05;
        if (userJid == null) {
            throw C36331k8.A0d("bizJid");
        }
        AnonymousClass9EQ r1 = (AnonymousClass9EQ) catalogCategoryGroupsViewModel.A00.A04();
        if (r1 instanceof AnonymousClass8X7) {
            catalogCategoryGroupsViewModel.A0S(userJid, ((AnonymousClass8X7) r1).A00);
        }
    }

    public void A1Q(Bundle bundle) {
        super.A1Q(bundle);
        String string = A0b().getString("parent_category_id");
        C18740tg.A06(string);
        AnonymousClass00C.A08(string);
        this.A06 = string;
        Parcelable parcelable = A0b().getParcelable("category_biz_id");
        C18740tg.A06(parcelable);
        AnonymousClass00C.A08(parcelable);
        this.A05 = (UserJid) parcelable;
        CatalogCategoryGroupsViewModel catalogCategoryGroupsViewModel = (CatalogCategoryGroupsViewModel) this.A08.getValue();
        String str = this.A06;
        if (str == null) {
            throw C36331k8.A0d("categoryParentId");
        }
        UserJid userJid = this.A05;
        if (userJid == null) {
            throw C36331k8.A0d("bizJid");
        }
        C001600r r3 = (C001600r) catalogCategoryGroupsViewModel.A07.getValue();
        ArrayList A0I = AnonymousClass001.A0I();
        int i = 0;
        do {
            A0I.add(new C174378Wq());
            i++;
        } while (i < 5);
        r3.A0D(new AnonymousClass8X5(A0I));
        C1502274l.A00(catalogCategoryGroupsViewModel.A06, catalogCategoryGroupsViewModel, userJid, str, 35);
    }
}
