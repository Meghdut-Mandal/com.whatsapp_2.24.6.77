package X;

import android.content.Context;
import android.util.AttributeSet;
import com.whatsapp.biz.catalog.view.AspectRatioFrameLayout;

/* renamed from: X.4zZ  reason: invalid class name and case insensitive filesystem */
public abstract class C102254zZ extends AspectRatioFrameLayout {
    public int A00;
    public AnonymousClass3T1 A01;

    public C102254zZ(Context context) {
        super(context, (AttributeSet) null);
    }

    public abstract void setMessage(AnonymousClass2bU r1);

    public void setScrolling(boolean z) {
    }

    public void setShouldPlay(boolean z) {
    }

    public void setRadius(int i) {
        this.A00 = i;
    }
}
