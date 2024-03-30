package X;

import java.util.Locale;

/* renamed from: X.9QM  reason: invalid class name */
public class AnonymousClass9QM {
    public int A00;
    public int A01;

    public void A00(int i) {
        int i2;
        int i3 = this.A01;
        if (i3 < i || (i2 = this.A00) <= 0) {
            Object[] A1Q = C36441kJ.A1Q();
            C36331k8.A1X(A1Q, i, 0, i3, 1);
            AnonymousClass000.A1L(A1Q, this.A00, 2);
            C161037m1 r1 = C132886Vq.A00;
            if (r1.BMH(6)) {
                r1.Bxh("com.facebook.imagepipeline.memory.BasePool.Counter", String.format((Locale) null, "Unexpected decrement of %d. Current numBytes = %d, count = %d", A1Q));
                return;
            }
            return;
        }
        this.A00 = i2 - 1;
        this.A01 = i3 - i;
    }
}
