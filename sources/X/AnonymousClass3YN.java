package X;

import android.content.Intent;
import android.view.View;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.acceptinvitelink.AcceptInviteLinkActivity;
import com.whatsapp.util.Log;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.3YN  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3YN implements View.OnClickListener {
    public final /* synthetic */ AcceptInviteLinkActivity A00;
    public final /* synthetic */ AnonymousClass3B2 A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ boolean A03;

    public /* synthetic */ AnonymousClass3YN(AcceptInviteLinkActivity acceptInviteLinkActivity, AnonymousClass3B2 r2, String str, boolean z) {
        this.A00 = acceptInviteLinkActivity;
        this.A03 = z;
        this.A01 = r2;
        this.A02 = str;
    }

    public final void onClick(View view) {
        AcceptInviteLinkActivity acceptInviteLinkActivity = this.A00;
        boolean z = this.A03;
        AnonymousClass3B2 r2 = this.A01;
        String str = this.A02;
        Log.i("acceptlink/confirmation/ok");
        if (z) {
            Intent A0F = C36391kE.A0F(acceptInviteLinkActivity, C36441kJ.A0j(), r2.A05);
            AnonymousClass3M9.A01(A0F, "AcceptInviteLinkActivity");
            acceptInviteLinkActivity.A33(A0F, true);
            return;
        }
        AnonymousClass147 r4 = r2.A05;
        int i = r2.A02;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("acceptlink/sendjoin/");
        A0u.append(str);
        C36321k7.A1K(r4, " ", A0u);
        TextView A0Q = C36391kE.A0Q(acceptInviteLinkActivity, R.id.progress_text);
        boolean A032 = acceptInviteLinkActivity.A0I.A03(i);
        int i2 = R.string.f12nameremoved;
        if (A032) {
            i2 = R.string.f12nameremoved;
        }
        A0Q.setText(i2);
        acceptInviteLinkActivity.findViewById(R.id.progress).setVisibility(0);
        acceptInviteLinkActivity.findViewById(R.id.group_info).setVisibility(4);
        C36341k9.A13(acceptInviteLinkActivity, R.id.error, 4);
        AtomicReference atomicReference = acceptInviteLinkActivity.A0N;
        atomicReference.set(r4);
        C36391kE.A1Q(new C49632jR(acceptInviteLinkActivity, acceptInviteLinkActivity.A07, acceptInviteLinkActivity.A0F, str, i), acceptInviteLinkActivity.A04);
        if (acceptInviteLinkActivity.getIntent().getBooleanExtra("is_invite_from_referrer", false)) {
            C44542Nx r22 = new C44542Nx();
            AnonymousClass147 r1 = (AnonymousClass147) atomicReference.get();
            if (r1 != null) {
                r22.A00 = Integer.valueOf(acceptInviteLinkActivity.A0I.A00(r1));
            }
            acceptInviteLinkActivity.A0C.Bly(r22);
        }
    }
}
