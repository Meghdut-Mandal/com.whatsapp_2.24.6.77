package X;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;

public class A1T implements B5Z, C22871AxQ {
    public AnonymousClass9N3 A00;
    public long A01;
    public final Map A02 = new WeakHashMap();
    public final AnonymousClass9YI A03;
    public final AnonymousClass9YI A04;
    public final C22866AxL A05;
    public final C22783Avu A06;
    public final C22872AxR A07;

    private synchronized AU0 A00(AnonymousClass9MI r6) {
        AU0 au0;
        synchronized (this) {
            Objects.requireNonNull(r6);
            AnonymousClass6GV.A01(AnonymousClass000.A1Q(r6.A01 ? 1 : 0));
            r6.A00++;
            Object A012 = r6.A02.A01();
            A11 a11 = new A11(r6, this);
            C22867AxM axM = AU0.A04;
            au0 = null;
            if (A012 != null) {
                au0 = new AU0(axM, (C22868AxN) a11, A012);
            }
        }
        return au0;
    }

    public static synchronized AU0 A01(AnonymousClass9MI r1, A1T a1t) {
        AU0 au0;
        synchronized (a1t) {
            Objects.requireNonNull(r1);
            if (!r1.A01 || r1.A00 != 0) {
                au0 = null;
            } else {
                au0 = r1.A02;
            }
        }
        return au0;
    }

    private synchronized void A03(AnonymousClass9MI r3) {
        Objects.requireNonNull(r3);
        AnonymousClass6GV.A01(AnonymousClass000.A1Q(r3.A01 ? 1 : 0));
        r3.A01 = true;
    }

    public static synchronized void A04(A1T a1t) {
        synchronized (a1t) {
            if (a1t.A01 + a1t.A00.A05 <= SystemClock.uptimeMillis()) {
                a1t.A01 = SystemClock.uptimeMillis();
                AnonymousClass9N3 r1 = (AnonymousClass9N3) a1t.A05.get();
                AnonymousClass6GV.A00(r1, "mMemoryCacheParamsSupplier returned null");
                a1t.A00 = r1;
            }
        }
    }

    public static synchronized void A05(A1T a1t, ArrayList arrayList) {
        synchronized (a1t) {
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    a1t.A03((AnonymousClass9MI) it.next());
                }
            }
        }
    }

    public void A06() {
        ArrayList arrayList;
        Object obj;
        synchronized (this) {
            AnonymousClass9N3 r0 = this.A00;
            int i = r0.A03;
            int i2 = r0.A00;
            AnonymousClass9YI r7 = this.A03;
            int A002 = r7.A00();
            AnonymousClass9YI r4 = this.A04;
            int min = Math.min(i, i2 - (A002 - r4.A00()));
            AnonymousClass9N3 r02 = this.A00;
            int min2 = Math.min(r02.A04, r02.A02 - (r7.A01() - r4.A01()));
            int max = Math.max(min, 0);
            int max2 = Math.max(min2, 0);
            if (r4.A00() > max || r4.A01() > max2) {
                arrayList = AnonymousClass001.A0I();
                while (true) {
                    if (r4.A00() > max || r4.A01() > max2) {
                        synchronized (r4) {
                            try {
                                LinkedHashMap linkedHashMap = r4.A02;
                                if (linkedHashMap.isEmpty()) {
                                    obj = null;
                                } else {
                                    obj = C90484aE.A0s(linkedHashMap).next();
                                }
                            } catch (Throwable th) {
                                th = th;
                            }
                        }
                        if (obj == null) {
                            Object[] A0M = AnonymousClass001.A0M();
                            AnonymousClass000.A1L(A0M, r4.A00(), 0);
                            AnonymousClass000.A1L(A0M, r4.A01(), 1);
                            th = AnonymousClass001.A09(String.format("key is null, but exclusiveEntries count: %d, size: %d", A0M));
                            break;
                        }
                        r4.A02(obj);
                        arrayList.add((AnonymousClass9MI) r7.A02(obj));
                    }
                }
                throw th;
            }
            arrayList = null;
            A05(this, arrayList);
        }
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                AU0 A012 = A01((AnonymousClass9MI) it.next(), this);
                if (A012 != null) {
                    A012.close();
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                A02((AnonymousClass9MI) it2.next());
            }
        }
    }

    public AU0 B29(AU0 au0, AnonymousClass9CH r12, Object obj) {
        AnonymousClass9MI r4;
        AU0 au02;
        AU0 au03;
        Objects.requireNonNull(obj);
        Objects.requireNonNull(au0);
        A04(this);
        synchronized (this) {
            AnonymousClass9YI r6 = this.A04;
            r4 = (AnonymousClass9MI) r6.A02(obj);
            AnonymousClass9YI r3 = this.A03;
            AnonymousClass9MI r0 = (AnonymousClass9MI) r3.A02(obj);
            au02 = null;
            if (r0 != null) {
                A03(r0);
                au03 = A01(r0, this);
            } else {
                au03 = null;
            }
            int BHf = this.A07.BHf(au0.A01());
            if (BHf <= this.A00.A01) {
                if (r3.A00() - r6.A00() <= this.A00.A00 - 1) {
                    if (r3.A01() - r6.A01() <= this.A00.A02 - BHf) {
                        AnonymousClass9MI r02 = new AnonymousClass9MI(au0, r12, obj);
                        r3.A04(obj, r02);
                        au02 = A00(r02);
                    }
                }
            }
        }
        if (au03 != null) {
            au03.close();
        }
        A02(r4);
        A06();
        return au02;
    }

    public static void A02(AnonymousClass9MI r2) {
        AnonymousClass9CH r0;
        if (r2 != null && (r0 = r2.A03) != null) {
            Object obj = r2.A04;
            AnonymousClass9LI r1 = r0.A00;
            synchronized (r1) {
                r1.A03.remove(obj);
            }
        }
    }

    public A1T(C22866AxL axL, C22783Avu avu, C22872AxR axR) {
        this.A07 = axR;
        this.A04 = new AnonymousClass9YI(new A1X(this, axR));
        this.A03 = new AnonymousClass9YI(new A1X(this, axR));
        this.A06 = avu;
        this.A05 = axL;
        Object obj = axL.get();
        AnonymousClass6GV.A00(obj, "mMemoryCacheParamsSupplier returned null");
        this.A00 = (AnonymousClass9N3) obj;
        this.A01 = SystemClock.uptimeMillis();
    }

    public AU0 B86(Object obj) {
        AnonymousClass9MI r2;
        Object obj2;
        AU0 au0;
        Objects.requireNonNull(obj);
        synchronized (this) {
            r2 = (AnonymousClass9MI) this.A04.A02(obj);
            AnonymousClass9YI r1 = this.A03;
            synchronized (r1) {
                obj2 = r1.A02.get(obj);
            }
            AnonymousClass9MI r0 = (AnonymousClass9MI) obj2;
            if (r0 != null) {
                au0 = A00(r0);
            } else {
                au0 = null;
            }
        }
        A02(r2);
        A04(this);
        A06();
        return au0;
    }
}
