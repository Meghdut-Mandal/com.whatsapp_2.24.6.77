package X;

import com.whatsapp.webpagepreview.WebPagePreviewView;

/* renamed from: X.3DS  reason: invalid class name */
public class AnonymousClass3DS {
    public final /* synthetic */ AnonymousClass3T1 A00;
    public final /* synthetic */ AnonymousClass4V9 A01;

    public AnonymousClass3DS(AnonymousClass3T1 r1, AnonymousClass4V9 r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public void A00(C64933Qa r9, int i) {
        AnonymousClass4V9 r4;
        float f;
        float f2;
        float f3;
        float f4;
        if (r9 != null && r9.equals(this.A00.A1J)) {
            if (i != 1) {
                r4 = this.A01;
                f = 0.0f;
                if (i != 2) {
                    f2 = 1.0f;
                } else {
                    f3 = 1.0f;
                    f4 = 0.67f;
                    f2 = 0.0f;
                    WebPagePreviewView webPagePreviewView = (WebPagePreviewView) r4;
                    Boolean bool = C18750th.A03;
                    long j = (long) 150;
                    webPagePreviewView.A09.animate().setDuration(j).alpha(f);
                    C36431kI.A0L(webPagePreviewView.A00, j).alpha(f2);
                    C36431kI.A0L(webPagePreviewView.A06, j).alpha(f2);
                    C36431kI.A0L(webPagePreviewView.A01, j).alpha(f3);
                    C36431kI.A0L(webPagePreviewView.A02, j).alpha(f4);
                }
            } else {
                r4 = this.A01;
                f = 1.0f;
                f2 = 0.0f;
            }
            f3 = 0.0f;
            f4 = 0.0f;
            WebPagePreviewView webPagePreviewView2 = (WebPagePreviewView) r4;
            Boolean bool2 = C18750th.A03;
            long j2 = (long) 150;
            webPagePreviewView2.A09.animate().setDuration(j2).alpha(f);
            C36431kI.A0L(webPagePreviewView2.A00, j2).alpha(f2);
            C36431kI.A0L(webPagePreviewView2.A06, j2).alpha(f2);
            C36431kI.A0L(webPagePreviewView2.A01, j2).alpha(f3);
            C36431kI.A0L(webPagePreviewView2.A02, j2).alpha(f4);
        }
    }
}
