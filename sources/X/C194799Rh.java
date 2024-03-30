package X;

/* renamed from: X.9Rh  reason: invalid class name and case insensitive filesystem */
public class C194799Rh {
    public C195999Xe A00;
    public C194799Rh A01;
    public boolean A02;
    public final /* synthetic */ C166097v1 A03;

    public C194799Rh(C166097v1 r1) {
        this.A03 = r1;
    }

    public String toString() {
        String A002;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("state=");
        A0u.append(this.A00.A00());
        A0u.append(",active=");
        A0u.append(this.A02);
        A0u.append(",parent=");
        C194799Rh r0 = this.A01;
        if (r0 == null) {
            A002 = "null";
        } else {
            A002 = r0.A00.A00();
        }
        return AnonymousClass000.A0q(A002, A0u);
    }
}
