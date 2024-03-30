package X;

import android.animation.Animator;
import android.util.Property;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.0bg  reason: invalid class name and case insensitive filesystem */
public class C09010bg implements View.OnAttachStateChangeListener, ViewTreeObserver.OnPreDrawListener {
    public AnonymousClass054 A00;
    public ViewGroup A01;

    public void onViewAttachedToWindow(View view) {
    }

    public static void A00(AnonymousClass007 r3, AnonymousClass007 r4, AnonymousClass054 r5, Object obj, Object obj2) {
        View view = (View) obj;
        if (view != null && r5.A0U(view)) {
            Object obj3 = r3.get(obj2);
            Object obj4 = r4.get(view);
            if (obj3 != null && obj4 != null) {
                r5.A0C.add(obj3);
                r5.A0B.add(obj4);
                r3.remove(obj2);
                r4.remove(view);
            }
        }
    }

    public boolean onPreDraw() {
        AnonymousClass0TM r9;
        AnonymousClass0X9 r2;
        ViewGroup viewGroup = this.A01;
        viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
        viewGroup.removeOnAttachStateChangeListener(this);
        if (C018607y.A02.remove(viewGroup)) {
            AnonymousClass008 A002 = C018607y.A00();
            AbstractCollection abstractCollection = (AbstractCollection) A002.get(viewGroup);
            ArrayList arrayList = null;
            if (abstractCollection == null) {
                abstractCollection = AnonymousClass001.A0I();
                A002.put(viewGroup, abstractCollection);
            } else if (abstractCollection.size() > 0) {
                arrayList = new ArrayList(abstractCollection);
            }
            AnonymousClass054 r13 = this.A00;
            abstractCollection.add(r13);
            r13.A0A(new AnonymousClass0IQ(A002, this));
            r13.A0N(viewGroup, false);
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((AnonymousClass054) it.next()).A0K(viewGroup);
                }
            }
            r13.A0C = AnonymousClass001.A0I();
            r13.A0B = AnonymousClass001.A0I();
            AnonymousClass05B r8 = r13.A09;
            AnonymousClass05B r6 = r13.A08;
            AnonymousClass008 r7 = new AnonymousClass008((AnonymousClass007) r8.A02);
            AnonymousClass008 r5 = new AnonymousClass008((AnonymousClass007) r6.A02);
            int i = 0;
            while (true) {
                int[] iArr = r13.A0F;
                if (i >= iArr.length) {
                    break;
                }
                int i2 = iArr[i];
                if (i2 == 1) {
                    int size = r7.size();
                    while (true) {
                        size--;
                        if (size < 0) {
                            break;
                        }
                        View view = (View) r7.A04(size);
                        if (view != null && r13.A0U(view) && (r2 = (AnonymousClass0X9) r5.remove(view)) != null && r13.A0U(r2.A00)) {
                            r13.A0C.add(r7.A05(size));
                            r13.A0B.add(r2);
                        }
                    }
                } else if (i2 == 2) {
                    AnonymousClass008 r11 = r8.A01;
                    AnonymousClass008 r10 = r6.A01;
                    int size2 = r11.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        View view2 = (View) r11.A06(i3);
                        if (view2 != null && r13.A0U(view2)) {
                            A00(r7, r5, r13, r10.get(r11.A04(i3)), view2);
                        }
                    }
                } else if (i2 == 3) {
                    SparseArray sparseArray = r8.A00;
                    SparseArray sparseArray2 = r6.A00;
                    int size3 = sparseArray.size();
                    for (int i4 = 0; i4 < size3; i4++) {
                        View view3 = (View) sparseArray.valueAt(i4);
                        if (view3 != null && r13.A0U(view3)) {
                            A00(r7, r5, r13, sparseArray2.get(sparseArray.keyAt(i4)), view3);
                        }
                    }
                } else if (i2 == 4) {
                    C000700i r12 = r8.A03;
                    C000700i r112 = r6.A03;
                    int A003 = r12.A00();
                    for (int i5 = 0; i5 < A003; i5++) {
                        View view4 = (View) r12.A04(i5);
                        if (view4 != null && r13.A0U(view4)) {
                            A00(r7, r5, r13, r112.A05(r12.A02(i5)), view4);
                        }
                    }
                }
                i++;
            }
            for (int i6 = 0; i6 < r7.size(); i6++) {
                AnonymousClass0X9 r1 = (AnonymousClass0X9) r7.A06(i6);
                if (r13.A0U(r1.A00)) {
                    r13.A0C.add(r1);
                    r13.A0B.add((Object) null);
                }
            }
            for (int i7 = 0; i7 < r5.size(); i7++) {
                AnonymousClass0X9 r14 = (AnonymousClass0X9) r5.A06(i7);
                if (r13.A0U(r14.A00)) {
                    r13.A0B.add(r14);
                    r13.A0C.add((Object) null);
                }
            }
            AnonymousClass008 A004 = AnonymousClass054.A00();
            int size4 = A004.size();
            Property property = AnonymousClass0W5.A00;
            C10010dW r52 = new C10010dW(viewGroup);
            for (int i8 = size4 - 1; i8 >= 0; i8--) {
                Animator animator = (Animator) A004.A04(i8);
                if (!(animator == null || (r9 = (AnonymousClass0TM) A004.get(animator)) == null || r9.A01 == null || !r52.equals(r9.A04))) {
                    AnonymousClass0X9 r82 = r9.A03;
                    View view5 = r9.A01;
                    AnonymousClass0X9 A0D = r13.A0D(view5, true);
                    AnonymousClass0X9 A0C = r13.A0C(view5, true);
                    if (!(A0D == null && A0C == null && (A0C = (AnonymousClass0X9) r13.A08.A02.get(view5)) == null) && r9.A02.A0V(r82, A0C)) {
                        if (animator.isRunning() || animator.isStarted()) {
                            animator.cancel();
                        } else {
                            A004.remove(animator);
                        }
                    }
                }
            }
            r13.A0M(viewGroup, r13.A09, r13.A08, r13.A0C, r13.A0B);
            r13.A0G();
        }
        return true;
    }

    public void onViewDetachedFromWindow(View view) {
        ViewGroup viewGroup = this.A01;
        viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
        viewGroup.removeOnAttachStateChangeListener(this);
        C018607y.A02.remove(viewGroup);
        AbstractCollection abstractCollection = (AbstractCollection) C018607y.A00().get(viewGroup);
        if (abstractCollection != null && abstractCollection.size() > 0) {
            Iterator it = abstractCollection.iterator();
            while (it.hasNext()) {
                ((AnonymousClass054) it.next()).A0K(viewGroup);
            }
        }
        AnonymousClass054 r2 = this.A00;
        AnonymousClass05B r1 = r2.A09;
        r1.A02.clear();
        r1.A00.clear();
        r2.A09.A03.A07();
    }

    public C09010bg(ViewGroup viewGroup, AnonymousClass054 r2) {
        this.A00 = r2;
        this.A01 = viewGroup;
    }
}
