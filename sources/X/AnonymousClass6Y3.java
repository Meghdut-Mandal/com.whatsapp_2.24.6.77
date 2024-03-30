package X;

import android.content.Context;
import android.view.View;
import com.facebook.rendercore.RenderTreeNode;
import java.util.AbstractMap;
import java.util.List;

/* renamed from: X.6Y3  reason: invalid class name */
public final class AnonymousClass6Y3 {
    public C123655wr A00;
    public C123055vr A01;
    public boolean A02;
    public boolean A03;
    public final C000700i A04 = new C000700i(10);
    public final AnonymousClass68E A05;
    public final Context A06;
    public final C92394ds A07;

    public AnonymousClass6Y3(C92394ds r3, AnonymousClass68E r4) {
        AnonymousClass00C.A0D(r4, 2);
        this.A07 = r3;
        this.A05 = r4;
        this.A06 = C36371kC.A0B(r3);
    }

    private final void A00(long j) {
        C000700i r11 = this.A04;
        C123045vq r7 = (C123045vq) r11.A05(j);
        if (r7 != null) {
            AnonymousClass68E r4 = this.A05;
            boolean A032 = r4.A03();
            RenderTreeNode renderTreeNode = r7.A01;
            C132456Tu r6 = renderTreeNode.A06;
            AnonymousClass00C.A0E(r6, "null cannot be cast to non-null type com.facebook.rendercore.RenderUnit<kotlin.Any>");
            Object obj = r7.A04;
            C132096Sc.A00();
            if (A032) {
                A07(r4, r6, "UnmountItem: ", AnonymousClass000.A0u());
            }
            AnonymousClass00T r3 = renderTreeNode.A08;
            if (C90524aI.A0q(r3).size() > 0) {
                for (int size = C90524aI.A0q(r3).size() - 1; -1 < size; size--) {
                    A00(((RenderTreeNode) C90524aI.A0q(r3).get(size)).A06.A06());
                }
                AnonymousClass00C.A0E(obj, "null cannot be cast to non-null type com.facebook.rendercore.Host");
                if (((C92394ds) obj).getMountItemCount() > 0) {
                    throw AnonymousClass001.A09("Recursively unmounting items from a ComponentHost, left some items behind maybe because not tracked by its MountState");
                }
            }
            long A062 = r6.A06();
            if (A062 == 0) {
                C123045vq r5 = (C123045vq) r11.A05(0);
                if (r5 != null) {
                    if (r5.A02) {
                        A04(r5);
                    }
                    r11.A08(0);
                    C123055vr r0 = this.A01;
                    if (r0 != null) {
                        RenderTreeNode renderTreeNode2 = r0.A02;
                        C132456Tu r2 = renderTreeNode2.A06;
                        AnonymousClass00C.A0E(r2, "null cannot be cast to non-null type com.facebook.rendercore.RenderUnit<kotlin.Any>");
                        A02(r5.A03, renderTreeNode2, r2, r5.A04);
                    } else {
                        throw C36381kD.A0l();
                    }
                }
            } else {
                r11.A08(A062);
                C92394ds r22 = r7.A00;
                if (A032) {
                    A07(r4, r6, "UnmountItem:remove: ", AnonymousClass000.A0u());
                }
                if (r22 != null) {
                    r22.A01(r7);
                }
                if (A032) {
                    r4.A01();
                }
                if (r7.A02) {
                    if (A032) {
                        A07(r4, r6, "UnmountItem:unbind: ", AnonymousClass000.A0u());
                    }
                    A04(r7);
                    if (A032) {
                        r4.A01();
                    }
                }
                if (obj instanceof View) {
                    ((View) obj).setPadding(0, 0, 0, 0);
                }
                if (A032) {
                    A07(r4, r6, "UnmountItem:unmount: ", AnonymousClass000.A0u());
                }
                A02(r7.A03, renderTreeNode, r6, obj);
                if (A032) {
                    r4.A01();
                }
                Context context = this.A06;
                C161287mV A072 = r7.A01.A06.A07();
                AnonymousClass00C.A0D(A072, 1);
                C120915sI A002 = AnonymousClass6J4.A00(context, A072);
                if (A002 != null) {
                    try {
                        if (A002.A00.BnO(obj)) {
                            A002.A02.incrementAndGet();
                        }
                    } catch (IllegalStateException e) {
                        StringBuilder A0u = AnonymousClass000.A0u();
                        A0u.append("Failed to release item to MountItemPool: ");
                        throw new IllegalStateException(AnonymousClass000.A0q(A002.A01, A0u), e);
                    }
                }
            }
            if (A032) {
                r4.A01();
            }
        }
    }

    private final void A02(C120895sG r7, RenderTreeNode renderTreeNode, C132456Tu r9, Object obj) {
        C123655wr r0 = this.A00;
        if (r0 != null) {
            List list = r0.A01;
            if (0 < list.size()) {
                throw C90464aC.A0T(list);
            }
        }
        C120895sG r2 = r7;
        C132456Tu r02 = r9;
        r02.A0D(this.A06, r2, this.A05, obj, renderTreeNode.A07);
    }

    private final void A03(C123045vq r8) {
        C132456Tu r1 = r8.A01.A06;
        AnonymousClass00C.A0E(r1, "null cannot be cast to non-null type com.facebook.rendercore.RenderUnit<kotlin.Any>");
        r1.A0A(this.A06, r8.A03, this.A05, r8.A04, r8.A01.A07);
        C123655wr r0 = this.A00;
        if (r0 != null) {
            List list = r0.A01;
            if (0 < list.size()) {
                throw C90464aC.A0T(list);
            }
        }
        r8.A02 = true;
    }

    private final void A04(C123045vq r10) {
        C132456Tu r3 = r10.A01.A06;
        AnonymousClass00C.A0E(r3, "null cannot be cast to non-null type com.facebook.rendercore.RenderUnit<kotlin.Any>");
        Object obj = r10.A04;
        Object obj2 = r10.A01.A07;
        C123655wr r0 = this.A00;
        if (r0 != null) {
            List list = r0.A01;
            if (0 < list.size()) {
                throw C90464aC.A0T(list);
            }
        }
        r3.A0B(this.A06, r10.A03, this.A05, obj, obj2);
        r10.A02 = false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0044, code lost:
        if (r0 == false) goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0089, code lost:
        if (((android.view.View) r13).isLayoutRequested() == false) goto L_0x008b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A05(X.C123045vq r18, com.facebook.rendercore.RenderTreeNode r19) {
        /*
            r17 = this;
            r4 = r17
            X.5wr r10 = r4.A00
            X.68E r11 = r4.A05
            boolean r6 = r11.A03()
            r5 = r19
            X.6Tu r7 = r5.A06
            java.lang.String r1 = "null cannot be cast to non-null type com.facebook.rendercore.RenderUnit<kotlin.Any>"
            X.AnonymousClass00C.A0E(r7, r1)
            java.lang.Object r2 = r5.A07
            r3 = r18
            com.facebook.rendercore.RenderTreeNode r0 = r3.A01
            X.6Tu r12 = r0.A06
            X.AnonymousClass00C.A0E(r12, r1)
            java.lang.Object r14 = r0.A07
            java.lang.Object r13 = r3.A04
            r3.A01 = r5
            if (r12 != r7) goto L_0x0046
            if (r14 == r2) goto L_0x0065
            if (r14 == 0) goto L_0x0046
            if (r2 == 0) goto L_0x0046
            boolean r0 = r14 instanceof X.AnonymousClass7cF
            if (r0 == 0) goto L_0x00a1
            boolean r0 = r2 instanceof X.AnonymousClass7cF
            if (r0 == 0) goto L_0x00a1
            r1 = r14
            X.7cF r1 = (X.AnonymousClass7cF) r1
            r0 = r2
            X.7cF r0 = (X.AnonymousClass7cF) r0
            if (r1 == r0) goto L_0x0065
            if (r1 == 0) goto L_0x0046
            if (r0 == 0) goto L_0x0046
            boolean r0 = X.AnonymousClass6GY.A01(r1, r0)
        L_0x0044:
            if (r0 != 0) goto L_0x0065
        L_0x0046:
            X.C132096Sc.A00()
            if (r6 == 0) goto L_0x0054
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "UpdateItem: "
            A07(r11, r7, r0, r1)
        L_0x0054:
            android.content.Context r8 = r4.A06
            X.5sG r9 = r3.A03
            boolean r0 = r3.A02
            r15 = r2
            r16 = r0
            r7.A09(r8, r9, r10, r11, r12, r13, r14, r15, r16)
            if (r6 == 0) goto L_0x0065
            r11.A01()
        L_0x0065:
            r0 = 1
            r3.A02 = r0
            if (r6 == 0) goto L_0x0073
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "UpdateBounds: "
            A07(r11, r7, r0, r1)
        L_0x0073:
            long r4 = r7.A06()
            r1 = 0
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x00a6
            boolean r0 = r13 instanceof android.view.View
            if (r0 == 0) goto L_0x008b
            r0 = r13
            android.view.View r0 = (android.view.View) r0
            boolean r0 = r0.isLayoutRequested()
            r1 = 1
            if (r0 != 0) goto L_0x008c
        L_0x008b:
            r1 = 0
        L_0x008c:
            com.facebook.rendercore.RenderTreeNode r0 = r3.A01
            A06(r11, r0, r13, r1)
            if (r10 == 0) goto L_0x00a6
            java.util.List r2 = r10.A01
            int r1 = r2.size()
            r0 = 0
            if (r0 >= r1) goto L_0x00a6
            java.lang.NullPointerException r0 = X.C90464aC.A0T(r2)
            throw r0
        L_0x00a1:
            boolean r0 = X.AnonymousClass6GY.A01(r14, r2)
            goto L_0x0044
        L_0x00a6:
            if (r6 == 0) goto L_0x00ab
            r11.A01()
        L_0x00ab:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6Y3.A05(X.5vq, com.facebook.rendercore.RenderTreeNode):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0044, code lost:
        if (r12 == false) goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x005c, code lost:
        if (r11.getBottom() == r1) goto L_0x0080;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A06(X.AnonymousClass68E r9, com.facebook.rendercore.RenderTreeNode r10, java.lang.Object r11, boolean r12) {
        /*
            android.graphics.Rect r0 = r10.A03
            android.graphics.Rect r5 = r10.A04
            int r3 = r0.left
            int r4 = r0.top
            int r2 = r0.right
            int r1 = r0.bottom
            r6 = 1
            boolean r0 = r9.A03()
            r8 = 0
            if (r0 != r6) goto L_0x001a
            r8 = 1
            java.lang.String r0 = "applyBoundsToMountContent"
            r9.A02(r0)
        L_0x001a:
            boolean r0 = r11 instanceof android.view.View     // Catch:{ all -> 0x0091 }
            if (r0 == 0) goto L_0x0062
            android.view.View r11 = (android.view.View) r11     // Catch:{ all -> 0x0091 }
            int r7 = r2 - r3
            int r6 = r1 - r4
            if (r5 == 0) goto L_0x002d
            boolean r0 = r11 instanceof X.C92394ds     // Catch:{ all -> 0x0091 }
            if (r0 != 0) goto L_0x002d
            X.C90504aG.A14(r5, r11)     // Catch:{ all -> 0x0091 }
        L_0x002d:
            if (r12 != 0) goto L_0x003b
            int r0 = r11.getMeasuredHeight()     // Catch:{ all -> 0x0091 }
            if (r0 != r6) goto L_0x003b
            int r0 = r11.getMeasuredWidth()     // Catch:{ all -> 0x0091 }
            if (r0 == r7) goto L_0x0046
        L_0x003b:
            r5 = 1073741824(0x40000000, float:2.0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r5)     // Catch:{ all -> 0x0091 }
            X.AnonymousClass000.A16(r11, r6, r5, r0)     // Catch:{ all -> 0x0091 }
            if (r12 != 0) goto L_0x005e
        L_0x0046:
            int r0 = r11.getLeft()     // Catch:{ all -> 0x0091 }
            if (r0 != r3) goto L_0x005e
            int r0 = r11.getTop()     // Catch:{ all -> 0x0091 }
            if (r0 != r4) goto L_0x005e
            int r0 = r11.getRight()     // Catch:{ all -> 0x0091 }
            if (r0 != r2) goto L_0x005e
            int r0 = r11.getBottom()     // Catch:{ all -> 0x0091 }
            if (r0 == r1) goto L_0x0080
        L_0x005e:
            r11.layout(r3, r4, r2, r1)     // Catch:{ all -> 0x0091 }
            goto L_0x0080
        L_0x0062:
            boolean r0 = r11 instanceof android.graphics.drawable.Drawable     // Catch:{ all -> 0x0091 }
            if (r0 == 0) goto L_0x0086
            if (r5 == 0) goto L_0x0074
            int r0 = r5.left     // Catch:{ all -> 0x0091 }
            int r3 = r3 + r0
            int r0 = r5.top     // Catch:{ all -> 0x0091 }
            int r4 = r4 + r0
            int r0 = r5.right     // Catch:{ all -> 0x0091 }
            int r2 = r2 - r0
            int r0 = r5.bottom     // Catch:{ all -> 0x0091 }
            int r1 = r1 - r0
        L_0x0074:
            android.graphics.drawable.Drawable r11 = (android.graphics.drawable.Drawable) r11     // Catch:{ all -> 0x0091 }
            android.graphics.Rect r0 = r11.getBounds()     // Catch:{ all -> 0x0091 }
            X.AnonymousClass00C.A08(r0)     // Catch:{ all -> 0x0091 }
            r11.setBounds(r3, r4, r2, r1)     // Catch:{ all -> 0x0091 }
        L_0x0080:
            if (r8 == 0) goto L_0x0085
            r9.A01()
        L_0x0085:
            return
        L_0x0086:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x0091 }
            java.lang.String r0 = "Unsupported mounted content "
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0f(r11, r0, r1)     // Catch:{ all -> 0x0091 }
            throw r0     // Catch:{ all -> 0x0091 }
        L_0x0091:
            r0 = move-exception
            if (r8 == 0) goto L_0x0097
            r9.A01()
        L_0x0097:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6Y3.A06(X.68E, com.facebook.rendercore.RenderTreeNode, java.lang.Object, boolean):void");
    }

    private final void A08(RenderTreeNode renderTreeNode) {
        Class<?> cls;
        Class<?> cls2;
        Object B4O;
        C132456Tu r6 = renderTreeNode.A06;
        long A062 = r6.A06();
        if (A062 == 0) {
            A09(renderTreeNode);
            return;
        }
        C132096Sc.A00();
        AnonymousClass68E r5 = this.A05;
        boolean A032 = r5.A03();
        if (A032) {
            A07(r5, r6, "MountItem: ", AnonymousClass000.A0u());
        }
        RenderTreeNode renderTreeNode2 = renderTreeNode.A05;
        if (renderTreeNode2 != null) {
            C132456Tu r7 = renderTreeNode2.A06;
            if (A032) {
                A07(r5, r7, "MountItem:mount-parent ", AnonymousClass000.A0u());
            }
            long A063 = r7.A06();
            C000700i r9 = this.A04;
            if (r9.A05(A063) == null) {
                A08(renderTreeNode2);
            }
            if (A032) {
                r5.A01();
            }
            long A064 = r7.A06();
            Object A052 = r9.A05(A064);
            if (A052 != null) {
                Object obj = ((C123045vq) A052).A04;
                if (obj instanceof C92394ds) {
                    AnonymousClass00C.A0E(obj, "null cannot be cast to non-null type com.facebook.rendercore.Host");
                    C92394ds r8 = (C92394ds) obj;
                    if (A032) {
                        A07(r5, r6, "MountItem:acquire-content ", AnonymousClass000.A0u());
                    }
                    Context context = this.A06;
                    C161287mV A072 = r6.A07();
                    AnonymousClass00C.A0D(A072, 1);
                    C120915sI A002 = AnonymousClass6J4.A00(context, A072);
                    if (A002 == null || (B4O = A002.A00.B09()) == null) {
                        B4O = A072.B4O(context);
                    } else {
                        A002.A02.decrementAndGet();
                    }
                    if (A032) {
                        r5.A01();
                        A07(r5, r6, "MountItem:mount ", AnonymousClass000.A0u());
                    }
                    C123045vq r3 = new C123045vq(renderTreeNode, B4O);
                    A01(r3.A03, renderTreeNode, r6, B4O);
                    r9.A0A(A062, r3);
                    r8.A02(r3, renderTreeNode.A02);
                    if (A032) {
                        r5.A01();
                        A07(r5, r6, "MountItem:bind ", AnonymousClass000.A0u());
                    }
                    A03(r3);
                    if (A032) {
                        r5.A01();
                        A07(r5, r6, "MountItem:applyBounds ", AnonymousClass000.A0u());
                    }
                    A06(r5, renderTreeNode, r3.A04, true);
                    if (A032) {
                        r5.A01();
                        A07(r5, r6, "MountItem:after ", AnonymousClass000.A0u());
                    }
                    C123655wr r0 = this.A00;
                    if (r0 != null) {
                        List list = r0.A01;
                        if (0 < list.size()) {
                            throw C90464aC.A0T(list);
                        }
                    }
                    if (A032) {
                        r5.A01();
                        r5.A01();
                        return;
                    }
                    return;
                }
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append("\n            Trying to mount a RenderTreeNode, its parent should be a Host, but was '");
                AnonymousClass000.A1C(obj, A0u);
                A0u.append("'.\n            Parent RenderUnit: id=");
                A0u.append(A064);
                A0u.append("; contentType='");
                if (r7 instanceof C98154qy) {
                    cls = ((C98154qy) r7).A03;
                } else {
                    cls = r7.getClass();
                }
                A0u.append(cls);
                A0u.append("'.\n            Child RenderUnit: id=");
                A0u.append(A062);
                A0u.append("; contentType='");
                if (r6 instanceof C98154qy) {
                    cls2 = ((C98154qy) r6).A03;
                } else {
                    cls2 = r6.getClass();
                }
                A0u.append(cls2);
                throw C90514aH.A0s(AnonymousClass091.A01(AnonymousClass000.A0q("'.\n            ", A0u)));
            }
            throw AnonymousClass001.A09("Required value was null.");
        }
        throw AnonymousClass001.A09("Required value was null.");
    }

    private final void A09(RenderTreeNode renderTreeNode) {
        C92394ds r2 = this.A07;
        C123045vq r3 = new C123045vq(renderTreeNode, r2);
        C132456Tu r1 = renderTreeNode.A06;
        AnonymousClass00C.A0E(r1, "null cannot be cast to non-null type com.facebook.rendercore.RenderUnit<kotlin.Any>");
        A01(r3.A03, renderTreeNode, r1, r2);
        this.A04.A0A(0, r3);
        A03(r3);
    }

    public static void A0A(AbstractMap abstractMap, int i, long j) {
        abstractMap.put("numMountableOutputs", Integer.valueOf(i));
        AnonymousClass00C.A08(Thread.currentThread().getName());
        C12460i5 r2 = new C12460i5();
        r2.put("timestamp", Long.valueOf(j));
        r2.putAll(abstractMap);
        C000300d.A04(r2);
    }

    public void A0B() {
        C123055vr r1 = this.A01;
        if (r1 != null) {
            AnonymousClass68E r6 = this.A05;
            boolean A032 = r6.A03();
            if (A032) {
                r6.A02("MountState.bind");
            }
            for (RenderTreeNode renderTreeNode : r1.A03) {
                C123045vq r12 = (C123045vq) this.A04.A05(renderTreeNode.A06.A06());
                if (r12 != null && !r12.A02) {
                    Object obj = r12.A04;
                    A03(r12);
                    if ((obj instanceof View) && !(obj instanceof C92394ds) && ((View) obj).isLayoutRequested()) {
                        A06(r6, r12.A01, obj, true);
                    }
                }
            }
            if (A032) {
                r6.A01();
            }
        }
    }

    public void A0C() {
        C123055vr r1 = this.A01;
        if (r1 != null) {
            AnonymousClass68E r5 = this.A05;
            boolean A032 = r5.A03();
            if (A032) {
                r5.A02("MountState.unbind");
                r5.A02("MountState.unbindAllContent");
            }
            for (RenderTreeNode renderTreeNode : r1.A03) {
                C123045vq r12 = (C123045vq) this.A04.A05(renderTreeNode.A06.A06());
                if (r12 != null && r12.A02) {
                    A04(r12);
                }
            }
            if (A032) {
                r5.A01();
                r5.A02("MountState.unbindExtensions");
            }
            C123655wr r0 = this.A00;
            if (r0 != null) {
                List list = r0.A01;
                if (0 < list.size()) {
                    list.get(0);
                    throw AnonymousClass001.A0A("onUnbind");
                }
            }
            if (A032) {
                r5.A01();
                r5.A01();
            }
        }
    }

    public void A0D() {
        if (this.A01 == null) {
            A0E();
            return;
        }
        AnonymousClass68E r3 = this.A05;
        boolean A032 = r3.A03();
        if (A032) {
            r3.A02("MountState.unmountAllItems");
        }
        A00(0);
        A0E();
        if (A032) {
            r3.A01();
        }
        this.A02 = true;
    }

    public void A0E() {
        C123655wr r3 = this.A00;
        if (r3 != null) {
            List list = r3.A01;
            if (0 < list.size()) {
                list.get(0);
                throw AnonymousClass001.A0A("onUnbind");
            }
            List list2 = r3.A01;
            if (0 < list2.size()) {
                list2.get(0);
                throw AnonymousClass001.A0A("onUnmount");
            } else {
                list2.clear();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01e1, code lost:
        if (r13[r15] == null) goto L_0x01e3;
     */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x020e A[Catch:{ Exception -> 0x0337, all -> 0x0353 }] */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x02df  */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x0222 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:213:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0F(X.C123055vr r26) {
        /*
            r25 = this;
            r4 = r26
            if (r26 == 0) goto L_0x03c0
            X.C132096Sc.A00()
            java.lang.String r22 = "rootHostHashCode"
            X.6Sc r21 = X.C132096Sc.A00
            long r2 = java.lang.System.currentTimeMillis()
            X.5S6 r5 = X.AnonymousClass5S6.DEBUG
            java.util.concurrent.atomic.AtomicReference r20 = X.C132096Sc.A01
            java.lang.Object r0 = r20.get()
            X.AnonymousClass00C.A08(r0)
            X.5S6 r0 = (X.AnonymousClass5S6) r0
            int r0 = r5.compareTo(r0)
            r8 = 1
            r1 = r25
            if (r0 < 0) goto L_0x007a
            java.util.Set r0 = r21.A01()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x007a
            java.util.Set r0 = r21.A01()
            java.util.ArrayList r9 = X.AnonymousClass001.A0I()
            java.util.Iterator r6 = r0.iterator()
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x004b
            r6.next()
            java.lang.String r0 = "getEvents"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0A(r0)
            throw r0
        L_0x004b:
            boolean r0 = X.C36411kG.A1a(r9)
            if (r0 == 0) goto L_0x007a
            java.util.LinkedHashMap r7 = X.C36431kI.A1G()
            X.4ds r0 = r1.A07
            int r6 = r0.hashCode()
            r0 = r22
            X.C36341k9.A1K(r0, r7, r6)
            com.facebook.rendercore.RenderTreeNode[] r0 = r4.A03
            int r0 = r0.length
            A0A(r7, r0, r2)
            java.util.Iterator r2 = r9.iterator()
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x007a
            r2.next()
            java.lang.String r0 = "onEvent"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0A(r0)
            throw r0
        L_0x007a:
            boolean r0 = r1.A03     // Catch:{ Exception -> 0x0337 }
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x032b
            r1.A03 = r8     // Catch:{ Exception -> 0x0337 }
            X.5vr r2 = r1.A01     // Catch:{ Exception -> 0x0337 }
            boolean r0 = r4.equals(r2)     // Catch:{ Exception -> 0x0337 }
            if (r0 == 0) goto L_0x00f9
            boolean r0 = r1.A02     // Catch:{ Exception -> 0x0337 }
            if (r0 != 0) goto L_0x00f9
            r0 = 0
            r1.A03 = r0
            long r2 = java.lang.System.currentTimeMillis()
            java.lang.Object r0 = r20.get()
            X.AnonymousClass00C.A08(r0)
            X.5S6 r0 = (X.AnonymousClass5S6) r0
            int r0 = r5.compareTo(r0)
            if (r0 < 0) goto L_0x0325
            java.util.Set r0 = r21.A01()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0325
            java.util.Set r0 = r21.A01()
            java.util.ArrayList r6 = X.AnonymousClass001.A0I()
            java.util.Iterator r5 = r0.iterator()
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x00ca
            r5.next()
            java.lang.String r0 = "getEvents"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0A(r0)
            throw r0
        L_0x00ca:
            boolean r0 = X.C36411kG.A1a(r6)
            if (r0 == 0) goto L_0x0325
            java.util.LinkedHashMap r5 = X.C36431kI.A1G()
            X.4ds r0 = r1.A07
            int r1 = r0.hashCode()
            r0 = r22
            X.C36341k9.A1K(r0, r5, r1)
            com.facebook.rendercore.RenderTreeNode[] r0 = r4.A03
            int r0 = r0.length
            A0A(r5, r0, r2)
            java.util.Iterator r1 = r6.iterator()
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0325
            r1.next()
            java.lang.String r0 = "onEvent"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0A(r0)
            throw r0
        L_0x00f9:
            r1.A01 = r4     // Catch:{ Exception -> 0x0337 }
            X.68E r6 = r1.A05     // Catch:{ Exception -> 0x0337 }
            boolean r19 = r6.A03()     // Catch:{ Exception -> 0x0337 }
            if (r19 == 0) goto L_0x010d
            java.lang.String r0 = "MountState.mount"
            r6.A02(r0)     // Catch:{ Exception -> 0x0337 }
            java.lang.String r0 = "RenderCoreExtension.beforeMount"
            r6.A02(r0)     // Catch:{ Exception -> 0x0337 }
        L_0x010d:
            X.4ds r0 = r1.A07     // Catch:{ Exception -> 0x0337 }
            r24 = r0
            if (r19 == 0) goto L_0x011b
            r6.A01()     // Catch:{ Exception -> 0x0337 }
            java.lang.String r0 = "MountState.prepareMount"
            r6.A02(r0)     // Catch:{ Exception -> 0x0337 }
        L_0x011b:
            X.5vr r0 = r1.A01     // Catch:{ Exception -> 0x0337 }
            r18 = r0
            if (r0 == 0) goto L_0x0231
            if (r2 == 0) goto L_0x0231
            boolean r17 = r6.A03()     // Catch:{ Exception -> 0x0337 }
            if (r17 == 0) goto L_0x012e
            java.lang.String r0 = "unmountOrMoveOldItems"
            r6.A02(r0)     // Catch:{ Exception -> 0x0337 }
        L_0x012e:
            com.facebook.rendercore.RenderTreeNode[] r0 = r2.A03     // Catch:{ Exception -> 0x0337 }
            r16 = r0
            int r0 = r0.length     // Catch:{ Exception -> 0x0337 }
            r23 = r0
            r7 = 1
        L_0x0136:
            r0 = r23
            if (r7 >= r0) goto L_0x022c
            r0 = r16[r7]     // Catch:{ Exception -> 0x0337 }
            X.6Tu r10 = r0.A06     // Catch:{ Exception -> 0x0337 }
            long r2 = r10.A06()     // Catch:{ Exception -> 0x0337 }
            r0 = r18
            X.00i r8 = r0.A01     // Catch:{ Exception -> 0x0337 }
            java.lang.Integer r0 = X.C90494aF.A0U()     // Catch:{ Exception -> 0x0337 }
            java.lang.Object r0 = r8.A06(r0, r2)     // Catch:{ Exception -> 0x0337 }
            int r8 = X.AnonymousClass000.A0I(r0)     // Catch:{ Exception -> 0x0337 }
            X.00i r9 = r1.A04     // Catch:{ Exception -> 0x0337 }
            long r2 = r10.A06()     // Catch:{ Exception -> 0x0337 }
            java.lang.Object r11 = r9.A05(r2)     // Catch:{ Exception -> 0x0337 }
            X.5vq r11 = (X.C123045vq) r11     // Catch:{ Exception -> 0x0337 }
            if (r11 == 0) goto L_0x0222
            java.lang.String r2 = "Required value was null."
            if (r8 < 0) goto L_0x0217
            r0 = r18
            com.facebook.rendercore.RenderTreeNode[] r0 = r0.A03     // Catch:{ Exception -> 0x0337 }
            r8 = r0[r8]     // Catch:{ Exception -> 0x0337 }
            if (r8 == 0) goto L_0x0332
            com.facebook.rendercore.RenderTreeNode r0 = r8.A05     // Catch:{ Exception -> 0x0337 }
            if (r0 == 0) goto L_0x0226
            X.6Tu r0 = r0.A06     // Catch:{ Exception -> 0x0337 }
            long r2 = r0.A06()     // Catch:{ Exception -> 0x0337 }
            java.lang.Object r0 = r9.A05(r2)     // Catch:{ Exception -> 0x0337 }
            X.5vq r0 = (X.C123045vq) r0     // Catch:{ Exception -> 0x0337 }
            if (r0 == 0) goto L_0x018a
            java.lang.Object r2 = r0.A04     // Catch:{ Exception -> 0x0337 }
            java.lang.String r0 = "null cannot be cast to non-null type com.facebook.rendercore.Host"
            X.AnonymousClass00C.A0E(r2, r0)     // Catch:{ Exception -> 0x0337 }
        L_0x0185:
            X.4ds r12 = r11.A00     // Catch:{ Exception -> 0x0337 }
            if (r12 == 0) goto L_0x0217
            goto L_0x018c
        L_0x018a:
            r2 = 0
            goto L_0x0185
        L_0x018c:
            if (r12 != r2) goto L_0x0217
            com.facebook.rendercore.RenderTreeNode r0 = r11.A01     // Catch:{ Exception -> 0x0337 }
            int r15 = r0.A02     // Catch:{ Exception -> 0x0337 }
            int r14 = r8.A02     // Catch:{ Exception -> 0x0337 }
            if (r15 == r14) goto L_0x0222
            X.4qw r12 = (X.C98134qw) r12     // Catch:{ Exception -> 0x0337 }
            java.lang.Object r10 = r11.A04     // Catch:{ Exception -> 0x0337 }
            r12.invalidate()     // Catch:{ Exception -> 0x0337 }
            com.facebook.rendercore.RenderTreeNode r0 = r11.A01     // Catch:{ Exception -> 0x0337 }
            X.6Tu r0 = r0.A06     // Catch:{ Exception -> 0x0337 }
            java.lang.Integer r0 = r0.A02     // Catch:{ Exception -> 0x0337 }
            java.lang.Integer r9 = X.C023109s.A01     // Catch:{ Exception -> 0x0337 }
            java.lang.String r8 = "null cannot be cast to non-null type android.view.View"
            if (r0 != r9) goto L_0x01b8
            r0 = 1
            r12.A02 = r0     // Catch:{ Exception -> 0x0337 }
            X.AnonymousClass00C.A0E(r10, r8)     // Catch:{ Exception -> 0x0337 }
            r0 = r10
            android.view.View r0 = (android.view.View) r0     // Catch:{ Exception -> 0x0337 }
            r0.cancelPendingInputEvents()     // Catch:{ Exception -> 0x0337 }
            X.C012005e.A0K(r0)     // Catch:{ Exception -> 0x0337 }
        L_0x01b8:
            X.5vq[] r3 = r12.A04     // Catch:{ Exception -> 0x0337 }
            int r13 = r3.length     // Catch:{ Exception -> 0x0337 }
            if (r14 < r13) goto L_0x01cb
            r0 = r13
        L_0x01be:
            int r0 = r0 * 2
            if (r14 >= r0) goto L_0x01be
            X.5vq[] r2 = new X.C123045vq[r0]     // Catch:{ Exception -> 0x0337 }
            r0 = 0
            java.lang.System.arraycopy(r3, r0, r2, r0, r13)     // Catch:{ Exception -> 0x0337 }
            r12.A04 = r2     // Catch:{ Exception -> 0x0337 }
            r3 = r2
        L_0x01cb:
            r2 = r3[r14]     // Catch:{ Exception -> 0x0337 }
            if (r2 == 0) goto L_0x01da
            X.5vq[] r0 = r12.A05     // Catch:{ Exception -> 0x0337 }
            if (r0 != 0) goto L_0x01d8
            int r0 = r3.length     // Catch:{ Exception -> 0x0337 }
            X.5vq[] r0 = new X.C123045vq[r0]     // Catch:{ Exception -> 0x0337 }
            r12.A05 = r0     // Catch:{ Exception -> 0x0337 }
        L_0x01d8:
            r0[r14] = r2     // Catch:{ Exception -> 0x0337 }
        L_0x01da:
            X.5vq[] r13 = r12.A05     // Catch:{ Exception -> 0x0337 }
            if (r13 == 0) goto L_0x01e3
            r2 = r13[r15]     // Catch:{ Exception -> 0x0337 }
            r0 = 1
            if (r2 != 0) goto L_0x01e4
        L_0x01e3:
            r0 = 0
        L_0x01e4:
            r2 = 0
            if (r0 == 0) goto L_0x01f0
            if (r13 == 0) goto L_0x01ee
            r0 = r13[r15]     // Catch:{ Exception -> 0x0337 }
            r13[r15] = r2     // Catch:{ Exception -> 0x0337 }
            goto L_0x01f4
        L_0x01ee:
            r0 = r2
            goto L_0x01f4
        L_0x01f0:
            r0 = r3[r15]     // Catch:{ Exception -> 0x0337 }
            r3[r15] = r2     // Catch:{ Exception -> 0x0337 }
        L_0x01f4:
            r3[r14] = r0     // Catch:{ Exception -> 0x0337 }
            if (r13 == 0) goto L_0x0203
            int r3 = r13.length     // Catch:{ Exception -> 0x0337 }
            r2 = 0
        L_0x01fa:
            if (r2 >= r3) goto L_0x0203
            r0 = r13[r2]     // Catch:{ Exception -> 0x0337 }
            if (r0 != 0) goto L_0x0206
            int r2 = r2 + 1
            goto L_0x01fa
        L_0x0203:
            r0 = 0
            r12.A05 = r0     // Catch:{ Exception -> 0x0337 }
        L_0x0206:
            com.facebook.rendercore.RenderTreeNode r0 = r11.A01     // Catch:{ Exception -> 0x0337 }
            X.6Tu r0 = r0.A06     // Catch:{ Exception -> 0x0337 }
            java.lang.Integer r0 = r0.A02     // Catch:{ Exception -> 0x0337 }
            if (r0 != r9) goto L_0x0222
            X.AnonymousClass00C.A0E(r10, r8)     // Catch:{ Exception -> 0x0337 }
            android.view.View r10 = (android.view.View) r10     // Catch:{ Exception -> 0x0337 }
            X.C012005e.A0J(r10)     // Catch:{ Exception -> 0x0337 }
            goto L_0x0222
        L_0x0217:
            com.facebook.rendercore.RenderTreeNode r0 = r11.A01     // Catch:{ Exception -> 0x0337 }
            X.6Tu r0 = r0.A06     // Catch:{ Exception -> 0x0337 }
            long r2 = r0.A06()     // Catch:{ Exception -> 0x0337 }
            r1.A00(r2)     // Catch:{ Exception -> 0x0337 }
        L_0x0222:
            int r7 = r7 + 1
            goto L_0x0136
        L_0x0226:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r2)     // Catch:{ Exception -> 0x0337 }
            goto L_0x0336
        L_0x022c:
            if (r17 == 0) goto L_0x0231
            r6.A01()     // Catch:{ Exception -> 0x0337 }
        L_0x0231:
            X.00i r10 = r1.A04     // Catch:{ Exception -> 0x0337 }
            r2 = 0
            java.lang.Object r3 = r10.A05(r2)     // Catch:{ Exception -> 0x0337 }
            X.5vq r3 = (X.C123045vq) r3     // Catch:{ Exception -> 0x0337 }
            X.5vr r0 = r1.A01     // Catch:{ Exception -> 0x0337 }
            if (r0 == 0) goto L_0x0326
            r2 = 0
            com.facebook.rendercore.RenderTreeNode[] r0 = r0.A03     // Catch:{ Exception -> 0x0337 }
            r0 = r0[r2]     // Catch:{ Exception -> 0x0337 }
            if (r3 != 0) goto L_0x024a
            r1.A09(r0)     // Catch:{ Exception -> 0x0337 }
            goto L_0x024d
        L_0x024a:
            r1.A05(r3, r0)     // Catch:{ Exception -> 0x0337 }
        L_0x024d:
            if (r19 == 0) goto L_0x0252
            r6.A01()     // Catch:{ Exception -> 0x0337 }
        L_0x0252:
            com.facebook.rendercore.RenderTreeNode[] r11 = r4.A03     // Catch:{ Exception -> 0x0337 }
            int r7 = r11.length     // Catch:{ Exception -> 0x0337 }
            r9 = 1
        L_0x0256:
            if (r9 >= r7) goto L_0x027a
            r8 = r11[r9]     // Catch:{ Exception -> 0x0337 }
            X.5wr r0 = r1.A00     // Catch:{ Exception -> 0x0337 }
            if (r0 == 0) goto L_0x0262
            r0 = 0
            X.AnonymousClass00C.A0D(r8, r0)     // Catch:{ Exception -> 0x0337 }
        L_0x0262:
            X.6Tu r0 = r8.A06     // Catch:{ Exception -> 0x0337 }
            long r2 = r0.A06()     // Catch:{ Exception -> 0x0337 }
            java.lang.Object r0 = r10.A05(r2)     // Catch:{ Exception -> 0x0337 }
            X.5vq r0 = (X.C123045vq) r0     // Catch:{ Exception -> 0x0337 }
            if (r0 == 0) goto L_0x0274
            r1.A05(r0, r8)     // Catch:{ Exception -> 0x0337 }
            goto L_0x0277
        L_0x0274:
            r1.A08(r8)     // Catch:{ Exception -> 0x0337 }
        L_0x0277:
            int r9 = r9 + 1
            goto L_0x0256
        L_0x027a:
            r0 = 0
            r1.A02 = r0     // Catch:{ Exception -> 0x0337 }
            if (r19 == 0) goto L_0x0287
            r6.A01()     // Catch:{ Exception -> 0x0337 }
            java.lang.String r0 = "RenderCoreExtension.afterMount"
            r6.A02(r0)     // Catch:{ Exception -> 0x0337 }
        L_0x0287:
            X.5wr r0 = r1.A00     // Catch:{ Exception -> 0x0337 }
            if (r0 == 0) goto L_0x029f
            java.util.List r3 = r0.A01     // Catch:{ Exception -> 0x0337 }
            int r2 = r3.size()     // Catch:{ Exception -> 0x0337 }
            r0 = 0
            if (r0 >= r2) goto L_0x029f
            r3.get(r0)     // Catch:{ Exception -> 0x0337 }
            java.lang.String r0 = "afterMount"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0A(r0)     // Catch:{ Exception -> 0x0337 }
            goto L_0x0336
        L_0x029f:
            r3 = 0
            r1.A03 = r3     // Catch:{ Exception -> 0x0337 }
            X.5wr r0 = r1.A00     // Catch:{ Exception -> 0x0337 }
            if (r0 == 0) goto L_0x02b7
            if (r19 == 0) goto L_0x02ad
            java.lang.String r0 = "MountState.onRenderTreeUpdated"
            r6.A02(r0)     // Catch:{ Exception -> 0x0337 }
        L_0x02ad:
            java.lang.String r2 = "null cannot be cast to non-null type com.facebook.rendercore.RenderCoreExtensionHost"
            r0 = r24
            X.AnonymousClass00C.A0E(r0, r2)     // Catch:{ Exception -> 0x0337 }
            if (r19 == 0) goto L_0x02c0
            goto L_0x02ba
        L_0x02b7:
            if (r19 == 0) goto L_0x02c0
            goto L_0x02bd
        L_0x02ba:
            r6.A01()     // Catch:{ Exception -> 0x0337 }
        L_0x02bd:
            r6.A01()     // Catch:{ Exception -> 0x0337 }
        L_0x02c0:
            r1.A03 = r3
            long r3 = java.lang.System.currentTimeMillis()
            java.lang.Object r0 = r20.get()
            X.AnonymousClass00C.A08(r0)
            X.5S6 r0 = (X.AnonymousClass5S6) r0
            int r0 = r5.compareTo(r0)
            if (r0 < 0) goto L_0x0325
            java.util.Set r0 = r21.A01()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0325
            java.util.Set r0 = r21.A01()
            java.util.ArrayList r5 = X.AnonymousClass001.A0I()
            java.util.Iterator r1 = r0.iterator()
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x02fb
            r1.next()
            java.lang.String r0 = "getEvents"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0A(r0)
            throw r0
        L_0x02fb:
            boolean r0 = X.C36411kG.A1a(r5)
            if (r0 == 0) goto L_0x0325
            java.util.LinkedHashMap r2 = X.C36431kI.A1G()
            int r1 = r24.hashCode()
            r0 = r22
            X.C36341k9.A1K(r0, r2, r1)
            A0A(r2, r7, r3)
            java.util.Iterator r1 = r5.iterator()
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0325
            r1.next()
            java.lang.String r0 = "onEvent"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0A(r0)
            throw r0
        L_0x0325:
            return
        L_0x0326:
            java.lang.IllegalStateException r0 = X.C36381kD.A0l()     // Catch:{ Exception -> 0x0337 }
            goto L_0x0336
        L_0x032b:
            java.lang.String r0 = "Trying to mount while already mounting!"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)     // Catch:{ Exception -> 0x0337 }
            goto L_0x0336
        L_0x0332:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r2)     // Catch:{ Exception -> 0x0337 }
        L_0x0336:
            throw r0     // Catch:{ Exception -> 0x0337 }
        L_0x0337:
            r7 = move-exception
            X.5S6 r6 = X.AnonymousClass5S6.ERROR     // Catch:{ all -> 0x0353 }
            java.lang.String r3 = "MountState:Exception"
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x0353 }
            java.lang.String r0 = "Exception while mounting: "
            java.lang.String r0 = X.C36331k8.A0i(r0, r2, r7)     // Catch:{ all -> 0x0353 }
            X.AnonymousClass6RL.A01(r6, r3, r0, r7)     // Catch:{ all -> 0x0353 }
            boolean r0 = r7 instanceof java.lang.RuntimeException     // Catch:{ all -> 0x0353 }
            if (r0 == 0) goto L_0x034e
            throw r7     // Catch:{ all -> 0x0353 }
        L_0x034e:
            java.lang.RuntimeException r0 = X.AnonymousClass001.A0B(r7)     // Catch:{ all -> 0x0353 }
            throw r0     // Catch:{ all -> 0x0353 }
        L_0x0353:
            r7 = move-exception
            r0 = 0
            r1.A03 = r0
            long r2 = java.lang.System.currentTimeMillis()
            java.lang.Object r0 = r20.get()
            X.AnonymousClass00C.A08(r0)
            X.5S6 r0 = (X.AnonymousClass5S6) r0
            int r0 = r5.compareTo(r0)
            if (r0 < 0) goto L_0x03bf
            java.util.Set r0 = r21.A01()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x03bf
            java.util.Set r0 = r21.A01()
            java.util.ArrayList r6 = X.AnonymousClass001.A0I()
            java.util.Iterator r5 = r0.iterator()
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0390
            r5.next()
            java.lang.String r0 = "getEvents"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0A(r0)
            throw r0
        L_0x0390:
            boolean r0 = X.C36411kG.A1a(r6)
            if (r0 == 0) goto L_0x03bf
            java.util.LinkedHashMap r5 = X.C36431kI.A1G()
            X.4ds r0 = r1.A07
            int r1 = r0.hashCode()
            r0 = r22
            X.C36341k9.A1K(r0, r5, r1)
            com.facebook.rendercore.RenderTreeNode[] r0 = r4.A03
            int r0 = r0.length
            A0A(r5, r0, r2)
            java.util.Iterator r1 = r6.iterator()
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x03bf
            r1.next()
            java.lang.String r0 = "onEvent"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0A(r0)
            throw r0
        L_0x03bf:
            throw r7
        L_0x03c0:
            java.lang.String r0 = "Trying to mount a null RenderTreeNode"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6Y3.A0F(X.5vr):void");
    }

    private final void A01(C120895sG r7, RenderTreeNode renderTreeNode, C132456Tu r9, Object obj) {
        C132096Sc.A00();
        C120895sG r2 = r7;
        C132456Tu r0 = r9;
        r0.A0C(this.A06, r2, this.A05, obj, renderTreeNode.A07);
        C123655wr r02 = this.A00;
        if (r02 != null) {
            List list = r02.A01;
            if (0 < list.size()) {
                throw C90464aC.A0T(list);
            }
        }
    }

    public static void A07(AnonymousClass68E r1, C132456Tu r2, String str, StringBuilder sb) {
        sb.append(str);
        sb.append(r2.A08());
        r1.A02(sb.toString());
    }
}
