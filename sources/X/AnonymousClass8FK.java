package X;

import android.os.Bundle;
import java.util.ArrayList;

/* renamed from: X.8FK  reason: invalid class name */
public final class AnonymousClass8FK extends AnonymousClass95Z {
    public final int A00;
    public final long A01;

    public AnonymousClass8FK(int i, long j) {
        this.A00 = i;
        this.A01 = j;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof AnonymousClass95Z) {
                AnonymousClass8FK r8 = (AnonymousClass8FK) ((AnonymousClass95Z) obj);
                if (!(this.A00 == r8.A00 && this.A01 == r8.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j = this.A01;
        return ((this.A00 ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public static void A00(Bundle bundle, ArrayList arrayList, int i) {
        arrayList.add(new AnonymousClass8FK(i, System.currentTimeMillis()));
        bundle.putParcelableArrayList("event_timestamps", new ArrayList(AnonymousClass95Y.A00(arrayList)));
    }

    public final String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("EventRecord{eventType=");
        A0u.append(this.A00);
        A0u.append(", eventTimestamp=");
        A0u.append(this.A01);
        return AnonymousClass000.A0q("}", A0u);
    }
}
