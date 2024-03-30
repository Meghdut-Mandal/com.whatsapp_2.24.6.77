package X;

import android.database.Cursor;
import android.text.TextUtils;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.3S1  reason: invalid class name */
public class AnonymousClass3S1 {
    public final C19460v5 A00;
    public final AnonymousClass179 A01;
    public final AnonymousClass1DF A02;
    public final C20810yC A03;
    public final C19630wG A04;
    public final C19420v0 A05;

    public static long A00(AnonymousClass4PB r10, AnonymousClass3S1 r11, AnonymousClass6VL r12, C224214g r13, List list, List list2, Map map, Set set) {
        long j = -1;
        Long l = null;
        while (true) {
            HashSet A16 = C36441kJ.A16();
            C81803xe r4 = (C81803xe) r10.apply(l);
            Long l2 = l;
            if (r4 != null) {
                while (r4.hasNext()) {
                    try {
                        AnonymousClass3IK r8 = (AnonymousClass3IK) r4.next();
                        if (r8 != null) {
                            String str = r8.A01;
                            if (str != null) {
                                AnonymousClass179 r3 = r11.A01;
                                File A07 = r3.A07(str);
                                if (!A07.isDirectory()) {
                                    String A052 = C34191gb.A05(r3, A07);
                                    if (!TextUtils.isEmpty(A052)) {
                                        C18740tg.A06(A052);
                                        if (!A16.contains(A07)) {
                                            Iterator it = list.iterator();
                                            while (true) {
                                                if (it.hasNext()) {
                                                    if (((AnonymousClass6FR) it.next()).A03.equals(A052)) {
                                                        break;
                                                    }
                                                } else {
                                                    Set set2 = set;
                                                    if (set2.contains(A052) || !map.containsKey(A052)) {
                                                        A16.add(A07);
                                                        set2.remove(A052);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            l2 = Long.valueOf(r8.A00);
                            j = Math.max(j, l2.longValue());
                        }
                    } catch (Throwable th) {
                        th.addSuppressed(th);
                        throw th;
                    }
                }
                r4.close();
            }
            if (!r12.A06(A16, list, list2)) {
                Log.e("gdrive/backup/quota/getMostRecentMediaList processing media files failed");
                r13.A01();
                throw new C101754yE();
            } else if (C1901797e.A00(l2, l)) {
                return j;
            } else {
                l = l2;
            }
        }
    }

    public static AnonymousClass00I A01(AnonymousClass4PB r13, AnonymousClass3S1 r14, C1273267v r15, long j) {
        long j2;
        long j3 = 0;
        long j4 = -1;
        Long l = null;
        while (true) {
            C81803xe r5 = (C81803xe) r13.apply(l);
            try {
                HashSet A16 = C36441kJ.A16();
                Long l2 = l;
                while (r5 != null && r5.hasNext()) {
                    AnonymousClass3IK r7 = (AnonymousClass3IK) r5.next();
                    if (r7 != null) {
                        String str = r7.A01;
                        long j5 = 0;
                        if (A16.add(str) && str != null) {
                            File A07 = r14.A01.A07(str);
                            if (!A07.isDirectory() && A07.exists()) {
                                String A022 = AnonymousClass6YN.A02(A07);
                                if (!r15.A01(A022)) {
                                    j2 = A07.length();
                                } else if (r15.A00(A07, A022)) {
                                    j2 = A07.length() + j;
                                }
                                j5 = 0 + j2;
                            }
                        }
                        j3 += j5;
                        l2 = Long.valueOf(r7.A00);
                        j4 = Math.max(j4, l2.longValue());
                    }
                }
                if (r5 != null) {
                    r5.close();
                }
                if (C1901797e.A00(l2, l)) {
                    return C36441kJ.A0W(Long.valueOf(j3), Long.valueOf(j4));
                }
                l = l2;
            } catch (Throwable th) {
                th.addSuppressed(th);
                throw th;
            }
        }
    }

    public long A02(Set set) {
        Cursor A09;
        long j;
        C20810yC r1 = this.A03;
        long A0B = C36441kJ.A0B(r1, 1239) * SearchActionVerificationClientService.MS_TO_NS;
        long A0B2 = C36441kJ.A0B(r1, 1240) * SearchActionVerificationClientService.MS_TO_NS;
        AnonymousClass1DF r2 = this.A02;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("mediamsgstore/getSizeOfSpecifiedTypesOfMediaFilesFromTimestamp for message types ");
        A0u.append(set);
        A0u.append(" with maxDocumentSize");
        A0u.append(A0B2);
        C36321k7.A1V(" and maxMediaSize", A0u, A0B);
        int size = set.size();
        C74003ku r5 = C74003ku.$redex_init_class;
        StringBuilder A0u2 = AnonymousClass000.A0u();
        A0u2.append("SELECT SUM (file_size) as total_file_size  FROM (");
        A0u2.append("SELECT file_size FROM message_media AS message_media JOIN available_message_view AS message ON message_media.message_row_id = message._id JOIN chat_view AS chat ON message.chat_row_id = chat._id WHERE ");
        C36351kA.A1O(" message.message_type IN ", A0u2, size);
        A0u2.append(" AND ");
        A0u2.append("(  CASE  WHEN  (message.message_type IN (26,9))");
        A0u2.append(" THEN message_media.file_size <= ");
        A0u2.append(A0B2);
        A0u2.append(" ELSE message_media.");
        A0u2.append("file_size");
        A0u2.append(" <= ");
        A0u2.append(A0B);
        A0u2.append(" END )");
        A0u2.append(" AND (message.from_me = 1 OR chat.group_type != 4)");
        A0u2.append(" GROUP BY message_media.");
        A0u2.append("file_hash");
        String A0q = AnonymousClass000.A0q(")", A0u2);
        ArrayList A0I = AnonymousClass001.A0I();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            A0I.add(String.valueOf(C36341k9.A0A(it)));
        }
        AnonymousClass1M0 A042 = r2.A08.get();
        try {
            A09 = A042.A02.A09(A0q, "GET_SIZE_OF_SPECIFIED_TYPES_OF_MEDIA_FILES", (String[]) A0I.toArray(AnonymousClass1DF.A0G));
            if (A09.moveToNext()) {
                j = C36351kA.A07(A09, "total_file_size");
            } else {
                j = 0;
            }
            A09.close();
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

    public AnonymousClass3S1(C19460v5 r1, AnonymousClass179 r2, C19630wG r3, C19420v0 r4, AnonymousClass1DF r5, C20810yC r6) {
        this.A03 = r6;
        this.A04 = r3;
        this.A01 = r2;
        this.A02 = r5;
        this.A05 = r4;
        this.A00 = r1;
    }

    public HashSet A03() {
        HashSet A16 = C36441kJ.A16();
        AnonymousClass000.A1F(A16, 2);
        AnonymousClass000.A1F(A16, 9);
        AnonymousClass000.A1F(A16, 26);
        AnonymousClass000.A1F(A16, 20);
        AnonymousClass000.A1F(A16, 13);
        AnonymousClass000.A1F(A16, 29);
        AnonymousClass000.A1F(A16, 1);
        AnonymousClass000.A1F(A16, 25);
        if (this.A05.A2E()) {
            AnonymousClass000.A1F(A16, 3);
            AnonymousClass000.A1F(A16, 28);
            AnonymousClass000.A1F(A16, 81);
        }
        return A16;
    }
}
