package com.google.android.material.datepicker;

import X.AnonymousClass02E;
import X.AnonymousClass0Hx;
import X.AnonymousClass0I1;
import X.AnonymousClass0IC;
import X.AnonymousClass0IK;
import X.AnonymousClass0TV;
import X.AnonymousClass0f0;
import X.C012005e;
import X.C014506h;
import X.C023109s;
import X.C03350Ef;
import X.C03360Eg;
import X.C03800Ht;
import X.C03820Hy;
import X.C08720bD;
import X.C10940fT;
import X.C11590gg;
import X.C18120se;
import X.C18290sv;
import X.C18340t0;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.format.DateUtils;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.whatsapp.R;

public final class MaterialCalendar extends PickerFragment {
    public static final Object A0B = "MONTHS_VIEW_GROUP_TAG";
    public static final Object A0C = "NAVIGATION_NEXT_TAG";
    public static final Object A0D = "NAVIGATION_PREV_TAG";
    public static final Object A0E = "SELECTOR_TOGGLE_TAG";
    public View A00;
    public View A01;
    public View A02;
    public View A03;
    public RecyclerView A04;
    public RecyclerView A05;
    public C08720bD A06;
    public C10940fT A07;
    public Integer A08;
    public int A09;
    public AnonymousClass0TV A0A;

    public void A1R(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.A09);
        bundle.putParcelable("GRID_SELECTOR_KEY", (Parcelable) null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.A06);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", (Parcelable) null);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.A07);
    }

    public void A1Y(C10940fT r8) {
        RecyclerView recyclerView = this.A04;
        C03820Hy r1 = (C03820Hy) recyclerView.A0G;
        int A0L = r1.A0L(r8);
        int A0L2 = A0L - r1.A0L(this.A07);
        boolean z = true;
        boolean z2 = false;
        if (Math.abs(A0L2) > 3) {
            z2 = true;
        }
        if (A0L2 <= 0) {
            z = false;
        }
        this.A07 = r8;
        if (z2) {
            int i = A0L + 3;
            if (z) {
                i = A0L - 3;
            }
            recyclerView.A0h(i);
        }
        this.A04.post(new C11590gg(this, A0L));
    }

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C03360Eg r0;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(A1D(), this.A09);
        this.A0A = new AnonymousClass0TV(contextThemeWrapper);
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        C10940fT r9 = this.A06.A05;
        boolean A032 = C014506h.A03(contextThemeWrapper, 16843277);
        int i = R.layout.f9nameremoved;
        int i2 = 0;
        if (A032) {
            i = R.layout.f9nameremoved;
            i2 = 1;
        }
        View inflate = cloneInContext.inflate(i, viewGroup, false);
        Resources resources = A0a().getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.f7nameremoved) + resources.getDimensionPixelOffset(R.dimen.f7nameremoved) + resources.getDimensionPixelOffset(R.dimen.f7nameremoved);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.f7nameremoved);
        int i3 = C03350Ef.A03;
        inflate.setMinimumHeight(dimensionPixelSize + dimensionPixelSize2 + (i3 * resources.getDimensionPixelSize(R.dimen.f7nameremoved)) + ((i3 - 1) * resources.getDimensionPixelOffset(R.dimen.f7nameremoved)) + resources.getDimensionPixelOffset(R.dimen.f7nameremoved));
        GridView gridView = (GridView) inflate.findViewById(R.id.mtrl_calendar_days_of_week);
        C012005e.A0V(gridView, new C18120se(this, 4));
        int i4 = this.A06.A01;
        if (i4 <= 0) {
            r0 = new C03360Eg();
        }
        gridView.setAdapter(r0);
        gridView.setNumColumns(r9.A02);
        gridView.setEnabled(false);
        this.A04 = (RecyclerView) inflate.findViewById(R.id.mtrl_calendar_months);
        A1D();
        this.A04.setLayoutManager(new C03800Ht(this, i2, i2));
        this.A04.setTag("MONTHS_VIEW_GROUP_TAG");
        C03820Hy r4 = new C03820Hy(contextThemeWrapper, this.A06, new AnonymousClass0f0(this));
        this.A04.setAdapter(r4);
        int integer = contextThemeWrapper.getResources().getInteger(R.integer.f8nameremoved);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.mtrl_calendar_year_selector_frame);
        this.A05 = recyclerView;
        if (recyclerView != null) {
            recyclerView.A0U = true;
            recyclerView.setLayoutManager(new GridLayoutManager(integer, 1));
            this.A05.setAdapter(new AnonymousClass0Hx(this));
            this.A05.A0t(new AnonymousClass0I1(this));
        }
        if (inflate.findViewById(R.id.month_navigation_fragment_toggle) != null) {
            MaterialButton materialButton = (MaterialButton) inflate.findViewById(R.id.month_navigation_fragment_toggle);
            materialButton.setTag("SELECTOR_TOGGLE_TAG");
            C012005e.A0V(materialButton, new C18120se(this, 6));
            View findViewById = inflate.findViewById(R.id.month_navigation_previous);
            this.A02 = findViewById;
            findViewById.setTag("NAVIGATION_PREV_TAG");
            View findViewById2 = inflate.findViewById(R.id.month_navigation_next);
            this.A01 = findViewById2;
            findViewById2.setTag("NAVIGATION_NEXT_TAG");
            this.A03 = inflate.findViewById(R.id.mtrl_calendar_year_selector_frame);
            this.A00 = inflate.findViewById(R.id.mtrl_calendar_day_selector_frame);
            this.A08 = C023109s.A00;
            AnonymousClass02E.A04(this, 8, 0);
            A1Y(this.A07);
            C10940fT r7 = this.A07;
            String str = r7.A00;
            if (str == null) {
                str = DateUtils.formatDateTime((Context) null, r7.A05.getTimeInMillis(), 8228);
                r7.A00 = str;
            }
            materialButton.setText(str);
            this.A04.A0v(new AnonymousClass0IC(materialButton, this, r4));
            materialButton.setOnClickListener(new C18340t0(this, 3));
            this.A01.setOnClickListener(new C18290sv(r4, this, 2));
            this.A02.setOnClickListener(new C18290sv(r4, this, 1));
        }
        if (!C014506h.A03(contextThemeWrapper, 16843277)) {
            new AnonymousClass0IK().A07(this.A04);
        }
        this.A04.A0h(r4.A0L(this.A07));
        C012005e.A0V(this.A04, new C18120se(this, 5));
        return inflate;
    }

    public void A1Q(Bundle bundle) {
        super.A1Q(bundle);
        if (bundle == null) {
            bundle = this.A0A;
        }
        this.A09 = bundle.getInt("THEME_RES_ID_KEY");
        bundle.getParcelable("GRID_SELECTOR_KEY");
        this.A06 = (C08720bD) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        bundle.getParcelable("DAY_VIEW_DECORATOR_KEY");
        this.A07 = (C10940fT) bundle.getParcelable("CURRENT_MONTH_KEY");
    }
}
