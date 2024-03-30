package com.whatsapp.stickers;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.RecyclerView;

public class BottomFadeRecyclerView extends RecyclerView {
    public BottomFadeRecyclerView(Context context) {
        super(context, (AttributeSet) null);
    }

    public float getTopFadingEdgeStrength() {
        return 0.0f;
    }

    public BottomFadeRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public BottomFadeRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
