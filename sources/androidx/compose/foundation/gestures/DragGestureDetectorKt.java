package androidx.compose.foundation.gestures;

import X.AnonymousClass6E5;
import X.C120675rt;
import X.C158747iA;
import X.C163947r1;
import java.util.List;

public abstract class DragGestureDetectorKt {
    public static final float A00 = (((float) 0.125d) / ((float) 18));
    public static final C158747iA A01 = new C163947r1(0);
    public static final C158747iA A02 = new C163947r1(1);

    public static final boolean A00(C120675rt r7, long j) {
        Object obj;
        List list = r7.A02;
        int size = list.size();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = list.get(i);
            if (((AnonymousClass6E5) obj).A05 == j) {
                break;
            }
            i++;
        }
        AnonymousClass6E5 r3 = (AnonymousClass6E5) obj;
        if (r3 != null && r3.A0B) {
            z = true;
        }
        return true ^ z;
    }
}
