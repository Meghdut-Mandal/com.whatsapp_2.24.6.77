package com.whatsapp.dialogs;

import X.AnonymousClass001;
import X.AnonymousClass141;
import X.AnonymousClass15C;
import X.AnonymousClass3DB;
import X.AnonymousClass3LW;
import X.C39001qm;
import X.C89714Xp;
import android.app.Dialog;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import com.whatsapp.R;
import java.util.ArrayList;

public class CreateOrAddToContactsDialog extends Hilt_CreateOrAddToContactsDialog {
    public long A00;
    public AnonymousClass15C A01;
    public boolean A02;

    public static CreateOrAddToContactsDialog A03(AnonymousClass141 r5, boolean z) {
        CreateOrAddToContactsDialog createOrAddToContactsDialog = new CreateOrAddToContactsDialog();
        Bundle A07 = AnonymousClass001.A07();
        A07.putLong("CONTACT_ID_KEY", r5.A0I());
        A07.putBoolean("IS_ME_KEY", z);
        createOrAddToContactsDialog.A17(A07);
        return createOrAddToContactsDialog;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.02E] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A1O(android.content.Context r3) {
        /*
            r2 = this;
            super.A1O(r3)
            X.02E r1 = r2.A0I
            boolean r0 = r1 instanceof X.AnonymousClass15C
            if (r0 == 0) goto L_0x000f
            r3 = r1
        L_0x000a:
            X.15C r3 = (X.AnonymousClass15C) r3
            r2.A01 = r3
            return
        L_0x000f:
            boolean r0 = r3 instanceof X.AnonymousClass15C
            if (r0 != 0) goto L_0x000a
            java.lang.String r0 = "CreateOrAddToContactsDialog requires a Listener as it's host"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.dialogs.CreateOrAddToContactsDialog.A1O(android.content.Context):void");
    }

    public void A1Q(Bundle bundle) {
        super.A1Q(bundle);
        Bundle A0b = A0b();
        this.A00 = A0b.getLong("CONTACT_ID_KEY");
        this.A02 = A0b.getBoolean("IS_ME_KEY");
        if (bundle != null) {
            this.A00 = bundle.getLong("CONTACT_ID_KEY");
            this.A02 = bundle.getBoolean("IS_ME_KEY");
        }
    }

    public void A1R(Bundle bundle) {
        super.A1R(bundle);
        bundle.putLong("CONTACT_ID_KEY", this.A00);
        bundle.putBoolean("IS_ME_KEY", this.A02);
    }

    public Dialog A1a(Bundle bundle) {
        ArrayList A0I = AnonymousClass001.A0I();
        A0I.add(new AnonymousClass3DB(A0n(R.string.f12nameremoved), R.id.menuitem_conversations_add_new_contact));
        A0I.add(new AnonymousClass3DB(A0n(R.string.f12nameremoved), R.id.menuitem_conversations_add_to_existing_contact));
        C39001qm A04 = AnonymousClass3LW.A04(this);
        A04.A0O(new C89714Xp(A0I, this, 15), new ArrayAdapter(A1D(), 17367043, A0I));
        return A04.create();
    }
}
