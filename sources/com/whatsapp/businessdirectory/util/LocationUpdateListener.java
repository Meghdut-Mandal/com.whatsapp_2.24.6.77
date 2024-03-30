package com.whatsapp.businessdirectory.util;

import X.AnonymousClass00N;
import X.AnonymousClass05R;
import X.AnonymousClass17Y;
import X.AnonymousClass753;
import X.C001700s;
import X.C18820ts;
import X.C19630wG;
import X.C19770wU;
import X.C237019m;
import X.C36431kI;
import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import androidx.lifecycle.OnLifecycleEvent;

public class LocationUpdateListener implements LocationListener, AnonymousClass00N {
    public final C001700s A00 = C36431kI.A0S();
    public final C237019m A01;
    public final AnonymousClass17Y A02;
    public final C19630wG A03;
    public final C18820ts A04;
    public final C19770wU A05;

    @OnLifecycleEvent(AnonymousClass05R.ON_RESUME)
    private void connectListener() {
        this.A01.A06(this, "user-location-picker", 800.0f, 3, 1000, 1000);
    }

    public void onProviderDisabled(String str) {
    }

    public void onProviderEnabled(String str) {
    }

    public void onStatusChanged(String str, int i, Bundle bundle) {
    }

    @OnLifecycleEvent(AnonymousClass05R.ON_PAUSE)
    private void disconnectListener() {
        this.A01.A05(this);
    }

    public void onLocationChanged(Location location) {
        C19770wU r0 = this.A05;
        C19630wG r3 = this.A03;
        AnonymousClass17Y r6 = this.A02;
        r0.Boy(new AnonymousClass753(this.A00, r3, location, this.A04, r6, 7));
    }

    public LocationUpdateListener(C237019m r2, AnonymousClass17Y r3, C19630wG r4, C18820ts r5, C19770wU r6) {
        this.A02 = r3;
        this.A03 = r4;
        this.A05 = r6;
        this.A04 = r5;
        this.A01 = r2;
    }

    public void A00() {
        disconnectListener();
        connectListener();
    }
}
