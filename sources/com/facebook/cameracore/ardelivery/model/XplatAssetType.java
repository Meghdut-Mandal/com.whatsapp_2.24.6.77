package com.facebook.cameracore.ardelivery.model;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass6GV;
import X.AnonymousClass6VA;
import X.C135056c3;
import X.C90464aC;

public enum XplatAssetType {
    Unknown(0),
    AREffect(1),
    Async(2),
    StyleTransferEffect(3),
    LegacyEffect(4),
    ARLink(5),
    Remote(6),
    FaceTrackerModel(7),
    HairSegmentationModel(8),
    SegmentationModel(9),
    TargetRecognitionModel(10),
    XRayModel(11),
    FittedExpressionTrackerModel(12),
    MSuggestionsCoreModel(13),
    NametagModel(14),
    PyTorchModel(15),
    Caffe2Model(16),
    MulticlassSegmentationModel(17),
    ScriptingPackage(18),
    Ocr2goCreditCardModel(19),
    RecognitionModel(20),
    AR3DObject(21),
    SparkVision(22),
    FittedExpressionTrackerRuntimeRigRetargetingConfig(23);
    
    public static final XplatAssetType[] cppValueToEnumArray = null;
    public final int mCppValue;

    /* access modifiers changed from: public */
    static {
        int i;
        cppValueToEnumArray = new XplatAssetType[values().length];
        for (XplatAssetType xplatAssetType : values()) {
            cppValueToEnumArray[xplatAssetType.mCppValue] = xplatAssetType;
        }
    }

    public static XplatAssetType fromARRequestAsset(C135056c3 r3) {
        AnonymousClass6VA r32 = r3.A01;
        ARAssetType aRAssetType = r32.A02;
        int ordinal = aRAssetType.ordinal();
        if (ordinal == 0) {
            return AREffect;
        }
        if (ordinal == 2) {
            return Async;
        }
        if (ordinal == 3) {
            return Remote;
        }
        if (ordinal == 4) {
            return ScriptingPackage;
        }
        if (ordinal == 1) {
            VersionedCapability A03 = r32.A03();
            AnonymousClass6GV.A00(A03, "SUPPORT ARRequestAsset should have versioned capability field");
            return fromVersionedCapability(A03);
        }
        throw C90464aC.A0P(aRAssetType, "Unknown ARRequestAsset type : ", AnonymousClass000.A0u());
    }

    public static XplatAssetType ofCppValue(int i) {
        if (i >= 0 && i < values().length) {
            return cppValueToEnumArray[i];
        }
        throw AnonymousClass001.A08("Invalid cpp value for AssetType");
    }

    /* access modifiers changed from: public */
    XplatAssetType(int i) {
        this.mCppValue = i;
    }

    public static XplatAssetType fromVersionedCapability(VersionedCapability versionedCapability) {
        return versionedCapability.getXplatAssetType();
    }

    public int getValue() {
        return this.mCppValue;
    }
}
