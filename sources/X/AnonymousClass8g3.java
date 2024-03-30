package X;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.8g3  reason: invalid class name */
public class AnonymousClass8g3 extends AnonymousClass5MM {
    public final int A00;
    public final Context A01;
    public final AnonymousClass17Y A02;
    public final AnonymousClass16T A03;
    public final C29221Vu A04;
    public final C29121Vk A05;
    public final AnonymousClass1EU A06;
    public final C194479Pw A07;
    public final C29131Vl A08;
    public final C19770wU A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;

    public AnonymousClass8g3(Context context, AnonymousClass17Y r9, C19600wD r10, AnonymousClass16T r11, C29221Vu r12, C24601Db r13, C29121Vk r14, AnonymousClass1EU r15, C194479Pw r16, C29131Vl r17, C117705mh r18, C111495cN r19, C19770wU r20, String str, String str2, String str3, String str4, int i) {
        super(r10, r13, r14, r18, r19);
        this.A01 = context;
        this.A02 = r9;
        this.A09 = r20;
        this.A08 = r17;
        this.A06 = r15;
        this.A05 = r14;
        this.A03 = r11;
        this.A04 = r12;
        this.A0D = str;
        this.A0B = str2;
        this.A0A = str3;
        this.A00 = i;
        this.A0C = str4;
        this.A07 = r16;
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        AnonymousClass00I r14 = (AnonymousClass00I) obj;
        String str = (String) r14.A00;
        C202059ky r2 = (C202059ky) r14.A01;
        if (str == null) {
            C36321k7.A1J(r2, "PAY: BrazilUpdateMerchantAccountAction token error: ", AnonymousClass000.A0u());
            this.A07.A00(r2);
            return;
        }
        C29121Vk r7 = this.A05;
        AnonymousClass1AL[] r3 = new AnonymousClass1AL[7];
        C36341k9.A1L("action", "br-update-merchant-account", r3, 0);
        C36341k9.A1L("bank-token", str, r3, 1);
        C36341k9.A1L("bank-code", this.A0B, r3, 2);
        C36341k9.A1L("bank-branch", this.A0A, r3, 3);
        C36341k9.A1L("bank-account-type", String.valueOf(this.A00), r3, 4);
        C36341k9.A1L("device-id", this.A08.A01(), r3, 5);
        C36341k9.A1L("nonce", this.A0C, r3, 6);
        r7.A0H(new B7H(this.A01, this.A04, this.A02, this, 7), C203399nx.A04("account", r3), "set", AnonymousClass6X5.A0L);
    }

    public List A0G() {
        ArrayList A0I = AnonymousClass001.A0I();
        C36341k9.A1H("bank_account_number", this.A0D, A0I);
        return A0I;
    }
}
