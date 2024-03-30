package X;

import android.content.Context;
import android.graphics.Typeface;
import com.whatsapp.TextData;

/* renamed from: X.2g3  reason: invalid class name */
public final class AnonymousClass2g3 extends C36861lQ {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass2g3(Context context, Typeface typeface, TextData textData, C21060yb r13, AnonymousClass1H2 r14, C19890wg r15, String str) {
        super(context, typeface, textData, r13, r14, r15, C51352ng.ROUND, str);
        C36321k7.A12(r14, r13, r15);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001b, code lost:
        if (java.lang.Integer.valueOf(r1).intValue() != 0) goto L_0x001d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void draw(android.graphics.Canvas r7) {
        /*
            r6 = this;
            r0 = 0
            X.AnonymousClass00C.A0D(r7, r0)
            android.graphics.Rect r5 = r6.getBounds()
            X.AnonymousClass00C.A08(r5)
            android.graphics.Paint r4 = r6.A04
            com.whatsapp.TextData r0 = r6.A05
            if (r0 == 0) goto L_0x005a
            int r1 = r0.backgroundColor
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            int r0 = r0.intValue()
            if (r0 == 0) goto L_0x005a
        L_0x001d:
            X.C36401kF.A0z(r1, r4)
            int r0 = r5.centerX()
            float r3 = (float) r0
            int r0 = r5.centerY()
            float r2 = (float) r0
            int r0 = r5.width()
            int r0 = r0 / 2
            float r1 = (float) r0
            float r0 = r6.A00
            float r1 = r1 - r0
            r7.drawCircle(r3, r2, r1, r4)
            android.text.Layout r3 = r6.A01
            if (r3 == 0) goto L_0x0059
            int r1 = r5.width()
            int r0 = r3.getWidth()
            int r1 = r1 - r0
            int r0 = r1 / 2
            float r2 = (float) r0
            int r1 = r5.height()
            int r0 = r3.getHeight()
            int r1 = r1 - r0
            int r0 = r1 / 2
            float r0 = (float) r0
            r7.translate(r2, r0)
            r3.draw(r7)
        L_0x0059:
            return
        L_0x005a:
            r1 = 1711276032(0x66000000, float:1.5111573E23)
            goto L_0x001d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2g3.draw(android.graphics.Canvas):void");
    }
}
