package com.whatsapp.payments.onboarding;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass0VM;
import X.AnonymousClass1JZ;
import X.AnonymousClass3LE;
import X.AnonymousClass658;
import X.AnonymousClass6CW;
import X.AnonymousClass9YX;
import X.B7Y;
import X.C02800By;
import X.C157437cx;
import X.C162487of;
import X.C165567td;
import X.C165577te;
import X.C165587tf;
import X.C165607th;
import X.C173858Tk;
import X.C176658cT;
import X.C178838hl;
import X.C183638r7;
import X.C18800tq;
import X.C18820ts;
import X.C18830tt;
import X.C198629dt;
import X.C203489oA;
import X.C23137B6w;
import X.C24611Dc;
import X.C27111My;
import X.C36321k7;
import X.C36331k8;
import X.C36351kA;
import X.C36361kB;
import X.C36391kE;
import X.C36401kF;
import X.C36411kG;
import X.C36431kI;
import X.C36441kJ;
import X.C96034mg;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.whatsapp.R;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public final class IndiaUpiBankPickerActivity extends C178838hl implements C157437cx {
    public LinearLayout A00;
    public TextView A01;
    public RecyclerView A02;
    public ShimmerFrameLayout A03;
    public ShimmerFrameLayout A04;
    public AnonymousClass9YX A05;
    public C96034mg A06;
    public C183638r7 A07;
    public AnonymousClass3LE A08;
    public String A09;
    public ArrayList A0A;
    public List A0B;
    public boolean A0C;
    public AnonymousClass6CW A0D;
    public boolean A0E;
    public final C176658cT A0F;
    public final C24611Dc A0G;

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C36331k8.A0l(this);
        File A0w = C36441kJ.A0w(getCacheDir(), "BankLogos");
        if (!A0w.mkdirs() && !A0w.isDirectory()) {
            this.A0G.A06("create unable to create bank logos cache directory");
        }
        this.A0D = new AnonymousClass658(this.A05, this.A05, this.A0D, A0w, "india-upi-bank-picker-activity").A01();
        setContentView((int) R.layout.f9nameremoved);
        A3z(R.string.f12nameremoved, R.id.bank_picker_list);
        C18820ts r10 = this.A00;
        this.A08 = new AnonymousClass3LE(this, findViewById(R.id.search_holder), new C203489oA(this, 1), C36411kG.A0R(this), r10);
        this.A04 = (ShimmerFrameLayout) findViewById(R.id.grid_view_shimmer_layout);
        this.A03 = (ShimmerFrameLayout) findViewById(R.id.list_view_shimmer_layout);
        this.A01 = C36391kE.A0Q(this, R.id.bank_picker_empty_tv);
        this.A00 = (LinearLayout) findViewById(R.id.list_items_layout);
        this.A02 = (RecyclerView) findViewById(R.id.bank_picker_list);
        C96034mg r1 = new C96034mg(this, this, this.A0D, this.A0C);
        this.A06 = r1;
        this.A02.setAdapter(r1);
        RecyclerView recyclerView = this.A02;
        C96034mg r2 = this.A06;
        GridLayoutManager gridLayoutManager = new GridLayoutManager(4);
        gridLayoutManager.A02 = new C162487of(r2, 1);
        recyclerView.setLayoutManager(gridLayoutManager);
        this.A02.setItemAnimator((C02800By) null);
        A47(AnonymousClass001.A0I(), false);
        AnonymousClass9YX r12 = this.A0L.A04;
        this.A05 = r12;
        r12.A00("upi-bank-picker");
        this.A0S.Buu();
        this.A0C = false;
        this.A02.A0v(new C23137B6w(this, 4));
        C176658cT r22 = this.A0F;
        r22.A0Y = this.A0b;
        r22.A0b = "nav_bank_select";
        r22.A0a = this.A0e;
        C176658cT.A02(r22, 0);
        r22.A01 = Boolean.valueOf(this.A0I.A0G("add_bank"));
        r22.A02 = Boolean.valueOf(this.A0C);
        C173858Tk.A0r(r22, this);
        this.A0P.A09();
    }

    public static void A10(IndiaUpiBankPickerActivity indiaUpiBankPickerActivity, Integer num) {
        C176658cT r1 = indiaUpiBankPickerActivity.A0F;
        r1.A0b = "nav_bank_select";
        r1.A0Y = indiaUpiBankPickerActivity.A0b;
        r1.A08 = C36361kB.A0i();
        r1.A0a = indiaUpiBankPickerActivity.A0e;
        r1.A07 = num;
        r1.A02 = Boolean.valueOf(indiaUpiBankPickerActivity.A0C);
        C173858Tk.A0r(r1, indiaUpiBankPickerActivity);
    }

    public void A2F() {
        if (!this.A0E) {
            this.A0E = true;
            C27111My A0L = C36351kA.A0L(this);
            C18800tq r2 = A0L.A5g;
            C165567td.A11(r2, this);
            C18830tt r1 = r2.A00;
            C165567td.A0v(r2, r1, this, C36321k7.A05(r2, r1, this));
            C173858Tk.A0h(A0L, r2, r1, this);
            C173858Tk.A0i(A0L, r2, r1, this, C165577te.A0f(r2));
            C173858Tk.A0q(r2, r1, this);
            C173858Tk.A0p(r2, r1, this);
            this.A05 = (C198629dt) r2.APP.get();
            this.A01 = C165607th.A0W(r1);
            this.A00 = C165587tf.A0Q(r2);
            this.A04 = C173858Tk.A0G(r1);
        }
    }

    public void A2x(int i) {
        RecyclerView recyclerView = this.A02;
        if (recyclerView != null) {
            recyclerView.setEnabled(true);
        }
        if (i != R.string.f12nameremoved) {
            A3v();
            finish();
        }
    }

    public void onBackPressed() {
        if (this.A08.A07()) {
            this.A08.A05(true);
            this.A0F.A0P = this.A09;
            A10(this, 1);
            return;
        }
        A10(this, 1);
        A3x();
    }

    public boolean onSearchRequested() {
        this.A0F.A03 = true;
        this.A08.A06(false);
        DisplayMetrics A0X = AnonymousClass000.A0X(this);
        AnonymousClass1JZ.A03(this.A08.A00, (int) TypedValue.applyDimension(1, 16.0f, A0X), 0);
        AnonymousClass1JZ.A03(this.A08.A04.findViewById(R.id.search_back), (int) TypedValue.applyDimension(1, 8.0f, A0X), 0);
        AnonymousClass3LE r2 = this.A08;
        String string = getString(R.string.f12nameremoved);
        SearchView searchView = r2.A00;
        if (searchView != null) {
            searchView.setQueryHint(string);
        }
        C36391kE.A1I(findViewById(R.id.search_back), this, 2);
        A10(this, 65);
        return false;
    }

    public IndiaUpiBankPickerActivity(int i) {
        this.A0E = false;
        B7Y.A00(this, 24);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        MenuItem add = menu.add(0, R.id.menuitem_search, 0, C36401kF.A0o(this.A00.A00, R.string.f12nameremoved));
        add.setIcon(R.drawable.ic_action_search).setShowAsAction(9);
        AnonymousClass0VM.A01(C36431kI.A0G(this, R.color.f6nameremoved), add);
        A43(menu);
        return super.onCreateOptionsMenu(menu);
    }

    public void onDestroy() {
        super.onDestroy();
        C183638r7 r1 = this.A07;
        if (r1 != null) {
            r1.A0D(true);
            this.A07 = null;
        }
        this.A0D.A02.A02(false);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == R.id.menuitem_help) {
            A41(R.string.f12nameremoved, "nav_bank_select", "payments:bank-select");
        } else if (itemId == R.id.menuitem_search) {
            onSearchRequested();
            return true;
        } else if (itemId == 16908332) {
            this.A0G.A04("action bar home");
            A10(this, 1);
            A3x();
            return true;
        }
        return true;
    }

    public IndiaUpiBankPickerActivity() {
        this(0);
        this.A0G = C165607th.A0b("IndiaUpiBankPickerActivity");
        this.A0F = new C176658cT();
    }
}
