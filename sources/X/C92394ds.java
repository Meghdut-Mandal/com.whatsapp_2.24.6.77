package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* renamed from: X.4ds  reason: invalid class name and case insensitive filesystem */
public abstract class C92394ds extends ViewGroup {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C92394ds(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AnonymousClass00C.A0D(context, 1);
    }

    public abstract void A01(C123045vq r1);

    public abstract void A02(C123045vq r1, int i);

    public abstract String getDescriptionOfMountedItems();

    public abstract int getMountItemCount();

    public boolean getClipChildren() {
        return super.getClipChildren();
    }

    public void setClipChildren(boolean z) {
        super.setClipChildren(z);
    }
}
