package X;

/* renamed from: X.6wH  reason: invalid class name and case insensitive filesystem */
public class C146856wH implements C160867li {
    public final /* synthetic */ C132276Sx A00;

    public C146856wH(C132276Sx r1) {
        this.A00 = r1;
    }

    public void BT4() {
        C132276Sx.A00(this.A00, 2);
    }

    public void BT5() {
        C132276Sx.A00(this.A00, 7);
    }

    public void BU4(boolean z) {
        if (z) {
            C132276Sx.A00(this.A00, 5);
        }
    }

    public void BZ4() {
        C132276Sx.A00(this.A00, 3);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000b, code lost:
        if (r4 == 101) goto L_0x000d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BdK(int r4) {
        /*
            r3 = this;
            r0 = 301(0x12d, float:4.22E-43)
            if (r4 == r0) goto L_0x000d
            r0 = 104(0x68, float:1.46E-43)
            if (r4 == r0) goto L_0x000d
            r0 = 101(0x65, float:1.42E-43)
            r2 = 0
            if (r4 != r0) goto L_0x000e
        L_0x000d:
            r2 = 1
        L_0x000e:
            X.6Sx r1 = r3.A00
            r0 = 3
            if (r2 == 0) goto L_0x0015
            r0 = 18
        L_0x0015:
            X.C132276Sx.A00(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C146856wH.BdK(int):void");
    }

    public void BdL() {
        C132276Sx.A00(this.A00, 17);
    }

    public void Bdg(int i) {
        C132276Sx r1 = this.A00;
        C132276Sx.A00(r1, 3);
        synchronized (r1) {
            r1.A00 = i;
        }
    }

    public void onError(int i) {
        C132276Sx.A00(this.A00, C111115bl.A00(i));
    }
}
