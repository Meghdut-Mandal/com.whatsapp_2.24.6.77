package com.facebook.cameracore.mediapipeline.dataproviders.recognitiontracking.interfaces;

import X.AnonymousClass9T6;
import X.C23931Ak;
import java.util.Collection;
import java.util.List;

public class RecognitionTrackingDataProviderConfiguration extends AnonymousClass9T6 {
    public List mRecognizerCreators;
    public int mThreadPriority;
    public List mTrackerCreators;

    public C23931Ak getRecognizerCreators() {
        return C23931Ak.copyOf((Collection) this.mRecognizerCreators);
    }

    public C23931Ak getTrackerCreators() {
        return C23931Ak.copyOf((Collection) this.mTrackerCreators);
    }

    public void updateTargetRecognizerNetPath(String str, String str2) {
        for (IRecognizerCreator iRecognizerCreator : this.mRecognizerCreators) {
            TargetRecognizerCreator targetRecognizerCreator = (TargetRecognizerCreator) iRecognizerCreator;
            targetRecognizerCreator.mExecNetPath = str;
            targetRecognizerCreator.mDetectionExecNetPath = str2;
        }
    }

    public RecognitionTrackingDataProviderConfiguration(List list, List list2, int i) {
        this.mRecognizerCreators = list;
        this.mTrackerCreators = list2;
        this.mThreadPriority = i;
    }

    public int getThreadPriority() {
        return this.mThreadPriority;
    }
}
