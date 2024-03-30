package X;

import java.util.Arrays;

/* renamed from: X.9at  reason: invalid class name and case insensitive filesystem */
public abstract class C196989at {
    public static final C21671AUq A00;
    public static final char[] A01 = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    static {
        C21671AUq aUq = C21671AUq.A02;
        byte[] copyOf = Arrays.copyOf(new byte[0], 0);
        AnonymousClass00C.A04(copyOf);
        A00 = new C21671AUq(copyOf);
    }

    public static final C21671AUq A00(String str) {
        C21671AUq aUq = C21671AUq.A02;
        byte[] bytes = str.getBytes(AnonymousClass0S4.A05);
        AnonymousClass00C.A04(bytes);
        C21671AUq aUq2 = new C21671AUq(bytes);
        aUq2.A01 = str;
        return aUq2;
    }
}
