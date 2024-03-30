package androidx.appcompat.view.menu;

import X.AnonymousClass07X;
import X.C010404j;
import X.C016307a;
import X.C016707e;
import X.C018707z;
import X.C16600pm;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public final class ExpandedMenuView extends ListView implements C16600pm, AdapterView.OnItemClickListener, C016707e {
    public static final int[] A01 = {16842964, 16843049};
    public C016307a A00;

    public boolean BL0(C018707z r4) {
        return this.A00.A0K(r4, (AnonymousClass07X) null, 0);
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842868);
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        BL0((C018707z) getAdapter().getItem(i));
    }

    public void BKe(C016307a r1) {
        this.A00 = r1;
    }

    public int getWindowAnimations() {
        return 0;
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        C010404j A002 = C010404j.A00(context, attributeSet, A01, i, 0);
        TypedArray typedArray = A002.A02;
        if (typedArray.hasValue(0)) {
            setBackgroundDrawable(A002.A02(0));
        }
        if (typedArray.hasValue(1)) {
            setDivider(A002.A02(1));
        }
        typedArray.recycle();
    }
}
