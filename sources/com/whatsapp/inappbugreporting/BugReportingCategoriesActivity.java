package com.whatsapp.inappbugreporting;

import X.AnonymousClass00C;
import X.AnonymousClass00F;
import X.AnonymousClass076;
import X.AnonymousClass07B;
import X.AnonymousClass08I;
import X.AnonymousClass0I3;
import X.AnonymousClass155;
import X.AnonymousClass1RJ;
import X.AnonymousClass2W9;
import X.AnonymousClass2WA;
import X.AnonymousClass2WB;
import X.AnonymousClass2WC;
import X.AnonymousClass2WD;
import X.AnonymousClass2WE;
import X.AnonymousClass2WF;
import X.AnonymousClass2WG;
import X.AnonymousClass2WH;
import X.AnonymousClass2WI;
import X.AnonymousClass2WJ;
import X.AnonymousClass2WK;
import X.AnonymousClass2WL;
import X.AnonymousClass2WM;
import X.AnonymousClass2WN;
import X.AnonymousClass2WO;
import X.AnonymousClass2WP;
import X.AnonymousClass2WQ;
import X.AnonymousClass2WR;
import X.AnonymousClass2WS;
import X.AnonymousClass4KB;
import X.C18800tq;
import X.C18830tt;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36431kI;
import X.C41081wa;
import X.C41131wi;
import X.C50942mt;
import X.C54582tB;
import X.C601936v;
import X.C89334Wd;
import X.C89724Xq;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import com.whatsapp.WaTextView;
import com.whatsapp.wds.components.search.WDSSearchBar;

public final class BugReportingCategoriesActivity extends AnonymousClass155 {
    public RecyclerView A00;
    public C41081wa A01;
    public C54582tB A02;
    public WDSSearchBar A03;
    public boolean A04;

    public void A2F() {
        if (!this.A04) {
            this.A04 = true;
            C18800tq A0B = C36331k8.A0B(this);
            C36321k7.A0c(A0B, this);
            C18830tt r1 = A0B.A00;
            C36321k7.A0X(A0B, r1, this, C36321k7.A05(A0B, r1, this));
            this.A02 = (C54582tB) r1.A5Z.get();
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        if (menu != null) {
            MenuItem add = menu.add(0, R.id.menuitem_search, 0, getString(R.string.f12nameremoved));
            AnonymousClass00C.A08(add);
            add.setIcon(R.drawable.ic_action_search);
            add.setShowAsAction(10);
        }
        return super.onCreateOptionsMenu(menu);
    }

    public BugReportingCategoriesActivity(int i) {
        this.A04 = false;
        C89334Wd.A00(this, 44);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.f9nameremoved);
        WDSSearchBar wDSSearchBar = (WDSSearchBar) C36361kB.A0H(this, R.id.search_bar);
        this.A03 = wDSSearchBar;
        if (wDSSearchBar == null) {
            throw C36331k8.A0d("wdsSearchBar");
        }
        wDSSearchBar.A07.setTrailingButtonIcon(C50942mt.A00);
        WDSSearchBar wDSSearchBar2 = this.A03;
        if (wDSSearchBar2 == null) {
            throw C36331k8.A0d("wdsSearchBar");
        }
        AnonymousClass07B A0Q = C36431kI.A0Q(this, wDSSearchBar2.A06);
        if (A0Q != null) {
            A0Q.A0U(true);
            A0Q.A0Q(getString(R.string.f12nameremoved));
        }
        RecyclerView recyclerView = (RecyclerView) C36361kB.A0D(this, R.id.category_list);
        C36351kA.A1F(recyclerView, 1);
        recyclerView.A0U = true;
        AnonymousClass0I3 r2 = new AnonymousClass0I3(recyclerView.getContext());
        int A002 = AnonymousClass00F.A00(this, R.color.f6nameremoved);
        r2.A00 = A002;
        Drawable A012 = AnonymousClass08I.A01(r2.A04);
        r2.A04 = A012;
        AnonymousClass076.A06(A012, A002);
        r2.A03 = 1;
        r2.A05 = false;
        recyclerView.A0t(r2);
        this.A00 = recyclerView;
        if (this.A02 != null) {
            C601936v[] r22 = new C601936v[20];
            r22[0] = AnonymousClass2W9.A00;
            r22[1] = AnonymousClass2WA.A00;
            r22[2] = AnonymousClass2WI.A00;
            r22[3] = AnonymousClass2WC.A00;
            r22[4] = AnonymousClass2WN.A00;
            r22[5] = AnonymousClass2WE.A00;
            r22[6] = AnonymousClass2WB.A00;
            r22[7] = AnonymousClass2WO.A00;
            r22[8] = AnonymousClass2WJ.A00;
            r22[9] = AnonymousClass2WM.A00;
            r22[10] = AnonymousClass2WF.A00;
            r22[11] = AnonymousClass2WH.A00;
            r22[12] = AnonymousClass2WD.A00;
            r22[13] = AnonymousClass2WQ.A00;
            r22[14] = AnonymousClass2WS.A00;
            r22[15] = AnonymousClass2WR.A00;
            r22[16] = AnonymousClass2WG.A00;
            r22[17] = AnonymousClass2WP.A00;
            r22[18] = AnonymousClass2WL.A00;
            C41081wa r1 = new C41081wa(C36341k9.A0m(AnonymousClass2WK.A00, r22, 19), new AnonymousClass4KB(this));
            this.A01 = r1;
            RecyclerView recyclerView2 = this.A00;
            if (recyclerView2 == null) {
                throw C36331k8.A0d("categoryRecyclerView");
            }
            recyclerView2.setAdapter(r1);
            WaTextView waTextView = (WaTextView) findViewById(R.id.choose_category_hint_text_view);
            AnonymousClass1RJ A0r = C36351kA.A0r(this, R.id.no_search_result_text_view);
            C41081wa r12 = this.A01;
            if (r12 == null) {
                throw C36331k8.A0d("bugCategoryListAdapter");
            }
            r12.BnA(new C41131wi(waTextView, this, A0r));
            WDSSearchBar wDSSearchBar3 = this.A03;
            if (wDSSearchBar3 == null) {
                throw C36331k8.A0d("wdsSearchBar");
            }
            wDSSearchBar3.A07.setOnQueryTextChangeListener(new C89724Xq(this, 3));
            return;
        }
        throw C36331k8.A0d("bugCategoryFactory");
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (C36341k9.A06(menuItem) == R.id.menuitem_search) {
            WDSSearchBar wDSSearchBar = this.A03;
            if (wDSSearchBar == null) {
                throw C36331k8.A0d("wdsSearchBar");
            }
            wDSSearchBar.A01();
        } else if (menuItem.getItemId() == 16908332) {
            onBackPressed();
        }
        return super.onOptionsItemSelected(menuItem);
    }

    public BugReportingCategoriesActivity() {
        this(0);
    }
}
