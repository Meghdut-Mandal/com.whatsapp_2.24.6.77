package com.whatsapp.calling.lightweightcalling.view;

import X.AnonymousClass00C;
import X.AnonymousClass00F;
import X.AnonymousClass00T;
import X.AnonymousClass01I;
import X.AnonymousClass11F;
import X.AnonymousClass1N6;
import X.AnonymousClass1PZ;
import X.AnonymousClass1RJ;
import X.AnonymousClass3QI;
import X.AnonymousClass3UE;
import X.AnonymousClass3YE;
import X.AnonymousClass490;
import X.AnonymousClass491;
import X.AnonymousClass492;
import X.AnonymousClass493;
import X.AnonymousClass494;
import X.AnonymousClass4F9;
import X.AnonymousClass4FA;
import X.AnonymousClass4FB;
import X.AnonymousClass4FC;
import X.AnonymousClass4FD;
import X.AnonymousClass5VW;
import X.AnonymousClass5X0;
import X.AnonymousClass6M0;
import X.AnonymousClass6SZ;
import X.AnonymousClass7QE;
import X.AnonymousClass7SU;
import X.C000800j;
import X.C001400p;
import X.C012005e;
import X.C019308f;
import X.C116965lU;
import X.C12560iI;
import X.C135456cj;
import X.C144156rj;
import X.C1501574e;
import X.C152387Kh;
import X.C152397Ki;
import X.C152407Kj;
import X.C152417Kk;
import X.C165167sz;
import X.C165177t0;
import X.C19730wQ;
import X.C19770wU;
import X.C20810yC;
import X.C222013h;
import X.C24801Dv;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36361kB;
import X.C36371kC;
import X.C36401kF;
import X.C36431kI;
import X.C36441kJ;
import X.C65723Tf;
import X.C833348z;
import X.C95504lc;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.widget.ImageView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.whatsapp.R;
import com.whatsapp.WaTextView;
import com.whatsapp.calling.banner.viewmodel.MinimizedCallBannerViewModel;
import com.whatsapp.calling.callgrid.view.CallGrid;
import com.whatsapp.calling.callgrid.viewmodel.VoiceChatGridViewModel;
import com.whatsapp.calling.lightweightcalling.viewmodel.AudioChatCallingViewModel;
import com.whatsapp.calling.lightweightcalling.viewmodel.VoiceChatBottomSheetViewModel;
import com.whatsapp.components.MaxHeightLinearLayout;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.util.Log;
import java.util.Objects;

public final class AudioChatBottomSheetDialog extends Hilt_AudioChatBottomSheetDialog {
    public static final AnonymousClass6M0 A0O = new AnonymousClass6M0();
    public View A00;
    public BottomSheetBehavior A01;
    public C24801Dv A02;
    public C19730wQ A03;
    public WaTextView A04;
    public CallGrid A05;
    public AudioChatBottomSheetFooterView A06;
    public AnonymousClass1PZ A07;
    public MaxHeightLinearLayout A08;
    public C20810yC A09;
    public AnonymousClass1N6 A0A;
    public AnonymousClass1RJ A0B;
    public AnonymousClass1RJ A0C;
    public AnonymousClass1RJ A0D;
    public AnonymousClass1RJ A0E;
    public C19770wU A0F;
    public boolean A0G;
    public final int A0H = R.layout.f9nameremoved;
    public final AnonymousClass00T A0I;
    public final AnonymousClass00T A0J;
    public final AnonymousClass00T A0K;
    public final AnonymousClass00T A0L;
    public final AnonymousClass00T A0M;
    public final AnonymousClass00T A0N;

    public void A1S(Bundle bundle, View view) {
        String str;
        String str2;
        Integer num;
        String str3;
        AnonymousClass00C.A0D(view, 0);
        super.A1S(bundle, view);
        Bundle bundle2 = this.A0A;
        if (bundle2 != null) {
            str = bundle2.getString("audio_chat_call_id");
        } else {
            str = null;
        }
        AnonymousClass6SZ r2 = GroupJid.Companion;
        Bundle bundle3 = this.A0A;
        if (bundle3 != null) {
            str2 = bundle3.getString("voice_chat_group_jid");
        } else {
            str2 = null;
        }
        GroupJid A022 = r2.A02(str2);
        Bundle bundle4 = this.A0A;
        if (bundle4 != null) {
            num = Integer.valueOf(bundle4.getInt("voice_chat_call_from_ui"));
        } else {
            num = null;
        }
        if (str == null) {
            C20810yC r1 = this.A09;
            if (r1 != null) {
                if (r1.A07(5429) == 0) {
                    str3 = "AudioChatBottomSheetDialog/onViewCreated no call id argument";
                } else if (A022 == null || (num != null && num.intValue() == 0)) {
                    str3 = "AudioChatBottomSheetDialog/onViewCreated no groupJid or callFromUi argument";
                }
                Log.e(str3);
                A1c();
                return;
            }
            throw C36321k7.A07();
        }
        ViewParent parent = view.getParent();
        AnonymousClass00C.A0E(parent, "null cannot be cast to non-null type android.view.View");
        BottomSheetBehavior A023 = BottomSheetBehavior.A02((View) parent);
        this.A01 = A023;
        if (A023 != null) {
            A023.A0Y(0, false);
        }
        BottomSheetBehavior bottomSheetBehavior = this.A01;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.A0W(3);
        }
        A0k().A0l(new AnonymousClass5VW(this, 0), A0m(), "participant_list_request");
        ViewParent parent2 = view.getParent();
        AnonymousClass00C.A0E(parent2, "null cannot be cast to non-null type android.view.View");
        C36371kC.A13(view.getContext(), (View) parent2, R.drawable.audio_chat_activity_bottom_sheet_background);
        this.A08 = (MaxHeightLinearLayout) view;
        A03();
        View A0G2 = C36361kB.A0G(view, R.id.minimize_btn);
        if (C222013h.A07) {
            ImageView A0L2 = C36341k9.A0L(A0G2, R.id.minimize_icon);
            ViewGroup.LayoutParams layoutParams = A0L2.getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            int dimensionPixelSize = A0L2.getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
            layoutParams.height = dimensionPixelSize;
            layoutParams.width = dimensionPixelSize;
            C65723Tf.A02(A0L2, new AnonymousClass3QI(0, A0L2.getResources().getDimensionPixelSize(R.dimen.f7nameremoved), 0, 0));
            A0L2.setLayoutParams(layoutParams);
            A0L2.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        }
        C135456cj.A01(A0G2, this, 14);
        C36331k8.A0q(A0G2.getContext(), A0G2, R.string.f12nameremoved);
        this.A04 = C36401kF.A0Q(view, R.id.title);
        this.A0E = C36341k9.A0X(view, R.id.participant_count_container_stub);
        View A024 = C012005e.A02(view, R.id.participant_list_btn);
        this.A00 = A024;
        if (A024 != null) {
            C135456cj.A01(A024, this, 13);
        }
        C012005e.A02(view, R.id.header_layout).setOnClickListener(new AnonymousClass3YE(this, view, 8));
        this.A0C = C36341k9.A0X(view, R.id.confirmation_lobby_stub);
        this.A0D = new AnonymousClass1RJ(C36361kB.A0G(view, R.id.dots_wave_view_stub));
        ((VoiceChatGridViewModel) this.A0L.getValue()).A00 = new C116965lU(this);
        this.A0B = C36341k9.A0Y(view, R.id.call_grid_stub);
        AudioChatBottomSheetFooterView audioChatBottomSheetFooterView = (AudioChatBottomSheetFooterView) C36361kB.A0G(view, R.id.footer_layout);
        audioChatBottomSheetFooterView.A00 = new C144156rj(this);
        this.A06 = audioChatBottomSheetFooterView;
        AnonymousClass00T r5 = this.A0N;
        VoiceChatBottomSheetViewModel voiceChatBottomSheetViewModel = (VoiceChatBottomSheetViewModel) r5.getValue();
        if (str != null) {
            voiceChatBottomSheetViewModel.A04 = str;
            C95504lc.A02(voiceChatBottomSheetViewModel.A0C, voiceChatBottomSheetViewModel);
        } else {
            voiceChatBottomSheetViewModel.A02 = A022;
            voiceChatBottomSheetViewModel.A0L.Bp1(new C1501574e(voiceChatBottomSheetViewModel, 22));
        }
        C165177t0.A00(A0m(), ((VoiceChatBottomSheetViewModel) r5.getValue()).A09, AnonymousClass5X0.A02(this, 19), 0);
        C165177t0.A00(A0m(), ((VoiceChatBottomSheetViewModel) r5.getValue()).A0A, AnonymousClass5X0.A02(this, 20), 1);
        C165167sz.A00(A0m(), ((VoiceChatBottomSheetViewModel) r5.getValue()).A08, new AnonymousClass7SU(this), 49);
        if (C36331k8.A1b(this.A0M)) {
            MinimizedCallBannerViewModel minimizedCallBannerViewModel = (MinimizedCallBannerViewModel) this.A0K.getValue();
            if (!minimizedCallBannerViewModel.A01) {
                minimizedCallBannerViewModel.A01 = true;
                minimizedCallBannerViewModel.A06.setValue(true);
            }
        } else {
            AudioChatCallingViewModel audioChatCallingViewModel = (AudioChatCallingViewModel) this.A0I.getValue();
            audioChatCallingViewModel.A07 = true;
            audioChatCallingViewModel.A08 = true;
            C36341k9.A18(audioChatCallingViewModel.A0E, false);
        }
        AnonymousClass1N6 r22 = this.A0A;
        if (r22 != null) {
            AnonymousClass00T r0 = AnonymousClass1N6.A0A;
            r22.A02((AnonymousClass11F) null, 35);
            return;
        }
        throw C36331k8.A0d("navigationTimeSpentManager");
    }

    public void onConfigurationChanged(Configuration configuration) {
        AnonymousClass00C.A0D(configuration, 0);
        super.onConfigurationChanged(configuration);
        A03();
    }

    public final AnonymousClass1PZ A1m() {
        AnonymousClass1PZ r0 = this.A07;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("callUserJourneyLogger");
    }

    public AudioChatBottomSheetDialog() {
        AnonymousClass00T A002 = C001400p.A00(C000800j.NONE, new C152397Ki(new C152387Kh(this)));
        C019308f A1A = C36441kJ.A1A(VoiceChatBottomSheetViewModel.class);
        this.A0N = new C12560iI(new C152407Kj(A002), new AnonymousClass4FD(this, A002), new AnonymousClass4FC(A002), A1A);
        C019308f A1A2 = C36441kJ.A1A(VoiceChatGridViewModel.class);
        this.A0L = new C12560iI(new C833348z(this), new AnonymousClass490(this), new AnonymousClass4F9(this), A1A2);
        C019308f A1A3 = C36441kJ.A1A(MinimizedCallBannerViewModel.class);
        this.A0K = new C12560iI(new AnonymousClass491(this), new AnonymousClass492(this), new AnonymousClass4FA(this), A1A3);
        C019308f A1A4 = C36441kJ.A1A(AudioChatCallingViewModel.class);
        this.A0I = new C12560iI(new AnonymousClass493(this), new AnonymousClass494(this), new AnonymousClass4FB(this), A1A4);
        this.A0M = C36431kI.A1I(new C152417Kk(this));
        this.A0J = C36431kI.A1I(AnonymousClass7QE.A00);
    }

    private final void A03() {
        AnonymousClass01I A0h = A0h();
        if (A0h != null) {
            float f = 0.85f;
            if (C36341k9.A04(A0a()) == 2) {
                f = 1.0f;
            }
            MaxHeightLinearLayout maxHeightLinearLayout = this.A08;
            if (maxHeightLinearLayout != null) {
                maxHeightLinearLayout.setMaxHeight((int) (((float) AnonymousClass3UE.A00(A0h)) * f));
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0013, code lost:
        if (r1 != false) goto L_0x0015;
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00b0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A1J() {
        /*
            r5 = this;
            super.A1J()
            boolean r0 = r5.A0G
            r3 = 1
            if (r0 == 0) goto L_0x00cc
            X.01I r0 = r5.A0h()
            if (r0 == 0) goto L_0x0015
            boolean r1 = r0.isChangingConfigurations()
            r0 = 1
            if (r1 == 0) goto L_0x0016
        L_0x0015:
            r0 = 0
        L_0x0016:
            r4 = 35
            if (r0 == 0) goto L_0x00c3
            X.00T r0 = r5.A0N
            java.lang.Object r2 = r0.getValue()
            com.whatsapp.calling.lightweightcalling.viewmodel.VoiceChatBottomSheetViewModel r2 = (com.whatsapp.calling.lightweightcalling.viewmodel.VoiceChatBottomSheetViewModel) r2
            X.5SC r1 = r2.A00
            X.5SC r0 = X.AnonymousClass5SC.Joiner
            if (r1 != r0) goto L_0x00c3
            X.6YM r1 = r2.A01
            if (r1 == 0) goto L_0x0030
            r0 = 0
            X.AnonymousClass6YM.A0A(r1, r0, r0, r3)
        L_0x0030:
            X.1PZ r1 = r5.A1m()
            r0 = 24
            r1.A00(r0, r4)
        L_0x0039:
            android.app.Dialog r0 = r5.A02
            if (r0 == 0) goto L_0x0048
            android.view.Window r1 = r0.getWindow()
            if (r1 == 0) goto L_0x0048
            r0 = 128(0x80, float:1.794E-43)
            r1.clearFlags(r0)
        L_0x0048:
            r2 = 0
            r5.A01 = r2
            X.00T r0 = r5.A0M
            boolean r0 = X.C36331k8.A1b(r0)
            if (r0 == 0) goto L_0x00b0
            X.00T r0 = r5.A0K
            java.lang.Object r3 = r0.getValue()
            com.whatsapp.calling.banner.viewmodel.MinimizedCallBannerViewModel r3 = (com.whatsapp.calling.banner.viewmodel.MinimizedCallBannerViewModel) r3
            r1 = 0
            boolean r0 = r3.A01
            if (r0 == r1) goto L_0x0071
            r3.A01 = r1
            X.05L r1 = r3.A06
            boolean r0 = r3.A00
            boolean r0 = X.C90504aG.A1T(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1.setValue(r0)
        L_0x0071:
            r5.A08 = r2
            r5.A04 = r2
            r5.A0E = r2
            X.00T r0 = r5.A0L
            java.lang.Object r0 = r0.getValue()
            com.whatsapp.calling.callgrid.viewmodel.VoiceChatGridViewModel r0 = (com.whatsapp.calling.callgrid.viewmodel.VoiceChatGridViewModel) r0
            r0.A00 = r2
            com.whatsapp.calling.callgrid.view.CallGrid r0 = r5.A05
            if (r0 == 0) goto L_0x008c
            X.01N r1 = r5.A0P
            X.01Y r0 = r0.A0Y
            r1.A05(r0)
        L_0x008c:
            com.whatsapp.calling.callgrid.view.CallGrid r1 = r5.A05
            if (r1 == 0) goto L_0x009f
            java.lang.String r0 = "CallGrid/clearRecyclerViewAdapter Setting adapters to null"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            androidx.recyclerview.widget.RecyclerView r0 = r1.A0c
            r0.setAdapter(r2)
            androidx.recyclerview.widget.RecyclerView r0 = r1.A0b
            r0.setAdapter(r2)
        L_0x009f:
            r5.A05 = r2
            com.whatsapp.calling.lightweightcalling.view.AudioChatBottomSheetFooterView r0 = r5.A06
            if (r0 == 0) goto L_0x00a7
            r0.A00 = r2
        L_0x00a7:
            r5.A06 = r2
            r5.A0D = r2
            r5.A00 = r2
            r5.A0C = r2
            return
        L_0x00b0:
            X.00T r0 = r5.A0I
            java.lang.Object r1 = r0.getValue()
            com.whatsapp.calling.lightweightcalling.viewmodel.AudioChatCallingViewModel r1 = (com.whatsapp.calling.lightweightcalling.viewmodel.AudioChatCallingViewModel) r1
            r0 = 0
            r1.A07 = r0
            if (r3 != 0) goto L_0x0071
            X.5Fb r0 = r1.A0H
            X.C95504lc.A02(r0, r1)
            goto L_0x0071
        L_0x00c3:
            X.1PZ r1 = r5.A1m()
            r0 = 13
            r1.A00(r0, r4)
        L_0x00cc:
            r3 = 0
            goto L_0x0039
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.lightweightcalling.view.AudioChatBottomSheetDialog.A1J():void");
    }

    public Dialog A1a(Bundle bundle) {
        Dialog A1a = super.A1a(bundle);
        Context A1D = A1D();
        if (A1D != null) {
            Window window = A1a.getWindow();
            if (window != null) {
                window.setNavigationBarColor(AnonymousClass00F.A00(A1D, R.color.f6nameremoved));
            }
            Window window2 = A1a.getWindow();
            if (window2 != null) {
                window2.addFlags(128);
            }
        }
        return A1a;
    }
}
