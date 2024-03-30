package X;

import android.view.View;
import com.whatsapp.stickers.thirdparty.AddThirdPartyStickerPackActivity;

/* renamed from: X.3Yn  reason: invalid class name and case insensitive filesystem */
public class C67103Yn implements View.OnClickListener {
    public Object A00;
    public final int A01;

    public C67103Yn(AddThirdPartyStickerPackActivity.AddStickerPackDialogFragment addStickerPackDialogFragment, int i) {
        this.A01 = i;
        switch (i) {
            case 25:
            case 26:
                this.A00 = addStickerPackDialogFragment;
                return;
            default:
                this.A00 = addStickerPackDialogFragment;
                return;
        }
    }

    public static void A00(View view, Object obj, int i) {
        view.setOnClickListener(new C67103Yn(obj, i));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:159:0x03c1, code lost:
        r0.A1b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x03c4, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x040f, code lost:
        r2 = X.AnonymousClass3OM.A01(new X.AnonymousClass3OM(r4.A0a()), r3);
        r1 = r4.A07;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x041e, code lost:
        if (r1 == null) goto L_0x042d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x0420, code lost:
        r1.A02(r2, com.whatsapp.status.audienceselector.sharesheet.StatusAudienceSelectorShareSheetFragment.A03(r4, r3));
        r4.A09.A02(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x042c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x0433, code lost:
        throw X.C36331k8.A0d("statusAudienceRepository");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x04b7, code lost:
        r2.A0A = com.whatsapp.status.audienceselector.StatusPrivacyActivity.A01(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x04bd, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x04cb, code lost:
        r0.invoke();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x04ce, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:0x04de, code lost:
        com.whatsapp.status.StatusesFragment.A0E(r2, r2.A0u.A02.A02(), r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x04e9, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r16) {
        /*
            r15 = this;
            int r0 = r15.A01
            switch(r0) {
                case 0: goto L_0x04d7;
                case 1: goto L_0x04cf;
                case 2: goto L_0x04c5;
                case 3: goto L_0x04be;
                case 4: goto L_0x04ea;
                case 5: goto L_0x04a0;
                case 6: goto L_0x0482;
                case 7: goto L_0x046b;
                case 8: goto L_0x0450;
                case 9: goto L_0x0434;
                case 10: goto L_0x0120;
                case 11: goto L_0x040a;
                case 12: goto L_0x0404;
                case 13: goto L_0x03fb;
                case 14: goto L_0x03f0;
                case 15: goto L_0x03dc;
                case 16: goto L_0x03c5;
                case 17: goto L_0x03ba;
                case 18: goto L_0x0110;
                case 19: goto L_0x0395;
                case 20: goto L_0x038f;
                case 21: goto L_0x0369;
                case 22: goto L_0x00ee;
                case 23: goto L_0x0361;
                case 24: goto L_0x038f;
                case 25: goto L_0x0359;
                case 26: goto L_0x033d;
                case 27: goto L_0x0308;
                case 28: goto L_0x0300;
                case 29: goto L_0x02f4;
                case 30: goto L_0x02ec;
                case 31: goto L_0x00bb;
                case 32: goto L_0x02e2;
                case 33: goto L_0x0005;
                case 34: goto L_0x0005;
                case 35: goto L_0x02b4;
                case 36: goto L_0x038f;
                case 37: goto L_0x0239;
                case 38: goto L_0x0208;
                case 39: goto L_0x01dc;
                case 40: goto L_0x01d4;
                case 41: goto L_0x01aa;
                case 42: goto L_0x0162;
                case 43: goto L_0x0159;
                case 44: goto L_0x0147;
                case 45: goto L_0x013f;
                case 46: goto L_0x0079;
                case 47: goto L_0x0055;
                case 48: goto L_0x000b;
                case 49: goto L_0x0139;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r15.A00
            X.C36411kG.A1O(r0)
        L_0x000a:
            return
        L_0x000b:
            java.lang.Object r2 = r15.A00
            com.whatsapp.textstatuscomposer.voice.VoiceRecordingView r2 = (com.whatsapp.textstatuscomposer.voice.VoiceRecordingView) r2
            com.whatsapp.WaImageButton r1 = r2.A05
            X.005 r0 = r2.getSystemServicesLazy()
            java.lang.Object r0 = r0.get()
            X.0yb r0 = (X.C21060yb) r0
            X.AnonymousClass3T3.A01(r1, r0)
            X.7d8 r1 = r2.A0B
            if (r1 == 0) goto L_0x000a
            X.6zX r1 = (X.C148856zX) r1
            X.00s r0 = r1.A08
            java.lang.Object r0 = r0.A04()
            if (r0 == 0) goto L_0x04f1
            X.5zw r0 = (X.C125455zw) r0
            r0.A00()
            X.1Xt r0 = r1.A0F
            X.1Xw r2 = r0.A0A
            X.1Xc r0 = r2.A04
            boolean r0 = r0.A00()
            if (r0 == 0) goto L_0x000a
            X.2SV r1 = X.C29761Xw.A00(r2)
            r0 = 31
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A03 = r0
            java.lang.Integer r0 = X.C36381kD.A0n()
            r1.A01 = r0
            X.0yW r0 = r2.A02
            r0.Blw(r1)
            return
        L_0x0055:
            java.lang.Object r2 = r15.A00
            com.whatsapp.textstatuscomposer.voice.VoiceRecordingView r2 = (com.whatsapp.textstatuscomposer.voice.VoiceRecordingView) r2
            com.whatsapp.WaImageButton r1 = r2.A05
            X.005 r0 = r2.getSystemServicesLazy()
            java.lang.Object r0 = r0.get()
            X.0yb r0 = (X.C21060yb) r0
            X.AnonymousClass3T3.A02(r1, r0)
            X.7d8 r1 = r2.A0B
            if (r1 == 0) goto L_0x000a
            X.6zX r1 = (X.C148856zX) r1
            X.6zV r0 = r1.A00
            if (r0 == 0) goto L_0x0075
            r0.A04()
        L_0x0075:
            X.C148856zX.A01(r1)
            return
        L_0x0079:
            java.lang.Object r0 = r15.A00
            com.whatsapp.textstatuscomposer.bottombar.CreationModeBottomBar r0 = (com.whatsapp.textstatuscomposer.bottombar.CreationModeBottomBar) r0
            X.7d6 r2 = r0.A09
            if (r2 == 0) goto L_0x000a
            X.6vw r2 = (X.C146646vw) r2
            X.65z r0 = r2.A06
            X.5Sr r0 = r0.A00
            int r1 = r0.ordinal()
            r0 = 2
            if (r1 == r0) goto L_0x00a6
            r0 = 3
            if (r1 != r0) goto L_0x000a
            X.7ka r4 = r2.A07
            if (r4 == 0) goto L_0x000a
            com.whatsapp.textstatuscomposer.TextStatusComposerActivity r4 = (com.whatsapp.textstatuscomposer.TextStatusComposerActivity) r4
            X.1Sf r0 = r4.A0c
            boolean r0 = r0.A00()
            if (r0 != 0) goto L_0x04f6
            com.whatsapp.textstatuscomposer.TextStatusComposerActivity.A0O(r4)
            com.whatsapp.textstatuscomposer.TextStatusComposerActivity.A0Q(r4)
            return
        L_0x00a6:
            X.7ka r4 = r2.A07
            if (r4 == 0) goto L_0x000a
            com.whatsapp.textstatuscomposer.TextStatusComposerActivity r4 = (com.whatsapp.textstatuscomposer.TextStatusComposerActivity) r4
            X.1Sf r0 = r4.A0c
            boolean r0 = r0.A00()
            if (r0 != 0) goto L_0x04f6
            com.whatsapp.textstatuscomposer.TextStatusComposerActivity.A0O(r4)
            com.whatsapp.textstatuscomposer.TextStatusComposerActivity.A0M(r4)
            return
        L_0x00bb:
            java.lang.Object r3 = r15.A00
            com.whatsapp.storage.StorageUsageGalleryActivity r3 = (com.whatsapp.storage.StorageUsageGalleryActivity) r3
            com.whatsapp.storage.StorageUsageMediaGalleryFragment r0 = r3.A0O
            if (r0 == 0) goto L_0x000a
            X.339 r2 = new X.339
            r2.<init>()
            int r0 = r0.A03
            r2.A00 = r0
            X.0yf r1 = r3.A06
            X.0yi r0 = X.C21100yf.A0u
            boolean r0 = r1.A09(r0)
            r1 = 1
            if (r0 == 0) goto L_0x00ec
            int r0 = r3.A01
            if (r0 != r1) goto L_0x00ec
        L_0x00db:
            int r0 = r2.A00
            com.whatsapp.storage.StorageUsageGallerySortBottomSheet r1 = com.whatsapp.storage.StorageUsageGallerySortBottomSheet.A03(r0, r1)
            X.338 r0 = new X.338
            r0.<init>(r3)
            r1.A00 = r0
            r3.Btm(r1)
            return
        L_0x00ec:
            r1 = 0
            goto L_0x00db
        L_0x00ee:
            java.lang.Object r0 = r15.A00
            X.01I r3 = X.C36441kJ.A0X(r0)
            boolean r0 = r3 instanceof com.whatsapp.stickers.store.StickerStoreActivity
            if (r0 == 0) goto L_0x000a
            com.whatsapp.stickers.store.StickerStoreActivity r3 = (com.whatsapp.stickers.store.StickerStoreActivity) r3
            com.whatsapp.stickers.store.StickerStoreFeaturedTabFragment r1 = r3.A05
            X.1s8 r0 = r3.A04
            if (r0 == 0) goto L_0x000a
            java.util.List r0 = r0.A00
            int r2 = r0.indexOf(r1)
            r0 = -1
            if (r2 == r0) goto L_0x000a
            androidx.viewpager.widget.ViewPager r1 = r3.A00
            r0 = 1
            r1.A0J(r2, r0)
            return
        L_0x0110:
            java.lang.Object r0 = r15.A00
            X.5Kv r0 = (X.C106685Kv) r0
            X.6Es r1 = r0.A09
            boolean r0 = r1 instanceof X.AnonymousClass5H9
            if (r0 == 0) goto L_0x000a
            X.5H9 r1 = (X.AnonymousClass5H9) r1
            r1.A08()
            return
        L_0x0120:
            java.lang.Object r2 = r15.A00
            com.whatsapp.status.audienceselector.sharesheet.StatusAudienceSelectorShareSheetFragment r2 = (com.whatsapp.status.audienceselector.sharesheet.StatusAudienceSelectorShareSheetFragment) r2
            java.lang.ref.WeakReference r0 = r2.A0A
            java.lang.Object r1 = r0.get()
            X.4UW r1 = (X.AnonymousClass4UW) r1
            if (r1 == 0) goto L_0x000a
            X.3XT r0 = r2.A06
            if (r0 != 0) goto L_0x0513
            java.lang.String r0 = "statusDistributionInfo"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0139:
            java.lang.Object r0 = r15.A00
            androidx.fragment.app.DialogFragment r0 = (androidx.fragment.app.DialogFragment) r0
            goto L_0x03c1
        L_0x013f:
            java.lang.Object r0 = r15.A00
            com.whatsapp.textstatuscomposer.TextStatusComposerActivity r0 = (com.whatsapp.textstatuscomposer.TextStatusComposerActivity) r0
            com.whatsapp.textstatuscomposer.TextStatusComposerActivity.A0j(r0)
            return
        L_0x0147:
            java.lang.Object r0 = r15.A00
            com.whatsapp.textstatuscomposer.TextStatusComposerActivity r0 = (com.whatsapp.textstatuscomposer.TextStatusComposerActivity) r0
            X.2Mc r2 = r0.A0Q
            java.lang.Integer r1 = X.C36371kC.A0p()
            java.lang.Integer r0 = X.C36371kC.A0o()
            r2.A0F(r1, r0)
            return
        L_0x0159:
            java.lang.Object r1 = r15.A00
            com.whatsapp.textstatuscomposer.TextStatusComposerActivity r1 = (com.whatsapp.textstatuscomposer.TextStatusComposerActivity) r1
            r0 = 0
            com.whatsapp.textstatuscomposer.TextStatusComposerActivity.A0m(r1, r0)
            return
        L_0x0162:
            java.lang.Object r4 = r15.A00
            com.whatsapp.textstatuscomposer.TextStatusComposerActivity r4 = (com.whatsapp.textstatuscomposer.TextStatusComposerActivity) r4
            int r2 = r4.A02
            int[] r6 = X.AnonymousClass3UN.A02
            r5 = 8
            r1 = 0
        L_0x016d:
            r0 = r6[r1]
            if (r0 == r2) goto L_0x0176
            int r1 = r1 + 1
            if (r1 < r5) goto L_0x016d
            r1 = -1
        L_0x0176:
            int r0 = r1 + 1
            int r0 = r0 % r5
            r0 = r6[r0]
            r4.A02 = r0
            android.graphics.Typeface r1 = X.AnonymousClass3UN.A04(r4, r0)
            android.widget.TextView r0 = r4.A09
            r0.setTypeface(r1)
            com.whatsapp.status.widget.StatusEditText r0 = r4.A0f
            r0.setTypeface(r1)
            int r0 = r4.A02
            com.whatsapp.textstatuscomposer.TextStatusComposerActivity.A0k(r4, r0)
            int[] r3 = com.whatsapp.textstatuscomposer.TextStatusComposerActivity.A1A
            int r2 = r4.A02
            r1 = 0
        L_0x0195:
            r0 = r6[r1]
            if (r0 == r2) goto L_0x019e
            int r1 = r1 + 1
            if (r1 < r5) goto L_0x0195
            r1 = -1
        L_0x019e:
            r0 = r3[r1]
            java.lang.String r1 = r4.getString(r0)
            X.0yb r0 = r4.A08
            X.C33521fV.A00(r4, r0, r1)
            return
        L_0x01aa:
            java.lang.Object r6 = r15.A00
            com.whatsapp.textstatuscomposer.TextStatusComposerActivity r6 = (com.whatsapp.textstatuscomposer.TextStatusComposerActivity) r6
            com.whatsapp.textstatuscomposer.TextStatusComposerActivity.A0L(r6)
            int[] r5 = com.whatsapp.textstatuscomposer.TextStatusComposerActivity.A19
            int r4 = r6.A01
            int[] r3 = X.AnonymousClass3UN.A01
            r2 = 21
            r1 = 0
        L_0x01ba:
            r0 = r3[r1]
            if (r0 == r4) goto L_0x01c3
            int r1 = r1 + 1
            if (r1 < r2) goto L_0x01ba
            r1 = -1
        L_0x01c3:
            r0 = r5[r1]
            java.lang.String r1 = r6.getString(r0)
            X.0yb r0 = r6.A08
            X.C33521fV.A00(r6, r0, r1)
            X.1Xt r0 = r6.A0e
            r0.A02()
            return
        L_0x01d4:
            java.lang.Object r0 = r15.A00
            com.whatsapp.textstatuscomposer.TextStatusComposerActivity r0 = (com.whatsapp.textstatuscomposer.TextStatusComposerActivity) r0
            com.whatsapp.textstatuscomposer.TextStatusComposerActivity.A0I(r0)
            return
        L_0x01dc:
            java.lang.Object r4 = r15.A00
            com.whatsapp.textstatus.AddTextStatusActivity r4 = (com.whatsapp.textstatus.AddTextStatusActivity) r4
            r3 = 0
            com.whatsapp.WaEditText r0 = r4.A01
            r2 = 0
            if (r0 != 0) goto L_0x01ed
            java.lang.String r0 = "textEntry"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x01ed:
            X.C36391kE.A1K(r0)
            r1 = 2131231746(0x7f080402, float:1.8079582E38)
            r0 = 2131101055(0x7f06057f, float:1.7814509E38)
            android.graphics.drawable.Drawable r0 = X.AnonymousClass3UF.A01(r4, r1, r0)
            com.whatsapp.textstatus.AddTextStatusActivity.A01(r0, r4)
            r4.A0E = r2
            com.whatsapp.textstatus.AddTextStatusActivity.A07(r4)
            r0 = r16
            r0.setEnabled(r3)
            return
        L_0x0208:
            java.lang.Object r6 = r15.A00
            com.whatsapp.textstatus.AddTextStatusActivity r6 = (com.whatsapp.textstatus.AddTextStatusActivity) r6
            java.lang.String[] r5 = r6.A0G
            if (r5 != 0) goto L_0x0217
            java.lang.String r0 = "durationOptions"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0217:
            r4 = 1
            r1 = 2131888952(0x7f120b38, float:1.9412554E38)
            r3 = 2131893766(0x7f121e06, float:1.9422318E38)
            r0 = 0
            com.whatsapp.SingleSelectionDialogFragment r2 = new com.whatsapp.SingleSelectionDialogFragment
            r2.<init>()
            android.os.Bundle r1 = com.whatsapp.SingleSelectionDialogFragment.A05(r5, r4, r0, r1)
            java.lang.String r0 = "dialogPositiveButtonTextResId"
            r1.putInt(r0, r3)
            r2.A17(r1)
            java.lang.String r0 = "durationSelection"
            r6.Btl(r2, r0)
            com.whatsapp.textstatus.AddTextStatusActivity.A07(r6)
            return
        L_0x0239:
            java.lang.Object r10 = r15.A00
            com.whatsapp.textstatus.AddTextStatusActivity r10 = (com.whatsapp.textstatus.AddTextStatusActivity) r10
            r12 = 0
            com.whatsapp.WaEditText r0 = r10.A01
            if (r0 != 0) goto L_0x0249
            java.lang.String r0 = "textEntry"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0249:
            java.lang.String r6 = X.C36421kH.A0Z(r0)
            boolean r0 = X.AnonymousClass098.A06(r6)
            r0 = r0 ^ 1
            r2 = 0
            if (r0 != 0) goto L_0x026c
            java.lang.String r0 = r10.A0E
            if (r0 != 0) goto L_0x026c
            r13 = 0
        L_0x025d:
            X.0wU r0 = r10.A04
            X.3vH r9 = new X.3vH
            r11 = r6
            r9.<init>(r10, r11, r12, r13)
            r0.Bp1(r9)
            r10.finish()
            return
        L_0x026c:
            long[] r1 = X.C56492wN.A00
            int r0 = r10.A00
            r13 = r1[r0]
            int r0 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x025d
            java.util.List r2 = r10.A0M
            boolean r0 = r2 instanceof java.util.Collection
            if (r0 == 0) goto L_0x0291
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x0291
        L_0x0282:
            java.lang.String r9 = r10.A0E
            r4 = 0
            X.3Jg r3 = new X.3Jg
            r7 = 0
            r3.<init>(r4, r6, r7, r9)
            r2.add(r12, r3)
            goto L_0x025d
        L_0x0291:
            java.util.Iterator r3 = r2.iterator()
        L_0x0295:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0282
            java.lang.Object r1 = r3.next()
            X.3Jg r1 = (X.C63233Jg) r1
            java.lang.String r0 = r1.A03
            boolean r0 = X.AnonymousClass00C.A0J(r0, r6)
            if (r0 == 0) goto L_0x0295
            java.lang.String r1 = r1.A02
            java.lang.String r0 = r10.A0E
            boolean r0 = X.AnonymousClass00C.A0J(r1, r0)
            if (r0 == 0) goto L_0x0295
            goto L_0x025d
        L_0x02b4:
            java.lang.Object r3 = r15.A00
            com.whatsapp.systemstatus.SystemStatusActivity r3 = (com.whatsapp.systemstatus.SystemStatusActivity) r3
            X.3DY r2 = r3.A01
            X.1CF r0 = r3.A02
            boolean r11 = r0.A00()
            java.lang.String r7 = r3.A03
            java.lang.String r8 = r3.A04
            int r0 = r3.A00
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)
            android.content.Intent r1 = r3.getIntent()
            java.lang.String r0 = "com.whatsapp.SystemStatusActivity.describeProblemBundle"
            android.os.Bundle r4 = r1.getBundleExtra(r0)
            r5 = 0
            r10 = r5
            r9 = r5
            android.content.Intent r0 = r2.A01(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r3.startActivity(r0)
            r3.finish()
            return
        L_0x02e2:
            java.lang.Object r0 = r15.A00
            com.whatsapp.support.DescribeProblemActivity r0 = (com.whatsapp.support.DescribeProblemActivity) r0
            androidx.appcompat.widget.AppCompatCheckBox r0 = r0.A03
            X.C36421kH.A16(r0)
            return
        L_0x02ec:
            java.lang.Object r0 = r15.A00
            com.whatsapp.storage.StorageUsageGalleryActivity r0 = (com.whatsapp.storage.StorageUsageGalleryActivity) r0
            r0.onBackPressed()
            return
        L_0x02f4:
            java.lang.Object r1 = r15.A00
            X.4Ok r1 = (X.C87344Ok) r1
            java.util.List r0 = X.AnonymousClass0D3.A0I
            com.whatsapp.storage.StorageUsageActivity r1 = (com.whatsapp.storage.StorageUsageActivity) r1
            r1.onSearchRequested()
            return
        L_0x0300:
            java.lang.Object r0 = r15.A00
            com.whatsapp.storage.StorageUsageActivity r0 = (com.whatsapp.storage.StorageUsageActivity) r0
            r0.onBackPressed()
            return
        L_0x0308:
            java.lang.Object r6 = r15.A00
            com.whatsapp.stickers.thirdparty.AddThirdPartyStickerPackActivity$AddStickerPackDialogFragment r6 = (com.whatsapp.stickers.thirdparty.AddThirdPartyStickerPackActivity.AddStickerPackDialogFragment) r6
            r4 = 2131894642(0x7f122172, float:1.9424095E38)
            java.lang.Object[] r3 = X.AnonymousClass001.A0M()
            java.lang.String r0 = r6.A05
            r2 = 0
            r3[r2] = r0
            r0 = 2131896687(0x7f12296f, float:1.9428242E38)
            java.lang.String r1 = r6.A0n(r0)
            r0 = 1
            java.lang.String r1 = X.C36401kF.A0q(r6, r1, r3, r0, r4)
            r0 = 8
            com.whatsapp.stickers.thirdparty.AddThirdPartyStickerPackActivity.AddStickerPackDialogFragment.A03(r6, r1, r2, r0, r0)
            X.38n r0 = r6.A01
            java.lang.String r5 = r6.A02
            java.lang.String r4 = r6.A03
            X.1AP r3 = r0.A02
            X.0wU r2 = r3.A0N
            r1 = 2
            X.1ix r0 = new X.1ix
            r0.<init>(r3, r5, r4, r1)
            r2.Boy(r0)
            return
        L_0x033d:
            java.lang.Object r4 = r15.A00
            androidx.fragment.app.DialogFragment r4 = (androidx.fragment.app.DialogFragment) r4
            X.01I r3 = r4.A0h()
            if (r3 == 0) goto L_0x0355
            android.content.Intent r2 = X.C36431kI.A0D()
            r1 = 1
            java.lang.String r0 = "user_cancelled"
            r2.putExtra(r0, r1)
            r0 = 0
            r3.setResult(r0, r2)
        L_0x0355:
            r4.A1c()
            return
        L_0x0359:
            java.lang.Object r0 = r15.A00
            androidx.fragment.app.DialogFragment r0 = (androidx.fragment.app.DialogFragment) r0
            r0.A1c()
            return
        L_0x0361:
            java.lang.Object r0 = r15.A00
            X.4mr r0 = (X.C96144mr) r0
            r0.A0L()
            return
        L_0x0369:
            java.lang.Object r3 = r15.A00
            com.whatsapp.stickers.store.StickerStoreFeaturedTabFragment r3 = (com.whatsapp.stickers.store.StickerStoreFeaturedTabFragment) r3
            android.content.Intent r2 = X.C36431kI.A0C()
            java.lang.String r0 = "http://play.google.com/store/search?q=WASticker&c=apps"
            X.C36421kH.A0n(r2, r0)
            java.lang.String r0 = "com.android.vending"
            r2.setPackage(r0)
            X.1Dv r1 = r3.A02
            android.content.Context r0 = r3.A1D()
            r1.A06(r0, r2)
            X.2N1 r1 = new X.2N1
            r1.<init>()
            X.0yW r0 = r3.A03
            r0.Bly(r1)
            return
        L_0x038f:
            java.lang.Object r0 = r15.A00
            X.C36411kG.A1N(r0)
            return
        L_0x0395:
            java.lang.Object r4 = r15.A00
            X.5Ku r4 = (X.C106675Ku) r4
            X.68B r0 = r4.A04
            java.lang.String r3 = r0.A0H
            android.os.Bundle r2 = X.AnonymousClass001.A07()
            com.whatsapp.stickers.picker.pages.ThirdPartyPackPage$StickerBlockedDialogFragment r1 = new com.whatsapp.stickers.picker.pages.ThirdPartyPackPage$StickerBlockedDialogFragment
            r1.<init>()
            java.lang.String r0 = "sticker_pack_name"
            r2.putString(r0, r3)
            r1.A17(r2)
            android.content.Context r0 = r4.A0B
            android.app.Activity r0 = X.C24801Dv.A00(r0)
            X.14u r0 = (X.C225314u) r0
            r0.Btm(r1)
            return
        L_0x03ba:
            java.lang.Object r0 = r15.A00
            com.whatsapp.stickers.info.bottomsheet.StickerInfoBottomSheet r0 = (com.whatsapp.stickers.info.bottomsheet.StickerInfoBottomSheet) r0
            com.whatsapp.stickers.info.bottomsheet.StickerInfoBottomSheet.A03(r0)
        L_0x03c1:
            r0.A1b()
            return
        L_0x03c5:
            java.lang.Object r1 = r15.A00
            com.whatsapp.status.seeall.StatusSeeAllActivity r1 = (com.whatsapp.status.seeall.StatusSeeAllActivity) r1
            r0 = 0
            X.AnonymousClass00C.A0D(r1, r0)
            com.whatsapp.status.seeall.viewmodel.StatusSeeAllViewModel r1 = r1.A09
            if (r1 != 0) goto L_0x03d6
            java.lang.RuntimeException r0 = X.C36331k8.A0a()
            throw r0
        L_0x03d6:
            X.2pH r0 = X.C52342pH.ALL
            com.whatsapp.status.seeall.viewmodel.StatusSeeAllViewModel.A02(r0, r1)
            return
        L_0x03dc:
            java.lang.Object r0 = r15.A00
            com.whatsapp.status.seeall.StatusSeeAllActivity r0 = (com.whatsapp.status.seeall.StatusSeeAllActivity) r0
            X.3LE r1 = r0.A07
            if (r1 != 0) goto L_0x03eb
            java.lang.String r0 = "searchToolbarHelper"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x03eb:
            r0 = 1
            r1.A05(r0)
            return
        L_0x03f0:
            java.lang.Object r0 = r15.A00
            X.2fB r0 = (X.C47592fB) r0
            com.google.android.material.bottomsheet.BottomSheetBehavior r1 = r0.A01
            r0 = 4
            r1.A0W(r0)
            return
        L_0x03fb:
            java.lang.Object r1 = r15.A00
            com.whatsapp.status.playback.MessageReplyActivity r1 = (com.whatsapp.status.playback.MessageReplyActivity) r1
            r0 = 0
            com.whatsapp.status.playback.MessageReplyActivity.A0l(r1, r0)
            return
        L_0x0404:
            java.lang.Object r4 = r15.A00
            com.whatsapp.status.audienceselector.sharesheet.StatusAudienceSelectorShareSheetFragment r4 = (com.whatsapp.status.audienceselector.sharesheet.StatusAudienceSelectorShareSheetFragment) r4
            r3 = 1
            goto L_0x040f
        L_0x040a:
            java.lang.Object r4 = r15.A00
            com.whatsapp.status.audienceselector.sharesheet.StatusAudienceSelectorShareSheetFragment r4 = (com.whatsapp.status.audienceselector.sharesheet.StatusAudienceSelectorShareSheetFragment) r4
            r3 = 2
        L_0x040f:
            android.content.Context r1 = r4.A0a()
            X.3OM r0 = new X.3OM
            r0.<init>(r1)
            android.content.Intent r2 = X.AnonymousClass3OM.A01(r0, r3)
            X.3Pu r1 = r4.A07
            if (r1 == 0) goto L_0x042d
            X.3XT r0 = com.whatsapp.status.audienceselector.sharesheet.StatusAudienceSelectorShareSheetFragment.A03(r4, r3)
            r1.A02(r2, r0)
            X.04e r0 = r4.A09
            r0.A02(r2)
            return
        L_0x042d:
            java.lang.String r0 = "statusAudienceRepository"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0434:
            java.lang.Object r3 = r15.A00
            com.whatsapp.status.audienceselector.sharesheet.StatusAudienceSelectorShareSheetFragment r3 = (com.whatsapp.status.audienceselector.sharesheet.StatusAudienceSelectorShareSheetFragment) r3
            r2 = 0
            android.widget.RadioButton r1 = r3.A00
            if (r1 == 0) goto L_0x0441
            r0 = 1
            r1.setChecked(r0)
        L_0x0441:
            android.widget.RadioButton r0 = r3.A01
            if (r0 == 0) goto L_0x0448
            r0.setChecked(r2)
        L_0x0448:
            r0 = 2
            X.3XT r0 = com.whatsapp.status.audienceselector.sharesheet.StatusAudienceSelectorShareSheetFragment.A03(r3, r0)
            r3.A06 = r0
            return
        L_0x0450:
            java.lang.Object r2 = r15.A00
            com.whatsapp.status.audienceselector.sharesheet.StatusAudienceSelectorShareSheetFragment r2 = (com.whatsapp.status.audienceselector.sharesheet.StatusAudienceSelectorShareSheetFragment) r2
            r1 = 0
            android.widget.RadioButton r0 = r2.A00
            if (r0 == 0) goto L_0x045c
            r0.setChecked(r1)
        L_0x045c:
            android.widget.RadioButton r1 = r2.A01
            r0 = 1
            if (r1 == 0) goto L_0x0464
            r1.setChecked(r0)
        L_0x0464:
            X.3XT r0 = com.whatsapp.status.audienceselector.sharesheet.StatusAudienceSelectorShareSheetFragment.A03(r2, r0)
            r2.A06 = r0
            return
        L_0x046b:
            java.lang.Object r2 = r15.A00
            com.whatsapp.status.audienceselector.StatusPrivacyActivity r2 = (com.whatsapp.status.audienceselector.StatusPrivacyActivity) r2
            com.whatsapp.status.audienceselector.StatusPrivacyActivity.A0G(r2)
            android.widget.RadioButton r1 = r2.A00
            if (r1 != 0) goto L_0x047d
            java.lang.String r0 = "allowListButton"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x047d:
            r0 = 1
            r1.setChecked(r0)
            goto L_0x04b7
        L_0x0482:
            java.lang.Object r3 = r15.A00
            com.whatsapp.status.audienceselector.StatusPrivacyActivity r3 = (com.whatsapp.status.audienceselector.StatusPrivacyActivity) r3
            r2 = 0
            com.whatsapp.status.audienceselector.StatusPrivacyActivity.A0G(r3)
            android.widget.RadioButton r1 = r3.A02
            if (r1 != 0) goto L_0x0495
            java.lang.String r0 = "myContactsButton"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0495:
            r0 = 1
            r1.setChecked(r0)
            X.3XT r0 = com.whatsapp.status.audienceselector.StatusPrivacyActivity.A01(r3, r2)
            r3.A0A = r0
            return
        L_0x04a0:
            java.lang.Object r2 = r15.A00
            com.whatsapp.status.audienceselector.StatusPrivacyActivity r2 = (com.whatsapp.status.audienceselector.StatusPrivacyActivity) r2
            com.whatsapp.status.audienceselector.StatusPrivacyActivity.A0G(r2)
            android.widget.RadioButton r1 = r2.A01
            if (r1 != 0) goto L_0x04b2
            java.lang.String r0 = "denyListButton"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x04b2:
            r0 = 1
            r1.setChecked(r0)
            r0 = 2
        L_0x04b7:
            X.3XT r0 = com.whatsapp.status.audienceselector.StatusPrivacyActivity.A01(r2, r0)
            r2.A0A = r0
            return
        L_0x04be:
            java.lang.Object r0 = r15.A00
            X.3Aw r0 = (X.C61183Aw) r0
            X.00S r0 = r0.A04
            goto L_0x04cb
        L_0x04c5:
            java.lang.Object r0 = r15.A00
            X.3Aw r0 = (X.C61183Aw) r0
            X.00S r0 = r0.A05
        L_0x04cb:
            r0.invoke()
            return
        L_0x04cf:
            java.lang.Object r0 = r15.A00
            X.3rI r0 = (X.C77933rI) r0
            com.whatsapp.status.StatusesFragment r2 = r0.A02
            r1 = 0
            goto L_0x04de
        L_0x04d7:
            java.lang.Object r0 = r15.A00
            X.3rI r0 = (X.C77933rI) r0
            com.whatsapp.status.StatusesFragment r2 = r0.A02
            r1 = 1
        L_0x04de:
            X.3P1 r0 = r2.A0u
            X.1dR r0 = r0.A02
            X.1Ak r0 = r0.A02()
            com.whatsapp.status.StatusesFragment.A0E(r2, r0, r1)
            return
        L_0x04ea:
            java.lang.String r0 = "wamRuntime"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0A(r0)
            throw r0
        L_0x04f1:
            java.lang.IllegalArgumentException r0 = X.C36381kD.A0k()
            throw r0
        L_0x04f6:
            com.whatsapp.status.audienceselector.sharesheet.StatusAudienceSelectorShareSheetFragment r3 = new com.whatsapp.status.audienceselector.sharesheet.StatusAudienceSelectorShareSheetFragment
            r3.<init>(r4)
            android.os.Bundle r2 = X.AnonymousClass001.A07()
            X.3Pu r1 = r4.A0b
            X.00s r0 = r4.A12
            java.lang.Object r0 = r0.A04()
            X.3XT r0 = (X.AnonymousClass3XT) r0
            r1.A03(r2, r0)
            r3.A17(r2)
            r4.Btm(r3)
            return
        L_0x0513:
            r1.BhT(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67103Yn.onClick(android.view.View):void");
    }

    public C67103Yn(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }
}
