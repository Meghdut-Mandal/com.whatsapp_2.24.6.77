package X;

import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.stickers.info.StickerInfoDialogFragment;

/* renamed from: X.3H7  reason: invalid class name */
public final class AnonymousClass3H7 {
    public AnonymousClass005 A00;
    public final C19730wQ A01;
    public final C220412q A02;
    public final AnonymousClass1A5 A03;
    public final C20810yC A04;
    public final C62443Ge A05;
    public final C74133l7 A06;
    public final C237819v A07;
    public final AnonymousClass17X A08;
    public final C20500xf A09;
    public final AnonymousClass3G3 A0A;
    public final AnonymousClass1EM A0B;

    public AnonymousClass3H7(C62443Ge r2, C19730wQ r3, C74133l7 r4, C237819v r5, C220412q r6, AnonymousClass1A5 r7, AnonymousClass17X r8, C20810yC r9, C20500xf r10, AnonymousClass3G3 r11, AnonymousClass1EM r12) {
        AnonymousClass00C.A0D(r9, 1);
        C36321k7.A1A(r3, r6, r10, r12, 2);
        C36321k7.A14(r8, r11, r7);
        AnonymousClass00C.A0D(r5, 11);
        this.A04 = r9;
        this.A01 = r3;
        this.A05 = r2;
        this.A02 = r6;
        this.A09 = r10;
        this.A0B = r12;
        this.A06 = r4;
        this.A08 = r8;
        this.A0A = r11;
        this.A03 = r7;
        this.A07 = r5;
    }

    public final boolean A01(AnonymousClass141 r7, AnonymousClass11F r8) {
        boolean A042;
        C44072La r1;
        C28981Uw r82;
        AnonymousClass00C.A0D(r7, 0);
        if (r8 == null || AnonymousClass3M3.A01(this.A09, r8)) {
            return true;
        }
        C20810yC r4 = this.A04;
        if (AnonymousClass3RR.A00(r4, r8)) {
            return true;
        }
        UserJid A0b = C36401kF.A0b(r8);
        C62443Ge r12 = this.A05;
        if (r12.A00(A0b) || r12.A01(A0b)) {
            return true;
        }
        if (r7.A0H instanceof C28981Uw) {
            C65073Qp A092 = this.A02.A09(r8, false);
            if (!(A092 instanceof C44072La) || (r1 = (C44072La) A092) == null || !r1.A0L()) {
                return true;
            }
            AnonymousClass3G3 r13 = this.A0A;
            C65313Ro r0 = C28981Uw.A03;
            if (r8 instanceof C28981Uw) {
                r82 = (C28981Uw) r8;
            } else {
                r82 = null;
            }
            A042 = r13.A01(r82);
        } else if (r7.A0E() && !C55942vR.A00(r4)) {
            return true;
        } else {
            if (r7.A0H instanceof C177618e5) {
                r4.A0E(5968);
            }
            if (C36421kH.A1Z(r4)) {
                C74133l7 r02 = this.A06;
                if (r02.A00.A0O(C36351kA.A0l(r7))) {
                    return true;
                }
            }
            if (!r7.A0G()) {
                return false;
            }
            GroupJid A0P = C36421kH.A0P(r7);
            if (A0P == null || !this.A08.A0C(A0P)) {
                return true;
            }
            A042 = this.A0B.A04(r7, A0P);
        }
        if (!A042) {
            return false;
        }
        return true;
    }

    public static boolean A00(StickerInfoDialogFragment stickerInfoDialogFragment) {
        AnonymousClass11F r1;
        AnonymousClass3H7 r3 = stickerInfoDialogFragment.A09;
        AnonymousClass11F r2 = stickerInfoDialogFragment.A0B;
        if (r2 == null) {
            return true;
        }
        C19730wQ r0 = r3.A01;
        r0.A0G();
        AnonymousClass142 r02 = r0.A0E;
        if (r02 != null) {
            r1 = r02.A0H;
        } else {
            r1 = null;
        }
        return r3.A01(r3.A03.A01(r2), r1);
    }
}
