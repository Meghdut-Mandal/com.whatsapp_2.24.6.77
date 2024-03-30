package X;

import android.graphics.Matrix;
import android.graphics.Path;

/* renamed from: X.Agn  reason: case insensitive filesystem */
public final class C22102Agn extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ C21121A9g this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22102Agn(C21121A9g a9g) {
        super(0);
        this.this$0 = a9g;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        AnonymousClass9Xb A03 = C21121A9g.A03(this.this$0);
        float f = A03.A05;
        float f2 = A03.A02 + f;
        float f3 = A03.A00;
        float f4 = A03.A01;
        float f5 = A03.A03;
        float f6 = A03.A04;
        float f7 = A03.A0H;
        float f8 = A03.A06;
        Path A0M = C36441kJ.A0M();
        float f9 = (float) 2;
        float f10 = f9 * f4;
        float f11 = (f2 - f) - f10;
        float f12 = f3 - f10;
        float f13 = (float) 0;
        A0M.moveTo(f2, f4 + f13);
        float f14 = f2 - f10;
        A0M.arcTo(f14, 0.0f, f2, f10, 0.0f, -90.0f, false);
        A0M.rLineTo(-f11, 0.0f);
        A0M.lineTo(f6, 0.0f);
        float f15 = f6 * f9;
        A0M.arcTo(0.0f, 0.0f, f15, f13 + f15, -90.0f, -120.0f, false);
        A0M.lineTo(f, f5);
        A0M.rLineTo(0.0f, f12);
        A0M.arcTo(f, f12, f + f10, f3, 180.0f, -90.0f, false);
        A0M.rLineTo(f11, 0.0f);
        A0M.arcTo(f14, f12, f2, f3, 90.0f, -90.0f, false);
        A0M.rLineTo(0.0f, -f12);
        Matrix A0B = C90524aI.A0B();
        A0B.setTranslate(f8, f7);
        A0M.transform(A0B);
        A0M.close();
        return A0M;
    }
}
