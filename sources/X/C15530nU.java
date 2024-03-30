package X;

/* renamed from: X.0nU  reason: invalid class name and case insensitive filesystem */
public final class C15530nU extends C15540nV implements Runnable {
    public final long A00;

    public void run() {
        long j = this.A00;
        C07330Xf.A02(getContext());
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Timed out waiting for ");
        A0u.append(j);
        A0l(new C13390jn(AnonymousClass000.A0q(" ms", A0u), this));
    }

    public C15530nU(C023509x r2, long j) {
        super(r2, r2.getContext());
        this.A00 = j;
    }

    public String A0a() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append(super.A0a());
        A0u.append("(timeMillis=");
        A0u.append(this.A00);
        return AnonymousClass000.A0t(A0u, ')');
    }
}
