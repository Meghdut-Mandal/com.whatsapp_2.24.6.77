package X;

import android.graphics.Bitmap;
import android.text.TextUtils;
import android.widget.ImageView;
import java.lang.ref.WeakReference;

/* renamed from: X.6zb  reason: invalid class name and case insensitive filesystem */
public class C148896zb implements C160197kc {
    public final /* synthetic */ ImageView A00;
    public final /* synthetic */ C16680pu A01;
    public final /* synthetic */ C16680pu A02;
    public final /* synthetic */ AnonymousClass6KT A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ WeakReference A06;
    public final /* synthetic */ WeakReference A07;

    public void Bj4() {
    }

    public C148896zb(ImageView imageView, C16680pu r2, C16680pu r3, AnonymousClass6KT r4, String str, String str2, WeakReference weakReference, WeakReference weakReference2) {
        this.A07 = weakReference;
        this.A06 = weakReference2;
        this.A02 = r2;
        this.A05 = str;
        this.A00 = imageView;
        this.A04 = str2;
        this.A03 = r4;
        this.A01 = r3;
    }

    public void BZt() {
        String str = this.A05;
        if (!TextUtils.isEmpty(str)) {
            ImageView imageView = this.A00;
            String str2 = this.A04;
            C110015Zz.A00(imageView, this.A01, this.A02, this.A03, str, str2);
        }
    }

    public void Bj5(Bitmap bitmap) {
        ImageView imageView = (ImageView) this.A07.get();
        Object obj = this.A06.get();
        Number number = (Number) this.A02.get();
        if (imageView != null && obj != null && number != null) {
            imageView.setColorFilter(number.intValue());
        }
    }
}
