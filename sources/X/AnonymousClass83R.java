package X;

/* renamed from: X.83R  reason: invalid class name */
public class AnonymousClass83R extends C21780zn {
    public final AnonymousClass007 A00;

    public /* bridge */ /* synthetic */ AnonymousClass103 A01() {
        AnonymousClass83P r6 = new AnonymousClass83P();
        AnonymousClass007 r5 = this.A00;
        int size = r5.size();
        for (int i = 0; i < size; i++) {
            Object A04 = r5.A04(i);
            r6.mMetricsMap.put(A04, ((C21780zn) r5.A06(i)).A01());
            r6.mMetricsValid.put(A04, Boolean.FALSE);
        }
        return r6;
    }

    public /* bridge */ /* synthetic */ boolean A02(AnonymousClass103 r9) {
        boolean z;
        Boolean bool;
        AnonymousClass83P r92 = (AnonymousClass83P) r9;
        if (r92 != null) {
            AnonymousClass007 r7 = r92.mMetricsMap;
            int size = r7.size();
            boolean z2 = false;
            for (int i = 0; i < size; i++) {
                Class cls = (Class) r7.A04(i);
                C21780zn r1 = (C21780zn) this.A00.get(cls);
                if (r1 != null) {
                    z = r1.A02(r92.A03(cls));
                } else {
                    z = false;
                }
                AnonymousClass007 r12 = r92.mMetricsValid;
                if (z) {
                    bool = Boolean.TRUE;
                } else {
                    bool = Boolean.FALSE;
                }
                r12.put(cls, bool);
                z2 |= z;
            }
            return z2;
        }
        throw AnonymousClass001.A08("Null value passed to getSnapshot!");
    }

    public AnonymousClass83R(C191119Bq r3) {
        AnonymousClass007 r1 = new AnonymousClass007(0);
        this.A00 = r1;
        r1.A09(r3.A00);
    }
}
