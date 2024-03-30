package X;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.06c  reason: invalid class name and case insensitive filesystem */
public class C014006c {
    @Deprecated
    public float A00;
    @Deprecated
    public float A01;
    @Deprecated
    public float A02;
    @Deprecated
    public float A03;
    @Deprecated
    public float A04;
    public final List A05 = new ArrayList();
    public final List A06 = new ArrayList();

    public static void A00(C014006c r4, float f) {
        float f2 = r4.A00;
        if (f2 != f) {
            float f3 = ((f - f2) + 360.0f) % 360.0f;
            if (f3 <= 180.0f) {
                float f4 = r4.A02;
                float f5 = r4.A03;
                AnonymousClass0D9 r2 = new AnonymousClass0D9(f4, f5, f4, f5);
                r2.A03 = r4.A00;
                r2.A04 = f3;
                r4.A06.add(new AnonymousClass0DA(r2));
                r4.A00 = f;
            }
        }
    }

    public void A01(float f, float f2) {
        AnonymousClass0DB r2 = new AnonymousClass0DB();
        r2.A00 = f;
        r2.A01 = f2;
        this.A05.add(r2);
        AnonymousClass0DC r4 = new AnonymousClass0DC(r2, this.A02, this.A03);
        AnonymousClass0DB r1 = r4.A02;
        float degrees = ((float) Math.toDegrees(Math.atan((double) ((r1.A01 - r4.A01) / (r1.A00 - r4.A00))))) + 270.0f;
        A00(this, degrees);
        this.A06.add(r4);
        this.A00 = degrees;
        this.A02 = f;
        this.A03 = f2;
    }

    public void A02(float f, float f2, float f3) {
        this.A04 = f;
        this.A02 = 0.0f;
        this.A03 = f;
        this.A00 = f2;
        this.A01 = (f2 + f3) % 360.0f;
        this.A05.clear();
        this.A06.clear();
    }

    public void A03(Matrix matrix, Path path) {
        List list = this.A05;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((AnonymousClass0D8) list.get(i)).A00(matrix, path);
        }
    }

    public C014006c() {
        A02(0.0f, 270.0f, 0.0f);
    }
}
