package X;

import android.content.Context;
import java.util.List;
import java.util.Map;

/* renamed from: X.3FX  reason: invalid class name */
public final class AnonymousClass3FX {
    public final Map A00;

    public AnonymousClass3FX(Map map) {
        AnonymousClass00C.A0D(map, 1);
        this.A00 = map;
    }

    public final void A00(Context context, AnonymousClass3T1 r6) {
        C23043B1o b1o;
        C207219uk BA8;
        C207089uX r2;
        C206499tV r0;
        C36331k8.A1I(context, r6);
        if (!(!(r6 instanceof C23043B1o) || (b1o = (C23043B1o) r6) == null || (BA8 = b1o.BA8()) == null || (r2 = BA8.A04) == null)) {
            if (r2.A01 != 2 || (r0 = r2.A00) == null) {
                List list = r2.A03;
                if (list.size() > 0 && ((C206569tc) list.get(0)).A00) {
                    return;
                }
            } else if (r0.A00) {
                return;
            }
        }
        A01(context, r6, 0);
    }

    public final void A01(Context context, AnonymousClass3T1 r6, int i) {
        C23043B1o b1o;
        C207219uk BA8;
        int i2;
        Map map;
        Integer num;
        int i3;
        boolean A1a = C36331k8.A1a(context, r6);
        if ((r6 instanceof C23043B1o) && (b1o = (C23043B1o) r6) != null && (BA8 = b1o.BA8()) != null && (i2 = BA8.A00) != 0) {
            switch (i2) {
                case 1:
                    map = this.A00;
                    i3 = 2;
                    break;
                case 2:
                case 6:
                    map = this.A00;
                    num = Integer.valueOf(A1a ? 1 : 0);
                    break;
                case 3:
                    map = this.A00;
                    i3 = 3;
                    break;
                case 4:
                    map = this.A00;
                    i3 = 4;
                    break;
                case 5:
                case 7:
                case 9:
                    map = this.A00;
                    i3 = 5;
                    break;
                default:
                    return;
            }
            num = Integer.valueOf(i3);
            C87734Py r0 = (C87734Py) map.get(num);
            if (r0 != null) {
                r0.BlQ(context, r6, BA8, i);
            }
        }
    }
}
