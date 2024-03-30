package com.facebook.cameracore.mediapipeline.services.targetrecognition.interfaces;

public interface TargetRecognitionServiceDataSource {
    void recognizeTargetWithSerializedData(byte[] bArr, String str, TargetRecognitionResponseCallback targetRecognitionResponseCallback);
}
