package X;

import android.content.DialogInterface;

/* renamed from: X.7py  reason: invalid class name and case insensitive filesystem */
public class C163297py implements DialogInterface.OnClickListener {
    public Object A00;
    public final int A01;

    public C163297py(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public static void A00(C39001qm r1, Object obj, int i, int i2) {
        r1.A0f(new C163297py(obj, i), i2);
    }

    public static void A01(C39001qm r1, Object obj, int i, int i2) {
        r1.A0h(new C163297py(obj, i), i2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:210:0x057d, code lost:
        X.AnonymousClass3SJ.A00(r1, 2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x0581, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x0611, code lost:
        com.whatsapp.util.Log.i(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x0631, code lost:
        r2.A00 = true;
        r2.Bp4(true, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:0x0638, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:270:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000d, code lost:
        r0.finish();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01e0, code lost:
        if (r3 == null) goto L_0x01e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x021d, code lost:
        r3.dismiss();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0220, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.content.DialogInterface r18, int r19) {
        /*
            r17 = this;
            r1 = r17
            int r0 = r1.A01
            r3 = r18
            switch(r0) {
                case 0: goto L_0x064b;
                case 1: goto L_0x027a;
                case 2: goto L_0x0265;
                case 3: goto L_0x0639;
                case 4: goto L_0x0626;
                case 5: goto L_0x0615;
                case 6: goto L_0x0604;
                case 7: goto L_0x05ee;
                case 8: goto L_0x05d7;
                case 9: goto L_0x05c9;
                case 10: goto L_0x05c0;
                case 11: goto L_0x0221;
                case 12: goto L_0x05b3;
                case 13: goto L_0x05a9;
                case 14: goto L_0x05a1;
                case 15: goto L_0x0595;
                case 16: goto L_0x0582;
                case 17: goto L_0x056b;
                case 18: goto L_0x0535;
                case 19: goto L_0x0524;
                case 20: goto L_0x0211;
                case 21: goto L_0x0484;
                case 22: goto L_0x044a;
                case 23: goto L_0x0426;
                case 24: goto L_0x00ed;
                case 25: goto L_0x041e;
                case 26: goto L_0x0011;
                case 27: goto L_0x00d9;
                case 28: goto L_0x040a;
                case 29: goto L_0x03f6;
                case 30: goto L_0x03e9;
                case 31: goto L_0x03dc;
                case 32: goto L_0x0009;
                case 33: goto L_0x03ce;
                case 34: goto L_0x03bd;
                case 35: goto L_0x03b7;
                case 36: goto L_0x03b7;
                case 37: goto L_0x0009;
                case 38: goto L_0x030e;
                case 39: goto L_0x0306;
                case 40: goto L_0x02fe;
                case 41: goto L_0x02b5;
                case 42: goto L_0x00d1;
                case 43: goto L_0x00c3;
                case 44: goto L_0x0061;
                case 45: goto L_0x02a7;
                case 46: goto L_0x0282;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.lang.Object r0 = r1.A00
            android.app.Activity r0 = (android.app.Activity) r0
        L_0x000d:
            r0.finish()
        L_0x0010:
            return
        L_0x0011:
            java.lang.Object r6 = r1.A00
            com.whatsapp.expressionstray.stickers.SearchFunStickersBottomSheet r6 = (com.whatsapp.expressionstray.stickers.SearchFunStickersBottomSheet) r6
            boolean r5 = X.C36371kC.A1V(r3)
            X.00T r4 = r6.A0X
            java.lang.Object r2 = r4.getValue()
            com.whatsapp.expressionstray.stickers.funstickers.viewmodels.SearchFunStickersViewModel r2 = (com.whatsapp.expressionstray.stickers.funstickers.viewmodels.SearchFunStickersViewModel) r2
            X.5La r1 = r2.A0H
            java.util.Map r0 = r1.A00
            r0.clear()
            java.util.Map r0 = r1.A01
            r0.clear()
            java.util.Map r0 = r2.A06
            r0.clear()
            java.util.List r0 = r2.A05
            r0.clear()
            X.4mL r1 = r6.A0K
            if (r1 == 0) goto L_0x0040
            X.09w r0 = X.C023409w.A00
            r1.A0M(r0)
        L_0x0040:
            java.lang.Object r0 = r4.getValue()
            com.whatsapp.expressionstray.stickers.funstickers.viewmodels.SearchFunStickersViewModel r0 = (com.whatsapp.expressionstray.stickers.funstickers.viewmodels.SearchFunStickersViewModel) r0
            r0.A0T(r5)
            com.whatsapp.WaEditText r1 = r6.A09
            if (r1 == 0) goto L_0x0051
            r0 = 0
            r1.setText(r0)
        L_0x0051:
            com.whatsapp.WaTextView r0 = r6.A0G
            if (r0 == 0) goto L_0x0058
            r0.setVisibility(r5)
        L_0x0058:
            android.widget.FrameLayout r0 = r6.A03
            if (r0 == 0) goto L_0x021d
            r0.setVisibility(r5)
            goto L_0x021d
        L_0x0061:
            java.lang.Object r4 = r1.A00
            com.whatsapp.voipcalling.dialogs.SwitchCameraForPersonalizedAvatarDialogFragment r4 = (com.whatsapp.voipcalling.dialogs.SwitchCameraForPersonalizedAvatarDialogFragment) r4
            X.7hu r0 = r4.A00
            if (r0 != 0) goto L_0x0070
            java.lang.String r0 = "switchCameraForPersonalizedAvatarCallback"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0070:
            X.7pW r0 = (X.C163017pW) r0
            int r3 = r0.A01
            java.lang.Object r2 = r0.A00
            com.whatsapp.voipcalling.VoipActivityV2 r2 = (com.whatsapp.voipcalling.VoipActivityV2) r2
            android.os.Handler r1 = r2.A05
            r0 = 3
            r1.removeMessages(r0)
            com.whatsapp.voipcalling.Voip.switchCamera()
            X.711 r0 = r2.A0x
            r0.A06()
            if (r3 == 0) goto L_0x00bd
            com.whatsapp.calling.avatar.viewmodel.CallAvatarViewModel r1 = r2.A0a
            java.lang.String r0 = "voip/CallAvatarViewModel/onSwitchedToBackCamera"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1hi r3 = r1.A0F
            java.lang.Object r2 = X.C36401kF.A0m(r3)
            boolean r0 = r2 instanceof X.AnonymousClass52Q
            if (r0 != 0) goto L_0x00ac
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "voip/CallAvatarViewModel/onSwitchToBackCamera Unexpected state="
            X.C36321k7.A1J(r2, r0, r1)
        L_0x00a2:
            boolean r0 = r4.A12()
            if (r0 == 0) goto L_0x0010
            r4.A1c()
            return
        L_0x00ac:
            X.6WJ r1 = r1.A06
            r0 = 4
            r1.A04(r0)
            X.52J r1 = X.AnonymousClass52J.A00
            X.52M r0 = new X.52M
            r0.<init>(r1)
            r3.A0D(r0)
            goto L_0x00a2
        L_0x00bd:
            com.whatsapp.calling.avatar.viewmodel.CallAvatarViewModel r0 = r2.A0a
            r0.A0S()
            goto L_0x00a2
        L_0x00c3:
            java.lang.Object r1 = r1.A00
            androidx.fragment.app.DialogFragment r1 = (androidx.fragment.app.DialogFragment) r1
            boolean r0 = r1.A12()
            if (r0 == 0) goto L_0x0010
            r1.A1c()
            return
        L_0x00d1:
            java.lang.Object r0 = r1.A00
            X.6z5 r0 = (X.C148576z5) r0
            com.whatsapp.stickers.store.preview.StickerStorePackPreviewActivity r0 = r0.A00
            goto L_0x000d
        L_0x00d9:
            java.lang.Object r2 = r1.A00
            X.6ov r2 = (X.C142466ov) r2
            android.app.Activity r1 = r2.A05
            r0 = 0
            X.AnonymousClass3SJ.A00(r1, r0)
            X.11F r1 = r2.A0I
            if (r1 == 0) goto L_0x0010
            X.1P5 r0 = r2.A12
            r0.A0V(r1)
            return
        L_0x00ed:
            java.lang.Object r4 = r1.A00
            com.whatsapp.conversation.conversationrow.googlesearch.GoogleSearchDialogFragment r4 = (com.whatsapp.conversation.conversationrow.googlesearch.GoogleSearchDialogFragment) r4
            r0 = -1
            r1 = r19
            if (r1 != r0) goto L_0x0010
            android.os.Bundle r2 = r4.A0b()
            X.01I r1 = r4.A0i()
            boolean r0 = r1 instanceof X.C225314u
            if (r0 == 0) goto L_0x010e
            X.14u r1 = (X.C225314u) r1
            r0 = 2131893322(0x7f121c4a, float:1.9421417E38)
            boolean r0 = r1.A3J(r0)
            if (r0 == 0) goto L_0x0114
            return
        L_0x010e:
            java.lang.String r1 = "GoogleSearchDialogFragment does not have a DialogActivity as a host"
            r0 = 0
            X.C18740tg.A0D(r0, r1)
        L_0x0114:
            java.lang.String r0 = "search_query_type"
            int r1 = r2.getInt(r0)
            if (r1 == 0) goto L_0x0154
            r0 = 1
            if (r1 != r0) goto L_0x0010
            android.os.Bundle r1 = r4.A0b()
            java.lang.String r0 = "image_file"
            java.lang.String r1 = r1.getString(r0)
            X.01I r5 = r4.A0h()
            if (r5 == 0) goto L_0x0010
            boolean r0 = r5.isFinishing()
            if (r0 != 0) goto L_0x0010
            boolean r0 = r5 instanceof X.C225314u
            if (r0 == 0) goto L_0x0150
            X.0wU r0 = r4.A05
            X.17Y r6 = r4.A01
            X.0ww r7 = r4.A03
            X.0yW r8 = r4.A04
            X.14u r5 = (X.C225314u) r5
            java.io.File r9 = X.C90524aI.A0S(r1)
            X.5Ml r4 = new X.5Ml
            r4.<init>(r5, r6, r7, r8, r9)
            X.C36331k8.A1F(r4, r0)
            return
        L_0x0150:
            java.lang.String r1 = "GoogleSearchDialogFragment does not have a DialogActivity as a host"
            goto L_0x01e4
        L_0x0154:
            android.os.Bundle r1 = r4.A0b()
            java.lang.String r0 = "search_query_text"
            java.lang.String r3 = r1.getString(r0)
            java.lang.String r2 = "wa"
            android.net.Uri$Builder r1 = new android.net.Uri$Builder
            r1.<init>()
            java.lang.String r0 = "https"
            android.net.Uri$Builder r1 = r1.scheme(r0)
            java.lang.String r0 = "www.google.com"
            android.net.Uri$Builder r1 = r1.authority(r0)
            java.lang.String r0 = "search"
            android.net.Uri$Builder r1 = r1.path(r0)
            java.lang.String r0 = "ctx"
            android.net.Uri$Builder r7 = r1.appendQueryParameter(r0, r2)
            java.lang.String r0 = X.C90474aD.A0b(r7)
            byte[] r0 = r0.getBytes()
            int r0 = r0.length
            int r0 = 2000 - r0
            int r10 = r0 + -3
            java.nio.charset.Charset r8 = X.C19430v1.A0D
            java.nio.ByteBuffer r0 = r8.encode(r3)
            byte[] r9 = r0.array()
            java.lang.String r0 = X.C19430v1.A0B     // Catch:{ UnsupportedEncodingException -> 0x01da }
            java.lang.String r2 = java.net.URLEncoder.encode(r3, r0)     // Catch:{ UnsupportedEncodingException -> 0x01da }
            java.lang.String r1 = "+"
            java.lang.String r0 = "%20"
            java.lang.String r6 = r2.replace(r1, r0)     // Catch:{ UnsupportedEncodingException -> 0x01da }
            byte[] r0 = r6.getBytes()     // Catch:{ UnsupportedEncodingException -> 0x01da }
            int r0 = r0.length     // Catch:{ UnsupportedEncodingException -> 0x01da }
            if (r0 <= r10) goto L_0x01e0
            r5 = 0
            r3 = 0
            r2 = 0
        L_0x01ac:
            if (r3 >= r10) goto L_0x01c3
            int r0 = r9.length     // Catch:{ UnsupportedEncodingException -> 0x01da }
            if (r2 >= r0) goto L_0x01c3
            char r1 = r6.charAt(r3)     // Catch:{ UnsupportedEncodingException -> 0x01da }
            r0 = 37
            if (r1 != r0) goto L_0x01bc
            int r3 = r3 + 3
            goto L_0x01be
        L_0x01bc:
            int r3 = r3 + 1
        L_0x01be:
            if (r3 > r10) goto L_0x01c3
            int r2 = r2 + 1
            goto L_0x01ac
        L_0x01c3:
            byte r0 = r9[r2]     // Catch:{ UnsupportedEncodingException -> 0x01da }
            r1 = r0 & 192(0xc0, float:2.69E-43)
            r0 = 128(0x80, float:1.794E-43)
            if (r1 != r0) goto L_0x01d0
            if (r2 <= 0) goto L_0x01d0
            int r2 = r2 + -1
            goto L_0x01c3
        L_0x01d0:
            byte[] r0 = java.util.Arrays.copyOfRange(r9, r5, r2)     // Catch:{ UnsupportedEncodingException -> 0x01da }
            java.lang.String r3 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x01da }
            r3.<init>(r0, r8)     // Catch:{ UnsupportedEncodingException -> 0x01da }
            goto L_0x01e9
        L_0x01da:
            java.lang.String r0 = "UrlUtils/truncateParameterForPercentEncoding UTF-8 encoding not supported"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x01e2
        L_0x01e0:
            if (r3 != 0) goto L_0x01e9
        L_0x01e2:
            java.lang.String r1 = "Failed to encode URI in UTF-8, this should not happen"
        L_0x01e4:
            r0 = 0
            X.C18740tg.A0D(r0, r1)
            return
        L_0x01e9:
            java.lang.String r0 = "q"
            android.net.Uri r0 = X.C90484aE.A0M(r7, r0, r3)
            if (r0 == 0) goto L_0x01e2
            android.content.Intent r3 = X.C36391kE.A0G(r0)
            X.01I r2 = r4.A0h()
            if (r2 == 0) goto L_0x0010
            boolean r0 = r2.isFinishing()
            if (r0 != 0) goto L_0x0010
            X.0yW r1 = r4.A04
            X.2Mv r0 = new X.2Mv
            r0.<init>()
            r1.Bly(r0)
            X.1Dv r0 = r4.A00
            r0.A06(r2, r3)
            return
        L_0x0211:
            java.lang.Object r0 = r1.A00
            X.00S r0 = (X.AnonymousClass00S) r0
            X.C36341k9.A1D(r0)
            r0.invoke()
            if (r18 == 0) goto L_0x0010
        L_0x021d:
            r3.dismiss()
            return
        L_0x0221:
            java.lang.Object r4 = r1.A00
            com.whatsapp.account.remove.RemoveAccountActivity r4 = (com.whatsapp.account.remove.RemoveAccountActivity) r4
            r7 = 1
            X.AnonymousClass3SJ.A00(r4, r7)
            X.6TO r1 = r4.A02
            if (r1 == 0) goto L_0x06c6
            r3 = 0
            r2 = 14
            r0 = 9
            r1.A02(r3, r2, r0)
            X.1RV r0 = r4.A00
            if (r0 == 0) goto L_0x06bf
            int r5 = r0.A00()
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "RemoveAccountActivity/maybeRemoveAccount shouldAllowAccountSwitching:"
            X.C36321k7.A1T(r0, r1, r5)
            if (r5 == 0) goto L_0x0688
            r0 = 2
            if (r5 == r0) goto L_0x0663
            r0 = 3
            if (r5 != r0) goto L_0x0010
            X.1RU r0 = r4.A01
            if (r0 == 0) goto L_0x065c
            r1 = 2131886305(0x7f1200e1, float:1.9407185E38)
            r0 = 2131893505(0x7f121d01, float:1.9421788E38)
            X.AnonymousClass1RU.A01(r4, r3, r1, r0)
            X.6TO r1 = r4.A02
            if (r1 == 0) goto L_0x0655
            r0 = 24
            r1.A02(r3, r2, r0)
            return
        L_0x0265:
            java.lang.Object r2 = r1.A00
            X.5JX r2 = (X.AnonymousClass5JX) r2
            android.app.Activity r1 = r2.A01
            r0 = 107(0x6b, float:1.5E-43)
            X.AnonymousClass3SJ.A00(r1, r0)
            boolean r0 = r2.B2j()
            if (r0 == 0) goto L_0x0010
            r2.BxC()
            return
        L_0x027a:
            java.lang.Object r0 = r1.A00
            X.5JX r0 = (X.AnonymousClass5JX) r0
            android.app.Activity r0 = r0.A01
            goto L_0x000d
        L_0x0282:
            java.lang.Object r3 = r1.A00
            com.whatsapp.xfamily.crossposting.ui.ShareToFacebookActivity r3 = (com.whatsapp.xfamily.crossposting.ui.ShareToFacebookActivity) r3
            X.17Y r0 = r3.A05
            X.AnonymousClass00C.A07(r0)
            X.3GB r2 = new X.3GB
            r2.<init>(r0)
            r0 = 2131886348(0x7f12010c, float:1.9407272E38)
            r2.A01(r0)
            X.1UZ r1 = r3.A3i()
            java.lang.String r0 = "TAP_UNLINK_DISABLE"
            r1.A04(r0)
            X.0wU r1 = r3.A04
            r0 = 9
            X.C1498272x.A00(r1, r2, r3, r0)
            return
        L_0x02a7:
            java.lang.Object r0 = r1.A00
            com.whatsapp.xfamily.crossposting.ui.ShareToFacebookActivity r0 = (com.whatsapp.xfamily.crossposting.ui.ShareToFacebookActivity) r0
            X.1UZ r1 = r0.A3i()
            java.lang.String r0 = "TAP_UNLINK_CANCEL"
            r1.A04(r0)
            return
        L_0x02b5:
            java.lang.Object r3 = r1.A00
            com.whatsapp.stickers.StarStickerFromPickerDialogFragment r3 = (com.whatsapp.stickers.StarStickerFromPickerDialogFragment) r3
            X.6c4 r6 = r3.A02
            java.lang.String r0 = r6.A0G
            if (r0 != 0) goto L_0x02c9
            X.1AP r1 = r3.A03
            java.util.Set r0 = java.util.Collections.singleton(r6)
            r1.A0D(r0)
            return
        L_0x02c9:
            X.7d5 r2 = r3.A01
            android.os.Bundle r0 = r3.A0b()
            java.lang.String r1 = "position"
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L_0x02fc
            android.os.Bundle r0 = r3.A0b()
            int r0 = r0.getInt(r1)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
        L_0x02e3:
            X.1AP r1 = r3.A03
            X.1Av r0 = r3.A00
            X.5Mk r4 = new X.5Mk
            r4.<init>(r0, r2, r1)
            X.0wU r3 = r3.A04
            r0 = 1
            android.util.Pair[] r2 = new android.util.Pair[r0]
            r1 = 0
            android.util.Pair r0 = X.C36441kJ.A0Q(r6, r5)
            r2[r1] = r0
            r3.Box(r4, r2)
            return
        L_0x02fc:
            r5 = 0
            goto L_0x02e3
        L_0x02fe:
            java.lang.Object r0 = r1.A00
            androidx.fragment.app.DialogFragment r0 = (androidx.fragment.app.DialogFragment) r0
            r0.A1b()
            return
        L_0x0306:
            java.lang.Object r0 = r1.A00
            X.7hK r0 = (X.AnonymousClass7hK) r0
            r0.BY0()
            return
        L_0x030e:
            java.lang.Object r3 = r1.A00
            X.14u r3 = (X.C225314u) r3
            android.content.Intent r1 = r3.getIntent()
            java.lang.String r0 = "screen_params"
            java.io.Serializable r1 = r1.getSerializableExtra(r0)
            java.util.AbstractMap r1 = (java.util.AbstractMap) r1
            if (r1 == 0) goto L_0x039a
            java.lang.String r0 = "credential_push_data"
            java.lang.String r5 = X.C90504aG.A0l(r0, r1)
            if (r5 == 0) goto L_0x03aa
            java.lang.String r0 = "."
            java.lang.String[] r1 = new java.lang.String[]{r0}
            r0 = 0
            r4 = 0
            java.util.List r0 = X.AnonymousClass099.A0L(r5, r1, r0)
            java.lang.String[] r2 = X.C36431kI.A1b(r0)
            int r1 = r2.length
            r0 = 1
            if (r1 <= r0) goto L_0x03aa
            r0 = r2[r0]
            byte[] r2 = android.util.Base64.decode(r0, r4)
            X.AnonymousClass00C.A0B(r2)     // Catch:{ UnsupportedEncodingException -> 0x0397 }
            java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.UTF_8     // Catch:{ UnsupportedEncodingException -> 0x0397 }
            X.AnonymousClass00C.A09(r1)     // Catch:{ UnsupportedEncodingException -> 0x0397 }
            java.lang.String r0 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x0397 }
            r0.<init>(r2, r1)     // Catch:{ UnsupportedEncodingException -> 0x0397 }
            org.json.JSONObject r2 = X.C36441kJ.A1C(r0)     // Catch:{ JSONException -> 0x039c }
            java.lang.String r0 = "callbackURL"
            java.lang.String r1 = r2.getString(r0)     // Catch:{ JSONException -> 0x039c }
            java.lang.String r0 = "pushAccountReceipts"
            org.json.JSONArray r0 = r2.getJSONArray(r0)     // Catch:{ JSONException -> 0x039c }
            java.lang.String r4 = r0.getString(r4)     // Catch:{ JSONException -> 0x039c }
            if (r1 == 0) goto L_0x03aa
            int r0 = r1.length()     // Catch:{ JSONException -> 0x039c }
            if (r0 == 0) goto L_0x03aa
            android.net.Uri$Builder r2 = X.C90504aG.A0I(r1)     // Catch:{ JSONException -> 0x039c }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ JSONException -> 0x039c }
            java.lang.String r0 = "results["
            r1.append(r0)     // Catch:{ JSONException -> 0x039c }
            r1.append(r4)     // Catch:{ JSONException -> 0x039c }
            r0 = 93
            java.lang.String r1 = X.AnonymousClass000.A0t(r1, r0)     // Catch:{ JSONException -> 0x039c }
            java.lang.String r0 = "CANCELLED"
            android.net.Uri r2 = X.C90484aE.A0M(r2, r1, r0)     // Catch:{ JSONException -> 0x039c }
            if (r2 == 0) goto L_0x03aa
            java.lang.String r0 = "android.intent.action.VIEW"
            android.content.Intent r1 = X.C36441kJ.A0I(r0)
            r1.setData(r2)
            r0 = 1
            r3.A33(r1, r0)
            return
        L_0x0397:
            java.lang.String r0 = "UnsupportedEncodingException: Credential Push data cannot be decoded"
            goto L_0x03a7
        L_0x039a:
            r5 = 0
            goto L_0x03aa
        L_0x039c:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "JSONException: cannot parse callback url from json, "
            java.lang.String r0 = X.C36331k8.A0i(r0, r1, r2)
        L_0x03a7:
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x03aa:
            r3.finish()
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Credential Push data is invalid. "
            X.C36321k7.A1P(r0, r5, r1)
            return
        L_0x03b7:
            java.lang.Object r0 = r1.A00
            X.C36411kG.A1O(r0)
            return
        L_0x03bd:
            java.lang.Object r1 = r1.A00
            android.app.Activity r1 = (android.app.Activity) r1
            java.lang.String r0 = "ExportMigrationActivity/cancelMigrationAndReturn/unknown/resultCode: 0"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = 0
            r1.setResult(r0)
            r1.finish()
            return
        L_0x03ce:
            java.lang.Object r0 = r1.A00
            com.whatsapp.migration.export.ui.ExportMigrationActivity r0 = (com.whatsapp.migration.export.ui.ExportMigrationActivity) r0
            X.68x r2 = r0.A0G
            java.lang.String r1 = r0.A0J
            r0 = 9
            r2.A00(r1, r0)
            return
        L_0x03dc:
            java.lang.Object r0 = r1.A00
            com.whatsapp.mediacomposer.dialog.DataWarningDialog r0 = (com.whatsapp.mediacomposer.dialog.DataWarningDialog) r0
            r3.dismiss()
            X.00S r0 = r0.A02
            r0.invoke()
            return
        L_0x03e9:
            java.lang.Object r0 = r1.A00
            com.whatsapp.mediacomposer.dialog.DataWarningDialog r0 = (com.whatsapp.mediacomposer.dialog.DataWarningDialog) r0
            r3.dismiss()
            X.00S r0 = r0.A01
            r0.invoke()
            return
        L_0x03f6:
            java.lang.Object r3 = r1.A00
            X.6Zc r3 = (X.C133586Zc) r3
            X.01L r2 = r3.A0P
            java.lang.String r0 = "android.settings.LOCATION_SOURCE_SETTINGS"
            android.content.Intent r1 = X.C36441kJ.A0I(r0)
            r0 = 0
            r2.startActivityForResult(r1, r0)
            X.01L r1 = r3.A0P
            goto L_0x057d
        L_0x040a:
            java.lang.Object r3 = r1.A00
            X.6ov r3 = (X.C142466ov) r3
            android.app.Activity r2 = r3.A05
            java.lang.String r0 = "android.settings.LOCATION_SOURCE_SETTINGS"
            android.content.Intent r1 = X.C36441kJ.A0I(r0)
            r0 = 0
            r2.startActivityForResult(r1, r0)
            android.app.Activity r1 = r3.A05
            goto L_0x057d
        L_0x041e:
            java.lang.Object r0 = r1.A00
            android.app.Activity r0 = (android.app.Activity) r0
            X.C36351kA.A11(r0)
            return
        L_0x0426:
            java.lang.Object r1 = r1.A00
            com.whatsapp.calling.spam.CallSpamActivity$ReportSpamOrBlockDialogFragment r1 = (com.whatsapp.calling.spam.CallSpamActivity.ReportSpamOrBlockDialogFragment) r1
            boolean r0 = r1.A0M
            if (r0 == 0) goto L_0x043c
            X.3Os r3 = r1.A0B
            java.lang.String r2 = r1.A0K
            com.whatsapp.jid.UserJid r1 = r1.A0D
            X.C36321k7.A0w(r2, r1)
            r0 = 2
            X.AnonymousClass3Os.A00(r3, r1, r2, r0)
            return
        L_0x043c:
            X.3PR r3 = r1.A0A
            java.lang.String r2 = r1.A0K
            com.whatsapp.jid.UserJid r1 = r1.A0D
            X.C36321k7.A0w(r2, r1)
            r0 = 2
            X.AnonymousClass3PR.A00(r3, r1, r2, r0)
            return
        L_0x044a:
            java.lang.Object r3 = r1.A00
            com.whatsapp.calling.spam.CallSpamActivity$ReportSpamOrBlockDialogFragment r3 = (com.whatsapp.calling.spam.CallSpamActivity.ReportSpamOrBlockDialogFragment) r3
            X.0wD r0 = r3.A04
            boolean r0 = r0.A09()
            r2 = 0
            if (r0 != 0) goto L_0x0472
            java.lang.String r0 = "callspamactivity/spam/report/no-network-cannot-block-report"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            X.01I r0 = r3.A0i()
            boolean r0 = X.C19600wD.A02(r0)
            r1 = 2131891614(0x7f12159e, float:1.9417953E38)
            if (r0 == 0) goto L_0x046c
            r1 = 2131891615(0x7f12159f, float:1.9417955E38)
        L_0x046c:
            X.17Y r0 = r3.A02
            r0.A06(r1, r2)
            return
        L_0x0472:
            X.17Y r1 = r3.A02
            r0 = 0
            r1.A0B(r0)
            X.01I r2 = r3.A0i()
            X.0wU r1 = r3.A0H
            r0 = 19
            X.C36411kG.A1M(r1, r3, r2, r0)
            return
        L_0x0484:
            java.lang.Object r1 = r1.A00
            X.4oJ r1 = (X.C97044oJ) r1
            X.0wo r5 = r1.A07
            X.0yC r7 = r1.A0E
            X.141 r0 = r1.A01
            X.11F r8 = r0.A0H
            X.C18740tg.A06(r8)
            X.0wQ r3 = r1.A04
            X.0wU r4 = r1.A0H
            X.3KV r12 = r1.A00
            X.1SR r10 = r1.A0A
            X.1A1 r9 = r1.A0G
            X.19w r6 = r1.A0F
            X.0xM r13 = r1.A09
            X.1YE r2 = r1.A0D
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "scheduled-call/sendScheduledCallCancelMessage chatJid="
            X.C36321k7.A1K(r8, r0, r1)
            r0 = 4164(0x1044, float:5.835E-42)
            boolean r0 = r7.A0E(r0)
            if (r0 == 0) goto L_0x04d9
            X.11F r4 = r12.A04
            boolean r3 = r12.A08
            java.lang.String r0 = r12.A07
            X.3Qa r1 = new X.3Qa
            r1.<init>(r4, r0, r3)
            com.whatsapp.jid.UserJid r0 = r12.A05
            X.9Vv r7 = new X.9Vv
            r7.<init>(r0, r1)
            long r10 = r12.A02
            X.3Qa r6 = r6.A02(r4, r3)
            long r8 = X.C19970wo.A00(r5)
            X.2bb r5 = new X.2bb
            r5.<init>(r6, r7, r8, r10)
            r2.A01(r5)
            return
        L_0x04d9:
            com.whatsapp.jid.UserJid r6 = r12.A05
            boolean r1 = r3.A0M(r6)
            java.lang.String r0 = X.C237919w.A00(r3, r5)
            X.3Qa r7 = new X.3Qa
            r7.<init>(r8, r0, r1)
            long r15 = r12.A02
            long r0 = java.lang.System.currentTimeMillis()
            java.lang.String r5 = r12.A07
            boolean r2 = X.AnonymousClass143.A0I(r6)
            if (r2 == 0) goto L_0x051f
            X.13w r3 = r3.A08()
        L_0x04fa:
            X.C18740tg.A06(r3)
            r2 = 1
            X.5JA r11 = new X.5JA
            r11.<init>((X.C64933Qa) r7, (long) r0)
            boolean r1 = r7.A02
            r0 = 8
            if (r1 == 0) goto L_0x050a
            r0 = 7
        L_0x050a:
            r11.A01 = r0
            r11.A0q(r3)
            r11.A00 = r2
            r11.A02 = r5
            r11.A01 = r6
            r14 = 0
            X.73k r8 = new X.73k
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)
            r4.Bp1(r8)
            return
        L_0x051f:
            com.whatsapp.jid.PhoneUserJid r3 = X.C36441kJ.A0n(r3)
            goto L_0x04fa
        L_0x0524:
            java.lang.Object r0 = r1.A00
            X.6qn r0 = (X.C143586qn) r0
            X.04e r2 = r0.A01
            java.lang.String r0 = "android.settings.LOCATION_SOURCE_SETTINGS"
            android.content.Intent r1 = X.C36441kJ.A0I(r0)
            r0 = 0
            r2.A01(r0, r1)
            return
        L_0x0535:
            java.lang.Object r0 = r1.A00
            com.whatsapp.businessdirectory.view.fragment.BusinessDirectoryContextualSearchFragment r0 = (com.whatsapp.businessdirectory.view.fragment.BusinessDirectoryContextualSearchFragment) r0
            com.whatsapp.businessdirectory.viewmodel.BusinessDirectoryContextualSearchViewModel r0 = r0.A08
            X.6pD r1 = r0.A0M
            java.lang.Integer r2 = X.C129006Eo.A00(r0)
            r5 = 1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
            r6 = 37
            r4 = 0
            r7 = 1
            r1.A08(r2, r3, r4, r5, r6, r7)
            X.6PX r5 = r0.A0S
            X.66j r4 = r5.A04
            java.util.List r3 = r4.A00()
            r3.clear()
            X.67k r2 = r4.A00
            X.0wU r1 = r2.A03
            r0 = 23
            X.C1501874h.A01(r1, r2, r3, r0)
            java.util.List r1 = r4.A00()
            X.00s r0 = r5.A00
            r0.A0D(r1)
            return
        L_0x056b:
            java.lang.Object r3 = r1.A00
            X.6Za r3 = (X.C133566Za) r3
            X.155 r2 = r3.A07
            java.lang.String r0 = "android.settings.LOCATION_SOURCE_SETTINGS"
            android.content.Intent r1 = X.C36441kJ.A0I(r0)
            r0 = 0
            r2.startActivityForResult(r1, r0)
            X.155 r1 = r3.A07
        L_0x057d:
            r0 = 2
            X.AnonymousClass3SJ.A00(r1, r0)
            return
        L_0x0582:
            java.lang.Object r2 = r1.A00
            X.14p r2 = (X.C224914p) r2
            java.lang.String r0 = "android.settings.LOCATION_SOURCE_SETTINGS"
            android.content.Intent r1 = X.C36441kJ.A0I(r0)
            r0 = 35
            r2.startActivityForResult(r1, r0)
            r3.dismiss()
            return
        L_0x0595:
            java.lang.Object r0 = r1.A00
            X.7ry r0 = (X.C164537ry) r0
            java.lang.Object r0 = r0.A00
            com.whatsapp.businessdirectory.view.activity.DirectorySetLocationMapActivity r0 = (com.whatsapp.businessdirectory.view.activity.DirectorySetLocationMapActivity) r0
            com.whatsapp.businessdirectory.view.activity.DirectorySetLocationMapActivity.A0K(r0)
            return
        L_0x05a1:
            java.lang.Object r0 = r1.A00
            com.whatsapp.businessdirectory.view.activity.DirectorySetLocationMapActivity r0 = (com.whatsapp.businessdirectory.view.activity.DirectorySetLocationMapActivity) r0
            com.whatsapp.businessdirectory.view.activity.DirectorySetLocationMapActivity.A0F(r0)
            return
        L_0x05a9:
            java.lang.Object r1 = r1.A00
            android.content.DialogInterface$OnCancelListener r1 = (android.content.DialogInterface.OnCancelListener) r1
            java.util.concurrent.Executor r0 = X.AnonymousClass6Y6.A00
            r1.onCancel(r3)
            return
        L_0x05b3:
            java.lang.Object r0 = r1.A00
            com.whatsapp.backup.encryptedbackup.PasswordInputFragment r0 = (com.whatsapp.backup.encryptedbackup.PasswordInputFragment) r0
            com.whatsapp.backup.encryptedbackup.EncBackupViewModel r0 = r0.A03
            r1 = 0
            X.00s r0 = r0.A07
            X.C36341k9.A16(r0, r1)
            return
        L_0x05c0:
            java.lang.Object r1 = r1.A00
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 1
            X.AnonymousClass3SJ.A00(r1, r0)
            return
        L_0x05c9:
            java.lang.Object r2 = r1.A00
            X.5JX r2 = (X.AnonymousClass5JX) r2
            android.app.Activity r1 = r2.A01
            r0 = 106(0x6a, float:1.49E-43)
            X.AnonymousClass3SJ.A00(r1, r0)
            java.lang.String r0 = "restore>VerifyMessageStoreHelper/dialog/checknorestore/restore"
            goto L_0x0611
        L_0x05d7:
            java.lang.Object r2 = r1.A00
            X.5JX r2 = (X.AnonymousClass5JX) r2
            android.app.Activity r1 = r2.A01
            r0 = 106(0x6a, float:1.49E-43)
            X.AnonymousClass3SJ.A00(r1, r0)
            java.lang.String r0 = "restore>VerifyMessageStoreHelper/dialog/checknorestore/skiprestore"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = 0
            r2.A00 = r0
            r2.Bp4(r0, r0)
            return
        L_0x05ee:
            java.lang.Object r0 = r1.A00
            X.5JX r0 = (X.AnonymousClass5JX) r0
            android.app.Activity r1 = r0.A01
            r0 = 105(0x69, float:1.47E-43)
            X.AnonymousClass3SJ.A00(r1, r0)
            java.lang.String r0 = "restore>VerifyMessageStoreHelper/dialog/restoreduetoerror/skiprestore"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = 106(0x6a, float:1.49E-43)
            X.AnonymousClass3SJ.A01(r1, r0)
            return
        L_0x0604:
            java.lang.Object r2 = r1.A00
            X.5JX r2 = (X.AnonymousClass5JX) r2
            android.app.Activity r1 = r2.A01
            r0 = 105(0x69, float:1.47E-43)
            X.AnonymousClass3SJ.A00(r1, r0)
            java.lang.String r0 = "restore>VerifyMessageStoreHelper/dialog/restoreduetoerror/restore"
        L_0x0611:
            com.whatsapp.util.Log.i((java.lang.String) r0)
            goto L_0x0631
        L_0x0615:
            java.lang.Object r0 = r1.A00
            X.5JX r0 = (X.AnonymousClass5JX) r0
            android.app.Activity r1 = r0.A01
            r0 = 103(0x67, float:1.44E-43)
            X.AnonymousClass3SJ.A00(r1, r0)
            r0 = 106(0x6a, float:1.49E-43)
            X.AnonymousClass3SJ.A01(r1, r0)
            return
        L_0x0626:
            java.lang.Object r2 = r1.A00
            X.5JX r2 = (X.AnonymousClass5JX) r2
            android.app.Activity r1 = r2.A01
            r0 = 103(0x67, float:1.44E-43)
            X.AnonymousClass3SJ.A00(r1, r0)
        L_0x0631:
            r1 = 1
            r2.A00 = r1
            r0 = 0
            r2.Bp4(r1, r0)
            return
        L_0x0639:
            java.lang.Object r2 = r1.A00
            X.5JX r2 = (X.AnonymousClass5JX) r2
            android.app.Activity r1 = r2.A01
            r0 = 107(0x6b, float:1.5E-43)
            X.AnonymousClass3SJ.A00(r1, r0)
            r0 = 0
            r2.A00 = r0
            r2.Bp4(r0, r0)
            return
        L_0x064b:
            java.lang.Object r1 = r1.A00
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 500(0x1f4, float:7.0E-43)
            X.AnonymousClass3SJ.A00(r1, r0)
            return
        L_0x0655:
            java.lang.String r0 = "accountSwitchingLogger"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x065c:
            java.lang.String r0 = "accountSwitcher"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0663:
            X.1RU r0 = r4.A01
            if (r0 == 0) goto L_0x0681
            r1 = 2131886306(0x7f1200e2, float:1.9407187E38)
            r0 = 2131893506(0x7f121d02, float:1.942179E38)
            X.AnonymousClass1RU.A01(r4, r3, r1, r0)
            X.6TO r1 = r4.A02
            if (r1 == 0) goto L_0x067a
            r0 = 23
            r1.A02(r3, r2, r0)
            return
        L_0x067a:
            java.lang.String r0 = "accountSwitchingLogger"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0681:
            java.lang.String r0 = "accountSwitcher"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0688:
            r0 = 0
            X.AnonymousClass3SJ.A01(r4, r0)
            X.1bF r1 = r4.A03
            if (r1 == 0) goto L_0x06b8
            X.6yZ r2 = new X.6yZ
            r2.<init>(r4)
            java.lang.String r0 = "gcm"
            X.19A r3 = r1.A01
            java.lang.String r6 = r3.A09()
            X.8uq r1 = new X.8uq
            r1.<init>(r0)
            X.1jS r0 = new X.1jS
            r0.<init>((X.C16490pK) r1, (java.lang.String) r6)
            X.9nx r5 = r0.A00
            X.AnonymousClass00C.A08(r5)
            r0 = 2
            X.7tP r4 = new X.7tP
            r4.<init>(r2, r0)
            r8 = 32000(0x7d00, double:1.581E-319)
            r3.A0K(r4, r5, r6, r7, r8)
            return
        L_0x06b8:
            java.lang.String r0 = "pushXmppMethods"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x06bf:
            java.lang.String r0 = "accountSwitcherBridge"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x06c6:
            java.lang.String r0 = "accountSwitchingLogger"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C163297py.onClick(android.content.DialogInterface, int):void");
    }
}
