package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.8rE  reason: invalid class name and case insensitive filesystem */
public class C183708rE extends C132446Tt {
    public int A00;
    public final C19970wo A01;
    public final AnonymousClass1DQ A02;
    public final AnonymousClass1VZ A03;
    public final C202319lY A04;
    public final UserJid A05;
    public final C29121Vk A06;
    public final AnonymousClass1EU A07;
    public final C237919w A08;
    public final Runnable A09;

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        C202319lY r7;
        C19970wo r4;
        C180838mV r5;
        C24611Dc r2;
        String str;
        int i = this.A00;
        if (i == 15) {
            C237919w r1 = this.A08;
            r7 = this.A04;
            C64933Qa A0o = C36411kG.A0o(r7.A0C, r1);
            r4 = this.A01;
            r5 = new C180978mj(A0o, C19970wo.A00(r4));
        } else if (i == 18) {
            C237919w r12 = this.A08;
            r7 = this.A04;
            C64933Qa A0o2 = C36411kG.A0o(r7.A0C, r12);
            r4 = this.A01;
            r5 = new C180968mi(A0o2, C19970wo.A00(r4));
        } else {
            throw AnonymousClass001.A09(C24611Dc.A01("PaymentsMessageHandler", AnonymousClass000.A0r("Transaction status is not cancelled or rejected, status: ", AnonymousClass000.A0u(), i)));
        }
        r5.A00 = r7.A0L;
        r5.A0q(this.A05);
        C29121Vk r6 = this.A06;
        if (!r6.A0C.A04(0)) {
            r2 = r6.A0F;
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("decline/cancelPaymentRequest is not enabled for country: ");
            str = AnonymousClass000.A0o(r6.A0B.A02(), A0u);
        } else if (r5.A1J.A00 == null) {
            r2 = r6.A0F;
            str = "requestPayment found null or empty args jid";
        } else {
            r6.A04.A0P(r5);
            int i2 = r7.A02;
            r7.A02 = i;
            r7.A06 = C19970wo.A00(r4);
            AnonymousClass1EU r0 = this.A07;
            AnonymousClass1EU.A00(r0);
            r0.A05.A0d(r7, C165617ti.A0R(r7.A0C, r7.A0L, r7.A0Q), i2, 0, -1);
            return this.A03.A00(r7);
        }
        r2.A06(str);
        int i22 = r7.A02;
        r7.A02 = i;
        r7.A06 = C19970wo.A00(r4);
        AnonymousClass1EU r02 = this.A07;
        AnonymousClass1EU.A00(r02);
        r02.A05.A0d(r7, C165617ti.A0R(r7.A0C, r7.A0L, r7.A0Q), i22, 0, -1);
        return this.A03.A00(r7);
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        AnonymousClass3T1 r4 = (AnonymousClass3T1) obj;
        if (r4 != null) {
            C202319lY r2 = r4.A0M;
            r2.A02 = this.A00;
            r2.A06 = C19970wo.A00(this.A01);
            AnonymousClass1DQ.A00(this.A02, r4, 16);
        }
        this.A09.run();
    }

    public C183708rE(C19970wo r1, AnonymousClass1DQ r2, AnonymousClass1VZ r3, C202319lY r4, UserJid userJid, C29121Vk r6, AnonymousClass1EU r7, C237919w r8, Runnable runnable, int i) {
        this.A01 = r1;
        this.A02 = r2;
        this.A08 = r8;
        this.A07 = r7;
        this.A03 = r3;
        this.A06 = r6;
        this.A04 = r4;
        this.A05 = userJid;
        this.A00 = i;
        this.A09 = runnable;
    }
}
