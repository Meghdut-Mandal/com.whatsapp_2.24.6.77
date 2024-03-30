package X;

import androidx.compose.ui.CompositionLocalMapInjectionElement;

/* renamed from: X.7aA  reason: invalid class name and case insensitive filesystem */
public final class C156557aA extends AnonymousClass00R implements C019408g {
    public final /* synthetic */ C161267mT $modifier;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C156557aA(C161267mT r2) {
        super(3);
        this.$modifier = r2;
    }

    public /* bridge */ /* synthetic */ Object BKt(Object obj, Object obj2, Object obj3) {
        C161337ma r4 = ((AnonymousClass68J) obj).A00;
        C161337ma A0L = C90474aD.A0L(obj2, obj3);
        C136916fF r1 = (C136916fF) A0L;
        int i = r1.A02;
        C161267mT r2 = this.$modifier;
        if (r2 != C161267mT.A00) {
            r2 = AnonymousClass5WK.A00(A0L, AnonymousClass5WL.A00(new CompositionLocalMapInjectionElement(C136916fF.A04(r1)), r2));
        }
        r4.Bum(509942095);
        AnonymousClass5WF.A01(r4, r2, AnonymousClass6JB.A05);
        C009003v r22 = AnonymousClass6JB.A01;
        C136916fF r12 = (C136916fF) r4;
        if (r12.A0L || !C90464aC.A1W(r4, i)) {
            C90464aC.A0v(r4, r22, i);
        }
        C136916fF.A0M(r12, false);
        return AnonymousClass0AJ.A00;
    }
}
