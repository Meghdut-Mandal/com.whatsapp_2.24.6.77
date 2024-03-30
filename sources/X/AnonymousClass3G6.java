package X;

import java.util.HashMap;
import java.util.List;

/* renamed from: X.3G6  reason: invalid class name */
public final class AnonymousClass3G6 {
    public final HashMap A00 = AnonymousClass001.A0J();
    public final List A01 = AnonymousClass001.A0I();

    public final int A00(String str) {
        AnonymousClass00C.A0D(str, 0);
        int i = 0;
        for (AnonymousClass332 r0 : this.A01) {
            if (AnonymousClass00C.A0J(r0.A00.A09.getRawString(), str)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public final void A01(AnonymousClass332 r5) {
        this.A01.add(r5);
        String rawString = r5.A00.A09.getRawString();
        HashMap hashMap = this.A00;
        if (!hashMap.containsKey(rawString)) {
            C36421kH.A1K(rawString, hashMap, (long) hashMap.size());
        }
    }
}
