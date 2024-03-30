package X;

import android.database.Cursor;
import androidx.core.view.inputmethod.EditorInfoCompat;

/* renamed from: X.3sN  reason: invalid class name and case insensitive filesystem */
public final class C78603sN implements C17820s5 {
    public final AnonymousClass005 A00;

    public C78603sN(AnonymousClass005 r2) {
        AnonymousClass00C.A0D(r2, 1);
        this.A00 = r2;
    }

    public void BmI(AnonymousClass3T1 r11, C52942qQ r12) {
        Cursor A09;
        AnonymousClass3L1 r2;
        AnonymousClass00C.A0D(r11, 0);
        if (AnonymousClass000.A1S(r11.A0A & EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH, EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH)) {
            C29671Xn r5 = (C29671Xn) this.A00.get();
            long j = r11.A1N;
            AnonymousClass1M0 A04 = r5.A00.get();
            try {
                A09 = A04.A02.A09("SELECT message_row_id, direct_path, media_key, media_key_timestamp, enc_thumb_hash, thumb_hash, thumb_width, thumb_height, transferred, micro_thumbnail, insert_timestamp, handle FROM mms_thumbnail_metadata WHERE message_row_id = ?", "GET_MMS_THUMBNAIL_METADATA_SQL", C36371kC.A1a(j));
                if (A09.moveToLast()) {
                    r2 = new AnonymousClass3L1();
                    r2.A04 = C36341k9.A0f(A09, "direct_path");
                    r2.A0A = C36391kE.A1b(A09, "media_key");
                    r2.A02 = C36351kA.A07(A09, "media_key_timestamp");
                    r2.A05 = C36341k9.A0f(A09, "enc_thumb_hash");
                    r2.A08 = C36341k9.A0f(A09, "thumb_hash");
                    r2.A01 = C36351kA.A03(A09, "thumb_width");
                    r2.A00 = C36351kA.A03(A09, "thumb_height");
                    boolean z = false;
                    if (A09.getLong(A09.getColumnIndexOrThrow("transferred")) == 1) {
                        z = true;
                    }
                    r2.A09 = z;
                    r2.A0B = C36391kE.A1b(A09, "micro_thumbnail");
                    r2.A06 = C36341k9.A0f(A09, "handle");
                    A09.close();
                    A04.close();
                } else {
                    A09.close();
                    A04.close();
                    r2 = null;
                }
                r11.A12(r2);
                if (r2 != null && AnonymousClass3T2.A02(r5.A01, r11)) {
                    r2.A0C = true;
                }
                if (r12 != null) {
                    throw C36321k7.A04(C78603sN.class);
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
