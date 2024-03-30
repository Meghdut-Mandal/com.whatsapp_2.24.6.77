package X;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.180  reason: invalid class name */
public class AnonymousClass180 {
    public final C219712j A00;
    public final AnonymousClass12P A01;

    public synchronized void A01(AnonymousClass147 r14, List list) {
        AnonymousClass1M0 A05 = this.A01.A05();
        try {
            C219712j r6 = this.A00;
            long A07 = r6.A07(r14);
            Long valueOf = Long.valueOf(A07);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                long A072 = r6.A07((UserJid) it.next());
                Long valueOf2 = Long.valueOf(A072);
                if (!(A07 == -1 || A072 == -1)) {
                    A05.A02.A03("parent_group_participants", "parent_group_jid_row_id = ? AND user_jid_row_id = ?", "parent_group_participants_store/DELETE_OLD_PARTICIPANT", new String[]{String.valueOf(valueOf), String.valueOf(valueOf2)});
                }
            }
            A05.close();
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        return;
        throw th;
    }

    public synchronized void A02(AnonymousClass147 r12, List list, boolean z) {
        HashSet hashSet;
        HashSet hashSet2 = new HashSet(A00(this, r12));
        HashSet hashSet3 = new HashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            hashSet3.add(Long.valueOf(this.A00.A07((UserJid) it.next())));
        }
        HashSet hashSet4 = new HashSet(hashSet3);
        AnonymousClass6XG.A01(new C65893Tw(hashSet2, 1), hashSet4);
        if (z) {
            hashSet = new HashSet();
        } else {
            hashSet = new HashSet(hashSet2);
        }
        AnonymousClass6XG.A01(new C65893Tw(hashSet3, 1), hashSet);
        if (hashSet4.size() != 0 || hashSet.size() != 0) {
            AnonymousClass1M0 A05 = this.A01.A05();
            try {
                Long valueOf = Long.valueOf(this.A00.A07(r12));
                Iterator it2 = hashSet4.iterator();
                while (it2.hasNext()) {
                    ContentValues contentValues = new ContentValues(2);
                    contentValues.put("parent_group_jid_row_id", valueOf);
                    contentValues.put("user_jid_row_id", (Long) it2.next());
                    A05.A02.A08("parent_group_participants", "parent_group_participants_store/INSERT_NEW_PARTICIPANT", contentValues, 5);
                }
                Iterator it3 = hashSet.iterator();
                while (it3.hasNext()) {
                    A05.A02.A03("parent_group_participants", "parent_group_jid_row_id = ? AND user_jid_row_id = ?", "parent_group_participants_store/DELETE_OLD_PARTICIPANT", new String[]{String.valueOf(valueOf), String.valueOf((Long) it3.next())});
                }
                A05.close();
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        }
        return;
        throw th;
    }

    public static ArrayList A00(AnonymousClass180 r9, AnonymousClass147 r10) {
        Cursor A09;
        long A07 = r9.A00.A07(r10);
        try {
            AnonymousClass1M0 A04 = r9.A01.get();
            try {
                A09 = A04.A02.A09("SELECT user_jid_row_id FROM parent_group_participants WHERE parent_group_jid_row_id= ?", "linkedGroupParticipantsStore/getParticipantsForParentGroupJid", new String[]{String.valueOf(A07)});
                ArrayList arrayList = new ArrayList();
                int columnIndexOrThrow = A09.getColumnIndexOrThrow("user_jid_row_id");
                while (A09.moveToNext()) {
                    arrayList.add(Long.valueOf(A09.getLong(columnIndexOrThrow)));
                }
                A09.close();
                A04.close();
                return arrayList;
            } catch (Throwable th) {
                A04.close();
                throw th;
            }
            throw th;
        } catch (SQLiteDatabaseCorruptException e) {
            Log.e("linkedGroupParticipantsStore/getParticipantsForParentGroupJid", e);
            return new ArrayList();
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
    }

    public AnonymousClass180(C219712j r1, AnonymousClass12P r2) {
        this.A00 = r1;
        this.A01 = r2;
    }
}
