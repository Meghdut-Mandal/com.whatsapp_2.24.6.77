package X;

import android.content.Context;
import android.view.accessibility.AccessibilityManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaTextView;
import com.whatsapp.conversation.conversationrow.ConversationRowParticipantHeaderMainView;
import java.util.List;

/* renamed from: X.8Yr  reason: invalid class name and case insensitive filesystem */
public class C174848Yr extends AnonymousClass2IR {
    public C116325kP A00;
    public List A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public final LinearLayout A05;
    public final LinearLayout A06;
    public final WaTextView A07;
    public final AnonymousClass1RY A08;
    public final AnonymousClass1RJ A09;
    public final List A0A = AnonymousClass001.A0I();
    public final boolean A0B;
    public final LinearLayout A0C;
    public final TextEmojiLabel A0D;

    public int getUserNameInGroupLayoutOption() {
        return 1;
    }

    private void A0B(int i) {
        int i2;
        LinearLayout linearLayout = this.A0C;
        linearLayout.setVisibility(0);
        TextView A0O = C36391kE.A0O(linearLayout, R.id.poll_type_text);
        ImageView A0G = C36401kF.A0G(linearLayout, R.id.multi_selection_poll_check_mark);
        Context context = getContext();
        if (i == 1) {
            C36391kE.A18(context, A0G, R.drawable.ic_round_check_poll_type);
            i2 = R.string.f12nameremoved;
        } else {
            C36391kE.A18(context, A0G, R.drawable.ic_round_check_multi_selection_poll_type);
            i2 = R.string.f12nameremoved;
        }
        A0O.setText(i2);
    }

    private void setEnabledForAccessibility(boolean z) {
        LinearLayout linearLayout = this.A06;
        if (z) {
            linearLayout.setImportantForAccessibility(1);
            ConversationRowParticipantHeaderMainView conversationRowParticipantHeaderMainView = this.A0w;
            if (conversationRowParticipantHeaderMainView != null) {
                conversationRowParticipantHeaderMainView.setImportantForAccessibility(1);
                return;
            }
            return;
        }
        linearLayout.setImportantForAccessibility(4);
        ConversationRowParticipantHeaderMainView conversationRowParticipantHeaderMainView2 = this.A0w;
        if (conversationRowParticipantHeaderMainView2 != null) {
            conversationRowParticipantHeaderMainView2.setImportantForAccessibility(2);
        }
    }

    public void A16() {
        if (!this.A04) {
            this.A04 = true;
            C27861Qc A0n = C175108Zr.A0n(this);
            C18800tq r4 = A0n.A0M;
            C27111My A0m = C175108Zr.A0m(r4, A0n, this);
            C18830tt r2 = r4.A00;
            C175108Zr.A0y(r4, r2, r2, this);
            C175108Zr.A11(r4, this);
            C175108Zr.A14(r4, this, C165597tg.A0h(r4));
            C175108Zr.A12(r4, this);
            C175108Zr.A10(r4, r2, this, C175108Zr.A0q(r4));
            C175108Zr.A13(r4, this);
            C19470v6 A0k = C175108Zr.A0k(A0m, r4, r2, this, C165577te.A0U(r4));
            C175108Zr.A0v(A0k, r4, r2, this, C175108Zr.A0o(r4, this));
            C175108Zr.A0w(A0m, r4, r2, this);
            C175108Zr.A0z(r4, r2, A0n, this, C175108Zr.A0p(r2));
            C175108Zr.A0x(A0m, A0n, this);
            C175108Zr.A0u(A0k, r4, r2, A0n, this);
            this.A00 = (C116325kP) A0n.A02.get();
        }
    }

    public /* synthetic */ void A2D() {
        if (((AccessibilityManager) this.A05.getContext().getSystemService("accessibility")).isTouchExplorationEnabled()) {
            boolean A1Q = C36431kI.A1Q(this.A02 ? 1 : 0);
            this.A02 = A1Q;
            setEnabledForAccessibility(A1Q);
        }
    }

    public int getMainChildMaxWidth() {
        if (this.A0d.BLu(getFMessage())) {
            return 0;
        }
        return getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
    }

    public void setFMessage(AnonymousClass3T1 r2) {
        C18740tg.A0C(r2 instanceof AnonymousClass2bS);
        this.A0K = r2;
    }

    public C174848Yr(Context context, AnonymousClass1RY r9, C89004Uw r10, AnonymousClass2bS r11) {
        super(context, r10, r11);
        C44072La r0;
        A16();
        this.A08 = r9;
        LinearLayout A0U = C90514aH.A0U(this, R.id.polls_main_layout);
        this.A05 = A0U;
        TextEmojiLabel A0O = C36401kF.A0O(this, R.id.poll_name);
        this.A0D = A0O;
        C36331k8.A1A(this.A0G, A0O);
        A0O.setAutoLinkMask(0);
        A0O.setLinksClickable(false);
        this.A06 = C90514aH.A0U(this, R.id.poll_options);
        this.A0C = C90514aH.A0U(this, R.id.poll_type_label);
        AnonymousClass1RJ A0X = C36341k9.A0X(this, R.id.invalid_poll_text);
        this.A09 = A0X;
        A0X.A07(new AnonymousClass4ZO(r11, this, 2));
        this.A07 = C36401kF.A0Q(this, R.id.view_details);
        AnonymousClass11F r1 = getFMessage().A1J.A00;
        boolean z = false;
        if ((r1 instanceof C28981Uw) && ((r0 = (C44072La) this.A0F.A09(r1, false)) == null || !r0.A0L() || !this.A0G.A0E(6382))) {
            z = true;
        }
        int i = 8;
        if (z) {
            this.A07.setVisibility(8);
        } else {
            WaTextView waTextView = this.A07;
            AnonymousClass3YF.A00(waTextView, this, context, 32);
            waTextView.setVisibility(this.A0G.A0E(1948) ? 0 : i);
            C33521fV.A02(waTextView);
        }
        A0B(r11.A01);
        A0O.setOnLongClickListener(this.A2W);
        boolean A0E = this.A0G.A0E(2390);
        this.A0B = A0E;
        if (!A0E) {
            setEnabledForAccessibility(false);
            this.A03 = false;
        } else if (((AccessibilityManager) A0U.getContext().getSystemService("accessibility")).isTouchExplorationEnabled()) {
            this.A03 = true;
            C33521fV.A03(A0U, R.string.f12nameremoved);
            setEnabledForAccessibility(false);
            C66953Xy.A00(A0U, this, 42);
        }
        A0C(false);
    }

    private void A0C(boolean z) {
        AnonymousClass2bS r3 = (AnonymousClass2bS) getFMessage();
        String str = r3.A03;
        if (str != null) {
            setMessageText(str, this.A0D, r3);
        }
        A0B(r3.A01);
        AnonymousClass752 r2 = new AnonymousClass752(this, r3, 17, z);
        this.A06.setTag(r3.A1J);
        if (!C29591Xf.A00(r3, 67)) {
            r2.run();
        } else {
            this.A0a.A01(r3, r2, 67);
        }
    }

    public void A1Y() {
        super.A1Y();
        A0C(true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0022, code lost:
        if (r2 == false) goto L_0x001e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A22(X.AnonymousClass3T1 r5, boolean r6) {
        /*
            r4 = this;
            X.3T1 r0 = r4.getFMessage()
            r3 = 1
            r1 = 0
            r2 = 0
            if (r5 == r0) goto L_0x0016
            r2 = 1
            boolean r0 = r4.A03
            if (r0 == 0) goto L_0x0016
            r4.A02 = r1
            android.widget.LinearLayout r1 = r4.A06
            r0 = 4
            r1.setImportantForAccessibility(r0)
        L_0x0016:
            super.A22(r5, r6)
            if (r6 != 0) goto L_0x0022
            if (r2 == 0) goto L_0x0021
        L_0x001d:
            r3 = 0
        L_0x001e:
            r4.A0C(r3)
        L_0x0021:
            return
        L_0x0022:
            if (r2 != 0) goto L_0x001d
            goto L_0x001e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C174848Yr.A22(X.3T1, boolean):void");
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

    public List getPollVoteSelectedOptionIds() {
        return this.A01;
    }
}
