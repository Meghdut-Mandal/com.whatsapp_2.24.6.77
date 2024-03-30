package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.whatsapp.WaNetworkResourceImageView;
import java.lang.ref.WeakReference;

/* renamed from: X.73h  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C1499273h implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C1262763g A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ WeakReference A04;
    public final /* synthetic */ boolean A05;

    public /* synthetic */ C1499273h(C1262763g r1, String str, WeakReference weakReference, int i, int i2, boolean z) {
        this.A02 = r1;
        this.A05 = z;
        this.A03 = str;
        this.A00 = i;
        this.A01 = i2;
        this.A04 = weakReference;
    }

    public final void run() {
        C1262763g r5 = this.A02;
        boolean z = this.A05;
        String str = this.A03;
        int i = this.A00;
        int i2 = this.A01;
        WeakReference weakReference = this.A04;
        AnonymousClass00C.A0D(weakReference, 5);
        Context context = r5.A01.A00;
        AnonymousClass00C.A08(context);
        if (z) {
            String A052 = AnonymousClass098.A05(str, ".", "_night.", false);
            int i3 = C002300y.A00;
            if ((i3 == 2 || ((i3 == -1 || i3 == 3) && (AnonymousClass000.A0U(context).uiMode & 48) == 32)) && C36441kJ.A0w(context.getFilesDir(), C36321k7.A0D("NetworkResource/", A052)).exists()) {
                str = A052;
            }
        }
        String absolutePath = C36441kJ.A0w(context.getFilesDir(), C36321k7.A0D("NetworkResource/", str)).getAbsolutePath();
        try {
            C19700wN r6 = r5.A00;
            AnonymousClass00C.A0B(absolutePath);
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(absolutePath, options);
            int i4 = options.outHeight;
            int i5 = options.outWidth;
            int i6 = 1;
            if (i4 > i2 || i5 > i) {
                int i7 = i4 / 2;
                int i8 = i5 / 2;
                while (i7 / i6 >= i2 && i8 / i6 >= i) {
                    i6 *= 2;
                }
            }
            options.inSampleSize = i6;
            options.inJustDecodeBounds = false;
            Bitmap decodeFile = BitmapFactory.decodeFile(absolutePath, options);
            if (decodeFile == null) {
                r6.A0E("NetworkResourceLoader/", AnonymousClass000.A0p("unable to decode", absolutePath, AnonymousClass000.A0u()), false);
                C36321k7.A1P("NetworkResourceLoader/unable-to-decode/", absolutePath, AnonymousClass000.A0u());
                return;
            }
            Bitmap A002 = C111755cn.A00(decodeFile, i, i2);
            WaNetworkResourceImageView waNetworkResourceImageView = (WaNetworkResourceImageView) weakReference.get();
            if (waNetworkResourceImageView != null) {
                waNetworkResourceImageView.A00 = A002;
                waNetworkResourceImageView.postInvalidate();
            }
        } catch (IllegalArgumentException e) {
            C36321k7.A1P("NetworkResourceLoader/decodeFile/failed to generate bitmap/", absolutePath, AnonymousClass000.A0u());
            r5.A00.A0D("NetworkResourceLoader/", e.toString(), e);
        }
    }
}
