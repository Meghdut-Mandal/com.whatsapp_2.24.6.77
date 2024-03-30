package X;

import android.view.View;
import com.whatsapp.components.SelectionCheckView;

/* renamed from: X.52d  reason: invalid class name and case insensitive filesystem */
public final class C1028352d extends C42631z8 {
    public int A00;
    public long A01;
    public AnonymousClass72P A02;
    public C143936rM A03;
    public C32511dj A04;
    public AnonymousClass141 A05;
    public boolean A06;
    public final AnonymousClass16D A07;
    public final AnonymousClass1RY A08;
    public final AnonymousClass00T A09;
    public final AnonymousClass00T A0A;
    public final AnonymousClass00T A0B;
    public final AnonymousClass00T A0C;
    public final AnonymousClass00T A0D;
    public final AnonymousClass00T A0E;

    public SelectionCheckView A0C() {
        return (SelectionCheckView) this.A0E.getValue();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1028352d(View view, AnonymousClass1LI r4, AnonymousClass16D r5, AnonymousClass1RY r6) {
        super(view);
        C36321k7.A0y(r4, r5);
        this.A07 = r5;
        this.A08 = r6;
        C000800j r1 = C000800j.NONE;
        this.A0E = C001400p.A00(r1, new AnonymousClass7KR(view));
        this.A09 = C001400p.A00(r1, new AnonymousClass7KP(view));
        this.A0A = C001400p.A00(r1, new AnonymousClass7KQ(view));
        this.A0B = C001400p.A00(r1, new C153277Ns(view, r4));
        this.A0C = C001400p.A00(r1, new AnonymousClass7KS(view));
        this.A0D = C001400p.A00(r1, new AnonymousClass7KT(view));
    }

    public /* bridge */ /* synthetic */ C34841hj A0B() {
        return this.A03;
    }
}
