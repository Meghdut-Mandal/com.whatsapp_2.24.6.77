package X;

import android.content.Context;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.6Tu  reason: invalid class name and case insensitive filesystem */
public abstract class C132456Tu {
    public Map A00;
    public List A01;
    public final Integer A02;
    public final List A03;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C132456Tu(java.lang.Integer r2) {
        /*
            r1 = this;
            r0 = 1
            X.AnonymousClass00C.A0D(r2, r0)
            X.09w r0 = X.C023409w.A00
            r1.<init>(r2, r0, r0, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C132456Tu.<init>(java.lang.Integer):void");
    }

    public void A0D(Context context, C120895sG r10, AnonymousClass68E r11, Object obj, Object obj2) {
        Object obj3;
        C36331k8.A1G(r10, 3, r11);
        List list = this.A01;
        if (list != null) {
            boolean A032 = r11.A03();
            if (A032) {
                A05(r11, ":unmount-optional", A03(this));
            }
            int A07 = C36431kI.A07(list);
            if (A07 >= 0) {
                while (true) {
                    int i = A07 - 1;
                    Object obj4 = list.get(A07);
                    AnonymousClass00C.A0E(obj4, "null cannot be cast to non-null type com.facebook.rendercore.RenderUnit.DelegateBinder<*, in MOUNT_CONTENT of com.facebook.rendercore.RenderUnit.unmountBinders$lambda$5, kotlin.Any>");
                    C1257261a r2 = (C1257261a) obj4;
                    A04(r11, r2, A032 ? 1 : 0);
                    Class<?> cls = r2.A00.getClass();
                    AnonymousClass00C.A0D(cls, 0);
                    Map map = r10.A01;
                    if (map != null) {
                        obj3 = map.remove(cls);
                    } else {
                        obj3 = null;
                    }
                    r2.A01(context, obj, obj2, obj3);
                    if (A032) {
                        r11.A01();
                    }
                    if (i < 0) {
                        break;
                    }
                    A07 = i;
                }
            }
            if (A032) {
                r11.A01();
            }
        }
        boolean A033 = r11.A03();
        List list2 = this.A03;
        if (list2 != null) {
            if (A033) {
                A05(r11, ":unmount-fixed", A03(this));
            }
            int A072 = C36431kI.A07(list2);
            if (A072 >= 0) {
                while (true) {
                    int i2 = A072 - 1;
                    Object obj5 = list2.get(A072);
                    AnonymousClass00C.A0E(obj5, "null cannot be cast to non-null type com.facebook.rendercore.RenderUnit.DelegateBinder<*, in MOUNT_CONTENT of com.facebook.rendercore.RenderUnit, kotlin.Any>");
                    C1257261a r3 = (C1257261a) obj5;
                    A04(r11, r3, A033 ? 1 : 0);
                    Object[] objArr = r10.A02;
                    Object obj6 = null;
                    if (objArr != null) {
                        Object obj7 = objArr[A072];
                        objArr[A072] = null;
                        obj6 = obj7;
                    }
                    r3.A01(context, obj, obj2, obj6);
                    if (A033) {
                        r11.A01();
                    }
                    if (i2 < 0) {
                        break;
                    }
                    A072 = i2;
                }
            }
            if (A033) {
                r11.A01();
            }
        }
    }

    public void A0E(C1257261a r6) {
        AnonymousClass00C.A0D(r6, 0);
        List list = this.A01;
        List list2 = list;
        if (list == null) {
            list = AnonymousClass001.A0I();
        }
        if (list2 == null) {
            this.A01 = list;
            if (this.A00 == null) {
                this.A00 = AnonymousClass001.A0J();
            } else {
                throw AnonymousClass001.A09("Binder Map and Binder List out of sync!");
            }
        }
        Map map = this.A00;
        if (map != null) {
            Class<?> cls = r6.A00.getClass();
            if (map.put(cls, r6) != null) {
                int A07 = C36431kI.A07(list);
                if (A07 >= 0) {
                    while (true) {
                        int i = A07 - 1;
                        if (!AnonymousClass00C.A0J(((C1257261a) list.get(A07)).A00.getClass(), cls)) {
                            if (i < 0) {
                                break;
                            }
                            A07 = i;
                        } else {
                            list.remove(A07);
                            break;
                        }
                    }
                }
                throw AnonymousClass001.A09("Binder Map and Binder List out of sync!");
            }
            list.add(r6);
        }
    }

    public static StringBuilder A03(C132456Tu r2) {
        StringBuilder sb = new StringBuilder();
        sb.append(r2.A08());
        return sb;
    }

    public static void A04(AnonymousClass68E r1, C1257261a r2, int i) {
        if (i != 0) {
            r1.A02(A02(r2.A00.BB1()));
        }
    }

    public long A06() {
        if (this instanceof C98194r2) {
            return ((C98194r2) this).A08;
        }
        if (this instanceof C98174r0) {
            return ((C98174r0) this).A01;
        }
        if (this instanceof C98184r1) {
            return ((C98184r1) this).A00;
        }
        if (this instanceof C98204r3) {
            return ((C98204r3) this).A0C;
        }
        if (this instanceof C98144qx) {
            return ((C98144qx) this).A00.A00;
        }
        if (this instanceof C98154qy) {
            return ((C98154qy) this).A00;
        }
        return 0;
    }

    public C161287mV A07() {
        if (this instanceof C98194r2) {
            return (C98194r2) this;
        }
        if (this instanceof C98174r0) {
            return (C98174r0) this;
        }
        if (this instanceof C98184r1) {
            return (C98184r1) this;
        }
        if (this instanceof C98204r3) {
            return (C98204r3) this;
        }
        if (this instanceof C98144qx) {
            return ((C98144qx) this).A00.A01;
        }
        if (this instanceof C98154qy) {
            return ((C98154qy) this).A01;
        }
        return ((C98164qz) this).A00;
    }

    public String A08() {
        if (this instanceof C98144qx) {
            return AnonymousClass5YX.A00(((C98144qx) this).A00.A01.BG1());
        }
        if (this instanceof C98154qy) {
            return ((C98154qy) this).A04;
        }
        return AnonymousClass5YX.A01(this);
    }

    public void A0A(Context context, C120895sG r8, AnonymousClass68E r9, Object obj, Object obj2) {
        C120895sG r2 = r8;
        AnonymousClass68E r3 = r9;
        if (this instanceof C98154qy) {
            C36331k8.A1G(r8, 3, r9);
            ((C98154qy) this).A02.A0A(context, r2, r3, obj, obj2);
            return;
        }
        C36331k8.A1G(r8, 3, r9);
    }

    public void A0B(Context context, C120895sG r8, AnonymousClass68E r9, Object obj, Object obj2) {
        C120895sG r2 = r8;
        AnonymousClass68E r3 = r9;
        if (this instanceof C98154qy) {
            C36331k8.A1G(r8, 3, r9);
            ((C98154qy) this).A02.A0B(context, r2, r3, obj, obj2);
            return;
        }
        C36331k8.A1G(r8, 3, r9);
    }

    public static final String A02(String str) {
        if (str.length() > 127) {
            return C36431kI.A16(0, 127, str);
        }
        return str;
    }

    public static void A05(AnonymousClass68E r1, String str, StringBuilder sb) {
        sb.append(str);
        r1.A02(A02(sb.toString()));
    }

    public void A0C(Context context, C120895sG r10, AnonymousClass68E r11, Object obj, Object obj2) {
        Object[] objArr;
        C36321k7.A0y(obj, r10);
        AnonymousClass00C.A0D(r11, 4);
        boolean A032 = r11.A03();
        List list = this.A03;
        if (list != null) {
            int size = list.size();
            if (A032) {
                A05(r11, ":mount-fixed", A03(this));
            }
            for (int i = 0; i < size; i++) {
                C1257261a r0 = (C1257261a) list.get(i);
                A04(r11, r0, A032 ? 1 : 0);
                Object B1l = r0.A00.B1l(context, obj, r0.A01, obj2);
                if (B1l != null) {
                    Object[] objArr2 = r10.A02;
                    if (objArr2 == null) {
                        objArr = new Object[size];
                    } else {
                        objArr = objArr2;
                    }
                    objArr[i] = B1l;
                    if (objArr2 == null) {
                        r10.A02 = objArr;
                    }
                }
                if (A032) {
                    r11.A01();
                }
            }
            if (A032) {
                r11.A01();
            }
        }
        List list2 = this.A01;
        boolean A033 = r11.A03();
        if (list2 != null) {
            int size2 = list2.size();
            if (A033) {
                A05(r11, ":mount-optional", A03(this));
            }
            for (int i2 = 0; i2 < size2; i2++) {
                C1257261a r02 = (C1257261a) list2.get(i2);
                A04(r11, r02, A033 ? 1 : 0);
                C160347kr r1 = r02.A00;
                Object B1l2 = r1.B1l(context, obj, r02.A01, obj2);
                Class<?> cls = r1.getClass();
                AnonymousClass00C.A0D(cls, 1);
                if (B1l2 != null) {
                    Map map = r10.A01;
                    if (map == null) {
                        map = new LinkedHashMap(size2);
                    }
                    map.put(cls, B1l2);
                    if (r10.A01 == null) {
                        r10.A01 = map;
                    }
                }
                if (A033) {
                    r11.A01();
                }
            }
            if (A033) {
                r11.A01();
            }
        }
    }

    public final Integer BGe() {
        return this.A02;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x003d, code lost:
        if (r9.isEmpty() != false) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x01da, code lost:
        if (r10 != false) goto L_0x01dc;
     */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x021d  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0228  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x02c5  */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x02d5  */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x030d  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x0320  */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x0359  */
    /* JADX WARNING: Removed duplicated region for block: B:207:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x01eb A[LOOP:4: B:92:0x01eb->B:99:0x0217, LOOP_START, PHI: r4 
      PHI: (r4v6 int) = (r4v1 int), (r4v8 int) binds: [B:91:0x01e9, B:99:0x0217] A[DONT_GENERATE, DONT_INLINE]] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A09(android.content.Context r28, X.C120895sG r29, X.C123655wr r30, X.AnonymousClass68E r31, X.C132456Tu r32, java.lang.Object r33, java.lang.Object r34, java.lang.Object r35, boolean r36) {
        /*
            r27 = this;
            r0 = 6
            r14 = r29
            r13 = r31
            X.C36361kB.A1J(r14, r0, r13)
            boolean r10 = r13.A03()
            r0 = 0
            java.util.ArrayList r25 = X.C36441kJ.A14(r0)
            java.util.ArrayList r21 = X.C36441kJ.A14(r0)
            r26 = r27
            r0 = r26
            java.util.List r0 = r0.A01
            int r0 = X.C90484aE.A0F(r0)
            java.util.ArrayList r24 = X.C36441kJ.A14(r0)
            r1 = r32
            java.util.List r0 = r1.A01
            int r0 = X.C90484aE.A0F(r0)
            java.util.ArrayList r20 = X.C36441kJ.A14(r0)
            java.util.List r9 = r1.A03
            r0 = r26
            java.util.List r8 = r0.A03
            r5 = 0
            if (r9 == 0) goto L_0x003f
            boolean r2 = r9.isEmpty()
            r0 = 0
            if (r2 == 0) goto L_0x0040
        L_0x003f:
            r0 = 1
        L_0x0040:
            r22 = 0
            r12 = r34
            r11 = r35
            if (r0 == 0) goto L_0x00b9
            if (r8 == 0) goto L_0x0050
            boolean r0 = r8.isEmpty()
            if (r0 == 0) goto L_0x00b9
        L_0x0050:
            java.util.List r0 = r1.A01
            r19 = r0
            r0 = r26
            java.util.List r7 = r0.A01
            java.util.Map r0 = r1.A00
            r18 = r0
            r6 = 0
            r15 = 1
            if (r19 == 0) goto L_0x016a
            boolean r0 = r19.isEmpty()
            if (r0 != 0) goto L_0x016a
            if (r7 == 0) goto L_0x0172
            boolean r0 = r7.isEmpty()
            if (r0 != 0) goto L_0x0172
            int r0 = r7.size()
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>(r0)
            int r17 = r7.size()
            r4 = 0
        L_0x007c:
            r0 = r17
            if (r4 >= r0) goto L_0x013e
            java.lang.Object r3 = r7.get(r4)
            X.61a r3 = (X.C1257261a) r3
            X.7kr r0 = r3.A00
            java.lang.Class r16 = r0.getClass()
            if (r18 == 0) goto L_0x00b1
            r1 = r18
            r0 = r16
            java.lang.Object r1 = r1.get(r0)
            X.61a r1 = (X.C1257261a) r1
            if (r1 == 0) goto L_0x00b1
            X.7kr r0 = r3.A00
            r2 = r0
            java.lang.Object r0 = r1.A01
            r1 = r0
            java.lang.Object r0 = r3.A01
            boolean r2 = r2.BtZ(r1, r0, r12, r11)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r2)
            r0 = r16
            r5.put(r0, r1)
            if (r2 == 0) goto L_0x00b6
        L_0x00b1:
            r0 = r24
            r0.add(r3)
        L_0x00b6:
            int r4 = r4 + 1
            goto L_0x007c
        L_0x00b9:
            r2 = 0
            if (r9 == 0) goto L_0x0106
            int r0 = r9.size()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
        L_0x00c4:
            if (r8 == 0) goto L_0x0104
            int r0 = r8.size()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x00ce:
            boolean r0 = X.AnonymousClass00C.A0J(r3, r0)
            if (r0 != 0) goto L_0x0108
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Current and new fixed Mount Binders are of sync: \ncurrentFixedBinders.size() = "
            r1.append(r0)
            if (r9 == 0) goto L_0x0102
            int r0 = r9.size()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x00e7:
            r1.append(r0)
            java.lang.String r0 = "\nnewFixedBinders.size() = "
            r1.append(r0)
            if (r8 == 0) goto L_0x00f9
            int r0 = r8.size()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
        L_0x00f9:
            java.lang.String r0 = X.AnonymousClass000.A0o(r2, r1)
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)
            throw r0
        L_0x0102:
            r0 = r2
            goto L_0x00e7
        L_0x0104:
            r0 = r2
            goto L_0x00ce
        L_0x0106:
            r3 = r2
            goto L_0x00c4
        L_0x0108:
            if (r9 == 0) goto L_0x0050
            if (r8 == 0) goto L_0x0050
            int r4 = r9.size()
        L_0x0110:
            if (r5 >= r4) goto L_0x0050
            java.lang.Object r2 = r9.get(r5)
            java.lang.String r3 = "null cannot be cast to non-null type com.facebook.rendercore.RenderUnit.DelegateBinder<kotlin.Any, kotlin.Any, kotlin.Any>"
            X.AnonymousClass00C.A0E(r2, r3)
            X.61a r2 = (X.C1257261a) r2
            java.lang.Object r0 = r8.get(r5)
            X.AnonymousClass00C.A0E(r0, r3)
            X.61a r0 = (X.C1257261a) r0
            r3 = 0
            X.AnonymousClass00C.A0D(r2, r3)
            X.7kr r3 = r0.A00
            java.lang.Object r2 = r2.A01
            java.lang.Object r0 = r0.A01
            boolean r0 = r3.BtZ(r2, r0, r12, r11)
            if (r0 == 0) goto L_0x013b
            r2 = 1
            long r2 = r2 << r5
            long r22 = r22 | r2
        L_0x013b:
            int r5 = r5 + 1
            goto L_0x0110
        L_0x013e:
            int r1 = r19.size()
        L_0x0142:
            if (r6 >= r1) goto L_0x0179
            r0 = r19
            java.lang.Object r2 = r0.get(r6)
            X.61a r2 = (X.C1257261a) r2
            X.7kr r0 = r2.A00
            java.lang.Class r0 = r0.getClass()
            boolean r3 = r5.containsKey(r0)
            if (r3 == 0) goto L_0x0162
            java.lang.Object r0 = r5.get(r0)
            boolean r0 = X.C36371kC.A1X(r0, r15)
            if (r0 == 0) goto L_0x0167
        L_0x0162:
            r0 = r20
            r0.add(r2)
        L_0x0167:
            int r6 = r6 + 1
            goto L_0x0142
        L_0x016a:
            if (r7 == 0) goto L_0x0179
            r0 = r24
            r0.addAll(r7)
            goto L_0x0179
        L_0x0172:
            r1 = r20
            r0 = r19
            r1.addAll(r0)
        L_0x0179:
            r0 = r30
            if (r30 == 0) goto L_0x018b
            r2 = 0
            java.util.List r1 = r0.A01
            int r0 = r1.size()
            if (r2 >= r0) goto L_0x018b
            java.lang.NullPointerException r0 = X.C90464aC.A0T(r1)
            throw r0
        L_0x018b:
            java.lang.String r3 = "null cannot be cast to non-null type com.facebook.rendercore.RenderUnit.DelegateBinder<*, in MOUNT_CONTENT of com.facebook.rendercore.RenderUnit, kotlin.Any>"
            r2 = r28
            r1 = r33
            if (r36 == 0) goto L_0x01da
            if (r10 == 0) goto L_0x019e
            java.lang.StringBuilder r4 = A03(r26)
            java.lang.String r0 = ":detach"
            A05(r13, r0, r4)
        L_0x019e:
            int r4 = X.C90504aG.A0C(r21)
            if (r4 < 0) goto L_0x01d4
        L_0x01a4:
            int r6 = r4 + -1
            r0 = r21
            java.lang.Object r5 = r0.get(r4)
            X.AnonymousClass00C.A0E(r5, r3)
            X.61a r5 = (X.C1257261a) r5
            A04(r13, r5, r10)
            X.7kr r0 = r5.A00
            java.lang.Class r4 = r0.getClass()
            r0 = 0
            X.AnonymousClass00C.A0D(r4, r0)
            java.util.Map r0 = r14.A00
            if (r0 == 0) goto L_0x01d2
            java.lang.Object r0 = r0.remove(r4)
        L_0x01c6:
            r5.A01(r2, r1, r12, r0)
            if (r10 == 0) goto L_0x01ce
            r13.A01()
        L_0x01ce:
            if (r6 < 0) goto L_0x01d4
            r4 = r6
            goto L_0x01a4
        L_0x01d2:
            r0 = 0
            goto L_0x01c6
        L_0x01d4:
            if (r10 == 0) goto L_0x01e5
            r13.A01()
            goto L_0x01dc
        L_0x01da:
            if (r10 == 0) goto L_0x01e5
        L_0x01dc:
            java.lang.StringBuilder r4 = A03(r26)
            java.lang.String r0 = ":unmount-optional"
            A05(r13, r0, r4)
        L_0x01e5:
            int r4 = X.C90504aG.A0C(r20)
            if (r4 < 0) goto L_0x021b
        L_0x01eb:
            int r6 = r4 + -1
            r0 = r20
            java.lang.Object r5 = r0.get(r4)
            X.AnonymousClass00C.A0E(r5, r3)
            X.61a r5 = (X.C1257261a) r5
            A04(r13, r5, r10)
            X.7kr r0 = r5.A00
            java.lang.Class r4 = r0.getClass()
            r0 = 0
            X.AnonymousClass00C.A0D(r4, r0)
            java.util.Map r0 = r14.A01
            if (r0 == 0) goto L_0x0219
            java.lang.Object r0 = r0.remove(r4)
        L_0x020d:
            r5.A01(r2, r1, r12, r0)
            if (r10 == 0) goto L_0x0215
            r13.A01()
        L_0x0215:
            if (r6 < 0) goto L_0x021b
            r4 = r6
            goto L_0x01eb
        L_0x0219:
            r0 = 0
            goto L_0x020d
        L_0x021b:
            if (r10 == 0) goto L_0x0220
            r13.A01()
        L_0x0220:
            r20 = 1
            r18 = 0
            int r0 = (r22 > r18 ? 1 : (r22 == r18 ? 0 : -1))
            if (r0 == 0) goto L_0x02bb
            if (r10 == 0) goto L_0x0233
            java.lang.StringBuilder r3 = A03(r26)
            java.lang.String r0 = ":unmount-fixed"
            A05(r13, r0, r3)
        L_0x0233:
            if (r8 == 0) goto L_0x0268
            int r6 = X.C36431kI.A07(r8)
            if (r6 < 0) goto L_0x0268
        L_0x023b:
            int r7 = r6 + -1
            long r16 = r20 << r6
            long r3 = r22 & r16
            int r0 = (r3 > r18 ? 1 : (r3 == r18 ? 0 : -1))
            if (r0 == 0) goto L_0x0264
            if (r9 == 0) goto L_0x0264
            java.lang.Object r5 = r9.get(r6)
            X.61a r5 = (X.C1257261a) r5
            if (r5 == 0) goto L_0x0264
            A04(r13, r5, r10)
            java.lang.Object[] r4 = r14.A02
            r3 = 0
            if (r4 == 0) goto L_0x025c
            r0 = r4[r6]
            r4[r6] = r3
            r3 = r0
        L_0x025c:
            r5.A01(r2, r1, r12, r3)
            if (r10 == 0) goto L_0x0264
            r13.A01()
        L_0x0264:
            if (r7 < 0) goto L_0x0268
            r6 = r7
            goto L_0x023b
        L_0x0268:
            if (r10 == 0) goto L_0x026d
            r13.A01()
        L_0x026d:
            int r6 = X.C90484aE.A0F(r8)
            if (r10 == 0) goto L_0x027c
            java.lang.StringBuilder r3 = A03(r26)
            java.lang.String r0 = ":mount-fixed"
            A05(r13, r0, r3)
        L_0x027c:
            r5 = 0
        L_0x027d:
            if (r5 >= r6) goto L_0x02b6
            long r20 = r20 << r5
            long r3 = r22 & r20
            int r0 = (r3 > r18 ? 1 : (r3 == r18 ? 0 : -1))
            if (r0 == 0) goto L_0x02af
            if (r8 == 0) goto L_0x02af
            java.lang.Object r0 = r8.get(r5)
            X.61a r0 = (X.C1257261a) r0
            if (r0 == 0) goto L_0x02af
            A04(r13, r0, r10)
            X.7kr r3 = r0.A00
            java.lang.Object r0 = r0.A01
            java.lang.Object r4 = r3.B1l(r2, r1, r0, r11)
            if (r4 == 0) goto L_0x02aa
            java.lang.Object[] r3 = r14.A02
            if (r3 != 0) goto L_0x02b4
            java.lang.Object[] r0 = new java.lang.Object[r6]
        L_0x02a4:
            r0[r5] = r4
            if (r3 != 0) goto L_0x02aa
            r14.A02 = r0
        L_0x02aa:
            if (r10 == 0) goto L_0x02af
            r13.A01()
        L_0x02af:
            int r5 = r5 + 1
            r20 = 1
            goto L_0x027d
        L_0x02b4:
            r0 = r3
            goto L_0x02a4
        L_0x02b6:
            if (r10 == 0) goto L_0x02bb
            r13.A01()
        L_0x02bb:
            r0 = r26
            java.util.List r0 = r0.A01
            int r7 = X.C90484aE.A0F(r0)
            if (r10 == 0) goto L_0x02ce
            java.lang.StringBuilder r3 = A03(r26)
            java.lang.String r0 = ":mount-optional"
            A05(r13, r0, r3)
        L_0x02ce:
            int r6 = r24.size()
            r5 = 0
        L_0x02d3:
            if (r5 >= r6) goto L_0x030b
            r0 = r24
            java.lang.Object r0 = r0.get(r5)
            X.61a r0 = (X.C1257261a) r0
            A04(r13, r0, r10)
            X.7kr r3 = r0.A00
            java.lang.Object r0 = r0.A01
            java.lang.Object r4 = r3.B1l(r2, r1, r0, r11)
            java.lang.Class r0 = r3.getClass()
            X.AnonymousClass00C.A0D(r0, r15)
            if (r4 == 0) goto L_0x0303
            java.util.Map r3 = r14.A01
            if (r3 != 0) goto L_0x02fa
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
            r3.<init>(r7)
        L_0x02fa:
            r3.put(r0, r4)
            java.util.Map r0 = r14.A01
            if (r0 != 0) goto L_0x0303
            r14.A01 = r3
        L_0x0303:
            if (r10 == 0) goto L_0x0308
            r13.A01()
        L_0x0308:
            int r5 = r5 + 1
            goto L_0x02d3
        L_0x030b:
            if (r10 == 0) goto L_0x0319
            r13.A01()
            java.lang.StringBuilder r3 = A03(r26)
            java.lang.String r0 = ":attach"
            A05(r13, r0, r3)
        L_0x0319:
            int r7 = r25.size()
            r6 = 0
        L_0x031e:
            if (r6 >= r7) goto L_0x0357
            r0 = r25
            java.lang.Object r0 = r0.get(r6)
            X.61a r0 = (X.C1257261a) r0
            A04(r13, r0, r10)
            X.7kr r3 = r0.A00
            java.lang.Object r0 = r0.A01
            java.lang.Object r5 = r3.B1l(r2, r1, r0, r11)
            java.lang.Class r4 = r3.getClass()
            r0 = 0
            X.AnonymousClass00C.A0D(r4, r15)
            if (r5 == 0) goto L_0x034f
            java.util.Map r3 = r14.A00
            if (r3 != 0) goto L_0x0346
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
            r3.<init>(r0)
        L_0x0346:
            r3.put(r4, r5)
            java.util.Map r0 = r14.A00
            if (r0 != 0) goto L_0x034f
            r14.A00 = r3
        L_0x034f:
            if (r10 == 0) goto L_0x0354
            r13.A01()
        L_0x0354:
            int r6 = r6 + 1
            goto L_0x031e
        L_0x0357:
            if (r10 == 0) goto L_0x035c
            r13.A01()
        L_0x035c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C132456Tu.A09(android.content.Context, X.5sG, X.5wr, X.68E, X.6Tu, java.lang.Object, java.lang.Object, java.lang.Object, boolean):void");
    }

    public C132456Tu(Integer num, List list, List list2, List list3) {
        C36331k8.A1G(list2, 3, list3);
        if (list.size() <= 64) {
            this.A02 = num;
            this.A03 = list;
            if (0 < list2.size()) {
                list2.get(0);
                throw AnonymousClass000.A0j();
            } else if (0 < list3.size()) {
                list3.get(0);
                throw AnonymousClass000.A0j();
            }
        } else {
            throw AnonymousClass001.A09("Too many fixed mount binders. Max is 64");
        }
    }
}
