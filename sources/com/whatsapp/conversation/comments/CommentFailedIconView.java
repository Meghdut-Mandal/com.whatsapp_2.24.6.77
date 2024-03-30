package com.whatsapp.conversation.comments;

import X.AnonymousClass00C;
import X.AnonymousClass17Y;
import X.AnonymousClass19I;
import X.AnonymousClass1NG;
import X.AnonymousClass1X4;
import X.AnonymousClass1XY;
import X.AnonymousClass5ZS;
import X.C05250Oz;
import X.C18800tq;
import X.C19730wQ;
import X.C19770wU;
import X.C19970wo;
import X.C20310xM;
import X.C20810yC;
import X.C26171Jd;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36371kC;
import X.C36381kD;
import X.C36391kE;
import X.C36411kG;
import android.content.Context;
import android.util.AttributeSet;
import com.whatsapp.WaImageView;

public final class CommentFailedIconView extends WaImageView {
    public AnonymousClass17Y A00;
    public C19730wQ A01;
    public AnonymousClass1XY A02;
    public AnonymousClass1X4 A03;
    public AnonymousClass1NG A04;
    public C19970wo A05;
    public C20310xM A06;
    public C26171Jd A07;
    public C20810yC A08;
    public AnonymousClass19I A09;
    public C19770wU A0A;
    public boolean A0B;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CommentFailedIconView(Context context) {
        this(context, (AttributeSet) null);
        AnonymousClass00C.A0D(context, 1);
    }

    public final void setAbProps(C20810yC r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A08 = r2;
    }

    public final void setBlockListManager(AnonymousClass1NG r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A04 = r2;
    }

    public final void setCoreMessageStore(C20310xM r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A06 = r2;
    }

    public final void setGlobalUI(AnonymousClass17Y r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A00 = r2;
    }

    public final void setInFlightMessages(AnonymousClass19I r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A09 = r2;
    }

    public final void setMeManager(C19730wQ r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A01 = r2;
    }

    public final void setMessageAddOnManager(C26171Jd r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A07 = r2;
    }

    public final void setSendMedia(AnonymousClass1XY r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A02 = r2;
    }

    public final void setTime(C19970wo r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A05 = r2;
    }

    public final void setUserActions(AnonymousClass1X4 r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A03 = r2;
    }

    public final void setWaWorkers(C19770wU r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A0A = r2;
    }

    public void A03() {
        if (!this.A0B) {
            this.A0B = true;
            C18800tq A0W = C36391kE.A0W(generatedComponent());
            AnonymousClass5ZS.A00(this, C36341k9.A0T(A0W));
            this.A05 = C36351kA.A0V(A0W);
            this.A08 = C36341k9.A0V(A0W);
            this.A00 = C36351kA.A0M(A0W);
            this.A01 = C36351kA.A0N(A0W);
            this.A02 = C36411kG.A0Y(A0W);
            this.A0A = C36341k9.A0Z(A0W);
            this.A03 = C36361kB.A0T(A0W);
            this.A04 = C36381kD.A0V(A0W);
            this.A06 = C36371kC.A0Z(A0W);
            this.A09 = (AnonymousClass19I) A0W.A45.get();
            this.A07 = (C26171Jd) A0W.A4s.get();
        }
    }

    public final C20810yC getAbProps() {
        C20810yC r0 = this.A08;
        if (r0 != null) {
            return r0;
        }
        throw C36321k7.A07();
    }

    public final AnonymousClass1NG getBlockListManager() {
        AnonymousClass1NG r0 = this.A04;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("blockListManager");
    }

    public final C20310xM getCoreMessageStore() {
        C20310xM r0 = this.A06;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("coreMessageStore");
    }

    public final AnonymousClass17Y getGlobalUI() {
        AnonymousClass17Y r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        throw C36321k7.A06();
    }

    public final AnonymousClass19I getInFlightMessages() {
        AnonymousClass19I r0 = this.A09;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("inFlightMessages");
    }

    public final C19730wQ getMeManager() {
        C19730wQ r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("meManager");
    }

    public final C26171Jd getMessageAddOnManager() {
        C26171Jd r0 = this.A07;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("messageAddOnManager");
    }

    public final AnonymousClass1XY getSendMedia() {
        AnonymousClass1XY r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("sendMedia");
    }

    public final C19970wo getTime() {
        C19970wo r0 = this.A05;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("time");
    }

    public final AnonymousClass1X4 getUserActions() {
        AnonymousClass1X4 r0 = this.A03;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("userActions");
    }

    public final C19770wU getWaWorkers() {
        C19770wU r0 = this.A0A;
        if (r0 != null) {
            return r0;
        }
        throw C36321k7.A08();
    }

    public CommentFailedIconView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        A03();
    }

    public /* synthetic */ CommentFailedIconView(Context context, AttributeSet attributeSet, int i, C05250Oz r5) {
        this(context, C36381kD.A0I(attributeSet, i));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CommentFailedIconView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AnonymousClass00C.A0D(context, 1);
        A03();
    }
}
