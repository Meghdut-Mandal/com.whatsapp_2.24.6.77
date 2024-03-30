package X;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;
import com.whatsapp.payments.ui.AddPaymentMethodBottomSheet;
import com.whatsapp.payments.ui.BrazilOrderDetailsActivity;
import com.whatsapp.payments.ui.BrazilPaymentTransactionDetailActivity;
import com.whatsapp.payments.ui.PaymentsWarmWelcomeBottomSheet;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.8gs  reason: invalid class name and case insensitive filesystem */
public class C178648gs extends AF8 {
    public final C19460v5 A00;
    public final C24801Dv A01;
    public final AnonymousClass17Y A02;
    public final C19730wQ A03;
    public final C21100yf A04;
    public final C20050ww A05;
    public final C33771fu A06;
    public final C21060yb A07;
    public final C19970wo A08;
    public final C19420v0 A09;
    public final C18820ts A0A;
    public final C20810yC A0B;
    public final C147166wm A0C;
    public final AnonymousClass9jA A0D;
    public final C192619Hx A0E;
    public final AE6 A0F;
    public final AnonymousClass2ZN A0G;
    public final AnonymousClass1EZ A0H;
    public final C29231Vv A0I;
    public final C24601Db A0J;
    public final C202939my A0K;
    public final AnonymousClass1EV A0L;
    public final C23075B3f A0M;
    public final C201219j5 A0N;
    public final AE7 A0O;
    public final C201649k3 A0P;
    public final AnonymousClass1FR A0Q;
    public final C237919w A0R;
    public final C24651Dg A0S;
    public final C195219Sy A0T;
    public final AnonymousClass1YQ A0U;
    public final AnonymousClass979 A0V;
    public final C202199lE A0W;

    public int BHO() {
        return 2;
    }

    public void A00(Context context, C225014r r9) {
        PaymentsWarmWelcomeBottomSheet paymentsWarmWelcomeBottomSheet;
        PaymentsWarmWelcomeBottomSheet paymentsWarmWelcomeBottomSheet2;
        C201649k3 r3 = this.A0P;
        String A012 = C201649k3.A01(r3, "p2p_context", false);
        if (A012 == null) {
            AnonymousClass9YB.A00(this.A05).A0A(new C23209B9r(r9, this, 4));
        } else if ("brpay_p_account_recovery_eligibility_screen".equals(A012)) {
            this.A0W.A02((AnonymousClass155) C24801Dv.A00(context), "p2p_context", "receive_flow");
        } else {
            C21305AGj aGj = new C21305AGj(context, A012);
            if (r3.A08("p2p_context")) {
                PaymentsWarmWelcomeBottomSheet A002 = AnonymousClass9ZZ.A00("receive_flow");
                A002.A02 = new B94(this, 0);
                paymentsWarmWelcomeBottomSheet2 = A002;
            } else if (this.A0B.A0E(3013)) {
                paymentsWarmWelcomeBottomSheet2 = AnonymousClass9ZZ.A01("receive_flow");
            } else {
                AddPaymentMethodBottomSheet addPaymentMethodBottomSheet = new AddPaymentMethodBottomSheet();
                Bundle A072 = AnonymousClass001.A07();
                A072.putString("referral_screen", "receive_flow");
                addPaymentMethodBottomSheet.A17(A072);
                addPaymentMethodBottomSheet.A03 = new C193159Kb(0, R.string.f12nameremoved, 0);
                addPaymentMethodBottomSheet.A04 = aGj;
                paymentsWarmWelcomeBottomSheet = addPaymentMethodBottomSheet;
                r9.Btm(paymentsWarmWelcomeBottomSheet);
            }
            paymentsWarmWelcomeBottomSheet2.A01 = aGj;
            paymentsWarmWelcomeBottomSheet = paymentsWarmWelcomeBottomSheet2;
            r9.Btm(paymentsWarmWelcomeBottomSheet);
        }
    }

    public C193429Lk BIl(C175728ax r7, UserJid userJid, String str) {
        C193419Lj r5 = new C193419Lj(userJid);
        if (!this.A0B.A0E(1545) || r7 == null || TextUtils.isEmpty(r7.A05)) {
            return null;
        }
        Pair A0Q2 = C36441kJ.A0Q(C36371kC.A0m(), r7.A05);
        r5.A00 = A0Q2;
        return new C193429Lk(A0Q2, r5.A01, r5.A02, r5.A03);
    }

    public C175708av BKY() {
        return new C175938bJ();
    }

    public C23075B3f BBn() {
        return this.A0M;
    }

    public List BFH(C202319lY r11, C64933Qa r12) {
        String str;
        String str2;
        C24611Dc r1;
        String str3;
        AnonymousClass8b7 r0;
        List BFH = super.BFH(r11, r12);
        if (BFH == null) {
            BFH = AnonymousClass001.A0I();
        }
        C175708av r02 = r11.A0A;
        if (r02 != null) {
            C207259uo r5 = r02.A02;
            if (r5 != null) {
                ArrayList A0I2 = AnonymousClass001.A0I();
                C36381kD.A1M(PublicKeyCredentialControllerUtility.JSON_KEY_ID, r5.A01, A0I2);
                C36381kD.A1M("message_id", r5.A02, A0I2);
                String str4 = r5.A04;
                if (!TextUtils.isEmpty(str4)) {
                    C36381kD.A1M("payment_config_id", str4, A0I2);
                }
                BFH.add(C203399nx.A04("order", C165577te.A1a(A0I2, 0)));
            }
            C207079uW A0B2 = r11.A0A.A0B();
            if (A0B2 != null) {
                BFH.add(A0B2.A00());
            }
        }
        String str5 = r11.A0H;
        if (str5 != null) {
            C195219Sy r52 = this.A0T;
            AnonymousClass16S r3 = r52.A08;
            C175798b4 r03 = (C175798b4) r3.A07(str5);
            if (r03 != null && r03.A01 == 5) {
                C193879Ng r04 = r52.A00;
                if (r04 == null) {
                    r1 = r52.A01;
                    str3 = "local elo cache is null";
                } else {
                    StringBuilder A0u = AnonymousClass000.A0u();
                    String str6 = r04.A02;
                    r04.A02 = null;
                    A0u.append(str6);
                    A0u.append(r52.A0G.A00(5));
                    A0u.append(r52.A0D.A07());
                    String str7 = r52.A00.A03;
                    if (str7 == null) {
                        r1 = r52.A01;
                        str3 = "credentialId is null";
                    } else {
                        C207249un A072 = r3.A07(str7);
                        if (A072 == null || (r0 = (AnonymousClass8b7) A072.A08) == null) {
                            str = null;
                        } else {
                            str = r0.A05;
                        }
                        A0u.append(str);
                        C207119ua r05 = r52.A00.A01;
                        C18740tg.A06(r05);
                        A0u.append(new DecimalFormat("0.00").format(((double) r05.A01()) / ((double) r52.A00.A01.A00)));
                        C193879Ng r13 = r52.A00;
                        A0u.append(((AnonymousClass16V) r13.A01.A01).A02);
                        String str8 = r13.A05;
                        C18740tg.A06(str8);
                        int hashCode = str8.hashCode();
                        if (hashCode != -1540055076) {
                            if (hashCode == -1375934236 && str8.equals("fingerprint")) {
                                str2 = "42";
                            }
                            str2 = "48";
                        } else {
                            if (str8.equals("payment_pin")) {
                                str2 = "44";
                            }
                            str2 = "48";
                        }
                        String A0q = AnonymousClass000.A0q(str2, A0u);
                        AnonymousClass6VM r06 = r52.A0B;
                        String A062 = r06.A06(A0q);
                        String A073 = r06.A07(A0q);
                        ArrayList A0I3 = AnonymousClass001.A0I();
                        if (A062 != null) {
                            C36381kD.A1M("device_signature", A062, A0I3);
                            if (A073 != null) {
                                C36381kD.A1M("wallet_signature", A073, A0I3);
                                if (str6 != null) {
                                    C36381kD.A1M("challenge_id", str6, A0I3);
                                    C36381kD.A1M("cardholder_verification_method", str2, A0I3);
                                    r52.A00 = null;
                                    r52.A03 = false;
                                    r52.A02 = false;
                                    BFH.add(C203399nx.A04("elo", C165577te.A1a(A0I3, 0)));
                                    return BFH;
                                }
                            } else {
                                r1 = r52.A01;
                                str3 = "wallet_signature is null";
                            }
                        } else {
                            r1 = r52.A01;
                            str3 = "device_signature is null";
                        }
                    }
                }
                r1.A05(str3);
            }
        }
        return BFH;
    }

    public Class BFM() {
        return BrazilOrderDetailsActivity.class;
    }

    public Class BFn() {
        return BrazilPaymentTransactionDetailActivity.class;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C178648gs(X.C19460v5 r10, X.C24801Dv r11, X.AnonymousClass17Y r12, X.C19730wQ r13, X.C21100yf r14, X.C20050ww r15, X.C33771fu r16, X.AnonymousClass16D r17, X.AnonymousClass171 r18, X.C21060yb r19, X.C19970wo r20, X.C19630wG r21, X.C19420v0 r22, X.C18820ts r23, X.C20810yC r24, X.C147166wm r25, X.AnonymousClass9jA r26, X.C192619Hx r27, X.AE6 r28, X.AnonymousClass2ZN r29, X.AnonymousClass1EZ r30, X.C29231Vv r31, X.C24651Dg r32, X.C24601Db r33, X.C202939my r34, X.AnonymousClass1EV r35, X.AnonymousClass1EU r36, X.AF5 r37, X.C195219Sy r38, X.AnonymousClass1YQ r39, X.AnonymousClass979 r40, X.C201219j5 r41, X.AE7 r42, X.C201649k3 r43, X.C202199lE r44, X.AnonymousClass1FR r45, X.C237919w r46) {
        /*
            r9 = this;
            java.lang.String r8 = "FBPAY"
            r1 = r9
            r7 = r45
            r3 = r18
            r4 = r19
            r5 = r21
            r2 = r17
            r6 = r36
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            r0 = r20
            r9.A08 = r0
            r0 = r16
            r9.A06 = r0
            r0 = r24
            r9.A0B = r0
            r9.A02 = r12
            r9.A03 = r13
            r9.A05 = r15
            r9.A04 = r14
            r9.A01 = r11
            r9.A0Q = r7
            r9.A00 = r10
            r9.A07 = r4
            r0 = r23
            r9.A0A = r0
            r0 = r46
            r9.A0R = r0
            r0 = r33
            r9.A0J = r0
            r0 = r25
            r9.A0C = r0
            r0 = r30
            r9.A0H = r0
            r0 = r22
            r9.A09 = r0
            r0 = r38
            r9.A0T = r0
            r0 = r41
            r9.A0N = r0
            r0 = r42
            r9.A0O = r0
            r0 = r35
            r9.A0L = r0
            r0 = r26
            r9.A0D = r0
            r0 = r40
            r9.A0V = r0
            r0 = r39
            r9.A0U = r0
            r0 = r28
            r9.A0F = r0
            r0 = r29
            r9.A0G = r0
            r0 = r37
            r9.A0M = r0
            r0 = r32
            r9.A0S = r0
            r0 = r27
            r9.A0E = r0
            r0 = r44
            r9.A0W = r0
            r0 = r31
            r9.A0I = r0
            r0 = r43
            r9.A0P = r0
            r0 = r34
            r9.A0K = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C178648gs.<init>(X.0v5, X.1Dv, X.17Y, X.0wQ, X.0yf, X.0ww, X.1fu, X.16D, X.171, X.0yb, X.0wo, X.0wG, X.0v0, X.0ts, X.0yC, X.6wm, X.9jA, X.9Hx, X.AE6, X.2ZN, X.1EZ, X.1Vv, X.1Dg, X.1Db, X.9my, X.1EV, X.1EU, X.AF5, X.9Sy, X.1YQ, X.979, X.9j5, X.AE7, X.9k3, X.9lE, X.1FR, X.19w):void");
    }
}
