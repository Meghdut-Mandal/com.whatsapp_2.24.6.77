package com.google.android.gms.common.api.internal;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass008;
import X.AnonymousClass02E;
import X.AnonymousClass0E8;
import X.C11830h4;
import X.C17270r0;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

public final class zzd extends AnonymousClass02E implements C17270r0 {
    public static final WeakHashMap A03 = new WeakHashMap();
    public int A00 = 0;
    public Bundle A01;
    public final Map A02 = Collections.synchronizedMap(new AnonymousClass008());

    public final void A1B() {
        this.A0Y = true;
        this.A00 = 4;
        Iterator A0z = AnonymousClass000.A0z(this.A02);
        while (A0z.hasNext()) {
            ((LifecycleCallback) A0z.next()).onStop();
        }
    }

    public final void A1H() {
        this.A0Y = true;
        this.A00 = 5;
        Iterator A0z = AnonymousClass000.A0z(this.A02);
        while (A0z.hasNext()) {
            A0z.next();
        }
    }

    public final void A1L() {
        this.A0Y = true;
        this.A00 = 3;
        Iterator A0z = AnonymousClass000.A0z(this.A02);
        while (A0z.hasNext()) {
            ((LifecycleCallback) A0z.next()).onResume();
        }
    }

    public final void A1M() {
        this.A0Y = true;
        this.A00 = 2;
        Iterator A0z = AnonymousClass000.A0z(this.A02);
        while (A0z.hasNext()) {
            ((LifecycleCallback) A0z.next()).onStart();
        }
    }

    public final void A1R(Bundle bundle) {
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

    public final void B0J(LifecycleCallback lifecycleCallback, String str) {
        Map map = this.A02;
        if (!map.containsKey(str)) {
            map.put(str, lifecycleCallback);
            if (this.A00 > 0) {
                new AnonymousClass0E8(Looper.getMainLooper()).post(new C11830h4(lifecycleCallback, this, str));
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

    public final void A0z(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.A0z(str, fileDescriptor, printWriter, strArr);
        Iterator A0z = AnonymousClass000.A0z(this.A02);
        while (A0z.hasNext()) {
            A0z.next();
        }
    }

    public final void A1N(int i, int i2, Intent intent) {
        super.A1N(i, i2, intent);
        Iterator A0z = AnonymousClass000.A0z(this.A02);
        while (A0z.hasNext()) {
            ((LifecycleCallback) A0z.next()).onActivityResult(i, i2, intent);
        }
    }

    public final void A1Q(Bundle bundle) {
        Bundle bundle2;
        super.A1Q(bundle);
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

    public final /* synthetic */ Activity BDW() {
        return A0h();
    }
}
