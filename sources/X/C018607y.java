package X;

import android.view.ViewGroup;
import com.whatsapp.R;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.07y  reason: invalid class name and case insensitive filesystem */
public class C018607y {
    public static ArrayList A02 = new ArrayList();
    public static AnonymousClass054 A03 = new C017407l();
    public static ThreadLocal sRunningTransitions = new ThreadLocal();
    public AnonymousClass008 A00 = new AnonymousClass008();
    public AnonymousClass008 A01 = new AnonymousClass008();

    public static AnonymousClass008 A00() {
        AnonymousClass008 r2;
        Reference reference = (Reference) sRunningTransitions.get();
        if (reference != null && (r2 = (AnonymousClass008) reference.get()) != null) {
            return r2;
        }
        AnonymousClass008 r22 = new AnonymousClass008();
        sRunningTransitions.set(new WeakReference(r22));
        return r22;
    }

    public static void A01(ViewGroup viewGroup) {
        A02.remove(viewGroup);
        AbstractCollection abstractCollection = (AbstractCollection) A00().get(viewGroup);
        if (abstractCollection != null && !abstractCollection.isEmpty()) {
            ArrayList arrayList = new ArrayList(abstractCollection);
            int size = arrayList.size();
            while (true) {
                size--;
                if (size >= 0) {
                    ((AnonymousClass054) arrayList.get(size)).A0L(viewGroup);
                } else {
                    return;
                }
            }
        }
    }

    public static void A02(ViewGroup viewGroup, AnonymousClass054 r4) {
        ArrayList arrayList = A02;
        if (!arrayList.contains(viewGroup) && C011304x.A03(viewGroup)) {
            arrayList.add(viewGroup);
            if (r4 == null) {
                r4 = A03;
            }
            AnonymousClass054 A05 = r4.clone();
            AbstractCollection abstractCollection = (AbstractCollection) A00().get(viewGroup);
            if (abstractCollection != null && abstractCollection.size() > 0) {
                Iterator it = abstractCollection.iterator();
                while (it.hasNext()) {
                    ((AnonymousClass054) it.next()).A0J(viewGroup);
                }
            }
            if (A05 != null) {
                A05.A0N(viewGroup, true);
            }
            viewGroup.getTag(R.id.transition_current_scene);
            viewGroup.setTag(R.id.transition_current_scene, (Object) null);
            if (A05 != null) {
                C09010bg r1 = new C09010bg(viewGroup, A05);
                viewGroup.addOnAttachStateChangeListener(r1);
                viewGroup.getViewTreeObserver().addOnPreDrawListener(r1);
            }
        }
    }
}
