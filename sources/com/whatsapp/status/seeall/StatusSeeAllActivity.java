package com.whatsapp.status.seeall;

import X.AnonymousClass00C;
import X.AnonymousClass01N;
import X.AnonymousClass04H;
import X.AnonymousClass155;
import X.AnonymousClass190;
import X.AnonymousClass1MI;
import X.AnonymousClass3CD;
import X.AnonymousClass3LE;
import X.AnonymousClass3UF;
import X.AnonymousClass3YC;
import X.AnonymousClass4LK;
import X.C016307a;
import X.C022609n;
import X.C022709o;
import X.C023509x;
import X.C02800By;
import X.C109325Xd;
import X.C18800tq;
import X.C18830tt;
import X.C19770wU;
import X.C27111My;
import X.C32251dE;
import X.C33511fU;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36431kI;
import X.C36441kJ;
import X.C53842ry;
import X.C57832yt;
import X.C57842yu;
import X.C65963Ud;
import X.C67103Yn;
import X.C68073bI;
import X.C68083bJ;
import X.C87324Oi;
import X.C89374Wh;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.DialogFragment;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import com.whatsapp.WaTextView;
import com.whatsapp.status.seeall.adapter.StatusSeeAllAdapter;
import com.whatsapp.status.seeall.viewmodel.StatusSeeAllViewModel;
import com.whatsapp.status.seeall.viewmodel.StatusSeeAllViewModel$logTimeSpentLoggingEvent$1;
import com.whatsapp.status.viewmodels.StatusesViewModel;

public final class StatusSeeAllActivity extends AnonymousClass155 implements C022609n, C022709o, C87324Oi {
    public ViewGroup A00;
    public TextView A01;
    public RecyclerView A02;
    public C57832yt A03;
    public C57842yu A04;
    public WaTextView A05;
    public AnonymousClass190 A06;
    public AnonymousClass3LE A07;
    public StatusSeeAllAdapter A08;
    public StatusSeeAllViewModel A09;
    public C32251dE A0A;
    public StatusesViewModel A0B;
    public boolean A0C;

    public boolean A2g() {
        return false;
    }

    public void BVg(DialogFragment dialogFragment, boolean z) {
    }

    public void onCreate(Bundle bundle) {
        C36331k8.A0l(this);
        super.onCreate(bundle);
        Toolbar A0O = C36361kB.A0O(this, R.layout.f9nameremoved);
        A0O.setTitle((int) R.string.f12nameremoved);
        setSupportActionBar(A0O);
        C36321k7.A0P(this);
        this.A07 = new AnonymousClass3LE(this, findViewById(R.id.search_holder), new C53842ry(this, 12), A0O, this.A00);
        C32251dE r1 = this.A0A;
        if (r1 != null) {
            this.A0B = C68073bI.A00(this, r1, true);
            int A022 = C36431kI.A02(getIntent(), "status_see_all_activity_filter_mode.");
            C57842yu r3 = this.A04;
            if (r3 != null) {
                StatusesViewModel statusesViewModel = this.A0B;
                if (statusesViewModel == null) {
                    throw C36331k8.A0d("statusesViewModel");
                }
                this.A09 = (StatusSeeAllViewModel) new AnonymousClass04H(new C68083bJ(r3, statusesViewModel, A022), this).A00(StatusSeeAllViewModel.class);
                AnonymousClass01N r12 = this.A06;
                StatusesViewModel statusesViewModel2 = this.A0B;
                if (statusesViewModel2 == null) {
                    throw C36331k8.A0d("statusesViewModel");
                }
                r12.A04(statusesViewModel2);
                AnonymousClass01N r13 = this.A06;
                StatusSeeAllViewModel statusSeeAllViewModel = this.A09;
                if (statusSeeAllViewModel == null) {
                    throw C36331k8.A0a();
                }
                r13.A04(statusSeeAllViewModel);
                C57832yt r14 = this.A03;
                if (r14 != null) {
                    C19770wU A0Z = C36341k9.A0Z(r14.A00.A01);
                    C18800tq r0 = r14.A00.A01;
                    StatusSeeAllAdapter statusSeeAllAdapter = new StatusSeeAllAdapter((AnonymousClass3CD) r0.A00.A14.get(), C36351kA.A0T(r0), C36351kA.A0W(r0), this, A0Z);
                    this.A08 = statusSeeAllAdapter;
                    this.A06.A04(statusSeeAllAdapter);
                    this.A01 = (TextView) C36361kB.A0H(this, R.id.see_all_empty_text);
                    WaTextView waTextView = (WaTextView) C36361kB.A0H(this, R.id.view_all_text);
                    this.A05 = waTextView;
                    if (waTextView == null) {
                        throw C36331k8.A0d("seeAllText");
                    }
                    C33511fU.A03(waTextView);
                    this.A00 = (ViewGroup) C36361kB.A0H(this, R.id.empty_text_container);
                    View findViewById = findViewById(R.id.see_all_status_list);
                    RecyclerView recyclerView = (RecyclerView) findViewById;
                    StatusSeeAllAdapter statusSeeAllAdapter2 = this.A08;
                    if (statusSeeAllAdapter2 == null) {
                        throw C36331k8.A0d("adapter");
                    }
                    recyclerView.setAdapter(statusSeeAllAdapter2);
                    C36321k7.A0Q(recyclerView);
                    recyclerView.setItemAnimator((C02800By) null);
                    AnonymousClass00C.A08(findViewById);
                    this.A02 = recyclerView;
                    StatusSeeAllViewModel statusSeeAllViewModel2 = this.A09;
                    if (statusSeeAllViewModel2 == null) {
                        throw C36331k8.A0a();
                    }
                    C65963Ud.A01(this, statusSeeAllViewModel2.A00, new AnonymousClass4LK(this), 25);
                    return;
                }
                throw C36331k8.A0d("adapterFactory");
            }
            throw C36331k8.A0d("viewModelFactory");
        }
        throw C36331k8.A0d("statusesViewModelFactory");
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        AnonymousClass00C.A0D(menu, 0);
        if ((menu instanceof C016307a) && C36361kB.A1Y(this.A0D)) {
            ((C016307a) menu).A0C = true;
        }
        MenuItem add = menu.add(0, 1002, 0, R.string.f12nameremoved);
        Drawable A032 = AnonymousClass3UF.A03(this, R.drawable.vec_ic_privacy_lock_wds, AnonymousClass1MI.A01(this.A0D));
        AnonymousClass00C.A08(A032);
        add.setIcon(A032);
        MenuItem add2 = menu.add(0, 1001, 0, R.string.f12nameremoved);
        View A0R = C36441kJ.A0R(add2, R.layout.f9nameremoved);
        if (A0R != null) {
            AnonymousClass3YC.A00(A0R, this, add2, 21);
        }
        add2.setShowAsAction(1);
        return super.onCreateOptionsMenu(menu);
    }

    public void A2F() {
        if (!this.A0C) {
            this.A0C = true;
            C27111My A0L = C36351kA.A0L(this);
            C18800tq r2 = A0L.A5g;
            C36321k7.A0c(r2, this);
            C18830tt r1 = r2.A00;
            C36321k7.A0X(r2, r1, this, C36321k7.A05(r2, r1, this));
            this.A03 = (C57832yt) A0L.A3Q.get();
            this.A0A = (C32251dE) r1.A0E.get();
            this.A04 = (C57842yu) A0L.A02.get();
            this.A06 = C36351kA.A0h(r2);
        }
    }

    public void onBackPressed() {
        AnonymousClass3LE r0 = this.A07;
        if (r0 == null) {
            throw C36331k8.A0d("searchToolbarHelper");
        } else if (r0.A07()) {
            AnonymousClass3LE r1 = this.A07;
            if (r1 == null) {
                throw C36331k8.A0d("searchToolbarHelper");
            }
            r1.A05(true);
        } else {
            super.onBackPressed();
        }
    }

    public void onResume() {
        StatusSeeAllViewModel statusSeeAllViewModel = this.A09;
        if (statusSeeAllViewModel == null) {
            throw C36331k8.A0a();
        }
        C36331k8.A1T(new StatusSeeAllViewModel$logTimeSpentLoggingEvent$1(statusSeeAllViewModel, (C023509x) null), C109325Xd.A00(statusSeeAllViewModel));
        super.onResume();
    }

    public StatusSeeAllActivity(int i) {
        this.A0C = false;
        C89374Wh.A00(this, 2);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int A062 = C36341k9.A06(menuItem);
        if (A062 == 1001) {
            AnonymousClass3LE r1 = this.A07;
            if (r1 == null) {
                throw C36331k8.A0d("searchToolbarHelper");
            }
            r1.A06(false);
            C67103Yn.A00(findViewById(R.id.search_back), this, 15);
        } else if (A062 == 1002) {
            if (this.A06 != null) {
                startActivity(AnonymousClass190.A0E(this));
            } else {
                throw C36331k8.A0X();
            }
        }
        return super.onOptionsItemSelected(menuItem);
    }

    public StatusSeeAllActivity() {
        this(0);
    }
}
