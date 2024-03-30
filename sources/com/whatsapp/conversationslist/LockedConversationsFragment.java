package com.whatsapp.conversationslist;

import X.AnonymousClass00C;
import X.AnonymousClass11F;
import X.AnonymousClass3YU;
import X.AnonymousClass4B1;
import X.AnonymousClass4K0;
import X.C009904e;
import X.C023409w;
import X.C106475Jv;
import X.C235718z;
import X.C25731Hl;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36371kC;
import X.C36401kF;
import X.C36411kG;
import X.C81193wc;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import com.whatsapp.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class LockedConversationsFragment extends Hilt_LockedConversationsFragment {
    public View A00;
    public View A01;
    public View A02;
    public C009904e A03;

    public void A1U(Menu menu, MenuInflater menuInflater) {
    }

    public int A1a() {
        return 8;
    }

    public static final void A03(LockedConversationsFragment lockedConversationsFragment) {
        C36331k8.A0w(C36351kA.A0A(((C25731Hl) C36411kG.A0a(lockedConversationsFragment.A32).A0B.get()).A01), "has_suppressed_banner", true);
        C36331k8.A0y(lockedConversationsFragment.A01);
    }

    public void A1Q(Bundle bundle) {
        if (!C36371kC.A1U(C36411kG.A0E(((C25731Hl) C36411kG.A0a(this.A32).A0B.get()).A01), "has_suppressed_banner")) {
            C235718z A0a = C36411kG.A0a(this.A32);
            AnonymousClass4B1 r1 = new AnonymousClass4B1(this);
            Resources A0G = C36341k9.A0G(this);
            AnonymousClass00C.A08(A0G);
            this.A03 = A0a.A06(A0G, this, r1);
        }
        super.A1Q(bundle);
    }

    public List A1d() {
        if (!C36411kG.A0a(this.A32).A0O()) {
            return C023409w.A00;
        }
        ArrayList A08 = this.A1F.A08();
        ArrayList A0J = C36321k7.A0J(A08);
        Iterator it = A08.iterator();
        while (it.hasNext()) {
            AnonymousClass11F A0a = C36401kF.A0a(it);
            if (this.A2f.A0k(A0a)) {
                C81193wc.A01(this.A2u, this, A0a, 8);
            }
            A0J.add(new C106475Jv(A0a, 2));
        }
        return A0J;
    }

    public void A1h() {
        if (!C36411kG.A1a(C36411kG.A0a(this.A32).A06.A01)) {
            View view = this.A00;
            if (view != null) {
                view.setVisibility(8);
            }
            View view2 = this.A1Z.A00;
            if (view2 != null) {
                view2.setVisibility(8);
            }
            if (A0h() != null && this.A02 == null) {
                this.A02 = A22(R.layout.f9nameremoved);
            }
            View view3 = this.A01;
            if (view3 != null) {
                view3.setVisibility(8);
            }
        } else {
            View view4 = this.A02;
            if (view4 != null) {
                view4.setVisibility(8);
            }
            C36361kB.A14(this.A1Z.A00);
            C235718z A0a = C36411kG.A0a(this.A32);
            A0a.A07.A07().A0A(new AnonymousClass3YU(new AnonymousClass4K0(this), A0a, 0));
        }
        super.A1h();
    }
}
