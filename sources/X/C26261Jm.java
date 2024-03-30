package X;

import android.database.Cursor;
import android.os.ConditionVariable;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.1Jm  reason: invalid class name and case insensitive filesystem */
public class C26261Jm {
    public final C19730wQ A00;
    public final C220412q A01;
    public final C20310xM A02;
    public final AnonymousClass17X A03;
    public final AnonymousClass12P A04;
    public final C24911Eg A05;
    public final AnonymousClass12O A06;
    public final C26281Jo A07;
    public final C20170x8 A08;
    public final C20810yC A09;
    public final C26271Jn A0A;
    public final C000100b A0B;
    public final Object A0C = new Object();
    public final C19700wN A0D;
    public final C219712j A0E;

    public static C180858mX A00(C26261Jm r12, AnonymousClass11F r13, AnonymousClass3T1 r14, boolean z) {
        long j;
        Cursor A032;
        long j2 = r14.A1N;
        if (r13 != null) {
            j = r12.A0E.A07(r13);
        } else {
            j = -1;
        }
        AnonymousClass1M0 A042 = r12.A04.get();
        try {
            C20170x8 r4 = r12.A08;
            A032 = r4.A03(A042, 67, j2, j, z);
            if (A032.moveToNext()) {
                HashMap A012 = C65733Tg.A01(A032, 67);
                AnonymousClass2bM A052 = r4.A05(A032, A012);
                if (!(A052 instanceof C180858mX)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("MessageAddOnPollVoteManager/getMessageAddOnPollVoteForMessageAndSender unexpected fmessage ");
                    sb.append(A052);
                    Log.e(sb.toString());
                } else {
                    C180858mX r42 = (C180858mX) A052;
                    r42.A1c(A032, r12.A0E, A012);
                    ArrayList A002 = r12.A07.A00(r42.A1N);
                    List list = r42.A06;
                    list.clear();
                    list.addAll(A002);
                    r42.A04 = new C195759Vv(r14.A0J(), r14.A1J);
                    A032.close();
                    A042.close();
                    return r42;
                }
            }
            A032.close();
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

    public static void A01(AnonymousClass2bS r9, C180858mX r10) {
        ArrayList arrayList;
        List<AnonymousClass3PS> list = r9.A05;
        List list2 = r10.A06;
        if (list2.size() == 0) {
            arrayList = new ArrayList();
        } else {
            HashSet hashSet = new HashSet();
            for (AnonymousClass3PS r5 : list) {
                if (list2.contains(Long.valueOf(r5.A01)) && r5.A01 != -1) {
                    hashSet.add(r5.A02);
                }
            }
            arrayList = new ArrayList(hashSet);
        }
        r10.A01 = arrayList;
        r10.A05 = r9.A1b;
    }

    public static void A02(AnonymousClass2bS r7, List list, List list2, List list3) {
        if (r7.A1J.A00 instanceof C28981Uw) {
            HashSet hashSet = new HashSet();
            HashSet hashSet2 = new HashSet();
            for (Object next : list2) {
                if (list3 == null || !list3.contains(next)) {
                    hashSet.add(next);
                }
            }
            if (list3 != null) {
                for (Object next2 : list3) {
                    if (!list2.contains(next2)) {
                        hashSet2.add(next2);
                    }
                }
            }
            for (AnonymousClass3PS r4 : r7.A05) {
                if (hashSet.contains(Long.valueOf(r4.A01))) {
                    r4.A00++;
                }
                if (hashSet2.contains(Long.valueOf(r4.A01))) {
                    r4.A00--;
                }
            }
            r7.A04 = null;
            r7.A1X(list);
            return;
        }
        r7.A04 = list;
        for (AnonymousClass3PS r6 : r7.A05) {
            int i = 0;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((C180858mX) ((AnonymousClass2bM) it.next())).A06.contains(Long.valueOf(r6.A01))) {
                    i++;
                }
            }
            r6.A00 = i;
        }
    }

    public C26261Jm(C19700wN r2, C19730wQ r3, C220412q r4, C20310xM r5, AnonymousClass17X r6, C219712j r7, AnonymousClass12P r8, C24911Eg r9, AnonymousClass12O r10, C26281Jo r11, C20170x8 r12, C20810yC r13, C26271Jn r14, C000100b r15) {
        ConditionVariable conditionVariable = C18740tg.A00;
        this.A09 = r13;
        this.A0E = r7;
        this.A0D = r2;
        this.A00 = r3;
        this.A01 = r4;
        this.A0B = r15;
        this.A06 = r10;
        this.A05 = r9;
        this.A08 = r12;
        this.A04 = r8;
        this.A0A = r14;
        this.A02 = r5;
        this.A03 = r6;
        this.A07 = r11;
    }
}
