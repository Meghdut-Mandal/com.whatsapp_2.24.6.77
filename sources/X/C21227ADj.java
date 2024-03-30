package X;

/* renamed from: X.ADj  reason: case insensitive filesystem */
public final class C21227ADj implements C22949Az1 {
    public final /* synthetic */ C22949Az1 A00;
    public final /* synthetic */ AnonymousClass1TZ A01;

    public C21227ADj(C22949Az1 az1, AnonymousClass1TZ r2) {
        this.A01 = r2;
        this.A00 = az1;
    }

    public void BoK(String str) {
        AnonymousClass1TZ r1 = this.A01;
        synchronized (r1) {
            C07710Yz.A00(r1.A04).remove(str);
        }
        C22949Az1 az1 = this.A00;
        if (az1 != null) {
            az1.BoK(str);
        }
    }
}
