package com.whatsapp.mediacomposer.bottombar.recipients;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass00C;
import X.AnonymousClass3XT;
import X.AnonymousClass4U9;
import X.C135466ck;
import X.C36361kB;
import X.C36381kD;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.whatsapp.R;
import com.whatsapp.status.audienceselector.StatusQuickShareButton;

public final class QuickShareRecipientsView extends LinearLayout {
    public final StatusQuickShareButton A00 = ((StatusQuickShareButton) C36361kB.A0G(this, R.id.recipients_contacts_btn));
    public final StatusQuickShareButton A01 = ((StatusQuickShareButton) C36361kB.A0G(this, R.id.recipients_selected_btn));

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public QuickShareRecipientsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AnonymousClass00C.A0D(context, 1);
        View.inflate(getContext(), R.layout.f9nameremoved, this);
        this.A00.setIcon(R.drawable.ic_status_my_contacts);
        this.A01.setIcon(R.drawable.ic_status_selected_contacts);
    }

    public static /* synthetic */ void getContactBtn$app_product_mediacomposer_mediacomposer_non_modified$annotations() {
    }

    public static /* synthetic */ void getSelectedBtn$app_product_mediacomposer_mediacomposer_non_modified$annotations() {
    }

    public static final void setRecipientsListener$lambda$0(AnonymousClass4U9 r1, View view) {
        AnonymousClass00C.A0D(r1, 0);
        r1.Be3(2);
    }

    public static final void setRecipientsListener$lambda$1(AnonymousClass4U9 r1, View view) {
        AnonymousClass00C.A0D(r1, 0);
        r1.Be4(2);
    }

    public static final void setRecipientsListener$lambda$2(AnonymousClass4U9 r1, View view) {
        AnonymousClass00C.A0D(r1, 0);
        r1.Be3(1);
    }

    public static final void setRecipientsListener$lambda$3(AnonymousClass4U9 r1, View view) {
        AnonymousClass00C.A0D(r1, 0);
        r1.Be4(1);
    }

    public final void setRecipientsListener$app_product_mediacomposer_mediacomposer_non_modified(AnonymousClass4U9 r4) {
        AnonymousClass00C.A0D(r4, 0);
        StatusQuickShareButton statusQuickShareButton = this.A00;
        statusQuickShareButton.setPrimaryOnClickListener(new C135466ck(r4, 19));
        statusQuickShareButton.setSecondaryOnClickListener(new C135466ck(r4, 20));
        StatusQuickShareButton statusQuickShareButton2 = this.A01;
        statusQuickShareButton2.setPrimaryOnClickListener(new C135466ck(r4, 17));
        statusQuickShareButton2.setSecondaryOnClickListener(new C135466ck(r4, 18));
    }

    public final void setUpButtonLabel$app_product_mediacomposer_mediacomposer_non_modified(AnonymousClass3XT r7) {
        String string;
        AnonymousClass00C.A0D(r7, 0);
        this.A00.setLabel(C36381kD.A0s(getResources(), R.string.f12nameremoved));
        StatusQuickShareButton statusQuickShareButton = this.A01;
        int size = r7.A01.size();
        if (size == 0) {
            string = getResources().getString(R.string.f12nameremoved);
        } else {
            Resources resources = getResources();
            Object[] A0L = AnonymousClass001.A0L();
            AnonymousClass000.A1L(A0L, size, 0);
            string = resources.getString(R.string.f12nameremoved, A0L);
        }
        AnonymousClass00C.A0B(string);
        statusQuickShareButton.setLabel(string);
    }

    public final StatusQuickShareButton getContactBtn$app_product_mediacomposer_mediacomposer_non_modified() {
        return this.A00;
    }

    public final StatusQuickShareButton getSelectedBtn$app_product_mediacomposer_mediacomposer_non_modified() {
        return this.A01;
    }
}
