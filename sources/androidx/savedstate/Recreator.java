package androidx.savedstate;

import X.AnonymousClass00C;
import X.AnonymousClass012;
import X.AnonymousClass016;
import X.AnonymousClass017;
import X.AnonymousClass01U;
import X.AnonymousClass01Y;
import X.AnonymousClass04J;
import X.AnonymousClass04R;
import X.AnonymousClass05R;
import X.AnonymousClass08O;
import X.AnonymousClass08P;
import android.os.Bundle;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public final class Recreator implements AnonymousClass01Y {
    public final AnonymousClass017 A00;

    public void BhM(AnonymousClass05R r9, AnonymousClass012 r10) {
        AnonymousClass00C.A0D(r10, 0);
        AnonymousClass00C.A0D(r9, 1);
        if (r9 == AnonymousClass05R.ON_CREATE) {
            r10.getLifecycle().A05(this);
            AnonymousClass017 r5 = this.A00;
            Bundle A002 = r5.BGx().A00("androidx.savedstate.Restarter");
            if (A002 != null) {
                ArrayList<String> stringArrayList = A002.getStringArrayList("classes_to_restore");
                if (stringArrayList != null) {
                    Iterator<String> it = stringArrayList.iterator();
                    while (it.hasNext()) {
                        String next = it.next();
                        try {
                            Class<? extends U> asSubclass = Class.forName(next, false, Recreator.class.getClassLoader()).asSubclass(AnonymousClass08P.class);
                            AnonymousClass00C.A08(asSubclass);
                            try {
                                Constructor<? extends U> declaredConstructor = asSubclass.getDeclaredConstructor(new Class[0]);
                                declaredConstructor.setAccessible(true);
                                try {
                                    AnonymousClass00C.A08(declaredConstructor.newInstance(new Object[0]));
                                    if (r5 instanceof AnonymousClass016) {
                                        AnonymousClass04J BJ7 = ((AnonymousClass016) r5).BJ7();
                                        AnonymousClass01U BGx = r5.BGx();
                                        HashMap hashMap = BJ7.A00;
                                        Iterator it2 = new HashSet(hashMap.keySet()).iterator();
                                        while (it2.hasNext()) {
                                            AnonymousClass08O.A00(r5.getLifecycle(), (AnonymousClass04R) hashMap.get(it2.next()), BGx);
                                        }
                                        if (!new HashSet(hashMap.keySet()).isEmpty()) {
                                            BGx.A02();
                                        }
                                    } else {
                                        throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner");
                                    }
                                } catch (Exception e) {
                                    StringBuilder sb = new StringBuilder();
                                    sb.append("Failed to instantiate ");
                                    sb.append(next);
                                    throw new RuntimeException(sb.toString(), e);
                                }
                            } catch (NoSuchMethodException e2) {
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("Class ");
                                sb2.append(asSubclass.getSimpleName());
                                sb2.append(" must have default constructor in order to be automatically recreated");
                                throw new IllegalStateException(sb2.toString(), e2);
                            }
                        } catch (ClassNotFoundException e3) {
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append("Class ");
                            sb3.append(next);
                            sb3.append(" wasn't found");
                            throw new RuntimeException(sb3.toString(), e3);
                        }
                    }
                    return;
                }
                throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
            }
            return;
        }
        throw new AssertionError("Next event must be ON_CREATE");
    }

    public Recreator(AnonymousClass017 r1) {
        this.A00 = r1;
    }
}
