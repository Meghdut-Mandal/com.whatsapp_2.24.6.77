package X;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.whatsapp.calling.callhistory.group.GroupCallParticipantPickerSheet;
import com.whatsapp.expressionstray.conversation.ExpressionsBottomSheetView;
import com.whatsapp.group.GroupProfileEmojiEditor;
import com.whatsapp.status.audienceselector.sharesheet.StatusAudienceSelectorShareSheetFragment;
import com.whatsapp.status.playback.MessageReplyActivity;

/* renamed from: X.4Vp  reason: invalid class name and case insensitive filesystem */
public class C89194Vp extends C06570Uc {
    public Object A00;
    public final int A01;

    public C89194Vp(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public static void A00(BottomSheetBehavior bottomSheetBehavior, Object obj, int i) {
        bottomSheetBehavior.A0a(new C89194Vp(obj, i));
    }

    public void A02(View view, float f) {
        C142466ov r2;
        float A0S;
        float f2;
        switch (this.A01) {
            case 2:
                GroupCallParticipantPickerSheet groupCallParticipantPickerSheet = (GroupCallParticipantPickerSheet) this.A00;
                int top = ((int) (((groupCallParticipantPickerSheet.A01 - ((float) view.getTop())) / groupCallParticipantPickerSheet.A00) * 127.0f)) << 24;
                groupCallParticipantPickerSheet.A02.setColor(top);
                groupCallParticipantPickerSheet.getWindow().setStatusBarColor(top);
                return;
            case 4:
                C70803fk r22 = (C70803fk) this.A00;
                ExpressionsBottomSheetView expressionsBottomSheetView = r22.A3l;
                if (expressionsBottomSheetView != null) {
                    expressionsBottomSheetView.A0E(1);
                    if (!r22.A6D) {
                        C70803fk.A0X(view, r22);
                        return;
                    }
                    return;
                }
                return;
            case 6:
                AnonymousClass00C.A0D(view, 0);
                AnonymousClass3UT r23 = (AnonymousClass3UT) this.A00;
                ExpressionsBottomSheetView expressionsBottomSheetView2 = r23.A0E;
                if (expressionsBottomSheetView2 != null) {
                    expressionsBottomSheetView2.A0E(1);
                    if (!r23.A0H) {
                        AnonymousClass3UT.A02(view, r23);
                        return;
                    }
                    return;
                }
                return;
            case 7:
                GroupProfileEmojiEditor groupProfileEmojiEditor = (GroupProfileEmojiEditor) this.A00;
                View view2 = groupProfileEmojiEditor.A02;
                if (view2 != null) {
                    GroupProfileEmojiEditor.A07(groupProfileEmojiEditor, (int) (C36441kJ.A02(view2) - view.getY()));
                    return;
                }
                return;
            case 8:
                if (f >= 0.0f) {
                    int height = view.getHeight();
                    r2 = (C142466ov) this.A00;
                    int A0S2 = r2.A0F.A0S();
                    f2 = ((float) (height - A0S2)) * f;
                    A0S = (float) A0S2;
                } else {
                    if (!Float.isNaN(f)) {
                        r2 = (C142466ov) this.A00;
                        A0S = (float) r2.A0F.A0S();
                        f2 = A0S * f;
                    }
                    ((C142466ov) this.A00).A0J.setOffset(f);
                    return;
                }
                C142466ov.A08(r2, A0S + f2, false);
                ((C142466ov) this.A00).A0J.setOffset(f);
                return;
            case 9:
                C142466ov r24 = (C142466ov) this.A00;
                C142466ov.A09(r24, ((float) r24.A0G.A0S()) + (C36441kJ.A02(view) * f), false);
                return;
            case 10:
                AnonymousClass00C.A0D(view, 0);
                AnonymousClass4UW r1 = (AnonymousClass4UW) ((StatusAudienceSelectorShareSheetFragment) this.A00).A0A.get();
                if (r1 != null) {
                    r1.BhU(view.getTop());
                    return;
                }
                return;
            case 11:
                if (f < 0.5f) {
                    MessageReplyActivity messageReplyActivity = (MessageReplyActivity) this.A00;
                    if (!messageReplyActivity.BLh()) {
                        MessageReplyActivity.A0i(messageReplyActivity);
                        MessageReplyActivity.A0O(messageReplyActivity);
                        return;
                    }
                    return;
                }
                return;
            case 12:
                C47592fB r4 = (C47592fB) this.A00;
                AnonymousClass3BK A0E = r4.A0E();
                A0E.A0B.setVisibility(0);
                A0E.A0B.setAlpha(f);
                ViewGroup viewGroup = A0E.A0E;
                float pow = 1.0f - ((float) Math.pow((double) f, 4.0d));
                viewGroup.setAlpha(pow);
                A0E.A0G.A01().setAlpha(pow);
                if (r4.A0P()) {
                    int i = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
                    boolean z = r4.A08;
                    if (i != 0) {
                        if (z) {
                            r4.A08 = false;
                            r4.A0O(false);
                        }
                    } else if (!z) {
                        r4.A08 = true;
                        r4.A0O(true);
                    }
                }
                C47592fB.A03(r4);
                return;
            default:
                return;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0227, code lost:
        if (r0.getVisibility() != 0) goto L_0x0229;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x0248, code lost:
        r0.A0E(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x024b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x02c1, code lost:
        ((androidx.fragment.app.DialogFragment) r8.A00).A1b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x02c8, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0032, code lost:
        X.C36351kA.A11((android.app.Activity) r8.A00);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0039, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0006, code lost:
        if (r10 != 4) goto L_0x0008;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00e5, code lost:
        if (r10 == 2) goto L_0x00e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000b, code lost:
        ((androidx.fragment.app.DialogFragment) r8.A00).A1c();
     */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x01ed  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00ed A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A03(android.view.View r9, int r10) {
        /*
            r8 = this;
            int r0 = r8.A01
            switch(r0) {
                case 0: goto L_0x02b4;
                case 1: goto L_0x0294;
                case 2: goto L_0x002f;
                case 3: goto L_0x0008;
                case 4: goto L_0x01f4;
                case 5: goto L_0x02bb;
                case 6: goto L_0x0141;
                case 7: goto L_0x0134;
                case 8: goto L_0x00c5;
                case 9: goto L_0x006e;
                case 10: goto L_0x0051;
                case 11: goto L_0x003a;
                case 12: goto L_0x02c9;
                case 13: goto L_0x0013;
                default: goto L_0x0005;
            }
        L_0x0005:
            r0 = 4
            if (r10 == r0) goto L_0x000b
        L_0x0008:
            r0 = 5
            if (r10 != r0) goto L_0x0012
        L_0x000b:
            java.lang.Object r0 = r8.A00
            androidx.fragment.app.DialogFragment r0 = (androidx.fragment.app.DialogFragment) r0
            r0.A1c()
        L_0x0012:
            return
        L_0x0013:
            r0 = 5
            if (r10 == r0) goto L_0x0032
            r0 = 4
            if (r10 == r0) goto L_0x0032
            r0 = 3
            if (r10 != r0) goto L_0x0012
            java.lang.Object r1 = r8.A00
            com.whatsapp.stickers.store.StickerStoreActivity r1 = (com.whatsapp.stickers.store.StickerStoreActivity) r1
            com.whatsapp.stickers.store.StickerStoreFeaturedTabFragment r0 = r1.A05
            if (r0 == 0) goto L_0x0027
            r0.A1Z()
        L_0x0027:
            com.whatsapp.stickers.store.StickerStoreMyTabFragment r0 = r1.A06
            if (r0 == 0) goto L_0x0012
            r0.A1Z()
            return
        L_0x002f:
            r0 = 5
            if (r10 != r0) goto L_0x0012
        L_0x0032:
            java.lang.Object r0 = r8.A00
            android.app.Activity r0 = (android.app.Activity) r0
            X.C36351kA.A11(r0)
            return
        L_0x003a:
            r0 = 4
            if (r10 != r0) goto L_0x0012
            java.lang.Object r1 = r8.A00
            com.whatsapp.status.playback.MessageReplyActivity r1 = (com.whatsapp.status.playback.MessageReplyActivity) r1
            r1.A3i()
            boolean r0 = r1.BLh()
            if (r0 != 0) goto L_0x0012
            com.whatsapp.status.playback.MessageReplyActivity.A0i(r1)
            com.whatsapp.status.playback.MessageReplyActivity.A0O(r1)
            return
        L_0x0051:
            r0 = 0
            X.AnonymousClass00C.A0D(r9, r0)
            r0 = 3
            if (r10 != r0) goto L_0x0012
            java.lang.Object r0 = r8.A00
            com.whatsapp.status.audienceselector.sharesheet.StatusAudienceSelectorShareSheetFragment r0 = (com.whatsapp.status.audienceselector.sharesheet.StatusAudienceSelectorShareSheetFragment) r0
            java.lang.ref.WeakReference r0 = r0.A0A
            java.lang.Object r1 = r0.get()
            X.4UW r1 = (X.AnonymousClass4UW) r1
            if (r1 == 0) goto L_0x0012
            int r0 = r9.getTop()
            r1.BhS(r0)
            return
        L_0x006e:
            r5 = 0
            r3 = 1
            r4 = 5
            if (r10 != r4) goto L_0x0099
            java.lang.Object r4 = r8.A00
            X.6ov r4 = (X.C142466ov) r4
            androidx.recyclerview.widget.RecyclerView r2 = r4.A0E
            r1 = -1
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            r0.<init>(r1, r5)
            r2.setLayoutParams(r0)
            r0 = 0
            X.C142466ov.A09(r4, r0, r3)
            X.C142466ov.A05(r4)
        L_0x0089:
            java.lang.Object r1 = r8.A00
            X.6ov r1 = (X.C142466ov) r1
            java.util.List r0 = r1.A19
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0012
            X.C142466ov.A05(r1)
            return
        L_0x0099:
            r0 = 3
            if (r10 != r0) goto L_0x0089
            java.lang.Object r2 = r8.A00
            X.6ov r2 = (X.C142466ov) r2
            com.google.android.material.bottomsheet.BottomSheetBehavior r1 = r2.A0F
            int r0 = r1.A0J
            if (r0 == r4) goto L_0x00c0
            r1.A0d(r3)
            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = r2.A0F
            r0.A0W(r4)
        L_0x00ae:
            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = r2.A0G
            int r0 = r0.A0S()
            int r0 = X.C36431kI.A04(r9, r0)
            float r0 = (float) r0
            X.C142466ov.A09(r2, r0, r3)
            r2.A0S()
            goto L_0x0089
        L_0x00c0:
            r0 = 0
            X.C142466ov.A08(r2, r0, r5)
            goto L_0x00ae
        L_0x00c5:
            r7 = 5
            r4 = 4
            r6 = 3
            r3 = 0
            r2 = 1
            if (r10 != r6) goto L_0x0113
            java.lang.Object r5 = r8.A00
            X.6ov r5 = (X.C142466ov) r5
            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = r5.A0G
            int r0 = r0.A0J
            if (r0 != r6) goto L_0x00f7
            com.google.android.material.bottomsheet.BottomSheetBehavior r5 = r5.A0F
        L_0x00d8:
            r5.A0W(r7)
        L_0x00db:
            java.lang.Object r6 = r8.A00
            X.6ov r6 = (X.C142466ov) r6
            com.whatsapp.location.DragBottomSheetIndicator r5 = r6.A0J
            r1 = 2
            if (r10 == r2) goto L_0x00e7
            r0 = 0
            if (r10 != r1) goto L_0x00e8
        L_0x00e7:
            r0 = 1
        L_0x00e8:
            r5.setUpdating(r0)
            if (r10 == r1) goto L_0x00f1
            if (r10 == r2) goto L_0x00f1
            if (r10 != r4) goto L_0x0012
        L_0x00f1:
            androidx.recyclerview.widget.RecyclerView r0 = r6.A0D
            r0.A0h(r3)
            return
        L_0x00f7:
            int r1 = r9.getHeight()
            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = r5.A0F
            int r0 = r0.A0S()
            int r1 = r1 - r0
            float r1 = (float) r1
            float r0 = (float) r0
            float r0 = r0 + r1
            X.C142466ov.A08(r5, r0, r2)
            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = r5.A0F
            r0.A0d(r3)
            com.whatsapp.location.DragBottomSheetIndicator r0 = r5.A0J
            r0.setExpanded(r2)
            goto L_0x00db
        L_0x0113:
            if (r10 != r4) goto L_0x00db
            java.lang.Object r1 = r8.A00
            X.6ov r1 = (X.C142466ov) r1
            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = r1.A0G
            int r0 = r0.A0J
            com.google.android.material.bottomsheet.BottomSheetBehavior r5 = r1.A0F
            if (r0 == r6) goto L_0x00d8
            r5.A0d(r3)
            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = r1.A0F
            int r0 = r0.A0S()
            float r0 = (float) r0
            X.C142466ov.A08(r1, r0, r2)
            com.whatsapp.location.DragBottomSheetIndicator r0 = r1.A0J
            r0.setExpanded(r3)
            goto L_0x00db
        L_0x0134:
            r0 = 5
            if (r10 != r0) goto L_0x0012
            java.lang.Object r0 = r8.A00
            com.whatsapp.group.GroupProfileEmojiEditor r0 = (com.whatsapp.group.GroupProfileEmojiEditor) r0
            com.whatsapp.expressionstray.conversation.ExpressionsBottomSheetView r0 = r0.A0B
            r0.A0C()
            return
        L_0x0141:
            r2 = 0
            X.AnonymousClass00C.A0D(r9, r2)
            r6 = 1
            r4 = 3
            if (r10 == r4) goto L_0x01d9
            r3 = 4
            if (r10 == r3) goto L_0x01bb
            r0 = 5
            if (r10 == r0) goto L_0x015b
            if (r10 == r6) goto L_0x0012
        L_0x0151:
            java.lang.Object r0 = r8.A00
            X.3UT r0 = (X.AnonymousClass3UT) r0
            com.whatsapp.expressionstray.conversation.ExpressionsBottomSheetView r0 = r0.A0E
            if (r0 == 0) goto L_0x0012
            goto L_0x0248
        L_0x015b:
            java.lang.Object r5 = r8.A00
            X.3UT r5 = (X.AnonymousClass3UT) r5
            com.whatsapp.expressionstray.conversation.ExpressionsBottomSheetView r0 = r5.A0E
            if (r0 == 0) goto L_0x0166
            r0.A0C()
        L_0x0166:
            com.whatsapp.expressionstray.conversation.ExpressionsBottomSheetView r0 = r5.A0E
            X.C36331k8.A0y(r0)
            X.4T7 r0 = r5.A0D
            if (r0 == 0) goto L_0x0172
            r0.BYt()
        L_0x0172:
            android.content.res.Resources r1 = r9.getResources()
            r0 = 2131889081(0x7f120bb9, float:1.9412815E38)
            java.lang.String r2 = r1.getString(r0)
            r1 = 2131231746(0x7f080402, float:1.8079582E38)
            android.widget.ImageButton r0 = r5.A04
            if (r0 == 0) goto L_0x0187
            r0.setImageResource(r1)
        L_0x0187:
            android.widget.ImageButton r0 = r5.A04
            if (r0 == 0) goto L_0x018e
            r0.setContentDescription(r2)
        L_0x018e:
            com.whatsapp.KeyboardPopupLayout r0 = r5.A08
            if (r0 == 0) goto L_0x019b
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            if (r1 == 0) goto L_0x019b
            r0 = -1
            r1.height = r0
        L_0x019b:
            com.whatsapp.KeyboardPopupLayout r0 = r5.A08
            if (r0 == 0) goto L_0x01a2
            r0.requestLayout()
        L_0x01a2:
            r5.A0H = r6
            boolean r0 = r5 instanceof X.AnonymousClass2Md
            if (r0 == 0) goto L_0x01b3
            r1 = 1
        L_0x01a9:
            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = r5.A06
            if (r1 != 0) goto L_0x01b5
            if (r0 == 0) goto L_0x0151
            r0.A0W(r3)
            goto L_0x0151
        L_0x01b3:
            r1 = 0
            goto L_0x01a9
        L_0x01b5:
            if (r0 == 0) goto L_0x0151
            r0.A0W(r4)
            goto L_0x0151
        L_0x01bb:
            java.lang.Object r1 = r8.A00
            X.3UT r1 = (X.AnonymousClass3UT) r1
            boolean r0 = r1.A0H
            if (r0 == 0) goto L_0x01c5
            r1.A0H = r2
        L_0x01c5:
            boolean r0 = r1.A0J
            if (r0 == 0) goto L_0x01cf
            r1.A0J = r2
            r1.A0B()
            return
        L_0x01cf:
            boolean r0 = r1.A0I
            if (r0 == 0) goto L_0x01e2
            r1.A0I = r2
            X.AnonymousClass3UT.A03(r1)
            return
        L_0x01d9:
            java.lang.Object r1 = r8.A00
            X.3UT r1 = (X.AnonymousClass3UT) r1
            boolean r0 = r1.A0H
            if (r0 == 0) goto L_0x01e9
            return
        L_0x01e2:
            com.whatsapp.expressionstray.conversation.ExpressionsBottomSheetView r0 = r1.A0E
            if (r0 == 0) goto L_0x01e9
            r0.A0A()
        L_0x01e9:
            com.whatsapp.KeyboardPopupLayout r0 = r1.A08
            if (r0 == 0) goto L_0x0151
            r0.A04 = r2
            r0.requestLayout()
            goto L_0x0151
        L_0x01f4:
            r2 = 4
            r4 = 1
            r5 = 0
            r0 = 5
            if (r10 != r0) goto L_0x024c
            java.lang.Object r3 = r8.A00
            X.3fk r3 = (X.C70803fk) r3
            com.whatsapp.expressionstray.conversation.ExpressionsBottomSheetView r0 = r3.A3l
            if (r0 == 0) goto L_0x020c
            r0.A0C()
            com.whatsapp.expressionstray.conversation.ExpressionsBottomSheetView r1 = r3.A3l
            r0 = 8
            r1.setVisibility(r0)
        L_0x020c:
            X.C70803fk.A0W(r9, r3)
            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = r3.A0n
            if (r0 == 0) goto L_0x0218
            r3.A6D = r4
            r0.A0W(r2)
        L_0x0218:
            X.4V6 r0 = r3.A2l
            com.whatsapp.reactions.ReactionsTrayViewModel r2 = r0.getReactionsTrayViewModel()
            com.whatsapp.emoji.search.EmojiSearchKeyboardContainer r0 = r3.A3f
            if (r0 == 0) goto L_0x0229
            int r0 = r0.getVisibility()
            r1 = 1
            if (r0 == 0) goto L_0x022a
        L_0x0229:
            r1 = 0
        L_0x022a:
            X.4V6 r0 = r3.A2l
            boolean r0 = r0.BMu()
            if (r0 == 0) goto L_0x023e
            if (r2 == 0) goto L_0x023e
            if (r1 != 0) goto L_0x023e
            X.4V6 r0 = r3.A2l
            r0.B7Q()
            r2.A0S(r5)
        L_0x023e:
            java.lang.Object r0 = r8.A00
            X.3fk r0 = (X.C70803fk) r0
            com.whatsapp.expressionstray.conversation.ExpressionsBottomSheetView r0 = r0.A3l
            if (r0 == 0) goto L_0x0012
            if (r10 == r4) goto L_0x0012
        L_0x0248:
            r0.A0E(r10)
            return
        L_0x024c:
            if (r10 != r2) goto L_0x0285
            java.lang.Object r3 = r8.A00
            X.3fk r3 = (X.C70803fk) r3
            boolean r0 = r3.A6D
            if (r0 == 0) goto L_0x0258
            r3.A6D = r5
        L_0x0258:
            com.whatsapp.expressionstray.conversation.ExpressionsBottomSheetView r2 = r3.A3l
            if (r2 == 0) goto L_0x0266
            r1 = 39
            X.3wT r0 = new X.3wT
            r0.<init>((java.lang.Object) r8, (int) r1)
            r2.post(r0)
        L_0x0266:
            boolean r0 = r3.A6X
            if (r0 == 0) goto L_0x0270
            r3.A6X = r5
            X.C70803fk.A0y(r3)
            return
        L_0x0270:
            boolean r0 = r3.A6W
            if (r0 == 0) goto L_0x027a
            r3.A6W = r5
            X.C70803fk.A0u(r3)
            return
        L_0x027a:
            com.whatsapp.expressionstray.conversation.ExpressionsBottomSheetView r0 = r3.A3l
            if (r0 == 0) goto L_0x0281
            r0.A0A()
        L_0x0281:
            r3.A1m()
            goto L_0x023e
        L_0x0285:
            r0 = 3
            if (r10 != r0) goto L_0x023e
            java.lang.Object r1 = r8.A00
            X.3fk r1 = (X.C70803fk) r1
            boolean r0 = r1.A6D
            if (r0 != 0) goto L_0x0012
            r1.A1m()
            goto L_0x023e
        L_0x0294:
            r0 = 5
            java.lang.Object r2 = r8.A00
            com.whatsapp.avatar.home.AvatarHomeActivity r2 = (com.whatsapp.avatar.home.AvatarHomeActivity) r2
            if (r10 != r0) goto L_0x029f
            com.whatsapp.avatar.home.AvatarHomeActivity.A07(r2)
            return
        L_0x029f:
            android.view.Window r1 = r2.getWindow()
            r0 = 0
            X.AnonymousClass1RC.A09(r1, r0)
            X.C36391kE.A14(r2)
            X.07B r0 = r2.getSupportActionBar()
            if (r0 == 0) goto L_0x0012
            r0.A0E()
            return
        L_0x02b4:
            r0 = 4
            if (r10 == r0) goto L_0x02c1
            r0 = 5
            if (r10 == r0) goto L_0x02c1
            return
        L_0x02bb:
            r0 = 4
            if (r10 == r0) goto L_0x02c1
            r0 = 5
            if (r10 != r0) goto L_0x0012
        L_0x02c1:
            java.lang.Object r0 = r8.A00
            androidx.fragment.app.DialogFragment r0 = (androidx.fragment.app.DialogFragment) r0
            r0.A1b()
            return
        L_0x02c9:
            java.lang.Object r0 = r8.A00
            X.2fB r0 = (X.C47592fB) r0
            r0.A0K(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C89194Vp.A03(android.view.View, int):void");
    }
}
