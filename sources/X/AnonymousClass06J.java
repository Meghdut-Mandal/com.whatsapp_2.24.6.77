package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;

/* renamed from: X.06J  reason: invalid class name */
public class AnonymousClass06J {
    public static final AnonymousClass06K A0C = new AnonymousClass06L(0.5f);
    public AnonymousClass06Q A00;
    public AnonymousClass06Q A01;
    public AnonymousClass06Q A02;
    public AnonymousClass06Q A03;
    public AnonymousClass06K A04;
    public AnonymousClass06K A05;
    public AnonymousClass06K A06;
    public AnonymousClass06K A07;
    public AnonymousClass06N A08;
    public AnonymousClass06N A09;
    public AnonymousClass06N A0A;
    public AnonymousClass06N A0B;

    public static AnonymousClass06M A01(Context context, AttributeSet attributeSet, int i, int i2) {
        return A02(context, attributeSet, new AnonymousClass06P((float) 0), i, i2);
    }

    public static AnonymousClass06M A02(Context context, AttributeSet attributeSet, AnonymousClass06K r6, int i, int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C27931Qk.A0P, i, i2);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
        return A03(context, r6, resourceId, resourceId2);
    }

    public static AnonymousClass06M A03(Context context, AnonymousClass06K r11, int i, int i2) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i);
        if (i2 != 0) {
            contextThemeWrapper = new ContextThemeWrapper(contextThemeWrapper, i2);
        }
        TypedArray obtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(C27931Qk.A0Y);
        try {
            int i3 = obtainStyledAttributes.getInt(0, 0);
            int i4 = obtainStyledAttributes.getInt(3, i3);
            int i5 = obtainStyledAttributes.getInt(4, i3);
            int i6 = obtainStyledAttributes.getInt(2, i3);
            int i7 = obtainStyledAttributes.getInt(1, i3);
            AnonymousClass06K A002 = A00(obtainStyledAttributes, r11, 5);
            AnonymousClass06K A003 = A00(obtainStyledAttributes, A002, 8);
            AnonymousClass06K A004 = A00(obtainStyledAttributes, A002, 9);
            AnonymousClass06K A005 = A00(obtainStyledAttributes, A002, 7);
            AnonymousClass06K A006 = A00(obtainStyledAttributes, A002, 6);
            AnonymousClass06M r1 = new AnonymousClass06M();
            r1.A06 = AnonymousClass06R.A00(i4);
            r1.A02 = A003;
            r1.A07 = AnonymousClass06R.A00(i5);
            r1.A03 = A004;
            r1.A05 = AnonymousClass06R.A00(i6);
            r1.A01 = A005;
            r1.A04 = AnonymousClass06R.A00(i7);
            r1.A00 = A006;
            return r1;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public AnonymousClass06J A04(float f) {
        AnonymousClass06M r1 = new AnonymousClass06M(this);
        r1.A00(f);
        return new AnonymousClass06J(r1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0058, code lost:
        if (r5.A05.BAD(r6) != r1) goto L_0x005a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0072, code lost:
        if ((r5.A08 instanceof X.AnonymousClass06O) == false) goto L_0x0074;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0032, code lost:
        if (r5.A00.getClass().equals(r1) == false) goto L_0x0034;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A05(android.graphics.RectF r6) {
        /*
            r5 = this;
            X.06Q r0 = r5.A01
            java.lang.Class r0 = r0.getClass()
            java.lang.Class<X.06Q> r1 = X.AnonymousClass06Q.class
            boolean r0 = r0.equals(r1)
            r4 = 1
            if (r0 == 0) goto L_0x0034
            X.06Q r0 = r5.A02
            java.lang.Class r0 = r0.getClass()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0034
            X.06Q r0 = r5.A03
            java.lang.Class r0 = r0.getClass()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0034
            X.06Q r0 = r5.A00
            java.lang.Class r0 = r0.getClass()
            boolean r0 = r0.equals(r1)
            r3 = 1
            if (r0 != 0) goto L_0x0035
        L_0x0034:
            r3 = 0
        L_0x0035:
            X.06K r0 = r5.A06
            float r1 = r0.BAD(r6)
            X.06K r0 = r5.A07
            float r0 = r0.BAD(r6)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x005a
            X.06K r0 = r5.A04
            float r0 = r0.BAD(r6)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x005a
            X.06K r0 = r5.A05
            float r0 = r0.BAD(r6)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r2 = 1
            if (r0 == 0) goto L_0x005b
        L_0x005a:
            r2 = 0
        L_0x005b:
            X.06N r0 = r5.A0B
            boolean r0 = r0 instanceof X.AnonymousClass06O
            if (r0 == 0) goto L_0x0074
            X.06N r0 = r5.A0A
            boolean r0 = r0 instanceof X.AnonymousClass06O
            if (r0 == 0) goto L_0x0074
            X.06N r0 = r5.A09
            boolean r0 = r0 instanceof X.AnonymousClass06O
            if (r0 == 0) goto L_0x0074
            X.06N r0 = r5.A08
            boolean r1 = r0 instanceof X.AnonymousClass06O
            r0 = 1
            if (r1 != 0) goto L_0x0075
        L_0x0074:
            r0 = 0
        L_0x0075:
            if (r3 == 0) goto L_0x007c
            if (r2 == 0) goto L_0x007c
            if (r0 == 0) goto L_0x007c
            return r4
        L_0x007c:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass06J.A05(android.graphics.RectF):boolean");
    }

    public AnonymousClass06J(AnonymousClass06M r2) {
        this.A0A = r2.A06;
        this.A0B = r2.A07;
        this.A09 = r2.A05;
        this.A08 = r2.A04;
        this.A06 = r2.A02;
        this.A07 = r2.A03;
        this.A05 = r2.A01;
        this.A04 = r2.A00;
        this.A03 = r2.A0B;
        this.A02 = r2.A0A;
        this.A00 = r2.A08;
        this.A01 = r2.A09;
    }

    public static AnonymousClass06K A00(TypedArray typedArray, AnonymousClass06K r4, int i) {
        TypedValue peekValue = typedArray.peekValue(i);
        if (peekValue == null) {
            return r4;
        }
        int i2 = peekValue.type;
        if (i2 == 5) {
            return new AnonymousClass06P((float) TypedValue.complexToDimensionPixelSize(peekValue.data, typedArray.getResources().getDisplayMetrics()));
        }
        if (i2 == 6) {
            return new AnonymousClass06L(peekValue.getFraction(1.0f, 1.0f));
        }
        return r4;
    }

    public AnonymousClass06J() {
        this.A0A = new AnonymousClass06O();
        this.A0B = new AnonymousClass06O();
        this.A09 = new AnonymousClass06O();
        this.A08 = new AnonymousClass06O();
        this.A06 = new AnonymousClass06P(0.0f);
        this.A07 = new AnonymousClass06P(0.0f);
        this.A05 = new AnonymousClass06P(0.0f);
        this.A04 = new AnonymousClass06P(0.0f);
        this.A03 = new AnonymousClass06Q();
        this.A02 = new AnonymousClass06Q();
        this.A00 = new AnonymousClass06Q();
        this.A01 = new AnonymousClass06Q();
    }
}
