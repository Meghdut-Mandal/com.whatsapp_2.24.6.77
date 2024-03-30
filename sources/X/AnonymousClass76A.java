package X;

import java.util.Comparator;

/* renamed from: X.76A  reason: invalid class name */
public final /* synthetic */ class AnonymousClass76A implements Comparator {
    public static final /* synthetic */ AnonymousClass76A A00 = new AnonymousClass76A();

    public final int compare(Object obj, Object obj2) {
        Object obj3;
        Object obj4;
        C175848bA r4 = (C175848bA) obj2;
        C135086c7 r0 = ((C175848bA) obj).A01;
        if (r0 == null) {
            obj3 = null;
        } else {
            obj3 = r0.A00;
        }
        String str = (String) obj3;
        C18740tg.A06(str);
        C135086c7 r02 = r4.A01;
        if (r02 == null) {
            obj4 = null;
        } else {
            obj4 = r02.A00;
        }
        String str2 = (String) obj4;
        C18740tg.A06(str2);
        return str.compareTo(str2);
    }
}
