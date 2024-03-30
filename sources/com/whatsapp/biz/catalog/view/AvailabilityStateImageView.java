package com.whatsapp.biz.catalog.view;

import X.AVa;
import X.AnonymousClass000;
import X.AnonymousClass00C;
import X.AnonymousClass287;
import X.C012005e;
import X.C05250Oz;
import X.C27751Pr;
import X.C36331k8;
import X.C36371kC;
import X.C36381kD;
import X.C36391kE;
import X.C36411kG;
import X.C36421kH;
import X.C36851lP;
import X.C56592wZ;
import X.C68453bv;
import X.C84744Ek;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.whatsapp.R;

public final class AvailabilityStateImageView extends AnonymousClass287 {
    public C36851lP A00;
    public boolean A01;
    public C27751Pr A02;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AvailabilityStateImageView(Context context) {
        this(context, (AttributeSet) null, 0);
        AnonymousClass00C.A0D(context, 1);
    }

    public static final void setImageDrawable$lambda$0(AvailabilityStateImageView availabilityStateImageView, Drawable drawable) {
        AnonymousClass00C.A0D(availabilityStateImageView, 0);
        availabilityStateImageView.setImageDrawableInternal(drawable);
    }

    private final void setImageDrawableInternal(Drawable drawable) {
        Drawable drawable2 = null;
        if (drawable != null) {
            C36411kG.A1D(this);
            C27751Pr r1 = this.A02;
            if (r1 == null) {
                throw C36331k8.A0d("helper");
            }
            drawable2 = C36371kC.A0F(drawable, C68453bv.A00, r1);
        }
        super.setImageDrawable(drawable2);
    }

    public final void A04(C36851lP r3, C27751Pr r4) {
        AnonymousClass00C.A0D(r4, 0);
        if (!getAreDependenciesInjected()) {
            this.A02 = r4;
            this.A00 = r3;
            r3.setCallback(this);
            boolean z = this.A01;
            if (r3.A00 != z) {
                r3.A00 = z;
                C36851lP.A00(r3, C36421kH.A03(r3));
                r3.invalidateSelf();
            }
        }
    }

    public void onDraw(Canvas canvas) {
        AnonymousClass00C.A0D(canvas, 0);
        Drawable drawable = getDrawable();
        if (drawable == null || drawable.getBounds() == null) {
            super.onDraw(canvas);
        } else {
            canvas.save();
            canvas.scale(0.8f, 0.8f, (((float) C36331k8.A00(this, getWidth())) * 0.5f) + ((float) getPaddingLeft()), (((float) AnonymousClass000.A0D(this, getHeight())) * 0.5f) + ((float) getPaddingTop()));
            super.onDraw(canvas);
            canvas.restore();
        }
        C36851lP r0 = this.A00;
        if (r0 == null) {
            throw C36331k8.A0d("frameDrawable");
        }
        r0.draw(canvas);
    }

    public boolean verifyDrawable(Drawable drawable) {
        AnonymousClass00C.A0D(drawable, 0);
        if (!super.verifyDrawable(drawable)) {
            C36851lP r1 = this.A00;
            if (r1 == null) {
                throw C36331k8.A0d("frameDrawable");
            } else if (drawable == r1) {
                return true;
            } else {
                return false;
            }
        }
        return true;
    }

    private final boolean getAreDependenciesInjected() {
        if (this.A02 == null || this.A00 == null) {
            return false;
        }
        return true;
    }

    public final void setAvailable(boolean z) {
        this.A01 = z;
        int i = R.string.f12nameremoved;
        if (z) {
            i = R.string.f12nameremoved;
        }
        C012005e.A0Z(this, C36381kD.A0s(getResources(), i));
        C84744Ek r1 = new C84744Ek(this, z);
        if (getAreDependenciesInjected()) {
            r1.invoke();
        }
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        C36851lP r3 = this.A00;
        if (r3 == null) {
            throw C36331k8.A0d("frameDrawable");
        }
        r3.setBounds(getPaddingLeft(), getPaddingTop(), i - getPaddingRight(), i2 - getPaddingBottom());
    }

    public void setImageBitmap(Bitmap bitmap) {
        setImageDrawable(new BitmapDrawable(getResources(), bitmap));
    }

    public void setImageDrawable(Drawable drawable) {
        if (getAreDependenciesInjected()) {
            setImageDrawableInternal(drawable);
        } else {
            post(new AVa(this, drawable, 35));
        }
    }

    public void setSelected(boolean z) {
        super.setSelected(z);
        C36851lP r1 = this.A00;
        if (r1 == null) {
            throw C36331k8.A0d("frameDrawable");
        }
        r1.setState(getDrawableState());
    }

    public /* synthetic */ AvailabilityStateImageView(Context context, AttributeSet attributeSet, int i, int i2, C05250Oz r7) {
        this(context, C36381kD.A0I(attributeSet, i2), C36391kE.A01(i2, i));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AvailabilityStateImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AnonymousClass00C.A0D(context, 1);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C56592wZ.A00, i, 0);
        AnonymousClass00C.A08(obtainStyledAttributes);
        try {
            setAvailable(obtainStyledAttributes.getBoolean(0, this.A01));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AvailabilityStateImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        AnonymousClass00C.A0D(context, 1);
    }
}
