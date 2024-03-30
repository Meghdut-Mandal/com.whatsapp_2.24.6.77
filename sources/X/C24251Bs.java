package X;

/* renamed from: X.1Bs  reason: invalid class name and case insensitive filesystem */
public final class C24251Bs extends C19590wC {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C24251Bs(AnonymousClass005 r2) {
        super(r2);
        AnonymousClass00C.A0D(r2, 1);
    }

    public final void A00(String str) {
        AnonymousClass00C.A0D(str, 0);
        C18740tg.A01();
        Iterable<C161317mY> observers = getObservers();
        AnonymousClass00C.A08(observers);
        for (C161317mY BRG : observers) {
            BRG.BRG(str);
        }
    }

    public final void A01(String str) {
        C18740tg.A01();
        Iterable<C161317mY> observers = getObservers();
        AnonymousClass00C.A08(observers);
        for (C161317mY BRg : observers) {
            BRg.BRg(str);
        }
    }

    public final void A02(boolean z, boolean z2) {
        C18740tg.A01();
        Iterable<C161317mY> observers = getObservers();
        AnonymousClass00C.A08(observers);
        for (C161317mY BRk : observers) {
            BRk.BRk(z, z2);
        }
    }
}
