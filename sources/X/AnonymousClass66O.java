package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

/* renamed from: X.66O  reason: invalid class name */
public abstract class AnonymousClass66O {
    public Map A00;
    public final Map A01 = AnonymousClass001.A0J();

    public final Object A00(Object obj) {
        Map map = this.A00;
        if (map == null || map.isEmpty()) {
            return null;
        }
        return A01(obj, this.A00);
    }

    public Object A01(Object obj, Map map) {
        Integer num;
        if (this instanceof AnonymousClass5AH) {
            AnonymousClass5AH r3 = (AnonymousClass5AH) this;
            AnonymousClass00C.A0D(map, 0);
            if (!(!map.isEmpty())) {
                return new AnonymousClass5HU();
            }
            int size = map.size();
            Collection<C132286Sy> values = map.values();
            if (size <= 1) {
                return new AnonymousClass5HW(r3.A02((C132286Sy) C007103b.A0H(values)));
            }
            ArrayList A0J = C36321k7.A0J(values);
            for (C132286Sy A02 : values) {
                A0J.add(r3.A02(A02));
            }
            return new AnonymousClass5HX(A0J);
        } else if (this instanceof AnonymousClass5AF) {
            AnonymousClass00C.A0D(map, 0);
            if (C90484aE.A1Y(map, 4177005)) {
                return new AnonymousClass5Uv();
            }
            if (C90484aE.A1Y(map, 1675030)) {
                return new C108765Uu();
            }
            if (C90484aE.A1Y(map, 4177007)) {
                return new C108785Ux();
            }
            if (C90484aE.A1Y(map, 4177006)) {
                return new C108775Uw();
            }
            if (C90484aE.A1Y(map, 4177004)) {
                return new C108805Uz();
            }
            if (C90484aE.A1Y(map, 4177001)) {
                return new C108795Uy();
            }
            if (!(!map.isEmpty())) {
                return null;
            }
            C132286Sy r0 = (C132286Sy) C007103b.A0I(map.values());
            if (r0 != null) {
                num = Integer.valueOf(r0.A01);
            } else {
                num = null;
            }
            return new C108755Ut(num);
        } else if (this instanceof AnonymousClass5AG) {
            return ((AnonymousClass5AG) this).A02((C122855vX) obj, map);
        } else {
            AnonymousClass00C.A0D(map, 0);
            if (!(!map.isEmpty())) {
                return new C101224xC();
            }
            int size2 = map.size();
            Collection values2 = map.values();
            if (size2 > 1) {
                return new C101204xA(C007103b.A0Y(values2));
            }
            return new C101214xB((C132286Sy) C007103b.A0H(values2));
        }
    }
}
