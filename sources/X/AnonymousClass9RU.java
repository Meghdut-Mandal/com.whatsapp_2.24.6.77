package X;

import android.text.TextUtils;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.9RU  reason: invalid class name */
public class AnonymousClass9RU {
    public final AnonymousClass8gI A00;
    public final AnonymousClass9FL A01;
    public final Runnable A02;

    public AnonymousClass9RU(AnonymousClass8gI r1, AnonymousClass9FL r2, Runnable runnable) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = runnable;
    }

    public void A00(AnonymousClass16X r24, C207249un r25, UserJid userJid, C135086c7 r27, C175928bI r28, C199359fB r29, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, List list, long j, boolean z, boolean z2, boolean z3, boolean z4) {
        String str10;
        if (z3) {
            this.A02.run();
            return;
        }
        C175928bI r0 = r28;
        if (z4) {
            str10 = (String) C165577te.A0g(r0.A0C);
        } else {
            str10 = null;
        }
        AnonymousClass8gI r14 = this.A00;
        String str11 = r25.A0A;
        AnonymousClass9FL r7 = this.A01;
        String str12 = r0.A0Q;
        String str13 = r0.A0R;
        String str14 = r0.A0O;
        String str15 = r0.A0P;
        String str16 = r0.A0S;
        String str17 = r0.A0M;
        String str18 = r0.A0N;
        ArrayList A0I = AnonymousClass001.A0I();
        C36381kD.A1M("sender-vpa", str12, A0I);
        if (!TextUtils.isEmpty(str13)) {
            C36381kD.A1M("sender-vpa-id", str13, A0I);
        }
        if (!TextUtils.isEmpty(str14)) {
            C18740tg.A06(str14);
            C36381kD.A1M("receiver-vpa", str14, A0I);
        }
        if (!TextUtils.isEmpty(str15)) {
            C36381kD.A1M("receiver-vpa-id", str15, A0I);
        }
        if (!TextUtils.isEmpty(str10)) {
            C36381kD.A1M("upi-bank-info", str10, A0I);
        }
        C36381kD.A1M("seq-no", str16, A0I);
        if (!TextUtils.isEmpty(str17)) {
            C36381kD.A1M("mcc", str17, A0I);
        }
        String str19 = str3;
        if (!TextUtils.isEmpty(str19)) {
            C36381kD.A1M("ref-id", str19, A0I);
        }
        if (!TextUtils.isEmpty((CharSequence) null)) {
            C36381kD.A1M("ref-url", (String) null, A0I);
        }
        C135086c7 r8 = r27;
        String str20 = str2;
        if (!C202349ld.A02(r8)) {
            Object obj = r8.A00;
            C18740tg.A06(obj);
            String str21 = (String) obj;
            C36381kD.A1M("payee-name", str21, A0I);
            if (!TextUtils.isEmpty(str20) && r14.A06.A0E(1918)) {
                C18740tg.A06(obj);
                C36381kD.A1M("receiver-name", str21, A0I);
                C36381kD.A1M("receiver-vpa-token", str20, A0I);
            }
        }
        if (!TextUtils.isEmpty((CharSequence) null)) {
            C36381kD.A1M("mode", (String) null, A0I);
        }
        if (!TextUtils.isEmpty(str18)) {
            C36381kD.A1M("purpose-code", str18, A0I);
        }
        String str22 = str8;
        if (!TextUtils.isEmpty(str22)) {
            C36381kD.A1M("note", str22, A0I);
        }
        C20810yC r2 = r14.A06;
        if (r2.A0E(1918)) {
            if (!TextUtils.isEmpty(str20)) {
                C36381kD.A1M("merchant-token", str20, A0I);
            }
            String str23 = "1";
            String str24 = "0";
            if (z) {
                str24 = str23;
            }
            C36381kD.A1M("merchant", str24, A0I);
            if (!z2) {
                str23 = "0";
            }
            C36381kD.A1M("verified-merchant", str23, A0I);
        }
        String str25 = str9;
        if (!TextUtils.isEmpty(str25)) {
            C36381kD.A1M("international-pay-detail", str25, A0I);
        }
        String str26 = str4;
        if (!TextUtils.isEmpty(str26)) {
            C36381kD.A1M("business_order_id", str26, A0I);
        }
        C203399nx r82 = null;
        if (!TextUtils.isEmpty(str19)) {
            String str27 = str7;
            if (!TextUtils.isEmpty(str27)) {
                ArrayList A0I2 = AnonymousClass001.A0I();
                C36381kD.A1M("order-id", str19, A0I2);
                C36381kD.A1M("payment-config-id", str27, A0I2);
                String str28 = str5;
                if (!TextUtils.isEmpty(str28) && r2.A0E(1599)) {
                    C36381kD.A1M("discount-program-name", str28, A0I2);
                }
                long j2 = j;
                if (j != 0) {
                    C165597tg.A1I("expiry-ts", A0I2, j2);
                }
                String str29 = str6;
                if (r2.A0E(1330) && !TextUtils.isEmpty(str29)) {
                    C36381kD.A1M("order-type", str29, A0I2);
                }
                if ("physical-goods".equals(str29) && r2.A0E(3012) && list != null) {
                    ArrayList A0r = C36361kB.A0r(list);
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        C206319t7 r83 = (C206319t7) it.next();
                        ArrayList A0I3 = AnonymousClass001.A0I();
                        C36381kD.A1M(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, r83.A04, A0I3);
                        C36381kD.A1M("address_line1", r83.A00, A0I3);
                        String str30 = r83.A01;
                        if (!TextUtils.isEmpty(str30)) {
                            C36381kD.A1M("address_line2", str30, A0I3);
                        }
                        String str31 = r83.A02;
                        if (!TextUtils.isEmpty(str31)) {
                            C36381kD.A1M("city", str31, A0I3);
                        }
                        String str32 = r83.A06;
                        if (!TextUtils.isEmpty(str32)) {
                            C36381kD.A1M("state", str32, A0I3);
                        }
                        C36381kD.A1M("country", r83.A03, A0I3);
                        C36381kD.A1M("postal_code", r83.A05, A0I3);
                        C203399nx.A0E("beneficiary", A0r, C165577te.A1a(A0I3, 0));
                    }
                    r82 = C203399nx.A05("beneficiaries", (AnonymousClass1AL[]) null, C165577te.A1b(A0r, 0));
                }
                r82 = new C203399nx(r82, "order", C165577te.A1a(A0I2, 0));
            }
        }
        AnonymousClass9FL r18 = r7;
        r14.A0E.Boy(new AW0(r14, userJid, r24, r29, r18, new C203399nx(r82, "upi", C165577te.A1a(A0I, 0)), str11, str, 0));
    }
}
