package X;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.res.Resources;
import com.whatsapp.R;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: X.2vI  reason: invalid class name and case insensitive filesystem */
public abstract class C55852vI {
    public static AnonymousClass0FM A00(Activity activity, DialogInterface.OnCancelListener onCancelListener, DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2, AnonymousClass171 r16, AnonymousClass141 r17, AnonymousClass1H2 r18, ArrayList arrayList, Map map) {
        Resources resources;
        int i;
        String string;
        Resources resources2;
        int i2;
        AnonymousClass141 r3 = r17;
        if (map != null && map.size() == 1) {
            r3 = C36391kE.A0f(AnonymousClass000.A0z(map));
            map.clear();
        }
        AnonymousClass171 r6 = r16;
        if (map == null || map.isEmpty()) {
            if (r3 == null || !r3.A0G()) {
                if (arrayList == null || arrayList.size() <= 1) {
                    resources = activity.getResources();
                    i = R.string.f12nameremoved;
                    Object[] objArr = new Object[1];
                    C36361kB.A1F(r6, r3, objArr, 0);
                    string = resources.getString(i, objArr);
                } else {
                    resources2 = activity.getResources();
                    i2 = R.plurals.f10nameremoved;
                }
            } else if (arrayList == null || arrayList.size() <= 1) {
                resources = activity.getResources();
                i = R.string.f12nameremoved;
                Object[] objArr2 = new Object[1];
                C36361kB.A1F(r6, r3, objArr2, 0);
                string = resources.getString(i, objArr2);
            } else {
                resources2 = activity.getResources();
                i2 = R.plurals.f10nameremoved;
            }
            int size = arrayList.size();
            Object[] objArr3 = new Object[2];
            AnonymousClass000.A1L(objArr3, arrayList.size(), 0);
            C36361kB.A1F(r6, r3, objArr3, 1);
            string = resources2.getQuantityString(i2, size, objArr3);
        } else {
            String A0Y = r6.A0Y(map.values(), 3, -1, false, true);
            if (arrayList == null || arrayList.size() <= 1) {
                string = C36411kG.A0w(activity.getResources(), A0Y, new Object[1], 0, R.string.f12nameremoved);
            } else {
                Resources resources3 = activity.getResources();
                int size2 = arrayList.size();
                Object[] objArr4 = new Object[2];
                AnonymousClass000.A1L(objArr4, arrayList.size(), 0);
                objArr4[1] = A0Y;
                string = resources3.getQuantityString(R.plurals.f10nameremoved, size2, objArr4);
            }
        }
        C39001qm A00 = AnonymousClass3LW.A00(activity);
        A00.A0p(AnonymousClass3UG.A05(activity, r18, string));
        A00.A0r(true);
        A00.A0f(onClickListener2, R.string.f12nameremoved);
        A00.A0h(onClickListener, R.string.f12nameremoved);
        A00.A0e(onCancelListener);
        return A00.create();
    }
}
