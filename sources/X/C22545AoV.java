package X;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.AoV  reason: case insensitive filesystem */
public final class C22545AoV extends AnonymousClass00R implements C009003v {
    public final /* synthetic */ Set $splitPairFilters;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22545AoV(Set set) {
        super(2);
        this.$splitPairFilters = set;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        Activity activity = (Activity) obj;
        Intent intent = (Intent) obj2;
        C36321k7.A0w(activity, intent);
        Set set = this.$splitPairFilters;
        boolean z = false;
        if (!(set instanceof Collection) || !set.isEmpty()) {
            Iterator it = set.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                AnonymousClass9VJ r3 = (AnonymousClass9VJ) it.next();
                ComponentName componentName = activity.getComponentName();
                C132086Sb r2 = C132086Sb.A00;
                if (r2.A01(componentName, r3.A00) && r2.A01(intent.getComponent(), r3.A01)) {
                    z = true;
                    break;
                }
            }
        }
        return Boolean.valueOf(z);
    }
}
