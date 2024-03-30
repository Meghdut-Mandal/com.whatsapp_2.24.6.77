package X;

import android.os.Build;
import android.util.LongSparseArray;
import android.view.translation.TranslationRequestValue;
import android.view.translation.TranslationResponseValue;
import android.view.translation.ViewTranslationRequest;
import android.view.translation.ViewTranslationResponse;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import java.util.List;
import java.util.function.Consumer;

/* renamed from: X.6W2  reason: invalid class name */
public final class AnonymousClass6W2 {
    public static final AnonymousClass6W2 A00 = new AnonymousClass6W2();

    public static final void A02(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, Consumer consumer, long[] jArr) {
        String A002;
        for (long j : jArr) {
            C118355nk r0 = (C118355nk) C36371kC.A0r(AndroidComposeViewAccessibilityDelegateCompat.A0H(androidComposeViewAccessibilityDelegateCompat), (int) j);
            if (r0 != null) {
                AnonymousClass6WV r6 = r0.A01;
                ViewTranslationRequest.Builder builder = new ViewTranslationRequest.Builder(androidComposeViewAccessibilityDelegateCompat.A0T.getAutofillId(), (long) r6.A02);
                List list = (List) AnonymousClass5XP.A02(r6.A05, C114205gq.A0M);
                if (!(list == null || (A002 = C109315Xc.A00("\n", list)) == null)) {
                    C023409w r1 = C023409w.A00;
                    builder.setValue("android:text", TranslationRequestValue.forText(new AnonymousClass72L(A002, r1, r1)));
                    consumer.accept(builder.build());
                }
            }
        }
    }

    public static final void A00(LongSparseArray longSparseArray, AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat) {
        TranslationResponseValue value;
        CharSequence text;
        C118355nk r0;
        AnonymousClass69I A002;
        C006302t r3;
        C13600k8 r5 = new C13600k8(longSparseArray);
        while (r5.hasNext()) {
            long A003 = r5.A00();
            ViewTranslationResponse viewTranslationResponse = (ViewTranslationResponse) longSparseArray.get(A003);
            if (!(viewTranslationResponse == null || (value = viewTranslationResponse.getValue("android:text")) == null || (text = value.getText()) == null || (r0 = (C118355nk) C36371kC.A0r(AndroidComposeViewAccessibilityDelegateCompat.A0H(androidComposeViewAccessibilityDelegateCompat), (int) A003)) == null || (A002 = AnonymousClass5XP.A00(r0.A01.A05, C114195gp.A0M)) == null || (r3 = (C006302t) A002.A01) == null)) {
                String obj = text.toString();
                C023409w r1 = C023409w.A00;
                r3.invoke(new AnonymousClass72L(obj, r1, r1));
            }
        }
    }

    public final void A03(LongSparseArray longSparseArray, AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat) {
        if (Build.VERSION.SDK_INT < 31) {
            return;
        }
        if (AnonymousClass00C.A0J(C90514aH.A11(), Thread.currentThread())) {
            A00(longSparseArray, androidComposeViewAccessibilityDelegateCompat);
        } else {
            androidComposeViewAccessibilityDelegateCompat.A0T.post(new AnonymousClass75C((Object) androidComposeViewAccessibilityDelegateCompat, (Object) longSparseArray, 2));
        }
    }
}
