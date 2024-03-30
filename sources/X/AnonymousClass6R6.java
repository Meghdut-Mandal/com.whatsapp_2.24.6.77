package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* renamed from: X.6R6  reason: invalid class name */
public abstract class AnonymousClass6R6 {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.util.HashSet} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v20, resolved type: java.util.HashSet} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v21, resolved type: java.util.HashSet} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v23, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r2v3, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(org.xmlpull.v1.XmlPullParser r14, java.lang.String[] r15) {
        /*
            r9 = 0
            java.lang.String r0 = "name"
            java.lang.String r13 = r14.getAttributeValue(r9, r0)
            java.lang.String r2 = r14.getName()
            java.lang.String r0 = "null"
            boolean r0 = r2.equals(r0)
            r8 = 2
            r4 = 4
            r7 = 3
            r6 = 1
            r12 = 0
            if (r0 != 0) goto L_0x04bc
            java.lang.String r3 = "string"
            boolean r0 = r2.equals(r3)
            if (r0 == 0) goto L_0x0065
            java.lang.String r2 = ""
        L_0x0022:
            int r0 = r14.next()
            if (r0 == r6) goto L_0x005d
            if (r0 != r7) goto L_0x003e
            boolean r0 = X.C90474aD.A1V(r3, r14)
            if (r0 != 0) goto L_0x0483
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Unexpected end tag in <string>: "
            r1.append(r0)
            org.xmlpull.v1.XmlPullParserException r0 = A03(r1, r14)
            throw r0
        L_0x003e:
            if (r0 != r4) goto L_0x004d
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0v(r2)
            java.lang.String r0 = r14.getText()
            java.lang.String r2 = X.AnonymousClass000.A0q(r0, r1)
            goto L_0x0022
        L_0x004d:
            if (r0 != r8) goto L_0x0022
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Unexpected start tag in <string>: "
            r1.append(r0)
            org.xmlpull.v1.XmlPullParserException r0 = A03(r1, r14)
            throw r0
        L_0x005d:
            java.lang.String r1 = "Unexpected end of document in <string>"
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            r0.<init>(r1)
            throw r0
        L_0x0065:
            java.lang.String r3 = ">"
            java.lang.String r0 = "int"
            boolean r0 = r2.equals(r0)     // Catch:{ NullPointerException -> 0x04a9, NumberFormatException -> 0x0496 }
            java.lang.String r5 = "value"
            r1 = 0
            if (r0 == 0) goto L_0x007f
            java.lang.String r0 = r14.getAttributeValue(r9, r5)     // Catch:{ NullPointerException -> 0x04a9, NumberFormatException -> 0x0496 }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ NullPointerException -> 0x04a9, NumberFormatException -> 0x0496 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r0)     // Catch:{ NullPointerException -> 0x04a9, NumberFormatException -> 0x0496 }
            goto L_0x00c2
        L_0x007f:
            java.lang.String r0 = "long"
            boolean r0 = r2.equals(r0)     // Catch:{ NullPointerException -> 0x04a9, NumberFormatException -> 0x0496 }
            if (r0 == 0) goto L_0x0090
            java.lang.String r0 = r14.getAttributeValue(r9, r5)     // Catch:{ NullPointerException -> 0x04a9, NumberFormatException -> 0x0496 }
            java.lang.Long r9 = java.lang.Long.valueOf(r0)     // Catch:{ NullPointerException -> 0x04a9, NumberFormatException -> 0x0496 }
            goto L_0x00c2
        L_0x0090:
            java.lang.String r0 = "float"
            boolean r0 = r2.equals(r0)     // Catch:{ NullPointerException -> 0x04a9, NumberFormatException -> 0x0496 }
            if (r0 == 0) goto L_0x00a1
            java.lang.String r0 = r14.getAttributeValue(r9, r5)     // Catch:{ NullPointerException -> 0x04a9, NumberFormatException -> 0x0496 }
            java.lang.Float r9 = java.lang.Float.valueOf(r0)     // Catch:{ NullPointerException -> 0x04a9, NumberFormatException -> 0x0496 }
            goto L_0x00c2
        L_0x00a1:
            java.lang.String r0 = "double"
            boolean r0 = r2.equals(r0)     // Catch:{ NullPointerException -> 0x04a9, NumberFormatException -> 0x0496 }
            if (r0 == 0) goto L_0x00b2
            java.lang.String r0 = r14.getAttributeValue(r9, r5)     // Catch:{ NullPointerException -> 0x04a9, NumberFormatException -> 0x0496 }
            java.lang.Double r9 = java.lang.Double.valueOf(r0)     // Catch:{ NullPointerException -> 0x04a9, NumberFormatException -> 0x0496 }
            goto L_0x00c2
        L_0x00b2:
            java.lang.String r0 = "boolean"
            boolean r0 = r2.equals(r0)     // Catch:{ NullPointerException -> 0x04a9, NumberFormatException -> 0x0496 }
            if (r0 == 0) goto L_0x00c2
            java.lang.String r0 = r14.getAttributeValue(r9, r5)     // Catch:{ NullPointerException -> 0x04a9, NumberFormatException -> 0x0496 }
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r0)     // Catch:{ NullPointerException -> 0x04a9, NumberFormatException -> 0x0496 }
        L_0x00c2:
            if (r9 != 0) goto L_0x04bc
            java.lang.String r3 = "byte-array"
            boolean r0 = r2.equals(r3)
            if (r0 == 0) goto L_0x0157
            java.lang.String r0 = "num"
            java.lang.String r0 = r14.getAttributeValue(r1, r0)     // Catch:{ NullPointerException -> 0x014f, NumberFormatException -> 0x0147 }
            int r9 = java.lang.Integer.parseInt(r0)     // Catch:{ NullPointerException -> 0x014f, NumberFormatException -> 0x0147 }
            byte[] r8 = new byte[r9]
            int r0 = r14.getEventType()
        L_0x00dc:
            if (r0 != r4) goto L_0x011c
            if (r9 <= 0) goto L_0x0127
            java.lang.String r5 = r14.getText()
            if (r5 == 0) goto L_0x0132
            int r1 = r5.length()
            int r0 = r9 * 2
            if (r1 != r0) goto L_0x0132
            r2 = 0
        L_0x00ef:
            if (r2 >= r9) goto L_0x0127
            int r0 = r2 * 2
            char r1 = r5.charAt(r0)
            int r0 = r0 + 1
            char r11 = r5.charAt(r0)
            r10 = 97
            if (r1 <= r10) goto L_0x0119
            int r0 = r1 + -97
            int r1 = r0 + 10
        L_0x0105:
            int r0 = r11 + -48
            if (r11 <= r10) goto L_0x010d
            int r0 = r11 + -97
            int r0 = r0 + 10
        L_0x010d:
            r1 = r1 & 15
            int r1 = r1 << r4
            r0 = r0 & 15
            r0 = r0 | r1
            byte r0 = (byte) r0
            r8[r2] = r0
            int r2 = r2 + 1
            goto L_0x00ef
        L_0x0119:
            int r1 = r1 + -48
            goto L_0x0105
        L_0x011c:
            if (r0 != r7) goto L_0x0127
            boolean r0 = X.C90474aD.A1V(r3, r14)
            if (r0 == 0) goto L_0x0142
            r15[r12] = r13
            return r8
        L_0x0127:
            int r0 = r14.next()
            if (r0 != r6) goto L_0x00dc
            org.xmlpull.v1.XmlPullParserException r0 = A01(r3)
            throw r0
        L_0x0132:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Invalid value found in byte-array: "
            java.lang.String r1 = X.AnonymousClass000.A0p(r0, r5, r1)
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            r0.<init>(r1)
            throw r0
        L_0x0142:
            org.xmlpull.v1.XmlPullParserException r0 = A02(r3, r14)
            throw r0
        L_0x0147:
            java.lang.String r1 = "Not a number in num attribute in byte-array"
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            r0.<init>(r1)
            throw r0
        L_0x014f:
            java.lang.String r1 = "Need num attribute in byte-array"
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            r0.<init>(r1)
            throw r0
        L_0x0157:
            java.lang.String r3 = "int-array"
            boolean r0 = r2.equals(r3)
            if (r0 == 0) goto L_0x01da
            java.lang.String r0 = "num"
            r2 = 0
            java.lang.String r0 = r14.getAttributeValue(r1, r0)     // Catch:{ NullPointerException -> 0x01d2, NumberFormatException -> 0x01ca }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ NullPointerException -> 0x01d2, NumberFormatException -> 0x01ca }
            r14.next()
            int[] r4 = new int[r0]
            r9 = 0
            int r0 = r14.getEventType()
        L_0x0174:
            java.lang.String r1 = "item"
            if (r0 != r8) goto L_0x0189
            boolean r0 = X.C90474aD.A1V(r1, r14)
            if (r0 == 0) goto L_0x01b7
            java.lang.String r0 = r14.getAttributeValue(r2, r5)     // Catch:{ NullPointerException -> 0x01af, NumberFormatException -> 0x01a7 }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ NullPointerException -> 0x01af, NumberFormatException -> 0x01a7 }
            r4[r9] = r0     // Catch:{ NullPointerException -> 0x01af, NumberFormatException -> 0x01a7 }
            goto L_0x019c
        L_0x0189:
            if (r0 != r7) goto L_0x019c
            boolean r0 = X.C90474aD.A1V(r3, r14)
            if (r0 == 0) goto L_0x0194
            r15[r12] = r13
            return r4
        L_0x0194:
            boolean r0 = X.C90474aD.A1V(r1, r14)
            if (r0 == 0) goto L_0x01c5
            int r9 = r9 + 1
        L_0x019c:
            int r0 = r14.next()
            if (r0 != r6) goto L_0x0174
            org.xmlpull.v1.XmlPullParserException r0 = A01(r3)
            throw r0
        L_0x01a7:
            java.lang.String r1 = "Not a number in value attribute in item"
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            r0.<init>(r1)
            throw r0
        L_0x01af:
            java.lang.String r1 = "Need value attribute in item"
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            r0.<init>(r1)
            throw r0
        L_0x01b7:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Expected item tag at: "
            r1.append(r0)
            org.xmlpull.v1.XmlPullParserException r0 = A03(r1, r14)
            throw r0
        L_0x01c5:
            org.xmlpull.v1.XmlPullParserException r0 = A02(r3, r14)
            throw r0
        L_0x01ca:
            java.lang.String r1 = "Not a number in num attribute in int-array"
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            r0.<init>(r1)
            throw r0
        L_0x01d2:
            java.lang.String r1 = "Need num attribute in int-array"
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            r0.<init>(r1)
            throw r0
        L_0x01da:
            java.lang.String r3 = "long-array"
            boolean r0 = r2.equals(r3)
            if (r0 == 0) goto L_0x025d
            java.lang.String r0 = "num"
            r2 = 0
            java.lang.String r0 = r14.getAttributeValue(r1, r0)     // Catch:{ NullPointerException -> 0x0255, NumberFormatException -> 0x024d }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ NullPointerException -> 0x0255, NumberFormatException -> 0x024d }
            r14.next()
            long[] r4 = new long[r0]
            r9 = 0
            int r0 = r14.getEventType()
        L_0x01f7:
            java.lang.String r1 = "item"
            if (r0 != r8) goto L_0x020c
            boolean r0 = X.C90474aD.A1V(r1, r14)
            if (r0 == 0) goto L_0x023a
            java.lang.String r0 = r14.getAttributeValue(r2, r5)     // Catch:{ NullPointerException -> 0x0232, NumberFormatException -> 0x022a }
            long r0 = java.lang.Long.parseLong(r0)     // Catch:{ NullPointerException -> 0x0232, NumberFormatException -> 0x022a }
            r4[r9] = r0     // Catch:{ NullPointerException -> 0x0232, NumberFormatException -> 0x022a }
            goto L_0x021f
        L_0x020c:
            if (r0 != r7) goto L_0x021f
            boolean r0 = X.C90474aD.A1V(r3, r14)
            if (r0 == 0) goto L_0x0217
            r15[r12] = r13
            return r4
        L_0x0217:
            boolean r0 = X.C90474aD.A1V(r1, r14)
            if (r0 == 0) goto L_0x0248
            int r9 = r9 + 1
        L_0x021f:
            int r0 = r14.next()
            if (r0 != r6) goto L_0x01f7
            org.xmlpull.v1.XmlPullParserException r0 = A01(r3)
            throw r0
        L_0x022a:
            java.lang.String r1 = "Not a number in value attribute in item"
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            r0.<init>(r1)
            throw r0
        L_0x0232:
            java.lang.String r1 = "Need value attribute in item"
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            r0.<init>(r1)
            throw r0
        L_0x023a:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Expected item tag at: "
            r1.append(r0)
            org.xmlpull.v1.XmlPullParserException r0 = A03(r1, r14)
            throw r0
        L_0x0248:
            org.xmlpull.v1.XmlPullParserException r0 = A02(r3, r14)
            throw r0
        L_0x024d:
            java.lang.String r1 = "Not a number in num attribute in long-array"
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            r0.<init>(r1)
            throw r0
        L_0x0255:
            java.lang.String r1 = "Need num attribute in long-array"
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            r0.<init>(r1)
            throw r0
        L_0x025d:
            java.lang.String r3 = "double-array"
            boolean r0 = r2.equals(r3)
            if (r0 == 0) goto L_0x02e0
            java.lang.String r0 = "num"
            r4 = 0
            java.lang.String r0 = r14.getAttributeValue(r1, r0)     // Catch:{ NullPointerException -> 0x02d8, NumberFormatException -> 0x02d0 }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ NullPointerException -> 0x02d8, NumberFormatException -> 0x02d0 }
            r14.next()
            double[] r2 = new double[r0]
            r9 = 0
            int r0 = r14.getEventType()
        L_0x027a:
            java.lang.String r1 = "item"
            if (r0 != r8) goto L_0x028f
            boolean r0 = X.C90474aD.A1V(r1, r14)
            if (r0 == 0) goto L_0x02bd
            java.lang.String r0 = r14.getAttributeValue(r4, r5)     // Catch:{ NullPointerException -> 0x02b5, NumberFormatException -> 0x02ad }
            double r0 = java.lang.Double.parseDouble(r0)     // Catch:{ NullPointerException -> 0x02b5, NumberFormatException -> 0x02ad }
            r2[r9] = r0     // Catch:{ NullPointerException -> 0x02b5, NumberFormatException -> 0x02ad }
            goto L_0x02a2
        L_0x028f:
            if (r0 != r7) goto L_0x02a2
            boolean r0 = X.C90474aD.A1V(r3, r14)
            if (r0 == 0) goto L_0x029a
            r15[r12] = r13
            return r2
        L_0x029a:
            boolean r0 = X.C90474aD.A1V(r1, r14)
            if (r0 == 0) goto L_0x02cb
            int r9 = r9 + 1
        L_0x02a2:
            int r0 = r14.next()
            if (r0 != r6) goto L_0x027a
            org.xmlpull.v1.XmlPullParserException r0 = A01(r3)
            throw r0
        L_0x02ad:
            java.lang.String r1 = "Not a number in value attribute in item"
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            r0.<init>(r1)
            throw r0
        L_0x02b5:
            java.lang.String r1 = "Need value attribute in item"
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            r0.<init>(r1)
            throw r0
        L_0x02bd:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Expected item tag at: "
            r1.append(r0)
            org.xmlpull.v1.XmlPullParserException r0 = A03(r1, r14)
            throw r0
        L_0x02cb:
            org.xmlpull.v1.XmlPullParserException r0 = A02(r3, r14)
            throw r0
        L_0x02d0:
            java.lang.String r1 = "Not a number in num attribute in double-array"
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            r0.<init>(r1)
            throw r0
        L_0x02d8:
            java.lang.String r1 = "Need num attribute in double-array"
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            r0.<init>(r1)
            throw r0
        L_0x02e0:
            java.lang.String r4 = "string-array"
            boolean r0 = r2.equals(r4)
            if (r0 == 0) goto L_0x035f
            java.lang.String r0 = "num"
            r9 = 0
            java.lang.String r0 = r14.getAttributeValue(r1, r0)     // Catch:{ NullPointerException -> 0x0357, NumberFormatException -> 0x034f }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ NullPointerException -> 0x0357, NumberFormatException -> 0x034f }
            r14.next()
            java.lang.String[] r3 = new java.lang.String[r0]
            r2 = 0
            int r0 = r14.getEventType()
        L_0x02fd:
            java.lang.String r1 = "item"
            if (r0 != r8) goto L_0x030e
            boolean r0 = X.C90474aD.A1V(r1, r14)
            if (r0 == 0) goto L_0x033c
            java.lang.String r0 = r14.getAttributeValue(r9, r5)     // Catch:{ NullPointerException -> 0x0334, NumberFormatException -> 0x032c }
            r3[r2] = r0     // Catch:{ NullPointerException -> 0x0334, NumberFormatException -> 0x032c }
            goto L_0x0321
        L_0x030e:
            if (r0 != r7) goto L_0x0321
            boolean r0 = X.C90474aD.A1V(r4, r14)
            if (r0 == 0) goto L_0x0319
            r15[r12] = r13
            return r3
        L_0x0319:
            boolean r0 = X.C90474aD.A1V(r1, r14)
            if (r0 == 0) goto L_0x034a
            int r2 = r2 + 1
        L_0x0321:
            int r0 = r14.next()
            if (r0 != r6) goto L_0x02fd
            org.xmlpull.v1.XmlPullParserException r0 = A01(r4)
            throw r0
        L_0x032c:
            java.lang.String r1 = "Not a number in value attribute in item"
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            r0.<init>(r1)
            throw r0
        L_0x0334:
            java.lang.String r1 = "Need value attribute in item"
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            r0.<init>(r1)
            throw r0
        L_0x033c:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Expected item tag at: "
            r1.append(r0)
            org.xmlpull.v1.XmlPullParserException r0 = A03(r1, r14)
            throw r0
        L_0x034a:
            org.xmlpull.v1.XmlPullParserException r0 = A02(r4, r14)
            throw r0
        L_0x034f:
            java.lang.String r1 = "Not a number in num attribute in string-array"
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            r0.<init>(r1)
            throw r0
        L_0x0357:
            java.lang.String r1 = "Need num attribute in string-array"
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            r0.<init>(r1)
            throw r0
        L_0x035f:
            java.lang.String r4 = "boolean-array"
            boolean r0 = r2.equals(r4)
            if (r0 == 0) goto L_0x03e2
            java.lang.String r0 = "num"
            r3 = 0
            java.lang.String r0 = r14.getAttributeValue(r1, r0)     // Catch:{ NullPointerException -> 0x03da, NumberFormatException -> 0x03d2 }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ NullPointerException -> 0x03da, NumberFormatException -> 0x03d2 }
            r14.next()
            boolean[] r2 = new boolean[r0]
            r9 = 0
            int r0 = r14.getEventType()
        L_0x037c:
            java.lang.String r1 = "item"
            if (r0 != r8) goto L_0x0391
            boolean r0 = X.C90474aD.A1V(r1, r14)
            if (r0 == 0) goto L_0x03bf
            java.lang.String r0 = r14.getAttributeValue(r3, r5)     // Catch:{ NullPointerException -> 0x03b7, NumberFormatException -> 0x03af }
            boolean r0 = java.lang.Boolean.parseBoolean(r0)     // Catch:{ NullPointerException -> 0x03b7, NumberFormatException -> 0x03af }
            r2[r9] = r0     // Catch:{ NullPointerException -> 0x03b7, NumberFormatException -> 0x03af }
            goto L_0x03a4
        L_0x0391:
            if (r0 != r7) goto L_0x03a4
            boolean r0 = X.C90474aD.A1V(r4, r14)
            if (r0 == 0) goto L_0x039c
            r15[r12] = r13
            return r2
        L_0x039c:
            boolean r0 = X.C90474aD.A1V(r1, r14)
            if (r0 == 0) goto L_0x03cd
            int r9 = r9 + 1
        L_0x03a4:
            int r0 = r14.next()
            if (r0 != r6) goto L_0x037c
            org.xmlpull.v1.XmlPullParserException r0 = A01(r4)
            throw r0
        L_0x03af:
            java.lang.String r1 = "Not a number in value attribute in item"
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            r0.<init>(r1)
            throw r0
        L_0x03b7:
            java.lang.String r1 = "Need value attribute in item"
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            r0.<init>(r1)
            throw r0
        L_0x03bf:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Expected item tag at: "
            r1.append(r0)
            org.xmlpull.v1.XmlPullParserException r0 = A03(r1, r14)
            throw r0
        L_0x03cd:
            org.xmlpull.v1.XmlPullParserException r0 = A02(r4, r14)
            throw r0
        L_0x03d2:
            java.lang.String r1 = "Not a number in num attribute in string-array"
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            r0.<init>(r1)
            throw r0
        L_0x03da:
            java.lang.String r1 = "Need num attribute in string-array"
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            r0.<init>(r1)
            throw r0
        L_0x03e2:
            java.lang.String r3 = "map"
            boolean r0 = r2.equals(r3)
            if (r0 == 0) goto L_0x041b
            r14.next()
            java.util.HashMap r2 = X.AnonymousClass001.A0J()
            int r0 = r14.getEventType()
        L_0x03f5:
            if (r0 != r8) goto L_0x040b
            java.lang.Object r1 = A00(r14, r15)
            r0 = r15[r12]
            r2.put(r0, r1)
        L_0x0400:
            int r0 = r14.next()
            if (r0 != r6) goto L_0x03f5
            org.xmlpull.v1.XmlPullParserException r0 = A01(r3)
            throw r0
        L_0x040b:
            if (r0 != r7) goto L_0x0400
            boolean r0 = X.C90474aD.A1V(r3, r14)
            if (r0 == 0) goto L_0x0416
            r15[r12] = r13
            return r2
        L_0x0416:
            org.xmlpull.v1.XmlPullParserException r0 = A02(r3, r14)
            throw r0
        L_0x041b:
            java.lang.String r1 = "list"
            boolean r0 = r2.equals(r1)
            if (r0 == 0) goto L_0x044f
            r14.next()
            java.util.ArrayList r2 = X.AnonymousClass001.A0I()
            int r0 = r14.getEventType()
        L_0x042e:
            if (r0 != r8) goto L_0x0442
            java.lang.Object r0 = A00(r14, r15)
            r2.add(r0)
        L_0x0437:
            int r0 = r14.next()
            if (r0 != r6) goto L_0x042e
            org.xmlpull.v1.XmlPullParserException r0 = A01(r1)
            throw r0
        L_0x0442:
            if (r0 != r7) goto L_0x0437
            boolean r0 = X.C90474aD.A1V(r1, r14)
            if (r0 != 0) goto L_0x0483
            org.xmlpull.v1.XmlPullParserException r0 = A02(r1, r14)
            throw r0
        L_0x044f:
            java.lang.String r1 = "set"
            boolean r0 = r2.equals(r1)
            if (r0 == 0) goto L_0x0486
            r14.next()
            java.util.HashSet r2 = X.C36441kJ.A16()
            int r0 = r14.getEventType()
        L_0x0462:
            if (r0 != r8) goto L_0x0476
            java.lang.Object r0 = A00(r14, r15)
            r2.add(r0)
        L_0x046b:
            int r0 = r14.next()
            if (r0 != r6) goto L_0x0462
            org.xmlpull.v1.XmlPullParserException r0 = A01(r1)
            throw r0
        L_0x0476:
            if (r0 != r7) goto L_0x046b
            boolean r0 = X.C90474aD.A1V(r1, r14)
            if (r0 != 0) goto L_0x0483
            org.xmlpull.v1.XmlPullParserException r0 = A02(r1, r14)
            throw r0
        L_0x0483:
            r15[r12] = r13
            return r2
        L_0x0486:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Unknown tag: "
            java.lang.String r1 = X.AnonymousClass000.A0p(r0, r2, r1)
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            r0.<init>(r1)
            throw r0
        L_0x0496:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Not a number in value attribute in <"
            X.AnonymousClass000.A1D(r0, r2, r3, r1)
            java.lang.String r1 = r1.toString()
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            r0.<init>(r1)
            throw r0
        L_0x04a9:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Need value attribute in <"
            X.AnonymousClass000.A1D(r0, r2, r3, r1)
            java.lang.String r1 = r1.toString()
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            r0.<init>(r1)
            throw r0
        L_0x04bc:
            int r0 = r14.next()
            if (r0 == r6) goto L_0x04fd
            java.lang.String r3 = ">: "
            if (r0 != r7) goto L_0x04cf
            boolean r0 = X.C90474aD.A1V(r2, r14)
            if (r0 == 0) goto L_0x04e1
            r15[r12] = r13
            return r9
        L_0x04cf:
            if (r0 == r4) goto L_0x04ef
            if (r0 != r8) goto L_0x04bc
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Unexpected start tag in <"
            X.AnonymousClass000.A1D(r0, r2, r3, r1)
            org.xmlpull.v1.XmlPullParserException r0 = A03(r1, r14)
            throw r0
        L_0x04e1:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Unexpected end tag in <"
            X.AnonymousClass000.A1D(r0, r2, r3, r1)
            org.xmlpull.v1.XmlPullParserException r0 = A03(r1, r14)
            throw r0
        L_0x04ef:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Unexpected text in <"
            X.AnonymousClass000.A1D(r0, r2, r3, r1)
            org.xmlpull.v1.XmlPullParserException r0 = A03(r1, r14)
            throw r0
        L_0x04fd:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Unexpected end of document in <"
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = ">"
            java.lang.String r1 = X.AnonymousClass000.A0q(r0, r1)
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6R6.A00(org.xmlpull.v1.XmlPullParser, java.lang.String[]):java.lang.Object");
    }

    public static final void A04(Object obj, String str, XmlSerializer xmlSerializer) {
        int i;
        int i2;
        String str2;
        if (obj == null) {
            A05("null", str, xmlSerializer);
            xmlSerializer.endTag((String) null, "null");
        } else if (obj instanceof String) {
            A05("string", str, xmlSerializer);
            xmlSerializer.text(obj.toString());
            xmlSerializer.endTag((String) null, "string");
        } else {
            if (obj instanceof Integer) {
                str2 = "int";
            } else if (obj instanceof Long) {
                str2 = "long";
            } else if (obj instanceof Float) {
                str2 = "float";
            } else if (obj instanceof Double) {
                str2 = "double";
            } else if (obj instanceof Boolean) {
                str2 = "boolean";
            } else {
                if (obj instanceof byte[]) {
                    byte[] bArr = (byte[]) obj;
                    if (bArr != null) {
                        A05("byte-array", str, xmlSerializer);
                        A07(xmlSerializer, r7);
                        StringBuilder A0h = C90524aI.A0h(r7 * 2);
                        for (byte b : bArr) {
                            int i3 = (b >> 4) & 15;
                            if (i3 >= 10) {
                                i = (i3 + 97) - 10;
                            } else {
                                i = i3 + 48;
                            }
                            A0h.append((char) i);
                            byte b2 = b & 15;
                            if (b2 >= 10) {
                                i2 = (b2 + 97) - 10;
                            } else {
                                i2 = b2 + 48;
                            }
                            A0h.append((char) i2);
                        }
                        xmlSerializer.text(A0h.toString());
                        xmlSerializer.endTag((String) null, "byte-array");
                        return;
                    }
                } else if (obj instanceof int[]) {
                    int[] iArr = (int[]) obj;
                    if (iArr != null) {
                        A05("int-array", str, xmlSerializer);
                        A07(xmlSerializer, r5);
                        for (int num : iArr) {
                            xmlSerializer.startTag((String) null, "item");
                            xmlSerializer.attribute((String) null, "value", Integer.toString(num));
                            xmlSerializer.endTag((String) null, "item");
                        }
                        xmlSerializer.endTag((String) null, "int-array");
                        return;
                    }
                } else if (obj instanceof long[]) {
                    long[] jArr = (long[]) obj;
                    if (jArr != null) {
                        A05("long-array", str, xmlSerializer);
                        A07(xmlSerializer, r5);
                        for (long l : jArr) {
                            xmlSerializer.startTag((String) null, "item");
                            xmlSerializer.attribute((String) null, "value", Long.toString(l));
                            xmlSerializer.endTag((String) null, "item");
                        }
                        xmlSerializer.endTag((String) null, "long-array");
                        return;
                    }
                } else if (obj instanceof double[]) {
                    double[] dArr = (double[]) obj;
                    if (dArr != null) {
                        A05("double-array", str, xmlSerializer);
                        A07(xmlSerializer, r5);
                        for (double d : dArr) {
                            xmlSerializer.startTag((String) null, "item");
                            xmlSerializer.attribute((String) null, "value", Double.toString(d));
                            xmlSerializer.endTag((String) null, "item");
                        }
                        xmlSerializer.endTag((String) null, "double-array");
                        return;
                    }
                } else if (obj instanceof String[]) {
                    String[] strArr = (String[]) obj;
                    if (strArr != null) {
                        A05("string-array", str, xmlSerializer);
                        A07(xmlSerializer, r5);
                        for (String attribute : strArr) {
                            xmlSerializer.startTag((String) null, "item");
                            xmlSerializer.attribute((String) null, "value", attribute);
                            xmlSerializer.endTag((String) null, "item");
                        }
                        xmlSerializer.endTag((String) null, "string-array");
                        return;
                    }
                } else if (obj instanceof boolean[]) {
                    boolean[] zArr = (boolean[]) obj;
                    if (zArr != null) {
                        A05("boolean-array", str, xmlSerializer);
                        A07(xmlSerializer, r5);
                        for (boolean bool : zArr) {
                            xmlSerializer.startTag((String) null, "item");
                            xmlSerializer.attribute((String) null, "value", Boolean.toString(bool));
                            xmlSerializer.endTag((String) null, "item");
                        }
                        xmlSerializer.endTag((String) null, "boolean-array");
                        return;
                    }
                } else if (obj instanceof Map) {
                    A06(str, (Map) obj, xmlSerializer);
                    return;
                } else if (obj instanceof List) {
                    List list = (List) obj;
                    if (list != null) {
                        A05("list", str, xmlSerializer);
                        int size = list.size();
                        for (int i4 = 0; i4 < size; i4++) {
                            A04(list.get(i4), (String) null, xmlSerializer);
                        }
                        xmlSerializer.endTag((String) null, "list");
                        return;
                    }
                } else if (obj instanceof Set) {
                    Set<Object> set = (Set) obj;
                    if (set != null) {
                        A05("set", str, xmlSerializer);
                        for (Object A04 : set) {
                            A04(A04, (String) null, xmlSerializer);
                        }
                        xmlSerializer.endTag((String) null, "set");
                        return;
                    }
                } else if (obj instanceof CharSequence) {
                    A05("string", str, xmlSerializer);
                    xmlSerializer.text(obj.toString());
                    xmlSerializer.endTag((String) null, "string");
                    return;
                } else {
                    throw C90514aH.A0s(AnonymousClass000.A0l(obj, "writeValueXml: unable to write value ", AnonymousClass000.A0u()));
                }
                xmlSerializer.startTag((String) null, "null");
                xmlSerializer.endTag((String) null, "null");
                return;
            }
            A05(str2, str, xmlSerializer);
            xmlSerializer.attribute((String) null, "value", obj.toString());
            xmlSerializer.endTag((String) null, str2);
        }
    }

    public static void A05(String str, String str2, XmlSerializer xmlSerializer) {
        xmlSerializer.startTag((String) null, str);
        if (str2 != null) {
            xmlSerializer.attribute((String) null, PublicKeyCredentialControllerUtility.JSON_KEY_NAME, str2);
        }
    }

    public static final void A06(String str, Map map, XmlSerializer xmlSerializer) {
        if (map == null) {
            xmlSerializer.startTag((String) null, "null");
            xmlSerializer.endTag((String) null, "null");
            return;
        }
        xmlSerializer.startTag((String) null, "map");
        if (str != null) {
            xmlSerializer.attribute((String) null, PublicKeyCredentialControllerUtility.JSON_KEY_NAME, str);
        }
        Iterator A0y = AnonymousClass000.A0y(map);
        while (A0y.hasNext()) {
            Map.Entry A11 = AnonymousClass000.A11(A0y);
            A04(A11.getValue(), C90494aF.A0f(A11), xmlSerializer);
        }
        xmlSerializer.endTag((String) null, "map");
    }

    public static void A07(XmlSerializer xmlSerializer, int i) {
        xmlSerializer.attribute((String) null, "num", Integer.toString(i));
    }

    public static XmlPullParserException A01(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("Document ended before ");
        sb.append(str);
        sb.append(" end tag");
        return new XmlPullParserException(sb.toString());
    }

    public static XmlPullParserException A02(String str, XmlPullParser xmlPullParser) {
        StringBuilder sb = new StringBuilder();
        sb.append("Expected ");
        sb.append(str);
        sb.append(" end tag at: ");
        sb.append(xmlPullParser.getName());
        return new XmlPullParserException(sb.toString());
    }

    public static XmlPullParserException A03(StringBuilder sb, XmlPullParser xmlPullParser) {
        sb.append(xmlPullParser.getName());
        return new XmlPullParserException(sb.toString());
    }
}
