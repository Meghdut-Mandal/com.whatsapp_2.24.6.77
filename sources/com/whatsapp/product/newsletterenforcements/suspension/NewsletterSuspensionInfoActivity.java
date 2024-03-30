package com.whatsapp.product.newsletterenforcements.suspension;

import X.AnonymousClass001;
import X.AnonymousClass00C;
import X.AnonymousClass00T;
import X.AnonymousClass02E;
import X.AnonymousClass09Y;
import X.AnonymousClass155;
import X.AnonymousClass16D;
import X.AnonymousClass2Z0;
import X.AnonymousClass4DQ;
import X.AnonymousClass4DR;
import X.AnonymousClass4DS;
import X.AnonymousClass4DT;
import X.AnonymousClass4DU;
import X.AnonymousClass4DV;
import X.AnonymousClass4DW;
import X.AnonymousClass4DX;
import X.AnonymousClass4H4;
import X.AnonymousClass4H5;
import X.AnonymousClass4L9;
import X.AnonymousClass4LA;
import X.AnonymousClass4MJ;
import X.C000800j;
import X.C001400p;
import X.C023509x;
import X.C109325Xd;
import X.C1497372o;
import X.C18800tq;
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
import X.C36401kF;
import X.C36411kG;
import X.C36421kH;
import X.C36431kI;
import X.C36441kJ;
import X.C55142u8;
import X.C65993Ug;
import X.C89354Wf;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.WaImageView;

public final class NewsletterSuspensionInfoActivity extends AnonymousClass155 {
    public AnonymousClass16D A00;
    public C27731Pn A01;
    public C33751fs A02;
    public C32681e1 A03;
    public boolean A04;
    public final AnonymousClass00T A05;
    public final AnonymousClass00T A06;
    public final AnonymousClass00T A07;
    public final AnonymousClass00T A08;
    public final AnonymousClass00T A09;
    public final AnonymousClass00T A0A;
    public final AnonymousClass00T A0B;
    public final AnonymousClass00T A0C;

    public static final void A01(AnonymousClass2Z0 r11, NewsletterSuspensionInfoActivity newsletterSuspensionInfoActivity) {
        int i;
        NewsletterSuspensionInfoActivity newsletterSuspensionInfoActivity2 = newsletterSuspensionInfoActivity;
        AnonymousClass00T r5 = newsletterSuspensionInfoActivity.A0B;
        C36401kF.A0F(r5).setVisibility(0);
        if (r11 != null) {
            i = C55142u8.A00(r11.A01);
        } else {
            i = R.string.f12nameremoved;
        }
        TextView textView = (TextView) r5.getValue();
        C32681e1 r7 = newsletterSuspensionInfoActivity.A03;
        if (r7 != null) {
            Object[] A0M = AnonymousClass001.A0M();
            A0M[0] = "clickable-span";
            textView.setText(r7.A03(newsletterSuspensionInfoActivity2, new C1497372o(newsletterSuspensionInfoActivity2, 40), C36341k9.A0e(newsletterSuspensionInfoActivity, A0M, i, 1, R.string.f12nameremoved), "clickable-span", C36341k9.A05(newsletterSuspensionInfoActivity)));
            C36331k8.A10((TextView) r5.getValue(), newsletterSuspensionInfoActivity2.A0D);
            return;
        }
        throw C36331k8.A0b();
    }

    public void A2F() {
        if (!this.A04) {
            this.A04 = true;
            C18800tq A0B2 = C36331k8.A0B(this);
            C36321k7.A0c(A0B2, this);
            C18830tt r1 = A0B2.A00;
            C36321k7.A0X(A0B2, r1, this, C36321k7.A05(A0B2, r1, this));
            this.A03 = C36351kA.A0p(r1);
            this.A01 = C36351kA.A0T(A0B2);
            this.A00 = C36341k9.A0R(A0B2);
            this.A02 = C36361kB.A0X(r1);
        }
    }

    public NewsletterSuspensionInfoActivity(int i) {
        this.A04 = false;
        C89354Wf.A00(this, 20);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle(R.string.f12nameremoved);
        A2u();
        C36321k7.A0P(this);
        setContentView((int) R.layout.f9nameremoved);
        C36391kE.A0P(this.A00, R.id.header_title).setText(R.string.f12nameremoved);
        C36411kG.A0Q(this, R.id.channel_badge).setImageResource(R.drawable.vec_ic_warning_triangle_badge);
        AnonymousClass09Y A0O = C36341k9.A0O(this);
        A0O.A0A((AnonymousClass02E) this.A09.getValue(), R.id.newsletter_guidelines_fragment);
        A0O.A01();
        WaImageView A0J = C36421kH.A0J(this.A00, R.id.channel_icon);
        AnonymousClass00T r3 = this.A0C;
        C65993Ug.A00(this, ((NewsletterSuspensionInfoViewModel) r3.getValue()).A00, new AnonymousClass4MJ(A0J, this), 46);
        C65993Ug.A00(this, ((NewsletterSuspensionInfoViewModel) r3.getValue()).A01, new AnonymousClass4LA(this), 44);
        C65993Ug.A00(this, ((NewsletterSuspensionInfoViewModel) r3.getValue()).A02, new AnonymousClass4L9(this), 45);
        NewsletterSuspensionInfoViewModel newsletterSuspensionInfoViewModel = (NewsletterSuspensionInfoViewModel) r3.getValue();
        C28981Uw A0i = C36431kI.A0i(this.A07);
        AnonymousClass00C.A0D(A0i, 0);
        C36331k8.A1T(new NewsletterSuspensionInfoViewModel$initializeViewModel$1(A0i, newsletterSuspensionInfoViewModel, (C023509x) null), C109325Xd.A00(newsletterSuspensionInfoViewModel));
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        NewsletterSuspensionInfoViewModel newsletterSuspensionInfoViewModel = (NewsletterSuspensionInfoViewModel) this.A0C.getValue();
        C28981Uw A0i = C36431kI.A0i(this.A07);
        AnonymousClass00C.A0D(A0i, 0);
        C36331k8.A1T(new NewsletterSuspensionInfoViewModel$initializeViewModel$1(A0i, newsletterSuspensionInfoViewModel, (C023509x) null), C109325Xd.A00(newsletterSuspensionInfoViewModel));
    }

    public NewsletterSuspensionInfoActivity() {
        this(0);
        this.A07 = C001400p.A00(C000800j.PUBLICATION, new AnonymousClass4H4(this));
        this.A0C = C36441kJ.A0a(new AnonymousClass4DW(this), new AnonymousClass4DV(this), new AnonymousClass4H5(this), C36441kJ.A1A(NewsletterSuspensionInfoViewModel.class));
        this.A0A = C36431kI.A1I(new AnonymousClass4DU(this));
        this.A0B = C36431kI.A1I(new AnonymousClass4DX(this));
        this.A08 = C36431kI.A1I(new AnonymousClass4DS(this));
        this.A05 = C36431kI.A1I(new AnonymousClass4DQ(this));
        this.A06 = C36431kI.A1I(new AnonymousClass4DR(this));
        this.A09 = C36431kI.A1I(new AnonymousClass4DT(this));
    }
}
