package X;

import java.util.Comparator;

/* renamed from: X.1HF  reason: invalid class name */
public final class AnonymousClass1HF implements Comparator {
    public /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        int i;
        AnonymousClass3KR r3 = (AnonymousClass3KR) obj;
        AnonymousClass3KR r4 = (AnonymousClass3KR) obj2;
        int i2 = 0;
        if (r3 == null) {
            i = 0;
        } else {
            i = r3.A01;
        }
        if (r4 != null) {
            i2 = r4.A01;
        }
        return i2 - i;
    }
}
