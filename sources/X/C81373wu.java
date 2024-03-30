package X;

import com.whatsapp.jid.Jid;
import java.text.Collator;
import java.util.Comparator;

/* renamed from: X.3wu  reason: invalid class name and case insensitive filesystem */
public class C81373wu implements Comparator {
    public final AnonymousClass005 A00;

    public /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        C65073Qp r5 = (C65073Qp) obj;
        C65073Qp r6 = (C65073Qp) obj2;
        int i = 0;
        if (r5 != null) {
            if (r6 != null) {
                String A08 = r5.A08();
                String A082 = r6.A08();
                if (A08 == null) {
                    if (A082 == null) {
                        return 0;
                    }
                    return -1;
                } else if (A082 != null) {
                    i = ((Collator) this.A00.get()).compare(A08, A082);
                    if (i == 0) {
                        return r5.A06().compareTo((Jid) r6.A06());
                    }
                }
            }
            return 1;
        } else if (r6 == null) {
            return i;
        } else {
            return -1;
        }
        return i;
    }

    public C81373wu(C18820ts r3) {
        this.A00 = C36431kI.A0x(new C65863Tt(this, r3, 0));
    }
}
