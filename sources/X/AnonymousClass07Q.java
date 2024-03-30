package X;

import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import java.util.Objects;

/* renamed from: X.07Q  reason: invalid class name */
public final class AnonymousClass07Q {
    public TextClassifier A00;
    public TextView A01;

    public TextClassifier A00() {
        TextClassifier textClassifier = this.A00;
        if (textClassifier != null) {
            return textClassifier;
        }
        TextClassificationManager textClassificationManager = (TextClassificationManager) this.A01.getContext().getSystemService(TextClassificationManager.class);
        if (textClassificationManager != null) {
            return textClassificationManager.getTextClassifier();
        }
        return TextClassifier.NO_OP;
    }

    public AnonymousClass07Q(TextView textView) {
        Objects.requireNonNull(textView);
        this.A01 = textView;
    }

    public void A01(TextClassifier textClassifier) {
        this.A00 = textClassifier;
    }
}
