package X;

import android.graphics.BlurMaskFilter;
import android.graphics.Paint;
import android.graphics.Path;

/* renamed from: X.64T  reason: invalid class name */
public class AnonymousClass64T {
    public final Paint A00;
    public final Path A01 = C36441kJ.A0M();
    public final C118475nx A02 = new C118475nx();
    public final C118475nx A03 = new C118475nx();
    public final C118475nx A04 = new C118475nx();
    public final C118475nx A05 = new C118475nx();
    public final C118475nx A06 = new C118475nx();

    public void A00() {
        Path path = this.A01;
        path.reset();
        C118475nx r0 = this.A06;
        path.moveTo(r0.A00, r0.A01);
        C118475nx r02 = this.A02;
        float f = r02.A00;
        float f2 = r02.A01;
        C118475nx r03 = this.A03;
        float f3 = r03.A00;
        float f4 = r03.A01;
        C118475nx r04 = this.A04;
        path.cubicTo(f, f2, f3, f4, r04.A00, r04.A01);
        C118475nx r05 = this.A05;
        path.lineTo(r05.A00, r05.A01);
        path.close();
    }

    public AnonymousClass64T(int i, int i2) {
        Paint A0K = C36441kJ.A0K();
        this.A00 = A0K;
        C90474aD.A0w(A0K);
        A0K.setColor(i);
        A0K.setMaskFilter(new BlurMaskFilter((float) i2, BlurMaskFilter.Blur.NORMAL));
    }
}
