package X;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.whatsapp.R;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.3RT  reason: invalid class name */
public abstract class AnonymousClass3RT {
    public static final boolean A00 = C36371kC.A1T(Build.VERSION.SDK_INT, 23);

    public static ArrayList A01(List list, Set set) {
        AnonymousClass1XQ[] r3;
        String str;
        if (set == null || list == null) {
            return C36441kJ.A14(0);
        }
        ArrayList A0I = AnonymousClass001.A0I();
        HashSet A16 = C36441kJ.A16();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C135066c4 r4 = (C135066c4) it.next();
            AnonymousClass3S2 r0 = r4.A04;
            if (r0 != null && (r3 = r0.A0D) != null) {
                int length = r3.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    } else if (!set.contains(r3[i]) || (str = r4.A0E) == null || A16.contains(str)) {
                        i++;
                    } else {
                        A0I.add(r4);
                        String str2 = r4.A0E;
                        if (str2 != null) {
                            A16.add(str2);
                        }
                    }
                }
            }
        }
        return A0I;
    }

    public static String A00(Context context, C135066c4 r3) {
        String str = r3.A08;
        if (TextUtils.isEmpty(str)) {
            return context.getString(R.string.f12nameremoved);
        }
        return C36321k7.A0A(context, str, R.string.f12nameremoved);
    }
}
