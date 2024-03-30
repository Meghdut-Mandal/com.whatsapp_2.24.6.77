package X;

import android.content.ContentValues;
import android.database.Cursor;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.17y  reason: invalid class name and case insensitive filesystem */
public class C233017y {
    public final C219712j A00;
    public final AnonymousClass12P A01;
    public final C20810yC A02;

    public static ArrayList A00(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        Cursor cursor2 = cursor;
        int columnIndexOrThrow = cursor2.getColumnIndexOrThrow("group_jid_row_id");
        int columnIndexOrThrow2 = cursor2.getColumnIndexOrThrow("user_jid_row_id");
        int columnIndexOrThrow3 = cursor2.getColumnIndexOrThrow("is_leave");
        int columnIndexOrThrow4 = cursor2.getColumnIndexOrThrow("timestamp");
        while (cursor2.moveToNext()) {
            long j = cursor2.getLong(columnIndexOrThrow);
            long j2 = cursor2.getLong(columnIndexOrThrow2);
            boolean z = false;
            if (cursor2.getLong(columnIndexOrThrow3) != 0) {
                z = true;
            }
            arrayList.add(new AnonymousClass38F(j, j2, cursor2.getLong(columnIndexOrThrow4), z));
        }
        return arrayList;
    }

    public static HashMap A01(C233017y r11, List list) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass38F r2 = (AnonymousClass38F) it.next();
            hashSet.add(Long.valueOf(r2.A00));
            hashSet2.add(Long.valueOf(r2.A02));
        }
        C219712j r1 = r11.A00;
        HashMap A0D = r1.A0D(AnonymousClass144.class, hashSet);
        HashMap A0D2 = r1.A0D(UserJid.class, hashSet2);
        HashMap hashMap = new HashMap();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            AnonymousClass38F r5 = (AnonymousClass38F) it2.next();
            AnonymousClass144 r8 = (AnonymousClass144) A0D.get(Long.valueOf(r5.A00));
            UserJid userJid = (UserJid) A0D2.get(Long.valueOf(r5.A02));
            if (!(userJid == null || r8 == null)) {
                Object obj = hashMap.get(r8);
                if (obj == null) {
                    obj = new ArrayList();
                    hashMap.put(r8, obj);
                }
                ((List) obj).add(new AnonymousClass38E(r8, userJid, r5.A01, r5.A03));
            }
        }
        return hashMap;
    }

    public void A02(AnonymousClass144 r7) {
        String[] strArr = {String.valueOf(this.A00.A07(r7))};
        AnonymousClass1M0 A05 = this.A01.A05();
        try {
            A05.A02.A03("group_past_participant_user", "group_jid_row_id = ?", "deletePastParticipant/DELETE_PAST_PARTICIPANT_GROUP", strArr);
            A05.close();
        } catch (Throwable th) {
            th.addSuppressed(th);
            throw th;
        }
    }

    public void A03(AnonymousClass144 r9, UserJid userJid) {
        C219712j r0 = this.A00;
        String[] strArr = {String.valueOf(r0.A07(r9)), String.valueOf(r0.A07(userJid))};
        AnonymousClass1M0 A05 = this.A01.A05();
        try {
            A05.A02.A03("group_past_participant_user", "group_jid_row_id = ? AND user_jid_row_id = ?", "deletePastParticipant/DELETE_PAST_PARTICIPANT_USER", strArr);
            A05.close();
        } catch (Throwable th) {
            th.addSuppressed(th);
            throw th;
        }
    }

    public void A04(AnonymousClass144 r9, UserJid userJid, long j, boolean z) {
        C219712j r0 = this.A00;
        long A07 = r0.A07(r9);
        long A072 = r0.A07(userJid);
        ContentValues contentValues = new ContentValues(4);
        contentValues.put("group_jid_row_id", Long.valueOf(A07));
        contentValues.put("user_jid_row_id", Long.valueOf(A072));
        contentValues.put("is_leave", Boolean.valueOf(z));
        contentValues.put("timestamp", Long.valueOf(j));
        AnonymousClass1M0 A05 = this.A01.A05();
        try {
            A05.A02.A08("group_past_participant_user", "insertOrUpdatePastParticipant/INSERT_PAST_PARTICIPANT_USER", contentValues, 5);
            A05.close();
        } catch (Throwable th) {
            th.addSuppressed(th);
            throw th;
        }
    }

    public C233017y(C219712j r1, AnonymousClass12P r2, C20810yC r3) {
        this.A02 = r3;
        this.A00 = r1;
        this.A01 = r2;
    }
}
