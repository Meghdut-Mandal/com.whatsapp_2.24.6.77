package X;

import android.app.Activity;
import android.os.Build;
import com.whatsapp.conversation.conversationrow.nativeflow.commerce.extensions.AndroidOreoOrientationIssueHandler$lifecycleObserver$1;

/* renamed from: X.61w  reason: invalid class name and case insensitive filesystem */
public final class C1259261w {
    public Integer A00;
    public final AnonymousClass00N A01 = new AndroidOreoOrientationIssueHandler$lifecycleObserver$1(this);

    public final void A00(Activity activity) {
        if (Build.VERSION.SDK_INT == 26 && (activity instanceof AnonymousClass01G)) {
            ((AnonymousClass01G) activity).A06.A04(this.A01);
            this.A00 = Integer.valueOf(activity.getRequestedOrientation());
            activity.setRequestedOrientation(1);
        }
    }
}
