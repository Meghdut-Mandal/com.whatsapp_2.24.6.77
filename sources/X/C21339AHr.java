package X;

import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.Jid;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.AHr  reason: case insensitive filesystem */
public final class C21339AHr implements C236119d {
    public final C191769Eg A00;

    public C21339AHr(C191769Eg r2) {
        AnonymousClass00C.A0D(r2, 1);
        this.A00 = r2;
    }

    public void BiM(C203399nx r7, String str) {
        C225314u r3;
        Runnable runnable;
        C203399nx A0c;
        List A0j;
        AnonymousClass00C.A0D(r7, 1);
        if (r7.A0X(AnonymousClass147.class, "from") == null || (A0c = r7.A0c("unlink")) == null || (A0j = A0c.A0j("group")) == null || A0j.isEmpty()) {
            C201239j8 r1 = this.A00.A00;
            r3 = r1.A00;
            if (r3 != null) {
                runnable = new C81283wl((Object) r1, -3, 37);
            } else {
                return;
            }
        } else {
            HashSet A16 = C36441kJ.A16();
            Iterator it = A0j.iterator();
            while (it.hasNext()) {
                C203399nx A0s = C36431kI.A0s(it);
                Jid A0X = A0s.A0X(GroupJid.class, "jid");
                if (A0X != null) {
                    A16.add(C36341k9.A0I(A0X, A0s.A0S("error", -1)));
                }
            }
            C201239j8 r12 = this.A00.A00;
            r3 = r12.A00;
            if (r3 != null) {
                runnable = new C80293vA(r12, A16, 6);
            } else {
                return;
            }
        }
        r3.runOnUiThread(runnable);
    }

    public void BVN(String str) {
        C201239j8 r3 = this.A00.A00;
        C225314u r2 = r3.A00;
        if (r2 != null) {
            r2.runOnUiThread(new C80253v6(r3, 10));
        }
    }

    public void BWw(C203399nx r6, String str) {
        int A05 = C165597tg.A05(r6);
        C201239j8 r3 = this.A00.A00;
        C225314u r2 = r3.A00;
        if (r2 != null) {
            r2.runOnUiThread(new C81283wl((Object) r3, A05, 37));
        }
    }
}
