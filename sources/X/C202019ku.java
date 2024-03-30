package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;

/* renamed from: X.9ku  reason: invalid class name and case insensitive filesystem */
public class C202019ku {
    public final C202069kz A00;
    public final C22870AxP A01;
    public final boolean A02;
    public final Paint A03;

    private boolean A01(int i) {
        if (i != 0) {
            AnonymousClass9N2[] r0 = this.A00.A0B;
            AnonymousClass9N2 r3 = r0[i];
            AnonymousClass9N2 r2 = r0[i - 1];
            if (r3.A05 != C023109s.A01 || !A02(r3)) {
                return r2.A04 == C187788yX.DISPOSE_TO_BACKGROUND && A02(r2);
            }
        }
        return true;
    }

    private void A00(Canvas canvas, AnonymousClass9N2 r10) {
        int i = r10.A02;
        int i2 = r10.A03;
        canvas.drawRect((float) i, (float) i2, (float) (i + r10.A01), (float) (i2 + r10.A00), this.A03);
    }

    private boolean A02(AnonymousClass9N2 r4) {
        if (r4.A02 == 0 && r4.A03 == 0) {
            int i = r4.A01;
            Rect rect = this.A00.A05;
            if (i == rect.width() && r4.A00 == rect.height()) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:75:0x0173  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x017c  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x01be  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A03(int r16, android.graphics.Bitmap r17) {
        /*
            r15 = this;
            boolean r0 = r15.A02
            r6 = r16
            r1 = r17
            if (r0 == 0) goto L_0x013f
            android.graphics.Canvas r7 = new android.graphics.Canvas
            r7.<init>(r1)
            X.9kz r5 = r15.A00
            X.B3Z r1 = r5.A06
            X.B3A r4 = r1.getFrame(r6)
            X.9N2 r10 = r1.getFrameInfo(r6)
            if (r16 != 0) goto L_0x001d
            r3 = 0
            goto L_0x0023
        L_0x001d:
            int r0 = r16 + -1
            X.9N2 r3 = r1.getFrameInfo(r0)
        L_0x0023:
            int r0 = r4.getWidth()     // Catch:{ all -> 0x013a }
            if (r0 <= 0) goto L_0x0136
            int r0 = r4.getHeight()     // Catch:{ all -> 0x013a }
            if (r0 <= 0) goto L_0x0136
            boolean r0 = r1.doesRenderSupportScaling()     // Catch:{ all -> 0x013a }
            if (r0 == 0) goto L_0x00d3
            int r11 = r1.getWidth()     // Catch:{ all -> 0x013a }
            int r1 = r1.getHeight()     // Catch:{ all -> 0x013a }
            float r6 = (float) r11     // Catch:{ all -> 0x013a }
            float r2 = (float) r1     // Catch:{ all -> 0x013a }
            int r9 = r4.getWidth()     // Catch:{ all -> 0x013a }
            int r8 = r4.getHeight()     // Catch:{ all -> 0x013a }
            int r14 = r4.getXOffset()     // Catch:{ all -> 0x013a }
            int r13 = r4.getYOffset()     // Catch:{ all -> 0x013a }
            int r0 = r7.getWidth()     // Catch:{ all -> 0x013a }
            float r0 = (float) r0     // Catch:{ all -> 0x013a }
            r12 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x0066
            int r0 = r7.getHeight()     // Catch:{ all -> 0x013a }
            float r0 = (float) r0     // Catch:{ all -> 0x013a }
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x0066
            r11 = 1065353216(0x3f800000, float:1.0)
            goto L_0x00a3
        L_0x0066:
            int r0 = r7.getWidth()     // Catch:{ all -> 0x013a }
            int r8 = java.lang.Math.min(r0, r11)     // Catch:{ all -> 0x013a }
            int r0 = r7.getHeight()     // Catch:{ all -> 0x013a }
            int r1 = java.lang.Math.min(r0, r1)     // Catch:{ all -> 0x013a }
            float r0 = r6 / r2
            if (r8 <= r1) goto L_0x007e
            float r12 = (float) r8     // Catch:{ all -> 0x013a }
            float r11 = r12 / r0
            goto L_0x0081
        L_0x007e:
            float r11 = (float) r1     // Catch:{ all -> 0x013a }
            float r12 = r11 * r0
        L_0x0081:
            float r12 = r12 / r6
            float r11 = r11 / r2
            int r0 = r4.getWidth()     // Catch:{ all -> 0x013a }
            int r9 = X.C165597tg.A03(r0, r12)     // Catch:{ all -> 0x013a }
            int r0 = r4.getHeight()     // Catch:{ all -> 0x013a }
            int r8 = X.C165597tg.A03(r0, r11)     // Catch:{ all -> 0x013a }
            int r0 = r4.getXOffset()     // Catch:{ all -> 0x013a }
            int r14 = X.C165597tg.A03(r0, r12)     // Catch:{ all -> 0x013a }
            int r0 = r4.getYOffset()     // Catch:{ all -> 0x013a }
            int r13 = X.C165597tg.A03(r0, r11)     // Catch:{ all -> 0x013a }
        L_0x00a3:
            r0 = 0
            android.graphics.Rect r6 = new android.graphics.Rect     // Catch:{ all -> 0x013a }
            r6.<init>(r0, r0, r9, r8)     // Catch:{ all -> 0x013a }
            int r1 = r14 + r9
            int r0 = r13 + r8
            android.graphics.Rect r2 = new android.graphics.Rect     // Catch:{ all -> 0x013a }
            r2.<init>(r14, r13, r1, r0)     // Catch:{ all -> 0x013a }
            if (r3 == 0) goto L_0x00b7
            X.C202069kz.A02(r7, r3, r5, r12, r11)     // Catch:{ all -> 0x013a }
        L_0x00b7:
            java.lang.Integer r1 = r10.A05     // Catch:{ all -> 0x013a }
            java.lang.Integer r0 = X.C023109s.A01     // Catch:{ all -> 0x013a }
            if (r1 != r0) goto L_0x00c2
            android.graphics.Paint r0 = r5.A02     // Catch:{ all -> 0x013a }
            r7.drawRect(r2, r0)     // Catch:{ all -> 0x013a }
        L_0x00c2:
            monitor-enter(r5)     // Catch:{ all -> 0x013a }
            android.graphics.Bitmap r1 = X.C202069kz.A00(r5, r9, r8)     // Catch:{ all -> 0x00d0 }
            r4.renderFrame(r9, r8, r1)     // Catch:{ all -> 0x00d0 }
            r0 = 0
            r7.drawBitmap(r1, r6, r2, r0)     // Catch:{ all -> 0x00d0 }
            monitor-exit(r5)     // Catch:{ all -> 0x00d0 }
            goto L_0x0136
        L_0x00d0:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x00d0 }
            goto L_0x0135
        L_0x00d3:
            android.graphics.Rect r1 = r5.A05     // Catch:{ all -> 0x013a }
            int r0 = r1.width()     // Catch:{ all -> 0x013a }
            if (r0 <= 0) goto L_0x0136
            int r0 = r1.height()     // Catch:{ all -> 0x013a }
            if (r0 <= 0) goto L_0x0136
            int r0 = r7.getWidth()     // Catch:{ all -> 0x013a }
            float r2 = (float) r0     // Catch:{ all -> 0x013a }
            int r0 = r1.width()     // Catch:{ all -> 0x013a }
            float r0 = (float) r0     // Catch:{ all -> 0x013a }
            float r2 = r2 / r0
            if (r3 == 0) goto L_0x00f1
            X.C202069kz.A02(r7, r3, r5, r2, r2)     // Catch:{ all -> 0x013a }
        L_0x00f1:
            int r8 = r4.getWidth()     // Catch:{ all -> 0x013a }
            int r6 = r4.getHeight()     // Catch:{ all -> 0x013a }
            r0 = 0
            android.graphics.Rect r3 = new android.graphics.Rect     // Catch:{ all -> 0x013a }
            r3.<init>(r0, r0, r8, r6)     // Catch:{ all -> 0x013a }
            float r0 = (float) r8     // Catch:{ all -> 0x013a }
            float r0 = r0 * r2
            int r11 = (int) r0     // Catch:{ all -> 0x013a }
            float r0 = (float) r6     // Catch:{ all -> 0x013a }
            float r0 = r0 * r2
            int r9 = (int) r0     // Catch:{ all -> 0x013a }
            int r0 = r4.getXOffset()     // Catch:{ all -> 0x013a }
            float r0 = (float) r0     // Catch:{ all -> 0x013a }
            float r0 = r0 * r2
            int r1 = (int) r0     // Catch:{ all -> 0x013a }
            int r0 = r4.getYOffset()     // Catch:{ all -> 0x013a }
            float r0 = (float) r0     // Catch:{ all -> 0x013a }
            float r0 = r0 * r2
            int r0 = (int) r0     // Catch:{ all -> 0x013a }
            int r11 = r11 + r1
            int r9 = r9 + r0
            android.graphics.Rect r2 = new android.graphics.Rect     // Catch:{ all -> 0x013a }
            r2.<init>(r1, r0, r11, r9)     // Catch:{ all -> 0x013a }
            java.lang.Integer r1 = r10.A05     // Catch:{ all -> 0x013a }
            java.lang.Integer r0 = X.C023109s.A01     // Catch:{ all -> 0x013a }
            if (r1 != r0) goto L_0x0125
            android.graphics.Paint r0 = r5.A02     // Catch:{ all -> 0x013a }
            r7.drawRect(r2, r0)     // Catch:{ all -> 0x013a }
        L_0x0125:
            monitor-enter(r5)     // Catch:{ all -> 0x013a }
            android.graphics.Bitmap r1 = X.C202069kz.A00(r5, r8, r6)     // Catch:{ all -> 0x0133 }
            r4.renderFrame(r8, r6, r1)     // Catch:{ all -> 0x0133 }
            r0 = 0
            r7.drawBitmap(r1, r3, r2, r0)     // Catch:{ all -> 0x0133 }
            monitor-exit(r5)     // Catch:{ all -> 0x0133 }
            goto L_0x0136
        L_0x0133:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0133 }
        L_0x0135:
            throw r0     // Catch:{ all -> 0x013a }
        L_0x0136:
            r4.dispose()
            return
        L_0x013a:
            r0 = move-exception
            r4.dispose()
            throw r0
        L_0x013f:
            android.graphics.Canvas r5 = new android.graphics.Canvas
            r5.<init>(r1)
            r2 = 0
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.SRC
            r5.drawColor(r2, r0)
            boolean r0 = r15.A01(r6)
            r7 = r6
            if (r0 != 0) goto L_0x01bc
            int r7 = r16 + -1
        L_0x0153:
            if (r7 < 0) goto L_0x01b5
            X.9kz r0 = r15.A00
            X.9N2[] r4 = r0.A0B
            r3 = r4[r7]
            X.8yX r1 = r3.A04
            X.8yX r0 = X.C187788yX.DISPOSE_DO_NOT
            if (r1 == r0) goto L_0x0198
            X.8yX r0 = X.C187788yX.DISPOSE_TO_BACKGROUND
            if (r1 != r0) goto L_0x018e
            boolean r0 = r15.A02(r3)
            if (r0 == 0) goto L_0x0198
            java.lang.Integer r0 = X.C023109s.A01
        L_0x016d:
            int r1 = r0.intValue()
            if (r1 == r2) goto L_0x017c
            r0 = 1
            if (r1 == r0) goto L_0x01dd
            r0 = 3
            if (r1 == r0) goto L_0x01bc
        L_0x0179:
            int r7 = r7 + -1
            goto L_0x0153
        L_0x017c:
            r4 = r4[r7]
            X.AxP r0 = r15.A01
            X.AU0 r3 = r0.B98(r7)
            if (r3 == 0) goto L_0x0187
            goto L_0x019b
        L_0x0187:
            boolean r0 = r15.A01(r7)
            if (r0 == 0) goto L_0x0179
            goto L_0x01bc
        L_0x018e:
            X.8yX r0 = X.C187788yX.DISPOSE_TO_PREVIOUS
            if (r1 != r0) goto L_0x0195
            java.lang.Integer r0 = X.C023109s.A0C
            goto L_0x016d
        L_0x0195:
            java.lang.Integer r0 = X.C023109s.A0G
            goto L_0x016d
        L_0x0198:
            java.lang.Integer r0 = X.C023109s.A00
            goto L_0x016d
        L_0x019b:
            java.lang.Object r2 = r3.A01()     // Catch:{ all -> 0x01b0 }
            android.graphics.Bitmap r2 = (android.graphics.Bitmap) r2     // Catch:{ all -> 0x01b0 }
            r1 = 0
            r0 = 0
            r5.drawBitmap(r2, r0, r0, r1)     // Catch:{ all -> 0x01b0 }
            X.8yX r1 = r4.A04     // Catch:{ all -> 0x01b0 }
            X.8yX r0 = X.C187788yX.DISPOSE_TO_BACKGROUND     // Catch:{ all -> 0x01b0 }
            if (r1 != r0) goto L_0x01b7
            r15.A00(r5, r4)     // Catch:{ all -> 0x01b0 }
            goto L_0x01b7
        L_0x01b0:
            r0 = move-exception
            r3.close()
            throw r0
        L_0x01b5:
            r7 = 0
            goto L_0x01bc
        L_0x01b7:
            int r7 = r7 + 1
            r3.close()
        L_0x01bc:
            if (r7 >= r6) goto L_0x01e0
            X.9kz r4 = r15.A00
            X.9N2[] r0 = r4.A0B
            r3 = r0[r7]
            X.8yX r2 = r3.A04
            X.8yX r0 = X.C187788yX.DISPOSE_TO_PREVIOUS
            if (r2 == r0) goto L_0x01dd
            java.lang.Integer r1 = r3.A05
            java.lang.Integer r0 = X.C023109s.A01
            if (r1 != r0) goto L_0x01d3
            r15.A00(r5, r3)
        L_0x01d3:
            r4.A03(r5, r7)
            X.8yX r0 = X.C187788yX.DISPOSE_TO_BACKGROUND
            if (r2 != r0) goto L_0x01dd
            r15.A00(r5, r3)
        L_0x01dd:
            int r7 = r7 + 1
            goto L_0x01bc
        L_0x01e0:
            X.9kz r3 = r15.A00
            X.9N2[] r0 = r3.A0B
            r2 = r0[r16]
            java.lang.Integer r1 = r2.A05
            java.lang.Integer r0 = X.C023109s.A01
            if (r1 != r0) goto L_0x01ef
            r15.A00(r5, r2)
        L_0x01ef:
            r3.A03(r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C202019ku.A03(int, android.graphics.Bitmap):void");
    }

    public C202019ku(C202069kz r3, C22870AxP axP, boolean z) {
        this.A00 = r3;
        this.A01 = axP;
        this.A02 = z;
        Paint paint = new Paint();
        this.A03 = paint;
        paint.setColor(0);
        paint.setStyle(Paint.Style.FILL);
        C165587tf.A0v(paint, PorterDuff.Mode.SRC);
    }
}
