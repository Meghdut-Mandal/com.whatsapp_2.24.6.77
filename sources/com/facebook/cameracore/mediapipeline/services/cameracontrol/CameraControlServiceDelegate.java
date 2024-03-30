package com.facebook.cameracore.mediapipeline.services.cameracontrol;

import X.C187518y2;
import X.C187528y3;

public interface CameraControlServiceDelegate {
    boolean canUpdateCaptureDevicePosition(C187518y2 r1);

    long getExposureTime();

    int getIso();

    long getMaxExposureTime();

    int getMaxIso();

    long getMinExposureTime();

    int getMinIso();

    boolean isFocusModeSupported(C187528y3 r1);

    boolean isLockExposureAndFocusSupported();

    void lockExposureAndFocus(long j, int i);

    void unlockExposureAndFocus();

    void updateCaptureDevicePosition(C187518y2 r1);

    void updateFocusMode(C187528y3 r1);
}
