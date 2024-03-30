package X;

import android.content.Context;
import android.content.res.Configuration;
import com.whatsapp.R;
import com.whatsapp.conversation.carousel.ConversationCarousel;

/* renamed from: X.2Hy  reason: invalid class name and case insensitive filesystem */
public final class C43492Hy extends AnonymousClass8ZZ {
    public void onConfigurationChanged(Configuration configuration) {
        AnonymousClass00C.A0D(configuration, 0);
        super.onConfigurationChanged(configuration);
        C37541mm.A05(this);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C43492Hy(Context context, C89004Uw r4, AnonymousClass2bV r5) {
        super(context, r4, r5);
        C36321k7.A11(context, r5, r4);
        A2F();
        ConversationCarousel reelCarousel = getReelCarousel();
        reelCarousel.setVisibility(0);
        reelCarousel.setAdapter(this.A06);
        reelCarousel.A16();
        this.A00 = reelCarousel;
        A2H();
        A2D();
        A2I(r5);
    }

    private final ConversationCarousel getReelCarousel() {
        return (ConversationCarousel) C36361kB.A0F(this, R.id.conversation_reels_carousel_recycler_view);
    }

    public void A2D() {
        super.A2D();
        AnonymousClass2HQ r0 = this.A06;
        if (r0 != null) {
            r0.A06();
            A2G();
        }
    }
}
