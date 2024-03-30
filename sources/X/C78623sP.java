package X;

import android.database.Cursor;
import androidx.core.view.inputmethod.EditorInfoCompat;

/* renamed from: X.3sP  reason: invalid class name and case insensitive filesystem */
public final class C78623sP implements C17820s5 {
    public final AnonymousClass005 A00;

    public C78623sP(AnonymousClass005 r2) {
        AnonymousClass00C.A0D(r2, 1);
        this.A00 = r2;
    }

    public void BmI(AnonymousClass3T1 r22, C52942qQ r23) {
        Cursor A09;
        AnonymousClass3T1 r1 = r22;
        AnonymousClass00C.A0D(r1, 0);
        if (AnonymousClass000.A1S(r1.A0A & EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH, EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH)) {
            AnonymousClass1M0 A04 = ((AnonymousClass1TW) this.A00.get()).A00.get();
            try {
                C224114e r7 = A04.A02;
                String[] A1R = C36441kJ.A1R();
                C36351kA.A1V(A1R, 0, r1.A1N);
                A09 = r7.A09("SELECT title, body, media_type, thumbnail_url, full_thumbnail, micro_thumbnail, media_url, source_type, source_id, source_url, render_larger_thumbnail, show_ad_attribution, has_icebreaker_auto_response, has_click_to_call_auto_response  FROM message_external_ad_content WHERE message_row_id = ?", "GET_EXTERNAL_AD_CONTENT_INFO_BY_ROW_ID_SQL", A1R);
                if (A09.moveToLast()) {
                    String A0f = C36341k9.A0f(A09, "title");
                    String A0f2 = C36341k9.A0f(A09, "body");
                    int A03 = C36351kA.A03(A09, "media_type");
                    r1.A0V = new AnonymousClass3BG(A0f, A0f2, C36341k9.A0f(A09, "thumbnail_url"), C36341k9.A0f(A09, "media_url"), C36341k9.A0f(A09, "source_type"), C36341k9.A0f(A09, "source_id"), C36341k9.A0f(A09, "source_url"), (String) null, (String) null, C36391kE.A1b(A09, "micro_thumbnail"), C36391kE.A1b(A09, "full_thumbnail"), A03, C54282sh.A00(A09, A09.getColumnIndex("render_larger_thumbnail")), C54282sh.A00(A09, A09.getColumnIndex("show_ad_attribution")), C54282sh.A00(A09, A09.getColumnIndex("has_icebreaker_auto_response")), C54282sh.A00(A09, A09.getColumnIndex("has_click_to_call_auto_response")));
                    r1.A0j(EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH);
                }
                A09.close();
                A04.close();
                if (r23 != null) {
                    throw C36321k7.A04(C78623sP.class);
                }
                return;
            } catch (Throwable th) {
                try {
                    A04.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        } else {
            return;
        }
        throw th;
    }
}
