package X;

import com.whatsapp.util.Log;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.12t  reason: invalid class name and case insensitive filesystem */
public class C220712t {
    public final C220412q A00;
    public final AnonymousClass005 A01;
    public final C220612s A02;

    public void A08(AnonymousClass11F r21, Integer num, boolean z) {
        StringBuilder sb;
        String str;
        AnonymousClass005 r2 = this.A01;
        C24731Do r3 = (C24731Do) r2.get();
        AnonymousClass11F r7 = r21;
        boolean z2 = z;
        if (z) {
            r3.A02.A00(r7, 3);
            C20500xf r5 = ((C24731Do) r2.get()).A0Q;
            C19770wU r8 = ((C24731Do) r2.get()).A0W;
            C65093Qs.A01(((C24731Do) r2.get()).A0G, r5, ((C24731Do) r2.get()).A0R, r7, r8, 6, (Integer) null, 3);
        } else {
            C20500xf r13 = r3.A0Q;
            C19770wU r4 = ((C24731Do) r2.get()).A0W;
            C65093Qs.A01(((C24731Do) r2.get()).A0G, r13, ((C24731Do) r2.get()).A0R, r7, r4, 8, (Integer) null, 4);
        }
        ((C24731Do) r2.get()).A0W.Boy(new C35351iY(this, r7, num, 3, z2));
        C65073Qp A09 = this.A00.A09(r7, false);
        if (A09 == null) {
            sb = new StringBuilder();
            str = "msgstore/archive/no chat ";
        } else if (A09.A0i == z2) {
            sb = new StringBuilder();
            str = "msgstore/archive/nop ";
        } else {
            A01(this, z2);
            A09.A0i = z2;
            ((C24731Do) r2.get()).A0B.A00();
            ((C24731Do) r2.get()).A09.A01(new C35291iS(this, A09, 5, z2), 3);
            return;
        }
        sb.append(str);
        sb.append(r7);
        sb.append(" ");
        sb.append(z2);
        Log.w(sb.toString());
    }

    public static void A00(C220712t r19, AnonymousClass11F r20, AnonymousClass3T1 r21, int i, int i2, int i3, boolean z, boolean z2) {
        StringBuilder sb;
        C64933Qa r0;
        int i4;
        int i5;
        boolean z3;
        long j;
        C64933Qa r02;
        C220712t r9 = r19;
        AnonymousClass11F r14 = r20;
        C65073Qp A09 = r9.A00.A09(r14, false);
        AnonymousClass3T1 r2 = r21;
        if (A09 == null) {
            sb.append("msgstore/setchatseen/nochat/");
            sb.append(r14);
            sb.append("/");
            if (r21 != null) {
                r02 = r2.A1J;
            } else {
                r02 = null;
            }
            sb.append(r02);
            Log.i(sb.toString());
            return;
        }
        sb = new StringBuilder();
        sb.append("msgstore/setchatseen/");
        sb.append(r14);
        sb.append("/");
        sb.append(A09.A09());
        sb.append("/");
        if (r21 != null) {
            r0 = r2.A1J;
        } else {
            r0 = null;
        }
        sb.append(r0);
        sb.append("/");
        int i6 = i;
        sb.append(i6);
        Log.i(sb.toString());
        boolean z4 = true;
        boolean z5 = false;
        if (A09.A08 == -1) {
            z5 = true;
        }
        if (r2 != null) {
            AnonymousClass005 r10 = r9.A01;
            AnonymousClass17U r3 = ((C24731Do) r10.get()).A0K;
            AnonymousClass11F r6 = r2.A1J.A00;
            C18740tg.A06(r6);
            i4 = r3.A00(r6, r2.A1O);
            C26891Lx r32 = ((C24731Do) r10.get()).A0F;
            C18740tg.A06(r6);
            i5 = r32.A00(r6, r2.A1O);
        } else {
            i4 = 0;
            i5 = 0;
        }
        boolean A0H = A09.A0H(i6, i2, i4, i5);
        long j2 = A09.A0T;
        long j3 = A09.A0M;
        if (j3 > j2) {
            A09.A0T = j3;
            A09.A07 = 0;
            z3 = true;
        } else {
            z4 = A0H;
            z3 = false;
        }
        if (r2 == null || r2.A1N == 0) {
            j = 1;
        } else {
            j = r2.A1N;
        }
        long A022 = C66013Ui.A02(r2);
        long j4 = A09.A0Q;
        if (j == 1) {
            A022 = A09.A0O;
            long j5 = A09.A0V;
            if (A022 > j5) {
                j = A09.A0N;
            } else {
                A022 = j5;
                j = A09.A0U;
            }
        }
        if (j4 < A022 || z4 || A09.A0N == 0) {
            if (A09.A0N == 0) {
                AnonymousClass005 r33 = r9.A01;
                AnonymousClass17T r03 = ((C24731Do) r33.get()).A0J;
                AnonymousClass11F r22 = A09.A0q;
                A09.A0N = r03.A03(r22);
                A09.A0O = ((C24731Do) r33.get()).A0K.A06(r22);
                A09.A0c = null;
            }
            if (A09.A0L != 1) {
                A09.A0L = 1;
            }
            A09.A0P = j;
            A09.A0Q = A022;
            long j6 = j2;
            C220712t r13 = r9;
            C65073Qp r12 = A09;
            ((C24731Do) r9.A01.get()).A09.A01(new C80873w6(r12, r13, r14, i3, j4, j6, z, z5, z2, z3), 2);
        }
    }

    public static void A01(C220712t r0, boolean z) {
        if (z) {
            AnonymousClass005 r1 = r0.A01;
            if (((C24731Do) r1.get()).A06.A01() == 0 && !((C24731Do) r1.get()).A08.A2F()) {
                Log.i("chatMAnager/setChatArchived/Enabling archive2.0");
                ((C24731Do) r1.get()).A07.A03();
            }
        }
    }

    public static void A02(C220712t r5, boolean z) {
        boolean z2;
        synchronized (r5.A02) {
            C220412q r3 = r5.A00;
            synchronized (r3) {
                z2 = r3.A00;
            }
            if (!z2) {
                AnonymousClass14C r2 = new AnonymousClass14C(r5);
                synchronized (r3) {
                    C220412q.A00(r3);
                    boolean z3 = false;
                    if (r3.A05 == null) {
                        z3 = true;
                    }
                    C18740tg.A0C(z3);
                    r3.A05 = r2;
                    if (!z) {
                        C220412q.A00(r3);
                    }
                }
            }
        }
    }

    public Long A03(AnonymousClass11F r5) {
        AnonymousClass005 r3 = this.A01;
        Set A05 = ((C24731Do) r3.get()).A04.A05(r5, false);
        Long A0T = ((C24731Do) r3.get()).A0U.A0T(r5);
        AnonymousClass196 r0 = ((C24731Do) r3.get()).A04;
        if (A0T != null) {
            r0.A0Q(A05);
            return A0T;
        }
        r0.A0P(A05);
        return A0T;
    }

    public HashMap A04(Integer num, List list) {
        Set A0X = ((C24731Do) this.A01.get()).A0U.A0X();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass11F r1 = (AnonymousClass11F) it.next();
            if (!(r1 instanceof AnonymousClass146)) {
                A08(r1, num, true);
            }
        }
        HashMap hashMap = new HashMap();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            AnonymousClass11F r12 = (AnonymousClass11F) it2.next();
            if (!(r12 instanceof AnonymousClass146) && A0X.contains(r12)) {
                hashMap.put(r12, A03(r12));
            }
        }
        return hashMap;
    }

    public void A05(C52152oy r4, AnonymousClass11F r5, Runnable runnable, String str, boolean z) {
        ((C24731Do) this.A01.get()).A09.A01(new C80683vn(this, r4, r5, runnable, str, z), 6);
    }

    public void A06(AnonymousClass11F r5) {
        C65073Qp A09 = this.A00.A09(r5, false);
        if (A09 == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("msgstore/reset-show-group-description/no chat ");
            sb.append(r5);
            Log.w(sb.toString());
        } else if (!A09.A0p) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("msgstore/reset-show-group-description/nop ");
            sb2.append(r5);
            Log.i(sb2.toString());
        } else {
            A09.A0p = false;
            ((C24731Do) this.A01.get()).A09.A01(new C35681j5(this, A09, 40), 5);
        }
    }

    public void A07(AnonymousClass11F r4, int i, boolean z) {
        if (!z) {
            StringBuilder sb = new StringBuilder();
            sb.append("ChatManager/updatePushRecordingButtonMode skipped, enabled=");
            sb.append(z);
            Log.i(sb.toString());
            return;
        }
        ((C24731Do) this.A01.get()).A0W.Bp6(new C35261iP((Object) this, i, 16, (Object) r4), "ChatManager/updatePushRecordingButtonMode");
    }

    public void A09(AnonymousClass3T1 r4) {
        ((C24731Do) this.A01.get()).A09.A01(new C35681j5(this, r4, 41), 20);
    }

    public boolean A0A(AnonymousClass11F r8) {
        C65073Qp A09 = this.A00.A09(r8, false);
        if (A09 == null) {
            return false;
        }
        if (A09.A08 == 0 && A09.A09 == 0 && A09.A0Q == Math.max(A09.A0O, A09.A0V) && A09.A0M <= A09.A0T) {
            return false;
        }
        return true;
    }

    public C220712t(C220412q r1, C220612s r2, AnonymousClass005 r3) {
        this.A00 = r1;
        this.A02 = r2;
        this.A01 = r3;
    }
}
