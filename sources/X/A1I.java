package X;

import android.graphics.Bitmap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public final class A1I implements C160897ll {
    public AU0 A00;
    public final AnonymousClass60E A01;
    public final AnonymousClass9CG A02;
    public final AnonymousClass9M7 A03;
    public final String A04;

    public A1I(AnonymousClass60E r3, AnonymousClass9CG r4, AnonymousClass9M7 r5) {
        AnonymousClass00C.A0D(r5, 3);
        this.A02 = r4;
        this.A01 = r3;
        this.A03 = r5;
        String valueOf = String.valueOf(r4.A00.hashCode());
        this.A04 = valueOf;
        AnonymousClass00C.A0D(valueOf, 0);
        this.A00 = r5.A03.B86(valueOf);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0024, code lost:
        if (r2 == null) goto L_0x0026;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final synchronized X.C21651ATr A00() {
        /*
            r4 = this;
            monitor-enter(r4)
            X.AU0 r2 = r4.A00     // Catch:{ all -> 0x002b }
            r0 = 0
            if (r2 != 0) goto L_0x0015
            X.9M7 r3 = r4.A03     // Catch:{ all -> 0x002b }
            java.lang.String r2 = r4.A04     // Catch:{ all -> 0x002b }
            r1 = 0
            X.AnonymousClass00C.A0D(r2, r1)     // Catch:{ all -> 0x002b }
            X.A1T r1 = r3.A03     // Catch:{ all -> 0x002b }
            X.AU0 r2 = r1.B86(r2)     // Catch:{ all -> 0x002b }
            goto L_0x0024
        L_0x0015:
            monitor-enter(r2)     // Catch:{ all -> 0x002b }
            boolean r1 = r2.A02()     // Catch:{ all -> 0x0028 }
            if (r1 == 0) goto L_0x0022
            java.lang.Object r0 = r2.A01()     // Catch:{ all -> 0x0028 }
            X.ATr r0 = (X.C21651ATr) r0     // Catch:{ all -> 0x0028 }
        L_0x0022:
            monitor-exit(r2)     // Catch:{ all -> 0x002b }
            goto L_0x0026
        L_0x0024:
            if (r2 != 0) goto L_0x0015
        L_0x0026:
            monitor-exit(r4)
            return r0
        L_0x0028:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x002b }
            throw r0     // Catch:{ all -> 0x002b }
        L_0x002b:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A1I.A00():X.ATr");
    }

    public AU0 B8n(int i, int i2, int i3) {
        return null;
    }

    public AU0 BBl(int i) {
        return null;
    }

    public void BYR(AU0 au0, int i, int i2) {
    }

    public void BYS(AU0 au0, int i, int i2) {
    }

    public void clear() {
        ArrayList A032;
        ArrayList A033;
        AnonymousClass9M7 r1 = this.A03;
        String str = this.A04;
        AnonymousClass00C.A0D(str, 0);
        A1T a1t = r1.A03;
        AnonymousClass9CI r12 = new AnonymousClass9CI(str);
        synchronized (a1t) {
            A032 = a1t.A04.A03(r12);
            A033 = a1t.A03.A03(r12);
            A1T.A05(a1t, A033);
        }
        Iterator it = A033.iterator();
        while (it.hasNext()) {
            AU0 A012 = A1T.A01((AnonymousClass9MI) it.next(), a1t);
            if (A012 != null) {
                A012.close();
            }
        }
        Iterator it2 = A032.iterator();
        while (it2.hasNext()) {
            A1T.A02((AnonymousClass9MI) it2.next());
        }
        A1T.A04(a1t);
        a1t.A06();
        A033.size();
        this.A00 = null;
    }

    public boolean B3W(int i) {
        return AnonymousClass000.A1V(B9A(i));
    }

    public AU0 B9A(int i) {
        Object obj;
        C21651ATr A002 = A00();
        if (A002 == null) {
            return null;
        }
        Map map = A002.A01;
        if (map.isEmpty()) {
            obj = C90484aE.A0j(A002.A02, i);
        } else {
            Object A0r = C36371kC.A0r(map, i);
            if (A0r != null) {
                obj = A002.A02.get(A0r);
            }
            return null;
        }
        AU0 au0 = (AU0) obj;
        if (au0 == null || !au0.A02() || ((Bitmap) au0.A01()).isRecycled()) {
            return null;
        }
        return au0;
    }

    public boolean BL9() {
        Map A0D;
        C21651ATr A002 = A00();
        if (A002 != null) {
            A0D = A002.A00();
        } else {
            A0D = C000400e.A0D();
        }
        if (A0D.size() <= 1) {
            return false;
        }
        return true;
    }

    public boolean BR8(Map map) {
        Map A0D;
        C21651ATr A002 = A00();
        if (A002 != null) {
            A0D = A002.A00();
        } else {
            A0D = C000400e.A0D();
        }
        if (map.size() < A0D.size()) {
            return true;
        }
        B3Z b3z = this.A02.A00;
        AnonymousClass00C.A08(b3z);
        int duration = b3z.getDuration();
        int frameCount = b3z.getFrameCount();
        if (frameCount < 1) {
            frameCount = 1;
        }
        int i = duration / frameCount;
        long A0K = C90484aE.A0K(TimeUnit.SECONDS);
        if (i < 1) {
            i = 1;
        }
        int i2 = (int) (A0K / ((long) i));
        AU0 au0 = null;
        while (true) {
            if (i2 <= 1) {
                break;
            }
            LinkedHashMap A003 = this.A01.A00(b3z.getDuration(), map.size(), i2);
            LinkedHashMap A1G = C36431kI.A1G();
            ArrayList A0I = AnonymousClass001.A0I();
            Iterator A0y = AnonymousClass000.A0y(map);
            while (A0y.hasNext()) {
                Map.Entry A11 = AnonymousClass000.A11(A0y);
                int A08 = C165577te.A08(A11);
                Object value = A11.getValue();
                Object A0j = C90484aE.A0j(A003, A08);
                if (A0j != null) {
                    if (A1G.containsKey(A0j)) {
                        A0I.add(value);
                    } else {
                        A1G.put(A0j, value);
                    }
                }
            }
            C21651ATr aTr = new C21651ATr(A1G, A003);
            AnonymousClass9M7 r1 = this.A03;
            String str = this.A04;
            AnonymousClass00C.A0D(str, 0);
            au0 = r1.A03.B29(new AU0(AU0.A04, AU0.A05, (Object) aTr), (AnonymousClass9CH) null, str);
            if (au0 != null) {
                Iterator it = A0I.iterator();
                while (it.hasNext()) {
                    ((AU0) it.next()).close();
                }
            } else {
                i2--;
            }
        }
        this.A00 = au0;
        if (au0 == null) {
            return false;
        }
        return true;
    }
}
