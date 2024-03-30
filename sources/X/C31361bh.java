package X;

import java.util.ArrayList;
import java.util.HashSet;

/* renamed from: X.1bh  reason: invalid class name and case insensitive filesystem */
public final class C31361bh {
    public static final C31381bj A02 = new C31381bj(C31371bi.A00);
    public final C31391bk A00;
    public final C31261bX A01;

    public C31361bh(C31391bk r2, C31261bX r3) {
        AnonymousClass00C.A0D(r2, 2);
        this.A01 = r3;
        this.A00 = r2;
    }

    public final C21642ATi A00(C16540pP r8, String str, int i) {
        ArrayList A03 = this.A01.A03(str, i);
        if (!A03.isEmpty()) {
            HashSet hashSet = new HashSet();
            int i2 = 0;
            Integer num = ((C21642ATi) A03.get(0)).A0B;
            if (num != null) {
                i2 = num.intValue();
            }
            hashSet.add(str);
            C21642ATi aTi = (C21642ATi) A02.A01(this.A00.A00(r8, Integer.valueOf(i), Integer.valueOf(i2), hashSet), A03);
            if (aTi != null) {
                return aTi;
            }
        }
        return null;
    }
}
