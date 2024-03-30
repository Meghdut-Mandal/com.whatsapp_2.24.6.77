package X;

import android.database.Cursor;

/* renamed from: X.3sO  reason: invalid class name and case insensitive filesystem */
public final class C78613sO implements C17820s5 {
    public final AnonymousClass005 A00;

    public C78613sO(AnonymousClass005 r2) {
        AnonymousClass00C.A0D(r2, 1);
        this.A00 = r2;
    }

    public void BmI(AnonymousClass3T1 r8, C52942qQ r9) {
        Cursor A09;
        AnonymousClass00C.A0D(r8, 0);
        if (AnonymousClass000.A1S(r8.A0A & 256, 256)) {
            AnonymousClass1M0 A04 = ((AnonymousClass17S) this.A00.get()).A04.get();
            try {
                C224114e r6 = A04.A02;
                boolean z = true;
                String[] strArr = new String[1];
                C36421kH.A1Q(strArr, r8.A1N);
                A09 = r6.A09("SELECT duration, expire_timestamp, keep_in_chat, ephemeral_trigger, ephemeral_initiated_by_me FROM message_ephemeral WHERE message_row_id = ?", "GET_EPHEMERAL_MESSAGE_FOR_ROW_ID_SQL", strArr);
                if (A09.moveToNext()) {
                    r8.A0m(C36351kA.A03(A09, "duration"));
                    r8.A0g = Long.valueOf(C36351kA.A07(A09, "expire_timestamp"));
                    r8.A07 = C36351kA.A03(A09, "keep_in_chat");
                    r8.A04 = C36351kA.A03(A09, "ephemeral_trigger");
                    int columnIndexOrThrow = A09.getColumnIndexOrThrow("ephemeral_initiated_by_me");
                    if (!A09.isNull(columnIndexOrThrow)) {
                        if (A09.getInt(columnIndexOrThrow) == 0) {
                            z = false;
                        }
                        r8.A0d = Boolean.valueOf(z);
                    }
                }
                A09.close();
                A04.close();
                if (r9 != null) {
                    throw C36321k7.A04(C78613sO.class);
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
