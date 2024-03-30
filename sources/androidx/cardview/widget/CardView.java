package androidx.cardview.widget;

import X.AnonymousClass001;
import X.C03230Dr;
import X.C09540cX;
import X.C09550cY;
import X.C15670nn;
import X.C17030qb;
import X.C56052vf;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.whatsapp.R;

public class CardView extends FrameLayout {
    public static final C17030qb A05 = new C09550cY();
    public static final int[] A06 = {16842801};
    public boolean A00;
    public boolean A01;
    public final Rect A02;
    public final Rect A03;
    public final C15670nn A04;

    public void setPadding(int i, int i2, int i3, int i4) {
    }

    public void setPaddingRelative(int i, int i2, int i3, int i4) {
    }

    public ColorStateList getCardBackgroundColor() {
        return ((C03230Dr) ((C09540cX) this.A04).A00).A02;
    }

    public float getCardElevation() {
        return ((C09540cX) this.A04).A01.getElevation();
    }

    public int getContentPaddingBottom() {
        return this.A02.bottom;
    }

    public int getContentPaddingLeft() {
        return this.A02.left;
    }

    public int getContentPaddingRight() {
        return this.A02.right;
    }

    public int getContentPaddingTop() {
        return this.A02.top;
    }

    public float getMaxCardElevation() {
        return ((C03230Dr) ((C09540cX) this.A04).A00).A00;
    }

    public float getRadius() {
        return ((C03230Dr) ((C09540cX) this.A04).A00).A01;
    }

    public void setCardBackgroundColor(int i) {
        A05.BqG(ColorStateList.valueOf(i), this.A04);
    }

    public void setCardElevation(float f) {
        ((C09540cX) this.A04).A01.setElevation(f);
    }

    public void setMaxCardElevation(float f) {
        A05.BrA(this.A04, f);
    }

    public void setPreventCornerOverlap(boolean z) {
        if (z != this.A01) {
            this.A01 = z;
            C17030qb r2 = A05;
            C15670nn r1 = this.A04;
            ((C09550cY) r2).BrA(r1, ((C03230Dr) ((C09540cX) r1).A00).A00);
        }
    }

    public void setRadius(float f) {
        C03230Dr r1 = (C03230Dr) ((C09540cX) this.A04).A00;
        if (f != r1.A01) {
            r1.A01 = f;
            C03230Dr.A00((Rect) null, r1);
            r1.invalidateSelf();
        }
    }

    public void setUseCompatPadding(boolean z) {
        if (this.A00 != z) {
            this.A00 = z;
            C17030qb r2 = A05;
            C15670nn r1 = this.A04;
            ((C09550cY) r2).BrA(r1, ((C03230Dr) ((C09540cX) r1).A00).A00);
        }
    }

    public CardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.f4nameremoved);
    }

    public void setMinimumHeight(int i) {
        super.setMinimumHeight(i);
    }

    public void setMinimumWidth(int i) {
        super.setMinimumWidth(i);
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    public boolean getPreventCornerOverlap() {
        return this.A01;
    }

    public boolean getUseCompatPadding() {
        return this.A00;
    }

    public CardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ColorStateList valueOf;
        Rect A062 = AnonymousClass001.A06();
        this.A02 = A062;
        this.A03 = AnonymousClass001.A06();
        C09540cX r3 = new C09540cX(this);
        this.A04 = r3;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C56052vf.A00, i, R.style.f13nameremoved);
        if (obtainStyledAttributes.hasValue(2)) {
            valueOf = obtainStyledAttributes.getColorStateList(2);
        } else {
            TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(A06);
            int color = obtainStyledAttributes2.getColor(0, 0);
            obtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color, fArr);
            valueOf = ColorStateList.valueOf(getResources().getColor(fArr[2] > 0.5f ? R.color.f6nameremoved : R.color.f6nameremoved));
        }
        float dimension = obtainStyledAttributes.getDimension(3, 0.0f);
        float dimension2 = obtainStyledAttributes.getDimension(4, 0.0f);
        float dimension3 = obtainStyledAttributes.getDimension(5, 0.0f);
        this.A00 = obtainStyledAttributes.getBoolean(7, false);
        this.A01 = obtainStyledAttributes.getBoolean(6, true);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(8, 0);
        A062.left = obtainStyledAttributes.getDimensionPixelSize(10, dimensionPixelSize);
        A062.top = obtainStyledAttributes.getDimensionPixelSize(12, dimensionPixelSize);
        A062.right = obtainStyledAttributes.getDimensionPixelSize(11, dimensionPixelSize);
        A062.bottom = obtainStyledAttributes.getDimensionPixelSize(9, dimensionPixelSize);
        dimension3 = dimension2 > dimension3 ? dimension2 : dimension3;
        obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        C03230Dr r1 = new C03230Dr(valueOf, dimension);
        r3.A00 = r1;
        CardView cardView = r3.A01;
        cardView.setBackgroundDrawable(r1);
        cardView.setClipToOutline(true);
        cardView.setElevation(dimension2);
        ((C09550cY) A05).BrA(r3, dimension3);
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        A05.BqG(colorStateList, this.A04);
    }

    public CardView(Context context) {
        this(context, (AttributeSet) null);
    }
}
