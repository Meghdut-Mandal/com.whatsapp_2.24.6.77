package X;

import com.whatsapp.jid.UserJid;
import java.util.AbstractCollection;
import java.util.Iterator;

/* renamed from: X.2YQ  reason: invalid class name */
public final class AnonymousClass2YQ extends C54832td {
    public final UserJid A00;

    public AnonymousClass2YQ(UserJid userJid) {
        AnonymousClass00C.A0D(userJid, 1);
        this.A00 = userJid;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass2YQ) && AnonymousClass00C.A0J(this.A00, ((AnonymousClass2YQ) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public static void A00(AbstractCollection abstractCollection, Iterator it) {
        abstractCollection.add(((AnonymousClass2YQ) it.next()).A00);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Error(user=");
        return AnonymousClass000.A0m(this.A00, A0u);
    }
}
