package X;

import com.whatsapp.jid.Jid;
import java.text.Collator;
import java.util.Comparator;

/* renamed from: X.3x8  reason: invalid class name and case insensitive filesystem */
public final class C81513x8 implements Comparator {
    public final AnonymousClass171 A00;
    public final C220412q A01;
    public final Collator A02;

    public C81513x8(AnonymousClass171 r3, C18820ts r4, C220412q r5) {
        C36321k7.A16(r5, r3, r4, 1);
        this.A01 = r5;
        this.A00 = r3;
        Collator A0p = C36361kB.A0p(r4);
        A0p.setDecomposition(1);
        this.A02 = A0p;
    }

    public /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        long j;
        long j2;
        AnonymousClass141 r11 = (AnonymousClass141) obj;
        AnonymousClass141 r12 = (AnonymousClass141) obj2;
        C36321k7.A0w(r11, r12);
        Class<AnonymousClass11F> cls = AnonymousClass11F.class;
        Jid A06 = r11.A06(cls);
        if (A06 != null) {
            AnonymousClass11F r3 = (AnonymousClass11F) A06;
            Jid A062 = r12.A06(cls);
            if (A062 != null) {
                AnonymousClass11F r2 = (AnonymousClass11F) A062;
                C220412q r1 = this.A01;
                if (r1.A0M(r3)) {
                    j = r1.A08(r3);
                } else {
                    j = 0;
                }
                if (r1.A0M(r2)) {
                    j2 = r1.A08(r2);
                } else {
                    j2 = 0;
                }
                int i = (j2 > 0 ? 1 : (j2 == 0 ? 0 : -1));
                if (j == 0) {
                    if (i != 0) {
                        return 1;
                    }
                    Collator collator = this.A02;
                    AnonymousClass171 r0 = this.A00;
                    return collator.compare(r0.A0H(r11), r0.A0H(r12));
                } else if (i == 0) {
                    return -1;
                } else {
                    int i2 = (j > j2 ? 1 : (j == j2 ? 0 : -1));
                    if (i2 == 0) {
                        AnonymousClass171 r02 = this.A00;
                        String A0H = r02.A0H(r11);
                        if (A0H != null) {
                            String A0H2 = r02.A0H(r12);
                            if (A0H2 != null) {
                                return A0H.compareTo(A0H2);
                            }
                            throw AnonymousClass001.A09("Required value was null.");
                        }
                        throw AnonymousClass001.A09("Required value was null.");
                    } else if (i2 < 0) {
                        return 1;
                    } else {
                        return -1;
                    }
                }
            } else {
                throw AnonymousClass001.A09("Required value was null.");
            }
        } else {
            throw AnonymousClass001.A09("Required value was null.");
        }
    }
}
