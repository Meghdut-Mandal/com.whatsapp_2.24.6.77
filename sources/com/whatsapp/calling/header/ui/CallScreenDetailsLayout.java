package com.whatsapp.calling.header.ui;

import X.AnonymousClass00C;
import X.AnonymousClass012;
import X.AnonymousClass0QD;
import X.AnonymousClass1QZ;
import X.AnonymousClass1RJ;
import X.AnonymousClass1RY;
import X.C011304x;
import X.C023509x;
import X.C05250Oz;
import X.C124175xi;
import X.C144436sB;
import X.C163647qX;
import X.C18700tb;
import X.C27731Pn;
import X.C27851Qb;
import X.C27861Qc;
import X.C33311f5;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36381kD;
import X.C36391kE;
import X.C36441kJ;
import X.C88514Sz;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.whatsapp.R;
import com.whatsapp.calling.views.MultiContactThumbnail;

public final class CallScreenDetailsLayout extends LinearLayout implements C18700tb {
    public C124175xi A00;
    public C27731Pn A01;
    public AnonymousClass1QZ A02;
    public boolean A03;
    public final MultiContactThumbnail A04;
    public final C88514Sz A05;
    public final AnonymousClass1RY A06;
    public final AnonymousClass1RJ A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CallScreenDetailsLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int i2;
        AnonymousClass00C.A0D(context, 1);
        if (!this.A03) {
            this.A03 = true;
            C27861Qc r1 = (C27861Qc) ((C27851Qb) generatedComponent());
            this.A01 = C36351kA.A0T(r1.A0M);
            this.A00 = (C124175xi) r1.A0L.A0J.get();
        }
        View.inflate(context, R.layout.f9nameremoved, this);
        setOrientation(1);
        setGravity(1);
        this.A04 = (MultiContactThumbnail) C36361kB.A0G(this, R.id.call_details_contact_photos);
        this.A05 = new C144436sB();
        this.A06 = getContactPhotos().A06("voip-call-screen-detail-contact-photos", 0.0f, getResources().getDimensionPixelSize(R.dimen.f7nameremoved));
        this.A07 = C36341k9.A0X(this, R.id.lonely_state_button_stub);
        if (C011304x.A02(this)) {
            AnonymousClass012 A002 = AnonymousClass0QD.A00(this);
            if (A002 != null) {
                C36331k8.A1T(new CallScreenDetailsLayout$setupOnAttach$1(A002, this, (C023509x) null), C33311f5.A00(A002));
            }
            if (!C011304x.A02(this)) {
                this.A06.A02();
                return;
            }
            i2 = 4;
        } else {
            i2 = 5;
        }
        C163647qX.A00(this, i2);
    }

    public final void setCallScreenDetailsStateHolder(C124175xi r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A00 = r2;
    }

    public final void setContactPhotos(C27731Pn r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A01 = r2;
    }

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A02;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A02 = r0;
        }
        return r0.generatedComponent();
    }

    public final C124175xi getCallScreenDetailsStateHolder() {
        C124175xi r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("callScreenDetailsStateHolder");
    }

    public final C27731Pn getContactPhotos() {
        C27731Pn r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("contactPhotos");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CallScreenDetailsLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        AnonymousClass00C.A0D(context, 1);
    }

    public /* synthetic */ CallScreenDetailsLayout(Context context, AttributeSet attributeSet, int i, int i2, C05250Oz r7) {
        this(context, C36381kD.A0I(attributeSet, i2), C36391kE.A01(i2, i));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CallScreenDetailsLayout(Context context) {
        this(context, (AttributeSet) null, 0);
        AnonymousClass00C.A0D(context, 1);
    }
}
