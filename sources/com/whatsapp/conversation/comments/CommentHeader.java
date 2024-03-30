package com.whatsapp.conversation.comments;

import X.AnonymousClass00C;
import X.AnonymousClass00T;
import X.AnonymousClass16D;
import X.AnonymousClass171;
import X.AnonymousClass19R;
import X.AnonymousClass1QZ;
import X.AnonymousClass3T1;
import X.AnonymousClass4AW;
import X.AnonymousClass4AX;
import X.C005502l;
import X.C009403z;
import X.C023509x;
import X.C05250Oz;
import X.C18700tb;
import X.C19730wQ;
import X.C27851Qb;
import X.C27861Qc;
import X.C36331k8;
import X.C36381kD;
import X.C36431kI;
import X.C36441kJ;
import X.C64933Qa;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.whatsapp.R;

public final class CommentHeader extends LinearLayout implements C18700tb {
    public C19730wQ A00;
    public AnonymousClass16D A01;
    public AnonymousClass171 A02;
    public AnonymousClass1QZ A03;
    public C005502l A04;
    public boolean A05;
    public AnonymousClass3T1 A06;
    public final AnonymousClass00T A07;
    public final AnonymousClass00T A08;

    public static /* synthetic */ void getMainDispatcher$annotations() {
    }

    public final void setContactManager(AnonymousClass16D r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A01 = r2;
    }

    public final void setMainDispatcher(C005502l r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A04 = r2;
    }

    public final void setMeManager(C19730wQ r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A00 = r2;
    }

    public final void setWaContactNames(AnonymousClass171 r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A02 = r2;
    }

    /* access modifiers changed from: private */
    public final ContactNamePrimary getContactNamePrimary() {
        return (ContactNamePrimary) C36381kD.A0p(this.A07);
    }

    /* access modifiers changed from: private */
    public final ContactNameSecondary getContactNameSecondary() {
        return (ContactNameSecondary) C36381kD.A0p(this.A08);
    }

    public final void A02(AnonymousClass3T1 r4) {
        C64933Qa r1;
        AnonymousClass3T1 r0 = this.A06;
        if (r0 != null) {
            r1 = r0.A1J;
        } else {
            r1 = null;
        }
        if (!AnonymousClass00C.A0J(r1, r4.A1J)) {
            this.A06 = r4;
            C36331k8.A1T(new CommentHeader$bind$1(this, r4, (C023509x) null), C009403z.A02(AnonymousClass19R.A01));
        }
    }

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A03;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A03 = r0;
        }
        return r0.generatedComponent();
    }

    public final AnonymousClass16D getContactManager() {
        AnonymousClass16D r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0Z();
    }

    public final C005502l getMainDispatcher() {
        C005502l r0 = this.A04;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("mainDispatcher");
    }

    public final C19730wQ getMeManager() {
        C19730wQ r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("meManager");
    }

    public final AnonymousClass171 getWaContactNames() {
        AnonymousClass171 r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0c();
    }

    public CommentHeader(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        if (!this.A05) {
            this.A05 = true;
            C27861Qc.A0i((C27861Qc) ((C27851Qb) generatedComponent()), this);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CommentHeader(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AnonymousClass00C.A0D(context, 1);
        if (!this.A05) {
            this.A05 = true;
            C27861Qc.A0i((C27861Qc) ((C27851Qb) generatedComponent()), this);
        }
        this.A07 = C36431kI.A1I(new AnonymousClass4AW(this));
        this.A08 = C36431kI.A1I(new AnonymousClass4AX(this));
        View.inflate(context, R.layout.f9nameremoved, this);
    }

    public /* synthetic */ CommentHeader(Context context, AttributeSet attributeSet, int i, C05250Oz r5) {
        this(context, C36381kD.A0I(attributeSet, i));
    }
}
