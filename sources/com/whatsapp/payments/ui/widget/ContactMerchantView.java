package com.whatsapp.payments.ui.widget;

import X.AnonymousClass00C;
import X.AnonymousClass0BN;
import X.AnonymousClass11F;
import X.AnonymousClass141;
import X.AnonymousClass16D;
import X.AnonymousClass1QZ;
import X.C05250Oz;
import X.C1498072v;
import X.C18700tb;
import X.C20810yC;
import X.C21060yb;
import X.C27851Qb;
import X.C27861Qc;
import X.C32681e1;
import X.C36321k7;
import X.C36331k8;
import X.C36351kA;
import X.C36381kD;
import X.C36441kJ;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;

public final class ContactMerchantView extends LinearLayout implements C18700tb {
    public AnonymousClass16D A00;
    public C21060yb A01;
    public C20810yC A02;
    public C32681e1 A03;
    public AnonymousClass1QZ A04;
    public boolean A05;
    public final TextEmojiLabel A06;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ContactMerchantView(Context context) {
        this(context, (AttributeSet) null);
        AnonymousClass00C.A0D(context, 1);
    }

    public final void setAbProps(C20810yC r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A02 = r2;
    }

    public final void setContactManager(AnonymousClass16D r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A00 = r2;
    }

    public final void setLinkifier(C32681e1 r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A03 = r2;
    }

    public final void setSystemServices(C21060yb r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A01 = r2;
    }

    public final void A00(AnonymousClass11F r9) {
        TextEmojiLabel textEmojiLabel = this.A06;
        Rect rect = AnonymousClass0BN.A0A;
        C36331k8.A16(textEmojiLabel, getSystemServices());
        C36331k8.A1A(getAbProps(), textEmojiLabel);
        AnonymousClass141 A08 = getContactManager().A08(r9);
        if (A08 != null) {
            String A0J = A08.A0J();
            if (A0J == null) {
                A0J = A08.A0K();
            }
            Context context = getContext();
            textEmojiLabel.setText(getLinkifier().A02(textEmojiLabel.getContext(), new C1498072v(context, A08, 25), C36351kA.A0w(context, A0J, 1, R.string.f12nameremoved), "merchant-name"));
        }
    }

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A04;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A04 = r0;
        }
        return r0.generatedComponent();
    }

    public final C20810yC getAbProps() {
        C20810yC r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        throw C36321k7.A07();
    }

    public final AnonymousClass16D getContactManager() {
        AnonymousClass16D r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0Z();
    }

    public final C32681e1 getLinkifier() {
        C32681e1 r0 = this.A03;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0b();
    }

    public final C21060yb getSystemServices() {
        C21060yb r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0W();
    }

    public ContactMerchantView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        if (!this.A05) {
            this.A05 = true;
            C27861Qc.A0r((C27861Qc) ((C27851Qb) generatedComponent()), this);
        }
    }

    public /* synthetic */ ContactMerchantView(Context context, AttributeSet attributeSet, int i, C05250Oz r5) {
        this(context, C36381kD.A0I(attributeSet, i));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ContactMerchantView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AnonymousClass00C.A0D(context, 1);
        if (!this.A05) {
            this.A05 = true;
            C27861Qc.A0r((C27861Qc) ((C27851Qb) generatedComponent()), this);
        }
        View.inflate(context, R.layout.f9nameremoved, this);
        this.A06 = C36351kA.A0O(this, R.id.contact_merchant_label);
    }
}
