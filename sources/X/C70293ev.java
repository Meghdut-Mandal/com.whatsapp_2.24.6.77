package X;

import com.whatsapp.contact.picker.SharedTextPreviewDialogFragment;
import com.whatsapp.mentions.MentionableEntry;

/* renamed from: X.3ev  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C70293ev implements C87594Pk {
    public final /* synthetic */ SharedTextPreviewDialogFragment A00;

    public /* synthetic */ C70293ev(SharedTextPreviewDialogFragment sharedTextPreviewDialogFragment) {
        this.A00 = sharedTextPreviewDialogFragment;
    }

    public final void BWV() {
        SharedTextPreviewDialogFragment sharedTextPreviewDialogFragment = this.A00;
        int selectionStart = sharedTextPreviewDialogFragment.A0G.getSelectionStart();
        if (selectionStart == sharedTextPreviewDialogFragment.A0G.getSelectionEnd() && sharedTextPreviewDialogFragment.A0S) {
            MentionableEntry mentionableEntry = sharedTextPreviewDialogFragment.A0G;
            int offsetForPosition = mentionableEntry.getOffsetForPosition(mentionableEntry.getX() + C36441kJ.A01(sharedTextPreviewDialogFragment.A0G), (float) sharedTextPreviewDialogFragment.A04.getScrollY());
            int A05 = AnonymousClass000.A05(sharedTextPreviewDialogFragment.A0G.getLayout().getLineTop(0), sharedTextPreviewDialogFragment.A0G.getLayout().getLineBottom(0));
            MentionableEntry mentionableEntry2 = sharedTextPreviewDialogFragment.A0G;
            int offsetForPosition2 = mentionableEntry2.getOffsetForPosition(mentionableEntry2.getX() + C36441kJ.A01(sharedTextPreviewDialogFragment.A0G), (float) (C36431kI.A04(sharedTextPreviewDialogFragment.A04, sharedTextPreviewDialogFragment.A04.getScrollY()) - A05));
            if (selectionStart < offsetForPosition) {
                sharedTextPreviewDialogFragment.A0G.setSelection(offsetForPosition);
            } else if (selectionStart > offsetForPosition2) {
                sharedTextPreviewDialogFragment.A0G.setSelection(offsetForPosition2);
            }
        } else if (!sharedTextPreviewDialogFragment.A0S) {
            sharedTextPreviewDialogFragment.A0S = true;
        }
        SharedTextPreviewDialogFragment.A07(sharedTextPreviewDialogFragment);
    }
}
