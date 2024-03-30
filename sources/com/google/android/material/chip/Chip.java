package com.google.android.material.chip;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass02X;
import X.AnonymousClass046;
import X.AnonymousClass04F;
import X.AnonymousClass061;
import X.AnonymousClass062;
import X.AnonymousClass06H;
import X.AnonymousClass06J;
import X.AnonymousClass06R;
import X.AnonymousClass077;
import X.AnonymousClass08I;
import X.AnonymousClass0BN;
import X.AnonymousClass0EU;
import X.AnonymousClass0HU;
import X.AnonymousClass0NO;
import X.AnonymousClass0UG;
import X.AnonymousClass0UX;
import X.AnonymousClass0YF;
import X.C011004s;
import X.C011504z;
import X.C011705b;
import X.C012005e;
import X.C012405k;
import X.C013105r;
import X.C013205s;
import X.C014906l;
import X.C03240Dt;
import X.C09280c7;
import X.C16060oU;
import X.C16110oZ;
import X.C17470rT;
import X.C18260ss;
import X.C27891Qg;
import X.C27931Qk;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import com.whatsapp.R;
import java.util.Arrays;

public class Chip extends AppCompatCheckBox implements C17470rT, C012405k, C16060oU {
    public static final Rect A0J = AnonymousClass001.A06();
    public static final int[] A0K = {16842911};
    public static final int[] A0L = {16842913};
    public int A00;
    public InsetDrawable A01;
    public View.OnClickListener A02;
    public CompoundButton.OnCheckedChangeListener A03;
    public AnonymousClass0NO A04;
    public C16110oZ A05;
    public CharSequence A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public int A0C;
    public RippleDrawable A0D;
    public boolean A0E;
    public final AnonymousClass0HU A0F;
    public final Rect A0G;
    public final RectF A0H;
    public final AnonymousClass0UG A0I;

    public void setLines(int i) {
        if (i <= 1) {
            super.setLines(i);
            return;
        }
        throw AnonymousClass001.A0E("Chip does not support multi-line text");
    }

    public void setMaxLines(int i) {
        if (i <= 1) {
            super.setMaxLines(i);
            return;
        }
        throw AnonymousClass001.A0E("Chip does not support multi-line text");
    }

    public void setMinLines(int i) {
        if (i <= 1) {
            super.setMinLines(i);
            return;
        }
        throw AnonymousClass001.A0E("Chip does not support multi-line text");
    }

    private void A03() {
        ColorStateList A022 = C014906l.A02(this.A04.A0O);
        Drawable drawable = this.A01;
        if (drawable == null) {
            drawable = this.A04;
        }
        RippleDrawable rippleDrawable = new RippleDrawable(A022, drawable, (Drawable) null);
        this.A0D = rippleDrawable;
        C011504z.A04(rippleDrawable, this);
        A04();
    }

    private void A06(Context context, AttributeSet attributeSet, int i) {
        TypedArray A002 = C013205s.A00(context, attributeSet, C27931Qk.A05, new int[0], i, R.style.f13nameremoved);
        this.A0A = A002.getBoolean(32, false);
        this.A00 = (int) Math.ceil((double) A002.getDimension(20, (float) Math.ceil((double) AnonymousClass062.A00(getContext(), 48))));
        A002.recycle();
    }

    public static boolean A07(Chip chip) {
        Drawable drawable;
        AnonymousClass0NO r0 = chip.A04;
        if (r0 == null || (drawable = r0.A0T) == null) {
            return false;
        }
        if (!(drawable instanceof AnonymousClass077) || ((C03240Dt) ((AnonymousClass077) drawable)).A00 != null) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    public RectF getCloseIconTouchBounds() {
        RectF rectF = this.A0H;
        rectF.setEmpty();
        if (A07(this) && this.A02 != null) {
            AnonymousClass0NO r4 = this.A04;
            Rect bounds = r4.getBounds();
            rectF.setEmpty();
            if (AnonymousClass0NO.A06(r4)) {
                float f = r4.A01 + r4.A06 + r4.A07 + r4.A08 + r4.A0B;
                if (AnonymousClass08I.A00(r4) == 0) {
                    float f2 = (float) bounds.right;
                    rectF.right = f2;
                    rectF.left = f2 - f;
                } else {
                    float f3 = (float) bounds.left;
                    rectF.left = f3;
                    rectF.right = f3 + f;
                }
                rectF.top = (float) bounds.top;
                rectF.bottom = (float) bounds.bottom;
            }
        }
        return rectF;
    }

    private AnonymousClass0YF getTextAppearance() {
        AnonymousClass0NO r0 = this.A04;
        if (r0 != null) {
            return r0.A0v.A00;
        }
        return null;
    }

    private void setCloseIconHovered(boolean z) {
        if (this.A08 != z) {
            this.A08 = z;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z) {
        if (this.A09 != z) {
            this.A09 = z;
            refreshDrawableState();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003a, code lost:
        if (r1.right == r2) goto L_0x003c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0060, code lost:
        if (r1 > 0) goto L_0x001d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A08(int r7) {
        /*
            r6 = this;
            r6.A00 = r7
            boolean r0 = r6.A0A
            r3 = 0
            if (r0 == 0) goto L_0x0063
            X.0NO r2 = r6.A04
            float r0 = r2.A03
            int r0 = (int) r0
            int r1 = X.AnonymousClass001.A02(r7, r0, r3)
            int r0 = r2.getIntrinsicWidth()
            int r0 = X.AnonymousClass001.A02(r7, r0, r3)
            if (r0 > 0) goto L_0x005e
            if (r1 <= 0) goto L_0x0063
            r2 = 0
        L_0x001d:
            int r3 = r1 / 2
        L_0x001f:
            android.graphics.drawable.InsetDrawable r0 = r6.A01
            if (r0 == 0) goto L_0x0040
            android.graphics.Rect r1 = X.AnonymousClass001.A06()
            android.graphics.drawable.InsetDrawable r0 = r6.A01
            r0.getPadding(r1)
            int r0 = r1.top
            if (r0 != r3) goto L_0x0040
            int r0 = r1.bottom
            if (r0 != r3) goto L_0x0040
            int r0 = r1.left
            if (r0 != r2) goto L_0x0040
            int r0 = r1.right
            if (r0 != r2) goto L_0x0040
        L_0x003c:
            r6.A03()
            return
        L_0x0040:
            int r0 = r6.getMinHeight()
            if (r0 == r7) goto L_0x0049
            r6.setMinHeight(r7)
        L_0x0049:
            int r0 = r6.getMinWidth()
            if (r0 == r7) goto L_0x0052
            r6.setMinWidth(r7)
        L_0x0052:
            X.0NO r1 = r6.A04
            android.graphics.drawable.InsetDrawable r0 = new android.graphics.drawable.InsetDrawable
            r4 = r2
            r5 = r3
            r0.<init>(r1, r2, r3, r4, r5)
            r6.A01 = r0
            goto L_0x003c
        L_0x005e:
            int r2 = r0 / 2
            if (r1 <= 0) goto L_0x001f
            goto L_0x001d
        L_0x0063:
            android.graphics.drawable.InsetDrawable r0 = r6.A01
            if (r0 == 0) goto L_0x003c
            r0 = 0
            r6.A01 = r0
            r6.setMinWidth(r3)
            float r0 = r6.getChipMinHeight()
            int r0 = (int) r0
            r6.setMinHeight(r0)
            goto L_0x003c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.A08(int):void");
    }

    public boolean dispatchHoverEvent(MotionEvent motionEvent) {
        if (!this.A0B) {
            return super.dispatchHoverEvent(motionEvent);
        }
        if (this.A0F.A0y(motionEvent) || super.dispatchHoverEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (this.A0B) {
            AnonymousClass0HU r1 = this.A0F;
            if (r1.A0x(keyEvent) && r1.A02 != Integer.MIN_VALUE) {
                return true;
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0012, code lost:
        if (r1 == false) goto L_0x0014;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.CharSequence getAccessibilityClassName() {
        /*
            r3 = this;
            java.lang.CharSequence r0 = r3.A06
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x000b
            java.lang.CharSequence r0 = r3.A06
            return r0
        L_0x000b:
            X.0NO r0 = r3.A04
            if (r0 == 0) goto L_0x0014
            boolean r1 = r0.A0b
            r0 = 1
            if (r1 != 0) goto L_0x0015
        L_0x0014:
            r0 = 0
        L_0x0015:
            java.lang.String r2 = "android.widget.Button"
            if (r0 == 0) goto L_0x002c
            android.view.ViewParent r1 = r3.getParent()
            boolean r0 = r1 instanceof com.google.android.material.chip.ChipGroup
            if (r0 == 0) goto L_0x0035
            com.google.android.material.chip.ChipGroup r1 = (com.google.android.material.chip.ChipGroup) r1
            X.0YY r0 = r1.A03
            boolean r0 = r0.A02
            if (r0 == 0) goto L_0x0035
            java.lang.String r0 = "android.widget.RadioButton"
            return r0
        L_0x002c:
            boolean r0 = r3.isClickable()
            if (r0 != 0) goto L_0x0035
            java.lang.String r0 = "android.view.View"
            return r0
        L_0x0035:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.getAccessibilityClassName():java.lang.CharSequence");
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.A01;
        if (insetDrawable == null) {
            return this.A04;
        }
        return insetDrawable;
    }

    public Drawable getCheckedIcon() {
        AnonymousClass0NO r0 = this.A04;
        if (r0 != null) {
            return r0.A0R;
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        AnonymousClass0NO r0 = this.A04;
        if (r0 != null) {
            return r0.A0I;
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        AnonymousClass0NO r0 = this.A04;
        if (r0 != null) {
            return r0.A0J;
        }
        return null;
    }

    public float getChipCornerRadius() {
        AnonymousClass0NO r0 = this.A04;
        if (r0 != null) {
            return Math.max(0.0f, r0.A0H());
        }
        return 0.0f;
    }

    public float getChipEndPadding() {
        AnonymousClass0NO r0 = this.A04;
        if (r0 != null) {
            return r0.A01;
        }
        return 0.0f;
    }

    public Drawable getChipIcon() {
        Drawable drawable;
        AnonymousClass0NO r0 = this.A04;
        if (r0 == null || (drawable = r0.A0S) == null) {
            return null;
        }
        if (drawable instanceof AnonymousClass077) {
            return ((C03240Dt) ((AnonymousClass077) drawable)).A00;
        }
        return drawable;
    }

    public float getChipIconSize() {
        AnonymousClass0NO r0 = this.A04;
        if (r0 != null) {
            return r0.A02;
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        AnonymousClass0NO r0 = this.A04;
        if (r0 != null) {
            return r0.A0K;
        }
        return null;
    }

    public float getChipMinHeight() {
        AnonymousClass0NO r0 = this.A04;
        if (r0 != null) {
            return r0.A03;
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        AnonymousClass0NO r0 = this.A04;
        if (r0 != null) {
            return r0.A04;
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        AnonymousClass0NO r0 = this.A04;
        if (r0 != null) {
            return r0.A0L;
        }
        return null;
    }

    public float getChipStrokeWidth() {
        AnonymousClass0NO r0 = this.A04;
        if (r0 != null) {
            return r0.A05;
        }
        return 0.0f;
    }

    public Drawable getCloseIcon() {
        Drawable drawable;
        AnonymousClass0NO r0 = this.A04;
        if (r0 == null || (drawable = r0.A0T) == null) {
            return null;
        }
        if (drawable instanceof AnonymousClass077) {
            return ((C03240Dt) ((AnonymousClass077) drawable)).A00;
        }
        return drawable;
    }

    public CharSequence getCloseIconContentDescription() {
        AnonymousClass0NO r0 = this.A04;
        if (r0 != null) {
            return r0.A0Y;
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        AnonymousClass0NO r0 = this.A04;
        if (r0 != null) {
            return r0.A06;
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        AnonymousClass0NO r0 = this.A04;
        if (r0 != null) {
            return r0.A07;
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        AnonymousClass0NO r0 = this.A04;
        if (r0 != null) {
            return r0.A08;
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        AnonymousClass0NO r0 = this.A04;
        if (r0 != null) {
            return r0.A0N;
        }
        return null;
    }

    public TextUtils.TruncateAt getEllipsize() {
        AnonymousClass0NO r0 = this.A04;
        if (r0 != null) {
            return r0.A0V;
        }
        return null;
    }

    public void getFocusedRect(Rect rect) {
        if (this.A0B) {
            AnonymousClass0HU r2 = this.A0F;
            if (r2.A02 == 1 || r2.A00 == 1) {
                rect.set(getCloseIconTouchBoundsInt());
                return;
            }
        }
        super.getFocusedRect(rect);
    }

    public AnonymousClass06H getHideMotionSpec() {
        AnonymousClass0NO r0 = this.A04;
        if (r0 != null) {
            return r0.A0W;
        }
        return null;
    }

    public float getIconEndPadding() {
        AnonymousClass0NO r0 = this.A04;
        if (r0 != null) {
            return r0.A09;
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        AnonymousClass0NO r0 = this.A04;
        if (r0 != null) {
            return r0.A0A;
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        AnonymousClass0NO r0 = this.A04;
        if (r0 != null) {
            return r0.A0O;
        }
        return null;
    }

    public AnonymousClass06J getShapeAppearanceModel() {
        return this.A04.A01.A0K;
    }

    public AnonymousClass06H getShowMotionSpec() {
        AnonymousClass0NO r0 = this.A04;
        if (r0 != null) {
            return r0.A0X;
        }
        return null;
    }

    public float getTextEndPadding() {
        AnonymousClass0NO r0 = this.A04;
        if (r0 != null) {
            return r0.A0B;
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        AnonymousClass0NO r0 = this.A04;
        if (r0 != null) {
            return r0.A0C;
        }
        return 0.0f;
    }

    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, A0L);
        }
        AnonymousClass0NO r0 = this.A04;
        if (r0 != null && r0.A0b) {
            View.mergeDrawableStates(onCreateDrawableState, A0K);
        }
        return onCreateDrawableState;
    }

    public void setBackground(Drawable drawable) {
        Drawable drawable2 = this.A01;
        if (drawable2 == null) {
            drawable2 = this.A04;
        }
        if (drawable == drawable2 || drawable == this.A0D) {
            super.setBackground(drawable);
        } else {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
    }

    public void setBackgroundColor(int i) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    public void setBackgroundDrawable(Drawable drawable) {
        Drawable drawable2 = this.A01;
        if (drawable2 == null) {
            drawable2 = this.A04;
        }
        if (drawable == drawable2 || drawable == this.A0D) {
            super.setBackgroundDrawable(drawable);
        } else {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        }
    }

    public void setBackgroundResource(int i) {
        Log.w("Chip", "Do not set the background resource; Chip manages its own background drawable.");
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
        Log.w("Chip", "Do not set the background tint list; Chip manages its own background drawable.");
    }

    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        Log.w("Chip", "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    public void setCheckable(boolean z) {
        AnonymousClass0NO r0 = this.A04;
        if (r0 != null) {
            r0.A0Y(z);
        }
    }

    public void setCheckableResource(int i) {
        AnonymousClass0NO r1 = this.A04;
        if (r1 != null) {
            r1.A0Y(r1.A0p.getResources().getBoolean(i));
        }
    }

    public void setChecked(boolean z) {
        AnonymousClass0NO r0 = this.A04;
        if (r0 == null) {
            this.A0E = z;
        } else if (r0.A0b) {
            super.setChecked(z);
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        AnonymousClass0NO r0 = this.A04;
        if (r0 != null) {
            r0.A0V(drawable);
        }
    }

    public void setCheckedIconResource(int i) {
        AnonymousClass0NO r2 = this.A04;
        if (r2 != null) {
            r2.A0V(AnonymousClass02X.A03().A08(r2.A0p, i));
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        AnonymousClass0NO r0 = this.A04;
        if (r0 != null) {
            r0.A0R(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i) {
        AnonymousClass0NO r1 = this.A04;
        if (r1 != null) {
            r1.A0R(C013105r.A00(r1.A0p, i));
        }
    }

    public void setCheckedIconVisible(int i) {
        AnonymousClass0NO r1 = this.A04;
        if (r1 != null) {
            r1.A0Z(r1.A0p.getResources().getBoolean(i));
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        AnonymousClass0NO r1 = this.A04;
        if (r1 != null && r1.A0J != colorStateList) {
            r1.A0J = colorStateList;
            AnonymousClass000.A17(r1);
        }
    }

    public void setChipBackgroundColorResource(int i) {
        ColorStateList A002;
        AnonymousClass0NO r2 = this.A04;
        if (r2 != null && r2.A0J != (A002 = C013105r.A00(r2.A0p, i))) {
            r2.A0J = A002;
            AnonymousClass000.A17(r2);
        }
    }

    @Deprecated
    public void setChipCornerRadius(float f) {
        AnonymousClass0NO r0 = this.A04;
        if (r0 != null) {
            r0.A0J(f);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i) {
        AnonymousClass0NO r1 = this.A04;
        if (r1 != null) {
            r1.A0J(AnonymousClass000.A01(r1, i));
        }
    }

    public void setChipDrawable(AnonymousClass0NO r3) {
        AnonymousClass0NO r1 = this.A04;
        if (r1 != r3) {
            if (r1 != null) {
                r1.A0a = AnonymousClass001.A0F((Object) null);
            }
            this.A04 = r3;
            r3.A0g = false;
            r3.A0a = AnonymousClass001.A0F(this);
            A08(this.A00);
        }
    }

    public void setChipEndPadding(float f) {
        AnonymousClass0NO r1 = this.A04;
        if (r1 != null && r1.A01 != f) {
            r1.A01 = f;
            r1.invalidateSelf();
            r1.A0I();
        }
    }

    public void setChipEndPaddingResource(int i) {
        AnonymousClass0NO r2 = this.A04;
        if (r2 != null) {
            float A012 = AnonymousClass000.A01(r2, i);
            if (r2.A01 != A012) {
                r2.A01 = A012;
                r2.invalidateSelf();
                r2.A0I();
            }
        }
    }

    public void setChipIcon(Drawable drawable) {
        AnonymousClass0NO r0 = this.A04;
        if (r0 != null) {
            r0.A0W(drawable);
        }
    }

    public void setChipIconResource(int i) {
        AnonymousClass0NO r2 = this.A04;
        if (r2 != null) {
            r2.A0W(AnonymousClass02X.A03().A08(r2.A0p, i));
        }
    }

    public void setChipIconSize(float f) {
        AnonymousClass0NO r0 = this.A04;
        if (r0 != null) {
            r0.A0K(f);
        }
    }

    public void setChipIconSizeResource(int i) {
        AnonymousClass0NO r1 = this.A04;
        if (r1 != null) {
            r1.A0K(AnonymousClass000.A01(r1, i));
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        AnonymousClass0NO r0 = this.A04;
        if (r0 != null) {
            r0.A0S(colorStateList);
        }
    }

    public void setChipIconTintResource(int i) {
        AnonymousClass0NO r1 = this.A04;
        if (r1 != null) {
            r1.A0S(C013105r.A00(r1.A0p, i));
        }
    }

    public void setChipIconVisible(int i) {
        AnonymousClass0NO r1 = this.A04;
        if (r1 != null) {
            r1.A0a(r1.A0p.getResources().getBoolean(i));
        }
    }

    public void setChipMinHeight(float f) {
        AnonymousClass0NO r1 = this.A04;
        if (r1 != null && r1.A03 != f) {
            r1.A03 = f;
            r1.invalidateSelf();
            r1.A0I();
        }
    }

    public void setChipMinHeightResource(int i) {
        AnonymousClass0NO r2 = this.A04;
        if (r2 != null) {
            float A012 = AnonymousClass000.A01(r2, i);
            if (r2.A03 != A012) {
                r2.A03 = A012;
                r2.invalidateSelf();
                r2.A0I();
            }
        }
    }

    public void setChipStartPadding(float f) {
        AnonymousClass0NO r1 = this.A04;
        if (r1 != null && r1.A04 != f) {
            r1.A04 = f;
            r1.invalidateSelf();
            r1.A0I();
        }
    }

    public void setChipStartPaddingResource(int i) {
        AnonymousClass0NO r2 = this.A04;
        if (r2 != null) {
            float A012 = AnonymousClass000.A01(r2, i);
            if (r2.A04 != A012) {
                r2.A04 = A012;
                r2.invalidateSelf();
                r2.A0I();
            }
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        AnonymousClass0NO r0 = this.A04;
        if (r0 != null) {
            r0.A0T(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i) {
        AnonymousClass0NO r1 = this.A04;
        if (r1 != null) {
            r1.A0T(C013105r.A00(r1.A0p, i));
        }
    }

    public void setChipStrokeWidth(float f) {
        AnonymousClass0NO r0 = this.A04;
        if (r0 != null) {
            r0.A0L(f);
        }
    }

    public void setChipStrokeWidthResource(int i) {
        AnonymousClass0NO r1 = this.A04;
        if (r1 != null) {
            r1.A0L(AnonymousClass000.A01(r1, i));
        }
    }

    public void setCloseIcon(Drawable drawable) {
        AnonymousClass0NO r0 = this.A04;
        if (r0 != null) {
            r0.A0X(drawable);
        }
        A02();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        AnonymousClass0NO r2 = this.A04;
        if (r2 != null && r2.A0Y != charSequence) {
            AnonymousClass046 A022 = AnonymousClass046.A02();
            r2.A0Y = A022.A03(A022.A00, charSequence);
            r2.invalidateSelf();
        }
    }

    public void setCloseIconEndPadding(float f) {
        AnonymousClass0NO r0 = this.A04;
        if (r0 != null) {
            r0.A0M(f);
        }
    }

    public void setCloseIconEndPaddingResource(int i) {
        AnonymousClass0NO r1 = this.A04;
        if (r1 != null) {
            r1.A0M(AnonymousClass000.A01(r1, i));
        }
    }

    public void setCloseIconResource(int i) {
        AnonymousClass0NO r2 = this.A04;
        if (r2 != null) {
            r2.A0X(AnonymousClass02X.A03().A08(r2.A0p, i));
        }
        A02();
    }

    public void setCloseIconSize(float f) {
        AnonymousClass0NO r0 = this.A04;
        if (r0 != null) {
            r0.A0N(f);
        }
    }

    public void setCloseIconSizeResource(int i) {
        AnonymousClass0NO r1 = this.A04;
        if (r1 != null) {
            r1.A0N(AnonymousClass000.A01(r1, i));
        }
    }

    public void setCloseIconStartPadding(float f) {
        AnonymousClass0NO r0 = this.A04;
        if (r0 != null) {
            r0.A0O(f);
        }
    }

    public void setCloseIconStartPaddingResource(int i) {
        AnonymousClass0NO r1 = this.A04;
        if (r1 != null) {
            r1.A0O(AnonymousClass000.A01(r1, i));
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        AnonymousClass0NO r0 = this.A04;
        if (r0 != null) {
            r0.A0U(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i) {
        AnonymousClass0NO r1 = this.A04;
        if (r1 != null) {
            r1.A0U(C013105r.A00(r1.A0p, i));
        }
    }

    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw AnonymousClass001.A0E("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        } else {
            throw AnonymousClass001.A0E("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw AnonymousClass001.A0E("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        } else {
            throw AnonymousClass001.A0E("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            throw AnonymousClass001.A0E("Please set start drawable using R.attr#chipIcon.");
        } else if (i3 == 0) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(i, i2, i3, i4);
        } else {
            throw AnonymousClass001.A0E("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            throw AnonymousClass001.A0E("Please set start drawable using R.attr#chipIcon.");
        } else if (i3 == 0) {
            super.setCompoundDrawablesWithIntrinsicBounds(i, i2, i3, i4);
        } else {
            throw AnonymousClass001.A0E("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.A04 == null) {
            return;
        }
        if (truncateAt != TextUtils.TruncateAt.MARQUEE) {
            super.setEllipsize(truncateAt);
            AnonymousClass0NO r0 = this.A04;
            if (r0 != null) {
                r0.A0V = truncateAt;
                return;
            }
            return;
        }
        throw AnonymousClass001.A0E("Text within a chip are not allowed to scroll.");
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
        this.A0A = z;
        A08(this.A00);
    }

    public void setHideMotionSpec(AnonymousClass06H r2) {
        AnonymousClass0NO r0 = this.A04;
        if (r0 != null) {
            r0.A0W = r2;
        }
    }

    public void setHideMotionSpecResource(int i) {
        AnonymousClass0NO r1 = this.A04;
        if (r1 != null) {
            r1.A0W = AnonymousClass06H.A00(r1.A0p, i);
        }
    }

    public void setIconEndPadding(float f) {
        AnonymousClass0NO r0 = this.A04;
        if (r0 != null) {
            r0.A0P(f);
        }
    }

    public void setIconEndPaddingResource(int i) {
        AnonymousClass0NO r1 = this.A04;
        if (r1 != null) {
            r1.A0P(AnonymousClass000.A01(r1, i));
        }
    }

    public void setIconStartPadding(float f) {
        AnonymousClass0NO r0 = this.A04;
        if (r0 != null) {
            r0.A0Q(f);
        }
    }

    public void setIconStartPaddingResource(int i) {
        AnonymousClass0NO r1 = this.A04;
        if (r1 != null) {
            r1.A0Q(AnonymousClass000.A01(r1, i));
        }
    }

    public void setLayoutDirection(int i) {
        if (this.A04 != null) {
            super.setLayoutDirection(i);
        }
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.A02 = onClickListener;
        A02();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        AnonymousClass0NO r1 = this.A04;
        if (!(r1 == null || r1.A0O == colorStateList)) {
            r1.A0O = colorStateList;
            AnonymousClass000.A17(r1);
        }
        A03();
    }

    public void setRippleColorResource(int i) {
        AnonymousClass0NO r2 = this.A04;
        if (r2 != null) {
            ColorStateList A002 = C013105r.A00(r2.A0p, i);
            if (r2.A0O != A002) {
                r2.A0O = A002;
                AnonymousClass000.A17(r2);
            }
            A03();
        }
    }

    public void setShapeAppearanceModel(AnonymousClass06J r2) {
        this.A04.setShapeAppearanceModel(r2);
    }

    public void setShowMotionSpec(AnonymousClass06H r2) {
        AnonymousClass0NO r0 = this.A04;
        if (r0 != null) {
            r0.A0X = r2;
        }
    }

    public void setShowMotionSpecResource(int i) {
        AnonymousClass0NO r1 = this.A04;
        if (r1 != null) {
            r1.A0X = AnonymousClass06H.A00(r1.A0p, i);
        }
    }

    public void setSingleLine(boolean z) {
        if (z) {
            super.setSingleLine(z);
            return;
        }
        throw AnonymousClass001.A0E("Chip does not support multi-line text");
    }

    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        AnonymousClass0NO r0 = this.A04;
        if (r0 != null) {
            if (charSequence == null) {
                charSequence = "";
            }
            boolean z = r0.A0g;
            CharSequence charSequence2 = charSequence;
            if (z) {
                charSequence2 = null;
            }
            super.setText(charSequence2, bufferType);
            AnonymousClass0NO r2 = this.A04;
            if (r2 != null && !TextUtils.equals(r2.A0Z, charSequence)) {
                r2.A0Z = charSequence;
                r2.A0v.A02 = true;
                r2.invalidateSelf();
                r2.A0I();
            }
        }
    }

    public void setTextEndPadding(float f) {
        AnonymousClass0NO r1 = this.A04;
        if (r1 != null && r1.A0B != f) {
            r1.A0B = f;
            r1.invalidateSelf();
            r1.A0I();
        }
    }

    public void setTextEndPaddingResource(int i) {
        AnonymousClass0NO r2 = this.A04;
        if (r2 != null) {
            float A012 = AnonymousClass000.A01(r2, i);
            if (r2.A0B != A012) {
                r2.A0B = A012;
                r2.invalidateSelf();
                r2.A0I();
            }
        }
    }

    public void setTextStartPadding(float f) {
        AnonymousClass0NO r1 = this.A04;
        if (r1 != null && r1.A0C != f) {
            r1.A0C = f;
            r1.invalidateSelf();
            r1.A0I();
        }
    }

    public void setTextStartPaddingResource(int i) {
        AnonymousClass0NO r2 = this.A04;
        if (r2 != null) {
            float A012 = AnonymousClass000.A01(r2, i);
            if (r2.A0C != A012) {
                r2.A0C = A012;
                r2.invalidateSelf();
                r2.A0I();
            }
        }
    }

    public Chip(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.f4nameremoved);
    }

    private void A02() {
        boolean z;
        AnonymousClass0NO r0;
        if (!A07(this) || (r0 = this.A04) == null || !r0.A0d || this.A02 == null) {
            C012005e.A0V(this, (C011705b) null);
            z = false;
        } else {
            C012005e.A0V(this, this.A0F);
            z = true;
        }
        this.A0B = z;
    }

    private void A04() {
        AnonymousClass0NO r2;
        if (!TextUtils.isEmpty(getText()) && (r2 = this.A04) != null) {
            int A0G2 = (int) (r2.A01 + r2.A0B + r2.A0G());
            int A0F2 = (int) (r2.A04 + r2.A0C + r2.A0F());
            if (this.A01 != null) {
                Rect A062 = AnonymousClass001.A06();
                this.A01.getPadding(A062);
                A0F2 += A062.left;
                A0G2 += A062.right;
            }
            AnonymousClass04F.A06(this, A0F2, getPaddingTop(), A0G2, getPaddingBottom());
        }
    }

    private void A05() {
        TextPaint paint = getPaint();
        AnonymousClass0NO r0 = this.A04;
        if (r0 != null) {
            paint.drawableState = r0.getState();
        }
        AnonymousClass0YF textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.A04(getContext(), paint, this.A0I);
        }
    }

    /* access modifiers changed from: private */
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        Rect rect = this.A0G;
        rect.set((int) closeIconTouchBounds.left, (int) closeIconTouchBounds.top, (int) closeIconTouchBounds.right, (int) closeIconTouchBounds.bottom);
        return rect;
    }

    public void drawableStateChanged() {
        Drawable drawable;
        super.drawableStateChanged();
        AnonymousClass0NO r0 = this.A04;
        if (r0 != null && (drawable = r0.A0T) != null && drawable.isStateful()) {
            AnonymousClass0NO r2 = this.A04;
            int isEnabled = isEnabled();
            if (this.A07) {
                isEnabled++;
            }
            if (this.A08) {
                isEnabled++;
            }
            if (this.A09) {
                isEnabled++;
            }
            if (isChecked()) {
                isEnabled++;
            }
            int[] iArr = new int[isEnabled];
            int i = 0;
            if (isEnabled()) {
                iArr[0] = 16842910;
                i = 1;
            }
            if (this.A07) {
                iArr[i] = 16842908;
                i++;
            }
            if (this.A08) {
                iArr[i] = 16843623;
                i++;
            }
            if (this.A09) {
                iArr[i] = 16842919;
                i++;
            }
            if (isChecked()) {
                iArr[i] = 16842913;
            }
            if (!Arrays.equals(r2.A0h, iArr)) {
                r2.A0h = iArr;
                if (AnonymousClass0NO.A06(r2) && AnonymousClass0NO.A07(r2, r2.getState(), iArr)) {
                    invalidate();
                }
            }
        }
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        AnonymousClass06R.A03(this, this.A04);
    }

    public void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (this.A0B) {
            AnonymousClass0HU r2 = this.A0F;
            int i2 = r2.A02;
            if (i2 != Integer.MIN_VALUE) {
                r2.A0u(i2);
            }
            if (z) {
                AnonymousClass0BN.A09(rect, r2, i);
            }
        }
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        boolean contains;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 7) {
            if (actionMasked == 10) {
                contains = false;
            }
            return super.onHoverEvent(motionEvent);
        }
        contains = getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY());
        setCloseIconHovered(contains);
        return super.onHoverEvent(motionEvent);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0011, code lost:
        if (r1 == false) goto L_0x0013;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo r10) {
        /*
            r9 = this;
            super.onInitializeAccessibilityNodeInfo(r10)
            java.lang.CharSequence r0 = r9.getAccessibilityClassName()
            r10.setClassName(r0)
            X.0NO r0 = r9.A04
            if (r0 == 0) goto L_0x0013
            boolean r1 = r0.A0b
            r0 = 1
            if (r1 != 0) goto L_0x0014
        L_0x0013:
            r0 = 0
        L_0x0014:
            r10.setCheckable(r0)
            boolean r0 = r9.isClickable()
            r10.setClickable(r0)
            android.view.ViewParent r0 = r9.getParent()
            boolean r0 = r0 instanceof com.google.android.material.chip.ChipGroup
            if (r0 == 0) goto L_0x0072
            android.view.ViewParent r4 = r9.getParent()
            X.0EP r4 = (X.AnonymousClass0EP) r4
            X.0Ys r2 = new X.0Ys
            r2.<init>(r10)
            boolean r0 = r4.A03
            if (r0 == 0) goto L_0x0052
            r3 = 0
            r5 = 0
        L_0x0037:
            int r0 = r4.getChildCount()
            if (r3 >= r0) goto L_0x0052
            android.view.View r1 = r4.getChildAt(r3)
            boolean r0 = r1 instanceof com.google.android.material.chip.Chip
            if (r0 == 0) goto L_0x004f
            int r0 = X.AnonymousClass001.A05(r4, r3)
            if (r0 != 0) goto L_0x004f
            if (r1 == r9) goto L_0x0053
            int r5 = r5 + 1
        L_0x004f:
            int r3 = r3 + 1
            goto L_0x0037
        L_0x0052:
            r5 = -1
        L_0x0053:
            r0 = 2131433498(0x7f0b181a, float:1.8488783E38)
            java.lang.Object r1 = r9.getTag(r0)
            boolean r0 = r1 instanceof java.lang.Integer
            if (r0 != 0) goto L_0x0073
            r3 = -1
        L_0x005f:
            boolean r8 = r9.isChecked()
            r4 = 1
            r7 = 0
            r6 = 1
            android.view.accessibility.AccessibilityNodeInfo$CollectionItemInfo r1 = android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo.obtain(r3, r4, r5, r6, r7, r8)
            X.0SL r0 = new X.0SL
            r0.<init>(r1)
            r2.A0K(r0)
        L_0x0072:
            return
        L_0x0073:
            int r3 = X.AnonymousClass000.A0I(r1)
            goto L_0x005f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo):void");
    }

    public PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i) {
        if (!getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) || !isEnabled()) {
            return null;
        }
        return PointerIcon.getSystemIcon(getContext(), 1002);
    }

    public void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        if (this.A0C != i) {
            this.A0C = i;
            A04();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x004e, code lost:
        if (r0 == false) goto L_0x0020;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001e, code lost:
        if (r3 != 3) goto L_0x0020;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r5) {
        /*
            r4 = this;
            int r3 = r5.getActionMasked()
            android.graphics.RectF r2 = r4.getCloseIconTouchBounds()
            float r1 = r5.getX()
            float r0 = r5.getY()
            boolean r1 = r2.contains(r1, r0)
            r2 = 0
            r0 = 1
            if (r3 == 0) goto L_0x0053
            if (r3 == r0) goto L_0x0032
            r0 = 2
            if (r3 == r0) goto L_0x0028
            r0 = 3
            if (r3 == r0) goto L_0x0051
        L_0x0020:
            boolean r0 = super.onTouchEvent(r5)
            if (r0 == 0) goto L_0x0027
        L_0x0026:
            r2 = 1
        L_0x0027:
            return r2
        L_0x0028:
            boolean r0 = r4.A09
            if (r0 == 0) goto L_0x0020
            if (r1 != 0) goto L_0x0026
            r4.setCloseIconPressed(r2)
            goto L_0x0026
        L_0x0032:
            boolean r0 = r4.A09
            if (r0 == 0) goto L_0x0051
            r4.playSoundEffect(r2)
            android.view.View$OnClickListener r0 = r4.A02
            r1 = 1
            if (r0 == 0) goto L_0x0041
            r0.onClick(r4)
        L_0x0041:
            boolean r0 = r4.A0B
            if (r0 == 0) goto L_0x004a
            X.0HU r0 = r4.A0F
            r0.A0p(r1, r1)
        L_0x004a:
            r0 = 1
        L_0x004b:
            r4.setCloseIconPressed(r2)
            if (r0 != 0) goto L_0x0026
            goto L_0x0020
        L_0x0051:
            r0 = 0
            goto L_0x004b
        L_0x0053:
            if (r1 == 0) goto L_0x0020
            r4.setCloseIconPressed(r0)
            goto L_0x0026
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Deprecated
    public void setChipTextResource(int i) {
        setText(getResources().getString(i));
    }

    public void setCloseIconVisible(int i) {
        setCloseIconVisible(getResources().getBoolean(i));
    }

    public void setElevation(float f) {
        super.setElevation(f);
        AnonymousClass0NO r0 = this.A04;
        if (r0 != null) {
            r0.A09(f);
        }
    }

    public void setGravity(int i) {
        if (i != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i);
        }
    }

    public void setMaxWidth(int i) {
        super.setMaxWidth(i);
        AnonymousClass0NO r0 = this.A04;
        if (r0 != null) {
            r0.A0H = i;
        }
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        AnonymousClass0NO r0 = this.A04;
        if (r0 != null) {
            Context context2 = r0.A0p;
            r0.A0v.A01(context2, new AnonymousClass0YF(context2, i));
        }
        A05();
    }

    public void setTextAppearanceResource(int i) {
        setTextAppearance(getContext(), i);
    }

    public void setTextSize(int i, float f) {
        super.setTextSize(i, f);
        AnonymousClass0NO r3 = this.A04;
        if (r3 != null) {
            float applyDimension = TypedValue.applyDimension(i, f, getResources().getDisplayMetrics());
            AnonymousClass0UX r1 = r3.A0v;
            AnonymousClass0YF r0 = r1.A00;
            if (r0 != null) {
                r0.A00 = applyDimension;
                r1.A04.setTextSize(applyDimension);
                r3.Bj0();
            }
        }
        A05();
    }

    public void setAccessibilityClassName(CharSequence charSequence) {
        this.A06 = charSequence;
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z) {
        setCheckedIconVisible(z);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i) {
        setCheckedIconVisible(i);
    }

    @Deprecated
    public void setChipIconEnabled(boolean z) {
        setChipIconVisible(z);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i) {
        setChipIconVisible(i);
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z) {
        setCloseIconVisible(z);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i) {
        setCloseIconVisible(i);
    }

    public void setInternalOnCheckedChangeListener(C16110oZ r1) {
        this.A05 = r1;
    }

    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.A03 = onCheckedChangeListener;
    }

    public Drawable getChipDrawable() {
        return this.A04;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Chip(Context context, AttributeSet attributeSet, int i) {
        super(C27891Qg.A00(context, attributeSet, i, R.style.f13nameremoved), attributeSet, i);
        AttributeSet attributeSet2 = attributeSet;
        int i2 = i;
        this.A0G = AnonymousClass001.A06();
        this.A0H = new RectF();
        this.A0I = new C18260ss(this, 0);
        Context context2 = getContext();
        if (attributeSet != null) {
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "background") != null) {
                Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") != null) {
                throw AnonymousClass001.A0E("Please set left drawable using R.attr#chipIcon.");
            } else if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") != null) {
                throw AnonymousClass001.A0E("Please set start drawable using R.attr#chipIcon.");
            } else if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") != null) {
                throw AnonymousClass001.A0E("Please set end drawable using R.attr#closeIcon.");
            } else if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") != null) {
                throw AnonymousClass001.A0E("Please set end drawable using R.attr#closeIcon.");
            } else if (!attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) != 1) {
                throw AnonymousClass001.A0E("Chip does not support multi-line text");
            } else if (attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627) != 8388627) {
                Log.w("Chip", "Chip text must be vertically center and start aligned");
            }
        }
        AnonymousClass0NO r3 = new AnonymousClass0NO(context2, attributeSet, i);
        AnonymousClass0NO.A02(attributeSet, r3, i);
        A06(context2, attributeSet, i);
        setChipDrawable(r3);
        r3.A09(C011004s.A00(this));
        TypedArray A002 = C013205s.A00(context2, attributeSet2, C27931Qk.A05, new int[0], i2, R.style.f13nameremoved);
        if (Build.VERSION.SDK_INT < 23) {
            setTextColor(AnonymousClass061.A00(context2, A002, 2));
        }
        boolean hasValue = A002.hasValue(37);
        A002.recycle();
        this.A0F = new AnonymousClass0HU(this, this);
        A02();
        if (!hasValue) {
            setOutlineProvider(new AnonymousClass0EU(this));
        }
        setChecked(this.A0E);
        setText(r3.A0Z);
        setEllipsize(r3.A0V);
        A05();
        if (!this.A04.A0g) {
            setLines(1);
            setHorizontallyScrolling(true);
        }
        setGravity(8388627);
        A04();
        if (this.A0A) {
            setMinHeight(this.A00);
        }
        this.A0C = AnonymousClass04F.A01(this);
        super.setOnCheckedChangeListener(new C09280c7(this));
    }

    public void setCheckedIconVisible(boolean z) {
        AnonymousClass0NO r0 = this.A04;
        if (r0 != null) {
            r0.A0Z(z);
        }
    }

    public void setChipIconVisible(boolean z) {
        AnonymousClass0NO r0 = this.A04;
        if (r0 != null) {
            r0.A0a(z);
        }
    }

    public void setCloseIconVisible(boolean z) {
        AnonymousClass0NO r0 = this.A04;
        if (r0 != null) {
            r0.A0b(z);
        }
        A02();
    }

    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw AnonymousClass001.A0E("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        } else {
            throw AnonymousClass001.A0E("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw AnonymousClass001.A0E("Please set left drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        } else {
            throw AnonymousClass001.A0E("Please set right drawable using R.attr#closeIcon.");
        }
    }

    public void setTextAppearance(int i) {
        super.setTextAppearance(i);
        AnonymousClass0NO r0 = this.A04;
        if (r0 != null) {
            Context context = r0.A0p;
            r0.A0v.A01(context, new AnonymousClass0YF(context, i));
        }
        A05();
    }

    public Chip(Context context) {
        this(context, (AttributeSet) null);
    }

    public void setTextAppearance(AnonymousClass0YF r3) {
        AnonymousClass0NO r0 = this.A04;
        if (r0 != null) {
            r0.A0v.A01(r0.A0p, r3);
        }
        A05();
    }
}
