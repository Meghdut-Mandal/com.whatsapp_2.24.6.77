package X;

import android.database.Cursor;
import com.whatsapp.jid.PhoneUserJid;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.1PB  reason: invalid class name */
public class AnonymousClass1PB {
    public final C20310xM A00;
    public final AnonymousClass1F8 A01;
    public final AnonymousClass1C4 A02;
    public final AnonymousClass1A1 A03;
    public final C19770wU A04;
    public final C19730wQ A05;

    public ArrayList A00(AnonymousClass147 r8, long j) {
        Cursor A09;
        AnonymousClass1F8 r3 = this.A01;
        C19730wQ r0 = this.A05;
        r0.A0G();
        PhoneUserJid phoneUserJid = r0.A03;
        C18740tg.A06(phoneUserJid);
        ArrayList arrayList = new ArrayList();
        C219712j r2 = r3.A00;
        String[] strArr = {Long.toString(r2.A07(r8)), Long.toString(r2.A07(phoneUserJid)), Long.toString(j)};
        AnonymousClass1M0 A042 = r3.A01.get();
        try {
            A09 = A042.A02.A09("SELECT chat_row_id, message_row_id FROM message_group_invite invite INNER JOIN message_view message ON invite.message_row_id = message._id WHERE invite.group_jid_row_id = ? AND invite.admin_jid_row_id = ? AND invite.expiration > ? AND invite.expired = 0", "GET_UNEXPIRED_INVITE_MESSAGES_FOR_GROUP_SQL", strArr);
            while (A09.moveToNext()) {
                arrayList.add(Long.valueOf(A09.getLong(A09.getColumnIndexOrThrow("message_row_id"))));
            }
            A09.close();
            A042.close();
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                AnonymousClass1A1 r02 = this.A03;
                AnonymousClass3T1 A012 = r02.A01.A01(((Number) it.next()).longValue());
                if (A012 != null) {
                    arrayList2.add(A012);
                }
            }
            return arrayList2;
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

    public AnonymousClass1PB(C19730wQ r1, C20310xM r2, AnonymousClass1F8 r3, AnonymousClass1C4 r4, AnonymousClass1A1 r5, C19770wU r6) {
        this.A05 = r1;
        this.A04 = r6;
        this.A02 = r4;
        this.A03 = r5;
        this.A00 = r2;
        this.A01 = r3;
    }
}
