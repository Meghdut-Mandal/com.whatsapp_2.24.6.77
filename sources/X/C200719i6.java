package X;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;

/* renamed from: X.9i6  reason: invalid class name and case insensitive filesystem */
public abstract class C200719i6 {
    public static C197499bo A00 = C197499bo.A00("x", "y");
    public static C197499bo A01 = C197499bo.A01("t", "s", "e", "o", "i", "h", "to", "ti");
    public static final Interpolator A02 = new LinearInterpolator();

    public static Interpolator A00(PointF pointF, PointF pointF2) {
        float f = pointF.x;
        PointF pointF3 = C200579hd.A00;
        pointF.x = C165597tg.A01(1.0f, f, -1.0f);
        pointF.y = C165597tg.A01(100.0f, pointF.y, -100.0f);
        float A012 = C165597tg.A01(1.0f, pointF2.x, -1.0f);
        pointF2.x = A012;
        float A013 = C165597tg.A01(100.0f, pointF2.y, -100.0f);
        pointF2.y = A013;
        try {
            return C017907q.A00(pointF.x, pointF.y, A012, A013);
        } catch (IllegalArgumentException e) {
            if ("The Path cannot loop back on itself.".equals(e.getMessage())) {
                return C017907q.A00(Math.min(pointF.x, 1.0f), pointF.y, Math.max(pointF2.x, 0.0f), pointF2.y);
            }
            return new LinearInterpolator();
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0136, code lost:
        r6.A0O();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C202689mQ A01(X.AnonymousClass9Y2 r16, X.C22855Ax5 r17, X.C21655ATw r18, float r19, boolean r20, boolean r21) {
        /*
            r7 = r17
            r6 = r18
            r5 = r19
            if (r20 == 0) goto L_0x020a
            r17 = r16
            if (r21 == 0) goto L_0x0199
            r6.A0M()
            r14 = 0
            r15 = 0
            r11 = 0
            r10 = 0
            r1 = 0
            r19 = 0
            r4 = 0
            r12 = 0
            r9 = 0
            r21 = 0
            r13 = 0
            r20 = 0
        L_0x001e:
            boolean r0 = r6.A0S()
            if (r0 == 0) goto L_0x0153
            X.9bo r0 = A01
            int r0 = r6.A0F(r0)
            r2 = 1
            switch(r0) {
                case 0: goto L_0x014d;
                case 1: goto L_0x0147;
                case 2: goto L_0x0141;
                case 3: goto L_0x00c1;
                case 4: goto L_0x0045;
                case 5: goto L_0x003c;
                case 6: goto L_0x0037;
                case 7: goto L_0x0032;
                default: goto L_0x002e;
            }
        L_0x002e:
            r6.A0Q()
            goto L_0x001e
        L_0x0032:
            android.graphics.PointF r14 = X.C202379li.A02(r6, r5)
            goto L_0x001e
        L_0x0037:
            android.graphics.PointF r13 = X.C202379li.A02(r6, r5)
            goto L_0x001e
        L_0x003c:
            int r0 = r6.A0E()
            boolean r15 = X.AnonymousClass000.A1S(r0, r2)
            goto L_0x001e
        L_0x0045:
            java.lang.Integer r2 = r6.A0H()
            java.lang.Integer r0 = X.C023109s.A0C
            if (r2 != r0) goto L_0x00bb
            r6.A0M()
            r9 = 0
            r8 = 0
            r3 = 0
            r2 = 0
        L_0x0054:
            boolean r0 = r6.A0S()
            if (r0 == 0) goto L_0x00b0
            X.9bo r0 = A00
            int r12 = r6.A0F(r0)
            if (r12 == 0) goto L_0x008b
            r0 = 1
            if (r12 == r0) goto L_0x0069
            r6.A0Q()
            goto L_0x0054
        L_0x0069:
            java.lang.Integer r0 = r6.A0H()
            java.lang.Integer r2 = X.C023109s.A0V
            if (r0 != r2) goto L_0x0077
            float r2 = X.C21655ATw.A08(r6)
            r8 = r2
            goto L_0x0054
        L_0x0077:
            r6.A0L()
            float r8 = X.C21655ATw.A08(r6)
            java.lang.Integer r0 = r6.A0H()
            if (r0 != r2) goto L_0x0089
            float r2 = X.C21655ATw.A08(r6)
            goto L_0x00aa
        L_0x0089:
            r2 = r8
            goto L_0x00aa
        L_0x008b:
            java.lang.Integer r0 = r6.A0H()
            java.lang.Integer r3 = X.C023109s.A0V
            if (r0 != r3) goto L_0x0099
            float r3 = X.C21655ATw.A08(r6)
            r9 = r3
            goto L_0x0054
        L_0x0099:
            r6.A0L()
            float r9 = X.C21655ATw.A08(r6)
            java.lang.Integer r0 = r6.A0H()
            if (r0 != r3) goto L_0x00ae
            float r3 = X.C21655ATw.A08(r6)
        L_0x00aa:
            r6.A0N()
            goto L_0x0054
        L_0x00ae:
            r3 = r9
            goto L_0x00aa
        L_0x00b0:
            android.graphics.PointF r12 = new android.graphics.PointF
            r12.<init>(r9, r8)
            android.graphics.PointF r9 = new android.graphics.PointF
            r9.<init>(r3, r2)
            goto L_0x0136
        L_0x00bb:
            android.graphics.PointF r10 = X.C202379li.A02(r6, r5)
            goto L_0x001e
        L_0x00c1:
            java.lang.Integer r2 = r6.A0H()
            java.lang.Integer r0 = X.C023109s.A0C
            if (r2 != r0) goto L_0x013b
            r6.A0M()
            r8 = 0
            r4 = 0
            r3 = 0
            r2 = 0
        L_0x00d0:
            boolean r0 = r6.A0S()
            if (r0 == 0) goto L_0x012c
            X.9bo r0 = A00
            int r1 = r6.A0F(r0)
            if (r1 == 0) goto L_0x00f3
            r0 = 1
            if (r1 == r0) goto L_0x00e5
            r6.A0Q()
            goto L_0x00d0
        L_0x00e5:
            java.lang.Integer r0 = r6.A0H()
            java.lang.Integer r1 = X.C023109s.A0V
            if (r0 != r1) goto L_0x0115
            float r2 = X.C21655ATw.A08(r6)
            r4 = r2
            goto L_0x00d0
        L_0x00f3:
            java.lang.Integer r0 = r6.A0H()
            java.lang.Integer r1 = X.C023109s.A0V
            if (r0 != r1) goto L_0x0101
            float r3 = X.C21655ATw.A08(r6)
            r8 = r3
            goto L_0x00d0
        L_0x0101:
            r6.A0L()
            float r8 = X.C21655ATw.A08(r6)
            java.lang.Integer r0 = r6.A0H()
            if (r0 != r1) goto L_0x0113
            float r3 = X.C21655ATw.A08(r6)
            goto L_0x0126
        L_0x0113:
            r3 = r8
            goto L_0x0126
        L_0x0115:
            r6.A0L()
            float r4 = X.C21655ATw.A08(r6)
            java.lang.Integer r0 = r6.A0H()
            if (r0 != r1) goto L_0x012a
            float r2 = X.C21655ATw.A08(r6)
        L_0x0126:
            r6.A0N()
            goto L_0x00d0
        L_0x012a:
            r2 = r4
            goto L_0x0126
        L_0x012c:
            android.graphics.PointF r1 = new android.graphics.PointF
            r1.<init>(r8, r4)
            android.graphics.PointF r4 = new android.graphics.PointF
            r4.<init>(r3, r2)
        L_0x0136:
            r6.A0O()
            goto L_0x001e
        L_0x013b:
            android.graphics.PointF r11 = X.C202379li.A02(r6, r5)
            goto L_0x001e
        L_0x0141:
            java.lang.Object r20 = r7.BlD(r6, r5)
            goto L_0x001e
        L_0x0147:
            java.lang.Object r19 = r7.BlD(r6, r5)
            goto L_0x001e
        L_0x014d:
            float r21 = X.C21655ATw.A08(r6)
            goto L_0x001e
        L_0x0153:
            r6.A0O()
            if (r15 == 0) goto L_0x0168
            android.view.animation.Interpolator r16 = A02
            r20 = r19
        L_0x015c:
            r18 = 0
            X.9mQ r15 = new X.9mQ
            r15.<init>((android.view.animation.Interpolator) r16, (X.AnonymousClass9Y2) r17, (java.lang.Float) r18, (java.lang.Object) r19, (java.lang.Object) r20, (float) r21)
        L_0x0163:
            r15.A05 = r13
            r15.A06 = r14
            return r15
        L_0x0168:
            if (r11 == 0) goto L_0x0171
            if (r10 == 0) goto L_0x0171
            android.view.animation.Interpolator r16 = A00(r11, r10)
            goto L_0x015c
        L_0x0171:
            if (r1 == 0) goto L_0x0196
            if (r4 == 0) goto L_0x0196
            if (r12 == 0) goto L_0x0196
            if (r9 == 0) goto L_0x0196
            android.view.animation.Interpolator r1 = A00(r1, r12)
            android.view.animation.Interpolator r2 = A00(r4, r9)
            r16 = 0
            if (r1 == 0) goto L_0x015c
            if (r2 == 0) goto L_0x015c
            X.9mQ r15 = new X.9mQ
            r0 = r15
            r3 = r17
            r4 = r19
            r5 = r20
            r6 = r21
            r0.<init>((android.view.animation.Interpolator) r1, (android.view.animation.Interpolator) r2, (X.AnonymousClass9Y2) r3, (java.lang.Object) r4, (java.lang.Object) r5, (float) r6)
            goto L_0x0163
        L_0x0196:
            android.view.animation.Interpolator r16 = A02
            goto L_0x015c
        L_0x0199:
            r6.A0M()
            r8 = 0
            r4 = r8
            r20 = r8
            r19 = r8
            r3 = r8
            r2 = r8
            r9 = 0
            r21 = 0
        L_0x01a7:
            boolean r0 = r6.A0S()
            if (r0 == 0) goto L_0x01e9
            X.9bo r0 = A01
            int r1 = r6.A0F(r0)
            r0 = 1065353216(0x3f800000, float:1.0)
            switch(r1) {
                case 0: goto L_0x01e4;
                case 1: goto L_0x01df;
                case 2: goto L_0x01da;
                case 3: goto L_0x01d5;
                case 4: goto L_0x01d0;
                case 5: goto L_0x01c6;
                case 6: goto L_0x01c1;
                case 7: goto L_0x01bc;
                default: goto L_0x01b8;
            }
        L_0x01b8:
            r6.A0Q()
            goto L_0x01a7
        L_0x01bc:
            android.graphics.PointF r2 = X.C202379li.A02(r6, r5)
            goto L_0x01a7
        L_0x01c1:
            android.graphics.PointF r3 = X.C202379li.A02(r6, r5)
            goto L_0x01a7
        L_0x01c6:
            int r1 = r6.A0E()
            r0 = 1
            boolean r9 = X.AnonymousClass000.A1S(r1, r0)
            goto L_0x01a7
        L_0x01d0:
            android.graphics.PointF r4 = X.C202379li.A02(r6, r0)
            goto L_0x01a7
        L_0x01d5:
            android.graphics.PointF r8 = X.C202379li.A02(r6, r0)
            goto L_0x01a7
        L_0x01da:
            java.lang.Object r20 = r7.BlD(r6, r5)
            goto L_0x01a7
        L_0x01df:
            java.lang.Object r19 = r7.BlD(r6, r5)
            goto L_0x01a7
        L_0x01e4:
            float r21 = X.C21655ATw.A08(r6)
            goto L_0x01a7
        L_0x01e9:
            r6.A0O()
            if (r9 == 0) goto L_0x01fe
            android.view.animation.Interpolator r16 = A02
            r20 = r19
        L_0x01f2:
            r18 = 0
            X.9mQ r15 = new X.9mQ
            r15.<init>((android.view.animation.Interpolator) r16, (X.AnonymousClass9Y2) r17, (java.lang.Float) r18, (java.lang.Object) r19, (java.lang.Object) r20, (float) r21)
            r15.A05 = r3
            r15.A06 = r2
            return r15
        L_0x01fe:
            if (r8 == 0) goto L_0x0207
            if (r4 == 0) goto L_0x0207
            android.view.animation.Interpolator r16 = A00(r8, r4)
            goto L_0x01f2
        L_0x0207:
            android.view.animation.Interpolator r16 = A02
            goto L_0x01f2
        L_0x020a:
            java.lang.Object r0 = r7.BlD(r6, r5)
            X.9mQ r15 = new X.9mQ
            r15.<init>(r0)
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C200719i6.A01(X.9Y2, X.Ax5, X.ATw, float, boolean, boolean):X.9mQ");
    }
}
