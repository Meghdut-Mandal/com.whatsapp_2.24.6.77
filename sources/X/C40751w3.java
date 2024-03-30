package X;

import android.view.View;
import android.view.ViewGroup;
import java.util.List;

/* renamed from: X.1w3  reason: invalid class name and case insensitive filesystem */
public final class C40751w3 extends AnonymousClass0CZ {
    public final List A00 = AnonymousClass001.A0I();
    public final C51282nZ A01;

    public C40751w3(C51282nZ r2) {
        AnonymousClass00C.A0D(r2, 1);
        this.A01 = r2;
    }

    public void BSE(AnonymousClass0D3 r7, int i) {
        AnonymousClass00C.A0D(r7, 0);
        if (r7 instanceof C41801xn) {
            List list = this.A00;
            Object obj = list.get(i);
            AnonymousClass00C.A0E(obj, "null cannot be cast to non-null type com.whatsapp.event.ChatInfoEventUtils.Item.EventItem");
            AnonymousClass2bT r5 = ((AnonymousClass2MK) obj).A01;
            Object obj2 = list.get(i);
            AnonymousClass00C.A0E(obj2, "null cannot be cast to non-null type com.whatsapp.event.ChatInfoEventUtils.Item.EventItem");
            C51522nx r4 = ((AnonymousClass2MK) obj2).A00;
            C51282nZ r3 = this.A01;
            View view = r7.A0H;
            AnonymousClass00C.A0E(view, "null cannot be cast to non-null type com.whatsapp.event.EventView");
            AnonymousClass2ML r2 = (AnonymousClass2ML) view;
            r2.setEventName(r5);
            r2.setEventDate(r5.A00);
            r2.A00(r5, false);
            r2.setAbbreviatedDate(r5.A00);
            r2.setEventType(r4);
            r2.setOnClickListener(r5, r3);
            r2.setResponseStatus(r5);
        } else if (r7 instanceof C41791xm) {
            Object obj3 = this.A00.get(i);
            AnonymousClass00C.A0E(obj3, "null cannot be cast to non-null type com.whatsapp.event.ChatInfoEventUtils.Item.HeaderItem");
            String str = ((AnonymousClass2MJ) obj3).A00;
            View view2 = r7.A0H;
            AnonymousClass00C.A0E(view2, "null cannot be cast to non-null type com.whatsapp.event.EventHeaderView");
            ((C38121nk) view2).A00.setText(str);
        }
    }

    public AnonymousClass0D3 BUw(ViewGroup viewGroup, int i) {
        AnonymousClass00C.A0D(viewGroup, 0);
        if (i == 1) {
            return new C41801xn(C36351kA.A09(viewGroup));
        }
        if (i == 2) {
            return new C41791xm(C36351kA.A09(viewGroup));
        }
        return new AnonymousClass2MM(viewGroup);
    }

    public int A0J() {
        return this.A00.size();
    }

    public int getItemViewType(int i) {
        C51532ny r0;
        C588731j r02 = (C588731j) C007103b.A0P(this.A00, i);
        if (r02 != null) {
            r0 = r02.A00;
        } else {
            r0 = C51532ny.NONE;
        }
        return r0.ordinal();
    }
}
