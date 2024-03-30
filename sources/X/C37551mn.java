package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import com.whatsapp.chatinfo.view.custom.BusinessChatInfoLayout;
import com.whatsapp.chatinfo.view.custom.ChatInfoLayoutV2;
import com.whatsapp.chatinfo.view.custom.NewsletterInfoLayout;

/* renamed from: X.1mn  reason: invalid class name and case insensitive filesystem */
public abstract class C37551mn extends ViewGroup implements C18700tb {
    public AnonymousClass1QZ A00;

    public void A05() {
        AnonymousClass2E3 r1 = (AnonymousClass2E3) this;
        if (r1 instanceof NewsletterInfoLayout) {
            NewsletterInfoLayout newsletterInfoLayout = (NewsletterInfoLayout) r1;
            if (!newsletterInfoLayout.A00) {
                newsletterInfoLayout.A00 = true;
                A00(newsletterInfoLayout, (C27851Qb) newsletterInfoLayout.generatedComponent());
            }
        } else if (r1 instanceof BusinessChatInfoLayout) {
            BusinessChatInfoLayout businessChatInfoLayout = (BusinessChatInfoLayout) r1;
            if (!businessChatInfoLayout.A00) {
                businessChatInfoLayout.A00 = true;
                A00(businessChatInfoLayout, (C27851Qb) businessChatInfoLayout.generatedComponent());
            }
        } else if (!r1.A00) {
            r1.A00 = true;
            A00((ChatInfoLayoutV2) r1, (C27851Qb) r1.generatedComponent());
        }
    }

    public static void A00(ChatInfoLayoutV2 chatInfoLayoutV2, Object obj) {
        C18800tq r1 = ((C27861Qc) obj).A0M;
        chatInfoLayoutV2.A02 = (AnonymousClass1JL) r1.A00.A3t.get();
        chatInfoLayoutV2.A0S = (C20810yC) r1.A02.get();
        chatInfoLayoutV2.A0R = (AnonymousClass1H2) r1.A2x.get();
        chatInfoLayoutV2.A0P = (AnonymousClass171) r1.A90.get();
        chatInfoLayoutV2.A0Q = (C18820ts) r1.A9X.get();
        chatInfoLayoutV2.A0L = (AnonymousClass1LI) r1.A3Q.get();
        chatInfoLayoutV2.A05 = (AnonymousClass1Pp) r1.A28.get();
    }

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A00;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A00 = r0;
        }
        return r0.generatedComponent();
    }

    public C37551mn(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A05();
    }
}
