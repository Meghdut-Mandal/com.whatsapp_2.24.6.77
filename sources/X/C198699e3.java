package X;

import android.text.TextUtils;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.9e3  reason: invalid class name and case insensitive filesystem */
public class C198699e3 {
    public final String A00;
    public final List A01 = AnonymousClass001.A0I();

    @Deprecated
    public static B66 A00(C198699e3 r3) {
        for (AnonymousClass9F5 r0 : r3.A01) {
            Iterator A0r = C90474aD.A0r(r0.A00.values());
            while (true) {
                if (A0r.hasNext()) {
                    B66 b66 = (B66) A0r.next();
                    if (b66.BLW()) {
                        return b66;
                    }
                }
            }
        }
        return null;
    }

    public B66 A01(String str) {
        B66 b66;
        if (str == null || str.equals(((AnonymousClass16V) AnonymousClass16W.A06).A02)) {
            return A00(this);
        }
        for (AnonymousClass9F5 r1 : this.A01) {
            if (!TextUtils.isEmpty(str)) {
                String A0Z = C165617ti.A0Z(str);
                Map map = r1.A00;
                if (map.containsKey(A0Z) && (b66 = (B66) map.get(A0Z)) != null) {
                    return b66;
                }
            }
        }
        return null;
    }

    public C198699e3(String str) {
        C18740tg.A05(str);
        this.A00 = str;
    }
}
