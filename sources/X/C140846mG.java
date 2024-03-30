package X;

/* renamed from: X.6mG  reason: invalid class name and case insensitive filesystem */
public class C140846mG implements C157867eo {
    public C157867eo A00;

    public void BoD(String str, String str2, Throwable th) {
        C157867eo r0;
        synchronized (this) {
            r0 = this.A00;
        }
        r0.BoD(str, str2, th);
    }

    public C140846mG() {
        C140836mF r0 = new C140836mF();
        synchronized (this) {
            this.A00 = r0;
        }
    }
}
