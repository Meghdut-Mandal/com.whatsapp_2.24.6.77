package com.whatsapp.newsletter.ui.directory.filter.country;

import X.AnonymousClass00C;
import X.AnonymousClass1ZS;
import X.AnonymousClass355;
import X.AnonymousClass3AO;
import X.AnonymousClass3NG;
import X.C012005e;
import X.C20810yC;
import X.C36411kG;
import X.C40451vZ;
import X.C41141wj;
import X.C50782lZ;
import X.C89724Xq;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import com.whatsapp.wds.components.search.WDSSearchView;

public final class CountrySelectorBottomSheet extends Hilt_CountrySelectorBottomSheet {
    public View A00;
    public RecyclerView A01;
    public C20810yC A02;
    public AnonymousClass1ZS A03;
    public AnonymousClass355 A04;
    public C40451vZ A05;
    public C41141wj A06;
    public WDSSearchView A07;
    public String A08 = "";

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        String string;
        AnonymousClass00C.A0D(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.f9nameremoved, viewGroup);
        Bundle bundle2 = this.A0A;
        String str = "";
        if (!(bundle2 == null || (string = bundle2.getString("SELECTED_COUNTRY_ISO", str)) == null)) {
            str = string;
        }
        this.A08 = str;
        this.A01 = (RecyclerView) C012005e.A02(inflate, R.id.country_list);
        this.A00 = C012005e.A02(inflate, R.id.country_no_results_view);
        WDSSearchView wDSSearchView = (WDSSearchView) C012005e.A02(inflate, R.id.search_bar);
        this.A07 = wDSSearchView;
        if (wDSSearchView != null) {
            wDSSearchView.setBackImageDrawableRes(R.drawable.vec_ic_nav_search);
        }
        WDSSearchView wDSSearchView2 = this.A07;
        if (wDSSearchView2 != null) {
            wDSSearchView2.setHint((int) R.string.f12nameremoved);
        }
        WDSSearchView wDSSearchView3 = this.A07;
        if (wDSSearchView3 != null) {
            wDSSearchView3.setOnQueryTextChangeListener(new C89724Xq(this, 4));
        }
        return inflate;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x008d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A1S(android.os.Bundle r11, android.view.View r12) {
        /*
            r10 = this;
            r7 = 0
            X.AnonymousClass00C.A0D(r12, r7)
            super.A1S(r11, r12)
            X.1wj r0 = new X.1wj
            r0.<init>(r10)
            r10.A06 = r0
            X.1vZ r1 = new X.1vZ
            r1.<init>(r10)
            X.1wj r0 = r10.A06
            if (r0 == 0) goto L_0x001a
            r1.BnA(r0)
        L_0x001a:
            r10.A05 = r1
            androidx.recyclerview.widget.RecyclerView r0 = r10.A01
            if (r0 == 0) goto L_0x0023
            r0.setAdapter(r1)
        L_0x0023:
            androidx.recyclerview.widget.RecyclerView r0 = r10.A01
            if (r0 == 0) goto L_0x002a
            X.C36321k7.A0Q(r0)
        L_0x002a:
            X.04H r1 = X.C36441kJ.A0b(r10)
            java.lang.Class<com.whatsapp.countries.CountryListViewModel> r0 = com.whatsapp.countries.CountryListViewModel.class
            X.04R r6 = r1.A00(r0)
            com.whatsapp.countries.CountryListViewModel r6 = (com.whatsapp.countries.CountryListViewModel) r6
            java.lang.String r8 = r10.A08
            X.0yC r1 = r10.A02
            if (r1 == 0) goto L_0x0112
            r0 = 1777(0x6f1, float:2.49E-42)
            boolean r9 = r1.A0E(r0)
            X.1M4 r2 = r6.A03
            X.0ts r1 = r6.A02
            java.util.Locale r0 = X.C36401kF.A0x(r1)
            java.lang.String r0 = X.C26621Kw.A05(r0)
            java.util.List r5 = X.AnonymousClass1M4.A02(r2, r0)
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L_0x0062
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r0 = X.C26621Kw.A05(r0)
            java.util.List r5 = X.AnonymousClass1M4.A02(r2, r0)
        L_0x0062:
            java.util.Locale r1 = X.C36401kF.A0x(r1)
            X.3x2 r0 = new X.3x2
            r0.<init>(r1)
            java.util.Collections.sort(r5, r0)
            java.lang.String r4 = "N/A"
            r3 = 0
            if (r9 == 0) goto L_0x00d7
            java.lang.String r1 = r6.A04
            boolean r0 = r1.equals(r8)
            if (r0 == 0) goto L_0x00d7
            X.35o r0 = new X.35o
            r0.<init>(r1, r1)
            r5.add(r7, r0)
        L_0x0083:
            java.util.ArrayList r7 = X.C36361kB.A0r(r5)
        L_0x0087:
            int r0 = r5.size()
            if (r3 >= r0) goto L_0x0102
            java.lang.Object r8 = r5.get(r3)
            X.35o r8 = (X.C598635o) r8
            X.1N4 r1 = r6.A01
            java.lang.String r0 = r8.A00
            X.3O9 r0 = r1.A02(r0)
            if (r0 != 0) goto L_0x00ca
            java.lang.String r0 = r8.A00
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x00ca
            java.lang.String r1 = r6.A04
            java.lang.String r0 = r8.A00
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x00ca
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "CountryListViewModel saw unknown country "
            r1.append(r0)
            java.lang.String r0 = r8.A00
            r1.append(r0)
            java.lang.String r0 = "="
            r1.append(r0)
            java.lang.String r0 = r8.A01
            X.C36341k9.A1O(r1, r0)
        L_0x00c7:
            int r3 = r3 + 1
            goto L_0x0087
        L_0x00ca:
            java.lang.String r2 = r8.A01
            java.lang.String r1 = r8.A00
            X.36Z r0 = new X.36Z
            r0.<init>(r2, r1)
            r7.add(r0)
            goto L_0x00c7
        L_0x00d7:
            java.util.Iterator r1 = r5.iterator()
        L_0x00db:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0083
            java.lang.Object r2 = r1.next()
            X.35o r2 = (X.C598635o) r2
            java.lang.String r0 = r2.A00
            boolean r0 = r8.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x00db
            r1.remove()
            if (r9 == 0) goto L_0x00fe
            java.lang.String r1 = r6.A04
            X.35o r0 = new X.35o
            r0.<init>(r1, r1)
            r5.add(r7, r0)
        L_0x00fe:
            r5.add(r7, r2)
            goto L_0x0083
        L_0x0102:
            X.00s r2 = r6.A00
            r2.A0D(r7)
            X.4Kt r1 = new X.4Kt
            r1.<init>(r10)
            r0 = 17
            X.C65993Ug.A00(r10, r2, r1, r0)
            return
        L_0x0112:
            java.lang.RuntimeException r0 = X.C36321k7.A07()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.newsletter.ui.directory.filter.country.CountrySelectorBottomSheet.A1S(android.os.Bundle, android.view.View):void");
    }

    public void A1k(AnonymousClass3NG r3) {
        AnonymousClass00C.A0D(r3, 0);
        C50782lZ r0 = C50782lZ.A00;
        AnonymousClass3AO r1 = r3.A00;
        r1.A04 = r0;
        r1.A02 = C36411kG.A00() / 2;
    }

    public void onDismiss(DialogInterface dialogInterface) {
        AnonymousClass00C.A0D(dialogInterface, 0);
        super.onDismiss(dialogInterface);
        AnonymousClass355 r0 = this.A04;
        if (r0 != null) {
            r0.A00.A3o();
        }
    }

    public void A19() {
        C41141wj r1;
        super.A19();
        C40451vZ r0 = this.A05;
        if (!(r0 == null || (r1 = this.A06) == null)) {
            r0.A01.unregisterObserver(r1);
        }
        this.A01 = null;
        AnonymousClass355 r02 = this.A04;
        if (r02 != null) {
            r02.A00.A3o();
        }
        this.A04 = null;
        this.A07 = null;
        this.A00 = null;
    }

    public void A1B() {
        super.A1B();
        AnonymousClass355 r0 = this.A04;
        if (r0 != null) {
            r0.A00.A3o();
        }
    }

    public int A1Y() {
        return R.style.f13nameremoved;
    }
}
