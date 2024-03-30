package com.google.android.gms.vision.clearcut;

import X.AnonymousClass0L0;
import X.C17610rh;
import X.C17620ri;
import android.os.Bundle;

public abstract class LoggingConnectionCallbacks implements C17610rh, C17620ri {
    public abstract void onConnected(Bundle bundle);

    public abstract void onConnectionFailed(AnonymousClass0L0 r1);

    public abstract void onConnectionSuspended(int i);
}
