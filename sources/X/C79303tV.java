package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.webpagepreview.WebPagePreviewView;

/* renamed from: X.3tV  reason: invalid class name and case insensitive filesystem */
public final class C79303tV implements C160527l9 {
    public final int A00;
    public final Context A01;
    public final WebPagePreviewView A02;
    public final boolean A03;
    public final Bitmap[] A04;

    public C79303tV(Context context, WebPagePreviewView webPagePreviewView, Bitmap[] bitmapArr, int i, boolean z) {
        AnonymousClass00C.A0D(context, 1);
        this.A01 = context;
        this.A02 = webPagePreviewView;
        this.A00 = i;
        this.A04 = bitmapArr;
        this.A03 = z;
    }

    public /* synthetic */ void BXv() {
    }

    public void Bte(Bitmap bitmap, View view, AnonymousClass3T1 r7) {
        if (bitmap != null) {
            this.A02.setVideoLargeThumbWithBitmap(bitmap);
            this.A04[0] = bitmap;
            return;
        }
        boolean z = this.A03;
        WebPagePreviewView webPagePreviewView = this.A02;
        if (z) {
            webPagePreviewView.A07.setAlpha(0.3f);
            webPagePreviewView.setVideoLargeThumbWithBackground(-7829368);
            return;
        }
        webPagePreviewView.setVideoLargeThumbWithBackground(C36351kA.A01(this.A01, R.attr.f4nameremoved, R.color.f6nameremoved));
    }

    public void Btu(View view) {
        this.A02.setVideoLargeThumbWithBackground(-7829368);
    }

    public int BHb() {
        return this.A00;
    }
}
