package com.facebook.imagepipeline.platform;

import android.graphics.Bitmap;

public final class PreverificationHelper {
    public final boolean shouldUseHardwareBitmapConfig(Bitmap.Config config) {
        if (config == Bitmap.Config.HARDWARE) {
            return true;
        }
        return false;
    }
}
