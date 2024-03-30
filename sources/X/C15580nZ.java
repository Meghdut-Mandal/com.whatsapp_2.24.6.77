package X;

/* renamed from: X.0nZ  reason: invalid class name and case insensitive filesystem */
public final class C15580nZ extends AnonymousClass0AB {
    public final Runnable A00;

    public void run() {
        this.A00.run();
    }

    public C15580nZ(Runnable runnable, AnonymousClass033 r2, long j) {
        super(r2, j);
        this.A00 = runnable;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Task[");
        Runnable runnable = this.A00;
        AnonymousClass000.A1C(runnable, A0u);
        A0u.append('@');
        AnonymousClass000.A1B(runnable, A0u);
        A0u.append(", ");
        A0u.append(this.A00);
        A0u.append(", ");
        return AnonymousClass000.A0n(this.A01, A0u);
    }
}
