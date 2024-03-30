package com.whatsapp.calling.screenshare;

import X.AnonymousClass00C;
import X.C21123A9j;
import X.C22818AwT;
import X.C36441kJ;
import android.media.projection.MediaProjection;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

public final class ScreenShareResourceManager {
    public final Set listeners;
    public final AtomicReference mediaProjectionHandle = new AtomicReference((Object) null);

    public final void registerListener(C22818AwT awT) {
        AnonymousClass00C.A0D(awT, 0);
        this.listeners.add(awT);
    }

    public final void setMediaProjectionHandle(MediaProjection mediaProjection) {
        AnonymousClass00C.A0D(mediaProjection, 0);
        this.mediaProjectionHandle.set(mediaProjection);
        notifyListenersOfMediaProjectionEnabled();
    }

    public final void unregisterListener(C22818AwT awT) {
        AnonymousClass00C.A0D(awT, 0);
        this.listeners.remove(awT);
    }

    private final void notifyListenersOfMediaProjectionDisabled() {
        for (C22818AwT awT : this.listeners) {
            ((C21123A9j) awT).A00.mediaProjectionState.set(0);
        }
    }

    private final void notifyListenersOfMediaProjectionEnabled() {
        for (C22818AwT awT : this.listeners) {
            ((C21123A9j) awT).A00.mediaProjectionState.set(1);
        }
    }

    public final void clearMediaProjectionHandle() {
        this.mediaProjectionHandle.set((Object) null);
        notifyListenersOfMediaProjectionDisabled();
    }

    public final MediaProjection getMediaProjectionHandle() {
        return (MediaProjection) this.mediaProjectionHandle.get();
    }

    public ScreenShareResourceManager() {
        Set synchronizedSet = Collections.synchronizedSet(C36441kJ.A16());
        AnonymousClass00C.A08(synchronizedSet);
        this.listeners = synchronizedSet;
    }
}
