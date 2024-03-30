package X;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: X.01N  reason: invalid class name */
public class AnonymousClass01N extends AnonymousClass01M {
    public int A00 = 0;
    public AnonymousClass01O A01 = new AnonymousClass01O();
    public AnonymousClass01P A02;
    public ArrayList A03 = new ArrayList();
    public boolean A04 = false;
    public boolean A05 = false;
    public final WeakReference A06;

    private AnonymousClass01P A00(AnonymousClass00N r5) {
        C003201h r0;
        AnonymousClass01P r3;
        AnonymousClass01O r1 = this.A01;
        if (r1.A00.containsKey(r5)) {
            r0 = ((C003201h) r1.A00.get(r5)).A01;
        } else {
            r0 = null;
        }
        AnonymousClass01P r2 = null;
        if (r0 != null) {
            r3 = ((C003001f) r0.getValue()).A01;
        } else {
            r3 = null;
        }
        ArrayList arrayList = this.A03;
        if (!arrayList.isEmpty()) {
            r2 = (AnonymousClass01P) arrayList.get(arrayList.size() - 1);
        }
        AnonymousClass01P r12 = this.A02;
        if (r3 != null && r3.compareTo(r12) < 0) {
            r12 = r3;
        }
        if (r2 == null || r2.compareTo(r12) >= 0) {
            return r12;
        }
        return r2;
    }

    private void A01() {
        AnonymousClass05R r0;
        AnonymousClass01P r1;
        AnonymousClass012 r3 = (AnonymousClass012) this.A06.get();
        if (r3 == null) {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is alreadygarbage collected. It is too late to change lifecycle state.");
        }
        while (true) {
            AnonymousClass01O r5 = this.A01;
            boolean z = true;
            if (!(r5.A00 == 0 || (((C003001f) r5.A02.getValue()).A01 == (r1 = ((C003001f) r5.A01.getValue()).A01) && this.A02 == r1))) {
                z = false;
            }
            this.A05 = false;
            if (!z) {
                if (this.A02.compareTo(((C003001f) r5.A02.getValue()).A01) < 0) {
                    AnonymousClass01O r2 = this.A01;
                    AnonymousClass0G2 r7 = new AnonymousClass0G2(r2.A01, r2.A02);
                    r2.A03.put(r7, false);
                    while (r7.hasNext() && !this.A05) {
                        Map.Entry entry = (Map.Entry) r7.next();
                        C003001f r52 = (C003001f) entry.getValue();
                        while (r52.A01.compareTo(this.A02) > 0 && !this.A05) {
                            AnonymousClass01O r02 = this.A01;
                            if (!r02.A00.containsKey(entry.getKey())) {
                                continue;
                                break;
                            }
                            AnonymousClass01P r4 = r52.A01;
                            AnonymousClass05R A002 = AnonymousClass05R.A00(r4);
                            if (A002 != null) {
                                AnonymousClass01P A012 = A002.A01();
                                ArrayList arrayList = this.A03;
                                arrayList.add(A012);
                                r52.A00(A002, r3);
                                arrayList.remove(arrayList.size() - 1);
                            } else {
                                StringBuilder sb = new StringBuilder();
                                sb.append("no event down from ");
                                sb.append(r4);
                                throw new IllegalStateException(sb.toString());
                            }
                        }
                    }
                }
                C003201h r22 = this.A01.A01;
                if (!this.A05 && r22 != null && this.A02.compareTo(((C003001f) r22.getValue()).A01) > 0) {
                    AnonymousClass01O r03 = this.A01;
                    AnonymousClass05S r72 = new AnonymousClass05S(r03);
                    r03.A03.put(r72, false);
                    while (r72.hasNext() && !this.A05) {
                        Map.Entry entry2 = (Map.Entry) r72.next();
                        C003001f r53 = (C003001f) entry2.getValue();
                        while (r53.A01.compareTo(this.A02) < 0 && !this.A05) {
                            AnonymousClass01O r04 = this.A01;
                            if (!r04.A00.containsKey(entry2.getKey())) {
                                continue;
                                break;
                            }
                            AnonymousClass01P r42 = r53.A01;
                            ArrayList arrayList2 = this.A03;
                            arrayList2.add(r42);
                            int ordinal = r42.ordinal();
                            if (ordinal == 2) {
                                r0 = AnonymousClass05R.ON_START;
                            } else if (ordinal == 3) {
                                r0 = AnonymousClass05R.ON_RESUME;
                            } else if (ordinal != 1) {
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("no event up from ");
                                sb2.append(r42);
                                throw new IllegalStateException(sb2.toString());
                            } else {
                                r0 = AnonymousClass05R.ON_CREATE;
                            }
                            r53.A00(r0, r3);
                            arrayList2.remove(arrayList2.size() - 1);
                        }
                    }
                }
            } else {
                return;
            }
        }
    }

    private void A02(AnonymousClass01P r4) {
        AnonymousClass01P r2 = this.A02;
        if (r2 == r4) {
            return;
        }
        if (r2 == AnonymousClass01P.INITIALIZED && r4 == AnonymousClass01P.DESTROYED) {
            StringBuilder sb = new StringBuilder();
            sb.append("no event down from ");
            sb.append(r2);
            throw new IllegalStateException(sb.toString());
        }
        this.A02 = r4;
        if (this.A04 || this.A00 != 0) {
            this.A05 = true;
            return;
        }
        this.A04 = true;
        A01();
        this.A04 = false;
        if (this.A02 == AnonymousClass01P.DESTROYED) {
            this.A01 = new AnonymousClass01O();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002c, code lost:
        if (r8.A04 != false) goto L_0x002e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A04(X.AnonymousClass00N r9) {
        /*
            r8 = this;
            java.lang.String r0 = "addObserver"
            A03(r0)
            X.01P r1 = r8.A02
            X.01P r0 = X.AnonymousClass01P.DESTROYED
            if (r1 == r0) goto L_0x000d
            X.01P r0 = X.AnonymousClass01P.INITIALIZED
        L_0x000d:
            X.01f r6 = new X.01f
            r6.<init>(r0, r9)
            X.01O r0 = r8.A01
            java.lang.Object r0 = r0.A02(r9, r6)
            if (r0 != 0) goto L_0x0098
            java.lang.ref.WeakReference r0 = r8.A06
            java.lang.Object r5 = r0.get()
            X.012 r5 = (X.AnonymousClass012) r5
            if (r5 == 0) goto L_0x0098
            int r0 = r8.A00
            r4 = 1
            if (r0 != 0) goto L_0x002e
            boolean r0 = r8.A04
            r7 = 0
            if (r0 == 0) goto L_0x002f
        L_0x002e:
            r7 = 1
        L_0x002f:
            X.01P r1 = r8.A00(r9)
            int r0 = r8.A00
            int r0 = r0 + 1
            r8.A00 = r0
        L_0x0039:
            X.01P r0 = r6.A01
            int r0 = r0.compareTo(r1)
            if (r0 >= 0) goto L_0x008e
            X.01O r0 = r8.A01
            java.util.HashMap r0 = r0.A00
            boolean r0 = r0.containsKey(r9)
            if (r0 == 0) goto L_0x008e
            X.01P r3 = r6.A01
            java.util.ArrayList r2 = r8.A03
            r2.add(r3)
            int r1 = r3.ordinal()
            r0 = 2
            if (r1 == r0) goto L_0x0078
            r0 = 3
            if (r1 == r0) goto L_0x0075
            if (r1 == r4) goto L_0x007b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "no event up from "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0075:
            X.05R r0 = X.AnonymousClass05R.ON_RESUME
            goto L_0x007d
        L_0x0078:
            X.05R r0 = X.AnonymousClass05R.ON_START
            goto L_0x007d
        L_0x007b:
            X.05R r0 = X.AnonymousClass05R.ON_CREATE
        L_0x007d:
            r6.A00(r0, r5)
            int r0 = r2.size()
            int r0 = r0 + -1
            r2.remove(r0)
            X.01P r1 = r8.A00(r9)
            goto L_0x0039
        L_0x008e:
            if (r7 != 0) goto L_0x0093
            r8.A01()
        L_0x0093:
            int r0 = r8.A00
            int r0 = r0 - r4
            r8.A00 = r0
        L_0x0098:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass01N.A04(X.00N):void");
    }

    public void A05(AnonymousClass00N r2) {
        A03("removeObserver");
        this.A01.A01(r2);
    }

    public void A06(AnonymousClass05R r2) {
        A03("handleLifecycleEvent");
        A02(r2.A01());
    }

    public void A07(AnonymousClass01P r2) {
        A03("setCurrentState");
        A02(r2);
    }

    public AnonymousClass01N(AnonymousClass012 r2) {
        this.A06 = new WeakReference(r2);
        this.A02 = AnonymousClass01P.INITIALIZED;
    }

    public static void A03(String str) {
        if (!C002601b.A00().A03()) {
            StringBuilder sb = new StringBuilder();
            sb.append("Method ");
            sb.append(str);
            sb.append(" must be called on the main thread");
            throw new IllegalStateException(sb.toString());
        }
    }
}
