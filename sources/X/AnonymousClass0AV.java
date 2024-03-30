package X;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.0AV  reason: invalid class name */
public class AnonymousClass0AV extends C021409b {
    public final /* synthetic */ C009604b A00;
    public final /* synthetic */ AnonymousClass04Z A01;
    public final /* synthetic */ AnonymousClass08V A02;
    public final /* synthetic */ AnonymousClass02E A03;
    public final /* synthetic */ AtomicReference A04;

    public AnonymousClass0AV(C009604b r1, AnonymousClass04Z r2, AnonymousClass08V r3, AnonymousClass02E r4, AtomicReference atomicReference) {
        this.A03 = r4;
        this.A02 = r3;
        this.A04 = atomicReference;
        this.A01 = r2;
        this.A00 = r1;
    }

    public void A00() {
        AnonymousClass02E r5 = this.A03;
        StringBuilder sb = new StringBuilder();
        sb.append("fragment_");
        sb.append(r5.A0W);
        sb.append("_rq#");
        sb.append(r5.A0n.getAndIncrement());
        String obj = sb.toString();
        this.A04.set(((AnonymousClass01X) this.A02.apply((Object) null)).A01(this.A00, this.A01, r5, obj));
    }
}
