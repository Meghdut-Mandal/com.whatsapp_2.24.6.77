package X;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: X.0n4  reason: invalid class name */
public final class AnonymousClass0n4 extends C008503q {
    public static final AtomicReferenceFieldUpdater A03 = AtomicReferenceFieldUpdater.newUpdater(AnonymousClass0n4.class, Object.class, "_disposer");
    public AnonymousClass03l A00;
    public final AnonymousClass0AP A01;
    public final /* synthetic */ C07160Wo A02;
    public volatile Object _disposer;

    public AnonymousClass0n4(C07160Wo r1, AnonymousClass0AP r2) {
        this.A02 = r1;
        this.A01 = r2;
    }

    public void A05(Throwable th) {
        if (th != null) {
            AnonymousClass0AP r3 = this.A01;
            AnonymousClass035 A022 = AnonymousClass0AR.A02(new AnonymousClass0AT(th), (C006302t) null, (AnonymousClass0AR) r3);
            if (A022 != null) {
                r3.B3G(A022);
                C15190mq r0 = (C15190mq) A03.get(this);
                if (r0 != null) {
                    r0.A05();
                    return;
                }
                return;
            }
            return;
        }
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = C07160Wo.A01;
        C07160Wo r1 = this.A02;
        if (atomicIntegerFieldUpdater.decrementAndGet(r1) == 0) {
            AnonymousClass0AP r5 = this.A01;
            ArrayList arrayList = new ArrayList(r3);
            for (C17990sP B9w : r1.A00) {
                arrayList.add(B9w.B9w());
            }
            r5.resumeWith(arrayList);
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        A05((Throwable) obj);
        return AnonymousClass0AJ.A00;
    }
}
