package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.1Tc  reason: invalid class name and case insensitive filesystem */
public final class C28551Tc extends AnonymousClass1DJ {
    public final C19420v0 A00;
    public final C20810yC A01;
    public final AnonymousClass00T A02 = new AnonymousClass00U(new C28561Td(this));
    public final AnonymousClass00T A03 = new AnonymousClass00U(new C28571Te(this));
    public final AnonymousClass00T A04 = new AnonymousClass00U(new C28611Ti(this));
    public final AnonymousClass00T A05 = new AnonymousClass00U(new C28581Tf(this));
    public final AnonymousClass00T A06 = new AnonymousClass00U(new C28591Tg(this));
    public final AnonymousClass00T A07 = new AnonymousClass00U(new C28601Th(this));

    public C28551Tc(C19420v0 r3, C20810yC r4) {
        AnonymousClass00C.A0D(r4, 1);
        AnonymousClass00C.A0D(r3, 2);
        this.A01 = r4;
        this.A00 = r3;
    }

    public static final Set A00(C28551Tc r7) {
        String A09 = r7.A01.A09(3919);
        AnonymousClass00C.A08(A09);
        List<String> A0L = AnonymousClass099.A0L(A09, new String[]{","}, 0);
        ArrayList<Number> arrayList = new ArrayList<>();
        for (String A0D : A0L) {
            Integer A032 = AnonymousClass097.A03(AnonymousClass099.A0D(A0D).toString());
            if (A032 != null) {
                arrayList.add(A032);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Number intValue : arrayList) {
            int intValue2 = intValue.intValue();
            C52582pf[] values = C52582pf.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                C52582pf r1 = values[i];
                if (r1.type == intValue2) {
                    Integer valueOf = Integer.valueOf(r1.androidWaType);
                    if (valueOf != null) {
                        arrayList2.add(valueOf);
                    }
                } else {
                    i++;
                }
            }
        }
        return C007103b.A0f(arrayList2);
    }

    public final boolean A03(int i) {
        if (i != 66 && i != 67) {
            return ((Set) this.A02.getValue()).contains(Integer.valueOf(i));
        }
        if (((Set) this.A02.getValue()).contains(Integer.valueOf(i))) {
            return true;
        }
        if (C20800yB.A01(C21000yV.A02, this.A01, 6191)) {
            return true;
        }
        return false;
    }

    public final boolean A05(Collection collection) {
        C52582pf r1;
        if (!C20800yB.A01(C21000yV.A02, this.A01, 6442)) {
            return false;
        }
        if (!collection.isEmpty()) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                AnonymousClass3T1 r12 = (AnonymousClass3T1) it.next();
                AnonymousClass00C.A0D(r12, 0);
                int i = r12.A1I;
                if (i != 0) {
                    if (i != 2) {
                        C52582pf[] values = C52582pf.values();
                        int length = values.length;
                        int i2 = 0;
                        while (true) {
                            if (i2 >= length) {
                                r1 = null;
                                break;
                            }
                            r1 = values[i2];
                            if (r1.androidWaType == i) {
                                break;
                            }
                            i2++;
                        }
                    } else if (!(r12 instanceof C46812bi) || !((C46812bi) r12).A1l()) {
                        r1 = C52582pf.AUDIO;
                    } else {
                        r1 = C52582pf.PTT;
                    }
                } else if (!(r12 instanceof AnonymousClass2bV) || ((AnonymousClass2bV) r12).A06 == null) {
                    r1 = C52582pf.TEXT;
                } else {
                    r1 = C52582pf.URL;
                }
                if (!C007103b.A0j((Iterable) this.A03.getValue(), r1)) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001d A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A04(X.AnonymousClass3T1 r5) {
        /*
            r4 = this;
            X.3T1 r0 = r5.A0S()
            r3 = 0
            if (r0 == 0) goto L_0x001f
            int r0 = r5.A1I
            boolean r0 = r4.A03(r0)
            if (r0 == 0) goto L_0x001e
            X.00T r0 = r4.A04
        L_0x0011:
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
        L_0x001b:
            if (r0 == 0) goto L_0x001e
        L_0x001d:
            r3 = 1
        L_0x001e:
            return r3
        L_0x001f:
            boolean r0 = r5 instanceof X.AnonymousClass2bV
            if (r0 != 0) goto L_0x001d
            boolean r0 = r5 instanceof X.C46882bp
            if (r0 != 0) goto L_0x001d
            boolean r0 = r5 instanceof X.AnonymousClass2bO
            if (r0 != 0) goto L_0x001d
            boolean r0 = r5 instanceof X.C46812bi
            if (r0 == 0) goto L_0x0045
            int r0 = r5.A1I
            boolean r0 = r4.A03(r0)
            if (r0 == 0) goto L_0x001e
            X.2bi r5 = (X.C46812bi) r5
            boolean r0 = r5.A1l()
            if (r0 == 0) goto L_0x0042
            X.00T r0 = r4.A06
            goto L_0x0011
        L_0x0042:
            X.00T r0 = r4.A05
            goto L_0x0011
        L_0x0045:
            boolean r0 = r5 instanceof X.C46962bx
            if (r0 == 0) goto L_0x0054
            int r0 = r5.A1I
            boolean r0 = r4.A03(r0)
            if (r0 == 0) goto L_0x001e
            X.00T r0 = r4.A07
            goto L_0x0011
        L_0x0054:
            boolean r0 = r5 instanceof X.AnonymousClass2bS
            if (r0 != 0) goto L_0x0063
            boolean r0 = r5 instanceof X.C180858mX
            if (r0 != 0) goto L_0x0063
            int r0 = r5.A1I
            boolean r3 = r4.A03(r0)
            return r3
        L_0x0063:
            int r0 = r5.A1I
            boolean r0 = r4.A03(r0)
            if (r0 != 0) goto L_0x001d
            X.0yC r2 = r4.A01
            r1 = 6191(0x182f, float:8.675E-42)
            X.0yV r0 = X.C21000yV.A02
            boolean r0 = X.C20800yB.A01(r0, r2, r1)
            goto L_0x001b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C28551Tc.A04(X.3T1):boolean");
    }
}
