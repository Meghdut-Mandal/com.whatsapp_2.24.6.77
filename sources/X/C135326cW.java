package X;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import com.whatsapp.mediacomposer.doodle.DoodleView;

/* renamed from: X.6cW  reason: invalid class name and case insensitive filesystem */
public class C135326cW implements GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener, ScaleGestureDetector.OnScaleGestureListener {
    public final GestureDetector.OnGestureListener A00;
    public final C06360Th A01;
    public final C162047nw A02;
    public final DoodleView A03;
    public final AnonymousClass6LZ A04;
    public final C130426La A05;
    public final C122655vD A06 = new C122655vD(this);
    public final C92144dC A07;
    public final C117465mJ A08;
    public final AnonymousClass6FV A09;

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0045, code lost:
        if (((r0 * r0) + (r2 * r2)) <= (r1 * r1)) goto L_0x0047;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean A00(float r8, float r9) {
        /*
            r7 = this;
            X.6FV r1 = r7.A09
            r0 = 0
            r1.A02 = r0
            r1.A00 = r0
            X.6Ft r4 = r1.A01
            X.7nw r0 = r7.A02
            X.6w2 r0 = (X.C146706w2) r0
            X.6wC r5 = r0.A01
            X.6FL r6 = r5.A0I
            boolean r0 = r6 instanceof X.C162857pG
            if (r0 == 0) goto L_0x0054
            X.7pG r6 = (X.C162857pG) r6
            int r0 = r6.A01
            int r0 = 1 - r0
            if (r0 != 0) goto L_0x0054
            if (r4 == 0) goto L_0x0047
            java.lang.Object r0 = r6.A00
            com.whatsapp.mediacomposer.VideoComposerFragment r0 = (com.whatsapp.mediacomposer.VideoComposerFragment) r0
            android.view.View r3 = r0.A07
            r2 = 0
            if (r3 == 0) goto L_0x0052
            float r1 = X.C36441kJ.A02(r3)
        L_0x002c:
            r0 = 2
            float r0 = (float) r0
            float r1 = r1 / r0
            if (r3 == 0) goto L_0x0050
            float r0 = r3.getX()
        L_0x0035:
            float r0 = r0 + r1
            if (r3 == 0) goto L_0x003c
            float r2 = r3.getY()
        L_0x003c:
            float r2 = r2 + r1
            float r0 = r0 - r8
            float r2 = r2 - r9
            float r0 = r0 * r0
            float r2 = r2 * r2
            float r0 = r0 + r2
            float r1 = r1 * r1
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0054
        L_0x0047:
            java.lang.Object r0 = r6.A00
            com.whatsapp.mediacomposer.VideoComposerFragment r0 = (com.whatsapp.mediacomposer.VideoComposerFragment) r0
            com.whatsapp.mediacomposer.VideoComposerFragment.A0A(r0)
        L_0x004e:
            r1 = 1
        L_0x004f:
            return r1
        L_0x0050:
            r0 = 0
            goto L_0x0035
        L_0x0052:
            r1 = 0
            goto L_0x002c
        L_0x0054:
            boolean r0 = r4 instanceof X.AnonymousClass5Cl
            if (r0 == 0) goto L_0x008a
            X.6Fh r1 = r5.A0V
            r0 = 3
            r1.A07(r0)
            r0 = r4
            X.5Cl r0 = (X.AnonymousClass5Cl) r0
            X.C146806wC.A05(r5, r0)
        L_0x0064:
            r1 = 0
            if (r4 == 0) goto L_0x004f
            boolean r0 = r4 instanceof X.AnonymousClass5CY
            if (r0 == 0) goto L_0x0078
            X.5CY r4 = (X.AnonymousClass5CY) r4
            X.66R r0 = r4.A0L
        L_0x006f:
            X.C111055bf.A00(r0)
            com.whatsapp.mediacomposer.doodle.DoodleView r0 = r7.A03
            r0.invalidate()
            goto L_0x004e
        L_0x0078:
            boolean r0 = r4 instanceof X.AnonymousClass5Co
            if (r0 == 0) goto L_0x0081
            X.5Co r4 = (X.AnonymousClass5Co) r4
            X.66R r0 = r4.A0C
            goto L_0x006f
        L_0x0081:
            boolean r0 = r4 instanceof X.C104965Cn
            if (r0 == 0) goto L_0x004f
            X.5Cn r4 = (X.C104965Cn) r4
            X.66R r0 = r4.A0D
            goto L_0x006f
        L_0x008a:
            if (r4 == 0) goto L_0x0064
            boolean r0 = r4.A0N()
            if (r0 == 0) goto L_0x0064
            X.6Fh r1 = r5.A0V
            android.graphics.Paint r0 = r4.A01
            int r0 = r0.getColor()
            r1.A02 = r0
            r0 = 2
            r1.A07(r0)
            com.whatsapp.mediacomposer.doodle.ColorPickerComponent r0 = r5.A0K
            r0.A02()
            goto L_0x0064
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C135326cW.A00(float, float):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:51:0x011f, code lost:
        if (r5.A01 != 2) goto L_0x0121;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0131, code lost:
        if (r5.A01 != 0) goto L_0x0121;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01(android.graphics.PointF r18, android.graphics.PointF r19) {
        /*
            r17 = this;
            r4 = r18
            r0 = r17
            X.6LZ r6 = r0.A04
            X.6Ft r0 = r6.A00
            if (r0 == 0) goto L_0x001b
            boolean r0 = r0 instanceof X.AnonymousClass5Ci
            if (r0 != 0) goto L_0x001b
            float r0 = r4.x
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x001c
            float r0 = r4.y
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x001c
        L_0x001b:
            return
        L_0x001c:
            X.AnonymousClass6LZ.A00(r6)
            X.66p r3 = r6.A04
            X.6Ft r0 = r6.A00
            android.graphics.RectF r0 = r0.A02
            float r2 = r0.centerX()
            float r1 = r0.centerY()
            android.graphics.PointF r0 = new android.graphics.PointF
            r0.<init>(r2, r1)
            android.graphics.PointF r14 = r3.A01(r0)
            X.6OT r0 = r6.A03
            float r1 = r0.A01
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x01a1
            X.6NQ r13 = r6.A05
            X.6Ft r12 = r6.A00
            X.6Ft r0 = r13.A04
            if (r0 == r12) goto L_0x004d
            r13.A04 = r12
            X.AnonymousClass6NQ.A00(r13)
        L_0x004d:
            float r11 = r4.x
            float r15 = r4.y
            android.graphics.RectF r0 = r13.A02
            r16 = r0
            float r1 = r16.centerX()
            float r0 = r16.centerY()
            android.graphics.PointF r10 = new android.graphics.PointF
            r10.<init>(r1, r0)
            boolean r0 = r13.A06
            if (r0 == 0) goto L_0x019c
            float r1 = r13.A00
        L_0x0068:
            float r1 = r1 + r11
            boolean r0 = r13.A07
            if (r0 == 0) goto L_0x0198
            float r0 = r13.A01
        L_0x006f:
            float r0 = r0 + r15
            android.graphics.PointF r9 = new android.graphics.PointF
            r9.<init>(r1, r0)
            boolean r0 = r13.A07
            r8 = 1
            r7 = 0
            r5 = 0
            if (r0 == 0) goto L_0x0174
            float r1 = r16.centerY()
            float r2 = r13.A08
            float r1 = r1 + r2
            float r0 = r9.y
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x0168
            float r1 = r16.centerY()
            float r1 = r1 - r2
            float r0 = r9.y
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x0168
            float r0 = r13.A01
            float r0 = r0 + r15
            r13.A01 = r0
            r15 = 0
        L_0x009a:
            boolean r0 = r13.A06
            if (r0 == 0) goto L_0x0144
            float r1 = r16.centerX()
            float r2 = r13.A08
            float r1 = r1 + r2
            float r0 = r9.x
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x0138
            float r1 = r16.centerX()
            float r1 = r1 - r2
            float r0 = r9.x
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x0138
            float r0 = r13.A00
            float r0 = r0 + r11
            r13.A00 = r0
            r11 = 0
        L_0x00bc:
            android.graphics.PointF r1 = new android.graphics.PointF
            r1.<init>(r11, r15)
            float r5 = r14.x
            float r0 = r1.x
            float r5 = r5 + r0
            float r2 = r14.y
            float r0 = r1.y
            float r2 = r2 + r0
            android.graphics.PointF r8 = new android.graphics.PointF
            r8.<init>(r5, r2)
            java.util.Map r2 = r13.A05
            r0 = 3
            java.lang.Object r5 = X.C36371kC.A0r(r2, r0)
            X.5CU r5 = (X.AnonymousClass5CU) r5
            boolean r0 = r5.A03
            if (r0 == 0) goto L_0x00e0
            r13.A01(r8, r12, r7)
        L_0x00e0:
            float r7 = r4.x
            float r7 = r7 * r7
            float r0 = r4.y
            float r0 = r0 * r0
            float r7 = r7 + r0
            double r7 = (double) r7
            double r9 = java.lang.Math.sqrt(r7)
            r7 = 4641240890982006784(0x4069000000000000, double:200.0)
            int r0 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            boolean r9 = X.AnonymousClass000.A1R(r0)
            java.util.Iterator r8 = X.AnonymousClass000.A0z(r2)
        L_0x00f8:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x01a0
            java.lang.Object r7 = r8.next()
            X.6F8 r7 = (X.AnonymousClass6F8) r7
            boolean r0 = r7 instanceof X.AnonymousClass5CU
            if (r0 != 0) goto L_0x00f8
            r0 = r7
            X.5CT r0 = (X.AnonymousClass5CT) r0
            int r4 = r0.A00
            r0 = 1
            if (r4 == r0) goto L_0x0125
            r2 = 2
            if (r4 != r2) goto L_0x00f8
            boolean r0 = r13.A06
            if (r0 == 0) goto L_0x0134
            if (r9 != 0) goto L_0x0134
            boolean r0 = r5.A03
            if (r0 == 0) goto L_0x0121
            int r0 = r5.A01
            if (r0 == r2) goto L_0x0134
        L_0x0121:
            r7.A02()
            goto L_0x00f8
        L_0x0125:
            boolean r0 = r13.A07
            if (r0 == 0) goto L_0x0134
            if (r9 != 0) goto L_0x0134
            boolean r0 = r5.A03
            if (r0 == 0) goto L_0x0121
            int r0 = r5.A01
            if (r0 == 0) goto L_0x0134
            goto L_0x0121
        L_0x0134:
            r7.A01()
            goto L_0x00f8
        L_0x0138:
            r13.A06 = r5
            float r1 = r13.A00
            float r0 = r14.x
            float r1 = r1 - r0
            float r11 = r11 + r1
            r13.A00 = r7
            goto L_0x00bc
        L_0x0144:
            float r1 = r14.x
            float r2 = r10.x
            int r0 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r0 > 0) goto L_0x0153
            float r0 = r4.x
            float r0 = r0 + r1
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x015e
        L_0x0153:
            int r0 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r0 < 0) goto L_0x00bc
            float r0 = r4.x
            float r0 = r0 + r1
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 > 0) goto L_0x00bc
        L_0x015e:
            r13.A06 = r8
            float r0 = r9.x
            r13.A00 = r0
            float r11 = r2 - r1
            goto L_0x00bc
        L_0x0168:
            r13.A07 = r5
            float r1 = r13.A01
            float r0 = r14.y
            float r1 = r1 - r0
            float r15 = r15 + r1
            r13.A01 = r7
            goto L_0x009a
        L_0x0174:
            float r2 = r14.y
            float r1 = r10.y
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0183
            float r0 = r4.y
            float r0 = r0 + r2
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x018e
        L_0x0183:
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x009a
            float r0 = r4.y
            float r0 = r0 + r2
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x009a
        L_0x018e:
            r13.A07 = r8
            float r0 = r9.y
            r13.A01 = r0
            float r15 = r1 - r2
            goto L_0x009a
        L_0x0198:
            float r0 = r14.y
            goto L_0x006f
        L_0x019c:
            float r1 = r14.x
            goto L_0x0068
        L_0x01a0:
            r4 = r1
        L_0x01a1:
            X.6SM r7 = r6.A06
            r0 = r19
            float r1 = r0.x
            float r0 = r0.y
            boolean r5 = X.AnonymousClass6SM.A01(r7, r1, r0)
            boolean r0 = r7.A00
            if (r5 == 0) goto L_0x01d1
            if (r0 != 0) goto L_0x01dd
            X.4bS r2 = r7.A04
            android.view.View r0 = r7.A03
            android.content.res.Resources r1 = X.C36341k9.A0F(r0)
            r0 = 2131102404(0x7f060ac4, float:1.7817245E38)
            int r0 = r1.getColor(r0)
            r2.A00 = r0
            r2.invalidateSelf()
            android.os.Vibrator r2 = r7.A02
            if (r2 == 0) goto L_0x01dd
            r0 = 3
            r2.vibrate(r0)     // Catch:{ NullPointerException -> 0x01d7 }
            goto L_0x01dd
        L_0x01d1:
            if (r0 == 0) goto L_0x01dd
            X.AnonymousClass6SM.A00(r7)
            goto L_0x01dd
        L_0x01d7:
            r1 = move-exception
            java.lang.String r0 = "Vibrator is broken on this device."
            com.whatsapp.util.Log.e(r0, r1)
        L_0x01dd:
            r7.A00 = r5
            float r1 = r4.x
            float r0 = r4.y
            float[] r5 = r3.A02
            r2 = 0
            r5[r2] = r1
            r4 = 1
            r5[r4] = r0
            android.graphics.Matrix r1 = r3.A00
            r1.reset()
            X.6OT r3 = r3.A01
            int r0 = r3.A02
            float r0 = (float) r0
            float r0 = -r0
            r1.setRotate(r0)
            r1.mapPoints(r5)
            r2 = r5[r2]
            float r1 = r3.A00
            float r0 = r3.A01
            float r1 = r1 * r0
            float r2 = r2 / r1
            r0 = r5[r4]
            float r0 = r0 / r1
            android.graphics.PointF r1 = new android.graphics.PointF
            r1.<init>(r2, r0)
            X.6Ft r0 = r6.A00
            float r2 = r1.x
            float r1 = r1.y
            android.graphics.RectF r0 = r0.A02
            r0.offset(r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C135326cW.A01(android.graphics.PointF, android.graphics.PointF):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0051  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onDoubleTap(android.view.MotionEvent r7) {
        /*
            r6 = this;
            X.6FV r5 = r6.A09
            r0 = 0
            r5.A02 = r0
            r5.A00 = r0
            X.6Ft r4 = r5.A01
            if (r4 == 0) goto L_0x004f
            java.util.List r3 = r5.A04
            boolean r0 = X.C36401kF.A1a(r3)
            if (r0 == 0) goto L_0x004f
            X.6Ft r1 = r5.A01
            r2 = -1
            if (r1 == 0) goto L_0x0020
            r0 = 0
            X.AnonymousClass00C.A0D(r3, r0)
            int r2 = r3.indexOf(r1)
        L_0x0020:
            int r1 = r3.size()
            r0 = 1
            int r1 = r1 - r0
            if (r2 == r1) goto L_0x004f
            X.6Ft r1 = r5.A01
            r0 = -1
            if (r1 == 0) goto L_0x0031
            int r0 = r3.indexOf(r1)
        L_0x0031:
            X.5Cq r1 = new X.5Cq
            r1.<init>(r4, r0)
            X.65v r0 = r5.A03
            java.util.List r0 = r0.A00
            r0.add(r1)
            r3.remove(r4)
            r3.add(r4)
            r0 = 1
        L_0x0044:
            r1 = 1
            if (r0 == 0) goto L_0x0051
            com.whatsapp.mediacomposer.doodle.DoodleView r0 = r6.A03
            X.6V4 r0 = r0.A0E
            r0.A03()
            return r1
        L_0x004f:
            r0 = 0
            goto L_0x0044
        L_0x0051:
            android.view.GestureDetector$OnGestureListener r0 = r6.A00
            if (r0 == 0) goto L_0x005e
            android.view.GestureDetector$OnDoubleTapListener r0 = (android.view.GestureDetector.OnDoubleTapListener) r0
            boolean r0 = r0.onDoubleTap(r7)
            if (r0 == 0) goto L_0x005e
            return r1
        L_0x005e:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C135326cW.onDoubleTap(android.view.MotionEvent):boolean");
    }

    public boolean onDoubleTapEvent(MotionEvent motionEvent) {
        GestureDetector.OnGestureListener onGestureListener = this.A00;
        if (onGestureListener == null || !((GestureDetector.OnDoubleTapListener) onGestureListener).onDoubleTapEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public boolean onDown(MotionEvent motionEvent) {
        GestureDetector.OnGestureListener onGestureListener;
        if (this.A09.A01 != null || (onGestureListener = this.A00) == null || !onGestureListener.onDown(motionEvent)) {
            return false;
        }
        return true;
    }

    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        GestureDetector.OnGestureListener onGestureListener;
        if (this.A09.A01 != null || (onGestureListener = this.A00) == null || !onGestureListener.onFling(motionEvent, motionEvent2, f, f2)) {
            return false;
        }
        return true;
    }

    public void onLongPress(MotionEvent motionEvent) {
        GestureDetector.OnGestureListener onGestureListener = this.A00;
        if (onGestureListener != null) {
            onGestureListener.onLongPress(motionEvent);
        }
    }

    public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        C117465mJ r1 = this.A08;
        C129196Ft r0 = this.A09.A01;
        r1.A00 = r0;
        if (r0 != null) {
            return true;
        }
        GestureDetector.OnGestureListener onGestureListener = this.A00;
        if (onGestureListener == null || !((ScaleGestureDetector.OnScaleGestureListener) onGestureListener).onScaleBegin(scaleGestureDetector)) {
            return false;
        }
        return true;
    }

    public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        this.A08.A00 = null;
        GestureDetector.OnGestureListener onGestureListener = this.A00;
        if (onGestureListener != null) {
            ((ScaleGestureDetector.OnScaleGestureListener) onGestureListener).onScaleEnd(scaleGestureDetector);
        }
    }

    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        GestureDetector.OnGestureListener onGestureListener;
        if (this.A09.A01 != null || (onGestureListener = this.A00) == null || !onGestureListener.onScroll(motionEvent, motionEvent2, f, f2)) {
            return false;
        }
        return true;
    }

    public void onShowPress(MotionEvent motionEvent) {
        GestureDetector.OnGestureListener onGestureListener = this.A00;
        if (onGestureListener != null) {
            onGestureListener.onShowPress(motionEvent);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0023, code lost:
        if (A00(r7.getX(), r7.getY()) != false) goto L_0x006a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onSingleTapConfirmed(android.view.MotionEvent r7) {
        /*
            r6 = this;
            X.6FV r1 = r6.A09
            java.util.List r3 = r1.A04
            int r0 = r3.size()
            r5 = 0
            r2 = 1
            if (r0 == r2) goto L_0x0025
            X.6Ft r0 = r1.A01
            if (r0 != 0) goto L_0x006c
            r1 = -1
        L_0x0011:
            int r0 = X.C36421kH.A06(r3, r2)
            if (r1 == r0) goto L_0x0025
            float r1 = r7.getX()
            float r0 = r7.getY()
            boolean r0 = r6.A00(r1, r0)
            if (r0 != 0) goto L_0x006a
        L_0x0025:
            android.view.GestureDetector$OnGestureListener r4 = r6.A00
            if (r4 == 0) goto L_0x0060
            r0 = r4
            X.7gw r0 = (X.C158447gw) r0
            boolean r0 = r0.BTl()
            if (r0 == 0) goto L_0x0060
            com.whatsapp.mediacomposer.doodle.DoodleView r0 = r6.A03
            X.6Ft r0 = r0.A00(r7)
            if (r0 != 0) goto L_0x0060
            X.7nw r0 = r6.A02
            X.6w2 r0 = (X.C146706w2) r0
            X.6wC r3 = r0.A01
            X.6Fh r2 = r3.A0V
            X.6VT r0 = r2.A0G
            X.00s r0 = r0.A06
            int r0 = X.C36341k9.A07(r0)
            if (r0 != 0) goto L_0x0060
            X.1Sf r0 = r3.A0X
            X.0yC r1 = r0.A00
            r0 = 7597(0x1dad, float:1.0646E-41)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x0060
            r0 = 3
            r2.A07(r0)
            r0 = 0
            X.C146806wC.A05(r3, r0)
        L_0x0060:
            if (r4 == 0) goto L_0x006b
            android.view.GestureDetector$OnDoubleTapListener r4 = (android.view.GestureDetector.OnDoubleTapListener) r4
            boolean r0 = r4.onSingleTapConfirmed(r7)
            if (r0 == 0) goto L_0x006b
        L_0x006a:
            r5 = 1
        L_0x006b:
            return r5
        L_0x006c:
            int r1 = r3.indexOf(r0)
            goto L_0x0011
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C135326cW.onSingleTapConfirmed(android.view.MotionEvent):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0022, code lost:
        if (r1 == X.C36421kH.A06(r2, 1)) goto L_0x0024;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onSingleTapUp(android.view.MotionEvent r5) {
        /*
            r4 = this;
            com.whatsapp.mediacomposer.doodle.DoodleView r0 = r4.A03
            X.6Ft r0 = r0.A00(r5)
            X.6FV r1 = r4.A09
            r1.A01 = r0
            r3 = 1
            if (r0 == 0) goto L_0x0031
            java.util.List r2 = r1.A04
            int r0 = r2.size()
            if (r0 == r3) goto L_0x0024
            X.6Ft r0 = r1.A01
            r1 = -1
            if (r0 == 0) goto L_0x001e
            int r1 = r2.indexOf(r0)
        L_0x001e:
            int r0 = X.C36421kH.A06(r2, r3)
            if (r1 != r0) goto L_0x0031
        L_0x0024:
            float r1 = r5.getX()
            float r0 = r5.getY()
            boolean r0 = r4.A00(r1, r0)
            return r0
        L_0x0031:
            android.view.GestureDetector$OnGestureListener r0 = r4.A00
            if (r0 == 0) goto L_0x003c
            boolean r0 = r0.onSingleTapUp(r5)
            if (r0 == 0) goto L_0x003c
            return r3
        L_0x003c:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C135326cW.onSingleTapUp(android.view.MotionEvent):boolean");
    }

    public C135326cW(GestureDetector.OnGestureListener onGestureListener, C162047nw r4, DoodleView doodleView, AnonymousClass6LZ r6, C117465mJ r7, AnonymousClass6FV r8) {
        this.A03 = doodleView;
        this.A04 = r6;
        this.A08 = r7;
        this.A09 = r8;
        this.A02 = r4;
        this.A00 = onGestureListener;
        this.A01 = new C06360Th(doodleView.getContext(), this);
        C92144dC r0 = new C92144dC(doodleView.getContext(), this);
        this.A07 = r0;
        C05510Pz.A00(r0);
        this.A05 = new C130426La(doodleView.getContext(), this);
    }

    public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        float scaleFactor = scaleGestureDetector.getScaleFactor();
        float f = ((C92144dC) scaleGestureDetector).A00;
        C129196Ft r6 = this.A08.A00;
        if (r6 == null) {
            GestureDetector.OnGestureListener onGestureListener = this.A00;
            if (onGestureListener == null || !((ScaleGestureDetector.OnScaleGestureListener) onGestureListener).onScale(scaleGestureDetector)) {
                return false;
            }
            return true;
        } else if (r6 instanceof AnonymousClass5Ch) {
            r6.A0H(C36431kI.A1P((Math.abs(f) > 1.0f ? 1 : (Math.abs(f) == 1.0f ? 0 : -1))) ^ true ? 1 : 0, scaleFactor);
            return true;
        } else if (r6 instanceof AnonymousClass5Cf) {
            r6.A0H(true ^ C36431kI.A1P((Math.abs(Math.tan(Math.atan((double) f) - Math.toRadians((double) r6.A00))) > 1.0d ? 1 : (Math.abs(Math.tan(Math.atan((double) f) - Math.toRadians((double) r6.A00))) == 1.0d ? 0 : -1))) ? 1 : 0, scaleFactor);
            return true;
        } else if (r6 instanceof AnonymousClass5Ce) {
            r6.A0H(true ^ C36431kI.A1P((Math.abs(Math.tan(Math.atan((double) f) - Math.toRadians((double) r6.A00))) > 1.0d ? 1 : (Math.abs(Math.tan(Math.atan((double) f) - Math.toRadians((double) r6.A00))) == 1.0d ? 0 : -1))) ? 1 : 0, scaleFactor);
            return true;
        } else {
            r6.A0E(scaleFactor);
            return true;
        }
    }
}
