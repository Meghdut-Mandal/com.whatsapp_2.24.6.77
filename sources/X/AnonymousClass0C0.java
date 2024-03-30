package X;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.0C0  reason: invalid class name */
public class AnonymousClass0C0 extends C02810Bz {
    public static TimeInterpolator A0B;
    public ArrayList A00 = new ArrayList();
    public ArrayList A01 = new ArrayList();
    public ArrayList A02 = new ArrayList();
    public ArrayList A03 = new ArrayList();
    public ArrayList A04 = new ArrayList();
    public ArrayList A05 = new ArrayList();
    public ArrayList A06 = new ArrayList();
    public ArrayList A07 = new ArrayList();
    public ArrayList A08 = new ArrayList();
    public ArrayList A09 = new ArrayList();
    public ArrayList A0A = new ArrayList();

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0028, code lost:
        if (r1 != 0) goto L_0x002a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0H(X.AnonymousClass0D3 r9, int r10, int r11, int r12, int r13) {
        /*
            r8 = this;
            r3 = r9
            android.view.View r2 = r9.A0H
            float r0 = r2.getTranslationX()
            int r0 = (int) r0
            int r4 = r10 + r0
            float r0 = r2.getTranslationY()
            int r0 = (int) r0
            int r5 = r11 + r0
            r8.A00(r9)
            r6 = r12
            int r0 = r12 - r4
            r7 = r13
            int r1 = r13 - r5
            if (r0 != 0) goto L_0x0023
            if (r1 != 0) goto L_0x002a
            r8.A06(r9)
            r0 = 0
            return r0
        L_0x0023:
            int r0 = -r0
            float r0 = (float) r0
            r2.setTranslationX(r0)
            if (r1 == 0) goto L_0x002f
        L_0x002a:
            int r0 = -r1
            float r0 = (float) r0
            r2.setTranslationY(r0)
        L_0x002f:
            java.util.ArrayList r0 = r8.A09
            X.0TJ r2 = new X.0TJ
            r2.<init>(r3, r4, r5, r6, r7)
            r0.add(r2)
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0C0.A0H(X.0D3, int, int, int, int):boolean");
    }

    public boolean A0I(AnonymousClass0D3 r14, AnonymousClass0D3 r15, int i, int i2, int i3, int i4) {
        AnonymousClass0D3 r7 = r14;
        AnonymousClass0D3 r8 = r15;
        int i5 = i;
        int i6 = i2;
        int i7 = i3;
        int i8 = i4;
        if (r14 == r15) {
            return A0H(r14, i5, i6, i7, i8);
        }
        View view = r14.A0H;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        float alpha = view.getAlpha();
        A00(r14);
        view.setTranslationX(translationX);
        view.setTranslationY(translationY);
        view.setAlpha(alpha);
        A00(r15);
        View view2 = r15.A0H;
        view2.setTranslationX((float) (-((int) (((float) (i3 - i)) - translationX))));
        view2.setTranslationY((float) (-((int) (((float) (i4 - i2)) - translationY))));
        view2.setAlpha(0.0f);
        this.A08.add(new AnonymousClass0U5(r7, r8, i5, i6, i7, i8));
        return true;
    }

    private void A00(AnonymousClass0D3 r3) {
        if (A0B == null) {
            A0B = new ValueAnimator().getInterpolator();
        }
        r3.A0H.animate().setInterpolator(A0B);
        A0C(r3);
    }

    private boolean A03(AnonymousClass0U5 r5, AnonymousClass0D3 r6) {
        if (r5.A04 == r6) {
            r5.A04 = null;
        } else if (r5.A05 != r6) {
            return false;
        } else {
            r5.A05 = null;
        }
        View view = r6.A0H;
        view.setAlpha(1.0f);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        A06(r6);
        return true;
    }

    public void A0A() {
        ArrayList arrayList = this.A09;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            AnonymousClass0D3 r1 = ((AnonymousClass0TJ) arrayList.get(size)).A04;
            View view = r1.A0H;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            A06(r1);
            arrayList.remove(size);
        }
        ArrayList arrayList2 = this.A0A;
        int size2 = arrayList2.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            A06((AnonymousClass0D3) arrayList2.get(size2));
            arrayList2.remove(size2);
        }
        ArrayList arrayList3 = this.A07;
        int size3 = arrayList3.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            AnonymousClass0D3 r12 = (AnonymousClass0D3) arrayList3.get(size3);
            r12.A0H.setAlpha(1.0f);
            A06(r12);
            arrayList3.remove(size3);
        }
        ArrayList arrayList4 = this.A08;
        int size4 = arrayList4.size();
        while (true) {
            size4--;
            if (size4 < 0) {
                break;
            }
            AnonymousClass0U5 r13 = (AnonymousClass0U5) arrayList4.get(size4);
            AnonymousClass0D3 r0 = r13.A05;
            if (r0 != null) {
                A03(r13, r0);
            }
            AnonymousClass0D3 r02 = r13.A04;
            if (r02 != null) {
                A03(r13, r02);
            }
        }
        arrayList4.clear();
        if (A0D()) {
            ArrayList arrayList5 = this.A02;
            int size5 = arrayList5.size();
            while (true) {
                size5--;
                if (size5 < 0) {
                    break;
                }
                AbstractList abstractList = (AbstractList) arrayList5.get(size5);
                int size6 = abstractList.size();
                while (true) {
                    size6--;
                    if (size6 >= 0) {
                        AnonymousClass0D3 r14 = ((AnonymousClass0TJ) abstractList.get(size6)).A04;
                        View view2 = r14.A0H;
                        view2.setTranslationY(0.0f);
                        view2.setTranslationX(0.0f);
                        A06(r14);
                        abstractList.remove(size6);
                        if (abstractList.isEmpty()) {
                            arrayList5.remove(abstractList);
                        }
                    }
                }
            }
            ArrayList arrayList6 = this.A00;
            int size7 = arrayList6.size();
            while (true) {
                size7--;
                if (size7 < 0) {
                    break;
                }
                AbstractList abstractList2 = (AbstractList) arrayList6.get(size7);
                int size8 = abstractList2.size();
                while (true) {
                    size8--;
                    if (size8 >= 0) {
                        AnonymousClass0D3 r15 = (AnonymousClass0D3) abstractList2.get(size8);
                        r15.A0H.setAlpha(1.0f);
                        A06(r15);
                        abstractList2.remove(size8);
                        if (abstractList2.isEmpty()) {
                            arrayList6.remove(abstractList2);
                        }
                    }
                }
            }
            ArrayList arrayList7 = this.A01;
            int size9 = arrayList7.size();
            while (true) {
                size9--;
                if (size9 >= 0) {
                    AbstractList abstractList3 = (AbstractList) arrayList7.get(size9);
                    int size10 = abstractList3.size();
                    while (true) {
                        size10--;
                        if (size10 >= 0) {
                            AnonymousClass0U5 r16 = (AnonymousClass0U5) abstractList3.get(size10);
                            AnonymousClass0D3 r03 = r16.A05;
                            if (r03 != null) {
                                A03(r16, r03);
                            }
                            AnonymousClass0D3 r04 = r16.A04;
                            if (r04 != null) {
                                A03(r16, r04);
                            }
                            if (abstractList3.isEmpty()) {
                                arrayList7.remove(abstractList3);
                            }
                        }
                    }
                } else {
                    A02(this.A06);
                    A02(this.A05);
                    A02(this.A03);
                    A02(this.A04);
                    A05();
                    return;
                }
            }
        }
    }

    public void A0B() {
        long j;
        long j2;
        ArrayList arrayList = this.A0A;
        boolean z = !arrayList.isEmpty();
        ArrayList arrayList2 = this.A09;
        boolean z2 = !arrayList2.isEmpty();
        ArrayList arrayList3 = this.A08;
        boolean z3 = !arrayList3.isEmpty();
        ArrayList arrayList4 = this.A07;
        boolean z4 = !arrayList4.isEmpty();
        if (z || z2 || z4 || z3) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                AnonymousClass0D3 r7 = (AnonymousClass0D3) it.next();
                View view = r7.A0H;
                ViewPropertyAnimator animate = view.animate();
                this.A06.add(r7);
                animate.setDuration(A09()).alpha(0.0f).setListener(new AnonymousClass0DL(view, animate, this, r7)).start();
            }
            arrayList.clear();
            if (z2) {
                ArrayList arrayList5 = new ArrayList();
                arrayList5.addAll(arrayList2);
                this.A02.add(arrayList5);
                arrayList2.clear();
                C11500gP r3 = new C11500gP(this, arrayList5);
                if (z) {
                    C011504z.A08(((AnonymousClass0TJ) arrayList5.get(0)).A04.A0H, r3, A09());
                } else {
                    r3.run();
                }
            }
            if (z3) {
                ArrayList arrayList6 = new ArrayList();
                arrayList6.addAll(arrayList3);
                this.A01.add(arrayList6);
                arrayList3.clear();
                C11510gQ r32 = new C11510gQ(this, arrayList6);
                if (z) {
                    C011504z.A08(((AnonymousClass0U5) arrayList6.get(0)).A05.A0H, r32, A09());
                } else {
                    r32.run();
                }
            }
            if (z4) {
                ArrayList arrayList7 = new ArrayList();
                arrayList7.addAll(arrayList4);
                this.A00.add(arrayList7);
                arrayList4.clear();
                AnonymousClass0gR r6 = new AnonymousClass0gR(this, arrayList7);
                if (z || z2 || z3) {
                    long j3 = 0;
                    if (z) {
                        j = A09();
                    } else {
                        j = 0;
                    }
                    if (z2) {
                        j2 = A08();
                    } else {
                        j2 = 0;
                    }
                    if (z3) {
                        j3 = A07();
                    }
                    C011504z.A08(((AnonymousClass0D3) arrayList7.get(0)).A0H, r6, j + Math.max(j2, j3));
                    return;
                }
                r6.run();
            }
        }
    }

    public void A0C(AnonymousClass0D3 r9) {
        View view = r9.A0H;
        view.animate().cancel();
        ArrayList arrayList = this.A09;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else if (((AnonymousClass0TJ) arrayList.get(size)).A04 == r9) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                A06(r9);
                arrayList.remove(size);
            }
        }
        A01(r9, this.A08);
        if (this.A0A.remove(r9)) {
            view.setAlpha(1.0f);
            A06(r9);
        }
        if (this.A07.remove(r9)) {
            view.setAlpha(1.0f);
            A06(r9);
        }
        ArrayList arrayList2 = this.A01;
        int size2 = arrayList2.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            ArrayList arrayList3 = (ArrayList) arrayList2.get(size2);
            A01(r9, arrayList3);
            if (arrayList3.isEmpty()) {
                arrayList2.remove(size2);
            }
        }
        ArrayList arrayList4 = this.A02;
        int size3 = arrayList4.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            AbstractList abstractList = (AbstractList) arrayList4.get(size3);
            int size4 = abstractList.size();
            while (true) {
                size4--;
                if (size4 < 0) {
                    break;
                } else if (((AnonymousClass0TJ) abstractList.get(size4)).A04 == r9) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    A06(r9);
                    abstractList.remove(size4);
                    if (abstractList.isEmpty()) {
                        arrayList4.remove(size3);
                    }
                }
            }
        }
        ArrayList arrayList5 = this.A00;
        int size5 = arrayList5.size();
        while (true) {
            size5--;
            if (size5 < 0) {
                break;
            }
            AbstractCollection abstractCollection = (AbstractCollection) arrayList5.get(size5);
            if (abstractCollection.remove(r9)) {
                view.setAlpha(1.0f);
                A06(r9);
                if (abstractCollection.isEmpty()) {
                    arrayList5.remove(size5);
                }
            }
        }
        this.A06.remove(r9);
        this.A03.remove(r9);
        this.A04.remove(r9);
        this.A05.remove(r9);
        if (!A0D()) {
            A05();
        }
    }

    public boolean A0D() {
        if (!this.A07.isEmpty() || !this.A08.isEmpty() || !this.A09.isEmpty() || !this.A0A.isEmpty() || !this.A05.isEmpty() || !this.A06.isEmpty() || !this.A03.isEmpty() || !this.A04.isEmpty() || !this.A02.isEmpty() || !this.A00.isEmpty() || !this.A01.isEmpty()) {
            return true;
        }
        return false;
    }

    private void A01(AnonymousClass0D3 r4, List list) {
        int size = list.size();
        while (true) {
            size--;
            if (size >= 0) {
                AnonymousClass0U5 r1 = (AnonymousClass0U5) list.get(size);
                if (A03(r1, r4) && r1.A05 == null && r1.A04 == null) {
                    list.remove(r1);
                }
            } else {
                return;
            }
        }
    }

    public static void A02(List list) {
        int size = list.size();
        while (true) {
            size--;
            if (size >= 0) {
                ((AnonymousClass0D3) list.get(size)).A0H.animate().cancel();
            } else {
                return;
            }
        }
    }

    public boolean A0E(AnonymousClass0D3 r3, List list) {
        if (!list.isEmpty() || super.A0E(r3, list)) {
            return true;
        }
        return false;
    }

    public boolean A0F(AnonymousClass0D3 r3) {
        A00(r3);
        r3.A0H.setAlpha(0.0f);
        this.A07.add(r3);
        return true;
    }

    public boolean A0G(AnonymousClass0D3 r2) {
        A00(r2);
        this.A0A.add(r2);
        return true;
    }
}
