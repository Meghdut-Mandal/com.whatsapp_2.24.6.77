package X;

import android.graphics.Matrix;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.voipcalling.CallLinkInfo;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;
import org.xml.sax.Attributes;

/* renamed from: X.9ou  reason: invalid class name and case insensitive filesystem */
public class C203809ou {
    public int A00;
    public B0V A01 = null;
    public C200029gS A02 = null;
    public C188048yx A03 = null;
    public StringBuilder A04 = null;
    public StringBuilder A05 = null;
    public boolean A06 = false;
    public boolean A07 = false;
    public boolean A08 = false;

    public static float A00(float f, float f2, float f3) {
        float f4;
        if (f3 < 0.0f) {
            f3 += 6.0f;
        }
        if (f3 >= 6.0f) {
            f3 -= 6.0f;
        }
        if (f3 < 1.0f) {
            f4 = (f2 - f) * f3;
        } else if (f3 < 3.0f) {
            return f2;
        } else {
            if (f3 >= 4.0f) {
                return f;
            }
            f4 = (f2 - f) * (4.0f - f3);
        }
        return f4 + f;
    }

    public static float A01(String str, int i) {
        float A002 = new C198619ds().A00(str, 0, i);
        if (!Float.isNaN(A002)) {
            return A002;
        }
        throw C22735Auz.A00(AnonymousClass000.A0p("Invalid float value: ", str, AnonymousClass000.A0u()));
    }

    public static int A02(float f) {
        if (f < 0.0f) {
            return 0;
        }
        if (f > 255.0f) {
            return 255;
        }
        return Math.round(f);
    }

    public static C1686981p A07(String str) {
        int i;
        int i2;
        int i3;
        int i4;
        int A022;
        long j;
        int i5;
        String str2 = str;
        int i6 = 5;
        if (str2.charAt(0) == '#') {
            int length = str2.length();
            C197509bp r9 = null;
            if (1 < length) {
                long j2 = 0;
                int i7 = 1;
                while (true) {
                    char charAt = str2.charAt(i7);
                    if (charAt >= '0') {
                        if (charAt <= '9') {
                            j2 = (j2 * 16) + ((long) (charAt - '0'));
                        } else if (charAt < 'A') {
                            break;
                        } else {
                            if (charAt > 'F') {
                                if (charAt < 'a' || charAt > 'f') {
                                    break;
                                }
                                j = j2 * 16;
                                i5 = charAt - 'a';
                            } else {
                                j = j2 * 16;
                                i5 = charAt - 'A';
                            }
                            j2 = j + ((long) i5) + 10;
                        }
                        if (j2 <= 4294967295L) {
                            i7++;
                            if (i7 >= length) {
                                break;
                            }
                        } else {
                            break;
                        }
                    } else {
                        break;
                    }
                }
                if (i7 != 1) {
                    r9 = new C197509bp(j2, i7);
                }
            }
            if (r9 != null) {
                int i8 = r9.A00;
                if (i8 == 4) {
                    int i9 = (int) r9.A01;
                    int i10 = i9 & 3840;
                    int i11 = i9 & 240;
                    int i12 = i9 & 15;
                    return new C1686981p(i12 | (i10 << 8) | -16777216 | (i10 << 12) | (i11 << 8) | (i11 << 4) | (i12 << 4));
                } else if (i8 == 5) {
                    int i13 = (int) r9.A01;
                    int i14 = 61440 & i13;
                    int i15 = i13 & 3840;
                    int i16 = i13 & 240;
                    int i17 = i13 & 15;
                    return new C1686981p((i17 << 24) | (i17 << 28) | (i14 << 8) | (i14 << 4) | (i15 << 4) | i15 | i16 | (i16 >> 4));
                } else if (i8 == 7) {
                    i4 = (int) r9.A01;
                } else if (i8 == 9) {
                    int i18 = (int) r9.A01;
                    i3 = i18 << 24;
                    i2 = i18 >>> 8;
                    i = i2 | i3;
                    return new C1686981p(i);
                } else {
                    throw C22735Auz.A00(C36321k7.A0D("Bad hex colour value: ", str2));
                }
            } else {
                throw C22735Auz.A00(C36321k7.A0D("Bad hex colour value: ", str2));
            }
        } else {
            String A0y = C90514aH.A0y(str2);
            boolean startsWith = A0y.startsWith("rgba(");
            if (!startsWith) {
                if (A0y.startsWith("rgb(")) {
                    i6 = 4;
                } else {
                    boolean startsWith2 = A0y.startsWith("hsla(");
                    if (!startsWith2) {
                        if (A0y.startsWith("hsl(")) {
                            i6 = 4;
                        } else {
                            Number A0b = C90524aI.A0b(A0y, C1903498a.A00);
                            if (A0b != null) {
                                return new C1686981p(A0b.intValue());
                            }
                            throw C22735Auz.A00(AnonymousClass000.A0p("Invalid colour keyword: ", A0y, AnonymousClass000.A0u()));
                        }
                    }
                    C200249gy r6 = new C200249gy(str2.substring(i6));
                    r6.A0D();
                    float A042 = r6.A04();
                    float A052 = r6.A05(A042);
                    if (!Float.isNaN(A052)) {
                        r6.A0F('%');
                    }
                    float A053 = r6.A05(A052);
                    boolean isNaN = Float.isNaN(A053);
                    if (!isNaN) {
                        r6.A0F('%');
                    }
                    if (startsWith2) {
                        float A054 = r6.A05(A053);
                        r6.A0D();
                        if (Float.isNaN(A054) || !r6.A0F(')')) {
                            throw C22735Auz.A00(AnonymousClass000.A0p("Bad hsla() colour value: ", str2, AnonymousClass000.A0u()));
                        }
                        i2 = A02(A054 * 256.0f) << 24;
                        i3 = A03(A042, A052, A053);
                        i = i2 | i3;
                        return new C1686981p(i);
                    }
                    r6.A0D();
                    if (isNaN || !r6.A0F(')')) {
                        throw C22735Auz.A00(AnonymousClass000.A0p("Bad hsl() colour value: ", str2, AnonymousClass000.A0u()));
                    }
                    i4 = A03(A042, A052, A053);
                }
            }
            C200249gy r62 = new C200249gy(str2.substring(i6));
            r62.A0D();
            float A043 = r62.A04();
            if (!Float.isNaN(A043) && r62.A0F('%')) {
                A043 = (A043 * 256.0f) / 100.0f;
            }
            float A055 = r62.A05(A043);
            if (!Float.isNaN(A055) && r62.A0F('%')) {
                A055 = (A055 * 256.0f) / 100.0f;
            }
            float A056 = r62.A05(A055);
            if (!Float.isNaN(A056) && r62.A0F('%')) {
                A056 = (A056 * 256.0f) / 100.0f;
            }
            if (startsWith) {
                float A057 = r62.A05(A056);
                r62.A0D();
                if (Float.isNaN(A057) || !r62.A0F(')')) {
                    throw C22735Auz.A00(AnonymousClass000.A0p("Bad rgba() colour value: ", str2, AnonymousClass000.A0u()));
                }
                A022 = (A02(A057 * 256.0f) << 24) | (A02(A043) << 16);
            } else {
                r62.A0D();
                if (Float.isNaN(A056) || !r62.A0F(')')) {
                    throw C22735Auz.A00(AnonymousClass000.A0p("Bad rgb() colour value: ", str2, AnonymousClass000.A0u()));
                }
                A022 = (A02(A043) << 16) | -16777216;
            }
            i2 = A022 | (A02(A055) << 8);
            i3 = A02(A056);
            i = i2 | i3;
            return new C1686981p(i);
        }
        i = i4 | -16777216;
        return new C1686981p(i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x001b, code lost:
        continue;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A0I(X.C1686381j r6, org.xml.sax.Attributes r7) {
        /*
            r5 = this;
            r4 = 0
            r3 = 0
        L_0x0002:
            int r0 = r7.getLength()
            if (r3 >= r0) goto L_0x00a2
            java.lang.String r0 = r7.getValue(r3)
            java.lang.String r2 = r0.trim()
            int r1 = A05(r7, r3)
            r0 = 26
            if (r1 == r0) goto L_0x0064
            switch(r1) {
                case 23: goto L_0x003a;
                case 24: goto L_0x001e;
                case 60: goto L_0x0041;
                default: goto L_0x001b;
            }
        L_0x001b:
            int r3 = r3 + 1
            goto L_0x0002
        L_0x001e:
            java.lang.String r0 = "objectBoundingBox"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x002d
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
        L_0x002a:
            r6.A01 = r0
            goto L_0x001b
        L_0x002d:
            java.lang.String r0 = "userSpaceOnUse"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x007f
            java.lang.Boolean r0 = X.C36371kC.A0m()
            goto L_0x002a
        L_0x003a:
            android.graphics.Matrix r0 = A06(r2)
            r6.A00 = r0
            goto L_0x001b
        L_0x0041:
            java.lang.String r0 = "pad"
            boolean r0 = r2.equals(r0)     // Catch:{ IllegalArgumentException -> 0x008b }
            if (r0 == 0) goto L_0x004e
            java.lang.Integer r0 = X.C023109s.A00     // Catch:{ IllegalArgumentException -> 0x008b }
        L_0x004b:
            r6.A02 = r0     // Catch:{ IllegalArgumentException -> 0x008b }
            goto L_0x001b
        L_0x004e:
            java.lang.String r0 = "reflect"
            boolean r0 = r2.equals(r0)     // Catch:{ IllegalArgumentException -> 0x008b }
            if (r0 == 0) goto L_0x0059
            java.lang.Integer r0 = X.C023109s.A01     // Catch:{ IllegalArgumentException -> 0x008b }
            goto L_0x004b
        L_0x0059:
            java.lang.String r0 = "repeat"
            boolean r0 = r2.equals(r0)     // Catch:{ IllegalArgumentException -> 0x008b }
            if (r0 == 0) goto L_0x0086
            java.lang.Integer r0 = X.C023109s.A0C     // Catch:{ IllegalArgumentException -> 0x008b }
            goto L_0x004b
        L_0x0064:
            java.lang.String r1 = r7.getURI(r3)
            java.lang.String r0 = ""
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x007c
            java.lang.String r1 = r7.getURI(r3)
            java.lang.String r0 = "http://www.w3.org/1999/xlink"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x001b
        L_0x007c:
            r6.A03 = r2
            goto L_0x001b
        L_0x007f:
            java.lang.String r0 = "Invalid value for attribute gradientUnits"
            X.Auz r0 = X.C22735Auz.A00(r0)
            throw r0
        L_0x0086:
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A08(r2)     // Catch:{ IllegalArgumentException -> 0x008b }
            throw r0     // Catch:{ IllegalArgumentException -> 0x008b }
        L_0x008b:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Invalid spreadMethod attribute. \""
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = "\" is not a valid value."
            java.lang.String r0 = X.AnonymousClass000.A0q(r0, r1)
            X.Auz r0 = X.C22735Auz.A00(r0)
            throw r0
        L_0x00a2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C203809ou.A0I(X.81j, org.xml.sax.Attributes):void");
    }

    private void A0J(C22857Ax8 ax8, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            if (AnonymousClass5U2.A00(attributes.getLocalName(i)) == AnonymousClass5U2.A05) {
                ax8.BsZ(A06(attributes.getValue(i)));
            }
        }
    }

    public static void A0L(B3X b3x, Attributes attributes) {
        String str;
        HashSet hashSet;
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            switch (A05(attributes, i)) {
                case 52:
                    C200249gy r3 = new C200249gy(trim);
                    HashSet A16 = C36441kJ.A16();
                    while (!AnonymousClass000.A1S(r3.A01, r3.A00)) {
                        String A0C = r3.A0C(' ', false);
                        if (A0C.startsWith("http://www.w3.org/TR/SVG11/feature#")) {
                            str = A0C.substring(35);
                        } else {
                            str = "UNSUPPORTED";
                        }
                        A16.add(str);
                        r3.A0D();
                    }
                    b3x.Brz(A16);
                    break;
                case 53:
                    b3x.Bry(trim);
                    break;
                case 54:
                    C200249gy r32 = new C200249gy(trim);
                    HashSet A162 = C36441kJ.A16();
                    while (!AnonymousClass000.A1S(r32.A01, r32.A00)) {
                        A162.add(r32.A0C(' ', false));
                        r32.A0D();
                    }
                    b3x.Bs1(A162);
                    break;
                case 55:
                    ArrayList A0G = A0G(trim);
                    if (A0G != null) {
                        hashSet = C90524aI.A0k(A0G);
                    } else {
                        hashSet = new HashSet(0);
                    }
                    b3x.Bs0(hashSet);
                    break;
                case 73:
                    C200249gy r6 = new C200249gy(trim);
                    HashSet A163 = C36441kJ.A16();
                    while (!AnonymousClass000.A1S(r6.A01, r6.A00)) {
                        String A0C2 = r6.A0C(' ', false);
                        int indexOf = A0C2.indexOf(45);
                        if (indexOf != -1) {
                            A0C2 = A0C2.substring(0, indexOf);
                        }
                        A163.add(new Locale(A0C2, "", "").getLanguage());
                        r6.A0D();
                    }
                    b3x.BsR(A163);
                    break;
            }
        }
    }

    public static void A0N(AnonymousClass825 r3, Attributes attributes) {
        Boolean bool;
        int i = 0;
        while (i < attributes.getLength()) {
            String qName = attributes.getQName(i);
            if (qName.equals(PublicKeyCredentialControllerUtility.JSON_KEY_ID) || qName.equals("xml:id")) {
                r3.A00 = attributes.getValue(i).trim();
                return;
            } else if (qName.equals("xml:space")) {
                String trim = attributes.getValue(i).trim();
                if (CallLinkInfo.DEFAULT_CALL_LINK_CALL_ID.equals(trim)) {
                    bool = Boolean.FALSE;
                } else if ("preserve".equals(trim)) {
                    bool = Boolean.TRUE;
                } else {
                    throw C22735Auz.A00(AnonymousClass000.A0p("Invalid value for \"xml:space\" attribute: ", trim, AnonymousClass000.A0u()));
                }
                r3.A04 = bool;
                return;
            } else {
                i++;
            }
        }
    }

    public static void A0O(AnonymousClass825 r7, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            if (trim.length() != 0) {
                int A052 = A05(attributes, i);
                if (A052 == 72) {
                    C200249gy r5 = new C200249gy(trim.replaceAll("/\\*.*?\\*/", ""));
                    while (true) {
                        String A0C = r5.A0C(':', false);
                        r5.A0D();
                        if (!r5.A0F(':')) {
                            break;
                        }
                        r5.A0D();
                        String A0C2 = r5.A0C(';', true);
                        if (A0C2 == null) {
                            break;
                        }
                        r5.A0D();
                        if (AnonymousClass000.A1S(r5.A01, r5.A00) || r5.A0F(';')) {
                            AUW auw = r7.A03;
                            if (auw == null) {
                                auw = new AUW();
                                r7.A03 = auw;
                            }
                            A0K(auw, A0C, A0C2);
                            r5.A0D();
                        }
                    }
                } else if (A052 != 0) {
                    AUW auw2 = r7.A02;
                    if (auw2 == null) {
                        auw2 = new AUW();
                        r7.A02 = auw2;
                    }
                    A0K(auw2, attributes.getLocalName(i), attributes.getValue(i).trim());
                } else {
                    AnonymousClass82B r3 = new AnonymousClass82B(trim);
                    ArrayList arrayList = null;
                    while (!AnonymousClass000.A1S(r3.A01, r3.A00)) {
                        String A0C3 = r3.A0C(' ', false);
                        if (A0C3 != null) {
                            if (arrayList == null) {
                                arrayList = AnonymousClass001.A0I();
                            }
                            arrayList.add(A0C3);
                            r3.A0D();
                        }
                    }
                    r7.A01 = arrayList;
                }
            }
        }
    }

    public static void A0Q(C1687081q r7, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            int A052 = A05(attributes, i);
            if (A052 == 48) {
                A0P(r7, trim);
            } else if (A052 == 80) {
                C200249gy r0 = new C200249gy(trim);
                r0.A0D();
                float A042 = r0.A04();
                r0.A0E();
                float A043 = r0.A04();
                r0.A0E();
                float A044 = r0.A04();
                r0.A0E();
                float A045 = r0.A04();
                if (Float.isNaN(A042) || Float.isNaN(A043) || Float.isNaN(A044) || Float.isNaN(A045)) {
                    throw C22735Auz.A00("Invalid viewBox definition - should have four numbers");
                } else if (A044 < 0.0f) {
                    throw C22735Auz.A00("Invalid viewBox. width cannot be negative");
                } else if (A045 >= 0.0f) {
                    r7.A00 = new C198839eH(A042, A043, A044, A045);
                } else {
                    throw C22735Auz.A00("Invalid viewBox. height cannot be negative");
                }
            } else {
                continue;
            }
        }
    }

    public static void A0R(C1687781x r4, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String trim = attributes.getValue(i).trim();
            int A052 = A05(attributes, i);
            if (A052 == 82) {
                r4.A02 = A0H(trim);
            } else if (A052 == 83) {
                r4.A03 = A0H(trim);
            } else if (A052 == 9) {
                r4.A00 = A0H(trim);
            } else if (A052 == 10) {
                r4.A01 = A0H(trim);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0026, code lost:
        if (r7 <= 0.5f) goto L_0x0028;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int A03(float r5, float r6, float r7) {
        /*
            r1 = 1135869952(0x43b40000, float:360.0)
            r2 = 0
            int r0 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            float r5 = r5 % r1
            if (r0 >= 0) goto L_0x0009
            float r5 = r5 + r1
        L_0x0009:
            r0 = 1114636288(0x42700000, float:60.0)
            float r5 = r5 / r0
            r0 = 1120403456(0x42c80000, float:100.0)
            float r6 = r6 / r0
            float r7 = r7 / r0
            r1 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x005b
            r6 = 0
        L_0x0017:
            int r0 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r0 < 0) goto L_0x0028
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            r2 = 1065353216(0x3f800000, float:1.0)
            if (r0 > 0) goto L_0x0055
            r2 = r7
            r0 = 1056964608(0x3f000000, float:0.5)
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x0055
        L_0x0028:
            float r6 = r6 + r1
            float r6 = r6 * r2
        L_0x002a:
            r1 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 * r1
            float r2 = r2 - r6
            float r0 = r5 + r1
            float r0 = A00(r2, r6, r0)
            float r4 = A00(r2, r6, r5)
            float r5 = r5 - r1
            float r3 = A00(r2, r6, r5)
            r2 = 1132462080(0x43800000, float:256.0)
            float r0 = r0 * r2
            int r0 = A02(r0)
            int r1 = r0 << 16
            float r4 = r4 * r2
            int r0 = A02(r4)
            int r0 = r0 << 8
            r1 = r1 | r0
            float r3 = r3 * r2
            int r0 = A02(r3)
            r0 = r0 | r1
            return r0
        L_0x0055:
            float r0 = r2 + r6
            float r6 = r6 * r2
            float r6 = r0 - r6
            goto L_0x002a
        L_0x005b:
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0017
            r6 = 1065353216(0x3f800000, float:1.0)
            goto L_0x0017
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C203809ou.A03(float, float, float):int");
    }

    public static int A05(Attributes attributes, int i) {
        AnonymousClass5Y7 r0 = AnonymousClass5Y7.$redex_init_class;
        return AnonymousClass5U2.A00(attributes.getLocalName(i)).ordinal();
    }

    public static AUX A08(C200249gy r1) {
        if (r1.A0G("auto")) {
            return new AUX(0.0f);
        }
        return r1.A07();
    }

    public static AUT A0A(String str) {
        if (str.startsWith("url(")) {
            int indexOf = str.indexOf(")");
            AUT aut = null;
            if (indexOf == -1) {
                return new C1686781n((AUT) null, str.substring(4).trim());
            }
            String trim = str.substring(4, indexOf).trim();
            String trim2 = C165607th.A0o(indexOf, str).trim();
            if (trim2.length() > 0) {
                if (trim2.equals("none")) {
                    aut = C1686981p.A02;
                } else if (!trim2.equals("currentColor")) {
                    try {
                        aut = A07(trim2);
                    } catch (C22735Auz unused) {
                    }
                } else {
                    aut = C1686881o.A00;
                }
            }
            return new C1686781n(aut, trim);
        } else if (str.equals("none")) {
            return C1686981p.A02;
        } else {
            if (str.equals("currentColor")) {
                return C1686881o.A00;
            }
            try {
                return A07(str);
            } catch (C22735Auz unused2) {
                return null;
            }
        }
    }

    public static C22735Auz A0B() {
        return new C22735Auz("Invalid document. Root element must be <svg>");
    }

    public static String A0F(String str) {
        String substring;
        if (str.equals("none") || !str.startsWith("url(")) {
            return null;
        }
        if (str.endsWith(")")) {
            substring = str.substring(4, str.length() - 1);
        } else {
            substring = str.substring(4);
        }
        return substring.trim();
    }

    public static ArrayList A0G(String str) {
        C200249gy r3 = new C200249gy(str);
        ArrayList arrayList = null;
        do {
            String A0B = r3.A0B();
            if (A0B == null && (A0B = r3.A0C(',', true)) == null) {
                return arrayList;
            }
            if (arrayList == null) {
                arrayList = AnonymousClass001.A0I();
            }
            arrayList.add(A0B);
            r3.A0E();
        } while (!AnonymousClass000.A1S(r3.A01, r3.A00));
        return arrayList;
    }

    public static void A0M(B0V b0v, AnonymousClass825 r2, C203809ou r3, Attributes attributes) {
        r2.A01 = r3.A02;
        r2.A00 = b0v;
        A0N(r2, attributes);
        A0O(r2, attributes);
    }

    public static void A0P(C1685881e r5, String str) {
        C200249gy r4 = new C200249gy(str);
        r4.A0D();
        String A0C = r4.A0C(' ', false);
        if ("defer".equals(A0C)) {
            r4.A0D();
            A0C = r4.A0C(' ', false);
        }
        C188248zH r3 = (C188248zH) AnonymousClass98Z.A00.get(A0C);
        Integer num = null;
        r4.A0D();
        if (!AnonymousClass000.A1S(r4.A01, r4.A00)) {
            String A0C2 = r4.A0C(' ', false);
            if (A0C2.equals("meet")) {
                num = C023109s.A00;
            } else if (A0C2.equals("slice")) {
                num = C023109s.A01;
            } else {
                throw C22735Auz.A00(AnonymousClass000.A0p("Invalid preserveAspectRatio definition: ", str, AnonymousClass000.A0u()));
            }
        }
        r5.A00 = new C199369fC(r3, num);
    }

    private void A0S(String str) {
        AnonymousClass9QD r2;
        AnonymousClass823 r1 = (AnonymousClass823) this.A01;
        int size = r1.A05.size();
        if (size == 0) {
            r2 = null;
        } else {
            r2 = (AnonymousClass9QD) r1.A05.get(size - 1);
        }
        if (r2 instanceof C1686681m) {
            C1686681m r22 = (C1686681m) r2;
            r22.A00 = AnonymousClass000.A0p(r22.A00, str, AnonymousClass000.A0u());
            return;
        }
        this.A01.B0L(new C1686681m(str));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: X.81k} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v12, resolved type: X.81g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v16, resolved type: X.81r} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v9, resolved type: X.81w} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v14, resolved type: X.81c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v16, resolved type: X.81S} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v17, resolved type: X.81R} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v18, resolved type: X.81v} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v41, resolved type: X.820} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: X.81U} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v44, resolved type: X.81X} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v47, resolved type: X.81V} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v8, resolved type: X.81Y} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v73, resolved type: X.81a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v3, resolved type: java.io.BufferedInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v4, resolved type: java.io.BufferedInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v85, resolved type: X.81k} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v86, resolved type: X.81g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v87, resolved type: X.81u} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v89, resolved type: X.81g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v68, resolved type: X.81w} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v69, resolved type: X.81w} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v70, resolved type: X.81w} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v71, resolved type: X.81w} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v72, resolved type: X.81w} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v91, resolved type: X.81Z} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v93, resolved type: X.81k} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v19, resolved type: X.81U} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v20, resolved type: X.81d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v94, resolved type: X.81X} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v95, resolved type: X.81X} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v21, resolved type: X.81U} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v96, resolved type: X.81g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v97, resolved type: X.81k} */
    /* JADX WARNING: type inference failed for: r2v36, types: [X.81t, X.825] */
    /* JADX WARNING: type inference failed for: r2v74, types: [X.Ax8, X.825, X.81b] */
    /* JADX WARNING: type inference failed for: r2v75, types: [X.81f] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x01d2, code lost:
        r10.A06 = true;
        r10.A00 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:261:0x0500, code lost:
        r4 = r4 + r13;
        r3 = r3 + r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:262:0x0502, code lost:
        r6.B51(r1, r14, r4, r3, r2, r32);
        r13 = r2;
        r12 = r32;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:276:0x055f, code lost:
        r3 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:277:0x0561, code lost:
        r13 = r2;
        r12 = r1;
        r6.Bmc(r4, r3, r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:278:0x0566, code lost:
        r7.A0E();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:279:0x0571, code lost:
        if (X.AnonymousClass000.A1S(r7.A01, r7.A00) != false) goto L_0x03e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:280:0x0573, code lost:
        r1 = r7.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:281:0x0577, code lost:
        if (r1 == r7.A00) goto L_0x0591;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:282:0x0579, code lost:
        r1 = r7.A03.charAt(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:283:0x0581, code lost:
        if (r1 < 'a') goto L_0x0584;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:286:0x0586, code lost:
        if (r1 < 'A') goto L_0x0591;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:288:0x058a, code lost:
        if (r1 > 'Z') goto L_0x0591;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:291:0x058f, code lost:
        if (r1 <= 'z') goto L_0x0595;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:293:0x0595, code lost:
        r5 = r7.A09().intValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:376:0x076f, code lost:
        r10.A01.B0L(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:380:0x078a, code lost:
        r4 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:382:0x078f, code lost:
        if (r4 >= r11.getLength()) goto L_0x0802;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:384:0x079b, code lost:
        if (X.AnonymousClass5U2.A00(r11.getLocalName(r4)) != X.AnonymousClass5U2.A04) goto L_0x07ff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:385:0x079d, code lost:
        r12 = new X.C200249gy(r11.getValue(r4));
        r3 = X.AnonymousClass001.A0I();
        r12.A0D();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:387:0x07b5, code lost:
        if (X.AnonymousClass000.A1S(r12.A01, r12.A00) != false) goto L_0x07da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:388:0x07b7, code lost:
        r7 = r12.A04();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:389:0x07c1, code lost:
        if (java.lang.Float.isNaN(r7) != false) goto L_0x0e43;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:390:0x07c3, code lost:
        r12.A0E();
        r1 = r12.A04();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:391:0x07ce, code lost:
        if (java.lang.Float.isNaN(r1) != false) goto L_0x0e33;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:392:0x07d0, code lost:
        r12.A0E();
        X.C165587tf.A1Q(r3, r7);
        X.C165587tf.A1Q(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:393:0x07da, code lost:
        r5.A00 = new float[r3.size()];
        r7 = r3.iterator();
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:395:0x07eb, code lost:
        if (r7.hasNext() == false) goto L_0x07ff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:396:0x07ed, code lost:
        r5.A00[r3] = ((java.lang.Float) r7.next()).floatValue();
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:397:0x07ff, code lost:
        r4 = r4 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:398:0x0802, code lost:
        r10.A01.B0L(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:434:0x08b4, code lost:
        A0M(r0, r2, r10, r11);
        A0J(r2, r11);
        A0L(r2, r11);
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:611:0x0be3, code lost:
        r10.A01.B0L(r3);
        r10.A01 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:647:0x0c99, code lost:
        A0L(r2, r11);
        A0Q(r2, r11);
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:686:0x0d4e, code lost:
        r10.A01.B0L(r2);
        r10.A01 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:690:0x0d62, code lost:
        r10.A01.B0L(r2);
        r10.A01 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:691:0x0d6a, code lost:
        r10.A08 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:725:0x0e33, code lost:
        r1 = X.C22735Auz.A00(X.AnonymousClass000.A0q("> points attribute. There should be an even number of coordinates.", X.C36331k8.A0k("Invalid <", r6)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:726:0x0e43, code lost:
        r1 = X.C22735Auz.A00(X.AnonymousClass000.A0q("> points attribute. Non-coordinate content found in list.", X.C36331k8.A0k("Invalid <", r6)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0168, code lost:
        r0.setLength(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:946:0x0802, code lost:
        r5 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:971:0x09d8, code lost:
        continue;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C200029gS A0T(java.io.InputStream r36) {
        /*
            r35 = this;
            r34 = r36
            java.lang.String r16 = "Exception thrown closing input stream"
            java.lang.String r17 = "SVGParser"
            boolean r0 = r34.markSupported()
            if (r0 != 0) goto L_0x0015
            java.io.BufferedInputStream r1 = new java.io.BufferedInputStream
            r0 = r34
            r1.<init>(r0)
            r34 = r1
        L_0x0015:
            r1 = 3
            r0 = r34
            r0.mark(r1)     // Catch:{ IOException -> 0x003c }
            int r1 = r34.read()     // Catch:{ IOException -> 0x003c }
            int r0 = r34.read()     // Catch:{ IOException -> 0x003c }
            int r0 = r0 << 8
            int r1 = r1 + r0
            r34.reset()     // Catch:{ IOException -> 0x003c }
            r0 = 35615(0x8b1f, float:4.9907E-41)
            if (r1 != r0) goto L_0x003c
            java.util.zip.GZIPInputStream r1 = new java.util.zip.GZIPInputStream     // Catch:{ IOException -> 0x003c }
            r0 = r34
            r1.<init>(r0)     // Catch:{ IOException -> 0x003c }
            java.io.BufferedInputStream r0 = new java.io.BufferedInputStream     // Catch:{ IOException -> 0x003c }
            r0.<init>(r1)     // Catch:{ IOException -> 0x003c }
            r34 = r0
        L_0x003c:
            r1 = 4096(0x1000, float:5.74E-42)
            r0 = r34
            r0.mark(r1)     // Catch:{ all -> 0x0f33 }
            org.xmlpull.v1.XmlPullParser r18 = android.util.Xml.newPullParser()     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            X.Aah r11 = new X.Aah     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            r10 = r35
            r0 = r18
            r11.<init>(r10, r0)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            java.lang.String r1 = "http://xmlpull.org/v1/doc/features.html#process-docdecl"
            r9 = 0
            r0.setFeature(r1, r9)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            java.lang.String r1 = "http://xmlpull.org/v1/doc/features.html#process-namespaces"
            r8 = 1
            r0.setFeature(r1, r8)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            r2 = 0
            r1 = r0
            r0 = r34
            r1.setInput(r0, r2)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            int r2 = r18.getEventType()     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
        L_0x0067:
            if (r2 == r8) goto L_0x0f13
            if (r2 == 0) goto L_0x0dae
            r0 = 8
            if (r2 == r0) goto L_0x0d6d
            r0 = 10
            if (r2 == r0) goto L_0x0dd3
            r4 = 58
            r1 = 2
            if (r2 == r1) goto L_0x0177
            r0 = 3
            if (r2 == r0) goto L_0x00c5
            r0 = 4
            if (r2 == r0) goto L_0x0083
            r0 = 5
            if (r2 != r0) goto L_0x0dd3
            goto L_0x0db6
        L_0x0083:
            int[] r1 = new int[r1]     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            r0 = r18
            char[] r3 = r0.getTextCharacters(r1)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            r2 = r1[r9]     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            r1 = r1[r8]     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            boolean r0 = r10.A06     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            if (r0 != 0) goto L_0x0dd3
            boolean r0 = r10.A07     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            if (r0 == 0) goto L_0x00a6
            java.lang.StringBuilder r0 = r10.A04     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            if (r0 != 0) goto L_0x00a1
            java.lang.StringBuilder r0 = X.C90524aI.A0h(r1)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            r10.A04 = r0     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
        L_0x00a1:
            r0.append(r3, r2, r1)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            goto L_0x0dd3
        L_0x00a6:
            boolean r0 = r10.A08     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            if (r0 == 0) goto L_0x00b5
            java.lang.StringBuilder r0 = r10.A05     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            if (r0 != 0) goto L_0x00a1
            java.lang.StringBuilder r0 = X.C90524aI.A0h(r1)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            r10.A05 = r0     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            goto L_0x00a1
        L_0x00b5:
            X.B0V r0 = r10.A01     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            boolean r0 = r0 instanceof X.AnonymousClass822     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            if (r0 == 0) goto L_0x0dd3
            java.lang.String r0 = new java.lang.String     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            r0.<init>(r3, r2, r1)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            r10.A0S(r0)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            goto L_0x0dd3
        L_0x00c5:
            java.lang.String r2 = r18.getName()     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            java.lang.String r0 = r18.getPrefix()     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            if (r0 == 0) goto L_0x00de
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            java.lang.String r0 = r18.getPrefix()     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            r1.append(r0)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            java.lang.String r2 = X.C90464aC.A0f(r2, r1, r4)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
        L_0x00de:
            java.lang.String r3 = r18.getNamespace()     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            java.lang.String r1 = r18.getName()     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            boolean r0 = r10.A06     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            if (r0 == 0) goto L_0x00f5
            int r0 = r10.A00     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            int r0 = r0 - r8
            r10.A00 = r0     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            if (r0 != 0) goto L_0x00f5
            r10.A06 = r9     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            goto L_0x0dd3
        L_0x00f5:
            java.lang.String r0 = "http://www.w3.org/2000/svg"
            boolean r0 = r0.equals(r3)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            if (r0 != 0) goto L_0x0107
            java.lang.String r0 = ""
            boolean r0 = r0.equals(r3)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            if (r0 != 0) goto L_0x0107
            goto L_0x0dd3
        L_0x0107:
            int r0 = r1.length()     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            if (r0 > 0) goto L_0x010e
            r1 = r2
        L_0x010e:
            X.5Y7 r0 = X.AnonymousClass5Y7.$redex_init_class     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            java.util.Map r0 = X.C188048yx.A00     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            java.lang.Object r0 = r0.get(r1)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            X.8yx r0 = (X.C188048yx) r0     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            if (r0 != 0) goto L_0x011c
            X.8yx r0 = X.C188048yx.A03     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
        L_0x011c:
            int r1 = r0.ordinal()     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            if (r1 == r9) goto L_0x016d
            r0 = 7
            if (r1 == r0) goto L_0x016d
            r0 = 4
            if (r1 == r0) goto L_0x016d
            r0 = 29
            if (r1 == r0) goto L_0x016d
            r0 = 24
            if (r1 == r0) goto L_0x016d
            r0 = 28
            if (r1 == r0) goto L_0x016d
            switch(r1) {
                case 3: goto L_0x016d;
                case 4: goto L_0x0137;
                case 5: goto L_0x0162;
                case 6: goto L_0x0137;
                case 7: goto L_0x0137;
                case 8: goto L_0x016d;
                case 9: goto L_0x0137;
                case 10: goto L_0x016d;
                case 11: goto L_0x016d;
                case 12: goto L_0x016d;
                case 13: goto L_0x0137;
                case 14: goto L_0x016d;
                case 15: goto L_0x0137;
                case 16: goto L_0x0137;
                case 17: goto L_0x016d;
                case 18: goto L_0x0137;
                case 19: goto L_0x016d;
                case 20: goto L_0x016d;
                case 21: goto L_0x0139;
                case 22: goto L_0x016d;
                case 23: goto L_0x016d;
                case 24: goto L_0x0137;
                case 25: goto L_0x016d;
                case 26: goto L_0x0162;
                case 27: goto L_0x0137;
                case 28: goto L_0x0137;
                case 29: goto L_0x0137;
                case 30: goto L_0x016d;
                default: goto L_0x0137;
            }     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
        L_0x0137:
            goto L_0x0dd3
        L_0x0139:
            java.lang.StringBuilder r0 = r10.A05     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            if (r0 == 0) goto L_0x0dd3
            r10.A08 = r9     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            java.lang.String r3 = r0.toString()     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            X.8yR r2 = X.C187728yR.screen     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            java.lang.Integer r0 = X.C023109s.A00     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            X.9nt r1 = new X.9nt     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            r1.<init>(r2, r0)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            X.9gS r2 = r10.A02     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            X.82B r0 = new X.82B     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            r0.<init>(r3)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            r0.A0D()     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            X.9V9 r1 = X.C203389nt.A01(r0, r1)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            X.9V9 r0 = r2.A00     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            r0.A01(r1)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            java.lang.StringBuilder r0 = r10.A05     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            goto L_0x0168
        L_0x0162:
            r10.A07 = r9     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            java.lang.StringBuilder r0 = r10.A04     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            if (r0 == 0) goto L_0x0dd3
        L_0x0168:
            r0.setLength(r9)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            goto L_0x0dd3
        L_0x016d:
            X.B0V r0 = r10.A01     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            X.9QD r0 = (X.AnonymousClass9QD) r0     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            X.B0V r0 = r0.A00     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            r10.A01 = r0     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            goto L_0x0dd3
        L_0x0177:
            java.lang.String r3 = r18.getName()     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            java.lang.String r0 = r18.getPrefix()     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            if (r0 == 0) goto L_0x0190
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            java.lang.String r0 = r18.getPrefix()     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            r1.append(r0)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            java.lang.String r3 = X.C90464aC.A0f(r3, r1, r4)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
        L_0x0190:
            java.lang.String r2 = r18.getNamespace()     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            java.lang.String r1 = r18.getName()     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            boolean r0 = r10.A06     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            if (r0 == 0) goto L_0x01a4
            int r0 = r10.A00     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            int r0 = r0 + 1
            r10.A00 = r0     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            goto L_0x0dd3
        L_0x01a4:
            java.lang.String r0 = "http://www.w3.org/2000/svg"
            boolean r0 = r0.equals(r2)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            if (r0 != 0) goto L_0x01b6
            java.lang.String r0 = ""
            boolean r0 = r0.equals(r2)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            if (r0 != 0) goto L_0x01b6
            goto L_0x0dd3
        L_0x01b6:
            int r0 = r1.length()     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            if (r0 > 0) goto L_0x01bd
            r1 = r3
        L_0x01bd:
            java.util.Map r0 = X.C188048yx.A00     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            java.lang.Object r1 = r0.get(r1)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            X.8yx r1 = (X.C188048yx) r1     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            if (r1 != 0) goto L_0x01c9
            X.8yx r1 = X.C188048yx.A03     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
        L_0x01c9:
            X.5Y7 r0 = X.AnonymousClass5Y7.$redex_init_class     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            int r0 = r1.ordinal()     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            switch(r0) {
                case 0: goto L_0x022e;
                case 1: goto L_0x02b8;
                case 2: goto L_0x066f;
                case 3: goto L_0x0a68;
                case 4: goto L_0x02c3;
                case 5: goto L_0x0228;
                case 6: goto L_0x06bd;
                case 7: goto L_0x02b8;
                case 8: goto L_0x0bec;
                case 9: goto L_0x072c;
                case 10: goto L_0x0967;
                case 11: goto L_0x08cd;
                case 12: goto L_0x0ca1;
                case 13: goto L_0x0366;
                case 14: goto L_0x0b0f;
                case 15: goto L_0x0776;
                case 16: goto L_0x05ab;
                case 17: goto L_0x09a7;
                case 18: goto L_0x05c1;
                case 19: goto L_0x0d56;
                case 20: goto L_0x0a09;
                case 21: goto L_0x01d8;
                case 22: goto L_0x08ab;
                case 23: goto L_0x08bf;
                case 24: goto L_0x0809;
                case 25: goto L_0x0aab;
                case 26: goto L_0x0228;
                case 27: goto L_0x0850;
                case 28: goto L_0x0820;
                case 29: goto L_0x02d4;
                case 30: goto L_0x0c87;
                default: goto L_0x01d2;
            }     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
        L_0x01d2:
            r10.A06 = r8     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            r10.A00 = r8     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            goto L_0x0dd3
        L_0x01d8:
            r5 = 0
            X.B0V r0 = r10.A01     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            if (r0 == 0) goto L_0x0f09
            java.lang.String r4 = "all"
            r3 = 1
        L_0x01e0:
            int r0 = r11.getLength()     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            if (r5 >= r0) goto L_0x0202
            java.lang.String r2 = A0E(r11, r5)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            int r1 = A04(r11, r5)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            r0 = 77
            if (r1 == r0) goto L_0x01f3
            goto L_0x01fa
        L_0x01f3:
            java.lang.String r0 = "text/css"
            boolean r3 = r2.equals(r0)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            goto L_0x01ff
        L_0x01fa:
            r0 = 38
            if (r1 != r0) goto L_0x01ff
            r4 = r2
        L_0x01ff:
            int r5 = r5 + 1
            goto L_0x01e0
        L_0x0202:
            if (r3 == 0) goto L_0x01d2
            X.8yR r3 = X.C187728yR.screen     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            X.82B r0 = new X.82B     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            r0.<init>(r4)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            r0.A0D()     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            java.util.ArrayList r0 = X.C203389nt.A02(r0)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            java.util.Iterator r2 = r0.iterator()     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
        L_0x0216:
            boolean r0 = r2.hasNext()     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            if (r0 == 0) goto L_0x01d2
            java.lang.Object r1 = r2.next()     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            X.8yR r0 = X.C187728yR.all     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            if (r1 == r0) goto L_0x0d6a
            if (r1 != r3) goto L_0x0216
            goto L_0x0d6a
        L_0x0228:
            r10.A07 = r8     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            r10.A03 = r1     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            goto L_0x0dd3
        L_0x022e:
            X.81s r2 = new X.81s     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            r2.<init>()     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            X.9gS r0 = r10.A02     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            r2.A01 = r0     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            X.B0V r0 = r10.A01     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            r2.A00 = r0     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            A0N(r2, r11)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            A0O(r2, r11)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            A0L(r2, r11)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            A0Q(r2, r11)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            r3 = 0
        L_0x0248:
            int r0 = r11.getLength()     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            if (r3 >= r0) goto L_0x02a8
            java.lang.String r4 = A0E(r11, r3)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            int r1 = A04(r11, r3)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            r0 = 82
            if (r1 == r0) goto L_0x029f
            r0 = 83
            if (r1 == r0) goto L_0x0298
            r0 = 81
            if (r1 == r0) goto L_0x027f
            r0 = 25
            if (r1 != r0) goto L_0x02a5
            X.AUX r0 = A09(r4)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            r2.A00 = r0     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            float r1 = r0.A01     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            boolean r0 = X.C36431kI.A1P(r0)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            if (r0 == 0) goto L_0x02a5
            java.lang.String r0 = "Invalid <svg> element. height cannot be negative"
            X.Auz r1 = X.C22735Auz.A00(r0)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            goto L_0x0f12
        L_0x027f:
            X.AUX r0 = A09(r4)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            r2.A01 = r0     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            float r1 = r0.A01     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            boolean r0 = X.C36431kI.A1P(r0)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            if (r0 == 0) goto L_0x02a5
            java.lang.String r0 = "Invalid <svg> element. width cannot be negative"
            X.Auz r1 = X.C22735Auz.A00(r0)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            goto L_0x0f12
        L_0x0298:
            X.AUX r0 = A09(r4)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            r2.A03 = r0     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            goto L_0x02a5
        L_0x029f:
            X.AUX r0 = A09(r4)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            r2.A02 = r0     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
        L_0x02a5:
            int r3 = r3 + 1
            goto L_0x0248
        L_0x02a8:
            X.B0V r0 = r10.A01     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            if (r0 != 0) goto L_0x02b4
            X.9gS r0 = r10.A02     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            r0.A01 = r2     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
        L_0x02b0:
            r10.A01 = r2     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            goto L_0x0dd3
        L_0x02b4:
            r0.B0L(r2)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            goto L_0x02b0
        L_0x02b8:
            X.B0V r0 = r10.A01     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            if (r0 == 0) goto L_0x0df6
            X.81f r2 = new X.81f     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            r2.<init>()     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            goto L_0x08b4
        L_0x02c3:
            X.B0V r0 = r10.A01     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            if (r0 == 0) goto L_0x0dfc
            X.81b r2 = new X.81b     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            r2.<init>()     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            A0M(r0, r2, r10, r11)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            r10.A0J(r2, r11)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            goto L_0x0d62
        L_0x02d4:
            X.B0V r0 = r10.A01     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            if (r0 == 0) goto L_0x0e02
            X.81a r2 = new X.81a     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            r2.<init>()     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            A0M(r0, r2, r10, r11)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            r10.A0J(r2, r11)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            A0L(r2, r11)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            r3 = 0
        L_0x02e7:
            int r0 = r11.getLength()     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            if (r3 >= r0) goto L_0x0d4e
            java.lang.String r4 = A0E(r11, r3)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            int r1 = A04(r11, r3)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            r0 = 82
            if (r1 == r0) goto L_0x035d
            r0 = 83
            if (r1 == r0) goto L_0x0356
            r0 = 81
            if (r1 == r0) goto L_0x033d
            r0 = 25
            if (r1 == r0) goto L_0x0324
            r0 = 26
            if (r1 != r0) goto L_0x0363
            java.lang.String r1 = r11.getURI(r3)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            java.lang.String r0 = ""
            boolean r0 = r0.equals(r1)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            if (r0 != 0) goto L_0x0321
            java.lang.String r1 = r11.getURI(r3)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            java.lang.String r0 = "http://www.w3.org/1999/xlink"
            boolean r0 = r0.equals(r1)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            if (r0 == 0) goto L_0x0363
        L_0x0321:
            r2.A04 = r4     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            goto L_0x0363
        L_0x0324:
            X.AUX r0 = A09(r4)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            r2.A00 = r0     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            float r1 = r0.A01     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            boolean r0 = X.C36431kI.A1P(r0)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            if (r0 == 0) goto L_0x0363
            java.lang.String r0 = "Invalid <use> element. height cannot be negative"
            X.Auz r1 = X.C22735Auz.A00(r0)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            goto L_0x0f12
        L_0x033d:
            X.AUX r0 = A09(r4)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            r2.A01 = r0     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            float r1 = r0.A01     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            boolean r0 = X.C36431kI.A1P(r0)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            if (r0 == 0) goto L_0x0363
            java.lang.String r0 = "Invalid <use> element. width cannot be negative"
            X.Auz r1 = X.C22735Auz.A00(r0)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            goto L_0x0f12
        L_0x0356:
            X.AUX r0 = A09(r4)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            r2.A03 = r0     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            goto L_0x0363
        L_0x035d:
            X.AUX r0 = A09(r4)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            r2.A02 = r0     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
        L_0x0363:
            int r3 = r3 + 1
            goto L_0x02e7
        L_0x0366:
            X.B0V r1 = r10.A01     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            if (r1 == 0) goto L_0x0e0f
            X.81T r25 = new X.81T     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            r25.<init>()     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            r0 = r25
            A0M(r1, r0, r10, r11)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            r10.A0J(r0, r11)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            A0L(r0, r11)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            r15 = 0
        L_0x037b:
            int r0 = r11.getLength()     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            if (r15 >= r0) goto L_0x05a2
            java.lang.String r2 = A0E(r11, r15)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            int r1 = A04(r11, r15)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            r0 = 13
            if (r1 == r0) goto L_0x03a8
            r0 = 43
            if (r1 != r0) goto L_0x059e
            int r0 = r2.length()     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            if (r0 == 0) goto L_0x0e08
            float r1 = A01(r2, r0)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x059e
            java.lang.String r0 = "Invalid <path> element. pathLength cannot be negative"
            X.Auz r1 = X.C22735Auz.A00(r0)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            goto L_0x0f12
        L_0x03a8:
            X.9gy r7 = new X.9gy     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            r7.<init>(r2)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            X.9yr r6 = new X.9yr     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            r6.<init>()     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            int r1 = r7.A01     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            int r0 = r7.A00     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            boolean r0 = X.AnonymousClass000.A1S(r1, r0)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            if (r0 != 0) goto L_0x03e3
            java.lang.Integer r0 = r7.A09()     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            int r5 = r0.intValue()     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            r0 = 77
            r1 = 109(0x6d, float:1.53E-43)
            if (r5 == r0) goto L_0x03cd
            if (r5 == r1) goto L_0x03cd
            goto L_0x03e3
        L_0x03cd:
            r13 = 0
            r4 = 0
            r12 = 0
            r3 = 0
            r24 = 0
            r23 = 0
        L_0x03d5:
            r7.A0D()     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            r0 = 108(0x6c, float:1.51E-43)
            r14 = 1073741824(0x40000000, float:2.0)
            java.lang.String r22 = " path segment"
            java.lang.String r21 = "Bad path coords for "
            switch(r5) {
                case 65: goto L_0x0412;
                case 67: goto L_0x03e9;
                case 72: goto L_0x046a;
                case 76: goto L_0x047f;
                case 77: goto L_0x0498;
                case 81: goto L_0x04be;
                case 83: goto L_0x04de;
                case 84: goto L_0x0515;
                case 86: goto L_0x0531;
                case 90: goto L_0x0557;
                case 97: goto L_0x0412;
                case 99: goto L_0x03e9;
                case 104: goto L_0x046a;
                case 108: goto L_0x047f;
                case 109: goto L_0x0498;
                case 113: goto L_0x04be;
                case 115: goto L_0x04de;
                case 116: goto L_0x0515;
                case 118: goto L_0x0531;
                case 122: goto L_0x0557;
                default: goto L_0x03e3;
            }     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
        L_0x03e3:
            r0 = r25
            r0.A00 = r6     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            goto L_0x059e
        L_0x03e9:
            float r1 = r7.A04()     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            float r14 = r7.A05(r1)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            float r4 = r7.A05(r14)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            float r3 = r7.A05(r4)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            float r2 = r7.A05(r3)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            float r32 = r7.A05(r2)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            boolean r0 = java.lang.Float.isNaN(r32)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            if (r0 != 0) goto L_0x0545
            r0 = 99
            if (r5 != r0) goto L_0x0502
            float r2 = r2 + r13
            float r32 = r32 + r12
            float r1 = r1 + r13
            float r14 = r14 + r12
            goto L_0x0500
        L_0x0412:
            float r1 = r7.A04()     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            float r0 = r7.A05(r1)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            float r29 = r7.A05(r0)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            java.lang.Float r2 = java.lang.Float.valueOf(r29)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            java.lang.Boolean r20 = r7.A08(r2)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            r2 = r20
            java.lang.Boolean r19 = r7.A08(r2)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            if (r19 != 0) goto L_0x0431
            r4 = 2143289344(0x7fc00000, float:NaN)
            goto L_0x0438
        L_0x0431:
            r7.A0E()     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            float r4 = r7.A04()     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
        L_0x0438:
            float r3 = r7.A05(r4)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            boolean r2 = java.lang.Float.isNaN(r3)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            if (r2 != 0) goto L_0x0545
            r14 = 0
            int r2 = (r1 > r14 ? 1 : (r1 == r14 ? 0 : -1))
            if (r2 < 0) goto L_0x0545
            int r2 = (r0 > r14 ? 1 : (r0 == r14 ? 0 : -1))
            if (r2 < 0) goto L_0x0545
            r2 = 97
            if (r5 != r2) goto L_0x0451
            float r4 = r4 + r13
            float r3 = r3 + r12
        L_0x0451:
            boolean r32 = r20.booleanValue()     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            boolean r33 = r19.booleanValue()     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            r26 = r6
            r27 = r1
            r28 = r0
            r30 = r4
            r31 = r3
            r26.B1N(r27, r28, r29, r30, r31, r32, r33)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            r13 = r4
            r12 = r3
            goto L_0x0566
        L_0x046a:
            float r4 = r7.A04()     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            boolean r0 = java.lang.Float.isNaN(r4)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            if (r0 != 0) goto L_0x0545
            r0 = 104(0x68, float:1.46E-43)
            if (r5 != r0) goto L_0x0479
            float r4 = r4 + r13
        L_0x0479:
            r13 = r4
            r6.BOB(r4, r12)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            goto L_0x0566
        L_0x047f:
            float r4 = r7.A04()     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            float r1 = r7.A05(r4)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            boolean r2 = java.lang.Float.isNaN(r1)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            if (r2 != 0) goto L_0x0545
            if (r5 != r0) goto L_0x0491
            float r4 = r4 + r13
            float r1 = r1 + r12
        L_0x0491:
            r13 = r4
            r12 = r1
            r6.BOB(r4, r1)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            goto L_0x055f
        L_0x0498:
            float r4 = r7.A04()     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            float r3 = r7.A05(r4)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            boolean r2 = java.lang.Float.isNaN(r3)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            if (r2 != 0) goto L_0x0545
            if (r5 != r1) goto L_0x04ae
            int r2 = r6.A00     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            if (r2 == 0) goto L_0x04ae
            float r4 = r4 + r13
            float r3 = r3 + r12
        L_0x04ae:
            r13 = r4
            r12 = r3
            r6.BPz(r4, r3)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            if (r5 == r1) goto L_0x04b7
            r0 = 76
        L_0x04b7:
            r24 = r4
            r23 = r3
            r5 = r0
            goto L_0x0566
        L_0x04be:
            float r4 = r7.A04()     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            float r3 = r7.A05(r4)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            float r2 = r7.A05(r3)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            float r1 = r7.A05(r2)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            boolean r0 = java.lang.Float.isNaN(r1)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            if (r0 != 0) goto L_0x0545
            r0 = 113(0x71, float:1.58E-43)
            if (r5 != r0) goto L_0x0561
            float r2 = r2 + r13
            float r1 = r1 + r12
            float r4 = r4 + r13
            float r3 = r3 + r12
            goto L_0x0561
        L_0x04de:
            float r1 = r13 * r14
            float r1 = r1 - r4
            float r14 = r14 * r12
            float r14 = r14 - r3
            float r4 = r7.A04()     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            float r3 = r7.A05(r4)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            float r2 = r7.A05(r3)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            float r32 = r7.A05(r2)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            boolean r0 = java.lang.Float.isNaN(r32)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            if (r0 != 0) goto L_0x0545
            r0 = 115(0x73, float:1.61E-43)
            if (r5 != r0) goto L_0x0502
            float r2 = r2 + r13
            float r32 = r32 + r12
        L_0x0500:
            float r4 = r4 + r13
            float r3 = r3 + r12
        L_0x0502:
            r26 = r6
            r27 = r1
            r28 = r14
            r29 = r4
            r30 = r3
            r31 = r2
            r26.B51(r27, r28, r29, r30, r31, r32)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            r13 = r2
            r12 = r32
            goto L_0x0566
        L_0x0515:
            float r0 = r13 * r14
            float r4 = r0 - r4
            float r14 = r14 * r12
            float r3 = r14 - r3
            float r2 = r7.A04()     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            float r1 = r7.A05(r2)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            boolean r0 = java.lang.Float.isNaN(r1)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            if (r0 != 0) goto L_0x0545
            r0 = 116(0x74, float:1.63E-43)
            if (r5 != r0) goto L_0x0561
            float r2 = r2 + r13
            float r1 = r1 + r12
            goto L_0x0561
        L_0x0531:
            float r1 = r7.A04()     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            boolean r0 = java.lang.Float.isNaN(r1)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            if (r0 != 0) goto L_0x0545
            r0 = 118(0x76, float:1.65E-43)
            if (r5 != r0) goto L_0x0540
            float r1 = r1 + r12
        L_0x0540:
            r12 = r1
            r6.BOB(r13, r1)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            goto L_0x055f
        L_0x0545:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0v(r21)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            char r1 = (char) r5     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            r0 = r22
            java.lang.String r1 = X.C90464aC.A0f(r0, r2, r1)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            r0 = r17
            android.util.Log.e(r0, r1)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            goto L_0x03e3
        L_0x0557:
            r6.close()     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            r13 = r24
            r4 = r13
            r12 = r23
        L_0x055f:
            r3 = r12
            goto L_0x0566
        L_0x0561:
            r13 = r2
            r12 = r1
            r6.Bmc(r4, r3, r2, r1)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
        L_0x0566:
            r7.A0E()     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            int r1 = r7.A01     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            int r0 = r7.A00     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            boolean r0 = X.AnonymousClass000.A1S(r1, r0)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            if (r0 != 0) goto L_0x03e3
            int r1 = r7.A01     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            int r0 = r7.A00     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            if (r1 == r0) goto L_0x0591
            java.lang.String r0 = r7.A03     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            char r1 = r0.charAt(r1)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            r0 = 97
            if (r1 < r0) goto L_0x0584
            goto L_0x058d
        L_0x0584:
            r0 = 65
            if (r1 < r0) goto L_0x0591
            r0 = 90
            if (r1 > r0) goto L_0x0591
            goto L_0x0595
        L_0x058d:
            r0 = 122(0x7a, float:1.71E-43)
            if (r1 <= r0) goto L_0x0595
        L_0x0591:
            r1 = 109(0x6d, float:1.53E-43)
            goto L_0x03d5
        L_0x0595:
            java.lang.Integer r0 = r7.A09()     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            int r5 = r0.intValue()     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            goto L_0x0591
        L_0x059e:
            int r15 = r15 + 1
            goto L_0x037b
        L_0x05a2:
            X.B0V r1 = r10.A01     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            r0 = r25
            r1.B0L(r0)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            goto L_0x0dd3
        L_0x05ab:
            X.B0V r0 = r10.A01     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            if (r0 == 0) goto L_0x0e15
            X.81U r5 = new X.81U     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            r5.<init>()     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            A0M(r0, r5, r10, r11)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            r10.A0J(r5, r11)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            A0L(r5, r11)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            java.lang.String r6 = "polyline"
            goto L_0x078a
        L_0x05c1:
            X.B0V r0 = r10.A01     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            if (r0 == 0) goto L_0x0e1b
            X.81Y r5 = new X.81Y     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            r5.<init>()     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            A0M(r0, r5, r10, r11)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            r10.A0J(r5, r11)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            A0L(r5, r11)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            r2 = 0
        L_0x05d4:
            int r0 = r11.getLength()     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            if (r2 >= r0) goto L_0x0802
            java.lang.String r3 = A0E(r11, r2)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            int r1 = A04(r11, r2)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            r0 = 82
            if (r1 == r0) goto L_0x0665
            r0 = 83
            if (r1 == r0) goto L_0x065e
            r0 = 81
            if (r1 == r0) goto L_0x0645
            r0 = 25
            if (r1 == r0) goto L_0x062c
            r0 = 56
            if (r1 == r0) goto L_0x0613
            r0 = 57
            if (r1 != r0) goto L_0x066b
            X.AUX r0 = A09(r3)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            r5.A02 = r0     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            float r1 = r0.A01     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            boolean r0 = X.C36431kI.A1P(r0)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            if (r0 == 0) goto L_0x066b
            java.lang.String r0 = "Invalid <rect> element. ry cannot be negative"
            X.Auz r1 = X.C22735Auz.A00(r0)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            goto L_0x0f12
        L_0x0613:
            X.AUX r0 = A09(r3)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            r5.A01 = r0     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            float r1 = r0.A01     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            boolean r0 = X.C36431kI.A1P(r0)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            if (r0 == 0) goto L_0x066b
            java.lang.String r0 = "Invalid <rect> element. rx cannot be negative"
            X.Auz r1 = X.C22735Auz.A00(r0)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            goto L_0x0f12
        L_0x062c:
            X.AUX r0 = A09(r3)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            r5.A00 = r0     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            float r1 = r0.A01     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            boolean r0 = X.C36431kI.A1P(r0)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            if (r0 == 0) goto L_0x066b
            java.lang.String r0 = "Invalid <rect> element. height cannot be negative"
            X.Auz r1 = X.C22735Auz.A00(r0)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            goto L_0x0f12
        L_0x0645:
            X.AUX r0 = A09(r3)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            r5.A03 = r0     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            float r1 = r0.A01     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            boolean r0 = X.C36431kI.A1P(r0)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            if (r0 == 0) goto L_0x066b
            java.lang.String r0 = "Invalid <rect> element. width cannot be negative"
            X.Auz r1 = X.C22735Auz.A00(r0)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            goto L_0x0f12
        L_0x065e:
            X.AUX r0 = A09(r3)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            r5.A05 = r0     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            goto L_0x066b
        L_0x0665:
            X.AUX r0 = A09(r3)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            r5.A04 = r0     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
        L_0x066b:
            int r2 = r2 + 1
            goto L_0x05d4
        L_0x066f:
            X.B0V r0 = r10.A01     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            if (r0 == 0) goto L_0x0e21
            X.81V r2 = new X.81V     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            r2.<init>()     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            A0M(r0, r2, r10, r11)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            r10.A0J(r2, r11)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            A0L(r2, r11)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            r3 = 0
        L_0x0682:
            int r0 = r11.getLength()     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            if (r3 >= r0) goto L_0x076f
            java.lang.String r1 = A0E(r11, r3)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            int r0 = A04(r11, r3)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            switch(r0) {
                case 6: goto L_0x06b4;
                case 7: goto L_0x06ad;
                case 49: goto L_0x0694;
                default: goto L_0x0693;
            }     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
        L_0x0693:
            goto L_0x06ba
        L_0x0694:
            X.AUX r0 = A09(r1)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            r2.A02 = r0     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            float r1 = r0.A01     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            boolean r0 = X.C36431kI.A1P(r0)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            if (r0 == 0) goto L_0x06ba
            java.lang.String r0 = "Invalid <circle> element. r cannot be negative"
            X.Auz r1 = X.C22735Auz.A00(r0)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            goto L_0x0f12
        L_0x06ad:
            X.AUX r0 = A09(r1)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            r2.A01 = r0     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            goto L_0x06ba
        L_0x06b4:
            X.AUX r0 = A09(r1)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            r2.A00 = r0     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
        L_0x06ba:
            int r3 = r3 + 1
            goto L_0x0682
        L_0x06bd:
            X.B0V r0 = r10.A01     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            if (r0 == 0) goto L_0x0e27
            X.81W r2 = new X.81W     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            r2.<init>()     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            A0M(r0, r2, r10, r11)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            r10.A0J(r2, r11)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            A0L(r2, r11)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            r3 = 0
        L_0x06d0:
            int r0 = r11.getLength()     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            if (r3 >= r0) goto L_0x0725
            java.lang.String r1 = A0E(r11, r3)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            int r0 = A04(r11, r3)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            switch(r0) {
                case 6: goto L_0x06e9;
                case 7: goto L_0x06e2;
                case 56: goto L_0x0709;
                case 57: goto L_0x06f0;
                default: goto L_0x06e1;
            }     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
        L_0x06e1:
            goto L_0x0722
        L_0x06e2:
            X.AUX r0 = A09(r1)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            r2.A01 = r0     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            goto L_0x0722
        L_0x06e9:
            X.AUX r0 = A09(r1)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            r2.A00 = r0     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            goto L_0x0722
        L_0x06f0:
            X.AUX r0 = A09(r1)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            r2.A03 = r0     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            float r1 = r0.A01     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            boolean r0 = X.C36431kI.A1P(r0)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            if (r0 == 0) goto L_0x0722
            java.lang.String r0 = "Invalid <ellipse> element. ry cannot be negative"
            X.Auz r1 = X.C22735Auz.A00(r0)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            goto L_0x0f12
        L_0x0709:
            X.AUX r0 = A09(r1)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            r2.A02 = r0     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            float r1 = r0.A01     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            boolean r0 = X.C36431kI.A1P(r0)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            if (r0 == 0) goto L_0x0722
            java.lang.String r0 = "Invalid <ellipse> element. rx cannot be negative"
            X.Auz r1 = X.C22735Auz.A00(r0)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            goto L_0x0f12
        L_0x0722:
            int r3 = r3 + 1
            goto L_0x06d0
        L_0x0725:
            X.B0V r0 = r10.A01     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            r0.B0L(r2)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            goto L_0x0dd3
        L_0x072c:
            X.B0V r0 = r10.A01     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            if (r0 == 0) goto L_0x0e2d
            X.81X r2 = new X.81X     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            r2.<init>()     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            A0M(r0, r2, r10, r11)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            r10.A0J(r2, r11)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            A0L(r2, r11)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            r3 = 0
        L_0x073f:
            int r0 = r11.getLength()     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            if (r3 >= r0) goto L_0x076f
            java.lang.String r1 = A0E(r11, r3)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            int r0 = A04(r11, r3)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            switch(r0) {
                case 84: goto L_0x0766;
                case 85: goto L_0x075f;
                case 86: goto L_0x0758;
                case 87: goto L_0x0751;
                default: goto L_0x0750;
            }     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
        L_0x0750:
            goto L_0x076c
        L_0x0751:
            X.AUX r0 = A09(r1)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            r2.A03 = r0     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            goto L_0x076c
        L_0x0758:
            X.AUX r0 = A09(r1)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            r2.A01 = r0     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            goto L_0x076c
        L_0x075f:
            X.AUX r0 = A09(r1)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            r2.A02 = r0     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            goto L_0x076c
        L_0x0766:
            X.AUX r0 = A09(r1)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            r2.A00 = r0     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
        L_0x076c:
            int r3 = r3 + 1
            goto L_0x073f
        L_0x076f:
            X.B0V r0 = r10.A01     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            r0.B0L(r2)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            goto L_0x0dd3
        L_0x0776:
            X.B0V r0 = r10.A01     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            if (r0 == 0) goto L_0x0e53
            X.81d r5 = new X.81d     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            r5.<init>()     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            A0M(r0, r5, r10, r11)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            r10.A0J(r5, r11)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            A0L(r5, r11)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            java.lang.String r6 = "polygon"
        L_0x078a:
            r4 = 0
        L_0x078b:
            int r0 = r11.getLength()     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            if (r4 >= r0) goto L_0x0802
            java.lang.String r0 = r11.getLocalName(r4)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            X.5U2 r1 = X.AnonymousClass5U2.A00(r0)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            X.5U2 r0 = X.AnonymousClass5U2.A04     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            if (r1 != r0) goto L_0x07ff
            java.lang.String r0 = r11.getValue((int) r4)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            X.9gy r12 = new X.9gy     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            r12.<init>(r0)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            java.util.ArrayList r3 = X.AnonymousClass001.A0I()     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            r12.A0D()     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
        L_0x07ad:
            int r1 = r12.A01     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            int r0 = r12.A00     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            boolean r0 = X.AnonymousClass000.A1S(r1, r0)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            if (r0 != 0) goto L_0x07da
            float r7 = r12.A04()     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            boolean r0 = java.lang.Float.isNaN(r7)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            java.lang.String r2 = "Invalid <"
            if (r0 != 0) goto L_0x0e43
            r12.A0E()     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            float r1 = r12.A04()     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            boolean r0 = java.lang.Float.isNaN(r1)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            if (r0 != 0) goto L_0x0e33
            r12.A0E()     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            X.C165587tf.A1Q(r3, r7)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            X.C165587tf.A1Q(r3, r1)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            goto L_0x07ad
        L_0x07da:
            int r0 = r3.size()     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            float[] r0 = new float[r0]     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            r5.A00 = r0     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            java.util.Iterator r7 = r3.iterator()     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            r3 = 0
        L_0x07e7:
            boolean r0 = r7.hasNext()     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            if (r0 == 0) goto L_0x07ff
            java.lang.Object r0 = r7.next()     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            java.lang.Float r0 = (java.lang.Float) r0     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            float r2 = r0.floatValue()     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            float[] r1 = r5.A00     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            int r0 = r3 + 1
            r1[r3] = r2     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            r3 = r0
            goto L_0x07e7
        L_0x07ff:
            int r4 = r4 + 1
            goto L_0x078b
        L_0x0802:
            X.B0V r0 = r10.A01     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            r0.B0L(r5)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            goto L_0x0dd3
        L_0x0809:
            X.B0V r0 = r10.A01     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            if (r0 == 0) goto L_0x0e59
            X.820 r2 = new X.820     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            r2.<init>()     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            A0M(r0, r2, r10, r11)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            r10.A0J(r2, r11)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            A0L(r2, r11)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            A0R(r2, r11)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            goto L_0x0d62
        L_0x0820:
            X.B0V r1 = r10.A01     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            if (r1 == 0) goto L_0x0e67
            boolean r0 = r1 instanceof X.AnonymousClass822     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            if (r0 == 0) goto L_0x0e5f
            X.821 r2 = new X.821     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            r2.<init>()     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            A0M(r1, r2, r10, r11)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            A0L(r2, r11)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            A0R(r2, r11)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            X.B0V r0 = r10.A01     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            r0.B0L(r2)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            r10.A01 = r2     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            X.B0V r1 = r2.A00     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            boolean r0 = r1 instanceof X.C15860o6     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            if (r0 == 0) goto L_0x0849
            X.0o6 r1 = (X.C15860o6) r1     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
        L_0x0845:
            r2.A00 = r1     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            goto L_0x0dd3
        L_0x0849:
            X.Ax9 r1 = (X.Ax9) r1     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            X.0o6 r1 = r1.BIG()     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            goto L_0x0845
        L_0x0850:
            X.B0V r1 = r10.A01     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            if (r1 == 0) goto L_0x0e75
            boolean r0 = r1 instanceof X.AnonymousClass822     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            if (r0 == 0) goto L_0x0e6d
            X.81y r2 = new X.81y     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            r2.<init>()     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            A0M(r1, r2, r10, r11)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            A0L(r2, r11)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            r4 = 0
        L_0x0864:
            int r0 = r11.getLength()     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            if (r4 >= r0) goto L_0x0893
            java.lang.String r3 = A0E(r11, r4)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            int r1 = A04(r11, r4)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            r0 = 26
            if (r1 != r0) goto L_0x0890
            java.lang.String r1 = r11.getURI(r4)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            java.lang.String r0 = ""
            boolean r0 = r0.equals(r1)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            if (r0 != 0) goto L_0x088e
            java.lang.String r1 = r11.getURI(r4)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            java.lang.String r0 = "http://www.w3.org/1999/xlink"
            boolean r0 = r0.equals(r1)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            if (r0 == 0) goto L_0x0890
        L_0x088e:
            r2.A01 = r3     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
        L_0x0890:
            int r4 = r4 + 1
            goto L_0x0864
        L_0x0893:
            X.B0V r0 = r10.A01     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            r0.B0L(r2)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            X.B0V r1 = r2.A00     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            boolean r0 = r1 instanceof X.C15860o6     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            if (r0 == 0) goto L_0x08a4
            X.0o6 r1 = (X.C15860o6) r1     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
        L_0x08a0:
            r2.A00 = r1     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            goto L_0x0dd3
        L_0x08a4:
            X.Ax9 r1 = (X.Ax9) r1     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            X.0o6 r1 = r1.BIG()     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            goto L_0x08a0
        L_0x08ab:
            X.B0V r0 = r10.A01     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            if (r0 == 0) goto L_0x0e7b
            X.81Z r2 = new X.81Z     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            r2.<init>()     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
        L_0x08b4:
            A0M(r0, r2, r10, r11)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            r10.A0J(r2, r11)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            A0L(r2, r11)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            goto L_0x0d62
        L_0x08bf:
            X.B0V r0 = r10.A01     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            if (r0 == 0) goto L_0x0e81
            X.81t r2 = new X.81t     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            r2.<init>()     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            A0M(r0, r2, r10, r11)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            goto L_0x0c99
        L_0x08cd:
            X.B0V r0 = r10.A01     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            if (r0 == 0) goto L_0x0e95
            X.81v r3 = new X.81v     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            r3.<init>()     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            A0M(r0, r3, r10, r11)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            A0L(r3, r11)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            A0Q(r3, r11)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            r2 = 0
        L_0x08e0:
            int r0 = r11.getLength()     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            if (r2 >= r0) goto L_0x0be3
            java.lang.String r1 = A0E(r11, r2)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            int r0 = A04(r11, r2)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            switch(r0) {
                case 32: goto L_0x0924;
                case 33: goto L_0x090e;
                case 34: goto L_0x093d;
                case 41: goto L_0x08f2;
                case 50: goto L_0x095d;
                case 51: goto L_0x0956;
                default: goto L_0x08f1;
            }     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
        L_0x08f1:
            goto L_0x0963
        L_0x08f2:
            java.lang.String r0 = "auto"
            boolean r0 = r0.equals(r1)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            if (r0 == 0) goto L_0x08fd
            r0 = 2143289344(0x7fc00000, float:NaN)
            goto L_0x0907
        L_0x08fd:
            int r0 = r1.length()     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            if (r0 == 0) goto L_0x0e87
            float r0 = A01(r1, r0)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
        L_0x0907:
            java.lang.Float r0 = java.lang.Float.valueOf(r0)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            r3.A04 = r0     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            goto L_0x0963
        L_0x090e:
            java.lang.String r0 = "strokeWidth"
            boolean r0 = r0.equals(r1)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            if (r0 == 0) goto L_0x0919
            r3.A05 = r9     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            goto L_0x0963
        L_0x0919:
            java.lang.String r0 = "userSpaceOnUse"
            boolean r0 = r0.equals(r1)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            if (r0 == 0) goto L_0x0e8e
            r3.A05 = r8     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            goto L_0x0963
        L_0x0924:
            X.AUX r0 = A09(r1)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            r3.A00 = r0     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            float r1 = r0.A01     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            boolean r0 = X.C36431kI.A1P(r0)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            if (r0 == 0) goto L_0x0963
            java.lang.String r0 = "Invalid <marker> element. markerHeight cannot be negative"
            X.Auz r1 = X.C22735Auz.A00(r0)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            goto L_0x0f12
        L_0x093d:
            X.AUX r0 = A09(r1)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            r3.A01 = r0     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            float r1 = r0.A01     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            boolean r0 = X.C36431kI.A1P(r0)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            if (r0 == 0) goto L_0x0963
            java.lang.String r0 = "Invalid <marker> element. markerWidth cannot be negative"
            X.Auz r1 = X.C22735Auz.A00(r0)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            goto L_0x0f12
        L_0x0956:
            X.AUX r0 = A09(r1)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            r3.A03 = r0     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            goto L_0x0963
        L_0x095d:
            X.AUX r0 = A09(r1)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            r3.A02 = r0     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
        L_0x0963:
            int r2 = r2 + 1
            goto L_0x08e0
        L_0x0967:
            X.B0V r0 = r10.A01     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            if (r0 == 0) goto L_0x0e9a
            X.81R r3 = new X.81R     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            r3.<init>()     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            A0M(r0, r3, r10, r11)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            r10.A0I(r3, r11)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            r2 = 0
        L_0x0977:
            int r0 = r11.getLength()     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            if (r2 >= r0) goto L_0x0be3
            java.lang.String r1 = A0E(r11, r2)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            int r0 = A04(r11, r2)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            switch(r0) {
                case 84: goto L_0x099e;
                case 85: goto L_0x0997;
                case 86: goto L_0x0990;
                case 87: goto L_0x0989;
                default: goto L_0x0988;
            }     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
        L_0x0988:
            goto L_0x09a4
        L_0x0989:
            X.AUX r0 = A09(r1)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            r3.A03 = r0     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            goto L_0x09a4
        L_0x0990:
            X.AUX r0 = A09(r1)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            r3.A01 = r0     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            goto L_0x09a4
        L_0x0997:
            X.AUX r0 = A09(r1)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            r3.A02 = r0     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            goto L_0x09a4
        L_0x099e:
            X.AUX r0 = A09(r1)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            r3.A00 = r0     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
        L_0x09a4:
            int r2 = r2 + 1
            goto L_0x0977
        L_0x09a7:
            X.B0V r0 = r10.A01     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            if (r0 == 0) goto L_0x0e9f
            X.81S r3 = new X.81S     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            r3.<init>()     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            A0M(r0, r3, r10, r11)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            r10.A0I(r3, r11)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            r2 = 0
        L_0x09b7:
            int r0 = r11.getLength()     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            if (r2 >= r0) goto L_0x0be3
            java.lang.String r4 = A0E(r11, r2)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            int r1 = A04(r11, r2)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            r0 = 11
            if (r1 == r0) goto L_0x09ca
            goto L_0x09d1
        L_0x09ca:
            X.AUX r0 = A09(r4)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            r3.A02 = r0     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            goto L_0x09d8
        L_0x09d1:
            r0 = 12
            if (r1 == r0) goto L_0x0a02
            switch(r1) {
                case 6: goto L_0x09fb;
                case 7: goto L_0x09f4;
                case 49: goto L_0x09db;
                default: goto L_0x09d8;
            }     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
        L_0x09d8:
            int r2 = r2 + 1
            goto L_0x09b7
        L_0x09db:
            X.AUX r0 = A09(r4)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            r3.A04 = r0     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            float r1 = r0.A01     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            boolean r0 = X.C36431kI.A1P(r0)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            if (r0 == 0) goto L_0x09d8
            java.lang.String r0 = "Invalid <radialGradient> element. r cannot be negative"
            X.Auz r1 = X.C22735Auz.A00(r0)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            goto L_0x0f12
        L_0x09f4:
            X.AUX r0 = A09(r4)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            r3.A01 = r0     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            goto L_0x09d8
        L_0x09fb:
            X.AUX r0 = A09(r4)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            r3.A00 = r0     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            goto L_0x09d8
        L_0x0a02:
            X.AUX r0 = A09(r4)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            r3.A03 = r0     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            goto L_0x09d8
        L_0x0a09:
            X.B0V r1 = r10.A01     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            if (r1 == 0) goto L_0x0ec3
            boolean r0 = r1 instanceof X.C1686381j     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            if (r0 == 0) goto L_0x0ebc
            X.81l r4 = new X.81l     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            r4.<init>()     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            A0M(r1, r4, r10, r11)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            r5 = 0
        L_0x0a1a:
            int r0 = r11.getLength()     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            if (r5 >= r0) goto L_0x0a5f
            java.lang.String r3 = A0E(r11, r5)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            int r1 = A04(r11, r5)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            r0 = 39
            if (r1 != r0) goto L_0x0a5c
            int r2 = r3.length()     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            if (r2 == 0) goto L_0x0eb5
            r6 = 1
            int r0 = r2 - r8
            char r1 = r3.charAt(r0)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            r0 = 37
            if (r1 != r0) goto L_0x0a40
            int r2 = r2 + -1
            goto L_0x0a41
        L_0x0a40:
            r6 = 0
        L_0x0a41:
            float r2 = A01(r3, r2)     // Catch:{ NumberFormatException -> 0x0ea4 }
            r1 = 1120403456(0x42c80000, float:100.0)
            if (r6 == 0) goto L_0x0a4a
            float r2 = r2 / r1
        L_0x0a4a:
            r0 = 0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x0a51
            r1 = 0
            goto L_0x0a56
        L_0x0a51:
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0a56
            r1 = r2
        L_0x0a56:
            java.lang.Float r0 = java.lang.Float.valueOf(r1)     // Catch:{ NumberFormatException -> 0x0ea4 }
            r4.A00 = r0     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
        L_0x0a5c:
            int r5 = r5 + 1
            goto L_0x0a1a
        L_0x0a5f:
            X.B0V r0 = r10.A01     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            r0.B0L(r4)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            r10.A01 = r4     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            goto L_0x0dd3
        L_0x0a68:
            X.B0V r0 = r10.A01     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            if (r0 == 0) goto L_0x0ecf
            X.81c r3 = new X.81c     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            r3.<init>()     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            A0M(r0, r3, r10, r11)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            r10.A0J(r3, r11)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            A0L(r3, r11)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            r4 = 0
        L_0x0a7b:
            int r0 = r11.getLength()     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            if (r4 >= r0) goto L_0x0be3
            java.lang.String r2 = A0E(r11, r4)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            int r1 = A04(r11, r4)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            r0 = 3
            if (r1 != r0) goto L_0x0aa8
            java.lang.String r0 = "objectBoundingBox"
            boolean r0 = r0.equals(r2)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            if (r0 == 0) goto L_0x0a9b
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r9)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
        L_0x0a98:
            r3.A00 = r0     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            goto L_0x0aa8
        L_0x0a9b:
            java.lang.String r0 = "userSpaceOnUse"
            boolean r0 = r0.equals(r2)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            if (r0 == 0) goto L_0x0ec8
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r8)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            goto L_0x0a98
        L_0x0aa8:
            int r4 = r4 + 1
            goto L_0x0a7b
        L_0x0aab:
            X.B0V r0 = r10.A01     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            if (r0 == 0) goto L_0x0ed4
            X.81z r2 = new X.81z     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            r2.<init>()     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            A0M(r0, r2, r10, r11)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            A0L(r2, r11)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            r3 = 0
        L_0x0abb:
            int r0 = r11.getLength()     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            if (r3 >= r0) goto L_0x0af5
            java.lang.String r4 = A0E(r11, r3)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            int r1 = A04(r11, r3)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            r0 = 26
            if (r1 == r0) goto L_0x0ad8
            r0 = 61
            if (r1 != r0) goto L_0x0af2
            X.AUX r0 = A09(r4)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            r2.A00 = r0     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            goto L_0x0af2
        L_0x0ad8:
            java.lang.String r1 = r11.getURI(r3)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            java.lang.String r0 = ""
            boolean r0 = r0.equals(r1)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            if (r0 != 0) goto L_0x0af0
            java.lang.String r1 = r11.getURI(r3)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            java.lang.String r0 = "http://www.w3.org/1999/xlink"
            boolean r0 = r0.equals(r1)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            if (r0 == 0) goto L_0x0af2
        L_0x0af0:
            r2.A02 = r4     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
        L_0x0af2:
            int r3 = r3 + 1
            goto L_0x0abb
        L_0x0af5:
            X.B0V r0 = r10.A01     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            r0.B0L(r2)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            r10.A01 = r2     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            X.B0V r1 = r2.A00     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            boolean r0 = r1 instanceof X.C15860o6     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            if (r0 == 0) goto L_0x0b08
            X.0o6 r1 = (X.C15860o6) r1     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
        L_0x0b04:
            r2.A01 = r1     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            goto L_0x0dd3
        L_0x0b08:
            X.Ax9 r1 = (X.Ax9) r1     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            X.0o6 r1 = r1.BIG()     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            goto L_0x0b04
        L_0x0b0f:
            X.B0V r0 = r10.A01     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            if (r0 == 0) goto L_0x0ee7
            X.81w r3 = new X.81w     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            r3.<init>()     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            A0M(r0, r3, r10, r11)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            A0L(r3, r11)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            A0Q(r3, r11)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            r4 = 0
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r9)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
        L_0x0b26:
            int r0 = r11.getLength()     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            if (r4 >= r0) goto L_0x0be3
            java.lang.String r5 = A0E(r11, r4)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            int r6 = A04(r11, r4)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            r0 = 82
            if (r6 == r0) goto L_0x0bd9
            r0 = 83
            if (r6 == r0) goto L_0x0bd2
            r0 = 81
            if (r6 == r0) goto L_0x0bb9
            r0 = 25
            if (r6 == r0) goto L_0x0ba0
            r0 = 26
            if (r6 == r0) goto L_0x0b85
            java.lang.String r1 = "userSpaceOnUse"
            java.lang.String r0 = "objectBoundingBox"
            switch(r6) {
                case 44: goto L_0x0b68;
                case 45: goto L_0x0b7e;
                case 46: goto L_0x0b51;
                default: goto L_0x0b4f;
            }     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
        L_0x0b4f:
            goto L_0x0bdf
        L_0x0b51:
            boolean r0 = r0.equals(r5)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            if (r0 == 0) goto L_0x0b5b
            r3.A06 = r2     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            goto L_0x0bdf
        L_0x0b5b:
            boolean r0 = r1.equals(r5)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            if (r0 == 0) goto L_0x0ed9
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r8)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            r3.A06 = r0     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            goto L_0x0bdf
        L_0x0b68:
            boolean r0 = r0.equals(r5)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            if (r0 == 0) goto L_0x0b71
            r3.A05 = r2     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            goto L_0x0bdf
        L_0x0b71:
            boolean r0 = r1.equals(r5)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            if (r0 == 0) goto L_0x0ee0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r8)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            r3.A05 = r0     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            goto L_0x0bdf
        L_0x0b7e:
            android.graphics.Matrix r0 = A06(r5)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            r3.A00 = r0     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            goto L_0x0bdf
        L_0x0b85:
            java.lang.String r1 = r11.getURI(r4)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            java.lang.String r0 = ""
            boolean r0 = r0.equals(r1)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            if (r0 != 0) goto L_0x0b9d
            java.lang.String r1 = r11.getURI(r4)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            java.lang.String r0 = "http://www.w3.org/1999/xlink"
            boolean r0 = r0.equals(r1)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            if (r0 == 0) goto L_0x0bdf
        L_0x0b9d:
            r3.A07 = r5     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            goto L_0x0bdf
        L_0x0ba0:
            X.AUX r0 = A09(r5)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            r3.A01 = r0     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            float r1 = r0.A01     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            boolean r0 = X.C36431kI.A1P(r0)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            if (r0 == 0) goto L_0x0bdf
            java.lang.String r0 = "Invalid <pattern> element. height cannot be negative"
            X.Auz r1 = X.C22735Auz.A00(r0)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            goto L_0x0f12
        L_0x0bb9:
            X.AUX r0 = A09(r5)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            r3.A02 = r0     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            float r1 = r0.A01     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            boolean r0 = X.C36431kI.A1P(r0)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            if (r0 == 0) goto L_0x0bdf
            java.lang.String r0 = "Invalid <pattern> element. width cannot be negative"
            X.Auz r1 = X.C22735Auz.A00(r0)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            goto L_0x0f12
        L_0x0bd2:
            X.AUX r0 = A09(r5)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            r3.A04 = r0     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            goto L_0x0bdf
        L_0x0bd9:
            X.AUX r0 = A09(r5)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            r3.A03 = r0     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
        L_0x0bdf:
            int r4 = r4 + 1
            goto L_0x0b26
        L_0x0be3:
            X.B0V r0 = r10.A01     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            r0.B0L(r3)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            r10.A01 = r3     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            goto L_0x0dd3
        L_0x0bec:
            X.B0V r0 = r10.A01     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            if (r0 == 0) goto L_0x0eec
            X.81r r2 = new X.81r     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            r2.<init>()     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            A0M(r0, r2, r10, r11)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            r10.A0J(r2, r11)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            A0L(r2, r11)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            r3 = 0
        L_0x0bff:
            int r0 = r11.getLength()     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            if (r3 >= r0) goto L_0x0d4e
            java.lang.String r4 = A0E(r11, r3)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            int r1 = A04(r11, r3)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            r0 = 82
            if (r1 == r0) goto L_0x0c7d
            r0 = 83
            if (r1 == r0) goto L_0x0c76
            r0 = 81
            if (r1 == r0) goto L_0x0c5d
            r0 = 25
            if (r1 == r0) goto L_0x0c44
            r0 = 26
            if (r1 == r0) goto L_0x0c29
            r0 = 48
            if (r1 != r0) goto L_0x0c83
            A0P(r2, r4)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            goto L_0x0c83
        L_0x0c29:
            java.lang.String r1 = r11.getURI(r3)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            java.lang.String r0 = ""
            boolean r0 = r0.equals(r1)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            if (r0 != 0) goto L_0x0c41
            java.lang.String r1 = r11.getURI(r3)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            java.lang.String r0 = "http://www.w3.org/1999/xlink"
            boolean r0 = r0.equals(r1)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            if (r0 == 0) goto L_0x0c83
        L_0x0c41:
            r2.A05 = r4     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            goto L_0x0c83
        L_0x0c44:
            X.AUX r0 = A09(r4)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            r2.A01 = r0     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            float r1 = r0.A01     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            boolean r0 = X.C36431kI.A1P(r0)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            if (r0 == 0) goto L_0x0c83
            java.lang.String r0 = "Invalid <use> element. height cannot be negative"
            X.Auz r1 = X.C22735Auz.A00(r0)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            goto L_0x0f12
        L_0x0c5d:
            X.AUX r0 = A09(r4)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            r2.A02 = r0     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            float r1 = r0.A01     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            boolean r0 = X.C36431kI.A1P(r0)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            if (r0 == 0) goto L_0x0c83
            java.lang.String r0 = "Invalid <use> element. width cannot be negative"
            X.Auz r1 = X.C22735Auz.A00(r0)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            goto L_0x0f12
        L_0x0c76:
            X.AUX r0 = A09(r4)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            r2.A04 = r0     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            goto L_0x0c83
        L_0x0c7d:
            X.AUX r0 = A09(r4)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            r2.A03 = r0     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
        L_0x0c83:
            int r3 = r3 + 1
            goto L_0x0bff
        L_0x0c87:
            X.B0V r1 = r10.A01     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            if (r1 == 0) goto L_0x0ef1
            X.81u r2 = new X.81u     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            r2.<init>()     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            X.9gS r0 = r10.A02     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            r2.A01 = r0     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            r2.A00 = r1     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            A0N(r2, r11)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
        L_0x0c99:
            A0L(r2, r11)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            A0Q(r2, r11)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            goto L_0x0d62
        L_0x0ca1:
            X.B0V r0 = r10.A01     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            if (r0 == 0) goto L_0x0f04
            X.81g r2 = new X.81g     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            r2.<init>()     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            A0M(r0, r2, r10, r11)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            A0L(r2, r11)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            r3 = 0
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r9)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
        L_0x0cb5:
            int r0 = r11.getLength()     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            if (r3 >= r0) goto L_0x0d4e
            java.lang.String r6 = A0E(r11, r3)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            int r7 = A04(r11, r3)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            r0 = 82
            if (r7 == r0) goto L_0x0d44
            r0 = 83
            if (r7 == r0) goto L_0x0d3d
            r0 = 81
            if (r7 == r0) goto L_0x0d24
            r0 = 25
            if (r7 == r0) goto L_0x0d0b
            r0 = 37
            java.lang.String r5 = "userSpaceOnUse"
            java.lang.String r4 = "objectBoundingBox"
            if (r7 == r0) goto L_0x0cf5
            r0 = 36
            if (r7 != r0) goto L_0x0d4a
            boolean r0 = r4.equals(r6)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            if (r0 == 0) goto L_0x0ce8
            r2.A04 = r1     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            goto L_0x0d4a
        L_0x0ce8:
            boolean r0 = r5.equals(r6)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            if (r0 == 0) goto L_0x0ef6
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r8)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            r2.A04 = r0     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            goto L_0x0d4a
        L_0x0cf5:
            boolean r0 = r4.equals(r6)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            if (r0 == 0) goto L_0x0cfe
            r2.A05 = r1     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            goto L_0x0d4a
        L_0x0cfe:
            boolean r0 = r5.equals(r6)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            if (r0 == 0) goto L_0x0efd
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r8)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            r2.A05 = r0     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            goto L_0x0d4a
        L_0x0d0b:
            X.AUX r0 = A09(r6)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            r2.A00 = r0     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            float r4 = r0.A01     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            r0 = 0
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            boolean r0 = X.C36431kI.A1P(r0)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            if (r0 == 0) goto L_0x0d4a
            java.lang.String r0 = "Invalid <mask> element. height cannot be negative"
            X.Auz r1 = X.C22735Auz.A00(r0)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            goto L_0x0f12
        L_0x0d24:
            X.AUX r0 = A09(r6)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            r2.A01 = r0     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            float r4 = r0.A01     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            r0 = 0
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            boolean r0 = X.C36431kI.A1P(r0)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            if (r0 == 0) goto L_0x0d4a
            java.lang.String r0 = "Invalid <mask> element. width cannot be negative"
            X.Auz r1 = X.C22735Auz.A00(r0)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            goto L_0x0f12
        L_0x0d3d:
            X.AUX r0 = A09(r6)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            r2.A03 = r0     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            goto L_0x0d4a
        L_0x0d44:
            X.AUX r0 = A09(r6)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            r2.A02 = r0     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
        L_0x0d4a:
            int r3 = r3 + 1
            goto L_0x0cb5
        L_0x0d4e:
            X.B0V r0 = r10.A01     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            r0.B0L(r2)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            r10.A01 = r2     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            goto L_0x0dd3
        L_0x0d56:
            X.B0V r0 = r10.A01     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            if (r0 == 0) goto L_0x0f0e
            X.81k r2 = new X.81k     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            r2.<init>()     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            A0M(r0, r2, r10, r11)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
        L_0x0d62:
            X.B0V r0 = r10.A01     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            r0.B0L(r2)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            r10.A01 = r2     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            goto L_0x0dd3
        L_0x0d6a:
            r10.A08 = r8     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            goto L_0x0dd3
        L_0x0d6d:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            java.lang.String r0 = "PROC INSTR: "
            r1.append(r0)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            java.lang.String r0 = r18.getText()     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            java.lang.String r1 = X.AnonymousClass000.A0q(r0, r1)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            r0 = r17
            android.util.Log.d(r0, r1)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            java.lang.String r0 = r18.getText()     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            X.9gy r4 = new X.9gy     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            r4.<init>(r0)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            r0 = 32
            r4.A0C(r0, r9)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            java.util.HashMap r3 = X.AnonymousClass001.A0J()     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            r4.A0D()     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            r2 = 61
        L_0x0d9a:
            java.lang.String r1 = r4.A0C(r2, r9)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            if (r1 == 0) goto L_0x0dd3
            r4.A0F(r2)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            java.lang.String r0 = r4.A0B()     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            r3.put(r1, r0)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            r4.A0D()     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            goto L_0x0d9a
        L_0x0dae:
            X.9gS r0 = new X.9gS     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            r0.<init>()     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            r10.A02 = r0     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            goto L_0x0dd3
        L_0x0db6:
            java.lang.String r1 = r18.getText()     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            boolean r0 = r10.A06     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            if (r0 != 0) goto L_0x0dd3
            boolean r0 = r10.A07     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            if (r0 == 0) goto L_0x0dd9
            java.lang.StringBuilder r0 = r10.A04     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            if (r0 != 0) goto L_0x0dd0
            int r0 = r1.length()     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            java.lang.StringBuilder r0 = X.C90524aI.A0h(r0)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            r10.A04 = r0     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
        L_0x0dd0:
            r0.append(r1)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
        L_0x0dd3:
            int r2 = r18.nextToken()     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            goto L_0x0067
        L_0x0dd9:
            boolean r0 = r10.A08     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            if (r0 == 0) goto L_0x0dec
            java.lang.StringBuilder r0 = r10.A05     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            if (r0 != 0) goto L_0x0dd0
            int r0 = r1.length()     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            java.lang.StringBuilder r0 = X.C90524aI.A0h(r0)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            r10.A05 = r0     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            goto L_0x0dd0
        L_0x0dec:
            X.B0V r0 = r10.A01     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            boolean r0 = r0 instanceof X.AnonymousClass822     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            if (r0 == 0) goto L_0x0dd3
            r10.A0S(r1)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            goto L_0x0dd3
        L_0x0df6:
            X.Auz r1 = A0B()     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            goto L_0x0f12
        L_0x0dfc:
            X.Auz r1 = A0B()     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            goto L_0x0f12
        L_0x0e02:
            X.Auz r1 = A0B()     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            goto L_0x0f12
        L_0x0e08:
            java.lang.String r0 = "Invalid float value (empty string)"
            X.Auz r0 = X.C22735Auz.A00(r0)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            throw r0     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
        L_0x0e0f:
            X.Auz r1 = A0B()     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            goto L_0x0f12
        L_0x0e15:
            X.Auz r1 = A0B()     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            goto L_0x0f12
        L_0x0e1b:
            X.Auz r1 = A0B()     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            goto L_0x0f12
        L_0x0e21:
            X.Auz r1 = A0B()     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            goto L_0x0f12
        L_0x0e27:
            X.Auz r1 = A0B()     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            goto L_0x0f12
        L_0x0e2d:
            X.Auz r1 = A0B()     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            goto L_0x0f12
        L_0x0e33:
            java.lang.StringBuilder r1 = X.C36331k8.A0k(r2, r6)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            java.lang.String r0 = "> points attribute. There should be an even number of coordinates."
            java.lang.String r0 = X.AnonymousClass000.A0q(r0, r1)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            X.Auz r1 = X.C22735Auz.A00(r0)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            goto L_0x0f12
        L_0x0e43:
            java.lang.StringBuilder r1 = X.C36331k8.A0k(r2, r6)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            java.lang.String r0 = "> points attribute. Non-coordinate content found in list."
            java.lang.String r0 = X.AnonymousClass000.A0q(r0, r1)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            X.Auz r1 = X.C22735Auz.A00(r0)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            goto L_0x0f12
        L_0x0e53:
            X.Auz r1 = A0B()     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            goto L_0x0f12
        L_0x0e59:
            X.Auz r1 = A0B()     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            goto L_0x0f12
        L_0x0e5f:
            java.lang.String r0 = "Invalid document. <tspan> elements are only valid inside <text> or other <tspan> elements."
            X.Auz r1 = X.C22735Auz.A00(r0)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            goto L_0x0f12
        L_0x0e67:
            X.Auz r1 = A0B()     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            goto L_0x0f12
        L_0x0e6d:
            java.lang.String r0 = "Invalid document. <tref> elements are only valid inside <text> or <tspan> elements."
            X.Auz r1 = X.C22735Auz.A00(r0)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            goto L_0x0f12
        L_0x0e75:
            X.Auz r1 = A0B()     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            goto L_0x0f12
        L_0x0e7b:
            X.Auz r1 = A0B()     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            goto L_0x0f12
        L_0x0e81:
            X.Auz r1 = A0B()     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            goto L_0x0f12
        L_0x0e87:
            java.lang.String r0 = "Invalid float value (empty string)"
            X.Auz r0 = X.C22735Auz.A00(r0)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            throw r0     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
        L_0x0e8e:
            java.lang.String r0 = "Invalid value for attribute markerUnits"
            X.Auz r1 = X.C22735Auz.A00(r0)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            goto L_0x0f12
        L_0x0e95:
            X.Auz r1 = A0B()     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            goto L_0x0f12
        L_0x0e9a:
            X.Auz r1 = A0B()     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            goto L_0x0f12
        L_0x0e9f:
            X.Auz r1 = A0B()     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            goto L_0x0f12
        L_0x0ea4:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            java.lang.String r0 = "Invalid offset value in <stop>: "
            java.lang.String r0 = X.AnonymousClass000.A0p(r0, r3, r1)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            X.Auz r1 = new X.Auz     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            r1.<init>(r0, r2)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            goto L_0x0f12
        L_0x0eb5:
            java.lang.String r0 = "Invalid offset value in <stop> (empty string)"
            X.Auz r1 = X.C22735Auz.A00(r0)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            goto L_0x0f12
        L_0x0ebc:
            java.lang.String r0 = "Invalid document. <stop> elements are only valid inside <linearGradient> or <radialGradient> elements."
            X.Auz r1 = X.C22735Auz.A00(r0)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            goto L_0x0f12
        L_0x0ec3:
            X.Auz r1 = A0B()     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            goto L_0x0f12
        L_0x0ec8:
            java.lang.String r0 = "Invalid value for attribute clipPathUnits"
            X.Auz r1 = X.C22735Auz.A00(r0)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            goto L_0x0f12
        L_0x0ecf:
            X.Auz r1 = A0B()     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            goto L_0x0f12
        L_0x0ed4:
            X.Auz r1 = A0B()     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            goto L_0x0f12
        L_0x0ed9:
            java.lang.String r0 = "Invalid value for attribute patternUnits"
            X.Auz r1 = X.C22735Auz.A00(r0)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            goto L_0x0f12
        L_0x0ee0:
            java.lang.String r0 = "Invalid value for attribute patternContentUnits"
            X.Auz r1 = X.C22735Auz.A00(r0)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            goto L_0x0f12
        L_0x0ee7:
            X.Auz r1 = A0B()     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            goto L_0x0f12
        L_0x0eec:
            X.Auz r1 = A0B()     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            goto L_0x0f12
        L_0x0ef1:
            X.Auz r1 = A0B()     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            goto L_0x0f12
        L_0x0ef6:
            java.lang.String r0 = "Invalid value for attribute maskContentUnits"
            X.Auz r1 = X.C22735Auz.A00(r0)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            goto L_0x0f12
        L_0x0efd:
            java.lang.String r0 = "Invalid value for attribute maskUnits"
            X.Auz r1 = X.C22735Auz.A00(r0)     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            goto L_0x0f12
        L_0x0f04:
            X.Auz r1 = A0B()     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            goto L_0x0f12
        L_0x0f09:
            X.Auz r1 = A0B()     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
            goto L_0x0f12
        L_0x0f0e:
            X.Auz r1 = A0B()     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
        L_0x0f12:
            throw r1     // Catch:{ XmlPullParserException -> 0x0f21, IOException -> 0x0f2a }
        L_0x0f13:
            r34.close()     // Catch:{ IOException -> 0x0f17 }
            goto L_0x0f1e
        L_0x0f17:
            r1 = r17
            r0 = r16
            android.util.Log.e(r1, r0)
        L_0x0f1e:
            X.9gS r0 = r10.A02
            return r0
        L_0x0f21:
            r1 = move-exception
            java.lang.String r0 = "XML parser problem"
            X.Auz r2 = new X.Auz     // Catch:{ all -> 0x0f33 }
            r2.<init>(r0, r1)     // Catch:{ all -> 0x0f33 }
            goto L_0x0f32
        L_0x0f2a:
            r1 = move-exception
            java.lang.String r0 = "Stream error"
            X.Auz r2 = new X.Auz     // Catch:{ all -> 0x0f33 }
            r2.<init>(r0, r1)     // Catch:{ all -> 0x0f33 }
        L_0x0f32:
            throw r2     // Catch:{ all -> 0x0f33 }
        L_0x0f33:
            r2 = move-exception
            r34.close()     // Catch:{ IOException -> 0x0f38 }
            throw r2
        L_0x0f38:
            r1 = r17
            r0 = r16
            android.util.Log.e(r1, r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C203809ou.A0T(java.io.InputStream):X.9gS");
    }

    public static int A04(C21807Aah aah, int i) {
        return AnonymousClass5U2.A00(aah.getLocalName(i)).ordinal();
    }

    public static Matrix A06(String str) {
        Matrix A0B = C90524aI.A0B();
        String str2 = str;
        C200249gy r4 = new C200249gy(str2);
        r4.A0D();
        while (!AnonymousClass000.A1S(r4.A01, r4.A00)) {
            int i = r4.A01;
            String str3 = r4.A03;
            int charAt = str3.charAt(i);
            while (true) {
                if (charAt >= 97) {
                    if (charAt <= 122) {
                        charAt = r4.A06();
                    }
                } else if (charAt >= 65 && charAt <= 90) {
                    charAt = r4.A06();
                }
            }
            int i2 = r4.A01;
            while (C200249gy.A02(charAt)) {
                charAt = r4.A06();
            }
            if (charAt == 40) {
                r4.A01++;
                String substring = str3.substring(i, i2);
                if (substring != null) {
                    short s = -1;
                    switch (substring.hashCode()) {
                        case -1081239615:
                            s = C90504aG.A0y("matrix", substring);
                            break;
                        case -925180581:
                            s = C90514aH.A1B("rotate", substring);
                            break;
                        case 109250890:
                            s = C90514aH.A1C("scale", substring);
                            break;
                        case 109493390:
                            if (substring.equals("skewX")) {
                                s = 3;
                                break;
                            }
                            break;
                        case 109493391:
                            if (substring.equals("skewY")) {
                                s = 4;
                                break;
                            }
                            break;
                        case 1052832078:
                            if (substring.equals("translate")) {
                                s = 5;
                                break;
                            }
                            break;
                    }
                    switch (s) {
                        case 0:
                            r4.A0D();
                            float A042 = r4.A04();
                            r4.A0E();
                            float A043 = r4.A04();
                            r4.A0E();
                            float A044 = r4.A04();
                            r4.A0E();
                            float A045 = r4.A04();
                            r4.A0E();
                            float A046 = r4.A04();
                            r4.A0E();
                            float A047 = r4.A04();
                            r4.A0D();
                            if (!Float.isNaN(A047) && r4.A0F(')')) {
                                Matrix A0B2 = C90524aI.A0B();
                                A0B2.setValues(new float[]{A042, A044, A046, A043, A045, A047, 0.0f, 0.0f, 1.0f});
                                A0B.preConcat(A0B2);
                                break;
                            } else {
                                throw C22735Auz.A00(C36321k7.A0D("Invalid transform list: ", str2));
                            }
                        case 1:
                            r4.A0D();
                            float A048 = r4.A04();
                            float A032 = r4.A03();
                            float A033 = r4.A03();
                            r4.A0D();
                            if (Float.isNaN(A048) || !r4.A0F(')')) {
                                throw C22735Auz.A00(C36321k7.A0D("Invalid transform list: ", str2));
                            } else if (Float.isNaN(A032)) {
                                A0B.preRotate(A048);
                                break;
                            } else if (!Float.isNaN(A033)) {
                                A0B.preRotate(A048, A032, A033);
                                break;
                            } else {
                                throw C22735Auz.A00(C36321k7.A0D("Invalid transform list: ", str2));
                            }
                        case 2:
                            r4.A0D();
                            float A049 = r4.A04();
                            float A034 = r4.A03();
                            r4.A0D();
                            if (!Float.isNaN(A049) && r4.A0F(')')) {
                                if (!Float.isNaN(A034)) {
                                    A0B.preScale(A049, A034);
                                    break;
                                } else {
                                    A0B.preScale(A049, A049);
                                    break;
                                }
                            } else {
                                throw C22735Auz.A00(C36321k7.A0D("Invalid transform list: ", str2));
                            }
                        case 3:
                            r4.A0D();
                            float A0410 = r4.A04();
                            r4.A0D();
                            if (!Float.isNaN(A0410) && r4.A0F(')')) {
                                A0B.preSkew((float) Math.tan(Math.toRadians((double) A0410)), 0.0f);
                                break;
                            } else {
                                throw C22735Auz.A00(C36321k7.A0D("Invalid transform list: ", str2));
                            }
                            break;
                        case 4:
                            r4.A0D();
                            float A0411 = r4.A04();
                            r4.A0D();
                            if (!Float.isNaN(A0411) && r4.A0F(')')) {
                                A0B.preSkew(0.0f, (float) Math.tan(Math.toRadians((double) A0411)));
                                break;
                            } else {
                                throw C22735Auz.A00(C36321k7.A0D("Invalid transform list: ", str2));
                            }
                            break;
                        case 5:
                            r4.A0D();
                            float A0412 = r4.A04();
                            float A035 = r4.A03();
                            r4.A0D();
                            if (!Float.isNaN(A0412) && r4.A0F(')')) {
                                if (!Float.isNaN(A035)) {
                                    A0B.preTranslate(A0412, A035);
                                    break;
                                } else {
                                    A0B.preTranslate(A0412, 0.0f);
                                    break;
                                }
                            } else {
                                throw C22735Auz.A00(C36321k7.A0D("Invalid transform list: ", str2));
                            }
                            break;
                        default:
                            StringBuilder A0u = AnonymousClass000.A0u();
                            A0u.append("Invalid transform list fn: ");
                            A0u.append(substring);
                            throw C22735Auz.A00(C90474aD.A0f(A0u));
                    }
                    if (AnonymousClass000.A1S(r4.A01, r4.A00)) {
                        return A0B;
                    }
                    r4.A0E();
                }
            }
            throw C22735Auz.A00(AnonymousClass000.A0p("Bad transform function encountered in transform list: ", str2, AnonymousClass000.A0u()));
        }
        return A0B;
    }

    public static AUX A09(String str) {
        int length = str.length();
        if (length != 0) {
            Integer num = C023109s.A00;
            int i = length - 1;
            char charAt = str.charAt(i);
            if (charAt == '%') {
                length = i;
                num = C023109s.A0X;
            } else if (length > 2 && Character.isLetter(charAt)) {
                int i2 = length - 2;
                if (Character.isLetter(str.charAt(i2))) {
                    length = i2;
                    try {
                        num = AnonymousClass93Z.A00(C90514aH.A0y(str.substring(i2)));
                    } catch (IllegalArgumentException unused) {
                        throw C22735Auz.A00(AnonymousClass000.A0p("Invalid length unit specifier: ", str, AnonymousClass000.A0u()));
                    }
                }
            }
            try {
                return new AUX(num, A01(str, length));
            } catch (NumberFormatException e) {
                throw new C22735Auz(AnonymousClass000.A0p("Invalid length value: ", str, AnonymousClass000.A0u()), e);
            }
        } else {
            throw C22735Auz.A00("Invalid length value (empty string)");
        }
    }

    public static Float A0C(String str) {
        try {
            int length = str.length();
            if (length != 0) {
                float A012 = A01(str, length);
                if (A012 < 0.0f) {
                    A012 = 0.0f;
                } else if (A012 > 1.0f) {
                    A012 = 1.0f;
                }
                return Float.valueOf(A012);
            }
            throw C22735Auz.A00("Invalid float value (empty string)");
        } catch (C22735Auz unused) {
            return null;
        }
    }

    public static Integer A0D(String str) {
        switch (str.hashCode()) {
            case -1657669071:
                if (str.equals("oblique")) {
                    return C023109s.A0C;
                }
                return null;
            case -1178781136:
                if (str.equals("italic")) {
                    return C023109s.A01;
                }
                return null;
            case -1039745817:
                if (str.equals("normal")) {
                    return C023109s.A00;
                }
                return null;
            default:
                return null;
        }
    }

    public static String A0E(C21807Aah aah, int i) {
        return aah.getValue(i).trim();
    }

    public static ArrayList A0H(String str) {
        if (str.length() != 0) {
            ArrayList A10 = C165607th.A10();
            C200249gy r4 = new C200249gy(str);
            r4.A0D();
            while (!AnonymousClass000.A1S(r4.A01, r4.A00)) {
                float A042 = r4.A04();
                if (!Float.isNaN(A042)) {
                    Integer A0A = r4.A0A();
                    if (A0A == null) {
                        A0A = C023109s.A00;
                    }
                    A10.add(new AUX(A0A, A042));
                    r4.A0E();
                } else {
                    StringBuilder A0u = AnonymousClass000.A0u();
                    A0u.append("Invalid length list value: ");
                    int i = r4.A01;
                    int i2 = i;
                    while (!AnonymousClass000.A1S(i2, r4.A00) && !C200249gy.A02(r4.A03.charAt(i2))) {
                        i2 = r4.A01 + 1;
                        r4.A01 = i2;
                    }
                    C165577te.A1O(r4.A03, A0u, i, r4.A01);
                    throw C22735Auz.A00(A0u.toString());
                }
            }
            return A10;
        }
        throw C22735Auz.A00("Invalid length list (empty string)");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x034e, code lost:
        r9.A0M = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x0350, code lost:
        if (r0 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x0352, code lost:
        r0 = r9.A0D;
        r7 = 524288;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x0362, code lost:
        if (r11.equals(r0) == false) goto L_0x034d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x0364, code lost:
        r0 = java.lang.Boolean.TRUE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x0370, code lost:
        if (r11.equals(r0) == false) goto L_0x034d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x0372, code lost:
        r0 = java.lang.Boolean.FALSE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:273:0x04fb, code lost:
        r9.A0D = r0 | r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:274:0x04fe, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:281:0x051a, code lost:
        r9.A0D = r2 | r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:299:0x0568, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:327:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A0K(X.AUW r9, java.lang.String r10, java.lang.String r11) {
        /*
            int r5 = r11.length()
            if (r5 == 0) goto L_0x0569
            java.lang.String r0 = "inherit"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x0569
            X.5Y7 r0 = X.AnonymousClass5Y7.$redex_init_class
            X.5U2 r0 = X.AnonymousClass5U2.A00(r10)
            int r4 = r0.ordinal()
            java.lang.String r3 = "none"
            java.lang.String r2 = "SVGParser"
            java.lang.String r0 = "currentColor"
            r1 = 124(0x7c, float:1.74E-43)
            switch(r4) {
                case 1: goto L_0x02e9;
                case 2: goto L_0x00a9;
                case 4: goto L_0x02c9;
                case 5: goto L_0x0024;
                case 8: goto L_0x03a9;
                case 14: goto L_0x010a;
                case 15: goto L_0x0238;
                case 16: goto L_0x04e9;
                case 17: goto L_0x022a;
                case 18: goto L_0x0415;
                case 19: goto L_0x0180;
                case 20: goto L_0x0030;
                case 21: goto L_0x025e;
                case 22: goto L_0x0171;
                case 27: goto L_0x0271;
                case 28: goto L_0x0160;
                case 29: goto L_0x0153;
                case 30: goto L_0x0146;
                case 31: goto L_0x0139;
                case 35: goto L_0x009c;
                case 40: goto L_0x018e;
                case 42: goto L_0x0346;
                case 58: goto L_0x0082;
                case 59: goto L_0x0073;
                case 62: goto L_0x00c3;
                case 63: goto L_0x00b6;
                case 64: goto L_0x021c;
                case 65: goto L_0x019a;
                case 66: goto L_0x0246;
                case 67: goto L_0x04be;
                case 68: goto L_0x0493;
                case 69: goto L_0x050c;
                case 70: goto L_0x020e;
                case 71: goto L_0x0252;
                case 74: goto L_0x0375;
                case 75: goto L_0x03cd;
                case 78: goto L_0x02a7;
                case 88: goto L_0x0059;
                case 89: goto L_0x004a;
                case 90: goto L_0x00db;
                default: goto L_0x0023;
            }
        L_0x0023:
            return
        L_0x0024:
            X.81p r0 = A07(r11)     // Catch:{ Auz -> 0x0023 }
            r9.A00 = r0     // Catch:{ Auz -> 0x0023 }
            long r2 = r9.A0D     // Catch:{ Auz -> 0x0023 }
            r0 = 4096(0x1000, double:2.0237E-320)
            goto L_0x051a
        L_0x0030:
            java.util.Map r0 = X.C1903598b.A00     // Catch:{ Auz -> 0x003f }
            java.lang.Object r0 = r0.get(r11)     // Catch:{ Auz -> 0x003f }
            X.AUX r0 = (X.AUX) r0     // Catch:{ Auz -> 0x003f }
            if (r0 != 0) goto L_0x0040
            X.AUX r0 = A09(r11)     // Catch:{ Auz -> 0x003f }
            goto L_0x0040
        L_0x003f:
            r0 = 0
        L_0x0040:
            r9.A0F = r0
            if (r0 == 0) goto L_0x0023
            long r0 = r9.A0D
            r7 = 16384(0x4000, double:8.0948E-320)
            goto L_0x04fb
        L_0x004a:
            java.lang.Float r0 = A0C(r11)
            r9.A0S = r0
            long r0 = r9.A0D
            r7 = 17179869184(0x400000000, double:8.4879831639E-314)
            goto L_0x04fb
        L_0x0059:
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x006c
            X.81o r0 = X.C1686881o.A00
            r9.A0K = r0
        L_0x0063:
            long r0 = r9.A0D
            r7 = 8589934592(0x200000000, double:4.243991582E-314)
            goto L_0x04fb
        L_0x006c:
            X.81p r0 = A07(r11)     // Catch:{ Auz -> 0x051e }
            r9.A0K = r0     // Catch:{ Auz -> 0x051e }
            goto L_0x0063
        L_0x0073:
            java.lang.Float r0 = A0C(r11)
            r9.A0P = r0
            long r0 = r9.A0D
            r7 = 4294967296(0x100000000, double:2.121995791E-314)
            goto L_0x04fb
        L_0x0082:
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x0095
            X.81o r0 = X.C1686881o.A00
            r9.A0H = r0
        L_0x008c:
            long r0 = r9.A0D
            r7 = 2147483648(0x80000000, double:1.0609978955E-314)
            goto L_0x04fb
        L_0x0095:
            X.81p r0 = A07(r11)     // Catch:{ Auz -> 0x051e }
            r9.A0H = r0     // Catch:{ Auz -> 0x051e }
            goto L_0x008c
        L_0x009c:
            java.lang.String r0 = A0F(r11)
            r9.A0b = r0
            long r0 = r9.A0D
            r7 = 1073741824(0x40000000, double:5.304989477E-315)
            goto L_0x04fb
        L_0x00a9:
            java.lang.String r0 = A0F(r11)
            r9.A0a = r0
            long r0 = r9.A0D
            r7 = 268435456(0x10000000, double:1.32624737E-315)
            goto L_0x04fb
        L_0x00b6:
            java.lang.Float r0 = A0C(r11)
            r9.A0Q = r0
            long r0 = r9.A0D
            r7 = 134217728(0x8000000, double:6.63123685E-316)
            goto L_0x04fb
        L_0x00c3:
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x00d4
            X.81o r0 = X.C1686881o.A00
            r9.A0I = r0
        L_0x00cd:
            long r0 = r9.A0D
            r7 = 67108864(0x4000000, double:3.31561842E-316)
            goto L_0x04fb
        L_0x00d4:
            X.81p r0 = A07(r11)     // Catch:{ Auz -> 0x051e }
            r9.A0I = r0     // Catch:{ Auz -> 0x051e }
            goto L_0x00cd
        L_0x00db:
            int r0 = r11.indexOf(r1)
            if (r0 >= 0) goto L_0x0023
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0u()
            r0.append(r1)
            r0.append(r11)
            java.lang.String r1 = X.AnonymousClass000.A0t(r0, r1)
            java.lang.String r0 = "|visible|hidden|collapse|"
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x0023
            java.lang.String r0 = "visible"
            boolean r0 = r11.equals(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r9.A03 = r0
            long r0 = r9.A0D
            r7 = 33554432(0x2000000, double:1.6578092E-316)
            goto L_0x04fb
        L_0x010a:
            int r0 = r11.indexOf(r1)
            if (r0 >= 0) goto L_0x0023
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0u()
            r0.append(r1)
            r0.append(r11)
            java.lang.String r1 = X.AnonymousClass000.A0t(r0, r1)
            java.lang.String r0 = "|inline|block|list-item|run-in|compact|marker|table|inline-table|table-row-group|table-header-group|table-footer-group|table-row|table-column-group|table-column|table-cell|table-caption|none|"
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x0023
            boolean r0 = r11.equals(r3)
            r0 = r0 ^ 1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r9.A0L = r0
            long r0 = r9.A0D
            r7 = 16777216(0x1000000, double:8.289046E-317)
            goto L_0x04fb
        L_0x0139:
            java.lang.String r0 = A0F(r11)
            r9.A09 = r0
            long r0 = r9.A0D
            r7 = 8388608(0x800000, double:4.144523E-317)
            goto L_0x04fb
        L_0x0146:
            java.lang.String r0 = A0F(r11)
            r9.A0A = r0
            long r0 = r9.A0D
            r7 = 4194304(0x400000, double:2.0722615E-317)
            goto L_0x04fb
        L_0x0153:
            java.lang.String r0 = A0F(r11)
            r9.A0B = r0
            long r0 = r9.A0D
            r7 = 2097152(0x200000, double:1.0361308E-317)
            goto L_0x04fb
        L_0x0160:
            java.lang.String r0 = A0F(r11)
            r9.A0B = r0
            r9.A0A = r0
            r9.A09 = r0
            long r0 = r9.A0D
            r7 = 14680064(0xe00000, double:7.2529153E-317)
            goto L_0x04fb
        L_0x0171:
            java.lang.Integer r0 = A0D(r11)
            r9.A0V = r0
            if (r0 == 0) goto L_0x0023
            long r0 = r9.A0D
            r7 = 65536(0x10000, double:3.2379E-319)
            goto L_0x04fb
        L_0x0180:
            java.util.ArrayList r0 = A0G(r11)
            r9.A0c = r0
            if (r0 == 0) goto L_0x0023
            long r0 = r9.A0D
            r7 = 8192(0x2000, double:4.0474E-320)
            goto L_0x04fb
        L_0x018e:
            java.lang.Float r0 = A0C(r11)
            r9.A0O = r0
            long r0 = r9.A0D
            r7 = 2048(0x800, double:1.0118E-320)
            goto L_0x04fb
        L_0x019a:
            boolean r0 = r3.equals(r11)
            r7 = 512(0x200, double:2.53E-321)
            if (r0 == 0) goto L_0x01a9
            r0 = 0
            r9.A0C = r0
        L_0x01a5:
            long r0 = r9.A0D
            goto L_0x04fb
        L_0x01a9:
            X.9gy r6 = new X.9gy
            r6.<init>(r11)
            r6.A0D()
            int r1 = r6.A01
            int r0 = r6.A00
            boolean r1 = X.AnonymousClass000.A1S(r1, r0)
            r0 = 0
            if (r1 != 0) goto L_0x0209
            X.AUX r3 = r6.A07()
            if (r3 == 0) goto L_0x0209
            float r2 = r3.A01
            r1 = 0
            int r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            boolean r1 = X.C36431kI.A1P(r1)
            if (r1 != 0) goto L_0x0209
            float r5 = r3.A01
            java.util.ArrayList r4 = X.C90484aE.A0r(r3)
        L_0x01d3:
            int r2 = r6.A01
            int r1 = r6.A00
            boolean r1 = X.AnonymousClass000.A1S(r2, r1)
            if (r1 != 0) goto L_0x01f8
            r6.A0E()
            X.AUX r3 = r6.A07()
            if (r3 == 0) goto L_0x0209
            float r2 = r3.A01
            r1 = 0
            int r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            boolean r1 = X.C36431kI.A1P(r1)
            if (r1 != 0) goto L_0x0209
            r4.add(r3)
            float r1 = r3.A01
            float r5 = r5 + r1
            goto L_0x01d3
        L_0x01f8:
            r1 = 0
            int r1 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r1 == 0) goto L_0x0209
            int r0 = r4.size()
            X.AUX[] r0 = new X.AUX[r0]
            java.lang.Object[] r0 = r4.toArray(r0)
            X.AUX[] r0 = (X.AUX[]) r0
        L_0x0209:
            r9.A0C = r0
            if (r0 == 0) goto L_0x0023
            goto L_0x01a5
        L_0x020e:
            java.lang.Float r0 = A0C(r11)
            r9.A0R = r0
            if (r0 == 0) goto L_0x0023
            long r0 = r9.A0D
            r7 = 16
            goto L_0x04fb
        L_0x021c:
            X.AUT r0 = A0A(r11)
            r9.A0J = r0
            if (r0 == 0) goto L_0x0023
            long r0 = r9.A0D
            r7 = 8
            goto L_0x04fb
        L_0x022a:
            java.lang.Float r0 = A0C(r11)
            r9.A0N = r0
            if (r0 == 0) goto L_0x0023
            long r0 = r9.A0D
            r7 = 4
            goto L_0x04fb
        L_0x0238:
            X.AUT r0 = A0A(r11)
            r9.A0G = r0
            if (r0 == 0) goto L_0x0023
            long r0 = r9.A0D
            r7 = 1
            goto L_0x04fb
        L_0x0246:
            X.AUX r0 = A09(r11)     // Catch:{ Auz -> 0x0023 }
            r9.A01 = r0     // Catch:{ Auz -> 0x0023 }
            long r2 = r9.A0D     // Catch:{ Auz -> 0x0023 }
            r0 = 1024(0x400, double:5.06E-321)
            goto L_0x051a
        L_0x0252:
            X.AUX r0 = A09(r11)     // Catch:{ Auz -> 0x0023 }
            r9.A02 = r0     // Catch:{ Auz -> 0x0023 }
            long r2 = r9.A0D     // Catch:{ Auz -> 0x0023 }
            r0 = 32
            goto L_0x051a
        L_0x025e:
            java.util.Map r0 = X.C1903698c.A00
            java.lang.Object r0 = r0.get(r11)
            java.lang.Integer r0 = (java.lang.Integer) r0
            r9.A0W = r0
            if (r0 == 0) goto L_0x0023
            long r0 = r9.A0D
            r7 = 32768(0x8000, double:1.61895E-319)
            goto L_0x04fb
        L_0x0271:
            int r0 = r11.hashCode()
            switch(r0) {
                case -933002398: goto L_0x029c;
                case 3005871: goto L_0x0291;
                case 362741610: goto L_0x0286;
                default: goto L_0x0278;
            }
        L_0x0278:
            r0 = 0
        L_0x0279:
            r9.A0X = r0
            if (r0 == 0) goto L_0x0023
            long r0 = r9.A0D
            r7 = 137438953472(0x2000000000, double:6.7903865311E-313)
            goto L_0x04fb
        L_0x0286:
            java.lang.String r0 = "optimizeSpeed"
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x0278
            java.lang.Integer r0 = X.C023109s.A0C
            goto L_0x0279
        L_0x0291:
            java.lang.String r0 = "auto"
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x0278
            java.lang.Integer r0 = X.C023109s.A00
            goto L_0x0279
        L_0x029c:
            java.lang.String r0 = "optimizeQuality"
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x0278
            java.lang.Integer r0 = X.C023109s.A01
            goto L_0x0279
        L_0x02a7:
            boolean r0 = r11.equals(r3)
            if (r0 != 0) goto L_0x02c6
            java.lang.String r0 = "non-scaling-stroke"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x02c3
            r0 = 0
        L_0x02b6:
            r9.A0Z = r0
            if (r0 == 0) goto L_0x0023
            long r0 = r9.A0D
            r7 = 34359738368(0x800000000, double:1.69759663277E-313)
            goto L_0x04fb
        L_0x02c3:
            java.lang.Integer r0 = X.C023109s.A01
            goto L_0x02b6
        L_0x02c6:
            java.lang.Integer r0 = X.C023109s.A00
            goto L_0x02b6
        L_0x02c9:
            java.lang.String r0 = "nonzero"
            boolean r0 = r0.equals(r11)
            if (r0 == 0) goto L_0x02dc
            java.lang.Integer r0 = X.C023109s.A00
        L_0x02d3:
            r9.A0T = r0
            long r0 = r9.A0D
            r7 = 536870912(0x20000000, double:2.652494739E-315)
            goto L_0x04fb
        L_0x02dc:
            java.lang.String r0 = "evenodd"
            boolean r0 = r0.equals(r11)
            if (r0 == 0) goto L_0x02e7
            java.lang.Integer r0 = X.C023109s.A01
            goto L_0x02d3
        L_0x02e7:
            r0 = 0
            goto L_0x02d3
        L_0x02e9:
            java.lang.String r0 = "auto"
            boolean r0 = r0.equals(r11)
            r7 = 0
            if (r0 != 0) goto L_0x0335
            java.lang.String r0 = "rect("
            boolean r0 = r11.startsWith(r0)
            if (r0 == 0) goto L_0x0335
            r0 = 5
            java.lang.String r0 = r11.substring(r0)
            X.9gy r6 = new X.9gy
            r6.<init>(r0)
            r6.A0D()
            X.AUX r5 = A08(r6)
            r6.A0E()
            X.AUX r4 = A08(r6)
            r6.A0E()
            X.AUX r3 = A08(r6)
            r6.A0E()
            X.AUX r2 = A08(r6)
            r6.A0D()
            r0 = 41
            boolean r0 = r6.A0F(r0)
            if (r0 != 0) goto L_0x0340
            int r1 = r6.A01
            int r0 = r6.A00
            boolean r0 = X.AnonymousClass000.A1S(r1, r0)
            if (r0 != 0) goto L_0x0340
        L_0x0335:
            r9.A0E = r7
            if (r7 == 0) goto L_0x0023
            long r0 = r9.A0D
            r7 = 1048576(0x100000, double:5.180654E-318)
            goto L_0x04fb
        L_0x0340:
            X.9L5 r7 = new X.9L5
            r7.<init>(r5, r4, r3, r2)
            goto L_0x0335
        L_0x0346:
            int r0 = r11.hashCode()
            switch(r0) {
                case -1217487446: goto L_0x036a;
                case -907680051: goto L_0x0367;
                case 3005871: goto L_0x035c;
                case 466743410: goto L_0x0359;
                default: goto L_0x034d;
            }
        L_0x034d:
            r0 = 0
        L_0x034e:
            r9.A0M = r0
            if (r0 == 0) goto L_0x0023
            long r0 = r9.A0D
            r7 = 524288(0x80000, double:2.590327E-318)
            goto L_0x04fb
        L_0x0359:
            java.lang.String r0 = "visible"
            goto L_0x035e
        L_0x035c:
            java.lang.String r0 = "auto"
        L_0x035e:
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x034d
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            goto L_0x034e
        L_0x0367:
            java.lang.String r0 = "scroll"
            goto L_0x036c
        L_0x036a:
            java.lang.String r0 = "hidden"
        L_0x036c:
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x034d
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            goto L_0x034e
        L_0x0375:
            int r0 = r11.hashCode()
            switch(r0) {
                case -1074341483: goto L_0x039e;
                case 100571: goto L_0x0393;
                case 109757538: goto L_0x0388;
                default: goto L_0x037c;
            }
        L_0x037c:
            r0 = 0
        L_0x037d:
            r9.A0Y = r0
            if (r0 == 0) goto L_0x0023
            long r0 = r9.A0D
            r7 = 262144(0x40000, double:1.295163E-318)
            goto L_0x04fb
        L_0x0388:
            java.lang.String r0 = "start"
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x037c
            java.lang.Integer r0 = X.C023109s.A00
            goto L_0x037d
        L_0x0393:
            java.lang.String r0 = "end"
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x037c
            java.lang.Integer r0 = X.C023109s.A0C
            goto L_0x037d
        L_0x039e:
            java.lang.String r0 = "middle"
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x037c
            java.lang.Integer r0 = X.C023109s.A01
            goto L_0x037d
        L_0x03a9:
            java.lang.String r0 = "ltr"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x03ca
            java.lang.String r0 = "rtl"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x03c7
            r0 = 0
        L_0x03ba:
            r9.A05 = r0
            if (r0 == 0) goto L_0x0023
            long r0 = r9.A0D
            r7 = 68719476736(0x1000000000, double:3.39519326554E-313)
            goto L_0x04fb
        L_0x03c7:
            java.lang.Integer r0 = X.C023109s.A01
            goto L_0x03ba
        L_0x03ca:
            java.lang.Integer r0 = X.C023109s.A00
            goto L_0x03ba
        L_0x03cd:
            int r0 = r11.hashCode()
            switch(r0) {
                case -1171789332: goto L_0x040a;
                case -1026963764: goto L_0x03ff;
                case 3387192: goto L_0x03f6;
                case 93826908: goto L_0x03eb;
                case 529818312: goto L_0x03e0;
                default: goto L_0x03d4;
            }
        L_0x03d4:
            r0 = 0
        L_0x03d5:
            r9.A08 = r0
            if (r0 == 0) goto L_0x0023
            long r0 = r9.A0D
            r7 = 131072(0x20000, double:6.47582E-319)
            goto L_0x04fb
        L_0x03e0:
            java.lang.String r0 = "overline"
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x03d4
            java.lang.Integer r0 = X.C023109s.A0C
            goto L_0x03d5
        L_0x03eb:
            java.lang.String r0 = "blink"
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x03d4
            java.lang.Integer r0 = X.C023109s.A0R
            goto L_0x03d5
        L_0x03f6:
            boolean r0 = r11.equals(r3)
            if (r0 == 0) goto L_0x03d4
            java.lang.Integer r0 = X.C023109s.A00
            goto L_0x03d5
        L_0x03ff:
            java.lang.String r0 = "underline"
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x03d4
            java.lang.Integer r0 = X.C023109s.A01
            goto L_0x03d5
        L_0x040a:
            java.lang.String r0 = "line-through"
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x03d4
            java.lang.Integer r0 = X.C023109s.A0G
            goto L_0x03d5
        L_0x0415:
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0u()
            r0.append(r1)
            r0.append(r11)
            java.lang.String r1 = X.AnonymousClass000.A0t(r0, r1)
            java.lang.String r0 = "|caption|icon|menu|message-box|small-caption|status-bar|"
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x0023
            X.9gy r4 = new X.9gy
            r4.<init>(r11)
            r6 = 0
            r2 = r6
            r3 = r6
        L_0x0433:
            r5 = 47
            r0 = 0
            java.lang.String r1 = r4.A0C(r5, r0)
            r4.A0D()
            if (r1 == 0) goto L_0x0023
            if (r6 == 0) goto L_0x0444
            if (r2 == 0) goto L_0x0444
            goto L_0x046c
        L_0x0444:
            java.lang.String r0 = "normal"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0433
            if (r6 != 0) goto L_0x0457
            java.util.Map r0 = X.C1903698c.A00
            java.lang.Number r6 = X.C90524aI.A0b(r1, r0)
            if (r6 == 0) goto L_0x0457
            goto L_0x0433
        L_0x0457:
            if (r2 != 0) goto L_0x0460
            java.lang.Integer r2 = A0D(r1)
            if (r2 == 0) goto L_0x0460
            goto L_0x0433
        L_0x0460:
            if (r3 != 0) goto L_0x046c
            java.lang.String r0 = "small-caps"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x046c
            r3 = r1
            goto L_0x0433
        L_0x046c:
            java.util.Map r0 = X.C1903598b.A00     // Catch:{ Auz -> 0x047b }
            java.lang.Object r3 = r0.get(r1)     // Catch:{ Auz -> 0x047b }
            X.AUX r3 = (X.AUX) r3     // Catch:{ Auz -> 0x047b }
            if (r3 != 0) goto L_0x047c
            X.AUX r3 = A09(r1)     // Catch:{ Auz -> 0x047b }
            goto L_0x047c
        L_0x047b:
            r3 = 0
        L_0x047c:
            boolean r0 = r4.A0F(r5)
            if (r0 == 0) goto L_0x052a
            r4.A0D()
            r1 = 32
            r0 = 0
            java.lang.String r0 = r4.A0C(r1, r0)
            if (r0 == 0) goto L_0x0527
            A09(r0)     // Catch:{ Auz -> 0x0023 }
            goto L_0x0527
        L_0x0493:
            java.lang.String r0 = "miter"
            boolean r0 = r0.equals(r11)
            if (r0 == 0) goto L_0x04a6
            java.lang.Integer r0 = X.C023109s.A00
        L_0x049d:
            r9.A07 = r0
            if (r0 == 0) goto L_0x0023
            long r0 = r9.A0D
            r7 = 128(0x80, double:6.32E-322)
            goto L_0x04fb
        L_0x04a6:
            java.lang.String r0 = "round"
            boolean r0 = r0.equals(r11)
            if (r0 == 0) goto L_0x04b1
            java.lang.Integer r0 = X.C023109s.A01
            goto L_0x049d
        L_0x04b1:
            java.lang.String r0 = "bevel"
            boolean r0 = r0.equals(r11)
            if (r0 == 0) goto L_0x04bc
            java.lang.Integer r0 = X.C023109s.A0C
            goto L_0x049d
        L_0x04bc:
            r0 = 0
            goto L_0x049d
        L_0x04be:
            java.lang.String r0 = "butt"
            boolean r0 = r0.equals(r11)
            if (r0 == 0) goto L_0x04d1
            java.lang.Integer r0 = X.C023109s.A00
        L_0x04c8:
            r9.A06 = r0
            if (r0 == 0) goto L_0x0023
            long r0 = r9.A0D
            r7 = 64
            goto L_0x04fb
        L_0x04d1:
            java.lang.String r0 = "round"
            boolean r0 = r0.equals(r11)
            if (r0 == 0) goto L_0x04dc
            java.lang.Integer r0 = X.C023109s.A01
            goto L_0x04c8
        L_0x04dc:
            java.lang.String r0 = "square"
            boolean r0 = r0.equals(r11)
            if (r0 == 0) goto L_0x04e7
            java.lang.Integer r0 = X.C023109s.A0C
            goto L_0x04c8
        L_0x04e7:
            r0 = 0
            goto L_0x04c8
        L_0x04e9:
            java.lang.String r0 = "nonzero"
            boolean r0 = r0.equals(r11)
            if (r0 == 0) goto L_0x04ff
            java.lang.Integer r0 = X.C023109s.A00
        L_0x04f3:
            r9.A0U = r0
            if (r0 == 0) goto L_0x0023
            long r0 = r9.A0D
            r7 = 2
        L_0x04fb:
            long r0 = r0 | r7
            r9.A0D = r0
            return
        L_0x04ff:
            java.lang.String r0 = "evenodd"
            boolean r0 = r0.equals(r11)
            if (r0 == 0) goto L_0x050a
            java.lang.Integer r0 = X.C023109s.A01
            goto L_0x04f3
        L_0x050a:
            r0 = 0
            goto L_0x04f3
        L_0x050c:
            float r0 = A01(r11, r5)     // Catch:{ Auz -> 0x0023 }
            java.lang.Float r0 = java.lang.Float.valueOf(r0)     // Catch:{ Auz -> 0x0023 }
            r9.A04 = r0     // Catch:{ Auz -> 0x0023 }
            long r2 = r9.A0D     // Catch:{ Auz -> 0x0023 }
            r0 = 256(0x100, double:1.265E-321)
        L_0x051a:
            long r2 = r2 | r0
            r9.A0D = r2     // Catch:{ Auz -> 0x0023 }
            goto L_0x0568
        L_0x051e:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            android.util.Log.w(r2, r0)
            return
        L_0x0527:
            r4.A0D()
        L_0x052a:
            int r1 = r4.A01
            int r0 = r4.A00
            boolean r0 = X.AnonymousClass000.A1S(r1, r0)
            if (r0 == 0) goto L_0x055b
            r0 = 0
        L_0x0535:
            java.util.ArrayList r0 = A0G(r0)
            r9.A0c = r0
            r9.A0F = r3
            if (r6 != 0) goto L_0x0556
            r0 = 400(0x190, float:5.6E-43)
        L_0x0541:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r9.A0W = r0
            if (r2 != 0) goto L_0x054b
            java.lang.Integer r2 = X.C023109s.A00
        L_0x054b:
            r9.A0V = r2
            long r2 = r9.A0D
            r0 = 122880(0x1e000, double:6.0711E-319)
            long r2 = r2 | r0
            r9.A0D = r2
            return
        L_0x0556:
            int r0 = r6.intValue()
            goto L_0x0541
        L_0x055b:
            int r1 = r4.A01
            int r0 = r4.A00
            r4.A01 = r0
            java.lang.String r0 = r4.A03
            java.lang.String r0 = r0.substring(r1)
            goto L_0x0535
        L_0x0568:
            return
        L_0x0569:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C203809ou.A0K(X.AUW, java.lang.String, java.lang.String):void");
    }
}
