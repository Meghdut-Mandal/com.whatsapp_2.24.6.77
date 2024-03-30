package com.whatsapp.interopui.compose;

import X.AnonymousClass000;
import X.AnonymousClass00C;
import X.AnonymousClass00T;
import X.AnonymousClass0C0;
import X.AnonymousClass155;
import X.AnonymousClass1RJ;
import X.AnonymousClass32M;
import X.AnonymousClass3LE;
import X.AnonymousClass4C7;
import X.AnonymousClass4KP;
import X.C023509x;
import X.C109325Xd;
import X.C1272367m;
import X.C18800tq;
import X.C18830tt;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36381kD;
import X.C36431kI;
import X.C40601vo;
import X.C53842ry;
import X.C66023Uj;
import X.C89114Vh;
import X.C89344We;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;

public final class InteropComposeSelectIntegratorActivity extends AnonymousClass155 {
    public C1272367m A00;
    public C40601vo A01;
    public AnonymousClass3LE A02;
    public AnonymousClass1RJ A03;
    public RecyclerView A04;
    public boolean A05;
    public final AnonymousClass00T A06;

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.f9nameremoved);
        this.A04 = (RecyclerView) C36361kB.A0H(this, R.id.opted_in_integrators);
        this.A03 = C36351kA.A0r(this, R.id.empty_choose_app_text_view_stub);
        Toolbar toolbar = (Toolbar) C36361kB.A0H(this, R.id.toolbar);
        setSupportActionBar(toolbar);
        C36321k7.A0O(this);
        this.A02 = new AnonymousClass3LE(this, findViewById(R.id.interop_search_holder), new C53842ry(this, 9), toolbar, this.A00);
        C1272367m r1 = this.A00;
        if (r1 != null) {
            C40601vo r2 = new C40601vo(r1, new AnonymousClass32M(this));
            this.A01 = r2;
            r2.BnA(new C89114Vh(this, 4));
            RecyclerView recyclerView = this.A04;
            if (recyclerView == null) {
                throw C36331k8.A0d("recyclerView");
            }
            C36321k7.A0Q(recyclerView);
            recyclerView.setItemAnimator(new AnonymousClass0C0());
            C40601vo r0 = this.A01;
            if (r0 == null) {
                throw C36331k8.A0d("integratorsAdapter");
            }
            recyclerView.setAdapter(r0);
            AnonymousClass00T r3 = this.A06;
            C66023Uj.A01(this, ((InteropComposeSelectIntegratorViewModel) r3.getValue()).A01, new AnonymousClass4KP(this), 32);
            InteropComposeSelectIntegratorViewModel interopComposeSelectIntegratorViewModel = (InteropComposeSelectIntegratorViewModel) r3.getValue();
            C36381kD.A1R(interopComposeSelectIntegratorViewModel.A04, new InteropComposeSelectIntegratorViewModel$loadOptedInIntegrators$1(interopComposeSelectIntegratorViewModel, (C023509x) null), C109325Xd.A00(interopComposeSelectIntegratorViewModel));
            return;
        }
        throw C36331k8.A0d("imageLoader");
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        AnonymousClass00C.A0D(menu, 0);
        getMenuInflater().inflate(R.menu.f11nameremoved, menu);
        MenuItem findItem = menu.findItem(R.id.search_integrator);
        C40601vo r0 = this.A01;
        if (r0 == null) {
            throw C36331k8.A0d("integratorsAdapter");
        }
        findItem.setVisible(AnonymousClass000.A1P(r0.A00.size()));
        return super.onCreateOptionsMenu(menu);
    }

    public void A2F() {
        if (!this.A05) {
            this.A05 = true;
            C18800tq A0B = C36331k8.A0B(this);
            C36321k7.A0c(A0B, this);
            C18830tt r1 = A0B.A00;
            C36321k7.A0X(A0B, r1, this, C36321k7.A05(A0B, r1, this));
            this.A00 = (C1272367m) r1.A2K.get();
        }
    }

    public boolean onSearchRequested() {
        AnonymousClass3LE r1 = this.A02;
        if (r1 == null) {
            throw C36331k8.A0d("searchToolbarHelper");
        }
        r1.A06(false);
        return false;
    }

    public InteropComposeSelectIntegratorActivity(int i) {
        this.A05 = false;
        C89344We.A00(this, 4);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (C36341k9.A06(menuItem) != R.id.search_integrator) {
            return super.onOptionsItemSelected(menuItem);
        }
        onSearchRequested();
        return true;
    }

    public InteropComposeSelectIntegratorActivity() {
        this(0);
        this.A06 = C36431kI.A1I(new AnonymousClass4C7(this));
    }
}
