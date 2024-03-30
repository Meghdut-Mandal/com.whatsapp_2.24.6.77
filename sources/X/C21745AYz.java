package X;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.AYz  reason: case insensitive filesystem */
public final /* synthetic */ class C21745AYz implements AnonymousClass004 {
    public final /* synthetic */ String A00;
    public final /* synthetic */ AtomicInteger A01;

    public /* synthetic */ C21745AYz(String str, AtomicInteger atomicInteger) {
        this.A00 = str;
        this.A01 = atomicInteger;
    }

    public final Object get() {
        return C36381kD.A10(AnonymousClass000.A0v(this.A00), this.A01.getAndIncrement());
    }
}
