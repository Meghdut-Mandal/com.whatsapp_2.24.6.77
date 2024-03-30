package X;

import android.content.ContentValues;
import android.database.Cursor;
import android.os.SystemClock;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.3Si  reason: invalid class name and case insensitive filesystem */
public class C65503Si {
    public final C229516p A00;
    public final C19420v0 A01;
    public final C220412q A02;
    public final AnonymousClass1DG A03;
    public final C64413Nw A04;
    public final C65343Rr A05;
    public final AnonymousClass005 A06;
    public final CopyOnWriteArrayList A07 = new CopyOnWriteArrayList();
    public final AnonymousClass16D A08;
    public final C19970wo A09;
    public final AnonymousClass163 A0A;

    public static boolean A02(C80193v0 r5) {
        C66753Xe r52 = r5.A00;
        if (r52.A0I == 0 && r52.A06 == 0) {
            return true;
        }
        return false;
    }

    public C65503Si(AnonymousClass16D r2, C229516p r3, C19970wo r4, C19420v0 r5, AnonymousClass163 r6, C220412q r7, AnonymousClass1DG r8, C64413Nw r9, AnonymousClass199 r10, AnonymousClass005 r11) {
        this.A09 = r4;
        this.A0A = r6;
        this.A02 = r7;
        this.A08 = r2;
        this.A01 = r5;
        this.A06 = r11;
        this.A03 = r8;
        this.A00 = r3;
        this.A04 = r9;
        this.A05 = new C65343Rr(r4, r10);
    }

    private ArrayList A00(Set set) {
        ArrayList A0I = AnonymousClass001.A0I();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            AnonymousClass11F A0a = C36401kF.A0a(it);
            if (this.A08.A08(A0a) != null) {
                C66753Xe A002 = AnonymousClass1DG.A00(this.A03, A0a);
                AnonymousClass00C.A0D(A0a, 1);
                A0I.add(new C80193v0(A002, A0a, A0a.getRawString()));
            }
        }
        return A0I;
    }

    public static void A01(C02680Bk r12, C65503Si r13, AtomicBoolean atomicBoolean) {
        Throwable th;
        Throwable th2;
        int i;
        Cursor A032;
        AnonymousClass11F r8;
        SystemClock.elapsedRealtime();
        ArrayList A0I = AnonymousClass001.A0I();
        HashSet A16 = C36441kJ.A16();
        C220412q r4 = r13.A02;
        HashSet hashSet = new HashSet(r4.A0G());
        C229516p r6 = r13.A00;
        Cursor A0M = r6.A0M();
        try {
            if (A0M.getCount() != 0) {
                HashSet hashSet2 = new HashSet(hashSet);
                while (A0M.moveToNext()) {
                    AnonymousClass11F A0N = C36421kH.A0N(A0M.getString(0));
                    if (A0N != null) {
                        hashSet2.remove(A0N);
                    }
                }
                ArrayList A15 = C36441kJ.A15(hashSet2);
                A15.size();
                if (!A15.isEmpty()) {
                    r6.A0Y(A15);
                }
                A0M.close();
                A0M = r6.A0M();
            } else {
                A0M.close();
                C64413Nw r7 = r13.A04;
                long A082 = r7.A00.A08(C177528dw.A00);
                AnonymousClass12P r72 = r7.A04;
                r72.A06();
                C224114e BGW = r72.A02.BGW();
                String[] A1R = C36441kJ.A1R();
                C36401kF.A1T(A1R, 0, A082);
                A0M = BGW.A09("SELECT message.chat_row_id AS chat_row_id, sum(file_size) AS media_sum FROM message_media message_media JOIN message_view message ON message_media.message_row_id = message._id WHERE message.message_type IN ('0','1','2','3','4','5','9','13','14') AND message.chat_row_id != ? GROUP BY message.chat_row_id ORDER BY media_sum DESC", "GET_CONTACTS_SORTED_LIST_BY_MEDIA_SIZE_SQL", A1R);
            }
            A0M.getCount();
            if (A0M.moveToFirst()) {
                boolean z = false;
                do {
                    if (r12 != null) {
                        r12.A04();
                    }
                    if (atomicBoolean.get()) {
                        A0M.close();
                        return;
                    }
                    if (A0I.size() > 16 && !z) {
                        SystemClock.elapsedRealtime();
                        z = true;
                    }
                    int columnIndex = A0M.getColumnIndex("chat_row_id");
                    if (columnIndex > -1) {
                        r8 = r13.A0A.A0A(A0M.getLong(columnIndex));
                    } else {
                        r8 = C36421kH.A0N(C36341k9.A0f(A0M, "jid"));
                    }
                    if (r8 != null) {
                        if (!r4.A0Q(r8) || C36411kG.A0a(r13.A06).A03) {
                            Iterator it = A0I.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    if (((C80193v0) it.next()).A01().equals(r8)) {
                                        break;
                                    }
                                } else {
                                    Iterator it2 = A16.iterator();
                                    while (true) {
                                        if (it2.hasNext()) {
                                            if (((Jid) it2.next()).equals(r8)) {
                                                break;
                                            }
                                        } else {
                                            A16.add(r8);
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if ((A0I.size() < 16 && A16.size() >= 2) || (A0I.size() >= 16 && A16.size() >= 5)) {
                        ArrayList A002 = r13.A00(A16);
                        A16.clear();
                        if (!A002.isEmpty()) {
                            A0I.addAll(A002);
                            A0I.size();
                            C588431g r9 = new C588431g(A002);
                            Iterator it3 = r13.A07.iterator();
                            while (it3.hasNext()) {
                                ((C88764Ty) it3.next()).BTM(r9);
                            }
                            for (int i2 = 0; i2 < A002.size(); i2++) {
                                r6.A0R((C80193v0) A002.get(i2));
                            }
                        }
                    }
                } while (A0M.moveToNext());
                if (A16.size() > 0) {
                    A0I.addAll(r13.A00(A16));
                }
                Collections.sort(A0I);
            }
            A0M.close();
            try {
                C229716r r10 = r6.A00;
                AnonymousClass1M0 A042 = r10.A04();
                try {
                    C1495671s B1k = A042.B1k();
                    try {
                        Cursor A0M2 = r6.A0M();
                        try {
                            HashSet hashSet3 = new HashSet(hashSet);
                            while (A0M2.moveToNext()) {
                                AnonymousClass11F A0N2 = C36421kH.A0N(A0M2.getString(0));
                                if (A0N2 != null) {
                                    hashSet3.remove(A0N2);
                                }
                            }
                            ArrayList A152 = C36441kJ.A15(hashSet3);
                            r6.A0Y(A152);
                            A0M2.close();
                            if (A152.size() == 0) {
                                AnonymousClass1M0 A033 = r10.get();
                                try {
                                    Cursor A034 = C229416o.A03(A033, "SELECT COUNT(*) as count FROM wa_contact_storage_usage", "CONTACT_STORAGE_USAGES", (String[]) null);
                                    try {
                                        if (A034.moveToNext()) {
                                            i = C36351kA.A03(A034, "count");
                                        } else {
                                            i = 0;
                                        }
                                        A034.close();
                                        A033.close();
                                        if (i != hashSet.size()) {
                                            HashSet A162 = C36441kJ.A16();
                                            HashSet hashSet4 = new HashSet(hashSet);
                                            A033 = r10.A04();
                                            B1k = A033.B1k();
                                            try {
                                                A032 = C229416o.A03(A033, "SELECT jid FROM wa_contact_storage_usage", "CONTACT_STORAGE_USAGES", (String[]) null);
                                                int columnIndexOrThrow = A032.getColumnIndexOrThrow("jid");
                                                while (A032.moveToNext()) {
                                                    AnonymousClass11F A0N3 = C36421kH.A0N(A032.getString(columnIndexOrThrow));
                                                    if (A0N3 == null) {
                                                        Log.w("contact-manager-database/remove-copies-and-not-wa-contacts/jid is null or invalid!");
                                                    } else if (hashSet4.contains(A0N3)) {
                                                        hashSet4.remove(A0N3);
                                                    } else {
                                                        A162.add(A0N3);
                                                    }
                                                }
                                                A032.close();
                                                Iterator it4 = A162.iterator();
                                                while (it4.hasNext()) {
                                                    AnonymousClass11F A0a = C36401kF.A0a(it4);
                                                    String[] A1R2 = C36441kJ.A1R();
                                                    A1R2[0] = A0a.getRawString();
                                                    C229416o.A02(A033, "wa_contact_storage_usage", "jid = ? ", A1R2);
                                                }
                                                B1k.A00();
                                                B1k.close();
                                                A033.close();
                                            } catch (Throwable th3) {
                                                th2 = th3;
                                                throw th2;
                                            }
                                        }
                                    } catch (Throwable th4) {
                                    }
                                } catch (Throwable th5) {
                                    th = th5;
                                    A033.close();
                                    throw th;
                                }
                            }
                            ContentValues A0E = C36441kJ.A0E();
                            Iterator it5 = A0I.iterator();
                            while (it5.hasNext()) {
                                C80193v0 r0 = (C80193v0) it5.next();
                                AnonymousClass11F A012 = r0.A01();
                                C66753Xe r3 = r0.A00;
                                long j = r3.A0I;
                                int i3 = r3.A06;
                                A0E.clear();
                                A0E.put("conversation_size", Long.valueOf(j));
                                A0E.put("conversation_message_count", Integer.valueOf(i3));
                                String[] A1R3 = C36441kJ.A1R();
                                A1R3[0] = A012.getRawString();
                                C229416o.A01(A0E, A042, "wa_contact_storage_usage", "jid = ?", A1R3);
                            }
                            B1k.A00();
                            B1k.close();
                            A042.close();
                            ArrayList A0I2 = AnonymousClass001.A0I();
                            Iterator it6 = A0I.iterator();
                            while (it6.hasNext()) {
                                C80193v0 r1 = (C80193v0) it6.next();
                                if (r1 != null && !A02(r1)) {
                                    if (C36411kG.A0a(r13.A06).A03 || !r4.A0Q(r1.A01())) {
                                        A0I2.add(r1);
                                    }
                                }
                            }
                            if (!atomicBoolean.get()) {
                                C65343Rr.A00(r13.A05, "STORAGE_USAGE_CHAT_LIST_CACHE_TIME");
                                C588331f r2 = new C588331f(A0I2);
                                Iterator it7 = r13.A07.iterator();
                                while (it7.hasNext()) {
                                    ((C88764Ty) it7.next()).BTL(r2);
                                }
                                SystemClock.elapsedRealtime();
                                return;
                            }
                            return;
                            throw th;
                        } catch (Throwable th6) {
                            th.addSuppressed(th6);
                        }
                    } finally {
                        B1k.close();
                    }
                } catch (Throwable th7) {
                    A042.close();
                    throw th7;
                }
            } catch (IllegalArgumentException e) {
                C18740tg.A08("contact-mgr-db/unable to update batch on storage usage table", e);
            } catch (Throwable th8) {
                th7.addSuppressed(th8);
            }
        } catch (Throwable th9) {
            th.addSuppressed(th9);
            throw th;
        }
    }
}
