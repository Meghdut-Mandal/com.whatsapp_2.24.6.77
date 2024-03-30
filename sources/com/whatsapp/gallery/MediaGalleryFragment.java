package com.whatsapp.gallery;

import X.AnonymousClass11F;
import X.AnonymousClass16J;
import X.AnonymousClass191;
import X.AnonymousClass1A1;
import X.AnonymousClass1DF;
import X.AnonymousClass1S3;
import X.AnonymousClass1SV;
import X.AnonymousClass2Ty;
import X.AnonymousClass2bU;
import X.AnonymousClass4TA;
import X.AnonymousClass4V2;
import X.C011004s;
import X.C18740tg;
import X.C19930wk;
import X.C20310xM;
import X.C36331k8;
import X.C64933Qa;
import X.C74833mF;
import X.C74853mH;
import X.C80243v5;
import X.C89004Uw;
import X.C90394a5;
import android.os.Bundle;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.whatsapp.R;
import com.whatsapp.StickyHeadersRecyclerView;
import com.whatsapp.scroller.RecyclerFastScroller;
import java.util.Collection;
import java.util.Iterator;

public class MediaGalleryFragment extends Hilt_MediaGalleryFragment implements AnonymousClass4TA {
    public C20310xM A00;
    public AnonymousClass1DF A01;
    public AnonymousClass16J A02;
    public AnonymousClass11F A03;
    public AnonymousClass1A1 A04;
    public AnonymousClass1SV A05;
    public C19930wk A06;
    public final AnonymousClass191 A07 = C90394a5.A00(this, 21);

    public void Bfy(AnonymousClass1S3 r1) {
    }

    public static void A00(MediaGalleryFragment mediaGalleryFragment, C74853mH r4, AnonymousClass11F r5, Collection collection) {
        if (r4 != null) {
            if (collection != null && !collection.isEmpty()) {
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    AnonymousClass11F A022 = C64933Qa.A02(it);
                    if (A022 == null || !A022.equals(mediaGalleryFragment.A03)) {
                    }
                }
                return;
            } else if (r5 != null && !r5.equals(mediaGalleryFragment.A03)) {
                return;
            }
            r4.BoI();
            mediaGalleryFragment.A07.A0H(C80243v5.A00(mediaGalleryFragment, 25));
        }
    }

    public boolean A1k(AnonymousClass4V2 r5, AnonymousClass2Ty r6) {
        AnonymousClass2bU r3 = ((C74833mF) r5).A02;
        if (r3 == null) {
            return false;
        }
        boolean A1i = A1i();
        C89004Uw r0 = (C89004Uw) A0h();
        if (A1i) {
            r6.setChecked(r0.Bvv(r3));
            return true;
        }
        r0.Bur(r3);
        r6.setChecked(true);
        return true;
    }

    public void A1H() {
        super.A1H();
        this.A02.unregisterObserver(this.A07);
        C19930wk r0 = this.A06;
        if (r0 != null) {
            r0.A02();
            this.A06 = null;
        }
    }

    public void A1S(Bundle bundle, View view) {
        super.A1S(bundle, view);
        this.A06 = new C19930wk(this.A0P, false);
        AnonymousClass11F A0F = C36331k8.A0F(A0i());
        C18740tg.A06(A0F);
        this.A03 = A0F;
        StickyHeadersRecyclerView stickyHeadersRecyclerView = this.A08;
        if (stickyHeadersRecyclerView != null) {
            C011004s.A09(stickyHeadersRecyclerView, true);
        }
        C011004s.A09(A0d().findViewById(R.id.no_media), true);
        A1g(false);
        if (A0i() instanceof MediaGalleryActivity) {
            this.A08.A0v(((MediaGalleryActivity) A0i()).A0l);
            ((RecyclerFastScroller) view.findViewById(R.id.scroller)).setAppBarLayout((CoordinatorLayout) A0i().findViewById(R.id.coordinator), (AppBarLayout) A0i().findViewById(R.id.appbar));
        }
        this.A02.registerObserver(this.A07);
    }

    public void Bg9() {
        A1b();
    }
}
