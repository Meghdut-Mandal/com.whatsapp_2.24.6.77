package X;

import android.graphics.Bitmap;
import android.view.View;
import com.whatsapp.webpagepreview.WebPagePreviewView;

/* renamed from: X.3tX  reason: invalid class name and case insensitive filesystem */
public final class C79323tX implements C160527l9 {
    public final /* synthetic */ int A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ View A02;
    public final /* synthetic */ AnonymousClass3L1 A03;
    public final /* synthetic */ C47532ev A04;
    public final /* synthetic */ WebPagePreviewView A05;
    public final /* synthetic */ boolean A06;

    public /* synthetic */ void BXv() {
    }

    public /* synthetic */ void Btu(View view) {
    }

    public C79323tX(View view, View view2, AnonymousClass3L1 r3, C47532ev r4, WebPagePreviewView webPagePreviewView, int i, boolean z) {
        this.A04 = r4;
        this.A05 = webPagePreviewView;
        this.A01 = view;
        this.A02 = view2;
        this.A03 = r3;
        this.A00 = i;
        this.A06 = z;
    }

    public int BHb() {
        return this.A04.A05;
    }

    public void Bte(Bitmap bitmap, View view, AnonymousClass3T1 r12) {
        C47532ev r3 = this.A04;
        WebPagePreviewView webPagePreviewView = this.A05;
        View view2 = this.A01;
        View view3 = this.A02;
        AnonymousClass3L1 r0 = this.A03;
        C47532ev.A00(bitmap, view2, view3, r3, webPagePreviewView, r0.A01, r0.A00, this.A00, this.A06);
    }
}
