package X;

import android.widget.TextView;
import com.whatsapp.calling.callrating.CallRatingFragment;

/* renamed from: X.7ST  reason: invalid class name */
public final class AnonymousClass7ST extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ CallRatingFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7ST(CallRatingFragment callRatingFragment) {
        super(1);
        this.this$0 = callRatingFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        int i;
        Number number = (Number) obj;
        TextView textView = this.this$0.A00;
        if (textView != null) {
            if (number == null || number.intValue() != -1) {
                textView.setText(C36411kG.A07(number));
                i = 0;
            } else {
                i = 4;
            }
            textView.setVisibility(i);
        }
        return AnonymousClass0AJ.A00;
    }
}
