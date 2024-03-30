package X;

/* renamed from: X.1aY  reason: invalid class name and case insensitive filesystem */
public final class C30651aY extends AnonymousClass12N {
    public C002000v A00;

    public synchronized String BHv() {
        StringBuilder sb;
        sb = new StringBuilder("sc=");
        C002000v r0 = this.A00;
        if (r0 == null) {
            sb.append("null");
        } else {
            sb.append(r0.A02());
            sb.append("/");
            sb.append(this.A00.A01());
        }
        return sb.toString();
    }

    public void Bjh(AnonymousClass5SK r4, boolean z) {
        synchronized (this) {
            C002000v r1 = this.A00;
            if (r1 != null) {
                r1.A07(-1);
            }
        }
    }

    public C30651aY(C220112n r1) {
        super(r1);
        A08();
    }
}
