package X;

import android.content.DialogInterface;
import android.net.Uri;
import android.os.SystemClock;
import com.whatsapp.DisplayExceptionDialogFactory$LoginFailedDialogFragment;
import com.whatsapp.R;
import com.whatsapp.conversation.conversationrow.SecurityNotificationDialogFragment;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.settings.SettingsChatHistoryFragment;
import com.whatsapp.settings.SettingsCompanionLogoutDialog;
import com.whatsapp.stickers.StarOrRemoveFromRecentsStickerDialogFragment;
import com.whatsapp.util.Log;
import java.util.Collections;

/* renamed from: X.4XS  reason: invalid class name */
public class AnonymousClass4XS implements DialogInterface.OnClickListener {
    public Object A00;
    public boolean A01;
    public final int A02;

    public AnonymousClass4XS(int i, Object obj, boolean z) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = z;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        String str;
        AnonymousClass01I r4;
        switch (this.A02) {
            case 0:
                DisplayExceptionDialogFactory$LoginFailedDialogFragment displayExceptionDialogFactory$LoginFailedDialogFragment = (DisplayExceptionDialogFactory$LoginFailedDialogFragment) this.A00;
                boolean z = this.A01;
                PhoneUserJid A0n = C36441kJ.A0n(displayExceptionDialogFactory$LoginFailedDialogFragment.A03);
                if (A0n != null) {
                    C19420v0 r0 = displayExceptionDialogFactory$LoginFailedDialogFragment.A08;
                    C36341k9.A0x(C19420v0.A00(r0), "saved_user_before_logout", A0n.user);
                }
                r4 = displayExceptionDialogFactory$LoginFailedDialogFragment.A0i();
                String string = C36341k9.A0E(displayExceptionDialogFactory$LoginFailedDialogFragment.A08).getString("main_button_url", (String) null);
                if (z && !AnonymousClass6RR.A00(string) && string != null) {
                    displayExceptionDialogFactory$LoginFailedDialogFragment.A02.Bp7(r4, Uri.parse(string), (AnonymousClass3T1) null);
                    break;
                } else {
                    DisplayExceptionDialogFactory$LoginFailedDialogFragment.A03(r4, displayExceptionDialogFactory$LoginFailedDialogFragment);
                    break;
                }
            case 1:
                DisplayExceptionDialogFactory$LoginFailedDialogFragment displayExceptionDialogFactory$LoginFailedDialogFragment2 = (DisplayExceptionDialogFactory$LoginFailedDialogFragment) this.A00;
                boolean z2 = this.A01;
                r4 = displayExceptionDialogFactory$LoginFailedDialogFragment2.A0i();
                C32691e2 r2 = displayExceptionDialogFactory$LoginFailedDialogFragment2.A02;
                String A0t = C36371kC.A0t(C36341k9.A0E(displayExceptionDialogFactory$LoginFailedDialogFragment2.A08), "secondary_button_url");
                if (!z2 || AnonymousClass6RR.A00(A0t)) {
                    A0t = "https://faq.whatsapp.com";
                }
                C36331k8.A0t(r4, r2, A0t);
                break;
            case 2:
                SecurityNotificationDialogFragment securityNotificationDialogFragment = (SecurityNotificationDialogFragment) this.A00;
                boolean z3 = this.A01;
                C20380xT r1 = securityNotificationDialogFragment.A05;
                if (z3) {
                    str = "seeing-your-security-code-could-not-be-verified";
                } else {
                    str = "26000361";
                }
                securityNotificationDialogFragment.A00.A06(securityNotificationDialogFragment.A1D(), C36391kE.A0G(r1.A03(str)));
                return;
            case 3:
                AnonymousClass02E r12 = (AnonymousClass02E) this.A00;
                if (this.A01) {
                    C36341k9.A15(r12);
                    return;
                }
                return;
            case 4:
                SettingsChatHistoryFragment settingsChatHistoryFragment = (SettingsChatHistoryFragment) this.A00;
                boolean z4 = this.A01;
                C100834vr r13 = settingsChatHistoryFragment.A00;
                if (r13 != null) {
                    AnonymousClass3SJ.A00(r13, 5);
                    C100834vr r02 = settingsChatHistoryFragment.A00;
                    if (r02 != null) {
                        r02.Bu2(R.string.f12nameremoved, R.string.f12nameremoved);
                    }
                    settingsChatHistoryFragment.A0C.Boy(new C80323vD(1, settingsChatHistoryFragment, z4));
                    return;
                }
                return;
            case 5:
                SettingsCompanionLogoutDialog settingsCompanionLogoutDialog = (SettingsCompanionLogoutDialog) this.A00;
                if (this.A01) {
                    Log.i("SettingsCompanionLogoutDialog/onCreateDialog/remove account");
                    settingsCompanionLogoutDialog.A00.A06(settingsCompanionLogoutDialog.A0a(), AnonymousClass190.A1G(settingsCompanionLogoutDialog.A0a(), (String) null, settingsCompanionLogoutDialog.A06.A01(), settingsCompanionLogoutDialog.A05.A0I(), 18, SystemClock.elapsedRealtime()));
                    return;
                }
                settingsCompanionLogoutDialog.A07.Bp1(new C81163wZ((Object) settingsCompanionLogoutDialog, 24));
                settingsCompanionLogoutDialog.A01.A05(0, R.string.f12nameremoved);
                return;
            default:
                StarOrRemoveFromRecentsStickerDialogFragment starOrRemoveFromRecentsStickerDialogFragment = (StarOrRemoveFromRecentsStickerDialogFragment) this.A00;
                boolean z5 = this.A01;
                if (i == -3) {
                    C19770wU r3 = starOrRemoveFromRecentsStickerDialogFragment.A03;
                    StringBuilder A0u = AnonymousClass000.A0u();
                    A0u.append("remove_recent_sticker");
                    r3.Boz(new C80323vD(5, starOrRemoveFromRecentsStickerDialogFragment, z5), AnonymousClass000.A0q(starOrRemoveFromRecentsStickerDialogFragment.A01.A0E, A0u));
                    return;
                } else if (i == -1) {
                    C135066c4 r22 = starOrRemoveFromRecentsStickerDialogFragment.A01;
                    r22.A05 = C36371kC.A0n();
                    starOrRemoveFromRecentsStickerDialogFragment.A02.A0D(Collections.singleton(r22));
                    return;
                } else {
                    return;
                }
        }
        AnonymousClass0XN.A00(r4);
    }
}
