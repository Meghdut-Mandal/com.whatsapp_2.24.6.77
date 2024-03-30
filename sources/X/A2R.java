package X;

public class A2R implements C23013B0e {
    public final C191259Cg A00;
    public final AnonymousClass9WY A01;
    public final C22880Axb A02;
    public volatile int A03;
    public volatile B31 A04;
    public volatile Boolean A05;

    public void B1t() {
        this.A01.A00();
    }

    public /* bridge */ /* synthetic */ Object BGo() {
        if (this.A05 == null) {
            throw AnonymousClass001.A09("Configure Preview operation hasn't completed yet.");
        } else if (this.A05.booleanValue()) {
            return this.A04;
        } else {
            throw new C21829Ab6("Failed to configure preview.");
        }
    }

    public A2R(C191259Cg r3) {
        this.A03 = 0;
        C203459o3 r1 = new C203459o3(this, 1);
        this.A02 = r1;
        this.A00 = r3;
        AnonymousClass9WY r0 = new AnonymousClass9WY();
        this.A01 = r0;
        r0.A00 = r1;
    }

    public A2R() {
        this((C191259Cg) null);
    }
}
