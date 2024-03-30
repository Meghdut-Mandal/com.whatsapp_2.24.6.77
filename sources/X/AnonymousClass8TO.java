package X;

import java.util.List;

/* renamed from: X.8TO  reason: invalid class name */
public class AnonymousClass8TO extends C196179Ya {
    public List A00;
    public final String A01;
    public final String A02;

    public AnonymousClass8TO(String str, List list) {
        String str2;
        StringBuilder A0v = AnonymousClass000.A0v(str);
        if (list == null || list.size() <= 0) {
            str2 = "()";
        } else {
            str2 = "(...)";
        }
        this.A02 = AnonymousClass000.A0q(str2, A0v);
        if (str != null) {
            this.A01 = str;
            this.A00 = list;
            return;
        }
        this.A00 = null;
    }
}
