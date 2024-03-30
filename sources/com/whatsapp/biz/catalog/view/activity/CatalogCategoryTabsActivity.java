package com.whatsapp.biz.catalog.view.activity;

import X.A8S;
import X.AnonymousClass00C;
import X.AnonymousClass00T;
import X.AnonymousClass02E;
import X.AnonymousClass07B;
import X.AnonymousClass7U2;
import X.AnonymousClass9RM;
import X.AnonymousClass9ZO;
import X.B7Y;
import X.B93;
import X.BA6;
import X.C1501974i;
import X.C152167Jl;
import X.C157967fa;
import X.C165567td;
import X.C167607yM;
import X.C173838Ti;
import X.C174358Wo;
import X.C18740tg;
import X.C18800tq;
import X.C18830tt;
import X.C22924Aya;
import X.C27111My;
import X.C36321k7;
import X.C36331k8;
import X.C36351kA;
import X.C36361kB;
import X.C36401kF;
import X.C36431kI;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.ViewStub;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;
import com.whatsapp.R;
import com.whatsapp.catalogcategory.view.viewmodel.CatalogCategoryTabsViewModel;
import com.whatsapp.catalogsearch.view.fragment.CatalogSearchFragment;
import java.util.List;

public final class CatalogCategoryTabsActivity extends C174358Wo implements C157967fa, C22924Aya {
    public ViewPager A00;
    public AnonymousClass9RM A01;
    public AnonymousClass9ZO A02;
    public boolean A03;
    public final AnonymousClass00T A04;

    public boolean onCreateOptionsMenu(Menu menu) {
        AnonymousClass00C.A0D(menu, 0);
        getMenuInflater().inflate(R.menu.f11nameremoved, menu);
        return super.onCreateOptionsMenu(menu);
    }

    public void onNewIntent(Intent intent) {
        CatalogSearchFragment catalogSearchFragment;
        AnonymousClass00C.A0D(intent, 0);
        super.onNewIntent(intent);
        String stringExtra = intent.getStringExtra("selected_category_parent_id");
        if (stringExtra != null) {
            AnonymousClass00T r1 = this.A04;
            List A0w = C36401kF.A0w(((CatalogCategoryTabsViewModel) r1.getValue()).A00);
            if (A0w != null) {
                r1.getValue();
                int A012 = CatalogCategoryTabsViewModel.A01(stringExtra, A0w);
                ViewPager viewPager = this.A00;
                if (viewPager == null) {
                    throw C36331k8.A0d("viewPager");
                }
                viewPager.setCurrentItem(A012);
            }
            AnonymousClass02E A0N = getSupportFragmentManager().A0N("CategoryTabsSearchFragmentTag");
            if (A0N != null && (A0N instanceof CatalogSearchFragment) && (catalogSearchFragment = (CatalogSearchFragment) A0N) != null) {
                catalogSearchFragment.A1Z(true);
            }
        }
    }

    public void A2F() {
        if (!this.A03) {
            this.A03 = true;
            C27111My A0L = C36351kA.A0L(this);
            C18800tq r2 = A0L.A5g;
            C165567td.A11(r2, this);
            C18830tt r1 = r2.A00;
            C165567td.A0v(r2, r1, this, C36321k7.A05(r2, r1, this));
            C173838Ti.A01(A0L, r2, r1, this);
            this.A01 = C27111My.A0G(A0L);
            this.A02 = new AnonymousClass9ZO();
        }
    }

    public void BTC() {
        ((C167607yM) this.A09.getValue()).A02.A00();
    }

    public void BXZ(int i) {
        if (i == 404) {
            A35(A8S.A00, 0, R.string.f12nameremoved, R.string.f12nameremoved);
        }
    }

    public CatalogCategoryTabsActivity(int i) {
        this.A03 = false;
        B7Y.A00(this, 3);
    }

    public void onBackPressed() {
        CatalogSearchFragment catalogSearchFragment;
        AnonymousClass02E A0N = getSupportFragmentManager().A0N("CategoryTabsSearchFragmentTag");
        if (A0N == null || !(A0N instanceof CatalogSearchFragment) || (catalogSearchFragment = (CatalogSearchFragment) A0N) == null || !catalogSearchFragment.A1a()) {
            super.onBackPressed();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.f9nameremoved);
        ((ViewStub) findViewById(R.id.stub_toolbar_search)).inflate();
        AnonymousClass07B A0Q = C36431kI.A0Q(this, (Toolbar) C36361kB.A0H(this, R.id.toolbar));
        if (A0Q != null) {
            A0Q.A0U(true);
            A0Q.A0I(R.string.f12nameremoved);
        }
        AnonymousClass9RM r3 = this.A01;
        if (r3 != null) {
            r3.A00(new B93(this, 0), A3i());
            String stringExtra = getIntent().getStringExtra("selected_category_parent_id");
            C18740tg.A06(stringExtra);
            AnonymousClass00C.A0B(stringExtra);
            AnonymousClass00T r32 = this.A04;
            BA6.A01(this, ((CatalogCategoryTabsViewModel) r32.getValue()).A00, new AnonymousClass7U2(this, stringExtra), 32);
            CatalogCategoryTabsViewModel catalogCategoryTabsViewModel = (CatalogCategoryTabsViewModel) r32.getValue();
            catalogCategoryTabsViewModel.A04.Boy(new C1501974i(catalogCategoryTabsViewModel, A3i(), 27));
            return;
        }
        throw C36331k8.A0d("catalogSearchManager");
    }

    public CatalogCategoryTabsActivity() {
        this(0);
        this.A04 = C36431kI.A1I(new C152167Jl(this));
    }
}
