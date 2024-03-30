package X;

import java.text.Collator;
import java.util.Comparator;

@Deprecated
/* renamed from: X.3xZ  reason: invalid class name and case insensitive filesystem */
public class C81783xZ implements Comparator {
    public final int A00;
    public final C19730wQ A01;
    public final AnonymousClass171 A02;
    public final Collator A03;

    public static int A00(AnonymousClass34G r5, AnonymousClass34G r6, Collator collator) {
        char c;
        char c2;
        C52022ol r2 = r5.A00;
        C52022ol r1 = C52022ol.PUSH_NAME;
        if (r2 == r1) {
            c = 1;
        } else {
            c = 0;
            if (r2 == C52022ol.PHONE_NUMBER) {
                c = 2;
            }
        }
        C52022ol r22 = r6.A00;
        if (r22 == r1) {
            c2 = 1;
        } else {
            c2 = 0;
            if (r22 == C52022ol.PHONE_NUMBER) {
                c2 = 2;
            }
        }
        if (c == c2) {
            String str = r5.A01;
            String str2 = r6.A01;
            if (str == null) {
                if (str2 == null) {
                    return 0;
                }
                return -1;
            } else if (str2 != null) {
                return collator.compare(str, str2);
            }
        } else if (c < c2) {
            return -1;
        }
        return 1;
    }

    @Deprecated
    /* renamed from: A01 */
    public int compare(AnonymousClass141 r7, AnonymousClass141 r8) {
        C19730wQ r0 = this.A01;
        boolean A1X = C36361kB.A1X(r0, r7);
        if (A1X == C36361kB.A1X(r0, r8)) {
            Collator collator = this.A03;
            AnonymousClass171 r4 = this.A02;
            int i = this.A00;
            return A00(r4.A0E(r7, i, false, true), r4.A0E(r8, i, false, true), collator);
        } else if (A1X) {
            return -1;
        } else {
            return 1;
        }
    }

    public C81783xZ(C19730wQ r2, AnonymousClass171 r3, int i) {
        this.A01 = r2;
        this.A00 = i;
        this.A02 = r3;
        this.A03 = r3.A0Z();
    }
}
