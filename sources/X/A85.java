package X;

import java.util.List;

public class A85 implements C22904AyG {
    public boolean B6t(C200269h0 r5, C200269h0 r6, AnonymousClass9LX r7) {
        boolean z;
        int i;
        if (r6 instanceof AnonymousClass8TC) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return false;
        }
        int intValue = r6.A03().A00.intValue();
        if (r5 instanceof AnonymousClass8T8) {
            i = r5.A05().A01.length();
        } else if (!(r5 instanceof AnonymousClass8TB)) {
            return false;
        } else {
            AnonymousClass8TB A02 = r5.A02();
            if (A02.A07() instanceof List) {
                i = ((List) A02.A07()).size();
            } else {
                i = -1;
            }
        }
        if (i == intValue) {
            return true;
        }
        return false;
    }
}
