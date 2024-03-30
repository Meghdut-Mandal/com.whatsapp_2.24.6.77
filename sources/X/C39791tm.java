package X;

import android.widget.ImageView;
import com.whatsapp.jid.UserJid;
import java.util.List;

/* renamed from: X.1tm  reason: invalid class name and case insensitive filesystem */
public final class C39791tm extends AnonymousClass04R {
    public final C29461Ws A00;
    public final C202279lS A01;
    public final UserJid A02;
    public final AnonymousClass05L A03;
    public final AnonymousClass05L A04;
    public final AnonymousClass05L A05;
    public final AnonymousClass05K A06;
    public final AnonymousClass05K A07;
    public final AnonymousClass05K A08;
    public final C88364Sk A09;
    public final AnonymousClass2ZL A0A;
    public final C196169Xz A0B;

    public final void A0S(ImageView imageView, C207269up r11) {
        AnonymousClass00C.A0D(r11, 0);
        List A0V = C007103b.A0V(r11.A07);
        if (C36401kF.A1a(A0V)) {
            ImageView imageView2 = imageView;
            if (imageView != null) {
                imageView.setTag(((C206759tv) A0V.get(0)).A04);
            }
            this.A0B.A01(imageView2, (C206759tv) A0V.get(0), new C89514Wv(imageView, 4), new C55872vK(imageView, 5), 2);
        }
    }

    public void A0R() {
        this.A0A.unregisterObserver(this.A09);
    }

    public C39791tm(AnonymousClass2ZL r3, C29461Ws r4, C202279lS r5, UserJid userJid, C196169Xz r7) {
        this.A02 = userJid;
        this.A00 = r4;
        this.A01 = r5;
        this.A0A = r3;
        this.A0B = r7;
        AnonymousClass05N r0 = new AnonymousClass05N(AnonymousClass001.A0I());
        this.A05 = r0;
        this.A08 = r0;
        AnonymousClass05N r02 = new AnonymousClass05N(C36381kD.A0j());
        this.A03 = r02;
        this.A06 = r02;
        AnonymousClass05N A002 = AnonymousClass05E.A00((Object) null);
        this.A04 = A002;
        this.A07 = A002;
        C69283dH r03 = new C69283dH(this);
        this.A09 = r03;
        r3.registerObserver(r03);
    }
}
