package X;

import android.content.Context;
import android.text.TextUtils;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.9id  reason: invalid class name and case insensitive filesystem */
public class C201009id {
    public final Context A00;
    public final AnonymousClass17Y A01;
    public final C19730wQ A02;
    public final C19970wo A03;
    public final C207079uW A04;
    public final C207119ua A05;
    public final C207119ua A06;
    public final C207259uo A07;
    public final C20810yC A08;
    public final UserJid A09;
    public final UserJid A0A;
    public final C29221Vu A0B;
    public final C29121Vk A0C;
    public final AnonymousClass1EU A0D;
    public final AnonymousClass1EU A0E;
    public final AnonymousClass9SJ A0F;
    public final AnonymousClass9SR A0G;
    public final C200049gU A0H;
    public final C24611Dc A0I = C165597tg.A0S("PaymentPrecheckAction");
    public final C195219Sy A0J;
    public final AnonymousClass1YQ A0K;
    public final C199359fB A0L;
    public final AnonymousClass6VG A0M;
    public final C196039Xk A0N;
    public final C198799eD A0O;
    public final C29131Vl A0P;
    public final C19770wU A0Q;
    public final String A0R;
    public final String A0S;
    public final String A0T;
    public final String A0U;
    public final String A0V;

    public static void A00(C02680Bk r9, C201009id r10, C21094A8f a8f, C194449Pt r12) {
        C19970wo r1 = r10.A03;
        String A002 = C237919w.A00(r10.A02, r1);
        long A092 = C36371kC.A09(r1);
        Object[] objArr = new Object[6];
        objArr[0] = AnonymousClass3U8.A06(r10.A09);
        C207119ua r13 = r10.A05;
        AnonymousClass000.A1K(objArr, r13.A01());
        C36331k8.A1V(objArr, r13.A00);
        objArr[3] = ((AnonymousClass16V) r13.A01).A02;
        C36381kD.A1L(Long.valueOf(A092), A002, objArr);
        if (!r10.A0M.A06(r9, new C21092A8d(r10, a8f, r12, A002, A092), C200959iX.A01(objArr))) {
            a8f.A00();
        }
    }

    public static void A01(C201009id r14, B6I b6i, C203399nx r16, String str) {
        B66 b66;
        C203399nx r0;
        ArrayList A0I2 = AnonymousClass001.A0I();
        C36381kD.A1M("action", "pay-precheck", A0I2);
        C36381kD.A1M("country", "BR", A0I2);
        C36381kD.A1M("credential-id", r14.A0R, A0I2);
        C36381kD.A1M("nonce", str, A0I2);
        C165577te.A16(r14.A09, "receiver", A0I2);
        C36381kD.A1M("device-id", r14.A0P.A01(), A0I2);
        String str2 = r14.A0U;
        C36381kD.A1M("transaction-type", str2, A0I2);
        C20810yC r6 = r14.A08;
        if (r6.A0E(1746) && (!"p2m".equals(str2) || r14.A07 == null)) {
            C36381kD.A1M("payment_initiator", "buyer", A0I2);
        }
        C199359fB r02 = r14.A0L;
        if (r02 != null) {
            C165597tg.A1I("offer_id", A0I2, r02.A01);
        }
        String str3 = r14.A0S;
        if (!TextUtils.isEmpty(str3)) {
            C36381kD.A1M("payment-rails", str3, A0I2);
        }
        String str4 = r14.A0T;
        if (!TextUtils.isEmpty(str4)) {
            C36381kD.A1M("request-id", str4, A0I2);
        }
        C198699e3 A032 = r14.A0D.A03("BR");
        if (A032 != null) {
            b66 = A032.A01(((AnonymousClass16V) r14.A05.A01).A02);
        } else {
            b66 = null;
        }
        C203399nx r8 = new C203399nx(b66.BEM(r14.A05), "amount", new AnonymousClass1AL[0]);
        C203399nx r3 = new C203399nx(b66.BEM(r14.A06), "total-amount", new AnonymousClass1AL[0]);
        C203399nx[] r1 = new C203399nx[3];
        r1[0] = r16;
        r1[1] = r8;
        ArrayList A0d = C165567td.A0d(r3, r1, 2);
        C207259uo r9 = r14.A07;
        if (r9 != null) {
            ArrayList A0I3 = AnonymousClass001.A0I();
            C36381kD.A1M(PublicKeyCredentialControllerUtility.JSON_KEY_ID, r9.A01, A0I3);
            C36381kD.A1M("message_id", r9.A02, A0I3);
            String str5 = r9.A04;
            if (!TextUtils.isEmpty(str5)) {
                C36381kD.A1M("payment_config_id", str5, A0I3);
            }
            List<C206319t7> list = r9.A05;
            if (list != null && !list.isEmpty()) {
                String str6 = r9.A03;
                if ("physical-goods".equals(str6)) {
                    C36381kD.A1M("order-type", str6, A0I3);
                    ArrayList A0r = C36361kB.A0r(list);
                    for (C206319t7 r12 : list) {
                        ArrayList A0I4 = AnonymousClass001.A0I();
                        C36381kD.A1M(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, r12.A04, A0I4);
                        C36381kD.A1M("address_line1", r12.A00, A0I4);
                        String str7 = r12.A01;
                        if (str7.length() != 0) {
                            C36381kD.A1M("address_line2", str7, A0I4);
                        }
                        String str8 = r12.A02;
                        if (str8.length() != 0) {
                            C36381kD.A1M("city", str8, A0I4);
                        }
                        String str9 = r12.A06;
                        if (str9.length() != 0) {
                            C36381kD.A1M("state", str9, A0I4);
                        }
                        C36381kD.A1M("country", r12.A03, A0I4);
                        C36381kD.A1M("postal_code", r12.A05, A0I4);
                        C203399nx.A0E("beneficiary", A0r, C165577te.A1a(A0I4, 0));
                    }
                    r0 = new C203399nx(C203399nx.A05("beneficiaries", (AnonymousClass1AL[]) null, C165577te.A1b(A0r, 0)), "order", C165577te.A1a(A0I3, 0));
                    A0d.add(r0);
                }
            }
            r0 = C203399nx.A04("order", C165577te.A1a(A0I3, 0));
            A0d.add(r0);
        }
        C207079uW r13 = r14.A04;
        if (r13 != null && r6.A0E(4443)) {
            A0d.add(r13.A00());
        }
        B6I b6i2 = b6i;
        Integer BOe = b6i.BOe();
        C203399nx A052 = C203399nx.A05("account", C165577te.A1a(A0I2, 0), C165577te.A1b(A0d, A0d.size()));
        r14.A0C.A0H(new B7K(r14.A00, r14.A0B, r14.A01, b6i2, r14, BOe, 3), A052, "set", AnonymousClass6X5.A0L);
    }

    public C201009id(Context context, AnonymousClass17Y r11, C19730wQ r12, C19970wo r13, C207079uW r14, C207119ua r15, C207119ua r16, C207259uo r17, C20810yC r18, UserJid userJid, C29221Vu r20, C29121Vk r21, AnonymousClass1EU r22, AnonymousClass9SJ r23, C200049gU r24, C195219Sy r25, AnonymousClass1YQ r26, C199359fB r27, AnonymousClass6VG r28, C196039Xk r29, C29131Vl r30, C19770wU r31, String str, String str2, String str3, String str4, String str5) {
        this.A03 = r13;
        this.A08 = r18;
        this.A00 = context;
        this.A01 = r11;
        this.A02 = r12;
        this.A0Q = r31;
        this.A0F = r23;
        this.A0P = r30;
        AnonymousClass1EU r1 = r22;
        this.A0D = r1;
        this.A0N = r29;
        C29121Vk r6 = r21;
        this.A0C = r6;
        this.A0K = r26;
        C29221Vu r5 = r20;
        this.A0B = r5;
        this.A0M = r28;
        C200049gU r7 = r24;
        this.A0H = r7;
        this.A0O = new C198799eD(r12, r13, r6);
        this.A0G = new AnonymousClass9SR(context, r11, r5, r6, r7, "PIN");
        this.A0R = str;
        this.A0A = C36441kJ.A0n(r12);
        this.A09 = userJid;
        this.A05 = r15;
        this.A06 = r16;
        this.A0U = str4;
        this.A0L = r27;
        this.A0S = str3;
        this.A0T = str2;
        this.A07 = r17;
        this.A04 = r14;
        this.A0E = r1;
        this.A0J = r25;
        this.A0V = str5;
    }
}
