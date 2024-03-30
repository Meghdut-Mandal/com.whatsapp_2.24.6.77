package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuffColorFilter;
import java.util.ArrayList;
import java.util.EnumSet;

/* renamed from: X.4qJ  reason: invalid class name and case insensitive filesystem */
public class C97814qJ extends C97644q2 {
    public static Bitmap A04;
    public static PorterDuffColorFilter A05;
    public static AnonymousClass6TZ A06;
    public static final ArrayList A07 = C36441kJ.A14(5);
    public int A00;
    public EnumSet A01;
    public final Paint A02;
    public final C97694q7 A03;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C97814qJ(X.C139266jV r19, X.C97694q7 r20) {
        /*
            r18 = this;
            X.5ha r3 = new X.5ha
            r3.<init>()
            r4 = r20
            r3.A00 = r4
            r1 = 0
            X.6TZ r0 = A06
            if (r0 != 0) goto L_0x0015
            X.6TZ r0 = new X.6TZ
            r0.<init>()
            A06 = r0
        L_0x0015:
            r2 = r18
            r5 = r19
            r2.<init>(r5, r0, r3)
            r0 = 3
            android.graphics.Paint r0 = X.C36441kJ.A0L(r0)
            r2.A02 = r0
            r0 = 1
            r2.A00 = r0
            r2.A03 = r1
            r2.A03 = r4
            X.5yJ r0 = r4.A03
            boolean r0 = r0.A06
            if (r0 == 0) goto L_0x00a9
            java.lang.String r0 = "dark"
        L_0x0032:
            r4.A01 = r0
            X.6jV r1 = r2.A07
            X.4ej r0 = r1.A0Q
            java.util.EnumSet r0 = r0.A0g
            r2.A01 = r0
            X.4q8 r0 = new X.4q8
            r0.<init>(r2)
            r2.A08 = r0
            android.graphics.Bitmap r0 = A04
            if (r0 != 0) goto L_0x00ab
            int r3 = r1.A0N
            android.content.Context r0 = r1.A0O
            android.util.DisplayMetrics r0 = X.AnonymousClass000.A0X(r0)
            int r1 = r0.densityDpi
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ALPHA_8
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r3, r3, r0)
            A04 = r0
            android.graphics.Canvas r4 = X.C90524aI.A0A(r0)
            r0 = 320(0x140, float:4.48E-43)
            r2 = 16
            if (r1 < r0) goto L_0x0065
            r2 = 32
        L_0x0065:
            android.graphics.Paint r9 = X.C36441kJ.A0K()
            r0 = -7235677(0xffffffffff9197a3, float:NaN)
            r9.setColor(r0)
            r6 = 0
            r5 = 0
        L_0x0071:
            float r8 = (float) r3
            int r0 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r0 > 0) goto L_0x00ab
            int r0 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x0080
            int r1 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            r0 = 18
            if (r1 != 0) goto L_0x0082
        L_0x0080:
            r0 = 44
        L_0x0082:
            r9.setAlpha(r0)
            r7 = r5
            r4.drawLine(r5, r6, r7, r8, r9)
            r0 = 1065353216(0x3f800000, float:1.0)
            float r11 = r5 - r0
            r12 = 0
            r10 = r4
            r13 = r11
            r14 = r8
            r15 = r9
            r10.drawLine(r11, r12, r13, r14, r15)
            r13 = 0
            r16 = r5
            r12 = r4
            r14 = r5
            r15 = r8
            r17 = r9
            r12.drawLine(r13, r14, r15, r16, r17)
            r16 = r11
            r14 = r11
            r12.drawLine(r13, r14, r15, r16, r17)
            float r0 = (float) r2
            float r5 = r5 + r0
            goto L_0x0071
        L_0x00a9:
            r0 = 0
            goto L_0x0032
        L_0x00ab:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C97814qJ.<init>(X.6jV, X.4q7):void");
    }

    public static void A00(int[] iArr) {
        ArrayList arrayList = A07;
        int size = arrayList.size();
        if (size == 0) {
            iArr[0] = 0;
            iArr[1] = 0;
            return;
        }
        double max = Math.max(1.6d - (((double) size) * 0.1d), 1.1d);
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += ((C97654q3) arrayList.get(i2)).A07;
        }
        int i3 = ((int) (((double) i) * max)) + 1;
        iArr[0] = i3;
        iArr[1] = Math.max((i3 - i) - 1, 1);
    }

    public void A06(Canvas canvas) {
        long nanoTime = System.nanoTime();
        super.A06(canvas);
        AnonymousClass6TY.A02(AnonymousClass6TY.A0F, nanoTime);
    }

    public AnonymousClass6VI A07(int i, int i2, int i3) {
        AnonymousClass6VI A072 = super.A07(i, i2, i3);
        if (A072 != null) {
            A072.A02 = i;
            A072.A03 = i2;
            A072.A04 = i3;
        }
        return A072;
    }

    public void A08() {
        super.A08();
        this.A07 = 0;
        ArrayList arrayList = A07;
        arrayList.remove(this);
        if (arrayList.isEmpty()) {
            AnonymousClass6TZ r1 = this.A09;
            if (r1.A03 != -1) {
                r1.A03 = -1;
            }
        }
        int[] iArr = this.A0B;
        A00(iArr);
        AnonymousClass6TZ r12 = this.A09;
        r12.A01 = iArr[0];
        r12.A02 = iArr[1];
        r12.A02();
    }
}
