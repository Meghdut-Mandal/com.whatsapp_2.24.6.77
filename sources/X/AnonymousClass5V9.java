package X;

/* renamed from: X.5V9  reason: invalid class name */
public final class AnonymousClass5V9 extends Exception {
    public final int downloadStatus;

    public AnonymousClass5V9(int i) {
        this.downloadStatus = i;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("DownloadResultException{downloadStatus=");
        A0u.append(C133136Wx.A01(this.downloadStatus));
        return AnonymousClass000.A0s(A0u);
    }
}
