package X;

import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* renamed from: X.6rY  reason: invalid class name and case insensitive filesystem */
public final class C144056rY implements C159397jI {
    public final C123745x1 A00;
    public final C1260762l A01;
    public final C130896Mv A02;
    public final AnonymousClass16D A03;
    public final Collection A04;
    public final AnonymousClass040 A05;

    private final List A00() {
        C1260762l r0 = this.A01;
        AnonymousClass040 r8 = this.A05;
        C123745x1 r7 = this.A00;
        C122395um A002 = C1260762l.A00(r7, r0, r8);
        if (A002 == null) {
            return C023409w.A00;
        }
        ArrayList A0I = AnonymousClass001.A0I();
        for (C107265Nh r4 : A002.A02) {
            C130896Mv r5 = this.A02;
            AnonymousClass00C.A0D(r4, 0);
            LinkedHashSet A17 = C36441kJ.A17();
            Iterator A003 = C107265Nh.A00(r4);
            while (A003.hasNext()) {
                UserJid userJid = ((C107255Nf) A003.next()).A00;
                if (r4.A0T(userJid)) {
                    AnonymousClass00C.A07(userJid);
                    A17.add(userJid);
                }
            }
            AnonymousClass16D r02 = this.A03;
            Collection collection = this.A04;
            ArrayList A004 = AnonymousClass6Gx.A00(r02, collection, A17);
            if (r7.A04.contains(C108295Sy.LGC_MEMBERS) && A004.size() > 1) {
                AnonymousClass03X.A08(A004, new AnonymousClass75Z(r7, r5, collection, r8));
            }
            A0I.addAll(A004);
        }
        return A0I;
    }

    public C144056rY(C123745x1 r1, C1260762l r2, C130896Mv r3, AnonymousClass16D r4, Collection collection, AnonymousClass040 r6) {
        C36321k7.A11(r4, r2, r3);
        this.A03 = r4;
        this.A01 = r2;
        this.A02 = r3;
        this.A05 = r6;
        this.A00 = r1;
        this.A04 = collection;
    }

    public C1278569x BOH() {
        return new C1278569x(this, C110315aT.A00(A00()));
    }

    public C1278569x BOI() {
        return new C1278569x(this, A00());
    }
}
