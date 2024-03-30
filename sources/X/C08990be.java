package X;

import android.view.ContentInfo;
import android.view.OnReceiveContentListener;
import android.view.View;

/* renamed from: X.0be  reason: invalid class name and case insensitive filesystem */
public final class C08990be implements OnReceiveContentListener {
    public final C16690pv A00;

    public C08990be(C16690pv r1) {
        this.A00 = r1;
    }

    public ContentInfo onReceiveContent(View view, ContentInfo contentInfo) {
        AnonymousClass0X6 A002 = AnonymousClass0X6.A00(contentInfo);
        AnonymousClass0X6 BeE = this.A00.BeE(view, A002);
        if (BeE == null) {
            return null;
        }
        if (BeE == A002) {
            return contentInfo;
        }
        return BeE.A02();
    }
}
