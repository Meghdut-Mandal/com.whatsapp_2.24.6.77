package com.whatsapp.stickers.store;

import X.AnonymousClass0UE;
import X.AnonymousClass1AP;
import X.AnonymousClass5LC;
import X.AnonymousClass68B;
import X.C162517oi;
import X.C21010yW;
import X.C23871Ae;
import X.C24801Dv;
import X.C35771jE;
import X.C36351kA;
import X.C606038m;
import X.C96124mp;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class StickerStoreFeaturedTabFragment extends Hilt_StickerStoreFeaturedTabFragment {
    public View A00;
    public View A01;
    public C24801Dv A02;
    public C21010yW A03;
    public C23871Ae A04;
    public C606038m A05;
    public boolean A06;
    public boolean A07;
    public final AnonymousClass0UE A08 = new C162517oi(this, 16);

    public static void A00(StickerStoreFeaturedTabFragment stickerStoreFeaturedTabFragment) {
        C96124mp r1 = stickerStoreFeaturedTabFragment.A0G;
        List list = stickerStoreFeaturedTabFragment.A0I;
        if (r1 == null) {
            AnonymousClass5LC r3 = new AnonymousClass5LC(stickerStoreFeaturedTabFragment, list);
            stickerStoreFeaturedTabFragment.A0G = r3;
            RecyclerView recyclerView = stickerStoreFeaturedTabFragment.A03;
            if (recyclerView != null) {
                recyclerView.suppressLayout(false);
                RecyclerView.A0E(r3, recyclerView, true, true);
                recyclerView.A0z(true);
                recyclerView.requestLayout();
            }
            stickerStoreFeaturedTabFragment.A1a();
            return;
        }
        r1.A00 = list;
        r1.A06();
    }

    public static boolean A03(StickerStoreFeaturedTabFragment stickerStoreFeaturedTabFragment) {
        if (stickerStoreFeaturedTabFragment.A05.A0L() || !stickerStoreFeaturedTabFragment.A1c() || stickerStoreFeaturedTabFragment.A0A.A01()) {
            return false;
        }
        return true;
    }

    public void A1H() {
        this.A04.A00(3);
        super.A1H();
    }

    public void A1a() {
        super.A1a();
        View view = this.A01;
        if (view != null) {
            view.setVisibility(C36351kA.A00(this.A07 ? 1 : 0));
        }
    }

    public void A1b(AnonymousClass68B r5, int i) {
        super.A1b(r5, i);
        r5.A07 = false;
        this.A0G.A07(i);
        AnonymousClass1AP r3 = this.A0E;
        r3.A0N.Boy(new C35771jE(r3, r5, 4));
    }
}
