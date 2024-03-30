package X;

/* renamed from: X.0Wr  reason: invalid class name and case insensitive filesystem */
public final class C07190Wr {
    public final float A00;
    public final float A01;
    public final float A02;
    public final C08800bL A03;
    public final C08800bL A04;

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x007a, code lost:
        if (r1 != false) goto L_0x007c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C07190Wr(android.content.Context r7, X.C08800bL r8) {
        /*
            r6 = this;
            r6.<init>()
            X.0bL r2 = new X.0bL
            r2.<init>()
            r6.A03 = r2
            if (r8 != 0) goto L_0x0011
            X.0bL r8 = new X.0bL
            r8.<init>()
        L_0x0011:
            int r0 = r8.A01
            android.content.res.TypedArray r3 = A00(r7, r0)
            android.content.res.Resources r4 = r7.getResources()
            r1 = 2
            r0 = 2131167429(0x7f0708c5, float:1.7949131E38)
            int r0 = r4.getDimensionPixelSize(r0)
            int r0 = r3.getDimensionPixelSize(r1, r0)
            float r0 = (float) r0
            r6.A00 = r0
            r1 = 4
            r0 = 2131167428(0x7f0708c4, float:1.794913E38)
            int r0 = r4.getDimensionPixelSize(r0)
            int r0 = r3.getDimensionPixelSize(r1, r0)
            float r0 = (float) r0
            r6.A01 = r0
            r1 = 5
            r0 = 2131167434(0x7f0708ca, float:1.7949141E38)
            int r0 = r4.getDimensionPixelSize(r0)
            int r0 = r3.getDimensionPixelSize(r1, r0)
            float r0 = (float) r0
            r6.A02 = r0
            int r0 = r8.A00
            r5 = -2
            if (r0 != r5) goto L_0x004f
            r0 = 255(0xff, float:3.57E-43)
        L_0x004f:
            r2.A00 = r0
            java.lang.CharSequence r0 = r8.A07
            if (r0 != 0) goto L_0x005c
            r0 = 2131896786(0x7f1229d2, float:1.9428443E38)
            java.lang.String r0 = r7.getString(r0)
        L_0x005c:
            r2.A07 = r0
            int r0 = r8.A03
            if (r0 != 0) goto L_0x0065
            r0 = 2131755437(0x7f1001ad, float:1.9141753E38)
        L_0x0065:
            r2.A03 = r0
            int r0 = r8.A02
            if (r0 != 0) goto L_0x006e
            r0 = 2131896799(0x7f1229df, float:1.942847E38)
        L_0x006e:
            r2.A02 = r0
            java.lang.Boolean r0 = r8.A06
            r4 = 0
            if (r0 == 0) goto L_0x007c
            boolean r1 = r0.booleanValue()
            r0 = 0
            if (r1 == 0) goto L_0x007d
        L_0x007c:
            r0 = 1
        L_0x007d:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.A06 = r0
            int r0 = r8.A04
            if (r0 != r5) goto L_0x008e
            r1 = 8
            r0 = 4
            int r0 = r3.getInt(r1, r0)
        L_0x008e:
            r2.A04 = r0
            int r0 = r8.A05
            if (r0 != r5) goto L_0x00a2
            r0 = 9
            r1 = 9
            boolean r0 = r3.hasValue(r0)
            if (r0 == 0) goto L_0x0194
            int r0 = r3.getInt(r1, r4)
        L_0x00a2:
            r2.A05 = r0
            java.lang.Integer r0 = r8.A0A
            if (r0 != 0) goto L_0x018e
            android.content.res.ColorStateList r0 = X.AnonymousClass061.A00(r7, r3, r4)
            int r0 = r0.getDefaultColor()
        L_0x00b0:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A0A = r0
            java.lang.Integer r0 = r8.A0C
            if (r0 != 0) goto L_0x00ce
            r0 = 3
            boolean r0 = r3.hasValue(r0)
            if (r0 == 0) goto L_0x0182
            r0 = 3
            android.content.res.ColorStateList r0 = X.AnonymousClass061.A00(r7, r3, r0)
        L_0x00c6:
            int r0 = r0.getDefaultColor()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x00ce:
            r2.A0C = r0
            java.lang.Integer r0 = r8.A0B
            if (r0 != 0) goto L_0x017c
            r1 = 1
            r0 = 8388661(0x800035, float:1.1755018E-38)
            int r0 = r3.getInt(r1, r0)
        L_0x00dc:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A0B = r0
            java.lang.Integer r0 = r8.A0E
            if (r0 != 0) goto L_0x0176
            r0 = 6
            int r0 = r3.getDimensionPixelOffset(r0, r4)
        L_0x00eb:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A0E = r0
            java.lang.Integer r0 = r8.A0G
            if (r0 != 0) goto L_0x0171
            r0 = 10
            int r0 = r3.getDimensionPixelOffset(r0, r4)
        L_0x00fb:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A0G = r0
            java.lang.Integer r0 = r8.A0D
            if (r0 != 0) goto L_0x016c
            r1 = 7
            java.lang.Integer r0 = r2.A0E
            int r0 = r0.intValue()
            int r0 = r3.getDimensionPixelOffset(r1, r0)
        L_0x0110:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A0D = r0
            java.lang.Integer r0 = r8.A0F
            if (r0 != 0) goto L_0x0167
            r1 = 11
            java.lang.Integer r0 = r2.A0G
            int r0 = r0.intValue()
            int r0 = r3.getDimensionPixelOffset(r1, r0)
        L_0x0126:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A0F = r0
            java.lang.Integer r0 = r8.A08
            if (r0 != 0) goto L_0x0162
            r0 = 0
        L_0x0131:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A08 = r0
            java.lang.Integer r0 = r8.A09
            if (r0 == 0) goto L_0x013f
            int r4 = r0.intValue()
        L_0x013f:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            r2.A09 = r0
            r3.recycle()
            java.util.Locale r0 = r8.A0H
            if (r0 != 0) goto L_0x0158
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 24
            if (r1 < r0) goto L_0x015d
            java.util.Locale$Category r0 = java.util.Locale.Category.FORMAT
            java.util.Locale r0 = java.util.Locale.getDefault(r0)
        L_0x0158:
            r2.A0H = r0
            r6.A04 = r8
            return
        L_0x015d:
            java.util.Locale r0 = java.util.Locale.getDefault()
            goto L_0x0158
        L_0x0162:
            int r0 = r0.intValue()
            goto L_0x0131
        L_0x0167:
            int r0 = r0.intValue()
            goto L_0x0126
        L_0x016c:
            int r0 = r0.intValue()
            goto L_0x0110
        L_0x0171:
            int r0 = r0.intValue()
            goto L_0x00fb
        L_0x0176:
            int r0 = r0.intValue()
            goto L_0x00eb
        L_0x017c:
            int r0 = r0.intValue()
            goto L_0x00dc
        L_0x0182:
            r1 = 2132083813(0x7f150465, float:1.9807779E38)
            X.0YF r0 = new X.0YF
            r0.<init>(r7, r1)
            android.content.res.ColorStateList r0 = r0.A01
            goto L_0x00c6
        L_0x018e:
            int r0 = r0.intValue()
            goto L_0x00b0
        L_0x0194:
            r0 = -1
            goto L_0x00a2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C07190Wr.<init>(android.content.Context, X.0bL):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x006d, code lost:
        if (r11 == 0) goto L_0x006f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x001d A[Catch:{ IOException | XmlPullParserException -> 0x004c }] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x002c A[Catch:{ IOException | XmlPullParserException -> 0x004c }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.content.res.TypedArray A00(android.content.Context r11, int r12) {
        /*
            r10 = 2130968725(0x7f040095, float:1.7546112E38)
            r5 = 0
            r6 = r11
            if (r12 == 0) goto L_0x0067
            java.lang.String r4 = "badge"
            android.content.res.Resources r0 = r11.getResources()     // Catch:{ IOException | XmlPullParserException -> 0x004c }
            android.content.res.XmlResourceParser r3 = r0.getXml(r12)     // Catch:{ IOException | XmlPullParserException -> 0x004c }
        L_0x0011:
            int r2 = r3.next()     // Catch:{ IOException | XmlPullParserException -> 0x004c }
            r1 = 2
            if (r2 == r1) goto L_0x001b
            r0 = 1
            if (r2 != r0) goto L_0x0011
        L_0x001b:
            if (r2 != r1) goto L_0x002c
            java.lang.String r0 = r3.getName()     // Catch:{ IOException | XmlPullParserException -> 0x004c }
            boolean r0 = android.text.TextUtils.equals(r0, r4)     // Catch:{ IOException | XmlPullParserException -> 0x004c }
            if (r0 == 0) goto L_0x0034
            android.util.AttributeSet r7 = android.util.Xml.asAttributeSet(r3)     // Catch:{ IOException | XmlPullParserException -> 0x004c }
            goto L_0x0069
        L_0x002c:
            java.lang.String r0 = "No start tag found"
            org.xmlpull.v1.XmlPullParserException r1 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ IOException | XmlPullParserException -> 0x004c }
            r1.<init>(r0)     // Catch:{ IOException | XmlPullParserException -> 0x004c }
            goto L_0x004b
        L_0x0034:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ IOException | XmlPullParserException -> 0x004c }
            java.lang.String r0 = "Must have a <"
            r1.append(r0)     // Catch:{ IOException | XmlPullParserException -> 0x004c }
            r1.append(r4)     // Catch:{ IOException | XmlPullParserException -> 0x004c }
            java.lang.String r0 = "> start tag"
            java.lang.String r0 = X.AnonymousClass000.A0q(r0, r1)     // Catch:{ IOException | XmlPullParserException -> 0x004c }
            org.xmlpull.v1.XmlPullParserException r1 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ IOException | XmlPullParserException -> 0x004c }
            r1.<init>(r0)     // Catch:{ IOException | XmlPullParserException -> 0x004c }
        L_0x004b:
            throw r1     // Catch:{ IOException | XmlPullParserException -> 0x004c }
        L_0x004c:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Can't load badge resource ID #0x"
            r1.append(r0)
            java.lang.String r0 = java.lang.Integer.toHexString(r12)
            java.lang.String r1 = X.AnonymousClass000.A0q(r0, r1)
            android.content.res.Resources$NotFoundException r0 = new android.content.res.Resources$NotFoundException
            r0.<init>(r1)
            r0.initCause(r2)
            throw r0
        L_0x0067:
            r7 = 0
            goto L_0x006f
        L_0x0069:
            int r11 = r7.getStyleAttribute()
            if (r11 != 0) goto L_0x0072
        L_0x006f:
            r11 = 2132084576(0x7f150760, float:1.9809326E38)
        L_0x0072:
            int[] r8 = X.C27931Qk.A02
            int[] r9 = new int[r5]
            android.content.res.TypedArray r0 = X.C013205s.A00(r6, r7, r8, r9, r10, r11)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C07190Wr.A00(android.content.Context, int):android.content.res.TypedArray");
    }
}
