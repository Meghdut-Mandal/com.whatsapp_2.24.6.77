package androidx.work;

import X.AnonymousClass6X2;
import X.AnonymousClass7eB;
import X.C120755s1;
import X.C130966Nd;
import X.C157087bo;
import X.C157097bp;
import X.C90524aI;
import java.util.Collection;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;

public final class WorkerParameters {
    public int A00;
    public AnonymousClass6X2 A01;
    public C157087bo A02;
    public C157097bp A03;
    public C130966Nd A04;
    public AnonymousClass7eB A05;
    public UUID A06;
    public Executor A07;
    public C120755s1 A08;
    public Set A09;

    public WorkerParameters(AnonymousClass6X2 r2, C157087bo r3, C157097bp r4, C130966Nd r5, C120755s1 r6, AnonymousClass7eB r7, Collection collection, UUID uuid, Executor executor, int i) {
        this.A06 = uuid;
        this.A01 = r2;
        this.A09 = C90524aI.A0k(collection);
        this.A08 = r6;
        this.A00 = i;
        this.A07 = executor;
        this.A05 = r7;
        this.A04 = r5;
        this.A03 = r4;
        this.A02 = r3;
    }
}
