package X;

import java.util.List;

/* renamed from: X.0UM  reason: invalid class name */
public final class AnonymousClass0UM {
    public final Object A00;
    public final List A01 = AnonymousClass001.A0I();

    public void A00(Object obj, String str) {
        List list = this.A01;
        AnonymousClass006.A01(str);
        list.add(AnonymousClass000.A0p("=", String.valueOf(obj), AnonymousClass000.A0v(str)));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(100);
        AnonymousClass000.A1C(this.A00, sb);
        sb.append('{');
        List list = this.A01;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            sb.append((String) list.get(i));
            if (i < size - 1) {
                sb.append(", ");
            }
        }
        return AnonymousClass000.A0s(sb);
    }

    public /* synthetic */ AnonymousClass0UM(Object obj) {
        AnonymousClass006.A01(obj);
        this.A00 = obj;
    }
}
