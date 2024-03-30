package X;

import java.lang.ref.WeakReference;

/* renamed from: X.2jx  reason: invalid class name and case insensitive filesystem */
public class C49952jx extends C132446Tt {
    public final C02680Bk A00 = new C02680Bk();
    public final C18820ts A01;
    public final AnonymousClass3D9 A02;
    public final C64613Or A03;
    public final AnonymousClass1DF A04;
    public final AnonymousClass11F A05;
    public final WeakReference A06;

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        AnonymousClass1DF r2 = this.A04;
        AnonymousClass11F r3 = this.A05;
        int A012 = r2.A01(new AnonymousClass3M7(this, 1), r3, Integer.MAX_VALUE);
        C64613Or r0 = this.A03;
        C02680Bk r1 = this.A00;
        return Integer.valueOf(A012 + r0.A01(r1, r3) + this.A02.A00(r1, r3));
    }

    public void A09() {
        this.A00.A03();
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        C39801to r2 = (C39801to) this.A06.get();
        if (r2 != null) {
            String format = this.A01.A0M().format(obj);
            AnonymousClass00C.A0D(format, 0);
            r2.A0B.A0D(format);
        }
    }

    public C49952jx(C39801to r2, C18820ts r3, AnonymousClass3D9 r4, C64613Or r5, AnonymousClass1DF r6, AnonymousClass11F r7) {
        this.A01 = r3;
        this.A03 = r5;
        this.A04 = r6;
        this.A02 = r4;
        this.A06 = AnonymousClass001.A0F(r2);
        this.A05 = r7;
    }
}
