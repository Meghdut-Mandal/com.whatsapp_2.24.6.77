package com.whatsapp.biz.catalog.view;

import X.AnonymousClass000;
import X.AnonymousClass00C;
import X.AnonymousClass00F;
import X.AnonymousClass28I;
import X.C012005e;
import X.C05250Oz;
import X.C36381kD;
import X.C36391kE;
import X.C36431kI;
import X.C36871lR;
import X.C56592wZ;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.whatsapp.R;

public final class AvailabilityStateTextView extends AnonymousClass28I {
    public boolean A00;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AvailabilityStateTextView(Context context) {
        this(context, (AttributeSet) null, 0);
        AnonymousClass00C.A0D(context, 1);
    }

    private final void A06() {
        int A002;
        if (!this.A00 || !isSelected()) {
            boolean z = this.A00;
            Context context = getContext();
            int i = R.color.f6nameremoved;
            if (z) {
                i = R.color.f6nameremoved;
            }
            A002 = AnonymousClass00F.A00(context, i);
        } else {
            A002 = -1;
        }
        setTextColor(A002);
    }

    public final void A0D(C36871lR r3) {
        boolean z = this.A00;
        if (r3.A00 != z) {
            r3.A00 = z;
            C36871lR.A02(r3);
            r3.invalidateSelf();
        }
        boolean A1S = AnonymousClass000.A1S(C36431kI.A0H(this).uiMode & 48, 32);
        if (r3.A01 != A1S) {
            r3.A01 = A1S;
            C36871lR.A02(r3);
            r3.invalidateSelf();
        }
        super.setBackground(r3);
    }

    public final void setAvailable(boolean z) {
        this.A00 = z;
        C36871lR backgroundDrawable = getBackgroundDrawable();
        if (!(backgroundDrawable == null || backgroundDrawable.A00 == z)) {
            backgroundDrawable.A00 = z;
            C36871lR.A02(backgroundDrawable);
            backgroundDrawable.invalidateSelf();
        }
        boolean z2 = this.A00;
        int i = R.string.f12nameremoved;
        if (z2) {
            i = R.string.f12nameremoved;
        }
        C012005e.A0Z(this, C36381kD.A0s(getResources(), i));
        A06();
    }

    private final C36871lR getBackgroundDrawable() {
        Drawable background = getBackground();
        if (background instanceof C36871lR) {
            return (C36871lR) background;
        }
        return null;
    }

    public void onConfigurationChanged(Configuration configuration) {
        boolean A1S;
        super.onConfigurationChanged(configuration);
        C36871lR backgroundDrawable = getBackgroundDrawable();
        if (backgroundDrawable != null && backgroundDrawable.A01 != (A1S = AnonymousClass000.A1S(C36431kI.A0H(this).uiMode & 48, 32))) {
            backgroundDrawable.A01 = A1S;
            C36871lR.A02(backgroundDrawable);
            backgroundDrawable.invalidateSelf();
        }
    }

    public void setSelected(boolean z) {
        super.setSelected(z);
        A06();
    }

    public /* synthetic */ AvailabilityStateTextView(Context context, AttributeSet attributeSet, int i, int i2, C05250Oz r7) {
        this(context, C36381kD.A0I(attributeSet, i2), C36391kE.A01(i2, i));
    }

    /* JADX INFO: finally extract failed */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AvailabilityStateTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AnonymousClass00C.A0D(context, 1);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C56592wZ.A01, i, 0);
        AnonymousClass00C.A08(obtainStyledAttributes);
        try {
            setAvailable(obtainStyledAttributes.getBoolean(0, this.A00));
            obtainStyledAttributes.recycle();
            super.setGravity(17);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AvailabilityStateTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        AnonymousClass00C.A0D(context, 1);
    }
}
