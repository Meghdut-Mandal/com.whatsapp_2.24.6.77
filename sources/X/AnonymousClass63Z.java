package X;

/* renamed from: X.63Z  reason: invalid class name */
public class AnonymousClass63Z {
    public final long A00;
    public final long A01;
    public final long A02;
    public final String A03;

    public AnonymousClass63Z(String str, long j, long j2, long j3) {
        this.A03 = str;
        this.A01 = j;
        this.A00 = j2;
        this.A02 = j3;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("ExpressPathDownloadData: {EncHash: ");
        A0u.append(this.A03);
        A0u.append("SavedTime: ");
        A0u.append(this.A01);
        A0u.append("SavedBytes: ");
        A0u.append(this.A00);
        A0u.append("LateUpdateTime: ");
        return C36411kG.A11(A0u, this.A02);
    }
}
