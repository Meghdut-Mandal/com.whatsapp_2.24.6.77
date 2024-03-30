package X;

import android.text.TextUtils;
import java.util.ArrayList;

/* renamed from: X.2um  reason: invalid class name and case insensitive filesystem */
public abstract class C55532um {
    public static final String A00(AnonymousClass1XQ[] r4) {
        AnonymousClass00C.A0D(r4, 0);
        ArrayList A14 = C36441kJ.A14(r3);
        for (AnonymousClass1XQ valueOf : r4) {
            A14.add(String.valueOf(valueOf));
        }
        String join = TextUtils.join(" ", A14);
        AnonymousClass00C.A08(join);
        return join;
    }
}
