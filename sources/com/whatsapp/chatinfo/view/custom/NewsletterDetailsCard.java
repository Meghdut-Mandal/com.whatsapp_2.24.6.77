package com.whatsapp.chatinfo.view.custom;

import X.AnonymousClass00C;
import X.AnonymousClass141;
import X.AnonymousClass3G3;
import X.AnonymousClass3SF;
import X.C05250Oz;
import X.C220412q;
import X.C225314u;
import X.C33511fU;
import X.C33521fV;
import X.C36331k8;
import X.C36361kB;
import X.C36371kC;
import X.C36381kD;
import X.C36391kE;
import X.C36401kF;
import X.C44072La;
import X.C53322r8;
import X.C65073Qp;
import X.C66933Xw;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.jid.PhoneUserJid;

public final class NewsletterDetailsCard extends ContactDetailsCard {
    public View A00;
    public C220412q A01;
    public AnonymousClass3G3 A02;
    public boolean A03;
    public View A04;
    public View A05;
    public View A06;
    public AnonymousClass3SF A07;
    public AnonymousClass141 A08;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public NewsletterDetailsCard(Context context) {
        this(context, (AttributeSet) null, 0);
        AnonymousClass00C.A0D(context, 1);
    }

    public static final void setupMVEducationIfNeeded$lambda$2(NewsletterDetailsCard newsletterDetailsCard, View view) {
        AnonymousClass00C.A0D(newsletterDetailsCard, 0);
        ((C225314u) C36391kE.A0E(newsletterDetailsCard)).Btl(C53322r8.A00(newsletterDetailsCard.getJid()), (String) null);
    }

    public final void setChatsCache(C220412q r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A01 = r2;
    }

    public void setContact(AnonymousClass141 r5) {
        TextEmojiLabel textEmojiLabel;
        C66933Xw r0;
        AnonymousClass00C.A0D(r5, 0);
        this.A08 = r5;
        C44072La newsletter = getNewsletter();
        AnonymousClass3SF r1 = this.A07;
        if (r1 == null) {
            throw C36331k8.A0d("titleViewController");
        }
        r1.A05(r5);
        AnonymousClass3SF r2 = this.A07;
        if (r2 == null) {
            throw C36331k8.A0d("titleViewController");
        }
        int i = 0;
        if (newsletter.A0P()) {
            i = 2;
        }
        r2.A03(i);
        if (!getNewsletter().A0P() || !this.A0P.A0E(6618)) {
            textEmojiLabel = this.A0G;
            r0 = null;
        } else {
            textEmojiLabel = this.A0G;
            r0 = new C66933Xw(this, 15);
        }
        textEmojiLabel.setOnClickListener(r0);
    }

    public final void setFollowUnfollowButton(View.OnClickListener onClickListener) {
        AnonymousClass00C.A0D(onClickListener, 0);
        View view = this.A00;
        if (view == null) {
            throw C36331k8.A0d("followUnfollowButton");
        }
        view.setOnClickListener(onClickListener);
    }

    public final void setForwardClickListener(View.OnClickListener onClickListener) {
        AnonymousClass00C.A0D(onClickListener, 0);
        View view = this.A05;
        if (view == null) {
            throw C36331k8.A0d("forwardButton");
        }
        view.setOnClickListener(onClickListener);
        View view2 = this.A05;
        if (view2 == null) {
            throw C36331k8.A0d("forwardButton");
        }
        C33521fV.A02(view2);
    }

    public final void setNewsletterSuspensionUtils(AnonymousClass3G3 r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A02 = r2;
    }

    public final void setShareClickListener(View.OnClickListener onClickListener) {
        AnonymousClass00C.A0D(onClickListener, 0);
        View view = this.A06;
        if (view == null) {
            throw C36331k8.A0d("shareButton");
        }
        view.setOnClickListener(onClickListener);
        View view2 = this.A06;
        if (view2 == null) {
            throw C36331k8.A0d("shareButton");
        }
        C33521fV.A02(view2);
    }

    public final void setupActionButtons(C44072La r4) {
        AnonymousClass00C.A0D(r4, 0);
        int i = 8;
        if (r4.A0N || getNewsletterSuspensionUtils().A00(r4)) {
            View view = this.A04;
            if (view == null) {
                throw C36331k8.A0d("actionsSection");
            }
            view.setVisibility(8);
            return;
        }
        View view2 = this.A00;
        if (view2 == null) {
            throw C36331k8.A0d("followUnfollowButton");
        }
        if (!r4.A0L()) {
            i = 0;
        }
        view2.setVisibility(i);
    }

    private final PhoneUserJid getJid() {
        PhoneUserJid A0e = C36371kC.A0e(this.A0F);
        AnonymousClass00C.A08(A0e);
        return A0e;
    }

    public final void A05() {
        View view = this.A00;
        if (view == null) {
            throw C36331k8.A0d("followUnfollowButton");
        }
        view.setVisibility(0);
        C36331k8.A0q(view.getContext(), view, R.string.f12nameremoved);
        C36401kF.A1O(view, R.drawable.ic_check, R.string.f12nameremoved);
        C33521fV.A02(view);
        C33521fV.A03(view, R.string.f12nameremoved);
    }

    public final void A06() {
        View view = this.A00;
        if (view == null) {
            throw C36331k8.A0d("followUnfollowButton");
        }
        view.setVisibility(0);
        C36331k8.A0q(view.getContext(), view, R.string.f12nameremoved);
        C36401kF.A1O(view, R.drawable.ic_action_add, R.string.f12nameremoved);
        C33521fV.A02(view);
        C33521fV.A03(view, R.string.f12nameremoved);
    }

    public final C220412q getChatsCache() {
        C220412q r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("chatsCache");
    }

    public final AnonymousClass3G3 getNewsletterSuspensionUtils() {
        AnonymousClass3G3 r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("newsletterSuspensionUtils");
    }

    private final C44072La getNewsletter() {
        C220412q chatsCache = getChatsCache();
        AnonymousClass141 r0 = this.A08;
        if (r0 == null) {
            throw C36331k8.A0d("contact");
        }
        C65073Qp A0W = C36371kC.A0W(chatsCache, r0.A0H);
        AnonymousClass00C.A0E(A0W, "null cannot be cast to non-null type com.whatsapp.data.NewsletterInfo");
        return (C44072La) A0W;
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.A00 = C36361kB.A0G(this, R.id.action_follow);
        this.A05 = C36361kB.A0G(this, R.id.action_forward);
        this.A06 = C36361kB.A0G(this, R.id.action_share);
        this.A04 = C36361kB.A0G(this, R.id.newsletter_details_actions);
        AnonymousClass3SF B3q = this.A0H.B3q(getContext(), this.A0G);
        this.A07 = B3q;
        C33511fU.A03(B3q.A01);
    }

    public /* synthetic */ NewsletterDetailsCard(Context context, AttributeSet attributeSet, int i, int i2, C05250Oz r7) {
        this(context, C36381kD.A0I(attributeSet, i2), C36391kE.A01(i2, i));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NewsletterDetailsCard(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AnonymousClass00C.A0D(context, 1);
        A02();
        this.A0k = false;
        this.A0i = false;
        this.A0j = false;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public NewsletterDetailsCard(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        AnonymousClass00C.A0D(context, 1);
    }
}
