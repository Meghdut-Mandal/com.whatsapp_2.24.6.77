package X;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.DialogFragment;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaImageView;
import com.whatsapp.calling.chatmessages.AdhocParticipantBottomSheet;
import com.whatsapp.calling.chatmessages.CallLogMessageParticipantBottomSheet;
import com.whatsapp.conversation.conversationrow.ConversationRowCallLog$fillView$2;
import com.whatsapp.conversation.conversationrow.ConversationRowCallLog$fillView$3$4;
import com.whatsapp.conversation.conversationrow.ConversationRowCallLog$runIfGroupContact$1;
import com.whatsapp.conversation.conversationrow.ConversationRowCallLog$runOnCoroutineScope$1$1;
import com.whatsapp.jid.UserJid;
import java.util.Objects;
import java.util.concurrent.CancellationException;

/* renamed from: X.8Yy  reason: invalid class name and case insensitive filesystem */
public final class C174918Yy extends AnonymousClass2IR {
    public AnonymousClass1ND A00;
    public AnonymousClass6X4 A01;
    public AnonymousClass1HP A02;
    public C27721Pm A03;
    public C005502l A04;
    public C005502l A05;
    public AnonymousClass040 A06;
    public boolean A07;
    public final TextEmojiLabel A08 = C36361kB.A0R(this, R.id.call_log_subtitle);
    public final View A09 = C36361kB.A0F(this, R.id.bubble_bg);
    public final TextEmojiLabel A0A = C36361kB.A0R(this, R.id.call_log_title);
    public final WaImageView A0B = ((WaImageView) C36361kB.A0F(this, R.id.call_type_icon));
    public final C32011co A0C = new ATM(this);
    public final AnonymousClass1NK A0D = new ATN(this);
    public final AnonymousClass00T A0E = C36431kI.A1I(new C22153Ahc(this));
    public final AnonymousClass00T A0F = C36431kI.A1I(C22273Aja.A00);
    public final AnonymousClass00T A0G = C36431kI.A1I(new C22154Ahd(this));
    public final AnonymousClass00T A0H = C36431kI.A1I(new C22155Ahe(this));

    public static final void A0C(C106265Iz r9, C174918Yy r10, C107265Nh r11) {
        C225014r r5;
        DialogFragment dialogFragment;
        String str;
        C006302t r2;
        C106265Iz r6 = r9;
        boolean z = false;
        C174918Yy r7 = r10;
        C107265Nh r8 = r11;
        if (!r9.A1Z()) {
            boolean A1X = r9.A1X();
            boolean A1b = r9.A1b();
            if (A1X) {
                if (A1b) {
                    ((AnonymousClass1NE) r10.getCallsManager()).BNr(r10.getContext(), r11, A0B(r9), false);
                    return;
                } else if (r10.A0G.A0E(6497)) {
                    r5 = r10.A0R.A00;
                    if (r5 != null) {
                        r10.getAdhocBottomSheetBridge();
                        C135006by r22 = r11.A04;
                        AnonymousClass00C.A07(r22);
                        dialogFragment = new AdhocParticipantBottomSheet();
                        AnonymousClass011[] r1 = new AnonymousClass011[1];
                        C36341k9.A1J("call_log_message_key", r22, r1, 0);
                        dialogFragment.A17(C05430Pr.A00(r1));
                        r10.getAdhocBottomSheetBridge();
                        str = "AdhocParticipantBottomSheet";
                    } else {
                        return;
                    }
                } else {
                    C225314u r0 = (C225314u) C18860tw.A01(r10.getContext(), C225314u.class);
                    if (r0 != null) {
                        AnonymousClass3UD.A06(r0, r10.A0T, r10.A0l, r0.getAbProps(), r11, A0B(r9));
                        return;
                    }
                    return;
                }
            } else if (A1b) {
                AnonymousClass190 r3 = new AnonymousClass190();
                Context context = r10.getContext();
                UserJid userJid = r11.A04.A01;
                C18740tg.A06(userJid);
                Intent A1b2 = r3.A1b(context, userJid, false);
                AnonymousClass00C.A08(A1b2);
                String str2 = r9.A1J.A01;
                A1b2.setData(Uri.parse(str2));
                A1b2.putExtra("call_id", str2);
                r10.getContext().startActivity(A1b2);
                return;
            } else {
                r7.A0E(new ConversationRowCallLog$fillView$3$4(r6, r7, r8, (C023509x) null, r10.A0G.A07(6403), C36341k9.A0E(r7.A1B).getInt("call_log_education_dialog_shown_count", 0)));
                return;
            }
        } else if (r9.A1Y()) {
            if (r9.A1e()) {
                r2 = new AnonymousClass4MY(r9, r10, r11);
            } else {
                r2 = new AnonymousClass4MZ(r9, r10, r11);
            }
            r10.A0E(new ConversationRowCallLog$runIfGroupContact$1(r10, r11, (C023509x) null, r2));
            return;
        } else if (r9.A1b()) {
            AnonymousClass1ND callsManager = r10.getCallsManager();
            Context context2 = r10.getContext();
            int A0B2 = A0B(r9);
            if (r9.A1e() && !C34681hT.A0N(r10.A0G)) {
                z = true;
            }
            callsManager.BNr(context2, r11, A0B2, z);
            return;
        } else {
            r5 = r10.A0R.A00;
            if (r5 != null) {
                r10.getBottomSheetBridge();
                C135006by r23 = r11.A04;
                AnonymousClass00C.A07(r23);
                dialogFragment = new CallLogMessageParticipantBottomSheet();
                AnonymousClass011[] r12 = new AnonymousClass011[1];
                C36341k9.A1J("call_log_message_key", r23, r12, 0);
                dialogFragment.A17(C05430Pr.A00(r12));
                r10.getBottomSheetBridge();
                str = "CallLogMessageParticipantBottomSheet";
            } else {
                return;
            }
        }
        r5.Btl(dialogFragment, str);
    }

    public static /* synthetic */ void getLatencySensitiveDispatcher$annotations() {
    }

    public static /* synthetic */ void getMainDispatcher$annotations() {
    }

    public void A22(AnonymousClass3T1 r2, boolean z) {
        AnonymousClass00C.A0D(r2, 0);
        boolean A1W = C36371kC.A1W(r2, getFMessage());
        super.A22(r2, z);
        if (z || A1W) {
            A0D(this);
        }
    }

    public int getUserNameInGroupLayoutOption() {
        return 1;
    }

    public final void setCallLogObservers(AnonymousClass1HP r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A02 = r2;
    }

    public final void setCallObservers(C27721Pm r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A03 = r2;
    }

    public final void setCallingMessageUtil(AnonymousClass6X4 r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A01 = r2;
    }

    public final void setCallsManager(AnonymousClass1ND r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A00 = r2;
    }

    public void setFMessage(AnonymousClass3T1 r2) {
        AnonymousClass00C.A0D(r2, 0);
        C18740tg.A0C(r2 instanceof C106265Iz);
        this.A0K = r2;
    }

    public final void setLatencySensitiveDispatcher(C005502l r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A04 = r2;
    }

    public final void setMainDispatcher(C005502l r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A05 = r2;
    }

    private final void A0E(C009003v r4) {
        AnonymousClass040 r2 = this.A06;
        if (r2 == null) {
            r2 = C009403z.A02(getLatencySensitiveDispatcher());
        }
        C36331k8.A1T(new ConversationRowCallLog$runOnCoroutineScope$1$1((C023509x) null, r4), r2);
        this.A06 = r2;
    }

    private final C20560xl getAdhocBottomSheetBridge() {
        return (C20560xl) this.A0E.getValue();
    }

    private final AnonymousClass6C3 getAnimatedVectorDrawableHolder() {
        return (AnonymousClass6C3) this.A0F.getValue();
    }

    private final C20550xk getBottomSheetBridge() {
        return (C20550xk) this.A0G.getValue();
    }

    private final AnonymousClass1RJ getCallLogDeletedStub() {
        return (AnonymousClass1RJ) this.A0H.getValue();
    }

    private final void setCallIconDrawable(C106265Iz r7) {
        WaImageView waImageView;
        Drawable A052;
        if (!this.A0G.A0E(6121)) {
            WaImageView waImageView2 = this.A0B;
            waImageView2.setImageDrawable(getCallingMessageUtil().A05(C36371kC.A0B(waImageView2), getFMessage(), false));
            if (this.A0F.BM2()) {
                getAnimatedVectorDrawableHolder().A02();
                return;
            }
            return;
        }
        getCallingMessageUtil();
        int A002 = AnonymousClass6X4.A00(r7);
        if (A002 != 0) {
            waImageView = this.A0B;
            A052 = getAnimatedVectorDrawableHolder().A00(C36371kC.A0B(this), A002, true);
        } else {
            getAnimatedVectorDrawableHolder().A02();
            waImageView = this.A0B;
            A052 = getCallingMessageUtil().A05(C36371kC.A0B(waImageView), getFMessage(), false);
        }
        waImageView.setImageDrawable(A052);
    }

    public void A16() {
        if (!this.A07) {
            this.A07 = true;
            C27861Qc A0n = C175108Zr.A0n(this);
            C18800tq r2 = A0n.A0M;
            C27111My A0m = C175108Zr.A0m(r2, A0n, this);
            C18830tt r3 = r2.A00;
            C175108Zr.A0y(r2, r3, r3, this);
            C175108Zr.A11(r2, this);
            C175108Zr.A14(r2, this, C165597tg.A0h(r2));
            C175108Zr.A12(r2, this);
            C175108Zr.A10(r2, r3, this, C175108Zr.A0q(r2));
            C175108Zr.A13(r2, this);
            C19470v6 A0k = C175108Zr.A0k(A0m, r2, r3, this, C165577te.A0U(r2));
            C175108Zr.A0v(A0k, r2, r3, this, C175108Zr.A0o(r2, this));
            C175108Zr.A0w(A0m, r2, r3, this);
            C175108Zr.A0z(r2, r3, A0n, this, C175108Zr.A0p(r3));
            C175108Zr.A0x(A0m, A0n, this);
            C175108Zr.A0u(A0k, r2, r3, A0n, this);
            this.A04 = AnonymousClass1BE.A00();
            this.A05 = C24291Bw.A00();
            this.A02 = (AnonymousClass1HP) r2.A1G.get();
            this.A03 = (C27721Pm) r3.A0t.get();
            this.A01 = (AnonymousClass6X4) r2.A1M.get();
            this.A00 = (AnonymousClass1ND) r2.A1N.get();
        }
    }

    public final AnonymousClass1HP getCallLogObservers() {
        AnonymousClass1HP r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("callLogObservers");
    }

    public final C27721Pm getCallObservers() {
        C27721Pm r0 = this.A03;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("callObservers");
    }

    public final AnonymousClass6X4 getCallingMessageUtil() {
        AnonymousClass6X4 r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("callingMessageUtil");
    }

    public final AnonymousClass1ND getCallsManager() {
        AnonymousClass1ND r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("callsManager");
    }

    public C106265Iz getFMessage() {
        AnonymousClass3T1 r1 = this.A0K;
        AnonymousClass00C.A0E(r1, "null cannot be cast to non-null type com.whatsapp.calling.fmessage.FMessageCallLog");
        return (C106265Iz) r1;
    }

    public final C005502l getLatencySensitiveDispatcher() {
        C005502l r0 = this.A04;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("latencySensitiveDispatcher");
    }

    public final C005502l getMainDispatcher() {
        C005502l r0 = this.A05;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("mainDispatcher");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C174918Yy(Context context, C106265Iz r3, C89004Uw r4) {
        super(context, r4, r3);
        C36321k7.A0x(context, r3);
        A16();
        A0D(this);
    }

    public static final int A0B(C106265Iz r1) {
        if (r1.A1b()) {
            return 22;
        }
        if (r1.A1a()) {
            return 45;
        }
        if (r1.A1Y()) {
            return 47;
        }
        return 46;
    }

    public static final void A0D(C174918Yy r11) {
        int intValue;
        C106265Iz fMessage = r11.getFMessage();
        C63503Kh r2 = fMessage.A01;
        Object obj = r2.A00;
        View view = r11.A09;
        view.setOnLongClickListener(r11.A2W);
        if (obj == null) {
            r11.A0B.setVisibility(8);
            r11.A0A.setVisibility(8);
            r11.A08.setVisibility(8);
            view.setVisibility(8);
            r11.getCallLogDeletedStub().A03(0);
            view.setOnClickListener((View.OnClickListener) null);
            return;
        }
        TextEmojiLabel textEmojiLabel = r11.A0A;
        ViewGroup.LayoutParams layoutParams = textEmojiLabel.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        AnonymousClass0BJ r1 = (AnonymousClass0BJ) layoutParams;
        r1.A04 = 0.0f;
        textEmojiLabel.setLayoutParams(r1);
        r11.A0B.setVisibility(0);
        textEmojiLabel.setVisibility(0);
        TextEmojiLabel textEmojiLabel2 = r11.A08;
        textEmojiLabel2.setVisibility(0);
        view.setVisibility(0);
        r11.getCallLogDeletedStub().A03(8);
        textEmojiLabel.setText(r11.getResources().getText(r11.getCallingMessageUtil().A04(fMessage)));
        AnonymousClass6X4 callingMessageUtil = r11.getCallingMessageUtil();
        C222813r r0 = UserJid.Companion;
        C64933Qa r10 = fMessage.A1J;
        UserJid A002 = C222813r.A00(r10.A00);
        C107265Nh r8 = (C107265Nh) r2.A00;
        Integer num = null;
        if (!(A002 == null || r8 == null)) {
            num = Integer.valueOf(r8.A08(A002));
        }
        if (!fMessage.A1X() || !fMessage.A1b() || num == null || ((intValue = num.intValue()) != 100 && (!r10.A02 ? r8 == null || r8.A0S(callingMessageUtil.A00) : intValue == 100 || intValue == 5))) {
            AnonymousClass6X4 callingMessageUtil2 = r11.getCallingMessageUtil();
            Resources resources = r11.getResources();
            AnonymousClass00C.A08(resources);
            textEmojiLabel2.setText(callingMessageUtil2.A07(resources, fMessage, (String) null));
        } else {
            r11.A0E(new ConversationRowCallLog$fillView$2(fMessage, r11, (C023509x) null));
        }
        r11.setCallIconDrawable(fMessage);
        view.setOnClickListener(new C67113Yo((Object) fMessage, (Object) r11, obj, 34));
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

    public int getUserNameViewId() {
        return R.id.conversation_row_call_log_user_name;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getCallLogObservers().registerObserver(this.A0C);
        getCallObservers().registerObserver(this.A0D);
        if (this.A0G.A0E(6121)) {
            AnonymousClass6C3 animatedVectorDrawableHolder = getAnimatedVectorDrawableHolder();
            Context A0B2 = C36371kC.A0B(this);
            AnonymousClass6B2 r2 = animatedVectorDrawableHolder.A01;
            if (r2.A00 != 0 && animatedVectorDrawableHolder.A00 == null) {
                animatedVectorDrawableHolder.A01();
                AnonymousClass0BQ A032 = AnonymousClass0BQ.A03(A0B2, r2.A00);
                if (A032 == null) {
                    A032 = null;
                } else {
                    if (r2.A01) {
                        A032.A08(animatedVectorDrawableHolder.A03);
                    }
                    if (r2.A02) {
                        A032.start();
                    }
                }
                animatedVectorDrawableHolder.A00 = A032;
            }
            AnonymousClass0BQ r1 = animatedVectorDrawableHolder.A00;
            if (r1 != null) {
                this.A0B.setImageDrawable(r1);
            }
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AnonymousClass040 r1 = this.A06;
        if (r1 != null) {
            C009403z.A03((CancellationException) null, r1);
        }
        this.A06 = null;
        getCallLogObservers().unregisterObserver(this.A0C);
        getCallObservers().unregisterObserver(this.A0D);
        if (this.A0G.A0E(6121)) {
            getAnimatedVectorDrawableHolder().A01();
        }
    }
}
