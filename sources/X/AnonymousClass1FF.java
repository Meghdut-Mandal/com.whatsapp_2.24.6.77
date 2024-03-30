package X;

import android.database.Cursor;
import android.os.SystemClock;
import java.util.ArrayList;

/* renamed from: X.1FF  reason: invalid class name */
public class AnonymousClass1FF {
    public final AnonymousClass1A1 A00;
    public final C19970wo A01;
    public final AnonymousClass163 A02;
    public final AnonymousClass12g A03;
    public final AnonymousClass1F3 A04;
    public final AnonymousClass12P A05;

    public static ArrayList A00(AnonymousClass1FF r12, AnonymousClass11F r13, int i) {
        Cursor A09;
        C18740tg.A00();
        AnonymousClass1M0 A042 = r12.A05.get();
        try {
            long uptimeMillis = SystemClock.uptimeMillis();
            try {
                A09 = A042.A02.A09(C56782ws.A00, "GET_INTERACTIVE_MESSAGES_BY_CHAT_JID", new String[]{Integer.toString(i), Long.toString(r12.A02.A08(r13)), Long.toString(System.currentTimeMillis() - 2419200000L)});
                C69173d6 r1 = new C69173d6(r12, r13);
                ArrayList arrayList = new ArrayList();
                if (A09 != null) {
                    while (A09.moveToNext()) {
                        Object apply = r1.apply(A09);
                        if (apply != null) {
                            arrayList.add(apply);
                        }
                    }
                }
                if (A09 != null) {
                    A09.close();
                }
                r12.A03.A01("OrderMessageManager/getInteractiveMessages", SystemClock.uptimeMillis() - uptimeMillis);
                return arrayList;
            } catch (Throwable th) {
                r12.A03.A01("OrderMessageManager/getInteractiveMessages", SystemClock.uptimeMillis() - uptimeMillis);
                throw th;
            }
            throw th;
        } finally {
            try {
                A042.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    public AnonymousClass1FF(C19970wo r1, AnonymousClass163 r2, AnonymousClass12g r3, AnonymousClass1F3 r4, AnonymousClass12P r5, AnonymousClass1A1 r6) {
        this.A00 = r6;
        this.A04 = r4;
        this.A05 = r5;
        this.A01 = r1;
        this.A02 = r2;
        this.A03 = r3;
    }

    public AnonymousClass2bZ A01(String str) {
        Throwable th;
        AnonymousClass2bZ r0;
        C18740tg.A00();
        AnonymousClass1F3 r02 = this.A04;
        C18740tg.A00();
        AnonymousClass1M0 A042 = r02.A01.get();
        try {
            Cursor A09 = A042.A02.A09(C56782ws.A01, "GET_CHECKOUT_MESSAGES_BY_MESSAGE_ID", new String[]{str});
            A042.close();
            try {
                if (A09.moveToNext()) {
                    r0 = (AnonymousClass2bZ) this.A00.A00(A09);
                } else {
                    r0 = null;
                }
                A09.close();
                return r0;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            A042.close();
            throw th;
        }
    }

    public ArrayList A02() {
        Throwable th;
        C18740tg.A00();
        AnonymousClass1F3 r0 = this.A04;
        C18740tg.A00();
        AnonymousClass1M0 A042 = r0.A01.get();
        try {
            Cursor A09 = A042.A02.A09(C56782ws.A02, "GET_CHECKOUT_MESSAGES", (String[]) null);
            A042.close();
            try {
                C69163d5 r2 = new C69163d5(this);
                ArrayList arrayList = new ArrayList();
                if (A09 != null) {
                    while (A09.moveToNext()) {
                        Object apply = r2.apply(A09);
                        if (apply != null) {
                            arrayList.add(apply);
                        }
                    }
                }
                if (A09 != null) {
                    A09.close();
                }
                return arrayList;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            A042.close();
            throw th;
        }
    }
}
