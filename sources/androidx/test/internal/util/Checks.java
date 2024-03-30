package androidx.test.internal.util;

import X.AnonymousClass001;
import android.os.StrictMode;
import androidx.test.internal.platform.ThreadChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ServiceLoader;

public abstract class Checks {
    public static final ThreadChecker A00;

    static {
        ThreadChecker threadChecker;
        Class<ThreadChecker> cls = ThreadChecker.class;
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        ArrayList A0I = AnonymousClass001.A0I();
        Iterator<S> it = ServiceLoader.load(cls).iterator();
        while (it.hasNext()) {
            A0I.add(it.next());
        }
        StrictMode.setThreadPolicy(allowThreadDiskReads);
        if (A0I.isEmpty()) {
            threadChecker = new ThreadChecker() {
            };
        } else if (A0I.size() == 1) {
            threadChecker = (ThreadChecker) A0I.get(0);
        } else {
            throw AnonymousClass001.A09(String.format("Found more than one %s implementations.", new Object[]{cls.getName()}));
        }
        A00 = threadChecker;
    }
}
