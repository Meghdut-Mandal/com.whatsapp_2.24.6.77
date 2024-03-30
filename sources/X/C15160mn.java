package X;

import java.util.concurrent.Future;

/* renamed from: X.0mn  reason: invalid class name and case insensitive filesystem */
public final class C15160mn extends C15210ms {
    public final Future A00;

    public void A04(Throwable th) {
        if (th != null) {
            this.A00.cancel(false);
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        A04((Throwable) obj);
        return AnonymousClass0AJ.A00;
    }

    public C15160mn(Future future) {
        this.A00 = future;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("CancelFutureOnCancel[");
        return AnonymousClass000.A0n(this.A00, A0u);
    }
}
