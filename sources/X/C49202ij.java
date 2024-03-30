package X;

import java.lang.ref.WeakReference;

/* renamed from: X.2ij  reason: invalid class name and case insensitive filesystem */
public class C49202ij extends C132446Tt {
    public final long A00;
    public final AnonymousClass1HJ A01;
    public final WeakReference A02;

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        return this.A01.A06(this.A00);
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        C107265Nh r2 = (C107265Nh) obj;
        AnonymousClass4PQ r0 = (AnonymousClass4PQ) this.A02.get();
        if (r0 != null) {
            r0.BSe(r2);
        }
    }

    public C49202ij(AnonymousClass4PQ r2, AnonymousClass1HJ r3, long j) {
        this.A01 = r3;
        this.A02 = AnonymousClass001.A0F(r2);
        this.A00 = j;
    }
}
