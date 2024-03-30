package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: X.1O1  reason: invalid class name */
public class AnonymousClass1O1 {
    public C192519Hh A00;
    public Long A01;
    public AIC A02;
    public final C19460v5 A03;
    public final C19700wN A04;
    public final AnonymousClass196 A05;
    public final AnonymousClass185 A06;
    public final AnonymousClass1OT A07;
    public final AnonymousClass1O6 A08;
    public final AnonymousClass1O2 A09;
    public final AnonymousClass1O5 A0A;
    public final AnonymousClass1O3 A0B;
    public final AnonymousClass1A6 A0C;
    public final C19970wo A0D;
    public final C231417i A0E;
    public final C20810yC A0F;
    public final AnonymousClass1EV A0G;
    public final AnonymousClass1EU A0H;
    public final AnonymousClass005 A0I;
    public final Map A0J = new HashMap();
    public final Map A0K = new HashMap();
    public final Map A0L = new HashMap();
    public final Map A0M = new HashMap();
    public final Map A0N = new HashMap();
    public final AnonymousClass1O7 A0O;
    public final C27471Oi A0P = new C27481Oj(this);
    public final AnonymousClass12O A0Q;
    public final AnonymousClass1OD A0R;
    public final AnonymousClass19A A0S;
    public final AnonymousClass1O8 A0T;

    public static synchronized AIC A01(AnonymousClass1O1 r6) {
        AIC aic;
        synchronized (r6) {
            aic = r6.A02;
            if (aic == null) {
                C20810yC r4 = r6.A0F;
                C19700wN r1 = r6.A04;
                AnonymousClass19A r5 = r6.A0S;
                aic = new AIC(r1, r6.A0P, r6.A0Q, r4, r5);
                r6.A02 = aic;
            }
        }
        return aic;
    }

    public static C131626Pu A00(AnonymousClass08V r3, String str) {
        C131626Pu r0;
        C224214g r2 = new C224214g(str);
        try {
            r0 = (C131626Pu) r3.apply(str);
        } catch (RuntimeException e) {
            Log.e("ContactSyncHelper/runAndHandleExceptions", e);
            r0 = C131626Pu.A02;
        } catch (Throwable th) {
            r2.A01();
            throw th;
        }
        r2.A01();
        return r0;
    }

    public static String A02(AnonymousClass141 r2) {
        AnonymousClass3IL r1 = r2.A0F;
        AnonymousClass11F r0 = r2.A0H;
        if (r1 != null) {
            return r1.A01;
        }
        if (r0 != null) {
            return r0.getRawString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("hc_");
        sb.append(r2.hashCode());
        return sb.toString();
    }

    public static boolean A04(AnonymousClass1O1 r6, C1041758o r7, String str, Future future) {
        try {
            future.get(64000, TimeUnit.MILLISECONDS);
            if (r6.A00 != null) {
                return true;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("/no result");
            Log.i(sb.toString());
            Long l = r6.A01;
            if (l != null) {
                r7.A09 = l;
                return false;
            }
            return false;
        } catch (RuntimeException e) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append("/exception");
            Log.e(sb2.toString(), e);
            r6.A04.A0E(str, e.getMessage(), true);
        } catch (ExecutionException e2) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str);
            sb3.append("/exception");
            Log.e(sb3.toString(), e2);
            if ((e2.getCause() instanceof RuntimeException) || ((e2.getCause() instanceof Error) && !(e2.getCause() instanceof AssertionError) && !(e2.getCause() instanceof OutOfMemoryError))) {
                r6.A04.A0E(str, e2.getMessage(), true);
                return false;
            }
        } catch (InterruptedException | TimeoutException unused) {
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0012, code lost:
        if (r5.isEmpty() == false) goto L_0x0014;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A05(X.AnonymousClass1O1 r4, java.util.List r5, java.util.List r6, java.util.List r7) {
        /*
            X.196 r4 = r4.A05
            r4.A0N(r5, r6)
            boolean r0 = r6.isEmpty()
            r3 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0014
            boolean r0 = r5.isEmpty()
            r1 = 0
            if (r0 != 0) goto L_0x0015
        L_0x0014:
            r1 = 1
        L_0x0015:
            boolean r0 = r7.isEmpty()
            if (r0 != 0) goto L_0x001f
            r4.A0O(r7, r3)
            return r2
        L_0x001f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1O1.A05(X.1O1, java.util.List, java.util.List, java.util.List):boolean");
    }

    public AnonymousClass1O1(C19460v5 r2, C19700wN r3, AnonymousClass196 r4, AnonymousClass185 r5, AnonymousClass1O7 r6, AnonymousClass1OT r7, AnonymousClass1O6 r8, AnonymousClass1O2 r9, AnonymousClass1O5 r10, AnonymousClass1O3 r11, AnonymousClass1A6 r12, C19970wo r13, AnonymousClass12O r14, AnonymousClass1OD r15, C231417i r16, C20810yC r17, AnonymousClass19A r18, AnonymousClass1EV r19, AnonymousClass1EU r20, AnonymousClass1O8 r21, AnonymousClass005 r22) {
        this.A0D = r13;
        this.A0F = r17;
        this.A04 = r3;
        this.A05 = r4;
        this.A0S = r18;
        this.A09 = r9;
        this.A0H = r20;
        this.A0Q = r14;
        this.A0B = r11;
        this.A0E = r16;
        this.A03 = r2;
        this.A0O = r6;
        this.A0T = r21;
        this.A06 = r5;
        this.A0C = r12;
        this.A0R = r15;
        this.A0G = r19;
        this.A0A = r10;
        this.A07 = r7;
        this.A08 = r8;
        this.A0I = r22;
    }

    public static void A03(AnonymousClass1O1 r9, Collection collection, List list, Map map) {
        AnonymousClass3IL r0;
        StringBuilder sb;
        String str;
        Iterator it = list.iterator();
        boolean z = false;
        while (it.hasNext()) {
            AnonymousClass141 r6 = (AnonymousClass141) it.next();
            if (r6 == null || (r0 = r6.A0F) == null) {
                z = true;
            } else {
                C18740tg.A06(r0);
                String str2 = r0.A01;
                C194169Oj r1 = (C194169Oj) map.get(str2);
                if (r1 == null) {
                    sb = new StringBuilder();
                    str = "sync/phone-number/missing_response/";
                } else {
                    int i = r1.A04;
                    if (i == 0) {
                        sb = new StringBuilder();
                        str = "sync/phone-number/unassigned/";
                    } else {
                        boolean z2 = false;
                        if (i == 1) {
                            z2 = true;
                        }
                        UserJid userJid = r1.A0D;
                        AnonymousClass11F r12 = (AnonymousClass11F) r6.A06(UserJid.class);
                        if (r6.A0z != z2 || !C1901797e.A00(r6.A0H, userJid)) {
                            r6.A0z = z2;
                            r6.A0H = userJid;
                            if (collection != null) {
                                collection.add(r6);
                            }
                            if (!r6.A0z && r12 != null) {
                                r9.A0O.A02(r12);
                            }
                        }
                    }
                }
                sb.append(str);
                sb.append(AnonymousClass14B.A0B(str2, 4));
                Log.w(sb.toString());
            }
        }
        if (z) {
            r9.A04.A0E("sync/updateContactsFromSyncUsers/found-invalid-contacts", (String) null, false);
        }
    }

    public static boolean A06(AnonymousClass141 r1, Set set) {
        if ((!r1.A0C() || AnonymousClass143.A0I(r1.A0H)) && !set.contains(r1.A06(UserJid.class))) {
            return false;
        }
        return true;
    }
}
