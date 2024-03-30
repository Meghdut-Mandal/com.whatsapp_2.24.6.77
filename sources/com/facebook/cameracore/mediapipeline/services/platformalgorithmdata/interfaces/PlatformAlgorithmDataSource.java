package com.facebook.cameracore.mediapipeline.services.platformalgorithmdata.interfaces;

import X.C22780Avq;
import com.facebook.onecamera.components.arcore.alwayson.recording.interfaces.PlatformAlgorithmAlwaysOnDataSource;

public interface PlatformAlgorithmDataSource {
    void closeSession();

    void registerListener(C22780Avq avq);

    void updateFrame(long j, long j2, PlatformAlgorithmAlwaysOnDataSource platformAlgorithmAlwaysOnDataSource);
}
