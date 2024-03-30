package com.whatsapp.newsletter.ui.mv;

import X.AnonymousClass00C;
import X.AnonymousClass07B;
import X.AnonymousClass098;
import X.AnonymousClass141;
import X.AnonymousClass155;
import X.AnonymousClass19A;
import X.AnonymousClass1LI;
import X.AnonymousClass1RY;
import X.AnonymousClass2gA;
import X.AnonymousClass3LW;
import X.AnonymousClass3SF;
import X.C03570Gk;
import X.C18800tq;
import X.C18830tt;
import X.C19460v5;
import X.C19470v6;
import X.C220412q;
import X.C27111My;
import X.C27731Pn;
import X.C28981Uw;
import X.C30131Zi;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36371kC;
import X.C36421kH;
import X.C36431kI;
import X.C39001qm;
import X.C44072La;
import X.C48752hz;
import X.C61443Bx;
import X.C65073Qp;
import X.C66763Xf;
import X.C67993bA;
import X.C89344We;
import X.C90434a9;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.whatsapp.R;
import com.whatsapp.WaEditText;
import com.whatsapp.wds.components.fab.WDSFab;
import com.whatsapp.wds.components.profilephoto.WDSProfilePhoto;

public final class NewsletterEditMVActivity extends AnonymousClass155 {
    public C19460v5 A00;
    public C61443Bx A01;
    public AnonymousClass1LI A02;
    public AnonymousClass3SF A03;
    public WaEditText A04;
    public AnonymousClass1RY A05;
    public C27731Pn A06;
    public C220412q A07;
    public C28981Uw A08;
    public AnonymousClass19A A09;
    public C30131Zi A0A;
    public WDSFab A0B;
    public WDSProfilePhoto A0C;
    public boolean A0D;

    private final C44072La A01() {
        C28981Uw r1 = this.A08;
        if (r1 != null) {
            C220412q r0 = this.A07;
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

    public static final void A07(NewsletterEditMVActivity newsletterEditMVActivity) {
        String str;
        AnonymousClass19A r0 = newsletterEditMVActivity.A09;
        if (r0 == null) {
            throw C36331k8.A0d("messageClient");
        } else if (!r0.A0I()) {
            C39001qm A002 = AnonymousClass3LW.A00(newsletterEditMVActivity);
            A002.A0d(R.string.f12nameremoved);
            A002.A0c(R.string.f12nameremoved);
            C39001qm.A05(newsletterEditMVActivity, A002, 20, R.string.f12nameremoved);
            A002.A0l(newsletterEditMVActivity, C67993bA.A00, R.string.f12nameremoved);
            C36341k9.A11(A002);
        } else {
            WaEditText waEditText = newsletterEditMVActivity.A04;
            if (waEditText == null) {
                throw C36331k8.A0d("descriptionEditText");
            }
            String A0y = C36371kC.A0y(C36421kH.A0Z(waEditText));
            if (AnonymousClass098.A06(A0y)) {
                A0y = null;
            }
            C28981Uw r2 = newsletterEditMVActivity.A08;
            if (r2 != null) {
                newsletterEditMVActivity.Bu1(R.string.f12nameremoved);
                C44072La A012 = newsletterEditMVActivity.A01();
                if (A012 != null) {
                    str = A012.A0H;
                } else {
                    str = null;
                }
                boolean z = !AnonymousClass00C.A0J(A0y, str);
                C30131Zi r1 = newsletterEditMVActivity.A0A;
                if (r1 != null) {
                    if (!z) {
                        A0y = null;
                    }
                    r1.A0C(r2, new C90434a9(newsletterEditMVActivity, 5), (String) null, A0y, (byte[]) null, z, false);
                    return;
                }
                throw C36331k8.A0d("newsletterManager");
            }
        }
    }

    public void A2F() {
        if (!this.A0D) {
            this.A0D = true;
            C27111My A0L = C36351kA.A0L(this);
            C18800tq r2 = A0L.A5g;
            C36321k7.A0c(r2, this);
            C18830tt r1 = r2.A00;
            C36321k7.A0X(r2, r1, this, C36321k7.A05(r2, r1, this));
            this.A09 = C36361kB.A0c(r2);
            this.A0A = C36431kI.A0m(r2);
            this.A06 = C36351kA.A0T(r2);
            this.A07 = C36351kA.A0a(r2);
            this.A02 = C36361kB.A0S(r2);
            this.A01 = (C61443Bx) A0L.A1W.get();
            this.A00 = C19470v6.A00;
        }
    }

    public NewsletterEditMVActivity(int i) {
        this.A0D = false;
        C89344We.A00(this, 27);
    }

    public void onCreate(Bundle bundle) {
        String str;
        String str2;
        String str3;
        super.onCreate(bundle);
        setContentView((int) R.layout.f9nameremoved);
        C36341k9.A12(this);
        AnonymousClass07B supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            C36421kH.A19(supportActionBar);
            supportActionBar.A0I(R.string.f12nameremoved);
        }
        View A0H = C36361kB.A0H(this, R.id.newsletter_edit_mv_container);
        AnonymousClass1LI r1 = this.A02;
        if (r1 != null) {
            this.A03 = AnonymousClass3SF.A01(A0H, r1, R.id.mv_newsletter_name);
            this.A0C = (WDSProfilePhoto) C36361kB.A0H(this, R.id.mv_newsletter_profile_photo);
            this.A04 = (WaEditText) C36361kB.A0D(this, R.id.newsletter_description);
            this.A08 = C28981Uw.A03.A01(C36341k9.A0d(this));
            C27731Pn r12 = this.A06;
            if (r12 != null) {
                this.A05 = r12.A03(this, this, "newsletter-edit-mv");
                AnonymousClass3SF r3 = this.A03;
                String str4 = null;
                if (r3 == null) {
                    throw C36331k8.A0d("newsletterNameViewController");
                }
                C44072La A012 = A01();
                if (A012 != null) {
                    str4 = A012.A0K;
                }
                r3.A01.setText(str4);
                AnonymousClass3SF r13 = this.A03;
                if (r13 == null) {
                    throw C36331k8.A0d("newsletterNameViewController");
                }
                r13.A03(1);
                AnonymousClass1RY r2 = this.A05;
                if (r2 == null) {
                    throw C36331k8.A0d("contactPhotoLoader");
                }
                AnonymousClass141 r14 = new AnonymousClass141(this.A08);
                C44072La A013 = A01();
                if (!(A013 == null || (str3 = A013.A0K) == null)) {
                    r14.A0P = str3;
                }
                WDSProfilePhoto wDSProfilePhoto = this.A0C;
                if (wDSProfilePhoto == null) {
                    throw C36331k8.A0d("newsletterProfilePhoto");
                }
                r2.A08(wDSProfilePhoto, r14);
                WaEditText waEditText = this.A04;
                if (waEditText == null) {
                    throw C36331k8.A0d("descriptionEditText");
                }
                C44072La A014 = A01();
                if (A014 == null || (str2 = A014.A0H) == null || (str = C36371kC.A0y(str2)) == null) {
                    str = "";
                }
                waEditText.setText(str);
                C36331k8.A11(this, R.id.description_hint);
                WaEditText waEditText2 = this.A04;
                if (waEditText2 == null) {
                    throw C36331k8.A0d("descriptionEditText");
                }
                waEditText2.setHint(R.string.f12nameremoved);
                View A0B2 = C03570Gk.A0B(this, R.id.description_counter);
                AnonymousClass00C.A0E(A0B2, "null cannot be cast to non-null type android.widget.TextView");
                TextView textView = (TextView) A0B2;
                textView.setVisibility(0);
                C61443Bx r4 = this.A01;
                if (r4 != null) {
                    WaEditText waEditText3 = this.A04;
                    if (waEditText3 == null) {
                        throw C36331k8.A0d("descriptionEditText");
                    }
                    AnonymousClass2gA A002 = r4.A00(waEditText3, textView, EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH, EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH, true, false, false);
                    WaEditText waEditText4 = this.A04;
                    if (waEditText4 == null) {
                        throw C36331k8.A0d("descriptionEditText");
                    }
                    waEditText4.addTextChangedListener(A002);
                    WaEditText waEditText5 = this.A04;
                    if (waEditText5 == null) {
                        throw C36331k8.A0d("descriptionEditText");
                    }
                    waEditText5.setFilters(new C66763Xf[]{new C66763Xf(EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH)});
                    WDSFab wDSFab = (WDSFab) C36361kB.A0H(this, R.id.newsletter_mv_edit_save_fab);
                    this.A0B = wDSFab;
                    if (wDSFab == null) {
                        throw C36331k8.A0d("saveFab");
                    }
                    C48752hz.A00(wDSFab, this, 43);
                    return;
                }
                throw C36331k8.A0d("formattedTextWatcherFactory");
            }
            throw C36331k8.A0d("contactPhotos");
        }
        throw C36331k8.A0d("textEmojiLabelViewControllerFactory");
    }

    public NewsletterEditMVActivity() {
        this(0);
    }
}
