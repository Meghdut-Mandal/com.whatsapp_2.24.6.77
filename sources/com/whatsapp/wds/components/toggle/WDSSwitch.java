package com.whatsapp.wds.components.toggle;

import X.AnonymousClass00C;
import X.AnonymousClass00E;
import X.AnonymousClass00F;
import X.C004602b;
import X.C05250Oz;
import X.C120495rb;
import X.C120505rc;
import X.C18820ts;
import X.C27891Qg;
import X.C36361kB;
import X.C36381kD;
import X.C90494aF;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.SwitchCompat;
import com.whatsapp.R;
import java.lang.reflect.Field;
import java.util.Arrays;

public final class WDSSwitch extends SwitchCompat {
    public ColorStateList A00;
    public ColorStateList A01;
    public ColorStateList A02;
    public PorterDuff.Mode A03;
    public Drawable A04;
    public Drawable A05;
    public Drawable A06;
    public C18820ts A07;
    public int[] A08;
    public int[] A09;
    public final C120495rb A0A;
    public final C120505rc A0B;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WDSSwitch(Context context, AttributeSet attributeSet, int i) {
        super(C27891Qg.A00(new C004602b(context, (int) R.style.f13nameremoved), attributeSet, i, R.style.f13nameremoved), attributeSet, i);
        AnonymousClass00C.A0D(context, 1);
        this.A03 = PorterDuff.Mode.SRC_IN;
        Field field = null;
        try {
            Field declaredField = SwitchCompat.class.getDeclaredField("mSwitchWidth");
            AnonymousClass00C.A08(declaredField);
            declaredField.setAccessible(true);
            field = declaredField;
        } catch (NoSuchFieldException | SecurityException unused) {
        }
        this.A0A = new C120495rb(this, field);
        this.A0B = new C120505rc(this);
        this.A04 = this.A0D;
        this.A00 = this.A09;
        super.setThumbTintList((ColorStateList) null);
        this.A06 = this.A0E;
        this.A02 = this.A0A;
        super.setTrackTintList((ColorStateList) null);
        this.A05 = AnonymousClass00E.A00(context, R.drawable.vec_wds_switch_track_decoration);
        this.A01 = AnonymousClass00F.A04(context, R.color.f6nameremoved);
        setMinHeight(0);
        setMinimumHeight(0);
        A00();
        A01();
    }

    private final void A00() {
        this.A04 = C90494aF.A0F(this.A0B, this.A04, this.A00);
        A02();
        super.setThumbDrawable(this.A04);
        refreshDrawableState();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x003b, code lost:
        if (r2 != null) goto L_0x002e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A01() {
        /*
            r3 = this;
            android.graphics.drawable.Drawable r2 = r3.A06
            android.content.res.ColorStateList r1 = r3.A02
            android.graphics.PorterDuff$Mode r0 = r3.A0C
            android.graphics.drawable.Drawable r0 = X.C90494aF.A0F(r0, r2, r1)
            r3.A06 = r0
            android.graphics.drawable.Drawable r2 = r3.A05
            android.content.res.ColorStateList r1 = r3.A01
            android.graphics.PorterDuff$Mode r0 = r3.A03
            android.graphics.drawable.Drawable r0 = X.C90494aF.A0F(r0, r2, r1)
            r3.A05 = r0
            r3.A02()
            android.graphics.drawable.Drawable r2 = r3.A06
            if (r2 == 0) goto L_0x0039
            android.graphics.drawable.Drawable r1 = r3.A05
            if (r1 == 0) goto L_0x002e
            r0 = 2
            android.graphics.drawable.Drawable[] r0 = new android.graphics.drawable.Drawable[r0]
            X.C36331k8.A1N(r2, r1, r0)
            android.graphics.drawable.LayerDrawable r2 = new android.graphics.drawable.LayerDrawable
            r2.<init>(r0)
        L_0x002e:
            int r0 = r2.getIntrinsicWidth()
            r3.setSwitchMinWidth(r0)
        L_0x0035:
            super.setTrackDrawable(r2)
            return
        L_0x0039:
            android.graphics.drawable.Drawable r2 = r3.A05
            if (r2 == 0) goto L_0x0035
            goto L_0x002e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.wds.components.toggle.WDSSwitch.A01():void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A02() {
        /*
            r7 = this;
            android.content.res.ColorStateList r0 = r7.A00
            if (r0 != 0) goto L_0x000d
            android.content.res.ColorStateList r0 = r7.A02
            if (r0 != 0) goto L_0x000d
            android.content.res.ColorStateList r0 = r7.A01
            if (r0 != 0) goto L_0x000d
        L_0x000c:
            return
        L_0x000d:
            X.5rc r2 = r7.A0B
            java.lang.reflect.Field r1 = r2.A01     // Catch:{ IllegalAccessException -> 0x001a }
            if (r1 == 0) goto L_0x001a
            com.whatsapp.wds.components.toggle.WDSSwitch r0 = r2.A00     // Catch:{ IllegalAccessException -> 0x001a }
            float r6 = r1.getFloat(r0)     // Catch:{ IllegalAccessException -> 0x001a }
            goto L_0x0025
        L_0x001a:
            com.whatsapp.wds.components.toggle.WDSSwitch r0 = r2.A00
            boolean r0 = r0.isChecked()
            r6 = 0
            if (r0 == 0) goto L_0x0025
            r6 = 1065353216(0x3f800000, float:1.0)
        L_0x0025:
            android.content.res.ColorStateList r3 = r7.A00
            java.lang.String r5 = "currentStateChecked"
            java.lang.String r4 = "currentStateUnchecked"
            if (r3 == 0) goto L_0x0044
            android.graphics.drawable.Drawable r2 = r7.A04
            int[] r1 = r7.A09
            if (r1 != 0) goto L_0x0038
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r4)
            throw r0
        L_0x0038:
            int[] r0 = r7.A08
            if (r0 != 0) goto L_0x0041
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r5)
            throw r0
        L_0x0041:
            X.C90494aF.A0s(r3, r2, r1, r0, r6)
        L_0x0044:
            android.content.res.ColorStateList r3 = r7.A02
            if (r3 == 0) goto L_0x005f
            android.graphics.drawable.Drawable r2 = r7.A06
            int[] r1 = r7.A09
            if (r1 != 0) goto L_0x0053
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r4)
            throw r0
        L_0x0053:
            int[] r0 = r7.A08
            if (r0 != 0) goto L_0x005c
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r5)
            throw r0
        L_0x005c:
            X.C90494aF.A0s(r3, r2, r1, r0, r6)
        L_0x005f:
            android.content.res.ColorStateList r3 = r7.A01
            if (r3 == 0) goto L_0x000c
            android.graphics.drawable.Drawable r2 = r7.A05
            int[] r1 = r7.A09
            if (r1 != 0) goto L_0x006e
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r4)
            throw r0
        L_0x006e:
            int[] r0 = r7.A08
            if (r0 != 0) goto L_0x0077
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r5)
            throw r0
        L_0x0077:
            X.C90494aF.A0s(r3, r2, r1, r0, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.wds.components.toggle.WDSSwitch.A02():void");
    }

    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        C36361kB.A1I(onCreateDrawableState);
        int[] iArr = new int[r5];
        int i2 = 0;
        for (int i3 : onCreateDrawableState) {
            if (i3 != 16842912) {
                iArr[i2] = i3;
                i2++;
            }
        }
        this.A09 = iArr;
        int[] iArr2 = onCreateDrawableState;
        int i4 = 0;
        while (true) {
            if (i4 >= r5) {
                iArr2 = Arrays.copyOf(onCreateDrawableState, r5 + 1);
                AnonymousClass00C.A08(iArr2);
                iArr2[r5] = 16842912;
                break;
            } else if (onCreateDrawableState[i4] == 16842912) {
                break;
            } else if (onCreateDrawableState[i4] == 0) {
                iArr2 = (int[]) onCreateDrawableState.clone();
                iArr2[i4] = 16842912;
                break;
            } else {
                i4++;
            }
        }
        this.A08 = iArr2;
        return onCreateDrawableState;
    }

    public void setThumbDrawable(Drawable drawable) {
        this.A04 = drawable;
        A00();
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.A00 = colorStateList;
        A00();
    }

    public void setTrackDrawable(Drawable drawable) {
        this.A06 = drawable;
        A01();
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.A02 = colorStateList;
        A01();
    }

    public Drawable getThumbDrawable() {
        return this.A04;
    }

    public ColorStateList getThumbTintList() {
        return this.A00;
    }

    public Drawable getTrackDrawable() {
        return this.A06;
    }

    public ColorStateList getTrackTintList() {
        return this.A02;
    }

    public final C18820ts getWhatsAppLocale() {
        return this.A07;
    }

    public void invalidate() {
        A02();
        super.invalidate();
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        C120495rb r0 = this.A0A;
        int i3 = this.A03;
        try {
            Field field = r0.A01;
            if (field != null) {
                field.setInt(r0.A00, i3);
            }
        } catch (IllegalAccessException unused) {
        }
    }

    public void setThumbTintMode(PorterDuff.Mode mode) {
        super.setThumbTintMode(mode);
        A00();
    }

    public void setTrackTintMode(PorterDuff.Mode mode) {
        super.setTrackTintMode(mode);
        A01();
    }

    public final void setWhatsAppLocale(C18820ts r1) {
        this.A07 = r1;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public WDSSwitch(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.f4nameremoved);
        AnonymousClass00C.A0D(context, 1);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ WDSSwitch(Context context, AttributeSet attributeSet, int i, int i2, C05250Oz r7) {
        this(context, C36381kD.A0I(attributeSet, i2), (i2 & 4) != 0 ? R.attr.f4nameremoved : i);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public WDSSwitch(Context context) {
        this(context, (AttributeSet) null, R.attr.f4nameremoved);
        AnonymousClass00C.A0D(context, 1);
    }
}
