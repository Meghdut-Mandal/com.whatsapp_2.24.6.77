package X;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: X.0tU  reason: invalid class name and case insensitive filesystem */
public class C18640tU implements C003801r {
    public Object A00;
    public final int A01;

    public C18640tU(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final Bundle BpH() {
        switch (this.A01) {
            case 0:
                return ((AnonymousClass01G) this.A00).A1X();
            case 1:
                Bundle A07 = AnonymousClass001.A07();
                ((AnonymousClass01L) this.A00).A23();
                return A07;
            case 2:
                return ((AnonymousClass01I) this.A00).A1k();
            case 3:
                return ((AnonymousClass01z) this.A00).A0J();
            default:
                AnonymousClass08M r3 = (AnonymousClass08M) this.A00;
                Iterator A0y = AnonymousClass000.A0y(C000400e.A0B(r3.A04));
                while (A0y.hasNext()) {
                    Map.Entry A11 = AnonymousClass000.A11(A0y);
                    r3.A03((String) A11.getKey(), ((C003801r) A11.getValue()).BpH());
                }
                Map map = r3.A03;
                Set keySet = map.keySet();
                ArrayList arrayList = new ArrayList(keySet.size());
                ArrayList arrayList2 = new ArrayList(arrayList.size());
                for (Object next : keySet) {
                    arrayList.add(next);
                    arrayList2.add(map.get(next));
                }
                return C05430Pr.A00(new AnonymousClass011("keys", arrayList), new AnonymousClass011("values", arrayList2));
        }
    }
}
