package X;

import com.whatsapp.R;
import com.whatsapp.calling.banner.viewmodel.MinimizedCallBannerViewModel;
import com.whatsapp.voipcalling.CallState;

/* renamed from: X.5YS  reason: invalid class name */
public class AnonymousClass5YS extends C12680iU implements C019408g {
    public final int A00;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass5YS(java.lang.Object r8, int r9) {
        /*
            r7 = this;
            r0 = r7
            r7.A00 = r9
            switch(r9) {
                case 0: goto L_0x001b;
                case 1: goto L_0x0013;
                default: goto L_0x0006;
            }
        L_0x0006:
            java.lang.Class<X.6rn> r3 = X.C144196rn.class
            r1 = 3
            java.lang.String r4 = "getUiState"
            java.lang.String r5 = "getUiState(Lcom/whatsapp/calling/calldatasource/CallStateModel;Lcom/whatsapp/calling/service/datasource/AudioRouteState;)Lcom/whatsapp/calling/controls/viewmodel/CallControlUiState;"
        L_0x000d:
            r6 = 4
            r2 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        L_0x0013:
            java.lang.Class<X.63Q> r3 = X.AnonymousClass63Q.class
            r1 = 3
            java.lang.String r4 = "onCallStateModelUpdated"
            java.lang.String r5 = "onCallStateModelUpdated(ZLcom/whatsapp/calling/calldatasource/CallStateModel;)Lcom/whatsapp/calling/banner/data/MinimizedCallBannerViewState;"
            goto L_0x000d
        L_0x001b:
            java.lang.Class<com.whatsapp.calling.banner.viewmodel.MinimizedCallBannerViewModel> r3 = com.whatsapp.calling.banner.viewmodel.MinimizedCallBannerViewModel.class
            r1 = 3
            java.lang.String r4 = "onAudioLevelsUpdated"
            java.lang.String r5 = "onAudioLevelsUpdated(Lcom/whatsapp/calling/calldatasource/ParticipantAudioLevels;Lcom/whatsapp/calling/banner/data/MinimizedCallBannerViewState;)Lcom/whatsapp/calling/banner/data/MinimizedCallBannerViewState;"
            goto L_0x000d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5YS.<init>(java.lang.Object, int):void");
    }

    public /* bridge */ /* synthetic */ Object BKt(Object obj, Object obj2, Object obj3) {
        C16220oo r6;
        int i;
        boolean z;
        C16210on r1;
        int i2;
        int i3;
        C16220oo r62;
        int i4;
        C16220oo r63;
        int i5;
        Object obj4 = obj2;
        Object obj5 = obj;
        switch (this.A00) {
            case 0:
                C119365ph r64 = (C119365ph) obj5;
                C16230op r9 = (C16230op) obj4;
                MinimizedCallBannerViewModel minimizedCallBannerViewModel = (MinimizedCallBannerViewModel) this.receiver;
                if (r64 == null || !(r9 instanceof C143876rG)) {
                    return r9;
                }
                C143876rG r5 = (C143876rG) r9;
                if (!(r5.A02 instanceof C143786r7)) {
                    return r9;
                }
                C130796Ml r4 = minimizedCallBannerViewModel.A02.A01;
                C123755x2 r3 = r4.A00;
                if (r3 != null) {
                    int A07 = AnonymousClass02R.A07(r3.A02.A08, r64.A01);
                    int[] iArr = r64.A00;
                    if (A07 < 0 || A07 > iArr.length - 1) {
                        i5 = 0;
                    } else {
                        i5 = iArr[A07];
                    }
                    r3.A00 = (float) i5;
                } else {
                    r3 = null;
                }
                return new C143876rG(r5.A01, C130796Ml.A00(r3, r4), r5.A00);
            case 1:
                boolean A1X = AnonymousClass000.A1X(obj5);
                AnonymousClass6OZ r92 = (AnonymousClass6OZ) obj4;
                AnonymousClass63Q r12 = (AnonymousClass63Q) this.receiver;
                AnonymousClass00C.A0D(r92, 1);
                C144186rm r7 = r12.A02;
                C123215w8 r65 = r7.A01;
                r65.A02 = r92.A0A;
                r65.A00 = r92.A08;
                CallState callState = r92.A09;
                AnonymousClass00C.A07(callState);
                r65.A01 = callState;
                boolean z2 = r92.A0E;
                r65.A04 = z2;
                boolean z3 = r92.A0N;
                r65.A03 = z3;
                if (callState == CallState.NONE) {
                    C144186rm.A00(r7, (AnonymousClass6YM) null);
                } else if (r7.A00 == null) {
                    r7.A03.A01(r7);
                }
                if (!A1X) {
                    if (!z2) {
                        i = callState.ordinal();
                        if (!(i == 0 || i == 9 || i == 11)) {
                            if (r92.A0J) {
                                switch (i) {
                                    case 1:
                                    case 10:
                                        i3 = R.string.f12nameremoved;
                                        break;
                                    case 2:
                                        i3 = R.string.f12nameremoved;
                                        break;
                                    case 3:
                                        r62 = r12.A00.A00(r92);
                                        break;
                                    case 4:
                                    case 5:
                                        i3 = R.string.f12nameremoved;
                                        break;
                                    default:
                                        r62 = r12.A01.A01(r92);
                                        break;
                                }
                                r62 = new C143776r6(C90524aI.A0O(new Object[0], i3));
                                r6 = r62;
                            } else {
                                r6 = r12.A00.A00(r92);
                            }
                        }
                    } else if (callState == CallState.ACTIVE || callState == CallState.CONNECTED_LONELY || C131856Qx.A01(callState)) {
                        i = callState.ordinal();
                        if (i != 1) {
                            if (i == 10) {
                                i4 = R.string.f12nameremoved;
                            } else if (i != 4) {
                                r63 = r12.A01.A01(r92);
                            } else {
                                i4 = R.string.f12nameremoved;
                            }
                            r63 = new C143776r6(C90524aI.A0O(new Object[0], i4));
                        } else {
                            i4 = R.string.f12nameremoved;
                            r63 = new C143776r6(C90524aI.A0O(new Object[0], i4));
                        }
                        r6 = r63;
                    }
                    if (i == 3) {
                        if (z3) {
                            i2 = R.drawable.ic_action_video_call_filled;
                        } else if (!z3) {
                            i2 = R.drawable.ic_action_audio_call_filled;
                        } else {
                            throw C36441kJ.A18();
                        }
                        r1 = new C143756r4(i2);
                    } else {
                        AnonymousClass6EE r0 = r92.A05;
                        if (r0 != null) {
                            z = r0.A0F;
                        } else {
                            z = false;
                        }
                        r1 = new C143766r5(z);
                    }
                    C16210on r13 = r1;
                    int i6 = R.drawable.ic_action_end_call_filled;
                    if (z2) {
                        i6 = R.drawable.vec_ic_lwc_leave;
                    }
                    return new C143876rG(r13, r6, i6);
                }
                return C143886rH.A00;
            default:
                AnonymousClass6OZ r66 = (AnonymousClass6OZ) obj5;
                AnonymousClass6A1 r93 = (AnonymousClass6A1) obj4;
                C144196rn r02 = (C144196rn) this.receiver;
                r02.A00 = r66;
                AnonymousClass6LI r42 = r02.A03;
                boolean A1a = C36341k9.A1a(r66, r93);
                C119425pn r14 = new C119425pn(r66, r93);
                if (!r66.A0I || r66.A0M) {
                    return new C1029652s(A00((C144116re) r42.A02.getValue(), r14), A00((C144136rg) r42.A04.getValue(), r14), A00((C144146rh) r42.A05.getValue(), r14), A00((C144126rf) r42.A03.getValue(), r14), new C144086rb(false, A1a), AnonymousClass6LI.A00(r14, r42));
                }
                return new C1029552r(C144066rZ.A00, AnonymousClass6LI.A00(r14, r42));
        }
    }

    public static C16250or A00(C159997kI r3, C119425pn r4) {
        C16250or r0;
        if (r3.BNk(r4)) {
            r0 = new C144086rb(r3.BNA(r4), r3.BLg(r4));
        } else {
            r0 = C144076ra.A00;
        }
        return r0;
    }
}
