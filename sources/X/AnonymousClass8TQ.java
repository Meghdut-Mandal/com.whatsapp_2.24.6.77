package X;

import java.util.Collection;
import java.util.Collections;

/* renamed from: X.8TQ  reason: invalid class name */
public class AnonymousClass8TQ extends C196179Ya {
    public final Collection A00;

    public boolean A09(C194879Rp r5, C199959gK r6, Object obj, Object obj2) {
        AnonymousClass9LX r3 = new AnonymousClass9LX(r5, obj, obj2, r6.A05);
        for (C22902AyE B1B : this.A00) {
            try {
                if (!B1B.B1B(r3)) {
                    return false;
                }
            } catch (C173738Sv unused) {
            }
        }
        return true;
    }

    public AnonymousClass8TQ(C22902AyE ayE) {
        this.A00 = Collections.singletonList(ayE);
    }

    public AnonymousClass8TQ(Collection collection) {
        this.A00 = collection;
    }
}
