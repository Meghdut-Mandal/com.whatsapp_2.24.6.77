package X;

import com.whatsapp.jid.GroupJid;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: X.6rW  reason: invalid class name and case insensitive filesystem */
public final class C144036rW implements C159397jI {
    public final C123745x1 A00;
    public final C1260762l A01;
    public final AnonymousClass17X A02;
    public final Collection A03;
    public final AnonymousClass040 A04;

    private final List A00() {
        GroupJid groupJid;
        C122395um A002 = C1260762l.A00(this.A00, this.A01, this.A04);
        if (A002 == null) {
            return C023409w.A00;
        }
        List list = A002.A02;
        ArrayList<C107265Nh> A0I = AnonymousClass001.A0I();
        for (Object next : list) {
            C107265Nh r2 = (C107265Nh) next;
            Collection collection = this.A03;
            GroupJid groupJid2 = r2.A0D;
            if (groupJid2 == null) {
                groupJid2 = null;
            }
            if (!C007103b.A0j(collection, groupJid2) && (groupJid = r2.A0D) != null && this.A02.A0C(groupJid)) {
                A0I.add(next);
            }
        }
        ArrayList A0I2 = AnonymousClass001.A0I();
        for (C107265Nh r0 : A0I) {
            GroupJid groupJid3 = r0.A0D;
            AnonymousClass00C.A0E(groupJid3, "null cannot be cast to non-null type com.whatsapp.jid.ChatJid");
            A0I2.add(groupJid3);
        }
        return A0I2;
    }

    public C144036rW(C123745x1 r1, C1260762l r2, AnonymousClass17X r3, Collection collection, AnonymousClass040 r5) {
        C36321k7.A0x(r2, r3);
        this.A01 = r2;
        this.A02 = r3;
        this.A04 = r5;
        this.A00 = r1;
        this.A03 = collection;
    }

    public C1278569x BOH() {
        return new C1278569x(this, C110315aT.A00(A00()));
    }

    public C1278569x BOI() {
        return new C1278569x(this, A00());
    }
}
