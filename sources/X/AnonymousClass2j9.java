package X;

import java.lang.ref.WeakReference;

/* renamed from: X.2j9  reason: invalid class name */
public class AnonymousClass2j9 extends C132446Tt {
    public final AnonymousClass11F A00;
    public final AnonymousClass1A1 A01;
    public final C65813To A02;
    public final AnonymousClass33L A03;

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        AnonymousClass3T1 r1;
        C602537c A05 = this.A02.A05(this.A00);
        if (A05 != null) {
            r1 = this.A01.A03(A05.A01);
        } else {
            r1 = null;
        }
        return new C599035s(r1, A05);
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        C599035s r2 = (C599035s) obj;
        WeakReference weakReference = this.A03.A00;
        C18740tg.A06(weakReference);
        AnonymousClass4SQ r0 = (AnonymousClass4SQ) weakReference.get();
        if (r0 != null) {
            r0.BfD(r2);
        }
    }

    public AnonymousClass2j9(AnonymousClass11F r2, AnonymousClass1A1 r3, AnonymousClass4SQ r4, C65813To r5) {
        this.A01 = r3;
        this.A02 = r5;
        C18740tg.A06(r4);
        this.A03 = new AnonymousClass33L(r4);
        this.A00 = r2;
    }
}
