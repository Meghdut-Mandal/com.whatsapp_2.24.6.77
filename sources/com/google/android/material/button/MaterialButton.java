package com.google.android.material.button;

import X.AnonymousClass02X;
import X.AnonymousClass04F;
import X.AnonymousClass061;
import X.AnonymousClass062;
import X.AnonymousClass06J;
import X.AnonymousClass06R;
import X.AnonymousClass075;
import X.AnonymousClass076;
import X.AnonymousClass079;
import X.AnonymousClass08I;
import X.AnonymousClass0HL;
import X.C012405k;
import X.C013105r;
import X.C013205s;
import X.C014906l;
import X.C015506r;
import X.C10700ey;
import X.C16050oT;
import X.C27891Qg;
import X.C27931Qk;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import com.whatsapp.R;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class MaterialButton extends C015506r implements Checkable, C012405k {
    public static final int[] A0D = {16842911};
    public static final int[] A0E = {16842912};
    public int A00;
    public Drawable A01;
    public C16050oT A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public ColorStateList A07;
    public PorterDuff.Mode A08;
    public boolean A09;
    public boolean A0A;
    public final AnonymousClass075 A0B;
    public final LinkedHashSet A0C;

    private void A00(int i, int i2) {
        if (this.A01 != null && getLayout() != null) {
            int i3 = this.A00;
            boolean z = true;
            if (!(i3 == 1 || i3 == 2)) {
                z = false;
            }
            if (z || i3 == 3 || i3 == 4) {
                this.A06 = 0;
                Layout.Alignment actualTextAlignment = getActualTextAlignment();
                int i4 = this.A00;
                boolean z2 = true;
                if (i4 == 1 || i4 == 3 || ((i4 == 2 && actualTextAlignment == Layout.Alignment.ALIGN_NORMAL) || (i4 == 4 && actualTextAlignment == Layout.Alignment.ALIGN_OPPOSITE))) {
                    this.A03 = 0;
                } else {
                    int i5 = this.A05;
                    if (i5 == 0) {
                        i5 = this.A01.getIntrinsicWidth();
                    }
                    int textLayoutWidth = ((((i - getTextLayoutWidth()) - AnonymousClass04F.A02(this)) - i5) - this.A04) - AnonymousClass04F.A03(this);
                    if (actualTextAlignment == Layout.Alignment.ALIGN_CENTER) {
                        textLayoutWidth /= 2;
                    }
                    boolean z3 = true;
                    if (AnonymousClass04F.A01(this) != 1) {
                        z3 = false;
                    }
                    if (this.A00 != 4) {
                        z2 = false;
                    }
                    if (z3 != z2) {
                        textLayoutWidth = -textLayoutWidth;
                    }
                    if (this.A03 != textLayoutWidth) {
                        this.A03 = textLayoutWidth;
                    } else {
                        return;
                    }
                }
            } else if (i3 == 16 || i3 == 32) {
                this.A03 = 0;
                if (i3 == 16) {
                    this.A06 = 0;
                } else {
                    int i6 = this.A05;
                    if (i6 == 0) {
                        i6 = this.A01.getIntrinsicHeight();
                    }
                    int max = Math.max(0, (((((i2 - getTextHeight()) - getPaddingTop()) - i6) - this.A04) - getPaddingBottom()) / 2);
                    if (this.A06 != max) {
                        this.A06 = max;
                    } else {
                        return;
                    }
                }
            } else {
                return;
            }
            A01(false);
        }
    }

    private void A01(boolean z) {
        Drawable drawable = this.A01;
        if (drawable != null) {
            Drawable mutate = AnonymousClass08I.A01(drawable).mutate();
            this.A01 = mutate;
            AnonymousClass076.A01(this.A07, mutate);
            PorterDuff.Mode mode = this.A08;
            if (mode != null) {
                AnonymousClass076.A04(mode, this.A01);
            }
            int i = this.A05;
            if (i == 0) {
                i = this.A01.getIntrinsicWidth();
            }
            int i2 = this.A05;
            if (i2 == 0) {
                i2 = this.A01.getIntrinsicHeight();
            }
            Drawable drawable2 = this.A01;
            int i3 = this.A03;
            int i4 = this.A06;
            drawable2.setBounds(i3, i4, i + i3, i2 + i4);
            this.A01.setVisible(true, z);
        }
        if (!z) {
            Drawable[] A012 = AnonymousClass079.A01(this);
            Drawable drawable3 = A012[0];
            Drawable drawable4 = A012[1];
            Drawable drawable5 = A012[2];
            int i5 = this.A00;
            if (i5 == 1 || i5 == 2) {
                if (drawable3 == this.A01) {
                    return;
                }
            } else if (i5 == 3 || i5 == 4) {
                if (drawable5 == this.A01) {
                    return;
                }
            } else if (!(i5 == 16 || i5 == 32) || drawable4 == this.A01) {
                return;
            }
        }
        int i6 = this.A00;
        boolean z2 = true;
        if (!(i6 == 1 || i6 == 2)) {
            z2 = false;
        }
        if (z2) {
            AnonymousClass079.A00(this.A01, (Drawable) null, (Drawable) null, (Drawable) null, this);
        } else if (i6 == 3 || i6 == 4) {
            AnonymousClass079.A00((Drawable) null, (Drawable) null, this.A01, (Drawable) null, this);
        } else if (i6 == 16 || i6 == 32) {
            AnonymousClass079.A00((Drawable) null, this.A01, (Drawable) null, (Drawable) null, this);
        }
    }

    private boolean A02() {
        AnonymousClass075 r0 = this.A0B;
        if (r0 == null || r0.A0E) {
            return false;
        }
        return true;
    }

    private String getA11yClassName() {
        Class cls;
        AnonymousClass075 r0 = this.A0B;
        if (r0 == null || !r0.A0F) {
            cls = Button.class;
        } else {
            cls = CompoundButton.class;
        }
        return cls.getName();
    }

    public int getInsetBottom() {
        return this.A0B.A02;
    }

    public int getInsetTop() {
        return this.A0B.A05;
    }

    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        AnonymousClass075 r0 = this.A0B;
        if (r0 != null && r0.A0F) {
            View.mergeDrawableStates(onCreateDrawableState, A0D);
        }
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, A0E);
        }
        return onCreateDrawableState;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof AnonymousClass0HL)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        AnonymousClass0HL r2 = (AnonymousClass0HL) parcelable;
        super.onRestoreInstanceState(r2.A00);
        setChecked(r2.A00);
    }

    public boolean performClick() {
        if (this.A0B.A0I) {
            toggle();
        }
        return super.performClick();
    }

    public void setBackgroundResource(int i) {
        Drawable drawable;
        if (i != 0) {
            drawable = AnonymousClass02X.A03().A08(getContext(), i);
        } else {
            drawable = null;
        }
        setBackgroundDrawable(drawable);
    }

    public void setChecked(boolean z) {
        AnonymousClass075 r0 = this.A0B;
        if (r0 != null && r0.A0F && isEnabled() && this.A0A != z) {
            this.A0A = z;
            refreshDrawableState();
            if (getParent() instanceof MaterialButtonToggleGroup) {
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) getParent();
                boolean z2 = this.A0A;
                if (!materialButtonToggleGroup.A01) {
                    MaterialButtonToggleGroup.A01(materialButtonToggleGroup, getId(), z2);
                }
            }
            if (!this.A09) {
                this.A09 = true;
                Iterator it = this.A0C.iterator();
                if (it.hasNext()) {
                    it.next();
                    throw new NullPointerException("onCheckedChanged");
                } else {
                    this.A09 = false;
                }
            }
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.A01 != drawable) {
            this.A01 = drawable;
            A01(true);
            A00(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i) {
        if (this.A00 != i) {
            this.A00 = i;
            A00(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i) {
        if (this.A04 != i) {
            this.A04 = i;
            setCompoundDrawablePadding(i);
        }
    }

    public void setIconResource(int i) {
        Drawable drawable;
        if (i != 0) {
            drawable = AnonymousClass02X.A03().A08(getContext(), i);
        } else {
            drawable = null;
        }
        setIcon(drawable);
    }

    public void setIconSize(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        } else if (this.A05 != i) {
            this.A05 = i;
            A01(true);
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.A07 != colorStateList) {
            this.A07 = colorStateList;
            A01(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.A08 != mode) {
            this.A08 = mode;
            A01(false);
        }
    }

    public void setInsetBottom(int i) {
        AnonymousClass075 r1 = this.A0B;
        AnonymousClass075.A03(r1, r1.A05, i);
    }

    public void setInsetTop(int i) {
        AnonymousClass075 r1 = this.A0B;
        AnonymousClass075.A03(r1, i, r1.A02);
    }

    public void setPressed(boolean z) {
        C16050oT r0 = this.A02;
        if (r0 != null) {
            ((C10700ey) r0).A00.invalidate();
        }
        super.setPressed(z);
    }

    public void setToggleCheckedStateOnClick(boolean z) {
        this.A0B.A0I = z;
    }

    public void toggle() {
        setChecked(!this.A0A);
    }

    public MaterialButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.f4nameremoved);
    }

    private Layout.Alignment getActualTextAlignment() {
        int textAlignment = getTextAlignment();
        if (textAlignment == 1) {
            return getGravityTextAlignment();
        }
        if (textAlignment == 6 || textAlignment == 3) {
            return Layout.Alignment.ALIGN_OPPOSITE;
        }
        if (textAlignment != 4) {
            return Layout.Alignment.ALIGN_NORMAL;
        }
        return Layout.Alignment.ALIGN_CENTER;
    }

    private Layout.Alignment getGravityTextAlignment() {
        int gravity = getGravity() & 8388615;
        if (gravity == 1) {
            return Layout.Alignment.ALIGN_CENTER;
        }
        if (gravity == 5 || gravity == 8388613) {
            return Layout.Alignment.ALIGN_OPPOSITE;
        }
        return Layout.Alignment.ALIGN_NORMAL;
    }

    private int getTextHeight() {
        if (getLineCount() > 1) {
            return getLayout().getHeight();
        }
        TextPaint paint = getPaint();
        String charSequence = getText().toString();
        if (getTransformationMethod() != null) {
            charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(charSequence, 0, charSequence.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextLayoutWidth() {
        int lineCount = getLineCount();
        float f = 0.0f;
        for (int i = 0; i < lineCount; i++) {
            f = Math.max(f, getLayout().getLineWidth(i));
        }
        return (int) Math.ceil((double) f);
    }

    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (A02()) {
            return this.A0B.A00;
        }
        return 0;
    }

    public ColorStateList getRippleColor() {
        if (A02()) {
            return this.A0B.A08;
        }
        return null;
    }

    public AnonymousClass06J getShapeAppearanceModel() {
        if (A02()) {
            return this.A0B.A0D;
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (A02()) {
            return this.A0B.A09;
        }
        return null;
    }

    public int getStrokeWidth() {
        if (A02()) {
            return this.A0B.A06;
        }
        return 0;
    }

    public ColorStateList getSupportBackgroundTintList() {
        if (A02()) {
            return this.A0B.A07;
        }
        return super.getSupportBackgroundTintList();
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        if (A02()) {
            return this.A0B.A0A;
        }
        return super.getSupportBackgroundTintMode();
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (A02()) {
            AnonymousClass06R.A03(this, AnonymousClass075.A00(this.A0B, false));
        }
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(isChecked());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0011, code lost:
        if (r1 == false) goto L_0x0013;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo r3) {
        /*
            r2 = this;
            super.onInitializeAccessibilityNodeInfo(r3)
            java.lang.String r0 = r2.getA11yClassName()
            r3.setClassName(r0)
            X.075 r0 = r2.A0B
            if (r0 == 0) goto L_0x0013
            boolean r1 = r0.A0F
            r0 = 1
            if (r1 != 0) goto L_0x0014
        L_0x0013:
            r0 = 0
        L_0x0014:
            r3.setCheckable(r0)
            boolean r0 = r2.isChecked()
            r3.setChecked(r0)
            boolean r0 = r2.isClickable()
            r3.setClickable(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.button.MaterialButton.onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo):void");
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        AnonymousClass075 r4;
        super.onLayout(z, i, i2, i3, i4);
        if (Build.VERSION.SDK_INT == 21 && (r4 = this.A0B) != null) {
            int i5 = i4 - i2;
            int i6 = i3 - i;
            Drawable drawable = r4.A0B;
            if (drawable != null) {
                drawable.setBounds(r4.A03, r4.A05, i6 - r4.A04, i5 - r4.A02);
            }
        }
        A00(getMeasuredWidth(), getMeasuredHeight());
    }

    public Parcelable onSaveInstanceState() {
        AnonymousClass0HL r1 = new AnonymousClass0HL(super.onSaveInstanceState());
        r1.A00 = this.A0A;
        return r1;
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        A00(getMeasuredWidth(), getMeasuredHeight());
    }

    public void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.A01 != null) {
            if (this.A01.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    public void setBackgroundColor(int i) {
        if (A02()) {
            AnonymousClass075 r1 = this.A0B;
            if (AnonymousClass075.A00(r1, false) != null) {
                AnonymousClass075.A00(r1, false).setTint(i);
                return;
            }
            return;
        }
        super.setBackgroundColor(i);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        if (A02()) {
            if (drawable != getBackground()) {
                Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
                AnonymousClass075 r2 = this.A0B;
                r2.A0E = true;
                MaterialButton materialButton = r2.A0J;
                materialButton.setSupportBackgroundTintList(r2.A07);
                materialButton.setSupportBackgroundTintMode(r2.A0A);
            } else {
                getBackground().setState(drawable.getState());
                return;
            }
        }
        super.setBackgroundDrawable(drawable);
    }

    public void setCheckable(boolean z) {
        if (A02()) {
            this.A0B.A0F = z;
        }
    }

    public void setCornerRadius(int i) {
        if (A02()) {
            AnonymousClass075 r2 = this.A0B;
            if (!r2.A0G || r2.A00 != i) {
                r2.A00 = i;
                r2.A0G = true;
                r2.A05(r2.A0D.A04((float) i));
            }
        }
    }

    public void setCornerRadiusResource(int i) {
        if (A02()) {
            setCornerRadius(getResources().getDimensionPixelSize(i));
        }
    }

    public void setElevation(float f) {
        super.setElevation(f);
        if (A02()) {
            AnonymousClass075.A00(this.A0B, false).A09(f);
        }
    }

    public void setIconTintResource(int i) {
        setIconTint(C013105r.A00(getContext(), i));
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (A02()) {
            AnonymousClass075 r1 = this.A0B;
            if (r1.A08 != colorStateList) {
                r1.A08 = colorStateList;
                MaterialButton materialButton = r1.A0J;
                if (materialButton.getBackground() instanceof RippleDrawable) {
                    ((RippleDrawable) materialButton.getBackground()).setColor(C014906l.A02(colorStateList));
                }
            }
        }
    }

    public void setRippleColorResource(int i) {
        if (A02()) {
            setRippleColor(C013105r.A00(getContext(), i));
        }
    }

    public void setShapeAppearanceModel(AnonymousClass06J r3) {
        if (A02()) {
            this.A0B.A05(r3);
            return;
        }
        throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
    }

    public void setShouldDrawSurfaceColorStroke(boolean z) {
        if (A02()) {
            AnonymousClass075 r0 = this.A0B;
            r0.A0H = z;
            AnonymousClass075.A02(r0);
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (A02()) {
            AnonymousClass075 r1 = this.A0B;
            if (r1.A09 != colorStateList) {
                r1.A09 = colorStateList;
                AnonymousClass075.A02(r1);
            }
        }
    }

    public void setStrokeColorResource(int i) {
        if (A02()) {
            setStrokeColor(C013105r.A00(getContext(), i));
        }
    }

    public void setStrokeWidth(int i) {
        if (A02()) {
            AnonymousClass075 r1 = this.A0B;
            if (r1.A06 != i) {
                r1.A06 = i;
                AnonymousClass075.A02(r1);
            }
        }
    }

    public void setStrokeWidthResource(int i) {
        if (A02()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i));
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (A02()) {
            AnonymousClass075 r2 = this.A0B;
            if (r2.A07 != colorStateList) {
                r2.A07 = colorStateList;
                if (AnonymousClass075.A00(r2, false) != null) {
                    AnonymousClass076.A01(r2.A07, AnonymousClass075.A00(r2, false));
                    return;
                }
                return;
            }
            return;
        }
        super.setSupportBackgroundTintList(colorStateList);
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (A02()) {
            AnonymousClass075 r2 = this.A0B;
            if (r2.A0A != mode) {
                r2.A0A = mode;
                if (AnonymousClass075.A00(r2, false) != null && r2.A0A != null) {
                    AnonymousClass076.A04(r2.A0A, AnonymousClass075.A00(r2, false));
                    return;
                }
                return;
            }
            return;
        }
        super.setSupportBackgroundTintMode(mode);
    }

    public void setTextAlignment(int i) {
        super.setTextAlignment(i);
        A00(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(C16050oT r1) {
        this.A02 = r1;
    }

    public Drawable getIcon() {
        return this.A01;
    }

    public int getIconGravity() {
        return this.A00;
    }

    public int getIconPadding() {
        return this.A04;
    }

    public int getIconSize() {
        return this.A05;
    }

    public ColorStateList getIconTint() {
        return this.A07;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.A08;
    }

    public boolean isChecked() {
        return this.A0A;
    }

    public MaterialButton(Context context, AttributeSet attributeSet, int i) {
        super(C27891Qg.A00(context, attributeSet, i, R.style.f13nameremoved), attributeSet, i);
        this.A0C = new LinkedHashSet();
        boolean z = false;
        this.A0A = false;
        this.A09 = false;
        Context context2 = getContext();
        TypedArray A002 = C013205s.A00(context2, attributeSet, C27931Qk.A0I, new int[0], i, R.style.f13nameremoved);
        this.A04 = A002.getDimensionPixelSize(12, 0);
        this.A08 = AnonymousClass062.A01(PorterDuff.Mode.SRC_IN, A002.getInt(15, -1));
        this.A07 = AnonymousClass061.A00(getContext(), A002, 14);
        this.A01 = AnonymousClass061.A02(getContext(), A002, 10);
        this.A00 = A002.getInteger(11, 1);
        this.A05 = A002.getDimensionPixelSize(13, 0);
        AnonymousClass075 r8 = new AnonymousClass075(this, new AnonymousClass06J(AnonymousClass06J.A01(context2, attributeSet, i, R.style.f13nameremoved)));
        this.A0B = r8;
        r8.A03 = A002.getDimensionPixelOffset(1, 0);
        r8.A04 = A002.getDimensionPixelOffset(2, 0);
        r8.A05 = A002.getDimensionPixelOffset(3, 0);
        r8.A02 = A002.getDimensionPixelOffset(4, 0);
        if (A002.hasValue(8)) {
            int dimensionPixelSize = A002.getDimensionPixelSize(8, -1);
            r8.A00 = dimensionPixelSize;
            r8.A05(r8.A0D.A04((float) dimensionPixelSize));
            r8.A0G = true;
        }
        r8.A06 = A002.getDimensionPixelSize(20, 0);
        r8.A0A = AnonymousClass062.A01(PorterDuff.Mode.SRC_IN, A002.getInt(7, -1));
        MaterialButton materialButton = r8.A0J;
        r8.A07 = AnonymousClass061.A00(materialButton.getContext(), A002, 6);
        r8.A09 = AnonymousClass061.A00(materialButton.getContext(), A002, 19);
        r8.A08 = AnonymousClass061.A00(materialButton.getContext(), A002, 16);
        r8.A0F = A002.getBoolean(5, false);
        r8.A01 = A002.getDimensionPixelSize(9, 0);
        r8.A0I = A002.getBoolean(21, true);
        int A032 = AnonymousClass04F.A03(materialButton);
        int paddingTop = materialButton.getPaddingTop();
        int A022 = AnonymousClass04F.A02(materialButton);
        int paddingBottom = materialButton.getPaddingBottom();
        if (A002.hasValue(0)) {
            r8.A0E = true;
            materialButton.setSupportBackgroundTintList(r8.A07);
            materialButton.setSupportBackgroundTintMode(r8.A0A);
        } else {
            AnonymousClass075.A01(r8);
        }
        AnonymousClass04F.A06(materialButton, A032 + r8.A03, paddingTop + r8.A05, A022 + r8.A04, paddingBottom + r8.A02);
        A002.recycle();
        setCompoundDrawablePadding(this.A04);
        A01(this.A01 != null ? true : z);
    }

    public MaterialButton(Context context) {
        this(context, (AttributeSet) null);
    }
}
