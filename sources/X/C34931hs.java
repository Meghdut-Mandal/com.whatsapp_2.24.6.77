package X;

import java.util.List;

/* renamed from: X.1hs  reason: invalid class name and case insensitive filesystem */
public final class C34931hs extends C19590wC {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C34931hs(AnonymousClass005 r2) {
        super(r2);
        AnonymousClass00C.A0D(r2, 1);
    }

    public final void A00(List list) {
        Iterable<AnonymousClass4SX> observers = getObservers();
        AnonymousClass00C.A08(observers);
        for (AnonymousClass4SX BhO : observers) {
            BhO.BhO(list);
        }
    }
}
