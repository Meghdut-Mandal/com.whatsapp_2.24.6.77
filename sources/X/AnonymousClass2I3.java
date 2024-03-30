package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import com.whatsapp.wds.components.button.WDSButton;

/* renamed from: X.2I3  reason: invalid class name */
public class AnonymousClass2I3 extends AnonymousClass8Z6 {
    public C19460v5 A00;
    public AnonymousClass1N4 A01;
    public C25851Hx A02;
    public AnonymousClass4O3 A03;
    public C32831eG A04;
    public C1272367m A05;
    public String A06 = "";
    public boolean A07;
    public boolean A08;
    public boolean A09 = AnonymousClass143.A0H(C37541mm.A01(this));
    public final ShimmerFrameLayout A0A;
    public final TextEmojiLabel A0B;
    public final AnonymousClass155 A0C;
    public final C62643Gy A0D;
    public final C39601su A0E;
    public final WDSButton A0F;
    public final WDSButton A0G;
    public final WDSButton A0H;
    public final ViewStub A0I;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass2I3(Context context, C89004Uw r8, C62643Gy r9, AnonymousClass2bI r10) {
        super(context, r8, r10);
        AnonymousClass00C.A0D(context, 1);
        this.A0D = r9;
        Activity A012 = C24801Dv.A01(context, AnonymousClass01L.class);
        AnonymousClass00C.A0E(A012, "null cannot be cast to non-null type com.whatsapp.WaBaseActivity");
        AnonymousClass155 r5 = (AnonymousClass155) A012;
        this.A0C = r5;
        AnonymousClass4O3 fmxViewModelFactory = getFmxViewModelFactory();
        AnonymousClass141 r4 = this.A03;
        C27871Qd r1 = ((C74793mB) fmxViewModelFactory).A00;
        C39601su r0 = new C39601su((AnonymousClass30N) r1.A02.A0B.get(), r4, C36341k9.A0Z(r1.A01));
        this.A0E = r0;
        C88554Td.A00(r5, r0.A00, new C86024Ji(this), 29);
        WDSButton wDSButton = (WDSButton) C36361kB.A0F(this, R.id.add_btn_fmx);
        this.A0F = wDSButton;
        this.A0G = (WDSButton) C36361kB.A0F(this, R.id.block_btn_fmx);
        WDSButton wDSButton2 = (WDSButton) C36361kB.A0F(this, R.id.safety_tips);
        this.A0H = wDSButton2;
        ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) C36361kB.A0F(this, R.id.shimmer);
        this.A0A = shimmerFrameLayout;
        View A022 = C012005e.A02(this, R.id.signals);
        AnonymousClass00C.A0E(A022, "null cannot be cast to non-null type com.whatsapp.TextEmojiLabel");
        TextEmojiLabel textEmojiLabel = (TextEmojiLabel) A022;
        this.A0B = textEmojiLabel;
        this.A0I = (ViewStub) C36361kB.A0F(this, R.id.hint_chat_attribution);
        if (r9.A05) {
            wDSButton2.setIcon((int) R.drawable.ic_safety_tip);
            wDSButton2.setSize(C34271gk.SMALL);
            wDSButton.setText(R.string.f12nameremoved);
        }
        shimmerFrameLayout.A03();
        textEmojiLabel.setVisibility(8);
        this.A07.setText("");
        C66953Xy.A00(this.A05, this, 38);
        A2H();
    }

    public final void setCountryPhoneInfo(AnonymousClass1N4 r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A01 = r2;
    }

    public final void setEntrypointConversionManager(C25851Hx r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A02 = r2;
    }

    public final void setFmxChatAttributionViewUtil(C19460v5 r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A00 = r2;
    }

    public final void setFmxViewModelFactory(AnonymousClass4O3 r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A03 = r2;
    }

    public final void setIntegratorManager(C32831eG r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A04 = r2;
    }

    public final void setInteropImageLoader(C1272367m r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A05 = r2;
    }

    public final void setTrustSignals(String str) {
        AnonymousClass00C.A0D(str, 0);
        this.A06 = str;
    }

    public static final void A0B(AnonymousClass2I3 r3, Integer num, int i) {
        r3.A0D.A01(r3.A0E, num, i, 0);
    }

    public static final void setupChatAttributionView$lambda$5$lambda$4(C87014Nd r0, AnonymousClass2I3 r1, View view) {
        throw AnonymousClass001.A0A("getChatAttributionBottomSheet");
    }

    public C226815j A2G() {
        return new C43362Hf(this);
    }

    public final void A2H() {
        WDSButton wDSButton;
        int i;
        UserJid A002;
        AnonymousClass9Xu A012;
        AnonymousClass1JZ.A05(this, this.A0E, 0, 0);
        boolean z = this.A09;
        C39601su r2 = this.A0E;
        AnonymousClass30N r0 = r2.A02;
        AnonymousClass141 r9 = r2.A03;
        AnonymousClass4K4 r11 = new AnonymousClass4K4(r2);
        C27871Qd r1 = r0.A00;
        C18800tq r02 = r1.A01;
        C36391kE.A1Q(new C49692jX(C36351kA.A0N(r02), C36341k9.A0S(r02), r9, C27111My.A2K(r1.A00), r11), r2.A04);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
        this.A08.A09(this.A09, this.A03, dimensionPixelSize);
        if (z) {
            C36391kE.A1Q(new AnonymousClass4WP((Object) this, 2), this.A21);
        }
        A2I();
        if (!z) {
            boolean A0O = this.A0h.A0O(C37541mm.A01(this));
            WDSButton wDSButton2 = this.A0G;
            if (A0O) {
                wDSButton2.setVisibility(8);
            } else {
                wDSButton2.setVisibility(0);
                wDSButton2.setAction(C34301gn.DESTRUCTIVE);
                C66953Xy.A00(wDSButton2, this, 39);
                if (C36441kJ.A1J(this.A0T)) {
                    wDSButton = this.A0F;
                    wDSButton.setVisibility(0);
                    i = 37;
                    C66953Xy.A00(wDSButton, this, i);
                }
            }
            this.A0F.setVisibility(8);
        } else {
            this.A0F.setVisibility(8);
            C27251Nm r22 = this.A1T;
            UserJid A013 = C37541mm.A01(this);
            AnonymousClass00C.A0E(A013, "null cannot be cast to non-null type com.whatsapp.jid.InteropUserJid");
            AnonymousClass00C.A0D(A013, 0);
            boolean contains = r22.A02.contains(A013);
            wDSButton = this.A0G;
            if (contains) {
                wDSButton.setVisibility(8);
            } else {
                wDSButton.setAction(C34301gn.DESTRUCTIVE);
                i = 35;
                C66953Xy.A00(wDSButton, this, i);
            }
        }
        C66953Xy.A00(this.A0H, this, 36);
        if (this.A0G.A0E(6140) && (A002 = C222813r.A00(this.A0K.A1J.A00)) != null && (A012 = getEntrypointConversionManager().A00.A01(A002)) != null && "business_search".equals(A012.A06) && getFmxChatAttributionViewUtil().A05()) {
            getFmxChatAttributionViewUtil().A02();
            throw AnonymousClass001.A0A("getAttributionTextLayoutId");
        }
    }

    public void A2I() {
        AnonymousClass3SF r2 = this.A06;
        r2.A05(this.A03);
        this.A05.setContentDescription(r2.A01.getText());
        if (this.A09) {
            getIntegratorManager();
            UserJid A012 = C37541mm.A01(this);
            AnonymousClass00C.A0E(A012, "null cannot be cast to non-null type com.whatsapp.jid.InteropUserJid");
            AnonymousClass00C.A0D(A012, 0);
            Log.w("ConversationRowFX/updateInteropContactName no display name");
        }
    }

    public final AnonymousClass1N4 getCountryPhoneInfo() {
        AnonymousClass1N4 r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("countryPhoneInfo");
    }

    public final C25851Hx getEntrypointConversionManager() {
        C25851Hx r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("entrypointConversionManager");
    }

    public final C19460v5 getFmxChatAttributionViewUtil() {
        C19460v5 r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("fmxChatAttributionViewUtil");
    }

    public final AnonymousClass4O3 getFmxViewModelFactory() {
        AnonymousClass4O3 r0 = this.A03;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("fmxViewModelFactory");
    }

    public final C32831eG getIntegratorManager() {
        C32831eG r0 = this.A04;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("integratorManager");
    }

    public final C1272367m getInteropImageLoader() {
        C1272367m r0 = this.A05;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("interopImageLoader");
    }

    public final AnonymousClass155 getActivity() {
        return this.A0C;
    }

    public final WDSButton getAddBtn() {
        return this.A0F;
    }

    public final WDSButton getBlockBtn() {
        return this.A0G;
    }

    public final ViewStub getChatAttributionHintViewStub() {
        return this.A0I;
    }

    public int getLayout() {
        return R.layout.f9nameremoved;
    }

    public final WDSButton getSafetyTipsBtn() {
        return this.A0H;
    }

    public final ShimmerFrameLayout getShimmerLayout() {
        return this.A0A;
    }

    public final TextEmojiLabel getSignals() {
        return this.A0B;
    }

    public final String getTrustSignals() {
        return this.A06;
    }

    public final void setCardViewLogged(boolean z) {
        this.A08 = z;
    }

    public final void setContactAdded(boolean z) {
        this.A07 = z;
    }
}
