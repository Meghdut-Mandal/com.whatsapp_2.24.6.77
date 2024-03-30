package com.whatsapp.conversation.conversationrow;

import X.AnonymousClass1QZ;
import X.AnonymousClass2KS;
import X.C18700tb;
import X.C36441kJ;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import com.whatsapp.R;

public class ConversationRowDocument$DocumentPreviewView extends AppCompatImageView implements C18700tb {
    public AnonymousClass1QZ A00;
    public boolean A01;
    public AnonymousClass2KS A02;

    public ConversationRowDocument$DocumentPreviewView(Context context) {
        super(context, (AttributeSet) null);
        if (!this.A01) {
            this.A01 = true;
            generatedComponent();
        }
        A00();
    }

    private void A00() {
        setScaleType(ImageView.ScaleType.MATRIX);
        this.A02 = new AnonymousClass2KS(C36441kJ.A05(getResources(), R.dimen.f7nameremoved));
    }

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A00;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A00 = r0;
        }
        return r0.generatedComponent();
    }

    public void setImageBitmap(Bitmap bitmap) {
        this.A02.A07(bitmap.getWidth(), bitmap.getHeight());
        super.setImageBitmap(bitmap);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        AnonymousClass2KS r0 = this.A02;
        ImageView.ScaleType scaleType = getScaleType();
        RectF A04 = r0.A04(i3, i4);
        Matrix matrix = null;
        if (A04 != null) {
            RectF rectF = new RectF(0.0f, 0.0f, (float) i3, (float) i4);
            if (scaleType == ImageView.ScaleType.MATRIX) {
                matrix = new Matrix();
                matrix.setRectToRect(A04, rectF, Matrix.ScaleToFit.FILL);
            } else {
                matrix = AnonymousClass2KS.A00;
            }
        }
        setImageMatrix(matrix);
    }

    public ConversationRowDocument$DocumentPreviewView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (!this.A01) {
            this.A01 = true;
            generatedComponent();
        }
        A00();
    }

    public ConversationRowDocument$DocumentPreviewView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet);
        if (!this.A01) {
            this.A01 = true;
            generatedComponent();
        }
    }

    public ConversationRowDocument$DocumentPreviewView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (!this.A01) {
            this.A01 = true;
            generatedComponent();
        }
        A00();
    }
}
