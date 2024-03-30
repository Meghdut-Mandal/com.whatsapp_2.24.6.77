package X;

import android.util.Property;
import android.view.View;

/* renamed from: X.0XA  reason: invalid class name */
public class AnonymousClass0XA {
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;
    public final float A04;
    public final float A05;
    public final float A06;
    public final float A07;

    public void A01(View view) {
        float f = this.A05;
        float f2 = this.A06;
        float f3 = this.A07;
        float f4 = this.A03;
        float f5 = this.A04;
        float f6 = this.A00;
        float f7 = this.A01;
        float f8 = this.A02;
        Property property = AnonymousClass0IP.A01;
        view.setTranslationX(f);
        view.setTranslationY(f2);
        C011004s.A06(view, f3);
        view.setScaleX(f4);
        view.setScaleY(f5);
        view.setRotationX(f6);
        view.setRotationY(f7);
        view.setRotation(f8);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AnonymousClass0XA)) {
            return false;
        }
        AnonymousClass0XA r4 = (AnonymousClass0XA) obj;
        if (r4.A05 == this.A05 && r4.A06 == this.A06 && r4.A07 == this.A07 && r4.A03 == this.A03 && r4.A04 == this.A04 && r4.A00 == this.A00 && r4.A01 == this.A01 && r4.A02 == this.A02) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        float f = this.A05;
        int i8 = 0;
        if (f != 0.0f) {
            i = Float.floatToIntBits(f);
        } else {
            i = 0;
        }
        int i9 = i * 31;
        float f2 = this.A06;
        if (f2 != 0.0f) {
            i2 = Float.floatToIntBits(f2);
        } else {
            i2 = 0;
        }
        int i10 = (i9 + i2) * 31;
        float f3 = this.A07;
        if (f3 != 0.0f) {
            i3 = Float.floatToIntBits(f3);
        } else {
            i3 = 0;
        }
        int i11 = (i10 + i3) * 31;
        float f4 = this.A03;
        if (f4 != 0.0f) {
            i4 = Float.floatToIntBits(f4);
        } else {
            i4 = 0;
        }
        int i12 = (i11 + i4) * 31;
        float f5 = this.A04;
        if (f5 != 0.0f) {
            i5 = Float.floatToIntBits(f5);
        } else {
            i5 = 0;
        }
        int i13 = (i12 + i5) * 31;
        float f6 = this.A00;
        if (f6 != 0.0f) {
            i6 = Float.floatToIntBits(f6);
        } else {
            i6 = 0;
        }
        int i14 = (i13 + i6) * 31;
        float f7 = this.A01;
        if (f7 != 0.0f) {
            i7 = Float.floatToIntBits(f7);
        } else {
            i7 = 0;
        }
        int i15 = (i14 + i7) * 31;
        float f8 = this.A02;
        if (f8 != 0.0f) {
            i8 = Float.floatToIntBits(f8);
        }
        return i15 + i8;
    }

    public AnonymousClass0XA(View view) {
        this.A05 = view.getTranslationX();
        this.A06 = view.getTranslationY();
        this.A07 = A00(view);
        this.A03 = view.getScaleX();
        this.A04 = view.getScaleY();
        this.A00 = view.getRotationX();
        this.A01 = view.getRotationY();
        this.A02 = view.getRotation();
    }

    public static float A00(View view) {
        return view.getTranslationZ();
    }
}
