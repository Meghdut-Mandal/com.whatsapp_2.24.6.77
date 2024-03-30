package X;

import java.util.Collections;
import java.util.List;

/* renamed from: X.2sT  reason: invalid class name and case insensitive filesystem */
public abstract class C54142sT {
    public static final String A00(int i) {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("SELECT chat_row_id FROM newsletter WHERE membership IN (");
        List nCopies = Collections.nCopies(i, "?");
        AnonymousClass00C.A08(nCopies);
        return C36321k7.A0E(C36381kD.A0x(",", nCopies), A0u);
    }
}
