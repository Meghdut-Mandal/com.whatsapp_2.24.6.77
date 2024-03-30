package com.whatsapp.chatinfo.view.custom;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;

public class BusinessChatInfoLayout extends ChatInfoLayoutV2 {
    public boolean A00;

    public int A08(int i) {
        ImageView imageView = this.A02;
        if (imageView == null || imageView.getDrawable() == null) {
            return super.A08(i);
        }
        return (int) (((float) i) * 0.5625f);
    }

    public BusinessChatInfoLayout(Context context) {
        super(context);
        A05();
    }

    public BusinessChatInfoLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A05();
    }

    public BusinessChatInfoLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet);
        A05();
    }

    public BusinessChatInfoLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A05();
    }
}
