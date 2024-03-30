package X;

import android.database.Cursor;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.whatsapp.data.FMessageCommentInfoLazyLoader$getParentMessageCommentInfo$1;

/* renamed from: X.3lZ  reason: invalid class name and case insensitive filesystem */
public final class C74413lZ implements AnonymousClass1EI {
    public final C19730wQ A00;
    public final C29911Yl A01;
    public final AnonymousClass1FZ A02;
    public final C24561Cx A03;
    public final AnonymousClass1A1 A04;
    public final C220412q A05;
    public final C20810yC A06;

    public boolean BQ5(AnonymousClass3IP r3, AnonymousClass3T1 r4) {
        if (r3.A00.contains(C25111Fa.SKIP_COMMENT_INFO) || !C36401kF.A1Z(this.A06) || !this.A05.A0O(r4.A1J.A00) || r4.A0P() != null) {
            return false;
        }
        if (r4.A1R(16) || AnonymousClass000.A1S(r4.A0A & EditorInfoCompat.IME_FLAG_NO_PERSONALIZED_LEARNING, EditorInfoCompat.IME_FLAG_NO_PERSONALIZED_LEARNING)) {
            return true;
        }
        return false;
    }

    public C74413lZ(C19730wQ r1, C29911Yl r2, C220412q r3, AnonymousClass1FZ r4, C24561Cx r5, C20810yC r6, AnonymousClass1A1 r7) {
        C36321k7.A1B(r6, r1, r3, r7, r5);
        C36321k7.A10(r2, r4);
        this.A06 = r6;
        this.A00 = r1;
        this.A05 = r3;
        this.A04 = r7;
        this.A03 = r5;
        this.A01 = r2;
        this.A02 = r4;
    }

    public void BON(AnonymousClass3IP r8, AnonymousClass3T1 r9) {
        C63663Kx r3;
        Cursor A09;
        AnonymousClass3T1 A0R;
        AnonymousClass11F A0L;
        if (BQ5(r8, r9)) {
            if (AnonymousClass000.A1S(r9.A0A & EditorInfoCompat.IME_FLAG_NO_PERSONALIZED_LEARNING, EditorInfoCompat.IME_FLAG_NO_PERSONALIZED_LEARNING)) {
                AnonymousClass1M0 A042 = this.A03.A00.get();
                try {
                    C224114e r6 = A042.A02;
                    String[] A1R = C36441kJ.A1R();
                    C36351kA.A1V(A1R, 0, r9.A1N);
                    A09 = r6.A09("\n          SELECT parent_message_row_id\n          FROM message_comment\n          WHERE message_row_id = ?    \n        ", "SELECT_PARENT_MESSAGE_FOR_COMMENT_QUERY_ID", A1R);
                    Long l = null;
                    if (A09.moveToNext()) {
                        int columnIndexOrThrow = A09.getColumnIndexOrThrow("parent_message_row_id");
                        if (!A09.isNull(columnIndexOrThrow)) {
                            l = C36361kB.A0k(A09, columnIndexOrThrow);
                        }
                    }
                    A09.close();
                    A042.close();
                    if (!(l == null || (A0R = C36421kH.A0R(this.A04, l.longValue())) == null)) {
                        C64933Qa r1 = A0R.A1J;
                        if (r1.A02) {
                            A0L = C36441kJ.A0n(this.A00);
                        } else {
                            A0L = A0R.A0L();
                        }
                        r3 = new AnonymousClass2bB(new C195759Vv(A0L, r1), A0R.A1N);
                        r9.A0u(r3);
                        return;
                    }
                } catch (Throwable th) {
                    try {
                        A042.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            } else if (r9.A1R(16)) {
                this.A02.A01(r9);
                C63663Kx A0P = r9.A0P();
                if (r9.A1R(16) && (A0P == null || A0P.A00() < 1)) {
                    C110515an.A00(C008903u.A00, new FMessageCommentInfoLazyLoader$getParentMessageCommentInfo$1(this, r9, (C023509x) null));
                }
                r3 = r9.A0P();
                r9.A0u(r3);
                return;
            }
            r3 = null;
            r9.A0u(r3);
            return;
        }
        return;
        throw th;
    }
}
