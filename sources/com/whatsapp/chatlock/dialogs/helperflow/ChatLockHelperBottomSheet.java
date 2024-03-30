package com.whatsapp.chatlock.dialogs.helperflow;

import X.AnonymousClass00C;
import X.AnonymousClass01I;
import X.AnonymousClass11F;
import X.AnonymousClass155;
import X.AnonymousClass3AR;
import X.C1501974i;
import X.C19630wG;
import X.C19650wI;
import X.C19770wU;
import X.C20810yC;
import X.C222013h;
import X.C231517j;
import X.C32061ct;
import X.C32711e4;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36371kC;
import X.C36411kG;
import X.C36441kJ;
import X.C51832oS;
import X.C53502rQ;
import X.C586330l;
import X.C63093Is;
import X.C66933Xw;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import com.airbnb.lottie.LottieAnimationView;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;

public final class ChatLockHelperBottomSheet extends Hilt_ChatLockHelperBottomSheet {
    public int A00 = 5;
    public C53502rQ A01;
    public C32061ct A02;
    public AnonymousClass3AR A03;
    public ChatLockHelperBottomSheetViewModel A04;
    public C231517j A05;
    public C20810yC A06;
    public AnonymousClass11F A07;
    public C19650wI A08;
    public C19770wU A09;

    public void A1S(Bundle bundle, View view) {
        int i;
        AnonymousClass00C.A0D(view, 0);
        super.A1S(bundle, view);
        TextEmojiLabel A0O = C36351kA.A0O(view, R.id.description);
        View A0G = C36361kB.A0G(view, R.id.continue_button);
        AnonymousClass3AR r6 = this.A03;
        if (r6 != null) {
            C586330l r8 = new C586330l(this);
            AnonymousClass00C.A0D(A0O, 0);
            Context A0B = C36371kC.A0B(A0O);
            C19630wG r2 = r6.A04;
            boolean A052 = r6.A01.A05();
            int i2 = R.string.f12nameremoved;
            if (A052) {
                i2 = R.string.f12nameremoved;
            }
            A0O.setText(C32711e4.A02(A0B, new C1501974i(r6, r8, 41), C36371kC.A0v(r2, i2), "learn-more", C36341k9.A05(A0O.getContext())));
            C36331k8.A16(A0O, r6.A03);
            C36331k8.A10(A0O, r6.A05);
            View A0G2 = C36361kB.A0G(view, R.id.leaky_companion_view);
            C19770wU r1 = this.A09;
            if (r1 != null) {
                C36411kG.A1M(r1, this, A0G2, 42);
                ChatLockHelperBottomSheetViewModel A1m = A1m();
                A1m.A06.A04(A1m.A03, Integer.valueOf(A1m.A00), (Integer) null, 11);
                C66933Xw.A00(A0G, this, 29);
                LottieAnimationView lottieAnimationView = (LottieAnimationView) C36361kB.A0G(view, R.id.helper_flow_lottie_animation);
                if (C222013h.A05) {
                    lottieAnimationView.setAnimation((int) R.raw.chatlock_helper_dialog_lottie_wds);
                    i = 0;
                } else {
                    lottieAnimationView.setAnimation((int) R.raw.chatlock_helper_dialog_lottie);
                    i = -1;
                }
                lottieAnimationView.setRepeatCount(i);
                lottieAnimationView.A04();
                return;
            }
            throw C36321k7.A08();
        }
        throw C36331k8.A0d("chatLockLinkUtil");
    }

    public void onDismiss(DialogInterface dialogInterface) {
        C32061ct r2;
        AnonymousClass00C.A0D(dialogInterface, 0);
        ChatLockHelperBottomSheetViewModel A1m = A1m();
        AnonymousClass01I A0h = A0h();
        AnonymousClass00C.A0E(A0h, "null cannot be cast to non-null type com.whatsapp.WaBaseActivity");
        AnonymousClass155 r4 = (AnonymousClass155) A0h;
        AnonymousClass00C.A0D(r4, 0);
        if (A1m.A04) {
            C53502rQ r3 = A1m.A01;
            if (!(r3 == null || (r2 = A1m.A02) == null)) {
                A1m.A05.A0B(r4, r3, r2, A1m.A00);
            }
        } else {
            C32061ct r32 = A1m.A02;
            if (r32 != null) {
                r32.Bf7(new C63093Is(C51832oS.CANCELED, (Integer) null, (Integer) null));
            }
        }
        super.onDismiss(dialogInterface);
    }

    public final ChatLockHelperBottomSheetViewModel A1m() {
        ChatLockHelperBottomSheetViewModel chatLockHelperBottomSheetViewModel = this.A04;
        if (chatLockHelperBottomSheetViewModel != null) {
            return chatLockHelperBottomSheetViewModel;
        }
        throw C36331k8.A0a();
    }

    public void A1Q(Bundle bundle) {
        ChatLockHelperBottomSheetViewModel chatLockHelperBottomSheetViewModel = (ChatLockHelperBottomSheetViewModel) C36441kJ.A0b(this).A00(ChatLockHelperBottomSheetViewModel.class);
        AnonymousClass00C.A0D(chatLockHelperBottomSheetViewModel, 0);
        this.A04 = chatLockHelperBottomSheetViewModel;
        ChatLockHelperBottomSheetViewModel A1m = A1m();
        AnonymousClass11F r3 = this.A07;
        C53502rQ r2 = this.A01;
        C32061ct r1 = this.A02;
        int i = this.A00;
        if (!(r3 == null && r2 == null && r1 == null)) {
            A1m.A03 = r3;
            A1m.A02 = r1;
            A1m.A01 = r2;
            A1m.A00 = i;
        }
        super.A1Q(bundle);
    }

    public int A1i() {
        return R.layout.f9nameremoved;
    }
}
