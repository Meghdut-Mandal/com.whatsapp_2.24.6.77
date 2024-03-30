package X;

/* renamed from: X.97o  reason: invalid class name and case insensitive filesystem */
public abstract class C1902797o {
    public static final void A00(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("size=");
            A0u.append(j);
            A0u.append(" offset=");
            A0u.append(j2);
            throw new ArrayIndexOutOfBoundsException(C36381kD.A0z(" byteCount=", A0u, j3));
        }
    }
}
