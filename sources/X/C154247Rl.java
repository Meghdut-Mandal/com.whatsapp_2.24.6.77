package X;

import android.animation.Animator;

/* renamed from: X.7Rl  reason: invalid class name and case insensitive filesystem */
public final class C154247Rl extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ C90544aK this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C154247Rl(C90544aK r2) {
        super(1);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Animator.AnimatorListener animatorListener = (Animator.AnimatorListener) obj;
        AnonymousClass00C.A0D(animatorListener, 0);
        animatorListener.onAnimationStart(this.this$0);
        return AnonymousClass0AJ.A00;
    }
}
