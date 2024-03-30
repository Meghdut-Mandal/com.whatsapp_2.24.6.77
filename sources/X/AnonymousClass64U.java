package X;

import android.graphics.BlurMaskFilter;
import android.graphics.Paint;
import android.graphics.Path;

/* renamed from: X.64U  reason: invalid class name */
public class AnonymousClass64U {
    public final Paint A00;
    public final Path A01 = C36441kJ.A0M();
    public final C118495nz A02 = new C118495nz();
    public final C118495nz A03 = new C118495nz();
    public final C118495nz A04 = new C118495nz();
    public final C118495nz A05 = new C118495nz();
    public final C118495nz A06 = new C118495nz();

    public void A00() {
        Path path = this.A01;
        path.reset();
        C118495nz r0 = this.A06;
        path.moveTo(r0.A00, r0.A01);
        C118495nz r02 = this.A02;
        float f = r02.A00;
        float f2 = r02.A01;
        C118495nz r03 = this.A03;
        float f3 = r03.A00;
        float f4 = r03.A01;
        C118495nz r04 = this.A04;
        path.cubicTo(f, f2, f3, f4, r04.A00, r04.A01);
        C118495nz r05 = this.A05;
        path.lineTo(r05.A00, r05.A01);
        path.close();
    }

    public AnonymousClass64U(int i, int i2) {
        Paint A0K = C36441kJ.A0K();
        this.A00 = A0K;
        C90474aD.A0w(A0K);
        A0K.setColor(i);
        A0K.setMaskFilter(new BlurMaskFilter((float) i2, BlurMaskFilter.Blur.NORMAL));
    }
}
