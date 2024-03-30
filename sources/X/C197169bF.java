package X;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;

/* renamed from: X.9bF  reason: invalid class name and case insensitive filesystem */
public class C197169bF {
    public BlockingDeque A00 = new LinkedBlockingDeque();

    public static String A00(List list) {
        StringBuilder A0u = AnonymousClass000.A0u();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            long A05 = C165567td.A05(C36391kE.A0D(it));
            while (true) {
                long j = (long) 128;
                if (A05 < j) {
                    break;
                }
                A05 >>= 7;
                A0u.append((char) ((int) (j | (((long) 127) & A05))));
            }
            A0u.append((char) ((int) A05));
        }
        StringBuilder A0i = C90524aI.A0i(A0u.toString());
        StringBuilder A0u2 = AnonymousClass000.A0u();
        StringBuilder A0u3 = AnonymousClass000.A0u();
        int length = A0i.length() % 3;
        if (length > 0) {
            while (length < 3) {
                A0u3.append('=');
                A0i.append(0);
                length++;
            }
        }
        for (int i = 0; i < A0i.length(); i += 3) {
            int charAt = (A0i.charAt(i) << 16) + (A0i.charAt(i + 1) << 8) + A0i.charAt(i + 2);
            C90514aH.A1R("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", A0u2, (charAt >> 18) & 63);
            C90514aH.A1R("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", A0u2, (charAt >> 12) & 63);
            C90514aH.A1R("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", A0u2, (charAt >> 6) & 63);
            C90514aH.A1R("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", A0u2, charAt & 63);
        }
        return AnonymousClass000.A0l(A0u3, A0u2.substring(0, A0u2.length() - A0u3.length()), AnonymousClass000.A0u());
    }
}
