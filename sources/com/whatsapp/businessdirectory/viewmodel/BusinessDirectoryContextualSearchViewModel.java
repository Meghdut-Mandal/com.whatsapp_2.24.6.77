package com.whatsapp.businessdirectory.viewmodel;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass00C;
import X.AnonymousClass00S;
import X.AnonymousClass08M;
import X.AnonymousClass08S;
import X.AnonymousClass08X;
import X.AnonymousClass17Y;
import X.AnonymousClass1QW;
import X.AnonymousClass4PO;
import X.AnonymousClass51O;
import X.AnonymousClass593;
import X.AnonymousClass5DR;
import X.AnonymousClass5E1;
import X.AnonymousClass5EF;
import X.AnonymousClass5EH;
import X.AnonymousClass5EM;
import X.AnonymousClass5EO;
import X.AnonymousClass5EP;
import X.AnonymousClass6MI;
import X.AnonymousClass6P1;
import X.AnonymousClass6PX;
import X.AnonymousClass6QG;
import X.AnonymousClass6QK;
import X.AnonymousClass6SI;
import X.AnonymousClass6YJ;
import X.AnonymousClass7g3;
import X.AnonymousClass7gA;
import X.AnonymousClass7gB;
import X.AnonymousClass7gD;
import X.C001600r;
import X.C001700s;
import X.C105175Dq;
import X.C105225Dv;
import X.C105245Dx;
import X.C110205aI;
import X.C119215pS;
import X.C119295pa;
import X.C119305pb;
import X.C121365t1;
import X.C122335ug;
import X.C125025zC;
import X.C1254960a;
import X.C1260462i;
import X.C1260562j;
import X.C1261662u;
import X.C1277269k;
import X.C128536Cq;
import X.C128836Du;
import X.C129006Eo;
import X.C130196Kc;
import X.C132296Sz;
import X.C132406Tm;
import X.C134986bw;
import X.C135126cB;
import X.C142606p9;
import X.C142616pA;
import X.C142646pD;
import X.C143466qb;
import X.C143516qg;
import X.C143606qp;
import X.C143676qw;
import X.C143716r0;
import X.C144416s9;
import X.C145056tH;
import X.C145896uh;
import X.C1497172m;
import X.C1502274l;
import X.C155247Vi;
import X.C159357jE;
import X.C159377jG;
import X.C160627lJ;
import X.C160727lU;
import X.C164167rN;
import X.C164547rz;
import X.C164557s0;
import X.C164807sP;
import X.C165077sq;
import X.C165087sr;
import X.C165157sy;
import X.C19970wo;
import X.C20810yC;
import X.C28201Rs;
import X.C33191es;
import X.C36341k9;
import X.C36401kF;
import X.C36431kI;
import X.C36441kJ;
import X.C48892iE;
import X.C90464aC;
import X.C90474aD;
import X.C90494aF;
import X.C90504aG;
import X.C90514aH;
import X.C90524aI;
import X.C95434kv;
import android.app.Application;
import android.os.Handler;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class BusinessDirectoryContextualSearchViewModel extends AnonymousClass08X implements C160727lU, C160627lJ, C159377jG, C159357jE, AnonymousClass4PO, AnonymousClass7gD {
    public int A00;
    public int A01;
    public C134986bw A02;
    public Runnable A03;
    public Runnable A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public int A08;
    public int A09;
    public int A0A;
    public final Handler A0B;
    public final Handler A0C;
    public final C001600r A0D;
    public final AnonymousClass08S A0E;
    public final AnonymousClass08S A0F;
    public final C001700s A0G;
    public final C001700s A0H;
    public final AnonymousClass08M A0I;
    public final AnonymousClass17Y A0J;
    public final C121365t1 A0K;
    public final C142616pA A0L;
    public final C142646pD A0M;
    public final C145896uh A0N;
    public final C129006Eo A0O;
    public final C1260562j A0P;
    public final AnonymousClass6MI A0Q;
    public final C143516qg A0R;
    public final AnonymousClass6PX A0S;
    public final AnonymousClass6QK A0T;
    public final C119295pa A0U;
    public final C143466qb A0V;
    public final C19970wo A0W;
    public final AnonymousClass1QW A0X;
    public final C33191es A0Y;
    public final C28201Rs A0Z;
    public final C28201Rs A0a;
    public final C28201Rs A0b;
    public final C28201Rs A0c;
    public final C28201Rs A0d = C36441kJ.A0t();
    public final LinkedList A0e;
    public final AnonymousClass00S A0f;
    public final C1254960a A0g;
    public final AnonymousClass6SI A0h;
    public final AnonymousClass5DR A0i;
    public final C132296Sz A0j;
    public final C110205aI A0k;
    public final C142606p9 A0l;

    public void A0S() {
        C119215pS r3;
        if (this.A01 == 1) {
            C143516qg r2 = this.A0R;
            C001700s r32 = r2.A06;
            C125025zC r4 = (C125025zC) r32.A04();
            if (r2.A09.A03 != 9 && r4 != null && r4.A0F != null) {
                r2.A0A();
                if (AnonymousClass6MI.A00(A02(this)) && !r4.A0H) {
                    String str = r4.A0F;
                    int i = this.A01;
                    AnonymousClass6QG A022 = A02(this);
                    if (AnonymousClass6MI.A00(A02(this))) {
                        C125025zC r0 = (C125025zC) r32.A04();
                        if (r0 != null) {
                            r3 = r0.A04;
                        } else {
                            r3 = new C119215pS(150, (String) null);
                        }
                    } else {
                        r3 = null;
                    }
                    A09(r3, this.A0T.A02(), A022, this, str, r2.A0K, i, 1);
                }
            }
        }
    }

    public void BaE() {
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BusinessDirectoryContextualSearchViewModel(Application application, AnonymousClass08M r19, C1254960a r20, AnonymousClass17Y r21, C121365t1 r22, C142616pA r23, C142646pD r24, C145896uh r25, AnonymousClass6SI r26, AnonymousClass5DR r27, C129006Eo r28, C132296Sz r29, C1260562j r30, AnonymousClass6MI r31, C110205aI r32, AnonymousClass7g3 r33, AnonymousClass6PX r34, AnonymousClass7gA r35, C119295pa r36, AnonymousClass7gB r37, C19970wo r38, AnonymousClass1QW r39, C142606p9 r40, C33191es r41) {
        super(application);
        AnonymousClass08S r4 = new AnonymousClass08S();
        this.A0F = r4;
        this.A0c = C36441kJ.A0t();
        this.A0Z = C36441kJ.A0t();
        this.A0a = C36441kJ.A0t();
        AnonymousClass08S r2 = new AnonymousClass08S();
        this.A0E = r2;
        this.A03 = new C1497172m(this, 29);
        this.A0f = new C165077sq(this, 3);
        this.A0W = r38;
        this.A0J = r21;
        AnonymousClass08M r9 = r19;
        this.A0I = r9;
        this.A0C = new Handler();
        this.A0e = C90524aI.A0l();
        this.A0X = r39;
        this.A0B = new Handler();
        this.A0Q = r31;
        AnonymousClass6PX r3 = r34;
        this.A0S = r3;
        this.A0b = C36441kJ.A0t();
        C145896uh r6 = r25;
        this.A0N = r6;
        C121365t1 r1 = r22;
        this.A0K = r1;
        this.A0l = r40;
        this.A0k = r32;
        this.A0O = r28;
        AnonymousClass6SI r5 = r26;
        this.A0h = r5;
        this.A0i = r27;
        this.A0Y = r41;
        this.A0P = r30;
        this.A0j = r29;
        this.A0L = r23;
        this.A0M = r24;
        r6.A0E = this;
        r5.A00 = this;
        boolean z = false;
        this.A01 = 0;
        AnonymousClass6QK B3u = r35.B3u(new C164557s0(this, 0));
        this.A0T = B3u;
        this.A0g = r20;
        AnonymousClass00C.A0D(r9, 0);
        Map map = r9.A03;
        r1.A00 = C36431kI.A1A("saved_state_query_id", map);
        this.A05 = map.get("saved_search_session_started") != null ? AnonymousClass000.A1X(map.get("saved_search_session_started")) : z;
        B3u.A09(r9);
        C143466qb B4H = r37.B4H(this, this, this);
        this.A0V = B4H;
        C143516qg B4C = r33.B4C(new C164547rz(this, 0), new C164807sP(this, 0), C143606qp.A00, new C164167rN(this, 0), B3u, B4H, this, this, 0);
        this.A0R = B4C;
        C119295pa r7 = r36;
        this.A0U = r7;
        C001700s r12 = r7.A00;
        this.A0D = r12;
        this.A06 = true;
        r6.A0C = r7;
        C165157sy.A01(r12, r4, this, 43);
        C165157sy.A01(B4C.A06, r4, this, 42);
        C165157sy.A01(B4H.A00, r4, this, 44);
        this.A0G = r3.A02;
        this.A0H = r3.A01;
        C165157sy.A01(r3.A00, r2, this, 45);
    }

    public static int A01(BusinessDirectoryContextualSearchViewModel businessDirectoryContextualSearchViewModel, String str) {
        C20810yC r1 = businessDirectoryContextualSearchViewModel.A0X.A03;
        if (C90494aF.A1X(r1) && r1.A0E(2762) && str.length() >= 2) {
            AnonymousClass6QK r12 = businessDirectoryContextualSearchViewModel.A0T;
            if (!r12.A0B() || r12.A02) {
                return 1;
            }
            return 0;
        }
        return 1;
    }

    public static AnonymousClass6QG A02(BusinessDirectoryContextualSearchViewModel businessDirectoryContextualSearchViewModel) {
        AnonymousClass6QG A012 = businessDirectoryContextualSearchViewModel.A0O.A01();
        if (A012 != null) {
            return A012;
        }
        C132296Sz r1 = businessDirectoryContextualSearchViewModel.A0j;
        AnonymousClass6QG r0 = r1.A00;
        if (r0 == null) {
            return C132296Sz.A00(r1);
        }
        return r0;
    }

    public static String A03(BusinessDirectoryContextualSearchViewModel businessDirectoryContextualSearchViewModel) {
        C125025zC r0 = (C125025zC) businessDirectoryContextualSearchViewModel.A0R.A06.A04();
        if (r0 != null) {
            return r0.A0F;
        }
        return null;
    }

    public static List A07(BusinessDirectoryContextualSearchViewModel businessDirectoryContextualSearchViewModel) {
        C125025zC r2 = (C125025zC) businessDirectoryContextualSearchViewModel.A0R.A06.A04();
        if (AnonymousClass6MI.A00(A02(businessDirectoryContextualSearchViewModel)) && r2 != null && businessDirectoryContextualSearchViewModel.A01 == 1) {
            List list = r2.A0J;
            if (!list.isEmpty()) {
                return list;
            }
        }
        return AnonymousClass001.A0I();
    }

    private void A08() {
        AnonymousClass08M r3 = this.A0I;
        Map map = r3.A03;
        String A1A = C36431kI.A1A("saved_search_query", map);
        int i = 0;
        if (TextUtils.isEmpty(A1A) || !A1A.equals(A03(this))) {
            if (this.A07) {
                this.A01 = 1;
                this.A07 = false;
                r3.A03("saved_search_state", (Object) null);
                r3.A03("saved_search_query", (Object) null);
            } else if (this.A01 == 1) {
                this.A0M.A08(C129006Eo.A00(this), (Integer) null, (Map) null, 1, 1, 0);
            }
        } else if (map.get("saved_search_state") != null) {
            i = C90474aD.A06("saved_search_state", map);
        }
        this.A01 = i;
        r3.A03("saved_search_state", (Object) null);
        r3.A03("saved_search_query", (Object) null);
    }

    public static void A09(C119215pS r16, C1260462i r17, AnonymousClass6QG r18, BusinessDirectoryContextualSearchViewModel businessDirectoryContextualSearchViewModel, String str, String str2, int i, int i2) {
        BusinessDirectoryContextualSearchViewModel businessDirectoryContextualSearchViewModel2 = businessDirectoryContextualSearchViewModel;
        AnonymousClass6SI r6 = businessDirectoryContextualSearchViewModel2.A0h;
        String str3 = businessDirectoryContextualSearchViewModel2.A0K.A00;
        C1254960a r1 = businessDirectoryContextualSearchViewModel2.A0g;
        int i3 = 871826611;
        int i4 = i;
        if (i == 0) {
            i3 = 871830404;
        }
        C132406Tm A002 = r1.A00(i3);
        String str4 = str;
        AnonymousClass00C.A0D(str4, 0);
        A002.A00 = Integer.valueOf(C132406Tm.A04.getAndIncrement());
        A002.A05();
        C119215pS r3 = r16;
        C1260462i r4 = r17;
        AnonymousClass6QG r5 = r18;
        String str5 = str2;
        int i5 = i2;
        if (i == 0) {
            C130196Kc r2 = r6.A03;
            C1502274l.A00(r2.A03, r2, new C155247Vi(r3, r4, r5, r6, A002, str, str3, str5, i2), str4, 25);
        } else if (i4 == 1) {
            AnonymousClass6SI.A00(r3, r4, r5, r6, new C128536Cq((C1277269k) null, str4, 30), A002, str4, str3, C90464aC.A0V(), str5, i5, false);
        }
    }

    public static void A0A(C125025zC r13, BusinessDirectoryContextualSearchViewModel businessDirectoryContextualSearchViewModel) {
        long j;
        if (r13.A05 != null) {
            C142646pD r2 = businessDirectoryContextualSearchViewModel.A0M;
            Integer A082 = businessDirectoryContextualSearchViewModel.A0R.A08();
            int size = r13.A05.A06.size();
            String str = r13.A0F;
            AnonymousClass6QK r1 = businessDirectoryContextualSearchViewModel.A0T;
            List list = r1.A00;
            if (list != null) {
                j = (long) list.size();
            } else {
                j = 0;
            }
            r2.A01(r1.A05(), Boolean.valueOf(r1.A03), Boolean.valueOf(r1.A04), A082, str, "query", r1.A06(), size, C129006Eo.A00(businessDirectoryContextualSearchViewModel).intValue(), j);
        }
    }

    public static void A0D(BusinessDirectoryContextualSearchViewModel businessDirectoryContextualSearchViewModel, C144416s9 r8) {
        businessDirectoryContextualSearchViewModel.A0S.A02(new C135126cB(System.currentTimeMillis(), r8.A0I, TextUtils.join(",", r8.A0L), r8.A0F));
    }

    public static void A0E(BusinessDirectoryContextualSearchViewModel businessDirectoryContextualSearchViewModel, C144416s9 r12, String str, String str2, String str3, String str4, int i) {
        C20810yC r1 = businessDirectoryContextualSearchViewModel.A0X.A03;
        if (C90494aF.A1X(r1) && r1.A0E(2313)) {
            C1260562j r2 = businessDirectoryContextualSearchViewModel.A0P;
            String str5 = r12.A0F;
            String str6 = businessDirectoryContextualSearchViewModel.A0R.A0K;
            String str7 = r12.A0H;
            Double d = r12.A02;
            AnonymousClass00C.A0D(str5, 0);
            r2.A00();
            C145056tH r13 = new C145056tH(r2, d, str5, str, str2, str6, str7, str3, str4, i, 1);
            r2.A00 = r13;
            r2.A02.registerObserver(r13);
        }
    }

    public static void A0F(BusinessDirectoryContextualSearchViewModel businessDirectoryContextualSearchViewModel, String str, int i) {
        BusinessDirectoryContextualSearchViewModel businessDirectoryContextualSearchViewModel2 = businessDirectoryContextualSearchViewModel;
        businessDirectoryContextualSearchViewModel2.A0M.A08(C129006Eo.A00(businessDirectoryContextualSearchViewModel2), (Integer) null, (Map) null, 2, 2, 0);
        C119215pS r9 = null;
        businessDirectoryContextualSearchViewModel2.A02 = null;
        LinkedList linkedList = businessDirectoryContextualSearchViewModel2.A0e;
        synchronized (linkedList) {
            String str2 = str;
            if (!TextUtils.isEmpty(str2)) {
                C143516qg r4 = businessDirectoryContextualSearchViewModel2.A0R;
                r4.A0D(A03(businessDirectoryContextualSearchViewModel2));
                boolean z = true;
                businessDirectoryContextualSearchViewModel2.A01 = 1;
                C36341k9.A17(businessDirectoryContextualSearchViewModel2.A0d, 3);
                linkedList.clear();
                if (A07(businessDirectoryContextualSearchViewModel2).isEmpty()) {
                    ArrayList A0I2 = AnonymousClass001.A0I();
                    A0G(businessDirectoryContextualSearchViewModel2, A0I2);
                    A0I2.addAll(A04(businessDirectoryContextualSearchViewModel2));
                    A0I2.add(new C105245Dx(C90514aH.A1V(businessDirectoryContextualSearchViewModel2.A01), false));
                    businessDirectoryContextualSearchViewModel2.A0F.A0C(A0I2);
                }
                r4.A09.A03 = 9;
                int i2 = i;
                if (i2 != 2) {
                    z = false;
                }
                r4.A04 = z;
                int i3 = businessDirectoryContextualSearchViewModel2.A01;
                AnonymousClass6QG A022 = A02(businessDirectoryContextualSearchViewModel2);
                if (AnonymousClass6MI.A00(A02(businessDirectoryContextualSearchViewModel2))) {
                    C125025zC r0 = (C125025zC) r4.A06.A04();
                    if (r0 != null) {
                        r9 = r0.A04;
                    } else {
                        r9 = new C119215pS(150, (String) null);
                    }
                }
                A09(r9, businessDirectoryContextualSearchViewModel2.A0T.A02(), A022, businessDirectoryContextualSearchViewModel2, str2, r4.A0K, i3, i2);
            }
        }
    }

    public static void A0G(BusinessDirectoryContextualSearchViewModel businessDirectoryContextualSearchViewModel, List list) {
        if (businessDirectoryContextualSearchViewModel.A0V.A00.A00 == 7 && businessDirectoryContextualSearchViewModel.A0X.A05()) {
            list.add(new AnonymousClass5EF(businessDirectoryContextualSearchViewModel, (String) null));
        }
    }

    public static void A0H(BusinessDirectoryContextualSearchViewModel businessDirectoryContextualSearchViewModel, List list) {
        AnonymousClass6PX r2 = businessDirectoryContextualSearchViewModel.A0S;
        ArrayList A012 = r2.A01(C36401kF.A0w(r2.A00), true);
        if (!A012.isEmpty()) {
            list.add(new C105175Dq(new C48892iE(businessDirectoryContextualSearchViewModel, 14)));
        }
        list.addAll(A012);
    }

    public static void A0I(BusinessDirectoryContextualSearchViewModel businessDirectoryContextualSearchViewModel, List list) {
        C143466qb r5 = businessDirectoryContextualSearchViewModel.A0V;
        C95434kv r4 = r5.A00;
        int i = r4.A00;
        if (i == 1 || i == 3 || i == 5 || i == 6 || i == 4) {
            if (r4.A04() != null) {
                list.add(r4.A04());
            }
            businessDirectoryContextualSearchViewModel.A0L.A05(C143466qb.A00(r5), 25, r4.A0E());
        }
    }

    public static boolean A0K(BusinessDirectoryContextualSearchViewModel businessDirectoryContextualSearchViewModel) {
        C125025zC r0 = (C125025zC) businessDirectoryContextualSearchViewModel.A0R.A06.A04();
        if (r0 == null || TextUtils.isEmpty(r0.A0F)) {
            return false;
        }
        return true;
    }

    public void A0R() {
        this.A0R.A09();
        this.A0h.A00 = null;
        C145896uh r0 = this.A0N;
        r0.A0E = null;
        r0.A0C = null;
    }

    public void A0T(int i) {
        int i2;
        long j;
        String str;
        String str2;
        C142616pA r8 = this.A0L;
        C128836Du r0 = this.A0R.A09.A05;
        if (r0 != null) {
            i2 = r0.A09.size();
        } else {
            i2 = 0;
        }
        long j2 = (long) i2;
        AnonymousClass6QK r1 = this.A0T;
        List list = r1.A00;
        if (list != null) {
            j = (long) list.size();
        } else {
            j = 0;
        }
        Boolean A052 = r1.A05();
        if (r1.A03) {
            str = "has_catalog";
        } else {
            str = null;
        }
        if (r1.A04) {
            str2 = "open_now";
        } else {
            str2 = null;
        }
        Integer A002 = C129006Eo.A00(this);
        String A062 = r1.A06();
        AnonymousClass593 A003 = AnonymousClass593.A00(i);
        A003.A09 = A002;
        A003.A0I = Long.valueOf(j2);
        A003.A0P = str;
        A003.A0K = Long.valueOf(j);
        A003.A00 = A052;
        A003.A0Q = str2;
        A003.A0R = A062;
        A003.A0S = r8.A01;
        A003.A0A = Integer.valueOf(r8.A00);
        A003.A0H = C90474aD.A0Y();
        r8.A04.Bly(A003);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003e, code lost:
        if (r10.isEmpty() == false) goto L_0x0040;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0U(X.C1277269k r42, X.AnonymousClass6P1 r43, java.lang.String r44, java.lang.String r45, java.lang.String r46, java.util.List r47, java.util.List r48, java.util.List r49, boolean r50) {
        /*
            r41 = this;
            r0 = r41
            java.util.LinkedList r4 = r0.A0e
            monitor-enter(r4)
            android.os.Handler r2 = r0.A0B     // Catch:{ all -> 0x0232 }
            java.lang.Runnable r1 = r0.A03     // Catch:{ all -> 0x0232 }
            r2.removeCallbacks(r1)     // Catch:{ all -> 0x0232 }
            r5 = r44
            boolean r1 = r4.contains(r5)     // Catch:{ all -> 0x0232 }
            if (r1 != 0) goto L_0x0017
        L_0x0014:
            monitor-exit(r4)     // Catch:{ all -> 0x0232 }
            goto L_0x0231
        L_0x0017:
            java.lang.Object r1 = r4.peek()     // Catch:{ all -> 0x0232 }
            boolean r1 = r5.equals(r1)     // Catch:{ all -> 0x0232 }
            if (r1 != 0) goto L_0x0025
            r4.poll()     // Catch:{ all -> 0x0232 }
            goto L_0x0017
        L_0x0025:
            r2 = 0
            r3 = 1
            r15 = r48
            r10 = r49
            if (r50 != 0) goto L_0x0040
            boolean r1 = r47.isEmpty()     // Catch:{ all -> 0x0232 }
            if (r1 == 0) goto L_0x0040
            boolean r1 = r15.isEmpty()     // Catch:{ all -> 0x0232 }
            if (r1 == 0) goto L_0x0040
            boolean r1 = r10.isEmpty()     // Catch:{ all -> 0x0232 }
            r6 = 0
            if (r1 != 0) goto L_0x0041
        L_0x0040:
            r6 = 1
        L_0x0041:
            java.util.ArrayList r1 = A04(r0)     // Catch:{ all -> 0x0232 }
            if (r6 != 0) goto L_0x0071
            boolean r6 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x0232 }
            if (r6 != 0) goto L_0x0071
            int r2 = r0.A08     // Catch:{ all -> 0x0232 }
            int r2 = r2 + 1
            r0.A08 = r2     // Catch:{ all -> 0x0232 }
            r8 = 2131886786(0x7f1202c2, float:1.940816E38)
            X.6QG r7 = A02(r0)     // Catch:{ all -> 0x0232 }
            X.00S r6 = r0.A0f     // Catch:{ all -> 0x0232 }
            X.5EI r2 = new X.5EI     // Catch:{ all -> 0x0232 }
            r2.<init>(r7, r6, r8)     // Catch:{ all -> 0x0232 }
            r1.add(r2)     // Catch:{ all -> 0x0232 }
            r2 = r43
            java.util.ArrayList r2 = A05(r0, r2, r5)     // Catch:{ all -> 0x0232 }
            r1.addAll(r2)     // Catch:{ all -> 0x0232 }
            if (r50 != 0) goto L_0x022a
            goto L_0x01aa
        L_0x0071:
            int r6 = r0.A09     // Catch:{ all -> 0x0232 }
            int r6 = r6 + 1
            r0.A09 = r6     // Catch:{ all -> 0x0232 }
            r14 = r42
            if (r42 == 0) goto L_0x008c
            java.util.List r7 = r14.A01     // Catch:{ all -> 0x0232 }
            boolean r6 = r7.isEmpty()     // Catch:{ all -> 0x0232 }
            if (r6 != 0) goto L_0x008c
            X.6PX r6 = r0.A0S     // Catch:{ all -> 0x0232 }
            java.util.ArrayList r6 = r6.A01(r7, r2)     // Catch:{ all -> 0x0232 }
            r1.addAll(r6)     // Catch:{ all -> 0x0232 }
        L_0x008c:
            boolean r6 = r47.isEmpty()     // Catch:{ all -> 0x0232 }
            if (r6 != 0) goto L_0x00d3
            r15.size()     // Catch:{ all -> 0x0232 }
            java.util.ArrayList r13 = X.AnonymousClass001.A0I()     // Catch:{ all -> 0x0232 }
            java.util.Iterator r16 = r47.iterator()     // Catch:{ all -> 0x0232 }
        L_0x009d:
            boolean r6 = r16.hasNext()     // Catch:{ all -> 0x0232 }
            if (r6 == 0) goto L_0x00d0
            java.lang.Object r6 = r16.next()     // Catch:{ all -> 0x0232 }
            X.544 r6 = (X.AnonymousClass544) r6     // Catch:{ all -> 0x0232 }
            r7 = 19
            X.2i6 r12 = new X.2i6     // Catch:{ all -> 0x0232 }
            r12.<init>(r6, r0, r7)     // Catch:{ all -> 0x0232 }
            X.AnonymousClass00C.A0D(r6, r2)     // Catch:{ all -> 0x0232 }
            boolean r11 = r6.A01     // Catch:{ all -> 0x0232 }
            java.lang.String r9 = r6.A01     // Catch:{ all -> 0x0232 }
            java.lang.String r8 = r6.A00     // Catch:{ all -> 0x0232 }
            java.lang.String r7 = r6.A03     // Catch:{ all -> 0x0232 }
            X.5E5 r6 = new X.5E5     // Catch:{ all -> 0x0232 }
            r20 = r8
            r21 = r7
            r22 = r11
            r19 = r9
            r18 = r12
            r17 = r6
            r17.<init>(r18, r19, r20, r21, r22)     // Catch:{ all -> 0x0232 }
            r13.add(r6)     // Catch:{ all -> 0x0232 }
            goto L_0x009d
        L_0x00d0:
            r1.addAll(r13)     // Catch:{ all -> 0x0232 }
        L_0x00d3:
            if (r42 == 0) goto L_0x0152
            java.util.List r7 = r14.A00     // Catch:{ all -> 0x0232 }
            boolean r6 = r7.isEmpty()     // Catch:{ all -> 0x0232 }
            if (r6 != 0) goto L_0x0152
            java.util.ArrayList r6 = X.AnonymousClass001.A0I()     // Catch:{ all -> 0x0232 }
            java.util.Iterator r12 = r7.iterator()     // Catch:{ all -> 0x0232 }
        L_0x00e5:
            boolean r7 = r12.hasNext()     // Catch:{ all -> 0x0232 }
            if (r7 == 0) goto L_0x0147
            java.lang.Object r7 = r12.next()     // Catch:{ all -> 0x0232 }
            X.6cB r7 = (X.C135126cB) r7     // Catch:{ all -> 0x0232 }
            java.lang.String r9 = r7.A03     // Catch:{ all -> 0x0232 }
            java.lang.String r8 = r7.A01     // Catch:{ all -> 0x0232 }
            java.lang.String r11 = r7.A02     // Catch:{ all -> 0x0232 }
            java.lang.Double r18 = X.C90494aF.A0S()     // Catch:{ all -> 0x0232 }
            boolean r7 = android.text.TextUtils.isEmpty(r11)     // Catch:{ all -> 0x0232 }
            if (r7 == 0) goto L_0x0140
            java.util.ArrayList r30 = X.AnonymousClass001.A0I()     // Catch:{ all -> 0x0232 }
        L_0x0105:
            r17 = 0
            r35 = 3
            java.util.ArrayList r31 = X.AnonymousClass001.A0I()     // Catch:{ all -> 0x0232 }
            java.util.ArrayList r32 = X.AnonymousClass001.A0I()     // Catch:{ all -> 0x0232 }
            java.lang.String r23 = ""
            X.6s9 r7 = new X.6s9     // Catch:{ all -> 0x0232 }
            r21 = r17
            r22 = r17
            r26 = r23
            r28 = r17
            r29 = r17
            r33 = r17
            r34 = r17
            r36 = 0
            r37 = 0
            r38 = 0
            r39 = 0
            r40 = 0
            r19 = r18
            r20 = r17
            r24 = r9
            r25 = r23
            r27 = r8
            r16 = r7
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40)     // Catch:{ all -> 0x0232 }
            r6.add(r7)     // Catch:{ all -> 0x0232 }
            goto L_0x00e5
        L_0x0140:
            java.lang.String[] r7 = new java.lang.String[r3]     // Catch:{ all -> 0x0232 }
            java.util.List r30 = X.C90524aI.A0p(r11, r7, r2)     // Catch:{ all -> 0x0232 }
            goto L_0x0105
        L_0x0147:
            r7 = 0
            r47.size()     // Catch:{ all -> 0x0232 }
            java.util.ArrayList r6 = r0.A06(r7, r7, r6, r3)     // Catch:{ all -> 0x0232 }
            r1.addAll(r6)     // Catch:{ all -> 0x0232 }
        L_0x0152:
            boolean r6 = r10.isEmpty()     // Catch:{ all -> 0x0232 }
            if (r6 != 0) goto L_0x0163
            r6 = 0
            r47.size()     // Catch:{ all -> 0x0232 }
            java.util.ArrayList r6 = r0.A06(r6, r6, r10, r2)     // Catch:{ all -> 0x0232 }
            r1.addAll(r6)     // Catch:{ all -> 0x0232 }
        L_0x0163:
            boolean r6 = r15.isEmpty()     // Catch:{ all -> 0x0232 }
            if (r6 != 0) goto L_0x0177
            r47.size()     // Catch:{ all -> 0x0232 }
            r7 = r45
            r6 = r46
            java.util.ArrayList r2 = r0.A06(r7, r6, r15, r2)     // Catch:{ all -> 0x0232 }
            r1.addAll(r2)     // Catch:{ all -> 0x0232 }
        L_0x0177:
            if (r50 != 0) goto L_0x017a
            goto L_0x0184
        L_0x017a:
            X.5EM r2 = new X.5EM     // Catch:{ all -> 0x0232 }
            r2.<init>(r3)     // Catch:{ all -> 0x0232 }
            r1.add(r2)     // Catch:{ all -> 0x0232 }
            goto L_0x022a
        L_0x0184:
            int r2 = r5.length()     // Catch:{ all -> 0x0232 }
            if (r2 <= r3) goto L_0x0198
            r2 = 6
            X.9v1 r6 = new X.9v1     // Catch:{ all -> 0x0232 }
            r6.<init>(r2, r5, r0)     // Catch:{ all -> 0x0232 }
            X.5Dp r2 = new X.5Dp     // Catch:{ all -> 0x0232 }
            r2.<init>(r6)     // Catch:{ all -> 0x0232 }
            r1.add(r2)     // Catch:{ all -> 0x0232 }
        L_0x0198:
            boolean r2 = r15.isEmpty()     // Catch:{ all -> 0x0232 }
            if (r2 == 0) goto L_0x01aa
            boolean r2 = r10.isEmpty()     // Catch:{ all -> 0x0232 }
            if (r2 == 0) goto L_0x01aa
            int r2 = r0.A0A     // Catch:{ all -> 0x0232 }
            int r2 = r2 + 1
            r0.A0A = r2     // Catch:{ all -> 0x0232 }
        L_0x01aa:
            X.6pD r13 = r0.A0M     // Catch:{ all -> 0x0232 }
            int r12 = r47.size()     // Catch:{ all -> 0x0232 }
            int r11 = r15.size()     // Catch:{ all -> 0x0232 }
            int r10 = r10.size()     // Catch:{ all -> 0x0232 }
            java.lang.Integer r14 = X.C129006Eo.A00(r0)     // Catch:{ all -> 0x0232 }
            r18 = 4
            java.util.LinkedHashMap r8 = X.C36431kI.A1G()     // Catch:{ all -> 0x0232 }
            int r2 = r5.length()     // Catch:{ all -> 0x0232 }
            long r6 = (long) r2     // Catch:{ all -> 0x0232 }
            r2 = 2
            X.011[] r9 = new X.AnonymousClass011[r2]     // Catch:{ all -> 0x0232 }
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x0232 }
            java.lang.String r2 = "length"
            X.C90464aC.A1E(r2, r6, r9)     // Catch:{ all -> 0x0232 }
            r6 = 0
            java.lang.String r2 = X.C36371kC.A0y(r5)     // Catch:{ all -> 0x0232 }
            int r7 = r2.length()     // Catch:{ all -> 0x0232 }
            r2 = 0
            if (r7 == 0) goto L_0x01f0
            java.lang.String r5 = X.C36371kC.A0y(r5)     // Catch:{ all -> 0x0232 }
            java.lang.String r2 = "\\s+"
            java.util.List r5 = X.C90504aG.A0v(r5, r2, r6)     // Catch:{ all -> 0x0232 }
            java.lang.String[] r2 = new java.lang.String[r6]     // Catch:{ all -> 0x0232 }
            java.lang.Object[] r2 = r5.toArray(r2)     // Catch:{ all -> 0x0232 }
            int r2 = r2.length     // Catch:{ all -> 0x0232 }
        L_0x01f0:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0232 }
            java.lang.String r2 = "words"
            X.C36341k9.A1J(r2, r5, r9, r3)     // Catch:{ all -> 0x0232 }
            java.util.LinkedHashMap r5 = X.C000400e.A08(r9)     // Catch:{ all -> 0x0232 }
            java.lang.String r2 = "query"
            r8.put(r2, r5)     // Catch:{ all -> 0x0232 }
            java.util.LinkedHashMap r6 = X.C36431kI.A1G()     // Catch:{ all -> 0x0232 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r12)     // Catch:{ all -> 0x0232 }
            java.lang.String r2 = "category_count"
            java.lang.Integer r5 = X.C90514aH.A0l(r2, r5, r6, r11)     // Catch:{ all -> 0x0232 }
            java.lang.String r2 = "local_biz_count"
            java.lang.Integer r5 = X.C90514aH.A0l(r2, r5, r6, r10)     // Catch:{ all -> 0x0232 }
            java.lang.String r2 = "api_biz_count"
            r6.put(r2, r5)     // Catch:{ all -> 0x0232 }
            java.lang.String r2 = "result"
            java.lang.Integer r15 = X.C90514aH.A0l(r2, r6, r8, r3)     // Catch:{ all -> 0x0232 }
            r19 = 2
            r17 = 1
            r16 = r8
            r13.A08(r14, r15, r16, r17, r18, r19)     // Catch:{ all -> 0x0232 }
        L_0x022a:
            X.08S r0 = r0.A0F     // Catch:{ all -> 0x0232 }
            r0.A0C(r1)     // Catch:{ all -> 0x0232 }
            goto L_0x0014
        L_0x0231:
            return
        L_0x0232:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0232 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.businessdirectory.viewmodel.BusinessDirectoryContextualSearchViewModel.A0U(X.69k, X.6P1, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.util.List, java.util.List, boolean):void");
    }

    public void BR4() {
        if (this.A0X.A05()) {
            C142616pA r2 = this.A0L;
            Integer A002 = C143466qb.A00(this.A0V);
            AnonymousClass593 A003 = AnonymousClass593.A00(3);
            A003.A09 = A002;
            C142616pA.A01(r2, A003);
            this.A0i.A02(true);
        }
        C36341k9.A17(this.A0Z, 3);
    }

    public void BTD() {
        C119305pb A042 = this.A0T.A04();
        if (A042 != null) {
            this.A0a.A0C(A042);
        }
    }

    public void BTG() {
        this.A0c.A0D(C36441kJ.A0Q(C36401kF.A0h(), A02(this)));
        this.A0V.A03();
    }

    public void BTX(int i) {
        C28201Rs r2;
        int i2;
        if (i == 0 || i == 7 || i == 6) {
            this.A0L.A04(C143466qb.A00(this.A0V), 29, 0);
            r2 = this.A0c;
            i2 = 8;
        } else if (i == 3) {
            this.A0L.A04(C143466qb.A00(this.A0V), 29, 3);
            r2 = this.A0c;
            i2 = 5;
        } else {
            return;
        }
        r2.A0C(C36441kJ.A0Q(Integer.valueOf(i2), A02(this)));
    }

    public void BTa() {
        this.A0T.A07();
        this.A0M.A02((Boolean) null, C129006Eo.A00(this), (String) null, 24);
        String A032 = A03(this);
        if (A032 == null) {
            A032 = "";
        }
        String A033 = A03(this);
        if (A033 == null) {
            A033 = "";
        }
        A0F(this, A032, A01(this, A033));
    }

    public void BTb() {
        Log.e("BusinessDirectoryContextualSearchViewModel/onRetryNetworkClicked Should not reach here - no filters on this screen");
    }

    public void BVy(boolean z) {
        this.A0T.A02 = z;
        this.A0M.A02(Boolean.valueOf(z), C129006Eo.A00(this), (String) null, 21);
        String A032 = A03(this);
        if (A032 == null) {
            A032 = "";
        }
        A0F(this, A032, 1);
    }

    public void BYq(boolean z) {
        this.A0T.A03 = z;
        this.A0M.A02(Boolean.valueOf(z), C129006Eo.A00(this), (String) null, 22);
        String A032 = A03(this);
        if (A032 == null) {
            A032 = "";
        }
        A0F(this, A032, 1);
    }

    public void BaJ() {
        C36341k9.A17(this.A0Z, 0);
        this.A0L.A04(C143466qb.A00(this.A0V), 34, 0);
    }

    public void Bbt(boolean z) {
        this.A0T.A04 = z;
        this.A0M.A02(Boolean.valueOf(z), C129006Eo.A00(this), (String) null, 9);
        String A032 = A03(this);
        if (A032 == null) {
            A032 = "";
        }
        A0F(this, A032, 1);
    }

    public void BfV(String str) {
        if (this.A01 == 0 || !AnonymousClass6MI.A00(A02(this))) {
            A0V(str);
            return;
        }
        C143516qg r4 = this.A0R;
        C125025zC r3 = r4.A09;
        List list = r3.A0J;
        if (!list.isEmpty()) {
            list.add(new AnonymousClass5EM(0));
            r3.A03 = 2;
            r4.A0B();
        }
        A0F(this, str, 1);
    }

    public void BfW() {
        C143466qb r2 = this.A0V;
        r2.A02();
        r2.A00.A0F();
        C36341k9.A17(this.A0Z, 1);
        this.A0L.A04(C143466qb.A00(r2), 31, 0);
    }

    public void BfX() {
        synchronized (this.A0e) {
            A0C(this);
        }
    }

    public void Bg2() {
        Log.e("BusinessDirectoryContextualSearchViewModel/onSeeAllCategoriesClicked Should not reach here, no category screen view");
    }

    public static ArrayList A04(BusinessDirectoryContextualSearchViewModel businessDirectoryContextualSearchViewModel) {
        ArrayList A0I2 = AnonymousClass001.A0I();
        if (businessDirectoryContextualSearchViewModel.A0V.A00.A04() != null) {
            C90504aG.A1A(businessDirectoryContextualSearchViewModel, A0I2);
        }
        return A0I2;
    }

    public static ArrayList A05(BusinessDirectoryContextualSearchViewModel businessDirectoryContextualSearchViewModel, AnonymousClass6P1 r6, String str) {
        ArrayList A0I2 = AnonymousClass001.A0I();
        if (r6 != null) {
            ArrayList A0I3 = AnonymousClass001.A0I();
            A0I3.add(new AnonymousClass5EO(str));
            List list = r6.A00;
            if (list != null && !list.isEmpty()) {
                A0I3.add(new AnonymousClass5EH(list, new C165087sr(businessDirectoryContextualSearchViewModel, 0)));
            }
            C001600r r2 = businessDirectoryContextualSearchViewModel.A0D;
            if (r2.A04() != null && !((C122335ug) r2.A04()).A03.isEmpty()) {
                A0I3.add(new AnonymousClass5EP(0));
                A0I3.addAll(((C122335ug) r2.A04()).A03);
            }
            A0I2.addAll(A0I3);
            return A0I2;
        }
        A0I2.add(new AnonymousClass5E1(businessDirectoryContextualSearchViewModel, str, 0));
        return A0I2;
    }

    private ArrayList A06(String str, String str2, List list, boolean z) {
        String str3;
        ArrayList A0I2 = AnonymousClass001.A0I();
        int i = 0;
        while (true) {
            List list2 = list;
            if (i >= list2.size()) {
                return A0I2;
            }
            AnonymousClass6QG A022 = A02(this);
            C144416s9 r6 = (C144416s9) list2.get(i);
            list2.size();
            String str4 = null;
            if (i > 0) {
                str3 = ((C144416s9) list2.get(i - 1)).A0H;
            } else {
                str3 = null;
            }
            if (i < C36431kI.A07(list2)) {
                str4 = ((C144416s9) list2.get(i + 1)).A0H;
            }
            String str5 = str;
            String str6 = str2;
            boolean z2 = z;
            C143676qw r4 = new C143676qw(this, r6, str5, str6, str3, str4, i, z2);
            AnonymousClass6YJ r1 = new AnonymousClass6YJ(this, 1);
            C143716r0 r13 = new C143716r0(this, r6, str5, str6, str3, str4, i);
            AnonymousClass00C.A0D(r6, 1);
            A0I2.add(new AnonymousClass51O(r4, r1, r13, r6, A022.A02(), z2));
            i++;
        }
    }

    public static void A0B(BusinessDirectoryContextualSearchViewModel businessDirectoryContextualSearchViewModel) {
        if (!A0K(businessDirectoryContextualSearchViewModel)) {
            ArrayList A0I2 = AnonymousClass001.A0I();
            A0I(businessDirectoryContextualSearchViewModel, A0I2);
            if (businessDirectoryContextualSearchViewModel.A0V.A09()) {
                A0G(businessDirectoryContextualSearchViewModel, A0I2);
                C90504aG.A1A(businessDirectoryContextualSearchViewModel, A0I2);
                A0H(businessDirectoryContextualSearchViewModel, A0I2);
            }
            businessDirectoryContextualSearchViewModel.A0E.A0C(A0I2);
        }
    }

    public static void A0C(BusinessDirectoryContextualSearchViewModel businessDirectoryContextualSearchViewModel) {
        if (!A0K(businessDirectoryContextualSearchViewModel) || !businessDirectoryContextualSearchViewModel.A0V.A09()) {
            A0B(businessDirectoryContextualSearchViewModel);
            return;
        }
        String str = ((C125025zC) businessDirectoryContextualSearchViewModel.A0R.A06.A04()).A0F;
        synchronized (businessDirectoryContextualSearchViewModel.A0e) {
            businessDirectoryContextualSearchViewModel.A0J(str);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0074, code lost:
        if (((X.C122335ug) r1.A04()).A03.isEmpty() == false) goto L_0x0085;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A0J(java.lang.String r6) {
        /*
            r5 = this;
            java.lang.String r4 = r6.trim()
            X.6qg r0 = r5.A0R
            r0.A0D(r4)
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            r5.A08()
            if (r0 != 0) goto L_0x008f
            java.util.LinkedList r0 = r5.A0e
            r0.add(r4)
            boolean r0 = r5.A05
            r3 = 1
            if (r0 != 0) goto L_0x0035
            X.6p9 r2 = r5.A0l
            java.util.Random r0 = r2.A01
            if (r0 != 0) goto L_0x0029
            java.util.Random r0 = new java.util.Random
            r0.<init>()
            r2.A01 = r0
        L_0x0029:
            long r0 = r0.nextLong()
            java.lang.String r0 = java.lang.Long.toHexString(r0)
            r2.A00 = r0
            r5.A05 = r3
        L_0x0035:
            int r0 = r5.A01
            if (r0 != r3) goto L_0x0041
            int r0 = A01(r5, r6)
            A0F(r5, r4, r0)
            return
        L_0x0041:
            android.os.Handler r3 = r5.A0B
            java.lang.Runnable r2 = r5.A03
            r0 = 500(0x1f4, double:2.47E-321)
            r3.postDelayed(r2, r0)
            java.lang.Runnable r1 = r5.A04
            if (r1 == 0) goto L_0x0053
            android.os.Handler r0 = r5.A0C
            r0.removeCallbacks(r1)
        L_0x0053:
            r1 = 28
            X.751 r0 = new X.751
            r0.<init>(r1, r4, r5)
            r5.A04 = r0
            boolean r0 = r5.A06
            if (r0 != 0) goto L_0x0076
            X.00r r1 = r5.A0D
            java.lang.Object r0 = r1.A04()
            if (r0 == 0) goto L_0x0076
            java.lang.Object r0 = r1.A04()
            X.5ug r0 = (X.C122335ug) r0
            java.util.List r0 = r0.A03
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0085
        L_0x0076:
            X.6qb r0 = r5.A0V
            X.4kv r0 = r0.A00
            X.6QG r2 = r0.A01
            if (r2 == 0) goto L_0x0085
            X.6uh r1 = r5.A0N
            android.os.ConditionVariable r0 = X.C18740tg.A00
            r1.A05(r2)
        L_0x0085:
            android.os.Handler r3 = r5.A0C
            java.lang.Runnable r2 = r5.A04
            r0 = 500(0x1f4, double:2.47E-321)
            r3.postDelayed(r2, r0)
            return
        L_0x008f:
            java.util.LinkedList r2 = r5.A0e
            monitor-enter(r2)
            r2.clear()     // Catch:{ all -> 0x00a1 }
            android.os.Handler r1 = r5.A0B     // Catch:{ all -> 0x00a1 }
            java.lang.Runnable r0 = r5.A03     // Catch:{ all -> 0x00a1 }
            r1.removeCallbacks(r0)     // Catch:{ all -> 0x00a1 }
            A0C(r5)     // Catch:{ all -> 0x00a1 }
            monitor-exit(r2)     // Catch:{ all -> 0x00a1 }
            return
        L_0x00a1:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x00a1 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.businessdirectory.viewmodel.BusinessDirectoryContextualSearchViewModel.A0J(java.lang.String):void");
    }

    public void A0V(String str) {
        if (!TextUtils.isEmpty(str) && (this.A01 == 1 || TextUtils.isEmpty(A03(this)))) {
            C142646pD r2 = this.A0M;
            int i = 1;
            if (this.A01 == 1) {
                i = 2;
            }
            r2.A08(C129006Eo.A00(this), 1, (Map) null, i, 7, 4);
        }
        synchronized (this.A0e) {
            C121365t1 r1 = this.A0K;
            AnonymousClass00C.A0D(str, 0);
            if (str.length() == 0 || r1.A00 == null) {
                r1.A00 = C90464aC.A0V();
            }
            A0J(str);
        }
    }

    public void BZ5(C1261662u r5, int i) {
        ArrayList A0I2 = AnonymousClass001.A0I();
        C105225Dv.A00(this, A0I2, 2);
        this.A0E.A0C(A0I2);
        this.A0L.A04(C143466qb.A00(this.A0V), 28, 2);
    }

    public void BbC() {
        BTG();
    }
}
