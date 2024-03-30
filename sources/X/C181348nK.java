package X;

import com.whatsapp.jid.GroupJid;
import java.util.List;

/* renamed from: X.8nK  reason: invalid class name and case insensitive filesystem */
public abstract class C181348nK extends C181738nx {
    public int A00 = 6;

    public final void A1i(GroupJid groupJid, String str, int i) {
        if (groupJid != null) {
            List list = this.A00;
            AnonymousClass00C.A08(list);
            AnonymousClass03Y.A0E(list, C22535AoH.A00, true);
            list.add(new C195869Wj(groupJid, str, 2, i));
        }
    }

    public C181348nK(C64933Qa r2, int i, long j) {
        super(r2, i, j);
    }

    public C181348nK(C207209uj r2, int i, long j) {
        super(r2, i, j);
    }
}
