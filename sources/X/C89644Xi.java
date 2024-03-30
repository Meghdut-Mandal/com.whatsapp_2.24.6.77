package X;

import android.os.Process;
import com.whatsapp.avatar.home.AvatarHomeActivity;
import com.whatsapp.avatar.home.AvatarHomeViewModel;
import com.whatsapp.community.NewCommunityActivity;
import com.whatsapp.community.deactivate.DeactivateCommunityDisclaimerActivity;
import com.whatsapp.settings.SettingsChat;
import com.whatsapp.util.Log;

/* renamed from: X.4Xi  reason: invalid class name and case insensitive filesystem */
public class C89644Xi implements C22908AyK {
    public Object A00;
    public final int A01;

    public C89644Xi(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void BTc() {
        C47072cl r1;
        boolean z;
        switch (this.A01) {
            case 0:
                AvatarHomeActivity avatarHomeActivity = (AvatarHomeActivity) this.A00;
                AnonymousClass00C.A0D(avatarHomeActivity, 0);
                AvatarHomeViewModel avatarHomeViewModel = (AvatarHomeViewModel) avatarHomeActivity.A0L.getValue();
                Log.i("onConfirmDeleteAvatarClicked");
                avatarHomeViewModel.A00.A0D(new AnonymousClass295(AnonymousClass28y.A00, true, false, false));
                avatarHomeViewModel.A04.A03((Boolean) null, 25);
                AnonymousClass39Q r4 = avatarHomeViewModel.A03;
                C76433or r3 = new C76433or(avatarHomeViewModel);
                C36331k8.A0w(C36351kA.A0A(((C24261Bt) r4.A03.get()).A01), "pref_avatar_user_remote_deletion", true);
                r4.A01.Bp1(new C1502374m(r4, r3, 12));
                return;
            case 1:
                NewCommunityActivity.A07((NewCommunityActivity) this.A00);
                return;
            case 2:
                DeactivateCommunityDisclaimerActivity.A01((DeactivateCommunityDisclaimerActivity) this.A00);
                return;
            case 3:
                C36331k8.A0w(C19420v0.A00(((C61763Di) this.A00).A00), "android.permission.SCHEDULE_EXACT_ALARM", true);
                return;
            case 4:
                C36411kG.A1N(this.A00);
                return;
            case 5:
                r1 = (C47072cl) this.A00;
                z = true;
                break;
            case 6:
                r1 = (C47072cl) this.A00;
                z = false;
                break;
            case 7:
                AnonymousClass3NA r2 = (AnonymousClass3NA) this.A00;
                AnonymousClass00C.A0D(r2, 0);
                r2.A00.startActivity(C36331k8.A04("https://faq.whatsapp.com/5064231857013976"));
                return;
            default:
                SettingsChat settingsChat = (SettingsChat) this.A00;
                settingsChat.A02.toggle();
                C19900wh r12 = settingsChat.A0A;
                r12.A01.edit().putBoolean("otp_split_mode_user_choice", settingsChat.A02.isChecked()).commit();
                settingsChat.finishAffinity();
                Process.killProcess(Process.myPid());
                return;
        }
        r1.A3k(z);
    }
}
