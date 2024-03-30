package X;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.1bw  reason: invalid class name and case insensitive filesystem */
public final class C31511bw {
    public static final C31381bj A03 = new C31381bj(C31521bx.A00);
    public final AnonymousClass19A A00;
    public final C31391bk A01;
    public final C31261bX A02;

    public C31511bw(AnonymousClass19A r2, C31391bk r3, C31261bX r4) {
        AnonymousClass00C.A0D(r2, 1);
        AnonymousClass00C.A0D(r3, 3);
        this.A00 = r2;
        this.A02 = r4;
        this.A01 = r3;
    }

    public static final void A00(C194969Ry r7, C31511bw r8, C16540pP r9, List list, Set set) {
        C87374On A012;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C21642ATi aTi = (C21642ATi) it.next();
            if (set.contains(aTi.A0F)) {
                arrayList.add(aTi);
            }
        }
        if (arrayList.isEmpty()) {
            A012 = null;
        } else {
            HashSet hashSet = new HashSet();
            hashSet.add("whatsapp_push_notification_event");
            int i = 0;
            Integer num = ((C21642ATi) arrayList.get(0)).A0B;
            if (num != null) {
                i = num.intValue();
            }
            A012 = A03.A01(r8.A01.A00(r9, 11231, Integer.valueOf(i), hashSet), arrayList);
        }
        r7.A00(A012);
    }
}
