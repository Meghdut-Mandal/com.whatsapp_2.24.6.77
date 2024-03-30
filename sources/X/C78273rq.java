package X;

import android.database.Cursor;
import com.whatsapp.jid.UserJid;

/* renamed from: X.3rq  reason: invalid class name and case insensitive filesystem */
public final class C78273rq implements AnonymousClass4S2, AnonymousClass4S3, AnonymousClass4S4, C17760rz {
    public final AnonymousClass005 A00;

    public C78273rq(AnonymousClass005 r2) {
        AnonymousClass00C.A0D(r2, 1);
        this.A00 = r2;
    }

    public void B7J(AnonymousClass3T1 r9) {
        Cursor A09;
        AnonymousClass00C.A0D(r9, 0);
        if (r9 instanceof AnonymousClass2bO) {
            AnonymousClass1SS r7 = (AnonymousClass1SS) this.A00.get();
            AnonymousClass2bO r92 = (AnonymousClass2bO) r9;
            boolean A1R = AnonymousClass000.A1R((r92.A1N > 0 ? 1 : (r92.A1N == 0 ? 0 : -1)));
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("RevokedMessageStore/fillRevokedInfo/message must have row_id set; key=");
            String[] A0C = AnonymousClass3T1.A0C(r92, A0u, A1R);
            AnonymousClass1M0 A04 = r7.A02.get();
            try {
                A09 = A04.A02.A09("SELECT revoked_key_id,admin_jid_row_id,revoke_timestamp FROM message_revoked WHERE message_row_id = ?", "GET_REVOKED_MESSAGE_BY_ROW_ID_SQL", A0C);
                if (A09.moveToNext()) {
                    r92.A01 = C36341k9.A0f(A09, "revoked_key_id");
                    int columnIndexOrThrow = A09.getColumnIndexOrThrow("admin_jid_row_id");
                    if (!A09.isNull(columnIndexOrThrow)) {
                        long j = A09.getLong(columnIndexOrThrow);
                        if (Long.valueOf(j) != null) {
                            if (r92 instanceof AnonymousClass2c8) {
                                UserJid userJid = (UserJid) r7.A01.A0C(UserJid.class, j);
                                C18740tg.A06(userJid);
                                ((AnonymousClass2c8) r92).A00 = userJid;
                            } else {
                                r7.A00.A0E("RevokedMessageStore/fillRevokedInfo invalid cast", Integer.toString(r92.A1I), true);
                            }
                        }
                    }
                    r92.A00 = C36351kA.A07(A09, "revoke_timestamp");
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
        } else {
            return;
        }
        throw th;
    }

    public void BKi(AnonymousClass3T1 r2) {
        AnonymousClass00C.A0D(r2, 0);
        ((AnonymousClass1SS) this.A00.get()).A00((AnonymousClass2bO) r2);
    }

    public void BwV(AnonymousClass3T1 r2) {
        AnonymousClass00C.A0D(r2, 0);
        ((AnonymousClass1SS) this.A00.get()).A00((AnonymousClass2bO) r2);
    }
}
