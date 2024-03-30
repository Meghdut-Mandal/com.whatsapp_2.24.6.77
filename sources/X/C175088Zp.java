package X;

import android.content.Context;
import android.content.Intent;
import android.text.SpannableStringBuilder;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.jid.GroupJid;
import java.util.Set;

/* renamed from: X.8Zp  reason: invalid class name and case insensitive filesystem */
public class C175088Zp extends C174868Yt {
    public C19630wG A00;
    public AnonymousClass1EV A01;
    public AnonymousClass1EU A02;
    public AnonymousClass1FR A03;
    public AnonymousClass1HB A04;
    public C193609Md A05;
    public final FrameLayout A06;
    public final ImageView A07;
    public final TextEmojiLabel A08 = C36401kF.A0P(this, R.id.get_started);
    public final TextEmojiLabel A09 = C36401kF.A0O(this, R.id.invite_description);
    public final C21127A9n A0A;

    public int getUserNameInGroupLayoutOption() {
        return 1;
    }

    private void A0B() {
        this.A09.setText(getInviteContext());
        C193609Md r3 = this.A05;
        AnonymousClass974 r5 = new AnonymousClass974();
        C21127A9n a9n = this.A0A;
        if (new AnonymousClass9HZ(2, r5).A01 != null) {
            a9n.A00.setImageResource(R.drawable.payment_invite_bubble_icon);
        }
        if (r3 != null) {
            AnonymousClass1FR r6 = r3.A03;
            Context context = r3.A01.A00;
            C36811lL A0J = r6.A0J(context, AnonymousClass16W.A05, C224514j.A00(context, R.attr.f4nameremoved, R.color.f6nameremoved), R.dimen.f7nameremoved);
            ImageView imageView = this.A07;
            imageView.setVisibility(0);
            imageView.setImageDrawable(A0J);
        }
        TextEmojiLabel textEmojiLabel = this.A08;
        if (textEmojiLabel != null) {
            if (this.A01.A03() && r3 != null) {
                AnonymousClass3T1 fMessage = getFMessage();
                if (!r3.A02.A0F()) {
                    Intent A0G = C165597tg.A0G(r3.A01.A00);
                    A0G.putExtra("extra_setup_mode", 2);
                    A0G.putExtra("extra_payments_entry_type", 2);
                    A0G.putExtra("extra_is_first_payment_method", true);
                    A0G.putExtra("extra_skip_value_props_display", false);
                    AnonymousClass11F r1 = fMessage.A1J.A00;
                    if (r1 instanceof GroupJid) {
                        r1 = fMessage.A0J();
                    }
                    String A032 = AnonymousClass143.A03(r1);
                    A0G.putExtra("extra_jid", A032);
                    A0G.putExtra("extra_inviter_jid", A032);
                    AnonymousClass3M9.A01(A0G, "acceptInvite");
                    textEmojiLabel.setVisibility(0);
                    AnonymousClass3YF.A00(textEmojiLabel, this, A0G, 27);
                    return;
                }
            }
            textEmojiLabel.setVisibility(8);
        }
    }

    public C175088Zp(Context context, C89004Uw r7, AnonymousClass3T1 r8) {
        super(context, r7, r8);
        FrameLayout frameLayout = (FrameLayout) C012005e.A02(this, R.id.payment_container);
        this.A06 = frameLayout;
        this.A07 = C36401kF.A0G(this, R.id.payment_brand_logo);
        ViewStub viewStub = (ViewStub) C012005e.A02(this, R.id.payment_invite_right_view_stub);
        frameLayout.setForeground(getInnerFrameForegroundDrawable());
        if (this.A01.A03()) {
            this.A05 = this.A02.A05().BFa();
        }
        C21127A9n a9n = new C21127A9n(this.A00, this.A04, this.A21);
        this.A0A = a9n;
        C53692rj.A00(viewStub, a9n);
        A0B();
    }

    private CharSequence getInviteContext() {
        AnonymousClass3T1 fMessage = getFMessage();
        AnonymousClass1FR r5 = this.A03;
        Context context = getContext();
        C64933Qa r0 = fMessage.A1J;
        boolean z = r0.A02;
        AnonymousClass11F r2 = r0.A00;
        C18740tg.A06(r2);
        String A0M = r5.A02.A0M(r5.A01.A0D(r2));
        if (r5.A08.A03()) {
            r5.A09.A05().BFa();
        }
        int i = R.string.f12nameremoved;
        if (z) {
            i = R.string.f12nameremoved;
        }
        String A0A2 = C36321k7.A0A(context, A0M, i);
        SpannableStringBuilder A0P = C36441kJ.A0P(A0A2);
        int indexOf = A0A2.indexOf(A0M);
        getContext();
        A0P.setSpan(new C37401mJ(), indexOf, A0M.length() + indexOf, 0);
        return A0P;
    }

    public void A1Y() {
        super.A1Y();
        A0B();
    }

    public void A22(AnonymousClass3T1 r2, boolean z) {
        boolean A1W = C36371kC.A1W(r2, getFMessage());
        super.A22(r2, z);
        if (z || A1W) {
            A0B();
        }
    }

    public int getCenteredLayoutId() {
        return R.layout.f9nameremoved;
    }

    public int getIncomingLayoutId() {
        return R.layout.f9nameremoved;
    }

    public Set getInnerFrameLayouts() {
        Set innerFrameLayouts = super.getInnerFrameLayouts();
        innerFrameLayouts.add(this.A06);
        return innerFrameLayouts;
    }

    public int getOutgoingLayoutId() {
        return R.layout.f9nameremoved;
    }
}
