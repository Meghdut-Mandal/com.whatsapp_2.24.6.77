package X;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.8g4  reason: invalid class name */
public class AnonymousClass8g4 extends AnonymousClass5MM {
    public final Context A00;
    public final AnonymousClass17Y A01;
    public final C19730wQ A02;
    public final C19970wo A03;
    public final C29221Vu A04;
    public final C29121Vk A05;
    public final C194469Pv A06;
    public final C29131Vl A07;
    public final C19770wU A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final String A0F;

    public AnonymousClass8g4(Context context, AnonymousClass17Y r9, C19730wQ r10, C19600wD r11, C19970wo r12, C29221Vu r13, C24601Db r14, C29121Vk r15, C194469Pv r16, C29131Vl r17, C117705mh r18, C111495cN r19, C19770wU r20, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        super(r11, r14, r15, r18, r19);
        this.A00 = context;
        this.A03 = r12;
        this.A01 = r9;
        this.A02 = r10;
        this.A08 = r20;
        this.A07 = r17;
        this.A05 = r15;
        this.A04 = r13;
        this.A0D = str;
        this.A0C = str2;
        this.A0B = str3;
        this.A0A = str4;
        this.A09 = str5;
        this.A0E = str6;
        this.A0F = str7;
        this.A06 = r16;
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        AnonymousClass1AL r4;
        AnonymousClass00I r15 = (AnonymousClass00I) obj;
        String str = (String) r15.A00;
        C202059ky r2 = (C202059ky) r15.A01;
        if (str != null) {
            ArrayList A0I = AnonymousClass001.A0I();
            C36381kD.A1M("action", "br-prelink-merchant", A0I);
            String str2 = this.A0D;
            if ("PREPAID".equals(str2)) {
                C18740tg.A05(str);
                r4 = new AnonymousClass1AL("card-token", str);
            } else if ("BANK".equals(str2)) {
                C18740tg.A05(str);
                C36381kD.A1M("bank-token", str, A0I);
                String str3 = this.A0B;
                C18740tg.A05(str3);
                C36381kD.A1M("bank-code", str3, A0I);
                String str4 = this.A0A;
                C18740tg.A05(str4);
                C36381kD.A1M("bank-branch", str4, A0I);
                String str5 = this.A09;
                C18740tg.A05(str5);
                r4 = new AnonymousClass1AL("bank-account-type", str5);
            } else {
                throw AnonymousClass001.A09("Expecting card token or bank account!");
            }
            A0I.add(r4);
            C36381kD.A1M("device-id", this.A07.A01(), A0I);
            C36381kD.A1M("nonce", C237919w.A00(this.A02, this.A03), A0I);
            C36381kD.A1M("verify-type", str2, A0I);
            C36381kD.A1M("verify-id", this.A0C, A0I);
            this.A05.A0H(new B7H(this.A00, this.A04, this.A01, this, 5), C203399nx.A06(A0I), "set", AnonymousClass6X5.A0L);
            return;
        }
        C36321k7.A1J(r2, "PAY: BrazilMerchantPreLinkAction token error: ", AnonymousClass000.A0u());
        this.A06.A00(r2, (AnonymousClass9NH) null);
    }

    public List A0G() {
        String str;
        String str2;
        ArrayList A0I = AnonymousClass001.A0I();
        String str3 = this.A0D;
        if ("BANK".equals(str3)) {
            str = this.A0E;
            str2 = "bank_account_number";
        } else {
            if ("PREPAID".equals(str3)) {
                str = this.A0F;
                str2 = "creditCardNumber";
            }
            return A0I;
        }
        C36341k9.A1H(str2, str, A0I);
        return A0I;
    }
}
