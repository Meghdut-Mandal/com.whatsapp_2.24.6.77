package X;

import android.text.Editable;
import android.text.TextWatcher;
import com.whatsapp.mentions.MentionableEntry;

/* renamed from: X.3Xl  reason: invalid class name and case insensitive filesystem */
public class C66823Xl implements TextWatcher {
    public boolean A00;
    public int A01;
    public C37321mB[] A02;
    public final /* synthetic */ MentionableEntry A03;

    public C66823Xl(MentionableEntry mentionableEntry) {
        this.A03 = mentionableEntry;
    }

    public void afterTextChanged(Editable editable) {
        if (this.A01 > 0) {
            MentionableEntry mentionableEntry = this.A03;
            C37321mB[] r7 = this.A02;
            int i = 0;
            if (this.A00) {
                int length = r7.length;
                while (i < length) {
                    C37321mB r3 = r7[i];
                    int spanStart = editable.getSpanStart(r3.A00);
                    int spanEnd = editable.getSpanEnd(r3);
                    if (!(spanStart == -1 || spanEnd == -1)) {
                        MentionableEntry.A08(r3.A00, mentionableEntry);
                        MentionableEntry.A08(r3, mentionableEntry);
                        editable.delete(spanStart, spanEnd);
                    }
                    i++;
                }
            } else {
                C37321mB[] r32 = (C37321mB[]) mentionableEntry.getEditableText().getSpans(mentionableEntry.getSelectionStart(), mentionableEntry.getSelectionEnd(), C37321mB.class);
                MentionableEntry.A08(mentionableEntry.A0C, mentionableEntry);
                mentionableEntry.A0C = null;
                int length2 = r32.length;
                while (i < length2) {
                    C37321mB r1 = r32[i];
                    MentionableEntry.A08(r1.A00, mentionableEntry);
                    MentionableEntry.A08(r1, mentionableEntry);
                    i++;
                }
            }
        }
        MentionableEntry.A06(editable, this.A03);
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        MentionableEntry mentionableEntry = this.A03;
        int selectionEnd = mentionableEntry.getSelectionEnd();
        this.A02 = (C37321mB[]) mentionableEntry.getEditableText().getSpans(selectionEnd, selectionEnd, C37321mB.class);
        this.A00 = AnonymousClass000.A1S(mentionableEntry.getSelectionStart(), mentionableEntry.getSelectionEnd());
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.A01 = i2;
    }
}
