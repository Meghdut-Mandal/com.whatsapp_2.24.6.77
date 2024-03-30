package X;

import android.graphics.Rect;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.0Hf  reason: invalid class name and case insensitive filesystem */
public class C03660Hf extends AnonymousClass0YI {
    public Object A03(Object obj) {
        if (obj != null) {
            return ((Transition) obj).clone();
        }
        return null;
    }

    public Object A04(Object obj) {
        if (obj == null) {
            return null;
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition((Transition) obj);
        return transitionSet;
    }

    public Object A05(Object obj, Object obj2, Object obj3) {
        Transition transition = (Transition) obj;
        Transition transition2 = (Transition) obj3;
        if (transition == null) {
            transition = null;
        }
        if (transition2 == null) {
            return transition;
        }
        TransitionSet transitionSet = new TransitionSet();
        if (transition != null) {
            transitionSet.addTransition(transition);
        }
        transitionSet.addTransition(transition2);
        return transitionSet;
    }

    public Object A06(Object obj, Object obj2, Object obj3) {
        TransitionSet transitionSet = new TransitionSet();
        if (obj != null) {
            transitionSet.addTransition((Transition) obj);
        }
        transitionSet.addTransition((Transition) obj2);
        return transitionSet;
    }

    public void A07(Rect rect, Object obj) {
        ((Transition) obj).setEpicenterCallback(new C18070sZ(rect, this, 1));
    }

    public void A08(View view, Object obj) {
        ((Transition) obj).addTarget(view);
    }

    public void A09(View view, Object obj) {
        if (view != null) {
            Rect A06 = AnonymousClass001.A06();
            AnonymousClass0YI.A01(view, A06);
            ((Transition) obj).setEpicenterCallback(new C18070sZ(A06, this, 0));
        }
    }

    public void A0A(View view, Object obj, ArrayList arrayList) {
        ((Transition) obj).addListener(new C08930bY(view, this, arrayList));
    }

    public void A0B(View view, Object obj, ArrayList arrayList) {
        Transition transition = (Transition) obj;
        List<View> targets = transition.getTargets();
        targets.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            AnonymousClass0YI.A02(AnonymousClass000.A0Z(arrayList, i), targets);
        }
        targets.add(view);
        arrayList.add(view);
        A0F(transition, arrayList);
    }

    public void A0C(ViewGroup viewGroup, Object obj) {
        TransitionManager.beginDelayedTransition(viewGroup, (Transition) obj);
    }

    public void A0D(C02680Bk r2, AnonymousClass02E r3, Object obj, Runnable runnable) {
        ((Transition) obj).addListener(new C08920bX(this, runnable));
    }

    public void A0E(Object obj, Object obj2, Object obj3, Object obj4, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        ((Transition) obj).addListener(new C08940bZ(this, obj2, obj4, arrayList, arrayList3));
    }

    public void A0F(Object obj, ArrayList arrayList) {
        Transition transition = (Transition) obj;
        if (transition != null) {
            int i = 0;
            if (transition instanceof TransitionSet) {
                TransitionSet transitionSet = (TransitionSet) transition;
                int transitionCount = transitionSet.getTransitionCount();
                while (i < transitionCount) {
                    A0F(transitionSet.getTransitionAt(i), arrayList);
                    i++;
                }
            } else if (!A00(transition)) {
                List<View> targets = transition.getTargets();
                if (targets == null || targets.isEmpty()) {
                    int size = arrayList.size();
                    while (i < size) {
                        transition.addTarget(AnonymousClass000.A0Z(arrayList, i));
                        i++;
                    }
                }
            }
        }
    }

    public void A0G(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        Transition transition = (Transition) obj;
        if (transition != null) {
            transition.getTargets().clear();
            transition.getTargets().addAll(arrayList2);
            A0I(transition, arrayList, arrayList2);
        }
    }

    public void A0I(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        List<View> targets;
        Transition transition = (Transition) obj;
        int i = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i < transitionCount) {
                A0I(transitionSet.getTransitionAt(i), arrayList, arrayList2);
                i++;
            }
        } else if (!A00(transition) && (targets = transition.getTargets()) != null && targets.size() == arrayList.size() && targets.containsAll(arrayList)) {
            if (arrayList2 != null) {
                int size = arrayList2.size();
                while (i < size) {
                    transition.addTarget(AnonymousClass000.A0Z(arrayList2, i));
                    i++;
                }
            }
            int size2 = arrayList.size();
            while (true) {
                size2--;
                if (size2 >= 0) {
                    transition.removeTarget(AnonymousClass000.A0Z(arrayList, size2));
                } else {
                    return;
                }
            }
        }
    }

    public static boolean A00(Transition transition) {
        List<Integer> targetIds = transition.getTargetIds();
        if (targetIds != null && !targetIds.isEmpty()) {
            return true;
        }
        List<String> targetNames = transition.getTargetNames();
        if (targetNames != null && !targetNames.isEmpty()) {
            return true;
        }
        List<Class> targetTypes = transition.getTargetTypes();
        if (targetTypes == null || targetTypes.isEmpty()) {
            return false;
        }
        return true;
    }

    public boolean A0H(Object obj) {
        return obj instanceof Transition;
    }
}
