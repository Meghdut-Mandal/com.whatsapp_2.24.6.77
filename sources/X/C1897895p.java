package X;

import com.google.protobuf.CodedOutputStream;

/* renamed from: X.95p  reason: invalid class name and case insensitive filesystem */
public abstract class C1897895p {
    public static int A05(int i) {
        return CodedOutputStream.A00(i << 3);
    }

    public static int A06(int i) {
        return CodedOutputStream.A00((i >> 31) ^ (i << 1));
    }

    public static void A07(CodedOutputStream codedOutputStream, int i) {
        codedOutputStream.A08((i << 3) | 2);
    }
}
