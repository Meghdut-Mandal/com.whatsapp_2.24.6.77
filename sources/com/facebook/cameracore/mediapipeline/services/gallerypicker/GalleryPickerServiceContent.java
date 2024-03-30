package com.facebook.cameracore.mediapipeline.services.gallerypicker;

public abstract class GalleryPickerServiceContent {
    public final String mFilePath;
    public final boolean mIsPhoto;
    public final int mOrientation;

    public abstract String getFilePath();

    public abstract int getOrientation();

    public abstract boolean isPhoto();
}
