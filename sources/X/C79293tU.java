package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.webpagepreview.WebPagePreviewView;

/* renamed from: X.3tU  reason: invalid class name and case insensitive filesystem */
public final class C79293tU implements C160527l9 {
    public final int A00;
    public final Context A01;
    public final WebPagePreviewView A02;
    public final boolean A03;
    public final Bitmap[] A04;

    public C79293tU(Context context, WebPagePreviewView webPagePreviewView, Bitmap[] bitmapArr, int i, boolean z) {
        AnonymousClass00C.A0D(context, 1);
        this.A01 = context;
        this.A02 = webPagePreviewView;
        this.A00 = i;
        this.A03 = z;
        this.A04 = bitmapArr;
    }

    public /* synthetic */ void BXv() {
    }

    public void Bte(Bitmap bitmap, View view, AnonymousClass3T1 r8) {
        WebPagePreviewView webPagePreviewView = this.A02;
        if (bitmap != null) {
            boolean z = this.A03;
            webPagePreviewView.A0K(bitmap, z);
            if (z) {
                this.A04[0] = bitmap;
                return;
            }
            return;
        }
        boolean z2 = this.A03;
        int A012 = C36351kA.A01(this.A01, R.attr.f4nameremoved, R.color.f6nameremoved);
        if (z2) {
            webPagePreviewView.setVideoLargeThumbWithBackground(A012);
        } else {
            webPagePreviewView.setImageLargeThumbWithBackground(A012);
        }
    }

    public void Btu(View view) {
        WebPagePreviewView webPagePreviewView = this.A02;
        if (this.A03) {
            webPagePreviewView.setVideoLargeThumbWithBackground(-7829368);
        } else {
            webPagePreviewView.setImageLargeThumbWithBackground(-7829368);
        }
    }

    public int BHb() {
        return this.A00;
    }
}
