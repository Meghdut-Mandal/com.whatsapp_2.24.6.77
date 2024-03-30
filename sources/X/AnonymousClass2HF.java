package X;

import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.pininchat.banner.PinInChatBannerMultiplePinsIndicator;
import com.whatsapp.pininchat.banner.PinInChatBannerViewModel;

/* renamed from: X.2HF  reason: invalid class name */
public class AnonymousClass2HF extends AnonymousClass2HL {
    public PinInChatBannerMultiplePinsIndicator A00;
    public final AnonymousClass2K3 A01;
    public final C20810yC A02;
    public final PinInChatBannerViewModel A03;
    public final C26341Ju A04;
    public final C26321Js A05;

    public AnonymousClass2HF(ViewGroup viewGroup, AnonymousClass4V7 r6, AnonymousClass2K3 r7, C20810yC r8, PinInChatBannerViewModel pinInChatBannerViewModel, C26321Js r10, C26341Ju r11) {
        super(viewGroup, r6, 50);
        this.A02 = r8;
        this.A05 = r10;
        this.A04 = r11;
        this.A01 = r7;
        this.A03 = pinInChatBannerViewModel;
        C001700s r2 = pinInChatBannerViewModel.A01;
        AnonymousClass4V7 r3 = this.A01;
        C88554Td.A00(r3.BoP(), r2, this, 25);
        C88554Td.A00(r3.BoP(), pinInChatBannerViewModel.A06, this, 23);
        C28201Rs r22 = pinInChatBannerViewModel.A07;
        if (r22.A00 <= 0) {
            C88554Td.A00(r3.BoP(), r22, this, 24);
        }
    }

    public static void A00(AnonymousClass2HF r2, C62923Ib r3) {
        PinInChatBannerMultiplePinsIndicator pinInChatBannerMultiplePinsIndicator;
        int i;
        if (r2.A00 != null && r2.A04.A00() > 1) {
            if (r3.A01 <= 1) {
                pinInChatBannerMultiplePinsIndicator = r2.A00;
                i = 4;
            } else {
                r2.A00.setupIndicator(r3);
                pinInChatBannerMultiplePinsIndicator = r2.A00;
                i = 0;
            }
            pinInChatBannerMultiplePinsIndicator.setVisibility(i);
        }
    }

    public static void A01(AnonymousClass2HF r6, AnonymousClass3T1 r7) {
        ViewGroup viewGroup = r6.A01;
        C66953Xy.A00(viewGroup, r6, 16);
        AnonymousClass4Y7.A00(viewGroup, r6, r7, 2);
        C26321Js r2 = r6.A05;
        int i = r7.A1I;
        AnonymousClass4VA r4 = (AnonymousClass4VA) ((AnonymousClass9XG) r2.A02.getValue()).A00(i);
        if (r4.BMi(r7) || r4.BxS(r7)) {
            TextEmojiLabel A0O = C36351kA.A0O(viewGroup, R.id.pinnedMessagesBanner_content);
            View findViewById = viewGroup.findViewById(R.id.pinnedMessagesBanner_thumbnail_stub);
            if (findViewById == null) {
                findViewById = viewGroup.findViewById(R.id.pinnedMessagesBanner_thumbnail);
                findViewById.setVisibility(8);
            }
            AnonymousClass00C.A0B(findViewById);
            C62933Ic r1 = new C62933Ic(findViewById, A0O);
            A0O.setTextDirection(5);
            r4.Bo6(r1, r7);
            return;
        }
        r2.A00.A0E("pin-in-chat-unexpected-render", String.valueOf(i), false);
    }
}
