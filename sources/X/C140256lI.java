package X;

/* renamed from: X.6lI  reason: invalid class name and case insensitive filesystem */
public class C140256lI implements C29061Ve {
    public final C19420v0 A00;

    public synchronized AnonymousClass61Z BFs() {
        AnonymousClass61Z r2;
        C19420v0 r22 = this.A00;
        String string = C36341k9.A0E(r22).getString("phoneyid_id", (String) null);
        long A0V = r22.A0V("phoneyid_timestamp");
        if (string == null || A0V == -1) {
            r2 = new AnonymousClass61Z((String) null, 0);
        } else {
            r2 = new AnonymousClass61Z(string, A0V);
        }
        return r2;
    }

    public synchronized void BrX(AnonymousClass61Z r7) {
        C19420v0 r5 = this.A00;
        String str = r7.A01;
        long j = r7.A00;
        C36341k9.A0x(C19420v0.A00(r5), "phoneyid_id", str);
        r5.A1h("phoneyid_timestamp", j);
    }

    public C140256lI(C19420v0 r1) {
        this.A00 = r1;
    }
}
