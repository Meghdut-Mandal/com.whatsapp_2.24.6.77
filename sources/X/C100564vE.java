package X;

import android.util.SparseArray;
import android.view.View;
import com.whatsapp.R;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

/* renamed from: X.4vE  reason: invalid class name and case insensitive filesystem */
public final class C100564vE extends AnonymousClass6WH {
    public final SparseArray A00 = new SparseArray();

    public void A04(C1271967i r11, C140456lc r12, C140456lc r13, Object obj) {
        int visibility;
        View view = (View) obj;
        C140456lc r6 = r12;
        int i = r12.A04;
        SparseArray sparseArray = this.A00;
        if (sparseArray.indexOfKey(i) >= 0) {
            if (((C1274168f) sparseArray.get(i)) instanceof C102384zu) {
                new C118065nH(r12);
                if (C133266Xn.A05(r11, r12) != null) {
                    C140456lc.A0I(r12, 38);
                }
            } else {
                C119135pI r1 = (C119135pI) C133266Xn.A05(r11, r12);
                if (r1 == null) {
                    throw C90514aH.A0s("Extension defines a controller but none was found");
                } else if (r12.A0f(50, false) || !C116655kw.A00(r11.A02)) {
                    C135876dP r2 = r1.A01.A00;
                    View view2 = r2.A00;
                    if (view2 != null) {
                        if (r2.A06 && (view2.getParent() == null || (visibility = view2.getVisibility()) == 4 || visibility == 8)) {
                            C135876dP.A00(r2);
                        }
                        C36351kA.A1C(r2.A00, r2);
                        r2.A00 = null;
                        r2.A01 = null;
                        r2.A03 = null;
                        r2.A04 = null;
                        r2.A06 = false;
                    }
                } else {
                    AnonymousClass6KW r4 = r1.A00;
                    AnonymousClass00C.A0D(view, 0);
                    int i2 = r13.A03;
                    SparseArray sparseArray2 = r4.A01;
                    Set set = (Set) sparseArray2.get(i2);
                    if (set != null) {
                        SparseArray sparseArray3 = r4.A00;
                        AnonymousClass21Y r0 = (AnonymousClass21Y) sparseArray3.get(i2);
                        if (r0 != null) {
                            view.removeOnAttachStateChangeListener(r0);
                            sparseArray3.remove(i2);
                        }
                        if (set.size() == 1) {
                            C64603Oq r7 = (C64603Oq) r11.A01.get(R.id.bloks_host_viewpoint_manager);
                            if (r7 != null) {
                                C592933j r02 = r7.A00;
                                if (r02 == null || !r02.A01.A01) {
                                    r7.A01(view, C130836Mp.A03);
                                } else {
                                    C81273wk r22 = new C81273wk(set, r4, view, r6, r7, i2, 0);
                                    LinkedHashMap linkedHashMap = r7.A03;
                                    synchronized (linkedHashMap) {
                                        C36331k8.A1Q(r22, linkedHashMap, i2);
                                    }
                                }
                            }
                            set.remove(r12);
                            sparseArray2.remove(i2);
                        } else {
                            set.remove(r12);
                        }
                    }
                }
            }
        }
        super.A04(r11, r12, r13, obj);
    }

    public Object A02(C1271967i r4, C140456lc r5) {
        AnonymousClass6KW r2;
        int i = r5.A04;
        SparseArray sparseArray = this.A00;
        if (sparseArray.indexOfKey(i) < 0) {
            return super.A02(r4, r5);
        }
        if (((C1274168f) sparseArray.get(i)) instanceof C102384zu) {
            return new C111905d2();
        }
        if (r4.A02.A07.get()) {
            r2 = new AnonymousClass6KW(new C110055a3(), new C110065a4());
        } else {
            r2 = C102394zv.A00;
            if (r2 == null) {
                r2 = new AnonymousClass6KW(new C110055a3(), new C110065a4());
                C102394zv.A00 = r2;
            }
        }
        return new C119135pI(r2, new C116665kx());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:64:0x014b, code lost:
        if (r2 == 8) goto L_0x014d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A03(X.C1271967i r16, X.C140456lc r17, X.C140456lc r18, java.lang.Object r19) {
        /*
            r15 = this;
            r3 = r19
            r10 = r3
            android.view.View r10 = (android.view.View) r10
            r5 = r17
            int r2 = r5.A04
            android.util.SparseArray r1 = r15.A00
            int r0 = r1.indexOfKey(r2)
            r9 = r16
            r4 = r18
            if (r0 < 0) goto L_0x0044
            java.lang.Object r0 = r1.get(r2)
            X.68f r0 = (X.C1274168f) r0
            boolean r0 = r0 instanceof X.C102384zu
            if (r0 == 0) goto L_0x0048
            java.lang.Object r0 = X.C133266Xn.A05(r9, r5)
            if (r0 == 0) goto L_0x0044
            r0 = 38
            X.C140456lc.A0I(r5, r0)
            r0 = 9
            X.7sb r6 = new X.7sb
            r6.<init>(r5, r0)
            android.content.Context r2 = r9.A00
            X.7jv r2 = (X.C159787jv) r2
            r0 = r2
            X.14u r0 = (X.C225314u) r0
            androidx.appcompat.widget.Toolbar r0 = r0.A02
            if (r0 == 0) goto L_0x0044
            r2.Bwn(r6)
            r1 = 0
            r0 = 0
            r2.Bwo(r0, r6, r1)
        L_0x0044:
            super.A03(r9, r5, r4, r3)
            return
        L_0x0048:
            java.lang.Object r8 = X.C133266Xn.A05(r9, r5)
            X.5pI r8 = (X.C119135pI) r8
            if (r8 == 0) goto L_0x015b
            X.65A r2 = r9.A02
            java.util.concurrent.atomic.AtomicBoolean r0 = r2.A07
            boolean r0 = r0.get()
            boolean r6 = X.AnonymousClass000.A1P(r0)
            r1 = 50
            r0 = 0
            boolean r0 = r5.A0f(r1, r0)
            if (r0 != 0) goto L_0x010e
            boolean r0 = X.C116655kw.A00(r2)
            if (r0 == 0) goto L_0x010e
            X.6KW r12 = r8.A00
            r14 = 0
            X.AnonymousClass00C.A0D(r10, r14)
            int r13 = r4.A03
            r1 = 2131428088(0x7f0b02f8, float:1.847781E38)
            android.util.SparseArray r0 = r9.A01
            java.lang.Object r11 = r0.get(r1)
            X.3Oq r11 = (X.C64603Oq) r11
            if (r11 == 0) goto L_0x0096
            java.util.LinkedHashMap r2 = r11.A03
            monitor-enter(r2)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r13)     // Catch:{ all -> 0x0152 }
            java.lang.Object r0 = r2.get(r1)     // Catch:{ all -> 0x0152 }
            java.lang.Runnable r0 = (java.lang.Runnable) r0     // Catch:{ all -> 0x0152 }
            r2.remove(r1)     // Catch:{ all -> 0x0152 }
            monitor-exit(r2)     // Catch:{ all -> 0x0152 }
            if (r0 == 0) goto L_0x0096
            r0.run()
        L_0x0096:
            android.util.SparseArray r0 = r12.A01
            java.lang.Object r2 = r0.get(r13)
            java.util.Set r2 = (java.util.Set) r2
            if (r2 != 0) goto L_0x0109
            java.util.HashSet r2 = X.C36441kJ.A16()
            r0.append(r13, r2)
            if (r11 == 0) goto L_0x0109
            if (r6 == 0) goto L_0x00c9
            X.21Y r7 = new X.21Y
            r7.<init>(r10)
            android.util.SparseArray r0 = r12.A00
            r0.append(r13, r7)
            X.3v1 r6 = r11.A01
            java.util.List r0 = r6.A00
            r0.clear()
            X.3Ef r1 = new X.3Ef
            r1.<init>(r10, r6)
            X.3PT r0 = new X.3PT
            r0.<init>()
            X.C64603Oq.A00(r1, r7, r11, r0)
        L_0x00c9:
            java.util.WeakHashMap r0 = X.AnonymousClass3PK.A01
            java.lang.Object r1 = r0.get(r10)
            if (r1 != 0) goto L_0x00d9
            X.3PK r1 = new X.3PK
            r1.<init>(r10)
            r0.put(r10, r1)
        L_0x00d9:
            X.33j r0 = r11.A00
            if (r0 == 0) goto L_0x0102
            X.2xQ r6 = r0.A00
            monitor-enter(r6)
            java.util.Map r0 = r6.A00     // Catch:{ all -> 0x0158 }
            java.lang.Object r1 = r0.get(r1)     // Catch:{ all -> 0x0158 }
            X.6Mp r1 = (X.C130836Mp) r1     // Catch:{ all -> 0x0158 }
            if (r1 != 0) goto L_0x00ec
            X.6Mp r1 = X.C130836Mp.A03     // Catch:{ all -> 0x0158 }
        L_0x00ec:
            monitor-exit(r6)
            X.6Mp r0 = X.C130836Mp.A03
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0102
            X.3vk r8 = new X.3vk
            r8.<init>(r9, r10, r11, r12, r13, r14)
            java.util.LinkedHashMap r1 = r11.A03
            monitor-enter(r1)
            X.C36331k8.A1Q(r8, r1, r13)     // Catch:{ all -> 0x0155 }
            monitor-exit(r1)     // Catch:{ all -> 0x0155 }
            goto L_0x0109
        L_0x0102:
            X.6Mp r0 = X.AnonymousClass6KW.A00(r12, r9, r13)
            r11.A01(r10, r0)
        L_0x0109:
            r2.add(r5)
            goto L_0x0044
        L_0x010e:
            X.7ku r7 = X.C140456lc.A0E(r5)
            r0 = 36
            X.7ku r2 = r5.A0X(r0)
            if (r7 != 0) goto L_0x011e
            if (r2 != 0) goto L_0x011e
            goto L_0x0044
        L_0x011e:
            java.lang.String r1 = X.C140456lc.A0L(r5)
            if (r1 == 0) goto L_0x0044
            X.5kx r0 = r8.A01
            X.6dP r6 = r0.A00
            r6.A02 = r4
            r6.A00 = r10
            r6.A01 = r9
            r6.A05 = r1
            r6.A03 = r7
            r6.A04 = r2
            android.view.ViewTreeObserver r0 = r10.getViewTreeObserver()
            r0.addOnGlobalLayoutListener(r6)
            android.view.ViewParent r0 = r10.getParent()
            if (r0 == 0) goto L_0x014d
            int r2 = r10.getVisibility()
            r0 = 4
            if (r2 == r0) goto L_0x014d
            r1 = 8
            r0 = 1
            if (r2 != r1) goto L_0x014e
        L_0x014d:
            r0 = 0
        L_0x014e:
            r6.A06 = r0
            goto L_0x0044
        L_0x0152:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0152 }
            throw r0
        L_0x0155:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0155 }
            throw r0
        L_0x0158:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        L_0x015b:
            java.lang.String r0 = "Extension defines a controller but none was found"
            java.lang.RuntimeException r0 = X.C90514aH.A0s(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C100564vE.A03(X.67i, X.6lc, X.6lc, java.lang.Object):void");
    }

    public C100564vE(Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            C1274168f r2 = (C1274168f) it.next();
            this.A00.put(r2.A00, r2);
        }
    }
}
