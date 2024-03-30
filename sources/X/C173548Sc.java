package X;

import java.util.Iterator;
import java.util.Map;

/* renamed from: X.8Sc  reason: invalid class name and case insensitive filesystem */
public class C173548Sc extends C21889AcH<FieldDescriptorType, Object> {
    public void A05() {
        Iterable entrySet;
        if (!this.A03) {
            if (0 < this.A00.size()) {
                ((Map.Entry) this.A00.get(0)).getKey();
                throw AnonymousClass001.A0A("isRepeated");
            }
            if (this.A01.isEmpty()) {
                entrySet = C190769Af.A00;
            } else {
                entrySet = this.A01.entrySet();
            }
            Iterator it = entrySet.iterator();
            if (it.hasNext()) {
                AnonymousClass000.A11(it).getKey();
                throw AnonymousClass001.A0A("isRepeated");
            }
        }
        super.A05();
    }

    public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        return super.put((Comparable) obj, obj2);
    }

    public C173548Sc(int i) {
        super(i);
    }
}
