package com.whatsapp.updates.ui.statusmuting;

import X.AnonymousClass00C;
import X.AnonymousClass00T;
import X.AnonymousClass012;
import X.AnonymousClass01Y;
import X.AnonymousClass05R;
import X.AnonymousClass0CZ;
import X.AnonymousClass0D3;
import X.AnonymousClass1RY;
import X.AnonymousClass2L7;
import X.AnonymousClass3CD;
import X.AnonymousClass4ES;
import X.AnonymousClass4UI;
import X.C023409w;
import X.C19630wG;
import X.C19770wU;
import X.C27731Pn;
import X.C32101cy;
import X.C36321k7;
import X.C36351kA;
import X.C36371kC;
import X.C36401kF;
import X.C36431kI;
import X.C42581z3;
import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;
import java.util.List;

public final class MutedStatusesAdapter extends AnonymousClass0CZ implements AnonymousClass4UI, AnonymousClass01Y {
    public AnonymousClass2L7 A00;
    public List A01 = C023409w.A00;
    public C32101cy A02;
    public final AnonymousClass3CD A03;
    public final AnonymousClass1RY A04;
    public final AnonymousClass00T A05;

    public /* bridge */ /* synthetic */ AnonymousClass0D3 BUw(ViewGroup viewGroup, int i) {
        AnonymousClass00C.A0D(viewGroup, 0);
        return this.A03.A00(C36371kC.A0J(C36351kA.A0C(viewGroup), viewGroup, R.layout.f9nameremoved, false), this.A04, this);
    }

    public void BbJ() {
    }

    public void BhM(AnonymousClass05R r3, AnonymousClass012 r4) {
        int A06 = C36431kI.A06(r3, 1);
        if (A06 == 3) {
            C36351kA.A1H(this.A00);
        } else if (A06 == 5) {
            this.A04.A02();
            this.A02 = null;
        }
    }

    public int A0J() {
        return this.A01.size();
    }

    public /* bridge */ /* synthetic */ void BSE(AnonymousClass0D3 r2, int i) {
        C42581z3 r22 = (C42581z3) r2;
        AnonymousClass00C.A0D(r22, 0);
        C36401kF.A1N(r22, this.A01, i);
    }

    public void BhQ(UserJid userJid) {
        C32101cy r0 = this.A02;
        if (r0 != null) {
            r0.BhQ(userJid);
        }
    }

    public void BhV(UserJid userJid, boolean z) {
        C32101cy r0 = this.A02;
        if (r0 != null) {
            r0.BhV(userJid, z);
        }
    }

    public MutedStatusesAdapter(AnonymousClass3CD r3, C27731Pn r4, C19630wG r5, C32101cy r6, C19770wU r7) {
        C36321k7.A18(r7, r4, r5, r3);
        this.A03 = r3;
        this.A02 = r6;
        this.A05 = C36431kI.A1I(new AnonymousClass4ES(r7));
        this.A04 = r4.A05(r5.A00, "muted_statuses_activity");
    }
}
