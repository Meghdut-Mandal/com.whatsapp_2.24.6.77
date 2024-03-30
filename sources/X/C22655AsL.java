package X;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.SimpleTimeZone;
import java.util.TimeZone;

/* renamed from: X.AsL  reason: case insensitive filesystem */
public class C22655AsL extends AnonymousClass121 {
    public byte[] A00;

    private SimpleDateFormat A04() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(A0J() ? "yyyyMMddHHmmss.SSSz" : A0L() ? "yyyyMMddHHmmssz" : A0K() ? "yyyyMMddHHmmz" : "yyyyMMddHHz");
        simpleDateFormat.setTimeZone(new SimpleTimeZone(0, "Z"));
        return simpleDateFormat;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        r2 = r1[r4];
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean A06(int r4) {
        /*
            r3 = this;
            byte[] r1 = r3.A00
            int r0 = r1.length
            if (r0 <= r4) goto L_0x0010
            byte r2 = r1[r4]
            r0 = 48
            if (r2 < r0) goto L_0x0010
            r1 = 57
            r0 = 1
            if (r2 <= r1) goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C22655AsL.A06(int):boolean");
    }

    public AnonymousClass121 A0B() {
        return new C22589ArH(this.A00);
    }

    public boolean A0E() {
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:9:0x002a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.Date A0I() {
        /*
            r5 = this;
            byte[] r0 = r5.A00
            java.lang.String r2 = X.AnonymousClass11q.A02(r0)
            java.lang.String r4 = "Z"
            boolean r0 = r2.endsWith(r4)
            r3 = 0
            if (r0 == 0) goto L_0x004c
            boolean r0 = r5.A0J()
            if (r0 == 0) goto L_0x0037
            java.lang.String r0 = "yyyyMMddHHmmss.SSS'Z'"
        L_0x0017:
            java.text.SimpleDateFormat r1 = new java.text.SimpleDateFormat
            r1.<init>(r0)
        L_0x001c:
            java.util.SimpleTimeZone r0 = new java.util.SimpleTimeZone
            r0.<init>(r3, r4)
            r1.setTimeZone(r0)
        L_0x0024:
            boolean r0 = r5.A0J()
            if (r0 == 0) goto L_0x002e
            java.lang.String r2 = A03(r2)
        L_0x002e:
            java.util.Date r0 = r1.parse(r2)
            java.util.Date r0 = X.C129916Iz.A00(r0)
            return r0
        L_0x0037:
            boolean r0 = r5.A0L()
            if (r0 == 0) goto L_0x0040
            java.lang.String r0 = "yyyyMMddHHmmss'Z'"
            goto L_0x0017
        L_0x0040:
            boolean r0 = r5.A0K()
            if (r0 == 0) goto L_0x0049
            java.lang.String r0 = "yyyyMMddHHmm'Z'"
            goto L_0x0017
        L_0x0049:
            java.lang.String r0 = "yyyyMMddHH'Z'"
            goto L_0x0017
        L_0x004c:
            r0 = 45
            int r0 = r2.indexOf(r0)
            if (r0 > 0) goto L_0x0087
            r0 = 43
            int r0 = r2.indexOf(r0)
            if (r0 > 0) goto L_0x0087
            boolean r0 = r5.A0J()
            if (r0 == 0) goto L_0x0072
            java.lang.String r0 = "yyyyMMddHHmmss.SSS"
        L_0x0064:
            java.text.SimpleDateFormat r1 = new java.text.SimpleDateFormat
            r1.<init>(r0)
            java.util.TimeZone r0 = java.util.TimeZone.getDefault()
            java.lang.String r4 = r0.getID()
            goto L_0x001c
        L_0x0072:
            boolean r0 = r5.A0L()
            if (r0 == 0) goto L_0x007b
            java.lang.String r0 = "yyyyMMddHHmmss"
            goto L_0x0064
        L_0x007b:
            boolean r0 = r5.A0K()
            if (r0 == 0) goto L_0x0084
            java.lang.String r0 = "yyyyMMddHHmm"
            goto L_0x0064
        L_0x0084:
            java.lang.String r0 = "yyyyMMddHH"
            goto L_0x0064
        L_0x0087:
            java.lang.String r2 = r5.A0H()
            java.text.SimpleDateFormat r1 = r5.A04()
            goto L_0x0024
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C22655AsL.A0I():java.util.Date");
    }

    public boolean A0J() {
        int i = 0;
        while (true) {
            byte[] bArr = this.A00;
            if (i == bArr.length) {
                return false;
            }
            if (bArr[i] == 46 && i == 14) {
                return true;
            }
            i++;
        }
    }

    public boolean A0K() {
        return A06(10) && A06(11);
    }

    public boolean A0L() {
        return A06(12) && A06(13);
    }

    public int hashCode() {
        return AnonymousClass124.A00(this.A00);
    }

    public static String A02(int i) {
        if (i < 10) {
            return AnonymousClass000.A0r("0", AnonymousClass000.A0u(), i);
        }
        return Integer.toString(i);
    }

    public static String A03(String str) {
        StringBuilder A0u;
        String str2;
        String substring = str.substring(14);
        int i = 1;
        while (i < substring.length() && '0' <= (r1 = substring.charAt(i)) && r1 <= '9') {
            i++;
        }
        int i2 = i - 1;
        if (i2 > 3) {
            A0u = AnonymousClass000.A0u();
            str2 = substring.substring(0, 4);
        } else if (i2 == 1) {
            A0u = AnonymousClass000.A0u();
            C165577te.A1O(substring, A0u, 0, i);
            str2 = "00";
        } else if (i2 != 2) {
            return str;
        } else {
            A0u = AnonymousClass000.A0u();
            C165577te.A1O(substring, A0u, 0, i);
            str2 = "0";
        }
        A0u.append(str2);
        return AnonymousClass000.A0p(str.substring(0, 14), AnonymousClass000.A0q(substring.substring(i), A0u), AnonymousClass000.A0u());
    }

    public static C22655AsL A05(Object obj) {
        if (obj == null || (obj instanceof C22655AsL)) {
            return (C22655AsL) obj;
        }
        if (obj instanceof byte[]) {
            try {
                return (C22655AsL) AnonymousClass121.A00((byte[]) obj);
            } catch (Exception e) {
                StringBuilder A0u = AnonymousClass000.A0u();
                throw AnonymousClass000.A0c(C90494aF.A0c(e, "encoding error in getInstance: ", A0u), A0u);
            }
        } else {
            throw C165567td.A0N(obj, "illegal object in getInstance: ", AnonymousClass000.A0u());
        }
    }

    public int A0A() {
        byte[] bArr;
        if (this instanceof C22589ArH) {
            bArr = C22589ArH.A01((C22589ArH) this);
        } else {
            bArr = this.A00;
        }
        int length = bArr.length;
        return C201849kY.A01(length) + 1 + length;
    }

    public AnonymousClass121 A0C() {
        if (this instanceof C22589ArH) {
            return this;
        }
        return new C22589ArH(this.A00);
    }

    public void A0D(C200179gm r3, boolean z) {
        byte[] bArr;
        if (this instanceof C22589ArH) {
            bArr = C22589ArH.A01((C22589ArH) this);
        } else {
            bArr = this.A00;
        }
        r3.A04(bArr, 24, z);
    }

    public boolean A0F(AnonymousClass121 r3) {
        if (!(r3 instanceof C22655AsL)) {
            return false;
        }
        return Arrays.equals(this.A00, ((C22655AsL) r3).A00);
    }

    public String A0H() {
        StringBuilder sb;
        String str;
        StringBuilder A0v;
        String str2;
        String A0q;
        String A02 = AnonymousClass11q.A02(this.A00);
        int length = A02.length();
        int i = length - 1;
        if (A02.charAt(i) == 'Z') {
            A0v = AnonymousClass000.A0u();
            C165577te.A1O(A02, A0v, 0, i);
            A0q = "GMT+00:00";
        } else {
            int i2 = length - 6;
            char charAt = A02.charAt(i2);
            if ((charAt == '-' || charAt == '+') && A02.indexOf("GMT") == i2 - 3) {
                return A02;
            }
            int i3 = length - 5;
            char charAt2 = A02.charAt(i3);
            if (charAt2 == '-' || charAt2 == '+') {
                sb = AnonymousClass000.A0u();
                C165577te.A1O(A02, sb, 0, i3);
                sb.append("GMT");
                int i4 = i3 + 3;
                C165577te.A1O(A02, sb, i3, i4);
                sb.append(":");
                str = A02.substring(i4);
            } else {
                int i5 = length - 3;
                char charAt3 = A02.charAt(i5);
                if (charAt3 == '-' || charAt3 == '+') {
                    sb = AnonymousClass000.A0u();
                    C165577te.A1O(A02, sb, 0, i5);
                    sb.append("GMT");
                    sb.append(A02.substring(i5));
                    str = ":00";
                } else {
                    A0v = AnonymousClass000.A0v(A02);
                    TimeZone timeZone = TimeZone.getDefault();
                    int rawOffset = timeZone.getRawOffset();
                    if (rawOffset < 0) {
                        rawOffset = -rawOffset;
                        str2 = "-";
                    } else {
                        str2 = "+";
                    }
                    int i6 = rawOffset / 3600000;
                    int i7 = (rawOffset - (((i6 * 60) * 60) * 1000)) / 60000;
                    try {
                        if (timeZone.useDaylightTime()) {
                            if (A0J()) {
                                A02 = A03(A02);
                            }
                            SimpleDateFormat A04 = A04();
                            StringBuilder A0u = AnonymousClass000.A0u();
                            AnonymousClass000.A1D(A02, "GMT", str2, A0u);
                            A0u.append(A02(i6));
                            A0u.append(":");
                            if (timeZone.inDaylightTime(A04.parse(AnonymousClass000.A0q(A02(i7), A0u)))) {
                                int i8 = -1;
                                if (str2.equals("+")) {
                                    i8 = 1;
                                }
                                i6 += i8;
                            }
                        }
                    } catch (ParseException unused) {
                    }
                    StringBuilder A0k = C36331k8.A0k("GMT", str2);
                    A0k.append(A02(i6));
                    A0k.append(":");
                    A0q = AnonymousClass000.A0q(A02(i7), A0k);
                }
            }
            return AnonymousClass000.A0q(str, sb);
        }
        return AnonymousClass000.A0q(A0q, A0v);
    }

    public C22655AsL(byte[] bArr) {
        if (bArr.length >= 4) {
            this.A00 = bArr;
            if (!A06(0) || !A06(1) || !A06(2) || !A06(3)) {
                throw AnonymousClass001.A08("illegal characters in GeneralizedTime string");
            }
            return;
        }
        throw AnonymousClass001.A08("GeneralizedTime string too short");
    }

    public C22655AsL(String str) {
        this.A00 = AnonymousClass11q.A03(str);
        try {
            A0I();
        } catch (ParseException e) {
            throw AnonymousClass001.A08(C36331k8.A0i("invalid date string: ", AnonymousClass000.A0u(), e));
        }
    }
}
