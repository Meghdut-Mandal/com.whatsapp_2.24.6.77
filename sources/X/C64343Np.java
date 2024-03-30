package X;

import android.animation.ValueAnimator;
import android.text.Spannable;
import android.text.style.ForegroundColorSpan;
import com.whatsapp.TextEmojiLabel;

/* renamed from: X.3Np  reason: invalid class name and case insensitive filesystem */
public final class C64343Np {
    public ForegroundColorSpan A00;
    public final int A01;
    public final ValueAnimator A02;
    public final TextEmojiLabel A03;
    public final CharSequence A04;

    public static final void A00(Spannable spannable, C64343Np r5, int i, int i2) {
        TextEmojiLabel textEmojiLabel = r5.A03;
        int A06 = C018107s.A06(textEmojiLabel.getCurrentTextColor(), i2);
        spannable.removeSpan(r5.A00);
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(A06);
        r5.A00 = foregroundColorSpan;
        spannable.setSpan(foregroundColorSpan, i, spannable.length(), 33);
        textEmojiLabel.setText(spannable);
    }

    public C64343Np(TextEmojiLabel textEmojiLabel, int i) {
        this.A03 = textEmojiLabel;
        this.A01 = i;
        CharSequence text = textEmojiLabel.getText();
        AnonymousClass00C.A08(text);
        this.A04 = text;
        int[] A1O = C36441kJ.A1O();
        // fill-array-data instruction
        A1O[0] = 0;
        A1O[1] = 255;
        ValueAnimator ofInt = ValueAnimator.ofInt(A1O);
        AnonymousClass00C.A08(ofInt);
        this.A02 = ofInt;
    }
}
