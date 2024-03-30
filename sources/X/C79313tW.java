package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.webpagepreview.WebPagePreviewView;

/* renamed from: X.3tW  reason: invalid class name and case insensitive filesystem */
public final class C79313tW implements C160527l9 {
    public final int A00;
    public final int A01;
    public final Context A02;
    public final AnonymousClass2KY A03;
    public final WebPagePreviewView A04;
    public final boolean A05;
    public final Bitmap[] A06;

    public C79313tW(Context context, AnonymousClass2KY r3, WebPagePreviewView webPagePreviewView, Bitmap[] bitmapArr, int i, int i2, boolean z) {
        AnonymousClass00C.A0D(context, 1);
        this.A02 = context;
        this.A04 = webPagePreviewView;
        this.A05 = z;
        this.A01 = i;
        this.A00 = i2;
        this.A06 = bitmapArr;
        this.A03 = r3;
    }

    public int BHb() {
        return 0;
    }

    public /* synthetic */ void BXv() {
    }

    public void Bte(Bitmap bitmap, View view, AnonymousClass3T1 r9) {
        AnonymousClass00C.A0D(r9, 2);
        AnonymousClass3L1 r0 = r9.A0a;
        C18740tg.A06(r0);
        int i = r0.A01;
        int i2 = r0.A00;
        AnonymousClass2KY r1 = this.A03;
        r1.A07(i, i2);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        Pair A052 = r1.A05(makeMeasureSpec, makeMeasureSpec);
        int A042 = (C36381kD.A04(A052) - this.A00) - this.A01;
        Object obj = A052.second;
        AnonymousClass00C.A07(obj);
        Object obj2 = A052.first;
        AnonymousClass00C.A07(obj2);
        int A0I = (AnonymousClass000.A0I(obj) * A042) / AnonymousClass000.A0I(obj2);
        int i3 = new int[]{A042, A0I}[0];
        WebPagePreviewView webPagePreviewView = this.A04;
        boolean z = this.A05;
        if (z) {
            ViewGroup.LayoutParams layoutParams = webPagePreviewView.A05.getLayoutParams();
            layoutParams.width = i3;
            layoutParams.height = A0I;
            webPagePreviewView.A05.setLayoutParams(layoutParams);
        } else {
            webPagePreviewView.A0J(i3, A0I);
        }
        if (bitmap != null) {
            webPagePreviewView.A0K(bitmap, z);
            if (z) {
                this.A06[0] = bitmap;
                return;
            }
            return;
        }
        int A012 = C36351kA.A01(this.A02, R.attr.f4nameremoved, R.color.f6nameremoved);
        if (z) {
            webPagePreviewView.setVideoLargeThumbWithBackground(A012);
        } else {
            webPagePreviewView.setImageLargeThumbWithBackground(A012);
        }
    }

    public /* synthetic */ void Btu(View view) {
    }
}
