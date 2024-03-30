package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewDebug;
import android.view.ViewGroup;

/* renamed from: X.0Fu  reason: invalid class name and case insensitive filesystem */
public class C03530Fu extends C03440Ex {
    @ViewDebug.ExportedProperty
    public int A00;
    @ViewDebug.ExportedProperty
    public int A01;
    @ViewDebug.ExportedProperty
    public boolean A02;
    public boolean A03;
    @ViewDebug.ExportedProperty
    public boolean A04;
    @ViewDebug.ExportedProperty
    public boolean A05;

    public C03530Fu(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public C03530Fu(C03530Fu r2) {
        super((ViewGroup.LayoutParams) r2);
        this.A04 = r2.A04;
    }

    public C03530Fu(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
    }

    public C03530Fu() {
        super(-2);
        this.A04 = false;
    }
}
