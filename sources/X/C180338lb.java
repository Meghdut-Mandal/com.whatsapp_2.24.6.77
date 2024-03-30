package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.math.BigDecimal;
import java.util.List;
import java.util.Locale;

/* renamed from: X.8lb  reason: invalid class name and case insensitive filesystem */
public class C180338lb extends C167797yq {
    public boolean A00;
    public String A01;
    public final C19970wo A02;
    public final C20810yC A03;
    public final AEA A04;
    public final C202269lR A05;
    public final AnonymousClass1DR A06;
    public final C105595Fh A07;
    public final C202179lC A08;
    public final C202699mR A09;
    public final C21100yf A0A;
    public final C196129Xv A0B;
    public final AE0 A0C;
    public final AnonymousClass8gL A0D;

    public void A0g(List list) {
        int i;
        UserJid userJid;
        C201599jw r0;
        C193689Ml r02 = this.A06;
        C202319lY r8 = r02.A01;
        C175928bI A002 = C202319lY.A00(r8);
        C18740tg.A06(r02);
        C207249un r7 = r02.A00;
        List list2 = list;
        if (r8.A03 == 40 && (r0 = A002.A0G) != null && r0.A0M) {
            A0x(r8, A002, list, false);
            A0u(r8, A002, list);
            A0y(r8, list);
            A0v(r8, A002, list);
            C180088lB r1 = new C180088lB();
            r1.A02 = this.A06;
            r1.A01 = this;
            r1.A00 = C165587tf.A0W(this.A0Y).BAj();
            list.add(r1);
            A0w(r8, A002, list);
            A0i(list);
            C167797yq.A05(list);
            A0t(r7, r8, A002, list2, true);
            C167797yq.A05(list);
            A0o(list);
            C167797yq.A05(list);
        } else if (!TextUtils.isEmpty(A002.A0L)) {
            if (r8.A02 == 12) {
                C179948kx r4 = new C179948kx();
                Context context = this.A0P.A00;
                r4.A02 = context.getString(R.string.f12nameremoved);
                r4.A01 = C36391kE.A0v(context, AnonymousClass14B.A03(context, R.color.f6nameremoved), C90474aD.A1a(AnonymousClass16W.A05.B7e(this.A0Q, new BigDecimal(this.A03.A07(1650)))), 1, R.string.f12nameremoved);
                r4.A00 = new AnonymousClass3YH(this, r8, 3);
                list.add(r4);
            }
            A0e(list);
            if (!"mandate_payment_screen".equals(this.A01)) {
                C167797yq.A05(list);
                C175708av r3 = r8.A0A;
                C18740tg.A06(r3);
                C180048l7 r2 = new C180048l7();
                r2.A01 = this.A0P.A00.getString(R.string.f12nameremoved);
                r2.A00 = new AnonymousClass3YM(this, r8, r3, 17);
                list.add(r2);
            }
            A0n(list);
            C167797yq.A05(list);
            A0o(list);
            A0m(list);
        } else {
            super.A0g(list);
            C175708av r03 = r8.A0A;
            if (!(r03 == null || !r03.A0T() || (userJid = r8.A0D) == null)) {
                list.add(new C179958ky(userJid));
            }
            i = 1000;
            list.add(new AnonymousClass5Gz(i));
        }
        i = 1007;
        list.add(new AnonymousClass5Gz(i));
    }

    public static void A06(C175928bI r3, C180338lb r4, List list, int i) {
        C201599jw r0;
        if (i != 401 && i != 20 && (r0 = r3.A0G) != null && !C202349ld.A02(r0.A08)) {
            C180118lE r2 = new C180118lE();
            C167797yq.A01(r4.A0P.A00, r2, R.string.f12nameremoved);
            r2.A03 = (String) C165577te.A0g(r3.A0G.A08);
            r2.A02 = new C163557qO(r4, r3, 2);
            list.add(r2);
        }
    }

    public static void A07(C180338lb r4, List list) {
        C175928bI r3 = (C175928bI) r4.A06.A01.A0A;
        if (r4.A0A.A09(C21100yf.A0k) && !TextUtils.isEmpty(r3.A0V)) {
            C180118lE r2 = new C180118lE();
            Context context = r4.A0P.A00;
            C167797yq.A01(context, r2, R.string.f12nameremoved);
            r2.A03 = context.getString(R.string.f12nameremoved);
            r2.A01 = new AnonymousClass3YH(r4, r3, 5);
            list.add(r2);
        }
    }

    public AnonymousClass9FU A0T() {
        C202319lY r0;
        C175708av r02;
        C206339tC r03;
        String A012;
        C193689Ml r04 = this.A06;
        if (r04 == null || (r0 = r04.A01) == null || (r02 = r0.A0A) == null || !r02.A0T()) {
            return super.A0T();
        }
        C175928bI A002 = C202319lY.A00(this.A06.A01);
        C180118lE r2 = null;
        if (A002.A0E != null) {
            r2 = new C180118lE();
            r2.A04 = this.A0P.A01(R.string.f12nameremoved);
            r03 = A002.A0E;
        } else {
            C135086c7 r05 = A002.A08;
            if (r05 != null && "upi".equalsIgnoreCase((String) r05.A00)) {
                r2 = new C180118lE();
                C19630wG r1 = this.A0P;
                r2.A04 = r1.A01(R.string.f12nameremoved);
                r03 = A002.A0E;
                if (r03 == null) {
                    A012 = r1.A01(R.string.f12nameremoved);
                    r2.A03 = A012;
                }
            }
            return r2;
        }
        A012 = r03.A00;
        r2.A03 = A012;
        return r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0011, code lost:
        if (android.text.TextUtils.isEmpty(r2.A0Q) == false) goto L_0x0013;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String A0X(X.C202319lY r4) {
        /*
            r3 = this;
            X.8av r2 = r4.A0A
            X.8bI r2 = (X.C175928bI) r2
            com.whatsapp.jid.UserJid r0 = r4.A0E
            if (r0 != 0) goto L_0x0013
            if (r2 == 0) goto L_0x0013
            java.lang.String r0 = r2.A0Q
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r1 = 1
            if (r0 != 0) goto L_0x0014
        L_0x0013:
            r1 = 0
        L_0x0014:
            boolean r0 = r4.A0K()
            if (r0 == 0) goto L_0x002a
            if (r1 == 0) goto L_0x002a
            java.lang.String r0 = r4.A0F
            boolean r0 = X.C203419nz.A07(r0)
            if (r0 == 0) goto L_0x0027
            java.lang.String r0 = r4.A0F
            return r0
        L_0x0027:
            java.lang.String r0 = r4.A0K
            return r0
        L_0x002a:
            X.8av r0 = r4.A0A
            if (r0 == 0) goto L_0x0045
            boolean r0 = r0.A0T()
            if (r0 == 0) goto L_0x0045
            if (r2 == 0) goto L_0x0045
            X.6c7 r0 = r2.A09
            boolean r0 = X.C202349ld.A02(r0)
            if (r0 != 0) goto L_0x0045
            X.6c7 r0 = r2.A09
            java.lang.Object r0 = r0.A00
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L_0x0045:
            java.lang.String r0 = super.A0X(r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C180338lb.A0X(X.9lY):java.lang.String");
    }

    public void A0Y() {
        String str;
        String str2;
        C24611Dc r2 = this.A0c;
        r2.A06("IN- HANDLE_SEND_AGAIN start");
        C193689Ml r0 = this.A06;
        if (r0 != null) {
            C202319lY r02 = r0.A01;
            if (r02 != null) {
                boolean z = r02.A0P;
                if (z) {
                    r2.A06("IN- HANDLE_SEND_AGAIN transaction is not null and it's interop");
                    C175708av r1 = this.A06.A01.A0A;
                    if (r1 instanceof C175928bI) {
                        str2 = ((C175928bI) r1).A0O;
                    } else {
                        str2 = "";
                    }
                    if (C197639c2.A00(str2)) {
                        C135086c7 A0S = C165577te.A0S(str2);
                        if (!this.A0B.A03(A0S)) {
                            A0p(true);
                            this.A0D.A01(A0S, (C135086c7) null, new B9S(A0S, this, str2, 0));
                            return;
                        }
                        r2.A06("IN- HANDLE_SEND_AGAIN user blocked checked locally");
                        C194139Og r12 = new C194139Og(13);
                        r12.A0F = str2;
                        this.A08.A0D(r12);
                        return;
                    }
                    r2.A06("IN- HANDLE_SEND_AGAIN vpa valid check locally, incorrect vpa");
                    C194139Og r22 = new C194139Og(8);
                    r22.A0C = this.A0P.A00.getString(R.string.f12nameremoved);
                    this.A08.A0D(r22);
                    return;
                }
                str = C36371kC.A0z("IN- HANDLE_SEND_AGAIN isInterop is ", AnonymousClass000.A0u(), z);
            } else {
                str = "IN- HANDLE_SEND_AGAIN transactionInfo is null?";
            }
        } else {
            str = "IN- HANDLE_SEND_AGAIN transactionDetailData is null?";
        }
        r2.A06(str);
        r2.A06("IN- HANDLE_SEND_AGAIN calling super");
        super.A0Y();
    }

    public void A0a() {
        C202319lY r1;
        C175928bI r0;
        C193689Ml r02 = this.A06;
        if (!(r02 == null || (r1 = r02.A01) == null || (r0 = (C175928bI) r1.A0A) == null || r0.A0G == null)) {
            int i = r1.A02;
            int i2 = R.string.f12nameremoved;
            if (i == 115) {
                i2 = R.string.f12nameremoved;
            }
            this.A0E = i2;
        }
        super.A0a();
    }

    public void A0d(AnonymousClass9FZ r3) {
        C193689Ml r0;
        C202319lY r02;
        C180268lU r1;
        int i = r3.A00;
        if (i == 300) {
            A0q(false);
        } else if (i != 301) {
            super.A0d(r3);
        } else {
            if (this.A00) {
                C180268lU r12 = new C180268lU(101);
                r12.A03 = this.A07.A01;
                r12.A06 = this.A0C;
                r12.A05 = "SUBMITTED";
                r12.A04 = "00";
                r1 = r12;
            } else {
                String str = this.A01;
                if (("chat".equals(str) || "payment_composer_icon".equals(str)) && (r0 = this.A06) != null && (r02 = r0.A01) != null && r02.A0P) {
                    r1 = new C180268lU(106);
                } else {
                    r1 = new C194139Og(19);
                }
            }
            this.A08.A0D(r1);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0055, code lost:
        r4.A00 = com.whatsapp.R.drawable.ic_hours;
        r8 = r2.A0P;
        r4.A04 = r8.A01(com.whatsapp.R.string.f12nameremoved);
        r0 = com.whatsapp.R.string.f12nameremoved;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0068, code lost:
        r4.A02 = r8.A01(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x006e, code lost:
        r4.A03 = X.C36391kE.A0v(r8.A00, X.C20040wv.A05(r2.A0Q, r2.A02.A08(r7.A01)), new java.lang.Object[1], 0, com.whatsapp.R.string.f12nameremoved);
        r4.A05 = true;
        r4.A07 = true;
     */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x02d6  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x01a6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0e(java.util.List r18) {
        /*
            r17 = this;
            r2 = r17
            r3 = r18
            r2.A0f(r3)
            r2.A0k(r3)
            r2.A0h(r3)
            r2.A0j(r3)
            r2.A0l(r3)
            X.9Ml r0 = r2.A06
            X.9lY r7 = r0.A01
            boolean r0 = r2.A0z()
            if (r0 == 0) goto L_0x0029
            if (r7 == 0) goto L_0x0140
            X.8av r0 = r7.A0A
            if (r0 == 0) goto L_0x0140
            boolean r0 = r0.A0T()
            if (r0 == 0) goto L_0x0140
        L_0x0029:
            boolean r0 = r2.A0z()
            if (r0 == 0) goto L_0x0090
            X.9Ml r0 = r2.A06
            X.9lY r9 = r0.A01
            X.8av r0 = r9.A0A
            X.8bI r0 = (X.C175928bI) r0
            X.9uh r7 = r0.A0H
            if (r7 == 0) goto L_0x0090
            long r0 = r7.A00
            boolean r12 = r7.A03
            r5 = 0
            int r4 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r4 <= 0) goto L_0x00cf
            X.8lF r4 = new X.8lF
            r4.<init>()
            java.lang.String r1 = r7.A02
            int r0 = r1.hashCode()
            r6 = 0
            r5 = 1
            switch(r0) {
                case -828048883: goto L_0x0094;
                case 441297912: goto L_0x00ad;
                default: goto L_0x0055;
            }
        L_0x0055:
            r0 = 2131232390(0x7f080686, float:1.8080888E38)
            r4.A00 = r0
            X.0wG r8 = r2.A0P
            r0 = 2131895488(0x7f1224c0, float:1.942581E38)
            java.lang.String r0 = r8.A01(r0)
            r4.A04 = r0
            r0 = 2131895487(0x7f1224bf, float:1.9425808E38)
        L_0x0068:
            java.lang.String r0 = r8.A01(r0)
            r4.A02 = r0
        L_0x006e:
            android.content.Context r12 = r8.A00
            r11 = 2131888606(0x7f1209de, float:1.9411852E38)
            java.lang.Object[] r10 = new java.lang.Object[r5]
            X.0ts r9 = r2.A0Q
            X.0wo r8 = r2.A02
            long r0 = r7.A01
            long r0 = r8.A08(r0)
            java.lang.String r0 = X.C20040wv.A05(r9, r0)
            java.lang.String r0 = X.C36391kE.A0v(r12, r0, r10, r6, r11)
            r4.A03 = r0
            r4.A05 = r5
            r4.A07 = r5
        L_0x008d:
            r3.add(r4)
        L_0x0090:
            r2.A0i(r3)
            return
        L_0x0094:
            java.lang.String r0 = "TRANSACTION_CLOSED"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0055
            r0 = 2131232822(0x7f080836, float:1.8081764E38)
            r4.A00 = r0
            X.0wG r8 = r2.A0P
            r0 = 2131895490(0x7f1224c2, float:1.9425814E38)
            java.lang.String r0 = r8.A01(r0)
            r4.A04 = r0
            goto L_0x006e
        L_0x00ad:
            java.lang.String r0 = "RESOLVED"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0055
            r0 = 2131232822(0x7f080836, float:1.8081764E38)
            r4.A00 = r0
            X.0wG r8 = r2.A0P
            r0 = 2131895490(0x7f1224c2, float:1.9425814E38)
            java.lang.String r0 = r8.A01(r0)
            r4.A04 = r0
            int r1 = r9.A02
            r0 = 405(0x195, float:5.68E-43)
            if (r1 == r0) goto L_0x006e
            r0 = 2131895489(0x7f1224c1, float:1.9425812E38)
            goto L_0x0068
        L_0x00cf:
            long r4 = r9.A05
            X.1EV r0 = r2.A0X
            X.0yC r6 = r0.A02
            r0 = 1422(0x58e, float:1.993E-42)
            int r0 = r6.A07(r0)
            long r0 = (long) r0
            java.util.concurrent.TimeUnit r8 = java.util.concurrent.TimeUnit.DAYS
            X.0wo r7 = r2.A02
            long r10 = X.C19970wo.A00(r7)
            long r0 = r8.toMillis(r0)
            long r4 = r4 + r0
            int r0 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r0 > 0) goto L_0x0126
            if (r12 == 0) goto L_0x0090
            X.8lF r4 = new X.8lF
            r4.<init>()
            r11 = 0
            r4.A07 = r11
            r0 = 1421(0x58d, float:1.991E-42)
            int r0 = r6.A07(r0)
            long r0 = (long) r0
            long r5 = r9.A05
            java.util.concurrent.TimeUnit r10 = java.util.concurrent.TimeUnit.MINUTES
            long r7 = X.C19970wo.A00(r7)
            long r0 = r10.toMillis(r0)
            long r5 = r5 + r0
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 > 0) goto L_0x011c
            r0 = 1
            r4.A06 = r0
            r0 = 2
            X.3YH r1 = new X.3YH
            r1.<init>(r2, r9, r0)
        L_0x0118:
            r4.A01 = r1
            goto L_0x008d
        L_0x011c:
            r4.A06 = r11
            r0 = 32
            X.9v0 r1 = new X.9v0
            r1.<init>(r2, r0)
            goto L_0x0118
        L_0x0126:
            if (r12 == 0) goto L_0x0090
            X.8lF r4 = new X.8lF
            r4.<init>()
            X.0wG r1 = r2.A0P
            r0 = 2131895491(0x7f1224c3, float:1.9425817E38)
            java.lang.String r0 = r1.A01(r0)
            r4.A02 = r0
            r0 = 0
            r4.A05 = r0
            r0 = 1
            r4.A07 = r0
            goto L_0x008d
        L_0x0140:
            int r6 = r7.A02
            X.8l6 r5 = new X.8l6
            r5.<init>()
            java.util.ArrayList r0 = X.AnonymousClass001.A0I()
            r5.A00 = r0
            r4 = 0
            r8 = 0
        L_0x014f:
            java.util.List r0 = r5.A00
            r16 = r0
            X.9iR r13 = r2.A0f
            X.0wo r10 = r2.A02
            X.9NI r9 = new X.9NI
            r9.<init>()
            X.1FR r0 = r13.A04
            java.lang.String r14 = r0.A0R(r7)
            long r0 = r7.A05
            java.lang.String r11 = X.C200899iR.A00(r10, r13, r0)
            r0 = 403(0x193, float:5.65E-43)
            r12 = 0
            r15 = 2
            r1 = 1
            if (r6 == r0) goto L_0x0282
            r0 = 408(0x198, float:5.72E-43)
            if (r6 == r0) goto L_0x0251
            r0 = 405(0x195, float:5.68E-43)
            if (r6 == r0) goto L_0x0232
            r0 = 406(0x196, float:5.69E-43)
            if (r6 == r0) goto L_0x0211
            switch(r6) {
                case 422: goto L_0x0251;
                case 423: goto L_0x01e0;
                case 424: goto L_0x01fb;
                default: goto L_0x017e;
            }
        L_0x017e:
            if (r8 == 0) goto L_0x02b6
            if (r8 == r1) goto L_0x01d1
            if (r8 != r15) goto L_0x01ab
            r11 = 2131232850(0x7f080852, float:1.808182E38)
            X.0wG r0 = r13.A01
            android.content.Context r10 = r0.A00
            r0 = 2131895012(0x7f1222e4, float:1.9424845E38)
        L_0x018e:
            java.lang.String r12 = X.C36351kA.A0w(r10, r14, r1, r0)
        L_0x0192:
            r10 = 0
        L_0x0193:
            r1 = 2131101907(0x7f0608d3, float:1.7816237E38)
        L_0x0196:
            r0 = 2131102028(0x7f06094c, float:1.7816482E38)
            r9.A03 = r0
            r0 = 2131102153(0x7f0609c9, float:1.7816736E38)
            r9.A02 = r0
            r9.A01 = r11
            r9.A05 = r12
            if (r10 != 0) goto L_0x01a7
            r10 = 0
        L_0x01a7:
            r9.A04 = r10
            r9.A00 = r1
        L_0x01ab:
            r0 = r16
            r0.add(r9)
            int r8 = r8 + 1
            r0 = 3
            if (r8 < r0) goto L_0x014f
            r0 = 422(0x1a6, float:5.91E-43)
            if (r6 == r0) goto L_0x01ca
            r0 = 423(0x1a7, float:5.93E-43)
            if (r6 == r0) goto L_0x01ca
            r0 = 406(0x196, float:5.69E-43)
            if (r6 == r0) goto L_0x01ca
            r0 = 408(0x198, float:5.72E-43)
            if (r6 == r0) goto L_0x01ca
            r0 = 424(0x1a8, float:5.94E-43)
            if (r6 == r0) goto L_0x01ca
            r4 = 1
        L_0x01ca:
            r5.A01 = r4
            r3.add(r5)
            goto L_0x0029
        L_0x01d1:
            r11 = 2131232851(0x7f080853, float:1.8081823E38)
            X.0wG r0 = r13.A01
            android.content.Context r1 = r0.A00
            r0 = 2131895011(0x7f1222e3, float:1.9424843E38)
            java.lang.String r12 = r1.getString(r0)
            goto L_0x0192
        L_0x01e0:
            if (r8 == 0) goto L_0x02b6
            if (r8 != r1) goto L_0x0224
            r11 = 2131232848(0x7f080850, float:1.8081817E38)
            X.0wG r0 = r13.A01
            android.content.Context r1 = r0.A00
            r0 = 2131895017(0x7f1222e9, float:1.9424855E38)
            java.lang.String r12 = r1.getString(r0)
            r0 = 2131895016(0x7f1222e8, float:1.9424853E38)
            java.lang.String r10 = r1.getString(r0)
            goto L_0x027d
        L_0x01fb:
            if (r8 == 0) goto L_0x02b6
            if (r8 != r1) goto L_0x026c
            r11 = 2131232851(0x7f080853, float:1.8081823E38)
            X.0wG r0 = r13.A01
            android.content.Context r1 = r0.A00
            r0 = 2131895019(0x7f1222eb, float:1.942486E38)
            java.lang.String r12 = r1.getString(r0)
            r0 = 2131895015(0x7f1222e7, float:1.9424851E38)
            goto L_0x0266
        L_0x0211:
            if (r8 == 0) goto L_0x02b6
            if (r8 != r1) goto L_0x0224
            r11 = 2131232848(0x7f080850, float:1.8081817E38)
            X.0wG r0 = r13.A01
            android.content.Context r1 = r0.A00
            r0 = 2131895009(0x7f1222e1, float:1.9424839E38)
            java.lang.String r12 = r1.getString(r0)
            goto L_0x027c
        L_0x0224:
            if (r8 != r15) goto L_0x01ab
            r11 = 2131232848(0x7f080850, float:1.8081817E38)
            X.0wG r0 = r13.A01
            android.content.Context r10 = r0.A00
            r0 = 2131895010(0x7f1222e2, float:1.942484E38)
            goto L_0x018e
        L_0x0232:
            if (r8 == 0) goto L_0x02b6
            if (r8 == r1) goto L_0x0294
            if (r8 != r15) goto L_0x01ab
            r11 = 2131232847(0x7f08084f, float:1.8081815E38)
            X.0wG r0 = r13.A01
            android.content.Context r12 = r0.A00
            r0 = 2131895020(0x7f1222ec, float:1.9424861E38)
            java.lang.String r12 = X.C36351kA.A0w(r12, r14, r1, r0)
            long r0 = r7.A06
            java.lang.String r10 = X.C200899iR.A00(r10, r13, r0)
            r1 = 2131101946(0x7f0608fa, float:1.7816316E38)
            goto L_0x0196
        L_0x0251:
            if (r8 == 0) goto L_0x02b6
            if (r8 != r1) goto L_0x026c
            r11 = 2131232847(0x7f08084f, float:1.8081815E38)
            X.0wG r0 = r13.A01
            android.content.Context r1 = r0.A00
            r0 = 2131895019(0x7f1222eb, float:1.942486E38)
            java.lang.String r12 = r1.getString(r0)
            r0 = 2131895014(0x7f1222e6, float:1.942485E38)
        L_0x0266:
            java.lang.String r10 = r1.getString(r0)
            goto L_0x0193
        L_0x026c:
            if (r8 != r15) goto L_0x01ab
            r11 = 2131232848(0x7f080850, float:1.8081817E38)
            X.0wG r0 = r13.A01
            android.content.Context r10 = r0.A00
            r0 = 2131895010(0x7f1222e2, float:1.942484E38)
            java.lang.String r12 = X.C36351kA.A0w(r10, r14, r1, r0)
        L_0x027c:
            r10 = 0
        L_0x027d:
            r1 = 2131101947(0x7f0608fb, float:1.7816318E38)
            goto L_0x0196
        L_0x0282:
            if (r8 == 0) goto L_0x02b6
            if (r8 == r1) goto L_0x0294
            if (r8 != r15) goto L_0x01ab
            r11 = 2131232851(0x7f080853, float:1.8081823E38)
            X.0wG r0 = r13.A01
            android.content.Context r10 = r0.A00
            r0 = 2131895013(0x7f1222e5, float:1.9424847E38)
            goto L_0x018e
        L_0x0294:
            X.0wG r0 = r13.A01
            android.content.Context r1 = r0.A00
            r0 = 2131895019(0x7f1222eb, float:1.942486E38)
            java.lang.String r10 = r1.getString(r0)
            r1 = 2131232847(0x7f08084f, float:1.8081815E38)
            r0 = 2131101060(0x7f060584, float:1.781452E38)
            r9.A00 = r0
            r0 = 2131101945(0x7f0608f9, float:1.7816314E38)
            r9.A03 = r0
            r9.A02 = r0
            r9.A01 = r1
            r9.A05 = r10
            r9.A04 = r12
            goto L_0x01ab
        L_0x02b6:
            X.0wG r0 = r13.A01
            android.content.Context r1 = r0.A00
            r0 = 2131895018(0x7f1222ea, float:1.9424857E38)
            java.lang.String r10 = r1.getString(r0)
            r1 = 2131232847(0x7f08084f, float:1.8081815E38)
            r0 = 2131101060(0x7f060584, float:1.781452E38)
            r9.A00 = r0
            r0 = 2131101945(0x7f0608f9, float:1.7816314E38)
            r9.A03 = r0
            r9.A02 = r0
            r9.A01 = r1
            r9.A05 = r10
            if (r11 != 0) goto L_0x02d7
            r11 = 0
        L_0x02d7:
            r9.A04 = r11
            goto L_0x01ab
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C180338lb.A0e(java.util.List):void");
    }

    public void A0f(List list) {
        C202319lY r0;
        C175708av r1;
        C198679e1 r02;
        C197939cd r11;
        BigDecimal bigDecimal;
        C193689Ml r03 = this.A06;
        List list2 = list;
        if (r03 == null || (r0 = r03.A01) == null || (r1 = r0.A0A) == null || !(r1 instanceof C175928bI) || (r02 = ((C175928bI) r1).A0F) == null || (r11 = r02.A00) == null) {
            super.A0f(list2);
            return;
        }
        AnonymousClass16U A012 = this.A0l.A01(r11.A01);
        AnonymousClass16X r9 = new AnonymousClass16X(C165617ti.A0b((String) r11.A00.A00), ((AnonymousClass16V) A012).A01);
        C19630wG r7 = this.A0P;
        Context context = r7.A00;
        C18820ts r8 = this.A0Q;
        SpannableStringBuilder A0P = C36441kJ.A0P(AnonymousClass9Zb.A01(r8, A012, r9, 2, false));
        if (C1892492v.A00 == null) {
            try {
                C1892492v.A00 = C015006m.A03(context, R.font.payment_icons_regular);
            } catch (Resources.NotFoundException unused) {
                Log.e("PAY: PaymentsTypeface/loadTypefaceSync could not load font R.font.payment_icons_regular");
            }
        }
        C135106c9 A052 = this.A06.A01.A05();
        AnonymousClass9P4 BFK = A0S().BFK();
        C202319lY r12 = this.A06.A01;
        boolean A002 = BFK.A00(r12);
        AnonymousClass1FR r04 = this.A0g;
        int A0C2 = r04.A0C(r12);
        Context context2 = r04.A04.A00;
        if (A0C2 == 0) {
            A0C2 = R.string.f12nameremoved;
        }
        String A0v = C36391kE.A0v(context2, context2.getString(A0C2), C36411kG.A1b(A0P), 1, R.string.f12nameremoved);
        Object[] objArr = new Object[1];
        Locale A0x = C36401kF.A0x(r8);
        Object[] objArr2 = new Object[1];
        BigDecimal bigDecimal2 = r9.A00;
        BigDecimal bigDecimal3 = C202809mh.A00;
        AnonymousClass00C.A0D(bigDecimal2, 1);
        BigDecimal bigDecimal4 = r11.A03;
        if (bigDecimal4 != null) {
            bigDecimal = bigDecimal4.divide(bigDecimal3);
        } else {
            bigDecimal = null;
        }
        BigDecimal bigDecimal5 = r11.A02;
        BigDecimal add = bigDecimal2.multiply(bigDecimal5).add(bigDecimal2.multiply(bigDecimal5).multiply(bigDecimal));
        AnonymousClass00C.A08(add);
        objArr2[0] = add;
        objArr[0] = String.format(A0x, "%.2f", objArr2);
        list2.add(new C180108lD(A052, A0P, A0v, r7.A02(R.string.f12nameremoved, objArr), A002));
    }

    public void A0o(List list) {
        C202319lY r0;
        C175708av r02;
        C193689Ml r03 = this.A06;
        if (r03 == null || (r0 = r03.A01) == null || (r02 = r0.A0A) == null || !r02.A0T()) {
            super.A0o(list);
        }
    }

    public boolean A0r() {
        C202319lY r0;
        C193689Ml r02 = this.A06;
        if (!(r02 == null || (r0 = r02.A01) == null)) {
            C175928bI r2 = (C175928bI) r0.A0A;
            if (!(r0.A02 == 415 || r2 == null || r2.A0G == null)) {
                return true;
            }
        }
        return super.A0r();
    }

    public boolean A0s(C202319lY r4) {
        C175928bI r2 = (C175928bI) r4.A0A;
        if (r2 != null && (!TextUtils.isEmpty(r2.A0L) || r2.A0G != null)) {
            return false;
        }
        C175708av r0 = r4.A0A;
        if (r0 == null || !r0.A0T()) {
            return super.A0s(r4);
        }
        return false;
    }

    public void A0u(C202319lY r6, C175928bI r7, List list) {
        SpannableStringBuilder spannableStringBuilder;
        boolean A002 = C165587tf.A0W(this.A0Y).BFK().A00(r6);
        AnonymousClass16X r3 = r6.A08;
        if (r3 != null) {
            spannableStringBuilder = AnonymousClass9Zb.A00(this.A0P.A00, this.A0Q, r6.A03(), r3);
        } else {
            spannableStringBuilder = new SpannableStringBuilder();
        }
        C179938kw r2 = new C179938kw(spannableStringBuilder, A002);
        if ("MAX".equals(r7.A0G.A0G)) {
            r2.A00 = this.A0P.A00.getString(R.string.f12nameremoved);
        }
        list.add(r2);
    }

    public void A0v(C202319lY r5, C175928bI r6, List list) {
        C19770wU r1;
        int i;
        Context context;
        int i2;
        if (TextUtils.isEmpty(r6.A0G.A0H) || r5.A02 != 417) {
            C201459je r2 = r6.A0G.A0C;
            if (r2 != null && "ACCEPT".equals(r2.A08)) {
                String str = r2.A09;
                if (str.equals("PENDING")) {
                    C180078lA r22 = new C180078lA();
                    r22.A02 = false;
                    r22.A01 = this.A0P.A00.getString(R.string.f12nameremoved);
                    r22.A00 = new AnonymousClass3YH(this, r5, 1);
                    list.add(r22);
                    return;
                } else if (str.equals("FAILURE") && !TextUtils.isEmpty(r2.A05)) {
                    C180078lA r23 = new C180078lA();
                    r23.A02 = true;
                    r23.A01 = this.A0P.A00.getString(R.string.f12nameremoved);
                    list.add(r23);
                    r1 = this.A0h;
                    i = 37;
                } else {
                    return;
                }
            } else {
                return;
            }
        } else {
            C180078lA r24 = new C180078lA();
            r24.A02 = true;
            C201169iz r0 = r6.A0G.A0B;
            if (r0 != null) {
                String str2 = r0.A02;
                if ("PAUSE".equals(str2)) {
                    context = this.A0P.A00;
                    i2 = R.string.f12nameremoved;
                } else {
                    if ("RESUME".equals(str2)) {
                        context = this.A0P.A00;
                        i2 = R.string.f12nameremoved;
                    }
                    list.add(r24);
                    r1 = this.A0h;
                    i = 36;
                }
            } else {
                context = this.A0P.A00;
                i2 = R.string.f12nameremoved;
            }
            r24.A01 = context.getString(i2);
            list.add(r24);
            r1 = this.A0h;
            i = 36;
        }
        AnonymousClass736.A00(r1, this, r6, r5, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001c, code lost:
        if (r1 == 418) goto L_0x001e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0w(X.C202319lY r11, X.C175928bI r12, java.util.List r13) {
        /*
            r10 = this;
            X.8lH r5 = new X.8lH
            r5.<init>()
            int r0 = X.AnonymousClass1FR.A00(r11)
            r5.A02 = r0
            int r1 = r11.A02
            r0 = 401(0x191, float:5.62E-43)
            if (r1 == r0) goto L_0x001e
            r0 = 415(0x19f, float:5.82E-43)
            if (r1 == r0) goto L_0x001e
            r0 = 417(0x1a1, float:5.84E-43)
            if (r1 == r0) goto L_0x001e
            r0 = 418(0x1a2, float:5.86E-43)
            r2 = 1
            if (r1 != r0) goto L_0x001f
        L_0x001e:
            r2 = 0
        L_0x001f:
            X.16U r1 = r11.A03()
            X.0wG r0 = r10.A0P
            android.content.Context r3 = r0.A00
            android.text.SpannableStringBuilder r0 = r1.BAV(r3, r2)
            r5.A04 = r0
            boolean r1 = r11.A0K()
            r0 = 2131892146(0x7f1217b2, float:1.9419032E38)
            if (r1 == 0) goto L_0x0039
            r0 = 2131892255(0x7f12181f, float:1.9419253E38)
        L_0x0039:
            java.lang.String r0 = r3.getString(r0)
            r5.A05 = r0
            X.1FR r2 = r10.A0g
            int r0 = r2.A0C(r11)
            r5.A01 = r0
            int r7 = r11.A02
            r1 = 15
            r0 = 2131895408(0x7f122470, float:1.9425648E38)
            if (r7 == r1) goto L_0x0127
            r0 = 16
            if (r7 == r0) goto L_0x0120
            r0 = 20
            r4 = 0
            r6 = 1
            if (r7 == r0) goto L_0x00fb
            r0 = 115(0x73, float:1.61E-43)
            if (r7 == r0) goto L_0x00de
            r0 = 401(0x191, float:5.62E-43)
            if (r7 == r0) goto L_0x00bf
            r0 = 415(0x19f, float:5.82E-43)
            r1 = 418(0x1a2, float:5.86E-43)
            if (r7 == r0) goto L_0x00ab
            r0 = 417(0x1a1, float:5.84E-43)
            if (r7 == r0) goto L_0x0076
            if (r7 == r1) goto L_0x0124
            java.lang.String r0 = ""
        L_0x0070:
            r5.A0A = r0
            r13.add(r5)
            return
        L_0x0076:
            X.9jw r7 = r12.A0G
            X.C18740tg.A06(r7)
            X.0ts r4 = r10.A0Q
            X.0wo r2 = r10.A02
            long r0 = r7.A01
            java.lang.String r2 = X.C202699mR.A00(r2, r4, r0)
            int r1 = r7.A00()
            r0 = 2
            if (r1 == r0) goto L_0x00a7
            r0 = 4
            if (r1 == r0) goto L_0x00a7
            r0 = 6
            if (r1 == r0) goto L_0x00a7
            java.lang.String r0 = r7.A0E
            boolean r0 = X.C202699mR.A03(r0)
            if (r0 == 0) goto L_0x009f
            r0 = 2131895411(0x7f122473, float:1.9425654E38)
            goto L_0x0127
        L_0x009f:
            r0 = 2131895412(0x7f122474, float:1.9425656E38)
            java.lang.String r0 = X.C36351kA.A0w(r3, r2, r6, r0)
            goto L_0x0070
        L_0x00a7:
            r0 = 2131895410(0x7f122472, float:1.9425652E38)
            goto L_0x0127
        L_0x00ab:
            int r0 = r12.A01
            if (r0 != r1) goto L_0x00b3
            r0 = 2131895405(0x7f12246d, float:1.9425642E38)
            goto L_0x0127
        L_0x00b3:
            r2 = 2131895406(0x7f12246e, float:1.9425644E38)
            java.lang.Object[] r1 = new java.lang.Object[r6]
            java.lang.String r0 = r12.A0O
            java.lang.String r0 = X.C36391kE.A0v(r3, r0, r1, r4, r2)
            goto L_0x0070
        L_0x00bf:
            long r0 = r12.A04
            X.0wo r7 = r2.A03
            long r7 = X.C19970wo.A00(r7)
            long r0 = r0 - r7
            android.util.Pair r0 = r2.A0G(r0)
            if (r0 == 0) goto L_0x00da
            r2 = 2131895413(0x7f122475, float:1.9425658E38)
            java.lang.Object[] r1 = new java.lang.Object[r6]
            java.lang.Object r0 = r0.second
            java.lang.String r0 = X.C36391kE.A0v(r3, r0, r1, r4, r2)
            goto L_0x0070
        L_0x00da:
            r0 = 2131895036(0x7f1222fc, float:1.9424894E38)
            goto L_0x0127
        L_0x00de:
            r0 = 1800000(0x1b7740, double:8.89318E-318)
            android.util.Pair r2 = r2.A0G(r0)
            X.0ts r8 = r10.A0Q
            r7 = 2131755398(0x7f100186, float:1.9141674E38)
            int r0 = X.C36381kD.A04(r2)
            long r0 = (long) r0
            java.lang.Object[] r3 = new java.lang.Object[r6]
            java.lang.Object r2 = r2.second
            r3[r4] = r2
            java.lang.String r0 = r8.A0L(r3, r7, r0)
            goto L_0x0070
        L_0x00fb:
            long r0 = r12.A04
            X.0wo r7 = r2.A03
            long r7 = X.C19970wo.A00(r7)
            long r0 = r0 - r7
            android.util.Pair r9 = r2.A0G(r0)
            if (r9 == 0) goto L_0x0120
            X.0ts r8 = r10.A0Q
            r7 = 2131755398(0x7f100186, float:1.9141674E38)
            int r0 = X.C36381kD.A04(r9)
            long r2 = (long) r0
            java.lang.Object[] r1 = new java.lang.Object[r6]
            java.lang.Object r0 = r9.second
            r1[r4] = r0
            java.lang.String r0 = r8.A0L(r1, r7, r2)
            goto L_0x0070
        L_0x0120:
            r0 = 2131895409(0x7f122471, float:1.942565E38)
            goto L_0x0127
        L_0x0124:
            r0 = 2131895029(0x7f1222f5, float:1.942488E38)
        L_0x0127:
            java.lang.String r0 = r3.getString(r0)
            goto L_0x0070
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C180338lb.A0w(X.9lY, X.8bI, java.util.List):void");
    }

    public void A0x(C202319lY r9, C175928bI r10, List list, boolean z) {
        C201459je r2;
        int i;
        Object[] A1b;
        C201599jw r0 = r10.A0G;
        if (r0 != null && (r2 = r0.A0C) != null && "UNKNOWN".equals(r2.A08) && "INIT".equals(r2.A09)) {
            String str = r10.A0O;
            C179948kx r5 = new C179948kx();
            Context context = this.A0P.A00;
            String A032 = AnonymousClass14B.A03(context, R.color.f6nameremoved);
            if (z) {
                r5.A02 = context.getString(R.string.f12nameremoved);
                i = R.string.f12nameremoved;
                A1b = new Object[]{A032};
            } else {
                r5.A02 = context.getString(R.string.f12nameremoved);
                i = R.string.f12nameremoved;
                A1b = C36411kG.A1b(str);
                A1b[1] = A032;
            }
            r5.A01 = context.getString(i, A1b);
            r5.A00 = new AnonymousClass3YK(this, r9, 1, z);
            list.add(r5);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0072, code lost:
        r0 = r1.A0E(r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0z() {
        /*
            r4 = this;
            X.1EV r2 = r4.A0X
            X.AE0 r0 = r4.A0C
            java.lang.String r0 = r0.A0B()
            if (r0 == 0) goto L_0x0015
            java.lang.String r1 = r0.toLowerCase()
            int r0 = r1.hashCode()
            switch(r0) {
                case 113658: goto L_0x0066;
                case 3008417: goto L_0x0059;
                case 3197625: goto L_0x004c;
                case 100023093: goto L_0x003f;
                default: goto L_0x0015;
            }
        L_0x0015:
            r0 = 0
        L_0x0016:
            r3 = 0
            if (r0 == 0) goto L_0x0033
            X.9Ml r0 = r4.A06
            if (r0 == 0) goto L_0x0033
            X.9lY r2 = r0.A01
            if (r2 == 0) goto L_0x0033
            X.8av r1 = r2.A0A
            if (r1 == 0) goto L_0x0033
            boolean r0 = r1 instanceof X.C175928bI
            if (r0 == 0) goto L_0x0033
            X.8bI r1 = (X.C175928bI) r1
            X.9jw r0 = r1.A0G
            if (r0 == 0) goto L_0x0034
            boolean r0 = r0.A0M
            if (r0 == 0) goto L_0x0034
        L_0x0033:
            return r3
        L_0x0034:
            int r1 = r2.A03
            r0 = 1
            if (r1 == r0) goto L_0x003d
            r0 = 100
            if (r1 != r0) goto L_0x0033
        L_0x003d:
            r3 = 1
            return r3
        L_0x003f:
            java.lang.String r0 = "icici"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0015
            X.0yC r1 = r2.A02
            r0 = 2327(0x917, float:3.261E-42)
            goto L_0x0072
        L_0x004c:
            java.lang.String r0 = "hdfc"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0015
            X.0yC r1 = r2.A02
            r0 = 2328(0x918, float:3.262E-42)
            goto L_0x0072
        L_0x0059:
            java.lang.String r0 = "axis"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0015
            X.0yC r1 = r2.A02
            r0 = 2330(0x91a, float:3.265E-42)
            goto L_0x0072
        L_0x0066:
            java.lang.String r0 = "sbi"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0015
            X.0yC r1 = r2.A02
            r0 = 2329(0x919, float:3.264E-42)
        L_0x0072:
            boolean r0 = r1.A0E(r0)
            goto L_0x0016
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C180338lb.A0z():boolean");
    }

    public void A0c(C180148lH r7) {
        String str;
        if (!A0z()) {
            super.A0c(r7);
            return;
        }
        C202319lY r5 = this.A06.A01;
        Integer A022 = AnonymousClass1FR.A02(r5);
        C19630wG r1 = this.A0P;
        switch (A022.intValue()) {
            case 0:
                str = "1";
                break;
            case 1:
                str = "2";
                break;
            default:
                str = "3";
                break;
        }
        SpannableStringBuilder A0P = C36441kJ.A0P(str);
        Typeface A032 = C015006m.A03(r1.A00, R.font.payment_icons_regular);
        if (A032 != null) {
            A0P.setSpan(new C91984cw(A032), 0, str.length(), 0);
        }
        r7.A04 = A0P;
        r7.A02 = AnonymousClass1FR.A00(r5);
        r7.A00 = 30.0f;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001c, code lost:
        if (r1 != 418) goto L_0x001e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0t(X.C207249un r19, X.C202319lY r20, X.C175928bI r21, java.util.List r22, boolean r23) {
        /*
            r18 = this;
            java.util.ArrayList r5 = X.AnonymousClass001.A0I()
            r13 = 401(0x191, float:5.62E-43)
            r4 = r18
            r3 = r19
            r15 = r20
            if (r19 == 0) goto L_0x001e
            int r1 = r15.A02
            if (r1 == r13) goto L_0x01cc
            r0 = 415(0x19f, float:5.82E-43)
            if (r1 == r0) goto L_0x01bf
            r0 = 417(0x1a1, float:5.84E-43)
            if (r1 == r0) goto L_0x01cc
            r0 = 418(0x1a2, float:5.86E-43)
            if (r1 == r0) goto L_0x01cc
        L_0x001e:
            r6 = r21
            X.9jw r8 = r6.A0G
            X.C18740tg.A06(r8)
            X.9mR r7 = r4.A09
            long r0 = r8.A01
            X.9iz r9 = r8.A0B
            r3 = 1
            r2 = 0
            boolean r14 = X.AnonymousClass000.A1V(r9)
            java.lang.String r9 = r8.A0E
            boolean r9 = X.C202699mR.A03(r9)
            if (r9 == 0) goto L_0x01b9
            X.0wo r12 = r7.A00
            java.lang.String r9 = "Asia/Kolkata"
            java.util.TimeZone r9 = java.util.TimeZone.getTimeZone(r9)
            int r9 = r9.getRawOffset()
            long r9 = (long) r9
            long r0 = r0 - r9
            long r0 = r12.A08(r0)
            X.0ts r11 = r7.A02
            java.lang.String r9 = X.C20040wv.A09(r11, r0)
            java.lang.String r1 = r8.A0E
            java.lang.String r0 = "DAILY"
            boolean r0 = r1.equals(r0)
            r16 = 1000(0x3e8, double:4.94E-321)
            if (r0 != 0) goto L_0x0187
            java.lang.String r0 = "ASPRESENTED"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0191
            long r0 = r8.A04
            long r9 = r8.A03
            r16 = 0
            int r14 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r14 <= 0) goto L_0x017f
            int r14 = (r9 > r16 ? 1 : (r9 == r16 ? 0 : -1))
            if (r14 <= 0) goto L_0x0179
            X.0wG r14 = r7.A01
            android.content.Context r14 = r14.A00
            r16 = r14
            java.lang.Object[] r14 = X.AnonymousClass001.A0M()
            java.lang.String r0 = X.C202699mR.A00(r12, r11, r0)
            r14[r2] = r0
            java.lang.String r9 = X.C202699mR.A00(r12, r11, r9)
            r1 = 2131895404(0x7f12246c, float:1.942564E38)
            r0 = r16
            java.lang.String r10 = X.C36391kE.A0v(r0, r9, r14, r3, r1)
        L_0x0090:
            boolean r0 = android.text.TextUtils.isEmpty(r10)
            if (r0 != 0) goto L_0x00aa
            X.8lE r9 = new X.8lE
            r9.<init>()
            X.0wG r0 = r4.A0P
            android.content.Context r1 = r0.A00
            r0 = 2131895416(0x7f122478, float:1.9425664E38)
            X.C167797yq.A01(r1, r9, r0)
            r9.A03 = r10
            r5.add(r9)
        L_0x00aa:
            java.util.HashSet r10 = X.C36441kJ.A16()
            r0 = 5
            java.lang.Integer[] r11 = new java.lang.Integer[r0]
            r0 = 115(0x73, float:1.61E-43)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r9 = 0
            java.lang.Integer r17 = X.C165617ti.A0X(r0, r11, r2, r13)
            r11[r3] = r17
            r1 = 2
            r0 = 417(0x1a1, float:5.84E-43)
            X.AnonymousClass000.A1L(r11, r0, r1)
            r1 = 3
            r0 = 20
            java.lang.Integer r16 = java.lang.Integer.valueOf(r0)
            r11[r1] = r16
            r1 = 4
            r0 = 418(0x1a2, float:5.86E-43)
            X.AnonymousClass000.A1L(r11, r0, r1)
            java.util.Collections.addAll(r10, r11)
            int r0 = r15.A02
            boolean r0 = X.C36381kD.A1Z(r10, r0)
            if (r0 == 0) goto L_0x00f8
            X.8lE r10 = new X.8lE
            r10.<init>()
            X.0wG r0 = r4.A0P
            android.content.Context r1 = r0.A00
            r0 = 2131895362(0x7f122442, float:1.9425555E38)
            X.C167797yq.A01(r1, r10, r0)
            java.lang.String r0 = r8.A0E
            java.lang.String r0 = r7.A07(r0)
            r10.A03 = r0
            r5.add(r10)
        L_0x00f8:
            int r1 = r15.A02
            if (r1 == r13) goto L_0x014c
            r0 = 20
            if (r1 == r0) goto L_0x014c
            java.lang.String r0 = r8.A0E
            boolean r0 = X.C202699mR.A03(r0)
            if (r0 == 0) goto L_0x014c
            X.8lE r12 = new X.8lE
            r12.<init>()
            X.0wG r0 = r4.A0P
            android.content.Context r11 = r0.A00
            r0 = 2131895435(0x7f12248b, float:1.9425703E38)
            X.C167797yq.A01(r11, r12, r0)
            X.0wo r10 = r4.A02
            long r0 = r8.A02
            java.lang.String r13 = "Asia/Kolkata"
            java.util.TimeZone r13 = java.util.TimeZone.getTimeZone(r13)
            int r13 = r13.getRawOffset()
            long r13 = (long) r13
            long r0 = r0 - r13
            long r0 = r10.A08(r0)
            X.0ts r7 = r7.A02
            java.lang.String r0 = X.C20040wv.A09(r7, r0)
            r12.A03 = r0
            r5.add(r12)
            X.8lE r12 = new X.8lE
            r12.<init>()
            r0 = 2131895434(0x7f12248a, float:1.94257E38)
            X.C167797yq.A01(r11, r12, r0)
            long r0 = r8.A01
            java.lang.String r0 = X.C202699mR.A00(r10, r7, r0)
            r12.A03 = r0
            r5.add(r12)
        L_0x014c:
            int r0 = r15.A02
            A06(r6, r4, r5, r0)
            A07(r4, r5)
            X.8lE r0 = r4.A0V()
            if (r0 == 0) goto L_0x015d
            r5.add(r0)
        L_0x015d:
            int r0 = r5.size()
            r7 = r22
            if (r9 >= r0) goto L_0x01e9
            java.lang.Object r0 = r5.get(r9)
            r7.add(r0)
            int r0 = r5.size()
            int r0 = r0 - r3
            if (r9 == r0) goto L_0x0176
            X.C167797yq.A04(r7)
        L_0x0176:
            int r9 = r9 + 1
            goto L_0x015d
        L_0x0179:
            java.lang.String r10 = X.C202699mR.A00(r12, r11, r0)
            goto L_0x0090
        L_0x017f:
            java.lang.String r0 = "[PAY]IndiaMandateUtils/getPayeeMetadataDueDateDesc next payment date info is unavailable"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r10 = 0
            goto L_0x0090
        L_0x0187:
            if (r14 != 0) goto L_0x01a0
            X.0wG r0 = r7.A01
            android.content.Context r1 = r0.A00
            r0 = 2131895402(0x7f12246a, float:1.9425636E38)
            goto L_0x019a
        L_0x0191:
            if (r14 != 0) goto L_0x01a0
            X.0wG r0 = r7.A01
            android.content.Context r1 = r0.A00
            r0 = 2131895401(0x7f122469, float:1.9425634E38)
        L_0x019a:
            java.lang.String r10 = X.C36351kA.A0w(r1, r9, r3, r0)
            goto L_0x0090
        L_0x01a0:
            X.0wG r0 = r7.A01
            android.content.Context r12 = r0.A00
            r10 = 2131895403(0x7f12246b, float:1.9425638E38)
            java.lang.Object[] r9 = new java.lang.Object[r3]
            X.9iz r0 = r8.A0B
            long r0 = r0.A00
            long r0 = r0 / r16
            java.lang.String r0 = X.C20040wv.A09(r11, r0)
            java.lang.String r10 = X.C36391kE.A0v(r12, r0, r9, r2, r10)
            goto L_0x0090
        L_0x01b9:
            java.lang.String r10 = r7.A05(r0)
            goto L_0x0090
        L_0x01bf:
            X.8lE r2 = new X.8lE
            r2.<init>()
            X.0wG r0 = r4.A0P
            android.content.Context r1 = r0.A00
            r0 = 2131895023(0x7f1222ef, float:1.9424867E38)
            goto L_0x01d8
        L_0x01cc:
            X.8lE r2 = new X.8lE
            r2.<init>()
            X.0wG r0 = r4.A0P
            android.content.Context r1 = r0.A00
            r0 = 2131895024(0x7f1222f0, float:1.942487E38)
        L_0x01d8:
            X.C167797yq.A01(r1, r2, r0)
            X.9g7 r1 = r4.A0n
            r0 = 1
            java.lang.String r0 = r1.A02(r3, r0)
            r2.A03 = r0
            r5.add(r2)
            goto L_0x001e
        L_0x01e9:
            if (r23 == 0) goto L_0x024f
            int r5 = r15.A02
            X.9jw r0 = r6.A0G
            if (r0 == 0) goto L_0x024f
            java.lang.String r0 = r0.A0E
            boolean r0 = X.C202699mR.A03(r0)
            if (r0 == 0) goto L_0x024f
            java.util.HashSet r1 = X.C36441kJ.A16()
            r0 = 2
            java.lang.Integer[] r0 = new java.lang.Integer[r0]
            r0[r2] = r17
            r0[r3] = r16
            java.util.Collections.addAll(r1, r0)
            boolean r0 = X.C36381kD.A1Z(r1, r5)
            if (r0 != 0) goto L_0x024f
            X.C167797yq.A05(r7)
            X.8kv r5 = new X.8kv
            r5.<init>()
            X.9jw r0 = r6.A0G
            int r0 = r0.A00
            if (r0 <= 0) goto L_0x022e
            X.0ts r0 = r4.A0Q
            java.util.Locale r3 = X.C36401kF.A0x(r0)
            X.9jw r0 = r6.A0G
            int r0 = r0.A00
            java.lang.String r1 = java.lang.Integer.toString(r0)
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.String.format(r3, r1, r0)
        L_0x022e:
            X.0ts r0 = r4.A0Q
            java.util.Locale r3 = X.C36401kF.A0x(r0)
            X.9jw r0 = r6.A0G
            X.9e2[] r0 = r0.A0P
            if (r0 != 0) goto L_0x0250
            r0 = 0
        L_0x023b:
            java.lang.String r1 = java.lang.Integer.toString(r0)
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.String.format(r3, r1, r0)
            r1 = 4
            X.3YH r0 = new X.3YH
            r0.<init>(r4, r6, r1)
            r5.A00 = r0
            r7.add(r5)
        L_0x024f:
            return
        L_0x0250:
            int r0 = r0.length
            goto L_0x023b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C180338lb.A0t(X.9un, X.9lY, X.8bI, java.util.List, boolean):void");
    }

    public void A0y(C202319lY r13, List list) {
        Context context;
        int i;
        String A0w;
        int A002;
        C175928bI A003 = C202319lY.A00(r13);
        C180028l5 r7 = new C180028l5();
        C201599jw r5 = A003.A0G;
        C18740tg.A06(r5);
        C202699mR r8 = this.A09;
        int i2 = r13.A02;
        String str = A003.A0O;
        long j = r5.A01;
        String str2 = r5.A0E;
        if (i2 == 20 || i2 == 115) {
            boolean A032 = C202699mR.A03(str2);
            context = r8.A01.A00;
            if (A032) {
                i = R.string.f12nameremoved;
                A0w = C36351kA.A0w(context, str, 1, i);
            } else {
                Object[] objArr = new Object[2];
                objArr[0] = str;
                A0w = C36391kE.A0v(context, C202699mR.A00(r8.A00, r8.A02, j), objArr, 1, R.string.f12nameremoved);
            }
        } else if (i2 != 401 && i2 != 417 && i2 != 418) {
            A0w = null;
        } else if (!C202699mR.A03(str2) || !((A002 = r5.A00()) == 2 || A002 == 4 || A002 == 6)) {
            context = r8.A01.A00;
            i = R.string.f12nameremoved;
            A0w = C36351kA.A0w(context, str, 1, i);
        } else {
            C201169iz r10 = r5.A0B;
            C18740tg.A06(r10);
            C18820ts r3 = r8.A02;
            C19970wo r2 = r8.A00;
            String A004 = C202699mR.A00(r2, r3, r10.A01);
            A0w = C36391kE.A0v(r8.A01.A00, C202699mR.A00(r2, r3, r10.A00), C36431kI.A1a(str, A004, 3), 2, R.string.f12nameremoved);
        }
        r7.A01 = A0w;
        if (!TextUtils.isEmpty(A0w)) {
            r7.A00 = 0;
            list.add(r7);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C180338lb(android.os.Bundle r37, X.AnonymousClass17Y r38, X.C19730wQ r39, X.C21100yf r40, X.AnonymousClass1KK r41, X.AnonymousClass1NG r42, X.AnonymousClass16D r43, X.C21060yb r44, X.C19970wo r45, X.C19630wG r46, X.C18820ts r47, X.C20310xM r48, X.AnonymousClass1FF r49, X.AnonymousClass1VZ r50, X.C24881Ed r51, X.AnonymousClass16T r52, X.AnonymousClass16S r53, X.C20810yC r54, X.AnonymousClass19A r55, X.C196129Xv r56, X.AEA r57, X.C202269lR r58, X.AE0 r59, X.C25251Fo r60, X.AnonymousClass1EZ r61, X.C29221Vu r62, X.C24601Db r63, X.AnonymousClass1DR r64, X.C29121Vk r65, X.AnonymousClass1EV r66, X.AnonymousClass1EU r67, X.AnonymousClass1XC r68, X.AnonymousClass6PS r69, X.C23075B3f r70, X.C202179lC r71, X.AnonymousClass1YQ r72, X.AnonymousClass39O r73, X.C199849g7 r74, X.AnonymousClass5GM r75, X.C200899iR r76, X.C202699mR r77, X.C29131Vl r78, X.AnonymousClass1FR r79, X.AnonymousClass1VY r80, X.C19770wU r81) {
        /*
            r36 = this;
            r4 = r36
            r1 = r64
            r23 = r63
            r22 = r61
            r21 = r60
            r20 = r53
            r19 = r52
            r18 = r51
            r17 = r50
            r28 = r69
            r29 = r70
            r8 = r41
            r9 = r42
            r30 = r72
            r10 = r43
            r31 = r73
            r11 = r44
            r32 = r74
            r12 = r45
            r13 = r46
            r33 = r76
            r14 = r47
            r15 = r48
            r16 = r49
            r34 = r79
            r35 = r81
            r27 = r68
            r7 = r39
            r26 = r67
            r6 = r38
            r25 = r66
            r5 = r37
            r24 = r1
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35)
            r4.A02 = r12
            r0 = r40
            r4.A0A = r0
            r0 = r54
            r4.A03 = r0
            r0 = r77
            r4.A09 = r0
            r0 = r57
            r4.A04 = r0
            r2 = r58
            r4.A05 = r2
            r3 = r56
            r4.A0B = r3
            r0 = r59
            r4.A0C = r0
            r4.A06 = r1
            r0 = r71
            r4.A08 = r0
            android.content.Context r1 = r13.A00
            X.8gL r0 = new X.8gL
            r22 = r65
            r21 = r62
            r18 = r55
            r23 = r75
            r24 = r78
            r14 = r0
            r15 = r1
            r16 = r6
            r17 = r19
            r19 = r3
            r20 = r2
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            r4.A0D = r0
            X.5Fh r0 = new X.5Fh
            r14 = r80
            r7 = r0
            r8 = r6
            r9 = r13
            r10 = r2
            r11 = r21
            r12 = r22
            r13 = r26
            r15 = r35
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15)
            r4.A07 = r0
            if (r37 == 0) goto L_0x00b3
            java.lang.String r0 = "extra_return_after_completion"
            boolean r0 = r5.getBoolean(r0)
            r4.A00 = r0
            r1 = 0
            java.lang.String r0 = "referral_screen"
            java.lang.String r0 = r5.getString(r0, r1)
            r4.A01 = r0
            java.lang.String r0 = "extra_new_mandate_initiation_mode"
            r5.getString(r0)
        L_0x00b3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C180338lb.<init>(android.os.Bundle, X.17Y, X.0wQ, X.0yf, X.1KK, X.1NG, X.16D, X.0yb, X.0wo, X.0wG, X.0ts, X.0xM, X.1FF, X.1VZ, X.1Ed, X.16T, X.16S, X.0yC, X.19A, X.9Xv, X.AEA, X.9lR, X.AE0, X.1Fo, X.1EZ, X.1Vu, X.1Db, X.1DR, X.1Vk, X.1EV, X.1EU, X.1XC, X.6PS, X.B3f, X.9lC, X.1YQ, X.39O, X.9g7, X.5GM, X.9iR, X.9mR, X.1Vl, X.1FR, X.1VY, X.0wU):void");
    }
}
