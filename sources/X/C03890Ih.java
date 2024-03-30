package X;

import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;

@Deprecated
/* renamed from: X.0Ih  reason: invalid class name and case insensitive filesystem */
public abstract class C03890Ih extends AnonymousClass07S {
    public AnonymousClass09Y A00 = null;
    public AnonymousClass02E A01 = null;
    public ArrayList A02 = AnonymousClass001.A0I();
    public ArrayList A03 = AnonymousClass001.A0I();
    public boolean A04;
    public final int A05;
    public final AnonymousClass01z A06;

    public abstract AnonymousClass02E A0L(int i);

    public Parcelable A08() {
        Bundle bundle;
        ArrayList arrayList = this.A03;
        if (arrayList.size() > 0) {
            bundle = AnonymousClass001.A07();
            C08740bF[] r1 = new C08740bF[arrayList.size()];
            arrayList.toArray(r1);
            bundle.putParcelableArray("states", r1);
        } else {
            bundle = null;
        }
        int i = 0;
        while (true) {
            ArrayList arrayList2 = this.A02;
            if (i >= arrayList2.size()) {
                return bundle;
            }
            AnonymousClass02E r2 = (AnonymousClass02E) arrayList2.get(i);
            if (r2 != null && r2.A12()) {
                if (bundle == null) {
                    bundle = AnonymousClass001.A07();
                }
                this.A06.A0Y(bundle, r2, AnonymousClass000.A0r("f", AnonymousClass000.A0u(), i));
            }
            i++;
        }
    }

    public void A0C(Parcelable parcelable, ClassLoader classLoader) {
        if (parcelable != null) {
            Bundle bundle = (Bundle) parcelable;
            bundle.setClassLoader(classLoader);
            Parcelable[] parcelableArray = bundle.getParcelableArray("states");
            ArrayList arrayList = this.A03;
            arrayList.clear();
            ArrayList arrayList2 = this.A02;
            arrayList2.clear();
            if (parcelableArray != null) {
                for (Parcelable add : parcelableArray) {
                    arrayList.add(add);
                }
            }
            Iterator<String> it = bundle.keySet().iterator();
            while (it.hasNext()) {
                String A0C = AnonymousClass001.A0C(it);
                if (A0C.startsWith("f")) {
                    int parseInt = Integer.parseInt(A0C.substring(1));
                    AnonymousClass02E A0M = this.A06.A0M(bundle, A0C);
                    if (A0M == null) {
                        Log.w("FragmentStatePagerAdapt", AnonymousClass000.A0p("Bad fragment at key ", A0C, AnonymousClass000.A0u()));
                    } else {
                        while (arrayList2.size() <= parseInt) {
                            arrayList2.add((Object) null);
                        }
                        A0M.A11(false);
                        arrayList2.set(parseInt, A0M);
                    }
                }
            }
        }
    }

    public void A0E(ViewGroup viewGroup, Object obj, int i) {
        AnonymousClass02E r6 = (AnonymousClass02E) obj;
        AnonymousClass02E r0 = this.A01;
        if (r6 != r0) {
            if (r0 != null) {
                r0.A11(false);
                if (this.A05 == 1) {
                    AnonymousClass09Y r2 = this.A00;
                    if (r2 == null) {
                        r2 = new AnonymousClass09Y(this.A06);
                        this.A00 = r2;
                    }
                    r2.A0C(this.A01, AnonymousClass01P.STARTED);
                } else {
                    this.A01.A1V(false);
                }
            }
            r6.A11(true);
            if (this.A05 == 1) {
                AnonymousClass09Y r1 = this.A00;
                if (r1 == null) {
                    r1 = new AnonymousClass09Y(this.A06);
                    this.A00 = r1;
                }
                r1.A0C(r6, AnonymousClass01P.RESUMED);
            } else {
                r6.A1V(true);
            }
            this.A01 = r6;
        }
    }

    /* JADX INFO: finally extract failed */
    public void A0G(ViewGroup viewGroup) {
        AnonymousClass09Y r2 = this.A00;
        if (r2 != null) {
            if (!this.A04) {
                try {
                    this.A04 = true;
                    r2.A04();
                    this.A04 = false;
                } catch (Throwable th) {
                    this.A04 = false;
                    throw th;
                }
            }
            this.A00 = null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000c, code lost:
        if (r3 != null) goto L_0x000e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object A0I(android.view.ViewGroup r6, int r7) {
        /*
            r5 = this;
            java.util.ArrayList r4 = r5.A02
            int r0 = r4.size()
            if (r0 <= r7) goto L_0x000f
            java.lang.Object r3 = r4.get(r7)
            if (r3 == 0) goto L_0x000f
        L_0x000e:
            return r3
        L_0x000f:
            X.09Y r0 = r5.A00
            if (r0 != 0) goto L_0x001c
            X.01z r1 = r5.A06
            X.09Y r0 = new X.09Y
            r0.<init>(r1)
            r5.A00 = r0
        L_0x001c:
            X.02E r3 = r5.A0L(r7)
            java.util.ArrayList r1 = r5.A03
            int r0 = r1.size()
            if (r0 <= r7) goto L_0x0033
            java.lang.Object r0 = r1.get(r7)
            X.0bF r0 = (X.C08740bF) r0
            if (r0 == 0) goto L_0x0033
            r3.A0x(r0)
        L_0x0033:
            int r0 = r4.size()
            if (r0 > r7) goto L_0x003e
            r0 = 0
            r4.add(r0)
            goto L_0x0033
        L_0x003e:
            r0 = 0
            r3.A11(r0)
            int r2 = r5.A05
            if (r2 != 0) goto L_0x0049
            r3.A1V(r0)
        L_0x0049:
            r4.set(r7, r3)
            X.09Y r1 = r5.A00
            int r0 = r6.getId()
            r1.A0A(r3, r0)
            r0 = 1
            if (r2 != r0) goto L_0x000e
            X.09Y r1 = r5.A00
            X.01P r0 = X.AnonymousClass01P.STARTED
            r1.A0C(r3, r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03890Ih.A0I(android.view.ViewGroup, int):java.lang.Object");
    }

    public void A0J(ViewGroup viewGroup, Object obj, int i) {
        ArrayList arrayList;
        C08740bF r0;
        AnonymousClass02E r5 = (AnonymousClass02E) obj;
        if (this.A00 == null) {
            this.A00 = new AnonymousClass09Y(this.A06);
        }
        while (true) {
            arrayList = this.A03;
            if (arrayList.size() > i) {
                break;
            }
            arrayList.add((Object) null);
        }
        if (r5.A12()) {
            r0 = this.A06.A0K(r5);
        } else {
            r0 = null;
        }
        arrayList.set(i, r0);
        this.A02.set(i, (Object) null);
        this.A00.A08(r5);
        if (r5.equals(this.A01)) {
            this.A01 = null;
        }
    }

    public boolean A0K(View view, Object obj) {
        if (((AnonymousClass02E) obj).A0F == view) {
            return true;
        }
        return false;
    }

    public C03890Ih(AnonymousClass01z r3, int i) {
        this.A06 = r3;
        this.A05 = i;
    }

    public void A0D(ViewGroup viewGroup) {
        if (viewGroup.getId() == -1) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("ViewPager with adapter ");
            A0u.append(this);
            throw AnonymousClass000.A0g(" requires a view id", A0u);
        }
    }
}
