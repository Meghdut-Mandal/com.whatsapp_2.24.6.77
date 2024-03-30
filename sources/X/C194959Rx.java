package X;

import android.widget.ImageView;

/* renamed from: X.9Rx  reason: invalid class name and case insensitive filesystem */
public class C194959Rx {
    public final /* synthetic */ ImageView A00;
    public final /* synthetic */ C207249un A01;
    public final /* synthetic */ AnonymousClass8b7 A02;
    public final /* synthetic */ C201219j5 A03;

    public C194959Rx(ImageView imageView, C207249un r2, AnonymousClass8b7 r3, C201219j5 r4) {
        this.A03 = r4;
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = imageView;
    }

    public void A00(C202059ky r3, String str) {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("PAY: fetchCardArtImageContentDetails Couldn't get card art for: ");
        A0u.append(str);
        C36321k7.A1L(r3, " with error: ", A0u);
    }
}
