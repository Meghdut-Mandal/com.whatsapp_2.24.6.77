package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: X.0Jb  reason: invalid class name and case insensitive filesystem */
public final class C04050Jb extends C12030hO {
    public final ArrayList A00;
    public final /* synthetic */ C10300e1 A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C04050Jb(C10300e1 r1, ArrayList arrayList) {
        super(r1);
        this.A01 = r1;
        this.A00 = arrayList;
    }

    public final void A00() {
        Set hashSet;
        C10300e1 r6 = this.A01;
        C10340e5 r8 = r6.A0D;
        AnonymousClass0JO r5 = r8.A07;
        AnonymousClass0TT r1 = r6.A0E;
        if (r1 == null) {
            hashSet = Collections.emptySet();
        } else {
            hashSet = new HashSet(r1.A05);
            Map map = r1.A04;
            Iterator A10 = AnonymousClass000.A10(map);
            while (A10.hasNext()) {
                C06190Sq r2 = (C06190Sq) A10.next();
                if (!r8.A0A.containsKey(r2.A01)) {
                    map.get(r2);
                    throw AnonymousClass001.A0A("zaa");
                }
            }
        }
        r5.A01 = hashSet;
        ArrayList arrayList = this.A00;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((C17590rf) arrayList.get(i)).BGd(r6.A00, r5.A01);
        }
    }
}
