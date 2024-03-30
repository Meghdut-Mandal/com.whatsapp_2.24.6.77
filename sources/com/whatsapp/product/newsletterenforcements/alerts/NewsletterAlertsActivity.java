package com.whatsapp.product.newsletterenforcements.alerts;

import X.AnonymousClass00T;
import X.AnonymousClass155;
import X.AnonymousClass1RJ;
import X.AnonymousClass4D1;
import X.AnonymousClass4D2;
import X.AnonymousClass4L2;
import X.AnonymousClass4OU;
import X.C023509x;
import X.C109325Xd;
import X.C18800tq;
import X.C18830tt;
import X.C220412q;
import X.C27111My;
import X.C28981Uw;
import X.C32681e1;
import X.C33751fs;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36441kJ;
import X.C39771tc;
import X.C40851wD;
import X.C57782yo;
import X.C65313Ro;
import X.C65993Ug;
import X.C85384Gw;
import X.C89354Wf;
import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;

public final class NewsletterAlertsActivity extends AnonymousClass155 {
    public RecyclerView A00;
    public C57782yo A01;
    public C33751fs A02;
    public C220412q A03;
    public C40851wD A04;
    public AnonymousClass4OU A05;
    public C32681e1 A06;
    public AnonymousClass1RJ A07;
    public AnonymousClass1RJ A08;
    public AnonymousClass1RJ A09;
    public boolean A0A;
    public final AnonymousClass00T A0B;

    public void A2F() {
        if (!this.A0A) {
            this.A0A = true;
            C27111My A0L = C36351kA.A0L(this);
            C18800tq r2 = A0L.A5g;
            C36321k7.A0c(r2, this);
            C18830tt r1 = r2.A00;
            C36321k7.A0X(r2, r1, this, C36321k7.A05(r2, r1, this));
            this.A03 = C36351kA.A0a(r2);
            this.A01 = (C57782yo) A0L.A1o.get();
            this.A05 = (AnonymousClass4OU) A0L.A1p.get();
            this.A06 = C36351kA.A0p(r1);
            this.A02 = C36361kB.A0X(r1);
        }
    }

    public NewsletterAlertsActivity(int i) {
        this.A0A = false;
        C89354Wf.A00(this, 16);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle(R.string.f12nameremoved);
        A2u();
        C36321k7.A0P(this);
        setContentView((int) R.layout.f9nameremoved);
        this.A00 = (RecyclerView) C36361kB.A0H(this, R.id.channel_alert_item);
        this.A09 = C36351kA.A0r(this, R.id.alerts_list_loading_indicator_container);
        this.A07 = C36351kA.A0r(this, R.id.alerts_list_empty_results_container);
        this.A08 = C36351kA.A0r(this, R.id.alerts_list_generic_error_container);
        C57782yo r1 = this.A01;
        if (r1 != null) {
            C65313Ro r0 = C28981Uw.A03;
            C28981Uw A002 = C65313Ro.A00(C36341k9.A0d(this));
            C18800tq r02 = r1.A00.A01;
            C40851wD r2 = new C40851wD(C36351kA.A0J(r02), C36341k9.A0T(r02), A002);
            this.A04 = r2;
            RecyclerView recyclerView = this.A00;
            if (recyclerView == null) {
                throw C36331k8.A0d("recyclerView");
            }
            recyclerView.setAdapter(r2);
            RecyclerView recyclerView2 = this.A00;
            if (recyclerView2 == null) {
                throw C36331k8.A0d("recyclerView");
            }
            C36321k7.A0Q(recyclerView2);
            AnonymousClass00T r3 = this.A0B;
            C65993Ug.A00(this, ((C39771tc) r3.getValue()).A00, new AnonymousClass4L2(this), 37);
            C39771tc r32 = (C39771tc) r3.getValue();
            C36331k8.A1T(new NewsletterAlertsViewModel$refreshAlerts$1(r32, (C023509x) null), C109325Xd.A00(r32));
            return;
        }
        throw C36331k8.A0d("newsletterAlertsAdapterFactory");
    }

    public NewsletterAlertsActivity() {
        this(0);
        this.A0B = C36441kJ.A0a(new AnonymousClass4D1(this), new AnonymousClass4D2(this), new C85384Gw(this), C36441kJ.A1A(C39771tc.class));
    }
}
