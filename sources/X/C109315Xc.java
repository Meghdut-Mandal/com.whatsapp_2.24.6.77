package X;

import java.util.List;

/* renamed from: X.5Xc  reason: invalid class name and case insensitive filesystem */
public abstract class C109315Xc {
    public static final String A00(CharSequence charSequence, List list) {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("");
        int size = list.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            i++;
            if (i > 1) {
                A0u.append(charSequence);
            }
            if (obj != null && !(obj instanceof CharSequence)) {
                if (obj instanceof Character) {
                    A0u.append(((Character) obj).charValue());
                } else {
                    obj = String.valueOf(obj);
                }
            }
            A0u.append((CharSequence) obj);
        }
        A0u.append("");
        return A0u.toString();
    }
}
