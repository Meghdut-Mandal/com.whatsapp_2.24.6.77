package X;

/* renamed from: X.83P  reason: invalid class name */
public class AnonymousClass83P extends AnonymousClass103 {
    public final AnonymousClass007 mMetricsMap = new AnonymousClass007(0);
    public final AnonymousClass007 mMetricsValid = new AnonymousClass007(0);

    public static boolean A00(AnonymousClass007 r7, AnonymousClass007 r8) {
        boolean equals;
        if (r7 != r8) {
            int size = r7.size();
            if (size == r8.size()) {
                int i = 0;
                while (i < size) {
                    Object A04 = r7.A04(i);
                    Object A06 = r7.A06(i);
                    Object obj = r8.get(A04);
                    if (A06 != null) {
                        equals = A06.equals(obj);
                    } else if (obj == null) {
                        equals = r8.containsKey(A04);
                    }
                    if (equals) {
                        i++;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            AnonymousClass83P r5 = (AnonymousClass83P) obj;
            if (!A00(this.mMetricsValid, r5.mMetricsValid) || !A00(this.mMetricsMap, r5.mMetricsMap)) {
                return false;
            }
        }
        return true;
    }

    public /* bridge */ /* synthetic */ AnonymousClass103 A01(AnonymousClass103 r1) {
        A04((AnonymousClass83P) r1);
        return this;
    }

    public /* bridge */ /* synthetic */ AnonymousClass103 A02(AnonymousClass103 r8, AnonymousClass103 r9) {
        boolean z;
        Boolean bool;
        AnonymousClass83P r82 = (AnonymousClass83P) r8;
        AnonymousClass83P r92 = (AnonymousClass83P) r9;
        if (r92 != null) {
            if (r82 == null) {
                r92.A04(this);
            } else {
                int size = this.mMetricsMap.size();
                for (int i = 0; i < size; i++) {
                    Class cls = (Class) this.mMetricsMap.A04(i);
                    if (!A05(cls) || !r82.A05(cls)) {
                        z = false;
                    } else {
                        z = true;
                        AnonymousClass103 A03 = r92.A03(cls);
                        if (A03 != null) {
                            A03(cls).A02(r82.A03(cls), A03);
                        }
                    }
                    AnonymousClass007 r1 = r92.mMetricsValid;
                    if (z) {
                        bool = Boolean.TRUE;
                    } else {
                        bool = Boolean.FALSE;
                    }
                    r1.put(cls, bool);
                }
            }
            return r92;
        }
        throw AnonymousClass001.A08("CompositeMetrics doesn't support nullable results");
    }

    public AnonymousClass103 A03(Class cls) {
        return (AnonymousClass103) cls.cast(this.mMetricsMap.get(cls));
    }

    public void A04(AnonymousClass83P r6) {
        AnonymousClass007 r1;
        Boolean bool;
        int size = this.mMetricsMap.size();
        for (int i = 0; i < size; i++) {
            Class cls = (Class) this.mMetricsMap.A04(i);
            AnonymousClass103 A03 = r6.A03(cls);
            if (A03 != null) {
                A03(cls).A01(A03);
                boolean A05 = r6.A05(cls);
                r1 = this.mMetricsValid;
                if (A05) {
                    bool = Boolean.TRUE;
                }
                bool = Boolean.FALSE;
            } else {
                r1 = this.mMetricsValid;
                bool = Boolean.FALSE;
            }
            r1.put(cls, bool);
        }
    }

    public boolean A05(Class cls) {
        Boolean bool = (Boolean) this.mMetricsValid.get(cls);
        if (bool == null || !bool.booleanValue()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36401kF.A02(this.mMetricsValid, C36391kE.A0A(this.mMetricsMap));
    }

    public String toString() {
        String str;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Composite Metrics{\n");
        int size = this.mMetricsMap.size();
        for (int i = 0; i < size; i++) {
            A0u.append(this.mMetricsMap.A06(i));
            if (A05((Class) this.mMetricsMap.A04(i))) {
                str = " [valid]";
            } else {
                str = " [invalid]";
            }
            A0u.append(str);
            A0u.append(10);
        }
        return AnonymousClass000.A0q("}", A0u);
    }
}
