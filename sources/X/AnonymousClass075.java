package X;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import com.google.android.material.button.MaterialButton;
import com.whatsapp.R;

/* renamed from: X.075  reason: invalid class name */
public class AnonymousClass075 {
    public static final boolean A0K;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public ColorStateList A07;
    public ColorStateList A08;
    public ColorStateList A09;
    public PorterDuff.Mode A0A;
    public Drawable A0B;
    public LayerDrawable A0C;
    public AnonymousClass06J A0D;
    public boolean A0E = false;
    public boolean A0F;
    public boolean A0G = false;
    public boolean A0H = false;
    public boolean A0I = true;
    public final MaterialButton A0J;

    public static void A02(AnonymousClass075 r5) {
        int i;
        C012505l A002 = A00(r5, false);
        C012505l A003 = A00(r5, true);
        if (A002 != null) {
            ColorStateList colorStateList = r5.A09;
            A002.A01.A04 = (float) r5.A06;
            A002.invalidateSelf();
            A002.A0D(colorStateList);
            if (A003 != null) {
                float f = (float) r5.A06;
                if (r5.A0H) {
                    i = C014606i.A02(r5.A0J, R.attr.f4nameremoved);
                } else {
                    i = 0;
                }
                A003.A0A(i, f);
            }
        }
    }

    static {
        boolean z = true;
        if (Build.VERSION.SDK_INT > 22) {
            z = false;
        }
        A0K = z;
    }

    public static C012505l A00(AnonymousClass075 r1, boolean z) {
        LayerDrawable layerDrawable = r1.A0C;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (C012505l) ((LayerDrawable) ((InsetDrawable) r1.A0C.getDrawable(0)).getDrawable()).getDrawable(z ^ true ? 1 : 0);
    }

    public static void A01(AnonymousClass075 r10) {
        MaterialButton materialButton = r10.A0J;
        C012505l r8 = new C012505l(r10.A0D);
        r8.A0B(materialButton.getContext());
        AnonymousClass076.A01(r10.A07, r8);
        PorterDuff.Mode mode = r10.A0A;
        if (mode != null) {
            AnonymousClass076.A04(mode, r8);
        }
        ColorStateList colorStateList = r10.A09;
        r8.A01.A04 = (float) r10.A06;
        r8.invalidateSelf();
        r8.A0D(colorStateList);
        C012505l r7 = new C012505l(r10.A0D);
        r7.setTint(0);
        float f = (float) r10.A06;
        int i = 0;
        if (r10.A0H) {
            i = C014606i.A02(materialButton, R.attr.f4nameremoved);
        }
        r7.A0A(i, f);
        C012505l r1 = new C012505l(r10.A0D);
        r10.A0B = r1;
        AnonymousClass076.A06(r1, -1);
        RippleDrawable rippleDrawable = new RippleDrawable(C014906l.A02(r10.A08), new InsetDrawable(new LayerDrawable(new Drawable[]{r7, r8}), r10.A03, r10.A05, r10.A04, r10.A02), r10.A0B);
        r10.A0C = rippleDrawable;
        materialButton.setInternalBackground(rippleDrawable);
        C012505l A002 = A00(r10, false);
        if (A002 != null) {
            A002.A09((float) r10.A01);
            A002.setState(materialButton.getDrawableState());
        }
    }

    public static void A03(AnonymousClass075 r8, int i, int i2) {
        MaterialButton materialButton = r8.A0J;
        int A032 = AnonymousClass04F.A03(materialButton);
        int paddingTop = materialButton.getPaddingTop();
        int A022 = AnonymousClass04F.A02(materialButton);
        int paddingBottom = materialButton.getPaddingBottom();
        int i3 = r8.A05;
        int i4 = r8.A02;
        r8.A02 = i2;
        r8.A05 = i;
        if (!r8.A0E) {
            A01(r8);
        }
        AnonymousClass04F.A06(materialButton, A032, (paddingTop + i) - i3, A022, (paddingBottom + i2) - i4);
    }

    public C012405k A04() {
        Drawable drawable;
        LayerDrawable layerDrawable = this.A0C;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        int numberOfLayers = this.A0C.getNumberOfLayers();
        LayerDrawable layerDrawable2 = this.A0C;
        if (numberOfLayers > 2) {
            drawable = layerDrawable2.getDrawable(2);
        } else {
            drawable = layerDrawable2.getDrawable(1);
        }
        return (C012405k) drawable;
    }

    public void A05(AnonymousClass06J r6) {
        this.A0D = r6;
        if (!A0K || this.A0E) {
            if (A00(this, false) != null) {
                A00(this, false).setShapeAppearanceModel(r6);
            }
            if (A00(this, true) != null) {
                A00(this, true).setShapeAppearanceModel(r6);
            }
            if (A04() != null) {
                A04().setShapeAppearanceModel(r6);
                return;
            }
            return;
        }
        MaterialButton materialButton = this.A0J;
        int A032 = AnonymousClass04F.A03(materialButton);
        int paddingTop = materialButton.getPaddingTop();
        int A022 = AnonymousClass04F.A02(materialButton);
        int paddingBottom = materialButton.getPaddingBottom();
        A01(this);
        AnonymousClass04F.A06(materialButton, A032, paddingTop, A022, paddingBottom);
    }

    public AnonymousClass075(MaterialButton materialButton, AnonymousClass06J r3) {
        this.A0J = materialButton;
        this.A0D = r3;
    }
}
