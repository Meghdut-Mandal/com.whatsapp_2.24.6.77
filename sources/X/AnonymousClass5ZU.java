package X;

import android.os.Bundle;
import com.whatsapp.WaMessageDialogFragment;
import java.util.List;

/* renamed from: X.5ZU  reason: invalid class name */
public abstract class AnonymousClass5ZU {
    public static final WaMessageDialogFragment A00(AnonymousClass01z r12, Integer num, Integer num2, Integer num3, Integer num4, String str, String str2, List list, int i) {
        Integer num5 = num;
        Integer num6 = num2;
        String str3 = str2;
        String str4 = str;
        if (num == null && num2 == null) {
            if (str2 == null) {
                throw AnonymousClass001.A09("A message dialog must have either the title or message set.");
            }
        } else if (!(str2 == null || num2 == null)) {
            throw AnonymousClass001.A09("A message dialog can't have a messageString and messageStringRes, only one or the other");
        }
        WaMessageDialogFragment waMessageDialogFragment = new WaMessageDialogFragment();
        Bundle A07 = AnonymousClass001.A07();
        A07.putParcelable("message_dialog_parameters", new C135046c2(num5, num6, num3, num4, str4, str3, list, i));
        waMessageDialogFragment.A17(A07);
        if (r12 != null) {
            if (str == null) {
                str4 = C90464aC.A0V();
            }
            waMessageDialogFragment.A1i(r12, str4);
        }
        return waMessageDialogFragment;
    }
}
