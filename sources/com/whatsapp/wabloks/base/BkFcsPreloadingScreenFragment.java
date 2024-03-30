package com.whatsapp.wabloks.base;

import X.AnonymousClass001;
import X.AnonymousClass02E;
import X.AnonymousClass5OH;
import X.AnonymousClass6D3;
import X.AnonymousClass6EW;
import X.AnonymousClass6XK;
import X.AnonymousClass709;
import X.C09020bh;
import X.C120325rK;
import X.C122855vX;
import X.C131376Ou;
import X.C134906bn;
import X.C149026zo;
import X.C149046zq;
import X.C1501674f;
import X.C1502474n;
import X.C158047fi;
import X.C158077fl;
import X.C163077pc;
import X.C164207rR;
import X.C36321k7;
import X.C36411kG;
import X.C36431kI;
import X.C90474aD;
import X.C90524aI;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.whatsapp.R;
import java.util.ArrayList;
import java.util.Map;
import java.util.Queue;

public class BkFcsPreloadingScreenFragment extends Hilt_BkFcsPreloadingScreenFragment {
    public C158047fi A00;
    public AnonymousClass6EW A01;
    public C131376Ou A02;
    public C120325rK A03;
    public AnonymousClass6D3 A04;
    public String A05;
    public String A06;
    public Map A07;
    public boolean A08 = false;
    public boolean A09 = false;
    public boolean A0A = false;
    public String A0B;
    public final Queue A0C = C90524aI.A0l();

    public static BkFcsPreloadingScreenFragment A00(C134906bn r3, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        BkFcsPreloadingScreenFragment bkFcsPreloadingScreenFragment = new BkFcsPreloadingScreenFragment();
        bkFcsPreloadingScreenFragment.A1c(str);
        if (bkFcsPreloadingScreenFragment.A0A == null) {
            bkFcsPreloadingScreenFragment.A17(AnonymousClass001.A07());
        }
        bkFcsPreloadingScreenFragment.A0b().putString("config_prefixed_state_name", str2);
        C90474aD.A14(bkFcsPreloadingScreenFragment, r3, str6, str5);
        BkFragment.A05(bkFcsPreloadingScreenFragment);
        bkFcsPreloadingScreenFragment.A0b().putString("data_module_job_id", str3);
        bkFcsPreloadingScreenFragment.A0b().putString("data_module_namespace", str4);
        if (bkFcsPreloadingScreenFragment.A0A == null) {
            bkFcsPreloadingScreenFragment.A17(AnonymousClass001.A07());
        }
        bkFcsPreloadingScreenFragment.A0b().putString("fds_manager_id", str7);
        if (bkFcsPreloadingScreenFragment.A0A == null) {
            bkFcsPreloadingScreenFragment.A17(AnonymousClass001.A07());
        }
        bkFcsPreloadingScreenFragment.A0b().putString("observer_id", str8);
        return bkFcsPreloadingScreenFragment;
    }

    public static void A03(BkFcsPreloadingScreenFragment bkFcsPreloadingScreenFragment, AnonymousClass709 r7) {
        Map map = bkFcsPreloadingScreenFragment.A07;
        if (map != null) {
            ArrayList A0I = AnonymousClass001.A0I();
            A0I.add("");
            String str = r7.A00;
            if ("onLoadingFailure".equals(str)) {
                A0I.add(r7.A02);
            }
            C158077fl r1 = (C158077fl) map.get(str);
            C158047fi r0 = bkFcsPreloadingScreenFragment.A00;
            if (r1 != null && r0 != null) {
                bkFcsPreloadingScreenFragment.A04.A00(new C1502474n(((C164207rR) r0).A00, r1.B7y(), A0I, 6));
            }
        }
    }

    public void A1f() {
        AnonymousClass6EW r1 = this.A01;
        if (r1 != null) {
            r1.A02(new C149026zo());
        }
        super.A1f();
    }

    public Animation A0e(int i, int i2, boolean z) {
        if (i2 != R.anim.f1nameremoved) {
            return null;
        }
        Animation loadAnimation = AnimationUtils.loadAnimation(A0h(), i2);
        if (loadAnimation != null && z) {
            this.A03.A00 = true;
            loadAnimation.setAnimationListener(new C163077pc(this, 3));
        }
        return loadAnimation;
    }

    public void A1H() {
        super.A1H();
        AnonymousClass6EW r0 = this.A01;
        if (r0 != null) {
            r0.A04(this);
            this.A01 = null;
        }
    }

    public void A1K() {
        super.A1K();
        this.A09 = false;
    }

    public void A1L() {
        super.A1L();
        this.A09 = true;
        while (true) {
            Queue queue = this.A0C;
            if (!queue.isEmpty()) {
                C36411kG.A1O(queue.remove());
            } else {
                return;
            }
        }
    }

    public void A1Q(Bundle bundle) {
        AnonymousClass6XK r0;
        this.A05 = C36431kI.A17(A0b(), "config_prefixed_state_name");
        this.A0B = C36431kI.A17(A0b(), "screen_name");
        this.A06 = C36431kI.A17(A0b(), "observer_id");
        String A17 = C36431kI.A17(A0b(), "fds_manager_id");
        AnonymousClass6D3 r6 = this.A04;
        String str = this.A0B;
        String string = A0b().getString("screen_params");
        C36321k7.A0w(str, A17);
        C134906bn A002 = r6.A02.A00(A17);
        if (A002 != null) {
            C122855vX r02 = (C122855vX) r6.A01.A01(new AnonymousClass5OH(r6.A00, str, string), A002.A01);
            if (!(r02 == null || (r0 = r02.A01) == null)) {
                this.A02 = r0;
            }
        }
        super.A1Q(bundle);
        AnonymousClass6EW A022 = this.A02.A02(this.A06);
        this.A01 = A022;
        AnonymousClass6EW.A00(A022, AnonymousClass709.class, this, 13);
    }

    public void A1S(Bundle bundle, View view) {
        super.A1S(bundle, view);
        AnonymousClass02E.A01(this).A0E = true;
        C09020bh.A00(view, new C1501674f(this, 1));
    }

    public void A1a() {
        super.A1a();
        this.A08 = true;
        if (!this.A0A) {
            A0q();
        }
    }

    public void A1e() {
        super.A1e();
        AnonymousClass6EW r1 = this.A01;
        if (r1 != null) {
            r1.A02(new C149046zq());
        }
    }
}
