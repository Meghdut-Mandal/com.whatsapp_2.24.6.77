package X;

import com.whatsapp.payments.ui.BrazilPayBloksActivity;

/* renamed from: X.6wu  reason: invalid class name and case insensitive filesystem */
public class C147246wu implements C159617je {
    public final /* synthetic */ AnonymousClass6C8 A00;
    public final /* synthetic */ BrazilPayBloksActivity A01;

    public C147246wu(AnonymousClass6C8 r1, BrazilPayBloksActivity brazilPayBloksActivity) {
        this.A01 = brazilPayBloksActivity;
        this.A00 = r1;
    }

    public void BWi(C130696Mb r3) {
        C202059ky r0 = r3.A00;
        if (r0 == null) {
            r0 = new C202059ky();
        }
        if (r0.A00 == 25554) {
            this.A01.A3m(this.A00);
        } else {
            this.A00.A00("on_failure");
        }
    }

    public void onResult(Object obj) {
        this.A01.A3m(this.A00);
    }
}
