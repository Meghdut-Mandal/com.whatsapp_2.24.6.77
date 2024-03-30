package X;

import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.1AI  reason: invalid class name */
public class AnonymousClass1AI {
    public final AnonymousClass18P A00;
    public final AnonymousClass005 A01;

    public AnonymousClass1AI(AnonymousClass18P r1, AnonymousClass005 r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    private C181018mn A00(Cursor cursor) {
        C18740tg.A00();
        long j = cursor.getLong(cursor.getColumnIndexOrThrow("_id"));
        byte b = (byte) ((int) cursor.getLong(cursor.getColumnIndexOrThrow("message_type")));
        String string = cursor.getString(cursor.getColumnIndexOrThrow("key_remote_jid"));
        AnonymousClass11F A02 = AnonymousClass11F.A00.A02(string);
        if (A02 == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("peer-messages-store/read-peer-message-from-cursor/invalid remote jid ");
            sb.append(string);
            sb.append(" for ");
            sb.append(j);
            sb.append(" of msgType: ");
            sb.append(b);
            Log.e(sb.toString());
            return null;
        }
        boolean z = false;
        boolean z2 = false;
        if (cursor.getInt(cursor.getColumnIndexOrThrow("key_from_me")) == 1) {
            z2 = true;
        }
        C181018mn r5 = (C181018mn) ((AnonymousClass17E) this.A01.get()).A00(new C64933Qa(A02, cursor.getString(cursor.getColumnIndexOrThrow("key_id")), z2), b, cursor.getLong(cursor.getColumnIndexOrThrow("timestamp")));
        r5.A1N = j;
        DeviceJid nullable = DeviceJid.getNullable(cursor.getString(cursor.getColumnIndexOrThrow("device_id")));
        if (nullable != null) {
            r5.A00 = nullable;
        }
        r5.A1Y(cursor.getString(cursor.getColumnIndexOrThrow("data")));
        if (cursor.getLong(cursor.getColumnIndexOrThrow("acked")) == 1) {
            z = true;
        }
        r5.A01 = z;
        return r5;
    }

    public long A01(C181018mn r8) {
        C18740tg.A00();
        AnonymousClass1M0 A04 = this.A00.A04();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("message_type", Integer.valueOf(r8.A1I));
            C64933Qa r6 = r8.A1J;
            AnonymousClass11F r0 = r6.A00;
            C18740tg.A06(r0);
            contentValues.put("key_remote_jid", r0.getRawString());
            int i = 0;
            if (r6.A02) {
                i = 1;
            }
            contentValues.put("key_from_me", Integer.valueOf(i));
            contentValues.put("key_id", r6.A01);
            contentValues.put("timestamp", Long.valueOf(r8.A0I));
            DeviceJid deviceJid = r8.A00;
            if (deviceJid != null) {
                contentValues.put("device_id", deviceJid.getRawString());
            }
            contentValues.put("data", r8.A1X());
            contentValues.put("acked", 0);
            r8.A1N = A04.A02.A04("peer_messages", "PeerMessagesTable.ADD_MESSAGE", contentValues);
            long j = r8.A1N;
            A04.close();
            return j;
        } catch (Throwable th) {
            th.addSuppressed(th);
            throw th;
        }
    }

    public C181018mn A02(long j) {
        Cursor A09;
        C181018mn r0;
        C18740tg.A00();
        AnonymousClass1M0 A03 = this.A00.get();
        try {
            A09 = A03.A02.A09("SELECT _id, message_type, key_remote_jid, key_from_me, key_id, timestamp, device_id, data, acked FROM peer_messages WHERE _id = ?", "PeerMessagesTable.SELECT_MESSAGE_BY_ID", new String[]{String.valueOf(j)});
            if (!A09.moveToNext()) {
                r0 = null;
            } else {
                r0 = A00(A09);
            }
            A09.close();
            A03.close();
            return r0;
        } catch (Throwable th) {
            try {
                A03.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }

    public C181018mn A03(DeviceJid deviceJid, String str) {
        Cursor A09;
        C181018mn r0;
        C18740tg.A00();
        AnonymousClass1M0 A03 = this.A00.get();
        try {
            A09 = A03.A02.A09("SELECT _id, message_type, key_remote_jid, key_from_me, key_id, timestamp, device_id, data, acked FROM peer_messages WHERE device_id = ? AND key_from_me = ? AND key_id = ?", "PeerMessagesStore.getPeerMessageByKey", new String[]{deviceJid.getRawString(), String.valueOf(1), str});
            if (!A09.moveToNext()) {
                r0 = null;
            } else {
                r0 = A00(A09);
            }
            A09.close();
            A03.close();
            return r0;
        } catch (Throwable th) {
            try {
                A03.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }

    public ArrayList A04(int i) {
        Cursor A09;
        C18740tg.A00();
        ArrayList arrayList = new ArrayList();
        AnonymousClass1M0 A03 = this.A00.get();
        try {
            A09 = A03.A02.A09("SELECT _id, message_type, key_remote_jid, key_from_me, key_id, timestamp, device_id, data, acked FROM peer_messages WHERE message_type = ? ", "PeerMessagesTable.SELECT_MESSAGES_BY_MESSAGE_TYPE", new String[]{String.valueOf(i)});
            while (A09.moveToNext()) {
                C181018mn A002 = A00(A09);
                if (A002 != null) {
                    arrayList.add(A002);
                }
            }
            A09.close();
            A03.close();
            return arrayList;
        } catch (Throwable th) {
            try {
                A03.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }

    public void A05(long j) {
        C18740tg.A00();
        A07(Collections.singletonList(Long.valueOf(j)));
    }

    public void A06(DeviceJid deviceJid) {
        C18740tg.A00();
        AnonymousClass1M0 A04 = this.A00.A04();
        try {
            A04.A02.A03("peer_messages", "device_id = ?", "PeerMessagesStore.deletePeerMessages", new String[]{deviceJid.getRawString()});
            A04.close();
        } catch (Throwable th) {
            th.addSuppressed(th);
            throw th;
        }
    }

    public void A07(List list) {
        C1495671s B1k;
        if (list.size() != 0) {
            C18740tg.A00();
            String[] strArr = new String[list.size()];
            for (int i = 0; i < list.size(); i++) {
                strArr[i] = String.valueOf(list.get(i));
            }
            AnonymousClass72Z r1 = new AnonymousClass72Z(strArr, 975);
            AnonymousClass1M0 A04 = this.A00.A04();
            try {
                B1k = A04.B1k();
                Iterator it = r1.iterator();
                while (it.hasNext()) {
                    String[] strArr2 = (String[]) it.next();
                    C224114e r3 = A04.A02;
                    int length = strArr2.length;
                    StringBuilder sb = new StringBuilder();
                    sb.append("DELETE FROM peer_messages WHERE _id IN ( ");
                    sb.append(TextUtils.join(",", Collections.nCopies(length, "?")));
                    sb.append(" )");
                    r3.A0E(sb.toString(), "PeerMessagesStore.deletePeerMessageById", strArr2);
                }
                B1k.A00();
                B1k.close();
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
}
