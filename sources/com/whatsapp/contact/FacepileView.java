package com.whatsapp.contact;

import X.AnonymousClass001;
import X.AnonymousClass00C;
import X.AnonymousClass1QZ;
import X.AnonymousClass2xF;
import X.AnonymousClass3QI;
import X.C05250Oz;
import X.C18700tb;
import X.C18820ts;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36381kD;
import X.C36391kE;
import X.C36401kF;
import X.C36441kJ;
import X.C65723Tf;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.whatsapp.R;
import com.whatsapp.WaImageView;
import com.whatsapp.components.button.ThumbnailButton;
import java.util.List;

public class FacepileView extends LinearLayout implements C18700tb {
    public int A00;
    public C18820ts A01;
    public AnonymousClass1QZ A02;
    public boolean A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public final List A08;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public FacepileView(Context context) {
        this(context, (AttributeSet) null, 0);
        AnonymousClass00C.A0D(context, 1);
    }

    private final void A00() {
        setClipToPadding(false);
        setClipChildren(false);
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        boolean A1X = C36401kF.A1X(getWaLocale());
        int i = this.A00;
        if (A1X) {
            if (paddingRight < i) {
                paddingRight = i;
            }
        } else if (paddingLeft < i) {
            paddingLeft = i;
        }
        C36381kD.A19(this, paddingLeft, paddingRight);
        for (ThumbnailButton thumbnailButton : this.A08) {
            thumbnailButton.A00 = (float) this.A05;
            thumbnailButton.A02 = this.A04;
            thumbnailButton.getLayoutParams().width = this.A06;
            ViewGroup.LayoutParams layoutParams = thumbnailButton.getLayoutParams();
            int i2 = this.A06;
            layoutParams.height = i2;
            thumbnailButton.A01 = (float) (i2 / 2);
            setupOverlap(thumbnailButton);
        }
    }

    public int getChildDrawingOrder(int i, int i2) {
        return (i - i2) - 1;
    }

    public boolean isChildrenDrawingOrderEnabled() {
        return true;
    }

    public final void setWaLocale(C18820ts r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A01 = r2;
    }

    private final void A01() {
        List list = this.A08;
        list.clear();
        if (this.A07 < getChildCount()) {
            int childCount = getChildCount();
            while (true) {
                childCount--;
                if (childCount < this.A07) {
                    break;
                }
                removeViewAt(childCount);
            }
        }
        int i = this.A07;
        for (int i2 = 0; i2 < i; i2++) {
            if (getChildCount() <= i2) {
                C36351kA.A0C(this).inflate(R.layout.f9nameremoved, this, true);
            }
            View childAt = getChildAt(i2);
            AnonymousClass00C.A0E(childAt, "null cannot be cast to non-null type com.whatsapp.components.button.ThumbnailButton");
            list.add(childAt);
        }
    }

    private final void setContactBorderColor(int i) {
        this.A04 = i;
        A00();
    }

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A02;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A02 = r0;
        }
        return r0.generatedComponent();
    }

    public final C18820ts getWaLocale() {
        C18820ts r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("waLocale");
    }

    public final void setContactBorderSize(int i) {
        this.A05 = i;
        A00();
    }

    public final void setContactIconSize(int i) {
        this.A06 = i;
        A00();
    }

    public final void setContactsSize(int i) {
        this.A07 = i;
        A01();
        A00();
    }

    public final void setOverlapSize(int i) {
        this.A00 = i;
        A00();
    }

    private final void setupOverlap(ThumbnailButton thumbnailButton) {
        int i;
        int i2;
        int i3;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        int i4 = 0;
        if (C36401kF.A1X(getWaLocale())) {
            i = 0;
        } else {
            i = -this.A00;
        }
        if (C36401kF.A1X(getWaLocale())) {
            i2 = -this.A00;
        } else {
            i2 = 0;
        }
        ViewGroup.LayoutParams layoutParams = thumbnailButton.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams) || (marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams) == null) {
            i3 = 0;
        } else {
            i3 = marginLayoutParams2.topMargin;
        }
        ViewGroup.LayoutParams layoutParams2 = thumbnailButton.getLayoutParams();
        if ((layoutParams2 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2) != null) {
            i4 = marginLayoutParams.bottomMargin;
        }
        C65723Tf.A02(thumbnailButton, new AnonymousClass3QI(i, i3, i2, i4));
    }

    public final WaImageView A02(int i) {
        if (i < getChildCount()) {
            return (WaImageView) this.A08.get(i);
        }
        return null;
    }

    public final int getContactBorderSize() {
        return this.A05;
    }

    public final int getContactIconSize() {
        return this.A06;
    }

    public final int getContactsSize() {
        return this.A07;
    }

    public int getLayout() {
        return R.layout.f9nameremoved;
    }

    public final int getOverlapSize() {
        return this.A00;
    }

    public final Resources getRes() {
        Resources A0F = C36341k9.A0F(this);
        AnonymousClass00C.A08(A0F);
        return A0F;
    }

    public /* synthetic */ FacepileView(Context context, AttributeSet attributeSet, int i, int i2, C05250Oz r7) {
        this(context, C36381kD.A0I(attributeSet, i2), C36391kE.A01(i2, i));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FacepileView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AnonymousClass00C.A0D(context, 1);
        if (!this.A03) {
            this.A03 = true;
            this.A01 = C36331k8.A0C(generatedComponent());
        }
        this.A08 = AnonymousClass001.A0I();
        Resources A0F = C36341k9.A0F(this);
        AnonymousClass00C.A08(A0F);
        this.A00 = A0F.getDimensionPixelSize(R.dimen.f7nameremoved);
        Resources A0F2 = C36341k9.A0F(this);
        AnonymousClass00C.A08(A0F2);
        this.A05 = A0F2.getDimensionPixelSize(R.dimen.f7nameremoved);
        Resources A0F3 = C36341k9.A0F(this);
        AnonymousClass00C.A08(A0F3);
        this.A06 = A0F3.getDimensionPixelSize(R.dimen.f7nameremoved);
        this.A04 = C36351kA.A01(context, R.attr.f4nameremoved, R.color.f6nameremoved);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = C36361kB.A09(this).obtainStyledAttributes(attributeSet, AnonymousClass2xF.A08, 0, 0);
            AnonymousClass00C.A08(obtainStyledAttributes);
            try {
                Resources A0F4 = C36341k9.A0F(this);
                AnonymousClass00C.A08(A0F4);
                setOverlapSize(obtainStyledAttributes.getDimensionPixelSize(4, A0F4.getDimensionPixelSize(R.dimen.f7nameremoved)));
                Resources A0F5 = C36341k9.A0F(this);
                AnonymousClass00C.A08(A0F5);
                setContactIconSize(obtainStyledAttributes.getDimensionPixelSize(2, A0F5.getDimensionPixelSize(R.dimen.f7nameremoved)));
                setContactBorderColor(obtainStyledAttributes.getColor(0, C36351kA.A02(getContext(), getContext(), R.attr.f4nameremoved, R.color.f6nameremoved)));
                Resources A0F6 = C36341k9.A0F(this);
                AnonymousClass00C.A08(A0F6);
                setContactBorderSize(obtainStyledAttributes.getDimensionPixelSize(1, A0F6.getDimensionPixelSize(R.dimen.f7nameremoved)));
                setContactsSize(obtainStyledAttributes.getInt(3, 0));
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        A01();
        A00();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public FacepileView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        AnonymousClass00C.A0D(context, 1);
    }
}
