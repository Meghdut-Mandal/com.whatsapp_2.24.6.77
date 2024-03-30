package X;

import android.view.View;

/* renamed from: X.3Y1  reason: invalid class name */
public class AnonymousClass3Y1 implements View.OnClickListener {
    public Object A00;
    public final int A01;

    public AnonymousClass3Y1(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public static void A00(View view, Object obj, int i) {
        view.setOnClickListener(new AnonymousClass3Y1(obj, i));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v29, resolved type: com.whatsapp.expressionstray.stickers.StickerMakerChoiceBottomSheet} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v64, resolved type: com.whatsapp.expressionstray.stickers.StickerMakerChoiceBottomSheet} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v66, resolved type: com.whatsapp.expressionstray.stickers.SearchFunStickersBottomSheet} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v67, resolved type: com.whatsapp.expressionstray.stickers.StickerMakerChoiceBottomSheet} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v68, resolved type: com.whatsapp.expressionstray.stickers.StickerMakerChoiceBottomSheet} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v69, resolved type: com.whatsapp.expressionstray.stickers.StickerMakerChoiceBottomSheet} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v70, resolved type: com.whatsapp.expressionstray.stickers.StickerMakerChoiceBottomSheet} */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x02dc, code lost:
        if (r1.A04.A0E(4643) == false) goto L_0x02de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x0373, code lost:
        X.C36331k8.A1T(r2, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x0376, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x007d, code lost:
        if (r1 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x007f, code lost:
        r1.invoke();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0082, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00d4, code lost:
        if (r0 == null) goto L_0x0014;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00d6, code lost:
        r0.invoke();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0014, code lost:
        r1.A1b();
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r12) {
        /*
            r11 = this;
            int r0 = r11.A01
            r7 = r12
            switch(r0) {
                case 0: goto L_0x00db;
                case 1: goto L_0x012c;
                case 2: goto L_0x033d;
                case 3: goto L_0x0132;
                case 4: goto L_0x015d;
                case 5: goto L_0x01b0;
                case 6: goto L_0x01eb;
                case 7: goto L_0x01f3;
                case 8: goto L_0x01fb;
                case 9: goto L_0x0203;
                case 10: goto L_0x020b;
                case 11: goto L_0x0213;
                case 12: goto L_0x021b;
                case 13: goto L_0x0223;
                case 14: goto L_0x022b;
                case 15: goto L_0x0233;
                case 16: goto L_0x023b;
                case 17: goto L_0x0243;
                case 18: goto L_0x024b;
                case 19: goto L_0x0253;
                case 20: goto L_0x025b;
                case 21: goto L_0x0263;
                case 22: goto L_0x026b;
                case 23: goto L_0x0018;
                case 24: goto L_0x001d;
                case 25: goto L_0x0273;
                case 26: goto L_0x0287;
                case 27: goto L_0x0287;
                case 28: goto L_0x034a;
                case 29: goto L_0x0041;
                case 30: goto L_0x004a;
                case 31: goto L_0x0053;
                case 32: goto L_0x0053;
                case 33: goto L_0x005a;
                case 34: goto L_0x0063;
                case 35: goto L_0x006c;
                case 36: goto L_0x0075;
                case 37: goto L_0x0006;
                case 38: goto L_0x0090;
                case 39: goto L_0x0006;
                case 40: goto L_0x0083;
                case 41: goto L_0x0090;
                case 42: goto L_0x0006;
                case 43: goto L_0x0291;
                case 44: goto L_0x0320;
                case 45: goto L_0x0329;
                case 46: goto L_0x0361;
                case 47: goto L_0x033d;
                case 48: goto L_0x00c7;
                case 49: goto L_0x00ce;
                default: goto L_0x0006;
            }
        L_0x0006:
            java.lang.Object r1 = r11.A00
            com.whatsapp.expressionstray.stickers.SearchFunStickersBottomSheet r1 = (com.whatsapp.expressionstray.stickers.SearchFunStickersBottomSheet) r1
            com.whatsapp.WaEditText r0 = r1.A09
            if (r0 == 0) goto L_0x0014
            r0.A0B()
            r0.clearFocus()
        L_0x0014:
            r1.A1b()
        L_0x0017:
            return
        L_0x0018:
            java.lang.Object r1 = r11.A00
            X.00S r1 = (X.AnonymousClass00S) r1
            goto L_0x007f
        L_0x001d:
            java.lang.Object r2 = r11.A00
            com.whatsapp.expressionstray.conversation.ExpressionsKeyboardSearchBottomSheet r2 = (com.whatsapp.expressionstray.conversation.ExpressionsKeyboardSearchBottomSheet) r2
            android.view.ViewGroup r1 = r2.A02
            if (r1 == 0) goto L_0x0017
            X.00T r0 = r2.A0S
            java.lang.Object r4 = r0.getValue()
            com.whatsapp.expressionstray.ExpressionsSearchViewModel r4 = (com.whatsapp.expressionstray.ExpressionsSearchViewModel) r4
            X.1N2 r0 = r2.A0O
            if (r0 == 0) goto L_0x0343
            boolean r1 = X.AnonymousClass1N2.A00(r1)
            X.040 r3 = X.C109325Xd.A00(r4)
            r0 = 0
            com.whatsapp.expressionstray.ExpressionsSearchViewModel$onBackButtonClick$1 r2 = new com.whatsapp.expressionstray.ExpressionsSearchViewModel$onBackButtonClick$1
            r2.<init>(r4, r0, r1)
            goto L_0x0373
        L_0x0041:
            java.lang.Object r1 = r11.A00
            X.56E r1 = (X.AnonymousClass56E) r1
            java.util.List r0 = X.AnonymousClass0D3.A0I
            X.00S r1 = r1.A02
            goto L_0x007d
        L_0x004a:
            java.lang.Object r1 = r11.A00
            X.56E r1 = (X.AnonymousClass56E) r1
            java.util.List r0 = X.AnonymousClass0D3.A0I
            X.00S r1 = r1.A01
            goto L_0x007d
        L_0x0053:
            java.lang.Object r1 = r11.A00
            X.00S r1 = (X.AnonymousClass00S) r1
            java.util.List r0 = X.AnonymousClass0D3.A0I
            goto L_0x007d
        L_0x005a:
            java.lang.Object r1 = r11.A00
            X.56F r1 = (X.AnonymousClass56F) r1
            java.util.List r0 = X.AnonymousClass0D3.A0I
            X.00S r1 = r1.A02
            goto L_0x007d
        L_0x0063:
            java.lang.Object r1 = r11.A00
            X.56F r1 = (X.AnonymousClass56F) r1
            java.util.List r0 = X.AnonymousClass0D3.A0I
            X.00S r1 = r1.A01
            goto L_0x007d
        L_0x006c:
            java.lang.Object r1 = r11.A00
            X.56H r1 = (X.AnonymousClass56H) r1
            java.util.List r0 = X.AnonymousClass0D3.A0I
            X.00S r1 = r1.A03
            goto L_0x007d
        L_0x0075:
            java.lang.Object r1 = r11.A00
            X.56H r1 = (X.AnonymousClass56H) r1
            java.util.List r0 = X.AnonymousClass0D3.A0I
            X.00S r1 = r1.A04
        L_0x007d:
            if (r1 == 0) goto L_0x0017
        L_0x007f:
            r1.invoke()
            return
        L_0x0083:
            java.lang.Object r0 = r11.A00
            com.whatsapp.expressionstray.stickers.SearchFunStickersBottomSheet r0 = (com.whatsapp.expressionstray.stickers.SearchFunStickersBottomSheet) r0
            com.whatsapp.WaEditText r1 = r0.A09
            if (r1 == 0) goto L_0x0017
            r0 = 0
            r1.setText(r0)
            return
        L_0x0090:
            java.lang.Object r4 = r11.A00
            com.whatsapp.expressionstray.stickers.SearchFunStickersBottomSheet r4 = (com.whatsapp.expressionstray.stickers.SearchFunStickersBottomSheet) r4
            com.whatsapp.WaTextView r1 = r4.A0G
            r0 = 0
            if (r1 == 0) goto L_0x009d
            java.lang.CharSequence r0 = r1.getText()
        L_0x009d:
            java.lang.String r3 = java.lang.String.valueOf(r0)
            java.lang.String r2 = "\""
            java.lang.String r1 = ""
            r0 = 0
            java.lang.String r2 = X.AnonymousClass098.A05(r3, r2, r1, r0)
            boolean r0 = X.AnonymousClass098.A06(r2)
            if (r0 != 0) goto L_0x0017
            com.whatsapp.WaEditText r0 = r4.A09
            if (r0 == 0) goto L_0x00b7
            r0.setText(r2)
        L_0x00b7:
            com.whatsapp.WaEditText r1 = r4.A09
            if (r1 == 0) goto L_0x00c2
            int r0 = r2.length()
            r1.setSelection(r0)
        L_0x00c2:
            r0 = 0
            com.whatsapp.expressionstray.stickers.SearchFunStickersBottomSheet.A0D(r4, r0)
            return
        L_0x00c7:
            java.lang.Object r1 = r11.A00
            com.whatsapp.expressionstray.stickers.StickerMakerChoiceBottomSheet r1 = (com.whatsapp.expressionstray.stickers.StickerMakerChoiceBottomSheet) r1
            X.00S r0 = r1.A01
            goto L_0x00d4
        L_0x00ce:
            java.lang.Object r1 = r11.A00
            com.whatsapp.expressionstray.stickers.StickerMakerChoiceBottomSheet r1 = (com.whatsapp.expressionstray.stickers.StickerMakerChoiceBottomSheet) r1
            X.00S r0 = r1.A00
        L_0x00d4:
            if (r0 == 0) goto L_0x0014
            r0.invoke()
            goto L_0x0014
        L_0x00db:
            java.lang.Object r5 = r11.A00
            com.whatsapp.events.EventCreateOrEditFragment r5 = (com.whatsapp.events.EventCreateOrEditFragment) r5
            android.view.View r0 = r5.A0F
            if (r0 == 0) goto L_0x00f0
            android.view.View r1 = r0.findFocus()
            if (r1 == 0) goto L_0x00f0
            X.1N2 r0 = r5.A0N
            if (r0 == 0) goto L_0x0125
            r0.A01(r1)
        L_0x00f0:
            X.2XH r1 = r5.A0L
            if (r1 == 0) goto L_0x011e
            android.content.Context r0 = r5.A1D()
            boolean r4 = r1.A05(r0)
            android.content.Context r3 = r5.A0a()
            android.content.Intent r2 = X.C36431kI.A0D()
            r1 = 2
            java.lang.String r0 = "mode"
            r2.putExtra(r0, r1)
            java.lang.String r1 = r3.getPackageName()
            if (r4 == 0) goto L_0x011b
            java.lang.String r0 = "com.whatsapp.location.LocationPicker2"
        L_0x0112:
            r2.setClassName(r1, r0)
            X.04e r0 = r5.A0W
            r0.A02(r2)
            return
        L_0x011b:
            java.lang.String r0 = "com.whatsapp.location.LocationPicker"
            goto L_0x0112
        L_0x011e:
            java.lang.String r0 = "locationUtils"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0125:
            java.lang.String r0 = "imeUtils"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x012c:
            java.lang.Object r0 = r11.A00
            X.C36411kG.A1N(r0)
            return
        L_0x0132:
            java.lang.Object r2 = r11.A00
            com.whatsapp.events.EventInfoBottomSheet r2 = (com.whatsapp.events.EventInfoBottomSheet) r2
            X.01z r0 = r2.A0k()
            X.021 r0 = r0.A0T
            java.util.List r0 = r0.A04()
            X.AnonymousClass00C.A08(r0)
            java.lang.Object r1 = X.C007103b.A0O(r0)
            X.02E r1 = (X.AnonymousClass02E) r1
            boolean r0 = r1 instanceof com.whatsapp.events.EventCreateOrEditFragment
            if (r0 == 0) goto L_0x0159
            com.whatsapp.events.EventCreateOrEditFragment r1 = (com.whatsapp.events.EventCreateOrEditFragment) r1
            boolean r0 = r1.A1Z()
            if (r0 == 0) goto L_0x0159
            com.whatsapp.events.EventInfoBottomSheet.A05(r2)
            return
        L_0x0159:
            r2.A1b()
            return
        L_0x015d:
            java.lang.Object r5 = r11.A00
            com.whatsapp.events.EventResponseBottomSheet r5 = (com.whatsapp.events.EventResponseBottomSheet) r5
            X.00T r0 = r5.A06
            java.lang.Object r0 = r0.getValue()
            X.2pC r4 = X.C52292pC.GOING
            if (r0 == r4) goto L_0x018d
            X.005 r0 = r5.A03
            if (r0 == 0) goto L_0x01a9
            java.lang.Object r3 = r0.get()
            X.1X4 r3 = (X.AnonymousClass1X4) r3
            X.00T r0 = r5.A07
            java.lang.Object r2 = r0.getValue()
            X.1Xa r0 = r3.A0i
            X.0yC r1 = r0.A03
            r0 = 5563(0x15bb, float:7.795E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x018d
            X.0wU r1 = r3.A1J
            r0 = 4
            X.C36371kC.A1Q(r1, r3, r4, r2, r0)
        L_0x018d:
            r5.A1b()
            X.005 r0 = r5.A02
            if (r0 == 0) goto L_0x01a2
            java.lang.Object r1 = r0.get()
            X.3Di r1 = (X.C61763Di) r1
            X.01I r0 = r5.A0i()
            r1.A00(r0)
            return
        L_0x01a2:
            java.lang.String r0 = "eventRequestExactAlarmPermissionUtil"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x01a9:
            java.lang.String r0 = "userActions"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x01b0:
            java.lang.Object r5 = r11.A00
            com.whatsapp.events.EventResponseBottomSheet r5 = (com.whatsapp.events.EventResponseBottomSheet) r5
            X.00T r0 = r5.A06
            java.lang.Object r0 = r0.getValue()
            X.2pC r4 = X.C52292pC.NOT_GOING
            if (r0 == r4) goto L_0x01e0
            X.005 r0 = r5.A03
            if (r0 == 0) goto L_0x01e4
            java.lang.Object r3 = r0.get()
            X.1X4 r3 = (X.AnonymousClass1X4) r3
            X.00T r0 = r5.A07
            java.lang.Object r2 = r0.getValue()
            X.1Xa r0 = r3.A0i
            X.0yC r1 = r0.A03
            r0 = 5563(0x15bb, float:7.795E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x01e0
            X.0wU r1 = r3.A1J
            r0 = 4
            X.C36371kC.A1Q(r1, r3, r4, r2, r0)
        L_0x01e0:
            r5.A1b()
            return
        L_0x01e4:
            java.lang.String r0 = "userActions"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x01eb:
            java.lang.Object r0 = r11.A00
            X.1q8 r0 = (X.C38811q8) r0
            X.C38811q8.setUpContextMenu$lambda$2$lambda$1(r0, r12)
            return
        L_0x01f3:
            java.lang.Object r0 = r11.A00
            X.14u r0 = (X.C225314u) r0
            r0.onBackPressed()
            return
        L_0x01fb:
            java.lang.Object r0 = r11.A00
            com.whatsapp.expressionstray.avatars.AvatarStickersCategoriesView r0 = (com.whatsapp.expressionstray.avatars.AvatarStickersCategoriesView) r0
            com.whatsapp.expressionstray.avatars.AvatarStickersCategoriesView.setClickListeners$lambda$8(r0, r12)
            return
        L_0x0203:
            java.lang.Object r0 = r11.A00
            com.whatsapp.expressionstray.avatars.AvatarStickersCategoriesView r0 = (com.whatsapp.expressionstray.avatars.AvatarStickersCategoriesView) r0
            com.whatsapp.expressionstray.avatars.AvatarStickersCategoriesView.setClickListeners$lambda$11(r0, r12)
            return
        L_0x020b:
            java.lang.Object r0 = r11.A00
            com.whatsapp.expressionstray.avatars.AvatarStickersCategoriesView r0 = (com.whatsapp.expressionstray.avatars.AvatarStickersCategoriesView) r0
            com.whatsapp.expressionstray.avatars.AvatarStickersCategoriesView.setClickListeners$lambda$13(r0, r12)
            return
        L_0x0213:
            java.lang.Object r0 = r11.A00
            com.whatsapp.expressionstray.avatars.AvatarStickersCategoriesView r0 = (com.whatsapp.expressionstray.avatars.AvatarStickersCategoriesView) r0
            com.whatsapp.expressionstray.avatars.AvatarStickersCategoriesView.setClickListeners$lambda$10(r0, r12)
            return
        L_0x021b:
            java.lang.Object r0 = r11.A00
            com.whatsapp.expressionstray.avatars.AvatarStickersCategoriesView r0 = (com.whatsapp.expressionstray.avatars.AvatarStickersCategoriesView) r0
            com.whatsapp.expressionstray.avatars.AvatarStickersCategoriesView.setRecentEnabled$lambda$2(r0, r12)
            return
        L_0x0223:
            java.lang.Object r0 = r11.A00
            com.whatsapp.expressionstray.avatars.AvatarStickersCategoriesView r0 = (com.whatsapp.expressionstray.avatars.AvatarStickersCategoriesView) r0
            com.whatsapp.expressionstray.avatars.AvatarStickersCategoriesView.setStarredEnabled$lambda$5(r0, r12)
            return
        L_0x022b:
            java.lang.Object r0 = r11.A00
            com.whatsapp.expressionstray.avatars.AvatarStickersCategoriesView r0 = (com.whatsapp.expressionstray.avatars.AvatarStickersCategoriesView) r0
            com.whatsapp.expressionstray.avatars.AvatarStickersCategoriesView.setClickListeners$lambda$12(r0, r12)
            return
        L_0x0233:
            java.lang.Object r0 = r11.A00
            com.whatsapp.expressionstray.avatars.AvatarStickersCategoriesView r0 = (com.whatsapp.expressionstray.avatars.AvatarStickersCategoriesView) r0
            com.whatsapp.expressionstray.avatars.AvatarStickersCategoriesView.setRecentEnabled$lambda$3(r0, r12)
            return
        L_0x023b:
            java.lang.Object r0 = r11.A00
            com.whatsapp.expressionstray.avatars.AvatarStickersCategoriesView r0 = (com.whatsapp.expressionstray.avatars.AvatarStickersCategoriesView) r0
            com.whatsapp.expressionstray.avatars.AvatarStickersCategoriesView.setClickListeners$lambda$9(r0, r12)
            return
        L_0x0243:
            java.lang.Object r0 = r11.A00
            com.whatsapp.expressionstray.avatars.AvatarStickersCategoriesView r0 = (com.whatsapp.expressionstray.avatars.AvatarStickersCategoriesView) r0
            com.whatsapp.expressionstray.avatars.AvatarStickersCategoriesView.setStarredEnabled$lambda$4(r0, r12)
            return
        L_0x024b:
            java.lang.Object r0 = r11.A00
            com.whatsapp.expressionstray.avatars.AvatarStickersCategoriesView r0 = (com.whatsapp.expressionstray.avatars.AvatarStickersCategoriesView) r0
            com.whatsapp.expressionstray.avatars.AvatarStickersCategoriesView.setClickListeners$lambda$14(r0, r12)
            return
        L_0x0253:
            java.lang.Object r0 = r11.A00
            com.whatsapp.expressionstray.avatars.AvatarStickersCategoriesView r0 = (com.whatsapp.expressionstray.avatars.AvatarStickersCategoriesView) r0
            com.whatsapp.expressionstray.avatars.AvatarStickersCategoriesView.setClickListeners$lambda$7(r0, r12)
            return
        L_0x025b:
            java.lang.Object r0 = r11.A00
            com.whatsapp.expressionstray.avatars.AvatarStickersCategoriesView r0 = (com.whatsapp.expressionstray.avatars.AvatarStickersCategoriesView) r0
            com.whatsapp.expressionstray.avatars.AvatarStickersCategoriesView.setClickListeners$lambda$6(r0, r12)
            return
        L_0x0263:
            java.lang.Object r0 = r11.A00
            com.whatsapp.expressionstray.conversation.ExpressionsBottomSheetView r0 = (com.whatsapp.expressionstray.conversation.ExpressionsBottomSheetView) r0
            com.whatsapp.expressionstray.conversation.ExpressionsBottomSheetView.A06(r0)
            return
        L_0x026b:
            java.lang.Object r0 = r11.A00
            com.whatsapp.expressionstray.conversation.ExpressionsBottomSheetView r0 = (com.whatsapp.expressionstray.conversation.ExpressionsBottomSheetView) r0
            com.whatsapp.expressionstray.conversation.ExpressionsBottomSheetView.A05(r0)
            return
        L_0x0273:
            java.lang.Object r1 = r11.A00
            com.whatsapp.expressionstray.conversation.ExpressionsKeyboardSearchBottomSheet r1 = (com.whatsapp.expressionstray.conversation.ExpressionsKeyboardSearchBottomSheet) r1
            r0 = 1
            r1.A0R = r0
            com.whatsapp.WaEditText r0 = r1.A0B
            if (r0 == 0) goto L_0x0281
            X.C36391kE.A1K(r0)
        L_0x0281:
            com.whatsapp.WaEditText r0 = r1.A0B
            X.C36421kH.A1D(r0)
            return
        L_0x0287:
            java.lang.Object r1 = r11.A00
            android.view.View r1 = (android.view.View) r1
            r0 = 8
            r1.setVisibility(r0)
            return
        L_0x0291:
            java.lang.Object r2 = r11.A00
            com.whatsapp.expressionstray.stickers.SearchFunStickersBottomSheet r2 = (com.whatsapp.expressionstray.stickers.SearchFunStickersBottomSheet) r2
            X.AnonymousClass00C.A0B(r12)
            android.content.Context r6 = r2.A0a()
            X.0yC r0 = r2.A0L
            if (r0 == 0) goto L_0x031b
            int r10 = X.C55822vF.A00(r0)
            r8 = 8388613(0x800005, float:1.175495E-38)
            r9 = 0
            X.0Ws r5 = new X.0Ws
            r5.<init>(r6, r7, r8, r9, r10)
            android.content.Context r0 = r5.A02
            X.0EG r1 = new X.0EG
            r1.<init>(r0)
            r0 = 2131820561(0x7f110011, float:1.927384E38)
            X.07a r3 = r5.A03
            r1.inflate(r0, r3)
            r0 = 2131430448(0x7f0b0c30, float:1.8482597E38)
            android.view.MenuItem r4 = r3.findItem(r0)
            X.00T r0 = r2.A0X
            java.lang.Object r0 = r0.getValue()
            com.whatsapp.expressionstray.stickers.funstickers.viewmodels.SearchFunStickersViewModel r0 = (com.whatsapp.expressionstray.stickers.funstickers.viewmodels.SearchFunStickersViewModel) r0
            X.3Kn r1 = r0.A0K
            boolean r0 = r1.A00()
            if (r0 == 0) goto L_0x02de
            X.0yC r1 = r1.A04
            r0 = 4643(0x1223, float:6.506E-42)
            boolean r1 = r1.A0E(r0)
            r0 = 1
            if (r1 != 0) goto L_0x02df
        L_0x02de:
            r0 = 0
        L_0x02df:
            r4.setVisible(r0)
            r0 = 2131430444(0x7f0b0c2c, float:1.848259E38)
            android.view.MenuItem r1 = r3.findItem(r0)
            boolean r0 = com.whatsapp.expressionstray.stickers.SearchFunStickersBottomSheet.A0E(r2)
            r1.setVisible(r0)
            boolean r0 = com.whatsapp.expressionstray.stickers.SearchFunStickersBottomSheet.A0E(r2)
            if (r0 == 0) goto L_0x0303
            r0 = 2131430452(0x7f0b0c34, float:1.8482605E38)
            android.view.MenuItem r1 = r3.findItem(r0)
            r0 = 2131889729(0x7f120e41, float:1.941413E38)
            r1.setTitle(r0)
        L_0x0303:
            X.0yC r0 = r2.A0L
            if (r0 == 0) goto L_0x0316
            boolean r0 = X.C36361kB.A1Y(r0)
            if (r0 == 0) goto L_0x0310
            r0 = 1
            r3.A0C = r0
        L_0x0310:
            r5.A01 = r2
            r5.A00()
            return
        L_0x0316:
            java.lang.RuntimeException r0 = X.C36321k7.A07()
            throw r0
        L_0x031b:
            java.lang.RuntimeException r0 = X.C36321k7.A07()
            throw r0
        L_0x0320:
            java.lang.Object r1 = r11.A00
            com.whatsapp.expressionstray.stickers.SearchFunStickersBottomSheet r1 = (com.whatsapp.expressionstray.stickers.SearchFunStickersBottomSheet) r1
            r0 = 0
            com.whatsapp.expressionstray.stickers.SearchFunStickersBottomSheet.A0D(r1, r0)
            return
        L_0x0329:
            java.lang.Object r0 = r11.A00
            com.whatsapp.expressionstray.stickers.SearchFunStickersBottomSheet r0 = (com.whatsapp.expressionstray.stickers.SearchFunStickersBottomSheet) r0
            X.00T r0 = r0.A0X
            java.lang.Object r0 = r0.getValue()
            com.whatsapp.expressionstray.stickers.funstickers.viewmodels.SearchFunStickersViewModel r0 = (com.whatsapp.expressionstray.stickers.funstickers.viewmodels.SearchFunStickersViewModel) r0
            X.00s r1 = r0.A0D
            X.56c r0 = X.C1036056c.A00
            r1.A0D(r0)
            return
        L_0x033d:
            java.lang.Object r0 = r11.A00
            X.C36431kI.A1N(r0)
            return
        L_0x0343:
            java.lang.String r0 = "imeUtils"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x034a:
            java.lang.Object r0 = r11.A00
            com.whatsapp.expressionstray.gifs.GifExpressionsFragment r0 = (com.whatsapp.expressionstray.gifs.GifExpressionsFragment) r0
            X.00T r0 = r0.A0B
            java.lang.Object r1 = r0.getValue()
            com.whatsapp.expressionstray.gifs.GifExpressionsSearchViewModel r1 = (com.whatsapp.expressionstray.gifs.GifExpressionsSearchViewModel) r1
            X.040 r3 = X.C109325Xd.A00(r1)
            r0 = 0
            com.whatsapp.expressionstray.gifs.GifExpressionsSearchViewModel$retry$1 r2 = new com.whatsapp.expressionstray.gifs.GifExpressionsSearchViewModel$retry$1
            r2.<init>(r1, r0)
            goto L_0x0373
        L_0x0361:
            java.lang.Object r0 = r11.A00
            com.whatsapp.expressionstray.stickers.StickerExpressionsFragment r0 = (com.whatsapp.expressionstray.stickers.StickerExpressionsFragment) r0
            com.whatsapp.expressionstray.stickers.StickerExpressionsViewModel r1 = com.whatsapp.expressionstray.stickers.StickerExpressionsFragment.A03(r0)
            X.040 r3 = X.C109325Xd.A00(r1)
            r0 = 0
            com.whatsapp.expressionstray.stickers.StickerExpressionsViewModel$onStickersStoreClick$1 r2 = new com.whatsapp.expressionstray.stickers.StickerExpressionsViewModel$onStickersStoreClick$1
            r2.<init>(r1, r0)
        L_0x0373:
            X.C36331k8.A1T(r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3Y1.onClick(android.view.View):void");
    }
}
