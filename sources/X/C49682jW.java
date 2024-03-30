package X;

import java.lang.ref.WeakReference;
import java.util.Set;

/* renamed from: X.2jW  reason: invalid class name and case insensitive filesystem */
public final class C49682jW extends C132446Tt {
    public AnonymousClass1X4 A00;
    public WeakReference A01;
    public final long A02;
    public final AnonymousClass11F A03;
    public final Integer A04;
    public final boolean A05;
    public final boolean A06;

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        AnonymousClass1X4 r4 = this.A00;
        AnonymousClass11F r8 = this.A03;
        boolean z = this.A06;
        boolean z2 = this.A05;
        r4.A09.A02(r8, (Integer) null, (String) null, (String) null, this.A04.intValue(), 4, false);
        r4.A0B.A00(r8, 4);
        AnonymousClass196 r5 = r4.A0D;
        Set A09 = r5.A09(r8, !z, z2);
        r4.A0X.A0d(r8, (Long) null, z, z2);
        C56122vm.A00.put(r8, false);
        r5.A0Q(A09);
        C20500xf r11 = r4.A0k;
        C19770wU r0 = r4.A1J;
        C65093Qs.A01(r4.A0Z, r11, r4.A0l, r8, r0, C36401kF.A0i(), (Integer) null, 5);
        C225314u.A0S(this.A02, 300);
        return null;
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        Runnable runnable;
        WeakReference weakReference = this.A01;
        if (weakReference != null && (runnable = (Runnable) weakReference.get()) != null) {
            runnable.run();
        }
    }

    public C49682jW(AnonymousClass1X4 r2, AnonymousClass11F r3, Integer num, Runnable runnable, long j, boolean z, boolean z2) {
        this.A00 = r2;
        this.A01 = AnonymousClass001.A0F(runnable);
        this.A03 = r3;
        this.A06 = z;
        this.A05 = z2;
        this.A02 = j;
        this.A04 = num;
    }
}
