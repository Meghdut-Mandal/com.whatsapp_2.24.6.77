package X;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.os.Parcelable;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.17c  reason: invalid class name and case insensitive filesystem */
public class C230817c {
    public final C229716r A00;

    public static AnonymousClass3QK A00(Cursor cursor) {
        Integer num;
        int columnIndexOrThrow = cursor.getColumnIndexOrThrow("subject");
        int columnIndexOrThrow2 = cursor.getColumnIndexOrThrow("subject_ts");
        int columnIndexOrThrow3 = cursor.getColumnIndexOrThrow("subgroup_raw_jid");
        int columnIndexOrThrow4 = cursor.getColumnIndexOrThrow("group_type");
        int columnIndexOrThrow5 = cursor.getColumnIndexOrThrow("group_membership_approval_state");
        try {
            String string = cursor.getString(columnIndexOrThrow3);
            Parcelable.Creator creator = AnonymousClass147.CREATOR;
            AnonymousClass147 A04 = C65533Sl.A04(string);
            String string2 = cursor.getString(columnIndexOrThrow);
            long j = cursor.getLong(columnIndexOrThrow2);
            int i = cursor.getInt(columnIndexOrThrow4);
            if (cursor.isNull(columnIndexOrThrow5)) {
                num = null;
            } else {
                num = Integer.valueOf(cursor.getInt(columnIndexOrThrow5));
            }
            return new AnonymousClass3QK(A04, num, string2, i, j);
        } catch (C19740wR e) {
            Log.e("SubgroupStore/invalid subgroup jid", e);
            return null;
        }
    }

    public int A01(GroupJid groupJid) {
        C1495671s B1k;
        try {
            AnonymousClass1M0 A04 = this.A00.A04();
            try {
                B1k = A04.B1k();
                String rawString = groupJid.getRawString();
                C224114e r4 = A04.A02;
                r4.A03("subgroup_info", "subgroup_raw_jid = ?", "subgroup_info.removeSubgroup", new String[]{rawString});
                r4.A03("group_relationship", "subgroup_raw_id = ?", "group_relationship.removeSubgroup", new String[]{rawString});
                B1k.A00();
                B1k.close();
                A04.close();
                return 1;
            } catch (Throwable th) {
                A04.close();
                throw th;
            }
            throw th;
        } catch (SQLiteDatabaseCorruptException e) {
            Log.e((Throwable) e);
            return -1;
        } catch (Error | RuntimeException e2) {
            Log.e(e2);
            throw e2;
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
    }

    public AnonymousClass147 A02(AnonymousClass147 r8) {
        Cursor A09;
        try {
            AnonymousClass1M0 A03 = this.A00.get();
            try {
                A09 = A03.A02.A09("SELECT parent_raw_jid FROM group_relationship WHERE subgroup_raw_id = ?", "subgroupStore/getParentGroupJid", new String[]{r8.getRawString()});
                if (A09.moveToFirst()) {
                    AnonymousClass147 A06 = AnonymousClass147.A01.A06(A09.getString(A09.getColumnIndexOrThrow("parent_raw_jid")));
                    A09.close();
                    A03.close();
                    return A06;
                }
                A09.close();
                A03.close();
                return null;
            } catch (Throwable th) {
                A03.close();
                throw th;
            }
            throw th;
        } catch (SQLiteDatabaseCorruptException e) {
            Log.e("subgroupStore/getParentGroupJid", e);
            return null;
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
    }

    public boolean A04(GroupJid groupJid, Collection collection) {
        Cursor A09;
        try {
            C229716r r1 = this.A00;
            AnonymousClass1M0 A04 = r1.A04();
            try {
                C1495671s B1k = A04.B1k();
                try {
                    Iterator it = collection.iterator();
                    while (it.hasNext()) {
                        AnonymousClass3QK r9 = (AnonymousClass3QK) it.next();
                        GroupJid groupJid2 = r9.A02;
                        String str = r9.A04;
                        long j = r9.A01;
                        String rawString = groupJid2.getRawString();
                        Integer num = r9.A03;
                        boolean z = true;
                        String[] strArr = {groupJid2.getRawString()};
                        AnonymousClass1M0 A03 = r1.get();
                        try {
                            A09 = A03.A02.A09("SELECT subject_ts FROM subgroup_info WHERE subgroup_raw_jid = ?", "GET_TIMESTAMP_FROM_JID", strArr);
                            if (A09.moveToFirst()) {
                                if (A09.getLong(A09.getColumnIndexOrThrow("subject_ts")) <= j) {
                                    z = false;
                                }
                                A09.close();
                                A03.close();
                                if (z) {
                                }
                            } else {
                                A09.close();
                                A03.close();
                            }
                            ContentValues contentValues = new ContentValues(3);
                            contentValues.put("subgroup_raw_jid", rawString);
                            contentValues.put("subject", str);
                            contentValues.put("subject_ts", Long.valueOf(j));
                            contentValues.put("group_type", Integer.valueOf(r9.A00));
                            contentValues.put("group_membership_approval_state", num);
                            C224114e r92 = A04.A02;
                            if (r92.A01(contentValues, "subgroup_info", "subgroup_raw_jid = ?", "subgroup_info.insertSubgroups", new String[]{rawString}) == 0) {
                                r92.A04("subgroup_info", "subgroup_info.insertSubgroups", contentValues);
                            }
                            ContentValues contentValues2 = new ContentValues(2);
                            contentValues2.put("parent_raw_jid", groupJid.getRawString());
                            contentValues2.put("subgroup_raw_id", rawString);
                            if (r92.A01(contentValues2, "group_relationship", "subgroup_raw_id = ?", "group_relationship.insertSubgroups", new String[]{rawString}) == 0) {
                                r92.A04("group_relationship", "group_relationship.insertSubgroups", contentValues2);
                            }
                        } catch (Throwable th) {
                            A03.close();
                            throw th;
                        }
                    }
                    B1k.A00();
                    B1k.close();
                    A04.close();
                    return true;
                    throw th;
                } catch (Throwable th2) {
                    B1k.close();
                    throw th2;
                }
            } catch (Throwable th3) {
                A04.close();
                throw th3;
            }
        } catch (SQLiteDatabaseCorruptException e) {
            Log.e((Throwable) e);
            return false;
        } catch (Error | RuntimeException e2) {
            Log.e(e2);
            throw e2;
        } catch (Throwable th4) {
            th3.addSuppressed(th4);
        }
    }

    public C230817c(C229716r r1) {
        this.A00 = r1;
    }

    public void A03(GroupJid groupJid, Collection collection) {
        Cursor A09;
        A04(groupJid, collection);
        ArrayList arrayList = new ArrayList();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(((AnonymousClass3QK) it.next()).A02);
        }
        Parcelable.Creator creator = AnonymousClass147.CREATOR;
        AnonymousClass147 A03 = C65533Sl.A03(groupJid);
        ArrayList arrayList2 = new ArrayList();
        String[] strArr = {A03.getRawString()};
        AnonymousClass1M0 A032 = this.A00.get();
        try {
            A09 = A032.A02.A09("SELECT subgroups.subgroup_raw_jid, subject, subject_ts, group_type, group_membership_approval_state FROM subgroup_info subgroups INNER JOIN group_relationship relationship ON subgroups.subgroup_raw_jid = relationship.subgroup_raw_id WHERE relationship.parent_raw_jid = ?", "GET_SUBGROUPS_WITH_PARENT_JID_SQL", strArr);
            while (A09.moveToNext()) {
                AnonymousClass3QK A002 = A00(A09);
                if (A002 != null) {
                    arrayList2.add(A002);
                }
            }
            A09.close();
            A032.close();
            ArrayList arrayList3 = new ArrayList();
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                arrayList3.add(((AnonymousClass3QK) it2.next()).A02);
            }
            Iterator it3 = arrayList3.iterator();
            while (it3.hasNext()) {
                GroupJid groupJid2 = (GroupJid) it3.next();
                if (!arrayList.contains(groupJid2)) {
                    A01(groupJid2);
                }
            }
            return;
        } catch (Throwable th) {
            try {
                A032.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }
}
