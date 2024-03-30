package X;

import android.text.TextUtils;
import java.util.ArrayList;

/* renamed from: X.84G  reason: invalid class name */
public final class AnonymousClass84G extends AnonymousClass9UN {
    public int A00;
    public final ArrayList A01 = C36441kJ.A14(32);

    private void A01(String str) {
        if (!this.A02) {
            throw AnonymousClass001.A09("Expected object to be mutable");
        } else if (TextUtils.isEmpty(str)) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("key=");
            throw AnonymousClass000.A0c(str, A0u);
        }
    }

    public static void A00(AnonymousClass84G r1, Object obj, String str) {
        r1.A01(str);
        ArrayList arrayList = r1.A01;
        arrayList.add(str);
        arrayList.add(obj);
        r1.A00++;
    }

    public void A04(AnonymousClass9UN r1, String str) {
        A01(str);
        r1.A02();
        A00(this, r1, str);
        r1.A02();
        r1.A00 = this;
    }
}
