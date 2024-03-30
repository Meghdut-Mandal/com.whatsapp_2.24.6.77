package X;

/* renamed from: X.2bK  reason: invalid class name */
public class AnonymousClass2bK extends AnonymousClass3T1 {
    public int A00;
    public int A01;
    public byte[] A02;

    public AnonymousClass2bK(C64933Qa r3, byte[] bArr, int i, int i2, long j) {
        this(r3, j);
        Object valueOf;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("FMessageFuture/futureproof/size=");
        if (bArr == null) {
            valueOf = "null";
        } else {
            valueOf = Integer.valueOf(bArr.length);
        }
        C36351kA.A1L(valueOf, A0u);
        A1B(bArr);
        this.A01 = i;
        this.A01 = i2;
    }

    public AnonymousClass2bK(C64933Qa r2, long j) {
        super(r2, 12, j);
    }
}
