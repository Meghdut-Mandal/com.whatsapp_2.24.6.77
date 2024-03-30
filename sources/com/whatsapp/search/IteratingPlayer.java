package com.whatsapp.search;

import X.AnonymousClass00N;
import X.AnonymousClass05R;
import X.AnonymousClass0CP;
import X.AnonymousClass0D3;
import X.AnonymousClass0UE;
import X.AnonymousClass17Y;
import X.C17060qe;
import X.C36321k7;
import X.C81153wY;
import X.C89144Vk;
import X.C97024oH;
import android.view.View;
import androidx.lifecycle.OnLifecycleEvent;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public final class IteratingPlayer implements C17060qe, AnonymousClass00N {
    public int A00;
    public int A01;
    public int A02;
    public boolean A03;
    public final AnonymousClass0UE A04 = new C89144Vk(this, 9);
    public final RecyclerView A05;
    public final AnonymousClass17Y A06;
    public final Runnable A07 = new C81153wY((Object) this, 49);

    public static final void A02(IteratingPlayer iteratingPlayer) {
        iteratingPlayer.A03 = false;
        iteratingPlayer.A00(iteratingPlayer.A00, false);
        iteratingPlayer.A06.A0G(iteratingPlayer.A07);
    }

    private final void A00(int i, boolean z) {
        C97024oH r1;
        AnonymousClass0D3 A0R = this.A05.A0R(i, false);
        if ((A0R instanceof C97024oH) && (r1 = (C97024oH) A0R) != null) {
            r1.A0E(z);
        }
    }

    public static final void A01(IteratingPlayer iteratingPlayer) {
        if (!iteratingPlayer.A03) {
            iteratingPlayer.A03 = true;
            iteratingPlayer.A06.A0I(iteratingPlayer.A07, 2000);
        }
    }

    public static final void A03(IteratingPlayer iteratingPlayer) {
        LinearLayoutManager linearLayoutManager;
        AnonymousClass0CP layoutManager = iteratingPlayer.A05.getLayoutManager();
        if (!(layoutManager instanceof LinearLayoutManager) || (linearLayoutManager = (LinearLayoutManager) layoutManager) == null) {
            A01(iteratingPlayer);
            return;
        }
        iteratingPlayer.A01 = linearLayoutManager.A1S();
        iteratingPlayer.A02 = linearLayoutManager.A1U();
    }

    public static final void A04(IteratingPlayer iteratingPlayer, int i) {
        C97024oH r1;
        if (iteratingPlayer.A01 > 0 || iteratingPlayer.A02 > 0) {
            iteratingPlayer.A00(iteratingPlayer.A00, false);
            int max = Math.max(i, iteratingPlayer.A01);
            int i2 = iteratingPlayer.A02;
            if (max > i2) {
                max = i2;
            }
            int i3 = max;
            do {
                AnonymousClass0D3 A0R = iteratingPlayer.A05.A0R(i3, false);
                if (!(A0R instanceof C97024oH) || (r1 = (C97024oH) A0R) == null || !r1.A0F()) {
                    i3++;
                    int i4 = iteratingPlayer.A02;
                    if (i3 > i4) {
                        i3 = iteratingPlayer.A01;
                    }
                    if (max == i3) {
                        break;
                    } else if (i3 > i4) {
                        break;
                    }
                } else {
                    iteratingPlayer.A00(i3, true);
                    iteratingPlayer.A00 = i3;
                    return;
                }
            } while (i3 < iteratingPlayer.A01);
        }
        A02(iteratingPlayer);
    }

    public IteratingPlayer(RecyclerView recyclerView, AnonymousClass17Y r4) {
        C36321k7.A0x(r4, recyclerView);
        this.A06 = r4;
        this.A05 = recyclerView;
    }

    public void BTV(View view) {
        A03(this);
        A01(this);
    }

    @OnLifecycleEvent(AnonymousClass05R.ON_START)
    public final void onStart() {
        A01(this);
    }

    @OnLifecycleEvent(AnonymousClass05R.ON_STOP)
    public final void onStop() {
        A02(this);
    }

    public void BTW(View view) {
        A03(this);
    }
}
