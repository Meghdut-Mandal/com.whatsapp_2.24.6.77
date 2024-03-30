package X;

import android.content.ComponentCallbacks;
import android.content.res.Configuration;

/* renamed from: X.6Yr  reason: invalid class name and case insensitive filesystem */
public class C133486Yr implements ComponentCallbacks {
    public final /* synthetic */ C92794ej A00;

    public void onConfigurationChanged(Configuration configuration) {
    }

    public C133486Yr(C92794ej r1) {
        this.A00 = r1;
    }

    public void onLowMemory() {
        this.A00.A0C();
    }
}
