package X;

import java.util.Random;

/* renamed from: X.0mW  reason: invalid class name and case insensitive filesystem */
public abstract class C14990mW extends AnonymousClass0XG {
    public abstract Random A07();

    public int A00() {
        return A07().nextInt();
    }

    public int A01(int i) {
        return (A07().nextInt() >>> (32 - i)) & ((-i) >> 31);
    }

    public int A02(int i) {
        return A07().nextInt(i);
    }

    public long A04() {
        return A07().nextLong();
    }
}
