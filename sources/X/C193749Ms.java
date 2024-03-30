package X;

import java.io.OutputStream;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.9Ms  reason: invalid class name and case insensitive filesystem */
public class C193749Ms {
    public AtomicLong A00 = new AtomicLong(0);
    public AtomicLong A01 = new AtomicLong(0);
    public final AZ8 A02;
    public final C199289f4 A03;
    public final C199289f4 A04;

    public static void A00(C203299nk r7, byte[] bArr) {
        AnonymousClass9R9 r2 = r7.A00;
        int length = bArr.length;
        C193749Ms r0 = r2.A01;
        byte[] A012 = r0.A04.A01(new byte[0], bArr, length, r0.A01.getAndIncrement());
        OutputStream outputStream = r2.A00;
        outputStream.write(A012);
        outputStream.flush();
    }

    public C193749Ms(AZ8 az8, byte[] bArr, byte[] bArr2) {
        this.A04 = new C199289f4(bArr);
        this.A03 = new C199289f4(bArr2);
        this.A02 = az8;
    }
}
