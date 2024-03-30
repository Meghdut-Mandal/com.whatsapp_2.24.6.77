package X;

import android.graphics.Path;
import android.graphics.RectF;

/* renamed from: X.6g7  reason: invalid class name and case insensitive filesystem */
public final class C137426g7 implements C161177mK {
    public RectF A00;
    public float[] A01;
    public final Path A02 = C36441kJ.A0M();

    public void B0k(AnonymousClass6PW r7) {
        RectF rectF = this.A00;
        if (rectF == null) {
            rectF = C36441kJ.A0N();
            this.A00 = rectF;
        }
        rectF.set(r7.A01, r7.A03, r7.A02, r7.A00);
        float[] fArr = this.A01;
        if (fArr == null) {
            fArr = new float[8];
            this.A01 = fArr;
        }
        long j = r7.A06;
        long j2 = AnonymousClass6RD.A00;
        fArr[0] = C90494aF.A03(j);
        fArr[1] = C90464aC.A00(j);
        long j3 = r7.A07;
        fArr[2] = C90494aF.A03(j3);
        fArr[3] = C90464aC.A00(j3);
        long j4 = r7.A05;
        fArr[4] = C90494aF.A03(j4);
        fArr[5] = C90464aC.A00(j4);
        long j5 = r7.A04;
        fArr[6] = C90494aF.A03(j5);
        fArr[7] = C90464aC.A00(j5);
        Path path = this.A02;
        RectF rectF2 = this.A00;
        AnonymousClass00C.A0B(rectF2);
        float[] fArr2 = this.A01;
        AnonymousClass00C.A0B(fArr2);
        path.addRoundRect(rectF2, fArr2, Path.Direction.CCW);
    }

    public /* synthetic */ C137426g7(Path path, C05250Oz r3, int i) {
    }

    public C137426g7() {
    }
}
