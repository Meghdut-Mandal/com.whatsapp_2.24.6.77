package X;

import android.content.ContentValues;
import androidx.core.view.inputmethod.EditorInfoCompat;

/* renamed from: X.3s6  reason: invalid class name and case insensitive filesystem */
public final class C78433s6 implements C17810s4 {
    public final AnonymousClass005 A00;

    public C78433s6(AnonymousClass005 r2) {
        AnonymousClass00C.A0D(r2, 1);
        this.A00 = r2;
    }

    public void BmI(AnonymousClass3T1 r8, C52942qQ r9) {
        AnonymousClass00C.A0D(r8, 0);
        if (AnonymousClass000.A1S(r8.A0A & EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH, EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH)) {
            AnonymousClass1TW r2 = (AnonymousClass1TW) this.A00.get();
            if (AnonymousClass000.A1S(r8.A0A & EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH, EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH)) {
                AnonymousClass3BG r6 = r8.A0V;
                AnonymousClass1M0 A05 = r2.A00.A05();
                try {
                    C224114e r5 = A05.A02;
                    ContentValues A0E = C36441kJ.A0E();
                    A0E.put("message_row_id", Long.valueOf(r8.A1N));
                    A0E.put("title", r6.A0A);
                    A0E.put("body", r6.A02);
                    A0E.put("media_type", Integer.valueOf(r6.A01));
                    A0E.put("thumbnail_url", r6.A09);
                    A0E.put("micro_thumbnail", r6.A0F);
                    A0E.put("full_thumbnail", r6.A00);
                    A0E.put("media_url", r6.A04);
                    A0E.put("source_type", r6.A07);
                    A0E.put("source_id", r6.A06);
                    A0E.put("source_url", r6.A08);
                    A0E.put("render_larger_thumbnail", Boolean.valueOf(r6.A0D));
                    A0E.put("show_ad_attribution", Boolean.valueOf(r6.A0E));
                    A0E.put("has_icebreaker_auto_response", Boolean.valueOf(r6.A0C));
                    A0E.put("has_click_to_call_auto_response", Boolean.valueOf(r6.A0B));
                    r5.A04("message_external_ad_content", "ExternalAdContentInfoStore/insertAdContentInfo", A0E);
                    A05.close();
                } catch (Throwable th) {
                    th.addSuppressed(th);
                    throw th;
                }
            }
            if (r9 != null) {
                throw C36321k7.A04(C78433s6.class);
            }
        }
    }
}
