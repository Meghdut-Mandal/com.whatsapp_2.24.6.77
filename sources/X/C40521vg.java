package X;

import android.view.View;
import android.view.ViewGroup;
import java.util.List;

/* renamed from: X.1vg  reason: invalid class name and case insensitive filesystem */
public final class C40521vg extends AnonymousClass0CZ {
    public final List A00 = AnonymousClass001.A0I();

    public /* bridge */ /* synthetic */ void BSE(AnonymousClass0D3 r5, int i) {
        AnonymousClass00C.A0D(r5, 0);
        AnonymousClass2bT r3 = ((AnonymousClass2MK) this.A00.get(i)).A01;
        View view = r5.A0H;
        AnonymousClass00C.A0E(view, "null cannot be cast to non-null type com.whatsapp.event.ChatInfoUpcomingEventView");
        AnonymousClass2ML r2 = (AnonymousClass2ML) view;
        r2.setEventName(r3);
        r2.setEventDate(r3.A00);
        r2.A00(r3, true);
        r2.setAbbreviatedDate(r3.A00);
        r2.setEventType(C51522nx.UPCOMING);
        r2.setOnClickListener(r3, C51282nZ.NONE);
        r2.setResponseStatus(r3);
    }

    public /* bridge */ /* synthetic */ AnonymousClass0D3 BUw(ViewGroup viewGroup, int i) {
        AnonymousClass00C.A0D(viewGroup, 0);
        return new C41451xE(new AnonymousClass2MH(C36351kA.A09(viewGroup)));
    }

    public int A0J() {
        return this.A00.size();
    }
}
