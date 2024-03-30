package X;

import android.animation.Animator;
import com.whatsapp.status.playback.MessageReplyActivity;

/* renamed from: X.4Wk  reason: invalid class name and case insensitive filesystem */
public class C89404Wk implements Animator.AnimatorListener {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public C89404Wk(Object obj, Object obj2, Object obj3, int i) {
        this.A03 = i;
        this.A00 = obj2;
        this.A01 = obj;
        this.A02 = obj3;
    }

    public static void A00(C89404Wk r3) {
        int i = r3.A03;
        ((Animator) r3.A01).removeAllListeners();
        MessageReplyActivity messageReplyActivity = (MessageReplyActivity) r3.A00;
        Object obj = r3.A02;
        if (i != 0) {
            MessageReplyActivity.A0j(messageReplyActivity, (C135066c4) obj);
        } else {
            MessageReplyActivity.A0k(messageReplyActivity, AnonymousClass3UG.A06((int[]) obj));
        }
    }

    public void onAnimationCancel(Animator animator) {
        A00(this);
    }

    public void onAnimationEnd(Animator animator) {
        A00(this);
    }

    public void onAnimationRepeat(Animator animator) {
    }

    public void onAnimationStart(Animator animator) {
    }
}
