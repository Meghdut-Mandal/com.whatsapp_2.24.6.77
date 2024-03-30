package X;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.material.floatingactionbutton.FloatingActionButton$Behavior;
import com.whatsapp.R;
import java.util.Objects;

/* renamed from: X.060  reason: invalid class name */
public abstract class AnonymousClass060 extends AnonymousClass05x implements C012405k, C013605y, C013705z {
    public int A00;
    public int A01;
    public ColorStateList A02;
    public PorterDuff.Mode A03;
    public boolean A04;
    public int A05;
    public int A06;
    public int A07;
    public ColorStateList A08;
    public ColorStateList A09;
    public PorterDuff.Mode A0A;
    public AnonymousClass063 A0B;
    public final Rect A0C = new Rect();
    public final AnonymousClass06V A0D;
    public final Rect A0E = new Rect();
    public final AnonymousClass06S A0F;

    public void setSize(int i) {
        this.A06 = 0;
        if (i != this.A01) {
            this.A01 = i;
            requestLayout();
        }
    }

    public static int A00(AnonymousClass060 r4, int i) {
        int i2 = r4.A06;
        if (i2 != 0) {
            return i2;
        }
        Resources resources = r4.getResources();
        if (i != -1) {
            int i3 = R.dimen.f7nameremoved;
            if (i != 1) {
                i3 = R.dimen.f7nameremoved;
            }
            return resources.getDimensionPixelSize(i3);
        } else if (Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470) {
            return A00(r4, 1);
        } else {
            return A00(r4, 0);
        }
    }

    private AnonymousClass063 getImpl() {
        AnonymousClass063 r0 = this.A0B;
        if (r0 != null) {
            return r0;
        }
        int[] iArr = AnonymousClass063.A0R;
        AnonymousClass069 r02 = new AnonymousClass069(this, new AnonymousClass068(this));
        this.A0B = r02;
        return r02;
    }

    public AnonymousClass0XL getBehavior() {
        return new FloatingActionButton$Behavior();
    }

    public int getExpandedComponentIdHint() {
        return this.A0D.A00;
    }

    @Deprecated
    public int getRippleColor() {
        ColorStateList colorStateList = this.A09;
        if (colorStateList != null) {
            return colorStateList.getDefaultColor();
        }
        return 0;
    }

    public int getSizeDimension() {
        return A00(this, this.A01);
    }

    public void onMeasure(int i, int i2) {
        int A002 = A00(this, this.A01);
        this.A00 = (A002 - this.A07) / 2;
        getImpl().A04();
        int min = Math.min(View.resolveSize(A002, i), View.resolveSize(A002, i2));
        Rect rect = this.A0C;
        setMeasuredDimension(rect.left + min + rect.right, min + rect.top + rect.bottom);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C95204kE)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C95204kE r4 = (C95204kE) parcelable;
        super.onRestoreInstanceState(r4.A00);
        AnonymousClass06V r2 = this.A0D;
        Object obj = r4.A00.get("expandableWidgetHelper");
        Objects.requireNonNull(obj);
        r2.A01((Bundle) obj);
    }

    public void setBackgroundColor(int i) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    public void setBackgroundDrawable(Drawable drawable) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    public void setBackgroundResource(int i) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
        if (this.A02 != colorStateList) {
            this.A02 = colorStateList;
            AnonymousClass063 impl = getImpl();
            C012505l r0 = impl.A0D;
            if (r0 != null) {
                r0.setTintList(colorStateList);
            }
            C014706j r2 = impl.A0C;
            if (r2 != null) {
                if (colorStateList != null) {
                    r2.A03 = colorStateList.getColorForState(r2.getState(), r2.A03);
                }
                r2.A06 = colorStateList;
                r2.A08 = true;
                r2.invalidateSelf();
            }
        }
    }

    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.A03 != mode) {
            this.A03 = mode;
            C012505l r0 = getImpl().A0D;
            if (r0 != null) {
                r0.setTintMode(mode);
            }
        }
    }

    public void setCustomSize(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Custom size must be non-negative");
        } else if (i != this.A06) {
            this.A06 = i;
            requestLayout();
        }
    }

    public void setExpandedComponentIdHint(int i) {
        this.A0D.A00 = i;
    }

    public void setImageResource(int i) {
        this.A0F.A02(i);
        A01();
    }

    public void setMaxImageSize(int i) {
        this.A07 = i;
        AnonymousClass063 impl = getImpl();
        if (impl.A05 != i) {
            impl.A05 = i;
            float f = impl.A02;
            impl.A02 = f;
            Matrix matrix = impl.A0H;
            AnonymousClass063.A03(matrix, impl, f);
            impl.A0I.setImageMatrix(matrix);
        }
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (this.A09 != colorStateList) {
            this.A09 = colorStateList;
            getImpl().A06(this.A09);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        if (this.A08 != colorStateList) {
            this.A08 = colorStateList;
            A01();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        if (this.A0A != mode) {
            this.A0A = mode;
            A01();
        }
    }

    public void setUseCompatPadding(boolean z) {
        if (this.A04 != z) {
            this.A04 = z;
            getImpl().A04();
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass060(android.content.Context r20, android.util.AttributeSet r21, int r22) {
        /*
            r19 = this;
            r1 = 2132084397(0x7f1506ad, float:1.9808963E38)
            r0 = r20
            r12 = r21
            r3 = r22
            android.content.Context r0 = X.C27891Qg.A00(r0, r12, r3, r1)
            r2 = r19
            r2.<init>(r0, r12, r3)
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r2.A0C = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r2.A0E = r0
            android.content.Context r11 = r2.getContext()
            int[] r13 = X.C27931Qk.A0C
            r9 = 0
            int[] r0 = new int[r9]
            r16 = 2132084397(0x7f1506ad, float:1.9808963E38)
            r14 = r0
            r15 = r3
            android.content.res.TypedArray r10 = X.C013205s.A00(r11, r12, r13, r14, r15, r16)
            r0 = 2
            android.content.res.ColorStateList r0 = X.AnonymousClass061.A00(r11, r10, r0)
            r2.A02 = r0
            r0 = 3
            r5 = -1
            int r4 = r10.getInt(r0, r5)
            r0 = 0
            android.graphics.PorterDuff$Mode r0 = X.AnonymousClass062.A01(r0, r4)
            r2.A03 = r0
            r0 = 13
            android.content.res.ColorStateList r0 = X.AnonymousClass061.A00(r11, r10, r0)
            r2.A09 = r0
            r0 = 8
            int r0 = r10.getInt(r0, r5)
            r2.A01 = r0
            r0 = 7
            int r0 = r10.getDimensionPixelSize(r0, r9)
            r2.A06 = r0
            r0 = 4
            int r0 = r10.getDimensionPixelSize(r0, r9)
            r2.A05 = r0
            r0 = 5
            r4 = 0
            float r8 = r10.getDimension(r0, r4)
            r0 = 10
            float r7 = r10.getDimension(r0, r4)
            r0 = 12
            float r6 = r10.getDimension(r0, r4)
            r0 = 17
            boolean r0 = r10.getBoolean(r0, r9)
            r2.A04 = r0
            android.content.res.Resources r4 = r2.getResources()
            r0 = 2131167535(0x7f07092f, float:1.7949346E38)
            int r17 = r4.getDimensionPixelSize(r0)
            r0 = 11
            int r0 = r10.getDimensionPixelSize(r0, r9)
            r2.setMaxImageSize(r0)
            r0 = 16
            X.06H r16 = X.AnonymousClass06H.A01(r11, r10, r0)
            r0 = 9
            X.06H r5 = X.AnonymousClass06H.A01(r11, r10, r0)
            X.06K r0 = X.AnonymousClass06J.A0C
            X.06M r0 = X.AnonymousClass06J.A02(r11, r12, r0, r3, r1)
            X.06J r1 = new X.06J
            r1.<init>(r0)
            r0 = 6
            boolean r4 = r10.getBoolean(r0, r9)
            r0 = 1
            boolean r0 = r10.getBoolean(r9, r0)
            r2.setEnabled(r0)
            r10.recycle()
            X.06S r0 = new X.06S
            r0.<init>(r2)
            r2.A0F = r0
            r0.A03(r12, r3)
            X.06V r0 = new X.06V
            r0.<init>(r2)
            r2.A0D = r0
            X.063 r0 = r2.getImpl()
            r0.A08(r1)
            X.063 r9 = r2.getImpl()
            android.content.res.ColorStateList r3 = r2.A02
            android.graphics.PorterDuff$Mode r10 = r2.A03
            android.content.res.ColorStateList r0 = r2.A09
            r18 = r0
            int r14 = r2.A05
            X.06J r1 = r9.A0E
            java.util.Objects.requireNonNull(r1)
            X.06W r0 = new X.06W
            r0.<init>(r1)
            r9.A0D = r0
            r0.setTintList(r3)
            if (r10 == 0) goto L_0x00f5
            X.05l r0 = r9.A0D
            r0.setTintMode(r10)
        L_0x00f5:
            X.05l r10 = r9.A0D
            X.060 r1 = r9.A0I
            android.content.Context r0 = r1.getContext()
            r10.A0B(r0)
            r10 = 0
            if (r14 <= 0) goto L_0x01e2
            android.content.Context r15 = r1.getContext()
            X.06J r0 = r9.A0E
            java.util.Objects.requireNonNull(r0)
            X.06j r11 = new X.06j
            r11.<init>(r0)
            r0 = 2131100300(0x7f06028c, float:1.7812978E38)
            int r13 = X.AnonymousClass00F.A00(r15, r0)
            r0 = 2131100299(0x7f06028b, float:1.7812976E38)
            int r12 = X.AnonymousClass00F.A00(r15, r0)
            r0 = 2131100297(0x7f060289, float:1.7812971E38)
            int r1 = X.AnonymousClass00F.A00(r15, r0)
            r0 = 2131100298(0x7f06028a, float:1.7812974E38)
            int r0 = X.AnonymousClass00F.A00(r15, r0)
            r11.A05 = r13
            r11.A04 = r12
            r11.A02 = r1
            r11.A01 = r0
            float r12 = (float) r14
            float r0 = r11.A00
            int r0 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r0 == 0) goto L_0x014d
            r11.A00 = r12
            android.graphics.Paint r1 = r11.A09
            r0 = 1068149139(0x3faaa993, float:1.3333)
            float r12 = r12 * r0
            r1.setStrokeWidth(r12)
            r0 = 1
            r11.A08 = r0
            r11.invalidateSelf()
        L_0x014d:
            if (r3 == 0) goto L_0x015b
            int[] r1 = r11.getState()
            int r0 = r11.A03
            int r0 = r3.getColorForState(r1, r0)
            r11.A03 = r0
        L_0x015b:
            r11.A06 = r3
            r3 = 1
            r11.A08 = r3
            r11.invalidateSelf()
            r9.A0C = r11
            r0 = 2
            android.graphics.drawable.Drawable[] r1 = new android.graphics.drawable.Drawable[r0]
            r0 = 0
            java.util.Objects.requireNonNull(r11)
            r1[r0] = r11
            X.05l r0 = r9.A0D
            java.util.Objects.requireNonNull(r0)
            r1[r3] = r0
            android.graphics.drawable.LayerDrawable r3 = new android.graphics.drawable.LayerDrawable
            r3.<init>(r1)
        L_0x017a:
            android.content.res.ColorStateList r1 = X.C014906l.A02(r18)
            android.graphics.drawable.RippleDrawable r0 = new android.graphics.drawable.RippleDrawable
            r0.<init>(r1, r3, r10)
            r9.A09 = r0
            r9.A08 = r0
            X.063 r1 = r2.getImpl()
            r0 = r17
            r1.A06 = r0
            X.063 r3 = r2.getImpl()
            float r0 = r3.A00
            int r0 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r0 == 0) goto L_0x01a2
            r3.A00 = r8
            float r1 = r3.A01
            float r0 = r3.A03
            r3.A05(r8, r1, r0)
        L_0x01a2:
            X.063 r3 = r2.getImpl()
            float r0 = r3.A01
            int r0 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r0 == 0) goto L_0x01b5
            r3.A01 = r7
            float r1 = r3.A00
            float r0 = r3.A03
            r3.A05(r1, r7, r0)
        L_0x01b5:
            X.063 r3 = r2.getImpl()
            float r0 = r3.A03
            int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x01c8
            r3.A03 = r6
            float r1 = r3.A00
            float r0 = r3.A01
            r3.A05(r1, r0, r6)
        L_0x01c8:
            X.063 r1 = r2.getImpl()
            r0 = r16
            r1.A0B = r0
            X.063 r0 = r2.getImpl()
            r0.A0A = r5
            X.063 r0 = r2.getImpl()
            r0.A0F = r4
            android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.MATRIX
            r2.setScaleType(r0)
            return
        L_0x01e2:
            r9.A0C = r10
            X.05l r3 = r9.A0D
            goto L_0x017a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass060.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    private void A01() {
        Drawable drawable = getDrawable();
        if (drawable != null) {
            ColorStateList colorStateList = this.A08;
            if (colorStateList == null) {
                AnonymousClass08I.A04(drawable);
                return;
            }
            int colorForState = colorStateList.getColorForState(getDrawableState(), 0);
            PorterDuff.Mode mode = this.A0A;
            if (mode == null) {
                mode = PorterDuff.Mode.SRC_IN;
            }
            drawable.mutate().setColorFilter(AnonymousClass02W.A00(mode, colorForState));
        }
    }

    public void A04(boolean z) {
        AnimatorSet A012;
        AnonymousClass063 impl = getImpl();
        AnonymousClass060 r3 = impl.A0I;
        int visibility = r3.getVisibility();
        int i = impl.A04;
        if (visibility == 0) {
            if (i == 1) {
                return;
            }
        } else if (i != 2) {
            return;
        }
        Animator animator = impl.A07;
        if (animator != null) {
            animator.cancel();
        }
        if (!C011304x.A03(r3) || r3.isInEditMode()) {
            int i2 = 4;
            if (z) {
                i2 = 8;
            }
            r3.A03(i2, z);
            return;
        }
        AnonymousClass06H r1 = impl.A0A;
        if (r1 != null) {
            A012 = AnonymousClass063.A00(r1, impl, 0.0f, 0.0f, 0.0f);
        } else {
            A012 = AnonymousClass063.A01(impl, 0.0f, 0.4f, 0.4f, R.attr.f4nameremoved, R.attr.f4nameremoved);
        }
        A012.addListener(new AnonymousClass0DM(impl, z));
        A012.start();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002f, code lost:
        if (r4.isInEditMode() != false) goto L_0x0031;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A05(boolean r12) {
        /*
            r11 = this;
            X.063 r5 = r11.getImpl()
            X.060 r4 = r5.A0I
            int r2 = r4.getVisibility()
            r0 = 1
            int r1 = r5.A04
            if (r2 == 0) goto L_0x0013
            r0 = 2
            if (r1 != r0) goto L_0x0016
            return
        L_0x0013:
            if (r1 == r0) goto L_0x0016
            return
        L_0x0016:
            android.animation.Animator r0 = r5.A07
            if (r0 == 0) goto L_0x001d
            r0.cancel()
        L_0x001d:
            X.06H r0 = r5.A0B
            r3 = 0
            r2 = 0
            if (r0 != 0) goto L_0x0024
            r2 = 1
        L_0x0024:
            boolean r0 = X.C011304x.A03(r4)
            if (r0 == 0) goto L_0x0031
            boolean r1 = r4.isInEditMode()
            r0 = 1
            if (r1 == 0) goto L_0x0032
        L_0x0031:
            r0 = 0
        L_0x0032:
            r6 = 1065353216(0x3f800000, float:1.0)
            if (r0 == 0) goto L_0x0084
            int r0 = r4.getVisibility()
            if (r0 == 0) goto L_0x0061
            r1 = 0
            r4.setAlpha(r1)
            r0 = 0
            if (r2 == 0) goto L_0x0046
            r0 = 1053609165(0x3ecccccd, float:0.4)
        L_0x0046:
            r4.setScaleY(r0)
            r0 = 0
            if (r2 == 0) goto L_0x004f
            r0 = 1053609165(0x3ecccccd, float:0.4)
        L_0x004f:
            r4.setScaleX(r0)
            if (r2 == 0) goto L_0x0057
            r1 = 1053609165(0x3ecccccd, float:0.4)
        L_0x0057:
            r5.A02 = r1
            android.graphics.Matrix r0 = r5.A0H
            X.AnonymousClass063.A03(r0, r5, r1)
            r4.setImageMatrix(r0)
        L_0x0061:
            X.06H r0 = r5.A0B
            if (r0 == 0) goto L_0x0075
            android.animation.AnimatorSet r1 = X.AnonymousClass063.A00(r0, r5, r6, r6, r6)
        L_0x0069:
            X.0DK r0 = new X.0DK
            r0.<init>(r5, r12)
            r1.addListener(r0)
            r1.start()
            return
        L_0x0075:
            r9 = 2130970169(0x7f040639, float:1.754904E38)
            r10 = 2130970185(0x7f040649, float:1.7549073E38)
            r7 = 1065353216(0x3f800000, float:1.0)
            r8 = 1065353216(0x3f800000, float:1.0)
            android.animation.AnimatorSet r1 = X.AnonymousClass063.A01(r5, r6, r7, r8, r9, r10)
            goto L_0x0069
        L_0x0084:
            r4.A03(r3, r12)
            r4.setAlpha(r6)
            r4.setScaleY(r6)
            r4.setScaleX(r6)
            r5.A02 = r6
            android.graphics.Matrix r0 = r5.A0H
            X.AnonymousClass063.A03(r0, r5, r6)
            r4.setImageMatrix(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass060.A05(boolean):void");
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        getImpl().A09(getDrawableState());
    }

    public float getCompatElevation() {
        return getImpl().A0I.getElevation();
    }

    public float getCompatHoveredFocusedTranslationZ() {
        return getImpl().A01;
    }

    public float getCompatPressedTranslationZ() {
        return getImpl().A03;
    }

    public Drawable getContentBackground() {
        return getImpl().A08;
    }

    public AnonymousClass06H getHideMotionSpec() {
        return getImpl().A0A;
    }

    public AnonymousClass06J getShapeAppearanceModel() {
        AnonymousClass06J r0 = getImpl().A0E;
        Objects.requireNonNull(r0);
        return r0;
    }

    public AnonymousClass06H getShowMotionSpec() {
        return getImpl().A0B;
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        getImpl();
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        AnonymousClass063 impl = getImpl();
        C012505l r1 = impl.A0D;
        if (r1 != null) {
            AnonymousClass06R.A03(impl.A0I, r1);
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getImpl().A0I.getViewTreeObserver();
    }

    public Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        if (onSaveInstanceState == null) {
            onSaveInstanceState = new Bundle();
        }
        C95204kE r3 = new C95204kE(onSaveInstanceState);
        r3.A00.put("expandableWidgetHelper", this.A0D.A00());
        return r3;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            Rect rect = this.A0E;
            if (C011304x.A03(this)) {
                rect.set(0, 0, getWidth(), getHeight());
                int i = rect.left;
                Rect rect2 = this.A0C;
                rect.left = i + rect2.left;
                rect.top += rect2.top;
                rect.right -= rect2.right;
                rect.bottom -= rect2.bottom;
                if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                    return false;
                }
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCompatElevation(float f) {
        AnonymousClass063 impl = getImpl();
        if (impl.A00 != f) {
            impl.A00 = f;
            impl.A05(f, impl.A01, impl.A03);
        }
    }

    public void setCompatElevationResource(int i) {
        setCompatElevation(getResources().getDimension(i));
    }

    public void setCompatHoveredFocusedTranslationZ(float f) {
        AnonymousClass063 impl = getImpl();
        if (impl.A01 != f) {
            impl.A01 = f;
            impl.A05(impl.A00, f, impl.A03);
        }
    }

    public void setCompatHoveredFocusedTranslationZResource(int i) {
        setCompatHoveredFocusedTranslationZ(getResources().getDimension(i));
    }

    public void setCompatPressedTranslationZ(float f) {
        AnonymousClass063 impl = getImpl();
        if (impl.A03 != f) {
            impl.A03 = f;
            impl.A05(impl.A00, impl.A01, f);
        }
    }

    public void setCompatPressedTranslationZResource(int i) {
        setCompatPressedTranslationZ(getResources().getDimension(i));
    }

    public void setElevation(float f) {
        super.setElevation(f);
        C012505l r0 = getImpl().A0D;
        if (r0 != null) {
            r0.A09(f);
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
        if (z != getImpl().A0F) {
            getImpl().A0F = z;
            requestLayout();
        }
    }

    public void setHideMotionSpec(AnonymousClass06H r2) {
        getImpl().A0A = r2;
    }

    public void setHideMotionSpecResource(int i) {
        setHideMotionSpec(AnonymousClass06H.A00(getContext(), i));
    }

    public void setImageDrawable(Drawable drawable) {
        if (getDrawable() != drawable) {
            super.setImageDrawable(drawable);
            AnonymousClass063 impl = getImpl();
            float f = impl.A02;
            impl.A02 = f;
            Matrix matrix = impl.A0H;
            AnonymousClass063.A03(matrix, impl, f);
            impl.A0I.setImageMatrix(matrix);
            if (this.A08 != null) {
                A01();
            }
        }
    }

    public void setScaleX(float f) {
        super.setScaleX(f);
        getImpl();
    }

    public void setScaleY(float f) {
        super.setScaleY(f);
        getImpl();
    }

    public void setShadowPaddingEnabled(boolean z) {
        AnonymousClass063 impl = getImpl();
        impl.A0G = z;
        impl.A04();
    }

    public void setShapeAppearanceModel(AnonymousClass06J r2) {
        getImpl().A08(r2);
    }

    public void setShowMotionSpec(AnonymousClass06H r2) {
        getImpl().A0B = r2;
    }

    public void setShowMotionSpecResource(int i) {
        setShowMotionSpec(AnonymousClass06H.A00(getContext(), i));
    }

    public void setTranslationX(float f) {
        super.setTranslationX(f);
        getImpl();
    }

    public void setTranslationY(float f) {
        super.setTranslationY(f);
        getImpl();
    }

    public void setTranslationZ(float f) {
        super.setTranslationZ(f);
        getImpl();
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        setBackgroundTintList(colorStateList);
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        setBackgroundTintMode(mode);
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
    }

    public ColorStateList getBackgroundTintList() {
        return this.A02;
    }

    public PorterDuff.Mode getBackgroundTintMode() {
        return this.A03;
    }

    public int getCustomSize() {
        return this.A06;
    }

    public ColorStateList getRippleColorStateList() {
        return this.A09;
    }

    public int getSize() {
        return this.A01;
    }

    public ColorStateList getSupportBackgroundTintList() {
        return this.A02;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return this.A03;
    }

    public ColorStateList getSupportImageTintList() {
        return this.A08;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        return this.A0A;
    }

    public boolean getUseCompatPadding() {
        return this.A04;
    }

    public void setRippleColor(int i) {
        setRippleColor(ColorStateList.valueOf(i));
    }
}
