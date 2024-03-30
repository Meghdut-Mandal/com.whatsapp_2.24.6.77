package X;

import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;
import java.util.List;

/* renamed from: X.1wL  reason: invalid class name and case insensitive filesystem */
public final class C40931wL extends AnonymousClass0CZ {
    public List A00 = AnonymousClass001.A0I();
    public final AnonymousClass1RY A01;

    public /* bridge */ /* synthetic */ void A0K(AnonymousClass0D3 r3) {
        AnonymousClass00C.A0D(r3, 0);
        if (r3 instanceof AnonymousClass2MQ) {
            View view = r3.A0H;
            AnonymousClass00C.A0E(view, "null cannot be cast to non-null type com.whatsapp.events.EventResponseUserView");
            C07570Yj.A03(((C38811q8) view).A0E.BAE());
        }
    }

    public /* bridge */ /* synthetic */ void BSE(AnonymousClass0D3 r6, int i) {
        AnonymousClass00C.A0D(r6, 0);
        if (r6 instanceof AnonymousClass2MQ) {
            Object obj = this.A00.get(i);
            AnonymousClass00C.A0E(obj, "null cannot be cast to non-null type com.whatsapp.events.EventResponsesAdapter.Item.UserItem");
            AnonymousClass2MU r3 = (AnonymousClass2MU) obj;
            AnonymousClass1RY r2 = this.A01;
            C36321k7.A0w(r3, r2);
            View view = r6.A0H;
            AnonymousClass00C.A0E(view, "null cannot be cast to non-null type com.whatsapp.events.EventResponseUserView");
            ((C38811q8) view).A02(r2, r3);
        } else if (r6 instanceof AnonymousClass2MP) {
            List list = this.A00;
            Object obj2 = list.get(i);
            AnonymousClass00C.A0E(obj2, "null cannot be cast to non-null type com.whatsapp.events.EventResponsesAdapter.Item.HeaderItem");
            String str = ((AnonymousClass2MT) obj2).A01;
            Object obj3 = list.get(i);
            AnonymousClass00C.A0E(obj3, "null cannot be cast to non-null type com.whatsapp.events.EventResponsesAdapter.Item.HeaderItem");
            int i2 = ((AnonymousClass2MT) obj3).A00;
            View view2 = r6.A0H;
            AnonymousClass00C.A0E(view2, "null cannot be cast to non-null type com.whatsapp.events.EventResponseHeaderView");
            C38451os r1 = (C38451os) view2;
            r1.A01.setText(str);
            r1.A00.setText(C36321k7.A0B(C36341k9.A0F(r1), i2, 0, R.plurals.f10nameremoved));
        } else if (r6 instanceof AnonymousClass2MN) {
            Object obj4 = this.A00.get(i);
            AnonymousClass00C.A0E(obj4, "null cannot be cast to non-null type com.whatsapp.events.EventResponsesAdapter.Item.EventAdditionalInfo");
            AnonymousClass2bT r22 = ((AnonymousClass2MR) obj4).A00;
            View view3 = r6.A0H;
            AnonymousClass00C.A0E(view3, "null cannot be cast to non-null type com.whatsapp.events.EventAdditionalInfoView");
            ((C38791q6) view3).A00(r22);
        } else if (r6 instanceof AnonymousClass2MO) {
            List list2 = this.A00;
            Object obj5 = list2.get(i);
            AnonymousClass00C.A0E(obj5, "null cannot be cast to non-null type com.whatsapp.events.EventResponsesAdapter.Item.EventNameAndDescription");
            AnonymousClass2bT r4 = ((AnonymousClass2MS) obj5).A00;
            AnonymousClass1RY r32 = this.A01;
            Object obj6 = list2.get(i);
            AnonymousClass00C.A0E(obj6, "null cannot be cast to non-null type com.whatsapp.events.EventResponsesAdapter.Item.EventNameAndDescription");
            C51282nZ r23 = ((AnonymousClass2MS) obj6).A01;
            AnonymousClass00C.A0D(r32, 1);
            View view4 = r6.A0H;
            AnonymousClass00C.A0E(view4, "null cannot be cast to non-null type com.whatsapp.events.EventNameAndDescriptionView");
            ((C38801q7) view4).A00(r4, r32, r23);
        }
    }

    public /* bridge */ /* synthetic */ AnonymousClass0D3 BUw(ViewGroup viewGroup, int i) {
        AnonymousClass00C.A0D(viewGroup, 0);
        if (i == 1) {
            return new AnonymousClass2MQ(C36351kA.A09(viewGroup));
        }
        if (i == 2) {
            return new AnonymousClass2MP(C36351kA.A09(viewGroup));
        }
        if (i == 4) {
            return new AnonymousClass2MN(C36351kA.A09(viewGroup));
        }
        if (i == 3) {
            return new AnonymousClass2MO(C36351kA.A09(viewGroup));
        }
        return new AnonymousClass2MM(viewGroup);
    }

    public int A0J() {
        return this.A00.size();
    }

    public int getItemViewType(int i) {
        C51862oV r0;
        C588831k r02 = (C588831k) C007103b.A0P(this.A00, i);
        if (r02 != null) {
            r0 = r02.A00;
        } else {
            r0 = C51862oV.NONE;
        }
        return r0.ordinal();
    }

    public C40931wL(AnonymousClass1RY r2) {
        this.A01 = r2;
    }
}
