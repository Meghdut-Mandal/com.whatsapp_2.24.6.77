package X;

import com.whatsapp.jid.UserJid;
import java.util.List;

/* renamed from: X.1vF  reason: invalid class name and case insensitive filesystem */
public final class C40281vF extends C06730Uv {
    public final List A00;
    public final List A01;

    public int A00() {
        return this.A00.size();
    }

    public int A01() {
        return this.A01.size();
    }

    public boolean A03(int i, int i2) {
        C48042gb r2 = (C48042gb) this.A01.get(i);
        C48042gb r1 = (C48042gb) this.A00.get(i2);
        if (!(r2 instanceof C48032ga) || !(r1 instanceof C48032ga)) {
            return false;
        }
        return C65543Sm.A00.A01((C48032ga) r2, (C48032ga) r1);
    }

    public boolean A04(int i, int i2) {
        UserJid userJid;
        C48042gb r1 = (C48042gb) this.A01.get(i);
        C48042gb r3 = (C48042gb) this.A00.get(i2);
        if (!(r1 instanceof C48032ga) || !(r3 instanceof C48032ga)) {
            return AnonymousClass00C.A0J(r1, r3);
        }
        C48032ga r12 = (C48032ga) r1;
        C48032ga r32 = (C48032ga) r3;
        C36321k7.A0w(r12, r32);
        C65663Sz A002 = r12.A00();
        UserJid userJid2 = null;
        if (A002 != null) {
            userJid = A002.A09;
        } else {
            userJid = null;
        }
        C65663Sz A003 = r32.A00();
        if (A003 != null) {
            userJid2 = A003.A09;
        }
        return AnonymousClass00C.A0J(userJid, userJid2);
    }

    public C40281vF(List list, List list2) {
        this.A01 = list;
        this.A00 = list2;
    }
}
