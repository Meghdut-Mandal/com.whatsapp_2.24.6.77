package X;

import android.content.Context;
import android.content.res.Resources;
import com.whatsapp.R;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.9gv  reason: invalid class name and case insensitive filesystem */
public abstract class C200239gv {
    public C88874Uj A00;
    public final C18820ts A01;
    public final AnonymousClass1A5 A02;
    public final C20810yC A03;
    public final AnonymousClass1EV A04;
    public final AnonymousClass1EU A05;
    public final AnonymousClass1FR A06;
    public final Resources A07;
    public final C19970wo A08;
    public final C32681e1 A09;
    public final AnonymousClass185 A0A;

    public AnonymousClass9SC A01(Context context, C202319lY r11, C206929uE r12, C206909uC r13, String str, int i) {
        C206929uE r4 = r12;
        int i2 = i;
        if (r11 != null) {
            AnonymousClass1EU r1 = this.A05;
            C23083B3q BAJ = r1.A05().BAJ();
            if (this.A06.A0f(r11, r1.A05().BE1(), BAJ, 2)) {
                return new AnonymousClass9SC(r4, (C206909uC) null, context.getString(R.string.f12nameremoved), (List) null, i2);
            }
        }
        return new AnonymousClass9SC(r4, r13, str, (List) null, i2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0088, code lost:
        if (r0 != false) goto L_0x008a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x008a, code lost:
        r51 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x0746, code lost:
        if (r0.A0E(5575) == false) goto L_0x07f8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x0782, code lost:
        if (r0.contains(r3) == false) goto L_0x0784;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0143, code lost:
        if (X.C207199ui.A00(r41.A01) != 1) goto L_0x008a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x036f  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x0422  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x0426  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x047e  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x0482  */
    /* JADX WARNING: Removed duplicated region for block: B:190:0x0734  */
    /* JADX WARNING: Removed duplicated region for block: B:198:0x0760  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:223:0x07ee  */
    /* JADX WARNING: Removed duplicated region for block: B:226:0x080a  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x017d  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x018c  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x019e  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x01b6  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01e8  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0209 A[LOOP:1: B:82:0x0203->B:84:0x0209, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x022d  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0232  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0271  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x02ee  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0319  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C194219Oo A02(android.content.Context r73, X.C202319lY r74, X.C23043B1o r75, java.util.List r76) {
        /*
            r72 = this;
            r34 = r75
            r0 = r34
            X.3T1 r0 = (X.AnonymousClass3T1) r0
            r36 = r0
            X.9ui r12 = X.C207219uk.A00(r34)
            X.9uP r0 = r12.A09
            r41 = r0
            r0 = r36
            X.3Qa r0 = r0.A1J
            X.11F r0 = r0.A00
            r39 = r0
            X.C18740tg.A06(r39)
            r5 = r72
            X.1A5 r2 = r5.A02
            X.141 r27 = r2.A01(r0)
            java.lang.String r0 = r27.A0J()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0191
            java.lang.String r40 = r27.A0K()
        L_0x0031:
            boolean r0 = android.text.TextUtils.isEmpty(r40)
            r3 = 1
            r52 = r0 ^ 1
            X.1FR r14 = r5.A06
            r0 = r41
            int r47 = r14.A0E(r0)
            X.0ts r0 = r5.A01
            r33 = r0
            java.lang.String r37 = r12.A06(r0)
            r0 = r41
            X.9uM r0 = r0.A06
            r32 = r0
            r17 = r74
            r0 = r17
            boolean r57 = r14.A0g(r0, r12)
            X.1EV r0 = r14.A08
            r18 = r0
            java.lang.String r13 = r12.A0E
            boolean r0 = r0.A0I(r13)
            r50 = 0
            if (r0 == 0) goto L_0x006e
            if (r74 == 0) goto L_0x006e
            boolean r0 = r17.A0L()
            if (r0 == 0) goto L_0x006e
            r50 = 1
        L_0x006e:
            boolean r0 = r5 instanceof X.C180418ll
            r19 = r0
            if (r0 != 0) goto L_0x0168
            boolean r0 = r5 instanceof X.C180428lm
            if (r0 != 0) goto L_0x0168
            X.1EV r1 = r5.A04
            boolean r0 = r1.A0I(r13)
            r51 = 0
            if (r0 == 0) goto L_0x0133
            if (r74 == 0) goto L_0x008c
            boolean r0 = r17.A0L()
        L_0x0088:
            if (r0 == 0) goto L_0x008c
        L_0x008a:
            r51 = 1
        L_0x008c:
            if (r51 != 0) goto L_0x016a
            r22 = 0
        L_0x0090:
            X.9uM r0 = r12.A0B
            X.9ua r29 = r12.A03(r0)
            r0 = r41
            X.9uM r1 = r0.A03
            if (r1 != 0) goto L_0x0110
            r6 = 0
            r11 = 0
        L_0x009f:
            r43 = 0
        L_0x00a1:
            X.0yC r0 = r5.A03
            r31 = r0
            r1 = 6012(0x177c, float:8.425E-42)
            boolean r0 = r0.A0E(r1)
            if (r0 == 0) goto L_0x010d
            if (r74 == 0) goto L_0x010d
            X.9ua r0 = r17.A04()
            if (r0 == 0) goto L_0x010d
            X.9ua r0 = r17.A04()
            X.16U r2 = r0.A01
            X.16X r0 = r0.A02
            java.math.BigDecimal r1 = r0.A00
            r0 = r33
            java.lang.String r1 = r2.B7e(r0, r1)
            if (r1 == 0) goto L_0x010d
            boolean r2 = X.C36351kA.A1Y(r33)
            java.lang.String r0 = "–"
            if (r2 == 0) goto L_0x0108
            java.lang.StringBuilder r0 = X.C36331k8.A0k(r0, r1)
        L_0x00d3:
            java.lang.String r44 = r0.toString()
        L_0x00d7:
            r0 = r41
            X.9uM r0 = r0.A04
            r30 = r0
            r0 = r41
            java.util.List r15 = r0.A09
            java.util.Iterator r16 = r15.iterator()
            r4 = 0
        L_0x00e6:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x0197
            java.lang.Object r0 = r16.next()
            X.9uJ r0 = (X.C206959uJ) r0
            int r8 = r0.A01
            int r4 = r4 + r8
            X.9uM r2 = r0.A03
            if (r2 == 0) goto L_0x00e6
            X.9uM r0 = r0.A02
            long r0 = r0.A01
            long r9 = r2.A01
            long r0 = r0 - r9
            long r8 = (long) r8
            long r0 = r0 * r8
            long r6 = r6 + r0
            if (r11 != 0) goto L_0x00e6
            int r11 = r2.A00
            goto L_0x00e6
        L_0x0108:
            java.lang.StringBuilder r0 = X.C36331k8.A0k(r1, r0)
            goto L_0x00d3
        L_0x010d:
            r44 = 0
            goto L_0x00d7
        L_0x0110:
            long r6 = r1.A01
            int r11 = r1.A00
            r0 = r33
            java.lang.String r1 = r12.A07(r0, r1)
            if (r1 == 0) goto L_0x009f
            boolean r2 = X.C36351kA.A1Y(r33)
            java.lang.String r0 = "–"
            if (r2 == 0) goto L_0x012e
            java.lang.StringBuilder r0 = X.C36331k8.A0k(r0, r1)
        L_0x0128:
            java.lang.String r43 = r0.toString()
            goto L_0x00a1
        L_0x012e:
            java.lang.StringBuilder r0 = X.C36331k8.A0k(r1, r0)
            goto L_0x0128
        L_0x0133:
            java.util.List r0 = r12.A0L
            boolean r0 = r1.A0K(r0)
            if (r0 == 0) goto L_0x0147
            r0 = r41
            java.lang.String r0 = r0.A01
            int r0 = X.C207199ui.A00(r0)
            if (r0 == r3) goto L_0x008c
            goto L_0x008a
        L_0x0147:
            java.lang.String r0 = r12.A06
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0158
            r0 = r41
            int r1 = r14.A0E(r0)
            r0 = 4
            if (r1 != r0) goto L_0x008c
        L_0x0158:
            if (r74 == 0) goto L_0x0160
            boolean r0 = r17.A0H()
            if (r0 != 0) goto L_0x008c
        L_0x0160:
            r0 = r39
            boolean r0 = r14.A0h(r0)
            goto L_0x0088
        L_0x0168:
            r51 = 1
        L_0x016a:
            X.C18740tg.A06(r39)
            r0 = r39
            X.141 r1 = r2.A01(r0)
            java.lang.String r0 = r1.A0J()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x018c
            java.lang.String r2 = r1.A0K()
        L_0x0181:
            X.9Hi r22 = new X.9Hi
            r1 = r22
            r0 = r39
            r1.<init>(r0, r2)
            goto L_0x0090
        L_0x018c:
            java.lang.String r2 = r1.A0J()
            goto L_0x0181
        L_0x0191:
            java.lang.String r40 = r27.A0J()
            goto L_0x0031
        L_0x0197:
            int r0 = r15.size()
            r8 = 2
            if (r0 >= r8) goto L_0x0232
            android.content.res.Resources r0 = r5.A07
            r28 = r0
            r2 = 2131891926(0x7f1216d6, float:1.9418586E38)
            java.lang.Object[] r0 = new java.lang.Object[r3]
            boolean r15 = X.C36361kB.A1b(r0, r4)
            r1 = r28
            r1.getString(r2, r0)
        L_0x01b0:
            r0 = r41
            X.9uB r0 = r0.A02
            if (r0 == 0) goto L_0x022d
            r9 = 2131891859(0x7f121693, float:1.941845E38)
            java.lang.Object[] r4 = new java.lang.Object[r8]
            long r0 = r0.A00
            r2 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r2
            r2 = r33
            java.text.DateFormat r3 = X.C20040wv.A0C(r2, r15)
            java.util.Date r2 = new java.util.Date
            r2.<init>(r0)
            java.lang.String r2 = r3.format(r2)
            r4[r15] = r2
            X.0wo r3 = r5.A08
            r2 = r33
            java.lang.String r1 = X.C165607th.A0q(r3, r2, r0)
            r3 = 1
            r0 = r28
            java.lang.String r38 = X.C36411kG.A0w(r0, r1, r4, r3, r9)
            r1 = 0
        L_0x01e2:
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            r21 = 0
            if (r0 <= 0) goto L_0x01f5
            X.9uM r1 = new X.9uM
            r0 = r21
            r1.<init>(r6, r11, r0)
            r0 = r33
            java.lang.String r21 = r12.A07(r0, r1)
        L_0x01f5:
            java.util.HashMap r23 = X.AnonymousClass001.A0J()
            r2 = r73
            java.util.HashMap r0 = r5.A04(r2)
            java.util.Iterator r6 = X.C36371kC.A10(r0)
        L_0x0203:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0244
            java.util.Map$Entry r0 = X.AnonymousClass000.A11(r6)
            java.lang.Object r4 = r0.getKey()
            int r64 = X.C165577te.A08(r0)
            r61 = 0
            java.lang.String r63 = X.C90514aH.A10(r0)
            r58 = r5
            r59 = r2
            r60 = r17
            r62 = r61
            X.9SC r1 = r58.A01(r59, r60, r61, r62, r63, r64)
            r0 = r23
            r0.put(r4, r1)
            goto L_0x0203
        L_0x022d:
            r1 = 0
            r38 = 0
            goto L_0x01e2
        L_0x0232:
            r15 = 0
            android.content.res.Resources r1 = r5.A07
            r28 = r1
            r4 = 2131755259(0x7f1000fb, float:1.9141392E38)
            java.lang.Object[] r2 = new java.lang.Object[r3]
            X.AnonymousClass000.A1L(r2, r0, r15)
            r1.getQuantityString(r4, r0, r2)
            goto L_0x01b0
        L_0x0244:
            r0 = r17
            java.util.HashMap r1 = r5.A05(r2, r0, r12)
            r0 = r23
            r0.putAll(r1)
            X.185 r1 = r5.A0A
            com.whatsapp.jid.UserJid r0 = X.C36401kF.A0b(r39)
            boolean r20 = r1.A04(r0)
            r6 = r17
            r7 = r12
            r8 = r23
            r9 = r47
            r10 = r20
            boolean r53 = r5.A03(r6, r7, r8, r9, r10)
            X.1EV r0 = r5.A04
            r26 = r0
            boolean r0 = r0.A0I(r13)
            r7 = 3
            if (r0 == 0) goto L_0x047e
            java.util.HashMap r0 = r26.A07()
            java.lang.Object r6 = r0.get(r13)
            X.C18740tg.A06(r6)
            X.1e1 r8 = r5.A09
            r4 = 2131896901(0x7f122a45, float:1.9428676E38)
            java.lang.Object[] r1 = new java.lang.Object[r3]
            r0 = r28
            java.lang.String r60 = X.C36411kG.A0w(r0, r6, r1, r15, r4)
            java.lang.String r4 = "p2m-lite-wa-terms"
            java.lang.String r1 = "p2m-lite-wa-policies"
            java.lang.String r0 = "p2m-lite-meta-privacy-policy"
            java.lang.String[] r62 = new java.lang.String[]{r4, r1, r0}
            java.lang.String[] r1 = new java.lang.String[r7]
            r4 = 2669(0xa6d, float:3.74E-42)
            r0 = r31
            java.lang.String r0 = r0.A09(r4)
            r1[r15] = r0
            r4 = 2670(0xa6e, float:3.741E-42)
            r0 = r31
            java.lang.String r0 = r0.A09(r4)
            r1[r3] = r0
            r4 = 2671(0xa6f, float:3.743E-42)
            r0 = r31
            java.lang.String r0 = r0.A09(r4)
            r6 = 2
            r1[r6] = r0
            java.lang.Runnable[] r0 = new java.lang.Runnable[r7]
            X.AWj r4 = X.C21689AWj.A00
            r0[r15] = r4
            X.AWm r4 = X.C21692AWm.A00
            r0[r3] = r4
            X.AWp r4 = X.C21695AWp.A00
            r0[r6] = r4
            r58 = r8
            r59 = r2
            r61 = r0
            r63 = r1
            android.text.SpannableString r35 = r58.A01(r59, r60, r61, r62, r63)
        L_0x02ce:
            java.util.List r10 = r12.A0L
            r0 = r18
            boolean r16 = r0.A0K(r10)
            X.1EU r0 = r5.A05
            X.B66 r0 = r0.A05()
            boolean r0 = r0.BMa()
            if (r0 == 0) goto L_0x0313
            if (r16 != 0) goto L_0x0313
            X.8z2 r0 = r14.A0I(r12)
            X.8z2 r1 = X.C188098z2.TOS_V1
            java.lang.String r9 = "https://www.whatsapp.com/legal/privacy-policy"
            if (r0 != r1) goto L_0x0426
            X.1e1 r8 = r5.A09
            r1 = 2131892042(0x7f12174a, float:1.9418821E38)
            r0 = r28
            java.lang.String r60 = r0.getString(r1)
            java.lang.String r0 = "p2m-hybrid-wa-policies"
            java.lang.String[] r62 = new java.lang.String[]{r0}
            java.lang.String[] r63 = new java.lang.String[]{r9}
            java.lang.Runnable[] r0 = new java.lang.Runnable[r3]
            X.AWq r1 = X.C21696AWq.A00
            r0[r15] = r1
        L_0x0309:
            r58 = r8
            r59 = r2
            r61 = r0
            android.text.SpannableString r35 = r58.A01(r59, r60, r61, r62, r63)
        L_0x0313:
            X.9u5 r0 = r12.A04()
            if (r0 == 0) goto L_0x0422
            int r3 = r0.A00
            r1 = 4443(0x115b, float:6.226E-42)
            r0 = r31
            boolean r0 = r0.A0E(r1)
            r1 = 1
            if (r0 == 0) goto L_0x041f
            if (r3 <= r1) goto L_0x041f
        L_0x0328:
            X.9tD r18 = new X.9tD
            r4 = r76
            r0 = r18
            r0.<init>(r3, r4, r1)
        L_0x0331:
            X.1e1 r7 = r5.A09
            r1 = 2131890686(0x7f1211fe, float:1.941607E38)
            r0 = r28
            java.lang.String r60 = r0.getString(r1)
            java.lang.String r24 = "installment-learn-more"
            java.lang.String[] r62 = new java.lang.String[]{r24}
            r1 = 1
            java.lang.String[] r6 = new java.lang.String[r1]
            r3 = 4144(0x1030, float:5.807E-42)
            r0 = r31
            java.lang.String r0 = r0.A09(r3)
            r6[r15] = r0
            r0 = 3
            java.lang.Runnable[] r0 = new java.lang.Runnable[r0]
            X.AWl r3 = X.C21691AWl.A00
            r0[r15] = r3
            X.AWn r3 = X.C21693AWn.A00
            r0[r1] = r3
            X.AWo r1 = X.C21694AWo.A00
            r4 = 2
            r0[r4] = r1
            r58 = r7
            r59 = r2
            r61 = r0
            r63 = r6
            android.text.SpannableString r25 = r58.A01(r59, r60, r61, r62, r63)
            boolean r0 = r5 instanceof X.C180408lk
            if (r0 == 0) goto L_0x0482
            r1 = 0
            X.AnonymousClass00C.A0D(r2, r1)
            java.util.ArrayList r9 = X.AnonymousClass001.A0I()
            java.util.List r4 = r12.A0J
            if (r4 != 0) goto L_0x037d
            if (r16 == 0) goto L_0x0726
        L_0x037d:
            r0 = r41
            java.lang.String r0 = r0.A01
            int r3 = X.C207199ui.A00(r0)
            r0 = 1
            if (r3 != r0) goto L_0x0726
            X.AnonymousClass00C.A07(r31)
            r3 = 1767(0x6e7, float:2.476E-42)
            r0 = r31
            java.lang.String r3 = r0.A09(r3)
            r0 = 0
            java.util.LinkedHashMap r6 = X.AnonymousClass9Za.A01(r2, r3, r10)
            if (r16 != 0) goto L_0x071b
            r3 = 2131891920(0x7f1216d0, float:1.9418574E38)
            java.lang.String r64 = X.C36361kB.A0m(r2, r3)
            r3 = 2131891919(0x7f1216cf, float:1.9418572E38)
            java.lang.String r66 = X.C36361kB.A0m(r2, r3)
            r3 = 2131887154(0x7f120432, float:1.9408907E38)
            java.lang.String r68 = X.C36361kB.A0m(r2, r3)
            X.9Vr r7 = new X.9Vr
            r7.<init>(r0, r1)
            X.9Vp r3 = new X.9Vp
            r3.<init>(r0, r1)
            X.9Vq r2 = new X.9Vq
            r2.<init>(r0, r1)
            java.lang.String r62 = "WhatsappPay"
            java.lang.String r63 = ""
            X.9tH r1 = new X.9tH
            r67 = r63
            r70 = 0
            r71 = 0
            r58 = r1
            r59 = r3
            r60 = r2
            r61 = r7
            r65 = r63
            r69 = r0
            r58.<init>(r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70, r71)
            r9.add(r1)
            if (r4 == 0) goto L_0x0726
            java.util.Iterator r4 = r4.iterator()
        L_0x03e2:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0726
            java.lang.Object r1 = r4.next()
            X.9uE r1 = (X.C206929uE) r1
            java.lang.String r0 = r1.A01
            X.AnonymousClass00C.A07(r0)
            java.lang.Object r0 = r6.get(r0)
            X.9tH r0 = (X.C206369tH) r0
            if (r0 == 0) goto L_0x03e2
            java.lang.String r1 = r1.A02
            if (r1 == 0) goto L_0x03e2
            java.util.List r2 = r0.A0B
            if (r2 == 0) goto L_0x03e2
            java.util.Iterator r3 = r2.iterator()
        L_0x0407:
            boolean r2 = r3.hasNext()
            if (r2 == 0) goto L_0x03e2
            java.lang.String r2 = X.AnonymousClass001.A0C(r3)
            java.util.regex.Pattern r2 = java.util.regex.Pattern.compile(r2)
            boolean r2 = X.C36361kB.A1Z(r1, r2)
            if (r2 == 0) goto L_0x0407
            r9.add(r0)
            goto L_0x03e2
        L_0x041f:
            r1 = 0
            goto L_0x0328
        L_0x0422:
            r18 = 0
            goto L_0x0331
        L_0x0426:
            X.8z2 r8 = X.C188098z2.TOS_V2
            java.lang.String r7 = "https://www.whatsapp.com/legal/payments/india/psp"
            java.lang.String r6 = "https://www.whatsapp.com/legal/payments/india/terms"
            java.lang.String r4 = "payment-provider-terms"
            java.lang.String r1 = "terms"
            if (r0 != r8) goto L_0x0452
            X.1e1 r8 = r5.A09
            r9 = 2131892043(0x7f12174b, float:1.9418823E38)
            r0 = r28
            java.lang.String r60 = r0.getString(r9)
            java.lang.String[] r62 = new java.lang.String[]{r1, r4}
            java.lang.String[] r63 = new java.lang.String[]{r6, r7}
            r0 = 2
            java.lang.Runnable[] r0 = new java.lang.Runnable[r0]
            X.AWr r1 = X.C21697AWr.A00
            r0[r15] = r1
            X.AWs r1 = X.C21698AWs.A00
            r0[r3] = r1
            goto L_0x0309
        L_0x0452:
            X.8z2 r3 = X.C188098z2.TOS_ALL
            if (r0 != r3) goto L_0x0313
            X.1e1 r8 = r5.A09
            r3 = 2131892041(0x7f121749, float:1.941882E38)
            r0 = r28
            java.lang.String r60 = r0.getString(r3)
            java.lang.String r0 = "privacy-policy"
            java.lang.String[] r62 = new java.lang.String[]{r1, r0, r4}
            java.lang.String[] r63 = new java.lang.String[]{r6, r9, r7}
            r0 = 3
            java.lang.Runnable[] r0 = new java.lang.Runnable[r0]
            X.AWt r1 = X.C21699AWt.A00
            r0[r15] = r1
            X.AWu r3 = X.C21700AWu.A00
            r1 = 1
            r0[r1] = r3
            X.AWk r3 = X.C21690AWk.A00
            r1 = 2
            r0[r1] = r3
            goto L_0x0309
        L_0x047e:
            r35 = 0
            goto L_0x02ce
        L_0x0482:
            if (r19 == 0) goto L_0x04e5
            r1 = 0
            X.AnonymousClass00C.A0D(r2, r1)
            r0 = r23
            java.lang.Object r0 = X.C90484aE.A0j(r0, r4)
            X.9SC r0 = (X.AnonymousClass9SC) r0
            java.util.ArrayList r9 = X.AnonymousClass001.A0I()
            if (r0 == 0) goto L_0x0726
            r3 = 2131891939(0x7f1216e3, float:1.9418612E38)
            java.lang.String r64 = X.C36361kB.A0m(r2, r3)
            X.9uE r3 = r0.A02
            r0 = 0
            if (r3 == 0) goto L_0x04e3
            java.lang.String r6 = r3.A00
        L_0x04a4:
            X.C18740tg.A06(r6)
            X.AnonymousClass00C.A08(r6)
            r3 = 2131888203(0x7f12084b, float:1.9411035E38)
            java.lang.String r68 = X.C36361kB.A0m(r2, r3)
            X.9Vr r4 = new X.9Vr
            r4.<init>(r0, r1)
            X.9Vp r3 = new X.9Vp
            r3.<init>(r0, r1)
            X.9Vq r2 = new X.9Vq
            r2.<init>(r0, r1)
            java.lang.String r62 = "CustomPaymentInstructions"
            java.lang.String r63 = ""
            r70 = 2131233371(0x7f080a5b, float:1.8082878E38)
            X.9tH r1 = new X.9tH
            r67 = r63
            r71 = 0
            r58 = r1
            r59 = r3
            r60 = r2
            r61 = r4
            r65 = r63
            r66 = r6
            r69 = r0
            r58.<init>(r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70, r71)
            r9.add(r1)
            goto L_0x0726
        L_0x04e3:
            r6 = r0
            goto L_0x04a4
        L_0x04e5:
            boolean r0 = r5 instanceof X.C180428lm
            if (r0 == 0) goto L_0x06a3
            r3 = r5
            X.8lm r3 = (X.C180428lm) r3
            r1 = 0
            r10 = 0
            X.9Vp r11 = new X.9Vp
            r11.<init>(r10, r1)
            if (r18 == 0) goto L_0x055a
            r0 = r18
            boolean r14 = r0.A02
            X.0yC r8 = r3.A03
            r0 = 4443(0x115b, float:6.226E-42)
            boolean r0 = r8.A0E(r0)
            if (r0 == 0) goto L_0x06a0
            X.9ti r0 = r18.A00()
            if (r0 == 0) goto L_0x06a0
            int r6 = r0.A00
            X.9ua r0 = r0.A01
            if (r0 == 0) goto L_0x06a0
            android.content.res.Resources r13 = r2.getResources()
            r11 = 2131892226(0x7f121802, float:1.9419194E38)
            java.lang.Object[] r7 = new java.lang.Object[r4]
            X.C36431kI.A1O(r7, r6, r1)
            X.16U r9 = X.AnonymousClass16W.A04
            X.0ts r6 = r3.A00
            X.16X r0 = r0.A02
            java.math.BigDecimal r0 = r0.A00
            java.lang.String r0 = r9.B7e(r6, r0)
            r6 = 1
            java.lang.String r60 = X.C36411kG.A0w(r13, r0, r7, r6, r11)
            X.1e1 r9 = r3.A03
            java.lang.String[] r62 = new java.lang.String[]{r24}
            java.lang.String[] r7 = new java.lang.String[r6]
            r0 = 4144(0x1030, float:5.807E-42)
            java.lang.String r0 = r8.A09(r0)
            r7[r1] = r0
            r0 = 3
            java.lang.Runnable[] r0 = new java.lang.Runnable[r0]
            X.AWE r8 = X.AWE.A00
            r0[r1] = r8
            X.AWF r8 = X.AWF.A00
            r0[r6] = r8
            X.AWG r6 = X.AWG.A00
            r0[r4] = r6
            r58 = r9
            r61 = r0
            r63 = r7
            android.text.SpannableString r0 = r58.A01(r59, r60, r61, r62, r63)
        L_0x0555:
            X.9Vp r11 = new X.9Vp
            r11.<init>(r0, r14)
        L_0x055a:
            r0 = r23
            java.lang.Object r4 = X.C90484aE.A0j(r0, r4)
            X.9SC r4 = (X.AnonymousClass9SC) r4
            java.lang.Object r24 = X.C90484aE.A0j(r0, r1)
            r6 = 6
            java.lang.Object r0 = X.C90484aE.A0j(r0, r6)
            java.util.ArrayList r9 = X.AnonymousClass001.A0I()
            if (r0 == 0) goto L_0x05c7
            X.1EV r0 = r3.A01
            X.0yC r6 = r0.A02
            r0 = 4780(0x12ac, float:6.698E-42)
            boolean r0 = r6.A0E(r0)
            if (r0 == 0) goto L_0x05c7
            r0 = 2131891940(0x7f1216e4, float:1.9418614E38)
            java.lang.String r14 = r2.getString(r0)
            r0 = 2131887154(0x7f120432, float:1.9408907E38)
            java.lang.String r13 = r2.getString(r0)
            android.text.SpannableString r0 = X.C180428lm.A00(r2, r3)
            X.9Vr r8 = new X.9Vr
            r8.<init>(r0, r1)
            X.9Vp r7 = new X.9Vp
            r7.<init>(r10, r1)
            X.9Vq r6 = new X.9Vq
            r6.<init>(r10, r1)
            java.lang.String r62 = "pix"
            java.lang.String r63 = ""
            r70 = 2131233502(0x7f080ade, float:1.8083143E38)
            r0 = 3
            X.C36381kD.A1K(r14, r0, r13)
            X.9tH r0 = new X.9tH
            r66 = r63
            r67 = r63
            r71 = 0
            r58 = r0
            r59 = r7
            r60 = r6
            r61 = r8
            r64 = r14
            r65 = r63
            r68 = r13
            r69 = r10
            r58.<init>(r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70, r71)
            r9.add(r0)
        L_0x05c7:
            if (r24 == 0) goto L_0x0646
            r0 = 2131891937(0x7f1216e1, float:1.9418608E38)
            java.lang.String r14 = r2.getString(r0)
            r0 = 2131887154(0x7f120432, float:1.9408907E38)
            java.lang.String r13 = r2.getString(r0)
            r69 = 0
            r6 = r20 ^ 1
            android.text.SpannableString r0 = X.C180428lm.A00(r2, r3)
            X.9Vr r10 = new X.9Vr
            r10.<init>(r0, r6)
            X.1e1 r0 = r3.A03
            r24 = r0
            r0 = 2131891938(0x7f1216e2, float:1.941861E38)
            java.lang.String r60 = r2.getString(r0)
            java.lang.String r0 = "pay-natively-learn-more"
            java.lang.String[] r62 = new java.lang.String[]{r0}
            r0 = 1
            java.lang.String[] r8 = new java.lang.String[r0]
            X.0xT r7 = r3.A02
            java.lang.String r6 = "817549892726019"
            android.net.Uri r6 = r7.A02(r6)
            java.lang.String r6 = java.lang.String.valueOf(r6)
            r8[r1] = r6
            java.lang.Runnable[] r0 = new java.lang.Runnable[r0]
            X.AWH r6 = X.AWH.A00
            r0[r1] = r6
            r58 = r24
            r59 = r2
            r61 = r0
            r63 = r8
            android.text.SpannableString r6 = r58.A01(r59, r60, r61, r62, r63)
            X.9Vq r7 = new X.9Vq
            r0 = r20
            r7.<init>(r6, r0)
            java.lang.String r62 = "WhatsappPay"
            java.lang.String r63 = ""
            r70 = 2131231281(0x7f080231, float:1.8078639E38)
            r0 = 3
            X.C36381kD.A1K(r14, r0, r13)
            X.9tH r0 = new X.9tH
            r66 = r63
            r67 = r63
            r71 = 0
            r58 = r0
            r59 = r11
            r60 = r7
            r61 = r10
            r64 = r14
            r65 = r63
            r68 = r13
            r58.<init>(r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70, r71)
            r9.add(r0)
        L_0x0646:
            if (r4 == 0) goto L_0x0726
            r0 = 2131891939(0x7f1216e3, float:1.9418612E38)
            java.lang.String r8 = r2.getString(r0)
            X.9uE r0 = r4.A02
            X.C18740tg.A06(r0)
            java.lang.String r7 = r0.A00
            r0 = 2131888203(0x7f12084b, float:1.9411035E38)
            java.lang.String r6 = r2.getString(r0)
            r0 = 0
            android.text.SpannableString r2 = X.C180428lm.A00(r2, r3)
            X.9Vr r4 = new X.9Vr
            r4.<init>(r2, r1)
            X.9Vp r3 = new X.9Vp
            r3.<init>(r0, r1)
            X.9Vq r2 = new X.9Vq
            r2.<init>(r0, r1)
            java.lang.String r62 = "CustomPaymentInstructions"
            java.lang.String r63 = ""
            r70 = 2131233371(0x7f080a5b, float:1.8082878E38)
            r1 = 3
            X.AnonymousClass00C.A0D(r8, r1)
            r1 = 5
            X.C36381kD.A1K(r7, r1, r6)
            X.9tH r1 = new X.9tH
            r67 = r63
            r71 = 0
            r58 = r1
            r59 = r3
            r60 = r2
            r61 = r4
            r64 = r8
            r65 = r63
            r66 = r7
            r68 = r6
            r69 = r0
            r58.<init>(r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70, r71)
            r9.add(r1)
            goto L_0x0726
        L_0x06a0:
            r0 = 0
            goto L_0x0555
        L_0x06a3:
            java.util.ArrayList r9 = X.AnonymousClass001.A0I()
            java.util.List r7 = r12.A0J
            r0 = r41
            int r6 = r14.A0E(r0)
            java.lang.Integer[] r0 = new java.lang.Integer[r4]
            r1 = 1
            boolean r4 = X.C36361kB.A1b(r0, r1)
            r3 = 7
            X.AnonymousClass000.A1L(r0, r3, r1)
            java.util.HashSet r0 = X.C36421kH.A0g(r0)
            if (r7 == 0) goto L_0x0726
            boolean r0 = X.C36381kD.A1Z(r0, r6)
            if (r0 == 0) goto L_0x0726
            X.AnonymousClass00C.A0D(r2, r4)
            r0 = r31
            X.AnonymousClass00C.A0D(r0, r1)
            r1 = 1767(0x6e7, float:2.476E-42)
            java.lang.String r0 = r0.A09(r1)
            java.util.LinkedHashMap r3 = X.AnonymousClass9Za.A01(r2, r0, r10)
            java.util.Iterator r7 = r7.iterator()
        L_0x06dc:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0726
            java.lang.Object r1 = r7.next()
            X.9uE r1 = (X.C206929uE) r1
            java.lang.String r0 = r1.A01
            X.AnonymousClass00C.A0D(r0, r4)
            java.lang.Object r0 = r3.get(r0)
            X.9tH r0 = (X.C206369tH) r0
            if (r0 == 0) goto L_0x06dc
            java.lang.String r1 = r1.A02
            r2 = 0
            X.AnonymousClass00C.A0D(r1, r2)
            java.util.List r2 = r0.A0B
            if (r2 == 0) goto L_0x06dc
            java.util.Iterator r6 = r2.iterator()
        L_0x0703:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L_0x06dc
            java.lang.String r2 = X.AnonymousClass001.A0C(r6)
            java.util.regex.Pattern r2 = java.util.regex.Pattern.compile(r2)
            boolean r2 = X.C36361kB.A1Z(r1, r2)
            if (r2 == 0) goto L_0x0703
            r9.add(r0)
            goto L_0x06dc
        L_0x071b:
            java.lang.String r0 = "checkout_lite"
            java.lang.Object r0 = r6.get(r0)
            if (r0 == 0) goto L_0x0726
            r9.add(r0)
        L_0x0726:
            r0 = r41
            java.lang.String r1 = r0.A08
            java.lang.String r0 = "PAYMENT_REQUEST"
            boolean r0 = r0.equals(r1)
            r56 = 1
            if (r0 == 0) goto L_0x07f8
            r0 = r26
            X.0yC r0 = r0.A02
            r1 = 5574(0x15c6, float:7.811E-42)
            boolean r1 = r0.A0E(r1)
            if (r1 != 0) goto L_0x0748
            r1 = 5575(0x15c7, float:7.812E-42)
            boolean r0 = r0.A0E(r1)
            if (r0 == 0) goto L_0x07f8
        L_0x0748:
            r0 = r36
            long r6 = r0.A1N
            r4 = 1
            boolean r1 = r5 instanceof X.C180428lm
            if (r1 == 0) goto L_0x07ee
            r0 = r5
            X.8lm r0 = (X.C180428lm) r0
            X.1EV r0 = r0.A01
            X.0yC r2 = r0.A02
            r0 = 7238(0x1c46, float:1.0143E-41)
            boolean r0 = r2.A0E(r0)
            if (r0 == 0) goto L_0x07ee
            r54 = 0
        L_0x0762:
            r0 = r39
            java.lang.String r3 = r0.user
            if (r19 != 0) goto L_0x0784
            if (r1 != 0) goto L_0x0784
            r2 = 1763(0x6e3, float:2.47E-42)
            r0 = r31
            java.lang.String r0 = r0.A09(r2)
            boolean r2 = r9.isEmpty()
            if (r2 != 0) goto L_0x0784
            if (r16 != 0) goto L_0x0784
            if (r0 == 0) goto L_0x0784
            boolean r0 = r0.contains(r3)
            r55 = 1
            if (r0 != 0) goto L_0x0786
        L_0x0784:
            r55 = 0
        L_0x0786:
            if (r1 == 0) goto L_0x07eb
            r58 = 1
        L_0x078a:
            r1 = 4248(0x1098, float:5.953E-42)
            r0 = r31
            int r0 = r0.A07(r1)
            if (r0 == r4) goto L_0x07e7
            r1 = 2
            if (r0 == r1) goto L_0x07e3
            r2 = 3
            r1 = 2131891881(0x7f1216a9, float:1.9418495E38)
            if (r0 == r2) goto L_0x07a0
            r1 = 2131891878(0x7f1216a6, float:1.9418488E38)
        L_0x07a0:
            java.lang.Object[] r3 = new java.lang.Object[r4]
            java.lang.String r2 = r12.A0F
            r0 = r28
            java.lang.String r36 = X.C36411kG.A0w(r0, r2, r3, r15, r1)
            X.4Uj r4 = r5.A00
            java.lang.String r3 = r12.A06
            r1 = r32
            r0 = r33
            r12.A07(r0, r1)
            r0 = r41
            java.lang.String r2 = r0.A00
            X.9uM r1 = r0.A05
            r0 = r33
            r12.A07(r0, r1)
            r1 = r30
            r12.A07(r0, r1)
            X.9Oo r24 = new X.9Oo
            r26 = r0
            r28 = r22
            r30 = r17
            r31 = r39
            r32 = r18
            r33 = r4
            r39 = r3
            r41 = r2
            r42 = r21
            r45 = r23
            r46 = r9
            r48 = r6
            r24.<init>(r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r50, r51, r52, r53, r54, r55, r56, r57, r58)
            return r24
        L_0x07e3:
            r1 = 2131891880(0x7f1216a8, float:1.9418493E38)
            goto L_0x07a0
        L_0x07e7:
            r1 = 2131891879(0x7f1216a7, float:1.941849E38)
            goto L_0x07a0
        L_0x07eb:
            r58 = 0
            goto L_0x078a
        L_0x07ee:
            java.lang.String r2 = r12.A05
            java.lang.String r0 = "pending_buyer_confirmation"
            boolean r54 = r0.equals(r2)
            goto L_0x0762
        L_0x07f8:
            r58 = r5
            r59 = r17
            r60 = r12
            r61 = r23
            r62 = r47
            r63 = r20
            boolean r0 = r58.A03(r59, r60, r61, r62, r63)
            if (r0 == 0) goto L_0x0748
            r56 = 0
            goto L_0x0748
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C200239gv.A02(android.content.Context, X.9lY, X.B1o, java.util.List):X.9Oo");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0074, code lost:
        if ("pending_buyer_confirmation".equals(r9.A05) == false) goto L_0x0076;
     */
    /* JADX WARNING: Removed duplicated region for block: B:5:0x0016 A[PHI: r2 
      PHI: (r2v8 boolean) = (r2v0 boolean), (r2v0 boolean), (r2v0 boolean), (r2v9 boolean), (r2v9 boolean), (r2v9 boolean), (r2v9 boolean), (r2v9 boolean) binds: [B:55:0x00df, B:56:0x00e1, B:58:0x00e7, B:6:0x0017, B:8:0x001a, B:10:0x0026, B:14:0x0030, B:4:0x000f] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A03(X.C202319lY r8, X.C207199ui r9, java.util.HashMap r10, int r11, boolean r12) {
        /*
            r7 = this;
            boolean r0 = r7 instanceof X.C180418ll
            if (r0 == 0) goto L_0x0034
            r3 = r7
            X.8ll r3 = (X.C180418ll) r3
            r1 = 4
            boolean r0 = r10.isEmpty()
            r2 = 0
            if (r0 == 0) goto L_0x0017
            java.lang.String r1 = "BrazilPaymentCheckoutOrderDetailsViewConfigurationFactory"
            java.lang.String r0 = "shouldShowPaymentButton, missing default Whatsapp payment option in the map"
            X.C165577te.A1M(r1, r0)
        L_0x0016:
            return r2
        L_0x0017:
            if (r1 == r11) goto L_0x0016
            r0 = 3
            if (r0 == r11) goto L_0x0016
            X.1EV r0 = r3.A00
            X.0yC r1 = r0.A02
            r0 = 3771(0xebb, float:5.284E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x0016
            java.lang.String r0 = r9.A04
            if (r0 == 0) goto L_0x0032
            int r0 = r0.length()
            if (r0 != 0) goto L_0x0016
        L_0x0032:
            r2 = 1
            return r2
        L_0x0034:
            boolean r0 = r7 instanceof X.C180428lm
            if (r0 == 0) goto L_0x00ae
            r4 = r7
            X.8lm r4 = (X.C180428lm) r4
            boolean r0 = r10.isEmpty()
            r6 = 0
            if (r0 == 0) goto L_0x004a
            java.lang.String r1 = "BrazilPaymentCheckoutOrderDetailsViewConfigurationFactory"
            java.lang.String r0 = "shouldShowPaymentButton, missing default Whatsapp payment option in the map"
            X.C165577te.A1M(r1, r0)
        L_0x0049:
            return r6
        L_0x004a:
            if (r12 == 0) goto L_0x0059
            X.1EV r0 = r4.A01
            X.0yC r1 = r0.A02
            r0 = 2178(0x882, float:3.052E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 != 0) goto L_0x0059
            return r6
        L_0x0059:
            r0 = 4
            if (r0 == r11) goto L_0x0049
            r0 = 3
            if (r0 == r11) goto L_0x0049
            X.1EV r2 = r4.A01
            X.0yC r1 = r2.A02
            r0 = 7238(0x1c46, float:1.0143E-41)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x0076
            java.lang.String r1 = r9.A05
            java.lang.String r0 = "pending_buyer_confirmation"
            boolean r0 = r0.equals(r1)
            r5 = 1
            if (r0 != 0) goto L_0x0077
        L_0x0076:
            r5 = 0
        L_0x0077:
            java.lang.String r0 = r9.A04
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x008d
            java.lang.String r0 = r9.A06
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x008d
            boolean r0 = r2.A0B()
            if (r0 != 0) goto L_0x00ac
        L_0x008d:
            if (r8 == 0) goto L_0x00aa
            X.1EU r1 = r4.A05
            X.B66 r0 = r1.A05()
            X.B3q r3 = r0.BAJ()
            X.B66 r0 = r1.A05()
            X.9jA r2 = r0.BE1()
            X.1FR r1 = r4.A06
            r0 = 2
            boolean r0 = r1.A0f(r8, r2, r3, r0)
            if (r0 != 0) goto L_0x00ac
        L_0x00aa:
            if (r5 == 0) goto L_0x0049
        L_0x00ac:
            r6 = 1
            return r6
        L_0x00ae:
            X.1EV r1 = r7.A04
            java.lang.String r3 = r9.A0E
            boolean r0 = r1.A0I(r3)
            r2 = 1
            if (r11 != r2) goto L_0x00c5
            if (r0 != 0) goto L_0x00c7
            X.0yC r1 = r7.A03
            r0 = 994(0x3e2, float:1.393E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 != 0) goto L_0x00d5
        L_0x00c5:
            r2 = 0
            return r2
        L_0x00c7:
            boolean r0 = r1.A02()
            if (r0 == 0) goto L_0x00c5
            if (r8 == 0) goto L_0x00d5
            boolean r0 = r8.A0L()
            if (r0 != 0) goto L_0x00c5
        L_0x00d5:
            X.1FR r0 = r7.A06
            X.1EV r1 = r0.A08
            java.util.List r0 = r9.A0L
            boolean r0 = r1.A0J(r3, r0)
            if (r0 == 0) goto L_0x0016
            if (r8 == 0) goto L_0x0016
            boolean r0 = r8.A0L()
            if (r0 == 0) goto L_0x0016
            goto L_0x00c5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C200239gv.A03(X.9lY, X.9ui, java.util.HashMap, int, boolean):boolean");
    }

    public C200239gv(Resources resources, AnonymousClass185 r2, C19970wo r3, C18820ts r4, AnonymousClass1A5 r5, C20810yC r6, AnonymousClass1EV r7, AnonymousClass1EU r8, AnonymousClass1FR r9, C32681e1 r10) {
        this.A08 = r3;
        this.A03 = r6;
        this.A09 = r10;
        this.A06 = r9;
        this.A01 = r4;
        this.A05 = r8;
        this.A0A = r2;
        this.A04 = r7;
        this.A02 = r5;
        this.A07 = resources;
    }

    public HashMap A04(Context context) {
        String string;
        HashMap A0J = AnonymousClass001.A0J();
        int[] iArr = {R.string.f12nameremoved, R.string.f12nameremoved, R.string.f12nameremoved, R.string.f12nameremoved};
        boolean A0F = this.A04.A0F();
        int A052 = C165587tf.A05(this.A03);
        if (A0F) {
            boolean A1P = AnonymousClass000.A1P(A052);
            int i = R.string.f12nameremoved;
            if (A1P) {
                i = R.string.f12nameremoved;
            }
            string = context.getString(i);
        } else {
            string = context.getString(iArr[A052]);
        }
        A0J.put(3, string);
        return A0J;
    }

    public HashMap A05(Context context, C202319lY r14, C207199ui r15) {
        int i;
        HashMap A0J = AnonymousClass001.A0J();
        List<C206929uE> list = r15.A0J;
        if (list != null) {
            for (C206929uE r8 : list) {
                if ("payment_instruction".equals(r8.A01)) {
                    AnonymousClass1EV r2 = this.A04;
                    if (r2.A02.A0E(7238)) {
                        i = R.string.f12nameremoved;
                    } else {
                        boolean A0F = r2.A0F();
                        i = R.string.f12nameremoved;
                        if (A0F) {
                            i = R.string.f12nameremoved;
                        }
                    }
                    A0J.put(2, A01(context, r14, r8, (C206909uC) null, context.getString(i), 2));
                }
            }
        }
        return A0J;
    }
}
