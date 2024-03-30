package com.facebook.cameracore.mediapipeline.services.analyticslogger.implementation;

import X.AnonymousClass9LG;
import X.C188308zN;
import X.C188318zO;
import X.C22778Avo;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.cameracore.logging.crashmetadatalogger.implementation.CameraARCrashMetadataLogger;
import com.facebook.cameracore.mediapipeline.services.analyticslogger.interfaces.AnalyticsLogger;
import com.facebook.common.jniexecutors.AndroidAsyncExecutorFactory;
import com.facebook.jni.HybridData;
import com.facebook.xanalytics.XAnalyticsHolder;
import java.util.concurrent.Executors;

public class AnalyticsLoggerImpl extends AnalyticsLogger {
    public AndroidAsyncExecutorFactory mAsyncExecutorFactory;
    public AnonymousClass9LG mCameraARAnalyticsLogger;
    public final CameraARCrashMetadataLogger mCrashMetadataLogger = new CameraARCrashMetadataLogger();
    public C188308zN mEffectStartIntent = C188308zN.NONE;
    public final C188318zO mOptimizedPerfLoggerOption;
    public String mProductName;

    public native HybridData initHybrid(AndroidAsyncExecutorFactory androidAsyncExecutorFactory, int i);

    public String getEffectStartIntentString() {
        int ordinal = this.mEffectStartIntent.ordinal();
        if (ordinal == 1) {
            return PublicKeyCredentialControllerUtility.JSON_KEY_USER;
        }
        if (ordinal != 2) {
            return "unknown";
        }
        return "system";
    }

    public XAnalyticsHolder getXAnalytics() {
        AnonymousClass9LG r0 = this.mCameraARAnalyticsLogger;
        if (r0 != null) {
            return r0.A02;
        }
        return null;
    }

    public void logSessionEvent(boolean z) {
        CameraARCrashMetadataLogger cameraARCrashMetadataLogger = this.mCrashMetadataLogger;
        if (cameraARCrashMetadataLogger != null && !z) {
            cameraARCrashMetadataLogger.cleanupBreakpadData();
        }
    }

    public void setBreakpadData(String str, String str2) {
        CameraARCrashMetadataLogger cameraARCrashMetadataLogger = this.mCrashMetadataLogger;
        if (cameraARCrashMetadataLogger != null) {
            cameraARCrashMetadataLogger.setBreakpadData(str, str2);
        }
    }

    public AnalyticsLoggerImpl(AnonymousClass9LG r3, C22778Avo avo, C188318zO r5) {
        AndroidAsyncExecutorFactory androidAsyncExecutorFactory = AndroidAsyncExecutorFactory.$redex_init_class;
        AndroidAsyncExecutorFactory androidAsyncExecutorFactory2 = new AndroidAsyncExecutorFactory(Executors.newScheduledThreadPool(1));
        this.mAsyncExecutorFactory = androidAsyncExecutorFactory2;
        this.mCameraARAnalyticsLogger = r3;
        this.mProductName = r3.A00;
        this.mOptimizedPerfLoggerOption = r5;
        this.mHybridData = initHybrid(androidAsyncExecutorFactory2, r5.mCppValue);
    }

    public String getProductName() {
        return this.mProductName;
    }

    public void logForBugReport(String str, String str2) {
    }

    public void logRawEvent(String str, String str2) {
    }
}
