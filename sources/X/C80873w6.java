package X;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteFullException;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.3w6  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C80873w6 implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ C65073Qp A03;
    public final /* synthetic */ C220712t A04;
    public final /* synthetic */ AnonymousClass11F A05;
    public final /* synthetic */ boolean A06;
    public final /* synthetic */ boolean A07;
    public final /* synthetic */ boolean A08;
    public final /* synthetic */ boolean A09;

    public /* synthetic */ C80873w6(C65073Qp r1, C220712t r2, AnonymousClass11F r3, int i, long j, long j2, boolean z, boolean z2, boolean z3, boolean z4) {
        this.A04 = r2;
        this.A06 = z;
        this.A07 = z2;
        this.A05 = r3;
        this.A03 = r1;
        this.A01 = j;
        this.A08 = z3;
        this.A02 = j2;
        this.A09 = z4;
        this.A00 = i;
    }

    /* JADX INFO: finally extract failed */
    public final void run() {
        Set emptySet;
        AnonymousClass3T1 A0R;
        Cursor A092;
        C220712t r7 = this.A04;
        boolean z = this.A06;
        boolean z2 = this.A07;
        AnonymousClass11F r3 = this.A05;
        C65073Qp r2 = this.A03;
        long j = this.A01;
        boolean z3 = this.A08;
        long j2 = this.A02;
        boolean z4 = this.A09;
        int i = this.A00;
        if (!z || !z2) {
            emptySet = Collections.emptySet();
        } else {
            emptySet = ((C24731Do) r7.A01.get()).A04.A08(r3, true);
        }
        AnonymousClass005 r17 = r7.A01;
        ((C24731Do) r17.get()).A0C.A0G(r2);
        ((C24731Do) r17.get()).A04.A0Q(emptySet);
        AnonymousClass1DO r10 = ((C24731Do) r17.get()).A0M;
        C224214g r8 = new C224214g(false);
        r8.A04("msgstore/unsentreadreceiptsforjid");
        ArrayList A0I = AnonymousClass001.A0I();
        AnonymousClass1C5 r13 = r10.A06;
        if (r13.A03(r3)) {
            C65073Qp A093 = r10.A01.A09(r3, false);
            if (A093 == null) {
                C36321k7.A1L(r3, "msgstore/unsentreadreceiptsforjid/no chat for ", AnonymousClass000.A0u());
            } else if (A093.A0P != A093.A0R) {
                String[] strArr = new String[3];
                C36331k8.A19(r10.A00, r3, strArr, 0);
                C36351kA.A1V(strArr, 1, A093.A0Q);
                if (r13.A04(r3)) {
                    j = A093.A0S;
                }
                C36351kA.A1V(strArr, 2, j);
                try {
                    AnonymousClass1M0 A042 = r10.A04.get();
                    try {
                        A092 = A042.A02.A09(AnonymousClass2xD.A0N, "UNSENT_READ_RECEIPTS_FOR_JID_SQL", strArr);
                        while (A092.moveToNext()) {
                            AnonymousClass3T1 A012 = r10.A07.A01(A092, r3);
                            if (A012 != null && A012.A0I > 1415214000000L) {
                                A0I.add(A012);
                            }
                        }
                        A092.close();
                        A042.close();
                        StringBuilder A0u = AnonymousClass000.A0u();
                        C36341k9.A1N("msgstore/unsentreadreceiptsforjid ", A0u, A0I);
                        C36321k7.A0t(r8, " | time spent:", A0u);
                    } catch (Throwable th) {
                        A042.close();
                        throw th;
                    }
                } catch (IllegalStateException e) {
                    Log.i("msgstore/unsentreadreceiptsforjid/IllegalStateException ", e);
                } catch (SQLiteDatabaseCorruptException e2) {
                    Log.e((Throwable) e2);
                    r10.A03.A03();
                } catch (SQLiteFullException e3) {
                    r10.A02.A00(0);
                    throw e3;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
        }
        if (z3) {
            C26171Jd r5 = ((C24731Do) r17.get()).A0N;
            HashSet A16 = C36441kJ.A16();
            long A082 = r5.A05.A08(r3);
            AnonymousClass1M0 A043 = r5.A0C.get();
            try {
                for (Integer intValue : C65733Tg.A00) {
                    A16.addAll(C26171Jd.A04(A043, r5, intValue.intValue(), A082, j2, false));
                }
                A043.close();
                C26171Jd.A02(r5, A16);
            } catch (Throwable th3) {
                th.addSuppressed(th3);
                throw th;
            }
        }
        if (z4) {
            C26171Jd r52 = ((C24731Do) r17.get()).A0N;
            HashSet A162 = C36441kJ.A16();
            long A083 = r52.A05.A08(r3);
            AnonymousClass1M0 A044 = r52.A0C.get();
            try {
                A162.addAll(C26171Jd.A04(A044, r52, 74, A083, j2, true));
                A044.close();
                HashSet A163 = C36441kJ.A16();
                Iterator it = A162.iterator();
                while (it.hasNext()) {
                    AnonymousClass3T1 A0l = C36391kE.A0l(it);
                    if ((A0l instanceof AnonymousClass2bM) && (A0R = C36421kH.A0R(r52.A0J, ((AnonymousClass2bM) A0l).A01)) != null) {
                        A163.add(A0R);
                    }
                }
                A0I.addAll(A163);
            } catch (Throwable th4) {
                th = th4;
                A044.close();
                throw th;
            }
        }
        ((C24731Do) r17.get()).A0B.A01(r3, A0I, i);
        return;
        throw th;
    }
}
