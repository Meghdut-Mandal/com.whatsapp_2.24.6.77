package X;

import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.pininchat.banner.PinInChatBannerMultiplePinsIndicator;
import com.whatsapp.pininchat.banner.PinInChatBannerViewModel;

/* renamed from: X.2HL  reason: invalid class name */
public abstract class AnonymousClass2HL extends C80183uz {
    public final float A00;
    public final ViewGroup A01;
    public final AnonymousClass00T A02;

    public static final void A02(AnonymousClass2HL r9, C87684Pt r10) {
        ViewGroup viewGroup = r9.A01;
        if (viewGroup.getVisibility() != 8) {
            AnonymousClass07B supportActionBar = C80183uz.A05(r9).getSupportActionBar();
            if (supportActionBar != null) {
                float A08 = supportActionBar.A08();
                float f = r9.A00;
                if (A08 != f) {
                    supportActionBar.A0F(f);
                    C011004s.A05(viewGroup, 0.0f);
                }
            }
            viewGroup.setVisibility(8);
            if (r9 instanceof AnonymousClass2HH) {
                AnonymousClass2HH r92 = (AnonymousClass2HH) r9;
                AnonymousClass11F chatJid = r92.A01.getChatJid();
                if ((chatJid instanceof C28981Uw) && chatJid != null) {
                    int A012 = C36431kI.A01(AnonymousClass2HH.A01(r92) ? 1 : 0);
                    C32241dD r6 = r92.A07;
                    long A082 = C36351kA.A08(r92.A0A);
                    C52512pY r3 = C52512pY.SIMILAR_NEWSLETTERS_NEWSLETTER_THREAD;
                    AnonymousClass2S1 r1 = new AnonymousClass2S1();
                    r1.A07 = chatJid.user;
                    r1.A00 = 2;
                    r1.A01 = Integer.valueOf(A012);
                    r1.A02 = Integer.valueOf(AnonymousClass3RE.A01(r3));
                    r1.A06 = Long.valueOf(A082);
                    r6.A03.Bly(r1);
                }
            } else if (r9 instanceof AnonymousClass2HF) {
                AnonymousClass2HF r93 = (AnonymousClass2HF) r9;
                PinInChatBannerMultiplePinsIndicator pinInChatBannerMultiplePinsIndicator = r93.A00;
                if (pinInChatBannerMultiplePinsIndicator != null) {
                    pinInChatBannerMultiplePinsIndicator.setVisibility(4);
                    r93.A00 = null;
                }
                r93.A01.removeAllViews();
                PinInChatBannerViewModel pinInChatBannerViewModel = r93.A03;
                Runnable runnable = pinInChatBannerViewModel.A00;
                if (runnable != null) {
                    pinInChatBannerViewModel.A02.A0G(runnable);
                }
                pinInChatBannerViewModel.A00 = null;
            }
            r10.BYs();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass2HL(ViewGroup viewGroup, AnonymousClass4V7 r3, int i) {
        super(r3, i);
        C36321k7.A0x(r3, viewGroup);
        this.A01 = viewGroup;
        this.A00 = C36381kD.A0O(r3.BoP()).A08();
        this.A02 = C36431kI.A1I(new C84914Fb(r3, this));
    }

    public final View A0D(int i) {
        return C36371kC.A0J(C80183uz.A05(this).getLayoutInflater(), this.A01, i, true);
    }
}
