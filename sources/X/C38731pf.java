package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.whatsapp.biz.linkedaccounts.LinkedAccountsMediaCard;
import com.whatsapp.event.ChatInfoEventsCard;
import com.whatsapp.info.views.ChatInfoMediaCardV2;
import com.whatsapp.ui.media.MediaCardGrid;

/* renamed from: X.1pf  reason: invalid class name and case insensitive filesystem */
public abstract class C38731pf extends LinearLayout implements C18700tb {
    public AnonymousClass1QZ A00;
    public boolean A01;

    public void A01() {
        if (this instanceof ChatInfoEventsCard) {
            ChatInfoEventsCard chatInfoEventsCard = (ChatInfoEventsCard) this;
            if (!chatInfoEventsCard.A02) {
                chatInfoEventsCard.A02 = true;
                C18800tq A0W = C36391kE.A0W(chatInfoEventsCard.generatedComponent());
                chatInfoEventsCard.A00 = C36341k9.A0T(A0W);
                chatInfoEventsCard.A01 = C36421kH.A0M(A0W);
            }
        } else if (this instanceof MediaCardGrid) {
            MediaCardGrid mediaCardGrid = (MediaCardGrid) this;
            if (!mediaCardGrid.A03) {
                mediaCardGrid.A03 = true;
                mediaCardGrid.A02 = C36341k9.A0U(mediaCardGrid.generatedComponent());
            }
        } else if (this instanceof C47932gP) {
            C47932gP r2 = (C47932gP) this;
            if (r2 instanceof ChatInfoMediaCardV2) {
                ChatInfoMediaCardV2 chatInfoMediaCardV2 = (ChatInfoMediaCardV2) r2;
                if (!chatInfoMediaCardV2.A00) {
                    chatInfoMediaCardV2.A00 = true;
                    chatInfoMediaCardV2.A02 = C36341k9.A0U(chatInfoMediaCardV2.generatedComponent());
                }
            } else if (r2 instanceof LinkedAccountsMediaCard) {
                LinkedAccountsMediaCard linkedAccountsMediaCard = (LinkedAccountsMediaCard) r2;
                if (!linkedAccountsMediaCard.A06) {
                    linkedAccountsMediaCard.A06 = true;
                    C27861Qc r3 = (C27861Qc) ((C27851Qb) linkedAccountsMediaCard.generatedComponent());
                    C18800tq r1 = r3.A0M;
                    linkedAccountsMediaCard.A02 = C36341k9.A0T(r1);
                    linkedAccountsMediaCard.A01 = C36351kA.A0J(r1);
                    C18830tt r12 = r1.A00;
                    linkedAccountsMediaCard.A04 = (C196169Xz) r12.A9S.get();
                    linkedAccountsMediaCard.A05 = (AnonymousClass5Lb) r12.A9T.get();
                    linkedAccountsMediaCard.A02 = (AnonymousClass3C0) r3.A0L.A26.get();
                }
            } else if (!r2.A00) {
                r2.A00 = true;
                r2.A02 = C36341k9.A0U(r2.generatedComponent());
            }
        } else if (!this.A01) {
            this.A01 = true;
            generatedComponent();
        }
    }

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A00;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A00 = r0;
        }
        return r0.generatedComponent();
    }

    public C38731pf(Context context) {
        super(context);
        A01();
    }

    public C38731pf(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A01();
    }

    public C38731pf(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        A01();
    }

    public C38731pf(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A01();
    }
}
