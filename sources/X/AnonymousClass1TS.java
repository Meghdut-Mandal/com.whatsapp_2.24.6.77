package X;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.1TS  reason: invalid class name */
public class AnonymousClass1TS extends HashMap<C64933Qa, AnonymousClass2bU> {
    public final /* synthetic */ AnonymousClass1ST this$0;

    public AnonymousClass1TS(AnonymousClass1ST r1) {
        this.this$0 = r1;
    }

    /* renamed from: A00 */
    public AnonymousClass2bU remove(Object obj) {
        C65013Qj r0;
        C101334xN A00;
        AnonymousClass2bU r02 = (AnonymousClass2bU) super.get(obj);
        if (!(r02 == null || (r0 = r02.A01) == null)) {
            AnonymousClass1ST r4 = this.this$0;
            C18740tg.A06(r0);
            AnonymousClass1SU r1 = r4.A0E;
            C101334xN A002 = r1.A00(r0);
            if (A002 != null) {
                A002.A15 = false;
                HashMap hashMap = r4.A0P;
                synchronized (hashMap) {
                    for (Map.Entry entry : hashMap.entrySet()) {
                        r4.A0D((C160107kT) null, (AnonymousClass2bU) entry.getKey(), 1, ((Long) entry.getValue()).longValue(), true, true);
                    }
                    hashMap.clear();
                }
                synchronized (r4.A0F) {
                    Iterator it = r4.A0B().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            r4.A01.open();
                            break;
                        }
                        C65013Qj r03 = ((AnonymousClass2bU) it.next()).A01;
                        if (r03 != null && (A00 = r1.A00(r03)) != null && A00.A15) {
                            break;
                        }
                    }
                }
            }
        }
        return (AnonymousClass2bU) super.remove(obj);
    }
}
