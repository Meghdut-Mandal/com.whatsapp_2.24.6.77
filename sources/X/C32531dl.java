package X;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import dagger.hilt.android.internal.managers.ViewComponentManager$FragmentContextWrapper$1;
import java.util.Objects;

/* renamed from: X.1dl  reason: invalid class name and case insensitive filesystem */
public final class C32531dl extends ContextWrapper {
    public LayoutInflater A00;
    public LayoutInflater A01;
    public AnonymousClass02E A02;
    public final AnonymousClass01Y A03;

    public Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        LayoutInflater layoutInflater = this.A01;
        if (layoutInflater != null) {
            return layoutInflater;
        }
        LayoutInflater layoutInflater2 = this.A00;
        if (layoutInflater2 == null) {
            layoutInflater2 = (LayoutInflater) getBaseContext().getSystemService("layout_inflater");
            this.A00 = layoutInflater2;
        }
        LayoutInflater cloneInContext = layoutInflater2.cloneInContext(this);
        this.A01 = cloneInContext;
        return cloneInContext;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C32531dl(android.view.LayoutInflater r3, X.AnonymousClass02E r4) {
        /*
            r2 = this;
            java.util.Objects.requireNonNull(r3)
            android.content.Context r0 = r3.getContext()
            java.util.Objects.requireNonNull(r0)
            r2.<init>(r0)
            dagger.hilt.android.internal.managers.ViewComponentManager$FragmentContextWrapper$1 r1 = new dagger.hilt.android.internal.managers.ViewComponentManager$FragmentContextWrapper$1
            r1.<init>(r2)
            r2.A03 = r1
            r2.A00 = r3
            java.util.Objects.requireNonNull(r4)
            r2.A02 = r4
            X.01N r0 = r4.A0P
            r0.A04(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32531dl.<init>(android.view.LayoutInflater, X.02E):void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C32531dl(Context context, AnonymousClass02E r4) {
        super(context);
        Objects.requireNonNull(context);
        ViewComponentManager$FragmentContextWrapper$1 viewComponentManager$FragmentContextWrapper$1 = new ViewComponentManager$FragmentContextWrapper$1(this);
        this.A03 = viewComponentManager$FragmentContextWrapper$1;
        this.A00 = null;
        Objects.requireNonNull(r4);
        this.A02 = r4;
        r4.A0P.A04(viewComponentManager$FragmentContextWrapper$1);
    }
}
