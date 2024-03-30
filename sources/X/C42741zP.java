package X;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1zP  reason: invalid class name and case insensitive filesystem */
public final class C42741zP extends C02810Bz {
    public static final TimeInterpolator A0B = new ValueAnimator().getInterpolator();
    public List A00 = AnonymousClass001.A0I();
    public List A01 = AnonymousClass001.A0I();
    public List A02 = AnonymousClass001.A0I();
    public List A03 = AnonymousClass001.A0I();
    public List A04 = AnonymousClass001.A0I();
    public List A05 = AnonymousClass001.A0I();
    public List A06 = AnonymousClass001.A0I();
    public List A07 = AnonymousClass001.A0I();
    public List A08 = AnonymousClass001.A0I();
    public List A09 = AnonymousClass001.A0I();
    public List A0A = AnonymousClass001.A0I();

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0028, code lost:
        if (r1 != 0) goto L_0x002a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0H(X.AnonymousClass0D3 r9, int r10, int r11, int r12, int r13) {
        /*
            r8 = this;
            r3 = r9
            android.view.View r2 = r9.A0H
            float r1 = (float) r10
            float r0 = r2.getTranslationX()
            float r1 = r1 + r0
            int r4 = (int) r1
            float r1 = (float) r11
            float r0 = r2.getTranslationY()
            float r1 = r1 + r0
            int r5 = (int) r1
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
            java.util.List r0 = r8.A09
            X.392 r2 = new X.392
            r2.<init>(r3, r4, r5, r6, r7)
            r0.add(r2)
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C42741zP.A0H(X.0D3, int, int, int, int):boolean");
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
        this.A08.add(new C62003Ei(r7, r8, i5, i6, i7, i8));
        return true;
    }

    private void A00(AnonymousClass0D3 r3) {
        r3.A0H.animate().setInterpolator(A0B);
        A0C(r3);
    }

    private boolean A03(AnonymousClass0D3 r5, C62003Ei r6) {
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
        List list = this.A09;
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            AnonymousClass0D3 r1 = ((AnonymousClass392) list.get(size)).A04;
            View view = r1.A0H;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            A06(r1);
            list.remove(size);
        }
        List list2 = this.A0A;
        int size2 = list2.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            A06((AnonymousClass0D3) list2.get(size2));
            list2.remove(size2);
        }
        List list3 = this.A07;
        int size3 = list3.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            AnonymousClass0D3 r12 = (AnonymousClass0D3) list3.get(size3);
            View view2 = r12.A0H;
            view2.setScaleX(1.0f);
            view2.setScaleY(1.0f);
            A06(r12);
            list3.remove(size3);
        }
        List list4 = this.A08;
        int size4 = list4.size();
        while (true) {
            size4--;
            if (size4 < 0) {
                break;
            }
            C62003Ei r13 = (C62003Ei) list4.get(size4);
            AnonymousClass0D3 r0 = r13.A05;
            if (r0 != null) {
                A03(r0, r13);
            }
            AnonymousClass0D3 r02 = r13.A04;
            if (r02 != null) {
                A03(r02, r13);
            }
        }
        list4.clear();
        if (A0D()) {
            List list5 = this.A05;
            int size5 = list5.size();
            while (true) {
                size5--;
                if (size5 < 0) {
                    break;
                }
                List list6 = (List) list5.get(size5);
                int size6 = list6.size();
                while (true) {
                    size6--;
                    if (size6 >= 0) {
                        AnonymousClass0D3 r14 = ((AnonymousClass392) list6.get(size6)).A04;
                        View view3 = r14.A0H;
                        view3.setTranslationY(0.0f);
                        view3.setTranslationX(0.0f);
                        A06(r14);
                        list6.remove(size6);
                        if (list6.isEmpty()) {
                            list5.remove(list6);
                        }
                    }
                }
            }
            List list7 = this.A01;
            int size7 = list7.size();
            while (true) {
                size7--;
                if (size7 < 0) {
                    break;
                }
                List list8 = (List) list7.get(size7);
                int size8 = list8.size();
                while (true) {
                    size8--;
                    if (size8 >= 0) {
                        AnonymousClass0D3 r15 = (AnonymousClass0D3) list8.get(size8);
                        View view4 = r15.A0H;
                        view4.setScaleX(1.0f);
                        view4.setScaleY(1.0f);
                        A06(r15);
                        list8.remove(size8);
                        if (list8.isEmpty()) {
                            list7.remove(list8);
                        }
                    }
                }
            }
            List list9 = this.A03;
            int size9 = list9.size();
            while (true) {
                size9--;
                if (size9 >= 0) {
                    List list10 = (List) list9.get(size9);
                    int size10 = list10.size();
                    while (true) {
                        size10--;
                        if (size10 >= 0) {
                            C62003Ei r16 = (C62003Ei) list10.get(size10);
                            AnonymousClass0D3 r03 = r16.A05;
                            if (r03 != null) {
                                A03(r03, r16);
                            }
                            AnonymousClass0D3 r04 = r16.A04;
                            if (r04 != null) {
                                A03(r04, r16);
                            }
                            if (list10.isEmpty()) {
                                list9.remove(list10);
                            }
                        }
                    }
                } else {
                    A02(this.A06);
                    A02(this.A04);
                    A02(this.A00);
                    A02(this.A02);
                    A05();
                    return;
                }
            }
        }
    }

    public void A0B() {
        long j;
        long j2;
        List<AnonymousClass0D3> list = this.A0A;
        boolean A1a = C36401kF.A1a(list);
        List list2 = this.A09;
        boolean A1a2 = C36401kF.A1a(list2);
        List list3 = this.A08;
        boolean A1a3 = C36401kF.A1a(list3);
        List list4 = this.A07;
        boolean A1a4 = C36401kF.A1a(list4);
        if (A1a || A1a2 || A1a4 || A1a3) {
            for (AnonymousClass0D3 r3 : list) {
                AnonymousClass0V7 A072 = C012005e.A07(r3.A0H);
                this.A06.add(r3);
                A072.A07(A09());
                A072.A03(0.0f);
                A072.A04(0.0f);
                A072.A09(new AnonymousClass4W5(A072, r3, this, 0));
                A072.A01();
            }
            list.clear();
            if (A1a2) {
                ArrayList A0I = AnonymousClass001.A0I();
                A0I.addAll(list2);
                this.A05.add(A0I);
                list2.clear();
                C80273v8 r32 = new C80273v8(this, A0I, 18);
                if (A1a) {
                    C011504z.A08(((AnonymousClass392) A0I.get(0)).A04.A0H, r32, A09());
                } else {
                    r32.run();
                }
            }
            if (A1a3) {
                ArrayList A0I2 = AnonymousClass001.A0I();
                A0I2.addAll(list3);
                this.A03.add(A0I2);
                list3.clear();
                C80273v8 r33 = new C80273v8(this, A0I2, 19);
                if (A1a) {
                    C011504z.A08(((C62003Ei) A0I2.get(0)).A05.A0H, r33, A09());
                } else {
                    r33.run();
                }
            }
            if (A1a4) {
                ArrayList A0I3 = AnonymousClass001.A0I();
                A0I3.addAll(list4);
                this.A01.add(A0I3);
                list4.clear();
                C80273v8 r6 = new C80273v8(this, A0I3, 20);
                if (A1a || A1a2 || A1a3) {
                    long j3 = 0;
                    if (A1a) {
                        j = A09();
                    } else {
                        j = 0;
                    }
                    if (A1a2) {
                        j2 = A08();
                    } else {
                        j2 = 0;
                    }
                    if (A1a3) {
                        j3 = A07();
                    }
                    C011504z.A08(((AnonymousClass0D3) A0I3.get(0)).A0H, r6, j + Math.max(j2, j3));
                    return;
                }
                r6.run();
            }
        }
    }

    public void A0C(AnonymousClass0D3 r9) {
        View view = r9.A0H;
        C012005e.A07(view).A00();
        List list = this.A09;
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else if (((AnonymousClass392) list.get(size)).A04 == r9) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                A06(r9);
                list.remove(size);
            }
        }
        A01(r9, this.A08);
        if (this.A0A.remove(r9)) {
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
            A06(r9);
        }
        if (this.A07.remove(r9)) {
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
            A06(r9);
        }
        List list2 = this.A03;
        int size2 = list2.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            List list3 = (List) list2.get(size2);
            A01(r9, list3);
            if (list3.isEmpty()) {
                list2.remove(size2);
            }
        }
        List list4 = this.A05;
        int size3 = list4.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            List list5 = (List) list4.get(size3);
            int size4 = list5.size();
            while (true) {
                size4--;
                if (size4 < 0) {
                    break;
                } else if (((AnonymousClass392) list5.get(size4)).A04 == r9) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    A06(r9);
                    list5.remove(size4);
                    if (list5.isEmpty()) {
                        list4.remove(size3);
                    }
                }
            }
        }
        List list6 = this.A01;
        int size5 = list6.size();
        while (true) {
            size5--;
            if (size5 >= 0) {
                List list7 = (List) list6.get(size5);
                if (list7.remove(r9)) {
                    view.setScaleX(1.0f);
                    view.setScaleY(1.0f);
                    A06(r9);
                    if (list7.isEmpty()) {
                        list6.remove(size5);
                    }
                }
            } else {
                this.A06.remove(r9);
                this.A00.remove(r9);
                this.A02.remove(r9);
                C36391kE.A1M(this, r9, this.A04);
                return;
            }
        }
    }

    public boolean A0D() {
        if (!this.A07.isEmpty() || !this.A08.isEmpty() || !this.A09.isEmpty() || !this.A0A.isEmpty() || !this.A04.isEmpty() || !this.A06.isEmpty() || !this.A00.isEmpty() || !this.A02.isEmpty() || !this.A05.isEmpty() || !this.A01.isEmpty() || !this.A03.isEmpty()) {
            return true;
        }
        return false;
    }

    public C42741zP() {
        this.A00 = 240;
        this.A01 = 240;
        this.A02 = 240;
        this.A03 = 240;
        this.A00 = false;
    }

    private void A01(AnonymousClass0D3 r4, List list) {
        int size = list.size();
        while (true) {
            size--;
            if (size >= 0) {
                C62003Ei r1 = (C62003Ei) list.get(size);
                if (A03(r4, r1) && r1.A05 == null && r1.A04 == null) {
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
                C012005e.A07(((AnonymousClass0D3) list.get(size)).A0H).A00();
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
        View view = r3.A0H;
        view.setScaleX(0.0f);
        view.setScaleY(0.0f);
        this.A07.add(r3);
        return true;
    }

    public boolean A0G(AnonymousClass0D3 r2) {
        A00(r2);
        this.A0A.add(r2);
        return true;
    }
}
