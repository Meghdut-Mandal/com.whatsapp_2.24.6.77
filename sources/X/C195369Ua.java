package X;

/* renamed from: X.9Ua  reason: invalid class name and case insensitive filesystem */
public final class C195369Ua {
    public int A00 = 5000;
    public int A01 = 2500;
    public int A02 = 50000;
    public int A03 = 50000;
    public int A04 = -1;
    public C195899Ws A05;
    public boolean A06;

    public void A00(int i, int i2, int i3, int i4) {
        C200319h9.A02(!this.A06);
        C208919zA.A00(i3, 0, "bufferForPlaybackMs", "0");
        C208919zA.A00(i4, 0, "bufferForPlaybackAfterRebufferMs", "0");
        C208919zA.A00(i, i3, "minBufferMs", "bufferForPlaybackMs");
        C208919zA.A00(i, i4, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        C208919zA.A00(i2, i, "maxBufferMs", "minBufferMs");
        this.A03 = i;
        this.A02 = i2;
        this.A01 = i3;
        this.A00 = i4;
    }
}
