package X;

import android.graphics.Bitmap;
import java.util.Locale;

/* renamed from: X.63p  reason: invalid class name and case insensitive filesystem */
public class C1263563p {
    public C202069kz A00;
    public C202019ku A01;
    public final C160897ll A02;
    public final C22870AxP A03;
    public final boolean A04;

    public boolean A00(Bitmap bitmap, int i) {
        try {
            this.A01.A03(i, bitmap);
            return true;
        } catch (IllegalStateException e) {
            Class<C1263563p> cls = C1263563p.class;
            Object[] objArr = new Object[1];
            boolean A1b = C36361kB.A1b(objArr, i);
            C161037m1 r2 = C132886Vq.A00;
            if (r2.BMH(6)) {
                r2.B6J(cls.getSimpleName(), String.format((Locale) null, "Rendering of frame unsuccessful. Frame number: %d", objArr), e);
            }
            return A1b;
        }
    }

    public C1263563p(C160897ll r3, C202069kz r4, boolean z) {
        C140136l4 r1 = new C140136l4(this);
        this.A03 = r1;
        this.A02 = r3;
        this.A00 = r4;
        this.A04 = z;
        this.A01 = new C202019ku(r4, r1, z);
    }
}
