package X;

import com.whatsapp.jid.PhoneUserJid;
import java.util.List;

/* renamed from: X.1Ff  reason: invalid class name and case insensitive filesystem */
public final class C25161Ff {
    public static final C18950u5 A05 = new C18950u5(1, 1);
    public final C19700wN A00;
    public final C19970wo A01;
    public final AnonymousClass17X A02;
    public final C20810yC A03;
    public final AnonymousClass1BS A04;

    public static boolean A00(String str) {
        if (str == null) {
            return false;
        }
        if (str.contains("express") || str.contains("express-optimistic")) {
            return true;
        }
        return false;
    }

    public boolean A01(AnonymousClass11F r6) {
        C222713q r0 = AnonymousClass11F.A00;
        AnonymousClass144 A002 = AnonymousClass6H4.A00(r6);
        C20810yC r3 = this.A03;
        C21000yV r2 = C21000yV.A01;
        int A003 = C20800yB.A00(r2, r3, 7654);
        if (A002 == null || A003 <= this.A02.A07.A0C(A002).A08.size() || !C20800yB.A01(r2, r3, 7568)) {
            return false;
        }
        return true;
    }

    public boolean A02(C25471Gl r10, boolean z) {
        AnonymousClass65F r0;
        String A032;
        C124815yq A0B = this.A04.A0B();
        if (A0B == null) {
            return false;
        }
        C20810yC r7 = this.A03;
        C19970wo r6 = this.A01;
        String str = r10.A02;
        List list = A0B.A0A;
        AnonymousClass65F A002 = C148396yn.A00("fallback", str, (String) null, list, z);
        if ((z || (((A032 = C148396yn.A03(r6, r7, (String) null, str, false)) == null || (r0 = C148396yn.A00("primary", str, A032, list, false)) == null) && (r0 = C148396yn.A00("primary", str, "0", list, false)) == null)) && (r0 = C148396yn.A00("primary", str, (String) null, list, z)) == null) {
            r0 = A002;
            if (A002 == null) {
                return false;
            }
        }
        if (r0.A0C) {
            return true;
        }
        return false;
    }

    public C25161Ff(C19700wN r1, C19970wo r2, AnonymousClass17X r3, C20810yC r4, AnonymousClass1BS r5) {
        this.A01 = r2;
        this.A00 = r1;
        this.A03 = r4;
        this.A04 = r5;
        this.A02 = r3;
    }

    public boolean A03(List list) {
        if (list.size() != 1) {
            return false;
        }
        AnonymousClass11F r1 = ((AnonymousClass3T1) list.get(0)).A1J.A00;
        if ((r1 instanceof PhoneUserJid) || A01(r1)) {
            return true;
        }
        return false;
    }
}
