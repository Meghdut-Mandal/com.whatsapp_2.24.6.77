package X;

import com.whatsapp.jid.UserJid;
import java.util.Arrays;

/* renamed from: X.66H  reason: invalid class name */
public class AnonymousClass66H {
    public final UserJid A00;
    public final boolean A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            AnonymousClass66H r5 = (AnonymousClass66H) obj;
            if (this.A01 != r5.A01 || !C1901797e.A00(this.A00, r5.A00)) {
                return false;
            }
        }
        return true;
    }

    public AnonymousClass66H(UserJid userJid, boolean z) {
        this.A01 = z;
        this.A00 = userJid;
    }

    public int hashCode() {
        Object[] A0M = AnonymousClass001.A0M();
        A0M[0] = this.A00;
        C36421kH.A1R(A0M, this.A01);
        return Arrays.hashCode(A0M);
    }
}
