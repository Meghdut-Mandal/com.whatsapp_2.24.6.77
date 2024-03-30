package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.9dz  reason: invalid class name and case insensitive filesystem */
public class C198659dz {
    public final String A00;
    public final List A01;

    public static List A00(C198659dz r2, String str, String str2) {
        AnonymousClass6LG r1 = new AnonymousClass6LG(str, str2);
        List list = r2.A01;
        list.add(r1);
        return list;
    }

    public static void A01(C198659dz r2, String str) {
        r2.A01.add(new AnonymousClass6LG(str, "_id"));
    }

    public static void A02(String str, String str2, List list) {
        list.add(new AnonymousClass6LG(str, str2));
    }

    public C198659dz(String str, List list) {
        ArrayList A0I = AnonymousClass001.A0I();
        this.A01 = A0I;
        this.A00 = str;
        A0I.addAll(list);
    }

    public C198659dz(String str) {
        this.A01 = AnonymousClass001.A0I();
        this.A00 = str;
    }
}
