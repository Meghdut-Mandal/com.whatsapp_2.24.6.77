package X;

import android.text.Editable;
import com.whatsapp.R;
import com.whatsapp.contact.picker.SharedTextPreviewDialogFragment;

/* renamed from: X.2g7  reason: invalid class name */
public class AnonymousClass2g7 extends C66803Xj {
    public boolean A00;
    public final /* synthetic */ SharedTextPreviewDialogFragment A01;

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        int codePointCount;
        boolean z = false;
        if (i3 > i2 && ((codePointCount = Character.codePointCount(charSequence, i, i3 + i)) > 1 || (codePointCount == 1 && Character.isWhitespace(Character.codePointAt(charSequence, i))))) {
            z = true;
        }
        this.A00 = z;
    }

    public AnonymousClass2g7(SharedTextPreviewDialogFragment sharedTextPreviewDialogFragment) {
        this.A01 = sharedTextPreviewDialogFragment;
    }

    public void afterTextChanged(Editable editable) {
        SharedTextPreviewDialogFragment sharedTextPreviewDialogFragment = this.A01;
        AnonymousClass01I A0h = sharedTextPreviewDialogFragment.A0h();
        AnonymousClass1H2 r6 = sharedTextPreviewDialogFragment.A0B;
        Editable editable2 = editable;
        AnonymousClass6YV.A0F(A0h, editable2, sharedTextPreviewDialogFragment.A0G.getPaint(), sharedTextPreviewDialogFragment.A08, r6, sharedTextPreviewDialogFragment.A0H, R.color.f6nameremoved, sharedTextPreviewDialogFragment.A0R);
        SharedTextPreviewDialogFragment.A05(editable, sharedTextPreviewDialogFragment, this.A00);
    }
}
