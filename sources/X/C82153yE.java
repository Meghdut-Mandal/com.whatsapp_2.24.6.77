package X;

import android.view.View;
import java.util.Collections;
import java.util.List;

/* renamed from: X.3yE  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C82153yE implements C019408g {
    public final /* synthetic */ C70803fk A00;

    public /* synthetic */ C82153yE(C70803fk r1) {
        this.A00 = r1;
    }

    public final Object BKt(Object obj, Object obj2, Object obj3) {
        C70803fk r1 = this.A00;
        int A0I = AnonymousClass000.A0I(obj2);
        boolean A1X = AnonymousClass000.A1X(obj3);
        View contentView = r1.A2l.getContentView();
        List emptyList = Collections.emptyList();
        C21060yb r4 = r1.A31;
        return new AnonymousClass3ZU(contentView, C70803fk.A07(r1), r4, (String) obj, emptyList, A0I, A1X);
    }
}
