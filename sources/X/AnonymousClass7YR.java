package X;

import androidx.compose.foundation.layout.PaddingValuesElement;
import androidx.compose.foundation.layout.UnspecifiedConstraintsElement;

/* renamed from: X.7YR  reason: invalid class name */
public final class AnonymousClass7YR extends AnonymousClass00R implements C009003v {
    public final /* synthetic */ int $$dirty;
    public final /* synthetic */ C019408g $content;
    public final /* synthetic */ C156907b9 $contentPadding;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7YR(C156907b9 r2, C019408g r3, int i) {
        super(2);
        this.$contentPadding = r2;
        this.$content = r3;
        this.$$dirty = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C161337ma r14 = (C161337ma) obj;
        if ((AnonymousClass000.A0I(obj2) & 11) != 2 || !r14.BHg()) {
            UnspecifiedConstraintsElement unspecifiedConstraintsElement = new UnspecifiedConstraintsElement(C113805g9.A01, C113805g9.A00);
            C156907b9 r2 = this.$contentPadding;
            C161267mT A00 = AnonymousClass5WL.A00(unspecifiedConstraintsElement, new PaddingValuesElement(r2, new C153997Qm(r2)));
            C161447mv r3 = AnonymousClass6J0.A01;
            AnonymousClass7bO r1 = AnonymousClass6J7.A02;
            C019408g r4 = this.$content;
            int i = ((this.$$dirty >> 18) & 7168) | 432;
            r14.Bum(693286680);
            C157697dx A002 = AnonymousClass6HZ.A00(r3, r14, r1);
            r14.Bum(-1323940314);
            C136916fF r32 = (C136916fF) r14;
            Object A01 = AnonymousClass6G0.A01(r32, C131996Rr.A00);
            Object A012 = AnonymousClass6G0.A01(r32, C131996Rr.A03);
            Object A013 = AnonymousClass6G0.A01(r32, C131996Rr.A04);
            AnonymousClass00S r11 = AnonymousClass6JB.A00;
            C136916fF.A0F(r14, r32, r11);
            r32.A0P = false;
            AnonymousClass5WF.A01(r14, A002, AnonymousClass6JB.A04);
            AnonymousClass5WF.A01(r14, A01, AnonymousClass6JB.A02);
            AnonymousClass5WF.A01(r14, A012, AnonymousClass6JB.A03);
            AnonymousClass5WF.A01(r14, A013, AnonymousClass6JB.A07);
            r32.A0P = C36401kF.A1U(r32.A05);
            C1509977p.A01(r14, new C1509977p(-55743822, new C156557aA(A00), true), new AnonymousClass68J(r14), ((((((i << 3) & 112) << 9) & 7168) | 6) >> 3) & 112);
            r4.BKt(C129446Ha.A00, r14, Integer.valueOf(((i >> 6) & 112) | 6));
            C136916fF.A0L(r32, true);
        } else {
            r14.BuE();
        }
        return AnonymousClass0AJ.A00;
    }
}
