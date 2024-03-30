package X;

import android.content.Context;
import com.whatsapp.R;

/* renamed from: X.8fs  reason: invalid class name and case insensitive filesystem */
public class C178398fs extends AnonymousClass9Tc {
    public final C21100yf A00;
    public final C19970wo A01;
    public final C20810yC A02;
    public final AE0 A03;
    public final AnonymousClass1EZ A04;
    public final C202629mK A05;
    public final AF7 A06;
    public final AnonymousClass1FR A07;
    public final C19630wG A08;
    public final C202699mR A09;

    private String A00(C202319lY r24, C175928bI r25, boolean z) {
        AnonymousClass1FR r8 = this.A07;
        C202319lY r1 = r24;
        String A0Q = r8.A0Q(r1);
        C175928bI r0 = r25;
        if (r25 == null) {
            return "";
        }
        int i = r0.A01;
        if (i == 403) {
            int i2 = r1.A02;
            if (i2 == 405) {
                Context context = this.A08.A00;
                if (z) {
                    return context.getString(R.string.f12nameremoved);
                }
                return C36321k7.A0A(context, A0Q, R.string.f12nameremoved);
            } else if (!(i2 == 406 || i2 == 408 || i2 == 423 || i2 == 424)) {
                return "";
            }
        } else if (i != 423) {
            if (!(i == 424 && 408 == r1.A02)) {
                return "";
            }
        } else if (422 != r1.A02) {
            return "";
        }
        if (!z) {
            return AnonymousClass1FR.A09(r8, r8.A0P(r1), R.string.f12nameremoved, R.string.f12nameremoved, R.string.f12nameremoved, R.string.f12nameremoved, R.string.f12nameremoved, R.string.f12nameremoved, R.string.f12nameremoved, R.string.f12nameremoved, R.string.f12nameremoved, R.string.f12nameremoved, R.string.f12nameremoved, r1.A05);
        }
        return A0Q;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0032, code lost:
        if (r1 != 418) goto L_0x0034;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003f, code lost:
        if (android.text.TextUtils.isEmpty(r2.A0L) == false) goto L_0x0041;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String A01(X.C202319lY r5) {
        /*
            r4 = this;
            X.8av r2 = r5.A0A
            X.8bI r2 = (X.C175928bI) r2
            r3 = 1
            java.lang.String r1 = r4.A00(r5, r2, r3)
            int r0 = r5.A03
            if (r0 != r3) goto L_0x0014
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x0014
            return r1
        L_0x0014:
            if (r2 == 0) goto L_0x0044
            X.9jw r0 = r2.A0G
            if (r0 == 0) goto L_0x0039
            boolean r0 = r0.A0M
            if (r0 == 0) goto L_0x0039
            int r1 = r5.A02
            r0 = 20
            if (r1 == r0) goto L_0x0041
            r0 = 405(0x195, float:5.68E-43)
            if (r1 == r0) goto L_0x0041
            r0 = 415(0x19f, float:5.82E-43)
            if (r1 == r0) goto L_0x0041
            r0 = 417(0x1a1, float:5.84E-43)
            if (r1 == r0) goto L_0x0041
            r0 = 418(0x1a2, float:5.86E-43)
            if (r1 == r0) goto L_0x0041
        L_0x0034:
            java.lang.String r0 = super.A01(r5)
            return r0
        L_0x0039:
            java.lang.String r0 = r2.A0L
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0044
        L_0x0041:
            java.lang.String r0 = r2.A0O
            return r0
        L_0x0044:
            boolean r0 = r5.A0H()
            if (r0 == 0) goto L_0x0034
            boolean r0 = r5.A0L()
            if (r0 == 0) goto L_0x0034
            X.1FR r0 = r4.A07
            java.lang.String r0 = r0.A0Q(r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C178398fs.A01(X.9lY):java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0099, code lost:
        if (r1 != 417) goto L_0x009b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00be, code lost:
        if (r1 != 418) goto L_0x009b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String A02(X.C202319lY r14) {
        /*
            r13 = this;
            X.8av r3 = r14.A0A
            X.8bI r3 = (X.C175928bI) r3
            r10 = 0
            java.lang.String r1 = r13.A00(r14, r3, r10)
            int r0 = r14.A03
            r8 = 1
            if (r0 != r8) goto L_0x0015
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x0015
            return r1
        L_0x0015:
            if (r3 == 0) goto L_0x006f
            X.9jw r0 = r3.A0G
            if (r0 == 0) goto L_0x0039
            boolean r0 = r0.A0M
            if (r0 == 0) goto L_0x0039
            X.0yC r1 = r13.A02
            X.AE0 r0 = r13.A03
            java.lang.String r0 = r0.A0B()
            boolean r0 = X.C202699mR.A02(r1, r0)
            if (r0 != 0) goto L_0x0087
            X.9jw r0 = r3.A0G
            java.lang.String r0 = r0.A0E
            boolean r0 = X.C202699mR.A03(r0)
            if (r0 == 0) goto L_0x0087
        L_0x0037:
            r0 = 0
            return r0
        L_0x0039:
            java.lang.String r0 = r3.A0L
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x006f
            int r2 = r14.A02
            r0 = 12
            if (r2 != r0) goto L_0x0051
            X.9mR r0 = r13.A09
            X.0wG r0 = r0.A01
            android.content.Context r2 = r0.A00
            r0 = 2131895346(0x7f122432, float:1.9425522E38)
            goto L_0x0082
        L_0x0051:
            X.9mR r1 = r13.A09
            r0 = 405(0x195, float:5.68E-43)
            if (r2 != r0) goto L_0x0063
            X.0wG r0 = r1.A01
            android.content.Context r1 = r0.A00
            r0 = 2131895391(0x7f12245f, float:1.9425614E38)
        L_0x005e:
            java.lang.String r0 = r1.getString(r0)
            return r0
        L_0x0063:
            r0 = 406(0x196, float:5.69E-43)
            if (r2 != r0) goto L_0x0037
            X.0wG r0 = r1.A01
            android.content.Context r1 = r0.A00
            r0 = 2131895392(0x7f122460, float:1.9425616E38)
            goto L_0x005e
        L_0x006f:
            boolean r0 = r14.A0H()
            if (r0 == 0) goto L_0x009b
            boolean r0 = r14.A0L()
            if (r0 == 0) goto L_0x009b
            X.0wG r0 = r13.A08
            android.content.Context r2 = r0.A00
            r0 = 2131892040(0x7f121748, float:1.9418817E38)
        L_0x0082:
            java.lang.String r0 = r2.getString(r0)
            return r0
        L_0x0087:
            int r1 = r14.A02
            r0 = 20
            if (r1 == r0) goto L_0x023a
            r0 = 405(0x195, float:5.68E-43)
            if (r1 == r0) goto L_0x01a2
            r0 = 415(0x19f, float:5.82E-43)
            r4 = 418(0x1a2, float:5.86E-43)
            r2 = 417(0x1a1, float:5.84E-43)
            if (r1 == r0) goto L_0x00a2
            if (r1 == r2) goto L_0x00b6
        L_0x009b:
            X.1FR r0 = r13.A00
            java.lang.String r0 = r0.A0O(r14)
            return r0
        L_0x00a2:
            int r0 = r3.A01
            if (r0 == r4) goto L_0x00b6
            X.9mR r0 = r13.A09
            java.lang.String r2 = r3.A0O
            X.0wG r0 = r0.A01
            android.content.Context r1 = r0.A00
            r0 = 2131895407(0x7f12246f, float:1.9425646E38)
            java.lang.String r0 = X.C36351kA.A0w(r1, r2, r8, r0)
            return r0
        L_0x00b6:
            int r1 = r3.A01
            r0 = 401(0x191, float:5.62E-43)
            if (r1 == r0) goto L_0x0212
            if (r1 == r2) goto L_0x00c1
            if (r1 == r4) goto L_0x018a
            goto L_0x009b
        L_0x00c1:
            X.9jw r4 = r3.A0G
            X.9je r2 = r4.A0C
            java.lang.String r5 = "FAILURE"
            java.lang.String r6 = "SUCCESS"
            if (r2 == 0) goto L_0x012b
            java.lang.String r7 = r2.A09
            java.lang.String r0 = "INIT"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x00f7
            java.lang.String r1 = r2.A08
            java.lang.String r0 = "UNKNOWN"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00f7
            X.9mR r7 = r13.A09
            long r1 = r4.A01
            java.lang.String r0 = r4.A0E
            boolean r3 = X.C202699mR.A03(r0)
            X.0wG r0 = r7.A01
            if (r3 == 0) goto L_0x01ad
            android.content.Context r1 = r0.A00
            r0 = 2131895397(0x7f122465, float:1.9425626E38)
            java.lang.String r0 = r1.getString(r0)
            return r0
        L_0x00f7:
            boolean r0 = r7.equals(r6)
            java.lang.String r1 = "ACCEPT"
            if (r0 == 0) goto L_0x0112
            java.lang.String r0 = r2.A08
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0112
            X.9mR r0 = r13.A09
            X.0wG r0 = r0.A01
            android.content.Context r2 = r0.A00
            r0 = 2131895355(0x7f12243b, float:1.942554E38)
            goto L_0x0082
        L_0x0112:
            boolean r0 = r7.equals(r5)
            if (r0 == 0) goto L_0x0173
            java.lang.String r0 = r2.A08
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0173
            X.9mR r0 = r13.A09
            X.0wG r0 = r0.A01
            android.content.Context r2 = r0.A00
            r0 = 2131895354(0x7f12243a, float:1.9425539E38)
            goto L_0x0082
        L_0x012b:
            X.9iz r2 = r4.A0B
            if (r2 == 0) goto L_0x0173
            java.lang.String r1 = r2.A02
            java.lang.String r0 = "RESUME"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x015a
            java.lang.String r0 = "PAUSE"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0173
            java.lang.String r1 = r2.A03
            boolean r0 = r1.equals(r6)
            if (r0 != 0) goto L_0x01c1
            boolean r0 = r1.equals(r5)
            if (r0 == 0) goto L_0x015a
            X.9mR r0 = r13.A09
            X.0wG r0 = r0.A01
            android.content.Context r2 = r0.A00
            r0 = 2131895349(0x7f122435, float:1.9425529E38)
            goto L_0x0082
        L_0x015a:
            java.lang.String r1 = r2.A03
            boolean r0 = r1.equals(r6)
            if (r0 != 0) goto L_0x01e8
            boolean r0 = r1.equals(r5)
            if (r0 == 0) goto L_0x0173
            X.9mR r0 = r13.A09
            X.0wG r0 = r0.A01
            android.content.Context r2 = r0.A00
            r0 = 2131895352(0x7f122438, float:1.9425535E38)
            goto L_0x0082
        L_0x0173:
            java.lang.String r1 = r4.A0D
            java.lang.String r0 = r4.A0I
            if (r1 == 0) goto L_0x018a
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x018a
            X.9mR r0 = r13.A09
            X.0wG r0 = r0.A01
            android.content.Context r2 = r0.A00
            r0 = 2131895351(0x7f122437, float:1.9425533E38)
            goto L_0x0082
        L_0x018a:
            X.9mR r2 = r13.A09
            X.9jw r0 = r3.A0G
            java.lang.String r0 = r0.A0H
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            X.0wG r0 = r2.A01
            android.content.Context r2 = r0.A00
            r0 = 2131895347(0x7f122433, float:1.9425524E38)
            if (r1 == 0) goto L_0x0082
            r0 = 2131895348(0x7f122434, float:1.9425526E38)
            goto L_0x0082
        L_0x01a2:
            X.9mR r0 = r13.A09
            X.0wG r0 = r0.A01
            android.content.Context r2 = r0.A00
            r0 = 2131895426(0x7f122482, float:1.9425685E38)
            goto L_0x0082
        L_0x01ad:
            android.content.Context r6 = r0.A00
            r5 = 2131895396(0x7f122464, float:1.9425624E38)
            java.lang.Object[] r4 = new java.lang.Object[r8]
            X.0ts r3 = r7.A02
            X.0wo r0 = r7.A00
            java.lang.String r0 = X.C202699mR.A00(r0, r3, r1)
            java.lang.String r0 = X.C36391kE.A0v(r6, r0, r4, r10, r5)
            return r0
        L_0x01c1:
            X.9mR r11 = r13.A09
            long r0 = r2.A01
            long r2 = r2.A00
            X.0wG r4 = r11.A01
            android.content.Context r10 = r4.A00
            r9 = 2131895350(0x7f122436, float:1.942553E38)
            java.lang.Object[] r7 = X.AnonymousClass001.A0M()
            r5 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 / r5
            X.0ts r4 = r11.A02
            java.lang.String r1 = X.C20040wv.A09(r4, r0)
            r0 = 0
            r7[r0] = r1
            long r2 = r2 / r5
            java.lang.String r0 = X.C20040wv.A09(r4, r2)
            java.lang.String r0 = X.C36391kE.A0v(r10, r0, r7, r8, r9)
            return r0
        L_0x01e8:
            X.9mR r7 = r13.A09
            long r2 = r4.A04
            X.0wG r0 = r7.A01
            android.content.Context r5 = r0.A00
            r4 = 2131895353(0x7f122439, float:1.9425537E38)
            java.lang.Object[] r6 = new java.lang.Object[r8]
            X.0wo r8 = r7.A00
            java.lang.String r0 = "Asia/Kolkata"
            java.util.TimeZone r0 = java.util.TimeZone.getTimeZone(r0)
            int r0 = r0.getRawOffset()
            long r0 = (long) r0
            long r2 = r2 - r0
            long r1 = r8.A08(r2)
            X.0ts r0 = r7.A02
            java.lang.String r0 = X.C20040wv.A09(r0, r1)
            java.lang.String r0 = X.C36391kE.A0v(r5, r0, r6, r10, r4)
            return r0
        L_0x0212:
            X.9mR r9 = r13.A09
            X.16X r7 = r14.A08
            X.9jw r0 = r3.A0G
            long r2 = r0.A01
            X.0wG r0 = r9.A01
            android.content.Context r6 = r0.A00
            r5 = 2131895425(0x7f122481, float:1.9425683E38)
            java.lang.Object[] r4 = X.AnonymousClass001.A0M()
            X.16U r0 = X.AnonymousClass16W.A05
            X.0ts r1 = r9.A02
            java.lang.String r0 = r0.B7d(r1, r7)
            r4[r10] = r0
            X.0wo r0 = r9.A00
            java.lang.String r0 = X.C202699mR.A00(r0, r1, r2)
            java.lang.String r0 = X.C36391kE.A0v(r6, r0, r4, r8, r5)
            return r0
        L_0x023a:
            X.9mR r8 = r13.A09
            java.lang.String r7 = r3.A0O
            X.16X r9 = r14.A08
            X.9jw r2 = r3.A0G
            java.lang.String r10 = r2.A0G
            long r0 = r2.A02
            long r2 = r2.A01
            java.util.Calendar r5 = java.util.Calendar.getInstance()
            java.lang.String r12 = "Asia/Kolkata"
            java.util.TimeZone r4 = java.util.TimeZone.getTimeZone(r12)
            r5.setTimeInMillis(r0)
            r5.setTimeZone(r4)
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r11 = "ddMMyyyy"
            java.text.SimpleDateFormat r1 = new java.text.SimpleDateFormat
            r1.<init>(r11, r0)
            r1.setTimeZone(r4)
            java.util.Date r0 = r5.getTime()
            java.lang.String r6 = r1.format(r0)
            java.util.Calendar r5 = java.util.Calendar.getInstance()
            java.util.TimeZone r4 = java.util.TimeZone.getTimeZone(r12)
            r5.setTimeInMillis(r2)
            r5.setTimeZone(r4)
            java.util.Locale r0 = java.util.Locale.US
            java.text.SimpleDateFormat r1 = new java.text.SimpleDateFormat
            r1.<init>(r11, r0)
            r1.setTimeZone(r4)
            java.util.Date r0 = r5.getTime()
            java.lang.String r0 = r1.format(r0)
            boolean r5 = r6.equals(r0)
            r12 = 1
            r11 = 0
            r1 = 2
            java.lang.String r4 = "MAX"
            X.0wG r0 = r8.A01
            android.content.Context r6 = r0.A00
            boolean r0 = r4.equals(r10)
            if (r5 == 0) goto L_0x02ce
            r5 = 2131895427(0x7f122483, float:1.9425687E38)
            if (r0 == 0) goto L_0x02a7
            r5 = 2131895428(0x7f122484, float:1.9425689E38)
        L_0x02a7:
            r0 = 4
            java.lang.Object[] r4 = new java.lang.Object[r0]
            r4[r11] = r7
            X.16U r0 = X.AnonymousClass16W.A05
            X.0ts r7 = r8.A02
            java.lang.String r0 = r0.B7d(r7, r9)
            r4[r12] = r0
            java.lang.String r0 = r8.A06(r9, r10)
            java.lang.String r0 = X.C90514aH.A0y(r0)
            r4[r1] = r0
            r1 = 3
            X.0wo r0 = r8.A00
            java.lang.String r0 = X.C202699mR.A00(r0, r7, r2)
            r4[r1] = r0
        L_0x02c9:
            java.lang.String r0 = r6.getString(r5, r4)
            return r0
        L_0x02ce:
            r5 = 2131895429(0x7f122485, float:1.942569E38)
            if (r0 == 0) goto L_0x02d6
            r5 = 2131895430(0x7f122486, float:1.9425693E38)
        L_0x02d6:
            java.lang.Object[] r4 = new java.lang.Object[r1]
            X.16U r0 = X.AnonymousClass16W.A05
            X.0ts r1 = r8.A02
            java.lang.String r0 = r0.B7d(r1, r9)
            r4[r11] = r0
            X.0wo r0 = r8.A00
            java.lang.String r0 = X.C202699mR.A00(r0, r1, r2)
            r4[r12] = r0
            goto L_0x02c9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C178398fs.A02(X.9lY):java.lang.String");
    }

    public C178398fs(C21100yf r1, C19970wo r2, C19630wG r3, C20810yC r4, AE0 ae0, AnonymousClass1EZ r6, C202629mK r7, AF7 af7, C202699mR r9, AnonymousClass1FR r10) {
        super(r10);
        this.A01 = r2;
        this.A02 = r4;
        this.A08 = r3;
        this.A00 = r1;
        this.A07 = r10;
        this.A09 = r9;
        this.A04 = r6;
        this.A06 = af7;
        this.A05 = r7;
        this.A03 = ae0;
    }
}
