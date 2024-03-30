package X;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: X.0GD  reason: invalid class name */
public final class AnonymousClass0GD extends C06720Uu {
    public final AtomicReferenceFieldUpdater A00;
    public final AtomicReferenceFieldUpdater A01;
    public final AtomicReferenceFieldUpdater A02;
    public final AtomicReferenceFieldUpdater A03;
    public final AtomicReferenceFieldUpdater A04;

    public boolean A04(AnonymousClass0f7 r3, Object obj, Object obj2) {
        return AnonymousClass0A8.A00(r3, (Object) null, obj2, this.A01);
    }

    public void A00(AnonymousClass0Xz r2, AnonymousClass0Xz r3) {
        this.A02.lazySet(r2, r3);
    }

    public void A01(AnonymousClass0Xz r2, Thread thread) {
        this.A03.lazySet(r2, thread);
    }

    public boolean A02(C07020Wa r2, C07020Wa r3, AnonymousClass0f7 r4) {
        return AnonymousClass0A8.A00(r4, r2, r3, this.A00);
    }

    public boolean A03(AnonymousClass0Xz r2, AnonymousClass0Xz r3, AnonymousClass0f7 r4) {
        return AnonymousClass0A8.A00(r4, r2, r3, this.A04);
    }

    public AnonymousClass0GD(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.A03 = atomicReferenceFieldUpdater;
        this.A02 = atomicReferenceFieldUpdater2;
        this.A04 = atomicReferenceFieldUpdater3;
        this.A00 = atomicReferenceFieldUpdater4;
        this.A01 = atomicReferenceFieldUpdater5;
    }
}
