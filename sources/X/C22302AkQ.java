package X;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.AkQ  reason: case insensitive filesystem */
public final class C22302AkQ extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ Set $activityFilters;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22302AkQ(Set set) {
        super(1);
        this.$activityFilters = set;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Intent intent;
        ComponentName component;
        Activity activity = (Activity) obj;
        AnonymousClass00C.A0D(activity, 0);
        Set set = this.$activityFilters;
        boolean z = false;
        if (!(set instanceof Collection) || !set.isEmpty()) {
            Iterator it = set.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C132086Sb r2 = C132086Sb.A00;
                ComponentName componentName = ((AnonymousClass9V7) it.next()).A00;
                if (r2.A01(activity.getComponentName(), componentName) || !((intent = activity.getIntent()) == null || (component = intent.getComponent()) == null || !r2.A01(component, componentName))) {
                    z = true;
                }
            }
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
