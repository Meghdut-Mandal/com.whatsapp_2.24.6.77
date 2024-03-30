package X;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
import com.whatsapp.TextEmojiLabel;

/* renamed from: X.3Nz  reason: invalid class name and case insensitive filesystem */
public final class C64443Nz {
    public int A00;
    public int A01;
    public Handler A02 = new AnonymousClass4VT(Looper.getMainLooper(), this, 4);
    public CharSequence A03;
    public final TextEmojiLabel A04;
    public final C20810yC A05;
    public final AnonymousClass2I0 A06;

    public static final void A00(C64443Nz r10, int i) {
        SpannableStringBuilder A0P = C36441kJ.A0P(r10.A03);
        C37271m6[] r3 = (C37271m6[]) A0P.getSpans(0, A0P.length(), C37271m6.class);
        AnonymousClass00C.A0B(r3);
        for (C37271m6 removeSpan : r3) {
            A0P.removeSpan(removeSpan);
        }
        if (i < A0P.length()) {
            int length = A0P.length();
            TextEmojiLabel textEmojiLabel = r10.A04;
            A0P.setSpan(new C37271m6(textEmojiLabel.getCurrentTextColor() & 16777215), i, length, 33);
            textEmojiLabel.setText(A0P);
        }
        ImageSpan[] imageSpanArr = (ImageSpan[]) A0P.getSpans(0, A0P.length(), ImageSpan.class);
        AnonymousClass00C.A0B(imageSpanArr);
        for (ImageSpan imageSpan : imageSpanArr) {
            int i2 = 0;
            if (A0P.getSpanEnd(imageSpan) <= i) {
                i2 = 255;
            }
            AnonymousClass00C.A0B(imageSpan);
            Drawable drawable = imageSpan.getDrawable();
            if (drawable.getAlpha() != i2) {
                int spanStart = A0P.getSpanStart(imageSpan);
                int spanEnd = A0P.getSpanEnd(imageSpan);
                drawable.setAlpha(i2);
                ImageSpan imageSpan2 = new ImageSpan(drawable);
                A0P.removeSpan(imageSpan);
                A0P.setSpan(imageSpan2, spanStart, spanEnd, 33);
            }
        }
        TextEmojiLabel textEmojiLabel2 = r10.A04;
        textEmojiLabel2.setText(A0P);
        textEmojiLabel2.setText(A0P);
    }

    public C64443Nz(AnonymousClass2I0 r4, C20810yC r5) {
        this.A05 = r5;
        this.A06 = r4;
        TextEmojiLabel textEmojiLabel = r4.A06;
        AnonymousClass00C.A07(textEmojiLabel);
        this.A04 = textEmojiLabel;
        CharSequence text = textEmojiLabel.getText();
        AnonymousClass00C.A08(text);
        this.A03 = text;
    }
}
