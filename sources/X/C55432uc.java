package X;

import android.app.Activity;
import android.content.res.Resources;
import com.whatsapp.R;
import com.whatsapp.util.Log;
import java.util.Set;

/* renamed from: X.2uc  reason: invalid class name and case insensitive filesystem */
public abstract class C55432uc {
    public static final AnonymousClass0FM A00(Activity activity, AnonymousClass17Y r15, AnonymousClass1X4 r16, AnonymousClass1H2 r17, AnonymousClass331 r18, Set set) {
        AnonymousClass17Y r9 = r15;
        AnonymousClass00C.A0D(r15, 1);
        AnonymousClass1X4 r10 = r16;
        AnonymousClass1H2 r6 = r17;
        Set set2 = set;
        C36321k7.A12(r6, r10, set2);
        if (set2.isEmpty()) {
            Log.e("dialog/delete no statuses");
            return null;
        }
        Resources resources = activity.getResources();
        int size = set2.size();
        Object[] objArr = new Object[1];
        AnonymousClass000.A1L(objArr, set2.size(), 0);
        String quantityString = resources.getQuantityString(R.plurals.f10nameremoved, size, objArr);
        AnonymousClass00C.A08(quantityString);
        Resources resources2 = activity.getResources();
        C39001qm A00 = AnonymousClass3LW.A00(activity);
        A00.A0a(true);
        A00.A0Z(AnonymousClass3UG.A05(activity, r6, quantityString));
        A00.setPositiveButton(R.string.f12nameremoved, new AnonymousClass4X7(activity, resources2, r9, r10, r18, set2, 1));
        A00.setNegativeButton(R.string.f12nameremoved, new AnonymousClass4XP(activity, 43));
        A00.A0N(new AnonymousClass4XV(activity, 19));
        return A00.create();
    }
}
