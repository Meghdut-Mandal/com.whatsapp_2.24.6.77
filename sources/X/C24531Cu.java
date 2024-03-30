package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.1Cu  reason: invalid class name and case insensitive filesystem */
public class C24531Cu {
    public final AnonymousClass1C7 A00;
    public final AnonymousClass163 A01;
    public final C220412q A02;
    public final C220612s A03;
    public final AnonymousClass1A1 A04;

    public C181248nA A00(UserJid userJid) {
        C65073Qp A09 = this.A02.A09(userJid, false);
        if (A09 == null) {
            return null;
        }
        long j = A09.A0C;
        if (j == -1) {
            return null;
        }
        AnonymousClass3T1 A012 = this.A04.A01.A01(j);
        if (!(A012 instanceof AnonymousClass2bI) || ((AnonymousClass2bI) A012).A00 != 28) {
            return null;
        }
        return (C181248nA) A012;
    }

    public void A01(UserJid userJid, AnonymousClass2bI r6) {
        C65073Qp A09 = this.A02.A09(userJid, false);
        if (A09 != null) {
            this.A00.A01(new C35631j0(this, A09, r6, 4), 18);
        }
    }

    public C24531Cu(AnonymousClass1C7 r1, AnonymousClass163 r2, C220412q r3, C220612s r4, AnonymousClass1A1 r5) {
        this.A01 = r2;
        this.A02 = r3;
        this.A04 = r5;
        this.A00 = r1;
        this.A03 = r4;
    }
}
