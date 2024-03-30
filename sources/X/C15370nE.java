package X;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: X.0nE  reason: invalid class name and case insensitive filesystem */
public final class C15370nE extends AnonymousClass0UH {
    public static final AtomicReferenceFieldUpdater A00 = AtomicReferenceFieldUpdater.newUpdater(C15370nE.class, Object.class, "_state");
    public volatile Object _state;

    public /* bridge */ /* synthetic */ boolean A00(Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = A00;
        if (atomicReferenceFieldUpdater.get(this) != null) {
            return false;
        }
        atomicReferenceFieldUpdater.set(this, AnonymousClass05E.A00);
        return true;
    }

    public /* bridge */ /* synthetic */ C023509x[] A01(Object obj) {
        A00.set(this, (Object) null);
        return AnonymousClass0RY.A00;
    }
}
