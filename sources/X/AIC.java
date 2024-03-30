package X;

import android.text.TextUtils;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.List;
import java.util.Map;

public class AIC implements C236119d {
    public final C19700wN A00;
    public final C27471Oi A01;
    public final C20810yC A02;
    public final AnonymousClass12O A03;
    public final AnonymousClass19A A04;
    public final Map A05 = C165607th.A12();

    public static C194899Rr A01(C203399nx r9, String str) {
        Long l;
        if (r9.A0c("error") != null) {
            C203399nx A0d = r9.A0d("error");
            Long valueOf = Long.valueOf(Math.min(A0d.A0V("backoff", 7200) * 1000, 3600000));
            String A0i = A0d.A0i("text", (String) null);
            int A0S = A0d.A0S("code", -1);
            long A0V = A0d.A0V("backoff", -1);
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("connection/unisynciq/parse/");
            A0u.append(str);
            A0u.append("/error/error_text= ");
            A0u.append(A0i);
            A0u.append(", code: ");
            A0u.append(A0S);
            Log.w(C36381kD.A0z(", backoff:", A0u, A0V));
            return new C194899Rr(Integer.valueOf(A0S), (Long) null, valueOf, false);
        }
        String A0i2 = r9.A0i("refresh", (String) null);
        if (A0i2 != null) {
            l = Long.valueOf(Long.parseLong(A0i2) * 1000);
        } else {
            l = null;
        }
        return new C194899Rr((Integer) null, l, (Long) null, true);
    }

    private void A04(C194179Ok r5, List list) {
        C223313w A09;
        UserJid userJid = r5.A07;
        if ((userJid instanceof PhoneUserJid) && (A09 = this.A03.A09((PhoneUserJid) userJid)) != null) {
            AnonymousClass1AL[] A0k = C165617ti.A0k();
            C90504aG.A1E(A09, "jid", A0k, 0);
            list.add(C203399nx.A04("lid", A0k));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0231, code lost:
        if ((r27 & 16) == 16) goto L_0x0233;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x02c7, code lost:
        if (r0 != false) goto L_0x02c9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass777 A05(X.C198869eK r43, java.lang.String r44, long r45) {
        /*
            r42 = this;
            r41 = r42
            r0 = r41
            X.19A r0 = r0.A04
            r40 = r0
            java.lang.String r17 = r40.A09()
            r0 = 4
            java.util.ArrayList r3 = X.C36441kJ.A14(r0)
            java.util.ArrayList r19 = X.AnonymousClass001.A0I()
            java.util.ArrayList r18 = X.AnonymousClass001.A0I()
            r0 = 2
            java.util.ArrayList r26 = X.C36441kJ.A14(r0)
            r11 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r32 = 0
            r27 = 0
            r33 = 0
            r34 = 0
            r35 = 0
            r36 = 0
            r37 = 0
            r38 = 0
        L_0x0037:
            r12 = r43
            java.util.List r2 = r12.A02
            int r1 = r2.size()
            java.lang.String r25 = "sidelist"
            java.lang.String r20 = "pay"
            java.lang.String r24 = "bot"
            java.lang.String r15 = "devices"
            java.lang.String r14 = "username"
            java.lang.String r9 = "business"
            java.lang.String r23 = "id"
            java.lang.String r10 = "picture"
            java.lang.String r8 = "verified_name"
            java.lang.String r6 = "status"
            java.lang.String r13 = "profile"
            java.lang.String r16 = "type"
            java.lang.String r0 = "contact"
            if (r11 >= r1) goto L_0x034f
            java.lang.Object r2 = r2.get(r11)
            X.9Ok r2 = (X.C194179Ok) r2
            r3.clear()
            boolean r1 = r2.A0G
            java.lang.String r12 = "delete"
            if (r1 == 0) goto L_0x0084
            boolean r1 = r2.A0K
            if (r1 != 0) goto L_0x0084
            boolean r1 = r2.A0H
            if (r1 == 0) goto L_0x031d
            X.1AL[] r5 = X.C165617ti.A0k()
            r4 = r16
            X.C36381kD.A1N(r4, r12, r5)
            X.9nx r4 = X.C203399nx.A04(r0, r5)
        L_0x007f:
            r3.add(r4)
        L_0x0082:
            r28 = 1
        L_0x0084:
            boolean r0 = r2.A0P
            r21 = 0
            if (r0 == 0) goto L_0x00a8
            long r0 = r2.A04
            int r4 = (r0 > r21 ? 1 : (r0 == r21 ? 0 : -1))
            if (r4 <= 0) goto L_0x00a6
            X.1AL[] r4 = X.C165617ti.A0k()
            long r0 = r2.A04
            long r0 = X.C36391kE.A0B(r0)
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "t"
            X.C36381kD.A1N(r0, r1, r4)
            X.C203399nx.A0E(r6, r3, r4)
        L_0x00a6:
            r29 = 1
        L_0x00a8:
            boolean r0 = r2.A0F
            java.lang.String r7 = "tag"
            if (r0 == 0) goto L_0x00ea
            r26.clear()
            java.lang.String r0 = r2.A0D
            if (r0 == 0) goto L_0x00c5
            X.1AL[] r4 = X.C165617ti.A0k()
            java.lang.String r1 = r2.A0D
            java.lang.String r0 = "serial"
            X.C36381kD.A1N(r0, r1, r4)
            r0 = r26
            X.C203399nx.A0E(r8, r0, r4)
        L_0x00c5:
            java.lang.String r0 = r2.A09
            if (r0 == 0) goto L_0x031a
            X.1AL[] r4 = X.C165617ti.A0k()
            java.lang.String r0 = r2.A09
            boolean r1 = X.C36371kC.A1Y(r7, r0, r4)
            r0 = r26
            X.C203399nx.A0E(r13, r0, r4)
        L_0x00d8:
            boolean r0 = r26.isEmpty()
            if (r0 != 0) goto L_0x00e8
            r0 = r26
            X.9nx[] r1 = X.C165577te.A1b(r0, r1)
            r0 = 0
            X.C203399nx.A0F(r9, r3, r0, r1)
        L_0x00e8:
            r31 = 1
        L_0x00ea:
            boolean r0 = r2.A0N
            if (r0 == 0) goto L_0x0107
            int r0 = r2.A01
            if (r0 <= 0) goto L_0x0105
            X.1AL[] r4 = X.C165617ti.A0k()
            int r5 = r2.A01
            X.1AL r1 = new X.1AL
            r0 = r23
            r1.<init>((java.lang.String) r0, (int) r5)
            r0 = 0
            r4[r0] = r1
            X.C203399nx.A0E(r10, r3, r4)
        L_0x0105:
            r30 = 1
        L_0x0107:
            boolean r0 = r2.A0I
            if (r0 == 0) goto L_0x0145
            java.util.ArrayList r4 = X.AnonymousClass001.A0I()
            java.lang.String r0 = r2.A0A
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0143
            java.lang.String r1 = r2.A0A
            java.lang.String r0 = "device_hash"
            X.C36381kD.A1M(r0, r1, r4)
            long r0 = r2.A03
            int r5 = (r0 > r21 ? 1 : (r0 == r21 ? 0 : -1))
            if (r5 <= 0) goto L_0x0138
            long r0 = r2.A03
            java.lang.String r5 = "ts"
            X.C165597tg.A1I(r5, r4, r0)
            long r5 = r2.A02
            int r8 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r8 <= 0) goto L_0x0138
            long r0 = r2.A02
            java.lang.String r5 = "expected_ts"
            X.C165597tg.A1I(r5, r4, r0)
        L_0x0138:
            int r0 = r4.size()
            X.1AL[] r0 = X.C165577te.A1a(r4, r0)
            X.C203399nx.A0E(r15, r3, r0)
        L_0x0143:
            r33 = 1
        L_0x0145:
            boolean r0 = r2.A0E
            if (r0 == 0) goto L_0x0179
            r0 = 2
            java.util.ArrayList r1 = X.C36441kJ.A14(r0)
            int r0 = r2.A00
            if (r0 <= 0) goto L_0x0157
            int r0 = r2.A00
            X.C165587tf.A1N(r7, r1, r0)
        L_0x0157:
            java.lang.String r0 = r2.A08
            if (r0 == 0) goto L_0x0162
            java.lang.String r4 = r2.A08
            java.lang.String r0 = "persona_id"
            X.C36381kD.A1M(r0, r4, r1)
        L_0x0162:
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0177
            r0 = 0
            X.1AL[] r0 = X.C165577te.A1a(r1, r0)
            X.9nx r4 = X.C203399nx.A04(r13, r0)
            r1 = 0
            r0 = r24
            X.C203399nx.A0B(r4, r0, r3, r1)
        L_0x0177:
            r36 = 1
        L_0x0179:
            com.whatsapp.jid.UserJid r0 = r2.A07
            if (r0 == 0) goto L_0x0317
            X.1AL[] r10 = X.C165617ti.A0k()
            com.whatsapp.jid.UserJid r4 = r2.A07
            java.lang.String r1 = "jid"
            X.1AL r0 = new X.1AL
            r0.<init>((com.whatsapp.jid.Jid) r4, (java.lang.String) r1)
            r1 = 0
            r10[r1] = r0
        L_0x018d:
            boolean r0 = r2.A0M
            if (r0 == 0) goto L_0x0299
            X.9Lk r0 = r2.A05
            if (r0 == 0) goto L_0x0299
            boolean r0 = r2.A0M
            if (r0 == 0) goto L_0x01fb
            X.9Lk r1 = r2.A05
            if (r1 == 0) goto L_0x01fb
            android.util.Pair r0 = r1.A00
            java.lang.Object r0 = r0.first
            boolean r0 = X.AnonymousClass000.A1X(r0)
            if (r0 == 0) goto L_0x01a9
            r27 = r27 | 1
        L_0x01a9:
            X.0wy r0 = r1.A01
            boolean r6 = r0.isEmpty()
            r5 = 3
            r4 = 1
            if (r6 != 0) goto L_0x01d3
            X.0y7 r0 = r0.entrySet()
            X.14x r6 = r0.iterator()
        L_0x01bb:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x01d3
            java.util.Map$Entry r0 = X.AnonymousClass000.A11(r6)
            int r0 = X.C165577te.A08(r0)
            if (r0 != r4) goto L_0x01ce
            r27 = r27 | 2
            goto L_0x01bb
        L_0x01ce:
            if (r0 != r5) goto L_0x01bb
            r27 = r27 | 8
            goto L_0x01bb
        L_0x01d3:
            X.0wy r0 = r1.A02
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L_0x01fb
            X.0y7 r0 = r0.entrySet()
            X.14x r1 = r0.iterator()
        L_0x01e3:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x01fb
            java.util.Map$Entry r0 = X.AnonymousClass000.A11(r1)
            int r0 = X.C165577te.A08(r0)
            if (r0 != r4) goto L_0x01f6
            r27 = r27 | 16
            goto L_0x01e3
        L_0x01f6:
            if (r0 != r5) goto L_0x01e3
            r27 = r27 | 32
            goto L_0x01e3
        L_0x01fb:
            java.util.ArrayList r4 = X.AnonymousClass001.A0I()
            X.9Lk r1 = r2.A05
            android.util.Pair r5 = r1.A00
            r0 = 0
            r7 = 1
            java.lang.Object r6 = r5.first
            boolean r6 = X.AnonymousClass000.A1X(r6)
            if (r6 == 0) goto L_0x0227
            java.lang.Object r6 = r5.second
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            boolean r6 = android.text.TextUtils.isEmpty(r6)
            if (r6 != 0) goto L_0x0227
            X.1AL[] r6 = new X.AnonymousClass1AL[r7]
            java.lang.Object r5 = r5.second
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r8 = "dhash"
            X.C36341k9.A1L(r8, r5, r6, r0)
            java.lang.String r5 = "merchant_status"
            X.C203399nx.A0E(r5, r4, r6)
        L_0x0227:
            r6 = r27 & 2
            r5 = 2
            if (r6 == r5) goto L_0x0233
            r6 = 16
            r5 = r27 & 16
            r8 = 0
            if (r5 != r6) goto L_0x0234
        L_0x0233:
            r8 = 1
        L_0x0234:
            r6 = 0
            if (r8 == 0) goto L_0x025a
            java.util.ArrayList r5 = X.AnonymousClass001.A0I()
            X.0wy r8 = r1.A01
            X.9nx r8 = A02(r8, r7)
            X.0wy r9 = r1.A02
            X.9nx r7 = A03(r9, r7)
            if (r8 == 0) goto L_0x024c
            r5.add(r8)
        L_0x024c:
            if (r7 == 0) goto L_0x0251
            r5.add(r7)
        L_0x0251:
            X.9nx[] r7 = X.C165577te.A1b(r5, r0)
            java.lang.String r5 = "upi"
            X.C203399nx.A0F(r5, r4, r6, r7)
        L_0x025a:
            r7 = r27 & 8
            r5 = 8
            if (r7 == r5) goto L_0x0266
            r7 = 32
            r5 = r27 & 32
            if (r5 != r7) goto L_0x028a
        L_0x0266:
            java.util.ArrayList r5 = X.AnonymousClass001.A0I()
            X.0wy r8 = r1.A01
            r7 = 3
            X.9nx r8 = A02(r8, r7)
            X.0wy r1 = r1.A02
            X.9nx r1 = A03(r1, r7)
            if (r8 == 0) goto L_0x027c
            r5.add(r8)
        L_0x027c:
            if (r1 == 0) goto L_0x0281
            r5.add(r1)
        L_0x0281:
            X.9nx[] r5 = X.C165577te.A1b(r5, r0)
            java.lang.String r1 = "fbpay"
            X.C203399nx.A0F(r1, r4, r6, r5)
        L_0x028a:
            boolean r1 = r4.isEmpty()
            if (r1 != 0) goto L_0x0299
            X.9nx[] r1 = X.C165577te.A1b(r4, r0)
            r0 = r20
            X.C203399nx.A0F(r0, r3, r6, r1)
        L_0x0299:
            boolean r0 = r2.A0J
            if (r0 == 0) goto L_0x029f
            r34 = 1
        L_0x029f:
            boolean r0 = r2.A0L
            if (r0 == 0) goto L_0x02a5
            r35 = 1
        L_0x02a5:
            boolean r0 = r2.A0R
            if (r0 == 0) goto L_0x02ab
            r37 = 1
        L_0x02ab:
            boolean r0 = r2.A0Q
            if (r0 == 0) goto L_0x02b1
            r38 = 1
        L_0x02b1:
            boolean r0 = r2.A0K
            java.lang.String r5 = "user"
            if (r0 == 0) goto L_0x0305
            com.whatsapp.jid.UserJid r0 = r2.A07
            boolean r0 = X.AnonymousClass143.A0H(r0)
            if (r0 != 0) goto L_0x02ff
            boolean r0 = r2.A0O
            if (r0 != 0) goto L_0x02c9
            r0 = r32
            r32 = 0
            if (r0 == 0) goto L_0x02cb
        L_0x02c9:
            r32 = 1
        L_0x02cb:
            boolean r0 = r2.A0H
            if (r0 == 0) goto L_0x0303
            X.1AL[] r4 = X.C165617ti.A0k()
            r1 = r16
            boolean r1 = X.C36371kC.A1Y(r1, r12, r4)
            r0 = r25
            X.C203399nx.A0E(r0, r3, r4)
        L_0x02de:
            if (r35 == 0) goto L_0x02e5
            r0 = r41
            r0.A04(r2, r3)
        L_0x02e5:
            X.9nx[] r1 = X.C165577te.A1b(r3, r1)
            r0 = r18
            X.C203399nx.A0F(r5, r0, r10, r1)
            com.whatsapp.jid.UserJid r0 = r2.A07
            boolean r0 = X.AnonymousClass143.A0I(r0)
            if (r0 == 0) goto L_0x02ff
            X.141 r0 = r2.A06
            if (r0 == 0) goto L_0x02ff
            X.141 r0 = r2.A06
            r0.A0C()
        L_0x02ff:
            int r11 = r11 + 1
            goto L_0x0037
        L_0x0303:
            r1 = 0
            goto L_0x02de
        L_0x0305:
            if (r35 == 0) goto L_0x030c
            r0 = r41
            r0.A04(r2, r3)
        L_0x030c:
            r0 = 0
            X.9nx[] r1 = X.C165577te.A1b(r3, r0)
            r0 = r19
            X.C203399nx.A0F(r5, r0, r10, r1)
            goto L_0x02ff
        L_0x0317:
            r10 = 0
            goto L_0x018d
        L_0x031a:
            r1 = 0
            goto L_0x00d8
        L_0x031d:
            java.lang.String r1 = r2.A0B
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x032f
            java.lang.String r5 = r2.A0B
            r1 = 0
            X.9nx r4 = new X.9nx
            r4.<init>((java.lang.String) r0, (java.lang.String) r5, (X.AnonymousClass1AL[]) r1)
            goto L_0x007f
        L_0x032f:
            r4 = 0
            com.whatsapp.jid.UserJid r1 = r2.A07
            boolean r1 = X.AnonymousClass143.A0I(r1)
            if (r1 != 0) goto L_0x0349
            java.lang.String r1 = r2.A0C
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x0082
            X.1AL[] r4 = X.C165617ti.A0k()
            java.lang.String r1 = r2.A0C
            X.C36381kD.A1N(r14, r1, r4)
        L_0x0349:
            X.9nx r4 = X.C203399nx.A04(r0, r4)
            goto L_0x007f
        L_0x034f:
            X.5Tu r11 = r12.A01
            int r1 = r28 + r29
            int r1 = r1 + r31
            int r1 = r1 + r32
            int r1 = r1 + r30
            int r1 = r1 + r33
            boolean r2 = X.AnonymousClass000.A1P(r27)
            int r1 = r1 + r2
            int r1 = r1 + r34
            int r1 = r1 + r35
            int r1 = r1 + r37
            int r1 = r1 + r36
            int r1 = r1 + r38
            X.9nx[] r3 = new X.C203399nx[r1]
            r1 = 0
            if (r28 == 0) goto L_0x05b5
            X.9nx r2 = X.C203399nx.A04(r0, r1)
            r0 = 0
            r3[r0] = r2
            r2 = 1
        L_0x0377:
            if (r29 == 0) goto L_0x037f
            int r0 = r2 + 1
            X.C203399nx.A0H(r6, r1, r3, r2)
            r2 = r0
        L_0x037f:
            if (r31 == 0) goto L_0x03ac
            r0 = 2
            X.9nx[] r0 = new X.C203399nx[r0]
            X.9nx r4 = X.C203399nx.A04(r8, r1)
            r1 = 0
            r0[r1] = r4
            X.1AL[] r4 = X.C165617ti.A0k()
            int r6 = r12.A00
            java.lang.String r5 = "v"
            X.1AL r1 = new X.1AL
            r1.<init>((java.lang.String) r5, (int) r6)
            r5 = 0
            r4[r5] = r1
            X.9nx r4 = X.C203399nx.A04(r13, r4)
            r1 = 1
            r0[r1] = r4
            int r4 = r2 + 1
            r1 = 0
            X.9nx r0 = X.C203399nx.A05(r9, r1, r0)
            r3[r2] = r0
            r2 = r4
        L_0x03ac:
            if (r30 == 0) goto L_0x03c3
            int r6 = r2 + 1
            X.1AL[] r5 = X.C165617ti.A0k()
            X.5Tu r0 = X.C108515Tu.A06
            if (r11 != r0) goto L_0x05b1
            java.lang.String r4 = "image"
        L_0x03ba:
            r0 = r16
            X.C36381kD.A1N(r0, r4, r5)
            X.C203399nx.A0H(r10, r5, r3, r2)
            r2 = r6
        L_0x03c3:
            if (r32 == 0) goto L_0x03cd
            int r4 = r2 + 1
            r0 = r25
            X.C203399nx.A0H(r0, r1, r3, r2)
            r2 = r4
        L_0x03cd:
            if (r33 == 0) goto L_0x05ae
            int r5 = r2 + 1
            X.1AL[] r0 = X.C165617ti.A0k()
            java.lang.String r4 = "version"
            java.lang.String r1 = "2"
            boolean r1 = X.C36371kC.A1Y(r4, r1, r0)
            X.C203399nx.A0H(r15, r0, r3, r2)
            r2 = r5
        L_0x03e1:
            r6 = r27 & 1
            r0 = 1
            if (r6 == r0) goto L_0x0532
            r4 = r27 & 2
            r0 = 2
            if (r4 == r0) goto L_0x0532
            r4 = r27 & 8
            r0 = 8
            if (r4 == r0) goto L_0x0532
            r4 = r27 & 16
            r0 = 16
            if (r4 == r0) goto L_0x0532
            r4 = 32
            r0 = r27 & 32
            if (r0 == r4) goto L_0x0532
            r1 = 0
        L_0x03fe:
            if (r34 == 0) goto L_0x0408
            int r4 = r2 + 1
            java.lang.String r0 = "disappearing_mode"
            X.C203399nx.A0H(r0, r1, r3, r2)
            r2 = r4
        L_0x0408:
            if (r35 == 0) goto L_0x0412
            int r4 = r2 + 1
            java.lang.String r0 = "lid"
            X.C203399nx.A0H(r0, r1, r3, r2)
            r2 = r4
        L_0x0412:
            if (r37 == 0) goto L_0x041a
            int r0 = r2 + 1
            X.C203399nx.A0H(r14, r1, r3, r2)
            r2 = r0
        L_0x041a:
            if (r36 == 0) goto L_0x0438
            int r6 = r2 + 1
            X.1AL[] r1 = X.C165617ti.A0k()
            java.lang.String r4 = "v"
            java.lang.String r0 = "1"
            X.C36381kD.A1N(r4, r0, r1)
            X.9nx r5 = X.C203399nx.A04(r13, r1)
            r1 = 0
            X.9nx r4 = new X.9nx
            r0 = r24
            r4.<init>((X.C203399nx) r5, (java.lang.String) r0, (X.AnonymousClass1AL[]) r1)
            r3[r2] = r4
            r2 = r6
        L_0x0438:
            if (r38 == 0) goto L_0x043f
            java.lang.String r0 = "text_status"
            X.C203399nx.A0H(r0, r1, r3, r2)
        L_0x043f:
            boolean r4 = X.C36411kG.A1a(r19)
            boolean r5 = X.C36411kG.A1a(r18)
            int r0 = r4 + 1
            int r0 = r0 + r5
            X.9nx[] r2 = new X.C203399nx[r0]
            java.lang.String r0 = "query"
            X.9nx r0 = X.C203399nx.A05(r0, r1, r3)
            r3 = 0
            r2[r3] = r0
            if (r4 == 0) goto L_0x052f
            r0 = r19
            X.9nx[] r4 = X.C165577te.A1b(r0, r3)
            java.lang.String r0 = "list"
            X.9nx r4 = X.C203399nx.A05(r0, r1, r4)
            r0 = 1
            r2[r0] = r4
            r4 = 2
        L_0x0467:
            if (r5 == 0) goto L_0x0477
            r0 = r18
            X.9nx[] r3 = X.C165577te.A1b(r0, r3)
            java.lang.String r0 = "side_list"
            X.9nx r0 = X.C203399nx.A05(r0, r1, r3)
            r2[r4] = r0
        L_0x0477:
            r0 = 5
            X.1AL[] r3 = new X.AnonymousClass1AL[r0]
            java.lang.String r0 = "sid"
            r6 = r44
            X.C36381kD.A1N(r0, r6, r3)
            java.lang.String r1 = "index"
            java.lang.String r0 = "0"
            X.C165587tf.A1L(r1, r0, r3)
            java.lang.String r1 = "last"
            java.lang.String r0 = "true"
            X.C36351kA.A1N(r1, r0, r3)
            r1 = 3
            X.5TH r0 = r11.mode
            java.lang.String r4 = r0.modeString
            java.lang.String r0 = "mode"
            X.C36341k9.A1L(r0, r4, r3, r1)
            X.5Tc r0 = r11.context
            java.lang.String r5 = r0.contextString
            java.lang.String r4 = "context"
            X.1AL r0 = new X.1AL
            r0.<init>((java.lang.String) r4, (java.lang.String) r5)
            r4 = 4
            r3[r4] = r0
            java.lang.String r0 = "usync"
            X.9nx r2 = X.C203399nx.A05(r0, r3, r2)
            X.1AL[] r1 = new X.AnonymousClass1AL[r1]
            java.lang.String r3 = "xmlns"
            X.C36381kD.A1N(r3, r0, r1)
            r3 = r23
            r0 = r17
            X.C165587tf.A1L(r3, r0, r1)
            java.lang.String r3 = "get"
            r0 = r16
            X.C36351kA.A1N(r0, r3, r1)
            X.9nx r2 = X.C36391kE.A0m(r2, r1)
            boolean r1 = r12.A03
            X.5Tu r0 = X.C108515Tu.A06
            if (r11 != r0) goto L_0x052c
            java.lang.String r25 = "image"
        L_0x04ce:
            X.9Oc r0 = new X.9Oc
            r24 = r11
            r26 = r6
            r39 = r1
            r23 = r0
            r23.<init>(r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39)
            android.util.Pair r4 = android.util.Pair.create(r0, r2)
            java.lang.Object r3 = r4.first
            X.9Oc r3 = (X.C194099Oc) r3
            r0 = r41
            java.util.Map r1 = r0.A05
            r0 = r17
            r1.put(r0, r3)
            X.5Tc r1 = r11.context
            X.5Tc r0 = X.C108335Tc.REGISTRATION
            boolean r2 = X.C36361kB.A1a(r1, r0)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "UniSyncProtocolHelper/sendUniSyncIq; request="
            r1.append(r0)
            r1.append(r12)
            java.lang.String r0 = "; sid="
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = "; isRegistration="
            X.C36321k7.A1X(r0, r1, r2)
            java.lang.Object r0 = r4.second
            X.9nx r0 = (X.C203399nx) r0
            r8 = 102(0x66, float:1.43E-43)
            boolean r11 = X.C90484aE.A1U(r0)
            r9 = r45
            r4 = r40
            r5 = r41
            r6 = r0
            r7 = r17
            if (r2 == 0) goto L_0x0528
            X.AnonymousClass19A.A04(r4, r5, r6, r7, r8, r9, r11)
        L_0x0525:
            X.777 r0 = r3.A00
            return r0
        L_0x0528:
            X.AnonymousClass19A.A03(r4, r5, r6, r7, r8, r9, r11)
            goto L_0x0525
        L_0x052c:
            java.lang.String r25 = "preview"
            goto L_0x04ce
        L_0x052f:
            r4 = 1
            goto L_0x0467
        L_0x0532:
            java.lang.String r0 = "merchant_status"
            r4 = 0
            X.9nx r7 = X.C203399nx.A04(r0, r4)
            java.lang.String r0 = "consumer_status"
            X.9nx r9 = X.C203399nx.A04(r0, r4)
            java.lang.String r0 = "eligible_offers"
            X.9nx r10 = X.C203399nx.A04(r0, r4)
            java.util.ArrayList r0 = X.AnonymousClass001.A0I()
            r5 = 1
            if (r6 != r5) goto L_0x054f
            r0.add(r7)
        L_0x054f:
            r7 = r27 & 2
            r6 = 2
            if (r7 == r6) goto L_0x055a
            r8 = 16
            r5 = r27 & 16
            if (r5 != r8) goto L_0x0575
        L_0x055a:
            java.util.ArrayList r5 = X.AnonymousClass001.A0I()
            if (r7 != r6) goto L_0x0563
            r5.add(r9)
        L_0x0563:
            r7 = r27 & 16
            r6 = 16
            if (r7 != r6) goto L_0x056c
            r5.add(r10)
        L_0x056c:
            X.9nx[] r6 = X.C165577te.A1b(r5, r1)
            java.lang.String r5 = "upi"
            X.C203399nx.A0F(r5, r0, r4, r6)
        L_0x0575:
            r7 = r27 & 8
            r6 = 8
            if (r7 == r6) goto L_0x0581
            r8 = 32
            r5 = r27 & 32
            if (r5 != r8) goto L_0x059c
        L_0x0581:
            java.util.ArrayList r5 = X.AnonymousClass001.A0I()
            if (r7 != r6) goto L_0x058a
            r5.add(r9)
        L_0x058a:
            r7 = 32
            r6 = r27 & 32
            if (r6 != r7) goto L_0x0593
            r5.add(r10)
        L_0x0593:
            X.9nx[] r6 = X.C165577te.A1b(r5, r1)
            java.lang.String r5 = "fbpay"
            X.C203399nx.A0F(r5, r0, r4, r6)
        L_0x059c:
            int r6 = r2 + 1
            X.9nx[] r5 = X.C165577te.A1b(r0, r1)
            r1 = 0
            r0 = r20
            X.9nx r0 = X.C203399nx.A05(r0, r4, r5)
            r3[r2] = r0
            r2 = r6
            goto L_0x03fe
        L_0x05ae:
            r1 = 0
            goto L_0x03e1
        L_0x05b1:
            java.lang.String r4 = "preview"
            goto L_0x03ba
        L_0x05b5:
            r2 = 0
            goto L_0x0377
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AIC.A05(X.9eK, java.lang.String, long):X.777");
    }

    public void BVN(String str) {
        C194099Oc r0 = (C194099Oc) this.A05.remove(str);
        if (r0 != null) {
            r0.A00.BVM(new C52812qD(str));
        } else {
            Log.w("UniSyncProtocolHelper/onDeliveryFailure missing request");
        }
    }

    public void BWw(C203399nx r11, String str) {
        C194099Oc r2 = (C194099Oc) this.A05.remove(str);
        if (r2 != null) {
            C203399nx A0c = r11.A0c("error");
            int i = 0;
            long j = -1;
            if (A0c != null) {
                String A0i = A0c.A0i("code", (String) null);
                if (A0i != null) {
                    i = Integer.parseInt(A0i);
                }
                String A0i2 = A0c.A0i("backoff", (String) null);
                if (A0i2 != null) {
                    j = Math.min(Long.parseLong(A0i2) * 1000, 3600000);
                }
            }
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("UniSyncProtocolHelper/handleSyncContactError sid=");
            String str2 = r2.A04;
            A0u.append(str2);
            A0u.append(" code=");
            A0u.append(i);
            C36321k7.A1V(" backoff=", A0u, j);
            this.A01.BJi(r2.A02, str2, 0, i, j);
            r2.A00.BVO((Object) null);
            return;
        }
        Log.w("UniSyncProtocolHelper/onError missing request");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x01fb, code lost:
        r0.A0K.add(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x05c8, code lost:
        if (r12 == false) goto L_0x05ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:231:0x05cf, code lost:
        if (r12 != false) goto L_0x05d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:0x05d5, code lost:
        if (X.AnonymousClass14B.A0F(r11) == false) goto L_0x062b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:0x05dd, code lost:
        if (r1.A0c("text_status") == null) goto L_0x05ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x05e5, code lost:
        if (r6.A0E(5839) == false) goto L_0x05ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x05e7, code lost:
        r6 = r1.A0d("text_status");
        r11 = java.util.concurrent.TimeUnit.SECONDS.toMillis(r6.A0V("last_update_time", 0));
        r4 = r6.A0V("ephemeral_duration_sec", 0);
        r10 = r6.A0i("text", (java.lang.String) null);
        r6 = r6.A0c("emoji");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x060b, code lost:
        if (r6 == null) goto L_0x0628;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:0x060d, code lost:
        r6 = r6.A0i("content", (java.lang.String) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x0613, code lost:
        if (r6 == null) goto L_0x0628;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x0615, code lost:
        r0.A0I = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x0619, code lost:
        if (r4 <= 0) goto L_0x0623;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x061b, code lost:
        r4 = r11 + java.util.concurrent.TimeUnit.SECONDS.toMillis(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:0x0623, code lost:
        r0.A08 = r4;
        r0.A0H = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:0x0628, code lost:
        r6 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:247:0x062b, code lost:
        r0.A03 = 1;
        r0.A08 = r4;
        r0.A0H = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x01f3, code lost:
        r0.A04 = r4;
        r5 = r7.A0e();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x01f9, code lost:
        if (r5 == null) goto L_0x01b4;
     */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x0201  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x020d  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0253  */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x047a  */
    /* JADX WARNING: Removed duplicated region for block: B:201:0x04cd  */
    /* JADX WARNING: Removed duplicated region for block: B:204:0x04f0  */
    /* JADX WARNING: Removed duplicated region for block: B:221:0x05af  */
    /* JADX WARNING: Removed duplicated region for block: B:250:0x063c  */
    /* JADX WARNING: Removed duplicated region for block: B:253:0x065a  */
    /* JADX WARNING: Removed duplicated region for block: B:276:0x06ec  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0193  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x01a6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BiM(X.C203399nx r58, java.lang.String r59) {
        /*
            r57 = this;
            r56 = r57
            r0 = r56
            java.util.Map r0 = r0.A05
            r1 = r59
            java.lang.Object r3 = r0.remove(r1)
            X.9Oc r3 = (X.C194099Oc) r3
            if (r3 == 0) goto L_0x07bd
            java.lang.String r0 = "usync"
            r1 = r58
            X.9nx r1 = r1.A0c(r0)
            if (r1 == 0) goto L_0x07b6
            java.lang.String r0 = "result"
            X.9nx r0 = r1.A0d(r0)
            boolean r5 = r3.A08
            java.lang.String r4 = " backoff="
            java.lang.String r2 = " code="
            if (r5 == 0) goto L_0x0752
            java.lang.String r6 = "contact"
            X.9Rr r26 = A00(r0, r6)
            r5 = r26
            boolean r5 = r5.A03
            if (r5 != 0) goto L_0x006a
            boolean r5 = r3.A05
            if (r5 != 0) goto L_0x006a
            java.lang.StringBuilder r9 = X.AnonymousClass000.A0u()
            java.lang.String r5 = "UniSyncProtocolHelper/handleSyncContactError sid="
            r9.append(r5)
            java.lang.String r11 = r3.A04
            r9.append(r11)
            r9.append(r2)
            r5 = r26
            java.lang.Integer r8 = r5.A00
            r9.append(r8)
            r9.append(r4)
            java.lang.Long r7 = r5.A01
            X.C36321k7.A1N(r7, r9)
            r5 = r56
            X.1Oi r9 = r5.A01
            X.5Tu r10 = r3.A02
            r12 = 0
            int r13 = r8.intValue()
            long r14 = r7.longValue()
            r9.BJi(r10, r11, r12, r13, r14)
        L_0x006a:
            X.9nx r6 = r0.A0d(r6)
            java.lang.String r5 = "version"
            java.lang.String r43 = X.C36391kE.A0x(r6, r5)
        L_0x0074:
            boolean r5 = r3.A0G
            if (r5 == 0) goto L_0x074e
            java.lang.String r5 = "sidelist"
            X.9Rr r25 = A00(r0, r5)
            r5 = r25
            boolean r5 = r5.A03
            if (r5 != 0) goto L_0x00b8
            boolean r5 = r3.A05
            if (r5 != 0) goto L_0x00b8
            java.lang.StringBuilder r6 = X.AnonymousClass000.A0u()
            java.lang.String r5 = "UniSyncProtocolHelper/handleSyncSidelistError sid="
            r6.append(r5)
            java.lang.String r9 = r3.A04
            r6.append(r9)
            r6.append(r2)
            r2 = r25
            java.lang.Integer r5 = r2.A00
            r6.append(r5)
            r6.append(r4)
            java.lang.Long r4 = r2.A01
            X.C36321k7.A1N(r4, r6)
            r2 = r56
            X.1Oi r6 = r2.A01
            r7 = 0
            int r8 = r5.intValue()
            long r10 = r4.longValue()
            r6.BJk(r7, r8, r9, r10)
        L_0x00b8:
            boolean r2 = r3.A0D
            if (r2 == 0) goto L_0x074a
            java.lang.String r2 = "status"
            X.9Rr r34 = A00(r0, r2)
        L_0x00c2:
            boolean r2 = r3.A0C
            if (r2 == 0) goto L_0x0746
            java.lang.String r2 = "picture"
            X.9Rr r35 = A00(r0, r2)
        L_0x00cc:
            boolean r2 = r3.A07
            java.lang.String r31 = "business"
            if (r2 == 0) goto L_0x0742
            r2 = r31
            X.9Rr r22 = A00(r0, r2)
        L_0x00d8:
            boolean r2 = r3.A09
            if (r2 == 0) goto L_0x073e
            java.lang.String r2 = "devices"
            X.9Rr r36 = A00(r0, r2)
        L_0x00e2:
            int r5 = r3.A01
            r4 = r5 & 1
            r2 = 1
            if (r4 == r2) goto L_0x0736
            r4 = r5 & 2
            r2 = 2
            if (r4 == r2) goto L_0x0736
            r4 = r5 & 8
            r2 = 8
            if (r4 == r2) goto L_0x0736
            r4 = r5 & 16
            r2 = 16
            if (r4 == r2) goto L_0x0736
            r4 = 32
            r2 = r5 & 32
            if (r2 == r4) goto L_0x0736
            r37 = 0
        L_0x0102:
            boolean r2 = r3.A0A
            if (r2 == 0) goto L_0x0732
            java.lang.String r2 = "disappearing_mode"
            X.9Rr r38 = A00(r0, r2)
        L_0x010c:
            boolean r2 = r3.A0B
            java.lang.String r30 = "lid"
            if (r2 == 0) goto L_0x072e
            r2 = r30
            X.9Rr r21 = A00(r0, r2)
        L_0x0118:
            boolean r2 = r3.A06
            if (r2 == 0) goto L_0x072a
            java.lang.String r2 = "bot"
            X.9Rr r40 = A00(r0, r2)
        L_0x0122:
            boolean r2 = r3.A0F
            java.lang.String r29 = "username"
            if (r2 == 0) goto L_0x0726
            r2 = r29
            X.9Rr r20 = A00(r0, r2)
        L_0x012e:
            boolean r2 = r3.A0E
            if (r2 == 0) goto L_0x0722
            java.lang.String r2 = "text_status"
            X.9Rr r42 = A00(r0, r2)
        L_0x0138:
            java.lang.String r0 = "list"
            X.9nx r0 = r1.A0d(r0)
            java.lang.String r2 = "side_list"
            X.9nx r23 = r1.A0c(r2)
            X.9nx[] r0 = r0.A02
            r24 = r0
            if (r0 == 0) goto L_0x071e
            int r0 = r0.length
            r19 = r0
        L_0x014d:
            if (r23 == 0) goto L_0x071a
            r0 = r23
            X.9nx[] r0 = r0.A02
            if (r0 == 0) goto L_0x071a
            int r0 = r0.length
            r17 = r0
        L_0x0158:
            int r17 = r17 + r19
            java.util.HashMap r27 = X.AnonymousClass001.A0J()
            java.util.ArrayList r28 = X.AnonymousClass001.A0I()
            r16 = 0
        L_0x0164:
            r1 = r17
            r0 = r16
            if (r0 >= r1) goto L_0x0776
            r1 = r19
            if (r0 >= r1) goto L_0x070e
            r1 = r24[r16]
            r18 = 0
        L_0x0172:
            java.lang.Class<com.whatsapp.jid.UserJid> r0 = com.whatsapp.jid.UserJid.class
            java.lang.String r4 = "jid"
            com.whatsapp.jid.Jid r5 = r1.A0X(r0, r4)
            if (r5 != 0) goto L_0x06f0
            X.9Oj r0 = new X.9Oj
            r0.<init>()
        L_0x0181:
            r2 = r28
            r2.add(r0)
        L_0x0186:
            r2 = 0
            java.lang.String r4 = r1.A0i(r4, r2)
            com.whatsapp.jid.UserJid r4 = X.C36431kI.A0l(r4)
            r0.A0D = r4
            if (r18 == 0) goto L_0x06ec
            java.lang.String r4 = "sidelist"
        L_0x0195:
            java.util.List r7 = r1.A0j(r4)
            boolean r5 = r7.isEmpty()
            r13 = 0
            java.lang.String r33 = "type"
            r32 = 3
            r4 = 1
            r6 = -1
            if (r5 != 0) goto L_0x0201
            java.util.List r4 = r0.A0K
            if (r4 != 0) goto L_0x01b0
            java.util.ArrayList r4 = X.AnonymousClass001.A0I()
            r0.A0K = r4
        L_0x01b0:
            java.util.Iterator r8 = r7.iterator()
        L_0x01b4:
            boolean r4 = r8.hasNext()
            if (r4 == 0) goto L_0x0203
            X.9nx r7 = X.C36431kI.A0s(r8)
            r4 = r33
            java.lang.String r5 = r7.A0h(r4)
            int r4 = r5.hashCode()
            switch(r4) {
                case 3365: goto L_0x01d6;
                case 110414: goto L_0x01e0;
                case 1959784951: goto L_0x01ea;
                default: goto L_0x01cb;
            }
        L_0x01cb:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Invalid contact type="
            X.19b r0 = X.C165567td.A0G(r0, r5, r1)
            throw r0
        L_0x01d6:
            java.lang.String r4 = "in"
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L_0x01cb
            r4 = 1
            goto L_0x01f3
        L_0x01e0:
            java.lang.String r4 = "out"
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L_0x01cb
            r4 = 2
            goto L_0x01f3
        L_0x01ea:
            java.lang.String r4 = "invalid"
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L_0x01cb
            r4 = 3
        L_0x01f3:
            r0.A04 = r4
            java.lang.String r5 = r7.A0e()
            if (r5 == 0) goto L_0x01b4
            java.util.List r4 = r0.A0K
            r4.add(r5)
            goto L_0x01b4
        L_0x0201:
            r0.A04 = r4
        L_0x0203:
            java.lang.String r4 = "devices"
            X.9nx r5 = r1.A0c(r4)
            java.lang.String r14 = "code"
            if (r5 == 0) goto L_0x024b
            X.9nx r7 = r1.A0d(r4)
            java.lang.String r5 = "error"
            X.9nx r4 = r7.A0c(r5)
            if (r4 == 0) goto L_0x030c
            r0.A00 = r6
            java.lang.StringBuilder r4 = X.AnonymousClass000.A0u()
            java.lang.String r8 = "UniSyncProtocolHelper/parseUser/partial error code="
            r4.append(r8)
            X.9nx r8 = r7.A0c(r5)
            int r6 = r8.A0S(r14, r6)
            r4.append(r6)
            java.lang.String r6 = "; text="
            r4.append(r6)
            X.9nx r6 = r7.A0c(r5)
            java.lang.String r5 = "text"
            java.lang.String r5 = r6.A0i(r5, r2)
            r4.append(r5)
            java.lang.String r5 = "; jid="
            r4.append(r5)
            com.whatsapp.jid.UserJid r5 = r0.A0D
            X.C36351kA.A1L(r5, r4)
        L_0x024b:
            java.lang.String r4 = "bot"
            X.9nx r5 = r1.A0c(r4)
            if (r5 == 0) goto L_0x0470
            X.9nx r5 = r1.A0c(r4)
            java.lang.String r4 = "profile"
            X.9nx r4 = r5.A0d(r4)
            java.lang.String r5 = "tag"
            int r54 = r4.A0S(r5, r13)
            java.lang.String r5 = "persona_id"
            java.lang.String r50 = r4.A0i(r5, r2)
            X.9nx[] r5 = r4.A02
            if (r5 == 0) goto L_0x0455
            java.lang.String r9 = "name"
            X.9nx r15 = r4.A0c(r9)
            java.lang.String r5 = "default"
            X.9nx r7 = r4.A0c(r5)
            java.lang.String r5 = "attributes"
            X.9nx r11 = r4.A0c(r5)
            java.lang.String r5 = "category"
            X.9nx r10 = r4.A0c(r5)
            java.lang.String r5 = "prompts"
            X.9nx r5 = r4.A0c(r5)
            java.lang.String r6 = "avatar"
            X.9nx r8 = r4.A0c(r6)
            java.lang.String r6 = "commands"
            X.9nx r4 = r4.A0c(r6)
            r51 = 0
            if (r4 == 0) goto L_0x030a
            java.lang.String r6 = "description"
            X.9nx r12 = r4.A0c(r6)
        L_0x02a1:
            if (r15 == 0) goto L_0x0307
            java.lang.String r46 = r15.A0e()
        L_0x02a7:
            if (r7 == 0) goto L_0x0304
            java.lang.String r7 = r7.A0e()
            java.lang.String r6 = "true"
            boolean r6 = r6.equals(r7)
            java.lang.Boolean r45 = java.lang.Boolean.valueOf(r6)
        L_0x02b7:
            if (r11 == 0) goto L_0x0301
            java.lang.String r47 = r11.A0e()
        L_0x02bd:
            if (r10 == 0) goto L_0x02fe
            java.lang.String r48 = r10.A0e()
        L_0x02c3:
            java.util.ArrayList r10 = X.AnonymousClass001.A0I()
            if (r5 == 0) goto L_0x03f1
            java.lang.String r6 = "prompt"
            java.util.Iterator r11 = X.C203399nx.A08(r5, r6)
        L_0x02cf:
            boolean r5 = r11.hasNext()
            if (r5 == 0) goto L_0x03f1
            X.9nx r5 = X.C36431kI.A0s(r11)
            java.lang.String r6 = "text"
            X.9nx r6 = r5.A0c(r6)
            if (r6 == 0) goto L_0x02cf
            java.lang.String r7 = r6.A0e()
            if (r7 == 0) goto L_0x02cf
            java.lang.String r6 = "emoji"
            X.9nx r5 = r5.A0c(r6)
            if (r5 != 0) goto L_0x02f9
            r6 = 0
        L_0x02f0:
            X.6A7 r5 = new X.6A7
            r5.<init>(r7, r6)
            r10.add(r5)
            goto L_0x02cf
        L_0x02f9:
            java.lang.String r6 = r5.A0e()
            goto L_0x02f0
        L_0x02fe:
            r48 = r2
            goto L_0x02c3
        L_0x0301:
            r47 = r2
            goto L_0x02bd
        L_0x0304:
            r45 = r2
            goto L_0x02b7
        L_0x0307:
            r46 = r2
            goto L_0x02a7
        L_0x030a:
            r12 = r2
            goto L_0x02a1
        L_0x030c:
            r4 = 1
            r0.A00 = r4
            java.lang.StringBuilder r5 = X.AnonymousClass000.A0u()
            java.lang.String r4 = "unisyncprotocolhelper/parseDeviceData v2 user="
            r5.append(r4)
            com.whatsapp.jid.UserJid r4 = r0.A0D
            X.C36321k7.A1N(r4, r5)
            java.lang.String r4 = "device-list"
            X.9nx r5 = r7.A0c(r4)
            r10 = 0
            if (r5 == 0) goto L_0x03a1
            X.9nx r5 = r7.A0c(r4)
            java.lang.String r4 = "device"
            java.util.List r5 = r5.A0j(r4)
            boolean r4 = r5.isEmpty()
            if (r4 != 0) goto L_0x03a1
            java.util.Map r4 = r0.A0L
            if (r4 != 0) goto L_0x0341
            java.util.HashMap r4 = X.AnonymousClass001.A0J()
            r0.A0L = r4
        L_0x0341:
            java.util.Iterator r15 = r5.iterator()
        L_0x0345:
            boolean r4 = r15.hasNext()
            if (r4 == 0) goto L_0x03a1
            X.9nx r6 = X.C36431kI.A0s(r15)
            java.lang.String r4 = "id"
            int r5 = X.C203399nx.A00(r6, r4)
            com.whatsapp.jid.UserJid r8 = r0.A0D     // Catch:{ 0wR -> 0x075f }
            X.C18740tg.A06(r8)     // Catch:{ 0wR -> 0x075f }
            X.13u r4 = com.whatsapp.jid.DeviceJid.Companion     // Catch:{ 0wR -> 0x075f }
            com.whatsapp.jid.DeviceJid r12 = r4.A01(r8, r5)     // Catch:{ 0wR -> 0x075f }
            java.lang.String r4 = "is_hosted"
            java.lang.String r5 = r6.A0i(r4, r2)
            boolean r8 = X.AnonymousClass9ZV.A00(r12)
            java.lang.String r4 = "true"
            boolean r4 = r4.equals(r5)
            if (r8 == r4) goto L_0x0391
            r4 = r56
            X.0yC r8 = r4.A02
            r4 = 6671(0x1a0f, float:9.348E-42)
            boolean r4 = r8.A0E(r4)
            if (r4 != 0) goto L_0x0758
            r4 = r56
            X.0wN r9 = r4.A00
            java.lang.StringBuilder r8 = X.AnonymousClass000.A0u()
            java.lang.String r4 = "sync; isHosted: "
            java.lang.String r5 = X.AnonymousClass000.A0p(r4, r5, r8)
            java.lang.String r4 = "invalid-hosted-flag"
            r9.A0E(r4, r5, r13)
        L_0x0391:
            java.util.Map r5 = r0.A0L
            java.lang.String r4 = "key-index"
            long r8 = r6.A0V(r4, r10)
            java.lang.Long r4 = java.lang.Long.valueOf(r8)
            r5.put(r12, r4)
            goto L_0x0345
        L_0x03a1:
            java.lang.String r6 = "key-index-list"
            X.9nx r4 = r7.A0c(r6)
            if (r4 == 0) goto L_0x024b
            X.9nx r5 = r7.A0c(r6)
            java.lang.String r4 = "ts"
            java.lang.String r8 = r5.A0h(r4)
            long r4 = r5.A0W(r8, r4)
            r0.A06 = r4
            X.9nx r5 = r7.A0c(r6)
            java.lang.String r4 = "expected_ts"
            long r4 = r5.A0V(r4, r10)
            r0.A05 = r4
            X.9nx r4 = r7.A0c(r6)
            byte[] r4 = r4.A01
            r0.A0N = r4
            java.lang.StringBuilder r6 = X.AnonymousClass000.A0u()
            java.lang.String r4 = "unisyncprotocolhelper/parseDeviceData v2 index list="
            r6.append(r4)
            com.whatsapp.jid.UserJid r4 = r0.A0D
            r6.append(r4)
            java.lang.String r4 = "; ts="
            r6.append(r4)
            long r4 = r0.A06
            r6.append(r4)
            java.lang.String r4 = "; expectedTs="
            r6.append(r4)
            long r4 = r0.A05
            X.C36351kA.A1S(r6, r4)
            goto L_0x024b
        L_0x03f1:
            if (r8 == 0) goto L_0x0442
            java.lang.String r5 = "behavior_graph"
            X.9nx r5 = r8.A0c(r5)
            if (r5 == 0) goto L_0x0442
            java.lang.String r49 = r5.A0e()
        L_0x03ff:
            if (r12 == 0) goto L_0x0405
            java.lang.String r51 = r12.A0e()
        L_0x0405:
            java.util.ArrayList r7 = X.AnonymousClass001.A0I()
            if (r4 == 0) goto L_0x0445
            java.lang.String r5 = "command"
            java.util.Iterator r8 = X.C203399nx.A08(r4, r5)
        L_0x0411:
            boolean r4 = r8.hasNext()
            if (r4 == 0) goto L_0x0445
            X.9nx r4 = X.C36431kI.A0s(r8)
            X.9nx r5 = r4.A0c(r9)
            if (r5 == 0) goto L_0x0411
            java.lang.String r6 = r5.A0e()
            boolean r5 = android.text.TextUtils.isEmpty(r6)
            if (r5 != 0) goto L_0x0411
            java.lang.String r5 = "description"
            X.9nx r4 = r4.A0c(r5)
            if (r4 != 0) goto L_0x043d
            r5 = 0
        L_0x0434:
            X.6A6 r4 = new X.6A6
            r4.<init>(r6, r5)
            r7.add(r4)
            goto L_0x0411
        L_0x043d:
            java.lang.String r5 = r4.A0e()
            goto L_0x0434
        L_0x0442:
            r49 = r2
            goto L_0x03ff
        L_0x0445:
            X.6E0 r4 = new X.6E0
            r55 = 0
            r44 = r4
            r52 = r10
            r53 = r7
            r44.<init>(r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55)
            r0.A0A = r4
            goto L_0x0470
        L_0x0455:
            r55 = 1
            X.09w r52 = X.C023409w.A00
            X.6E0 r4 = new X.6E0
            r46 = r2
            r47 = r2
            r48 = r2
            r49 = r2
            r51 = r2
            r44 = r4
            r45 = r2
            r53 = r52
            r44.<init>(r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55)
            r0.A0A = r4
        L_0x0470:
            java.lang.String r4 = "status"
            X.9nx r5 = r1.A0c(r4)
            java.lang.String r15 = "t"
            if (r5 == 0) goto L_0x04c3
            X.9nx r8 = r1.A0d(r4)
            r6 = 1000(0x3e8, double:4.94E-321)
            r4 = 0
            long r4 = r8.A0V(r15, r4)
            long r4 = r4 * r6
            java.lang.String r7 = r8.A0i(r14, r2)
            r6 = r33
            java.lang.String r9 = r8.A0i(r6, r2)
            java.lang.String r11 = r8.A0e()
            r6 = r56
            X.0yC r6 = r6.A02
            r10 = 5839(0x16cf, float:8.182E-42)
            boolean r12 = r6.A0E(r10)
            if (r9 == 0) goto L_0x05b9
            java.lang.String r10 = "fail"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x05b9
            java.lang.String r4 = "401"
            boolean r4 = r4.equals(r7)
            if (r4 != 0) goto L_0x05b4
            java.lang.String r4 = "403"
            boolean r4 = r4.equals(r7)
            if (r4 != 0) goto L_0x05b4
            java.lang.String r4 = "404"
            boolean r4 = r4.equals(r7)
            if (r4 != 0) goto L_0x05b4
            r0.A03 = r13
        L_0x04c3:
            java.lang.String r4 = "picture"
            X.9nx r5 = r1.A0c(r4)
            java.lang.String r14 = "id"
            if (r5 == 0) goto L_0x05af
            X.9nx r5 = r1.A0d(r4)
            r7 = -1
            int r4 = r5.A0S(r14, r7)
            r0.A02 = r4
            java.lang.String r4 = "direct_path"
            java.lang.String r4 = r5.A0i(r4, r2)
            r0.A0E = r4
            java.lang.String r4 = "hash"
            java.lang.String r4 = r5.A0i(r4, r2)
            r0.A0F = r4
        L_0x04e8:
            java.lang.String r4 = "pay"
            X.9nx r12 = r1.A0c(r4)
            if (r12 == 0) goto L_0x0634
            X.9Ll r4 = new X.9Ll
            r4.<init>()
            r0.A0B = r4
            java.lang.String r4 = "merchant_status"
            X.9nx r5 = r12.A0c(r4)
            java.lang.String r13 = "value"
            java.lang.String r6 = "dhash"
            if (r5 == 0) goto L_0x051b
            X.9Ll r9 = r0.A0B
            java.lang.String r4 = "false"
            java.lang.String r8 = r5.A0i(r13, r4)
            java.lang.String r4 = "true"
            boolean r4 = r4.equals(r8)
            r9.A01 = r4
            X.9Ll r4 = r0.A0B
            java.lang.String r5 = r5.A0i(r6, r2)
            r4.A00 = r5
        L_0x051b:
            java.util.HashMap r5 = X.AnonymousClass001.A0J()
            java.lang.Integer r8 = X.C36361kB.A0i()
            java.lang.String r4 = "upi"
            r5.put(r8, r4)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r32)
            java.lang.String r4 = "fbpay"
            r5.put(r8, r4)
            java.util.Iterator r33 = X.C36371kC.A10(r5)
        L_0x0535:
            boolean r4 = r33.hasNext()
            if (r4 == 0) goto L_0x0634
            java.util.Map$Entry r32 = X.AnonymousClass000.A11(r33)
            java.lang.String r4 = X.C90514aH.A10(r32)
            X.9nx r5 = r12.A0c(r4)
            if (r5 == 0) goto L_0x0535
            java.lang.String r4 = "consumer_status"
            X.9nx r4 = r5.A0c(r4)
            if (r4 == 0) goto L_0x056d
            X.9Ll r10 = r0.A0B
            java.lang.Object r11 = r32.getKey()
            java.lang.String r9 = r4.A0h(r13)
            java.lang.String r8 = r4.A0i(r6, r2)
            X.9Hf r4 = new X.9Hf
            r4.<init>()
            r4.A01 = r9
            r4.A00 = r8
            java.util.HashMap r8 = r10.A02
            r8.put(r11, r4)
        L_0x056d:
            java.lang.String r4 = "eligible_offers"
            X.9nx r5 = r5.A0c(r4)
            if (r5 == 0) goto L_0x0535
            java.lang.String r4 = "offer"
            X.9nx r8 = r5.A0c(r4)
            X.9Ll r9 = r0.A0B
            java.lang.Object r4 = r32.getKey()
            if (r8 == 0) goto L_0x059a
            java.lang.String r10 = r8.A0h(r14)
            java.lang.String r8 = r5.A0i(r6, r2)
            X.9Hg r5 = new X.9Hg
            r5.<init>()
            r5.A01 = r10
            r5.A00 = r8
            java.util.HashMap r8 = r9.A03
            r8.put(r4, r5)
            goto L_0x0535
        L_0x059a:
            java.lang.String r10 = r5.A0i(r6, r2)
            java.lang.String r8 = ""
            X.9Hg r5 = new X.9Hg
            r5.<init>()
            r5.A01 = r8
            r5.A00 = r10
            java.util.HashMap r8 = r9.A03
            r8.put(r4, r5)
            goto L_0x0535
        L_0x05af:
            r7 = -1
            r0.A02 = r7
            goto L_0x04e8
        L_0x05b4:
            r4 = 2
            r0.A03 = r4
            goto L_0x04c3
        L_0x05b9:
            X.1AL[] r7 = r8.A0k()
            if (r7 == 0) goto L_0x05c2
            int r7 = r7.length
            if (r7 != 0) goto L_0x05cf
        L_0x05c2:
            boolean r7 = android.text.TextUtils.isEmpty(r11)
            if (r7 == 0) goto L_0x05cf
            if (r12 != 0) goto L_0x05d1
        L_0x05ca:
            r4 = 3
            r0.A03 = r4
            goto L_0x04c3
        L_0x05cf:
            if (r12 == 0) goto L_0x062b
        L_0x05d1:
            boolean r7 = X.AnonymousClass14B.A0F(r11)
            if (r7 == 0) goto L_0x062b
            java.lang.String r5 = "text_status"
            X.9nx r4 = r1.A0c(r5)
            if (r4 == 0) goto L_0x05ca
            r4 = 5839(0x16cf, float:8.182E-42)
            boolean r4 = r6.A0E(r4)
            if (r4 == 0) goto L_0x05ca
            X.9nx r6 = r1.A0d(r5)
            java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.SECONDS
            java.lang.String r4 = "last_update_time"
            r7 = 0
            long r4 = r6.A0V(r4, r7)
            long r11 = r9.toMillis(r4)
            java.lang.String r4 = "ephemeral_duration_sec"
            long r4 = r6.A0V(r4, r7)
            java.lang.String r9 = "text"
            java.lang.String r10 = r6.A0i(r9, r2)
            java.lang.String r9 = "emoji"
            X.9nx r6 = r6.A0c(r9)
            if (r6 == 0) goto L_0x0628
            java.lang.String r9 = "content"
            java.lang.String r6 = r6.A0i(r9, r2)
            if (r6 == 0) goto L_0x0628
        L_0x0615:
            r0.A0I = r6
            int r6 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r6 <= 0) goto L_0x0623
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.SECONDS
            long r6 = r6.toMillis(r4)
            long r4 = r11 + r6
        L_0x0623:
            r0.A08 = r4
            r0.A0H = r10
            goto L_0x05ca
        L_0x0628:
            java.lang.String r6 = ""
            goto L_0x0615
        L_0x062b:
            r6 = 1
            r0.A03 = r6
            r0.A08 = r4
            r0.A0H = r11
            goto L_0x04c3
        L_0x0634:
            java.lang.String r4 = "disappearing_mode"
            X.9nx r5 = r1.A0c(r4)
            if (r5 == 0) goto L_0x064e
            java.lang.String r4 = "duration"
            int r4 = r5.A0S(r4, r7)
            r0.A01 = r4
            java.lang.String r4 = r5.A0h(r15)
            long r4 = r5.A0W(r4, r15)
            r0.A07 = r4
        L_0x064e:
            r4 = r18
            r0.A0M = r4
            java.lang.String r4 = r3.A03
            r0.A0G = r4
            com.whatsapp.jid.UserJid r4 = r0.A0D
            if (r4 == 0) goto L_0x06b3
            r4 = r31
            X.9nx r5 = r1.A0c(r4)
            if (r22 == 0) goto L_0x06b3
            r4 = r22
            boolean r4 = r4.A03
            if (r4 == 0) goto L_0x06b3
            if (r5 == 0) goto L_0x06b3
            com.whatsapp.jid.UserJid r4 = r0.A0D
            X.9K4 r6 = new X.9K4
            r6.<init>()
            r6.A01 = r4
            r6.A02 = r5
            java.lang.String r4 = "verified_name"
            X.9nx r4 = r5.A0c(r4)
            if (r4 == 0) goto L_0x06e9
            X.9K3 r5 = new X.9K3
            r5.<init>()
            byte[] r7 = r4.A01
            r5.A02 = r7
            java.lang.String r7 = "verified_level"
            r9 = 0
            java.lang.String r7 = r4.A0i(r7, r2)
            X.C18740tg.A06(r7)
            int r7 = X.C111485cM.A00(r7)
            r5.A00 = r7
            java.lang.String r7 = "host_storage"
            java.lang.String r8 = r4.A0i(r7, r2)
            java.lang.String r7 = "actual_actors"
            java.lang.String r7 = r4.A0i(r7, r2)
            java.lang.String r2 = "privacy_mode_ts"
            java.lang.String r4 = r4.A0i(r2, r9)
            X.3ur r2 = new X.3ur
            r2.<init>((java.lang.String) r8, (java.lang.String) r7, (java.lang.String) r4)
            r5.A01 = r2
            r6.A00 = r5
        L_0x06b1:
            r0.A09 = r6
        L_0x06b3:
            if (r21 == 0) goto L_0x06cf
            r2 = r21
            boolean r2 = r2.A03
            if (r2 == 0) goto L_0x06cf
            r2 = r30
            X.9nx r5 = r1.A0c(r2)
            if (r5 == 0) goto L_0x06cf
            java.lang.Class<X.13w> r4 = X.C223313w.class
            java.lang.String r2 = "val"
            com.whatsapp.jid.Jid r2 = r5.A0X(r4, r2)
            X.13w r2 = (X.C223313w) r2
            r0.A0C = r2
        L_0x06cf:
            if (r20 == 0) goto L_0x06e5
            r2 = r20
            boolean r2 = r2.A03
            if (r2 == 0) goto L_0x06e5
            r2 = r29
            X.9nx r1 = r1.A0c(r2)
            if (r1 == 0) goto L_0x06e5
            java.lang.String r1 = r1.A0e()
            r0.A0J = r1
        L_0x06e5:
            int r16 = r16 + 1
            goto L_0x0164
        L_0x06e9:
            r6.A00 = r2
            goto L_0x06b1
        L_0x06ec:
            java.lang.String r4 = "contact"
            goto L_0x0195
        L_0x06f0:
            r0 = r27
            boolean r0 = r0.containsKey(r5)
            if (r0 == 0) goto L_0x0702
            r0 = r27
            java.lang.Object r0 = r0.get(r5)
            X.9Oj r0 = (X.C194169Oj) r0
            goto L_0x0186
        L_0x0702:
            X.9Oj r0 = new X.9Oj
            r0.<init>()
            r2 = r27
            r2.put(r5, r0)
            goto L_0x0181
        L_0x070e:
            r0 = r23
            X.9nx[] r0 = r0.A02
            int r1 = r16 - r19
            r1 = r0[r1]
            r18 = 1
            goto L_0x0172
        L_0x071a:
            r17 = 0
            goto L_0x0158
        L_0x071e:
            r19 = 0
            goto L_0x014d
        L_0x0722:
            r42 = 0
            goto L_0x0138
        L_0x0726:
            r20 = 0
            goto L_0x012e
        L_0x072a:
            r40 = 0
            goto L_0x0122
        L_0x072e:
            r21 = 0
            goto L_0x0118
        L_0x0732:
            r38 = 0
            goto L_0x010c
        L_0x0736:
            java.lang.String r2 = "pay"
            X.9Rr r37 = A00(r0, r2)
            goto L_0x0102
        L_0x073e:
            r36 = 0
            goto L_0x00e2
        L_0x0742:
            r22 = 0
            goto L_0x00d8
        L_0x0746:
            r35 = 0
            goto L_0x00cc
        L_0x074a:
            r34 = 0
            goto L_0x00c2
        L_0x074e:
            r25 = 0
            goto L_0x00b8
        L_0x0752:
            r43 = 0
            r26 = 0
            goto L_0x0074
        L_0x0758:
            java.lang.String r0 = "Invalid hosted device id"
            X.19b r0 = X.C165617ti.A0Q(r0)
            throw r0
        L_0x075f:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()
            java.lang.String r1 = "Invalid device id jid="
            r2.append(r1)
            r2.append(r0)
            java.lang.String r0 = "; id="
            java.lang.String r0 = X.AnonymousClass000.A0r(r0, r2, r5)
            X.19b r0 = X.C165617ti.A0Q(r0)
            throw r0
        L_0x0776:
            r1 = 0
            X.9Oj[] r2 = new X.C194169Oj[r1]
            r0 = r28
            java.lang.Object[] r2 = r0.toArray(r2)
            X.9Oj[] r2 = (X.C194169Oj[]) r2
            X.9OU r0 = new X.9OU
            r30 = r0
            r31 = r26
            r32 = r25
            r33 = r22
            r39 = r21
            r41 = r20
            r30.<init>(r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43)
            X.9Hh r5 = new X.9Hh
            r5.<init>(r0, r2)
            java.lang.StringBuilder r4 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "UniSyncProtocolHelper/handleSyncResult sid="
            r4.append(r0)
            java.lang.String r2 = r3.A04
            r4.append(r2)
            java.lang.String r0 = " querySync="
            r4.append(r0)
            boolean r0 = r3.A05
            X.C36331k8.A1S(r4, r0)
            r0 = r56
            X.1Oi r0 = r0.A01
            r0.BJj(r5, r2, r1)
        L_0x07b6:
            X.777 r1 = r3.A00
            r0 = 0
            r1.BVO(r0)
            return
        L_0x07bd:
            java.lang.String r0 = "UniSyncProtocolHelper/onSuccess missing request"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AIC.BiM(X.9nx, java.lang.String):void");
    }

    public AIC(C19700wN r2, C27471Oi r3, AnonymousClass12O r4, C20810yC r5, AnonymousClass19A r6) {
        this.A02 = r5;
        this.A00 = r2;
        this.A04 = r6;
        this.A03 = r4;
        this.A01 = r3;
    }

    public static C194899Rr A00(C203399nx r0, String str) {
        return A01(r0.A0d(str), str);
    }

    public static C203399nx A02(C20070wy r2, int i) {
        Integer valueOf = Integer.valueOf(i);
        AnonymousClass1AL[] r3 = null;
        if (!r2.containsKey(valueOf)) {
            return null;
        }
        String str = (String) r2.get(valueOf);
        if (!TextUtils.isEmpty(str)) {
            r3 = C165617ti.A0k();
            C36341k9.A1L("dhash", str, r3, 0);
        }
        return C203399nx.A04("consumer_status", r3);
    }

    public static C203399nx A03(C20070wy r2, int i) {
        Integer valueOf = Integer.valueOf(i);
        AnonymousClass1AL[] r3 = null;
        if (!r2.containsKey(valueOf)) {
            return null;
        }
        String str = (String) r2.get(valueOf);
        if (!TextUtils.isEmpty(str)) {
            r3 = C165617ti.A0k();
            C36341k9.A1L("dhash", str, r3, 0);
        }
        return C203399nx.A04("eligible_offers", r3);
    }
}
