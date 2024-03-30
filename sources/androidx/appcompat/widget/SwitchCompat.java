package androidx.appcompat.widget;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass02X;
import X.AnonymousClass04F;
import X.AnonymousClass04u;
import X.AnonymousClass076;
import X.AnonymousClass088;
import X.AnonymousClass08I;
import X.AnonymousClass1MJ;
import X.C010404j;
import X.C010504k;
import X.C012005e;
import X.C015906w;
import X.C02470Al;
import X.C18090sb;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.Property;
import android.view.ActionMode;
import android.view.VelocityTracker;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import com.whatsapp.R;
import java.lang.reflect.Method;

public class SwitchCompat extends CompoundButton {
    public static final Property A0b = new C18090sb(0);
    public static final int[] A0c = {16842912};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public ObjectAnimator A08;
    public ColorStateList A09;
    public ColorStateList A0A;
    public PorterDuff.Mode A0B;
    public PorterDuff.Mode A0C;
    public Drawable A0D;
    public Drawable A0E;
    public VelocityTracker A0F;
    public CharSequence A0G;
    public CharSequence A0H;
    public float A0I;
    public float A0J;
    public int A0K;
    public int A0L;
    public int A0M;
    public int A0N;
    public ColorStateList A0O;
    public Layout A0P;
    public Layout A0Q;
    public TransformationMethod A0R;
    public boolean A0S;
    public boolean A0T;
    public boolean A0U;
    public boolean A0V;
    public boolean A0W;
    public boolean A0X;
    public final Rect A0Y;
    public final TextPaint A0Z;
    public final C015906w A0a;
    public int mSwitchWidth;
    public float mThumbPosition;

    private StaticLayout A00(CharSequence charSequence) {
        int i;
        CharSequence charSequence2 = charSequence;
        TransformationMethod transformationMethod = this.A0R;
        if (transformationMethod != null) {
            charSequence2 = transformationMethod.getTransformation(charSequence, this);
        }
        TextPaint textPaint = this.A0Z;
        if (charSequence2 != null) {
            i = (int) Math.ceil((double) Layout.getDesiredWidth(charSequence2, textPaint));
        } else {
            i = 0;
        }
        return new StaticLayout(charSequence2, textPaint, i, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
    }

    private void A01() {
        Drawable drawable = this.A0D;
        if (drawable == null) {
            return;
        }
        if (this.A0S || this.A0T) {
            Drawable mutate = AnonymousClass08I.A01(drawable).mutate();
            this.A0D = mutate;
            if (this.A0S) {
                AnonymousClass076.A01(this.A09, mutate);
            }
            if (this.A0T) {
                AnonymousClass076.A04(this.A0B, this.A0D);
            }
            if (this.A0D.isStateful()) {
                AnonymousClass000.A13(this.A0D, this);
            }
        }
    }

    private void A02() {
        Drawable drawable = this.A0E;
        if (drawable == null) {
            return;
        }
        if (this.A0U || this.A0V) {
            Drawable mutate = AnonymousClass08I.A01(drawable).mutate();
            this.A0E = mutate;
            if (this.A0U) {
                AnonymousClass076.A01(this.A0A, mutate);
            }
            if (this.A0V) {
                AnonymousClass076.A04(this.A0C, this.A0E);
            }
            if (this.A0E.isStateful()) {
                AnonymousClass000.A13(this.A0E, this);
            }
        }
    }

    private boolean getTargetCheckedState() {
        return AnonymousClass000.A1R((this.mThumbPosition > 0.5f ? 1 : (this.mThumbPosition == 0.5f ? 0 : -1)));
    }

    private int getThumbOffset() {
        float f;
        Method method = AnonymousClass04u.A00;
        if (AnonymousClass04F.A01(this) == 1) {
            f = 1.0f - this.mThumbPosition;
        } else {
            f = this.mThumbPosition;
        }
        return (int) ((f * ((float) getThumbScrollRange())) + 0.5f);
    }

    private int getThumbScrollRange() {
        Rect rect;
        Drawable drawable = this.A0E;
        if (drawable == null) {
            return 0;
        }
        Rect rect2 = this.A0Y;
        drawable.getPadding(rect2);
        Drawable drawable2 = this.A0D;
        if (drawable2 != null) {
            rect = C010504k.A01(drawable2);
        } else {
            rect = C010504k.A01;
        }
        return ((((this.mSwitchWidth - this.A05) - rect2.left) - rect2.right) - rect.left) - rect.right;
    }

    public void A03(Context context, int i) {
        Typeface typeface;
        C02470Al r0;
        Typeface create;
        int i2;
        C010404j r1 = new C010404j(context, context.obtainStyledAttributes(i, AnonymousClass1MJ.A0M));
        ColorStateList A012 = r1.A01(3);
        if (A012 == null) {
            A012 = getTextColors();
        }
        this.A0O = A012;
        TypedArray typedArray = r1.A02;
        int dimensionPixelSize = typedArray.getDimensionPixelSize(0, 0);
        if (dimensionPixelSize != 0) {
            float f = (float) dimensionPixelSize;
            TextPaint textPaint = this.A0Z;
            if (f != textPaint.getTextSize()) {
                textPaint.setTextSize(f);
                requestLayout();
            }
        }
        int i3 = typedArray.getInt(1, -1);
        int i4 = typedArray.getInt(2, -1);
        if (i3 == 1) {
            typeface = Typeface.SANS_SERIF;
        } else if (i3 == 2) {
            typeface = Typeface.SERIF;
        } else if (i3 != 3) {
            typeface = null;
        } else {
            typeface = Typeface.MONOSPACE;
        }
        float f2 = 0.0f;
        boolean z = false;
        if (i4 > 0) {
            if (typeface == null) {
                create = Typeface.defaultFromStyle(i4);
            } else {
                create = Typeface.create(typeface, i4);
            }
            setSwitchTypeface(create);
            if (create != null) {
                i2 = create.getStyle();
            } else {
                i2 = 0;
            }
            int i5 = (~i2) & i4;
            TextPaint textPaint2 = this.A0Z;
            if ((i5 & 1) != 0) {
                z = true;
            }
            textPaint2.setFakeBoldText(z);
            if ((i5 & 2) != 0) {
                f2 = -0.25f;
            }
            textPaint2.setTextSkewX(f2);
        } else {
            TextPaint textPaint3 = this.A0Z;
            textPaint3.setFakeBoldText(false);
            textPaint3.setTextSkewX(0.0f);
            setSwitchTypeface(typeface);
        }
        if (typedArray.getBoolean(14, false)) {
            r0 = new C02470Al(getContext());
        } else {
            r0 = null;
        }
        this.A0R = r0;
        typedArray.recycle();
    }

    public void draw(Canvas canvas) {
        Rect rect;
        Rect rect2 = this.A0Y;
        int i = this.A02;
        int i2 = this.A04;
        int i3 = this.A0M;
        int i4 = this.A01;
        int thumbOffset = getThumbOffset() + i;
        Drawable drawable = this.A0D;
        if (drawable != null) {
            rect = C010504k.A01(drawable);
        } else {
            rect = C010504k.A01;
        }
        Drawable drawable2 = this.A0E;
        if (drawable2 != null) {
            drawable2.getPadding(rect2);
            int i5 = rect2.left;
            thumbOffset += i5;
            int i6 = rect.left;
            if (i6 > i5) {
                i += i6 - i5;
            }
            int i7 = rect.top;
            int i8 = rect2.top;
            int i9 = (i7 - i8) + i2;
            if (i7 <= i8) {
                i9 = i2;
            }
            int i10 = rect.right;
            int i11 = rect2.right;
            if (i10 > i11) {
                i3 -= i10 - i11;
            }
            int i12 = rect.bottom;
            int i13 = rect2.bottom;
            int i14 = i4 - (i12 - i13);
            if (i12 <= i13) {
                i14 = i4;
            }
            this.A0E.setBounds(i, i9, i3, i14);
        }
        Drawable drawable3 = this.A0D;
        if (drawable3 != null) {
            drawable3.getPadding(rect2);
            int i15 = thumbOffset - rect2.left;
            int i16 = thumbOffset + this.A05 + rect2.right;
            this.A0D.setBounds(i15, i2, i16, i4);
            Drawable background = getBackground();
            if (background != null) {
                AnonymousClass076.A07(background, i15, i2, i16, i4);
            }
        }
        super.draw(canvas);
    }

    public int getCompoundPaddingLeft() {
        Method method = AnonymousClass04u.A00;
        boolean A072 = AnonymousClass04F.A07(this);
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        if (!A072) {
            return compoundPaddingLeft;
        }
        int i = compoundPaddingLeft + this.mSwitchWidth;
        if (!TextUtils.isEmpty(getText())) {
            return i + this.A0L;
        }
        return i;
    }

    public int getCompoundPaddingRight() {
        Method method = AnonymousClass04u.A00;
        boolean A072 = AnonymousClass04F.A07(this);
        int compoundPaddingRight = super.getCompoundPaddingRight();
        if (A072) {
            return compoundPaddingRight;
        }
        int i = compoundPaddingRight + this.mSwitchWidth;
        if (!TextUtils.isEmpty(getText())) {
            return i + this.A0L;
        }
        return i;
    }

    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, A0c);
        }
        return onCreateDrawableState;
    }

    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        if (this.A0W) {
            if (this.A0Q == null) {
                this.A0Q = A00(this.A0H);
            }
            if (this.A0P == null) {
                this.A0P = A00(this.A0G);
            }
        }
        Rect rect = this.A0Y;
        Drawable drawable = this.A0D;
        int i6 = 0;
        if (drawable != null) {
            drawable.getPadding(rect);
            i3 = (this.A0D.getIntrinsicWidth() - rect.left) - rect.right;
            i4 = this.A0D.getIntrinsicHeight();
        } else {
            i3 = 0;
            i4 = 0;
        }
        if (this.A0W) {
            i5 = Math.max(this.A0Q.getWidth(), this.A0P.getWidth()) + (this.A0N * 2);
        } else {
            i5 = 0;
        }
        this.A05 = Math.max(i5, i3);
        Drawable drawable2 = this.A0E;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            i6 = this.A0E.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int i7 = rect.left;
        int i8 = rect.right;
        Drawable drawable3 = this.A0D;
        if (drawable3 != null) {
            Rect A012 = C010504k.A01(drawable3);
            i7 = Math.max(i7, A012.left);
            i8 = Math.max(i8, A012.right);
        }
        int max = Math.max(this.A03, (this.A05 * 2) + i7 + i8);
        int max2 = Math.max(i6, i4);
        this.mSwitchWidth = max;
        this.A0K = max2;
        super.onMeasure(i, i2);
        if (getMeasuredHeight() < max2) {
            setMeasuredDimension(getMeasuredWidthAndState(), max2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00a2, code lost:
        if (isEnabled() == false) goto L_0x00a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0012, code lost:
        if (r1 != 3) goto L_0x0014;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r10) {
        /*
            r9 = this;
            android.view.VelocityTracker r7 = r9.A0F
            r7.addMovement(r10)
            int r1 = r10.getActionMasked()
            r4 = 1
            if (r1 == 0) goto L_0x0100
            r6 = 2
            if (r1 == r4) goto L_0x008f
            if (r1 == r6) goto L_0x0019
            r0 = 3
            if (r1 == r0) goto L_0x008f
        L_0x0014:
            boolean r0 = super.onTouchEvent(r10)
            return r0
        L_0x0019:
            int r0 = r9.A06
            if (r0 == r4) goto L_0x005e
            if (r0 != r6) goto L_0x0014
            float r6 = r10.getX()
            int r2 = r9.getThumbScrollRange()
            float r0 = r9.A0I
            float r1 = r6 - r0
            r5 = 0
            if (r2 == 0) goto L_0x0055
            float r0 = (float) r2
            float r1 = r1 / r0
        L_0x0030:
            java.lang.reflect.Method r0 = X.AnonymousClass04u.A00
            int r0 = X.AnonymousClass04F.A01(r9)
            if (r0 != r4) goto L_0x0039
            float r1 = -r1
        L_0x0039:
            float r3 = r9.mThumbPosition
            float r2 = r3 + r1
            r1 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x004e
            r2 = 0
        L_0x0044:
            int r0 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x004d
            r9.A0I = r6
            r9.setThumbPosition(r2)
        L_0x004d:
            return r4
        L_0x004e:
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0044
            r2 = 1065353216(0x3f800000, float:1.0)
            goto L_0x0044
        L_0x0055:
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r0 <= 0) goto L_0x0030
            r1 = 1065353216(0x3f800000, float:1.0)
            goto L_0x0030
        L_0x005e:
            float r5 = r10.getX()
            float r3 = r10.getY()
            float r0 = r9.A0I
            float r0 = r5 - r0
            float r2 = java.lang.Math.abs(r0)
            int r0 = r9.A07
            float r1 = (float) r0
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0081
            float r0 = r9.A0J
            float r0 = r3 - r0
            float r0 = java.lang.Math.abs(r0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0014
        L_0x0081:
            r9.A06 = r6
            android.view.ViewParent r0 = r9.getParent()
            r0.requestDisallowInterceptTouchEvent(r4)
            r9.A0I = r5
            r9.A0J = r3
            return r4
        L_0x008f:
            int r0 = r9.A06
            if (r0 != r6) goto L_0x00f8
            r5 = 0
            r9.A06 = r5
            int r0 = r10.getAction()
            r3 = 1
            if (r0 != r4) goto L_0x00a4
            boolean r1 = r9.isEnabled()
            r0 = 1
            if (r1 != 0) goto L_0x00a5
        L_0x00a4:
            r0 = 0
        L_0x00a5:
            boolean r2 = r9.isChecked()
            if (r0 == 0) goto L_0x00f6
            r0 = 1000(0x3e8, float:1.401E-42)
            r7.computeCurrentVelocity(r0)
            float r6 = r7.getXVelocity()
            float r1 = java.lang.Math.abs(r6)
            int r0 = r9.A00
            float r0 = (float) r0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x00f1
            java.lang.reflect.Method r0 = X.AnonymousClass04u.A00
            int r0 = X.AnonymousClass04F.A01(r9)
            r1 = 1
            if (r0 == r4) goto L_0x00c9
            r1 = 0
        L_0x00c9:
            r0 = 0
            if (r1 == 0) goto L_0x00ea
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x00ef
        L_0x00d0:
            if (r3 == r2) goto L_0x00d5
            r9.playSoundEffect(r5)
        L_0x00d5:
            r9.setChecked(r3)
            android.view.MotionEvent r1 = android.view.MotionEvent.obtain(r10)
            r0 = 3
            r1.setAction(r0)
            super.onTouchEvent(r1)
            r1.recycle()
            super.onTouchEvent(r10)
            return r4
        L_0x00ea:
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x00ef
            goto L_0x00d0
        L_0x00ef:
            r3 = 0
            goto L_0x00d0
        L_0x00f1:
            boolean r3 = r9.getTargetCheckedState()
            goto L_0x00d0
        L_0x00f6:
            r3 = r2
            goto L_0x00d0
        L_0x00f8:
            r0 = 0
            r9.A06 = r0
            r7.clear()
            goto L_0x0014
        L_0x0100:
            float r3 = r10.getX()
            float r2 = r10.getY()
            boolean r0 = r9.isEnabled()
            if (r0 == 0) goto L_0x0014
            android.graphics.drawable.Drawable r0 = r9.A0D
            if (r0 == 0) goto L_0x0014
            int r5 = r9.getThumbOffset()
            android.graphics.drawable.Drawable r0 = r9.A0D
            android.graphics.Rect r1 = r9.A0Y
            r0.getPadding(r1)
            int r8 = r9.A04
            int r7 = r9.A07
            int r8 = r8 - r7
            int r6 = r9.A02
            int r6 = r6 + r5
            int r6 = r6 - r7
            int r5 = r9.A05
            int r5 = r5 + r6
            int r0 = r1.left
            int r5 = r5 + r0
            int r0 = r1.right
            int r5 = r5 + r0
            int r5 = r5 + r7
            int r1 = r9.A01
            int r1 = r1 + r7
            float r0 = (float) r6
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0014
            float r0 = (float) r5
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x0014
            float r0 = (float) r8
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0014
            float r0 = (float) r1
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x0014
            r9.A06 = r4
            r9.A0I = r3
            r9.A0J = r2
            goto L_0x0014
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SwitchCompat.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setShowText(boolean z) {
        if (this.A0W != z) {
            this.A0W = z;
            requestLayout();
        }
    }

    public void setSplitTrack(boolean z) {
        this.A0X = z;
        invalidate();
    }

    public void setSwitchMinWidth(int i) {
        this.A03 = i;
        requestLayout();
    }

    public void setSwitchPadding(int i) {
        this.A0L = i;
        requestLayout();
    }

    public void setSwitchTypeface(Typeface typeface) {
        TextPaint textPaint = this.A0Z;
        if ((textPaint.getTypeface() != null && !textPaint.getTypeface().equals(typeface)) || (textPaint.getTypeface() == null && typeface != null)) {
            textPaint.setTypeface(typeface);
            requestLayout();
            invalidate();
        }
    }

    public void setTextOff(CharSequence charSequence) {
        this.A0G = charSequence;
        requestLayout();
        if (!isChecked() && Build.VERSION.SDK_INT >= 30) {
            CharSequence charSequence2 = this.A0G;
            if (charSequence2 == null) {
                charSequence2 = getResources().getString(R.string.f12nameremoved);
            }
            C012005e.A0Z(this, charSequence2);
        }
    }

    public void setTextOn(CharSequence charSequence) {
        this.A0H = charSequence;
        requestLayout();
        if (isChecked() && Build.VERSION.SDK_INT >= 30) {
            CharSequence charSequence2 = this.A0H;
            if (charSequence2 == null) {
                charSequence2 = getResources().getString(R.string.f12nameremoved);
            }
            C012005e.A0Z(this, charSequence2);
        }
    }

    public void setThumbDrawable(Drawable drawable) {
        AnonymousClass000.A12(this.A0D);
        this.A0D = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setThumbPosition(float f) {
        this.mThumbPosition = f;
        invalidate();
    }

    public void setThumbTextPadding(int i) {
        this.A0N = i;
        requestLayout();
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.A09 = colorStateList;
        this.A0S = true;
        A01();
    }

    public void setThumbTintMode(PorterDuff.Mode mode) {
        this.A0B = mode;
        this.A0T = true;
        A01();
    }

    public void setTrackDrawable(Drawable drawable) {
        AnonymousClass000.A12(this.A0E);
        this.A0E = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.A0A = colorStateList;
        this.A0U = true;
        A02();
    }

    public void setTrackTintMode(PorterDuff.Mode mode) {
        this.A0C = mode;
        this.A0V = true;
        A02();
    }

    public SwitchCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.f4nameremoved);
    }

    public void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        Drawable drawable = this.A0D;
        if (drawable != null) {
            AnonymousClass076.A05(drawable, f, f2);
        }
        Drawable drawable2 = this.A0E;
        if (drawable2 != null) {
            AnonymousClass076.A05(drawable2, f, f2);
        }
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.A0D;
        boolean z = false;
        if (drawable != null && drawable.isStateful()) {
            z = false | drawable.setState(drawableState);
        }
        Drawable drawable2 = this.A0E;
        if (drawable2 != null && drawable2.isStateful()) {
            z |= drawable2.setState(drawableState);
        }
        if (z) {
            invalidate();
        }
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.A0D;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.A0E;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.A08;
        if (objectAnimator != null && objectAnimator.isStarted()) {
            this.A08.end();
            this.A08 = null;
        }
    }

    public void onDraw(Canvas canvas) {
        Layout layout;
        int width;
        super.onDraw(canvas);
        Rect rect = this.A0Y;
        Drawable drawable = this.A0E;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i = this.A04;
        int i2 = this.A01;
        int i3 = i + rect.top;
        int i4 = i2 - rect.bottom;
        Drawable drawable2 = this.A0D;
        if (drawable != null) {
            if (!this.A0X || drawable2 == null) {
                drawable.draw(canvas);
            } else {
                Rect A012 = C010504k.A01(drawable2);
                drawable2.copyBounds(rect);
                rect.left += A012.left;
                rect.right -= A012.right;
                int save = canvas.save();
                canvas.clipRect(rect, Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(save);
            }
        }
        int save2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        if (getTargetCheckedState()) {
            layout = this.A0Q;
        } else {
            layout = this.A0P;
        }
        if (layout != null) {
            int[] drawableState = getDrawableState();
            ColorStateList colorStateList = this.A0O;
            if (colorStateList != null) {
                this.A0Z.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            this.A0Z.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                width = bounds.left + bounds.right;
            } else {
                width = getWidth();
            }
            canvas.translate((float) ((width / 2) - (layout.getWidth() / 2)), (float) (((i3 + i4) / 2) - (layout.getHeight() / 2)));
            layout.draw(canvas);
        }
        canvas.restoreToCount(save2);
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.widget.Switch");
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        CharSequence charSequence;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        if (Build.VERSION.SDK_INT < 30) {
            if (isChecked()) {
                charSequence = this.A0H;
            } else {
                charSequence = this.A0G;
            }
            if (!TextUtils.isEmpty(charSequence)) {
                CharSequence text = accessibilityNodeInfo.getText();
                if (TextUtils.isEmpty(text)) {
                    accessibilityNodeInfo.setText(charSequence);
                    return;
                }
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append(text);
                A0u.append(' ');
                A0u.append(charSequence);
                accessibilityNodeInfo.setText(A0u);
            }
        }
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int A0B2;
        int i6;
        int i7;
        int paddingTop;
        int i8;
        super.onLayout(z, i, i2, i3, i4);
        int i9 = 0;
        if (this.A0D != null) {
            Rect rect = this.A0Y;
            Drawable drawable = this.A0E;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect A012 = C010504k.A01(this.A0D);
            i5 = AnonymousClass001.A02(A012.left, rect.left, 0);
            i9 = AnonymousClass001.A02(A012.right, rect.right, 0);
        } else {
            i5 = 0;
        }
        Method method = AnonymousClass04u.A00;
        if (AnonymousClass04F.A01(this) == 1) {
            i6 = getPaddingLeft() + i5;
            A0B2 = ((this.mSwitchWidth + i6) - i5) - i9;
        } else {
            A0B2 = AnonymousClass000.A0B(this) - i9;
            i6 = (A0B2 - this.mSwitchWidth) + i5 + i9;
        }
        int gravity = getGravity() & 112;
        if (gravity == 16) {
            i7 = this.A0K;
            paddingTop = (((getPaddingTop() + getHeight()) - getPaddingBottom()) / 2) - (i7 / 2);
        } else if (gravity != 80) {
            paddingTop = getPaddingTop();
            i7 = this.A0K;
        } else {
            i8 = AnonymousClass000.A0A(this);
            paddingTop = i8 - this.A0K;
            this.A02 = i6;
            this.A04 = paddingTop;
            this.A01 = i8;
            this.A0M = A0B2;
        }
        i8 = i7 + paddingTop;
        this.A02 = i6;
        this.A04 = paddingTop;
        this.A01 = i8;
        this.A0M = A0B2;
    }

    public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        CharSequence charSequence;
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        if (isChecked()) {
            charSequence = this.A0H;
        } else {
            charSequence = this.A0G;
        }
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x005e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setChecked(boolean r6) {
        /*
            r5 = this;
            super.setChecked(r6)
            boolean r2 = r5.isChecked()
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 30
            if (r2 == 0) goto L_0x0050
            if (r1 < r0) goto L_0x0021
            java.lang.CharSequence r0 = r5.A0H
            if (r0 != 0) goto L_0x001e
            android.content.res.Resources r1 = r5.getResources()
            r0 = 2131896252(0x7f1227bc, float:1.942736E38)
        L_0x001a:
            java.lang.String r0 = r1.getString(r0)
        L_0x001e:
            X.C012005e.A0Z(r5, r0)
        L_0x0021:
            android.os.IBinder r0 = r5.getWindowToken()
            if (r0 == 0) goto L_0x005e
            boolean r0 = X.C011304x.A03(r5)
            if (r0 == 0) goto L_0x005e
            r4 = 0
            if (r2 == 0) goto L_0x0032
            r4 = 1065353216(0x3f800000, float:1.0)
        L_0x0032:
            android.util.Property r2 = A0b
            r3 = 1
            float[] r1 = new float[r3]
            r0 = 0
            r1[r0] = r4
            android.animation.ObjectAnimator r2 = android.animation.ObjectAnimator.ofFloat(r5, r2, r1)
            r5.A08 = r2
            r0 = 250(0xfa, double:1.235E-321)
            r2.setDuration(r0)
            android.animation.ObjectAnimator r0 = r5.A08
            r0.setAutoCancel(r3)
            android.animation.ObjectAnimator r0 = r5.A08
            r0.start()
            return
        L_0x0050:
            if (r1 < r0) goto L_0x0021
            java.lang.CharSequence r0 = r5.A0G
            if (r0 != 0) goto L_0x001e
            android.content.res.Resources r1 = r5.getResources()
            r0 = 2131896251(0x7f1227bb, float:1.9427358E38)
            goto L_0x001a
        L_0x005e:
            android.animation.ObjectAnimator r0 = r5.A08
            if (r0 == 0) goto L_0x0065
            r0.cancel()
        L_0x0065:
            r0 = 0
            if (r2 == 0) goto L_0x006a
            r0 = 1065353216(0x3f800000, float:1.0)
        L_0x006a:
            r5.setThumbPosition(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SwitchCompat.setChecked(boolean):void");
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(AnonymousClass088.A00(callback, this));
    }

    public void setThumbResource(int i) {
        setThumbDrawable(AnonymousClass02X.A02(this, i));
    }

    public void setTrackResource(int i) {
        setTrackDrawable(AnonymousClass02X.A02(this, i));
    }

    public void toggle() {
        setChecked(!isChecked());
    }

    public boolean verifyDrawable(Drawable drawable) {
        if (super.verifyDrawable(drawable) || drawable == this.A0D || drawable == this.A0E) {
            return true;
        }
        return false;
    }

    public boolean getShowText() {
        return this.A0W;
    }

    public boolean getSplitTrack() {
        return this.A0X;
    }

    public int getSwitchMinWidth() {
        return this.A03;
    }

    public int getSwitchPadding() {
        return this.A0L;
    }

    public CharSequence getTextOff() {
        return this.A0G;
    }

    public CharSequence getTextOn() {
        return this.A0H;
    }

    public Drawable getThumbDrawable() {
        return this.A0D;
    }

    public int getThumbTextPadding() {
        return this.A0N;
    }

    public ColorStateList getThumbTintList() {
        return this.A09;
    }

    public PorterDuff.Mode getThumbTintMode() {
        return this.A0B;
    }

    public Drawable getTrackDrawable() {
        return this.A0E;
    }

    public ColorStateList getTrackTintList() {
        return this.A0A;
    }

    public PorterDuff.Mode getTrackTintMode() {
        return this.A0C;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SwitchCompat(android.content.Context r14, android.util.AttributeSet r15, int r16) {
        /*
            r13 = this;
            r10 = r13
            r7 = r14
            r9 = r15
            r12 = r16
            r13.<init>(r14, r15, r12)
            r1 = 0
            r13.A09 = r1
            r13.A0B = r1
            r2 = 0
            r13.A0S = r2
            r13.A0T = r2
            r13.A0A = r1
            r13.A0C = r1
            r13.A0U = r2
            r13.A0V = r2
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r13.A0F = r0
            android.graphics.Rect r0 = X.AnonymousClass001.A06()
            r13.A0Y = r0
            X.C015606t.A04(r13)
            r3 = 1
            android.text.TextPaint r4 = new android.text.TextPaint
            r4.<init>(r3)
            r13.A0Z = r4
            android.content.res.Resources r0 = r13.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            r4.density = r0
            int[] r11 = X.AnonymousClass1MJ.A0L
            X.04j r6 = X.C010404j.A00(r14, r15, r11, r12, r2)
            android.content.res.TypedArray r8 = r6.A02
            X.C012005e.A0E(r7, r8, r9, r10, r11, r12)
            r0 = 2
            android.graphics.drawable.Drawable r0 = r6.A02(r0)
            r13.A0D = r0
            if (r0 == 0) goto L_0x0054
            r0.setCallback(r13)
        L_0x0054:
            r0 = 11
            android.graphics.drawable.Drawable r0 = r6.A02(r0)
            r13.A0E = r0
            if (r0 == 0) goto L_0x0061
            r0.setCallback(r13)
        L_0x0061:
            java.lang.CharSequence r0 = r8.getText(r2)
            r13.A0H = r0
            java.lang.CharSequence r0 = r8.getText(r3)
            r13.A0G = r0
            r0 = 3
            boolean r0 = r8.getBoolean(r0, r3)
            r13.A0W = r0
            r0 = 8
            int r0 = r8.getDimensionPixelSize(r0, r2)
            r13.A0N = r0
            r0 = 5
            int r0 = r8.getDimensionPixelSize(r0, r2)
            r13.A03 = r0
            r0 = 6
            int r0 = r8.getDimensionPixelSize(r0, r2)
            r13.A0L = r0
            r0 = 4
            boolean r0 = r8.getBoolean(r0, r2)
            r13.A0X = r0
            r0 = 9
            android.content.res.ColorStateList r0 = r6.A01(r0)
            if (r0 == 0) goto L_0x009d
            r13.A09 = r0
            r13.A0S = r3
        L_0x009d:
            r0 = 10
            r5 = -1
            int r0 = r8.getInt(r0, r5)
            android.graphics.PorterDuff$Mode r4 = X.C010504k.A00(r1, r0)
            android.graphics.PorterDuff$Mode r0 = r13.A0B
            if (r0 == r4) goto L_0x00b0
            r13.A0B = r4
            r13.A0T = r3
        L_0x00b0:
            boolean r0 = r13.A0S
            if (r0 != 0) goto L_0x00b8
            boolean r0 = r13.A0T
            if (r0 == 0) goto L_0x00bb
        L_0x00b8:
            r13.A01()
        L_0x00bb:
            r0 = 12
            android.content.res.ColorStateList r0 = r6.A01(r0)
            if (r0 == 0) goto L_0x00c7
            r13.A0A = r0
            r13.A0U = r3
        L_0x00c7:
            r0 = 13
            int r0 = r8.getInt(r0, r5)
            android.graphics.PorterDuff$Mode r1 = X.C010504k.A00(r1, r0)
            android.graphics.PorterDuff$Mode r0 = r13.A0C
            if (r0 == r1) goto L_0x00d9
            r13.A0C = r1
            r13.A0V = r3
        L_0x00d9:
            boolean r0 = r13.A0U
            if (r0 != 0) goto L_0x00e1
            boolean r0 = r13.A0V
            if (r0 == 0) goto L_0x00e4
        L_0x00e1:
            r13.A02()
        L_0x00e4:
            r0 = 7
            int r0 = r8.getResourceId(r0, r2)
            if (r0 == 0) goto L_0x00ee
            r13.A03(r14, r0)
        L_0x00ee:
            X.06w r0 = new X.06w
            r0.<init>(r13)
            r13.A0a = r0
            r0.A0A(r15, r12)
            r8.recycle()
            android.view.ViewConfiguration r1 = android.view.ViewConfiguration.get(r14)
            int r0 = r1.getScaledTouchSlop()
            r13.A07 = r0
            int r0 = r1.getScaledMinimumFlingVelocity()
            r13.A00 = r0
            r13.refreshDrawableState()
            boolean r0 = r13.isChecked()
            r13.setChecked(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SwitchCompat.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public SwitchCompat(Context context) {
        this(context, (AttributeSet) null);
    }
}
