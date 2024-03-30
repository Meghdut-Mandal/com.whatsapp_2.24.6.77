package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.2a4  reason: invalid class name */
public class AnonymousClass2a4 extends C39831tt {
    public final AnonymousClass16D A00;
    public final C18820ts A01;
    public final C24881Ed A02;
    public final AnonymousClass1FR A03;

    public AnonymousClass2a4(C21100yf r9, AnonymousClass16D r10, C19970wo r11, C18820ts r12, C20310xM r13, C24881Ed r14, C20810yC r15, C23075B3f b3f, AnonymousClass1FR r17, C29551Xb r18) {
        super(r9, r11, r13, r15, b3f, r18);
        this.A02 = r14;
        this.A03 = r17;
        this.A00 = r10;
        this.A01 = r12;
    }

    public String A0U(String str, String str2) {
        C18740tg.A06(str);
        return super.A0U(str, str2);
    }

    public void A0X(String str) {
        String str2;
        super.A0X(str);
        C202319lY A0L = this.A02.A0L((String) null, str, -1);
        if (A0L != null) {
            AnonymousClass35B r7 = new AnonymousClass35B(5);
            UserJid userJid = A0L.A0D;
            if (userJid == null || (str2 = this.A00.A0D(userJid).A0K()) == null) {
                str2 = "";
            }
            C18820ts r4 = this.A01;
            r7.A00 = new C605138d(this.A03.A0C(A0L), AnonymousClass1FR.A00(A0L), str2, AnonymousClass9Zb.A01(r4, A0L.A03(), A0L.A08, 0, true));
            this.A01.A0C(r7);
            C605138d r3 = r7.A00;
            C131606Ps r2 = this.A06;
            r2.A03("transaction_status", C203419nz.A03(A0L.A03, A0L.A02));
            r2.A03("transaction_status_name", C36401kF.A0o(r4.A00, r3.A00));
            r2.A03("merchant_name", r3.A02);
        }
    }
}
