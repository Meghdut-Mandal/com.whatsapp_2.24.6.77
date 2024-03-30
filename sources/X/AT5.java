package X;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.whatsapp.util.Log;

public class AT5 implements C160197kc {
    public final /* synthetic */ ImageView A00;
    public final /* synthetic */ C207249un A01;
    public final /* synthetic */ C201219j5 A02;
    public final /* synthetic */ boolean A03;

    public void Bj4() {
    }

    public void Bj5(Bitmap bitmap) {
    }

    public AT5(ImageView imageView, C207249un r2, C201219j5 r3, boolean z) {
        this.A02 = r3;
        this.A03 = z;
        this.A01 = r2;
        this.A00 = imageView;
    }

    public void BZt() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("PAY: Failed to display card art, empty image shown. Re-fetch ");
        boolean z = this.A03;
        Log.w(C36421kH.A0d(A0u, z));
        if (z) {
            C201219j5 r2 = this.A02;
            C201219j5.A01(this.A00, this.A01, r2);
        }
    }
}
