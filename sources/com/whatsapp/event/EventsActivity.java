package com.whatsapp.event;

import X.AnonymousClass00T;
import X.AnonymousClass155;
import X.AnonymousClass1N6;
import X.AnonymousClass4BM;
import X.C000800j;
import X.C001400p;
import X.C023509x;
import X.C18800tq;
import X.C18830tt;
import X.C27111My;
import X.C33311f5;
import X.C36321k7;
import X.C36331k8;
import X.C36351kA;
import X.C36361kB;
import X.C36421kH;
import X.C36431kI;
import X.C40751w3;
import X.C51282nZ;
import X.C54252se;
import X.C57632yZ;
import X.C84984Fi;
import X.C89334Wd;
import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;

public final class EventsActivity extends AnonymousClass155 {
    public RecyclerView A00;
    public C57632yZ A01;
    public C40751w3 A02;
    public AnonymousClass1N6 A03;
    public boolean A04;
    public final AnonymousClass00T A05;
    public final AnonymousClass00T A06;
    public final AnonymousClass00T A07;

    public boolean A2g() {
        return true;
    }

    public void A2F() {
        if (!this.A04) {
            this.A04 = true;
            C27111My A0L = C36351kA.A0L(this);
            C18800tq r2 = A0L.A5g;
            C36321k7.A0c(r2, this);
            C18830tt r1 = r2.A00;
            C36321k7.A0X(r2, r1, this, C36321k7.A05(r2, r1, this));
            this.A03 = C36361kB.A0e(r2);
            this.A01 = (C57632yZ) A0L.A1P.get();
        }
    }

    public void A2X() {
        AnonymousClass1N6 r2 = this.A03;
        if (r2 != null) {
            r2.A03(C36421kH.A0O(this.A05), 57);
            super.A2X();
            return;
        }
        throw C36331k8.A0d("navigationTimeSpentManager");
    }

    public EventsActivity(int i) {
        this.A04 = false;
        C89334Wd.A00(this, 23);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.f9nameremoved);
        setTitle(R.string.f12nameremoved);
        C36321k7.A0P(this);
        C36331k8.A1T(new EventsActivity$onCreate$1(this, (C023509x) null), C33311f5.A00(this));
        this.A00 = (RecyclerView) C36361kB.A0H(this, R.id.events_recycler_view);
        this.A02 = new C40751w3(C51282nZ.values()[C36331k8.A02(this.A07)]);
        RecyclerView recyclerView = this.A00;
        if (recyclerView == null) {
            throw C36331k8.A0d("eventsRecyclerView");
        }
        recyclerView.getContext();
        C36321k7.A0Q(recyclerView);
        C40751w3 r0 = this.A02;
        if (r0 == null) {
            throw C36331k8.A0d("eventsAdapter");
        }
        recyclerView.setAdapter(r0);
    }

    public EventsActivity() {
        this(0);
        this.A05 = C001400p.A00(C000800j.PUBLICATION, new C84984Fi(this));
        this.A07 = C54252se.A00(this, "source", 0);
        this.A06 = C36431kI.A1I(new AnonymousClass4BM(this));
    }
}
