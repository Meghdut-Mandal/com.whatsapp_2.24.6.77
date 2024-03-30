package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.widget.ImageView;
import java.lang.ref.WeakReference;
import java.util.Map;

/* renamed from: X.3nw  reason: invalid class name and case insensitive filesystem */
public final class C75873nw implements AnonymousClass7hC {
    public final String A00;
    public final /* synthetic */ AnonymousClass3ET A01;

    public C75873nw(AnonymousClass3ET r1, String str) {
        this.A01 = r1;
        this.A00 = str;
    }

    public void BiK(byte[] bArr) {
        ImageView imageView;
        AnonymousClass3ET r5 = this.A01;
        Map map = r5.A03;
        synchronized (map) {
            String str = this.A00;
            WeakReference weakReference = (WeakReference) map.get(str);
            if (!(weakReference == null || (imageView = (ImageView) weakReference.get()) == null || !AnonymousClass00C.A0J(imageView.getTag(-1641051461), str))) {
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
                AnonymousClass00C.A08(decodeByteArray);
                C36411kG.A1F(r5.A00, imageView, decodeByteArray, 30);
            }
        }
    }
}
