package X;

import android.content.ContentValues;
import android.database.Cursor;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;

/* renamed from: X.1Fl  reason: invalid class name and case insensitive filesystem */
public class C25221Fl {
    public final C19730wQ A00;
    public final C220412q A01;
    public final AnonymousClass12P A02;
    public final C235518x A03;
    public final AnonymousClass184 A04;
    public final C25211Fk A05;
    public final C20810yC A06;
    public final C238019x A07;
    public final C19970wo A08;
    public final AnonymousClass163 A09;
    public final C25231Fm A0A;

    public C65073Qp A03(AnonymousClass2bY r12) {
        C65073Qp A012 = A01(this, r12);
        if (A012 == null) {
            Log.e("EphemeralSettingMessageStore/incomingEphemeralSyncResponse/no chat");
            return null;
        }
        int i = 0;
        if (C20800yB.A01(C21000yV.A02, this.A06, 4131)) {
            int i2 = r12.A00;
            if (i2 == 1) {
                i = 2;
            } else if (i2 == 2) {
                i = 1;
            }
            Log.i("EphemeralSettingMessageStore/incomingEphemeralSyncResponse/flip initiator");
        }
        int i3 = r12.A00;
        long j = r12.A01;
        A02(A012, this, r12.A0d, i3, i, r12.A04, j);
        StringBuilder sb = new StringBuilder();
        sb.append("EphemeralSettingMessageStore/incomingEphemeralSyncResponse/update ephemeral info ");
        sb.append(A012.A0b);
        Log.i(sb.toString());
        return A012;
    }

    public static int A00(C25221Fl r5, long j) {
        Cursor A092;
        AnonymousClass1M0 A042 = r5.A02.get();
        try {
            int i = 0;
            A092 = A042.A02.A09("SELECT setting_duration FROM message_ephemeral_setting WHERE message_row_id = ?", "GET_EPHEMERAL_SETTING_DURATION", new String[]{Long.toString(j)});
            if (A092 != null) {
                if (A092.moveToNext()) {
                    i = A092.getInt(A092.getColumnIndexOrThrow("setting_duration"));
                }
                A092.close();
            }
            A042.close();
            return i;
        } catch (Throwable th) {
            try {
                A042.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }

    public static C65073Qp A01(C25221Fl r4, AnonymousClass3T1 r5) {
        AnonymousClass11F r1 = r5.A1J.A00;
        C222813r r0 = UserJid.Companion;
        UserJid A002 = C222813r.A00(r1);
        if (A002 == null) {
            Log.e("EphemeralSettingMessageStore/getChatInfo/not a user");
            return null;
        }
        C65073Qp A092 = r4.A01.A09(A002, false);
        if (A092 != null) {
            return A092;
        }
        Log.w("EphemeralSettingMessageStore/getChatInfo/no chat");
        return null;
    }

    public Integer A04(AnonymousClass3T1 r10) {
        Cursor A092;
        AnonymousClass163 r1 = this.A09;
        AnonymousClass11F r0 = r10.A1J.A00;
        C18740tg.A06(r0);
        long A082 = r1.A08(r0);
        AnonymousClass1M0 A042 = this.A02.get();
        try {
            A092 = A042.A02.A09("SELECT setting_duration FROM message_ephemeral_setting INNER JOIN message_view ON message_ephemeral_setting.message_row_id=message_view._id WHERE chat_row_id == ? AND sort_id < ? ORDER BY sort_id DESC LIMIT 1", "GET_EPHEMERAL_SETTING_BEFORE_MESSAGE", new String[]{Long.toString(A082), Long.toString(r10.A1O)});
            if (A092 != null) {
                if (A092.moveToNext()) {
                    Integer valueOf = Integer.valueOf(A092.getInt(A092.getColumnIndexOrThrow("setting_duration")));
                    A092.close();
                    A042.close();
                    return valueOf;
                }
            }
            if (A092 != null) {
                A092.close();
            }
            A042.close();
            return null;
        } catch (Throwable th) {
            try {
                A042.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0022, code lost:
        if (r0 <= r0) goto L_0x0024;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A05(X.C65073Qp r16, X.AnonymousClass2bH r17) {
        /*
            r15 = this;
            r6 = r16
            r7 = r15
            r2 = r17
            if (r16 != 0) goto L_0x000e
            X.3Qp r6 = A01(r15, r2)
            if (r6 != 0) goto L_0x000e
        L_0x000d:
            return
        L_0x000e:
            X.3un r10 = r6.A0b
            X.184 r8 = r15.A04
            int r12 = r2.A00
            int r0 = r10.expiration
            if (r12 != r0) goto L_0x0031
            long r0 = r2.A0I
            long r3 = r10.ephemeralSettingTimestamp
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 <= 0) goto L_0x0031
            int r3 = (r0 > r0 ? 1 : (r0 == r0 ? 0 : -1))
            if (r3 > 0) goto L_0x0031
        L_0x0024:
            int r9 = r2.A00
            long r12 = r2.A0I
            r10 = 0
            int r11 = r2.A04
            java.lang.Boolean r8 = r2.A0d
            A02(r6, r7, r8, r9, r10, r11, r12)
            return
        L_0x0031:
            int r1 = r2.A0H()
            r0 = 1
            if (r1 != r0) goto L_0x000d
            X.3Qa r0 = r2.A1J
            X.11F r9 = r0.A00
            long r13 = r2.A0I
            java.lang.Long r11 = java.lang.Long.valueOf(r13)
            boolean r0 = X.AnonymousClass184.A00(r8, r9, r10, r11, r12, r13)
            if (r0 == 0) goto L_0x000d
            goto L_0x0024
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25221Fl.A05(X.3Qp, X.2bH):void");
    }

    public void A06(Boolean bool, int i, int i2, int i3, long j) {
        AnonymousClass1M0 A052 = this.A02.A05();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("message_row_id", Long.valueOf(j));
            contentValues.put("setting_duration", Integer.valueOf(i));
            contentValues.put("setting_reason", Integer.valueOf(i2));
            if (C20800yB.A01(C21000yV.A02, this.A06, 5309)) {
                contentValues.put("ephemeral_trigger", Integer.valueOf(i3));
                if (bool != null) {
                    contentValues.put("ephemeral_initiated_by_me", bool);
                }
            }
            A052.A02.A08("message_ephemeral_setting", "INSERT_EPHEMERAL_SETTING_DURATION", contentValues, 5);
            A052.close();
        } catch (Throwable th) {
            th.addSuppressed(th);
            throw th;
        }
    }

    public C25221Fl(C19730wQ r1, C19970wo r2, AnonymousClass163 r3, C220412q r4, C25231Fm r5, AnonymousClass12P r6, C235518x r7, AnonymousClass184 r8, C25211Fk r9, C20810yC r10, C238019x r11) {
        this.A08 = r2;
        this.A06 = r10;
        this.A09 = r3;
        this.A00 = r1;
        this.A01 = r4;
        this.A02 = r6;
        this.A07 = r11;
        this.A05 = r9;
        this.A04 = r8;
        this.A03 = r7;
        this.A0A = r5;
    }

    public static void A02(C65073Qp r5, C25221Fl r6, Boolean bool, int i, int i2, int i3, long j) {
        ContentValues contentValues;
        r5.A0C(i, j, i2);
        AnonymousClass163 r4 = r6.A09;
        synchronized (r5) {
            contentValues = new ContentValues();
            contentValues.put("ephemeral_expiration", Integer.valueOf(r5.A0b.expiration));
            contentValues.put("ephemeral_setting_timestamp", Long.valueOf(r5.A0b.ephemeralSettingTimestamp));
            contentValues.put("ephemeral_disappearing_messages_initiator", Integer.valueOf(r5.A0b.disappearingMessagesInitiator));
        }
        r4.A05(contentValues, r5);
        if (C20800yB.A01(C21000yV.A02, r6.A06, 5309) && r5.A0I(bool, i3)) {
            r6.A0A.A00(r5);
        }
    }
}
