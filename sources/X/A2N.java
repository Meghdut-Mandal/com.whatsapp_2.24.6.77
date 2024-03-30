package X;

import android.util.SparseArray;
import java.util.Collections;
import java.util.Map;

public class A2N implements B4X {
    public static final Map A01 = Collections.emptyMap();
    public final SparseArray A00;

    public A2N(C203089nH r4, C194239Ot r5, C188348zR r6, C188348zR r7) {
        SparseArray sparseArray = new SparseArray();
        this.A00 = sparseArray;
        sparseArray.put(B4X.A0Y.A00, r6);
        sparseArray.put(B4X.A0c.A00, r7);
        sparseArray.put(B4X.A0a.A00, r4);
        sparseArray.put(B4X.A0H.A00, r5);
        sparseArray.put(B4X.A0N.A00, false);
        sparseArray.put(B4X.A0Z.A00, false);
        sparseArray.put(B4X.A0O.A00, false);
        sparseArray.put(B4X.A03.A00, false);
    }

    public Object B84(C191269Ch r4) {
        SparseArray sparseArray = this.A00;
        int i = r4.A00;
        Object obj = sparseArray.get(i);
        if (obj != null) {
            return obj;
        }
        if (i == 0) {
            return Boolean.TRUE;
        }
        if (!(i == 3 || i == 26 || i == 7 || i == 8)) {
            int i2 = 0;
            if (i != 23) {
                i2 = -1;
                if (i != 24) {
                    if (!(i == 30 || i == 31)) {
                        switch (i) {
                            case 10:
                            case 11:
                            case 13:
                            case 14:
                                break;
                            case 12:
                                return A01;
                            default:
                                switch (i) {
                                    case 16:
                                    case 17:
                                    case 18:
                                        break;
                                    default:
                                        switch (i) {
                                            case 33:
                                            case 34:
                                            case 35:
                                            case 36:
                                            case 37:
                                            case 38:
                                            case 39:
                                            case 40:
                                            case 41:
                                            case 42:
                                                break;
                                            default:
                                                throw C165567td.A0U("Invalid Settings key: ", AnonymousClass000.A0u(), i);
                                        }
                                }
                        }
                    }
                }
            }
            return Integer.valueOf(i2);
        }
        return Boolean.FALSE;
    }
}
