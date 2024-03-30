package com.whatsapp.community.communityInfo;

import X.AnonymousClass00C;
import X.AnonymousClass00T;
import X.AnonymousClass014;
import X.AnonymousClass08S;
import X.AnonymousClass147;
import X.AnonymousClass16D;
import X.AnonymousClass17Y;
import X.AnonymousClass1LV;
import X.AnonymousClass49Q;
import X.AnonymousClass49R;
import X.AnonymousClass49S;
import X.AnonymousClass49T;
import X.AnonymousClass49U;
import X.AnonymousClass4FO;
import X.AnonymousClass4J6;
import X.AnonymousClass4J7;
import X.AnonymousClass4O9;
import X.AnonymousClass4OA;
import X.C000800j;
import X.C001400p;
import X.C009904e;
import X.C19770wU;
import X.C19970wo;
import X.C21010yW;
import X.C235718z;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36431kI;
import X.C40951wN;
import X.C45632Sc;
import X.C53822rw;
import X.C81093wS;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public final class CAGInfoFragment extends Hilt_CAGInfoFragment {
    public AnonymousClass17Y A00;
    public C235718z A01;
    public AnonymousClass1LV A02;
    public AnonymousClass16D A03;
    public C19970wo A04;
    public C21010yW A05;
    public AnonymousClass4O9 A06;
    public AnonymousClass4OA A07;
    public C19770wU A08;
    public C009904e A09;
    public final AnonymousClass00T A0A = C36431kI.A1I(new AnonymousClass49Q(this));
    public final AnonymousClass00T A0B = C001400p.A00(C000800j.NONE, new AnonymousClass4FO(this));
    public final AnonymousClass00T A0C = C36431kI.A1I(new AnonymousClass49R(this));
    public final AnonymousClass00T A0D = C36431kI.A1I(new AnonymousClass49S(this));
    public final AnonymousClass00T A0E = C36431kI.A1I(new AnonymousClass49T(this));
    public final C45632Sc A0F = new C45632Sc();

    public void A1Q(Bundle bundle) {
        C235718z r2 = this.A01;
        if (r2 != null) {
            AnonymousClass49U r1 = new AnonymousClass49U(this);
            Resources A0G = C36341k9.A0G(this);
            AnonymousClass00C.A08(A0G);
            this.A09 = r2.A06(A0G, this, r1);
            super.A1Q(bundle);
            return;
        }
        throw C36331k8.A0d("chatLockManager");
    }

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        RecyclerView recyclerView = new RecyclerView(A0a(), (AttributeSet) null);
        A1D();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1);
        linearLayoutManager.A1f(1);
        recyclerView.setLayoutManager(linearLayoutManager);
        if (bundle == null) {
            C19770wU r1 = this.A08;
            if (r1 != null) {
                C81093wS.A01(r1, this, 22);
            } else {
                throw C36321k7.A08();
            }
        }
        AnonymousClass00T r0 = this.A0B;
        AnonymousClass147 A0k = C36431kI.A0k(r0);
        AnonymousClass1LV r12 = this.A02;
        if (r12 != null) {
            AnonymousClass147 A022 = r12.A02(C36431kI.A0k(r0));
            C40951wN r8 = new C40951wN(this.A09, this.A0F, A0k, A022);
            AnonymousClass00T r5 = this.A0A;
            AnonymousClass08S r3 = ((CAGInfoViewModel) r5.getValue()).A08;
            AnonymousClass00T r4 = this.A0C;
            C53822rw.A01((AnonymousClass014) r4.getValue(), r3, new AnonymousClass4J6(r8), 32);
            C53822rw.A01((AnonymousClass014) r4.getValue(), ((CAGInfoViewModel) r5.getValue()).A0L, new AnonymousClass4J7(this), 33);
            r8.A0B(true);
            recyclerView.setAdapter(r8);
            return recyclerView;
        }
        throw C36331k8.A0d("communityChatManager");
    }

    public void A1H() {
        super.A1H();
        C21010yW r1 = this.A05;
        if (r1 != null) {
            r1.Bly(this.A0F);
            return;
        }
        throw C36331k8.A0d("wamRuntime");
    }
}
