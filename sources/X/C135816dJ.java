package X;

import android.view.ViewTreeObserver;
import com.whatsapp.FAQTextView;

/* renamed from: X.6dJ  reason: invalid class name and case insensitive filesystem */
public final class C135816dJ implements ViewTreeObserver.OnGlobalLayoutListener {
    public final FAQTextView A00;

    public void onGlobalLayout() {
        FAQTextView fAQTextView = this.A00;
        CharSequence text = fAQTextView.getText();
        fAQTextView.setMaxLines(3);
        if (fAQTextView.getLineCount() > 3) {
            fAQTextView.setText(C110795bF.A00(text.toString(), fAQTextView.getLayout().getLineEnd(2)));
        }
        C36351kA.A1C(fAQTextView, this);
    }

    public C135816dJ(FAQTextView fAQTextView) {
        this.A00 = fAQTextView;
    }
}
