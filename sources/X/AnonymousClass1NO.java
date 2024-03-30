package X;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.os.SystemClock;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: X.1NO  reason: invalid class name */
public class AnonymousClass1NO {
    public final C220412q A00;
    public final AnonymousClass12g A01;
    public final AnonymousClass1FD A02;
    public final C20650xu A03;
    public final AnonymousClass1DQ A04;
    public final AnonymousClass178 A05;
    public final AnonymousClass176 A06;
    public final AnonymousClass16J A07;
    public final C220612s A08;
    public final AnonymousClass12P A09;
    public final C19970wo A0A;
    public final C18820ts A0B;
    public final AnonymousClass163 A0C;
    public final C20500xf A0D;
    public final C21010yW A0E;

    public long A01(AnonymousClass11F r8) {
        Cursor A092;
        long j;
        AnonymousClass1M0 A042 = this.A09.get();
        try {
            A092 = A042.A02.A09("SELECT COUNT(*) as count FROM available_message_view WHERE chat_row_id = ? AND (message_type != '8') AND starred = 1 AND (message_type != '7')", "GET_STARRED_MESSAGE_COUNT_FOR_JID_SQL", new String[]{String.valueOf(this.A0C.A08(r8))});
            if (A092.moveToNext()) {
                j = A092.getLong(A092.getColumnIndexOrThrow("count"));
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("msgstore/countStarredMessages/db no message for ");
                sb.append(r8);
                Log.i(sb.toString());
                j = 0;
            }
            A092.close();
            A042.close();
            return j;
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

    public void A02(Collection collection) {
        C20500xf r4 = this.A0D;
        C21010yW r3 = this.A0E;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C65093Qs.A02(r4, r3, (AnonymousClass3T1) it.next(), 1);
        }
        A00(collection, true);
    }

    public boolean A04(Collection collection) {
        boolean z;
        long j;
        HashSet A042 = this.A02.A04();
        Iterator it = collection.iterator();
        while (true) {
            if (!it.hasNext()) {
                z = true;
                break;
            }
            AnonymousClass3T1 r1 = (AnonymousClass3T1) it.next();
            AnonymousClass11F r2 = r1.A1J.A00;
            if (A042.contains(r2)) {
                long j2 = r1.A1O;
                C220412q r12 = this.A00;
                C18740tg.A06(r2);
                C65073Qp A092 = r12.A09(r2, false);
                if (A092 == null) {
                    j = Long.MIN_VALUE;
                } else {
                    j = A092.A0F;
                }
                if (j2 < j) {
                    z = false;
                    break;
                }
            }
        }
        if (!z) {
            return false;
        }
        A00(collection, false);
        return true;
    }

    public AnonymousClass1NO(C19970wo r1, C18820ts r2, AnonymousClass163 r3, C220412q r4, AnonymousClass12g r5, AnonymousClass1FD r6, C20650xu r7, AnonymousClass1DQ r8, AnonymousClass178 r9, AnonymousClass176 r10, AnonymousClass16J r11, C220612s r12, AnonymousClass12P r13, C20500xf r14, C21010yW r15) {
        this.A0A = r1;
        this.A0C = r3;
        this.A00 = r4;
        this.A0E = r15;
        this.A0D = r14;
        this.A04 = r8;
        this.A0B = r2;
        this.A03 = r7;
        this.A05 = r9;
        this.A07 = r11;
        this.A01 = r5;
        this.A02 = r6;
        this.A06 = r10;
        this.A09 = r13;
        this.A08 = r12;
    }

    private void A00(Collection collection, boolean z) {
        boolean z2;
        AnonymousClass1M0 A052;
        C18740tg.A00();
        Collection<AnonymousClass3T1> collection2 = collection;
        Iterator it = collection2.iterator();
        while (true) {
            z2 = z;
            if (!it.hasNext()) {
                break;
            }
            ((AnonymousClass3T1) it.next()).A15 = z2;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        try {
            AnonymousClass1M0 A053 = this.A09.A05();
            try {
                C1495671s B1k = A053.B1k();
                try {
                    AnonymousClass178 r8 = this.A05;
                    HashSet hashSet = new HashSet();
                    AnonymousClass12P r6 = r8.A03;
                    AnonymousClass1M0 A054 = r6.A05();
                    try {
                        C1495671s B1k2 = A054.B1k();
                        try {
                            for (AnonymousClass3T1 r9 : collection2) {
                                A052 = r6.A05();
                                ContentValues contentValues = new ContentValues();
                                AnonymousClass3SW.A02(contentValues, "starred", z2);
                                C224114e r0 = A052.A02;
                                C64933Qa r92 = r9.A1J;
                                if (r0.A01(contentValues, "message", "chat_row_id = ? AND from_me = ? AND key_id = ?", "UPDATE_MESSAGE_STARRED_MAIN_SQL", AnonymousClass178.A04(r8, r92)) == 0) {
                                    StringBuilder sb = new StringBuilder();
                                    sb.append("MainMessageStore/updateMessageStarredStatusV2/update failed; message.key=");
                                    sb.append(r92);
                                    Log.e(sb.toString());
                                    A052.close();
                                } else {
                                    A052.close();
                                    hashSet.add(r92.A00);
                                }
                            }
                            B1k2.A00();
                            B1k2.close();
                            A054.close();
                            B1k.A00();
                            long A092 = this.A03.A09();
                            for (AnonymousClass3T1 r3 : collection2) {
                                this.A06.A09(new C71813hN(this, r3, A092, z2));
                            }
                            this.A04.A02.post(new C35291iS(this, collection2, 9, z2));
                            this.A01.A01("StarredMessageStore/updateMessageStarredStateInternal", SystemClock.uptimeMillis() - uptimeMillis);
                            B1k.close();
                            A053.close();
                            return;
                        } catch (Throwable th) {
                            B1k2.close();
                            throw th;
                        }
                        throw th;
                    } catch (Throwable th2) {
                        A054.close();
                        throw th2;
                    }
                } catch (Throwable th3) {
                    B1k.close();
                    throw th3;
                }
            } catch (Throwable th4) {
                A053.close();
                throw th4;
            }
        } catch (SQLiteDatabaseCorruptException e) {
            Log.e((Throwable) e);
            this.A08.A03();
        } catch (Throwable th5) {
            th4.addSuppressed(th5);
        }
    }

    public boolean A03(AnonymousClass11F r18, Long l) {
        AnonymousClass1M0 A052;
        long uptimeMillis = SystemClock.uptimeMillis();
        HashSet A042 = this.A02.A04();
        AnonymousClass11F r4 = r18;
        if (r18 == null) {
            if (!A042.isEmpty()) {
                return false;
            }
        } else if (A042.contains(r4)) {
            return false;
        }
        try {
            AnonymousClass1M0 A053 = this.A09.A05();
            try {
                C1495671s B1k = A053.B1k();
                try {
                    AnonymousClass178 r5 = this.A05;
                    A052 = r5.A03.A05();
                    ContentValues contentValues = new ContentValues(1);
                    contentValues.put("starred", 0);
                    String str = "starred = ? AND message_type != ?";
                    ArrayList arrayList = new ArrayList();
                    arrayList.add("1");
                    arrayList.add(String.valueOf(7));
                    if (r18 != null) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(str);
                        sb.append(" AND chat_row_id = ? ");
                        str = sb.toString();
                        arrayList.add(String.valueOf(r5.A01.A08(r4)));
                    }
                    Long l2 = l;
                    if (l != null) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(str);
                        sb2.append(" AND sort_id <= ?");
                        str = sb2.toString();
                        arrayList.add(String.valueOf(l2));
                    }
                    int A012 = A052.A02.A01(contentValues, "message", str, "unStarAllMessageV2/UPDATE_MESSAGE", (String[]) arrayList.toArray(C19430v1.A0N));
                    if (A012 != 0) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("MainMessageStore/unStarAllMessage/rowChanged=");
                        sb3.append(A012);
                        sb3.append(" jid=");
                        sb3.append(r4);
                        Log.i(sb3.toString());
                    }
                    A052.close();
                    B1k.A00();
                    this.A06.A09(new C71803hM(r4, l2));
                    this.A01.A01("StarredMessageStore/unstarAll", SystemClock.uptimeMillis() - uptimeMillis);
                    B1k.close();
                    A053.close();
                    this.A04.A02.post(new C35701j7(this, r4, 26));
                    return true;
                } catch (Throwable th) {
                    B1k.close();
                    throw th;
                }
                throw th;
            } catch (Throwable th2) {
                A053.close();
                throw th2;
            }
        } catch (SQLiteDatabaseCorruptException e) {
            Log.e((Throwable) e);
            this.A08.A03();
        } catch (Throwable th3) {
            th2.addSuppressed(th3);
        }
    }
}
