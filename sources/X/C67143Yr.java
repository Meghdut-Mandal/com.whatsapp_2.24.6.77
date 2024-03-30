package X;

import android.view.View;
import com.whatsapp.backup.google.RestoreFromBackupActivity;
import com.whatsapp.registration.verifyphone.VerifyPhoneNumber;

/* renamed from: X.3Yr  reason: invalid class name and case insensitive filesystem */
public class C67143Yr implements View.OnClickListener {
    public int A00;
    public Object A01;
    public final int A02;

    public C67143Yr(RestoreFromBackupActivity restoreFromBackupActivity) {
        this.A02 = 1;
        this.A01 = restoreFromBackupActivity;
        this.A00 = 15;
    }

    public static void A00(View view, Object obj, int i, int i2) {
        view.setOnClickListener(new C67143Yr(obj, i, i2));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0086, code lost:
        if (r4 == 1) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000f, code lost:
        r3 = r4.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0156, code lost:
        if (r0.length() == 0) goto L_0x0158;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r13) {
        /*
            r12 = this;
            int r0 = r12.A02
            switch(r0) {
                case 0: goto L_0x03e8;
                case 1: goto L_0x00cb;
                case 2: goto L_0x0005;
                case 3: goto L_0x0005;
                case 4: goto L_0x0096;
                case 5: goto L_0x03dc;
                case 6: goto L_0x03d0;
                case 7: goto L_0x03b3;
                case 8: goto L_0x03a2;
                case 9: goto L_0x0396;
                case 10: goto L_0x0382;
                case 11: goto L_0x0357;
                case 12: goto L_0x0331;
                case 13: goto L_0x030a;
                case 14: goto L_0x0300;
                case 15: goto L_0x02ee;
                case 16: goto L_0x02db;
                case 17: goto L_0x02cf;
                case 18: goto L_0x02c3;
                case 19: goto L_0x02b5;
                case 20: goto L_0x025c;
                case 21: goto L_0x0244;
                case 22: goto L_0x0232;
                case 23: goto L_0x01c5;
                case 24: goto L_0x01b1;
                case 25: goto L_0x01a5;
                case 26: goto L_0x0047;
                case 27: goto L_0x019b;
                case 28: goto L_0x013a;
                case 29: goto L_0x0174;
                case 30: goto L_0x00fd;
                case 31: goto L_0x0037;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r12.A01
            com.whatsapp.backup.google.RestoreTransferSelectorActivity r0 = (com.whatsapp.backup.google.RestoreTransferSelectorActivity) r0
            int r5 = r12.A00
            X.1sf r4 = r0.A00
            if (r4 == 0) goto L_0x0036
            X.00s r3 = r4.A02
            java.lang.Object r0 = r3.A04()
            if (r0 == 0) goto L_0x0036
            java.util.List r2 = X.C07710Yz.A01(r0)
            int r0 = X.C36351kA.A06(r2, r5)
            if (r0 != 0) goto L_0x0036
            java.lang.Integer r0 = X.C36361kB.A0i()
            r2.set(r5, r0)
            int r1 = r4.A00
            java.lang.Integer r0 = X.C36381kD.A0m()
            r2.set(r1, r0)
            r4.A00 = r5
            r3.A0C(r2)
        L_0x0036:
            return
        L_0x0037:
            java.lang.Object r0 = r12.A01
            org.npci.upi.security.pinactivitycomponent.Keypad r0 = (org.npci.upi.security.pinactivitycomponent.Keypad) r0
            X.4Sc r1 = r0.A04
            if (r1 == 0) goto L_0x0036
            int r0 = r12.A00
            int r0 = r0 + 7
            r1.Azl(r13, r0)
            return
        L_0x0047:
            java.lang.Object r2 = r12.A01
            com.whatsapp.storage.StorageUsageGallerySortBottomSheet r2 = (com.whatsapp.storage.StorageUsageGallerySortBottomSheet) r2
            int r4 = r12.A00
            r2.A1b()
            X.1pO r13 = (X.C38611pO) r13
            com.whatsapp.WaImageView r0 = r13.A00
            int r0 = r0.getVisibility()
            if (r0 == 0) goto L_0x0036
            X.1pO r0 = r2.A01
            r1 = 0
            r0.setChecked(r1)
            X.1pO r0 = r2.A02
            r0.setChecked(r1)
            X.1pO r0 = r2.A03
            r0.setChecked(r1)
            r3 = 1
            r13.setChecked(r3)
            X.338 r0 = r2.A00
            if (r0 == 0) goto L_0x0036
            com.whatsapp.storage.StorageUsageGalleryActivity r0 = r0.A00
            com.whatsapp.storage.StorageUsageMediaGalleryFragment r2 = r0.A0O
            if (r2 == 0) goto L_0x0036
            int r0 = r2.A03
            if (r0 == r4) goto L_0x0036
            r2.A03 = r4
            com.whatsapp.scroller.RecyclerFastScroller r1 = r2.A0L
            if (r1 == 0) goto L_0x008c
            if (r4 == 0) goto L_0x0088
            r0 = 8
            if (r4 != r3) goto L_0x0089
        L_0x0088:
            r0 = 0
        L_0x0089:
            r1.setVisibility(r0)
        L_0x008c:
            r0 = 0
            r2.A01 = r0
            r2.A1b()
            r2.A1g(r0)
            return
        L_0x0096:
            java.lang.Object r0 = r12.A01
            X.1vc r0 = (X.C40481vc) r0
            int r4 = r12.A00
            com.whatsapp.bonsai.prompts.BonsaiPromptsViewModel r1 = r0.A00
            if (r4 < 0) goto L_0x0036
            X.1hi r3 = r1.A05
            java.lang.Object r0 = X.C36401kF.A0m(r3)
            java.util.List r0 = X.C36421kH.A0h(r0)
            int r0 = X.C36431kI.A07(r0)
            if (r4 > r0) goto L_0x0036
            X.11F r2 = r1.A00
            if (r2 == 0) goto L_0x0036
            java.util.List r0 = X.C36401kF.A0w(r3)
            java.lang.Object r0 = r0.get(r4)
            X.69W r0 = (X.AnonymousClass69W) r0
            X.1X4 r1 = r1.A02
            java.lang.String r0 = r0.A01
            r1.A0N(r2, r0)
            X.09w r0 = X.C023409w.A00
            r3.A0D(r0)
            return
        L_0x00cb:
            java.lang.Object r6 = r12.A01
            com.whatsapp.backup.google.RestoreFromBackupActivity r6 = (com.whatsapp.backup.google.RestoreFromBackupActivity) r6
            r5 = 15
            X.0wx r0 = r6.A08
            long r3 = r0.A01()
            java.util.Locale r2 = java.util.Locale.ENGLISH
            java.lang.Object[] r1 = X.AnonymousClass001.A0M()
            X.AnonymousClass000.A1J(r1, r5)
            X.C36421kH.A1P(r1, r3)
            java.lang.String r0 = "restore>RestoreFromBackupActivity/display-msgstore-download-error/%d free space:%d"
            java.lang.String r0 = java.lang.String.format(r2, r0, r1)
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0036
            X.6FS r1 = r6.A0D
            r0 = 10
            r1.A06(r0)
            com.whatsapp.backup.google.RestoreFromBackupActivity.A0K(r6)
            return
        L_0x00fd:
            java.lang.Object r2 = r12.A01
            com.whatsapp.voipcalling.VoipCallControlBottomSheetV2 r2 = (com.whatsapp.voipcalling.VoipCallControlBottomSheetV2) r2
            int r1 = r12.A00
            r0 = 10
            if (r1 >= r0) goto L_0x012c
            java.lang.String r0 = java.lang.String.valueOf(r1)
        L_0x010b:
            com.whatsapp.voipcalling.Voip.sendDTMFTone(r0)
            java.lang.StringBuilder r1 = r2.A0e
            r1.append(r0)
            android.widget.TextView r0 = r2.A0D
            r0.setText(r1)
            android.widget.TextView r1 = r2.A0D
            r0 = 0
            r1.setVisibility(r0)
            r13.playSoundEffect(r0)
            X.6X3 r0 = r2.A0L
            r0.A04()
            X.6X3 r0 = r2.A0L
            r0.A05()
            return
        L_0x012c:
            if (r1 != r0) goto L_0x0131
            java.lang.String r0 = "*"
            goto L_0x010b
        L_0x0131:
            r0 = 11
            if (r1 != r0) goto L_0x0138
            java.lang.String r0 = "#"
            goto L_0x010b
        L_0x0138:
            r0 = 0
            goto L_0x010b
        L_0x013a:
            java.lang.Object r3 = r12.A01
            com.whatsapp.twofactor.AddEmailActivity r3 = (com.whatsapp.twofactor.AddEmailActivity) r3
            int r4 = r12.A00
            X.9Pi r5 = r3.A03
            if (r5 == 0) goto L_0x016d
            java.lang.String r6 = r3.A06
            int r8 = r3.A00
            X.0v0 r0 = r3.A09
            java.lang.String r0 = r0.A0i()
            if (r0 == 0) goto L_0x0158
            int r0 = r0.length()
            r10 = 9
            if (r0 != 0) goto L_0x0159
        L_0x0158:
            r10 = 1
        L_0x0159:
            r11 = 3
            r7 = 0
            r9 = 5
            r5.A00(r6, r7, r8, r9, r10, r11)
            X.1Dv r2 = r3.A01
            int r1 = r3.A00
            java.lang.String r0 = r3.A06
            android.content.Intent r0 = X.AnonymousClass190.A17(r3, r0, r4, r1)
            r2.A06(r3, r0)
            return
        L_0x016d:
            java.lang.String r0 = "emailVerificationLogger"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0174:
            java.lang.Object r0 = r12.A01
            X.1vr r0 = (X.C40631vr) r0
            int r2 = r12.A00
            com.whatsapp.status.seeall.adapter.StatusSeeAllAdapter r0 = r0.A01
            X.4Oi r0 = r0.A04
            com.whatsapp.status.seeall.StatusSeeAllActivity r0 = (com.whatsapp.status.seeall.StatusSeeAllActivity) r0
            com.whatsapp.status.seeall.viewmodel.StatusSeeAllViewModel r1 = r0.A09
            if (r1 != 0) goto L_0x0189
            java.lang.RuntimeException r0 = X.C36331k8.A0a()
            throw r0
        L_0x0189:
            X.2pH[] r0 = X.C52342pH.values()
            java.lang.Object r0 = X.AnonymousClass02R.A08(r0, r2)
            X.2pH r0 = (X.C52342pH) r0
            if (r0 != 0) goto L_0x0197
            X.2pH r0 = X.C52342pH.ALL
        L_0x0197:
            com.whatsapp.status.seeall.viewmodel.StatusSeeAllViewModel.A02(r0, r1)
            return
        L_0x019b:
            java.lang.Object r1 = r12.A01
            com.whatsapp.support.DescribeProblemActivity r1 = (com.whatsapp.support.DescribeProblemActivity) r1
            int r0 = r12.A00
            com.whatsapp.support.DescribeProblemActivity.A0K(r1, r0)
            return
        L_0x01a5:
            java.lang.Object r0 = r12.A01
            X.1nP r0 = (X.C37911nP) r0
            int r2 = r12.A00
            X.02t r1 = r0.A01
            java.util.List r0 = r0.A00
            goto L_0x02f8
        L_0x01b1:
            java.lang.Object r0 = r12.A01
            com.whatsapp.status.playback.MessageReplyActivity r0 = (com.whatsapp.status.playback.MessageReplyActivity) r0
            int r3 = r12.A00
            X.28e r2 = r0.A0P
            boolean r0 = r0.A1I
            r1 = 2
            if (r0 == 0) goto L_0x01bf
            r1 = 5
        L_0x01bf:
            r0 = 9
            r2.A0C(r1, r3, r0)
            return
        L_0x01c5:
            java.lang.Object r0 = r12.A01
            X.1xw r0 = (X.C41891xw) r0
            int r1 = r12.A00
            int[] r8 = X.C36441kJ.A1O()
            r13.getLocationOnScreen(r8)
            X.1wA r0 = r0.A00
            com.whatsapp.settings.chat.wallpaper.SolidColorWallpaper r4 = r0.A02
            int[] r0 = r4.A01
            r10 = r0[r1]
            android.content.Intent r1 = r4.getIntent()
            java.lang.String r0 = "chat_jid"
            X.11F r9 = X.C36401kF.A0Z(r1, r0)
            android.content.Intent r0 = r4.getIntent()
            java.lang.String r7 = "is_using_global_wallpaper"
            r6 = 0
            boolean r5 = r0.getBooleanExtra(r7, r6)
            r3 = 1
            android.content.Intent r2 = X.C36431kI.A0D()
            java.lang.String r1 = r4.getPackageName()
            java.lang.String r0 = "com.whatsapp.settings.chat.wallpaper.SolidColorWallpaperPreview"
            android.content.Intent r2 = r2.setClassName(r1, r0)
            X.C36341k9.A0t(r2, r9)
            r2.putExtra(r7, r5)
            java.lang.String r0 = "scw_preview_color"
            r2.putExtra(r0, r10)
            java.lang.String r0 = "wallpaper_preview_intent_extra_animate"
            r2.putExtra(r0, r3)
            r1 = r8[r6]
            java.lang.String r0 = "wallpaper_preview_intent_extra_x"
            r2.putExtra(r0, r1)
            r1 = r8[r3]
            java.lang.String r0 = "wallpaper_preview_intent_extra_y"
            r2.putExtra(r0, r1)
            int r1 = r13.getWidth()
            java.lang.String r0 = "wallpaper_preview_intent_extra_width"
            r2.putExtra(r0, r1)
            int r1 = r13.getHeight()
            java.lang.String r0 = "wallpaper_preview_intent_extra_height"
            r2.putExtra(r0, r1)
            r4.startActivityForResult(r2, r3)
            return
        L_0x0232:
            int r2 = r12.A00
            java.lang.Object r1 = r12.A01
            com.whatsapp.search.SearchViewModel r1 = (com.whatsapp.search.SearchViewModel) r1
            r0 = 117(0x75, float:1.64E-43)
            if (r0 != r2) goto L_0x0240
            r1.A0e()
            return
        L_0x0240:
            r1.A0h(r2)
            return
        L_0x0244:
            java.lang.Object r3 = r12.A01
            com.whatsapp.registration.verifyphone.VerifyPhoneNumber r3 = (com.whatsapp.registration.verifyphone.VerifyPhoneNumber) r3
            r0 = 47
            X.AnonymousClass3SJ.A00(r3, r0)
            X.3TX r2 = r3.A0z
            java.lang.String r1 = "flash_call_retry_dialog"
            java.lang.String r0 = "verify_with_sms"
            r2.A07(r1, r0)
            int r0 = r3.A04
            com.whatsapp.registration.verifyphone.VerifyPhoneNumber.A1E(r3, r0)
            return
        L_0x025c:
            java.lang.Object r6 = r12.A01
            com.whatsapp.registration.verifyphone.VerifyPhoneNumber r6 = (com.whatsapp.registration.verifyphone.VerifyPhoneNumber) r6
            r0 = 47
            X.AnonymousClass3SJ.A00(r6, r0)
            r0 = 1
            r6.A1K = r0
            X.1Ww r2 = r6.A0r
            r1 = 8
            r0 = 0
            X.C29501Ww.A02(r2, r1, r0)
            X.3TX r2 = r6.A0z
            java.lang.String r1 = "flash_call_retry_dialog"
            java.lang.String r0 = "try_again"
            r2.A07(r1, r0)
            X.3LA r1 = r6.A16
            java.lang.String r0 = "sms"
            long r0 = r1.A02(r0)
            X.3LA r3 = r6.A16
            java.lang.String r2 = "voice"
            long r4 = r3.A02(r2)
            r2 = 0
            r7 = 1
            android.content.Intent r9 = X.C36381kD.A0B(r6)
            java.lang.String r8 = "sms_retry_time"
            android.content.Intent r1 = r9.putExtra(r8, r0)
            java.lang.String r0 = "voice_retry_time"
            android.content.Intent r1 = r1.putExtra(r0, r4)
            java.lang.String r0 = "wa_old_retry_time"
            android.content.Intent r1 = r1.putExtra(r0, r2)
            java.lang.String r0 = "has_retried_flash_call"
            android.content.Intent r1 = r1.putExtra(r0, r7)
            java.lang.String r0 = "should_request_flash_call"
            android.content.Intent r0 = r1.putExtra(r0, r7)
            r6.finish()
            r6.startActivity(r0)
            return
        L_0x02b5:
            java.lang.Object r0 = r12.A01
            X.9Oo r0 = (X.C194219Oo) r0
            int r2 = r12.A00
            X.4Uj r1 = r0.A0A
            X.11F r0 = r0.A08
            r1.BUI(r0, r2)
            return
        L_0x02c3:
            java.lang.Object r0 = r12.A01
            X.9Oo r0 = (X.C194219Oo) r0
            int r1 = r12.A00
            X.4Uj r0 = r0.A0A
            r0.Bew(r1)
            return
        L_0x02cf:
            java.lang.Object r0 = r12.A01
            X.4mf r0 = (X.C96024mf) r0
            int r1 = r12.A00
            X.4R3 r0 = r0.A0C
            r0.Bj6(r1)
            return
        L_0x02db:
            java.lang.Object r4 = r12.A01
            com.whatsapp.inappbugreporting.InAppBugReportingActivity r4 = (com.whatsapp.inappbugreporting.InAppBugReportingActivity) r4
            int r3 = r12.A00
            X.3Cf r2 = r4.A3i()
            r1 = 0
            r0 = 4
            r2.A00(r0, r1)
            com.whatsapp.inappbugreporting.InAppBugReportingActivity.A0G(r4, r3)
            return
        L_0x02ee:
            java.lang.Object r0 = r12.A01
            X.1wa r0 = (X.C41081wa) r0
            int r2 = r12.A00
            X.02t r1 = r0.A02
            java.util.List r0 = r0.A00
        L_0x02f8:
            java.lang.Object r0 = r0.get(r2)
            r1.invoke(r0)
            return
        L_0x0300:
            java.lang.Object r1 = r12.A01
            X.4ma r1 = (X.C95974ma) r1
            int r0 = r12.A00
            r1.A0L(r0)
            return
        L_0x030a:
            java.lang.Object r1 = r12.A01
            X.3fp r1 = (X.C70853fp) r1
            int r0 = r12.A00
            if (r0 == 0) goto L_0x0318
            X.3Qn r0 = r1.A03
            r0.A06()
            return
        L_0x0318:
            X.3Qn r4 = r1.A03
            X.141 r0 = r4.A00
            X.11F r3 = X.C36331k8.A0G(r0)
            X.1C6 r2 = r4.A08
            boolean r1 = r4.A01
            java.lang.Integer r0 = X.C36371kC.A0p()
            r2.A02(r3, r0, r1)
            java.lang.Runnable r0 = r4.A0A
            r0.run()
            return
        L_0x0331:
            java.lang.Object r3 = r12.A01
            X.3fp r3 = (X.C70853fp) r3
            int r2 = r12.A00
            if (r2 == 0) goto L_0x0350
            r1 = 1
            if (r2 == r1) goto L_0x034a
            r0 = 2
            if (r2 == r0) goto L_0x0343
            r3.BKD()
            return
        L_0x0343:
            X.3Qn r1 = r3.A03
            r0 = 1
            r1.A08(r0)
            return
        L_0x034a:
            X.3Qn r0 = r3.A03
            r0.A07(r1)
            return
        L_0x0350:
            X.3Qn r1 = r3.A03
            r0 = 1
            r1.A09(r0)
            return
        L_0x0357:
            java.lang.Object r3 = r12.A01
            X.3fk r3 = (X.C70803fk) r3
            int r2 = r12.A00
            X.1NG r1 = r3.A1z
            X.11F r0 = r3.A45
            boolean r0 = X.C36351kA.A1X(r1, r0)
            if (r0 == 0) goto L_0x0371
            X.155 r1 = X.C70803fk.A0B(r3)
            r0 = 603(0x25b, float:8.45E-43)
            X.AnonymousClass3SJ.A01(r1, r0)
            return
        L_0x0371:
            X.3Nh r1 = r3.A5C
            r0 = 4
            X.C64263Nh.A00(r1, r0)
            X.C70803fk.A18(r3, r2)
            X.28e r1 = r3.A2Q
            java.lang.String r0 = "payment_composer_icon"
            r1.A0D(r2, r0)
            return
        L_0x0382:
            java.lang.Object r4 = r12.A01
            X.3fk r4 = (X.C70803fk) r4
            int r3 = r12.A00
            r2 = 9
            X.3Nh r0 = r4.A5C
            r1 = 2
            X.C64263Nh.A00(r0, r1)
            X.28e r0 = r4.A2Q
            r0.A0C(r1, r3, r2)
            return
        L_0x0396:
            java.lang.Object r0 = r12.A01
            X.37x r0 = (X.C604537x) r0
            int r1 = r12.A00
            X.4Px r0 = r0.A01
            r0.BSV(r1)
            return
        L_0x03a2:
            java.lang.Object r0 = r12.A01
            X.2Gc r0 = (X.AnonymousClass2Gc) r0
            int r2 = r12.A00
            com.whatsapp.contact.picker.ContactPickerFragment r0 = r0.A05
            X.01z r1 = r0.A0k()
            r0 = 2
            com.whatsapp.ephemeral.ChangeEphemeralSettingsDialog.A03(r1, r2, r0)
            return
        L_0x03b3:
            java.lang.Object r4 = r12.A01
            com.whatsapp.chatinfo.ContactInfoActivity r4 = (com.whatsapp.chatinfo.ContactInfoActivity) r4
            int r3 = r12.A00
            X.2Sj r1 = r4.A15
            r2 = 1
            if (r1 == 0) goto L_0x03c4
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            r1.A04 = r0
        L_0x03c4:
            X.3D6 r1 = r4.A0s
            X.141 r0 = r4.A0z
            com.whatsapp.jid.UserJid r0 = X.C36351kA.A0k(r0)
            r1.A00(r4, r0, r3, r2)
            return
        L_0x03d0:
            java.lang.Object r1 = r12.A01
            com.whatsapp.calling.callgrid.view.MenuBottomSheet r1 = (com.whatsapp.calling.callgrid.view.MenuBottomSheet) r1
            int r0 = r12.A00
            r1.A00 = r0
            r1.A1c()
            return
        L_0x03dc:
            java.lang.Object r2 = r12.A01
            X.7lU r2 = (X.C160727lU) r2
            int r1 = r12.A00
            java.util.List r0 = X.AnonymousClass0D3.A0I
            r2.BTX(r1)
            return
        L_0x03e8:
            java.lang.Object r0 = r12.A01
            com.whatsapp.PagerSlidingTabStrip r0 = (com.whatsapp.PagerSlidingTabStrip) r0
            int r1 = r12.A00
            androidx.viewpager.widget.ViewPager r0 = r0.A04
            r0.setCurrentItem(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67143Yr.onClick(android.view.View):void");
    }

    public C67143Yr(Object obj, int i, int i2) {
        this.A02 = i2;
        this.A00 = i;
        this.A01 = obj;
    }

    public C67143Yr(VerifyPhoneNumber verifyPhoneNumber, int i) {
        this.A02 = i;
        this.A01 = verifyPhoneNumber;
        this.A00 = 47;
    }
}
