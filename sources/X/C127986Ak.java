package X;

import java.util.AbstractCollection;
import java.util.Iterator;

/* renamed from: X.6Ak  reason: invalid class name and case insensitive filesystem */
public final class C127986Ak {
    public final C108475Tq A00;
    public final String A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C127986Ak) {
                C127986Ak r5 = (C127986Ak) obj;
                if (!AnonymousClass00C.A0J(this.A01, r5.A01) || this.A00 != r5.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36351kA.A05(this.A00, C36421kH.A04(this.A01)) + 79233237;
    }

    public C127986Ak(C108475Tq r1, String str) {
        this.A01 = str;
        this.A00 = r1;
    }

    public static void A00(AbstractCollection abstractCollection, Iterator it) {
        abstractCollection.add(((C127986Ak) it.next()).A00);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("CrosspostDestination(destinationIdentity=");
        A0u.append(this.A01);
        A0u.append(", destinationApp=");
        A0u.append(this.A00);
        A0u.append(", destinationSurface=");
        return C36321k7.A0E("STORY", A0u);
    }
}
