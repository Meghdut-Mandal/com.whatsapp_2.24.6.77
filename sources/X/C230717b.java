package X;

import com.whatsapp.jid.GroupJid;

/* renamed from: X.17b  reason: invalid class name and case insensitive filesystem */
public final class C230717b {
    public final C19700wN A00;
    public final AnonymousClass16D A01;
    public final AnonymousClass12O A02;
    public final C21010yW A03;
    public final AnonymousClass164 A04;
    public final C220412q A05;
    public final C20810yC A06;

    public C230717b(C19700wN r2, AnonymousClass164 r3, AnonymousClass16D r4, C220412q r5, AnonymousClass12O r6, C20810yC r7, C21010yW r8) {
        AnonymousClass00C.A0D(r7, 1);
        AnonymousClass00C.A0D(r2, 2);
        AnonymousClass00C.A0D(r5, 3);
        AnonymousClass00C.A0D(r8, 4);
        AnonymousClass00C.A0D(r3, 5);
        AnonymousClass00C.A0D(r4, 6);
        AnonymousClass00C.A0D(r6, 7);
        this.A06 = r7;
        this.A00 = r2;
        this.A05 = r5;
        this.A03 = r8;
        this.A04 = r3;
        this.A01 = r4;
        this.A02 = r6;
    }

    public static final boolean A00(C230717b r4, GroupJid groupJid, String str) {
        int A012;
        String str2;
        if (groupJid == null) {
            return false;
        }
        if (!C20800yB.A01(C21000yV.A02, r4.A06, 3688) || 1 == (A012 = r4.A01(groupJid)) || 2 == A012) {
            return false;
        }
        AnonymousClass141 A0A = r4.A01.A0A(groupJid);
        if (A0A != null) {
            str2 = A0A.A0M;
        } else {
            str2 = "pn";
        }
        if (AnonymousClass00C.A0J(str2, str)) {
            return false;
        }
        r4.A04.A01(new C156777ag(groupJid.getRawString()));
        return true;
    }

    public final int A01(AnonymousClass144 r5) {
        AnonymousClass00C.A0D(r5, 0);
        int i = 3;
        if (r5 instanceof C177538dx) {
            AnonymousClass141 A08 = this.A01.A08(r5);
            if (A08 == null || !AnonymousClass00C.A0J(A08.A0M, "lid")) {
                return 0;
            }
        } else {
            AnonymousClass16D r2 = this.A01;
            AnonymousClass141 A0A = r2.A0A(r5);
            if (A0A != null && "lid".equals(A0A.A0M)) {
                return 3;
            }
            if (A02(r5)) {
                return 2;
            }
            AnonymousClass141 A0A2 = r2.A0A(r5);
            if (A0A2 == null) {
                return 0;
            }
            i = 1;
            if (!A0A2.A0j) {
                return 0;
            }
        }
        return i;
    }

    public final boolean A02(AnonymousClass144 r3) {
        AnonymousClass00C.A0D(r3, 0);
        AnonymousClass141 A0A = this.A01.A0A(r3);
        if (A0A == null || !A0A.A0j || !this.A05.A0P(r3)) {
            return false;
        }
        return true;
    }
}
