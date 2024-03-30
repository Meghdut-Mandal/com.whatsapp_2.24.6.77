package X;

import android.os.BaseBundle;
import android.os.Bundle;
import com.whatsapp.R;
import com.whatsapp.community.CommunityAdminDialogFragment;
import com.whatsapp.jid.Jid;

/* renamed from: X.3D3  reason: invalid class name */
public final class AnonymousClass3D3 {
    public C586430m A00;
    public final Bundle A01;

    public final CommunityAdminDialogFragment A02() {
        CommunityAdminDialogFragment communityAdminDialogFragment = new CommunityAdminDialogFragment();
        communityAdminDialogFragment.A17(this.A01);
        C586430m r0 = this.A00;
        if (r0 == null) {
            throw C36331k8.A0d("dialogOnClickListener");
        }
        C18740tg.A06(r0);
        communityAdminDialogFragment.A01 = r0;
        return communityAdminDialogFragment;
    }

    public AnonymousClass3D3(int i) {
        Bundle A07 = AnonymousClass001.A07();
        A07.putInt("dialog_id", i);
        this.A01 = A07;
    }

    public static void A00(BaseBundle baseBundle, C225314u r3, AnonymousClass3D3 r4, int i) {
        String string = r3.getString(i);
        AnonymousClass00C.A08(string);
        baseBundle.putString("positive_button", string);
        String string2 = r3.getString(R.string.f12nameremoved);
        AnonymousClass00C.A08(string2);
        baseBundle.putString("negative_button", string2);
        r3.Btl(r4.A02(), (String) null);
    }

    public static void A01(BaseBundle baseBundle, AnonymousClass3D3 r3, C61993Eh r4, Jid jid) {
        baseBundle.putString("user_jid", jid.getRawString());
        C586430m r1 = r4.A03;
        AnonymousClass00C.A0D(r1, 0);
        r3.A00 = r1;
    }
}
