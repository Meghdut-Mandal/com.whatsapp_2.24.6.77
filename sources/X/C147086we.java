package X;

import android.graphics.Bitmap;
import com.whatsapp.R;
import java.io.ByteArrayInputStream;

/* renamed from: X.6we  reason: invalid class name and case insensitive filesystem */
public final class C147086we implements AnonymousClass7hC {
    public final AnonymousClass7hC A00;
    public final String A01;
    public final /* synthetic */ C123385wP A02;

    public C147086we(AnonymousClass7hC r1, C123385wP r2, String str) {
        this.A02 = r2;
        this.A01 = str;
        this.A00 = r1;
    }

    public void BiK(byte[] bArr) {
        String A04;
        C119895qd r4 = this.A02.A01;
        String str = this.A01;
        ByteArrayInputStream A0P = C90524aI.A0P(bArr);
        int dimensionPixelSize = C36421kH.A0B(r4.A00).getDimensionPixelSize(R.dimen.f7nameremoved);
        Bitmap bitmap = AnonymousClass6Y8.A0A(new C130396Kx(dimensionPixelSize, dimensionPixelSize), A0P).A02;
        if (!(bitmap == null || (A04 = C18750th.A04(str)) == null)) {
            ((C132416Tn) r4.A01.getValue()).A03(bitmap, A04);
        }
        this.A00.BiK(bArr);
    }
}
