package X;

import com.whatsapp.jid.UserJid;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.6PM  reason: invalid class name */
public final class AnonymousClass6PM {
    public int A00;
    public int A01;
    public boolean A02;
    public final UserJid A03;
    public final ConcurrentHashMap A04 = C90524aI.A0s();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            AnonymousClass6PM r4 = (AnonymousClass6PM) obj;
            if (this.A01 == r4.A01 && this.A02 == r4.A02 && this.A03.equals(r4.A03)) {
                return this.A04.equals(r4.A04);
            }
        }
        return false;
    }

    public int hashCode() {
        return ((C36351kA.A05(this.A04, C36391kE.A0A(this.A03)) + this.A01) * 31) + (this.A02 ? 1 : 0);
    }

    public AnonymousClass6PM(UserJid userJid, Set set, int i, boolean z) {
        this.A03 = userJid;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            AnonymousClass6B1 r2 = (AnonymousClass6B1) it.next();
            this.A04.put(r2.A02, r2);
        }
        this.A01 = i;
        this.A02 = z;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("GroupParticipant{jid='");
        A0u.append(this.A03);
        A0u.append('\'');
        A0u.append(", rank=");
        A0u.append(this.A01);
        A0u.append(", pending=");
        A0u.append(this.A02);
        A0u.append(", participantDevices=");
        StringBuilder A0i = C90524aI.A0i("[");
        Iterator A10 = C36391kE.A10(this.A04);
        while (A10.hasNext()) {
            A0i.append(A10.next());
            C90504aG.A1M(A0i);
        }
        A0i.append("]");
        C36351kA.A1K(A0i, A0u);
        return AnonymousClass000.A0s(A0u);
    }
}
