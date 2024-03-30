package X;

import java.util.Arrays;

/* renamed from: X.96a  reason: invalid class name and case insensitive filesystem */
public abstract class C1898996a {
    public static long A00(AnonymousClass3PG r8, boolean z) {
        long j;
        long j2 = 0;
        while (true) {
            int A00 = r8.A00();
            if (A00 == 0) {
                j = AnonymousClass99g.A00[(int) j2];
                break;
            }
            int i = (int) j2;
            int binarySearch = Arrays.binarySearch(AnonymousClass99f.A00, AnonymousClass99j.A00[i], AnonymousClass99h.A00[i], A00);
            if (binarySearch >= 0) {
                j2 = AnonymousClass99i.A00[binarySearch];
                if (j2 < 0) {
                    if (z) {
                        if (r8.A00() != 0 || j2 == -1) {
                            return -1;
                        }
                    } else if (j2 == -1) {
                        return -1;
                    }
                    j = -j2;
                }
            } else if (z) {
                return -1;
            } else {
                j = AnonymousClass99g.A00[i];
            }
        }
        if (j == 57171) {
            return 9169;
        }
        return j;
    }
}
