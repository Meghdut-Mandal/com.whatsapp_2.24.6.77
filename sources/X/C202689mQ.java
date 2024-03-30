package X;

import android.graphics.PointF;
import android.view.animation.Interpolator;

/* renamed from: X.9mQ  reason: invalid class name and case insensitive filesystem */
public class C202689mQ {
    public float A00;
    public float A01;
    public float A02;
    public int A03;
    public int A04;
    public PointF A05;
    public PointF A06;
    public Float A07;
    public Object A08;
    public float A09;
    public final float A0A;
    public final Interpolator A0B;
    public final Interpolator A0C;
    public final Interpolator A0D;
    public final Object A0E;
    public final AnonymousClass9Y2 A0F;

    public float A01() {
        AnonymousClass9Y2 r4 = this.A0F;
        if (r4 == null) {
            return 1.0f;
        }
        float f = this.A09;
        if (f != Float.MIN_VALUE) {
            return f;
        }
        Float f2 = this.A07;
        if (f2 == null) {
            this.A09 = 1.0f;
            return 1.0f;
        }
        float A022 = A02() + ((f2.floatValue() - this.A0A) / (r4.A00 - r4.A02));
        this.A09 = A022;
        return A022;
    }

    public float A02() {
        AnonymousClass9Y2 r3 = this.A0F;
        if (r3 == null) {
            return 0.0f;
        }
        float f = this.A01;
        if (f != Float.MIN_VALUE) {
            return f;
        }
        float f2 = this.A0A;
        float f3 = r3.A02;
        float f4 = (f2 - f3) / (r3.A00 - f3);
        this.A01 = f4;
        return f4;
    }

    public boolean A03() {
        if (this.A0B == null && this.A0C == null && this.A0D == null) {
            return true;
        }
        return false;
    }

    public C202689mQ(Object obj, Object obj2) {
        float A002 = A00(this);
        this.A09 = A002;
        this.A05 = null;
        this.A06 = null;
        this.A0F = null;
        this.A0E = obj;
        this.A08 = obj2;
        this.A0B = null;
        this.A0C = null;
        this.A0D = null;
        this.A0A = A002;
        this.A07 = Float.valueOf(Float.MAX_VALUE);
    }

    public static float A00(C202689mQ r1) {
        r1.A02 = -3987645.8f;
        r1.A00 = -3987645.8f;
        r1.A04 = 784923401;
        r1.A03 = 784923401;
        r1.A01 = Float.MIN_VALUE;
        return Float.MIN_VALUE;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Keyframe{startValue=");
        A0u.append(this.A0E);
        A0u.append(", endValue=");
        A0u.append(this.A08);
        A0u.append(", startFrame=");
        A0u.append(this.A0A);
        A0u.append(", endFrame=");
        A0u.append(this.A07);
        A0u.append(", interpolator=");
        return C90464aC.A0X(this.A0B, A0u);
    }

    public C202689mQ(Object obj) {
        float A002 = A00(this);
        this.A09 = A002;
        this.A05 = null;
        this.A06 = null;
        this.A0F = null;
        this.A0E = obj;
        this.A08 = obj;
        this.A0B = null;
        this.A0C = null;
        this.A0D = null;
        this.A0A = A002;
        this.A07 = Float.valueOf(Float.MAX_VALUE);
    }

    public C202689mQ(Interpolator interpolator, Interpolator interpolator2, Interpolator interpolator3, AnonymousClass9Y2 r5, Float f, Object obj, Object obj2, float f2) {
        this.A09 = A00(this);
        this.A05 = null;
        this.A06 = null;
        this.A0F = r5;
        this.A0E = obj;
        this.A08 = obj2;
        this.A0B = interpolator;
        this.A0C = interpolator2;
        this.A0D = interpolator3;
        this.A0A = f2;
        this.A07 = f;
    }

    public C202689mQ(Interpolator interpolator, AnonymousClass9Y2 r3, Float f, Object obj, Object obj2, float f2) {
        this.A09 = A00(this);
        this.A05 = null;
        this.A06 = null;
        this.A0F = r3;
        this.A0E = obj;
        this.A08 = obj2;
        this.A0B = interpolator;
        this.A0C = null;
        this.A0D = null;
        this.A0A = f2;
        this.A07 = f;
    }

    public C202689mQ(Interpolator interpolator, Interpolator interpolator2, AnonymousClass9Y2 r5, Object obj, Object obj2, float f) {
        this.A09 = A00(this);
        this.A05 = null;
        this.A06 = null;
        this.A0F = r5;
        this.A0E = obj;
        this.A08 = obj2;
        this.A0B = null;
        this.A0C = interpolator;
        this.A0D = interpolator2;
        this.A0A = f;
        this.A07 = null;
    }
}
