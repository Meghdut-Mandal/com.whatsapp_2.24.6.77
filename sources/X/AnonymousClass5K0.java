package X;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.widget.FrameLayout;
import com.whatsapp.R;
import com.whatsapp.WaTextView;
import com.whatsapp.search.views.MessageThumbView;
import com.whatsapp.search.views.itemviews.MessageGifVideoPlayer;

/* renamed from: X.5K0  reason: invalid class name */
public class AnonymousClass5K0 extends AnonymousClass5K2 {
    public boolean A00;
    public AnimatorSet A01;
    public AnonymousClass7d3 A02 = new C148426yq(this);
    public final MessageGifVideoPlayer A03;
    public final WaTextView A04;
    public final MessageThumbView A05;

    public float getRatio() {
        return 1.5f;
    }

    public static void A00(AnonymousClass5K0 r10, boolean z) {
        AnimatorSet animatorSet = r10.A01;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        float f = 0.0f;
        if (z) {
            f = 1.0f;
        }
        r10.A01 = C36441kJ.A0C();
        FrameLayout frameLayout = r10.A02;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(frameLayout, "alpha", new float[]{frameLayout.getAlpha(), f});
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(r10.A03, "alpha", new float[]{frameLayout.getAlpha(), f});
        r10.A01.playTogether(new Animator[]{ofFloat, ofFloat2});
        C36391kE.A13(r10.A01);
        r10.A01.setDuration(100);
        r10.A01.start();
    }

    public void setScrolling(boolean z) {
        this.A03.setScrolling(z);
    }

    public void setShouldPlay(boolean z) {
        this.A03.setShouldPlay(z);
    }

    public AnonymousClass5K0(Context context) {
        super(context);
        A01();
        MessageThumbView messageThumbView = (MessageThumbView) C012005e.A02(this, R.id.thumb_view);
        this.A05 = messageThumbView;
        MessageGifVideoPlayer messageGifVideoPlayer = (MessageGifVideoPlayer) C012005e.A02(this, R.id.video_player);
        this.A03 = messageGifVideoPlayer;
        this.A04 = C36401kF.A0Q(this, R.id.media_time);
        C36331k8.A0q(context, messageThumbView, R.string.f12nameremoved);
        messageGifVideoPlayer.A06 = this.A02;
    }

    public int getMark() {
        return R.drawable.msg_status_gif;
    }

    public int getMarkTintColor() {
        return R.color.f6nameremoved;
    }

    public void setMessage(C181788o2 r4) {
        super.setMessage(r4);
        this.A00 = 0;
        setId(R.id.search_message_gif_playeble_thumb_view);
        MessageThumbView messageThumbView = this.A05;
        messageThumbView.setMessage(r4);
        this.A03.setMessage(r4);
        messageThumbView.setVisibility(0);
        WaTextView waTextView = this.A04;
        C36391kE.A1K(waTextView);
        waTextView.setVisibility(8);
    }
}
