package com.whatsapp.chatinfo;

import X.AnonymousClass00C;
import X.AnonymousClass141;
import X.AnonymousClass147;
import X.AnonymousClass17X;
import X.AnonymousClass1EL;
import X.AnonymousClass1NN;
import X.AnonymousClass22V;
import X.AnonymousClass22x;
import X.AnonymousClass3TD;
import X.AnonymousClass3YY;
import X.C20350xQ;
import X.C220412q;
import X.C225314u;
import X.C24801Dv;
import X.C36321k7;
import X.C36331k8;
import X.C45632Sc;
import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import com.whatsapp.R;

public class EphemeralMessagesInfoView extends AnonymousClass22x {
    public C220412q A00;
    public AnonymousClass17X A01;
    public C20350xQ A02;
    public AnonymousClass1NN A03;
    public AnonymousClass1EL A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EphemeralMessagesInfoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AnonymousClass00C.A0D(context, 1);
        A04(R.drawable.ic_group_ephemeral, false);
        AnonymousClass22V.A01(context, this, R.string.f12nameremoved);
    }

    public final void A08(AnonymousClass141 r9, C45632Sc r10, AnonymousClass147 r11, boolean z) {
        AnonymousClass141 r5 = r9;
        AnonymousClass00C.A0D(r9, 0);
        C45632Sc r2 = r10;
        AnonymousClass147 r4 = r11;
        C36321k7.A0x(r11, r10);
        Activity A012 = C24801Dv.A01(getContext(), C225314u.class);
        if (getGroupInfoUtils$app_productinfra_conversation_ui_ui_non_modified().A01(r9, r11, z)) {
            setVisibility(0);
            A04(R.drawable.ic_group_ephemeral_v2, false);
            String A013 = AnonymousClass3TD.A01(getContext(), r9.A02, false, false);
            AnonymousClass00C.A08(A013);
            setDescription((CharSequence) A013);
            setOnClickListener(new AnonymousClass3YY(r2, this, r4, r5, A012, 0));
            return;
        }
        setVisibility(8);
    }

    public final void setChatsCache$app_productinfra_conversation_ui_ui_non_modified(C220412q r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A00 = r2;
    }

    public final void setGroupChatManager$app_productinfra_conversation_ui_ui_non_modified(C20350xQ r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A02 = r2;
    }

    public final void setGroupInfoUtils$app_productinfra_conversation_ui_ui_non_modified(AnonymousClass1NN r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A03 = r2;
    }

    public final void setGroupParticipantsManager$app_productinfra_conversation_ui_ui_non_modified(AnonymousClass17X r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A01 = r2;
    }

    public final void setSuspensionManager$app_productinfra_conversation_ui_ui_non_modified(AnonymousClass1EL r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A04 = r2;
    }

    public final C220412q getChatsCache$app_productinfra_conversation_ui_ui_non_modified() {
        C220412q r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("chatsCache");
    }

    public final C20350xQ getGroupChatManager$app_productinfra_conversation_ui_ui_non_modified() {
        C20350xQ r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("groupChatManager");
    }

    public final AnonymousClass1NN getGroupInfoUtils$app_productinfra_conversation_ui_ui_non_modified() {
        AnonymousClass1NN r0 = this.A03;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("groupInfoUtils");
    }

    public final AnonymousClass17X getGroupParticipantsManager$app_productinfra_conversation_ui_ui_non_modified() {
        AnonymousClass17X r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("groupParticipantsManager");
    }

    public final AnonymousClass1EL getSuspensionManager$app_productinfra_conversation_ui_ui_non_modified() {
        AnonymousClass1EL r0 = this.A04;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("suspensionManager");
    }
}
