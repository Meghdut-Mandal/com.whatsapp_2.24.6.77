package X;

import android.app.Activity;
import android.os.SystemClock;
import com.whatsapp.R;
import com.whatsapp.chatinfo.ListChatInfoActivity;
import com.whatsapp.settings.SettingsChatHistoryFragment;
import com.whatsapp.util.Log;

/* renamed from: X.4Xz  reason: invalid class name and case insensitive filesystem */
public class C89814Xz implements C88634Tl {
    public Object A00;
    public final int A01;

    public C89814Xz(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void BbO() {
        Activity activity;
        int i;
        switch (this.A01) {
            case 0:
                activity = (Activity) this.A00;
                i = 2;
                break;
            case 1:
                activity = ((AnonymousClass28b) this.A00).A03;
                i = 20;
                break;
            default:
                return;
        }
        AnonymousClass3SJ.A00(activity, i);
    }

    public void Bcz(boolean z) {
        boolean z2 = z;
        switch (this.A01) {
            case 0:
                Log.i("list_chat_info/onclick_leaveGroup");
                ListChatInfoActivity listChatInfoActivity = (ListChatInfoActivity) this.A00;
                C36331k8.A1F(new C49882jq(listChatInfoActivity, listChatInfoActivity.A03, listChatInfoActivity.A3t(), z), listChatInfoActivity.A04);
                return;
            case 1:
                AnonymousClass28b r2 = (AnonymousClass28b) this.A00;
                AnonymousClass3SJ.A00(r2.A03, 20);
                r2.A05.Bu2(0, R.string.f12nameremoved);
                long elapsedRealtime = SystemClock.elapsedRealtime();
                r2.A0M.Boa();
                C49682jW r1 = r2.A00;
                if (r1 != null) {
                    r1.A01 = null;
                    r1.A00 = null;
                    r1.A0D(true);
                }
                C49682jW r3 = new C49682jW(r2.A08, r2.A0Z, r2.A01, r2.A02, elapsedRealtime, false, z2);
                r2.A00 = r3;
                r2.A0d.Box(r3, new Object[0]);
                return;
            default:
                SettingsChatHistoryFragment settingsChatHistoryFragment = (SettingsChatHistoryFragment) this.A00;
                C100834vr r0 = settingsChatHistoryFragment.A00;
                if (r0 != null) {
                    r0.Bu2(R.string.f12nameremoved, R.string.f12nameremoved);
                }
                settingsChatHistoryFragment.A0C.Boy(new C80323vD(2, this, z));
                return;
        }
    }
}
