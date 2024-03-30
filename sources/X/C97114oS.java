package X;

import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.calling.callgrid.view.CallGrid;
import com.whatsapp.util.Log;
import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.4oS  reason: invalid class name and case insensitive filesystem */
public class C97114oS extends C02810Bz {
    public static AccelerateDecelerateInterpolator A0E;
    public C116935lR A00;
    public ArrayList A01 = AnonymousClass001.A0I();
    public ArrayList A02 = AnonymousClass001.A0I();
    public ArrayList A03 = AnonymousClass001.A0I();
    public ArrayList A04 = AnonymousClass001.A0I();
    public ArrayList A05 = AnonymousClass001.A0I();
    public ArrayList A06 = AnonymousClass001.A0I();
    public ArrayList A07 = AnonymousClass001.A0I();
    public boolean A08 = false;
    public boolean A09 = false;
    public ArrayList A0A = AnonymousClass001.A0I();
    public ArrayList A0B = AnonymousClass001.A0I();
    public ArrayList A0C = AnonymousClass001.A0I();
    public ArrayList A0D = AnonymousClass001.A0I();

    public long A07() {
        return 200;
    }

    public long A08() {
        return 200;
    }

    public long A09() {
        return 300;
    }

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
            java.util.ArrayList r0 = r8.A0C
            X.5w9 r2 = new X.5w9
            r2.<init>(r3, r4, r5, r6, r7)
            r0.add(r2)
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C97114oS.A0H(X.0D3, int, int, int, int):boolean");
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
        this.A0B.add(new C61983Eg(r7, r8, i5, i6, i7, i8));
        return true;
    }

    private void A00(AnonymousClass0D3 r3) {
        if (A0E == null) {
            A0E = new AccelerateDecelerateInterpolator();
        }
        r3.A0H.animate().setInterpolator(A0E);
        A0C(r3);
    }

    public static void A01(AnonymousClass0D3 r2, C97114oS r3) {
        if (r2 instanceof C97034oI) {
            ((C97034oI) r2).A0C(0);
        }
        C90484aE.A16(r2.A0H);
        r3.A06(r2);
    }

    private boolean A04(AnonymousClass0D3 r5, C61983Eg r6) {
        if (r6.A04 == r5) {
            r6.A04 = null;
        } else if (r6.A05 != r5) {
            return false;
        } else {
            r6.A05 = null;
        }
        View view = r5.A0H;
        view.setAlpha(1.0f);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        A06(r5);
        return true;
    }

    public void A0A() {
        ArrayList arrayList = this.A0C;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            AnonymousClass0D3 r1 = ((C123225w9) arrayList.get(size)).A04;
            View view = r1.A0H;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            A06(r1);
            arrayList.remove(size);
        }
        ArrayList arrayList2 = this.A0D;
        int size2 = arrayList2.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            A06((AnonymousClass0D3) arrayList2.get(size2));
            arrayList2.remove(size2);
        }
        ArrayList arrayList3 = this.A0A;
        int size3 = arrayList3.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            A01((AnonymousClass0D3) arrayList3.get(size3), this);
            arrayList3.remove(size3);
        }
        ArrayList arrayList4 = this.A0B;
        int size4 = arrayList4.size();
        while (true) {
            size4--;
            if (size4 < 0) {
                break;
            }
            C61983Eg r12 = (C61983Eg) arrayList4.get(size4);
            AnonymousClass0D3 r0 = r12.A05;
            if (r0 != null) {
                A04(r0, r12);
            }
            AnonymousClass0D3 r02 = r12.A04;
            if (r02 != null) {
                A04(r02, r12);
            }
        }
        arrayList4.clear();
        if (A0D()) {
            ArrayList arrayList5 = this.A06;
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
                        AnonymousClass0D3 r13 = ((C123225w9) abstractList.get(size6)).A04;
                        View view2 = r13.A0H;
                        view2.setTranslationY(0.0f);
                        view2.setTranslationX(0.0f);
                        A06(r13);
                        abstractList.remove(size6);
                        if (abstractList.isEmpty()) {
                            arrayList5.remove(abstractList);
                        }
                    }
                }
            }
            ArrayList arrayList6 = this.A02;
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
                        A01((AnonymousClass0D3) abstractList2.get(size8), this);
                        abstractList2.remove(size8);
                        if (abstractList2.isEmpty()) {
                            arrayList6.remove(abstractList2);
                        }
                    }
                }
            }
            ArrayList arrayList7 = this.A04;
            int size9 = arrayList7.size();
            while (true) {
                size9--;
                if (size9 >= 0) {
                    AbstractList abstractList3 = (AbstractList) arrayList7.get(size9);
                    int size10 = abstractList3.size();
                    while (true) {
                        size10--;
                        if (size10 >= 0) {
                            C61983Eg r14 = (C61983Eg) abstractList3.get(size10);
                            AnonymousClass0D3 r03 = r14.A05;
                            if (r03 != null) {
                                A04(r03, r14);
                            }
                            AnonymousClass0D3 r04 = r14.A04;
                            if (r04 != null) {
                                A04(r04, r14);
                            }
                            if (abstractList3.isEmpty()) {
                                arrayList7.remove(abstractList3);
                            }
                        }
                    }
                } else {
                    A03(this.A07);
                    A03(this.A05);
                    A03(this.A01);
                    A03(this.A03);
                    A05();
                    return;
                }
            }
        }
    }

    public void A0B() {
        long j;
        long j2;
        ArrayList arrayList = this.A0D;
        boolean A1a = C36411kG.A1a(arrayList);
        ArrayList arrayList2 = this.A0C;
        boolean A1a2 = C36411kG.A1a(arrayList2);
        ArrayList arrayList3 = this.A0B;
        boolean A1a3 = C36411kG.A1a(arrayList3);
        ArrayList arrayList4 = this.A0A;
        boolean A1a4 = C36411kG.A1a(arrayList4);
        if (A1a || A1a2 || A1a4 || A1a3) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                AnonymousClass0D3 r6 = (AnonymousClass0D3) it.next();
                if (this.A09) {
                    A06(r6);
                    A0J();
                } else {
                    View view = r6.A0H;
                    ViewPropertyAnimator animate = view.animate();
                    this.A07.add(r6);
                    C90514aH.A1E(new C162327oP(view, animate, r6, this, 0), C90514aH.A0R(animate.setDuration(300), 0.0f));
                }
            }
            arrayList.clear();
            if (A1a2) {
                ArrayList A0I = AnonymousClass001.A0I();
                A0I.addAll(arrayList2);
                this.A06.add(A0I);
                arrayList2.clear();
                C1501874h r62 = new C1501874h(this, A0I, 39);
                if (A1a) {
                    C011504z.A08(((C123225w9) A0I.get(0)).A04.A0H, r62, 300);
                } else {
                    r62.run();
                }
            }
            if (A1a3) {
                ArrayList A0I2 = AnonymousClass001.A0I();
                A0I2.addAll(arrayList3);
                this.A04.add(A0I2);
                arrayList3.clear();
                C1501874h r3 = new C1501874h(this, A0I2, 40);
                if (A1a) {
                    C011504z.A08(((C61983Eg) A0I2.get(0)).A05.A0H, r3, 300);
                } else {
                    r3.run();
                }
            }
            if (A1a4) {
                ArrayList A0I3 = AnonymousClass001.A0I();
                A0I3.addAll(arrayList4);
                this.A02.add(A0I3);
                arrayList4.clear();
                C1501874h r63 = new C1501874h(this, A0I3, 41);
                if (A1a || A1a2 || A1a3) {
                    long j3 = 0;
                    if (A1a) {
                        j = 300;
                    } else {
                        j = 0;
                    }
                    if (A1a2) {
                        j2 = 200;
                    } else {
                        j2 = 0;
                    }
                    if (A1a3) {
                        j3 = 200;
                    }
                    C011504z.A08(((AnonymousClass0D3) A0I3.get(0)).A0H, r63, j + Math.max(j2, j3));
                    return;
                }
                r63.run();
            }
        }
    }

    public void A0C(AnonymousClass0D3 r8) {
        View view = r8.A0H;
        view.animate().cancel();
        ArrayList arrayList = this.A0C;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else if (((C123225w9) arrayList.get(size)).A04 == r8) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                A06(r8);
                arrayList.remove(size);
            }
        }
        A02(r8, this.A0B);
        if (this.A0D.remove(r8)) {
            C90484aE.A16(view);
            A06(r8);
        }
        if (this.A0A.remove(r8)) {
            A01(r8, this);
        }
        ArrayList arrayList2 = this.A04;
        int size2 = arrayList2.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            ArrayList arrayList3 = (ArrayList) arrayList2.get(size2);
            A02(r8, arrayList3);
            if (arrayList3.isEmpty()) {
                arrayList2.remove(size2);
            }
        }
        ArrayList arrayList4 = this.A06;
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
                } else if (((C123225w9) abstractList.get(size4)).A04 == r8) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    A06(r8);
                    abstractList.remove(size4);
                    if (abstractList.isEmpty()) {
                        arrayList4.remove(size3);
                    }
                }
            }
        }
        ArrayList arrayList5 = this.A02;
        int size5 = arrayList5.size();
        while (true) {
            size5--;
            if (size5 >= 0) {
                AbstractCollection abstractCollection = (AbstractCollection) arrayList5.get(size5);
                if (abstractCollection.remove(r8)) {
                    A01(r8, this);
                    if (abstractCollection.isEmpty()) {
                        arrayList5.remove(size5);
                    }
                }
            } else {
                this.A07.remove(r8);
                this.A01.remove(r8);
                this.A03.remove(r8);
                this.A05.remove(r8);
                A0J();
                return;
            }
        }
    }

    public boolean A0D() {
        if (!this.A0A.isEmpty() || !this.A0B.isEmpty() || !this.A0C.isEmpty() || !this.A0D.isEmpty() || !this.A05.isEmpty() || !this.A07.isEmpty() || !this.A01.isEmpty() || !this.A03.isEmpty() || !this.A06.isEmpty() || !this.A02.isEmpty() || !this.A04.isEmpty()) {
            return true;
        }
        return false;
    }

    private void A02(AnonymousClass0D3 r4, List list) {
        int size = list.size();
        while (true) {
            size--;
            if (size >= 0) {
                C61983Eg r1 = (C61983Eg) list.get(size);
                if (A04(r4, r1) && r1.A05 == null && r1.A04 == null) {
                    list.remove(r1);
                }
            } else {
                return;
            }
        }
    }

    public static void A03(List list) {
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
        if (!this.A09) {
            View view = r3.A0H;
            view.setScaleX(0.0f);
            view.setScaleY(0.0f);
        } else if (r3 instanceof C97034oI) {
            ((C97034oI) r3).A0C(4);
        }
        this.A0A.add(r3);
        return true;
    }

    public boolean A0G(AnonymousClass0D3 r2) {
        A00(r2);
        this.A0D.add(r2);
        return true;
    }

    public void A0J() {
        C116935lR r0;
        if (!A0D()) {
            A05();
            if (this.A08 && (r0 = this.A00) != null) {
                CallGrid callGrid = r0.A00;
                if (callGrid.A0f.A03) {
                    Log.i("CallGrid/resizeGridView, callGridAdapter.notifyDataSetChanged()");
                    RecyclerView recyclerView = callGrid.A0c;
                    if (recyclerView.A07 > 0 || recyclerView.getScrollState() != 0) {
                        recyclerView.post(new C1501574e(callGrid, 2));
                    } else {
                        callGrid.A05.A06();
                    }
                }
            }
            this.A08 = false;
        }
    }
}
