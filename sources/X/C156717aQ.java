package X;

import java.util.List;

/* renamed from: X.7aQ  reason: invalid class name and case insensitive filesystem */
public final class C156717aQ extends AnonymousClass00R implements C019508h {
    public final /* synthetic */ C157597dn $contactList$delegate;
    public final /* synthetic */ C006302t $onContactClick;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C156717aQ(C157597dn r2, C006302t r3) {
        super(4);
        this.$onContactClick = r3;
        this.$contactList$delegate = r2;
    }

    public /* bridge */ /* synthetic */ Object BKu(Object obj, Object obj2, Object obj3, Object obj4) {
        int A0I = AnonymousClass000.A0I(obj2);
        C161337ma r3 = (C161337ma) obj3;
        int A0I2 = AnonymousClass000.A0I(obj4);
        if ((A0I2 & 112) == 0) {
            A0I2 |= C90494aF.A07(r3.B2d(A0I) ? 1 : 0);
        }
        if ((A0I2 & 721) != 144 || !r3.BHg()) {
            C87564Ph r5 = (C87564Ph) ((List) this.$contactList$delegate.getValue()).get(A0I);
            if (r5 instanceof C70243ep) {
                AnonymousClass6Gz.A01(r3, (C161267mT) null, (C70243ep) r5, this.$onContactClick, 8, 4);
            }
        } else {
            r3.BuE();
        }
        return AnonymousClass0AJ.A00;
    }
}
