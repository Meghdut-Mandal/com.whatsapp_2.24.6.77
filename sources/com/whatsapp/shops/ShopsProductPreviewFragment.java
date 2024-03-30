package com.whatsapp.shops;

import X.C012005e;
import X.C122875vZ;
import X.C32691e2;
import X.C36361kB;
import X.C36431kI;
import X.C36441kJ;
import X.C48762i0;
import X.C603337l;
import X.C81173wa;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.whatsapp.R;

public class ShopsProductPreviewFragment extends Hilt_ShopsProductPreviewFragment {
    public ConstraintLayout A00;
    public ShimmerFrameLayout A01;
    public C32691e2 A02;
    public C603337l A03;
    public ShopsProductPreviewFragmentViewModel A04;
    public C122875vZ A05;
    public Runnable A06;
    public String A07;
    public final Handler A08 = new Handler();

    public void A1a() {
        Runnable runnable = this.A06;
        if (runnable != null) {
            this.A08.removeCallbacks(runnable);
        }
        this.A01.A04();
        this.A01.setVisibility(8);
    }

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C36361kB.A0E(layoutInflater, viewGroup, R.layout.f9nameremoved);
    }

    public void A1Q(Bundle bundle) {
        super.A1Q(bundle);
        this.A07 = C36431kI.A17(A0b(), "shopUrl");
        this.A04 = (ShopsProductPreviewFragmentViewModel) C36441kJ.A0b(this).A00(ShopsProductPreviewFragmentViewModel.class);
    }

    public void A1S(Bundle bundle, View view) {
        super.A1S(bundle, view);
        A0d();
        this.A01 = (ShimmerFrameLayout) C012005e.A02(view, R.id.shimmer_container);
        this.A00 = (ConstraintLayout) C012005e.A02(view, R.id.placeholder_container);
        C48762i0.A00(C012005e.A02(view, R.id.see_all), this, 47);
        C81173wa r3 = new C81173wa((Object) this, 9);
        this.A06 = r3;
        this.A08.postDelayed(r3, 200);
    }

    public int A1Y() {
        return R.id.bk_container;
    }
}
