package X;

import android.view.View;
import java.util.Comparator;

/* renamed from: X.0t8  reason: invalid class name and case insensitive filesystem */
public class C18420t8 implements Comparator {
    public final int A00;

    public C18420t8(int i) {
        this.A00 = i;
    }

    public /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        int i;
        int i2;
        if (this.A00 != 0) {
            i = ((View) obj).getTop();
            i2 = ((View) obj2).getTop();
        } else {
            AnonymousClass0TK r3 = (AnonymousClass0TK) obj;
            AnonymousClass0TK r4 = (AnonymousClass0TK) obj2;
            int i3 = r3.A01 - r4.A01;
            if (i3 != 0) {
                return i3;
            }
            i = r3.A02;
            i2 = r4.A02;
        }
        return i - i2;
    }
}
