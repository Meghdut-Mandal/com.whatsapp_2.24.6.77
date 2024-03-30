package com.whatsapp.newsletter.ui.directory;

import X.AnonymousClass000;
import X.AnonymousClass00S;
import X.AnonymousClass0CZ;
import X.AnonymousClass1RJ;
import X.AnonymousClass1ZS;
import X.AnonymousClass24P;
import X.AnonymousClass3UC;
import X.C17770s0;
import X.C18800tq;
import X.C18830tt;
import X.C27111My;
import X.C28711Ts;
import X.C28981Uw;
import X.C36321k7;
import X.C36331k8;
import X.C36351kA;
import X.C36371kC;
import X.C36431kI;
import X.C40971wP;
import X.C44072La;
import X.C46512Yd;
import X.C51582o3;
import X.C57682ye;
import X.C57742yk;
import X.C86764Me;
import X.C89344We;
import android.net.Uri;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.newsletter.NewsletterLinkLauncher;

public final class NewsletterDirectoryCategoriesActivity extends C46512Yd implements C17770s0 {
    public RecyclerView A00;
    public C57742yk A01;
    public C40971wP A02;
    public AnonymousClass1RJ A03;
    public boolean A04;

    public void A2F() {
        if (!this.A04) {
            this.A04 = true;
            C27111My A0L = C36351kA.A0L(this);
            C18800tq r2 = A0L.A5g;
            C36321k7.A0c(r2, this);
            C18830tt r1 = r2.A00;
            C36321k7.A0X(r2, r1, this, C36321k7.A05(r2, r1, this));
            this.A01 = (C57682ye) A0L.A3D.get();
            this.A08 = C27111My.A2g(A0L);
            this.A03 = C36371kC.A0f(r2);
            this.A06 = C36431kI.A0n(r2);
            this.A05 = (AnonymousClass1ZS) r2.A5b.get();
            AnonymousClass24P.A01(A0L, r2, C36351kA.A0S(r2), this);
            this.A01 = (C57742yk) A0L.A32.get();
        }
    }

    public void BZJ(C44072La r4, AnonymousClass00S r5) {
        AnonymousClass3UC r2 = this.A07;
        if (r2 != null) {
            r2.A0A(this, C51582o3.CONSUMER, new C86764Me(r4, this, r5));
            return;
        }
        throw C36331k8.A0d("newsletterLauncher");
    }

    public void Bba(C44072La r13) {
        String str = r13.A0J;
        if (str != null) {
            NewsletterLinkLauncher newsletterLinkLauncher = this.A04;
            if (newsletterLinkLauncher != null) {
                newsletterLinkLauncher.A01(this, Uri.parse(AnonymousClass000.A0p("whatsapp://channel/", str, AnonymousClass000.A0u())), (C28981Uw) null, C28711Ts.RECOMMENDED_NEWSLETTERS, (Long) null, str, 0, -1);
                return;
            }
            throw C36331k8.A0d("newsletterLinkLauncher");
        }
    }

    public NewsletterDirectoryCategoriesActivity(int i) {
        this.A04 = false;
        C89344We.A00(this, 24);
    }

    public void onDestroy() {
        super.onDestroy();
        RecyclerView recyclerView = this.A00;
        if (recyclerView == null) {
            throw C36331k8.A0d("recyclerView");
        }
        recyclerView.setAdapter((AnonymousClass0CZ) null);
    }

    public NewsletterDirectoryCategoriesActivity() {
        this(0);
    }
}
