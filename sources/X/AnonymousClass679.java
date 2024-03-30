package X;

/* renamed from: X.679  reason: invalid class name */
public class AnonymousClass679 {
    public int A00;
    public int A01;
    public boolean A02;
    public final C135056c3 A03;

    public AnonymousClass679(C135056c3 r1) {
        this.A03 = r1;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("InternalLoadRequest{mRequestAsset=");
        A0u.append(this.A03);
        A0u.append(", mPrefetchReferences=");
        A0u.append(this.A01);
        A0u.append(", mNonPrefetchReferences=");
        A0u.append(this.A00);
        A0u.append(", mDownloadedOrDownloading=");
        A0u.append(this.A02);
        return AnonymousClass000.A0s(A0u);
    }
}
