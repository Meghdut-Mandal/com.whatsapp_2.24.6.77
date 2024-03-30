package com.whatsapp.conversation.conversationrow.messagerating;

import X.AnonymousClass001;
import X.AnonymousClass11F;
import X.AnonymousClass143;
import X.AnonymousClass17Y;
import X.AnonymousClass3T1;
import X.C012005e;
import X.C1502274l;
import X.C1503574y;
import X.C16550pQ;
import X.C18740tg;
import X.C206219su;
import X.C36351kA;
import X.C36361kB;
import X.C36401kF;
import X.C36431kI;
import X.C36441kJ;
import X.C48742hy;
import X.C48812i6;
import X.C64933Qa;
import X.C68843cY;
import X.C80073uk;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.FAQTextView;
import com.whatsapp.R;
import com.whatsapp.StarRatingBar;
import com.whatsapp.WaTextView;
import com.whatsapp.wds.components.button.WDSButton;

public class MessageRatingFragment extends Hilt_MessageRatingFragment implements C16550pQ {
    public static final int[] A05 = {R.string.f12nameremoved, R.string.f12nameremoved, R.string.f12nameremoved, R.string.f12nameremoved, R.string.f12nameremoved};
    public AnonymousClass17Y A00;
    public C206219su A01;
    public MessageRatingViewModel A02;
    public AnonymousClass11F A03;
    public String A04;

    public static MessageRatingFragment A03(C206219su r5, AnonymousClass3T1 r6) {
        MessageRatingFragment messageRatingFragment = new MessageRatingFragment();
        Bundle A07 = AnonymousClass001.A07();
        C64933Qa r2 = r6.A1J;
        A07.putString("chat_jid", AnonymousClass143.A03(r2.A00));
        A07.putString("message_id", r2.A01);
        A07.putParcelable("entry_point", r5);
        messageRatingFragment.A17(A07);
        return messageRatingFragment;
    }

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View A0E = C36361kB.A0E(layoutInflater, viewGroup, R.layout.f9nameremoved);
        C48742hy.A01(C012005e.A02(A0E, R.id.close_button), this, 21);
        ((FAQTextView) C012005e.A02(A0E, R.id.description)).setEducationTextFromNamedArticle(C36441kJ.A0O(A0n(R.string.f12nameremoved)), "chats", "controls-when-messaging-businesses");
        StarRatingBar starRatingBar = (StarRatingBar) C012005e.A02(A0E, R.id.rating_bar);
        WDSButton A0y = C36431kI.A0y(A0E, R.id.submit);
        WaTextView A0Q = C36401kF.A0Q(A0E, R.id.rating_label);
        C48812i6.A00(A0y, starRatingBar, this, 48);
        starRatingBar.A01 = new C68843cY(A0Q, this, A0y);
        C80073uk.A00(A0m(), this.A02.A01, starRatingBar, 3);
        MessageRatingViewModel messageRatingViewModel = this.A02;
        messageRatingViewModel.A06.Boy(new C1502274l(messageRatingViewModel, this.A03, this.A04, 40));
        return A0E;
    }

    public void A1Q(Bundle bundle) {
        super.A1Q(bundle);
        this.A02 = (MessageRatingViewModel) C36441kJ.A0b(this).A00(MessageRatingViewModel.class);
        this.A03 = C36351kA.A0i(A0b(), "chat_jid");
        this.A04 = C36431kI.A17(A0b(), "message_id");
        Parcelable parcelable = A0b().getParcelable("entry_point");
        C18740tg.A06(parcelable);
        C206219su r4 = (C206219su) parcelable;
        this.A01 = r4;
        MessageRatingViewModel messageRatingViewModel = this.A02;
        messageRatingViewModel.A06.Boy(new C1503574y(messageRatingViewModel, this.A03, r4, this.A04, 10));
    }

    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        MessageRatingViewModel messageRatingViewModel = this.A02;
        AnonymousClass11F r3 = this.A03;
        String str = this.A04;
        C206219su r4 = this.A01;
        if (!messageRatingViewModel.A00) {
            messageRatingViewModel.A06.Boy(new C1503574y(messageRatingViewModel, r3, r4, str, 9));
        }
    }
}
