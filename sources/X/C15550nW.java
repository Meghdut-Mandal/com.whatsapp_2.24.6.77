package X;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* renamed from: X.0nW  reason: invalid class name and case insensitive filesystem */
public final class C15550nW extends C15460nN {
    public final AtomicReferenceArray A00 = new AtomicReferenceArray(AnonymousClass0S6.A01);

    public void A06(Throwable th, C005102h r4, int i) {
        this.A00.set(i, AnonymousClass0S6.A03);
        A05();
    }

    public C15550nW(C15550nW r3, int i, long j) {
        super(r3, i, j);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("SemaphoreSegment[id=");
        A0u.append(this.A00);
        A0u.append(", hashCode=");
        A0u.append(hashCode());
        return AnonymousClass000.A0t(A0u, ']');
    }

    public int A04() {
        return AnonymousClass0S6.A01;
    }
}
