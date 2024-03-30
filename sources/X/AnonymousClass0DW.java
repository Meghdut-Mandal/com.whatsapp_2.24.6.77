package X;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: X.0DW  reason: invalid class name */
public final class AnonymousClass0DW extends Fragment implements C17270r0 {
    public static final WeakHashMap A03 = new WeakHashMap();
    public int A00 = 0;
    public Bundle A01;
    public final Map A02 = Collections.synchronizedMap(new AnonymousClass008());

    public final void B0J(LifecycleCallback lifecycleCallback, String str) {
        Map map = this.A02;
        if (!map.containsKey(str)) {
            map.put(str, lifecycleCallback);
            if (this.A00 > 0) {
                new AnonymousClass0E8(Looper.getMainLooper()).post(new C11820h3(lifecycleCallback, this, str));
                return;
            }
            return;
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("LifecycleCallback with tag ");
        A0u.append(str);
        throw AnonymousClass000.A0c(" already added to this fragment.", A0u);
    }

    public final LifecycleCallback B9H(Class cls, String str) {
        return (LifecycleCallback) cls.cast(this.A02.get(str));
    }

    public final Activity BDW() {
        return getActivity();
    }

    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        Iterator A0z = AnonymousClass000.A0z(this.A02);
        while (A0z.hasNext()) {
            A0z.next();
        }
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        Iterator A0z = AnonymousClass000.A0z(this.A02);
        while (A0z.hasNext()) {
            ((LifecycleCallback) A0z.next()).onActivityResult(i, i2, intent);
        }
    }

    public final void onCreate(Bundle bundle) {
        Bundle bundle2;
        super.onCreate(bundle);
        this.A00 = 1;
        this.A01 = bundle;
        Iterator A0y = AnonymousClass000.A0y(this.A02);
        while (A0y.hasNext()) {
            Map.Entry A11 = AnonymousClass000.A11(A0y);
            LifecycleCallback lifecycleCallback = (LifecycleCallback) A11.getValue();
            if (bundle != null) {
                bundle2 = bundle.getBundle((String) A11.getKey());
            } else {
                bundle2 = null;
            }
            lifecycleCallback.onCreate(bundle2);
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        this.A00 = 5;
        Iterator A0z = AnonymousClass000.A0z(this.A02);
        while (A0z.hasNext()) {
            A0z.next();
        }
    }

    public final void onResume() {
        super.onResume();
        this.A00 = 3;
        Iterator A0z = AnonymousClass000.A0z(this.A02);
        while (A0z.hasNext()) {
            ((LifecycleCallback) A0z.next()).onResume();
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (bundle != null) {
            Iterator A0y = AnonymousClass000.A0y(this.A02);
            while (A0y.hasNext()) {
                Map.Entry A11 = AnonymousClass000.A11(A0y);
                Bundle A07 = AnonymousClass001.A07();
                ((LifecycleCallback) A11.getValue()).onSaveInstanceState(A07);
                bundle.putBundle((String) A11.getKey(), A07);
            }
        }
    }

    public final void onStart() {
        super.onStart();
        this.A00 = 2;
        Iterator A0z = AnonymousClass000.A0z(this.A02);
        while (A0z.hasNext()) {
            ((LifecycleCallback) A0z.next()).onStart();
        }
    }

    public final void onStop() {
        super.onStop();
        this.A00 = 4;
        Iterator A0z = AnonymousClass000.A0z(this.A02);
        while (A0z.hasNext()) {
            ((LifecycleCallback) A0z.next()).onStop();
        }
    }
}
