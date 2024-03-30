package com.whatsapp.newsletter.ui.mv;

import X.AnonymousClass07B;
import X.AnonymousClass141;
import X.AnonymousClass142;
import X.AnonymousClass155;
import X.AnonymousClass190;
import X.AnonymousClass1LI;
import X.AnonymousClass1RY;
import X.AnonymousClass3SF;
import X.AnonymousClass3Y4;
import X.C18800tq;
import X.C18830tt;
import X.C19460v5;
import X.C19470v6;
import X.C220412q;
import X.C27731Pn;
import X.C28981Uw;
import X.C30131Zi;
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
import X.C44072La;
import X.C65073Qp;
import X.C89344We;
import android.os.Bundle;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.components.button.ThumbnailButton;
import com.whatsapp.wds.components.button.WDSButton;

public final class NewsletterUpgradeToMVActivity extends AnonymousClass155 {
    public C19460v5 A00;
    public AnonymousClass1LI A01;
    public AnonymousClass3SF A02;
    public AnonymousClass3SF A03;
    public ThumbnailButton A04;
    public ThumbnailButton A05;
    public AnonymousClass1RY A06;
    public C27731Pn A07;
    public C220412q A08;
    public AnonymousClass190 A09;
    public C28981Uw A0A;
    public C30131Zi A0B;
    public WDSButton A0C;
    public boolean A0D;

    public static final C44072La A01(NewsletterUpgradeToMVActivity newsletterUpgradeToMVActivity) {
        C28981Uw r1 = newsletterUpgradeToMVActivity.A0A;
        if (r1 != null) {
            C220412q r0 = newsletterUpgradeToMVActivity.A08;
            if (r0 != null) {
                C65073Qp A0W = C36371kC.A0W(r0, r1);
                if (A0W instanceof C44072La) {
                    return (C44072La) A0W;
                }
            } else {
                throw C36331k8.A0d("chatsCache");
            }
        }
        return null;
    }

    public void A2F() {
        if (!this.A0D) {
            this.A0D = true;
            C18800tq A0B2 = C36331k8.A0B(this);
            C36321k7.A0c(A0B2, this);
            C18830tt r1 = A0B2.A00;
            C36321k7.A0X(A0B2, r1, this, C36321k7.A05(A0B2, r1, this));
            this.A0B = C36431kI.A0m(A0B2);
            this.A07 = C36351kA.A0T(A0B2);
            this.A08 = C36351kA.A0a(A0B2);
            this.A01 = C36361kB.A0S(A0B2);
            this.A09 = C36351kA.A0h(A0B2);
            this.A00 = C19470v6.A00;
        }
    }

    public NewsletterUpgradeToMVActivity(int i) {
        this.A0D = false;
        C89344We.A00(this, 29);
    }

    public void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        setContentView((int) R.layout.f9nameremoved);
        C36341k9.A12(this);
        AnonymousClass07B supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            C36421kH.A19(supportActionBar);
            supportActionBar.A0I(R.string.f12nameremoved);
        }
        WDSButton wDSButton = (WDSButton) C36361kB.A0H(this, R.id.confirm_changes_button);
        this.A0C = wDSButton;
        if (wDSButton == null) {
            throw C36331k8.A0d("confirmButton");
        }
        AnonymousClass3Y4.A00(wDSButton, this, 36);
        View A0H = C36361kB.A0H(this, R.id.newsletter_confirm_upgrade_mv_container);
        AnonymousClass1LI r1 = this.A01;
        if (r1 != null) {
            this.A03 = AnonymousClass3SF.A01(A0H, r1, R.id.newsletter_name_before);
            this.A05 = (ThumbnailButton) C36361kB.A0H(this, R.id.newsletter_thumbnail_before);
            AnonymousClass1LI r12 = this.A01;
            if (r12 != null) {
                this.A02 = AnonymousClass3SF.A01(A0H, r12, R.id.newsletter_name_after);
                this.A04 = (ThumbnailButton) C36361kB.A0H(this, R.id.newsletter_thumbnail_after);
                this.A0A = C28981Uw.A03.A01(C36341k9.A0d(this));
                C27731Pn r13 = this.A07;
                if (r13 != null) {
                    this.A06 = r13.A03(this, this, "newsletter-confirm-upgrade-mv");
                    AnonymousClass3SF r2 = this.A03;
                    String str2 = null;
                    if (r2 == null) {
                        throw C36331k8.A0d("newsletterNameBeforeViewController");
                    }
                    C44072La A012 = A01(this);
                    if (A012 != null) {
                        str2 = A012.A0K;
                    }
                    r2.A01.setText(str2);
                    AnonymousClass1RY r22 = this.A06;
                    if (r22 == null) {
                        throw C36331k8.A0d("contactPhotoLoader");
                    }
                    AnonymousClass141 r14 = new AnonymousClass141(this.A0A);
                    C44072La A013 = A01(this);
                    if (!(A013 == null || (str = A013.A0K) == null)) {
                        r14.A0P = str;
                    }
                    ThumbnailButton thumbnailButton = this.A05;
                    if (thumbnailButton == null) {
                        throw C36331k8.A0d("newsletterThumbnailBefore");
                    }
                    r22.A08(thumbnailButton, r14);
                    AnonymousClass3SF r0 = this.A02;
                    if (r0 == null) {
                        throw C36331k8.A0d("newsletterNameAfterViewController");
                    }
                    r0.A01.setText(C36391kE.A0w(this));
                    AnonymousClass3SF r15 = this.A02;
                    if (r15 == null) {
                        throw C36331k8.A0d("newsletterNameAfterViewController");
                    }
                    r15.A03(1);
                    AnonymousClass1RY r23 = this.A06;
                    if (r23 == null) {
                        throw C36331k8.A0d("contactPhotoLoader");
                    }
                    AnonymousClass142 A0T = C36381kD.A0T(this.A02);
                    ThumbnailButton thumbnailButton2 = this.A04;
                    if (thumbnailButton2 == null) {
                        throw C36331k8.A0d("newsletterThumbnailAfter");
                    }
                    r23.A08(thumbnailButton2, A0T);
                    return;
                }
                throw C36331k8.A0d("contactPhotos");
            }
            throw C36331k8.A0d("textEmojiLabelViewControllerFactory");
        }
        throw C36331k8.A0d("textEmojiLabelViewControllerFactory");
    }

    public NewsletterUpgradeToMVActivity() {
        this(0);
    }
}
