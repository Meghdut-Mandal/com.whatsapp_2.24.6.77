package com.whatsapp.bonsai.discovery;

import X.AnonymousClass0Ey;
import X.AnonymousClass155;
import X.AnonymousClass17T;
import X.AnonymousClass48H;
import X.AnonymousClass48I;
import X.AnonymousClass48J;
import X.AnonymousClass48K;
import X.AnonymousClass4MS;
import X.C12560iI;
import X.C1273167u;
import X.C18800tq;
import X.C18830tt;
import X.C20800yB;
import X.C21000yV;
import X.C21010yW;
import X.C36321k7;
import X.C36331k8;
import X.C36351kA;
import X.C36441kJ;
import X.C42831zZ;
import X.C45162Qh;
import X.C55492ui;
import X.C63943Ma;
import X.C68393bp;
import X.C84774En;
import X.C84784Eo;
import X.C85714Id;
import X.C85724Ie;
import X.C89314Wb;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager2.widget.ViewPager2;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.material.tabs.TabLayout;
import com.whatsapp.R;
import java.util.Objects;

public final class BonsaiDiscoveryActivity extends AnonymousClass155 {
    public AnonymousClass17T A00;
    public C21010yW A01;
    public boolean A02;
    public boolean A03 = false;
    public boolean A04;

    public void A2F() {
        if (!this.A03) {
            this.A03 = true;
            C18800tq A0B = C36331k8.A0B(this);
            C36321k7.A0c(A0B, this);
            C18830tt r1 = A0B.A00;
            C36321k7.A0X(A0B, r1, this, C36321k7.A05(A0B, r1, this));
            this.A01 = C36351kA.A0g(A0B);
            this.A00 = (AnonymousClass17T) A0B.A7S.get();
        }
    }

    public BonsaiDiscoveryActivity() {
        super(R.layout.f9nameremoved);
        C89314Wb.A00(this, 27);
    }

    public void onCreate(Bundle bundle) {
        Integer valueOf;
        super.onCreate(bundle);
        setTitle(R.string.f12nameremoved);
        this.A04 = C20800yB.A01(C21000yV.A01, this.A0D, 7067);
        View findViewById = findViewById(R.id.toolbar_holder);
        setSupportActionBar((Toolbar) findViewById.findViewById(R.id.toolbar));
        C36321k7.A0P(this);
        ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type com.google.android.material.appbar.AppBarLayout.LayoutParams");
        AnonymousClass0Ey r1 = (AnonymousClass0Ey) layoutParams;
        r1.A00 = 21;
        findViewById.setLayoutParams(r1);
        C42831zZ r6 = new C42831zZ(this);
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tab_layout);
        tabLayout.A0G(new C63943Ma(this, 0));
        View findViewById2 = findViewById(R.id.touch_interceptor);
        ViewPager2 viewPager2 = (ViewPager2) findViewById(R.id.view_pager);
        viewPager2.setAdapter(r6);
        new C1273167u(viewPager2, tabLayout, new C68393bp(r6)).A01();
        C12560iI A0a = C36441kJ.A0a(new AnonymousClass48I(this), new AnonymousClass48H(this), new C84774En(this), C36441kJ.A1A(BonsaiDiscoveryViewModel.class));
        ((BonsaiDiscoveryViewModel) A0a.getValue()).A02.A0D((Object) null);
        C55492ui.A01(this, ((BonsaiDiscoveryViewModel) A0a.getValue()).A00, new AnonymousClass4MS(findViewById2, (ShimmerFrameLayout) findViewById(R.id.shimmer_container), r6), 31);
        C55492ui.A01(this, ((BonsaiDiscoveryViewModel) A0a.getValue()).A01, new C85714Id(this), 30);
        C55492ui.A01(this, ((BonsaiDiscoveryViewModel) A0a.getValue()).A02, new C85724Ie(this), 29);
        C21010yW r4 = this.A01;
        if (r4 != null) {
            C45162Qh r3 = new C45162Qh();
            r3.A00 = 29;
            int intExtra = getIntent().getIntExtra("bonsaiDiscoveryEntryPoint", -1);
            if (intExtra == -1) {
                valueOf = null;
            } else {
                valueOf = Integer.valueOf(intExtra);
            }
            r3.A01 = valueOf;
            r4.Bly(r3);
            return;
        }
        throw C36331k8.A0d("wamRuntime");
    }

    public void onStart() {
        super.onStart();
        if (this.A04) {
            C12560iI A0a = C36441kJ.A0a(new AnonymousClass48K(this), new AnonymousClass48J(this), new C84784Eo(this), C36441kJ.A1A(BonsaiDiscoveryViewModel.class));
            if (((BonsaiDiscoveryViewModel) A0a.getValue()).A02.A04() != null) {
                ((BonsaiDiscoveryViewModel) A0a.getValue()).A02.A0D((Object) null);
            }
        }
    }
}
