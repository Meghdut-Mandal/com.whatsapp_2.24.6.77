package X;

import android.graphics.PointF;

/* renamed from: X.9fG  reason: invalid class name and case insensitive filesystem */
public class C199409fG {
    public C196189Yb A00;
    public Object A01;
    public final AnonymousClass9NP A02;

    public Object A00(AnonymousClass9NP r15) {
        Object obj;
        if (this instanceof AnonymousClass81M) {
            AnonymousClass81M r5 = (AnonymousClass81M) this;
            AnonymousClass9NP r8 = r5.A02;
            float f = r15.A04;
            float f2 = r15.A00;
            String str = ((C199049ec) r15.A06).A0B;
            String str2 = ((C199049ec) r15.A05).A0B;
            float f3 = r15.A02;
            float f4 = r15.A01;
            float f5 = r15.A03;
            r8.A04 = f;
            r8.A00 = f2;
            r8.A06 = str;
            r8.A05 = str2;
            r8.A02 = f3;
            r8.A01 = f4;
            r8.A03 = f5;
            String str3 = (String) r5.A03.A00(r8);
            if (r15.A01 == 1.0f) {
                obj = r15.A05;
            } else {
                obj = r15.A06;
            }
            C199049ec r0 = (C199049ec) obj;
            C199049ec r12 = r5.A01;
            String str4 = r0.A0A;
            float f6 = r0.A02;
            Integer num = r0.A09;
            int i = r0.A06;
            float f7 = r0.A01;
            float f8 = r0.A00;
            int i2 = r0.A04;
            int i3 = r0.A05;
            float f9 = r0.A03;
            boolean z = r0.A0C;
            PointF pointF = r0.A07;
            PointF pointF2 = r0.A08;
            r12.A0B = str3;
            r12.A0A = str4;
            r12.A02 = f6;
            r12.A09 = num;
            r12.A06 = i;
            r12.A01 = f7;
            r12.A00 = f8;
            r12.A04 = i2;
            r12.A05 = i3;
            r12.A03 = f9;
            r12.A0C = z;
            r12.A07 = pointF;
            r12.A08 = pointF2;
            return r12;
        } else if (this instanceof AnonymousClass81L) {
            Number number = (Number) ((AnonymousClass81L) this).A01.A00(r15);
            if (number == null) {
                return null;
            }
            return Float.valueOf(number.floatValue() * 2.55f);
        } else if (this instanceof AnonymousClass81K) {
            return ((AnonymousClass81K) this).A01.BIm(r15);
        } else {
            return this.A01;
        }
    }

    public final Object A01(Object obj, Object obj2, float f, float f2, float f3, float f4, float f5) {
        AnonymousClass9NP r0 = this.A02;
        r0.A04 = f;
        r0.A00 = f2;
        r0.A06 = obj;
        r0.A05 = obj2;
        r0.A02 = f3;
        r0.A01 = f4;
        r0.A03 = f5;
        return A00(r0);
    }

    public C199409fG(Object obj) {
        this.A02 = new AnonymousClass9NP();
        this.A01 = obj;
    }

    public C199409fG() {
        this.A02 = new AnonymousClass9NP();
        this.A01 = null;
    }
}
