package com.facebook.cameracore.logging.crashmetadatalogger.implementation;

import X.AnonymousClass001;
import X.AnonymousClass00C;
import X.C36331k8;
import X.C36441kJ;
import com.facebook.breakpad.BreakpadManager;
import java.util.HashSet;
import java.util.Iterator;

public final class CameraARCrashMetadataLogger {
    public HashSet loggedKeys = C36441kJ.A16();

    public final synchronized void cleanupBreakpadData() {
        Iterator it = this.loggedKeys.iterator();
        while (it.hasNext()) {
            BreakpadManager.removeCustomData(AnonymousClass001.A0C(it));
        }
        this.loggedKeys.clear();
    }

    public final synchronized void setBreakpadData(String str, String str2) {
        C36331k8.A1I(str, str2);
        BreakpadManager.setCustomData(str, str2, new Object[0]);
        this.loggedKeys.add(str);
    }

    public final void setLoggedKeys(HashSet hashSet) {
        AnonymousClass00C.A0D(hashSet, 0);
        this.loggedKeys = hashSet;
    }

    public final HashSet getLoggedKeys() {
        return this.loggedKeys;
    }
}
