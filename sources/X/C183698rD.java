package X;

import android.content.Intent;
import com.whatsapp.payments.ui.BrazilPaymentActivity;
import com.whatsapp.payments.ui.BrazilPaymentTransactionDetailActivity;

/* renamed from: X.8rD  reason: invalid class name and case insensitive filesystem */
public class C183698rD extends C132446Tt {
    public final /* synthetic */ AnonymousClass16U A00;
    public final /* synthetic */ AnonymousClass16X A01;
    public final /* synthetic */ C207249un A02;
    public final /* synthetic */ C146506vi A03;
    public final /* synthetic */ C175938bJ A04;
    public final /* synthetic */ BrazilPaymentActivity A05;
    public final /* synthetic */ AnonymousClass2bV A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;

    public C183698rD(AnonymousClass16U r1, AnonymousClass16X r2, C207249un r3, C146506vi r4, C175938bJ r5, BrazilPaymentActivity brazilPaymentActivity, AnonymousClass2bV r7, String str, String str2) {
        this.A05 = brazilPaymentActivity;
        this.A03 = r4;
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = r3;
        this.A04 = r5;
        this.A07 = str;
        this.A08 = str2;
        this.A06 = r7;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000f, code lost:
        if (r3 == null) goto L_0x0011;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object A08(java.lang.Object[] r29) {
        /*
            r28 = this;
            r0 = r28
            com.whatsapp.payments.ui.BrazilPaymentActivity r1 = r0.A05
            com.whatsapp.payments.ui.widget.PaymentView r2 = r1.A3i()
            if (r2 == 0) goto L_0x0011
            X.6c4 r3 = r2.getStickerIfSelected()
            r2 = 1
            if (r3 != 0) goto L_0x0012
        L_0x0011:
            r2 = 0
        L_0x0012:
            java.lang.String r4 = "p2m"
            if (r2 == 0) goto L_0x007a
            X.64L r12 = r1.A0X
            com.whatsapp.payments.ui.widget.PaymentView r2 = r1.A0U
            if (r2 == 0) goto L_0x0077
            X.6c4 r22 = r2.getStickerIfSelected()
        L_0x0020:
            X.C18740tg.A06(r22)
            X.6vi r6 = r0.A03
            r21 = 0
            if (r6 == 0) goto L_0x0074
            X.5z2 r2 = r6.A0M
            java.lang.String r8 = r2.A0D
        L_0x002d:
            X.11F r7 = r1.A0E
            X.C18740tg.A06(r7)
            com.whatsapp.jid.UserJid r5 = r1.A0G
            long r2 = r1.A02
            r10 = 0
            int r9 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r9 == 0) goto L_0x0042
            X.1A1 r9 = r1.A0e
            X.3T1 r21 = X.C36421kH.A0R(r9, r2)
        L_0x0042:
            com.whatsapp.payments.ui.widget.PaymentView r2 = r1.A0U
            if (r2 == 0) goto L_0x0071
            java.lang.Integer r23 = r2.getStickerSendOrigin()
        L_0x004a:
            X.16X r14 = r0.A01
            X.16U r13 = r0.A00
            X.9un r15 = r0.A02
            X.8bJ r2 = r0.A04
            java.lang.String r3 = r1.A0n
            java.lang.String r1 = r0.A07
            r17 = 0
            java.lang.String r0 = r0.A08
            boolean r27 = r4.equals(r0)
            r20 = r6
            r24 = r8
            r25 = r3
            r26 = r1
            r18 = r7
            r19 = r5
            r16 = r2
            X.9lY r0 = r12.A00(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            return r0
        L_0x0071:
            r23 = 0
            goto L_0x004a
        L_0x0074:
            r8 = r21
            goto L_0x002d
        L_0x0077:
            r22 = 0
            goto L_0x0020
        L_0x007a:
            X.1Vk r5 = r1.A0M
            X.2bV r11 = r0.A06
            X.16X r7 = r0.A01
            X.16U r6 = r0.A00
            X.9un r8 = r0.A02
            X.8bJ r9 = r0.A04
            java.lang.String r12 = r1.A0n
            java.lang.String r13 = r0.A07
            r10 = 0
            java.lang.String r0 = r0.A08
            boolean r14 = r4.equals(r0)
            X.9lY r0 = r5.A03(r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C183698rD.A08(java.lang.Object[]):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        C202319lY r5 = (C202319lY) obj;
        BrazilPaymentActivity brazilPaymentActivity = this.A05;
        brazilPaymentActivity.A0M.A05("send_payment", brazilPaymentActivity.A00);
        brazilPaymentActivity.A0D.registerObserver(brazilPaymentActivity.A0i);
        brazilPaymentActivity.A0f = true;
        if (!brazilPaymentActivity.A0w || r5 == null) {
            brazilPaymentActivity.A3k();
            return;
        }
        Intent A0H = C36441kJ.A0H(brazilPaymentActivity, BrazilPaymentTransactionDetailActivity.class);
        C202319lY.A01(A0H, r5, r5.A0C);
        C165597tg.A0z(A0H, brazilPaymentActivity.A0b);
        A0H.setFlags(67108864);
        A0H.putExtra("extra_action_bar_display_close", true);
        brazilPaymentActivity.A33(A0H, true);
        brazilPaymentActivity.Bnv();
    }
}
