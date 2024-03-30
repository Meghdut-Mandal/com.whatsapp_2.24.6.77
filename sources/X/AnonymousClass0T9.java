package X;

import android.util.SparseArray;
import androidx.constraintlayout.widget.ConstraintLayout;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: X.0T9  reason: invalid class name */
public class AnonymousClass0T9 {
    public SparseArray A00 = new SparseArray();
    public SparseArray A01 = new SparseArray();
    public AnonymousClass0OI A02 = null;
    public final ConstraintLayout A03;

    public static RuntimeException A00(XmlPullParser xmlPullParser) {
        StringBuilder sb = new StringBuilder();
        sb.append("XML parser error must be within a Constraint ");
        sb.append(xmlPullParser.getLineNumber());
        return new RuntimeException(sb.toString());
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x01e6, code lost:
        r0 = A00(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x01eb, code lost:
        r0 = A00(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x01ef, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x01f0, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:?, code lost:
        r0.printStackTrace();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x01f5, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x01f6, code lost:
        r0.printStackTrace();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0210, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0211, code lost:
        r0.printStackTrace();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00c7, code lost:
        if (r2 == -1) goto L_0x00c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0169, code lost:
        if (r10.equals("Constraint") == false) goto L_0x016b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x016b, code lost:
        r1 = 65535;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x016c, code lost:
        switch(r1) {
            case 0: goto L_0x0170;
            case 1: goto L_0x0179;
            case 2: goto L_0x0188;
            case 3: goto L_0x0195;
            case 4: goto L_0x01a1;
            case 5: goto L_0x01ad;
            case 6: goto L_0x01b9;
            case 7: goto L_0x01c5;
            default: goto L_0x016f;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0170, code lost:
        r7 = X.C07690Yx.A02(r13, android.util.Xml.asAttributeSet(r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0179, code lost:
        r7 = X.C07690Yx.A02(r13, android.util.Xml.asAttributeSet(r5));
        r0 = r7.A02;
        r0.A0y = true;
        r0.A0w = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0188, code lost:
        r7 = X.C07690Yx.A02(r13, android.util.Xml.asAttributeSet(r5));
        r7.A02.A0b = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0195, code lost:
        if (r7 == null) goto L_0x01d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0197, code lost:
        r7.A04.A00(r13, android.util.Xml.asAttributeSet(r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01a1, code lost:
        if (r7 == null) goto L_0x01dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01a3, code lost:
        r7.A05.A00(r13, android.util.Xml.asAttributeSet(r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x01ad, code lost:
        if (r7 == null) goto L_0x01e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01af, code lost:
        r7.A02.A01(r13, android.util.Xml.asAttributeSet(r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01b9, code lost:
        if (r7 == null) goto L_0x01e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01bb, code lost:
        r7.A03.A00(r13, android.util.Xml.asAttributeSet(r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x01c5, code lost:
        if (r7 == null) goto L_0x01eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x01cc, code lost:
        X.AnonymousClass0Y7.A00(r13, r7.A01, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x01d7, code lost:
        r0 = A00(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x01dc, code lost:
        r0 = A00(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x01e1, code lost:
        r0 = A00(r5);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x0210 A[ExcHandler: IOException | XmlPullParserException (r0v3 'e' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:1:0x001f] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass0T9(android.content.Context r13, androidx.constraintlayout.widget.ConstraintLayout r14, int r15) {
        /*
            r12 = this;
            r12.<init>()
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>()
            r12.A01 = r0
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>()
            r12.A00 = r0
            r3 = 0
            r12.A02 = r3
            r12.A03 = r14
            android.content.res.Resources r0 = r13.getResources()
            android.content.res.XmlResourceParser r5 = r0.getXml(r15)
            r4 = 0
            int r1 = r5.getEventType()     // Catch:{ IOException | XmlPullParserException -> 0x0210 }
        L_0x0023:
            r0 = 1
            if (r1 == r0) goto L_0x0214
            if (r1 == 0) goto L_0x0207
            r0 = 2
            if (r1 != r0) goto L_0x020a
            java.lang.String r1 = r5.getName()     // Catch:{ IOException | XmlPullParserException -> 0x0210 }
            int r0 = r1.hashCode()     // Catch:{ IOException | XmlPullParserException -> 0x0210 }
            switch(r0) {
                case -1349929691: goto L_0x0047;
                case 80204913: goto L_0x005a;
                case 1382829617: goto L_0x0070;
                case 1657696882: goto L_0x007a;
                case 1901439077: goto L_0x0084;
                default: goto L_0x0036;
            }     // Catch:{ IOException | XmlPullParserException -> 0x0210 }
        L_0x0036:
            java.lang.String r6 = "ConstraintLayoutStates"
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()     // Catch:{ IOException | XmlPullParserException -> 0x0210 }
            java.lang.String r0 = "unknown tag "
            java.lang.String r0 = X.AnonymousClass000.A0p(r0, r1, r2)     // Catch:{ IOException | XmlPullParserException -> 0x0210 }
            android.util.Log.v(r6, r0)     // Catch:{ IOException | XmlPullParserException -> 0x0210 }
            goto L_0x020a
        L_0x0047:
            java.lang.String r9 = "ConstraintSet"
            boolean r0 = r1.equals(r9)     // Catch:{ IOException | XmlPullParserException -> 0x0210 }
            if (r0 == 0) goto L_0x0036
            X.0Yx r6 = new X.0Yx     // Catch:{ IOException | XmlPullParserException -> 0x0210 }
            r6.<init>()     // Catch:{ IOException | XmlPullParserException -> 0x0210 }
            int r2 = r5.getAttributeCount()     // Catch:{ IOException | XmlPullParserException -> 0x0210 }
            r1 = 0
            goto L_0x0093
        L_0x005a:
            java.lang.String r0 = "State"
            boolean r0 = r1.equals(r0)     // Catch:{ IOException | XmlPullParserException -> 0x0210 }
            if (r0 == 0) goto L_0x0036
            X.0T8 r4 = new X.0T8     // Catch:{ IOException | XmlPullParserException -> 0x0210 }
            r4.<init>(r13, r5)     // Catch:{ IOException | XmlPullParserException -> 0x0210 }
            android.util.SparseArray r1 = r12.A01     // Catch:{ IOException | XmlPullParserException -> 0x0210 }
            int r0 = r4.A02     // Catch:{ IOException | XmlPullParserException -> 0x0210 }
            r1.put(r0, r4)     // Catch:{ IOException | XmlPullParserException -> 0x0210 }
            goto L_0x020a
        L_0x0070:
            java.lang.String r0 = "StateSet"
            boolean r0 = r1.equals(r0)     // Catch:{ IOException | XmlPullParserException -> 0x0210 }
            if (r0 == 0) goto L_0x0036
            goto L_0x020a
        L_0x007a:
            java.lang.String r0 = "layoutDescription"
            boolean r0 = r1.equals(r0)     // Catch:{ IOException | XmlPullParserException -> 0x0210 }
            if (r0 == 0) goto L_0x0036
            goto L_0x020a
        L_0x0084:
            java.lang.String r0 = "Variant"
            boolean r0 = r1.equals(r0)     // Catch:{ IOException | XmlPullParserException -> 0x0210 }
            if (r0 == 0) goto L_0x0036
            X.0TN r1 = new X.0TN     // Catch:{ IOException | XmlPullParserException -> 0x0210 }
            r1.<init>(r13, r5)     // Catch:{ IOException | XmlPullParserException -> 0x0210 }
            goto L_0x01ff
        L_0x0093:
            if (r1 >= r2) goto L_0x020a
            java.lang.String r0 = r5.getAttributeName(r1)     // Catch:{ IOException | XmlPullParserException -> 0x0210 }
            java.lang.String r11 = "id"
            boolean r0 = r11.equals(r0)     // Catch:{ IOException | XmlPullParserException -> 0x0210 }
            if (r0 == 0) goto L_0x00da
            java.lang.String r7 = r5.getAttributeValue(r1)     // Catch:{ IOException | XmlPullParserException -> 0x0210 }
            java.lang.String r0 = "/"
            boolean r0 = r7.contains(r0)     // Catch:{ IOException | XmlPullParserException -> 0x0210 }
            r10 = -1
            r8 = 1
            if (r0 == 0) goto L_0x00d8
            r0 = 47
            int r0 = r7.indexOf(r0)     // Catch:{ IOException | XmlPullParserException -> 0x0210 }
            int r0 = r0 + 1
            java.lang.String r2 = r7.substring(r0)     // Catch:{ IOException | XmlPullParserException -> 0x0210 }
            android.content.res.Resources r1 = r13.getResources()     // Catch:{ IOException | XmlPullParserException -> 0x0210 }
            java.lang.String r0 = r13.getPackageName()     // Catch:{ IOException | XmlPullParserException -> 0x0210 }
            int r2 = r1.getIdentifier(r2, r11, r0)     // Catch:{ IOException | XmlPullParserException -> 0x0210 }
            if (r2 != r10) goto L_0x00e4
        L_0x00c9:
            int r0 = r7.length()     // Catch:{ IOException | XmlPullParserException -> 0x0210 }
            if (r0 <= r8) goto L_0x00dd
            java.lang.String r0 = r7.substring(r8)     // Catch:{ IOException | XmlPullParserException -> 0x0210 }
            int r2 = java.lang.Integer.parseInt(r0)     // Catch:{ IOException | XmlPullParserException -> 0x0210 }
            goto L_0x00e4
        L_0x00d8:
            r2 = -1
            goto L_0x00c9
        L_0x00da:
            int r1 = r1 + 1
            goto L_0x0093
        L_0x00dd:
            java.lang.String r1 = "ConstraintLayoutStates"
            java.lang.String r0 = "error in parsing id"
            android.util.Log.e(r1, r0)     // Catch:{ IOException | XmlPullParserException -> 0x0210 }
        L_0x00e4:
            int r10 = r5.getEventType()     // Catch:{ XmlPullParserException -> 0x01f5, IOException -> 0x01f0, IOException | XmlPullParserException -> 0x0210 }
            r7 = r3
        L_0x00e9:
            if (r10 == r8) goto L_0x01f9
            if (r10 == 0) goto L_0x01c8
            java.lang.String r11 = "Constraint"
            r1 = 3
            r0 = 2
            if (r10 == r0) goto L_0x0113
            if (r10 != r1) goto L_0x01d1
            java.lang.String r1 = r5.getName()     // Catch:{ XmlPullParserException -> 0x01f5, IOException -> 0x01f0, IOException | XmlPullParserException -> 0x0210 }
            boolean r0 = r9.equals(r1)     // Catch:{ XmlPullParserException -> 0x01f5, IOException -> 0x01f0, IOException | XmlPullParserException -> 0x0210 }
            if (r0 != 0) goto L_0x01f9
            boolean r0 = r1.equalsIgnoreCase(r11)     // Catch:{ XmlPullParserException -> 0x01f5, IOException -> 0x01f0, IOException | XmlPullParserException -> 0x0210 }
            if (r0 == 0) goto L_0x01d1
            java.util.HashMap r1 = r6.A00     // Catch:{ XmlPullParserException -> 0x01f5, IOException -> 0x01f0, IOException | XmlPullParserException -> 0x0210 }
            int r0 = r7.A00     // Catch:{ XmlPullParserException -> 0x01f5, IOException -> 0x01f0, IOException | XmlPullParserException -> 0x0210 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ XmlPullParserException -> 0x01f5, IOException -> 0x01f0, IOException | XmlPullParserException -> 0x0210 }
            r1.put(r0, r7)     // Catch:{ XmlPullParserException -> 0x01f5, IOException -> 0x01f0, IOException | XmlPullParserException -> 0x0210 }
            r7 = r3
            goto L_0x01d1
        L_0x0113:
            java.lang.String r10 = r5.getName()     // Catch:{ XmlPullParserException -> 0x01f5, IOException -> 0x01f0, IOException | XmlPullParserException -> 0x0210 }
            int r0 = r10.hashCode()     // Catch:{ XmlPullParserException -> 0x01f5, IOException -> 0x01f0, IOException | XmlPullParserException -> 0x0210 }
            switch(r0) {
                case -2025855158: goto L_0x011f;
                case -1984451626: goto L_0x0129;
                case -1269513683: goto L_0x0133;
                case -1238332596: goto L_0x013c;
                case -71750448: goto L_0x0146;
                case 1331510167: goto L_0x0150;
                case 1791837707: goto L_0x015a;
                case 1803088381: goto L_0x0164;
                default: goto L_0x011e;
            }     // Catch:{ XmlPullParserException -> 0x01f5, IOException -> 0x01f0, IOException | XmlPullParserException -> 0x0210 }
        L_0x011e:
            goto L_0x016b
        L_0x011f:
            java.lang.String r0 = "Layout"
            boolean r0 = r10.equals(r0)     // Catch:{ XmlPullParserException -> 0x01f5, IOException -> 0x01f0, IOException | XmlPullParserException -> 0x0210 }
            r1 = 5
            if (r0 != 0) goto L_0x016c
            goto L_0x016b
        L_0x0129:
            java.lang.String r0 = "Motion"
            boolean r0 = r10.equals(r0)     // Catch:{ XmlPullParserException -> 0x01f5, IOException -> 0x01f0, IOException | XmlPullParserException -> 0x0210 }
            r1 = 6
            if (r0 != 0) goto L_0x016c
            goto L_0x016b
        L_0x0133:
            java.lang.String r0 = "PropertySet"
            boolean r0 = r10.equals(r0)     // Catch:{ XmlPullParserException -> 0x01f5, IOException -> 0x01f0, IOException | XmlPullParserException -> 0x0210 }
            if (r0 == 0) goto L_0x016b
            goto L_0x016c
        L_0x013c:
            java.lang.String r0 = "Transform"
            boolean r0 = r10.equals(r0)     // Catch:{ XmlPullParserException -> 0x01f5, IOException -> 0x01f0, IOException | XmlPullParserException -> 0x0210 }
            r1 = 4
            if (r0 != 0) goto L_0x016c
            goto L_0x016b
        L_0x0146:
            java.lang.String r0 = "Guideline"
            boolean r0 = r10.equals(r0)     // Catch:{ XmlPullParserException -> 0x01f5, IOException -> 0x01f0, IOException | XmlPullParserException -> 0x0210 }
            r1 = 1
            if (r0 != 0) goto L_0x016c
            goto L_0x016b
        L_0x0150:
            java.lang.String r0 = "Barrier"
            boolean r0 = r10.equals(r0)     // Catch:{ XmlPullParserException -> 0x01f5, IOException -> 0x01f0, IOException | XmlPullParserException -> 0x0210 }
            r1 = 2
            if (r0 != 0) goto L_0x016c
            goto L_0x016b
        L_0x015a:
            java.lang.String r0 = "CustomAttribute"
            boolean r0 = r10.equals(r0)     // Catch:{ XmlPullParserException -> 0x01f5, IOException -> 0x01f0, IOException | XmlPullParserException -> 0x0210 }
            r1 = 7
            if (r0 != 0) goto L_0x016c
            goto L_0x016b
        L_0x0164:
            boolean r0 = r10.equals(r11)     // Catch:{ XmlPullParserException -> 0x01f5, IOException -> 0x01f0, IOException | XmlPullParserException -> 0x0210 }
            r1 = 0
            if (r0 != 0) goto L_0x016c
        L_0x016b:
            r1 = -1
        L_0x016c:
            switch(r1) {
                case 0: goto L_0x0170;
                case 1: goto L_0x0179;
                case 2: goto L_0x0188;
                case 3: goto L_0x0195;
                case 4: goto L_0x01a1;
                case 5: goto L_0x01ad;
                case 6: goto L_0x01b9;
                case 7: goto L_0x01c5;
                default: goto L_0x016f;
            }     // Catch:{ XmlPullParserException -> 0x01f5, IOException -> 0x01f0, IOException | XmlPullParserException -> 0x0210 }
        L_0x016f:
            goto L_0x01d1
        L_0x0170:
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r5)     // Catch:{ XmlPullParserException -> 0x01f5, IOException -> 0x01f0, IOException | XmlPullParserException -> 0x0210 }
            X.0UV r7 = X.C07690Yx.A02(r13, r0)     // Catch:{ XmlPullParserException -> 0x01f5, IOException -> 0x01f0, IOException | XmlPullParserException -> 0x0210 }
            goto L_0x01d1
        L_0x0179:
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r5)     // Catch:{ XmlPullParserException -> 0x01f5, IOException -> 0x01f0, IOException | XmlPullParserException -> 0x0210 }
            X.0UV r7 = X.C07690Yx.A02(r13, r0)     // Catch:{ XmlPullParserException -> 0x01f5, IOException -> 0x01f0, IOException | XmlPullParserException -> 0x0210 }
            X.0X0 r0 = r7.A02     // Catch:{ XmlPullParserException -> 0x01f5, IOException -> 0x01f0, IOException | XmlPullParserException -> 0x0210 }
            r0.A0y = r8     // Catch:{ XmlPullParserException -> 0x01f5, IOException -> 0x01f0, IOException | XmlPullParserException -> 0x0210 }
            r0.A0w = r8     // Catch:{ XmlPullParserException -> 0x01f5, IOException -> 0x01f0, IOException | XmlPullParserException -> 0x0210 }
            goto L_0x01d1
        L_0x0188:
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r5)     // Catch:{ XmlPullParserException -> 0x01f5, IOException -> 0x01f0, IOException | XmlPullParserException -> 0x0210 }
            X.0UV r7 = X.C07690Yx.A02(r13, r0)     // Catch:{ XmlPullParserException -> 0x01f5, IOException -> 0x01f0, IOException | XmlPullParserException -> 0x0210 }
            X.0X0 r0 = r7.A02     // Catch:{ XmlPullParserException -> 0x01f5, IOException -> 0x01f0, IOException | XmlPullParserException -> 0x0210 }
            r0.A0b = r8     // Catch:{ XmlPullParserException -> 0x01f5, IOException -> 0x01f0, IOException | XmlPullParserException -> 0x0210 }
            goto L_0x01d1
        L_0x0195:
            if (r7 == 0) goto L_0x01d7
            X.0U2 r1 = r7.A04     // Catch:{ XmlPullParserException -> 0x01f5, IOException -> 0x01f0, IOException | XmlPullParserException -> 0x0210 }
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r5)     // Catch:{ XmlPullParserException -> 0x01f5, IOException -> 0x01f0, IOException | XmlPullParserException -> 0x0210 }
            r1.A00(r13, r0)     // Catch:{ XmlPullParserException -> 0x01f5, IOException -> 0x01f0, IOException | XmlPullParserException -> 0x0210 }
            goto L_0x01d1
        L_0x01a1:
            if (r7 == 0) goto L_0x01dc
            X.0Wz r1 = r7.A05     // Catch:{ XmlPullParserException -> 0x01f5, IOException -> 0x01f0, IOException | XmlPullParserException -> 0x0210 }
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r5)     // Catch:{ XmlPullParserException -> 0x01f5, IOException -> 0x01f0, IOException | XmlPullParserException -> 0x0210 }
            r1.A00(r13, r0)     // Catch:{ XmlPullParserException -> 0x01f5, IOException -> 0x01f0, IOException | XmlPullParserException -> 0x0210 }
            goto L_0x01d1
        L_0x01ad:
            if (r7 == 0) goto L_0x01e1
            X.0X0 r1 = r7.A02     // Catch:{ XmlPullParserException -> 0x01f5, IOException -> 0x01f0, IOException | XmlPullParserException -> 0x0210 }
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r5)     // Catch:{ XmlPullParserException -> 0x01f5, IOException -> 0x01f0, IOException | XmlPullParserException -> 0x0210 }
            r1.A01(r13, r0)     // Catch:{ XmlPullParserException -> 0x01f5, IOException -> 0x01f0, IOException | XmlPullParserException -> 0x0210 }
            goto L_0x01d1
        L_0x01b9:
            if (r7 == 0) goto L_0x01e6
            X.0Wv r1 = r7.A03     // Catch:{ XmlPullParserException -> 0x01f5, IOException -> 0x01f0, IOException | XmlPullParserException -> 0x0210 }
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r5)     // Catch:{ XmlPullParserException -> 0x01f5, IOException -> 0x01f0, IOException | XmlPullParserException -> 0x0210 }
            r1.A00(r13, r0)     // Catch:{ XmlPullParserException -> 0x01f5, IOException -> 0x01f0, IOException | XmlPullParserException -> 0x0210 }
            goto L_0x01d1
        L_0x01c5:
            if (r7 == 0) goto L_0x01eb
            goto L_0x01cc
        L_0x01c8:
            r5.getName()     // Catch:{ XmlPullParserException -> 0x01f5, IOException -> 0x01f0, IOException | XmlPullParserException -> 0x0210 }
            goto L_0x01d1
        L_0x01cc:
            java.util.HashMap r0 = r7.A01     // Catch:{ XmlPullParserException -> 0x01f5, IOException -> 0x01f0, IOException | XmlPullParserException -> 0x0210 }
            X.AnonymousClass0Y7.A00(r13, r0, r5)     // Catch:{ XmlPullParserException -> 0x01f5, IOException -> 0x01f0, IOException | XmlPullParserException -> 0x0210 }
        L_0x01d1:
            int r10 = r5.next()     // Catch:{ XmlPullParserException -> 0x01f5, IOException -> 0x01f0, IOException | XmlPullParserException -> 0x0210 }
            goto L_0x00e9
        L_0x01d7:
            java.lang.RuntimeException r0 = A00(r5)     // Catch:{ XmlPullParserException -> 0x01f5, IOException -> 0x01f0, IOException | XmlPullParserException -> 0x0210 }
            goto L_0x01ef
        L_0x01dc:
            java.lang.RuntimeException r0 = A00(r5)     // Catch:{ XmlPullParserException -> 0x01f5, IOException -> 0x01f0, IOException | XmlPullParserException -> 0x0210 }
            goto L_0x01ef
        L_0x01e1:
            java.lang.RuntimeException r0 = A00(r5)     // Catch:{ XmlPullParserException -> 0x01f5, IOException -> 0x01f0, IOException | XmlPullParserException -> 0x0210 }
            goto L_0x01ef
        L_0x01e6:
            java.lang.RuntimeException r0 = A00(r5)     // Catch:{ XmlPullParserException -> 0x01f5, IOException -> 0x01f0, IOException | XmlPullParserException -> 0x0210 }
            goto L_0x01ef
        L_0x01eb:
            java.lang.RuntimeException r0 = A00(r5)     // Catch:{ XmlPullParserException -> 0x01f5, IOException -> 0x01f0, IOException | XmlPullParserException -> 0x0210 }
        L_0x01ef:
            throw r0     // Catch:{ XmlPullParserException -> 0x01f5, IOException -> 0x01f0, IOException | XmlPullParserException -> 0x0210 }
        L_0x01f0:
            r0 = move-exception
            r0.printStackTrace()     // Catch:{ IOException | XmlPullParserException -> 0x0210 }
            goto L_0x01f9
        L_0x01f5:
            r0 = move-exception
            r0.printStackTrace()     // Catch:{ IOException | XmlPullParserException -> 0x0210 }
        L_0x01f9:
            android.util.SparseArray r0 = r12.A00     // Catch:{ IOException | XmlPullParserException -> 0x0210 }
            r0.put(r2, r6)     // Catch:{ IOException | XmlPullParserException -> 0x0210 }
            goto L_0x020a
        L_0x01ff:
            if (r4 == 0) goto L_0x020a
            java.util.ArrayList r0 = r4.A03     // Catch:{ IOException | XmlPullParserException -> 0x0210 }
            r0.add(r1)     // Catch:{ IOException | XmlPullParserException -> 0x0210 }
            goto L_0x020a
        L_0x0207:
            r5.getName()     // Catch:{ IOException | XmlPullParserException -> 0x0210 }
        L_0x020a:
            int r1 = r5.next()     // Catch:{ IOException | XmlPullParserException -> 0x0210 }
            goto L_0x0023
        L_0x0210:
            r0 = move-exception
            r0.printStackTrace()
        L_0x0214:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0T9.<init>(android.content.Context, androidx.constraintlayout.widget.ConstraintLayout, int):void");
    }
}
