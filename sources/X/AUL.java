package X;

import java.io.Serializable;
import java.util.Map;

public class AUL implements Serializable {
    public static final long serialVersionUID = 0;
    public final Object keys;
    public final Object values;

    public final Object legacyReadResolve() {
        Object[] objArr = (Object[]) this.keys;
        Object[] objArr2 = (Object[]) this.values;
        C20090x0 makeBuilder = makeBuilder(objArr.length);
        for (int i = 0; i < objArr.length; i++) {
            makeBuilder.put(objArr[i], objArr2[i]);
        }
        return makeBuilder.build();
    }

    public C20090x0 makeBuilder(int i) {
        return new C20090x0(i);
    }

    public final Object readResolve() {
        Object obj = this.keys;
        if (!(obj instanceof C20760y7)) {
            return legacyReadResolve();
        }
        C20750y6 r2 = (C20750y6) obj;
        C20090x0 makeBuilder = makeBuilder(r2.size());
        C225614x it = r2.iterator();
        C225614x it2 = ((C20750y6) this.values).iterator();
        while (it.hasNext()) {
            makeBuilder.put(it.next(), it2.next());
        }
        return makeBuilder.build();
    }

    public AUL(C20070wy r7) {
        Object[] objArr = new Object[r7.size()];
        Object[] objArr2 = new Object[r7.size()];
        C225614x it = r7.entrySet().iterator();
        int i = 0;
        while (it.hasNext()) {
            Map.Entry A11 = AnonymousClass000.A11(it);
            objArr[i] = A11.getKey();
            objArr2[i] = A11.getValue();
            i++;
        }
        this.keys = objArr;
        this.values = objArr2;
    }
}
