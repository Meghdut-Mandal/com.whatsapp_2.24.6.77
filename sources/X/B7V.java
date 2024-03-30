package X;

import android.content.Intent;
import com.whatsapp.jid.UserJid;
import com.whatsapp.payments.ui.IndiaUpiCheckOrderDetailsActivity;
import com.whatsapp.payments.ui.IndiaUpiSendPaymentActivity;
import com.whatsapp.payments.ui.IndiaWebViewUpiP2mHybridActivity;
import com.whatsapp.payments.ui.widget.PaymentView;
import java.util.ArrayList;
import java.util.List;

public class B7V extends C132446Tt {
    public Object A00;
    public final int A01;

    public B7V(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        C175898bF r4;
        AnonymousClass2bV r10;
        C135106c9 r9;
        String str;
        List list;
        C135066c4 r17;
        AnonymousClass3T1 r16;
        Integer num;
        C135106c9 r12;
        switch (this.A01) {
            case 0:
                C179008it r2 = (C179008it) ((C23168B8c) this.A00).A00;
                return C165617ti.A0O(r2.A0P).A07(r2.A00.A0A);
            case 1:
                C179008it r6 = (C179008it) this.A00;
                ArrayList A05 = r6.A0I.A05();
                C24851Ea A04 = r6.A0I.A04("2fa");
                if (!A05.contains(A04)) {
                    r6.A0I.A0A(A04);
                }
                ArrayList A0o = C165577te.A0o(r6.A0P);
                C207249un A012 = AnonymousClass16S.A01(r6.A00.A0A, A0o);
                if (A012 == null || (r4 = A012.A08) == null) {
                    return A012;
                }
                ((C175818b6) r4).A04 = C165617ti.A0P(C146356vT.A00(), Boolean.class, C36371kC.A0m(), "isPinSet");
                C165617ti.A0O(r6.A0P).A0J(A0o);
                return A012;
            default:
                C178848hw r0 = (C178848hw) this.A00;
                PaymentView A3i = r0.A3i();
                if (A3i == null || A3i.getStickerIfSelected() == null) {
                    C29121Vk r42 = r0.A0M;
                    if (r0 instanceof IndiaUpiSendPaymentActivity) {
                        PaymentView paymentView = r0.A0M;
                        if (paymentView != null) {
                            str = paymentView.getPaymentNote();
                        } else {
                            str = "";
                        }
                        PaymentView paymentView2 = r0.A0M;
                        if (paymentView2 != null) {
                            list = paymentView2.getMentionedJids();
                        } else {
                            list = null;
                        }
                        r10 = r0.A3j(str, list);
                    } else {
                        C179068j0 r3 = (C179068j0) r0;
                        if (r3 instanceof IndiaWebViewUpiP2mHybridActivity) {
                            C29551Xb r5 = r3.A0b;
                            AnonymousClass11F r62 = r3.A0E;
                            C18740tg.A06(r62);
                            r10 = r5.A00(r62, (AnonymousClass3T1) null, C79963uZ.A00, "", (List) null, 0);
                        } else if (r3 instanceof IndiaUpiCheckOrderDetailsActivity) {
                            IndiaUpiCheckOrderDetailsActivity indiaUpiCheckOrderDetailsActivity = (IndiaUpiCheckOrderDetailsActivity) r3;
                            r10 = indiaUpiCheckOrderDetailsActivity.A0b.A00(indiaUpiCheckOrderDetailsActivity.A0E, indiaUpiCheckOrderDetailsActivity.A08.A02(indiaUpiCheckOrderDetailsActivity.A06.A07), C79963uZ.A00, "", (List) null, 0);
                        } else {
                            r10 = null;
                        }
                    }
                    AnonymousClass16X r63 = r0.A09;
                    AnonymousClass16U r52 = r0.A05;
                    C207249un r7 = r0.A0B;
                    C175928bI r8 = r0.A0O;
                    String str2 = r0.A0n;
                    String str3 = r0.A0o;
                    PaymentView paymentView3 = r0.A0M;
                    if (paymentView3 != null) {
                        r9 = paymentView3.getPaymentBackground();
                    } else {
                        r9 = null;
                    }
                    return r42.A03(r52, r63, r7, r8, r9, r10, str2, str3, C179148jG.A1P(r0));
                }
                AnonymousClass64L r72 = r0.A0X;
                PaymentView paymentView4 = r0.A0M;
                if (paymentView4 != null) {
                    r17 = paymentView4.getStickerIfSelected();
                } else {
                    r17 = null;
                }
                C18740tg.A06(r17);
                C146506vi r15 = r0.A08;
                String str4 = r0.A0T;
                AnonymousClass11F r13 = r0.A0E;
                C18740tg.A06(r13);
                UserJid userJid = r0.A0G;
                long j = r0.A02;
                if (j != 0) {
                    r16 = C36421kH.A0R(r0.A0e, j);
                } else {
                    r16 = null;
                }
                PaymentView paymentView5 = r0.A0M;
                if (paymentView5 != null) {
                    num = paymentView5.getStickerSendOrigin();
                } else {
                    num = null;
                }
                AnonymousClass16X r92 = r0.A09;
                AnonymousClass16U r82 = r0.A05;
                C207249un r102 = r0.A0B;
                C175928bI r11 = r0.A0O;
                String str5 = r0.A0n;
                String str6 = r0.A0o;
                if (paymentView5 != null) {
                    r12 = paymentView5.getPaymentBackground();
                } else {
                    r12 = null;
                }
                return r72.A00(r82, r92, r102, r11, r12, r13, userJid, r15, r16, r17, num, str4, str5, str6, C179148jG.A1P(r0));
        }
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        switch (this.A01) {
            case 0:
                C207249un r9 = (C207249un) obj;
                Object obj2 = ((C23168B8c) this.A00).A00;
                if (r9 != null) {
                    C179008it r0 = (C179008it) obj2;
                    r0.A00 = (C175748az) r9;
                    r0.A4K();
                    return;
                }
                ((C179108jC) obj2).A4D();
                return;
            case 1:
                C207249un r92 = (C207249un) obj;
                if (r92 != null) {
                    C179008it r02 = (C179008it) this.A00;
                    C175748az r93 = (C175748az) r92;
                    r02.A00 = r93;
                    r02.A0A = r93;
                    AnonymousClass1L0.A03(r02.getApplicationContext(), true);
                }
                C179008it r3 = (C179008it) this.A00;
                r3.Bnv();
                r3.A3v();
                Intent A0D = C36431kI.A0D();
                A0D.putExtra("extra_bank_account", r3.A00);
                C36331k8.A0o(r3, A0D);
                return;
            default:
                C202319lY r94 = (C202319lY) obj;
                C178848hw r7 = (C178848hw) this.A00;
                if (!r7.A0w) {
                    r7.A0V.A02(r7.A00, 2);
                    r7.Bnv();
                    r7.A3v();
                    r7.A3k();
                    return;
                } else if (r94 == null) {
                    C202059ky r6 = new C202059ky(AEA.A00(r7.A04, 0));
                    AnonymousClass5GM r5 = r7.A0V;
                    int i = r7.A00;
                    r5.A06("error_code", (long) r6.A00, i);
                    r5.A02(i, 3);
                    r7.A4Z(r6);
                    return;
                } else {
                    r7.A0V.A02(r7.A00, 2);
                    C178848hw.A1H(r94, r7, true);
                    return;
                }
        }
    }
}
