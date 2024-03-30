package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.whatsapp.TextEmojiLabel;

/* renamed from: X.1kO  reason: invalid class name and case insensitive filesystem */
public class C36491kO extends AnimatorListenerAdapter {
    public final /* synthetic */ TextEmojiLabel A00;
    public final /* synthetic */ C43512Ic A01;
    public final /* synthetic */ String A02;

    public C36491kO(TextEmojiLabel textEmojiLabel, C43512Ic r2, String str) {
        this.A01 = r2;
        this.A00 = textEmojiLabel;
        this.A02 = str;
    }

    public void onAnimationEnd(Animator animator) {
        this.A01.A0A = false;
    }

    public void onAnimationStart(Animator animator) {
        TextEmojiLabel textEmojiLabel = this.A00;
        textEmojiLabel.A0I(this.A02);
        textEmojiLabel.setVisibility(0);
        textEmojiLabel.setScaleX(0.0f);
        textEmojiLabel.setScaleY(0.0f);
    }
}
