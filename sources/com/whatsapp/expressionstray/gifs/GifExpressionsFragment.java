package com.whatsapp.expressionstray.gifs;

import X.AnonymousClass00C;
import X.AnonymousClass00T;
import X.AnonymousClass05H;
import X.AnonymousClass1GZ;
import X.AnonymousClass3Y1;
import X.AnonymousClass5SQ;
import X.AnonymousClass67Z;
import X.AnonymousClass7gZ;
import X.C000800j;
import X.C001400p;
import X.C007403e;
import X.C009003v;
import X.C012005e;
import X.C019308f;
import X.C023509x;
import X.C06820Vf;
import X.C1043659j;
import X.C109325Xd;
import X.C12560iI;
import X.C13010j1;
import X.C152577La;
import X.C152587Lb;
import X.C152597Lc;
import X.C152607Ld;
import X.C152617Le;
import X.C152627Lf;
import X.C154447Sf;
import X.C154457Sg;
import X.C158237gb;
import X.C162517oi;
import X.C165177t0;
import X.C176228bm;
import X.C18510tH;
import X.C19890wg;
import X.C21010yW;
import X.C21060yb;
import X.C36331k8;
import X.C36371kC;
import X.C36441kJ;
import X.C85104Fu;
import X.C85114Fv;
import X.C85124Fw;
import X.C85134Fx;
import X.C90494aF;
import X.C96174mu;
import X.C96224mz;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.expressionstray.ExpressionsSearchViewModel;
import com.whatsapp.infra.gifsearch.controls.AdaptiveRecyclerView;
import java.util.concurrent.CancellationException;

public final class GifExpressionsFragment extends Hilt_GifExpressionsFragment implements AnonymousClass7gZ, C158237gb {
    public View A00;
    public View A01;
    public View A02;
    public View A03;
    public C21060yb A04;
    public ExpressionsSearchViewModel A05;
    public C21010yW A06;
    public AnonymousClass1GZ A07;
    public C96174mu A08;
    public AdaptiveRecyclerView A09;
    public C19890wg A0A;
    public final AnonymousClass00T A0B;

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        AnonymousClass00C.A0D(layoutInflater, 0);
        return C36371kC.A0J(layoutInflater, viewGroup, R.layout.f9nameremoved, false);
    }

    public void A1S(Bundle bundle, View view) {
        AnonymousClass00C.A0D(view, 0);
        this.A00 = C012005e.A02(view, R.id.gifs_search_no_results);
        this.A02 = C012005e.A02(view, R.id.retry_panel);
        this.A01 = C012005e.A02(view, R.id.retry_button);
        this.A09 = (AdaptiveRecyclerView) C012005e.A02(view, R.id.search_result_view);
        this.A03 = C012005e.A02(view, R.id.progress_container_layout);
        AnonymousClass5SQ r4 = new AnonymousClass5SQ(this, 0);
        AnonymousClass1GZ r3 = this.A07;
        if (r3 != null) {
            C21010yW r2 = this.A06;
            if (r2 != null) {
                C21060yb r1 = this.A04;
                if (r1 != null) {
                    C19890wg r5 = this.A0A;
                    if (r5 != null) {
                        this.A08 = new C1043659j(r1, r2, r3, r4, r5);
                        AdaptiveRecyclerView adaptiveRecyclerView = this.A09;
                        if (adaptiveRecyclerView != null) {
                            adaptiveRecyclerView.A0t(new C96224mz(adaptiveRecyclerView.getResources().getDimensionPixelSize(R.dimen.f7nameremoved)));
                            adaptiveRecyclerView.setAdapter(this.A08);
                            adaptiveRecyclerView.A0v(new C162517oi(this, 10));
                        }
                        View view2 = this.A01;
                        if (view2 != null) {
                            AnonymousClass3Y1.A00(view2, this, 28);
                        }
                        AnonymousClass00T r42 = this.A0B;
                        C165177t0.A00(A0m(), ((GifExpressionsSearchViewModel) r42.getValue()).A03, new C154447Sf(this), 16);
                        C165177t0.A00(A0m(), ((GifExpressionsSearchViewModel) r42.getValue()).A02, new C154457Sg(this), 15);
                        Bundle bundle2 = this.A0A;
                        boolean z = false;
                        if (bundle2 != null && bundle2.getBoolean("isExpressionsSearch")) {
                            AnonymousClass00T A002 = C001400p.A00(C000800j.NONE, new C152577La(new C152597Lc(this)));
                            C019308f A1A = C36441kJ.A1A(ExpressionsSearchViewModel.class);
                            this.A05 = (ExpressionsSearchViewModel) new C12560iI(new C152587Lb(A002), new C85114Fv(this, A002), new C85104Fu(A002), A1A).getValue();
                        }
                        Bundle bundle3 = this.A0A;
                        if (bundle3 != null) {
                            z = bundle3.getBoolean("isSelected");
                        }
                        Br5(z);
                        if (C90494aF.A1V(this)) {
                            Br5(true);
                            return;
                        }
                        return;
                    }
                    throw C36331k8.A0d("sharedPreferencesFactory");
                }
                throw C36331k8.A0W();
            }
            throw C36331k8.A0d("wamRuntime");
        }
        throw C36331k8.A0d("gifCache");
    }

    public void BTx() {
    }

    public void Br5(boolean z) {
        if (z) {
            AnonymousClass00T r1 = this.A0B;
            if (!(((GifExpressionsSearchViewModel) r1.getValue()).A02.A04() instanceof C176228bm)) {
                GifExpressionsSearchViewModel gifExpressionsSearchViewModel = (GifExpressionsSearchViewModel) r1.getValue();
                C007403e r0 = gifExpressionsSearchViewModel.A00;
                if (r0 != null) {
                    r0.B2S((CancellationException) null);
                }
                gifExpressionsSearchViewModel.A00 = C06820Vf.A01(C109325Xd.A00(gifExpressionsSearchViewModel), new C18510tH((C009003v) new GifExpressionsSearchViewModel$startDataLoad$1(gifExpressionsSearchViewModel, (C023509x) null), (AnonymousClass05H) new C13010j1((C007403e) null, gifExpressionsSearchViewModel.A06.A01), 5));
            }
        }
    }

    public GifExpressionsFragment() {
        AnonymousClass00T A002 = C001400p.A00(C000800j.NONE, new C152607Ld(new C152627Lf(this)));
        C019308f A1A = C36441kJ.A1A(GifExpressionsSearchViewModel.class);
        this.A0B = new C12560iI(new C152617Le(A002), new C85134Fx(this, A002), new C85124Fw(A002), A1A);
    }

    public void A1J() {
        super.A1J();
        this.A00 = null;
        this.A02 = null;
        this.A01 = null;
        this.A03 = null;
        this.A09 = null;
        C96174mu r0 = this.A08;
        if (r0 != null) {
            r0.A00 = null;
            r0.A0L((AnonymousClass67Z) null);
        }
        this.A08 = null;
    }
}
