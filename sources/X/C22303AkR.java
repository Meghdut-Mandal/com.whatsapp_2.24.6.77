package X;

import android.content.Intent;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.AkR  reason: case insensitive filesystem */
public final class C22303AkR extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ Set $activityFilters;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22303AkR(Set set) {
        super(1);
        this.$activityFilters = set;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Intent intent = (Intent) obj;
        AnonymousClass00C.A0D(intent, 0);
        Set set = this.$activityFilters;
        boolean z = false;
        if (!(set instanceof Collection) || !set.isEmpty()) {
            Iterator it = set.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (C132086Sb.A00.A01(intent.getComponent(), ((AnonymousClass9V7) it.next()).A00)) {
                        z = true;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        return Boolean.valueOf(z);
    }
}
