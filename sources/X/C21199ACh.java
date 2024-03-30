package X;

import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.UserJid;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* renamed from: X.ACh  reason: case insensitive filesystem */
public final class C21199ACh implements B6C, B15 {
    public final C30681ab A00;

    public Set BCE() {
        return AnonymousClass02N.A03(AnonymousClass91I.A1C, AnonymousClass91I.A1B, AnonymousClass91I.A1A, AnonymousClass91I.A19, AnonymousClass91I.A2s, AnonymousClass91I.A2t);
    }

    public AnonymousClass3T1 BlF(C1275768v r31, AnonymousClass8SU r32) {
        boolean z;
        AnonymousClass8SU r0 = r32;
        AnonymousClass5J5 r9 = new AnonymousClass5J5(this.A00.A02(r0), C30681ab.A00(r0));
        if ((r0.bitField0_ & 16) != 0) {
            C165577te.A17(UserJid.Companion, r9, r0.participant_);
        }
        AnonymousClass91I A0u = r0.A0u();
        switch (A0u.ordinal()) {
            case 40:
            case 45:
            case 169:
                z = false;
                break;
            case 41:
            case 46:
            case 170:
                z = true;
                break;
            default:
                StringBuilder A0u2 = AnonymousClass000.A0u();
                A0u2.append("Unexpected missed stub type ");
                throw C165617ti.A0S(0, AnonymousClass000.A0q(A0u.name(), A0u2));
        }
        C64933Qa r4 = r9.A1J;
        AnonymousClass11F r3 = r4.A00;
        UserJid A0b = C36401kF.A0b(r3);
        if (A0b == null) {
            C36321k7.A1J(r3, "CallLog/fromFMessage Legacy bad UserJid: ", AnonymousClass000.A0u());
            return r9;
        }
        C135006by r10 = new C135006by(-1, A0b, r4.A01, r4.A02);
        long j = r9.A0I;
        C108555Tz r11 = C108555Tz.NONE;
        List emptyList = Collections.emptyList();
        C223113u r5 = DeviceJid.Companion;
        C107265Nh r52 = new C107265Nh((C63083Ir) null, A0b.getPrimaryDevice(), (GroupJid) null, r9, r10, r11, (AnonymousClass5Ng) null, (AnonymousClass661) null, (String) null, emptyList, 0, 2, 0, 0, -1, j, 0, z, true, true, false);
        AnonymousClass91I A0u3 = r0.A0u();
        if (A0u3 == AnonymousClass91I.A2s || A0u3 == AnonymousClass91I.A2t) {
            r52.A0H(2);
        }
        List singletonList = Collections.singletonList(r52);
        List list = r9.A00;
        list.clear();
        list.addAll(singletonList);
        Collections.sort(list, AnonymousClass76D.A00);
        return r9;
    }

    public C21199ACh(C30681ab r1) {
        this.A00 = r1;
    }

    public void B22(AnonymousClass6CO r6, AnonymousClass8NK r7, AnonymousClass3T1 r8) {
        AnonymousClass5J5 r4;
        AnonymousClass91I r0;
        C36321k7.A0w(r8, r7);
        if (!(r8 instanceof AnonymousClass5J5) || (r4 = (AnonymousClass5J5) r8) == null) {
            Integer A0d = C165597tg.A0d();
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("Invalid message class: ");
            throw new C25311Fu(A0d, AnonymousClass000.A0q(C36441kJ.A1A(r8.getClass()).BHa(), A0u));
        }
        List list = r4.A00;
        boolean z = false;
        if (!list.isEmpty() && ((C107265Nh) list.get(0)).A0O()) {
            z = true;
        }
        int A1X = r4.A1X();
        if (z) {
            if (A1X == 0 || (A1X != 1 && A1X == 2)) {
                r0 = AnonymousClass91I.A2s;
            } else {
                r0 = AnonymousClass91I.A2t;
            }
        } else if (A1X == 0) {
            r0 = AnonymousClass91I.A1C;
        } else if (A1X == 1) {
            r0 = AnonymousClass91I.A1B;
        } else if (A1X != 2) {
            r0 = AnonymousClass91I.A19;
        } else {
            r0 = AnonymousClass91I.A1A;
        }
        r7.A0X(r0);
    }

    public C188108z3 BCR() {
        return C188108z3.STUB_MESSAGE;
    }
}
