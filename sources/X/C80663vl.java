package X;

import com.whatsapp.webpagepreview.WebPagePreviewView;
import java.util.List;

/* renamed from: X.3vl  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C80663vl implements Runnable {
    public final /* synthetic */ AnonymousClass28U A00;
    public final /* synthetic */ AnonymousClass3AD A01;
    public final /* synthetic */ WebPagePreviewView A02;
    public final /* synthetic */ List A03;
    public final /* synthetic */ boolean A04;
    public final /* synthetic */ boolean A05;

    public /* synthetic */ C80663vl(AnonymousClass28U r1, AnonymousClass3AD r2, WebPagePreviewView webPagePreviewView, List list, boolean z, boolean z2) {
        this.A02 = webPagePreviewView;
        this.A00 = r1;
        this.A04 = z;
        this.A03 = list;
        this.A05 = z2;
        this.A01 = r2;
    }

    public final void run() {
        WebPagePreviewView webPagePreviewView = this.A02;
        AnonymousClass28U r4 = this.A00;
        boolean z = this.A04;
        List list = this.A03;
        boolean z2 = this.A05;
        AnonymousClass3AD r0 = this.A01;
        webPagePreviewView.A0M(r4, list, z, z2);
        AnonymousClass3TU r1 = r0.A00;
        AnonymousClass3T1 r2 = r0.A01;
        boolean z3 = r0.A04;
        AnonymousClass3TU.A03(r1.A06, r1, r2, r0.A02, r0.A03, z3, r0.A05, r0.A06);
    }
}
