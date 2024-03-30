package com.whatsapp.infra.gifsearch.controls;

import X.AnonymousClass001;
import X.AnonymousClass0CP;
import X.AnonymousClass1R1;
import X.C02800By;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.whatsapp.voipcalling.camera.VoipLiteCamera;

public class AdaptiveRecyclerView extends RecyclerView {
    public StaggeredGridLayoutManager A00;
    public final Rect A01 = AnonymousClass001.A06();

    public AdaptiveRecyclerView(Context context) {
        super(context, (AttributeSet) null);
        A06();
    }

    private void A06() {
        if (this.A00 == null) {
            this.A00 = new StaggeredGridLayoutManager(1, 1);
            setItemAnimator((C02800By) null);
            StaggeredGridLayoutManager staggeredGridLayoutManager = this.A00;
            staggeredGridLayoutManager.A1M((String) null);
            if (0 != staggeredGridLayoutManager.A01) {
                staggeredGridLayoutManager.A01 = 0;
                staggeredGridLayoutManager.A0S();
            }
            setLayoutManager(this.A00);
        }
        StaggeredGridLayoutManager staggeredGridLayoutManager2 = this.A00;
        if (staggeredGridLayoutManager2 != null) {
            staggeredGridLayoutManager2.A1Y(getSpanCount());
        }
    }

    private int getSpanCount() {
        Rect rect = this.A01;
        getHitRect(rect);
        switch (AnonymousClass1R1.A02(getContext(), (float) rect.width())) {
            case 360:
            case 480:
                return 2;
            case 600:
            case VoipLiteCamera.DEFAULT_SUPERNOVA_HEIGHT /*720*/:
                return 3;
            case 840:
            case 960:
                return 4;
            case VoipLiteCamera.DEFAULT_SUPERNOVA_WIDTH /*1280*/:
            case 1440:
                return 5;
            case 1600:
            case 1920:
                return 6;
            case 2240:
                return 7;
            default:
                return 1;
        }
    }

    public void A0g(int i) {
        if (i == 0) {
            A0b();
        }
    }

    public void setLayoutManager(AnonymousClass0CP r2) {
        StaggeredGridLayoutManager staggeredGridLayoutManager = this.A00;
        if (staggeredGridLayoutManager == null || r2 == staggeredGridLayoutManager) {
            super.setLayoutManager(r2);
            return;
        }
        throw AnonymousClass001.A08("LayoutManager cannot be replaced for this RecyclerView");
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        StaggeredGridLayoutManager staggeredGridLayoutManager;
        super.onSizeChanged(i, i2, i3, i4);
        if (i3 != i && (staggeredGridLayoutManager = this.A00) != null) {
            staggeredGridLayoutManager.A1Y(getSpanCount());
        }
    }

    public AdaptiveRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A06();
    }

    public StaggeredGridLayoutManager getLayoutManager() {
        return this.A00;
    }

    public AdaptiveRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A06();
    }
}
