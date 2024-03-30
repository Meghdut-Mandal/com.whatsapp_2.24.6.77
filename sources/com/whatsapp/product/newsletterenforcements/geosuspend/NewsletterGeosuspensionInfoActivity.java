package com.whatsapp.product.newsletterenforcements.geosuspend;

import X.AnonymousClass00C;
import X.AnonymousClass00T;
import X.AnonymousClass02E;
import X.AnonymousClass09Y;
import X.AnonymousClass155;
import X.AnonymousClass16D;
import X.AnonymousClass1M4;
import X.AnonymousClass4DG;
import X.AnonymousClass4DH;
import X.AnonymousClass4DI;
import X.AnonymousClass4DJ;
import X.AnonymousClass4DK;
import X.AnonymousClass4DL;
import X.AnonymousClass4G9;
import X.AnonymousClass4H2;
import X.AnonymousClass4H3;
import X.AnonymousClass4L8;
import X.AnonymousClass4MI;
import X.C000800j;
import X.C001400p;
import X.C023509x;
import X.C109325Xd;
import X.C1497372o;
import X.C18800tq;
import X.C18820ts;
import X.C18830tt;
import X.C27731Pn;
import X.C28981Uw;
import X.C32681e1;
import X.C33751fs;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36391kE;
import X.C36411kG;
import X.C36421kH;
import X.C36431kI;
import X.C36441kJ;
import X.C65993Ug;
import X.C89354Wf;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.WaImageView;

public final class NewsletterGeosuspensionInfoActivity extends AnonymousClass155 {
    public AnonymousClass16D A00;
    public C27731Pn A01;
    public C33751fs A02;
    public AnonymousClass1M4 A03;
    public C32681e1 A04;
    public boolean A05;
    public final AnonymousClass00T A06;
    public final AnonymousClass00T A07;
    public final AnonymousClass00T A08;
    public final AnonymousClass00T A09;
    public final AnonymousClass00T A0A;
    public final AnonymousClass00T A0B;
    public final AnonymousClass00T A0C;

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle(R.string.f12nameremoved);
        A2u();
        C36321k7.A0P(this);
        setContentView((int) R.layout.f9nameremoved);
        AnonymousClass1M4 r2 = this.A03;
        if (r2 != null) {
            C18820ts r1 = this.A00;
            AnonymousClass00T r3 = this.A07;
            Object A032 = r2.A03(r1, C36431kI.A1E(r3));
            if (A032 == null) {
                A032 = r3.getValue();
            }
            AnonymousClass00C.A0B(A032);
            C36341k9.A0s(this, C36391kE.A0P(this.A00, R.id.header_title), new Object[]{A032}, R.string.f12nameremoved);
            C36411kG.A0Q(this, R.id.channel_badge).setImageResource(R.drawable.vec_ic_warning_triangle_badge);
            AnonymousClass09Y A0O = C36341k9.A0O(this);
            A0O.A0A((AnonymousClass02E) this.A0B.getValue(), R.id.newsletter_guidelines_fragment);
            A0O.A01();
            TextView A0Q = C36391kE.A0Q(this, R.id.header_description);
            A0Q.setVisibility(0);
            C32681e1 r6 = this.A04;
            if (r6 != null) {
                A0Q.setText(r6.A03(this, new C1497372o(this, 35), C36391kE.A0v(this, "clickable-span", new Object[1], 0, R.string.f12nameremoved), "clickable-span", C36341k9.A05(this)));
                C36331k8.A10(A0Q, this.A0D);
                WaImageView A0J = C36421kH.A0J(this.A00, R.id.channel_icon);
                AnonymousClass00T r4 = this.A0C;
                C65993Ug.A00(this, ((NewsletterGeosuspensionInfoViewModel) r4.getValue()).A00, new AnonymousClass4MI(A0J, this), 42);
                C65993Ug.A00(this, ((NewsletterGeosuspensionInfoViewModel) r4.getValue()).A01, new AnonymousClass4L8(this), 43);
                NewsletterGeosuspensionInfoViewModel newsletterGeosuspensionInfoViewModel = (NewsletterGeosuspensionInfoViewModel) r4.getValue();
                C28981Uw A0i = C36431kI.A0i(this.A09);
                String A1E = C36431kI.A1E(r3);
                C36321k7.A0w(A0i, A1E);
                C36331k8.A1T(new NewsletterGeosuspensionInfoViewModel$initializeViewModel$1(A0i, newsletterGeosuspensionInfoViewModel, A1E, (C023509x) null), C109325Xd.A00(newsletterGeosuspensionInfoViewModel));
                return;
            }
            throw C36331k8.A0b();
        }
        throw C36331k8.A0d("countryUtils");
    }

    public void A2F() {
        if (!this.A05) {
            this.A05 = true;
            C18800tq A0B2 = C36331k8.A0B(this);
            C36321k7.A0c(A0B2, this);
            C18830tt r1 = A0B2.A00;
            C36321k7.A0X(A0B2, r1, this, C36321k7.A05(A0B2, r1, this));
            this.A04 = C36351kA.A0p(r1);
            this.A03 = C36361kB.A0f(A0B2);
            this.A01 = C36351kA.A0T(A0B2);
            this.A00 = C36341k9.A0R(A0B2);
            this.A02 = C36361kB.A0X(r1);
        }
    }

    public NewsletterGeosuspensionInfoActivity(int i) {
        this.A05 = false;
        C89354Wf.A00(this, 19);
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        NewsletterGeosuspensionInfoViewModel newsletterGeosuspensionInfoViewModel = (NewsletterGeosuspensionInfoViewModel) this.A0C.getValue();
        C28981Uw A0i = C36431kI.A0i(this.A09);
        String A1E = C36431kI.A1E(this.A07);
        C36321k7.A0w(A0i, A1E);
        C36331k8.A1T(new NewsletterGeosuspensionInfoViewModel$initializeViewModel$1(A0i, newsletterGeosuspensionInfoViewModel, A1E, (C023509x) null), C109325Xd.A00(newsletterGeosuspensionInfoViewModel));
    }

    public NewsletterGeosuspensionInfoActivity() {
        this(0);
        C000800j r1 = C000800j.PUBLICATION;
        this.A09 = C001400p.A00(r1, new AnonymousClass4H2(this));
        this.A07 = C001400p.A00(r1, new AnonymousClass4G9(this));
        this.A0C = C36441kJ.A0a(new AnonymousClass4DL(this), new AnonymousClass4DK(this), new AnonymousClass4H3(this), C36441kJ.A1A(NewsletterGeosuspensionInfoViewModel.class));
        this.A08 = C36431kI.A1I(new AnonymousClass4DH(this));
        this.A06 = C36431kI.A1I(new AnonymousClass4DG(this));
        this.A0A = C36431kI.A1I(new AnonymousClass4DI(this));
        this.A0B = C36431kI.A1I(new AnonymousClass4DJ(this));
    }
}
