package X;

import android.text.TextUtils;
import android.util.Pair;
import java.io.File;
import java.util.HashMap;

/* renamed from: X.6mP  reason: invalid class name and case insensitive filesystem */
public abstract class C140936mP implements C157907es {
    public File BJG(C118645oV r5, int i) {
        HashMap A0J = AnonymousClass001.A0J();
        if (r5 != null) {
            A0J.putAll(r5.A00);
        }
        AnonymousClass6O6 r3 = ((C98464rT) this).A00;
        Pair A00 = C109555Ya.A00(i);
        if (TextUtils.isEmpty((CharSequence) null)) {
            return r3.A01(C36441kJ.A0Q(A00.first, A00.second));
        }
        throw AnonymousClass001.A0A("contains");
    }
}
