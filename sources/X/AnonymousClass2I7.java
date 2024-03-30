package X;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;
import com.whatsapp.contact.FacepileView;
import com.whatsapp.conversation.conversationrow.ConversationRowEvent$fillActionButton$3;
import java.util.concurrent.TimeUnit;

/* renamed from: X.2I7  reason: invalid class name */
public final class AnonymousClass2I7 extends C174878Yu {
    public AnonymousClass1Pp A00;
    public AnonymousClass1DW A01;
    public C29541Xa A02;
    public C29581Xe A03;
    public C27541Op A04;
    public AnonymousClass1EM A05;
    public C005502l A06;
    public C005502l A07;
    public final LinearLayout A08 = ((LinearLayout) C36361kB.A0G(this, R.id.event_action));
    public final LinearLayout A09 = ((LinearLayout) C36361kB.A0G(this, R.id.responses_row));
    public final TextEmojiLabel A0A = C36351kA.A0O(this, R.id.event_name);
    public final WaImageView A0B = ((WaImageView) C36361kB.A0G(this, R.id.event_action_icon));
    public final WaImageView A0C = ((WaImageView) C36361kB.A0G(this, R.id.event_icon));
    public final WaTextView A0D = C36341k9.A0Q(this, R.id.event_action_text);
    public final WaTextView A0E = C36341k9.A0Q(this, R.id.event_date);
    public final WaTextView A0F = C36341k9.A0Q(this, R.id.responses_going_count);
    public final FacepileView A0G = ((FacepileView) C36361kB.A0G(this, R.id.responses_face_pile_view));
    public final AnonymousClass1RY A0H;
    public final AnonymousClass1RJ A0I = C36341k9.A0X(this, R.id.event_call);
    public final AnonymousClass1RJ A0J = C36341k9.A0X(this, R.id.event_location);
    public final AnonymousClass040 A0K = C009403z.A02(getIoDispatcher());
    public final C87854Qk A0L = new C89584Xc(this, 9);
    public final AnonymousClass1RJ A0M = C36341k9.A0X(this, R.id.invalid_event_text);

    public static /* synthetic */ void getIoDispatcher$annotations() {
    }

    public static /* synthetic */ void getMainDispatcher$annotations() {
    }

    public int getUserNameInGroupLayoutOption() {
        return 1;
    }

    public final void setContactAvatars(AnonymousClass1Pp r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A00 = r2;
    }

    public final void setDeepLinkHelper(AnonymousClass1DW r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A01 = r2;
    }

    public final void setEventMessageManager(C29541Xa r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A02 = r2;
    }

    public final void setEventUtils(C29581Xe r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A03 = r2;
    }

    public void setFMessage(AnonymousClass3T1 r4) {
        AnonymousClass00C.A0D(r4, 0);
        C18740tg.A0F(r4 instanceof AnonymousClass2bT, AnonymousClass000.A0l(r4, "Expected a message of type FMessageEvent but instead found ", AnonymousClass000.A0u()));
        this.A0K = r4;
    }

    public final void setGroupChatUtils(AnonymousClass1EM r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A05 = r2;
    }

    public final void setGroupDataChangedListeners(C27541Op r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A04 = r2;
    }

    public final void setIoDispatcher(C005502l r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A06 = r2;
    }

    public final void setMainDispatcher(C005502l r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A07 = r2;
    }

    public static final void A0B(View.OnClickListener onClickListener, AnonymousClass2I7 r4, boolean z) {
        int i;
        LinearLayout linearLayout = r4.A08;
        linearLayout.setOnClickListener(onClickListener);
        linearLayout.setEnabled(AnonymousClass000.A1V(onClickListener));
        WaTextView waTextView = r4.A0D;
        Context context = r4.getContext();
        if (onClickListener == null) {
            i = R.color.f6nameremoved;
            if (z) {
                i = R.color.f6nameremoved;
            }
        } else {
            i = R.color.f6nameremoved;
        }
        C36331k8.A0r(context, waTextView, i);
    }

    public static final void A0D(AnonymousClass2I7 r8, AnonymousClass2bT r9) {
        C52292pC r1;
        C48932iI r2;
        C52192p2 r0 = r9.A02;
        C52192p2 r4 = C52192p2.VALID;
        boolean z = true;
        if (r0 != r4) {
            z = false;
            r8.A0M.A07(new AnonymousClass4ZO(r9, r8, 0));
        }
        AnonymousClass1RJ r12 = r8.A0M;
        int i = 8;
        if (!z) {
            i = 0;
        }
        r12.A03(i);
        C48812i6 r3 = null;
        if (r9.A06 || r9.A02 != r4) {
            r8.A0B.setVisibility(8);
        } else if (r8.getEventUtils().A01(r9)) {
            r8.A0B.setVisibility(8);
            C29581Xe eventUtils = r8.getEventUtils();
            if (C19970wo.A00(eventUtils.A01) < r9.A0I + TimeUnit.DAYS.toMillis(C36441kJ.A0B(eventUtils.A02, 6265))) {
                r3 = new C48812i6(r8, r9, 39);
            }
        } else {
            boolean z2 = r9.A1J.A02;
            if (z2) {
                r8.A0B.setVisibility(8);
                if (C20800yB.A01(C21000yV.A01, r8.A0G, 7357)) {
                    A0B(new C48812i6(r8, r9, 40), r8, z2);
                } else {
                    r8.A08.setOnClickListener((View.OnClickListener) null);
                }
            } else {
                boolean A042 = r8.getEventMessageManager().A04(r9);
                WaImageView waImageView = r8.A0B;
                if (A042) {
                    waImageView.setVisibility(8);
                    r2 = null;
                } else {
                    waImageView.setVisibility(0);
                    C46762bd A012 = r8.getEventMessageManager().A01(r9);
                    if (A012 == null || (r1 = A012.A01) == null) {
                        r1 = C52292pC.UNKNOWN;
                    }
                    r2 = new C48932iI(r1, r9, r8, 13);
                }
                A0B(r2, r8, z2);
            }
            C36331k8.A1T(new ConversationRowEvent$fillActionButton$3(r8, r9, (C023509x) null), r8.A0K);
            return;
        }
        A0B(r3, r8, r9.A1J.A02);
    }

    public final AnonymousClass1Pp getContactAvatars() {
        AnonymousClass1Pp r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("contactAvatars");
    }

    public final AnonymousClass1DW getDeepLinkHelper() {
        AnonymousClass1DW r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("deepLinkHelper");
    }

    public final C29541Xa getEventMessageManager() {
        C29541Xa r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("eventMessageManager");
    }

    public final C29581Xe getEventUtils() {
        C29581Xe r0 = this.A03;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("eventUtils");
    }

    public AnonymousClass2bT getFMessage() {
        AnonymousClass3T1 r1 = this.A0K;
        AnonymousClass00C.A0E(r1, "null cannot be cast to non-null type com.whatsapp.event.fmessage.FMessageEvent");
        return (AnonymousClass2bT) r1;
    }

    public final AnonymousClass1EM getGroupChatUtils() {
        AnonymousClass1EM r0 = this.A05;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("groupChatUtils");
    }

    public final C27541Op getGroupDataChangedListeners() {
        C27541Op r0 = this.A04;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("groupDataChangedListeners");
    }

    public final C005502l getIoDispatcher() {
        C005502l r0 = this.A06;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("ioDispatcher");
    }

    public int getMainChildMaxWidth() {
        if (this.A0d.BLu(getFMessage())) {
            return 0;
        }
        return getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
    }

    public final C005502l getMainDispatcher() {
        C005502l r0 = this.A07;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("mainDispatcher");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass2I7(Context context, AnonymousClass1RY r4, C89004Uw r5, AnonymousClass2bT r6) {
        super(context, r5, r6);
        C36321k7.A0x(context, r6);
        AnonymousClass00C.A0D(r4, 4);
        this.A0H = r4;
        A0C(this);
    }

    public static final void A0C(AnonymousClass2I7 r8) {
        AnonymousClass2bT fMessage = r8.getFMessage();
        r8.A0A.setText(r8.A1V(AnonymousClass14B.A0D(fMessage.A05, 150)));
        String A022 = AnonymousClass3UY.A02(r8.A19, r8.A0E, fMessage.A00);
        AnonymousClass00C.A08(A022);
        String A002 = AnonymousClass3UM.A00(r8.A0E, fMessage.A00);
        WaTextView waTextView = r8.A0E;
        C18820ts r4 = r8.A0E;
        AnonymousClass00C.A07(r4);
        Context context = r8.getContext();
        Object[] A0M2 = AnonymousClass001.A0M();
        C36331k8.A1N(A022, A002, A0M2);
        String string = context.getString(R.string.f12nameremoved, A0M2);
        AnonymousClass00C.A08(string);
        waTextView.setText(AnonymousClass3UM.A01(r4, string, fMessage.A00));
        String A023 = r8.getEventMessageManager().A02(fMessage);
        if (A023 == null || A023.length() == 0) {
            r8.A0J.A03(8);
        } else {
            AnonymousClass1RJ r1 = r8.A0J;
            C36441kJ.A0V(r1).setText(A023);
            r1.A03(0);
        }
        String str = fMessage.A04;
        if (str == null || str.length() == 0 || !r8.getDeepLinkHelper().A0F(fMessage.A04)) {
            r8.A0I.A03(8);
        } else {
            AnonymousClass1RJ r2 = r8.A0I;
            C36441kJ.A0V(r2).setText(R.string.f12nameremoved);
            r2.A03(0);
        }
        r8.setOnClickListener(new C48812i6(r8, fMessage, 41));
        A0D(r8, fMessage);
        boolean A042 = r8.getEventMessageManager().A04(fMessage);
        WaImageView waImageView = r8.A0C;
        Context context2 = r8.getContext();
        int i = R.color.f6nameremoved;
        if (A042) {
            i = R.color.f6nameremoved;
        }
        AnonymousClass06T.A00(C36431kI.A0G(context2, i), waImageView);
        r8.A1w(fMessage);
        r8.getEventUtils().A00(fMessage, "ConversationRowEvent", new C86014Jh(r8));
    }

    public void A1Y() {
        A0C(this);
        AnonymousClass2IR.A0d(this, false);
    }

    public void A22(AnonymousClass3T1 r2, boolean z) {
        boolean A1W = C36371kC.A1W(r2, getFMessage());
        super.A22(r2, z);
        if (z || A1W) {
            A0C(this);
        }
    }

    public int getCenteredLayoutId() {
        return R.layout.f9nameremoved;
    }

    public int getIncomingLayoutId() {
        return R.layout.f9nameremoved;
    }

    public int getOutgoingLayoutId() {
        return R.layout.f9nameremoved;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getGroupDataChangedListeners().A00(this.A0L);
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getGroupDataChangedListeners().A01(this.A0L);
        C07570Yj.A03(this.A0K.BAE());
    }
}
