package X;

import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import com.whatsapp.text.ReadMoreTextView;
import java.util.Objects;

/* renamed from: X.3wi  reason: invalid class name and case insensitive filesystem */
public class C81253wi implements Runnable {
    public int A00 = 0;
    public int A01 = 0;
    public int A02;
    public int A03;
    public final /* synthetic */ ReadMoreTextView A04;

    public C81253wi(ReadMoreTextView readMoreTextView) {
        this.A04 = readMoreTextView;
    }

    private SpannableStringBuilder A00(SpannableStringBuilder spannableStringBuilder, CharSequence charSequence, int i, int i2) {
        CharSequence charSequence2;
        if (i2 != 0) {
            boolean z = false;
            CharSequence subSequence = charSequence.subSequence(0, AnonymousClass14B.A00(charSequence, i2));
            int i3 = 0;
            if (subSequence == null || subSequence.length() == 0) {
                z = true;
            }
            charSequence2 = "";
            if (!z) {
                int length = subSequence.length();
                int i4 = length - 1;
                while (i3 < length && Character.isWhitespace(subSequence.charAt(i3))) {
                    i3++;
                }
                while (i4 > 0 && Character.isWhitespace(subSequence.charAt(i4))) {
                    i4--;
                }
                if (i4 > i3) {
                    charSequence2 = subSequence.subSequence(i3, i4 + 1);
                }
            }
        } else {
            charSequence2 = "";
        }
        SpannableStringBuilder A0P = C36441kJ.A0P(charSequence2);
        A0P.append(spannableStringBuilder);
        if (ReadMoreTextView.A0B.B4e(this.A04, A0P, this.A00).getLineCount() > i) {
            return null;
        }
        return A0P;
    }

    public void run() {
        ReadMoreTextView readMoreTextView = this.A04;
        if (readMoreTextView.A00 != 0 && !readMoreTextView.A0K()) {
            int A002 = C36331k8.A00(readMoreTextView, readMoreTextView.getWidth());
            int A0D = AnonymousClass000.A0D(readMoreTextView, readMoreTextView.getHeight());
            int i = C36431kI.A0H(readMoreTextView).orientation;
            if ((this.A03 != A002 || this.A02 != A0D) && readMoreTextView.getLayout() != null) {
                if (this.A00 == 0 || i != this.A01) {
                    this.A00 = A002;
                }
                this.A03 = A002;
                this.A02 = A0D;
                this.A01 = i;
                CharSequence charSequence = readMoreTextView.A03;
                int length = charSequence.length();
                int i2 = (readMoreTextView.A00 + 3) * 150;
                if (length > i2) {
                    CharSequence charSequence2 = readMoreTextView.A03;
                    charSequence = charSequence2.subSequence(0, AnonymousClass14B.A00(charSequence2, i2));
                }
                StaticLayout B4e = ReadMoreTextView.A0B.B4e(readMoreTextView, charSequence, this.A00);
                boolean z = false;
                if (B4e.getLineCount() > readMoreTextView.A00) {
                    z = true;
                }
                readMoreTextView.A05 = z;
                if (z) {
                    Objects.requireNonNull(readMoreTextView.A04, "You must specify an rmtvText attribute");
                    SpannableStringBuilder append = C36441kJ.A0P("... ").append(readMoreTextView.A04);
                    append.setSpan(new C89264Vw(readMoreTextView.getContext(), this, readMoreTextView.A01, 4), 4, append.length(), 18);
                    if (readMoreTextView.A06) {
                        append.setSpan(new StyleSpan(1), 4, append.length(), 18);
                    }
                    int lineEnd = B4e.getLineEnd(readMoreTextView.A00 - 1);
                    SpannableStringBuilder A003 = A00(append, charSequence, readMoreTextView.A00, lineEnd);
                    if (A003 == null) {
                        A003 = A00(append, charSequence, readMoreTextView.A00, AnonymousClass001.A02(lineEnd, append.length(), 0));
                        if (A003 == null) {
                            int i3 = readMoreTextView.A00;
                            A003 = A00(append, charSequence, i3, B4e.getLineStart(i3 - 1));
                        }
                    }
                    if (!TextUtils.equals(readMoreTextView.getText(), A003)) {
                        readMoreTextView.setVisibleText(A003);
                    }
                } else if (!TextUtils.equals(readMoreTextView.getText(), readMoreTextView.A03)) {
                    readMoreTextView.setVisibleText(readMoreTextView.A03);
                }
            }
        }
    }
}
