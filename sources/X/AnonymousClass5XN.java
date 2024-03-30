package X;

import android.content.res.TypedArray;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: X.5XN  reason: invalid class name */
public abstract class AnonymousClass5XN {
    public static float A00(TypedArray typedArray, String str, XmlPullParser xmlPullParser, int i) {
        if (!AnonymousClass0Yh.A04(str, xmlPullParser)) {
            return 0.0f;
        }
        return typedArray.getFloat(i, 0.0f);
    }

    public static float A01(TypedArray typedArray, String str, XmlPullParser xmlPullParser, int i) {
        if (!AnonymousClass0Yh.A04(str, xmlPullParser)) {
            return 1.0f;
        }
        return typedArray.getFloat(i, 1.0f);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:157:0x04ad, code lost:
        if (r9 == r19) goto L_0x04af;
     */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0121  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0168 A[LOOP:2: B:49:0x0160->B:51:0x0168, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x016c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C128906Eb A02(X.C161337ma r35, int r36) {
        /*
            r0 = 473971343(0x1c403a8f, float:6.3603156E-22)
            r7 = r35
            r7.Bum(r0)
            X.4gm r2 = X.C131966Ro.A01
            r4 = r7
            X.6fF r4 = (X.C136916fF) r4
            java.lang.Object r8 = X.AnonymousClass6G0.A01(r4, r2)
            android.content.Context r8 = (android.content.Context) r8
            r6 = 0
            X.4gm r1 = X.C131966Ro.A00
            X.7n6 r0 = X.C136916fF.A04(r4)
            X.AnonymousClass6G0.A02(r1, r0)
            java.lang.Object r0 = X.AnonymousClass6G0.A01(r4, r2)
            android.content.Context r0 = (android.content.Context) r0
            android.content.res.Resources r11 = r0.getResources()
            java.lang.Object r1 = X.C90494aF.A0X(r7)
            java.lang.Object r19 = X.C129736Ig.A00
            r0 = r19
            if (r1 != r0) goto L_0x0039
            android.util.TypedValue r1 = new android.util.TypedValue
            r1.<init>()
            r7.Bwv(r1)
        L_0x0039:
            X.C136916fF.A0M(r4, r6)
            android.util.TypedValue r1 = (android.util.TypedValue) r1
            r3 = 1
            r2 = r36
            r11.getValue(r2, r1, r3)
            java.lang.CharSequence r5 = r1.string
            if (r5 == 0) goto L_0x03fc
            java.lang.String r0 = ".xml"
            boolean r0 = X.AnonymousClass099.A0M(r5, r0)
            if (r0 != r3) goto L_0x03fc
            r0 = -738265327(0xffffffffd3fef711, float:-2.19013356E12)
            r7.Bum(r0)
            android.content.res.Resources$Theme r10 = r8.getTheme()
            int r0 = r1.changingConfigurations
            r36 = r0
            r0 = 21855625(0x14d7d89, float:3.774262E-38)
            r7.Bum(r0)
            X.4gm r0 = X.C131966Ro.A02
            java.lang.Object r0 = X.AnonymousClass6G0.A01(r4, r0)
            X.5hB r0 = (X.C114395hB) r0
            X.69H r15 = new X.69H
            r15.<init>(r10, r2)
            java.util.HashMap r0 = r0.A00
            r35 = r0
            java.lang.Object r0 = r0.get(r15)
            java.lang.ref.Reference r0 = (java.lang.ref.Reference) r0
            if (r0 == 0) goto L_0x0085
            java.lang.Object r5 = r0.get()
            X.69G r5 = (X.AnonymousClass69G) r5
            if (r5 != 0) goto L_0x0485
        L_0x0085:
            android.content.res.XmlResourceParser r0 = r11.getXml(r2)
        L_0x0089:
            int r2 = r0.next()
            r1 = 2
            if (r2 == r1) goto L_0x009a
            if (r2 != r3) goto L_0x0089
            java.lang.String r1 = "No start tag found"
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            r0.<init>(r1)
            throw r0
        L_0x009a:
            java.lang.String r2 = r0.getName()
            java.lang.String r1 = "vector"
            boolean r1 = X.AnonymousClass00C.A0J(r2, r1)
            if (r1 == 0) goto L_0x03f5
            android.util.AttributeSet r14 = android.util.Xml.asAttributeSet(r0)
            int[] r1 = X.C113965gQ.A03
            android.content.res.TypedArray r8 = X.AnonymousClass0Yh.A02(r10, r11, r14, r1)
            r8.getChangingConfigurations()
            java.lang.String r1 = "autoMirrored"
            r2 = 5
            boolean r1 = X.AnonymousClass0Yh.A04(r1, r0)
            if (r1 != 0) goto L_0x03ba
            r28 = 0
        L_0x00be:
            r8.getChangingConfigurations()
            java.lang.String r5 = "viewportWidth"
            r1 = 0
            r18 = 0
            r2 = 7
            float r23 = A00(r8, r5, r0, r2)
            r8.getChangingConfigurations()
            java.lang.String r5 = "viewportHeight"
            r2 = 8
            float r24 = A00(r8, r5, r0, r2)
            r8.getChangingConfigurations()
            int r2 = (r23 > r1 ? 1 : (r23 == r1 ? 0 : -1))
            if (r2 <= 0) goto L_0x03de
            int r2 = (r24 > r1 ? 1 : (r24 == r1 ? 0 : -1))
            if (r2 <= 0) goto L_0x03c7
            r5 = 3
            float r21 = r8.getDimension(r5, r1)
            r8.getChangingConfigurations()
            r2 = 2
            float r22 = r8.getDimension(r2, r1)
            r8.getChangingConfigurations()
            boolean r1 = r8.hasValue(r3)
            if (r1 == 0) goto L_0x03b6
            android.util.TypedValue r1 = new android.util.TypedValue
            r1.<init>()
            r8.getValue(r3, r1)
            int r1 = r1.type
            if (r1 == r2) goto L_0x03b6
            android.content.res.ColorStateList r1 = X.AnonymousClass0Yh.A01(r10, r8, r0)
            r8.getChangingConfigurations()
            if (r1 == 0) goto L_0x03b6
            int r1 = r1.getDefaultColor()
            long r1 = (long) r1
            r9 = 32
            long r1 = r1 << r9
            long r12 = X.C133336Xx.A01
        L_0x0116:
            r9 = 6
            r13 = -1
            int r9 = r8.getInt(r9, r13)
            r8.getChangingConfigurations()
            if (r9 == r13) goto L_0x012d
            if (r9 == r5) goto L_0x03b2
            r5 = 5
            if (r9 == r5) goto L_0x012d
            r5 = 9
            if (r9 == r5) goto L_0x03ae
            switch(r9) {
                case 14: goto L_0x03aa;
                case 15: goto L_0x03a6;
                case 16: goto L_0x03a2;
                default: goto L_0x012d;
            }
        L_0x012d:
            r25 = 5
        L_0x012f:
            android.util.DisplayMetrics r5 = r11.getDisplayMetrics()
            float r5 = r5.density
            float r21 = r21 / r5
            android.util.DisplayMetrics r5 = r11.getDisplayMetrics()
            float r5 = r5.density
            float r22 = r22 / r5
            r8.recycle()
            X.6Sv r5 = new X.6Sv
            r20 = r5
            r26 = r1
            r20.<init>(r21, r22, r23, r24, r25, r26, r28)
            r17 = 0
        L_0x014d:
            int r1 = r0.getEventType()
            if (r1 == r3) goto L_0x0160
            int r1 = r0.getDepth()
            if (r1 >= r3) goto L_0x016c
            int r2 = r0.getEventType()
            r1 = 3
            if (r2 != r1) goto L_0x016c
        L_0x0160:
            java.util.ArrayList r0 = r5.A07
            int r0 = r0.size()
            if (r0 <= r3) goto L_0x044c
            r5.A01()
            goto L_0x0160
        L_0x016c:
            int r2 = r0.getEventType()
            r1 = 2
            java.lang.String r9 = "group"
            if (r2 == r1) goto L_0x018d
            r1 = 3
            if (r2 != r1) goto L_0x039d
            java.lang.String r1 = r0.getName()
            boolean r1 = r9.equals(r1)
            if (r1 == 0) goto L_0x039d
            int r2 = r17 + 1
            r1 = 0
        L_0x0185:
            if (r1 >= r2) goto L_0x039b
            r5.A01()
            int r1 = r1 + 1
            goto L_0x0185
        L_0x018d:
            java.lang.String r2 = r0.getName()
            if (r2 == 0) goto L_0x039d
            int r8 = r2.hashCode()
            r1 = -1649314686(0xffffffff9db17482, float:-4.6971976E-21)
            if (r8 == r1) goto L_0x0352
            r1 = 3433509(0x346425, float:4.811371E-39)
            if (r8 == r1) goto L_0x0218
            r1 = 98629247(0x5e0f67f, float:2.1155407E-35)
            if (r8 != r1) goto L_0x039d
            boolean r1 = r2.equals(r9)
            if (r1 == 0) goto L_0x039d
            int[] r1 = X.C113965gQ.A01
            android.content.res.TypedArray r1 = X.AnonymousClass0Yh.A02(r10, r11, r14, r1)
            r1.getChangingConfigurations()
            java.lang.String r8 = "rotation"
            r2 = 5
            float r23 = A00(r1, r8, r0, r2)
            r1.getChangingConfigurations()
            r2 = r18
            float r24 = r1.getFloat(r3, r2)
            r1.getChangingConfigurations()
            r8 = 2
            float r25 = r1.getFloat(r8, r2)
            r1.getChangingConfigurations()
            java.lang.String r8 = "scaleX"
            r2 = 3
            float r26 = A01(r1, r8, r0, r2)
            r1.getChangingConfigurations()
            java.lang.String r8 = "scaleY"
            r2 = 4
            float r27 = A01(r1, r8, r0, r2)
            r1.getChangingConfigurations()
            java.lang.String r8 = "translateX"
            r2 = 6
            float r28 = A00(r1, r8, r0, r2)
            r1.getChangingConfigurations()
            java.lang.String r8 = "translateY"
            r2 = 7
            float r29 = A00(r1, r8, r0, r2)
            r1.getChangingConfigurations()
            java.lang.String r21 = r1.getString(r6)
            r1.getChangingConfigurations()
            if (r21 != 0) goto L_0x0203
            java.lang.String r21 = ""
        L_0x0203:
            r1.recycle()
            java.util.List r22 = X.C196389Zl.A00
            r30 = 512(0x200, float:7.175E-43)
            X.6Lm r1 = new X.6Lm
            r20 = r1
            r20.<init>(r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            java.util.ArrayList r2 = r5.A07
            r2.add(r1)
            goto L_0x039d
        L_0x0218:
            java.lang.String r1 = "path"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x039d
            int[] r1 = X.C113965gQ.A02
            android.content.res.TypedArray r1 = X.AnonymousClass0Yh.A02(r10, r11, r14, r1)
            r1.getChangingConfigurations()
            java.lang.String r2 = "pathData"
            boolean r2 = X.AnonymousClass0Yh.A04(r2, r0)
            if (r2 == 0) goto L_0x03c0
            java.lang.String r23 = r1.getString(r6)
            r1.getChangingConfigurations()
            if (r23 != 0) goto L_0x023c
            java.lang.String r23 = ""
        L_0x023c:
            r2 = 2
            java.lang.String r2 = r1.getString(r2)
            r1.getChangingConfigurations()
            java.util.List r24 = X.C196389Zl.A00(r2)
            java.lang.String r2 = "fillColor"
            X.0Sm r9 = X.AnonymousClass0Yh.A03(r10, r1, r2, r0, r3)
            r1.getChangingConfigurations()
            java.lang.String r8 = "fillAlpha"
            r2 = 12
            float r25 = A01(r1, r8, r0, r2)
            r1.getChangingConfigurations()
            java.lang.String r8 = "strokeLineCap"
            r2 = 8
            boolean r8 = X.AnonymousClass0Yh.A04(r8, r0)
            if (r8 != 0) goto L_0x034c
            r8 = -1
        L_0x0267:
            r1.getChangingConfigurations()
            r33 = 0
            if (r8 == 0) goto L_0x0275
            if (r8 == r3) goto L_0x0348
            r2 = 2
            if (r8 != r2) goto L_0x0275
            r33 = 2
        L_0x0275:
            java.lang.String r8 = "strokeLineJoin"
            r2 = 9
            boolean r8 = X.AnonymousClass0Yh.A04(r8, r0)
            if (r8 != 0) goto L_0x0342
            r2 = -1
        L_0x0280:
            r1.getChangingConfigurations()
            r34 = 2
            if (r2 == 0) goto L_0x033e
            if (r2 != r3) goto L_0x028b
            r34 = 1
        L_0x028b:
            java.lang.String r8 = "strokeMiterLimit"
            r2 = 10
            float r28 = A01(r1, r8, r0, r2)
            r1.getChangingConfigurations()
            r8 = 3
            java.lang.String r2 = "strokeColor"
            X.0Sm r12 = X.AnonymousClass0Yh.A03(r10, r1, r2, r0, r8)
            r1.getChangingConfigurations()
            java.lang.String r8 = "strokeAlpha"
            r2 = 11
            float r26 = A01(r1, r8, r0, r2)
            r1.getChangingConfigurations()
            java.lang.String r8 = "strokeWidth"
            r2 = 4
            float r27 = A01(r1, r8, r0, r2)
            r1.getChangingConfigurations()
            java.lang.String r8 = "trimPathEnd"
            r2 = 6
            float r30 = A01(r1, r8, r0, r2)
            r1.getChangingConfigurations()
            java.lang.String r8 = "trimPathOffset"
            r2 = 7
            float r31 = A00(r1, r8, r0, r2)
            r1.getChangingConfigurations()
            java.lang.String r8 = "trimPathStart"
            r2 = 5
            float r29 = A00(r1, r8, r0, r2)
            r1.getChangingConfigurations()
            java.lang.String r8 = "fillType"
            r2 = 13
            boolean r8 = X.AnonymousClass0Yh.A04(r8, r0)
            if (r8 != 0) goto L_0x0339
            r16 = 0
        L_0x02df:
            r1.getChangingConfigurations()
            r1.recycle()
            android.graphics.Shader r1 = r9.A02
            if (r1 == 0) goto L_0x0329
            X.4iM r2 = new X.4iM
            r2.<init>(r1)
        L_0x02ee:
            android.graphics.Shader r8 = r12.A02
            if (r8 == 0) goto L_0x0319
            X.4iM r1 = new X.4iM
            r1.<init>(r8)
        L_0x02f7:
            boolean r32 = X.C90504aG.A1T(r16)
            java.util.ArrayList r9 = r5.A07
            int r8 = X.C90504aG.A0C(r9)
            java.lang.Object r8 = r9.get(r8)
            X.6Lm r8 = (X.C130546Lm) r8
            java.util.List r9 = r8.A08
            X.4ia r8 = new X.4ia
            r20 = r8
            r21 = r2
            r22 = r1
            r20.<init>(r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)
            r9.add(r8)
            goto L_0x039d
        L_0x0319:
            int r1 = r12.A00
            if (r1 == 0) goto L_0x0327
            long r8 = (long) r1
            r1 = 32
            long r8 = r8 << r1
            X.4iI r1 = new X.4iI
            r1.<init>(r8)
            goto L_0x02f7
        L_0x0327:
            r1 = 0
            goto L_0x02f7
        L_0x0329:
            int r1 = r9.A00
            if (r1 == 0) goto L_0x0337
            long r8 = (long) r1
            r1 = 32
            long r8 = r8 << r1
            X.4iI r2 = new X.4iI
            r2.<init>(r8)
            goto L_0x02ee
        L_0x0337:
            r2 = 0
            goto L_0x02ee
        L_0x0339:
            int r16 = r1.getInt(r2, r6)
            goto L_0x02df
        L_0x033e:
            r34 = 0
            goto L_0x028b
        L_0x0342:
            int r2 = r1.getInt(r2, r13)
            goto L_0x0280
        L_0x0348:
            r33 = 1
            goto L_0x0275
        L_0x034c:
            int r8 = r1.getInt(r2, r13)
            goto L_0x0267
        L_0x0352:
            java.lang.String r1 = "clip-path"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x039d
            int[] r1 = X.C113965gQ.A00
            android.content.res.TypedArray r2 = X.AnonymousClass0Yh.A02(r10, r11, r14, r1)
            r2.getChangingConfigurations()
            java.lang.String r21 = r2.getString(r6)
            r2.getChangingConfigurations()
            if (r21 != 0) goto L_0x036e
            java.lang.String r21 = ""
        L_0x036e:
            java.lang.String r1 = r2.getString(r3)
            r2.getChangingConfigurations()
            java.util.List r22 = X.C196389Zl.A00(r1)
            r2.recycle()
            r26 = 1065353216(0x3f800000, float:1.0)
            r30 = 512(0x200, float:7.175E-43)
            X.6Lm r1 = new X.6Lm
            r23 = 0
            r24 = 0
            r25 = 0
            r27 = 1065353216(0x3f800000, float:1.0)
            r28 = 0
            r29 = 0
            r20 = r1
            r20.<init>(r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            java.util.ArrayList r2 = r5.A07
            r2.add(r1)
            int r17 = r17 + 1
            goto L_0x039d
        L_0x039b:
            r17 = 0
        L_0x039d:
            r0.next()
            goto L_0x014d
        L_0x03a2:
            r25 = 12
            goto L_0x012f
        L_0x03a6:
            r25 = 14
            goto L_0x012f
        L_0x03aa:
            r25 = 13
            goto L_0x012f
        L_0x03ae:
            r25 = 9
            goto L_0x012f
        L_0x03b2:
            r25 = 3
            goto L_0x012f
        L_0x03b6:
            long r1 = X.C133336Xx.A05
            goto L_0x0116
        L_0x03ba:
            boolean r28 = r8.getBoolean(r2, r6)
            goto L_0x00be
        L_0x03c0:
            java.lang.String r0 = "No path data available"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A08(r0)
            throw r0
        L_0x03c7:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = r8.getPositionDescription()
            r1.append(r0)
            java.lang.String r0 = "<VectorGraphic> tag requires viewportHeight > 0"
            java.lang.String r1 = X.AnonymousClass000.A0q(r0, r1)
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            r0.<init>(r1)
            throw r0
        L_0x03de:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = r8.getPositionDescription()
            r1.append(r0)
            java.lang.String r0 = "<VectorGraphic> tag requires viewportWidth > 0"
            java.lang.String r1 = X.AnonymousClass000.A0q(r0, r1)
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            r0.<init>(r1)
            throw r0
        L_0x03f5:
            java.lang.String r0 = "Only VectorDrawables and rasterized asset types are supported ex. PNG, JPG, WEBP"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A08(r0)
            throw r0
        L_0x03fc:
            r0 = -738265172(0xffffffffd3fef7ac, float:-2.19015388E12)
            r7.Bum(r0)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            android.content.res.Resources$Theme r1 = r8.getTheme()
            r0 = 1618982084(0x607fb4c4, float:7.370227E19)
            r7.Bum(r0)
            boolean r0 = r7.B2f(r5)
            boolean r3 = r7.B2f(r3)
            r3 = r3 | r0
            boolean r0 = r7.B2f(r1)
            r3 = r3 | r0
            java.lang.Object r1 = r7.BnZ()
            if (r3 != 0) goto L_0x0428
            r0 = r19
            if (r1 != r0) goto L_0x0440
        L_0x0428:
            r0 = 0
            android.graphics.drawable.Drawable r1 = r11.getDrawable(r2, r0)     // Catch:{ Exception -> 0x0535 }
            java.lang.String r0 = "null cannot be cast to non-null type android.graphics.drawable.BitmapDrawable"
            X.AnonymousClass00C.A0E(r1, r0)     // Catch:{ Exception -> 0x0535 }
            android.graphics.drawable.BitmapDrawable r1 = (android.graphics.drawable.BitmapDrawable) r1     // Catch:{ Exception -> 0x0535 }
            android.graphics.Bitmap r0 = r1.getBitmap()     // Catch:{ Exception -> 0x0535 }
            X.6g5 r1 = new X.6g5     // Catch:{ Exception -> 0x0535 }
            r1.<init>(r0)     // Catch:{ Exception -> 0x0535 }
            r4.A0R(r1)
        L_0x0440:
            X.C136916fF.A0M(r4, r6)
            X.B3v r1 = (X.C23085B3v) r1
            X.4iV r9 = new X.4iV
            r9.<init>(r1)
            goto L_0x052c
        L_0x044c:
            float r12 = r5.A02
            float r11 = r5.A01
            float r10 = r5.A04
            float r9 = r5.A03
            X.6Lm r0 = r5.A00
            X.4ib r21 = X.C132256Sv.A00(r0)
            long r0 = r5.A06
            int r8 = r5.A05
            boolean r3 = r5.A08
            X.6OS r2 = new X.6OS
            r22 = r12
            r23 = r11
            r24 = r10
            r25 = r9
            r26 = r8
            r27 = r0
            r29 = r3
            r20 = r2
            r20.<init>(r21, r22, r23, r24, r25, r26, r27, r29)
            X.69G r5 = new X.69G
            r0 = r36
            r5.<init>(r2, r0)
            java.lang.ref.WeakReference r1 = X.AnonymousClass001.A0F(r5)
            r0 = r35
            r0.put(r15, r1)
        L_0x0485:
            X.6OS r12 = r5.A01
            X.C136916fF.A0M(r4, r6)
            r0 = 1413834416(0x544566b0, float:3.39132547E12)
            r7.Bum(r0)
            X.4gm r0 = X.C131996Rr.A00
            java.lang.Object r2 = X.AnonymousClass6G0.A01(r4, r0)
            X.7ni r2 = (X.C161937ni) r2
            int r0 = r12.A04
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            boolean r0 = X.C90464aC.A1X(r7, r1, r2, r0)
            java.lang.Object r9 = r7.BnZ()
            if (r0 != 0) goto L_0x04af
            r0 = r19
            if (r9 != r0) goto L_0x0524
        L_0x04af:
            X.4iZ r5 = new X.4iZ
            r5.<init>()
            X.4ib r0 = r12.A07
            X.C109115Wi.A01(r5, r0)
            float r1 = r12.A01
            float r0 = r12.A00
            float r1 = r2.Bvq(r1)
            float r0 = r2.Bvq(r0)
            long r7 = X.C90464aC.A0B(r1, r0)
            long r0 = X.AnonymousClass6X0.A02
            float r2 = r12.A03
            float r1 = r12.A02
            boolean r0 = java.lang.Float.isNaN(r2)
            if (r0 == 0) goto L_0x04d9
            float r2 = X.AnonymousClass6X0.A01(r7)
        L_0x04d9:
            boolean r0 = java.lang.Float.isNaN(r1)
            if (r0 == 0) goto L_0x04e3
            float r1 = X.AnonymousClass6X0.A00(r7)
        L_0x04e3:
            long r2 = X.C90464aC.A0B(r2, r1)
            X.4iW r9 = new X.4iW
            r9.<init>(r5)
            java.lang.String r10 = ""
            long r0 = r12.A06
            int r15 = r12.A05
            long r13 = X.C133336Xx.A05
            int r5 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r5 == 0) goto L_0x0533
            X.4iJ r11 = new X.4iJ
            r11.<init>(r0, r15)
        L_0x04fd:
            boolean r5 = r12.A08
            X.7n5 r1 = r9.A05
            X.6X0 r0 = new X.6X0
            r0.<init>(r7)
            r1.setValue(r0)
            X.7n5 r0 = r9.A04
            X.C90474aD.A11(r0, r5)
            X.4iY r5 = r9.A06
            X.7n5 r0 = r5.A07
            r0.setValue(r11)
            X.7n5 r1 = r5.A08
            X.6X0 r0 = new X.6X0
            r0.<init>(r2)
            r1.setValue(r0)
            r5.A02 = r10
            r4.A0R(r9)
        L_0x0524:
            X.C136916fF.A0M(r4, r6)
            X.6Eb r9 = (X.C128906Eb) r9
            X.C136916fF.A0M(r4, r6)
        L_0x052c:
            X.C136916fF.A0M(r4, r6)
            X.C136916fF.A0M(r4, r6)
            return r9
        L_0x0533:
            r11 = 0
            goto L_0x04fd
        L_0x0535:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Error attempting to load resource: "
            java.lang.String r1 = X.AnonymousClass000.A0l(r5, r0, r1)
            X.78H r0 = new X.78H
            r0.<init>(r1, r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5XN.A02(X.7ma, int):X.6Eb");
    }
}
