package X;

import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.SizeElement;
import androidx.compose.foundation.layout.WrapContentElement;
import androidx.compose.ui.Alignment;

/* renamed from: X.6Rq  reason: invalid class name and case insensitive filesystem */
public abstract class C131986Rq {
    public static final FillElement A00;
    public static final FillElement A01;
    public static final WrapContentElement A02;
    public static final WrapContentElement A03;
    public static final WrapContentElement A04;
    public static final WrapContentElement A05;
    public static final WrapContentElement A06;
    public static final WrapContentElement A07;

    static {
        Integer num = C023109s.A01;
        A01 = new FillElement(num);
        Integer num2 = C023109s.A00;
        Integer num3 = C023109s.A0C;
        A00 = new FillElement(num3);
        C157627dq r2 = AnonymousClass6J7.A00;
        A06 = new WrapContentElement(num, r2, new C155857Xs(r2));
        C157627dq r22 = AnonymousClass6J7.A01;
        A07 = new WrapContentElement(num, r22, new C155857Xs(r22));
        AnonymousClass7bO r23 = AnonymousClass6J7.A02;
        A02 = new WrapContentElement(num2, r23, new AnonymousClass7Xq(r23));
        AnonymousClass7bO r24 = AnonymousClass6J7.A03;
        A03 = new WrapContentElement(num2, r24, new AnonymousClass7Xq(r24));
        Alignment alignment = AnonymousClass6J7.A04;
        A04 = new WrapContentElement(num3, alignment, new C155847Xr(alignment));
        Alignment alignment2 = AnonymousClass6J7.A05;
        A05 = new WrapContentElement(num3, alignment2, new C155847Xr(alignment2));
    }

    public static final C161267mT A00(C161267mT r6, float f) {
        return r6.Bva(new SizeElement(C112455dv.A00, f, f, f, f));
    }
}
