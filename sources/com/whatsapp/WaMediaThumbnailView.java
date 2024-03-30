package com.whatsapp;

import X.AnonymousClass4V2;
import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;

public class WaMediaThumbnailView extends WaImageView {
    public Bitmap A00;
    public AnonymousClass4V2 A01;

    public void setThumbnail(Bitmap bitmap) {
        this.A00 = bitmap;
        setImageBitmap(bitmap);
    }

    public AnonymousClass4V2 getMediaItem() {
        return this.A01;
    }

    public Bitmap getThumbnail() {
        return this.A00;
    }

    public WaMediaThumbnailView(Context context) {
        super(context);
    }

    public void setMediaItem(AnonymousClass4V2 r1) {
        this.A01 = r1;
    }

    public WaMediaThumbnailView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public WaMediaThumbnailView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
