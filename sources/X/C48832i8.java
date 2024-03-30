package X;

import android.content.Intent;
import android.view.View;
import com.whatsapp.acceptinvitelink.AcceptInviteLinkActivity;
import com.whatsapp.jid.Jid;
import com.whatsapp.permissions.RequestPermissionsBottomSheet;

/* renamed from: X.2i8  reason: invalid class name and case insensitive filesystem */
public class C48832i8 extends C33541fX {
    public Object A00;
    public Object A01;
    public String A02;
    public final int A03;

    public C48832i8(Object obj, Object obj2, String str, int i) {
        this.A03 = i;
        this.A00 = obj;
        this.A02 = str;
        this.A01 = obj2;
    }

    public void A02(View view) {
        if (this.A03 != 0) {
            String str = this.A02;
            if (str != null) {
                AnonymousClass3TX r1 = ((RequestPermissionsBottomSheet) this.A01).A06;
                if (r1 != null) {
                    r1.A08(str, "continue");
                } else {
                    throw C36331k8.A0d("funnelLogger");
                }
            }
            RequestPermissionsBottomSheet requestPermissionsBottomSheet = (RequestPermissionsBottomSheet) this.A01;
            requestPermissionsBottomSheet.A1b();
            C19420v0 r6 = requestPermissionsBottomSheet.A04;
            if (r6 != null) {
                String[] strArr = (String[]) this.A00;
                for (String str2 : strArr) {
                    C36331k8.A0w(C19420v0.A00(r6), str2, true);
                    String[] strArr2 = AnonymousClass1P6.A09;
                    AnonymousClass00C.A09(strArr2);
                    if (AnonymousClass02R.A0F(str2, strArr2)) {
                        r6.A1x(true);
                        C36331k8.A0w(C19420v0.A00(r6), "nearby_location_new_user", true);
                    }
                }
                C03570Gk.A0C(requestPermissionsBottomSheet.A0i(), strArr, 0);
                return;
            }
            throw C36331k8.A0d("waSharedPreferences");
        }
        AcceptInviteLinkActivity acceptInviteLinkActivity = (AcceptInviteLinkActivity) this.A00;
        String str3 = this.A02;
        Intent A07 = C36361kB.A07(acceptInviteLinkActivity, (Jid) acceptInviteLinkActivity.A0N.get());
        A07.putExtra("subgroup_subject", str3);
        A07.putExtra("subgroup_request_message", (String) null);
        A07.putExtra("parent_group_jid", ((Jid) this.A01).getRawString());
        acceptInviteLinkActivity.startActivity(A07);
        acceptInviteLinkActivity.overridePendingTransition(0, 0);
        acceptInviteLinkActivity.finish();
    }
}
