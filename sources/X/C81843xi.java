package X;

import java.util.concurrent.Callable;

/* renamed from: X.3xi  reason: invalid class name and case insensitive filesystem */
public abstract class C81843xi implements Callable {
    public final C02680Bk A00 = new C02680Bk();

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x005c, code lost:
        if (r2.A0f == false) goto L_0x005e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object A02() {
        /*
            r40 = this;
            r0 = r40
            boolean r1 = r0 instanceof X.AnonymousClass2LC
            if (r1 == 0) goto L_0x0064
            X.2LC r0 = (X.AnonymousClass2LC) r0
            X.1HT r2 = r0.A00
            X.13z r1 = X.C223613z.A00
            java.util.ArrayList r6 = r2.A03(r1)
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()
            java.lang.String r1 = "GetMyStatusStateTask/getStatusMessages "
            X.C36321k7.A1K(r6, r1, r2)
            java.util.Iterator r4 = r6.iterator()
        L_0x001d:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L_0x019b
            X.3T1 r3 = X.C36391kE.A0l(r4)
            int r2 = r3.A0D
            r1 = 20
            if (r2 == r1) goto L_0x005e
            boolean r1 = X.C66013Ui.A0n(r3)
            if (r1 == 0) goto L_0x003e
            java.util.Set r2 = r0.A03
        L_0x0035:
            X.3Qa r1 = r3.A1J
            X.AnonymousClass00C.A07(r1)
            r2.add(r1)
            goto L_0x001d
        L_0x003e:
            r1 = 4
            int r1 = X.AnonymousClass3TJ.A00(r2, r1)
            boolean r1 = X.C36401kF.A1U(r1)
            if (r1 == 0) goto L_0x004c
            java.util.Set r2 = r0.A06
            goto L_0x0035
        L_0x004c:
            boolean r1 = r3 instanceof X.AnonymousClass2bU
            if (r1 == 0) goto L_0x0061
            X.2bU r3 = (X.AnonymousClass2bU) r3
            X.3Qj r2 = r3.A01
            if (r2 == 0) goto L_0x0061
            boolean r1 = r2.A0V
            if (r1 != 0) goto L_0x0061
            boolean r1 = r2.A0f
            if (r1 != 0) goto L_0x0061
        L_0x005e:
            java.util.Set r2 = r0.A04
            goto L_0x0035
        L_0x0061:
            java.util.Set r2 = r0.A05
            goto L_0x0035
        L_0x0064:
            boolean r1 = r0 instanceof X.AnonymousClass2L9
            if (r1 == 0) goto L_0x0086
            X.2L9 r0 = (X.AnonymousClass2L9) r0
            X.0v0 r3 = r0.A00
            android.content.SharedPreferences r2 = X.C36341k9.A0E(r3)
            java.lang.String r1 = "show_statuses_education"
            boolean r1 = X.C36441kJ.A1I(r2, r1)
            if (r1 == 0) goto L_0x0083
            X.16E r0 = r0.A01
            boolean r0 = r0.A0H()
            if (r0 == 0) goto L_0x0083
            r3.A11()
        L_0x0083:
            X.0AJ r2 = X.AnonymousClass0AJ.A00
            return r2
        L_0x0086:
            boolean r1 = r0 instanceof X.AnonymousClass2LB
            if (r1 == 0) goto L_0x01be
            X.2LB r0 = (X.AnonymousClass2LB) r0
            X.1Zi r2 = r0.A04
            r2.A02()
            r1 = 0
            r2.A0E(r1)
            X.12q r1 = r0.A01
            java.util.Collection r1 = r1.A0F()
            r2 = 0
            if (r1 == 0) goto L_0x01bb
            java.util.ArrayList r5 = X.AnonymousClass001.A0I()
            java.util.Iterator r4 = r1.iterator()
        L_0x00a6:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L_0x00c5
            java.lang.Object r3 = r4.next()
            r2 = r3
            X.3Qp r2 = (X.C65073Qp) r2
            boolean r1 = r2 instanceof X.C44072La
            if (r1 == 0) goto L_0x00a6
            X.2La r2 = (X.C44072La) r2
            if (r2 == 0) goto L_0x00a6
            boolean r1 = r2.A0N()
            if (r1 != 0) goto L_0x00a6
            r5.add(r3)
            goto L_0x00a6
        L_0x00c5:
            java.util.ArrayList r4 = X.C36321k7.A0J(r5)
            java.util.Iterator r10 = r5.iterator()
        L_0x00cd:
            boolean r1 = r10.hasNext()
            if (r1 == 0) goto L_0x0194
            java.lang.Object r13 = r10.next()
            X.3Qp r13 = (X.C65073Qp) r13
            java.lang.String r1 = "null cannot be cast to non-null type com.whatsapp.data.NewsletterInfo"
            X.AnonymousClass00C.A0E(r13, r1)
            X.2La r13 = (X.C44072La) r13
            X.1Cv r2 = r0.A02
            X.11F r1 = r13.A06()
            X.3T1 r1 = r2.A05(r1)
            if (r1 == 0) goto L_0x018d
            long r2 = r1.A0I
            boolean r5 = r1 instanceof X.AnonymousClass2bU
            r38 = 0
            r6 = 1
            if (r5 == 0) goto L_0x0181
            r5 = r1
            X.2bU r5 = (X.AnonymousClass2bU) r5
            boolean r38 = X.C66013Ui.A10(r5)
        L_0x00fc:
            boolean r5 = r1 instanceof X.C181798o3
            r39 = 0
            if (r5 == 0) goto L_0x0117
            r5 = r1
            X.2bU r5 = (X.AnonymousClass2bU) r5
            X.3Qj r5 = r5.A01
            if (r5 == 0) goto L_0x0117
            boolean r5 = r5.A0d
            if (r5 == 0) goto L_0x0117
            X.1GQ r5 = r0.A03
            boolean r5 = X.C66013Ui.A0Z(r5, r1)
            if (r5 == 0) goto L_0x0117
            r39 = 1
        L_0x0117:
            r25 = 0
            r11 = 0
            r37 = 0
            r24 = 536870911(0x1fffffff, float:1.0842021E-19)
            r14 = r11
            r15 = r11
            r16 = r11
            r17 = r11
            r18 = r11
            r19 = r11
            r20 = r11
            r21 = r11
            r22 = r11
            r23 = r11
            r27 = 0
            r29 = 0
            r31 = 0
            r33 = 0
            r35 = 0
            r12 = r11
            X.2La r29 = X.C44072La.A00(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r27, r29, r31, r33, r35, r37)
            X.16D r6 = r0.A00
            X.11F r5 = r13.A06()
            X.141 r30 = r6.A0D(r5)
            X.141 r5 = r30.A04()
            if (r5 == 0) goto L_0x0152
            r30 = r5
        L_0x0152:
            X.3G9 r5 = r0.A05
            java.lang.String r32 = r5.A00(r2)
            int r5 = r13.A08
            long r5 = (long) r5
            if (r1 == 0) goto L_0x017f
            int r8 = r1.A0D
            java.lang.Integer r9 = java.lang.Integer.valueOf(r8)
            boolean r7 = r13.A0L()
            if (r7 == 0) goto L_0x017f
            if (r9 == 0) goto L_0x017f
        L_0x016b:
            X.2go r7 = new X.2go
            r28 = r7
            r31 = r1
            r33 = r8
            r34 = r2
            r36 = r5
            r28.<init>(r29, r30, r31, r32, r33, r34, r36, r38, r39)
            r4.add(r7)
            goto L_0x00cd
        L_0x017f:
            r8 = 0
            goto L_0x016b
        L_0x0181:
            X.3L1 r5 = r1.A0a
            if (r5 == 0) goto L_0x0189
            boolean r5 = r5.A09
            if (r5 != r6) goto L_0x00fc
        L_0x0189:
            r38 = 1
            goto L_0x00fc
        L_0x018d:
            long r2 = r13.A0Q
            r38 = 1
            r39 = 0
            goto L_0x0117
        L_0x0194:
            r0 = 12
            java.util.List r2 = X.C89834Yb.A00(r4, r0)
            return r2
        L_0x019b:
            java.util.Set r5 = r0.A04
            java.util.Set r4 = r0.A05
            java.util.Set r2 = r0.A03
            java.util.Set r1 = r0.A06
            X.3EK r3 = new X.3EK
            r3.<init>(r5, r4, r2, r1)
            X.16E r1 = r0.A01
            X.3Sz r1 = r1.A07()
            if (r1 == 0) goto L_0x01bc
            X.3Sz r1 = r1.A06()
        L_0x01b4:
            X.3KF r0 = r0.A02
            X.3EL r2 = new X.3EL
            r2.<init>(r1, r0, r3, r6)
        L_0x01bb:
            return r2
        L_0x01bc:
            r1 = 0
            goto L_0x01b4
        L_0x01be:
            boolean r1 = r0 instanceof X.AnonymousClass2L8
            if (r1 == 0) goto L_0x01e2
            X.2L8 r0 = (X.AnonymousClass2L8) r0
            X.3P0 r1 = r0.A00
            java.util.List r1 = r1.A01
            java.util.ArrayList r5 = X.AnonymousClass001.A0I()
            java.util.Iterator r6 = r1.iterator()
        L_0x01d0:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L_0x03db
            X.3Sz r4 = X.C36441kJ.A0h(r6)
            X.3EJ r3 = r0.A01
            r2 = 1
            r1 = 0
            X.AnonymousClass3EJ.A00(r4, r3, r5, r2, r1)
            goto L_0x01d0
        L_0x01e2:
            boolean r1 = r0 instanceof X.AnonymousClass2L7
            if (r1 == 0) goto L_0x01f6
            X.2L7 r0 = (X.AnonymousClass2L7) r0
            java.util.List r1 = r0.A01
            java.util.List r0 = r0.A00
            X.1vF r2 = new X.1vF
            r2.<init>(r1, r0)
        L_0x01f1:
            X.0X4 r2 = X.C06880Vl.A00(r2)
            return r2
        L_0x01f6:
            boolean r1 = r0 instanceof X.AnonymousClass2L6
            if (r1 == 0) goto L_0x0206
            X.2L6 r0 = (X.AnonymousClass2L6) r0
            java.util.List r1 = r0.A01
            java.util.List r0 = r0.A00
            X.1vE r2 = new X.1vE
            r2.<init>(r1, r0)
            goto L_0x01f1
        L_0x0206:
            boolean r1 = r0 instanceof X.AnonymousClass2L1
            if (r1 == 0) goto L_0x0235
            X.2L1 r0 = (X.AnonymousClass2L1) r0
            com.whatsapp.status.viewmodels.StatusesViewModel r4 = r0.A00
            X.16E r0 = r4.A09
            java.util.Map r5 = r0.A0C()
            X.AnonymousClass00C.A08(r5)
            java.util.concurrent.atomic.AtomicBoolean r2 = r4.A0G
            r1 = 0
            r0 = 1
            boolean r0 = r2.compareAndSet(r1, r0)
            if (r0 == 0) goto L_0x03db
            X.00s r0 = r4.A04
            java.lang.Object r0 = r0.A04()
            java.util.Map r0 = (java.util.Map) r0
            if (r0 != 0) goto L_0x022f
            X.00f r0 = X.C000400e.A0D()
        L_0x022f:
            java.util.Set r0 = r0.keySet()
            monitor-enter(r4)
            goto L_0x028b
        L_0x0235:
            boolean r1 = r0 instanceof X.AnonymousClass2L5
            if (r1 == 0) goto L_0x023e
            java.lang.Integer r2 = X.C36381kD.A0m()
            return r2
        L_0x023e:
            boolean r1 = r0 instanceof X.AnonymousClass2LA
            if (r1 == 0) goto L_0x0269
            X.2LA r0 = (X.AnonymousClass2LA) r0
            X.1HT r1 = r0.A00
            X.13z r0 = X.C223613z.A00
            java.util.ArrayList r0 = r1.A03(r0)
            X.8Hc r3 = new X.8Hc
            r3.<init>()
            java.util.Iterator r2 = r0.iterator()
        L_0x0255:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x02be
            X.3T1 r1 = X.C36391kE.A0l(r2)
            boolean r0 = X.C66013Ui.A0n(r1)
            if (r0 != 0) goto L_0x0255
            X.AnonymousClass00C.A0B(r1)
            goto L_0x0255
        L_0x0269:
            boolean r1 = r0 instanceof X.AnonymousClass2L4
            if (r1 == 0) goto L_0x027a
            X.2L4 r0 = (X.AnonymousClass2L4) r0
            java.util.List r1 = r0.A01
            java.util.List r0 = r0.A00
            X.1vD r2 = new X.1vD
            r2.<init>(r1, r0)
            goto L_0x01f1
        L_0x027a:
            boolean r1 = r0 instanceof X.AnonymousClass2L3
            if (r1 == 0) goto L_0x02c6
            X.2L3 r0 = (X.AnonymousClass2L3) r0
            java.util.List r1 = r0.A01
            java.util.List r0 = r0.A00
            X.1vC r2 = new X.1vC
            r2.<init>(r1, r0)
            goto L_0x01f1
        L_0x028b:
            java.util.LinkedHashSet r3 = X.C36441kJ.A17()     // Catch:{ all -> 0x02bb }
            java.util.Iterator r2 = r0.iterator()     // Catch:{ all -> 0x02bb }
        L_0x0293:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x02bb }
            if (r0 == 0) goto L_0x02a7
            com.whatsapp.jid.UserJid r1 = X.C36441kJ.A0o(r2)     // Catch:{ all -> 0x02bb }
            boolean r0 = r5.containsKey(r1)     // Catch:{ all -> 0x02bb }
            if (r0 != 0) goto L_0x0293
            r3.add(r1)     // Catch:{ all -> 0x02bb }
            goto L_0x0293
        L_0x02a7:
            java.util.Set r0 = r5.keySet()     // Catch:{ all -> 0x02bb }
            r3.addAll(r0)     // Catch:{ all -> 0x02bb }
            java.util.Set r0 = r4.A02     // Catch:{ all -> 0x02bb }
            java.util.Set r0 = X.C007103b.A0e(r0)     // Catch:{ all -> 0x02bb }
            r0.addAll(r3)     // Catch:{ all -> 0x02bb }
            r4.A02 = r0     // Catch:{ all -> 0x02bb }
            monitor-exit(r4)
            return r5
        L_0x02bb:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L_0x02be:
            X.1Ak r2 = r3.build()
            X.AnonymousClass00C.A08(r2)
            return r2
        L_0x02c6:
            boolean r1 = r0 instanceof X.AnonymousClass2LD
            if (r1 == 0) goto L_0x031c
            X.2LD r0 = (X.AnonymousClass2LD) r0
            android.content.Context r7 = r0.A01
            X.1DU r9 = r0.A06
            X.1e6 r8 = r0.A04
            X.3T1 r10 = r0.A07
            int r11 = r0.A00
            r12 = 0
            X.3Ns r5 = X.C64373Ns.A00(r7, r8, r9, r10, r11, r12)
            X.0Bk r4 = r0.A00
            r4.A04()
            java.lang.String r3 = r5.A02
            if (r3 != 0) goto L_0x0307
            r1 = 2131895694(0x7f12258e, float:1.9426228E38)
            java.lang.String r6 = r7.getString(r1)
        L_0x02eb:
            r4.A04()
            java.lang.String r1 = r5.A04
            java.util.List r3 = r0.A08
            X.0ts r2 = r0.A03
            java.lang.CharSequence r1 = X.C65783Tl.A03(r7, r2, r1, r3)
            java.lang.String r0 = r5.A03
            java.lang.CharSequence r0 = X.C65783Tl.A03(r7, r2, r0, r3)
            r4.A04()
            X.38J r2 = new X.38J
            r2.<init>(r5, r1, r0, r6)
            return r2
        L_0x0307:
            android.widget.TextView r1 = r0.A02
            android.text.TextPaint r2 = r1.getPaint()
            X.1H2 r1 = r0.A05
            java.lang.CharSequence r3 = X.AnonymousClass3UG.A03(r7, r2, r1, r3)
            java.util.List r2 = r0.A08
            X.0ts r1 = r0.A03
            java.lang.CharSequence r6 = X.C65783Tl.A03(r7, r1, r3, r2)
            goto L_0x02eb
        L_0x031c:
            boolean r1 = r0 instanceof X.AnonymousClass2LE
            if (r1 == 0) goto L_0x03dc
            X.2LE r0 = (X.AnonymousClass2LE) r0
            java.lang.CharSequence r2 = r0.A08
            boolean r1 = android.text.TextUtils.isEmpty(r2)
            java.lang.String r5 = ""
            if (r1 != 0) goto L_0x03db
            java.lang.String r3 = r2.toString()
            java.lang.String r2 = "\n"
            java.lang.String r1 = " "
            java.lang.String r3 = r3.replace(r2, r1)
            X.0yb r2 = r0.A04
            X.0wg r1 = r0.A07
            java.lang.CharSequence r14 = X.AnonymousClass6YV.A08(r2, r1, r3)
            android.content.Context r11 = r0.A02
            java.util.List r15 = r0.A09
            X.0ts r12 = r0.A05
            X.3Tl r13 = X.C65783Tl.A01
            r4 = 1
            r16 = 1
            X.35q r2 = X.C65783Tl.A00(r11, r12, r13, r14, r15, r16)
            X.0Bk r9 = r0.A00
            r9.A04()
            java.lang.Object r8 = r2.A00
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8
            boolean r1 = android.text.TextUtils.isEmpty(r8)
            if (r1 != 0) goto L_0x03db
            java.lang.Object r3 = r2.A01
            java.util.List r3 = (java.util.List) r3
            r1 = 460(0x1cc, float:6.45E-43)
            X.3lI r10 = new X.3lI
            r10.<init>(r4, r1)
            boolean r1 = r3.isEmpty()
            if (r1 != 0) goto L_0x03d3
            android.graphics.Paint r7 = r0.A03
            int r1 = r8.length()
            r6 = 0
            float r5 = r7.measureText(r8, r6, r1)
            int r2 = r0.A00
            int r1 = r0.A01
            int r2 = r2 * r1
            float r4 = (float) r2
            int r1 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r1 <= 0) goto L_0x03d3
            java.text.BreakIterator r11 = X.C202859mm.A02(r12)
            java.lang.String r1 = r8.toString()
            r11.setText(r1)
            r2 = 20
            int r1 = r8.length()
            java.util.List r10 = X.AnonymousClass2LE.A00(r11, r3, r2, r1)
            android.text.SpannableStringBuilder r5 = new android.text.SpannableStringBuilder
            r5.<init>()
            X.AnonymousClass2LE.A01(r5, r0, r8, r10)
            r9.A04()
            r3 = 10
        L_0x03a6:
            int r1 = r5.length()
            float r1 = r7.measureText(r5, r6, r1)
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 > 0) goto L_0x03db
            int r2 = r5.length()
            int r1 = r8.length()
            if (r2 >= r1) goto L_0x03db
            r9.A04()
            r5.clear()
            int r1 = r8.length()
            java.util.List r10 = X.AnonymousClass2LE.A00(r11, r10, r3, r1)
            X.AnonymousClass2LE.A01(r5, r0, r8, r10)
            r9.A04()
            int r3 = r3 + 10
            goto L_0x03a6
        L_0x03d3:
            android.graphics.Paint r1 = r0.A03
            X.1H2 r0 = r0.A06
            java.lang.CharSequence r5 = X.AnonymousClass3UG.A02(r11, r1, r10, r0, r8)
        L_0x03db:
            return r5
        L_0x03dc:
            X.2L2 r0 = (X.AnonymousClass2L2) r0
            X.0Bk r1 = r0.A00
            boolean r1 = r1.A06()
            if (r1 == 0) goto L_0x03e8
            r2 = 0
            return r2
        L_0x03e8:
            X.2LF r1 = r0.A01
            X.1Ps r3 = r1.A01
            X.0wG r1 = r1.A02
            android.content.Context r2 = r1.A00
            X.141 r1 = r0.A00
            r0 = 640(0x280, float:8.97E-43)
            android.graphics.Bitmap r2 = X.C36401kF.A09(r2, r3, r1, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C81843xi.A02():java.lang.Object");
    }

    public Object call() {
        C02680Bk r2 = this.A00;
        if (!r2.A06()) {
            Object A02 = A02();
            if (!r2.A06()) {
                return A02;
            }
        }
        throw new AnonymousClass02S();
    }
}
