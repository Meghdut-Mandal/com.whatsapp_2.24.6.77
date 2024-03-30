package X;

/* renamed from: X.73F  reason: invalid class name */
public final /* synthetic */ class AnonymousClass73F implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ AnonymousClass6TQ A03;

    public /* synthetic */ AnonymousClass73F(AnonymousClass6TQ r1, int i, int i2, long j) {
        this.A03 = r1;
        this.A00 = i;
        this.A01 = i2;
        this.A02 = j;
    }

    public final void run() {
        C19700wN r1;
        String str;
        AnonymousClass6TQ r7 = this.A03;
        int i = this.A00;
        int i2 = this.A01;
        long j = this.A02;
        C1042258t A002 = AnonymousClass6TQ.A00(r7, 1);
        A002.A08 = Integer.valueOf(i);
        A002.A07 = Integer.valueOf(i2);
        if (j != 0) {
            A002.A0I = Long.valueOf(j);
        }
        AnonymousClass6TQ.A01(A002, r7);
        if (i2 == 1) {
            r7.A00.A0E("fpm/failed to set server flag", (String) null, true);
            C36321k7.A1S("fpm/LoggingManager/critical event logged for errorCode: ", AnonymousClass000.A0u(), i2);
            return;
        }
        if (i2 == 3) {
            r1 = r7.A00;
            str = "fpm/failed to parse qr code";
        } else if (i2 == 5) {
            r1 = r7.A00;
            str = "fpm/donor device can't connect to receiver device after reading QR code from receiver";
        } else {
            return;
        }
        r1.A0E(str, (String) null, true);
    }
}
