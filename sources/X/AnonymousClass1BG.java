package X;

import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.1BG  reason: invalid class name */
public final class AnonymousClass1BG extends AnonymousClass12N {
    public Map A00 = new HashMap();

    public synchronized void A09() {
        this.A00.clear();
    }

    public synchronized String BHv() {
        StringBuilder sb;
        sb = new StringBuilder("fpspc/");
        int i = 0;
        int i2 = 0;
        for (WeakReference weakReference : this.A00.values()) {
            List list = (List) weakReference.get();
            if (list != null) {
                i++;
                i2 += list.size();
            }
        }
        sb.append("s=");
        sb.append(i);
        sb.append("/el=");
        sb.append(i2);
        return sb.toString();
    }

    public synchronized void Bjh(AnonymousClass5SK r5, boolean z) {
        Map map = this.A00;
        for (WeakReference weakReference : map.values()) {
            List list = (List) weakReference.get();
            if (list != null) {
                list.clear();
            }
            weakReference.clear();
        }
        map.clear();
    }

    public AnonymousClass1BG(C220112n r2) {
        super(r2);
        A08();
    }
}
