package X;

import android.content.Context;
import android.text.TextUtils;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.UserJid;
import com.whatsapp.payments.pin.ui.PinBottomSheetDialogFragment;
import com.whatsapp.payments.ui.BrazilAccountRecoveryPinActivity;
import com.whatsapp.payments.ui.BrazilPaymentActivity;
import java.util.ArrayList;
import java.util.List;

public class B7K extends AIB {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public B7K(Context context, C29221Vu r2, C19640wH r3, Object obj, Object obj2, Object obj3, int i) {
        super(context, r2, r3);
        this.A03 = i;
        this.A00 = obj2;
        this.A01 = obj;
        this.A02 = obj3;
    }

    public void A05(C202059ky r4) {
        switch (this.A03) {
            case 0:
                C165567td.A15(((C29121Vk) this.A00).A0F, r4, "Tos onRequestError: ", AnonymousClass000.A0u());
                break;
            case 1:
                ((AnonymousClass9Qw) this.A01).A00(r4);
                return;
            case 2:
                AnonymousClass00C.A0D(r4, 0);
                ((B1O) this.A00).BWg(r4);
                return;
            case 3:
                ((B2v) this.A01).BOa(r4, (Integer) this.A02);
                return;
            case 4:
                break;
            default:
                ((C194739Ra) this.A01).A00(r4);
                return;
        }
        ((AnonymousClass1XD) this.A01).Bes(r4);
    }

    public void A06(C202059ky r4) {
        switch (this.A03) {
            case 0:
                C165567td.A15(((C29121Vk) this.A00).A0F, r4, "Tos onResponseError: ", AnonymousClass000.A0u());
                break;
            case 1:
                ((AnonymousClass9Qw) this.A01).A00(r4);
                return;
            case 2:
                AnonymousClass00C.A0D(r4, 0);
                ((B1O) this.A00).BWg(r4);
                return;
            case 3:
                ((B2v) this.A01).BOa(r4, (Integer) this.A02);
                return;
            case 4:
                break;
            default:
                A05(r4);
                return;
        }
        ((AnonymousClass1XD) this.A01).Bf0(r4);
    }

    public void A07(C203399nx r24) {
        C178528gg r3;
        C188008yt r8;
        boolean z;
        String str;
        List<C184038rn> list;
        C199359fB r1;
        C201009id r2;
        C199359fB r12;
        int i;
        AnonymousClass16X r7;
        C202319lY r13;
        C202059ky r4;
        int i2;
        C203399nx r14 = r24;
        switch (this.A03) {
            case 0:
                try {
                    r3 = new C178528gg();
                    ArrayList arrayList = C186088vO.A00;
                    C203399nx A0e = C90514aH.A0e(r14, (C592133b) this.A02);
                    Class<String> cls = String.class;
                    Long A0P = C165567td.A0P();
                    Long A0Q = C165567td.A0Q();
                    C203399nx r9 = r14;
                    Object obj = "1";
                    Object A07 = C203539oF.A07(r9, cls, A0P, A0Q, obj, new String[]{"accept_pay", "outage"}, false);
                    Object A072 = C203539oF.A07(r9, cls, A0P, A0Q, obj, new String[]{"accept_pay", "sandbox"}, false);
                    C203379ns.A09(r14, C186088vO.A02, new String[]{"accept_pay", "service"});
                    String A073 = C203379ns.A07(r14, "accept_pay", "consumer", C186088vO.A00);
                    C203379ns.A0F(r14, "accept_pay", "merchant", C186088vO.A01);
                    C203539oF.A0A(A0e, r14, 4);
                    AIB.A03(r14, AIJ.A00, new String[]{"accept_pay"});
                    r3.A02 = AnonymousClass000.A1P("1".equals(A073) ? 1 : 0);
                    r3.A00 = "1".equals(A07);
                    boolean equals = "1".equals(A072);
                    r3.A01 = equals;
                    ((C29121Vk) this.A00).A0A.A0P(equals);
                } catch (C235919b unused) {
                    r3 = new C178528gg();
                    r3.A02 = false;
                }
                ((AnonymousClass1XD) this.A01).Bf1(r3);
                return;
            case 1:
                try {
                    C203399nx A0d = r14.A0d("account");
                    ArrayList A0I = AnonymousClass001.A0I();
                    AnonymousClass9ON r5 = (AnonymousClass9ON) this.A00;
                    int i3 = 0;
                    if (r5.A04.A02.A0E(2984)) {
                        ArrayList A05 = r5.A0A.A05(A0d);
                        if (A05 == null || A05.isEmpty()) {
                            i = 0;
                        } else {
                            i = A05.size();
                            if (AnonymousClass16S.A04(A05)) {
                                AnonymousClass9YB A012 = r5.A05.A01();
                                C18740tg.A06(A012);
                                A012.A06((C22935Ayl) null, A05);
                            }
                        }
                        C203399nx A0e2 = C90514aH.A0e(r14, (C592133b) this.A02);
                        C203539oF.A0A(A0e2, r14, 21);
                        for (C118095nK r15 : ((C184338sH) C203539oF.A03(r14, new C23212B9u(A0e2, 20), "account")).A00) {
                            AnonymousClass8b7 r32 = new AnonymousClass8b7();
                            r32.A04(r5.A01, r15.A00, 0);
                            A0I.add(r32);
                        }
                        i3 = i;
                    }
                    C202059ky A013 = C202059ky.A01(A0d);
                    if (A013 != null) {
                        ((AnonymousClass9Qw) this.A01).A00(A013);
                        return;
                    }
                    AnonymousClass9Qw r42 = (AnonymousClass9Qw) this.A01;
                    AGJ agj = r42.A00;
                    PinBottomSheetDialogFragment pinBottomSheetDialogFragment = agj.A01;
                    if (pinBottomSheetDialogFragment != null) {
                        pinBottomSheetDialogFragment.A1p();
                        pinBottomSheetDialogFragment.A1c();
                    } else {
                        AnonymousClass155 r22 = agj.A00;
                        if (r22 instanceof BrazilAccountRecoveryPinActivity) {
                            r22.Bnv();
                        }
                    }
                    C202199lE r72 = agj.A02;
                    r72.A07.A0B("tos_no_wallet");
                    r72.A0K.A01();
                    r72.A07.A0B("kyc");
                    r72.A09.A0N("pending");
                    C36331k8.A0w(C90494aF.A0E(r72.A09), "payment_account_recovered", true);
                    AnonymousClass155 r6 = agj.A00;
                    if (r6 instanceof BrazilAccountRecoveryPinActivity) {
                        r72.A0G.A00(new C21261AEr(r42, A0I, i3), false);
                        return;
                    }
                    C202199lE.A01(r6, r72, r42.A01, A0I, i3, agj.A03, agj.A04);
                    return;
                } catch (C235919b e) {
                    ((AnonymousClass9ON) this.A00).A08.A0A("PAY: BrazilAccountRecoveryAction : invalid response", e);
                    ((AnonymousClass9Qw) this.A01).A00(C202059ky.A00());
                    return;
                }
            case 2:
                AnonymousClass00C.A0D(r14, 0);
                try {
                    ArrayList arrayList2 = null;
                    C203399nx A0e3 = C90514aH.A0e(r14, (C592133b) this.A01);
                    Class<String> cls2 = String.class;
                    Long A0P2 = C165567td.A0P();
                    Long A0Q2 = C165567td.A0Q();
                    C203379ns.A03(r14, cls2, A0P2, A0Q2, C203379ns.A00.A0Z(A0e3, cls2, A0P2, A0Q2, (Object) null, new String[]{"account", "action"}, false), new String[]{"account", "action"}, true);
                    C184998tL r33 = (C184998tL) C203539oF.A03(r14, AJH.A00, "account");
                    C203539oF.A0A(A0e3, r14, 18);
                    C203539oF.A09(r14, AJI.A00, new String[]{"account"}, 1, 1).get(0);
                    C198009ck r10 = (C198009ck) this.A02;
                    String valueOf = String.valueOf(r33.A02);
                    if (AnonymousClass00C.A0J(valueOf, "INACTIVE")) {
                        r8 = C188008yt.INACTIVE;
                    } else if (AnonymousClass00C.A0J(valueOf, "ACTIVE")) {
                        r8 = C188008yt.ACTIVE;
                    } else {
                        r8 = C188008yt.NONE;
                    }
                    C184038rn r16 = r33.A00;
                    if (!(r16 == null || (list = (List) r16.A00) == null)) {
                        arrayList2 = AnonymousClass001.A0I();
                        if (!list.isEmpty()) {
                            for (C184038rn r17 : list) {
                                C184858t7 r18 = (C184858t7) r17.A00;
                                AnonymousClass00C.A08(r18);
                                String str2 = r18.A00;
                                AnonymousClass00C.A08(str2);
                                List<C184038rn> list2 = r18.A01;
                                ArrayList A13 = C36411kG.A13(list2);
                                if (!list2.isEmpty()) {
                                    for (C184038rn r19 : list2) {
                                        C184268sA r23 = (C184268sA) r19.A00;
                                        AnonymousClass00C.A08(r23);
                                        long A0B = C165587tf.A0B(r23.A00);
                                        C184308sE r110 = (C184308sE) r23.A01;
                                        AnonymousClass00C.A08(r110);
                                        C207119ua A002 = C198009ck.A00(r10, r110);
                                        C184308sE r111 = (C184308sE) r23.A02;
                                        AnonymousClass00C.A08(r111);
                                        A13.add(new C206629ti(A002, C198009ck.A00(r10, r111), (int) A0B));
                                    }
                                }
                                arrayList2.add(new C206639tj("CREDIT_CARD", str2, A13));
                            }
                        }
                    }
                    C184908tC r112 = r33.A01;
                    if (r112 == null || (str = r112.A00) == null) {
                        z = false;
                    } else {
                        z = str.equals("1");
                    }
                    C206649tk r43 = new C206649tk(new C206479tT(z), r8, arrayList2);
                    C23231BAn bAn = (C23231BAn) ((B1O) this.A00);
                    if (bAn.A01 != 0) {
                        ((C167747yk) bAn.A00).A0Y(r43);
                        return;
                    }
                    BrazilPaymentActivity brazilPaymentActivity = (BrazilPaymentActivity) bAn.A00;
                    brazilPaymentActivity.Bnv();
                    C206479tT r25 = r43.A00;
                    if (r43.A01 == C188008yt.ACTIVE && r25 != null) {
                        brazilPaymentActivity.A0e = r25.A00;
                    }
                    brazilPaymentActivity.A01 ^= 2;
                    BrazilPaymentActivity.A1B(brazilPaymentActivity, brazilPaymentActivity.A0e);
                    return;
                } catch (C235919b e2) {
                    C165577te.A1M("PaymentConfigActions", e2.getMessage());
                    return;
                }
            case 3:
                try {
                    C203399nx A0d2 = r14.A0d("account");
                    C202059ky A014 = C202059ky.A01(A0d2);
                    C203399nx A0c = A0d2.A0c("offer_eligibility");
                    if (A014 != null) {
                        int i4 = A014.A00;
                        if (i4 == 1441) {
                            ((C201009id) this.A00).A0N.A02(A014.A02);
                        } else if (i4 == 1448) {
                            ((C201009id) this.A00).A0H.A02(A014, "FB", "PIN");
                        } else if (i4 == 2896004) {
                            AVX.A00(((C201009id) this.A00).A0Q, this, 6);
                        }
                        if (!(A0c == null || (r12 = r2.A0L) == null)) {
                            (r2 = (C201009id) this.A00).A0K.A08((B1V) null, A0c, r12.A01);
                        }
                        ((B2v) this.A01).BOa(A014, (Integer) this.A02);
                        return;
                    }
                    C203399nx A0c2 = A0d2.A0c("transaction");
                    if (A0c2 != null) {
                        C201009id r82 = (C201009id) this.A00;
                        C203399nx A0c3 = A0c2.A0c("elo");
                        if (A0c3 != null) {
                            String A0x = C36391kE.A0x(A0c3, "challenge_id");
                            C195219Sy r113 = r82.A0J;
                            r113.A00(A0x);
                            String str3 = r82.A0R;
                            C207119ua r34 = r82.A05;
                            String str4 = r82.A0V;
                            C193879Ng r114 = r113.A00;
                            r114.A03 = str3;
                            r114.A01 = r34;
                            r114.A05 = str4;
                        }
                        String A0h = A0c2.A0h(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
                        if (!TextUtils.isEmpty(A0h)) {
                            if (A0c == null || (r1 = r82.A0L) == null) {
                                ((B6I) this.A01).BfI(A0h, (Integer) this.A02);
                                return;
                            }
                            r82.A0K.A08(new AFI(this, A0h), A0c, r1.A01);
                            return;
                        }
                    }
                    ((B2v) this.A01).BOa(new C202059ky(500), (Integer) this.A02);
                    return;
                } catch (C235919b e3) {
                    C165567td.A15(((C201009id) this.A00).A0I, e3, "sendPrecheckWithSignature/onResponseSuccess/corrupt stream exception: ", AnonymousClass000.A0u());
                    ((B2v) this.A01).BOa(new C202059ky(500), (Integer) this.A02);
                    return;
                }
            case 4:
                try {
                    C203399nx A0d3 = r14.A0d("account").A0d("pay");
                    String A0h2 = A0d3.A0h("currency");
                    String A0h3 = A0d3.A0h("amount");
                    AnonymousClass1XC r44 = (AnonymousClass1XC) this.A00;
                    AnonymousClass16T r52 = r44.A04;
                    AnonymousClass16U A015 = r52.A01(A0h2);
                    if (!TextUtils.isEmpty(A0h3)) {
                        r7 = C165607th.A0R(A015, A0h3);
                    } else {
                        r7 = null;
                    }
                    AnonymousClass3T1 A022 = r44.A03.A02((C64933Qa) this.A02);
                    if (A022 == null || (r13 = A022.A0M) == null) {
                        A06(C202059ky.A00());
                        return;
                    }
                    UserJid userJid = r13.A0E;
                    UserJid userJid2 = r13.A0D;
                    AnonymousClass16U A016 = r52.A01(A0h2);
                    C202319lY r53 = A022.A0M;
                    C202319lY A017 = C203419nz.A01(A016, r7, userJid, userJid2, A0h2, (String) null, r53.A0G, 3, 0, r53.A04, r53.A01, 0, r53.A05);
                    A017.A0D(A022.A0M.A0K);
                    r44.A02.A0Z(A017, A022.A1J);
                    ((AnonymousClass1XD) this.A01).Bf1(new AnonymousClass9KX());
                    return;
                } catch (C235919b unused2) {
                    A06(C202059ky.A00());
                    return;
                }
            default:
                C203399nx A032 = C203399nx.A03(r14);
                if (A032 != null) {
                    r4 = C202059ky.A01(A032);
                    if (!(r4 == null || (i2 = r4.A00) == 0)) {
                        if (i2 == 1448) {
                            ((C198279dC) this.A00).A06.A02(r4, ((C194449Pt) this.A02).A00.A05, "PIN");
                        }
                    }
                    C196039Xk r35 = ((C198279dC) this.A00).A07;
                    r35.A01();
                    r35.A02(0);
                } else {
                    r4 = null;
                    C196039Xk r352 = ((C198279dC) this.A00).A07;
                    r352.A01();
                    r352.A02(0);
                }
                ((C194739Ra) this.A01).A00(r4);
                return;
        }
    }
}
