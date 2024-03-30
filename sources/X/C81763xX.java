package X;

import java.util.Comparator;

/* renamed from: X.3xX  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C81763xX implements Comparator {
    public static final /* synthetic */ C81763xX A00 = new C81763xX();

    public final int compare(Object obj, Object obj2) {
        C135066c4 r3 = (C135066c4) obj;
        C135066c4 r4 = (C135066c4) obj2;
        if (r3 == r4) {
            return 0;
        }
        if (r3 == null) {
            return -1;
        }
        if (r4 == null) {
            return 1;
        }
        String str = r3.A0F;
        if (str == null) {
            str = "";
        }
        String str2 = r4.A0F;
        if (str2 == null) {
            str2 = "";
        }
        return str.compareTo(str2);
    }
}
