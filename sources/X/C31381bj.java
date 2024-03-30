package X;

import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.1bj  reason: invalid class name and case insensitive filesystem */
public final class C31381bj {
    public final AnonymousClass00S A00;

    public final C87374On A01(AnonymousClass9OY r27, List list) {
        C193939Nm r13;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        C192129Fu r2 = (C192129Fu) this.A00.invoke();
        Iterator it = list.iterator();
        while (true) {
            AnonymousClass9OY r8 = r27;
            if (!it.hasNext()) {
                A00(r8, arrayList);
                A00(r8, arrayList2);
                break;
            }
            C87374On r0 = (C87374On) it.next();
            AnonymousClass00C.A0D(r0, 0);
            C194769Re r15 = r8.A07;
            try {
                Iterator it2 = r2.A00.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        r13 = C200489hU.A00();
                        break;
                    }
                    C23052B1x b1x = (C23052B1x) it2.next();
                    String BxT = b1x.BxT();
                    r13 = b1x.B1F(r8, r0);
                    if (r13.A03) {
                        if (BxT != null) {
                            C21642ATi aTi = (C21642ATi) r0;
                            String str = aTi.A0F;
                            String str2 = r13.A00;
                            boolean z = false;
                            if (!aTi.A0O) {
                                z = true;
                            }
                            C592233c r16 = aTi.A06;
                            r15.A00(r16, str, BxT, str2, true, z);
                        }
                        if (r13.A02) {
                            break;
                        }
                    } else if (BxT != null) {
                        C21642ATi aTi2 = (C21642ATi) r0;
                        String str3 = aTi2.A0F;
                        String str4 = r13.A00;
                        boolean z2 = false;
                        if (!aTi2.A0O) {
                            z2 = true;
                        }
                        C592233c r162 = aTi2.A06;
                        r15.A00(r162, str3, BxT, str4, false, z2);
                    }
                }
            } catch (Exception e) {
                if (0 != 0) {
                    C21642ATi aTi3 = (C21642ATi) r0;
                    r15.A00(aTi3.A06, aTi3.A0F, (String) null, e.toString(), false, !aTi3.A0O);
                }
                r13 = new C193939Nm((C193229Kn) null, (C197849cT) null, e.getMessage(), e, false, false, false);
            }
            if (r13.A03) {
                if (r13.A02) {
                    arrayList = AnonymousClass03T.A02(r0);
                    break;
                }
                arrayList.add(r0);
            } else if (r13.A01) {
                arrayList2.add(r0);
            }
        }
        if (!arrayList.isEmpty()) {
            return (C87374On) arrayList.get(0);
        }
        return null;
    }

    public C31381bj(AnonymousClass00S r1) {
        this.A00 = r1;
    }

    public static final void A00(AnonymousClass9OY r21, List list) {
        Boolean valueOf;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass9OY r2 = r21;
            C194769Re r6 = r2.A07;
            C21642ATi aTi = (C21642ATi) ((C87374On) it.next());
            String str = aTi.A0C;
            if (!(str == null || str.length() == 0)) {
                String str2 = aTi.A0F;
                boolean z = aTi.A0L;
                C202109l3 r3 = r2.A08;
                StringBuilder sb = new StringBuilder();
                sb.append(str2);
                sb.append(str);
                String A002 = C202109l3.A00(r3, sb.toString());
                SharedPreferences sharedPreferences = r3.A00;
                if (!sharedPreferences.contains(A002) || (valueOf = Boolean.valueOf(sharedPreferences.getBoolean(A002, false))) == null || !valueOf.equals(Boolean.valueOf(z))) {
                    AnonymousClass19A r14 = r6.A00;
                    String A09 = r14.A09();
                    ArrayList arrayList = C50692lK.A00;
                    C203399nx r0 = new C50692lK(Long.valueOf(System.currentTimeMillis() / ((long) 1000)), A09, str2, str, "exposure").A00;
                    AnonymousClass00C.A08(r0);
                    r14.A0K(new C76493ox(), r0, A09, 376, 0);
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str2);
                sb2.append(str);
                sharedPreferences.edit().putBoolean(C202109l3.A00(r3, sb2.toString()), z).apply();
            }
        }
    }
}
