package X;

import com.google.protobuf.CodedOutputStream;
import java.util.AbstractMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.9hI  reason: invalid class name and case insensitive filesystem */
public class C200369hI {
    public static int A00(Object obj, Object obj2, int i) {
        AbstractMap abstractMap = (AbstractMap) obj;
        C192959Jh r9 = (C192959Jh) obj2;
        int i2 = 0;
        if (!abstractMap.isEmpty()) {
            Iterator A10 = C36371kC.A10(abstractMap);
            while (A10.hasNext()) {
                Map.Entry A11 = AnonymousClass000.A11(A10);
                Object key = A11.getKey();
                Object value = A11.getValue();
                int A05 = C1897895p.A05(i);
                AnonymousClass9LV r3 = r9.A00;
                int A00 = C202649mM.A00(r3.A00, key, 1) + C202649mM.A00(r3.A01, value, 2);
                boolean z = CodedOutputStream.A01;
                i2 += A05 + C165567td.A00(A00) + A00;
            }
        }
        return i2;
    }

    public static C21903AcX A01(Object obj, Object obj2) {
        C21903AcX acX = (C21903AcX) obj;
        AbstractMap abstractMap = (AbstractMap) obj2;
        if (!abstractMap.isEmpty()) {
            if (!acX.isMutable) {
                acX = C165597tg.A0M(acX);
            }
            if (!acX.isMutable) {
                throw AnonymousClass001.A0D();
            } else if (!abstractMap.isEmpty()) {
                acX.putAll(abstractMap);
            }
        }
        return acX;
    }
}
