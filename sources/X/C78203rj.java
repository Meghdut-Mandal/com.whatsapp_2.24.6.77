package X;

import android.database.Cursor;

/* renamed from: X.3rj  reason: invalid class name and case insensitive filesystem */
public final class C78203rj implements AnonymousClass4S2, AnonymousClass4S3, AnonymousClass4S4, C17760rz {
    public final AnonymousClass005 A00;

    public C78203rj(AnonymousClass005 r2) {
        AnonymousClass00C.A0D(r2, 1);
        this.A00 = r2;
    }

    public void B7J(AnonymousClass3T1 r7) {
        Cursor A09;
        AnonymousClass00C.A0D(r7, 0);
        AnonymousClass2bK r72 = (AnonymousClass2bK) r7;
        C29611Xh.A00(r72);
        String[] A1R = C36441kJ.A1R();
        int i = 0;
        A1R[0] = Long.toString(r72.A1N);
        AnonymousClass1M0 A04 = ((C29611Xh) this.A00.get()).A00.get();
        try {
            A09 = A04.A02.A09("SELECT version, data, future_message_type, future_proof_stanza, edit_version FROM message_future WHERE message_row_id = ?", "GET_FUTURE_MESSAGE_BY_ROW_ID_SQL", A1R);
            if (A09.moveToNext()) {
                r72.A01 = (int) C36351kA.A07(A09, "version");
                r72.A1B(C36391kE.A1b(A09, "data"));
                r72.A00 = C36351kA.A03(A09, "future_message_type");
                r72.A02 = C36391kE.A1b(A09, "future_proof_stanza");
                int columnIndexOrThrow = A09.getColumnIndexOrThrow("edit_version");
                if (!A09.isNull(columnIndexOrThrow)) {
                    i = A09.getInt(columnIndexOrThrow);
                }
                r72.A01 = i;
            }
            A09.close();
            A04.close();
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
        throw th;
    }

    public void BKi(AnonymousClass3T1 r2) {
        AnonymousClass00C.A0D(r2, 0);
        ((C29611Xh) this.A00.get()).A01((AnonymousClass2bK) r2);
    }

    public void BwV(AnonymousClass3T1 r2) {
        AnonymousClass00C.A0D(r2, 0);
        ((C29611Xh) this.A00.get()).A01((AnonymousClass2bK) r2);
    }
}
