package X;

import java.util.Iterator;

/* renamed from: X.5FX  reason: invalid class name */
public class AnonymousClass5FX extends C19580wB {
    public void A00() {
        Iterator A0s = C36361kB.A0s(this);
        while (A0s.hasNext()) {
            ((C160867li) A0s.next()).BT4();
        }
    }

    public void A01(int i) {
        Iterator A0s = C36361kB.A0s(this);
        while (A0s.hasNext()) {
            ((C160867li) A0s.next()).onError(i);
        }
    }
}
