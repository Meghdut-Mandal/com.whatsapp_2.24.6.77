package X;

import android.content.Context;
import com.whatsapp.R;
import java.util.Locale;

/* renamed from: X.2rm  reason: invalid class name and case insensitive filesystem */
public abstract class C53722rm {
    public static String A00(Context context, AnonymousClass171 r6, C18820ts r7, AnonymousClass141 r8) {
        String A0J = r6.A0J(r8);
        if (A0J == null) {
            A0J = "";
        }
        String A0G = r7.A0G(context.getString(R.string.f12nameremoved));
        String A0G2 = r7.A0G(A0J);
        String string = context.getString(R.string.f12nameremoved);
        Locale A0x = C36401kF.A0x(r7);
        Object[] A0M = AnonymousClass001.A0M();
        C36331k8.A1N(A0G2, A0G, A0M);
        return String.format(A0x, string, A0M);
    }
}
