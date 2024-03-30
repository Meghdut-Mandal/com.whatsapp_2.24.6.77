package X;

import android.text.TextUtils;
import android.view.View;
import com.whatsapp.conversation.conversationrow.InteractiveMessageView;

/* renamed from: X.3YW  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3YW implements View.OnClickListener {
    public final /* synthetic */ AnonymousClass3D7 A00;
    public final /* synthetic */ AnonymousClass3T1 A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ boolean A04;

    public /* synthetic */ AnonymousClass3YW(AnonymousClass3D7 r1, AnonymousClass3T1 r2, String str, String str2, boolean z) {
        this.A00 = r1;
        this.A02 = str;
        this.A04 = z;
        this.A03 = str2;
        this.A01 = r2;
    }

    public final void onClick(View view) {
        InteractiveMessageView interactiveMessageView;
        AnonymousClass3D7 r4 = this.A00;
        String str = this.A02;
        boolean z = this.A04;
        String str2 = this.A03;
        AnonymousClass3T1 r3 = this.A01;
        if (!TextUtils.isEmpty(str) || z) {
            interactiveMessageView = r4.A00;
            interactiveMessageView.A0E.A01(str);
        } else {
            AnonymousClass3P8 r5 = new AnonymousClass3P8("", str2, "", 2, 0);
            interactiveMessageView = r4.A00;
            interactiveMessageView.A06.A03(interactiveMessageView.getContext(), r3, r5);
        }
        C80283v9.A00(interactiveMessageView.A0F, r4, r3, 13);
    }
}
