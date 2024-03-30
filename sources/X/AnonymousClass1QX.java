package X;

import com.whatsapp.HomeActivity;
import java.util.Comparator;

/* renamed from: X.1QX  reason: invalid class name */
public final /* synthetic */ class AnonymousClass1QX implements Comparator {
    public final /* synthetic */ HomeActivity A00;

    public /* synthetic */ AnonymousClass1QX(HomeActivity homeActivity) {
        this.A00 = homeActivity;
    }

    public final int compare(Object obj, Object obj2) {
        HomeActivity homeActivity = this.A00;
        return Integer.compare(homeActivity.A08.A04(((Number) obj).intValue()), homeActivity.A08.A04(((Number) obj2).intValue()));
    }
}
