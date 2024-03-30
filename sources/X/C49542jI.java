package X;

import android.database.Cursor;
import android.os.Message;
import android.os.SystemClock;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: X.2jI  reason: invalid class name and case insensitive filesystem */
public class C49542jI extends C132446Tt {
    public final long A00 = SystemClock.elapsedRealtime();
    public final AnonymousClass1X4 A01;
    public final WeakReference A02;
    public final boolean A03;
    public final boolean A04;

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        Set entrySet;
        Cursor A09;
        AnonymousClass1X4 r3 = this.A01;
        boolean z = this.A04;
        boolean z2 = this.A03;
        ArrayList A042 = r3.A0H.A04();
        HashSet A16 = C36441kJ.A16();
        Iterator it = A042.iterator();
        while (it.hasNext()) {
            AnonymousClass11F A0a = C36401kF.A0a(it);
            if (r3.A0U.A02(A0a) > 0) {
                r3.A0z.A0D(A0a, (AnonymousClass3T1) null);
                r3.A02.A0H(new C35621iz(r3, A0a, 15));
            }
            A16.addAll(r3.A0D.A09(A0a, !z, z2));
        }
        C20310xM r6 = r3.A0X;
        if (z) {
            Log.i("CoreMessageStore/clearallmsgs_excludestarred");
            ArrayList A0I = AnonymousClass001.A0I();
            AnonymousClass1M0 A043 = r6.A0c.get();
            try {
                A09 = A043.A02.A09("SELECT DISTINCT chat_row_id FROM message_view", "GET_CHATS_FROM_MESSAGES_SQL", (String[]) null);
                while (A09.moveToNext()) {
                    AnonymousClass11F A0B = r6.A0H.A0B(A09);
                    if (A0B != null && !(A0B instanceof C177528dw)) {
                        A0I.add(A0B);
                    }
                }
                A09.close();
                A043.close();
                Iterator it2 = A0I.iterator();
                while (it2.hasNext()) {
                    r6.A0d(C36401kF.A0a(it2), (Long) null, true, z2);
                }
                Message.obtain(r6.A0T.A01, 8).sendToTarget();
            } catch (Throwable th) {
                th = th;
                try {
                    A043.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        } else {
            Log.i("CoreMessageStore/clearallmsgs");
            C224214g r4 = new C224214g("msgstore/clearallmsgs");
            r6.A1H.clear();
            AnonymousClass1M0 A05 = r6.A0c.A05();
            try {
                C1495671s B1k = A05.B1k();
                try {
                    C20310xM.A06(r6, r4);
                    C220412q r1 = r6.A0I;
                    synchronized (r1) {
                        entrySet = C220412q.A00(r1).entrySet();
                    }
                    Iterator it3 = entrySet.iterator();
                    while (it3.hasNext()) {
                        Map.Entry A11 = AnonymousClass000.A11(it3);
                        C65073Qp r0 = (C65073Qp) A11.getValue();
                        r0.A0A();
                        AnonymousClass11F r5 = (AnonymousClass11F) A11.getKey();
                        if (r5 != null && r0.A00 == 1) {
                            r6.A0z(r5, (Long) null);
                        }
                    }
                    B1k.A00();
                    B1k.close();
                    A05.close();
                    C20690y0 r12 = r6.A05;
                    AnonymousClass6YY.A0Q(r12.A08().A0O);
                    AnonymousClass6YY.A0Q(r12.A08().A0G);
                    if (z2) {
                        C20310xM.A02(r6);
                    }
                    Message.obtain(r6.A0T.A01, 8).sendToTarget();
                    C36321k7.A0t(r4, "CoreMessageStore/clearallmsgs time spent:", AnonymousClass000.A0u());
                } catch (Throwable th3) {
                    B1k.close();
                    throw th3;
                }
            } catch (Throwable th4) {
                th = th4;
                A05.close();
                throw th;
            }
        }
        r3.A0D.A0Q(A16);
        C36421kH.A1C(r3);
        r3.A08.A01();
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.A00;
        if (elapsedRealtime >= 300) {
            return null;
        }
        SystemClock.sleep(300 - elapsedRealtime);
        return null;
        throw th;
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        C225014r r0 = (C225014r) this.A02.get();
        if (r0 != null) {
            r0.Bnv();
        }
    }

    public C49542jI(C225014r r3, AnonymousClass1X4 r4, boolean z, boolean z2) {
        this.A02 = AnonymousClass001.A0F(r3);
        this.A01 = r4;
        this.A04 = z;
        this.A03 = z2;
    }
}
