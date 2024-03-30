package X;

import android.text.InputFilter;
import android.text.Spanned;
import com.whatsapp.notification.PopupNotification;
import com.whatsapp.status.playback.MessageReplyActivity;

/* renamed from: X.4ZM  reason: invalid class name */
public class AnonymousClass4ZM implements InputFilter {
    public Object A00;
    public final int A01;

    public AnonymousClass4ZM(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        AnonymousClass6YP r0;
        int i5 = this.A01;
        Object obj = this.A00;
        if (i5 != 0) {
            r0 = ((MessageReplyActivity) obj).A1E;
            if (r0 == null) {
                return null;
            }
        } else {
            r0 = ((PopupNotification) obj).A1G;
        }
        if (r0.A0H != null) {
            return "";
        }
        return null;
    }
}
