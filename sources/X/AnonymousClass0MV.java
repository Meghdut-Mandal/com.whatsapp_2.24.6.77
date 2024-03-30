package X;

import java.util.AbstractMap;

/* renamed from: X.0MV  reason: invalid class name */
public final class AnonymousClass0MV extends AnonymousClass0MZ {
    public final /* synthetic */ C04840Mf zza;

    public AnonymousClass0MV(C04840Mf r1) {
        this.zza = r1;
    }

    public final /* bridge */ /* synthetic */ Object get(int i) {
        C04800Mb r1 = this.zza.zza;
        C04800Mb r0 = C04800Mb.A04;
        return new AbstractMap.SimpleImmutableEntry(r1.A01.A01.get(i), this.zza.zza.A00.get(i));
    }

    public final int size() {
        return this.zza.zza.size();
    }
}
