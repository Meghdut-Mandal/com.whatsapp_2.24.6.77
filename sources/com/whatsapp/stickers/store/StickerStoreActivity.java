package com.whatsapp.stickers.store;

import X.AnonymousClass000;
import X.AnonymousClass02E;
import X.AnonymousClass04F;
import X.AnonymousClass21I;
import X.AnonymousClass3UF;
import X.AnonymousClass6DR;
import X.AnonymousClass6O1;
import X.C02460Ak;
import X.C138726ib;
import X.C18820ts;
import X.C36351kA;
import X.C39351s8;
import X.C430524r;
import X.C63943Ma;
import X.C67103Yn;
import X.C81183wb;
import X.C89194Vp;
import X.C89704Xo;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.tabs.TabLayout;
import com.whatsapp.R;

public class StickerStoreActivity extends C430524r {
    public ViewPager A00;
    public BottomSheetBehavior A01;
    public C18820ts A02;
    public AnonymousClass6O1 A03;
    public C39351s8 A04;
    public StickerStoreFeaturedTabFragment A05;
    public StickerStoreMyTabFragment A06;
    public String A07;
    public View A08;
    public TabLayout A09;

    private void A01(AnonymousClass02E r3, int i) {
        this.A04.A00.add(r3);
        TabLayout tabLayout = this.A09;
        AnonymousClass6DR A082 = tabLayout.A08();
        A082.A01(i);
        tabLayout.A0H(A082);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1 && i2 == 1 && this.A04 != null) {
            this.A00.postDelayed(C81183wb.A00(this, 3), 300);
        }
    }

    public void onCreate(Bundle bundle) {
        AnonymousClass02E r1;
        int i;
        super.onCreate(bundle);
        setContentView((int) R.layout.f9nameremoved);
        View view = this.A00;
        this.A08 = view;
        View findViewById = view.findViewById(R.id.store_container);
        this.A09 = (TabLayout) this.A08.findViewById(R.id.sticker_store_tabs);
        this.A00 = (ViewPager) this.A08.findViewById(R.id.sticker_store_pager);
        this.A04 = new C39351s8(getSupportFragmentManager());
        this.A05 = new StickerStoreFeaturedTabFragment();
        this.A06 = new StickerStoreMyTabFragment();
        this.A05.A06 = AnonymousClass000.A1W(bundle);
        AnonymousClass04F.A05(this.A09, 0);
        if (C36351kA.A1Y(this.A02)) {
            A01(this.A05, R.string.f12nameremoved);
            r1 = this.A06;
            i = R.string.f12nameremoved;
        } else {
            A01(this.A06, R.string.f12nameremoved);
            r1 = this.A05;
            i = R.string.f12nameremoved;
        }
        A01(r1, i);
        this.A00.setAdapter(this.A04);
        this.A00.A0K(new C138726ib(this.A09));
        this.A00.A0K(new C89704Xo(this, 3));
        this.A07 = StickerStoreFeaturedTabFragment.class.getName();
        this.A00.A0J(C36351kA.A1Y(this.A02) ^ true ? 1 : 0, false);
        this.A09.A0G(new C63943Ma(this, 3));
        Toolbar toolbar = (Toolbar) findViewById.findViewById(R.id.toolbar);
        AnonymousClass3UF.A0D(this, toolbar, this.A02, R.color.f6nameremoved);
        toolbar.setNavigationContentDescription((int) R.string.f12nameremoved);
        toolbar.setTitle((int) R.string.f12nameremoved);
        toolbar.setNavigationOnClickListener(new C67103Yn((Object) this, 20));
        AnonymousClass21I r0 = new AnonymousClass21I(this);
        this.A01 = r0;
        r0.A0d(true);
        this.A01.A0W(4);
        this.A01.A0h = true;
        BottomSheetBehavior bottomSheetBehavior = this.A01;
        ((C02460Ak) findViewById.getLayoutParams()).A00(bottomSheetBehavior);
        C89194Vp.A00(bottomSheetBehavior, this, 13);
    }

    public void onStart() {
        super.onStart();
        BottomSheetBehavior bottomSheetBehavior = this.A01;
        if (bottomSheetBehavior != null && bottomSheetBehavior.A0J == 4) {
            this.A08.post(C81183wb.A00(this, 4));
        }
    }
}
