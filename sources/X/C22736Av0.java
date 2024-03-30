package X;

import android.text.TextUtils;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.android.exoplayer2.util.Util;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xml.sax.helpers.DefaultHandler;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* renamed from: X.Av0  reason: case insensitive filesystem */
public class C22736Av0 extends DefaultHandler {
    public static final Pattern A06 = Pattern.compile("CC([1-4])=.*");
    public static final Pattern A07 = Pattern.compile("([1-9]|[1-5][0-9]|6[0-3])=.*");
    public static final Pattern A08 = Pattern.compile("^https?:\\/\\/[^\\/]+(\\/.+)$");
    public static final Pattern A09 = Pattern.compile("(\\d+)(?:/(\\d+))?");
    public long A00;
    public C192169Fy A01;
    public String A02;
    public final String A03;
    public final XmlPullParserFactory A04;
    public final boolean A05;

    public C22736Av0(String str, int i, boolean z, boolean z2) {
        this.A01 = null;
        this.A00 = 0;
        this.A03 = str == null ? "null" : str;
        this.A05 = z;
        if (z2) {
            C192169Fy r0 = C192169Fy.A01;
            if (r0 == null) {
                synchronized (C192169Fy.class) {
                    r0 = C192169Fy.A01;
                    if (r0 == null) {
                        r0 = new C192169Fy(i);
                        C192169Fy.A01 = r0;
                    }
                }
            }
            this.A01 = r0;
        }
        try {
            this.A04 = XmlPullParserFactory.newInstance();
        } catch (XmlPullParserException e) {
            throw C90524aI.A0e("Couldn't create XmlPullParserFactory instance", e);
        }
    }

    public static float A00(XmlPullParser xmlPullParser, float f) {
        String attributeValue = xmlPullParser.getAttributeValue((String) null, "frameRate");
        if (attributeValue == null) {
            return f;
        }
        Matcher matcher = A09.matcher(attributeValue);
        if (!matcher.matches()) {
            return f;
        }
        int A0A = C165607th.A0A(matcher, 1);
        String group = matcher.group(2);
        float f2 = (float) A0A;
        if (!TextUtils.isEmpty(group)) {
            return f2 / ((float) Integer.parseInt(group));
        }
        return f2;
    }

    public static int A01(String str, XmlPullParser xmlPullParser, int i) {
        String attributeValue = xmlPullParser.getAttributeValue((String) null, str);
        if (attributeValue != null) {
            return Integer.parseInt(attributeValue);
        }
        return i;
    }

    public static int A03(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue((String) null, "contentType");
        if (TextUtils.isEmpty(attributeValue)) {
            return -1;
        }
        if ("audio".equals(attributeValue)) {
            return 1;
        }
        if ("video".equals(attributeValue)) {
            return 2;
        }
        if ("text".equals(attributeValue)) {
            return 3;
        }
        return -1;
    }

    public static long A04(String str, XmlPullParser xmlPullParser, long j) {
        double d;
        double d2;
        double d3;
        double d4;
        double d5;
        String attributeValue = xmlPullParser.getAttributeValue((String) null, str);
        if (attributeValue == null) {
            return j;
        }
        Matcher matcher = Util.A07.matcher(attributeValue);
        if (!matcher.matches()) {
            return (long) (Double.parseDouble(attributeValue) * 3600.0d * 1000.0d);
        }
        boolean isEmpty = true ^ TextUtils.isEmpty(matcher.group(1));
        String group = matcher.group(3);
        double d6 = 0.0d;
        if (group != null) {
            d = Double.parseDouble(group) * 3.1556908E7d;
        } else {
            d = 0.0d;
        }
        String group2 = matcher.group(5);
        if (group2 != null) {
            d2 = Double.parseDouble(group2) * 2629739.0d;
        } else {
            d2 = 0.0d;
        }
        double d7 = d + d2;
        String group3 = matcher.group(7);
        if (group3 != null) {
            d3 = Double.parseDouble(group3) * 86400.0d;
        } else {
            d3 = 0.0d;
        }
        double d8 = d7 + d3;
        String group4 = matcher.group(10);
        if (group4 != null) {
            d4 = Double.parseDouble(group4) * 3600.0d;
        } else {
            d4 = 0.0d;
        }
        double d9 = d8 + d4;
        String group5 = matcher.group(12);
        if (group5 != null) {
            d5 = Double.parseDouble(group5) * 60.0d;
        } else {
            d5 = 0.0d;
        }
        double d10 = d9 + d5;
        String group6 = matcher.group(14);
        if (group6 != null) {
            d6 = Double.parseDouble(group6);
        }
        long j2 = (long) ((d10 + d6) * 1000.0d);
        if (isEmpty) {
            return -j2;
        }
        return j2;
    }

    public static long A05(String str, XmlPullParser xmlPullParser, long j) {
        String attributeValue = xmlPullParser.getAttributeValue((String) null, str);
        if (attributeValue != null) {
            return Long.parseLong(attributeValue);
        }
        return j;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:93:0x01b1, code lost:
        r8 = null;
        r6 = null;
        r5 = null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.util.Pair A06(org.xmlpull.v1.XmlPullParser r11) {
        /*
            r4 = 0
            java.lang.String r0 = "schemeIdUri"
            java.lang.String r0 = r11.getAttributeValue(r4, r0)
            r3 = 0
            if (r0 == 0) goto L_0x0015
            java.lang.String r1 = X.C1897495k.A00(r0)
            int r0 = r1.hashCode()
            switch(r0) {
                case -1980789791: goto L_0x01a7;
                case 489446379: goto L_0x019c;
                case 755418770: goto L_0x0191;
                case 1812765994: goto L_0x00ff;
                default: goto L_0x0015;
            }
        L_0x0015:
            r8 = r4
            r6 = r4
        L_0x0017:
            r9 = r4
            r5 = r4
        L_0x0019:
            r11.next()
            java.lang.String r0 = "clearkey:Laurl"
            boolean r0 = X.C196299Yr.A01(r0, r11)
            r1 = 4
            if (r0 == 0) goto L_0x0043
            int r0 = r11.next()
            if (r0 != r1) goto L_0x0043
            java.lang.String r5 = r11.getText()
        L_0x002f:
            java.lang.String r0 = "ContentProtection"
            boolean r0 = X.C196299Yr.A00(r0, r11)
            if (r0 == 0) goto L_0x0019
            if (r9 == 0) goto L_0x003e
            X.9uV r4 = new X.9uV
            r4.<init>(r5, r9, r6)
        L_0x003e:
            android.util.Pair r0 = android.util.Pair.create(r8, r4)
            return r0
        L_0x0043:
            java.lang.String r0 = "ms:laurl"
            boolean r0 = X.C196299Yr.A01(r0, r11)
            if (r0 == 0) goto L_0x0052
            java.lang.String r0 = "licenseUrl"
            java.lang.String r5 = r11.getAttributeValue(r4, r0)
            goto L_0x002f
        L_0x0052:
            if (r6 != 0) goto L_0x00de
            java.lang.String r10 = "pssh"
            int r2 = r11.getEventType()
            r0 = 2
            if (r2 != r0) goto L_0x0095
            java.lang.String r7 = r11.getName()
            r0 = 58
            int r2 = r7.indexOf(r0)
            r0 = -1
            if (r2 == r0) goto L_0x006e
            java.lang.String r7 = X.C165607th.A0o(r2, r7)
        L_0x006e:
            boolean r0 = r7.equals(r10)
            if (r0 == 0) goto L_0x0095
            int r0 = r11.next()
            if (r0 != r1) goto L_0x0095
            java.lang.String r0 = r11.getText()
            byte[] r6 = android.util.Base64.decode(r0, r3)
            X.9Iz r0 = X.C1893493i.A00(r6)
            if (r0 != 0) goto L_0x0092
            r9 = 0
            java.lang.String r1 = "MpdParser"
            java.lang.String r0 = "Skipping malformed cenc:pssh data"
            android.util.Log.w(r1, r0)
            r6 = r4
            goto L_0x002f
        L_0x0092:
            java.util.UUID r9 = r0.A01
            goto L_0x002f
        L_0x0095:
            java.util.UUID r7 = X.AnonymousClass9B7.A02
            boolean r0 = r7.equals(r9)
            if (r0 == 0) goto L_0x00de
            java.lang.String r0 = "mspr:pro"
            boolean r0 = X.C196299Yr.A01(r0, r11)
            if (r0 == 0) goto L_0x00de
            int r0 = r11.next()
            if (r0 != r1) goto L_0x00de
            java.lang.String r0 = r11.getText()
            byte[] r2 = android.util.Base64.decode(r0, r3)
            if (r2 == 0) goto L_0x00dc
            int r0 = r2.length
        L_0x00b6:
            int r0 = r0 + 32
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.allocate(r0)
            r1.putInt(r0)
            r0 = 1886614376(0x70737368, float:3.013775E29)
            r1.putInt(r0)
            r1.putInt(r3)
            X.C165587tf.A1P(r1, r7)
            if (r2 == 0) goto L_0x00d6
            int r0 = r2.length
            if (r0 == 0) goto L_0x00d6
            r1.putInt(r0)
            r1.put(r2)
        L_0x00d6:
            byte[] r6 = r1.array()
            goto L_0x002f
        L_0x00dc:
            r0 = 0
            goto L_0x00b6
        L_0x00de:
            int r1 = r11.getEventType()
            r0 = 2
            if (r1 != r0) goto L_0x002f
            r2 = 1
        L_0x00e6:
            r11.next()
            int r1 = r11.getEventType()
            r0 = 2
            if (r1 != r0) goto L_0x00f5
            int r2 = r2 + 1
        L_0x00f2:
            if (r2 == 0) goto L_0x002f
            goto L_0x00e6
        L_0x00f5:
            int r1 = r11.getEventType()
            r0 = 3
            if (r1 != r0) goto L_0x00e6
            int r2 = r2 + -1
            goto L_0x00f2
        L_0x00ff:
            java.lang.String r0 = "urn:mpeg:dash:mp4protection:2011"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0015
            java.lang.String r0 = "value"
            java.lang.String r8 = r11.getAttributeValue(r4, r0)
            java.lang.String r7 = "default_KID"
            int r6 = r11.getAttributeCount()
            r5 = 0
        L_0x0114:
            if (r5 >= r6) goto L_0x0159
            java.lang.String r2 = r11.getAttributeName(r5)
            r0 = 58
            int r1 = r2.indexOf(r0)
            r0 = -1
            if (r1 == r0) goto L_0x0127
            java.lang.String r2 = X.C165607th.A0o(r1, r2)
        L_0x0127:
            boolean r0 = r2.equals(r7)
            if (r0 == 0) goto L_0x0156
            java.lang.String r1 = r11.getAttributeValue(r5)
        L_0x0131:
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x018e
            java.lang.String r0 = "00000000-0000-0000-0000-000000000000"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x018e
            java.lang.String r0 = "\\s+"
            java.lang.String[] r2 = r1.split(r0)
            int r7 = r2.length
            java.util.UUID[] r6 = new java.util.UUID[r7]
            r1 = 0
        L_0x0149:
            if (r1 >= r7) goto L_0x015b
            r0 = r2[r1]
            java.util.UUID r0 = java.util.UUID.fromString(r0)
            r6[r1] = r0
            int r1 = r1 + 1
            goto L_0x0149
        L_0x0156:
            int r5 = r5 + 1
            goto L_0x0114
        L_0x0159:
            r1 = 0
            goto L_0x0131
        L_0x015b:
            java.util.UUID r9 = X.AnonymousClass9B7.A01
            r5 = 0
            r2 = 32
            int r0 = r7 * 16
            int r0 = r0 + 4
            int r2 = r2 + r0
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.allocate(r2)
            r1.putInt(r2)
            r0 = 1886614376(0x70737368, float:3.013775E29)
            r1.putInt(r0)
            r0 = 16777216(0x1000000, float:2.3509887E-38)
            r1.putInt(r0)
            X.C165587tf.A1P(r1, r9)
            r1.putInt(r7)
        L_0x017d:
            if (r5 >= r7) goto L_0x0187
            r0 = r6[r5]
            X.C165587tf.A1P(r1, r0)
            int r5 = r5 + 1
            goto L_0x017d
        L_0x0187:
            byte[] r6 = r1.array()
            r5 = r4
            goto L_0x0019
        L_0x018e:
            r6 = r4
            goto L_0x0017
        L_0x0191:
            java.lang.String r0 = "urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0015
            java.util.UUID r9 = X.AnonymousClass9B7.A04
            goto L_0x01b1
        L_0x019c:
            java.lang.String r0 = "urn:uuid:9a04f079-9840-4286-ab92-e65be0885f95"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0015
            java.util.UUID r9 = X.AnonymousClass9B7.A02
            goto L_0x01b1
        L_0x01a7:
            java.lang.String r0 = "urn:uuid:e2719d58-a985-b3c9-781a-b030af78d30e"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0015
            java.util.UUID r9 = X.AnonymousClass9B7.A00
        L_0x01b1:
            r8 = r4
            r6 = r4
            r5 = r4
            goto L_0x0019
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C22736Av0.A06(org.xmlpull.v1.XmlPullParser):android.util.Pair");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00cc, code lost:
        r7[r4] = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00ce, code lost:
        r5[r4] = r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C194829Rk A08(X.C194829Rk r10, java.lang.String r11, org.xmlpull.v1.XmlPullParser r12) {
        /*
            r0 = 0
            java.lang.String r6 = r12.getAttributeValue(r0, r11)
            if (r6 == 0) goto L_0x00da
            r0 = 5
            java.lang.String[] r8 = new java.lang.String[r0]
            r0 = 4
            int[] r7 = new int[r0]
            java.lang.String[] r5 = new java.lang.String[r0]
            r9 = 0
            java.lang.String r12 = ""
            r8[r9] = r12
            r3 = 0
            r4 = 0
        L_0x0016:
            int r11 = r6.length()
            if (r3 >= r11) goto L_0x00d4
            java.lang.String r10 = "$"
            int r1 = r6.indexOf(r10, r3)
            r2 = -1
            if (r1 != r2) goto L_0x0038
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            X.C165617ti.A0g(r1, r8, r4)
            java.lang.String r0 = r6.substring(r3)
            r1.append(r0)
            X.C90514aH.A1Q(r1, r8, r4)
            r3 = r11
            goto L_0x0016
        L_0x0038:
            if (r1 == r3) goto L_0x0049
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0u()
            X.C165617ti.A0g(r0, r8, r4)
            X.C165577te.A1O(r6, r0, r3, r1)
            X.C90514aH.A1Q(r0, r8, r4)
            r3 = r1
            goto L_0x0016
        L_0x0049:
            java.lang.String r0 = "$$"
            boolean r0 = r6.startsWith(r0, r3)
            if (r0 == 0) goto L_0x0060
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            r0 = r8[r4]
            java.lang.String r0 = X.AnonymousClass000.A0p(r0, r10, r1)
            r8[r4] = r0
            int r3 = r3 + 2
            goto L_0x0016
        L_0x0060:
            int r0 = r3 + 1
            int r3 = r6.indexOf(r10, r0)
            java.lang.String r10 = r6.substring(r0, r3)
            java.lang.String r0 = "RepresentationID"
            boolean r1 = r10.equals(r0)
            r0 = 1
            if (r1 == 0) goto L_0x007c
            r7[r4] = r0
        L_0x0075:
            int r4 = r4 + 1
            r8[r4] = r12
            int r3 = r3 + 1
            goto L_0x0016
        L_0x007c:
            java.lang.String r0 = "%0"
            int r11 = r10.indexOf(r0)
            if (r11 == r2) goto L_0x00d1
            java.lang.String r2 = r10.substring(r11)
            java.lang.String r1 = "d"
            boolean r0 = r2.endsWith(r1)
            if (r0 != 0) goto L_0x0094
            java.lang.String r2 = X.C36321k7.A0D(r2, r1)
        L_0x0094:
            java.lang.String r10 = r10.substring(r9, r11)
        L_0x0098:
            int r0 = r10.hashCode()
            r1 = 2
            switch(r0) {
                case -1950496919: goto L_0x00ae;
                case 2606829: goto L_0x00b9;
                case 38199441: goto L_0x00c3;
                default: goto L_0x00a0;
            }
        L_0x00a0:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Invalid template: "
            r1.append(r0)
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0c(r6, r1)
            throw r0
        L_0x00ae:
            java.lang.String r0 = "Number"
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x00a0
            r7[r4] = r1
            goto L_0x00ce
        L_0x00b9:
            java.lang.String r0 = "Time"
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x00a0
            r0 = 4
            goto L_0x00cc
        L_0x00c3:
            java.lang.String r0 = "Bandwidth"
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x00a0
            r0 = 3
        L_0x00cc:
            r7[r4] = r0
        L_0x00ce:
            r5[r4] = r2
            goto L_0x0075
        L_0x00d1:
            java.lang.String r2 = "%01d"
            goto L_0x0098
        L_0x00d4:
            X.9Rk r0 = new X.9Rk
            r0.<init>(r7, r8, r5, r4)
            return r0
        L_0x00da:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C22736Av0.A08(X.9Rk, java.lang.String, org.xmlpull.v1.XmlPullParser):X.9Rk");
    }

    public static void A0A(String str, XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue((String) null, str);
        if (attributeValue != null) {
            Matcher matcher = Util.A06.matcher(attributeValue);
            if (matcher.matches()) {
                if (matcher.group(9) != null && !matcher.group(9).equalsIgnoreCase("Z")) {
                    Integer.parseInt(matcher.group(12));
                    Integer.parseInt(matcher.group(13));
                    matcher.group(11);
                }
                GregorianCalendar gregorianCalendar = new GregorianCalendar(TimeZone.getTimeZone("GMT"));
                gregorianCalendar.clear();
                gregorianCalendar.set(C165607th.A0A(matcher, 1), C165607th.A0A(matcher, 2) - 1, C165607th.A0A(matcher, 3), C165607th.A0A(matcher, 4), C165607th.A0A(matcher, 5), C165607th.A0A(matcher, 6));
                if (!TextUtils.isEmpty(matcher.group(8))) {
                    StringBuilder A0u = AnonymousClass000.A0u();
                    A0u.append("0.");
                    gregorianCalendar.set(14, C165617ti.A0b(AnonymousClass000.A0q(matcher.group(8), A0u)).movePointRight(3).intValue());
                }
                gregorianCalendar.getTimeInMillis();
                return;
            }
            throw new C187398xn(AnonymousClass000.A0p("Invalid date/time format: ", attributeValue, AnonymousClass000.A0u()), (Throwable) null, true);
        }
    }

    public AnonymousClass9WU A0D(String str, String str2, XmlPullParser xmlPullParser) {
        long j;
        long j2;
        String attributeValue = xmlPullParser.getAttributeValue((String) null, str);
        String attributeValue2 = xmlPullParser.getAttributeValue((String) null, str2);
        if (attributeValue2 != null) {
            String[] split = attributeValue2.split("-");
            j = Long.parseLong(C165617ti.A0a(split));
            if (split.length == 2) {
                j2 = (Long.parseLong(split[1]) - j) + 1;
            }
            j2 = -1;
        } else {
            j = 0;
            j2 = -1;
        }
        return new AnonymousClass9WU(j, attributeValue, j2);
    }

    public static int A02(XmlPullParser xmlPullParser) {
        String A002;
        String str = null;
        String attributeValue = xmlPullParser.getAttributeValue((String) null, "schemeIdUri");
        if (attributeValue != null) {
            str = attributeValue;
        }
        int i = -1;
        if (!"urn:mpeg:dash:23003:3:audio_channel_configuration:2011".equals(str)) {
            if ("tag:dolby.com,2014:dash:audio_channel_configuration:2011".equals(str) && (A002 = C1897495k.A00(xmlPullParser.getAttributeValue((String) null, "value"))) != null) {
                switch (A002.hashCode()) {
                    case 1596796:
                        i = C90514aH.A1B("4000", A002);
                        break;
                    case 2937391:
                        i = C90514aH.A1C("a000", A002);
                        break;
                    case 3094035:
                        if (A002.equals("f801")) {
                            i = 6;
                            break;
                        }
                        break;
                    case 3133436:
                        if (A002.equals("fa01")) {
                            i = 8;
                            break;
                        }
                        break;
                }
            }
        } else {
            i = A01("value", xmlPullParser, -1);
        }
        do {
            xmlPullParser.next();
        } while (!C196299Yr.A00("AudioChannelConfiguration", xmlPullParser));
        return i;
    }

    public static AnonymousClass9U3 A07(String str, XmlPullParser xmlPullParser) {
        String str2 = "";
        String str3 = null;
        String attributeValue = xmlPullParser.getAttributeValue((String) null, "schemeIdUri");
        if (attributeValue != null) {
            str2 = attributeValue;
        }
        String str4 = null;
        String attributeValue2 = xmlPullParser.getAttributeValue((String) null, "value");
        if (attributeValue2 != null) {
            str4 = attributeValue2;
        }
        String attributeValue3 = xmlPullParser.getAttributeValue((String) null, PublicKeyCredentialControllerUtility.JSON_KEY_ID);
        if (attributeValue3 != null) {
            str3 = attributeValue3;
        }
        do {
            xmlPullParser.next();
        } while (!C196299Yr.A00(str, xmlPullParser));
        return new AnonymousClass9U3(str2, str4, str3);
    }

    public static String A09(C22736Av0 av0, StringBuilder sb, List list) {
        String str = "";
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("VideoId: ");
        A0u.append(av0.A03);
        A0u.append("\n");
        C36351kA.A1K(A0u, sb);
        sb.append("++++++++++++++++++++++++++++++++++++++++\n");
        sb.append("Is MCM: ");
        sb.append(A0C(list));
        sb.append("\n");
        HashMap A0J = AnonymousClass001.A0J();
        Iterator it = list.iterator();
        if (it.hasNext()) {
            int i = 0;
            for (AnonymousClass9O1 r1 : ((AnonymousClass9RE) it.next()).A01) {
                if (r1 != null && r1.A00 == 2) {
                    C36351kA.A1M("Adaptation set ", "\n", sb, i);
                    i++;
                    int i2 = 0;
                    for (C196079Xo r12 : r1.A05) {
                        sb.append("  [");
                        sb.append(i2);
                        sb.append("]");
                        C207099uY r122 = r12.A00;
                        String str2 = r122.A0S;
                        sb.append(str2);
                        sb.append(",");
                        C90494aF.A1L(sb, r122.A0I);
                        sb.append(r122.A09);
                        sb.append(",aoai: ");
                        C206379tI r13 = r122.A0K;
                        sb.append(r13.A07);
                        sb.append(",");
                        sb.append(r13.A05);
                        sb.append(",");
                        sb.append(r122.A04);
                        sb.append("bps\n");
                        i2++;
                        Number num = new Integer(0);
                        if (A0J.containsKey(str2) && (num = C36441kJ.A10(str2, A0J)) == null) {
                            num = new Integer(0);
                        }
                        C36341k9.A1K(str2, A0J, num.intValue() + 1);
                    }
                }
            }
        }
        sb.append("----------------------------------------\n");
        if (A0J.isEmpty()) {
            return str;
        }
        Iterator A10 = C36371kC.A10(A0J);
        while (A10.hasNext()) {
            Map.Entry A11 = AnonymousClass000.A11(A10);
            str = AnonymousClass000.A0q("+", AnonymousClass000.A0v(AnonymousClass000.A0q(String.format(Locale.US, "%d%s", new Object[]{A11.getValue(), A11.getKey()}), AnonymousClass000.A0v(str))));
        }
        int length = str.length();
        if (length > 1) {
            return str.substring(0, length - 1);
        }
        return str;
    }

    /* JADX WARNING: type inference failed for: r8v6, types: [java.util.List] */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x008c, code lost:
        if (r8 != null) goto L_0x0092;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x008e, code lost:
        r8 = X.AnonymousClass001.A0I();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0092, code lost:
        r8.add(A0D("media", "mediaRange", r4));
        r8 = r8;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass831 A0E(X.AnonymousClass831 r21, org.xmlpull.v1.XmlPullParser r22) {
        /*
            r20 = this;
            r2 = 1
            r5 = r21
            if (r21 == 0) goto L_0x00a9
            long r6 = r5.A01
        L_0x0008:
            java.lang.String r0 = "timescale"
            r4 = r22
            long r10 = A05(r0, r4, r6)
            if (r21 == 0) goto L_0x00a5
            long r0 = r5.A00
        L_0x0014:
            java.lang.String r6 = "presentationTimeOffset"
            long r12 = A05(r6, r4, r0)
            if (r21 == 0) goto L_0x009e
            long r0 = r5.A01
        L_0x001e:
            java.lang.String r6 = "duration"
            long r16 = A05(r6, r4, r0)
            if (r21 == 0) goto L_0x0028
            long r2 = r5.A03
        L_0x0028:
            java.lang.String r0 = "startNumber"
            long r14 = A05(r0, r4, r2)
            r8 = 0
            r6 = r8
            r0 = r8
        L_0x0031:
            r4.next()
            java.lang.String r1 = "Initialization"
            boolean r1 = X.C196299Yr.A01(r1, r4)
            r3 = r20
            if (r1 == 0) goto L_0x0077
            java.lang.String r2 = "sourceURL"
            java.lang.String r1 = "range"
            X.9WU r6 = r3.A0D(r2, r1, r4)
        L_0x0046:
            java.lang.String r1 = "SegmentList"
            boolean r1 = X.C196299Yr.A00(r1, r4)
            if (r1 == 0) goto L_0x0031
            if (r21 == 0) goto L_0x0069
            if (r6 != 0) goto L_0x0054
            X.9WU r6 = r5.A02
        L_0x0054:
            if (r0 == 0) goto L_0x005a
            java.util.List r1 = r0.A02
            if (r1 != 0) goto L_0x0065
        L_0x005a:
            java.util.List r4 = r5.A04
            int r3 = r5.A00
            long r1 = r5.A02
            X.9J3 r0 = new X.9J3
            r0.<init>(r4, r3, r1)
        L_0x0065:
            if (r8 != 0) goto L_0x0069
            java.util.List r8 = r5.A00
        L_0x0069:
            java.util.List r7 = r0.A02
            int r9 = r0.A00
            long r0 = r0.A01
            X.831 r5 = new X.831
            r18 = r0
            r5.<init>(r6, r7, r8, r9, r10, r12, r14, r16, r18)
            return r5
        L_0x0077:
            java.lang.String r1 = "SegmentTimeline"
            boolean r1 = X.C196299Yr.A01(r1, r4)
            if (r1 == 0) goto L_0x0084
            X.9J3 r0 = r3.A0G(r4)
            goto L_0x0046
        L_0x0084:
            java.lang.String r1 = "SegmentURL"
            boolean r1 = X.C196299Yr.A01(r1, r4)
            if (r1 == 0) goto L_0x0046
            if (r8 != 0) goto L_0x0092
            java.util.ArrayList r8 = X.AnonymousClass001.A0I()
        L_0x0092:
            java.lang.String r2 = "media"
            java.lang.String r1 = "mediaRange"
            X.9WU r1 = r3.A0D(r2, r1, r4)
            r8.add(r1)
            goto L_0x0046
        L_0x009e:
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x001e
        L_0x00a5:
            r0 = 0
            goto L_0x0014
        L_0x00a9:
            r6 = 1
            goto L_0x0008
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C22736Av0.A0E(X.831, org.xmlpull.v1.XmlPullParser):X.831");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00a4, code lost:
        if (r4 != -1) goto L_0x00a6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass832 A0F(X.AnonymousClass832 r22, org.xmlpull.v1.XmlPullParser r23, boolean r24) {
        /*
            r21 = this;
            r4 = 1
            r1 = r22
            if (r22 == 0) goto L_0x00c6
            long r6 = r1.A01
        L_0x0008:
            java.lang.String r2 = "timescale"
            r0 = r23
            long r12 = A05(r2, r0, r6)
            if (r22 == 0) goto L_0x00c2
            long r2 = r1.A00
        L_0x0014:
            java.lang.String r6 = "presentationTimeOffset"
            long r14 = A05(r6, r0, r2)
            if (r22 == 0) goto L_0x00bb
            long r2 = r1.A01
        L_0x001e:
            java.lang.String r6 = "duration"
            long r18 = A05(r6, r0, r2)
            if (r22 == 0) goto L_0x0028
            long r4 = r1.A03
        L_0x0028:
            java.lang.String r2 = "startNumber"
            long r16 = A05(r2, r0, r4)
            r8 = 0
            if (r22 == 0) goto L_0x00b8
            X.9Rk r3 = r1.A02
        L_0x0033:
            java.lang.String r2 = "media"
            X.9Rk r11 = A08(r3, r2, r0)
            if (r22 == 0) goto L_0x00b6
            X.9Rk r3 = r1.A01
        L_0x003d:
            java.lang.String r2 = "initialization"
            X.9Rk r10 = A08(r3, r2, r0)
            r9 = r8
            r7 = r8
        L_0x0045:
            r0.next()
            java.lang.String r2 = "Initialization"
            boolean r2 = X.C196299Yr.A01(r2, r0)
            r6 = r21
            if (r2 == 0) goto L_0x0081
            java.lang.String r3 = "sourceURL"
            java.lang.String r2 = "range"
            X.9WU r8 = r6.A0D(r3, r2, r0)
        L_0x005a:
            java.lang.String r2 = "SegmentTemplate"
            boolean r2 = X.C196299Yr.A00(r2, r0)
            if (r2 == 0) goto L_0x0045
            if (r22 == 0) goto L_0x0079
            if (r8 != 0) goto L_0x0068
            X.9WU r8 = r1.A02
        L_0x0068:
            if (r9 == 0) goto L_0x006e
            java.util.List r0 = r9.A02
            if (r0 != 0) goto L_0x0079
        L_0x006e:
            java.util.List r3 = r1.A04
            int r2 = r1.A00
            long r0 = r1.A02
            X.9J3 r9 = new X.9J3
            r9.<init>(r3, r2, r0)
        L_0x0079:
            X.832 r6 = new X.832
            r20 = r24
            r6.<init>(r7, r8, r9, r10, r11, r12, r14, r16, r18, r20)
            return r6
        L_0x0081:
            java.lang.String r2 = "SegmentTimeline"
            boolean r2 = X.C196299Yr.A01(r2, r0)
            if (r2 == 0) goto L_0x005a
            java.lang.String r2 = "FBPredictedMedia"
            r7 = 0
            X.9Rk r3 = A08(r7, r2, r0)
            java.lang.String r4 = "FBPredictedMediaEndNumber"
            r2 = -1
            int r4 = A01(r4, r0, r2)
            java.lang.String r5 = "FBPredictedMediaStartNumber"
            A01(r5, r0, r2)
            java.lang.String r5 = "FBAverageDuration"
            A01(r5, r0, r2)
            if (r3 == 0) goto L_0x00a6
            r5 = 0
            if (r4 == r2) goto L_0x00a7
        L_0x00a6:
            r5 = 1
        L_0x00a7:
            X.C200319h9.A02(r5)
            if (r3 == 0) goto L_0x00b1
            X.9GK r7 = new X.9GK
            r7.<init>(r3, r4)
        L_0x00b1:
            X.9J3 r9 = r6.A0G(r0)
            goto L_0x005a
        L_0x00b6:
            r3 = r8
            goto L_0x003d
        L_0x00b8:
            r3 = r8
            goto L_0x0033
        L_0x00bb:
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x001e
        L_0x00c2:
            r2 = 0
            goto L_0x0014
        L_0x00c6:
            r6 = 1
            goto L_0x0008
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C22736Av0.A0F(X.832, org.xmlpull.v1.XmlPullParser, boolean):X.832");
    }

    public AnonymousClass834 A0H(AnonymousClass834 r18, XmlPullParser xmlPullParser) {
        long j;
        long j2;
        long j3;
        AnonymousClass834 r2 = r18;
        if (r18 != null) {
            j = r2.A01;
        } else {
            j = 1;
        }
        XmlPullParser xmlPullParser2 = xmlPullParser;
        long A052 = A05("timescale", xmlPullParser2, j);
        long j4 = 0;
        if (r18 != null) {
            j2 = r2.A00;
        } else {
            j2 = 0;
        }
        long A053 = A05("presentationTimeOffset", xmlPullParser2, j2);
        if (r18 != null) {
            j3 = r2.A01;
            j4 = r2.A00;
        } else {
            j3 = 0;
        }
        AnonymousClass9WU r8 = null;
        String attributeValue = xmlPullParser2.getAttributeValue((String) null, "indexRange");
        if (attributeValue != null) {
            String[] split = attributeValue.split("-");
            j3 = Long.parseLong(C165617ti.A0a(split));
            j4 = (Long.parseLong(split[1]) - j3) + 1;
        }
        if (r18 != null) {
            r8 = r2.A02;
        }
        do {
            xmlPullParser2.next();
            if (C196299Yr.A01("Initialization", xmlPullParser2)) {
                r8 = A0D("sourceURL", "range", xmlPullParser2);
            }
        } while (!C196299Yr.A00("SegmentBase", xmlPullParser2));
        return new AnonymousClass834(r8, A052, A053, j3, j4);
    }

    public static boolean A0B(String str) {
        if (C203249nb.A06(str) || "application/ttml+xml".equals(str) || "application/x-mp4-vtt".equals(str) || "application/cea-708".equals(str) || "application/cea-608".equals(str)) {
            return true;
        }
        return false;
    }

    public static boolean A0C(List list) {
        String str;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass9RE r0 = (AnonymousClass9RE) it.next();
            if (r0 != null) {
                int i = 0;
                for (AnonymousClass9O1 r02 : r0.A01) {
                    if (r02 != null && r02.A00 == 2 && (i = i + 1) > 1) {
                        return true;
                    }
                }
                continue;
            }
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            AnonymousClass9RE r03 = (AnonymousClass9RE) it2.next();
            if (r03 != null) {
                for (AnonymousClass9O1 r2 : r03.A01) {
                    if (r2 != null && r2.A00 == 2) {
                        String str2 = "";
                        for (C196079Xo r04 : r2.A05) {
                            if (!(r04 == null || (str = r04.A00.A0S) == null || TextUtils.isEmpty(str))) {
                                if (TextUtils.isEmpty(str2)) {
                                    str2 = str;
                                } else if (!str2.equals(str)) {
                                    return true;
                                }
                            }
                        }
                        continue;
                    }
                }
                continue;
            }
        }
        return false;
    }

    public AnonymousClass9J3 A0G(XmlPullParser xmlPullParser) {
        ArrayList A0I = AnonymousClass001.A0I();
        long j = 0;
        long j2 = 0;
        int i = 0;
        do {
            xmlPullParser.next();
            if (C196299Yr.A01("S", xmlPullParser)) {
                long A052 = A05("t", xmlPullParser, j);
                long A053 = A05("d", xmlPullParser, -9223372036854775807L);
                int A012 = A01("r", xmlPullParser, 0) + 1;
                int A013 = A01(PublicKeyCredentialControllerUtility.JSON_KEY_ID, xmlPullParser, 0);
                j2 = Math.max(j2, A053);
                A0I.add(new AnonymousClass9SE(A012, i, A013, A052, A053, false));
                j = A052 + (((long) A012) * A053);
                i += A012;
            }
        } while (!C196299Yr.A00("SegmentTimeline", xmlPullParser));
        A0I.isEmpty();
        return new AnonymousClass9J3(A0I, i, j2);
    }

    public C22736Av0() {
        this((String) null, 0, false, false);
    }
}
