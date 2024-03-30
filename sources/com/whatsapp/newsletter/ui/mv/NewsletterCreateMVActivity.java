package com.whatsapp.newsletter.ui.mv;

import X.AnonymousClass00C;
import X.AnonymousClass07B;
import X.AnonymousClass098;
import X.AnonymousClass142;
import X.AnonymousClass155;
import X.AnonymousClass190;
import X.AnonymousClass19A;
import X.AnonymousClass1LI;
import X.AnonymousClass1RY;
import X.AnonymousClass2YE;
import X.AnonymousClass2gA;
import X.AnonymousClass3LW;
import X.AnonymousClass3SF;
import X.AnonymousClass3Y4;
import X.AnonymousClass4OL;
import X.C03570Gk;
import X.C18800tq;
import X.C18830tt;
import X.C19460v5;
import X.C19470v6;
import X.C19770wU;
import X.C26141Ja;
import X.C27111My;
import X.C27731Pn;
import X.C30131Zi;
import X.C30161Zl;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36371kC;
import X.C36381kD;
import X.C36391kE;
import X.C36421kH;
import X.C36431kI;
import X.C39001qm;
import X.C61443Bx;
import X.C66763Xf;
import X.C67983b9;
import X.C89344We;
import X.C90434a9;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.whatsapp.R;
import com.whatsapp.WaEditText;
import com.whatsapp.wds.components.button.WDSButton;
import com.whatsapp.wds.components.profilephoto.WDSProfilePhoto;

public final class NewsletterCreateMVActivity extends AnonymousClass155 {
    public C19460v5 A00;
    public C61443Bx A01;
    public AnonymousClass1LI A02;
    public AnonymousClass3SF A03;
    public WaEditText A04;
    public AnonymousClass1RY A05;
    public C27731Pn A06;
    public AnonymousClass190 A07;
    public AnonymousClass19A A08;
    public C30131Zi A09;
    public WDSButton A0A;
    public WDSProfilePhoto A0B;
    public boolean A0C;

    public static final void A01(NewsletterCreateMVActivity newsletterCreateMVActivity) {
        AnonymousClass19A r0 = newsletterCreateMVActivity.A08;
        if (r0 == null) {
            throw C36331k8.A0d("messageClient");
        } else if (!r0.A0I()) {
            C39001qm A002 = AnonymousClass3LW.A00(newsletterCreateMVActivity);
            A002.A0d(R.string.f12nameremoved);
            A002.A0c(R.string.f12nameremoved);
            C39001qm.A05(newsletterCreateMVActivity, A002, 19, R.string.f12nameremoved);
            A002.A0l(newsletterCreateMVActivity, C67983b9.A00, R.string.f12nameremoved);
            C36341k9.A11(A002);
        } else {
            newsletterCreateMVActivity.Bu1(R.string.f12nameremoved);
            C30131Zi r2 = newsletterCreateMVActivity.A09;
            if (r2 != null) {
                WaEditText waEditText = newsletterCreateMVActivity.A04;
                String str = null;
                if (waEditText == null) {
                    throw C36331k8.A0d("descriptionEditText");
                }
                String A0y = C36371kC.A0y(C36421kH.A0Z(waEditText));
                if (!AnonymousClass098.A06(A0y)) {
                    str = A0y;
                }
                C90434a9 r4 = new C90434a9(newsletterCreateMVActivity, 4);
                if (C36391kE.A1Z(r2.A0G)) {
                    C30161Zl r1 = r2.A01;
                    if (r1 != null) {
                        C19770wU A0Z = C36341k9.A0Z(r1.A00.A00);
                        C18800tq r12 = r1.A00.A00;
                        new AnonymousClass2YE((C26141Ja) r12.A5m.get(), C36391kE.A0g(r12), r4, (AnonymousClass4OL) r12.A5l.get(), r12.Azc(), A0Z, str).A01();
                        return;
                    }
                    throw C36331k8.A0d("createVerifiedNewsletterGraphQlHandler");
                }
                return;
            }
            throw C36331k8.A0d("newsletterManager");
        }
    }

    public void A2F() {
        if (!this.A0C) {
            this.A0C = true;
            C27111My A0L = C36351kA.A0L(this);
            C18800tq r2 = A0L.A5g;
            C36321k7.A0c(r2, this);
            C18830tt r1 = r2.A00;
            C36321k7.A0X(r2, r1, this, C36321k7.A05(r2, r1, this));
            this.A06 = C36351kA.A0T(r2);
            this.A02 = C36361kB.A0S(r2);
            this.A01 = (C61443Bx) A0L.A1W.get();
            this.A08 = C36361kB.A0c(r2);
            this.A07 = C36351kA.A0h(r2);
            this.A09 = C36431kI.A0m(r2);
            this.A00 = C19470v6.A00;
        }
    }

    public NewsletterCreateMVActivity(int i) {
        this.A0C = false;
        C89344We.A00(this, 25);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.f9nameremoved);
        C36341k9.A12(this);
        AnonymousClass07B supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            C36421kH.A19(supportActionBar);
            supportActionBar.A0I(R.string.f12nameremoved);
        }
        View A0H = C36361kB.A0H(this, R.id.newsletter_create_mv_container);
        AnonymousClass1LI r1 = this.A02;
        if (r1 != null) {
            this.A03 = AnonymousClass3SF.A01(A0H, r1, R.id.mv_newsletter_name);
            this.A0B = (WDSProfilePhoto) C36361kB.A0H(this, R.id.mv_newsletter_profile_photo);
            C27731Pn r12 = this.A06;
            if (r12 != null) {
                this.A05 = r12.A03(this, this, "newsletter-create-new-mv");
                AnonymousClass3SF r0 = this.A03;
                if (r0 == null) {
                    throw C36331k8.A0d("mvNewsletterNameViewController");
                }
                r0.A01.setText(C36391kE.A0w(this));
                AnonymousClass3SF r13 = this.A03;
                if (r13 == null) {
                    throw C36331k8.A0d("mvNewsletterNameViewController");
                }
                r13.A03(1);
                AnonymousClass1RY r2 = this.A05;
                if (r2 == null) {
                    throw C36331k8.A0d("contactPhotoLoader");
                }
                AnonymousClass142 A0T = C36381kD.A0T(this.A02);
                WDSProfilePhoto wDSProfilePhoto = this.A0B;
                if (wDSProfilePhoto == null) {
                    throw C36331k8.A0d("mvNewsletterProfilePhoto");
                }
                r2.A08(wDSProfilePhoto, A0T);
                this.A04 = (WaEditText) C36361kB.A0D(this, R.id.newsletter_description);
                C36331k8.A11(this, R.id.description_hint);
                WaEditText waEditText = this.A04;
                if (waEditText == null) {
                    throw C36331k8.A0d("descriptionEditText");
                }
                waEditText.setHint(R.string.f12nameremoved);
                View A0B2 = C03570Gk.A0B(this, R.id.description_counter);
                AnonymousClass00C.A0E(A0B2, "null cannot be cast to non-null type android.widget.TextView");
                TextView textView = (TextView) A0B2;
                textView.setVisibility(0);
                C61443Bx r4 = this.A01;
                if (r4 != null) {
                    WaEditText waEditText2 = this.A04;
                    if (waEditText2 == null) {
                        throw C36331k8.A0d("descriptionEditText");
                    }
                    AnonymousClass2gA A002 = r4.A00(waEditText2, textView, EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH, EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH, true, false, false);
                    WaEditText waEditText3 = this.A04;
                    if (waEditText3 == null) {
                        throw C36331k8.A0d("descriptionEditText");
                    }
                    waEditText3.addTextChangedListener(A002);
                    WaEditText waEditText4 = this.A04;
                    if (waEditText4 == null) {
                        throw C36331k8.A0d("descriptionEditText");
                    }
                    waEditText4.setFilters(new C66763Xf[]{new C66763Xf(EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH)});
                    WDSButton wDSButton = (WDSButton) C36361kB.A0H(this, R.id.create_mv_newsletter_button);
                    this.A0A = wDSButton;
                    if (wDSButton == null) {
                        throw C36331k8.A0d("createButton");
                    }
                    AnonymousClass3Y4.A00(wDSButton, this, 34);
                    return;
                }
                throw C36331k8.A0d("formattedTextWatcherFactory");
            }
            throw C36331k8.A0d("contactPhotos");
        }
        throw C36331k8.A0d("textEmojiLabelViewControllerFactory");
    }

    public NewsletterCreateMVActivity() {
        this(0);
    }
}
