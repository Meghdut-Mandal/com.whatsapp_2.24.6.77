package X;

import android.view.View;
import java.util.Collection;

/* renamed from: X.9g8  reason: invalid class name and case insensitive filesystem */
public final class C199859g8 {
    public final C19700wN A00;
    public final AnonymousClass005 A01;
    public final AnonymousClass00T A02;
    public final C20810yC A03;

    public final boolean A02(AnonymousClass3T1 r4) {
        AnonymousClass00C.A0D(r4, 0);
        Object obj = this.A01.get();
        AnonymousClass00C.A08(obj);
        Iterable<C88544Tc> iterable = (Iterable) obj;
        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
            for (C88544Tc BN1 : iterable) {
                if (!BN1.BN1(r4)) {
                    return false;
                }
            }
        }
        if (A00(r4, this)) {
            return true;
        }
        return false;
    }

    public final boolean A03(AnonymousClass3T1 r4) {
        AnonymousClass00C.A0D(r4, 0);
        if (!C20800yB.A01(C21000yV.A01, this.A03, 4072) || !((AnonymousClass9XG) this.A02.getValue()).A02(r4.A1I)) {
            return false;
        }
        return true;
    }

    public static final boolean A00(AnonymousClass3T1 r4, C199859g8 r5) {
        AnonymousClass00T r3 = r5.A02;
        int i = r4.A1I;
        if (!((AnonymousClass9XG) r3.getValue()).A02(i) || !((B6D) ((AnonymousClass9XG) r3.getValue()).A00(i)).BN1(r4)) {
            return false;
        }
        return true;
    }

    public C199859g8(C19700wN r2, C20810yC r3, AnonymousClass17B r4, AnonymousClass005 r5) {
        C36321k7.A18(r4, r3, r2, r5);
        this.A03 = r3;
        this.A00 = r2;
        this.A01 = r5;
        this.A02 = C36431kI.A1I(new C22200AiN(r4));
    }

    public final void A01(View view, C201709k9 r6, AnonymousClass3T1 r7, AnonymousClass3JO r8) {
        int i;
        C19700wN r3;
        String valueOf;
        boolean z;
        String str;
        C36321k7.A0w(r7, view);
        AnonymousClass00C.A0D(r6, 3);
        if (!A03(r7)) {
            int i2 = r7.A1I;
            r3 = this.A00;
            valueOf = String.valueOf(i2);
            z = false;
            str = "reply-subsytem-render-unexpected";
        } else {
            int i3 = r7.A1I;
            B6D b6d = (B6D) ((AnonymousClass9XG) this.A02.getValue()).A00(i3);
            if (!b6d.BN0(r7)) {
                r3 = this.A00;
                valueOf = String.valueOf(i3);
                z = false;
                str = "reply-subsytem-render-not-supported";
            } else {
                r6.A04(view);
                C202319lY r32 = r7.A0M;
                if (r32 == null || C203419nz.A06(r32) || (i = r32.A03) == 5 || i == 1000 || r32.A01 == 4) {
                    b6d.Bo9(view, r6, r7, r8);
                } else {
                    r6.A0C(view, r7);
                }
                b6d.Bo8(view, r6, r7, r8);
                CharSequence BGP = b6d.BGP(C36371kC.A0B(view), AnonymousClass96O.A00(view).A09.getPaint(), r7);
                if (BGP != null) {
                    r6.A0H(view, r8, BGP);
                    return;
                }
                return;
            }
        }
        r3.A0E(str, valueOf, z);
    }
}
