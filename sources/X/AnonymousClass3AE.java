package X;

import android.content.Context;
import com.whatsapp.webpagepreview.WebPagePreviewView;

/* renamed from: X.3AE  reason: invalid class name */
public class AnonymousClass3AE {
    public boolean A00;
    public final C20690y0 A01;
    public final C88724Tu A02;
    public final C39471sS A03;
    public final C19770wU A04;
    public final WebPagePreviewView A05;
    public final boolean A06;

    public AnonymousClass3AE(Context context, C20690y0 r4, C88724Tu r5, C39471sS r6, C19770wU r7, boolean z, boolean z2) {
        this.A02 = r5;
        this.A03 = r6;
        this.A04 = r7;
        this.A01 = r4;
        WebPagePreviewView webPagePreviewView = new WebPagePreviewView(context);
        this.A05 = webPagePreviewView;
        this.A00 = z;
        this.A06 = z2;
        webPagePreviewView.setImageProgressBarVisibility(false);
        webPagePreviewView.setImageCancelClickListener(C48742hy.A00(this, 18));
        webPagePreviewView.setImageContentClickListener(C48742hy.A00(this, 19));
        webPagePreviewView.A0F();
    }
}
