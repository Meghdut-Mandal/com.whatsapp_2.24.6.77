package com.facebook.cameracore.mediapipeline.arengineservices.interfaces;

import com.facebook.cameracore.mediapipeline.dataproviders.worldtracker.interfaces.WorldTrackerDataProviderConfig;

public abstract class WorldTrackerDataProviderConfigWithSlam {
    public WorldTrackerDataProviderConfig config;
    public boolean isARCoreEnabled;
    public WorldTrackerSlamFactoryProvider slamFactoryProvider;
    public boolean useFirstframe;
}
