package X;

import android.database.Cursor;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONException;

/* renamed from: X.1AC  reason: invalid class name */
public class AnonymousClass1AC {
    public final AnonymousClass18P A00;
    public final AnonymousClass1AE A01;
    public final C19700wN A02;

    public C201669k5 A09(C201539jo r11, String str, String str2, byte[] bArr, byte[] bArr2, byte[] bArr3, int i, boolean z) {
        try {
            C199769fw r4 = C199769fw.A03;
            if (!Arrays.equals(r4.A01, bArr2)) {
                r4 = C199769fw.A02;
                if (!Arrays.equals(r4.A01, bArr2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Incorrect operation bytes: ");
                    sb.append(new String(bArr2));
                    throw new IllegalStateException(sb.toString());
                }
            }
            C202599mH r3 = new C202599mH(r4, r11, str2, bArr, bArr3, i);
            AnonymousClass1LZ A002 = this.A01.A00(r3.A06[0]);
            if (A002 != null && A002.A0H()) {
                C201669k5 A0A = A002.A0A(r3, str, z);
                if (A0A != null) {
                    A0A.A01 = r3.A05;
                }
                return A0A;
            }
        } catch (AnonymousClass186 | AnonymousClass1AD | IllegalArgumentException | JSONException e) {
            Log.e("sync-mutation/from-key-value couldn't create sync action data", e);
        }
        return null;
    }

    public static C201669k5 A00(Cursor cursor, AnonymousClass1AC r10) {
        boolean z = false;
        if (cursor.getLong(cursor.getColumnIndexOrThrow("are_dependencies_missing")) == 1) {
            z = true;
        }
        String string = cursor.getString(cursor.getColumnIndexOrThrow("_id"));
        C201539jo A022 = A02(cursor);
        String string2 = cursor.getString(cursor.getColumnIndexOrThrow("mutation_index"));
        byte[] blob = cursor.getBlob(cursor.getColumnIndexOrThrow("mutation_value"));
        int i = cursor.getInt(cursor.getColumnIndexOrThrow("mutation_version"));
        return r10.A09(A022, string, string2, blob, cursor.getBlob(cursor.getColumnIndexOrThrow("operation")), (byte[]) null, i, z);
    }

    public static C201669k5 A01(Cursor cursor, AnonymousClass1AC r10) {
        boolean z = false;
        if (cursor.getLong(cursor.getColumnIndexOrThrow("are_dependencies_missing")) == 1) {
            z = true;
        }
        C201539jo A022 = A02(cursor);
        C18740tg.A06(A022);
        String string = cursor.getString(cursor.getColumnIndexOrThrow("mutation_index"));
        byte[] blob = cursor.getBlob(cursor.getColumnIndexOrThrow("mutation_value"));
        int i = cursor.getInt(cursor.getColumnIndexOrThrow("mutation_version"));
        return r10.A09(A022, (String) null, string, blob, C199769fw.A03.A01, cursor.getBlob(cursor.getColumnIndexOrThrow("mutation_mac")), i, z);
    }

    public static C201539jo A02(Cursor cursor) {
        int columnIndexOrThrow = cursor.getColumnIndexOrThrow("device_id");
        int columnIndexOrThrow2 = cursor.getColumnIndexOrThrow("epoch");
        if (cursor.isNull(columnIndexOrThrow) || cursor.isNull(columnIndexOrThrow2)) {
            return null;
        }
        return new C201539jo(cursor.getInt(columnIndexOrThrow), cursor.getInt(columnIndexOrThrow2));
    }

    public static ArrayList A03(AnonymousClass7gV r4, AnonymousClass1AC r5, String str, String str2, String[] strArr) {
        Cursor A09;
        C201669k5 A012;
        ArrayList arrayList = new ArrayList();
        AnonymousClass1M0 A03 = r5.A00.get();
        try {
            A09 = A03.A02.A09(str, str2, strArr);
            while (A09.moveToNext()) {
                if (r4.B5m(A09.getString(A09.getColumnIndexOrThrow("mutation_index"))) && (A012 = A01(A09, r5)) != null) {
                    arrayList.add(A012);
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

    public static ArrayList A04(AnonymousClass1AC r6, String str, boolean z) {
        String str2;
        Cursor A09;
        C201669k5 r0;
        ArrayList arrayList = new ArrayList();
        AnonymousClass1M0 A03 = r6.A00.get();
        try {
            C224114e r3 = A03.A02;
            if (z) {
                str2 = "SELECT _id, mutation_index, mutation_value, mutation_version, operation, device_id, epoch, are_dependencies_missing FROM pending_mutations WHERE mutation_name = ?";
            } else {
                str2 = "SELECT mutation_index, mutation_value, mutation_version, are_dependencies_missing, device_id, epoch, mutation_mac FROM syncd_mutations WHERE mutation_name = ?";
            }
            A09 = r3.A09(str2, "syncd_mutations.SELECT_MUTATIONS_BY_MUTATION_NAME", new String[]{str});
            while (A09.moveToNext()) {
                if (z) {
                    r0 = A00(A09, r6);
                } else {
                    r0 = A01(A09, r6);
                }
                if (r0 != null) {
                    arrayList.add(r0);
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

    public static void A05(C224114e r6, AnonymousClass1AC r7, C201539jo r8, AnonymousClass11F r9, String str, String str2, String str3, byte[] bArr, byte[] bArr2, int i, boolean z) {
        long j;
        byte[] bArr3 = r8.A00;
        if (C203239na.A01(bArr3, 2) == 0) {
            C19700wN r5 = r7.A02;
            StringBuilder sb = new StringBuilder();
            sb.append("keyId=");
            sb.append(r8);
            r5.A0E("syncdMutationStore/insertOrReplaceMutation unexpected key", sb.toString(), true);
        }
        AnonymousClass6QI A0C = r6.A0C("INSERT OR REPLACE INTO syncd_mutations (mutation_index, mutation_value, mutation_version, collection_name, are_dependencies_missing, device_id, epoch, mutation_mac, chat_jid, mutation_name) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", "SyncdMutationsTable.INSERT_OR_REPLACE");
        A0C.A03();
        A0C.A06(1, str);
        if (bArr == null) {
            A0C.A04(2);
        } else {
            A0C.A07(2, bArr);
        }
        A0C.A05(3, (long) i);
        A0C.A06(4, str2);
        if (z) {
            j = 1;
        } else {
            j = 0;
        }
        A0C.A05(5, j);
        A0C.A05(6, (long) r8.A00());
        A0C.A05(7, (long) C203239na.A01(bArr3, 2));
        A0C.A07(8, bArr2);
        if (r9 == null) {
            A0C.A04(9);
        } else {
            A0C.A06(9, r9.getRawString());
        }
        A0C.A06(10, str3);
        if (A0C.A02() == -1) {
            Log.e("SyncdMutationsStore/insertOrReplaceMutation was unsuccessful");
        }
    }

    public static void A06(C224114e r16, AnonymousClass1AC r17, Collection collection) {
        byte[] A0o;
        AnonymousClass11F r9;
        C224114e r6 = r16;
        C18740tg.A0B(r6.A00.inTransaction());
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C201669k5 r1 = (C201669k5) it.next();
            C199769fw r2 = r1.A05;
            if (r2 == C199769fw.A03) {
                arrayList.add(r1);
            } else if (r2 == C199769fw.A02) {
                arrayList2.add(r1);
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Incorrect operation: ");
                sb.append(r2);
                throw new IllegalStateException(sb.toString());
            }
        }
        A08(r6, C201839kV.A02(arrayList2));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            C201669k5 r12 = (C201669k5) it2.next();
            String str = r12.A06;
            String A06 = r12.A06();
            AnonymousClass8SS A05 = r12.A05();
            if (A05 == null) {
                A0o = null;
            } else {
                A0o = A05.A0o();
            }
            int i = r12.A03;
            boolean A09 = r12.A09();
            C201539jo r8 = r12.A00;
            C18740tg.A06(r8);
            byte[] bArr = r12.A01;
            C18740tg.A06(bArr);
            if (r12 instanceof C22936Aym) {
                r9 = ((C22936Aym) r12).getChatJid();
            } else {
                r9 = null;
            }
            A05(r6, r17, r8, r9, A06, str, r12.A07(), A0o, bArr, i, A09);
        }
    }

    public static void A07(C224114e r5, String[] strArr) {
        C18740tg.A0B(r5.A00.inTransaction());
        Iterator it = new AnonymousClass72Z(strArr, 975).iterator();
        while (it.hasNext()) {
            String[] strArr2 = (String[]) it.next();
            int length = strArr2.length;
            StringBuilder sb = new StringBuilder();
            sb.append("DELETE FROM pending_mutations WHERE _id IN ( ");
            sb.append(TextUtils.join(",", Collections.nCopies(length, "?")));
            sb.append(" )");
            r5.A0E(sb.toString(), "SyncdMutationsStore.deletePendingMutations", strArr2);
        }
    }

    public static void A08(C224114e r5, String[] strArr) {
        C18740tg.A0B(r5.A00.inTransaction());
        Iterator it = new AnonymousClass72Z(strArr, 975).iterator();
        while (it.hasNext()) {
            String[] strArr2 = (String[]) it.next();
            int length = strArr2.length;
            StringBuilder sb = new StringBuilder();
            sb.append("DELETE FROM syncd_mutations WHERE mutation_index IN ");
            sb.append(AnonymousClass1M2.A00(length));
            r5.A0E(sb.toString(), "SyncdMutationsStore.deleteStoredMutations", strArr2);
        }
    }

    public C201669k5 A0A(String str) {
        Cursor A09;
        C201669k5 r0;
        AnonymousClass1M0 A03 = this.A00.get();
        try {
            A09 = A03.A02.A09("SELECT _id, mutation_index, mutation_value, mutation_version, operation, device_id, epoch, are_dependencies_missing FROM pending_mutations WHERE mutation_index = ?", "PendingMutationsTable.SELECT_BY_KEY", new String[]{str});
            if (!A09.moveToNext()) {
                r0 = null;
            } else {
                r0 = A00(A09, this);
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

    public C201669k5 A0B(String str) {
        Cursor A09;
        C201669k5 r0;
        AnonymousClass1M0 A03 = this.A00.get();
        try {
            A09 = A03.A02.A09("SELECT mutation_index, mutation_value, mutation_version, are_dependencies_missing, device_id, epoch, mutation_mac FROM syncd_mutations WHERE mutation_index = ? ", "SyncdMutationsTable.SELECT_MUTATION_WITH_INDEX", new String[]{str});
            if (!A09.moveToNext()) {
                r0 = null;
            } else {
                r0 = A01(A09, this);
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

    public ArrayList A0C(AnonymousClass11F r8, Set set, boolean z) {
        String obj;
        String str;
        Cursor A09;
        C201669k5 r0;
        ArrayList arrayList = new ArrayList();
        if (set.isEmpty()) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(r8.getRawString());
        arrayList2.addAll(set);
        AnonymousClass1M0 A03 = this.A00.get();
        try {
            C224114e r5 = A03.A02;
            if (z) {
                int size = set.size();
                StringBuilder sb = new StringBuilder();
                sb.append("SELECT _id, mutation_index, mutation_value, mutation_version, operation, device_id, epoch, are_dependencies_missing FROM pending_mutations WHERE chat_jid = ?  AND mutation_name IN ");
                sb.append(AnonymousClass1M2.A00(size));
                obj = sb.toString();
            } else {
                int size2 = set.size();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("SELECT mutation_index, mutation_value, mutation_version, are_dependencies_missing, device_id, epoch, mutation_mac FROM syncd_mutations WHERE chat_jid = ?  AND mutation_name IN ");
                sb2.append(AnonymousClass1M2.A00(size2));
                obj = sb2.toString();
            }
            String[] strArr = (String[]) arrayList2.toArray(C19430v1.A0N);
            if (z) {
                str = "PendingMutationsTable.buildSelectMutationsByChatIdAndMutationNames";
            } else {
                str = "SyncdMutationsTable.buildSelectMutationsByChatIdAndMutationNames";
            }
            A09 = r5.A09(obj, str, strArr);
            while (A09.moveToNext()) {
                if (z) {
                    r0 = A00(A09, this);
                } else {
                    r0 = A01(A09, this);
                }
                if (r0 != null) {
                    arrayList.add(r0);
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

    public ArrayList A0D(Set set, int i) {
        Cursor A09;
        ArrayList arrayList = new ArrayList(set);
        arrayList.add(String.valueOf(i));
        ArrayList arrayList2 = new ArrayList();
        AnonymousClass1M0 A03 = this.A00.get();
        try {
            C224114e r5 = A03.A02;
            int size = set.size();
            StringBuilder sb = new StringBuilder();
            sb.append("SELECT _id, mutation_index, mutation_value, mutation_version, operation, device_id, epoch, are_dependencies_missing FROM pending_mutations WHERE collection_name IN ");
            sb.append(AnonymousClass1M2.A00(size));
            sb.append(" OR ");
            sb.append("collection_name");
            sb.append(" IS NULL  ORDER BY ");
            sb.append("_id");
            sb.append(" ASC  LIMIT ?");
            A09 = r5.A09(sb.toString(), "PendingMutationsTable.buildSelectMutationsByCollections", (String[]) arrayList.toArray(C19430v1.A0N));
            while (A09.moveToNext()) {
                arrayList2.add(A00(A09, this));
            }
            A09.close();
            A03.close();
            return arrayList2;
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

    public HashSet A0E(Collection collection) {
        C1495671s B1k;
        boolean z;
        byte[] bArr;
        byte[] bArr2;
        HashSet hashSet = new HashSet();
        AnonymousClass1M0 A04 = this.A00.A04();
        try {
            B1k = A04.B1k();
            AnonymousClass6QI A0C = A04.A02.A0C("INSERT OR REPLACE INTO pending_mutations (mutation_index, mutation_value, mutation_version, operation, device_id, epoch, is_ready_to_sync, collection_name, are_dependencies_missing, mutation_name, chat_jid) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", "PendingMutationsTable.INSERT_OR_REPLACE");
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                C201669k5 r5 = (C201669k5) it.next();
                AnonymousClass1AE r6 = this.A01;
                String A07 = r5.A07();
                AnonymousClass00C.A0D(A07, 0);
                AnonymousClass1LZ A002 = r6.A00(A07);
                if (A002 != null) {
                    z = A002.A0H();
                } else {
                    z = false;
                }
                if (z) {
                    String str = r5.A06;
                    A0C.A03();
                    A0C.A06(1, r5.A06());
                    AnonymousClass8SS A05 = r5.A05();
                    if (A05 == null) {
                        bArr = null;
                    } else {
                        bArr = A05.A0o();
                    }
                    if (bArr != null) {
                        AnonymousClass8SS A052 = r5.A05();
                        if (A052 == null) {
                            bArr2 = null;
                        } else {
                            bArr2 = A052.A0o();
                        }
                        A0C.A07(2, bArr2);
                    } else {
                        A0C.A04(2);
                    }
                    A0C.A05(3, (long) r5.A03);
                    A0C.A07(4, r5.A05.A01);
                    C201539jo r0 = r5.A00;
                    if (r0 == null) {
                        A0C.A04(5);
                        A0C.A04(6);
                    } else {
                        A0C.A05(5, (long) r0.A00());
                        A0C.A05(6, (long) C203239na.A01(r5.A00.A00, 2));
                    }
                    long j = 0;
                    A0C.A05(7, 0);
                    A0C.A06(8, str);
                    if (r5.A09()) {
                        j = 1;
                    }
                    A0C.A05(9, j);
                    A0C.A06(10, r5.A07());
                    if (r5 instanceof C22936Aym) {
                        A0C.A06(11, ((C22936Aym) r5).getChatJid().getRawString());
                    } else {
                        A0C.A04(11);
                    }
                    hashSet.add(String.valueOf(A0C.A02()));
                }
            }
            B1k.A00();
            B1k.close();
            A04.close();
            return hashSet;
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

    public void A0F(C201669k5 r7) {
        C1495671s B1k;
        AnonymousClass1M0 A04 = this.A00.A04();
        try {
            B1k = A04.B1k();
            A07(A04.A02, new String[]{r7.A07});
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
        throw th;
    }

    public void A0G(Collection collection) {
        C1495671s B1k;
        AnonymousClass1M0 A04 = this.A00.A04();
        try {
            B1k = A04.B1k();
            A0I(A0E(collection));
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
        throw th;
    }

    public void A0H(Collection collection) {
        C1495671s B1k;
        AnonymousClass1M0 A04 = this.A00.A04();
        try {
            B1k = A04.B1k();
            A06(A04.A02, this, collection);
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
        throw th;
    }

    public boolean A0J() {
        Cursor A09;
        AnonymousClass1M0 A03 = this.A00.get();
        try {
            A09 = A03.A02.A09("SELECT _id FROM syncd_mutations LIMIT 1", "SyncdMutationsTable.SELECT_ANY_MUTATION", (String[]) null);
            boolean z = false;
            if (A09.moveToNext() && A09.getString(A09.getColumnIndexOrThrow("_id")) != null) {
                z = true;
            }
            A09.close();
            A03.close();
            return z;
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

    public boolean A0K(Set set) {
        C224114e BJK = this.A00.BJK();
        int size = set.size();
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT _id FROM syncd_mutations WHERE collection_name IN ");
        sb.append(AnonymousClass1M2.A00(size));
        sb.append(" LIMIT 1");
        Cursor A09 = BJK.A09(sb.toString(), "SyncdMutationsTable.buildSelectAnyMutationFromAnyCollection", (String[]) set.toArray(C19430v1.A0N));
        try {
            boolean z = false;
            if (A09.moveToNext() && A09.getString(A09.getColumnIndexOrThrow("_id")) != null) {
                z = true;
            }
            A09.close();
            return z;
        } catch (Throwable th) {
            th.addSuppressed(th);
            throw th;
        }
    }

    public AnonymousClass1AC(C19700wN r1, AnonymousClass18P r2, AnonymousClass1AE r3) {
        this.A02 = r1;
        this.A00 = r2;
        this.A01 = r3;
    }

    public void A0I(Set set) {
        C1495671s B1k;
        if (!set.isEmpty()) {
            AnonymousClass1M0 A04 = this.A00.A04();
            try {
                B1k = A04.B1k();
                Iterator it = new AnonymousClass72Z((String[]) set.toArray(C19430v1.A0N), 975).iterator();
                while (it.hasNext()) {
                    String[] strArr = (String[]) it.next();
                    C224114e r4 = A04.A02;
                    int length = strArr.length;
                    StringBuilder sb = new StringBuilder();
                    sb.append("UPDATE pending_mutations SET is_ready_to_sync = 1 WHERE _id IN ( ");
                    sb.append(TextUtils.join(",", Collections.nCopies(length, "?")));
                    sb.append(" )");
                    r4.A0E(sb.toString(), "SyncdMutationsStore.markPendingMutationsReadyToSync", strArr);
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
