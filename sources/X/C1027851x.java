package X;

import android.view.View;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import java.util.List;

/* renamed from: X.51x  reason: invalid class name and case insensitive filesystem */
public final class C1027851x extends C1043059c {
    public final View A00;
    public final TextEmojiLabel A01;
    public final AnonymousClass652 A02;
    public final AnonymousClass16I A03;
    public final AnonymousClass1RY A04;
    public final List A05 = AnonymousClass001.A0I();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1027851x(View view, AnonymousClass652 r3, AnonymousClass16I r4, AnonymousClass1RY r5) {
        super(view);
        AnonymousClass00C.A0D(view, 1);
        this.A00 = view;
        this.A03 = r4;
        this.A04 = r5;
        this.A02 = r3;
        this.A01 = C36351kA.A0O(view, R.id.business_search_hint);
    }

    public void A0D() {
        List<Object> list = this.A05;
        for (Object unregisterObserver : list) {
            this.A03.unregisterObserver(unregisterObserver);
        }
        list.clear();
    }
}
