package androidx.transition;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass02E;
import X.AnonymousClass054;
import X.AnonymousClass0IS;
import X.AnonymousClass0YI;
import X.C017307k;
import X.C018607y;
import X.C02680Bk;
import X.C09630cg;
import X.C09990dU;
import X.C10000dV;
import X.C18210sn;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

public class FragmentTransitionSupport extends AnonymousClass0YI {
    public Object A03(Object obj) {
        if (obj != null) {
            return ((AnonymousClass054) obj).clone();
        }
        return null;
    }

    public Object A04(Object obj) {
        if (obj == null) {
            return null;
        }
        C017307k r0 = new C017307k();
        r0.A0a((AnonymousClass054) obj);
        return r0;
    }

    public Object A05(Object obj, Object obj2, Object obj3) {
        AnonymousClass054 r2 = (AnonymousClass054) obj;
        AnonymousClass054 r4 = (AnonymousClass054) obj3;
        if (r2 == null) {
            r2 = null;
        }
        if (r4 == null) {
            return r2;
        }
        C017307k r0 = new C017307k();
        if (r2 != null) {
            r0.A0a(r2);
        }
        r0.A0a(r4);
        return r0;
    }

    public Object A06(Object obj, Object obj2, Object obj3) {
        C017307k r0 = new C017307k();
        if (obj != null) {
            r0.A0a((AnonymousClass054) obj);
        }
        r0.A0a((AnonymousClass054) obj2);
        return r0;
    }

    public void A07(Rect rect, Object obj) {
        ((AnonymousClass054) obj).A0P(new C18210sn(rect, this, 1));
    }

    public void A08(View view, Object obj) {
        ((AnonymousClass054) obj).A08(view);
    }

    public void A09(View view, Object obj) {
        if (view != null) {
            Rect A06 = AnonymousClass001.A06();
            AnonymousClass0YI.A01(view, A06);
            ((AnonymousClass054) obj).A0P(new C18210sn(A06, this, 0));
        }
    }

    public void A0A(View view, Object obj, ArrayList arrayList) {
        ((AnonymousClass054) obj).A0A(new C10000dV(view, this, arrayList));
    }

    public void A0B(View view, Object obj, ArrayList arrayList) {
        AnonymousClass054 r6 = (AnonymousClass054) obj;
        ArrayList arrayList2 = r6.A0E;
        arrayList2.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            AnonymousClass0YI.A02(AnonymousClass000.A0Z(arrayList, i), arrayList2);
        }
        arrayList2.add(view);
        arrayList.add(view);
        A0F(r6, arrayList);
    }

    public void A0C(ViewGroup viewGroup, Object obj) {
        C018607y.A02(viewGroup, (AnonymousClass054) obj);
    }

    public void A0D(C02680Bk r2, AnonymousClass02E r3, Object obj, Runnable runnable) {
        AnonymousClass054 r4 = (AnonymousClass054) obj;
        r2.A05(new C09630cg(this, r4));
        r4.A0A(new C09990dU(this, runnable));
    }

    public void A0E(Object obj, Object obj2, Object obj3, Object obj4, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        ((AnonymousClass054) obj).A0A(new AnonymousClass0IS(this, obj2, obj4, arrayList, arrayList3));
    }

    public void A0F(Object obj, ArrayList arrayList) {
        Object obj2;
        AnonymousClass054 r5 = (AnonymousClass054) obj;
        if (r5 != null) {
            int i = 0;
            if (r5 instanceof C017307k) {
                C017307k r52 = (C017307k) r5;
                int size = r52.A02.size();
                while (i < size) {
                    if (i >= 0) {
                        ArrayList arrayList2 = r52.A02;
                        if (i < arrayList2.size()) {
                            obj2 = arrayList2.get(i);
                            A0F(obj2, arrayList);
                            i++;
                        }
                    }
                    obj2 = null;
                    A0F(obj2, arrayList);
                    i++;
                }
                return;
            }
            ArrayList arrayList3 = r5.A0D;
            if (arrayList3 == null || arrayList3.isEmpty()) {
                ArrayList arrayList4 = r5.A0E;
                if (arrayList4 == null || arrayList4.isEmpty()) {
                    int size2 = arrayList.size();
                    while (i < size2) {
                        r5.A08(AnonymousClass000.A0Z(arrayList, i));
                        i++;
                    }
                }
            }
        }
    }

    public void A0G(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        AnonymousClass054 r2 = (AnonymousClass054) obj;
        if (r2 != null) {
            ArrayList arrayList3 = r2.A0E;
            arrayList3.clear();
            arrayList3.addAll(arrayList2);
            A0I(r2, arrayList, arrayList2);
        }
    }

    public void A0I(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        Object obj2;
        AnonymousClass054 r5 = (AnonymousClass054) obj;
        int i = 0;
        if (r5 instanceof C017307k) {
            C017307k r52 = (C017307k) r5;
            int size = r52.A02.size();
            while (i < size) {
                if (i >= 0) {
                    ArrayList arrayList3 = r52.A02;
                    if (i < arrayList3.size()) {
                        obj2 = arrayList3.get(i);
                        A0I(obj2, arrayList, arrayList2);
                        i++;
                    }
                }
                obj2 = null;
                A0I(obj2, arrayList, arrayList2);
                i++;
            }
            return;
        }
        ArrayList arrayList4 = r5.A0D;
        if (arrayList4 == null || arrayList4.isEmpty()) {
            ArrayList arrayList5 = r5.A0E;
            if (arrayList5.size() == arrayList.size() && arrayList5.containsAll(arrayList)) {
                if (arrayList2 != null) {
                    int size2 = arrayList2.size();
                    while (i < size2) {
                        r5.A08(AnonymousClass000.A0Z(arrayList2, i));
                        i++;
                    }
                }
                int size3 = arrayList.size();
                while (true) {
                    size3--;
                    if (size3 >= 0) {
                        r5.A09(AnonymousClass000.A0Z(arrayList, size3));
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public boolean A0H(Object obj) {
        return obj instanceof AnonymousClass054;
    }
}
