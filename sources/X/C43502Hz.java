package X;

import android.content.Context;
import android.content.res.Configuration;
import android.view.ViewStub;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.conversation.carousel.ConversationCarousel;

/* renamed from: X.2Hz  reason: invalid class name and case insensitive filesystem */
public final class C43502Hz extends C174938Za {
    public void onConfigurationChanged(Configuration configuration) {
        AnonymousClass00C.A0D(configuration, 0);
        super.onConfigurationChanged(configuration);
        C37541mm.A05(this);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C43502Hz(Context context, C89004Uw r4, AnonymousClass2bV r5) {
        super(context, r4, r5);
        C36321k7.A0x(context, r5);
        ConversationCarousel providerLinkCarousel = getProviderLinkCarousel();
        providerLinkCarousel.setVisibility(0);
        providerLinkCarousel.setAdapter(this.A06);
        providerLinkCarousel.A16();
        this.A00 = providerLinkCarousel;
        A2H();
        A2D();
        A2I(r5);
    }

    private final ConversationCarousel getProviderLinkCarousel() {
        ViewStub A0M = C36431kI.A0M(this, R.id.carousel_bottom_component_stub);
        if (A0M != null) {
            A0M.inflate();
        }
        return (ConversationCarousel) C36361kB.A0F(this, R.id.conversation_links_carousel_recycler_view);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x003b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A2D() {
        /*
            r5 = this;
            super.A2D()
            r0 = 2131428603(0x7f0b04fb, float:1.8478855E38)
            android.view.ViewStub r0 = X.C36431kI.A0M(r5, r0)
            if (r0 == 0) goto L_0x000f
            r0.inflate()
        L_0x000f:
            X.3T1 r0 = r5.A0K
            X.3KQ r4 = r0.A0N()
            if (r4 == 0) goto L_0x0058
            X.2p5 r3 = r4.A01
            if (r3 == 0) goto L_0x0058
            r0 = 2131433024(0x7f0b1640, float:1.8487822E38)
            android.widget.ImageView r2 = X.C36391kE.A0N(r5, r0)
            if (r2 == 0) goto L_0x0058
            r0 = 2131433674(0x7f0b18ca, float:1.848914E38)
            android.widget.TextView r1 = X.C36391kE.A0P(r5, r0)
            if (r1 == 0) goto L_0x0058
            X.2p5 r0 = X.C52222p5.BING
            if (r3 != r0) goto L_0x0075
            r0 = 2131231105(0x7f080181, float:1.8078282E38)
        L_0x0034:
            r2.setImageResource(r0)
        L_0x0037:
            java.lang.String r0 = r4.A05
            if (r0 == 0) goto L_0x003e
            r1.setText(r0)
        L_0x003e:
            X.3T1 r0 = r5.A0K
            X.3KQ r0 = r0.A0N()
            if (r0 == 0) goto L_0x0058
            java.lang.String r2 = r0.A04
            if (r2 == 0) goto L_0x0058
            r0 = 2131428851(0x7f0b05f3, float:1.8479358E38)
            android.view.View r1 = r5.findViewById(r0)
            if (r1 == 0) goto L_0x0058
            r0 = 10
            X.C36421kH.A14(r1, r5, r2, r0)
        L_0x0058:
            r0 = 2131429221(0x7f0b0765, float:1.8480109E38)
            android.view.View r0 = r5.findViewById(r0)
            X.C36331k8.A0y(r0)
            X.3T1 r0 = r5.A0K
            X.AnonymousClass00C.A08(r0)
            r5.A1v(r0)
            X.2HQ r0 = r5.A06
            if (r0 == 0) goto L_0x0074
            r0.A06()
            r5.A2G()
        L_0x0074:
            return
        L_0x0075:
            X.2p5 r0 = X.C52222p5.GOOGLE
            if (r3 != r0) goto L_0x0037
            r0 = 2131231691(0x7f0803cb, float:1.807947E38)
            goto L_0x0034
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C43502Hz.A2D():void");
    }

    public TextView getDateView() {
        return C36391kE.A0P(this, R.id.plugin_date);
    }
}
