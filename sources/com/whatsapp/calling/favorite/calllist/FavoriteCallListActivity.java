package com.whatsapp.calling.favorite.calllist;

import X.AnonymousClass005;
import X.AnonymousClass00C;
import X.AnonymousClass00T;
import X.AnonymousClass0I4;
import X.AnonymousClass155;
import X.AnonymousClass190;
import X.AnonymousClass3UF;
import X.AnonymousClass4F7;
import X.AnonymousClass4VZ;
import X.C023509x;
import X.C135456cj;
import X.C18800tq;
import X.C18830tt;
import X.C18840tu;
import X.C27111My;
import X.C33311f5;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36431kI;
import X.C36441kJ;
import X.C40371vO;
import X.C40941wM;
import X.C55492ui;
import X.C57992z9;
import X.C833048w;
import X.C833148x;
import X.C85784Ik;
import X.C87084Nk;
import X.C89314Wb;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import com.whatsapp.wds.components.topbar.WDSToolbar;

public final class FavoriteCallListActivity extends AnonymousClass155 implements C87084Nk {
    public AnonymousClass0I4 A00;
    public RecyclerView A01;
    public C57992z9 A02;
    public C40941wM A03;
    public AnonymousClass190 A04;
    public WDSToolbar A05;
    public AnonymousClass005 A06;
    public AnonymousClass005 A07;
    public AnonymousClass005 A08;
    public boolean A09;
    public boolean A0A;
    public final AnonymousClass00T A0B;

    public boolean onCreateOptionsMenu(Menu menu) {
        AnonymousClass00C.A0D(menu, 0);
        getMenuInflater().inflate(R.menu.f11nameremoved, menu);
        return super.onCreateOptionsMenu(menu);
    }

    public void A2F() {
        if (!this.A0A) {
            this.A0A = true;
            C27111My A0L = C36351kA.A0L(this);
            C18800tq r2 = A0L.A5g;
            C36321k7.A0c(r2, this);
            C18830tt r1 = r2.A00;
            C36321k7.A0X(r2, r1, this, C36321k7.A05(r2, r1, this));
            this.A02 = (C57992z9) A0L.A2M.get();
            this.A06 = C18840tu.A00(r2.A1N);
            this.A08 = C18840tu.A00(r2.A3v);
            this.A07 = C18840tu.A00(r2.A2A);
            this.A04 = C36351kA.A0h(r2);
        }
    }

    public boolean onPrepareOptionsMenu(Menu menu) {
        if (menu != null) {
            menu.setGroupVisible(R.id.favorites_menu_group, this.A09);
        }
        return super.onPrepareOptionsMenu(menu);
    }

    public FavoriteCallListActivity(int i) {
        this.A0A = false;
        C89314Wb.A00(this, 41);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.f9nameremoved);
        RecyclerView recyclerView = (RecyclerView) C36361kB.A0H(this, R.id.favorites);
        this.A01 = recyclerView;
        AnonymousClass0I4 r0 = new AnonymousClass0I4(new C40371vO(this));
        this.A00 = r0;
        if (recyclerView == null) {
            throw C36331k8.A0d("recyclerView");
        }
        r0.A0D(recyclerView);
        WDSToolbar wDSToolbar = (WDSToolbar) C36361kB.A0H(this, R.id.title_toolbar);
        this.A05 = wDSToolbar;
        if (wDSToolbar == null) {
            throw C36331k8.A0d("wdsToolBar");
        }
        AnonymousClass3UF.A0D(this, wDSToolbar, this.A00, R.color.f6nameremoved);
        wDSToolbar.setTitle((int) R.string.f12nameremoved);
        setSupportActionBar(wDSToolbar);
        wDSToolbar.setNavigationOnClickListener(new C135456cj(this, 9));
        boolean booleanExtra = getIntent().getBooleanExtra("com.whatsapp.calling.favorite.calllist.FavoriteCallListActivity.edit", false);
        AnonymousClass00T r3 = this.A0B;
        ((FavoriteCallListViewModel) r3.getValue()).A0S(booleanExtra);
        C36331k8.A1T(new FavoriteCallListActivity$initObservables$1(this, (C023509x) null), C33311f5.A00(this));
        C55492ui.A01(this, ((FavoriteCallListViewModel) r3.getValue()).A05, new C85784Ik(this), 46);
        this.A05.A01(new AnonymousClass4VZ(this, 0), this);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int A062 = C36341k9.A06(menuItem);
        if (A062 == R.id.edit_favorites) {
            ((FavoriteCallListViewModel) this.A0B.getValue()).A0S(true);
            return true;
        } else if (A062 != R.id.add_favorites) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            if (this.A04 != null) {
                Intent A0D = C36431kI.A0D();
                A0D.setClassName(getPackageName(), "com.whatsapp.calling.favorite.FavoritePicker");
                startActivity(A0D);
                return true;
            }
            throw C36331k8.A0X();
        }
    }

    public FavoriteCallListActivity() {
        this(0);
        this.A0B = C36441kJ.A0a(new C833148x(this), new C833048w(this), new AnonymousClass4F7(this), C36441kJ.A1A(FavoriteCallListViewModel.class));
    }
}
