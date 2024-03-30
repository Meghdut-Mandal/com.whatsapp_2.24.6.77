package X;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.util.Property;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.054  reason: invalid class name */
public abstract class AnonymousClass054 implements Cloneable {
    public static ThreadLocal A0L = new ThreadLocal();
    public static final AnonymousClass057 A0M = new AnonymousClass057();
    public static final int[] A0N = {2, 1, 3, 4};
    public ArrayList A00 = new ArrayList();
    public long A01 = -1;
    public long A02 = -1;
    public TimeInterpolator A03 = null;
    public AnonymousClass057 A04 = A0M;
    public AnonymousClass0TZ A05;
    public AnonymousClass05C A06;
    public C017307k A07 = null;
    public AnonymousClass05B A08 = new AnonymousClass05B();
    public AnonymousClass05B A09 = new AnonymousClass05B();
    public String A0A = getClass().getName();
    public ArrayList A0B;
    public ArrayList A0C;
    public ArrayList A0D = new ArrayList();
    public ArrayList A0E = new ArrayList();
    public int[] A0F = A0N;
    public int A0G = 0;
    public ArrayList A0H = new ArrayList();
    public ArrayList A0I = null;
    public boolean A0J = false;
    public boolean A0K = false;

    public Animator A04(ViewGroup viewGroup, AnonymousClass0X9 r3, AnonymousClass0X9 r4) {
        return null;
    }

    /* renamed from: A05 */
    public AnonymousClass054 clone() {
        try {
            AnonymousClass054 r1 = (AnonymousClass054) super.clone();
            r1.A0H = new ArrayList();
            r1.A09 = new AnonymousClass05B();
            r1.A08 = new AnonymousClass05B();
            r1.A0C = null;
            r1.A0B = null;
            return r1;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public abstract void A0S(AnonymousClass0X9 r1);

    public abstract void A0T(AnonymousClass0X9 r1);

    public boolean A0V(AnonymousClass0X9 r8, AnonymousClass0X9 r9) {
        if (r8 == null || r9 == null) {
            return false;
        }
        String[] A0W = A0W();
        if (A0W != null) {
            for (String str : A0W) {
                Object obj = r8.A02.get(str);
                Object obj2 = r9.A02.get(str);
                if (obj == null) {
                    if (obj2 == null) {
                    }
                } else if (obj2 != null && !(true ^ obj.equals(obj2))) {
                }
            }
            return false;
        }
        Map map = r8.A02;
        for (Object next : map.keySet()) {
            Object obj3 = map.get(next);
            Object obj4 = r9.A02.get(next);
            if (obj3 == null) {
                if (obj4 == null) {
                }
            } else if (obj4 != null && !(true ^ obj3.equals(obj4))) {
            }
        }
        return false;
        return true;
    }

    public String[] A0W() {
        return null;
    }

    public static AnonymousClass008 A00() {
        ThreadLocal threadLocal = A0L;
        AnonymousClass008 r0 = (AnonymousClass008) threadLocal.get();
        if (r0 != null) {
            return r0;
        }
        AnonymousClass008 r02 = new AnonymousClass008();
        threadLocal.set(r02);
        return r02;
    }

    public static void A01(View view, AnonymousClass0X9 r7, AnonymousClass05B r8) {
        r8.A02.put(view, r7);
        int id = view.getId();
        if (id >= 0) {
            SparseArray sparseArray = r8.A00;
            if (sparseArray.indexOfKey(id) >= 0) {
                sparseArray.put(id, (Object) null);
            } else {
                sparseArray.put(id, view);
            }
        }
        String A032 = C011004s.A03(view);
        if (A032 != null) {
            AnonymousClass008 r1 = r8.A01;
            if (r1.containsKey(A032)) {
                r1.put(A032, (Object) null);
            } else {
                r1.put(A032, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                C000700i r4 = r8.A03;
                if (r4.A01(itemIdAtPosition) >= 0) {
                    View view2 = (View) r4.A05(itemIdAtPosition);
                    if (view2 != null) {
                        A03(view2, false);
                        r4.A0A(itemIdAtPosition, (Object) null);
                        return;
                    }
                    return;
                }
                A03(view, true);
                r4.A0A(itemIdAtPosition, view);
            }
        }
    }

    private void A02(View view, boolean z) {
        AnonymousClass05B r0;
        if (view != null) {
            view.getId();
            if (view.getParent() instanceof ViewGroup) {
                AnonymousClass0X9 r1 = new AnonymousClass0X9(view);
                if (z) {
                    A0T(r1);
                } else {
                    A0S(r1);
                }
                r1.A01.add(this);
                A0R(r1);
                if (z) {
                    r0 = this.A09;
                } else {
                    r0 = this.A08;
                }
                A01(view, r1, r0);
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    A02(viewGroup.getChildAt(i), z);
                }
            }
        }
    }

    public AnonymousClass054 A08(View view) {
        this.A0E.add(view);
        return this;
    }

    public AnonymousClass054 A09(View view) {
        this.A0E.remove(view);
        return this;
    }

    public AnonymousClass054 A0A(C17290r2 r2) {
        ArrayList arrayList = this.A0I;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.A0I = arrayList;
        }
        arrayList.add(r2);
        return this;
    }

    public AnonymousClass054 A0B(C17290r2 r2) {
        ArrayList arrayList = this.A0I;
        if (arrayList != null) {
            arrayList.remove(r2);
            if (this.A0I.size() == 0) {
                this.A0I = null;
            }
        }
        return this;
    }

    public AnonymousClass0X9 A0C(View view, boolean z) {
        ArrayList arrayList;
        ArrayList arrayList2;
        C017307k r0 = this.A07;
        if (r0 != null) {
            return r0.A0C(view, z);
        }
        if (z) {
            arrayList = this.A0C;
        } else {
            arrayList = this.A0B;
        }
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            AnonymousClass0X9 r1 = (AnonymousClass0X9) arrayList.get(i);
            if (r1 == null) {
                return null;
            }
            if (r1.A00 != view) {
                i++;
            } else if (i < 0) {
                return null;
            } else {
                if (z) {
                    arrayList2 = this.A0B;
                } else {
                    arrayList2 = this.A0C;
                }
                return (AnonymousClass0X9) arrayList2.get(i);
            }
        }
        return null;
    }

    public AnonymousClass0X9 A0D(View view, boolean z) {
        AnonymousClass05B r0;
        C017307k r02 = this.A07;
        if (r02 != null) {
            return r02.A0D(view, z);
        }
        if (z) {
            r0 = this.A09;
        } else {
            r0 = this.A08;
        }
        return (AnonymousClass0X9) r0.A02.get(view);
    }

    public String A0E(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(getClass().getSimpleName());
        sb.append("@");
        sb.append(Integer.toHexString(hashCode()));
        sb.append(": ");
        String obj = sb.toString();
        long j = this.A01;
        if (j != -1) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(obj);
            sb2.append("dur(");
            sb2.append(j);
            sb2.append(") ");
            obj = sb2.toString();
        }
        long j2 = this.A02;
        if (j2 != -1) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(obj);
            sb3.append("dly(");
            sb3.append(j2);
            sb3.append(") ");
            obj = sb3.toString();
        }
        TimeInterpolator timeInterpolator = this.A03;
        if (timeInterpolator != null) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(obj);
            sb4.append("interp(");
            sb4.append(timeInterpolator);
            sb4.append(") ");
            obj = sb4.toString();
        }
        ArrayList arrayList = this.A0D;
        if (arrayList.size() <= 0 && this.A0E.size() <= 0) {
            return obj;
        }
        StringBuilder sb5 = new StringBuilder();
        sb5.append(obj);
        sb5.append("tgts(");
        String obj2 = sb5.toString();
        if (arrayList.size() > 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                if (i > 0) {
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append(obj2);
                    sb6.append(", ");
                    obj2 = sb6.toString();
                }
                StringBuilder sb7 = new StringBuilder();
                sb7.append(obj2);
                sb7.append(arrayList.get(i));
                obj2 = sb7.toString();
            }
        }
        ArrayList arrayList2 = this.A0E;
        if (arrayList2.size() > 0) {
            for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                if (i2 > 0) {
                    StringBuilder sb8 = new StringBuilder();
                    sb8.append(obj2);
                    sb8.append(", ");
                    obj2 = sb8.toString();
                }
                StringBuilder sb9 = new StringBuilder();
                sb9.append(obj2);
                sb9.append(arrayList2.get(i2));
                obj2 = sb9.toString();
            }
        }
        StringBuilder sb10 = new StringBuilder();
        sb10.append(obj2);
        sb10.append(")");
        return sb10.toString();
    }

    public void A0F() {
        int i = this.A0G - 1;
        this.A0G = i;
        if (i == 0) {
            ArrayList arrayList = this.A0I;
            if (arrayList != null && arrayList.size() > 0) {
                AbstractList abstractList = (AbstractList) arrayList.clone();
                int size = abstractList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((C17290r2) abstractList.get(i2)).Bjd(this);
                }
            }
            int i3 = 0;
            while (true) {
                C000700i r1 = this.A09.A03;
                if (i3 >= r1.A00()) {
                    break;
                }
                View view = (View) r1.A04(i3);
                if (view != null) {
                    A03(view, false);
                }
                i3++;
            }
            int i4 = 0;
            while (true) {
                C000700i r12 = this.A08.A03;
                if (i4 < r12.A00()) {
                    View view2 = (View) r12.A04(i4);
                    if (view2 != null) {
                        A03(view2, false);
                    }
                    i4++;
                } else {
                    this.A0J = true;
                    return;
                }
            }
        }
    }

    public void A0H() {
        ArrayList arrayList = this.A00;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            ((Animator) arrayList.get(size)).cancel();
        }
        ArrayList arrayList2 = this.A0I;
        if (arrayList2 != null && arrayList2.size() > 0) {
            AbstractList abstractList = (AbstractList) arrayList2.clone();
            int size2 = abstractList.size();
            for (int i = 0; i < size2; i++) {
                ((C17290r2) abstractList.get(i)).Bjc(this);
            }
        }
    }

    public void A0I() {
        if (this.A0G == 0) {
            ArrayList arrayList = this.A0I;
            if (arrayList != null && arrayList.size() > 0) {
                AbstractList abstractList = (AbstractList) arrayList.clone();
                int size = abstractList.size();
                for (int i = 0; i < size; i++) {
                    ((C17290r2) abstractList.get(i)).Bjg(this);
                }
            }
            this.A0J = false;
        }
        this.A0G++;
    }

    public void A0J(View view) {
        if (!this.A0J) {
            ArrayList arrayList = this.A00;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((Animator) arrayList.get(size)).pause();
            }
            ArrayList arrayList2 = this.A0I;
            if (arrayList2 != null && arrayList2.size() > 0) {
                AbstractList abstractList = (AbstractList) arrayList2.clone();
                int size2 = abstractList.size();
                for (int i = 0; i < size2; i++) {
                    ((C17290r2) abstractList.get(i)).Bje(this);
                }
            }
            this.A0K = true;
        }
    }

    public void A0K(View view) {
        if (this.A0K) {
            if (!this.A0J) {
                ArrayList arrayList = this.A00;
                int size = arrayList.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    }
                    ((Animator) arrayList.get(size)).resume();
                }
                ArrayList arrayList2 = this.A0I;
                if (arrayList2 != null && arrayList2.size() > 0) {
                    AbstractList abstractList = (AbstractList) arrayList2.clone();
                    int size2 = abstractList.size();
                    for (int i = 0; i < size2; i++) {
                        ((C17290r2) abstractList.get(i)).Bjf(this);
                    }
                }
            }
            this.A0K = false;
        }
    }

    public void A0N(ViewGroup viewGroup, boolean z) {
        AnonymousClass05B r0;
        AnonymousClass05B r02;
        AnonymousClass05B r03;
        if (z) {
            AnonymousClass05B r1 = this.A09;
            r1.A02.clear();
            r1.A00.clear();
            r0 = this.A09;
        } else {
            AnonymousClass05B r12 = this.A08;
            r12.A02.clear();
            r12.A00.clear();
            r0 = this.A08;
        }
        r0.A03.A07();
        ArrayList arrayList = this.A0D;
        if (arrayList.size() > 0 || this.A0E.size() > 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                View findViewById = viewGroup.findViewById(((Number) arrayList.get(i)).intValue());
                if (findViewById != null) {
                    AnonymousClass0X9 r13 = new AnonymousClass0X9(findViewById);
                    if (z) {
                        A0T(r13);
                    } else {
                        A0S(r13);
                    }
                    r13.A01.add(this);
                    A0R(r13);
                    if (z) {
                        r03 = this.A09;
                    } else {
                        r03 = this.A08;
                    }
                    A01(findViewById, r13, r03);
                }
            }
            int i2 = 0;
            while (true) {
                ArrayList arrayList2 = this.A0E;
                if (i2 < arrayList2.size()) {
                    View view = (View) arrayList2.get(i2);
                    AnonymousClass0X9 r14 = new AnonymousClass0X9(view);
                    if (z) {
                        A0T(r14);
                    } else {
                        A0S(r14);
                    }
                    r14.A01.add(this);
                    A0R(r14);
                    if (z) {
                        r02 = this.A09;
                    } else {
                        r02 = this.A08;
                    }
                    A01(view, r14, r02);
                    i2++;
                } else {
                    return;
                }
            }
        } else {
            A02(viewGroup, z);
        }
    }

    public void A0O(AnonymousClass057 r1) {
        if (r1 == null) {
            r1 = A0M;
        }
        this.A04 = r1;
    }

    public void A0R(AnonymousClass0X9 r8) {
        if (this.A06 != null) {
            Map map = r8.A02;
            if (!map.isEmpty()) {
                String[] strArr = AnonymousClass05D.A02;
                int i = 0;
                while (map.containsKey(strArr[i])) {
                    i++;
                    if (i >= 2) {
                        return;
                    }
                }
                View view = r8.A00;
                Object obj = map.get("android:visibility:visibility");
                if (obj == null) {
                    obj = Integer.valueOf(view.getVisibility());
                }
                map.put("android:visibilityPropagation:visibility", obj);
                int[] iArr = new int[2];
                view.getLocationOnScreen(iArr);
                int round = iArr[0] + Math.round(view.getTranslationX());
                iArr[0] = round;
                iArr[0] = round + (view.getWidth() / 2);
                int round2 = iArr[1] + Math.round(view.getTranslationY());
                iArr[1] = round2;
                iArr[1] = round2 + (view.getHeight() / 2);
                map.put("android:visibilityPropagation:center", iArr);
            }
        }
    }

    public String toString() {
        return A0E("");
    }

    public void A0G() {
        A0I();
        AnonymousClass008 A002 = A00();
        Iterator it = this.A0H.iterator();
        while (it.hasNext()) {
            Animator animator = (Animator) it.next();
            if (A002.containsKey(animator)) {
                A0I();
                if (animator != null) {
                    animator.addListener(new AnonymousClass0DJ(A002, this));
                    long j = this.A01;
                    if (j >= 0) {
                        animator.setDuration(j);
                    }
                    long j2 = this.A02;
                    if (j2 >= 0) {
                        animator.setStartDelay(j2 + animator.getStartDelay());
                    }
                    TimeInterpolator timeInterpolator = this.A03;
                    if (timeInterpolator != null) {
                        animator.setInterpolator(timeInterpolator);
                    }
                    animator.addListener(new C18020sU(this, 0));
                    animator.start();
                }
            }
        }
        this.A0H.clear();
        A0F();
    }

    public void A0L(ViewGroup viewGroup) {
        AnonymousClass008 A002 = A00();
        int size = A002.size();
        if (viewGroup != null && size != 0) {
            Property property = AnonymousClass0W5.A00;
            C10010dW r3 = new C10010dW(viewGroup);
            AnonymousClass008 r2 = new AnonymousClass008((AnonymousClass007) A002);
            A002.clear();
            while (true) {
                size--;
                if (size >= 0) {
                    AnonymousClass0TM r1 = (AnonymousClass0TM) r2.A06(size);
                    if (r1.A01 != null && r3.equals(r1.A04)) {
                        ((Animator) r2.A04(size)).end();
                    }
                } else {
                    return;
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0114, code lost:
        if (r1.isEmpty() != false) goto L_0x0116;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x01f0, code lost:
        if (r5 == null) goto L_0x01f2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x0045 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x013e  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x014c  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x017c  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x018b  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x01a3 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x01b1  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x01dc  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x01e7  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x01ee  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0M(android.view.ViewGroup r28, X.AnonymousClass05B r29, X.AnonymousClass05B r30, java.util.ArrayList r31, java.util.ArrayList r32) {
        /*
            r27 = this;
            X.008 r25 = A00()
            android.util.SparseIntArray r10 = new android.util.SparseIntArray
            r10.<init>()
            r26 = r31
            int r24 = r26.size()
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r9 = 0
        L_0x0015:
            r8 = r27
            r0 = r24
            if (r9 >= r0) goto L_0x01fa
            r0 = r26
            java.lang.Object r5 = r0.get(r9)
            X.0X9 r5 = (X.AnonymousClass0X9) r5
            r0 = r32
            java.lang.Object r4 = r0.get(r9)
            X.0X9 r4 = (X.AnonymousClass0X9) r4
            if (r5 == 0) goto L_0x0036
            java.util.ArrayList r0 = r5.A01
            boolean r0 = r0.contains(r8)
            if (r0 != 0) goto L_0x0036
            r5 = 0
        L_0x0036:
            if (r4 == 0) goto L_0x0041
            java.util.ArrayList r0 = r4.A01
            boolean r0 = r0.contains(r8)
            if (r0 != 0) goto L_0x0041
            r4 = 0
        L_0x0041:
            if (r5 != 0) goto L_0x0048
            if (r4 != 0) goto L_0x0050
        L_0x0045:
            int r9 = r9 + 1
            goto L_0x0015
        L_0x0048:
            if (r4 == 0) goto L_0x0050
            boolean r0 = r8.A0V(r5, r4)
            if (r0 == 0) goto L_0x0045
        L_0x0050:
            r0 = r28
            android.animation.Animator r7 = r8.A04(r0, r5, r4)
            if (r7 == 0) goto L_0x0045
            if (r4 == 0) goto L_0x00bf
            android.view.View r11 = r4.A00
            java.lang.String[] r13 = r8.A0W()
            if (r13 == 0) goto L_0x00c1
            int r0 = r13.length
            r16 = r0
            if (r0 <= 0) goto L_0x00c1
            X.0X9 r6 = new X.0X9
            r6.<init>(r11)
            r0 = r30
            X.008 r0 = r0.A02
            java.lang.Object r14 = r0.get(r11)
            X.0X9 r14 = (X.AnonymousClass0X9) r14
            if (r14 == 0) goto L_0x008e
            r12 = 0
        L_0x0079:
            java.util.Map r0 = r6.A02
            r1 = r0
            r15 = r13[r12]
            java.util.Map r0 = r14.A02
            java.lang.Object r0 = r0.get(r15)
            r1.put(r15, r0)
            int r12 = r12 + 1
            r0 = r16
            if (r12 >= r0) goto L_0x008e
            goto L_0x0079
        L_0x008e:
            int r12 = r25.size()
            r1 = 0
        L_0x0093:
            if (r1 >= r12) goto L_0x00c2
            r0 = r25
            java.lang.Object r13 = r0.A04(r1)
            java.lang.Object r14 = r0.get(r13)
            X.0TM r14 = (X.AnonymousClass0TM) r14
            X.0X9 r0 = r14.A03
            if (r0 == 0) goto L_0x00bc
            android.view.View r0 = r14.A01
            if (r0 != r11) goto L_0x00bc
            java.lang.String r13 = r14.A00
            java.lang.String r0 = r8.A0A
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L_0x00bc
            X.0X9 r0 = r14.A03
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto L_0x00bc
            goto L_0x0045
        L_0x00bc:
            int r1 = r1 + 1
            goto L_0x0093
        L_0x00bf:
            android.view.View r11 = r5.A00
        L_0x00c1:
            r6 = 0
        L_0x00c2:
            X.05C r12 = r8.A06
            if (r12 == 0) goto L_0x00de
            X.05D r12 = (X.AnonymousClass05D) r12
            r22 = 0
            if (r5 != 0) goto L_0x0102
            if (r4 != 0) goto L_0x0102
            r0 = 0
        L_0x00d0:
            java.util.ArrayList r4 = r8.A0H
            int r5 = r4.size()
            int r4 = (int) r0
            r10.put(r5, r4)
            long r2 = java.lang.Math.min(r0, r2)
        L_0x00de:
            java.lang.String r5 = r8.A0A
            android.util.Property r0 = X.AnonymousClass0W5.A00
            X.0dW r4 = new X.0dW
            r0 = r28
            r4.<init>(r0)
            X.0TM r1 = new X.0TM
            r12 = r1
            r13 = r11
            r14 = r8
            r15 = r6
            r16 = r4
            r17 = r5
            r12.<init>(r13, r14, r15, r16, r17)
            r0 = r25
            r0.put(r7, r1)
            java.util.ArrayList r0 = r8.A0H
            r0.add(r7)
            goto L_0x0045
        L_0x0102:
            X.0TZ r1 = r8.A05
            if (r1 == 0) goto L_0x0116
            X.0sn r1 = (X.C18210sn) r1
            int r0 = r1.A02
            java.lang.Object r1 = r1.A01
            android.graphics.Rect r1 = (android.graphics.Rect) r1
            if (r0 == 0) goto L_0x0117
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x0117
        L_0x0116:
            r1 = 0
        L_0x0117:
            r15 = 1
            if (r4 == 0) goto L_0x012e
            if (r5 == 0) goto L_0x01f6
            java.util.Map r13 = r5.A02
            java.lang.String r0 = "android:visibilityPropagation:visibility"
            java.lang.Object r0 = r13.get(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x01f6
            int r0 = r0.intValue()
            if (r0 != 0) goto L_0x01f6
        L_0x012e:
            r13 = -1
        L_0x012f:
            r14 = 0
            if (r5 == 0) goto L_0x01ee
            java.util.Map r4 = r5.A02
            java.lang.String r0 = "android:visibilityPropagation:center"
            java.lang.Object r0 = r4.get(r0)
            int[] r0 = (int[]) r0
            if (r0 == 0) goto L_0x01ee
            r21 = r0[r14]
        L_0x0140:
            java.util.Map r4 = r5.A02
            java.lang.String r0 = "android:visibilityPropagation:center"
            java.lang.Object r0 = r4.get(r0)
            int[] r0 = (int[]) r0
            if (r0 == 0) goto L_0x01f2
            r20 = r0[r15]
        L_0x014e:
            r4 = 2
            int[] r5 = new int[r4]
            r0 = r28
            r0.getLocationOnScreen(r5)
            r19 = r5[r14]
            float r0 = r28.getTranslationX()
            int r0 = java.lang.Math.round(r0)
            int r19 = r19 + r0
            r18 = r5[r15]
            float r0 = r28.getTranslationY()
            int r0 = java.lang.Math.round(r0)
            int r18 = r18 + r0
            int r0 = r28.getWidth()
            int r17 = r19 + r0
            int r0 = r28.getHeight()
            int r16 = r18 + r0
            if (r1 == 0) goto L_0x01e7
            int r15 = r1.centerX()
            int r14 = r1.centerY()
        L_0x0184:
            int r4 = r12.A01
            r1 = 5
            r0 = 3
            r5 = 0
            if (r4 == r0) goto L_0x01dc
            if (r4 == r1) goto L_0x01d1
            r0 = 48
            if (r4 == r0) goto L_0x01c6
            r0 = 80
            if (r4 != r0) goto L_0x019f
            int r20 = r20 - r18
            int r15 = r15 - r21
            int r0 = java.lang.Math.abs(r15)
            int r5 = r20 + r0
        L_0x019f:
            float r14 = (float) r5
            r0 = 3
            if (r4 == r0) goto L_0x01c1
            if (r4 == r1) goto L_0x01c1
            int r0 = r28.getHeight()
        L_0x01a9:
            float r0 = (float) r0
            float r14 = r14 / r0
            long r4 = r8.A01
            int r0 = (r4 > r22 ? 1 : (r4 == r22 ? 0 : -1))
            if (r0 >= 0) goto L_0x01b3
            r4 = 300(0x12c, double:1.48E-321)
        L_0x01b3:
            long r0 = (long) r13
            long r4 = r4 * r0
            float r1 = (float) r4
            float r0 = r12.A00
            float r1 = r1 / r0
            float r1 = r1 * r14
            int r0 = java.lang.Math.round(r1)
            long r0 = (long) r0
            goto L_0x00d0
        L_0x01c1:
            int r0 = r28.getWidth()
            goto L_0x01a9
        L_0x01c6:
            int r16 = r16 - r20
            int r15 = r15 - r21
            int r0 = java.lang.Math.abs(r15)
            int r5 = r16 + r0
            goto L_0x019f
        L_0x01d1:
            int r21 = r21 - r19
            int r14 = r14 - r20
            int r0 = java.lang.Math.abs(r14)
            int r5 = r21 + r0
            goto L_0x019f
        L_0x01dc:
            int r17 = r17 - r21
            int r14 = r14 - r20
            int r0 = java.lang.Math.abs(r14)
            int r5 = r17 + r0
            goto L_0x019f
        L_0x01e7:
            int r15 = r19 + r17
            int r15 = r15 / r4
            int r14 = r18 + r16
            int r14 = r14 / r4
            goto L_0x0184
        L_0x01ee:
            r21 = -1
            if (r5 != 0) goto L_0x0140
        L_0x01f2:
            r20 = -1
            goto L_0x014e
        L_0x01f6:
            r5 = r4
            r13 = 1
            goto L_0x012f
        L_0x01fa:
            int r0 = r10.size()
            if (r0 == 0) goto L_0x0224
            r7 = 0
        L_0x0201:
            int r0 = r10.size()
            if (r7 >= r0) goto L_0x0224
            int r1 = r10.keyAt(r7)
            java.util.ArrayList r0 = r8.A0H
            java.lang.Object r6 = r0.get(r1)
            android.animation.Animator r6 = (android.animation.Animator) r6
            int r0 = r10.valueAt(r7)
            long r4 = (long) r0
            long r4 = r4 - r2
            long r0 = r6.getStartDelay()
            long r4 = r4 + r0
            r6.setStartDelay(r4)
            int r7 = r7 + 1
            goto L_0x0201
        L_0x0224:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass054.A0M(android.view.ViewGroup, X.05B, X.05B, java.util.ArrayList, java.util.ArrayList):void");
    }

    public boolean A0U(View view) {
        int id = view.getId();
        ArrayList arrayList = this.A0D;
        if ((arrayList.size() != 0 || this.A0E.size() != 0) && !arrayList.contains(Integer.valueOf(id)) && !this.A0E.contains(view)) {
            return false;
        }
        return true;
    }

    public AnonymousClass054 A06(long j) {
        this.A01 = j;
        return this;
    }

    public AnonymousClass054 A07(TimeInterpolator timeInterpolator) {
        this.A03 = timeInterpolator;
        return this;
    }

    public void A0P(AnonymousClass0TZ r1) {
        this.A05 = r1;
    }

    public void A0Q(AnonymousClass05C r1) {
        this.A06 = r1;
    }

    public static void A03(View view, boolean z) {
        view.setHasTransientState(z);
    }
}
