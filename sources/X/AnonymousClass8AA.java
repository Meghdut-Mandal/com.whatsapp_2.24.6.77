package X;

/* renamed from: X.8AA  reason: invalid class name */
public final class AnonymousClass8AA extends AnonymousClass84C {
    public final AnonymousClass84B A00;

    public static final void A00(AnonymousClass8AA r3) {
        AnonymousClass9AO.A01.A01("sup:SocketConnectionStateDelegate", "[SOCKET_CONNECTION]: Awaiting device pairing");
        AnonymousClass84B r2 = r3.A00;
        r2.A01.A0D.set(true);
        C23090B4a b4a = r2.A0H;
        if (b4a != null) {
            b4a.BPE("cancel_reason", "socket_connection_awaiting_pairing");
            b4a.BPF(4);
        }
    }

    public void A07() {
        this.A00.A0C(new C22071AgI(this));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0020, code lost:
        X.C05600Qi.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0023, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A08() {
        /*
            r3 = this;
            X.84B r1 = r3.A00
            X.9Y3 r0 = r1.A01
            X.B2N r0 = r0.A04
            r2 = 0
            if (r0 == 0) goto L_0x000d
            java.io.Closeable r2 = r0.BA3()
        L_0x000d:
            X.02t r1 = r1.A0L     // Catch:{ all -> 0x001d }
            X.89U r0 = X.AnonymousClass89U.A00     // Catch:{ all -> 0x001d }
            r1.invoke(r0)     // Catch:{ all -> 0x001d }
            if (r2 == 0) goto L_0x0019
            r2.close()
        L_0x0019:
            super.A08()
            return
        L_0x001d:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x001f }
        L_0x001f:
            r0 = move-exception
            X.C05600Qi.A00(r2, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8AA.A08():void");
    }

    public AnonymousClass8AA(AnonymousClass84B r1) {
        super(r1);
        this.A00 = r1;
    }
}
