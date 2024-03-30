package X;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.List;
import java.util.Map;

/* renamed from: X.81H  reason: invalid class name */
public class AnonymousClass81H extends C208409yC {
    public C196189Yb A00;
    public C196189Yb A01;
    public C196189Yb A02;
    public C196189Yb A03;
    public C196189Yb A04;
    public C196189Yb A05;
    public C196189Yb A06;
    public C196189Yb A07;
    public C196189Yb A08;
    public C196189Yb A09;
    public final Matrix A0A = C90524aI.A0B();
    public final Paint A0B = new C23132B6n(this, 0);
    public final Paint A0C = new C23132B6n(this, 1);
    public final RectF A0D = C36441kJ.A0N();
    public final C000700i A0E = new C000700i();
    public final AnonymousClass9Y2 A0F;
    public final C165737u4 A0G;
    public final StringBuilder A0H = C90524aI.A0h(2);
    public final List A0I = AnonymousClass001.A0I();
    public final Map A0J = AnonymousClass001.A0J();
    public final AnonymousClass811 A0K;

    private List A00(AnonymousClass9L2 r16, String str, float f, float f2, float f3, boolean z) {
        String str2;
        float measureText;
        int i = 0;
        float f4 = 0.0f;
        int i2 = 0;
        int i3 = 0;
        boolean z2 = false;
        float f5 = 0.0f;
        int i4 = 0;
        float f6 = 0.0f;
        while (true) {
            str2 = str;
            if (i >= str2.length()) {
                break;
            }
            char charAt = str2.charAt(i);
            if (z) {
                AnonymousClass9L2 r0 = r16;
                AnonymousClass9S0 r02 = (AnonymousClass9S0) C06840Vh.A00(this.A0F.A06, C90504aG.A0B(r0.A03, C36381kD.A08(r0.A01, charAt * 31)));
                if (r02 != null) {
                    measureText = ((float) r02.A00) * f2 * C203079nF.A00();
                } else {
                    i++;
                }
            } else {
                measureText = this.A0B.measureText(str2.substring(i, i + 1));
            }
            float f7 = measureText + f3;
            if (charAt == ' ') {
                z2 = true;
                f6 = f7;
            } else if (z2) {
                i4 = i;
                f5 = f7;
                z2 = false;
            } else {
                f5 += f7;
            }
            f4 += f7;
            if (f > 0.0f && f4 >= f && charAt != ' ') {
                i2++;
                List list = this.A0I;
                for (int size = list.size(); size < i2; size++) {
                    list.add(new AnonymousClass9G7());
                }
                AnonymousClass9G7 r9 = (AnonymousClass9G7) list.get(i2 - 1);
                if (i4 == i3) {
                    String substring = str2.substring(i3, i);
                    String trim = substring.trim();
                    r9.A01 = trim;
                    r9.A00 = (f4 - f7) - (((float) (trim.length() - substring.length())) * f6);
                    i3 = i;
                    i4 = i;
                    f4 = f7;
                    f5 = f7;
                } else {
                    String substring2 = str2.substring(i3, i4 - 1);
                    String trim2 = substring2.trim();
                    r9.A01 = trim2;
                    r9.A00 = ((f4 - f5) - (((float) (substring2.length() - trim2.length())) * f6)) - f6;
                    f4 = f5;
                    i3 = i4;
                }
            }
            i++;
        }
        if (f4 > 0.0f) {
            i2++;
            List list2 = this.A0I;
            for (int size2 = list2.size(); size2 < i2; size2++) {
                list2.add(new AnonymousClass9G7());
            }
            AnonymousClass9G7 r1 = (AnonymousClass9G7) list2.get(i2 - 1);
            r1.A01 = str2.substring(i3);
            r1.A00 = f4;
        }
        return this.A0I.subList(0, i2);
    }

    public static void A02(Canvas canvas, Paint paint, String str) {
        Paint paint2 = paint;
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() != Paint.Style.STROKE || paint.getStrokeWidth() != 0.0f) {
            canvas.drawText(str, 0, str.length(), 0.0f, 0.0f, paint2);
        }
    }

    public static void A03(Canvas canvas, C199049ec r8, float f, int i) {
        float f2;
        float f3;
        float f4;
        PointF pointF = r8.A07;
        PointF pointF2 = r8.A08;
        float A002 = C203079nF.A00();
        float f5 = 0.0f;
        if (pointF == null) {
            f2 = 0.0f;
        } else {
            f2 = (r8.A01 * A002) + pointF.y;
        }
        float f6 = (((float) i) * r8.A01 * A002) + f2;
        if (pointF == null) {
            f3 = 0.0f;
        } else {
            f3 = pointF.x;
        }
        if (pointF2 != null) {
            f5 = pointF2.x;
        }
        int intValue = r8.A09.intValue();
        if (intValue != 0) {
            if (intValue == 1) {
                f4 = f3 + f5;
            } else if (intValue == 2) {
                f4 = f3 + (f5 / 2.0f);
                f /= 2.0f;
            } else {
                return;
            }
            f3 = f4 - f;
        }
        canvas.translate(f3, f6);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:137:0x038c, code lost:
        if (r2.containsKey(r1) != false) goto L_0x038e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x0394, code lost:
        if (r1 == null) goto L_0x01f8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01fa, code lost:
        if (r1 == null) goto L_0x01fc;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0B(android.graphics.Canvas r28, android.graphics.Matrix r29, int r30) {
        /*
            r27 = this;
            r6 = r27
            X.811 r0 = r6.A0K
            java.lang.Object r5 = r0.A05()
            X.9ec r5 = (X.C199049ec) r5
            X.9Y2 r0 = r6.A0F
            r26 = r0
            java.util.Map r1 = r0.A09
            java.lang.String r0 = r5.A0A
            java.lang.Object r4 = r1.get(r0)
            X.9L2 r4 = (X.AnonymousClass9L2) r4
            if (r4 == 0) goto L_0x01ff
            r7 = r28
            r7.save()
            r2 = r29
            r7.concat(r2)
            X.9Yb r1 = r6.A01
            if (r1 != 0) goto L_0x01ea
            X.9Yb r1 = r6.A00
            if (r1 != 0) goto L_0x01ea
            android.graphics.Paint r0 = r6.A0B
            r25 = r0
            int r1 = r5.A04
        L_0x0032:
            r0 = r25
            r0.setColor(r1)
            X.9Yb r0 = r6.A03
            if (r0 != 0) goto L_0x01de
            X.9Yb r0 = r6.A02
            if (r0 != 0) goto L_0x01de
            android.graphics.Paint r3 = r6.A0C
            int r0 = r5.A05
        L_0x0043:
            r3.setColor(r0)
            X.9YD r0 = r6.A0K
            X.9Yb r0 = r0.A02
            r1 = 100
            if (r0 != 0) goto L_0x01d4
            r0 = 100
        L_0x0050:
            int r0 = r0 * 255
            int r0 = r0 / r1
            int r0 = r0 * r30
            int r1 = r0 / 255
            r0 = r25
            r0.setAlpha(r1)
            r3.setAlpha(r1)
            X.9Yb r0 = r6.A05
            if (r0 != 0) goto L_0x01cb
            X.9Yb r0 = r6.A04
            if (r0 != 0) goto L_0x01cb
            float r1 = r5.A03
            float r0 = X.C203079nF.A00()
            float r1 = r1 * r0
            r3.setStrokeWidth(r1)
        L_0x0071:
            X.7u4 r9 = r6.A0G
            java.util.Map r0 = r9.A0O
            if (r0 != 0) goto L_0x0200
            X.9Y2 r0 = r9.A0F
            X.0fO r0 = r0.A06
            int r0 = r0.A00
            if (r0 <= 0) goto L_0x0200
            X.9Yb r0 = r6.A06
            if (r0 == 0) goto L_0x01c7
            float r8 = X.C196189Yb.A01(r0)
        L_0x0087:
            r0 = 1120403456(0x42c80000, float:100.0)
            float r8 = r8 / r0
            X.C203079nF.A01(r2)
            java.lang.String r1 = r5.A0B
            java.lang.String r0 = "\r\n"
            java.lang.String r2 = "\r"
            java.lang.String r1 = r1.replaceAll(r0, r2)
            java.lang.String r0 = "\u0003"
            java.lang.String r1 = r1.replaceAll(r0, r2)
            java.lang.String r0 = "\n"
            java.lang.String r0 = r1.replaceAll(r0, r2)
            java.lang.String[] r0 = r0.split(r2)
            java.util.List r22 = java.util.Arrays.asList(r0)
            int r21 = r22.size()
            int r0 = r5.A06
            float r2 = (float) r0
            r0 = 1092616192(0x41200000, float:10.0)
            float r2 = r2 / r0
            X.9Yb r0 = r6.A08
            if (r0 != 0) goto L_0x00bd
            X.9Yb r0 = r6.A07
            if (r0 == 0) goto L_0x00c2
        L_0x00bd:
            float r0 = X.C196189Yb.A01(r0)
            float r2 = r2 + r0
        L_0x00c2:
            r20 = 0
            r19 = -1
        L_0x00c6:
            r1 = r21
            r0 = r20
            if (r0 >= r1) goto L_0x01fc
            r1 = r22
            java.lang.String r12 = X.C36401kF.A0s(r1, r0)
            android.graphics.PointF r0 = r5.A08
            if (r0 != 0) goto L_0x01c3
            r0 = 0
        L_0x00d7:
            r16 = 1
            r10 = r6
            r11 = r4
            r13 = r0
            r14 = r8
            r15 = r2
            java.util.List r18 = r10.A00(r11, r12, r13, r14, r15, r16)
            r17 = 0
        L_0x00e4:
            int r1 = r18.size()
            r0 = r17
            if (r0 >= r1) goto L_0x01bf
            r1 = r18
            java.lang.Object r10 = r1.get(r0)
            X.9G7 r10 = (X.AnonymousClass9G7) r10
            int r19 = r19 + 1
            r7.save()
            float r1 = r10.A00
            r0 = r19
            A03(r7, r5, r1, r0)
            java.lang.String r0 = r10.A01
            r24 = r0
            r11 = 0
        L_0x0105:
            int r0 = r24.length()
            if (r11 >= r0) goto L_0x01b8
            r0 = r24
            char r0 = r0.charAt(r11)
            java.lang.String r10 = r4.A01
            java.lang.String r1 = r4.A03
            int r0 = r0 * 31
            int r0 = X.C36381kD.A08(r10, r0)
            int r1 = X.C90504aG.A0B(r1, r0)
            r0 = r26
            X.0fO r0 = r0.A06
            java.lang.Object r13 = X.C06840Vh.A00(r0, r1)
            X.9S0 r13 = (X.AnonymousClass9S0) r13
            if (r13 == 0) goto L_0x01b4
            java.util.Map r14 = r6.A0J
            boolean r0 = r14.containsKey(r13)
            if (r0 == 0) goto L_0x017c
            java.util.List r12 = X.C90524aI.A0o(r13, r14)
        L_0x0137:
            r10 = 0
        L_0x0138:
            int r0 = r12.size()
            if (r10 >= r0) goto L_0x01a6
            java.lang.Object r0 = r12.get(r10)
            X.9y6 r0 = (X.C208359y6) r0
            android.graphics.Path r1 = r0.BFG()
            android.graphics.RectF r0 = r6.A0D
            r14 = 0
            r1.computeBounds(r0, r14)
            android.graphics.Matrix r0 = r6.A0A
            r14 = r0
            r0.reset()
            float r0 = r5.A00
            float r15 = -r0
            float r0 = X.C203079nF.A00()
            float r15 = r15 * r0
            r0 = 0
            r14.preTranslate(r0, r15)
            r14.preScale(r8, r8)
            r1.transform(r14)
            boolean r0 = r5.A0C
            if (r0 == 0) goto L_0x0176
            r0 = r25
            A01(r7, r0, r1)
            r0 = r3
        L_0x0170:
            A01(r7, r0, r1)
            int r10 = r10 + 1
            goto L_0x0138
        L_0x0176:
            A01(r7, r3, r1)
            r0 = r25
            goto L_0x0170
        L_0x017c:
            java.util.List r0 = r13.A01
            r23 = r0
            int r16 = r23.size()
            java.util.ArrayList r12 = X.C36441kJ.A14(r16)
            r10 = 0
        L_0x0189:
            r0 = r16
            if (r10 >= r0) goto L_0x01a2
            r0 = r23
            java.lang.Object r15 = r0.get(r10)
            X.9yR r15 = (X.C208549yR) r15
            X.9y6 r1 = new X.9y6
            r0 = r26
            r1.<init>(r0, r9, r15, r6)
            r12.add(r1)
            int r10 = r10 + 1
            goto L_0x0189
        L_0x01a2:
            r14.put(r13, r12)
            goto L_0x0137
        L_0x01a6:
            double r0 = r13.A00
            float r10 = (float) r0
            float r10 = r10 * r8
            float r0 = X.C203079nF.A00()
            float r10 = r10 * r0
            float r10 = r10 + r2
            r0 = 0
            r7.translate(r10, r0)
        L_0x01b4:
            int r11 = r11 + 1
            goto L_0x0105
        L_0x01b8:
            r7.restore()
            int r17 = r17 + 1
            goto L_0x00e4
        L_0x01bf:
            int r20 = r20 + 1
            goto L_0x00c6
        L_0x01c3:
            float r0 = r0.x
            goto L_0x00d7
        L_0x01c7:
            float r8 = r5.A02
            goto L_0x0087
        L_0x01cb:
            float r0 = X.C196189Yb.A01(r0)
            r3.setStrokeWidth(r0)
            goto L_0x0071
        L_0x01d4:
            java.lang.Object r0 = r0.A05()
            int r0 = X.AnonymousClass000.A0I(r0)
            goto L_0x0050
        L_0x01de:
            android.graphics.Paint r3 = r6.A0C
            java.lang.Object r0 = r0.A05()
            int r0 = X.AnonymousClass000.A0I(r0)
            goto L_0x0043
        L_0x01ea:
            android.graphics.Paint r0 = r6.A0B
            r25 = r0
            java.lang.Object r0 = r1.A05()
            int r1 = X.AnonymousClass000.A0I(r0)
            goto L_0x0032
        L_0x01f8:
            android.graphics.Typeface r1 = r4.A00
            if (r1 != 0) goto L_0x020c
        L_0x01fc:
            r7.restore()
        L_0x01ff:
            return
        L_0x0200:
            X.9Yb r0 = r6.A09
            if (r0 == 0) goto L_0x0364
            java.lang.Object r1 = r0.A05()
            android.graphics.Typeface r1 = (android.graphics.Typeface) r1
            if (r1 == 0) goto L_0x0364
        L_0x020c:
            java.lang.String r8 = r5.A0B
            r0 = r25
            r0.setTypeface(r1)
            X.9Yb r0 = r6.A06
            if (r0 == 0) goto L_0x0360
            float r1 = X.C196189Yb.A01(r0)
        L_0x021b:
            float r2 = X.C203079nF.A00()
            float r2 = r2 * r1
            r0 = r25
            r0.setTextSize(r2)
            android.graphics.Typeface r0 = r25.getTypeface()
            r3.setTypeface(r0)
            float r0 = r25.getTextSize()
            r3.setTextSize(r0)
            int r0 = r5.A06
            float r9 = (float) r0
            r0 = 1092616192(0x41200000, float:10.0)
            float r9 = r9 / r0
            X.9Yb r0 = r6.A08
            if (r0 != 0) goto L_0x0241
            X.9Yb r0 = r6.A07
            if (r0 == 0) goto L_0x0246
        L_0x0241:
            float r0 = X.C196189Yb.A01(r0)
            float r9 = r9 + r0
        L_0x0246:
            float r0 = X.C203079nF.A00()
            float r9 = r9 * r0
            float r9 = r9 * r1
            r0 = 1120403456(0x42c80000, float:100.0)
            float r9 = r9 / r0
            java.lang.String r0 = "\r\n"
            java.lang.String r2 = "\r"
            java.lang.String r1 = r8.replaceAll(r0, r2)
            java.lang.String r0 = "\u0003"
            java.lang.String r1 = r1.replaceAll(r0, r2)
            java.lang.String r0 = "\n"
            java.lang.String r0 = r1.replaceAll(r0, r2)
            java.lang.String[] r0 = r0.split(r2)
            java.util.List r19 = java.util.Arrays.asList(r0)
            int r18 = r19.size()
            r8 = 0
            r17 = -1
        L_0x0272:
            r0 = r18
            if (r8 >= r0) goto L_0x01fc
            r0 = r19
            java.lang.String r12 = X.C36401kF.A0s(r0, r8)
            android.graphics.PointF r0 = r5.A08
            if (r0 != 0) goto L_0x035c
            r1 = 0
        L_0x0281:
            r14 = 0
            r16 = 0
            r10 = r6
            r11 = r4
            r13 = r1
            r15 = r9
            java.util.List r16 = r10.A00(r11, r12, r13, r14, r15, r16)
            r10 = 0
        L_0x028d:
            int r0 = r16.size()
            if (r10 >= r0) goto L_0x0358
            r0 = r16
            java.lang.Object r2 = r0.get(r10)
            X.9G7 r2 = (X.AnonymousClass9G7) r2
            int r17 = r17 + 1
            r7.save()
            float r1 = r2.A00
            r0 = r17
            A03(r7, r5, r1, r0)
            java.lang.String r0 = r2.A01
            r20 = r0
            r11 = 0
        L_0x02ac:
            int r15 = r20.length()
            if (r11 >= r15) goto L_0x0351
            r12 = r11
            r0 = r20
            int r1 = r0.codePointAt(r11)
            int r13 = java.lang.Character.charCount(r1)
            int r13 = r13 + r11
        L_0x02be:
            if (r13 >= r15) goto L_0x02fe
            r0 = r20
            int r14 = r0.codePointAt(r13)
            int r2 = java.lang.Character.getType(r14)
            r0 = 16
            if (r2 == r0) goto L_0x02f5
            int r2 = java.lang.Character.getType(r14)
            r0 = 27
            if (r2 == r0) goto L_0x02f5
            int r2 = java.lang.Character.getType(r14)
            r0 = 6
            if (r2 == r0) goto L_0x02f5
            int r2 = java.lang.Character.getType(r14)
            r0 = 28
            if (r2 == r0) goto L_0x02f5
            int r2 = java.lang.Character.getType(r14)
            r0 = 8
            if (r2 == r0) goto L_0x02f5
            int r2 = java.lang.Character.getType(r14)
            r0 = 19
            if (r2 != r0) goto L_0x02fe
        L_0x02f5:
            int r0 = java.lang.Character.charCount(r14)
            int r13 = r13 + r0
            int r1 = r1 * 31
            int r1 = r1 + r14
            goto L_0x02be
        L_0x02fe:
            X.00i r14 = r6.A0E
            long r1 = (long) r1
            int r0 = r14.A01(r1)
            if (r0 < 0) goto L_0x0331
            java.lang.Object r12 = r14.A05(r1)
            java.lang.String r12 = (java.lang.String) r12
        L_0x030d:
            int r0 = r12.length()
            int r11 = r11 + r0
            boolean r0 = r5.A0C
            if (r0 == 0) goto L_0x032b
            r0 = r25
            A02(r7, r0, r12)
            r0 = r3
        L_0x031c:
            A02(r7, r0, r12)
            r0 = r25
            float r1 = r0.measureText(r12)
            float r1 = r1 + r9
            r0 = 0
            r7.translate(r1, r0)
            goto L_0x02ac
        L_0x032b:
            A02(r7, r3, r12)
            r0 = r25
            goto L_0x031c
        L_0x0331:
            java.lang.StringBuilder r0 = r6.A0H
            r15 = r0
            r0 = 0
            r15.setLength(r0)
        L_0x0338:
            if (r12 >= r13) goto L_0x0349
            r0 = r20
            int r0 = r0.codePointAt(r12)
            r15.appendCodePoint(r0)
            int r0 = java.lang.Character.charCount(r0)
            int r12 = r12 + r0
            goto L_0x0338
        L_0x0349:
            java.lang.String r12 = r15.toString()
            r14.A0A(r1, r12)
            goto L_0x030d
        L_0x0351:
            r7.restore()
            int r10 = r10 + 1
            goto L_0x028d
        L_0x0358:
            int r8 = r8 + 1
            goto L_0x0272
        L_0x035c:
            float r1 = r0.x
            goto L_0x0281
        L_0x0360:
            float r1 = r5.A02
            goto L_0x021b
        L_0x0364:
            java.util.Map r2 = r9.A0O
            if (r2 == 0) goto L_0x0398
            java.lang.String r1 = r4.A01
            r8 = r1
            boolean r0 = r2.containsKey(r1)
            if (r0 != 0) goto L_0x038e
            java.lang.String r1 = r4.A02
            boolean r0 = r2.containsKey(r1)
            if (r0 != 0) goto L_0x038e
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0v(r8)
            java.lang.String r0 = "-"
            r1.append(r0)
            java.lang.String r0 = r4.A03
            java.lang.String r1 = X.AnonymousClass000.A0q(r0, r1)
            boolean r0 = r2.containsKey(r1)
            if (r0 == 0) goto L_0x0398
        L_0x038e:
            java.lang.Object r1 = r2.get(r1)
            android.graphics.Typeface r1 = (android.graphics.Typeface) r1
        L_0x0394:
            if (r1 == 0) goto L_0x01f8
            goto L_0x020c
        L_0x0398:
            android.graphics.drawable.Drawable$Callback r0 = r9.getCallback()
            if (r0 == 0) goto L_0x01f8
            X.9Mv r12 = r9.A0I
            if (r12 != 0) goto L_0x03b5
            android.graphics.drawable.Drawable$Callback r1 = r9.getCallback()
            X.93V r0 = r9.A0D
            X.9Mv r12 = new X.9Mv
            r12.<init>(r1, r0)
            r9.A0I = r12
            java.lang.String r0 = r9.A0M
            if (r0 == 0) goto L_0x03b5
            r12.A01 = r0
        L_0x03b5:
            X.9VK r11 = r12.A03
            java.lang.String r10 = r4.A01
            java.lang.String r9 = r4.A03
            r11.A00 = r10
            r11.A01 = r9
            java.util.Map r8 = r12.A05
            java.lang.Object r1 = r8.get(r11)
            android.graphics.Typeface r1 = (android.graphics.Typeface) r1
            if (r1 != 0) goto L_0x020c
            java.util.Map r2 = r12.A04
            java.lang.Object r1 = r2.get(r10)
            android.graphics.Typeface r1 = (android.graphics.Typeface) r1
            if (r1 != 0) goto L_0x03e8
            r1 = 0
            X.93V r0 = r12.A00
            if (r0 == 0) goto L_0x03e3
            X.80p r0 = (X.C1684380p) r0
            com.whatsapp.chatinfo.view.custom.PhoneNumberHiddenInNewsletterBottomSheet r0 = r0.A00
            r0.A0a()
            android.graphics.Typeface r1 = X.C33511fU.A01()
        L_0x03e3:
            android.graphics.Typeface r0 = r4.A00
            if (r0 == 0) goto L_0x040d
            r1 = r0
        L_0x03e8:
            java.lang.String r0 = "Italic"
            boolean r2 = r9.contains(r0)
            java.lang.String r0 = "Bold"
            boolean r0 = r9.contains(r0)
            if (r2 == 0) goto L_0x0408
            r2 = 2
            if (r0 == 0) goto L_0x03fa
            r2 = 3
        L_0x03fa:
            int r0 = r1.getStyle()
            if (r0 == r2) goto L_0x0404
            android.graphics.Typeface r1 = android.graphics.Typeface.create(r1, r2)
        L_0x0404:
            r8.put(r11, r1)
            goto L_0x0394
        L_0x0408:
            boolean r2 = X.AnonymousClass000.A1P(r0)
            goto L_0x03fa
        L_0x040d:
            if (r1 != 0) goto L_0x0427
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "fonts/"
            r1.append(r0)
            r1.append(r10)
            java.lang.String r0 = r12.A01
            java.lang.String r1 = X.AnonymousClass000.A0q(r0, r1)
            android.content.res.AssetManager r0 = r12.A02
            android.graphics.Typeface r1 = android.graphics.Typeface.createFromAsset(r0, r1)
        L_0x0427:
            r2.put(r10, r1)
            goto L_0x03e8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass81H.A0B(android.graphics.Canvas, android.graphics.Matrix, int):void");
    }

    public AnonymousClass81H(C165737u4 r4, C195509Uo r5) {
        super(r4, r5);
        this.A0G = r4;
        this.A0F = r5.A09;
        AnonymousClass811 r0 = new AnonymousClass811(r5.A0B.A00);
        this.A0K = r0;
        r0.A09(this);
        A0C(r0);
        AnonymousClass9L3 r2 = r5.A0C;
        if (r2 != null) {
            AnonymousClass814 r02 = r2.A00;
            if (r02 != null) {
                C1685380z r03 = new C1685380z(r02.A00);
                this.A00 = r03;
                r03.A09(this);
                A0C(this.A00);
            }
            AnonymousClass814 r04 = r2.A01;
            if (r04 != null) {
                C1685380z r05 = new C1685380z(r04.A00);
                this.A02 = r05;
                r05.A09(this);
                A0C(this.A02);
            }
            AnonymousClass815 r06 = r2.A02;
            if (r06 != null) {
                AnonymousClass812 A002 = C1684680s.A00(r06);
                this.A04 = A002;
                A002.A09(this);
                A0C(this.A04);
            }
            AnonymousClass815 r07 = r2.A03;
            if (r07 != null) {
                AnonymousClass812 A003 = C1684680s.A00(r07);
                this.A07 = A003;
                A003.A09(this);
                A0C(this.A07);
            }
        }
    }

    public static void A01(Canvas canvas, Paint paint, Path path) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() != Paint.Style.STROKE || paint.getStrokeWidth() != 0.0f) {
            canvas.drawPath(path, paint);
        }
    }

    public void B0q(C199409fG r4, Object obj) {
        C196189Yb r0;
        super.B0q(r4, obj);
        if (obj == B4R.A0Z) {
            C196189Yb r1 = this.A01;
            if (r1 != null) {
                this.A0M.remove(r1);
            }
            if (r4 == null) {
                this.A01 = null;
                return;
            }
            C1684980v r02 = new C1684980v(r4, (Object) null);
            this.A01 = r02;
            r02.A09(this);
            r0 = this.A01;
        } else if (obj == B4R.A0c) {
            C196189Yb r12 = this.A03;
            if (r12 != null) {
                this.A0M.remove(r12);
            }
            if (r4 == null) {
                this.A03 = null;
                return;
            }
            C1684980v r03 = new C1684980v(r4, (Object) null);
            this.A03 = r03;
            r03.A09(this);
            r0 = this.A03;
        } else if (obj == B4R.A0O) {
            C196189Yb r13 = this.A05;
            if (r13 != null) {
                this.A0M.remove(r13);
            }
            if (r4 == null) {
                this.A05 = null;
                return;
            }
            C1684980v r04 = new C1684980v(r4, (Object) null);
            this.A05 = r04;
            r04.A09(this);
            r0 = this.A05;
        } else if (obj == B4R.A0Q) {
            C196189Yb r14 = this.A08;
            if (r14 != null) {
                this.A0M.remove(r14);
            }
            if (r4 == null) {
                this.A08 = null;
                return;
            }
            C1684980v r05 = new C1684980v(r4, (Object) null);
            this.A08 = r05;
            r05.A09(this);
            r0 = this.A08;
        } else if (obj == B4R.A0P) {
            C196189Yb r15 = this.A06;
            if (r15 != null) {
                this.A0M.remove(r15);
            }
            if (r4 == null) {
                this.A06 = null;
                return;
            }
            C1684980v r06 = new C1684980v(r4, (Object) null);
            this.A06 = r06;
            r06.A09(this);
            r0 = this.A06;
        } else if (obj == B4R.A07) {
            C196189Yb r16 = this.A09;
            if (r16 != null) {
                this.A0M.remove(r16);
            }
            if (r4 == null) {
                this.A09 = null;
                return;
            }
            C1684980v r07 = new C1684980v(r4, (Object) null);
            this.A09 = r07;
            r07.A09(this);
            r0 = this.A09;
        } else if (obj == "dynamic_text") {
            this.A0K.A0B(r4);
            return;
        } else {
            return;
        }
        A0C(r0);
    }

    public void B8v(Matrix matrix, RectF rectF, boolean z) {
        super.B8v(matrix, rectF, z);
        AnonymousClass9Y2 r1 = this.A0F;
        rectF.set(0.0f, 0.0f, (float) r1.A04.width(), (float) r1.A04.height());
    }
}
