package com.whatsapp.conversation.conversationrow;

import X.AnonymousClass1QZ;
import X.C18700tb;
import X.C36441kJ;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.whatsapp.R;

public class ConversationRowImageAndVideoAlbum$AlbumGridFrame extends FrameLayout implements C18700tb {
    public int A00;
    public AnonymousClass1QZ A01;
    public boolean A02;

    public void A01() {
        if (!this.A02) {
            this.A02 = true;
            generatedComponent();
        }
    }

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A01;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A01 = r0;
        }
        return r0.generatedComponent();
    }

    public ConversationRowImageAndVideoAlbum$AlbumGridFrame(Context context) {
        super(context);
        A01();
        A00(context);
    }

    private void A00(Context context) {
        this.A00 = context.getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
    }

    public void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec((size - this.A00) / 2, 1073741824);
        int i3 = 0;
        do {
            getChildAt(i3).measure(makeMeasureSpec, makeMeasureSpec);
            i3++;
        } while (i3 < 4);
        setMeasuredDimension(size, size);
    }

    public ConversationRowImageAndVideoAlbum$AlbumGridFrame(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        super(context, attributeSet);
        A01();
    }

    public ConversationRowImageAndVideoAlbum$AlbumGridFrame(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A01();
        A00(context);
    }

    public ConversationRowImageAndVideoAlbum$AlbumGridFrame(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        A01();
        A00(context);
    }

    public ConversationRowImageAndVideoAlbum$AlbumGridFrame(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A01();
        A00(context);
    }
}
