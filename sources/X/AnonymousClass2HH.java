package X;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.conversation.banner.SimilarNewslettersBanner$1$1;
import com.whatsapp.newsletter.viewmodel.NewsletterViewModel;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.2HH  reason: invalid class name */
public final class AnonymousClass2HH extends AnonymousClass2HL implements AnonymousClass04S, AnonymousClass4OM {
    public RecyclerView A00;
    public AnonymousClass16I A01;
    public C76003oA A02;
    public boolean A03;
    public final AnonymousClass3CE A04;
    public final AnonymousClass1RY A05;
    public final C20810yC A06;
    public final C32241dD A07;
    public final C32131d1 A08;
    public final NewsletterViewModel A09;
    public final AnonymousClass00T A0A = C36431kI.A1I(new AnonymousClass4AU(this));
    public final C71723hE A0B;

    public static final void A00(AnonymousClass2HH r11) {
        C28981Uw r4;
        AnonymousClass11F chatJid = r11.A01.getChatJid();
        if ((chatJid instanceof C28981Uw) && (r4 = (C28981Uw) chatJid) != null) {
            boolean z = !r11.A0B();
            C32241dD r3 = r11.A07;
            long A082 = C36351kA.A08(r11.A0A);
            NewsletterViewModel newsletterViewModel = r11.A09;
            List<AnonymousClass3JI> A0w = C36401kF.A0w(newsletterViewModel.A01);
            if (A0w == null) {
                A0w = C023409w.A00;
            }
            ArrayList A0z = C36351kA.A0z(A0w);
            for (AnonymousClass3JI r0 : A0w) {
                A0z.add(r0.A02);
            }
            List<AnonymousClass3JI> A0w2 = C36401kF.A0w(newsletterViewModel.A00);
            if (A0w2 == null) {
                A0w2 = C023409w.A00;
            }
            ArrayList A0z2 = C36351kA.A0z(A0w2);
            for (AnonymousClass3JI r02 : A0w2) {
                A0z2.add(r02.A02);
            }
            r3.A0E(r4, C52512pY.SIMILAR_NEWSLETTERS_NEWSLETTER_THREAD, A0z, A0z2, z ? 1 : 0, A082);
        }
    }

    public static final boolean A01(AnonymousClass2HH r3) {
        AnonymousClass3IZ A012;
        AnonymousClass11F chatJid = r3.A01.getChatJid();
        if (!(chatJid instanceof C28981Uw)) {
            chatJid = null;
        }
        if (!(chatJid == null || (A012 = r3.A0B.A01(chatJid)) == null)) {
            boolean A0M = A012.A00.A0M();
            if (Boolean.valueOf(A0M) != null) {
                return A0M;
            }
        }
        return false;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass2HH(ViewGroup viewGroup, AnonymousClass3CE r5, AnonymousClass16I r6, AnonymousClass1RY r7, AnonymousClass4V7 r8, C20810yC r9, C71723hE r10, C32241dD r11, C32131d1 r12, NewsletterViewModel newsletterViewModel) {
        super(viewGroup, r8, 81);
        C36321k7.A1B(r9, r6, r10, r11, r5);
        C36321k7.A13(r8, viewGroup, newsletterViewModel);
        AnonymousClass00C.A0D(r7, 9);
        this.A06 = r9;
        this.A01 = r6;
        this.A0B = r10;
        this.A07 = r11;
        this.A04 = r5;
        this.A09 = newsletterViewModel;
        this.A05 = r7;
        this.A08 = r12;
        AnonymousClass155 BoP = r8.BoP();
        BoP.A06.A04(new SimilarNewslettersBanner$1$1(this));
        newsletterViewModel.A03.A00.A08(BoP, this);
        newsletterViewModel.A00.A08(BoP, this);
    }

    public void BTH(Object obj) {
        if (!A01(this)) {
            this.A03 = false;
        }
        boolean A0B2 = A0B();
        boolean A0C = A0C();
        if (A0B2) {
            if (!A0C && !this.A03) {
                ((C87694Pu) this.A01).getConversationBanners().A01(getClass(), true);
            }
            C76003oA r1 = this.A02;
            if (r1 != null) {
                List A0w = C36401kF.A0w(this.A09.A00);
                if (A0w == null) {
                    A0w = C023409w.A00;
                }
                r1.A01(A0w);
            }
        } else if (A0C) {
            A0A(true);
        }
    }
}
