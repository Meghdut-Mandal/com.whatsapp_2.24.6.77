package com.whatsapp.updates.ui.statusmuting;

import X.AnonymousClass00C;
import X.AnonymousClass01N;
import X.AnonymousClass0CZ;
import X.AnonymousClass155;
import X.AnonymousClass190;
import X.AnonymousClass3CD;
import X.AnonymousClass4LY;
import X.AnonymousClass4ZG;
import X.C022709o;
import X.C02800By;
import X.C18800tq;
import X.C18830tt;
import X.C19770wU;
import X.C27111My;
import X.C32101cy;
import X.C32251dE;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C55402uZ;
import X.C57942z4;
import X.C57952z5;
import X.C65963Ud;
import X.C68073bI;
import X.C89374Wh;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.DialogFragment;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import com.whatsapp.WaTextView;
import com.whatsapp.jid.UserJid;
import com.whatsapp.status.viewmodels.StatusesViewModel;

public final class MutedStatusesActivity extends AnonymousClass155 implements C32101cy, C022709o {
    public RecyclerView A00;
    public C57942z4 A01;
    public C57952z5 A02;
    public WaTextView A03;
    public C32251dE A04;
    public MutedStatusesAdapter A05;
    public MutedStatusesViewModel A06;
    public boolean A07;

    public void BVg(DialogFragment dialogFragment, boolean z) {
    }

    public void BhQ(UserJid userJid) {
        startActivity(AnonymousClass190.A0b(this, userJid, false, false, false));
        MutedStatusesViewModel mutedStatusesViewModel = this.A06;
        if (mutedStatusesViewModel == null) {
            throw C36331k8.A0a();
        }
        mutedStatusesViewModel.A04.A0U(userJid, (Integer) null, (Integer) null);
    }

    public void A2F() {
        if (!this.A07) {
            this.A07 = true;
            C27111My A0L = C36351kA.A0L(this);
            C18800tq r2 = A0L.A5g;
            C36321k7.A0c(r2, this);
            C18830tt r1 = r2.A00;
            C36321k7.A0X(r2, r1, this, C36321k7.A05(r2, r1, this));
            this.A01 = (C57942z4) A0L.A2z.get();
            this.A04 = (C32251dE) r1.A0E.get();
            this.A02 = (C57952z5) A0L.A03.get();
        }
    }

    public void BhV(UserJid userJid, boolean z) {
        MutedStatusesViewModel mutedStatusesViewModel = this.A06;
        if (mutedStatusesViewModel == null) {
            throw C36331k8.A0a();
        }
        Btm(C55402uZ.A00(userJid, (Long) null, (String) null, (String) null, StatusesViewModel.A01(mutedStatusesViewModel.A04), true));
    }

    public MutedStatusesActivity(int i) {
        this.A07 = false;
        C89374Wh.A00(this, 19);
    }

    public void onCreate(Bundle bundle) {
        C36331k8.A0l(this);
        super.onCreate(bundle);
        setTitle(R.string.f12nameremoved);
        A2u();
        C36321k7.A0P(this);
        setContentView((int) R.layout.f9nameremoved);
        this.A03 = (WaTextView) C36361kB.A0H(this, R.id.no_statuses_text_view);
        C32251dE r1 = this.A04;
        if (r1 != null) {
            StatusesViewModel A002 = C68073bI.A00(this, r1, true);
            C57952z5 r12 = this.A02;
            if (r12 != null) {
                AnonymousClass00C.A0D(A002, 1);
                this.A06 = (MutedStatusesViewModel) AnonymousClass4ZG.A00(this, A002, r12, 15).A00(MutedStatusesViewModel.class);
                this.A06.A04(A002);
                AnonymousClass01N r13 = this.A06;
                MutedStatusesViewModel mutedStatusesViewModel = this.A06;
                if (mutedStatusesViewModel == null) {
                    throw C36331k8.A0a();
                }
                r13.A04(mutedStatusesViewModel);
                C57942z4 r14 = this.A01;
                if (r14 != null) {
                    C19770wU A0Z = C36341k9.A0Z(r14.A00.A01);
                    C18800tq r0 = r14.A00.A01;
                    MutedStatusesAdapter mutedStatusesAdapter = new MutedStatusesAdapter((AnonymousClass3CD) r0.A00.A14.get(), C36351kA.A0T(r0), C36351kA.A0W(r0), this, A0Z);
                    this.A05 = mutedStatusesAdapter;
                    this.A06.A04(mutedStatusesAdapter);
                    View findViewById = findViewById(R.id.muted_statuses_list);
                    RecyclerView recyclerView = (RecyclerView) findViewById;
                    MutedStatusesAdapter mutedStatusesAdapter2 = this.A05;
                    if (mutedStatusesAdapter2 == null) {
                        throw C36331k8.A0d("adapter");
                    }
                    recyclerView.setAdapter(mutedStatusesAdapter2);
                    C36321k7.A0Q(recyclerView);
                    recyclerView.setItemAnimator((C02800By) null);
                    AnonymousClass00C.A08(findViewById);
                    this.A00 = recyclerView;
                    MutedStatusesViewModel mutedStatusesViewModel2 = this.A06;
                    if (mutedStatusesViewModel2 == null) {
                        throw C36331k8.A0a();
                    }
                    C65963Ud.A01(this, mutedStatusesViewModel2.A00, new AnonymousClass4LY(this), 36);
                    return;
                }
                throw C36331k8.A0d("adapterFactory");
            }
            throw C36331k8.A0d("mutedStatusesViewModelFactory");
        }
        throw C36331k8.A0d("statusesViewModelFactory");
    }

    public void onDestroy() {
        super.onDestroy();
        RecyclerView recyclerView = this.A00;
        if (recyclerView == null) {
            throw C36331k8.A0d("recylerView");
        }
        recyclerView.setAdapter((AnonymousClass0CZ) null);
    }

    public MutedStatusesActivity() {
        this(0);
    }
}
