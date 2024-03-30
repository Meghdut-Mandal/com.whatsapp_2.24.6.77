package X;

import java.util.Arrays;

/* renamed from: X.9fk  reason: invalid class name and case insensitive filesystem */
public final class C199669fk {
    public static final C199669fk A01 = new C199669fk(new int[]{2});
    public static final C20070wy A02;
    public static final C199669fk A03 = new C199669fk(new int[]{2, 5, 6});
    public final int[] A00;

    static {
        C20090x0 r3 = new C20090x0();
        r3.put(C36371kC.A0p(), 6);
        r3.put(C36431kI.A13(), 6);
        r3.put(C36401kF.A0h(), 6);
        r3.put(18, 6);
        r3.put(6, 8);
        r3.put(8, 8);
        r3.put(14, 8);
        A02 = r3.build();
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C199669fk) && Arrays.equals(this.A00, ((C199669fk) obj).A00);
        }
        return true;
    }

    public int hashCode() {
        return 8 + (Arrays.hashCode(this.A00) * 31);
    }

    public C199669fk(int[] iArr) {
        int[] copyOf = Arrays.copyOf(iArr, iArr.length);
        this.A00 = copyOf;
        Arrays.sort(copyOf);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("AudioCapabilities[maxChannelCount=");
        A0u.append(8);
        A0u.append(", supportedEncodings=");
        return C165567td.A0Y(Arrays.toString(this.A00), A0u);
    }
}
