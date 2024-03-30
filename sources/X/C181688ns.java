package X;

import com.whatsapp.jid.GroupJid;

/* renamed from: X.8ns  reason: invalid class name and case insensitive filesystem */
public final class C181688ns extends C181748ny {
    public C181688ns(C64933Qa r7, long j) {
        super(r7, (C207209uj) null, 107, j);
    }

    public final void A1g(GroupJid groupJid, String str) {
        if (groupJid != null) {
            if (A1e(1).size() > 0) {
                C18740tg.A0D(false, "FMessageSystemParentGroupNameChanged/setNewParentInfo/parent info should only be set once");
            }
            this.A00.add(C195869Wj.A00(groupJid, str));
        }
    }
}
