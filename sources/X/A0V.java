package X;

import java.util.Map;
import java.util.Set;

public class A0V implements B5X {
    public final Map A00 = AnonymousClass001.A0J();

    public void BWv(int i, int i2, String str, String str2) {
    }

    public void Bgv(C23077B3i b3i, C21664AUg aUg, C21664AUg aUg2, Integer num) {
    }

    public void BhF(C23077B3i b3i, String str, long j, long j2) {
    }

    public void Bgt(C23077B3i b3i, C21664AUg aUg) {
        String str = aUg.A07;
        String A002 = C1895394e.A00(str);
        Map map = this.A00;
        if (!map.containsKey(A002)) {
            map.put(A002, C36441kJ.A16());
        }
        ((Set) map.get(A002)).add(Integer.valueOf(str.hashCode()));
    }

    public void Bgu(C23077B3i b3i, C21664AUg aUg) {
        String str = aUg.A07;
        String A002 = C1895394e.A00(str);
        Map map = this.A00;
        Set set = (Set) map.get(A002);
        if (set != null) {
            set.remove(Integer.valueOf(str.hashCode()));
            if (set.isEmpty()) {
                map.remove(A002);
            }
        }
    }
}
