package com.whatsapp.conversation.comments;

import X.AnonymousClass00C;
import X.AnonymousClass171;
import X.AnonymousClass17Y;
import X.C05250Oz;
import X.C18800tq;
import X.C18830tt;
import X.C19420v0;
import X.C19730wQ;
import X.C20380xT;
import X.C24801Dv;
import X.C28081Rg;
import X.C32681e1;
import X.C32691e2;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36371kC;
import X.C36381kD;
import X.C36391kE;
import X.C80223v3;
import android.content.Context;
import android.util.AttributeSet;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;

public final class DecryptionFailureMessageView extends TextEmojiLabel {
    public C24801Dv A00;
    public AnonymousClass17Y A01;
    public C32691e2 A02;
    public C19730wQ A03;
    public AnonymousClass171 A04;
    public C19420v0 A05;
    public C20380xT A06;
    public C28081Rg A07;
    public C32681e1 A08;
    public boolean A09;

    public final void setActivityUtils(C24801Dv r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A00 = r2;
    }

    public final void setFaqLinkFactory(C20380xT r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A06 = r2;
    }

    public final void setGlobalUI(AnonymousClass17Y r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A01 = r2;
    }

    public final void setLinkLauncher(C32691e2 r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A02 = r2;
    }

    public final void setLinkifier(C32681e1 r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A08 = r2;
    }

    public final void setMeManager(C19730wQ r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A03 = r2;
    }

    public final void setUiWamEventHelper(C28081Rg r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A07 = r2;
    }

    public final void setWaContactNames(AnonymousClass171 r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A04 = r2;
    }

    public final void setWaSharedPreferences(C19420v0 r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A05 = r2;
    }

    public void A09() {
        if (!this.A09) {
            this.A09 = true;
            C18800tq A0P = C36361kB.A0P(this);
            C36321k7.A0d(A0P, this);
            C18830tt r1 = A0P.A00;
            C36361kB.A1D(r1, this);
            this.A01 = C36351kA.A0M(A0P);
            this.A08 = C36351kA.A0p(r1);
            this.A00 = C36351kA.A0J(A0P);
            this.A02 = C36371kC.A0R(A0P);
            this.A03 = C36351kA.A0N(A0P);
            this.A04 = C36341k9.A0S(A0P);
            this.A06 = C36331k8.A0I(A0P);
            this.A05 = C36351kA.A0Y(A0P);
            this.A07 = C18800tq.ALZ(A0P);
        }
    }

    public final C24801Dv getActivityUtils() {
        C24801Dv r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("activityUtils");
    }

    public final C20380xT getFaqLinkFactory() {
        C20380xT r0 = this.A06;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("faqLinkFactory");
    }

    public final AnonymousClass17Y getGlobalUI() {
        AnonymousClass17Y r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        throw C36321k7.A06();
    }

    public final C32691e2 getLinkLauncher() {
        C32691e2 r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("linkLauncher");
    }

    public final C32681e1 getLinkifier() {
        C32681e1 r0 = this.A08;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0b();
    }

    public final C19730wQ getMeManager() {
        C19730wQ r0 = this.A03;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("meManager");
    }

    public final C28081Rg getUiWamEventHelper() {
        C28081Rg r0 = this.A07;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("uiWamEventHelper");
    }

    public final AnonymousClass171 getWaContactNames() {
        AnonymousClass171 r0 = this.A04;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0c();
    }

    public final C19420v0 getWaSharedPreferences() {
        C19420v0 r0 = this.A05;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("waSharedPreferences");
    }

    public DecryptionFailureMessageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        A09();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DecryptionFailureMessageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AnonymousClass00C.A0D(context, 1);
        A09();
        C36361kB.A19(this);
        C36331k8.A1A(getAbProps(), this);
        C36331k8.A10(this, getAbProps());
        C36331k8.A16(this, this.A02);
        setText(getLinkifier().A03(context, C80223v3.A00(this, 48), C36391kE.A0v(context, "learn-more", new Object[1], 0, R.string.f12nameremoved), "learn-more", C36341k9.A05(context)));
    }

    public /* synthetic */ DecryptionFailureMessageView(Context context, AttributeSet attributeSet, int i, C05250Oz r5) {
        this(context, C36381kD.A0I(attributeSet, i));
    }
}
