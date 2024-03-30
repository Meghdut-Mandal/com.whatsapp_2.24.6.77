package X;

import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.1jX  reason: invalid class name and case insensitive filesystem */
public class C35961jX extends C002000v {
    public Object A00;
    public final int A01 = 0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C35961jX(AnonymousClass177 r2) {
        super(250);
        this.A00 = r2;
    }

    public /* bridge */ /* synthetic */ void A09(boolean z, Object obj, Object obj2, Object obj3) {
        if (this.A01 != 0) {
            C124935z2 r8 = (C124935z2) obj2;
            if (z) {
                AnonymousClass1DE.A01(r8, (AnonymousClass1DE) this.A00);
            }
        } else if (z) {
            AnonymousClass177 r1 = (AnonymousClass177) this.A00;
            Map map = r1.A02;
            map.put(obj, new WeakReference(obj2));
            int i = r1.A00 + 1;
            r1.A00 = i;
            if (i % 200 == 0) {
                ArrayList A0I = AnonymousClass001.A0I();
                for (Map.Entry entry : map.entrySet()) {
                    if (((Reference) entry.getValue()).get() == null) {
                        A0I.add(entry.getKey());
                    }
                }
                Iterator it = A0I.iterator();
                while (it.hasNext()) {
                    map.remove(it.next());
                }
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C35961jX(AnonymousClass1DE r2) {
        super(30);
        this.A00 = r2;
    }
}
