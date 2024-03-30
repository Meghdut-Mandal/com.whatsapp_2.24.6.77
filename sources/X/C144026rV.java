package X;

import com.whatsapp.jid.GroupJid;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.6rV  reason: invalid class name and case insensitive filesystem */
public final class C144026rV implements C159397jI {
    public final C123745x1 A00;
    public final C130896Mv A01;
    public final AnonymousClass17X A02;
    public final C24541Cv A03;
    public final Collection A04;

    public C144026rV(C123745x1 r1, C130896Mv r2, AnonymousClass17X r3, C24541Cv r4, Collection collection) {
        C36321k7.A11(r3, r4, r2);
        this.A02 = r3;
        this.A03 = r4;
        this.A01 = r2;
        this.A00 = r1;
        this.A04 = collection;
    }

    private final ArrayList A00() {
        AnonymousClass3T1 A06;
        ArrayList A0I = AnonymousClass001.A0I();
        Iterator A13 = C90514aH.A13(this.A01.A02.getValue());
        while (A13.hasNext()) {
            AnonymousClass6X6 r4 = (AnonymousClass6X6) A13.next();
            Collection collection = this.A04;
            AnonymousClass144 r6 = r4.A05;
            if (!collection.contains(r6)) {
                AnonymousClass17X r1 = this.A02;
                AnonymousClass00C.A0E(r6, "null cannot be cast to non-null type com.whatsapp.jid.GroupJid");
                if (r1.A0C((GroupJid) r6)) {
                    C123745x1 r5 = this.A00;
                    C24541Cv r3 = this.A03;
                    if (r4.A08.size() <= 32 && (A06 = r3.A06(r6, true)) != null && A06.A0I >= r5.A02) {
                        AnonymousClass00C.A0E(r6, "null cannot be cast to non-null type com.whatsapp.jid.ChatJid");
                        A0I.add(r6);
                    }
                }
            }
        }
        return A0I;
    }

    public C1278569x BOH() {
        return new C1278569x(this, C110315aT.A00(A00()));
    }

    public C1278569x BOI() {
        return new C1278569x(this, A00());
    }
}
