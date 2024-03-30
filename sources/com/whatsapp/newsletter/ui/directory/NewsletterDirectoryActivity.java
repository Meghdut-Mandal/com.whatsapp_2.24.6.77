package com.whatsapp.newsletter.ui.directory;

import X.AnonymousClass00T;
import X.AnonymousClass0CZ;
import X.AnonymousClass0UE;
import X.AnonymousClass11F;
import X.AnonymousClass19A;
import X.AnonymousClass1N6;
import X.AnonymousClass1ZS;
import X.AnonymousClass24P;
import X.AnonymousClass4OQ;
import X.C18750th;
import X.C18800tq;
import X.C18830tt;
import X.C19460v5;
import X.C19470v6;
import X.C27111My;
import X.C36321k7;
import X.C36331k8;
import X.C36351kA;
import X.C36361kB;
import X.C36371kC;
import X.C36431kI;
import X.C40871wF;
import X.C41051wX;
import X.C46512Yd;
import X.C52622pt;
import X.C57682ye;
import X.C57692yf;
import X.C57722yi;
import X.C84214Cj;
import X.C89344We;
import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;

public final class NewsletterDirectoryActivity extends C46512Yd implements AnonymousClass4OQ {
    public AnonymousClass0UE A00;
    public RecyclerView A01;
    public RecyclerView A02;
    public C19460v5 A03;
    public C57692yf A04;
    public C57722yi A05;
    public AnonymousClass19A A06;
    public C41051wX A07;
    public C40871wF A08;
    public C52622pt A09;
    public AnonymousClass1N6 A0A;
    public boolean A0B;
    public final AnonymousClass00T A0C;

    public boolean A2g() {
        return true;
    }

    public static final void A0F(NewsletterDirectoryActivity newsletterDirectoryActivity) {
        C19460v5 r1 = newsletterDirectoryActivity.A03;
        if (r1 == null) {
            throw C36331k8.A0d("discoveryOptional");
        } else if (r1.A05()) {
            Boolean bool = C18750th.A03;
            r1.A02();
        }
    }

    public void A2F() {
        if (!this.A0B) {
            this.A0B = true;
            C27111My A0L = C36351kA.A0L(this);
            C18800tq r1 = A0L.A5g;
            C36321k7.A0c(r1, this);
            C18830tt r2 = r1.A00;
            C36321k7.A0X(r1, r2, this, C36321k7.A05(r1, r2, this));
            this.A01 = (C57682ye) A0L.A3D.get();
            this.A08 = C27111My.A2g(A0L);
            this.A03 = C36371kC.A0f(r1);
            this.A06 = C36431kI.A0n(r1);
            this.A05 = (AnonymousClass1ZS) r1.A5b.get();
            AnonymousClass24P.A01(A0L, r1, C36351kA.A0S(r1), this);
            this.A04 = (C57692yf) A0L.A1b.get();
            this.A05 = (C57722yi) A0L.A33.get();
            this.A06 = C36361kB.A0c(r1);
            this.A0A = C36361kB.A0e(r1);
            this.A03 = C19470v6.A00;
        }
    }

    public void A2X() {
        AnonymousClass1N6 r3 = this.A0A;
        if (r3 != null) {
            AnonymousClass00T r0 = AnonymousClass1N6.A0A;
            r3.A03((AnonymousClass11F) null, 27);
            super.A2X();
            return;
        }
        throw C36331k8.A0d("navigationTimeSpentManager");
    }

    public NewsletterDirectoryActivity(int i) {
        this.A0B = false;
        C89344We.A00(this, 22);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        A0F(this);
    }

    public void onDestroy() {
        super.onDestroy();
        A0F(this);
        AnonymousClass0UE r3 = this.A00;
        if (r3 != null) {
            RecyclerView recyclerView = this.A01;
            if (recyclerView == null) {
                throw C36331k8.A0d("directoryRecyclerView");
            }
            recyclerView.A0w(r3);
        }
        RecyclerView recyclerView2 = this.A01;
        if (recyclerView2 == null) {
            throw C36331k8.A0d("directoryRecyclerView");
        }
        recyclerView2.setAdapter((AnonymousClass0CZ) null);
    }

    public NewsletterDirectoryActivity() {
        this(0);
        this.A09 = C52622pt.EXPLORE;
        this.A0C = C36431kI.A1I(new C84214Cj(this));
    }
}
