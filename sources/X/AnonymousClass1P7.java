package X;

import com.whatsapp.jid.PhoneUserJid;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: X.1P7  reason: invalid class name */
public final class AnonymousClass1P7 {
    public final AnonymousClass12O A00;
    public final C20810yC A01;
    public final AnonymousClass1P9 A02;

    public AnonymousClass1P7(AnonymousClass12O r2, C20810yC r3, AnonymousClass1P9 r4) {
        AnonymousClass00C.A0D(r3, 1);
        AnonymousClass00C.A0D(r2, 2);
        AnonymousClass00C.A0D(r4, 3);
        this.A01 = r3;
        this.A00 = r2;
        this.A02 = r4;
    }

    public static final boolean A00(AnonymousClass1P7 r2) {
        HashSet A04 = r2.A02.A04();
        if (!(A04 instanceof Collection) || !A04.isEmpty()) {
            Iterator it = A04.iterator();
            while (it.hasNext()) {
                if (it.next() instanceof PhoneUserJid) {
                    return true;
                }
            }
        }
        return false;
    }

    public final String A01() {
        if (!C20800yB.A01(C21000yV.A02, this.A01, 4718)) {
            return null;
        }
        if (A00(this)) {
            return "pn";
        }
        return "lid";
    }
}
