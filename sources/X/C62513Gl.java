package X;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.DialogFragment;
import com.whatsapp.ListItemWithLeftIcon;
import com.whatsapp.R;
import com.whatsapp.chatinfo.ChatMediaVisibilityDialog;
import com.whatsapp.chatinfo.ChatMediaVisibilityOffDialog;

/* renamed from: X.3Gl  reason: invalid class name and case insensitive filesystem */
public final class C62513Gl {
    public final C235718z A00;
    public final AnonymousClass16D A01;
    public final C220412q A02;
    public final AnonymousClass11F A03;
    public final View A04;
    public final AnonymousClass155 A05;

    public final void A00() {
        DialogFragment chatMediaVisibilityDialog;
        C65073Qp A09;
        int i = 0;
        if (!this.A00.A0O() || (A09 = this.A02.A09(this.A03, false)) == null || !A09.A0j) {
            AnonymousClass11F r4 = this.A03;
            if (AnonymousClass3TD.A00(this.A01, this.A02, r4) <= 0) {
                C586230k r0 = new C586230k(this);
                C18740tg.A06(r4);
                chatMediaVisibilityDialog = new ChatMediaVisibilityDialog(r0);
                Bundle A07 = AnonymousClass001.A07();
                A07.putString("chatJid", r4.getRawString());
                chatMediaVisibilityDialog.A17(A07);
                this.A05.Btm(chatMediaVisibilityDialog);
            }
        } else {
            i = 1;
        }
        chatMediaVisibilityDialog = new ChatMediaVisibilityOffDialog();
        Bundle A072 = AnonymousClass001.A07();
        A072.putInt("reason", i);
        chatMediaVisibilityDialog.A17(A072);
        this.A05.Btm(chatMediaVisibilityDialog);
    }

    public C62513Gl(View view, AnonymousClass155 r3, C235718z r4, AnonymousClass16D r5, C220412q r6, AnonymousClass11F r7) {
        C36321k7.A1B(r4, r6, r5, r7, view);
        AnonymousClass00C.A0D(r3, 6);
        this.A00 = r4;
        this.A02 = r6;
        this.A01 = r5;
        this.A03 = r7;
        this.A04 = view;
        this.A05 = r3;
    }

    public final void A01(int i) {
        boolean z;
        C65073Qp A09;
        int i2 = R.string.f12nameremoved;
        AnonymousClass11F r2 = this.A03;
        C220412q r1 = this.A02;
        if (AnonymousClass000.A1R(AnonymousClass3TD.A00(this.A01, r1, r2)) || (this.A00.A0O() && (A09 = r1.A09(r2, false)) != null && A09.A0j)) {
            z = false;
        } else {
            z = true;
            if (i != 0) {
                z = false;
                if (2 == i) {
                    i2 = R.string.f12nameremoved;
                }
            }
        }
        View view = this.A04;
        if (view instanceof ListItemWithLeftIcon) {
            ListItemWithLeftIcon listItemWithLeftIcon = (ListItemWithLeftIcon) view;
            if (z) {
                listItemWithLeftIcon.setDescriptionVisibility(8);
                return;
            }
            listItemWithLeftIcon.setDescription((CharSequence) this.A05.getString(i2));
            listItemWithLeftIcon.setDescriptionVisibility(0);
        }
    }
}
