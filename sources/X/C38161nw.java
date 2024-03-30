package X;

import android.animation.Animator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;
import com.whatsapp.R;
import com.whatsapp.WaTextView;

/* renamed from: X.1nw  reason: invalid class name and case insensitive filesystem */
public final class C38161nw extends FrameLayout implements Animator.AnimatorListener, C18700tb {
    public View A00;
    public View A01;
    public View A02;
    public FrameLayout A03;
    public RecyclerView A04;
    public LottieAnimationView A05;
    public WaTextView A06;
    public C53972sC A07;
    public C220412q A08;
    public C20810yC A09;
    public C28101Ri A0A;
    public AnonymousClass1QZ A0B;
    public boolean A0C;
    public AnonymousClass00S A0D;

    public C38161nw(Context context) {
        super(context, (AttributeSet) null, 0);
        if (!this.A0C) {
            this.A0C = true;
            C18800tq A0W = C36391kE.A0W(generatedComponent());
            this.A09 = C36341k9.A0V(A0W);
            this.A08 = C36351kA.A0a(A0W);
            this.A0A = (C28101Ri) A0W.A00.A2C.get();
        }
        this.A07 = C43902Kg.A00;
        View inflate = LayoutInflater.from(context).inflate(R.layout.f9nameremoved, this, false);
        AnonymousClass00C.A0E(inflate, "null cannot be cast to non-null type android.widget.FrameLayout");
        FrameLayout frameLayout = (FrameLayout) inflate;
        this.A03 = frameLayout;
        this.A02 = C36361kB.A0G(frameLayout, R.id.conversations_reveal_header_combo);
        this.A01 = C36361kB.A0G(this.A03, R.id.conversations_locked_header);
        LottieAnimationView lottieAnimationView = (LottieAnimationView) C36361kB.A0G(this.A03, R.id.locked_row_icon);
        this.A05 = lottieAnimationView;
        lottieAnimationView.setAnimation(C222013h.A07 ? R.raw.chatlock_lock_unlock_lottie_wds : R.raw.chatlock_lock_unlock_lottie);
        this.A05.A05(this);
        C34081gQ.A02(this.A01);
        C33521fV.A02(this.A01);
        WaTextView A0Q = C36341k9.A0Q(this.A01, R.id.locked_row);
        this.A06 = A0Q;
        C33511fU.A03(A0Q);
        this.A06.setTextColor(AnonymousClass00F.A04(context, R.color.f6nameremoved));
        this.A00 = C36361kB.A0G(this.A03, R.id.filter_and_locked_chats_container);
        View A022 = C012005e.A02(this.A03, R.id.conversations_reveal_filter_recycler_view);
        AnonymousClass00C.A0E(A022, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        this.A04 = (RecyclerView) A022;
        if (!getInboxFilterHelper().A00()) {
            this.A04.setVisibility(8);
        }
        if (!C36411kG.A1a(getChatsCache().A01)) {
            this.A01.setVisibility(8);
        }
        addView(this.A03);
    }

    public void onAnimationCancel(Animator animator) {
    }

    public void onAnimationRepeat(Animator animator) {
    }

    public void onAnimationStart(Animator animator) {
    }

    public final void setAbProps(C20810yC r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A09 = r2;
    }

    public final void setChatsCache(C220412q r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A08 = r2;
    }

    public final void setFilterAndLockedChatsContainer(View view) {
        AnonymousClass00C.A0D(view, 0);
        this.A00 = view;
    }

    public final void setInboxFilterHelper(C28101Ri r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A0A = r2;
    }

    public final void A00(AnonymousClass00S r3) {
        C53972sC r0;
        this.A0D = r3;
        C53972sC r1 = this.A07;
        if (r1 instanceof C43902Kg) {
            LottieAnimationView lottieAnimationView = this.A05;
            lottieAnimationView.setSpeed(0.7f);
            lottieAnimationView.A04();
            r0 = C43912Kh.A00;
        } else if (r1 instanceof C43912Kh) {
            LottieAnimationView lottieAnimationView2 = this.A05;
            lottieAnimationView2.setSpeed(-0.7f);
            lottieAnimationView2.A04();
            r0 = C43902Kg.A00;
        } else {
            return;
        }
        this.A07 = r0;
    }

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A0B;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A0B = r0;
        }
        return r0.generatedComponent();
    }

    public final C20810yC getAbProps() {
        C20810yC r0 = this.A09;
        if (r0 != null) {
            return r0;
        }
        throw C36321k7.A07();
    }

    public final C220412q getChatsCache() {
        C220412q r0 = this.A08;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("chatsCache");
    }

    public final C28101Ri getInboxFilterHelper() {
        C28101Ri r0 = this.A0A;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("inboxFilterHelper");
    }

    public void onAnimationEnd(Animator animator) {
        AnonymousClass00S r0 = this.A0D;
        if (r0 != null) {
            r0.invoke();
        }
        this.A0D = null;
    }

    public final void setEnableStateForChatLock(boolean z) {
        this.A06.setEnabled(z);
        View view = this.A01;
        view.setClickable(z);
        view.setEnabled(z);
        LottieAnimationView lottieAnimationView = this.A05;
        float f = 0.4f;
        if (z) {
            f = 1.0f;
        }
        lottieAnimationView.setAlpha(f);
    }

    public final void setLockedRowVisibility(boolean z) {
        this.A01.setVisibility(C36351kA.A00(z ? 1 : 0));
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.A01.setOnClickListener(onClickListener);
    }

    public final WaTextView getChatLockTextView() {
        return this.A06;
    }

    public final FrameLayout getContainer() {
        return this.A03;
    }

    public final View getFilterAndLockedChatsContainer() {
        return this.A00;
    }

    public final C53972sC getLockIconState() {
        return this.A07;
    }

    public final View getLockedRowView() {
        return this.A01;
    }

    public final View getParentViewToBeAnimated() {
        return this.A02;
    }

    public final RecyclerView getRevealFilterRecyclerView() {
        return this.A04;
    }
}
