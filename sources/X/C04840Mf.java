package X;

import java.util.Iterator;
import java.util.Map;

/* renamed from: X.0Mf  reason: invalid class name and case insensitive filesystem */
public final class C04840Mf extends C04860Mh {
    public final /* synthetic */ C04800Mb zza;

    public final boolean A0B() {
        return false;
    }

    public C04840Mf(C04800Mb r1) {
        this.zza = r1;
    }

    public final AnonymousClass0MZ A09() {
        return new AnonymousClass0MV(this);
    }

    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = this.zza.get(entry.getKey());
            if (obj2 == null || !obj2.equals(entry.getValue())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = 0;
        for (Object A0J : this.zza.A02()) {
            i += AnonymousClass000.A0J(A0J);
        }
        return i;
    }

    public final int size() {
        return this.zza.size();
    }

    public final C12200hf A07() {
        return A0A().listIterator(0);
    }

    public final /* synthetic */ Iterator iterator() {
        return A0A().listIterator(0);
    }

    public C04840Mf() {
    }
}
