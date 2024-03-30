package X;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.6ip  reason: invalid class name and case insensitive filesystem */
public class C138866ip implements C159907k7, AnonymousClass7e8, B0S {
    public static final String A09 = AnonymousClass6VD.A01("GreedyScheduler");
    public Boolean A00;
    public boolean A01;
    public AnonymousClass6KQ A02;
    public final Context A03;
    public final AnonymousClass6VR A04;
    public final C158937iU A05;
    public final Object A06;
    public final Set A07 = C36441kJ.A16();
    public final AnonymousClass6EO A08 = new AnonymousClass6EO();

    public boolean BJv() {
        return false;
    }

    public void B2R(String str) {
        Runnable runnable;
        Boolean bool = this.A00;
        if (bool == null) {
            bool = Boolean.valueOf(AnonymousClass6I1.A00(this.A03, this.A04.A02));
            this.A00 = bool;
        }
        if (!bool.booleanValue()) {
            AnonymousClass6VD.A00();
            Log.i(A09, "Ignoring schedule request in non-main process");
            return;
        }
        if (!this.A01) {
            this.A04.A03.A02(this);
            this.A01 = true;
        }
        AnonymousClass6VD A002 = AnonymousClass6VD.A00();
        String str2 = A09;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Cancelling work ID ");
        AnonymousClass6VD.A03(A002, str, str2, A0u);
        AnonymousClass6KQ r2 = this.A02;
        if (!(r2 == null || (runnable = (Runnable) r2.A02.remove(str)) == null)) {
            ((C138796ii) r2.A00).A00.removeCallbacks(runnable);
        }
        for (C114465hI A092 : this.A08.A02(str)) {
            this.A04.A09(A092);
        }
    }

    public void BX7(AnonymousClass69L r8, boolean z) {
        this.A08.A00(r8);
        synchronized (this.A06) {
            Set set = this.A07;
            Iterator it = set.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                AnonymousClass6QA r4 = (AnonymousClass6QA) it.next();
                if (C109445Xp.A00(r4).equals(r8)) {
                    AnonymousClass6VD.A02(AnonymousClass6VD.A00(), r8, "Stopping tracking for ", A09, AnonymousClass000.A0u());
                    set.remove(r4);
                    this.A05.BoB(set);
                    break;
                }
            }
        }
    }

    public void BpL(AnonymousClass6QA... r14) {
        AnonymousClass6VD A002;
        String str;
        StringBuilder A0u;
        String str2;
        Boolean bool = this.A00;
        if (bool == null) {
            bool = Boolean.valueOf(AnonymousClass6I1.A00(this.A03, this.A04.A02));
            this.A00 = bool;
        }
        if (!bool.booleanValue()) {
            AnonymousClass6VD.A00();
            Log.i(A09, "Ignoring schedule request in a secondary process");
            return;
        }
        if (!this.A01) {
            this.A04.A03.A02(this);
            this.A01 = true;
        }
        HashSet A16 = C36441kJ.A16();
        HashSet A162 = C36441kJ.A16();
        for (AnonymousClass6QA r10 : r14) {
            AnonymousClass69L A003 = C109445Xp.A00(r10);
            AnonymousClass6EO r4 = this.A08;
            if (!r4.A03(A003)) {
                long A042 = r10.A04();
                long currentTimeMillis = System.currentTimeMillis();
                if (r10.A0E == C023109s.A00) {
                    if (currentTimeMillis < A042) {
                        AnonymousClass6KQ r5 = this.A02;
                        if (r5 != null) {
                            Map map = r5.A02;
                            String str3 = r10.A0J;
                            Runnable runnable = (Runnable) map.remove(str3);
                            if (runnable != null) {
                                ((C138796ii) r5.A00).A00.removeCallbacks(runnable);
                            }
                            AnonymousClass75C r42 = new AnonymousClass75C((Object) r5, (Object) r10, 14);
                            map.put(str3, r42);
                            ((C138796ii) r5.A00).A00.postDelayed(r42, r10.A04() - System.currentTimeMillis());
                        }
                    } else if (!AnonymousClass00C.A0J(C132316Tb.A08, r10.A09)) {
                        int i = Build.VERSION.SDK_INT;
                        if (i >= 23) {
                            C132316Tb r1 = r10.A09;
                            if (r1.A00()) {
                                A002 = AnonymousClass6VD.A00();
                                str = A09;
                                A0u = AnonymousClass000.A0u();
                                A0u.append("Ignoring ");
                                A0u.append(r10);
                                str2 = ". Requires device idle.";
                            } else if (i >= 24 && C90514aH.A1a(r1.A03)) {
                                A002 = AnonymousClass6VD.A00();
                                str = A09;
                                A0u = AnonymousClass000.A0u();
                                A0u.append("Ignoring ");
                                A0u.append(r10);
                                str2 = ". Requires ContentUri triggers.";
                            }
                            AnonymousClass6VD.A03(A002, str2, str, A0u);
                        }
                        A16.add(r10);
                        A162.add(r10.A0J);
                    } else if (!r4.A03(C109445Xp.A00(r10))) {
                        AnonymousClass6VD A004 = AnonymousClass6VD.A00();
                        String str4 = A09;
                        StringBuilder A0u2 = AnonymousClass000.A0u();
                        A0u2.append("Starting work for ");
                        AnonymousClass6VD.A03(A004, r10.A0J, str4, A0u2);
                        AnonymousClass6VR r52 = this.A04;
                        r52.A06.B74(new C1503374w((Object) null, r52, r4.A01(C109445Xp.A00(r10)), 4));
                    }
                }
            }
        }
        synchronized (this.A06) {
            if (!A16.isEmpty()) {
                String join = TextUtils.join(",", A162);
                AnonymousClass6VD A005 = AnonymousClass6VD.A00();
                String str5 = A09;
                StringBuilder A0u3 = AnonymousClass000.A0u();
                A0u3.append("Starting tracking for ");
                AnonymousClass6VD.A03(A005, join, str5, A0u3);
                Set set = this.A07;
                set.addAll(A16);
                this.A05.BoB(set);
            }
        }
    }

    public C138866ip(Context context, C18850tv r4, AnonymousClass6VR r5, AnonymousClass9L0 r6) {
        this.A03 = context;
        this.A04 = r5;
        this.A05 = new C208209xr(this, r6);
        this.A02 = new AnonymousClass6KQ(r4.A03, this);
        this.A06 = C36441kJ.A11();
    }

    public void BR2(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass69L A002 = C109445Xp.A00((AnonymousClass6QA) it.next());
            AnonymousClass6EO r4 = this.A08;
            if (!r4.A03(A002)) {
                AnonymousClass6VD.A02(AnonymousClass6VD.A00(), A002, "Constraints met: Scheduling work ID ", A09, AnonymousClass000.A0u());
                AnonymousClass6VR r5 = this.A04;
                r5.A06.B74(new C1503374w((Object) null, r5, r4.A01(A002), 4));
            }
        }
    }

    public void BR3(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass69L A002 = C109445Xp.A00((AnonymousClass6QA) it.next());
            AnonymousClass6VD.A02(AnonymousClass6VD.A00(), A002, "Constraints not met: Cancelling work ID ", A09, AnonymousClass000.A0u());
            C114465hI A003 = this.A08.A00(A002);
            if (A003 != null) {
                this.A04.A09(A003);
            }
        }
    }
}
