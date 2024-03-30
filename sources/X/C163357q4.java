package X;

import android.view.KeyEvent;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.whatsapp.biz.cart.view.fragment.CartFragment;
import com.whatsapp.mentions.MentionableEntry;
import com.whatsapp.payments.ui.widget.PaymentView;

/* renamed from: X.7q4  reason: invalid class name and case insensitive filesystem */
public class C163357q4 implements C88314Sf {
    public Object A00;
    public final int A01;

    public C163357q4(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void BRp() {
        MentionableEntry mentionableEntry;
        int i = this.A01;
        Object obj = this.A00;
        switch (i) {
            case 0:
                mentionableEntry = ((CartFragment) obj).A0p;
                break;
            case 1:
                mentionableEntry = ((C124555yO) obj).A07;
                break;
            case 2:
                AnonymousClass64H r0 = ((C90714ab) obj).A01;
                if (r0 == null || (mentionableEntry = r0.A03.A0E) == null) {
                    return;
                }
            default:
                mentionableEntry = ((PaymentView) obj).A0s.A0B;
                C18740tg.A04(mentionableEntry);
                break;
        }
        mentionableEntry.dispatchKeyEvent(new KeyEvent(0, 67));
    }

    public void BWN(int[] iArr) {
        MentionableEntry mentionableEntry;
        int i;
        switch (this.A01) {
            case 0:
                mentionableEntry = ((CartFragment) this.A00).A0p;
                i = 65536;
                break;
            case 1:
                mentionableEntry = ((C124555yO) this.A00).A07;
                break;
            case 2:
                AnonymousClass64H r0 = ((C90714ab) this.A00).A01;
                if (r0 != null) {
                    mentionableEntry = r0.A03.A0E;
                    break;
                } else {
                    return;
                }
            default:
                mentionableEntry = ((PaymentView) this.A00).A0s.A0B;
                i = 0;
                break;
        }
        i = EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH;
        AnonymousClass3UG.A08(mentionableEntry, iArr, i);
    }
}
