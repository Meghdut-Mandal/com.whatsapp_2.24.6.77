package X;

import com.whatsapp.jid.GroupJid;
import java.util.List;

/* renamed from: X.8nL  reason: invalid class name and case insensitive filesystem */
public final class C181358nL extends C181738nx {
    public int A00 = 2;
    public String A01;

    public C181358nL(C64933Qa r2, long j) {
        super(r2, 143, j);
    }

    public final void A1i(GroupJid groupJid, Boolean bool, String str) {
        if (groupJid != null) {
            List list = this.A00;
            AnonymousClass00C.A08(list);
            AnonymousClass03Y.A0E(list, C22534AoG.A00, true);
            int i = 1;
            if (C36371kC.A1X(bool, true)) {
                i = 2;
            } else if (!C36371kC.A1X(bool, false)) {
                i = 0;
            }
            list.add(new C195869Wj(groupJid, str, 2, i));
        }
    }

    public C181358nL(C207209uj r2, long j) {
        super(r2, 143, j);
    }
}
