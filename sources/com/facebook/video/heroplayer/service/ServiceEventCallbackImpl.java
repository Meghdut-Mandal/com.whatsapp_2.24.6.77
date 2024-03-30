package com.facebook.video.heroplayer.service;

import X.AU7;
import X.AnonymousClass000;
import X.AnonymousClass89B;
import X.AnonymousClass94C;
import X.C131916Rh;
import X.C90524aI;
import com.facebook.exoplayer.monitor.VpsEventCallback;
import java.util.concurrent.atomic.AtomicReference;

public class ServiceEventCallbackImpl implements VpsEventCallback {
    public String A00;
    public final AnonymousClass94C A01;
    public final AtomicReference A02;

    public void B2I(AU7 au7) {
        C131916Rh.A01("ServiceEventCallbackImpl", "skipping log because listener is null", C90524aI.A0w());
    }

    public void errorCallback(String str, String str2, String str3) {
        B2I(new AnonymousClass89B(this.A00, str, str2, str3));
    }

    public ServiceEventCallbackImpl(AnonymousClass94C r4, String str, AtomicReference atomicReference) {
        this.A02 = atomicReference;
        this.A01 = r4;
        this.A00 = str == null ? "" : str;
        C131916Rh.A01("ServiceEventCallbackImpl", AnonymousClass000.A0l(atomicReference, "setting listener for event callback to: ", AnonymousClass000.A0u()), C90524aI.A0w());
    }

    public ServiceEventCallbackImpl(AtomicReference atomicReference) {
        this.A02 = atomicReference;
        this.A01 = null;
        this.A00 = "";
        C131916Rh.A01("ServiceEventCallbackImpl", AnonymousClass000.A0l(atomicReference, "setting listener for event callback to: ", AnonymousClass000.A0u()), C90524aI.A0w());
    }
}
