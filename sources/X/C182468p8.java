package X;

import com.whatsapp.jid.UserJid;
import java.util.Set;

/* renamed from: X.8p8  reason: invalid class name and case insensitive filesystem */
public final class C182468p8 extends C21198ACg {
    public final C19700wN A00;
    public final C30681ab A01;

    public C182468p8(C19700wN r2, C30681ab r3) {
        AnonymousClass00C.A0D(r2, 1);
        this.A00 = r2;
        this.A01 = r3;
    }

    public void B22(AnonymousClass6CO r4, AnonymousClass8NK r5, AnonymousClass3T1 r6) {
        AnonymousClass2c8 r2;
        String rawString;
        AnonymousClass00C.A0D(r6, 0);
        C36321k7.A0x(r5, r4);
        if (!(r6 instanceof AnonymousClass2c8) || (r2 = (AnonymousClass2c8) r6) == null) {
            throw C165567td.A0K(0);
        }
        super.B22(r4, r5, r6);
        r5.A0X(AnonymousClass91I.A01);
        String str = r2.A01;
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        r5.A0Y(str);
        UserJid userJid = r2.A00;
        if (!(userJid == null || (rawString = userJid.getRawString()) == null)) {
            str2 = rawString;
        }
        r5.A0Y(str2);
    }

    public AnonymousClass3T1 BlF(C1275768v r7, AnonymousClass8SU r8) {
        AnonymousClass91I A0u = r8.A0u();
        if (A0u == AnonymousClass91I.A01) {
            AnonymousClass2c8 r4 = new AnonymousClass2c8(this.A01.A02(r8), C30681ab.A00(r8));
            r4.A0n(5);
            r4.A0H = r4.A0I;
            r4.A00 = r8.revokeMessageTimestamp_;
            if (C170918Hz.A00(r8) > 1) {
                String A0s = C36401kF.A0s(r8.messageStubParameters_, 0);
                AnonymousClass00C.A0B(A0s);
                if (A0s.length() > 0) {
                    r4.A01 = A0s;
                }
                UserJid A0l = C36431kI.A0l(C36401kF.A0s(r8.messageStubParameters_, 1));
                if (A0l != null) {
                    r4.A00 = A0l;
                } else {
                    C19700wN r2 = this.A00;
                    StringBuilder A0u2 = AnonymousClass000.A0u();
                    A0u2.append("build=");
                    r2.A0E("FMessageAdminRevokedHistorySync/nullAdminJid", AnonymousClass000.A0q("release", A0u2), true);
                    return r4;
                }
            }
            return r4;
        }
        throw C165617ti.A0S(0, AnonymousClass000.A0l(A0u, "Unexpected stub type: ", AnonymousClass000.A0u()));
    }

    public Set BCE() {
        return C36411kG.A15(AnonymousClass91I.A01);
    }
}
