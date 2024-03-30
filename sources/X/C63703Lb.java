package X;

import android.util.Pair;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* renamed from: X.3Lb  reason: invalid class name and case insensitive filesystem */
public abstract class C63703Lb {
    public static final Pair A00(C18820ts r10, List list) {
        String A0J;
        String str;
        boolean A1a = C36341k9.A1a(list, r10);
        ArrayList A0I = AnonymousClass001.A0I();
        ArrayList A0I2 = AnonymousClass001.A0I();
        int size = list.size();
        String str2 = "";
        for (int i = 0; i < size; i++) {
            AnonymousClass141 contact = ((C87564Ph) list.get(i)).getContact();
            if (!(contact == null || (A0J = contact.A0J()) == null || A0J.length() == 0)) {
                String A0C = AnonymousClass14B.A0C(A0J, A1a ? 1 : 0);
                if (A0C != null) {
                    Locale A0x = C36401kF.A0x(r10);
                    AnonymousClass00C.A08(A0x);
                    str = A0C.toUpperCase(A0x);
                    AnonymousClass00C.A08(str);
                } else {
                    str = "";
                }
                if (Character.isDigit(str.codePointAt(0)) || "+".equals(str)) {
                    str = "#";
                }
                if (!str2.equals(str)) {
                    A0I.add(str);
                    AnonymousClass000.A1F(A0I2, i);
                    str2 = str;
                }
            }
        }
        return C36441kJ.A0Q(A0I, A0I2);
    }
}
