package X;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

/* renamed from: X.9Hd  reason: invalid class name and case insensitive filesystem */
public final class C192479Hd {
    public final Collection A00;
    public final Collection A01;

    public C192479Hd(String... strArr) {
        Collection emptySet;
        if (r4 == 0) {
            emptySet = Collections.emptySet();
        } else if (r4 == 1) {
            emptySet = Collections.singleton(C165617ti.A0a(strArr));
        } else if (r4 == 2 || r4 == 3 || r4 == 4 || r4 == 5) {
            emptySet = Arrays.asList(strArr);
        } else {
            emptySet = C36421kH.A0g(strArr);
        }
        this.A00 = emptySet;
        this.A01 = C36441kJ.A16();
        for (String str : strArr) {
            Collection collection = this.A01;
            Object[] objArr = (Object[]) AnonymousClass9BE.A02.A00.get(str);
            C18740tg.A06(objArr);
            Collections.addAll(collection, objArr);
        }
    }
}
