package com.whatsapp.status.seeall.adapter;

import X.AnonymousClass000;
import X.AnonymousClass00C;
import X.AnonymousClass00T;
import X.AnonymousClass012;
import X.AnonymousClass01Y;
import X.AnonymousClass05R;
import X.AnonymousClass0CZ;
import X.AnonymousClass0D3;
import X.AnonymousClass190;
import X.AnonymousClass1RY;
import X.AnonymousClass2L6;
import X.AnonymousClass3CD;
import X.AnonymousClass4E5;
import X.AnonymousClass4UI;
import X.C023409w;
import X.C19630wG;
import X.C19770wU;
import X.C27731Pn;
import X.C36321k7;
import X.C36331k8;
import X.C36351kA;
import X.C36361kB;
import X.C36401kF;
import X.C36431kI;
import X.C42581z3;
import X.C48022gZ;
import X.C48122gk;
import X.C48132gl;
import X.C48352hB;
import X.C48382hE;
import X.C55392uY;
import X.C55402uZ;
import X.C87324Oi;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.DialogFragment;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;
import com.whatsapp.status.seeall.StatusSeeAllActivity;
import com.whatsapp.status.viewmodels.StatusesViewModel;
import java.util.List;

public final class StatusSeeAllAdapter extends AnonymousClass0CZ implements AnonymousClass4UI, AnonymousClass01Y {
    public AnonymousClass2L6 A00;
    public List A01 = C023409w.A00;
    public final AnonymousClass3CD A02;
    public final AnonymousClass1RY A03;
    public final C87324Oi A04;
    public final C19770wU A05;
    public final AnonymousClass00T A06 = C36431kI.A1I(new AnonymousClass4E5(this));

    public /* bridge */ /* synthetic */ AnonymousClass0D3 BUw(ViewGroup viewGroup, int i) {
        AnonymousClass0D3 A002;
        AnonymousClass00C.A0D(viewGroup, 0);
        if (i == 1) {
            AnonymousClass3CD r2 = this.A02;
            View A0E = C36361kB.A0E(C36351kA.A0C(viewGroup), viewGroup, R.layout.f9nameremoved);
            AnonymousClass00C.A08(A0E);
            A002 = r2.A00(A0E, this.A03, this);
        } else if (i == 2) {
            View A0E2 = C36361kB.A0E(C36331k8.A09(viewGroup), viewGroup, R.layout.f9nameremoved);
            AnonymousClass00C.A08(A0E2);
            A002 = new C48352hB(A0E2);
        } else if (i == 3) {
            View A0E3 = C36361kB.A0E(C36331k8.A09(viewGroup), viewGroup, R.layout.f9nameremoved);
            AnonymousClass00C.A08(A0E3);
            A002 = new C48382hE(A0E3, this);
        } else {
            throw AnonymousClass000.A0d("View type not supported ", AnonymousClass000.A0u(), i);
        }
        AnonymousClass00C.A0E(A002, "null cannot be cast to non-null type com.whatsapp.updates.ui.adapter.viewholders.UpdatesViewHolder<com.whatsapp.updates.ui.adapter.UpdatesDataItem>");
        return A002;
    }

    public void BbJ() {
    }

    public void BhM(AnonymousClass05R r3, AnonymousClass012 r4) {
        int A062 = C36431kI.A06(r3, 1);
        if (A062 == 3) {
            C36351kA.A1H(this.A00);
        } else if (A062 == 5) {
            this.A03.A02();
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
        StatusSeeAllActivity statusSeeAllActivity = (StatusSeeAllActivity) this.A04;
        if (statusSeeAllActivity.A06 != null) {
            statusSeeAllActivity.startActivity(AnonymousClass190.A0b(statusSeeAllActivity, userJid, false, false, false));
            StatusesViewModel statusesViewModel = statusSeeAllActivity.A0B;
            if (statusesViewModel == null) {
                throw C36331k8.A0d("statusesViewModel");
            }
            statusesViewModel.A0U(userJid, (Integer) null, (Integer) null);
            return;
        }
        throw C36331k8.A0X();
    }

    public void BhV(UserJid userJid, boolean z) {
        DialogFragment dialogFragment;
        StatusSeeAllActivity statusSeeAllActivity = (StatusSeeAllActivity) this.A04;
        StatusesViewModel statusesViewModel = statusSeeAllActivity.A0B;
        UserJid userJid2 = userJid;
        if (z) {
            if (statusesViewModel == null) {
                throw C36331k8.A0d("statusesViewModel");
            }
            dialogFragment = C55402uZ.A00(userJid2, (Long) null, (String) null, (String) null, StatusesViewModel.A01(statusesViewModel), true);
        } else if (statusesViewModel == null) {
            throw C36331k8.A0d("statusesViewModel");
        } else {
            dialogFragment = C55392uY.A00(userJid2, (Long) null, (String) null, (String) null, StatusesViewModel.A01(statusesViewModel), true);
        }
        statusSeeAllActivity.Btm(dialogFragment);
    }

    public int getItemViewType(int i) {
        Object obj = this.A01.get(i);
        if (obj instanceof C48022gZ) {
            return 1;
        }
        if (obj instanceof C48122gk) {
            return 2;
        }
        if (obj instanceof C48132gl) {
            return 3;
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("View type not supported ");
        A0u.append(this.A01.get(i));
        throw AnonymousClass000.A0b(A0u);
    }

    public StatusSeeAllAdapter(AnonymousClass3CD r3, C27731Pn r4, C19630wG r5, C87324Oi r6, C19770wU r7) {
        C36321k7.A18(r7, r4, r5, r3);
        this.A05 = r7;
        this.A02 = r3;
        this.A04 = r6;
        this.A03 = r4.A05(r5.A00, "StatusSeeAllActivity");
    }
}
