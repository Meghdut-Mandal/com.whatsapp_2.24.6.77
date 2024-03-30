package com.whatsapp.voipcalling;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass00C;
import X.AnonymousClass00F;
import X.AnonymousClass00S;
import X.AnonymousClass011;
import X.AnonymousClass02E;
import X.AnonymousClass04S;
import X.AnonymousClass09Y;
import X.AnonymousClass0FM;
import X.AnonymousClass11F;
import X.AnonymousClass13J;
import X.AnonymousClass141;
import X.AnonymousClass16D;
import X.AnonymousClass16I;
import X.AnonymousClass171;
import X.AnonymousClass17X;
import X.AnonymousClass17Z;
import X.AnonymousClass185;
import X.AnonymousClass190;
import X.AnonymousClass1C6;
import X.AnonymousClass1HJ;
import X.AnonymousClass1HO;
import X.AnonymousClass1JZ;
import X.AnonymousClass1KK;
import X.AnonymousClass1MK;
import X.AnonymousClass1N6;
import X.AnonymousClass1ND;
import X.AnonymousClass1NE;
import X.AnonymousClass1NF;
import X.AnonymousClass1NG;
import X.AnonymousClass1NK;
import X.AnonymousClass1NM;
import X.AnonymousClass1PW;
import X.AnonymousClass1PZ;
import X.AnonymousClass1RJ;
import X.AnonymousClass2Q9;
import X.AnonymousClass3FU;
import X.AnonymousClass3LW;
import X.AnonymousClass3MV;
import X.AnonymousClass3T0;
import X.AnonymousClass3UD;
import X.AnonymousClass3UE;
import X.AnonymousClass3UF;
import X.AnonymousClass3UL;
import X.AnonymousClass3XL;
import X.AnonymousClass3YC;
import X.AnonymousClass4SS;
import X.AnonymousClass53T;
import X.AnonymousClass547;
import X.AnonymousClass5M6;
import X.AnonymousClass61I;
import X.AnonymousClass6EE;
import X.AnonymousClass6P2;
import X.AnonymousClass6T1;
import X.AnonymousClass6W1;
import X.AnonymousClass6X3;
import X.AnonymousClass6YM;
import X.AnonymousClass711;
import X.AnonymousClass712;
import X.AnonymousClass72j;
import X.AnonymousClass74U;
import X.AnonymousClass74V;
import X.AnonymousClass74Y;
import X.AnonymousClass752;
import X.AnonymousClass7dG;
import X.AnonymousClass7gF;
import X.AnonymousClass7gG;
import X.C000400e;
import X.C001700s;
import X.C009504a;
import X.C009904e;
import X.C011504z;
import X.C012005e;
import X.C107275Ni;
import X.C107285Nl;
import X.C107905Ri;
import X.C108075Sb;
import X.C108255Su;
import X.C108915Vl;
import X.C110325aU;
import X.C111975d9;
import X.C114145gi;
import X.C115365il;
import X.C119375pi;
import X.C121465tB;
import X.C123765x3;
import X.C124795yo;
import X.C1265364k;
import X.C128896Ea;
import X.C130216Ke;
import X.C130806Mm;
import X.C131176Oa;
import X.C132636Up;
import X.C135476cl;
import X.C143966rP;
import X.C144206ro;
import X.C145156tR;
import X.C1496872i;
import X.C1497472p;
import X.C1498172w;
import X.C160927lo;
import X.C162017nt;
import X.C162027nu;
import X.C162727p3;
import X.C163667qZ;
import X.C165397tM;
import X.C18740tg;
import X.C18950u5;
import X.C19430v1;
import X.C19630wG;
import X.C20350xQ;
import X.C20430xY;
import X.C20810yC;
import X.C20830yE;
import X.C21010yW;
import X.C21060yb;
import X.C21390zA;
import X.C21710zg;
import X.C226815j;
import X.C25271Fq;
import X.C25841Hw;
import X.C26211Jh;
import X.C27631Pa;
import X.C27721Pm;
import X.C27731Pn;
import X.C30531aM;
import X.C32661dz;
import X.C32791eC;
import X.C32811eE;
import X.C34061gO;
import X.C34631hO;
import X.C34681hT;
import X.C34831hi;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36371kC;
import X.C36381kD;
import X.C36391kE;
import X.C36411kG;
import X.C36431kI;
import X.C36441kJ;
import X.C39001qm;
import X.C585730f;
import X.C68733cN;
import X.C87574Pi;
import X.C88464Su;
import X.C90464aC;
import X.C90474aD;
import X.C90484aE;
import X.C90494aF;
import X.C90504aG;
import X.C90514aH;
import X.C95504lc;
import android.app.AppOpsManager;
import android.app.Dialog;
import android.app.KeyguardManager;
import android.app.PictureInPictureParams;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Process;
import android.util.Pair;
import android.util.Rational;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.OvershootInterpolator;
import android.view.animation.ScaleAnimation;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.view.inputmethod.EditorInfoCompat;
import androidx.fragment.app.DialogFragment;
import com.whatsapp.R;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;
import com.whatsapp.calling.CallDetailsLayout;
import com.whatsapp.calling.avatar.viewmodel.CallAvatarViewModel;
import com.whatsapp.calling.callgrid.view.CallGrid;
import com.whatsapp.calling.callgrid.view.VoipInCallNotifBanner;
import com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel;
import com.whatsapp.calling.callgrid.viewmodel.InCallBannerViewModel;
import com.whatsapp.calling.callgrid.viewmodel.MenuBottomSheetViewModel;
import com.whatsapp.calling.callgrid.viewmodel.OrientationViewModel;
import com.whatsapp.calling.callheader.viewmodel.CallHeaderViewModel;
import com.whatsapp.calling.lightweightcalling.viewmodel.VoiceChatBottomSheetViewModel;
import com.whatsapp.calling.screenshare.ScreenShareViewModel;
import com.whatsapp.calling.views.AppSettingsWarningDialogFragment;
import com.whatsapp.calling.views.VoipCallFooter;
import com.whatsapp.contact.picker.ContactPickerFragment;
import com.whatsapp.contact.picker.viewmodels.CallSuggestionsViewModel;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.camera.VoipCameraManager;
import com.whatsapp.voipcalling.dialogs.EndCallConfirmationDialogFragment;
import com.whatsapp.voipcalling.dialogs.MessageDialogFragment;
import com.whatsapp.voipcalling.dialogs.NonActivityDismissDialogFragment;
import com.whatsapp.voipcalling.dialogs.SwitchConfirmationFragment;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class VoipActivityV2 extends C107285Nl implements C88464Su, ViewTreeObserver.OnGlobalLayoutListener, AnonymousClass7gG, C87574Pi, C162017nt, AnonymousClass4SS, AnonymousClass7dG {
    public int A00 = 3;
    public int A01;
    public long A02;
    public PictureInPictureParams.Builder A03;
    public Drawable A04;
    public Handler A05;
    public View.OnClickListener A06;
    public View.OnClickListener A07;
    public View.OnClickListener A08;
    public View A09;
    public View A0A;
    public View A0B;
    public View A0C;
    public View A0D;
    public View A0E;
    public ViewGroup A0F;
    public ViewGroup A0G;
    public ImageButton A0H;
    public ImageView A0I;
    public TextView A0J;
    public TextView A0K;
    public TextView A0L;
    public C009904e A0M = BnD(new C165397tM(this, 13), new C009504a());
    public DialogFragment A0N;
    public DialogFragment A0O;
    public DialogFragment A0P;
    public C21390zA A0Q;
    public C115365il A0R;
    public WaImageView A0S;
    public WaTextView A0T;
    public AnonymousClass1KK A0U;
    public AnonymousClass1NG A0V;
    public CallDetailsLayout A0W;
    public C585730f A0X;
    public C30531aM A0Y;
    public C27631Pa A0Z;
    public CallAvatarViewModel A0a;
    public C145156tR A0b;
    public C1265364k A0c;
    public VoipInCallNotifBanner A0d;
    public CallGridViewModel A0e;
    public InCallBannerViewModel A0f;
    public MenuBottomSheetViewModel A0g;
    public OrientationViewModel A0h;
    public AnonymousClass5M6 A0i;
    public AnonymousClass1ND A0j;
    public C160927lo A0k;
    public C144206ro A0l;
    public AnonymousClass1PZ A0m;
    public C123765x3 A0n;
    public AnonymousClass1NF A0o;
    public C131176Oa A0p;
    public ScreenShareViewModel A0q;
    public AnonymousClass6YM A0r;
    public AnonymousClass1PW A0s;
    public AnonymousClass6T1 A0t;
    public C130806Mm A0u;
    public AnonymousClass53T A0v;
    public C121465tB A0w;
    public AnonymousClass711 A0x;
    public C162027nu A0y;
    public C34631hO A0z;
    public AnonymousClass1MK A10;
    public C130216Ke A11;
    public AnonymousClass16D A12;
    public AnonymousClass16I A13;
    public AnonymousClass185 A14;
    public AnonymousClass171 A15;
    public C27731Pn A16;
    public ContactPickerFragment A17;
    public AnonymousClass6W1 A18;
    public C20430xY A19;
    public AnonymousClass1NM A1A;
    public C19630wG A1B;
    public AnonymousClass17Z A1C;
    public C25271Fq A1D;
    public C20830yE A1E;
    public AnonymousClass1HJ A1F;
    public AnonymousClass17X A1G;
    public AnonymousClass1HO A1H;
    public C26211Jh A1I;
    public C25841Hw A1J;
    public C21010yW A1K;
    public C20350xQ A1L;
    public UserJid A1M = null;
    public C34061gO A1N;
    public C32791eC A1O;
    public AnonymousClass3T0 A1P;
    public AnonymousClass1C6 A1Q;
    public AnonymousClass1N6 A1R;
    public C32661dz A1S;
    public C32811eE A1T;
    public AnonymousClass13J A1U;
    public AnonymousClass1RJ A1V;
    public AnonymousClass1RJ A1W;
    public C107275Ni A1X;
    public C27721Pm A1Y;
    public AnonymousClass61I A1Z;
    public VoipCallControlBottomSheetV2 A1a;
    public VoipCameraManager A1b;
    public AnonymousClass005 A1c;
    public AnonymousClass005 A1d;
    public AnonymousClass005 A1e;
    public AnonymousClass005 A1f;
    public AnonymousClass005 A1g;
    public String A1h;
    public String A1i;
    public AnonymousClass004 A1j;
    public AnonymousClass004 A1k;
    public AnonymousClass004 A1l;
    public boolean A1m;
    public boolean A1n;
    public boolean A1o;
    public boolean A1p;
    public boolean A1q;
    public boolean A1r;
    public boolean A1s;
    public boolean A1t;
    public boolean A1u;
    public boolean A1v;
    public boolean A1w;
    public boolean A1x = true;
    public boolean A1y = false;
    public int A1z;
    public int A20;
    public int A21;
    public int A22;
    public int A23;
    public int A24;
    public View.OnClickListener A25;
    public View A26;
    public ImageView A27;
    public ImageView A28;
    public DialogFragment A29;
    public CallGrid A2A;
    public CallHeaderViewModel A2B;
    public AppSettingsWarningDialogFragment A2C;
    public C226815j A2D = null;
    public C68733cN A2E;
    public CallSuggestionsViewModel A2F;
    public AnonymousClass1RJ A2G;
    public AnonymousClass1RJ A2H;
    public boolean A2I;
    public boolean A2J;
    public boolean A2K;
    public boolean A2L;
    public boolean A2M;
    public boolean A2N;
    public boolean A2O;
    public boolean A2P;
    public final View.OnClickListener A2Q = new C135476cl(this, 16);
    public final AnonymousClass7gF A2R = new C143966rP(this);
    public final AnonymousClass1NK A2S = new C163667qZ(this, 3);

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001e, code lost:
        if (r7 != 10) goto L_0x0020;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x002c, code lost:
        if (r0.A3R == 7) goto L_0x002e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String A0F(com.whatsapp.jid.UserJid r6, int r7) {
        /*
            r5 = this;
            r0 = 2
            r1 = 2131895893(0x7f122655, float:1.9426632E38)
            if (r7 == r0) goto L_0x0031
            r0 = 17
            if (r7 == r0) goto L_0x002e
            r0 = 25
            if (r7 == r0) goto L_0x0021
            r0 = 4
            r1 = 2131895915(0x7f12266b, float:1.9426676E38)
            if (r7 == r0) goto L_0x0031
            r0 = 5
            if (r7 == r0) goto L_0x0036
            r0 = 9
            r2 = 0
            if (r7 == r0) goto L_0x0025
            r0 = 10
            if (r7 == r0) goto L_0x0021
        L_0x0020:
            return r2
        L_0x0021:
            r1 = 2131895881(0x7f122649, float:1.9426608E38)
            goto L_0x0031
        L_0x0025:
            X.6YM r0 = r5.A0r
            if (r0 == 0) goto L_0x0020
            int r1 = r0.A3R
            r0 = 7
            if (r1 != r0) goto L_0x0020
        L_0x002e:
            r1 = 2131896050(0x7f1226f2, float:1.942695E38)
        L_0x0031:
            java.lang.String r0 = r5.getString(r1)
            return r0
        L_0x0036:
            r4 = 2131892764(0x7f121a1c, float:1.9420286E38)
            java.lang.Object[] r3 = X.AnonymousClass001.A0L()
            r2 = 0
            X.171 r1 = r5.A15
            X.16D r0 = r5.A12
            java.lang.String r0 = X.C36381kD.A0u(r0, r1, r6)
            java.lang.String r0 = X.C36391kE.A0v(r5, r0, r3, r2, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.VoipActivityV2.A0F(com.whatsapp.jid.UserJid, int):java.lang.String");
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A1B(com.whatsapp.voipcalling.VoipActivityV2 r5, int r6) {
        /*
            r4 = 1
            r5.A2P = r4
            com.whatsapp.calling.views.AppSettingsWarningDialogFragment r3 = r5.A2C
            java.lang.String r2 = "AppSettingsWarningDialogFragment"
            if (r3 == 0) goto L_0x0013
            int r0 = r3.A00
            if (r6 == r0) goto L_0x0026
            r5.A3q(r2)
            r0 = 0
            r5.A2C = r0
        L_0x0013:
            android.os.Bundle r1 = X.AnonymousClass001.A07()
            java.lang.String r0 = "reason"
            r1.putInt(r0, r6)
            com.whatsapp.calling.views.AppSettingsWarningDialogFragment r3 = new com.whatsapp.calling.views.AppSettingsWarningDialogFragment
            r3.<init>()
            r3.A17(r1)
            r5.A2C = r3
        L_0x0026:
            boolean r0 = r5.A1r
            if (r0 != 0) goto L_0x003b
            X.5rH r0 = new X.5rH
            r0.<init>()
            r0.A01 = r4
            boolean r1 = r0.A00
            X.6P2 r0 = new X.6P2
            r0.<init>(r4, r1)
            r5.A3n(r3, r0, r2)
        L_0x003b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.VoipActivityV2.A1B(com.whatsapp.voipcalling.VoipActivityV2, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001e, code lost:
        if (r4.A1m != false) goto L_0x0020;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A1Q(com.whatsapp.voipcalling.CallInfo r3, com.whatsapp.voipcalling.VoipActivityV2 r4) {
        /*
            r2 = 0
            com.whatsapp.voipcalling.CallState r1 = r3.callState
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.ACTIVE
            if (r1 == r0) goto L_0x0020
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.CONNECTED_LONELY
            if (r1 == r0) goto L_0x0020
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.LINK
            if (r1 == r0) goto L_0x0020
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.CALLING
            if (r1 == r0) goto L_0x0020
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.PRE_ACCEPT_RECEIVED
            if (r1 == r0) goto L_0x0020
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.PRECALLING
            if (r1 == r0) goto L_0x0020
            boolean r0 = r4.A1m
            r1 = 0
            if (r0 == 0) goto L_0x0021
        L_0x0020:
            r1 = 1
        L_0x0021:
            boolean r0 = r4.A1q
            if (r0 != 0) goto L_0x0028
            if (r1 == 0) goto L_0x0028
            r2 = 1
        L_0x0028:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.VoipActivityV2.A1Q(com.whatsapp.voipcalling.CallInfo, com.whatsapp.voipcalling.VoipActivityV2):boolean");
    }

    public int A2I() {
        return 78318969;
    }

    public boolean A2f() {
        return true;
    }

    public boolean A3d() {
        return false;
    }

    public void A3w(CharSequence charSequence) {
        this.A0J.setText(charSequence);
        this.A0C.setVisibility(0);
        C011504z.A04((Drawable) null, this.A0C);
        this.A0B.setVisibility(8);
        this.A0T.setVisibility(8);
    }

    public void onResume() {
        AnonymousClass6YM r0;
        boolean A0E2 = this.A0D.A0E(1807);
        if (A0E2) {
            try {
                this.A02.A09("VoipActivityV2_onResume");
            } catch (Throwable th) {
                if (A0E2) {
                    this.A02.A08("VoipActivityV2_onResume");
                }
                throw th;
            }
        }
        super.onResume();
        this.A1t = false;
        if (this.A26 != null) {
            this.A1s = true;
            this.A1u = true;
            CallInfo A012 = A01(this);
            if (!(A012 == null || A012.callState == CallState.NONE)) {
                A11(this);
                this.A05.sendEmptyMessageDelayed(1, 500);
                if (A012.videoEnabled) {
                    if (!AnonymousClass000.A1S(A012.self.A06, 6)) {
                        UserJid peerJid = A012.getPeerJid();
                        if (!A012.isCallLinkLobbyOrJoiningState()) {
                            C18740tg.A06(peerJid);
                            AnonymousClass6EE infoByJid = A012.getInfoByJid(peerJid);
                            if (infoByJid != null && infoByJid.A0O) {
                                C18740tg.A01();
                                C36321k7.A1K(peerJid, "voip/VoipActivityV2/videoRenderStarted ", AnonymousClass000.A0u());
                                A0u(A01(this), this);
                                A13(this);
                            }
                        }
                        A0u(A012, this);
                    } else if (this.A1y && (r0 = this.A0r) != null) {
                        r0.A1E.execute(AnonymousClass74Y.A00);
                    }
                }
                this.A2A.A0E(this, this.A0e, this.A0g, (VoiceChatBottomSheetViewModel) null, this.A0q);
                if (this.A1y) {
                    this.A1y = false;
                }
                if (A1S(this) && isInPictureInPictureMode()) {
                    onPictureInPictureModeChanged(true, AnonymousClass000.A0U(this));
                } else if (A1S(this) && this.A03 == null) {
                    this.A03 = new PictureInPictureParams.Builder();
                    Rational rational = (Rational) this.A0e.A0M.A04();
                    if (rational != null) {
                        A0k(rational, this);
                    }
                }
                if (this.A00 == 2) {
                    A0Q(3);
                    if (!C90484aE.A1R(this, C114145gi.A07)) {
                        A0K();
                    }
                }
                C107905Ri r7 = C107905Ri.A02;
                Iterator A0y2 = AnonymousClass000.A0y(C000400e.A0B(this.A00));
                while (A0y2.hasNext()) {
                    Map.Entry A112 = AnonymousClass000.A11(A0y2);
                    String A0f2 = C90494aF.A0f(A112);
                    AnonymousClass011 r02 = (AnonymousClass011) A112.getValue();
                    DialogFragment dialogFragment = (DialogFragment) r02.first;
                    AnonymousClass6P2 r1 = (AnonymousClass6P2) r02.second;
                    if (r7.ordinal() != 0) {
                        throw C36441kJ.A18();
                    } else if (r1.A01) {
                        Btn(dialogFragment, A0f2);
                    }
                }
                if (this.A2P && !C34681hT.A0F(this.A08)) {
                    this.A2P = false;
                    if (this.A1U.BMU()) {
                        C132636Up.A00(this.A0s, "refresh_app_background_restrictions");
                    }
                }
            }
        }
        if (A0E2) {
            this.A02.A08("VoipActivityV2_onResume");
        }
    }

    public void onUserInteraction() {
        this.A1u = true;
    }

    private CallState A07(CallInfo callInfo) {
        CallState callState = callInfo.callState;
        if (Voip.A09(callState) && this.A1m) {
            return CallState.ACCEPT_SENT;
        }
        if (!callInfo.hasOutgoingParticipantInActiveOneToOneCall()) {
            return callState;
        }
        AnonymousClass6EE defaultPeerInfo = callInfo.getDefaultPeerInfo();
        C18740tg.A06(defaultPeerInfo);
        if (defaultPeerInfo.A02 == 2) {
            return CallState.CALLING;
        }
        if (callInfo.getDefaultPeerInfo().A02 == 3) {
            return CallState.PRE_ACCEPT_RECEIVED;
        }
        return callState;
    }

    private void A0H() {
        Log.i("voip/VoipActivityV2/hideInCallControls");
        this.A1x = false;
        if (!this.A1q) {
            this.A1W.A03(8);
            this.A1W.A01().setTranslationY(0.0f);
        }
        this.A0C.setVisibility(8);
        Log.i("voip/VoipCallControlBottomSheetV2 detaching bottom sheet");
        if (this.A1a != null) {
            A3D("CallControlSheet");
        }
    }

    private void A0I() {
        VoipCallControlBottomSheetV2 voipCallControlBottomSheetV2 = this.A1a;
        if (voipCallControlBottomSheetV2 != null && voipCallControlBottomSheetV2.A12()) {
            voipCallControlBottomSheetV2.A1c();
        }
        this.A1a = null;
        AnonymousClass6T1 r0 = this.A0t;
        if (r0 != null) {
            r0.A00 = null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0026, code lost:
        if (X.C34681hT.A0G(r4.A0D) == false) goto L_0x0028;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A0J() {
        /*
            r4 = this;
            X.0yC r1 = r4.A0D
            r0 = 4624(0x1210, float:6.48E-42)
            boolean r0 = r1.A0E(r0)
            r3 = 0
            if (r0 == 0) goto L_0x0011
            X.1RJ r0 = r4.A2G
            r0.A03(r3)
        L_0x0010:
            return
        L_0x0011:
            com.whatsapp.voipcalling.VoipCallControlBottomSheetV2 r0 = r4.A1a
            if (r0 != 0) goto L_0x0010
            com.whatsapp.voipcalling.CallInfo r2 = A01(r4)
            boolean r0 = A1T(r4)
            if (r0 == 0) goto L_0x0028
            X.0yC r0 = r4.A0D
            boolean r0 = X.C34681hT.A0G(r0)
            r1 = 1
            if (r0 != 0) goto L_0x0029
        L_0x0028:
            r1 = 0
        L_0x0029:
            if (r2 == 0) goto L_0x0030
            boolean r0 = r2.videoEnabled
            if (r0 == 0) goto L_0x0030
            r3 = 1
        L_0x0030:
            com.whatsapp.voipcalling.VoipCallControlBottomSheetV2 r0 = com.whatsapp.voipcalling.VoipCallControlBottomSheetV2.A06(r3, r1)
            r4.A1a = r0
            boolean r0 = r4.A1q
            if (r0 != 0) goto L_0x0044
            X.1RJ r0 = r4.A1W
            android.view.View r1 = r0.A01()
            r0 = 0
            r1.setTranslationY(r0)
        L_0x0044:
            if (r2 == 0) goto L_0x0010
            boolean r0 = r2.isPeerRequestingUpgrade()
            if (r0 != 0) goto L_0x0010
            boolean r0 = r2.isGroupCall
            if (r0 != 0) goto L_0x0058
            com.whatsapp.voipcalling.CallState r0 = r2.callState
            boolean r0 = com.whatsapp.voipcalling.Voip.A0A(r0)
            if (r0 != 0) goto L_0x0010
        L_0x0058:
            A14(r4)
            com.whatsapp.calling.callgrid.view.VoipInCallNotifBanner r2 = r4.A0d
            android.view.ViewGroup$MarginLayoutParams r1 = X.AnonymousClass000.A0a(r2)
            java.lang.String r0 = "VoipCallNewParticipantBanner/resetBannerYPosition"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            int r0 = r2.A02
            r1.bottomMargin = r0
            r2.setLayoutParams(r1)
            X.5Ni r1 = r4.A1X
            if (r1 == 0) goto L_0x0010
            r0 = 1
            r1.A01(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.VoipActivityV2.A0J():void");
    }

    private void A0K() {
        Log.i("voip/VoipActivityV2/showInCallControls");
        this.A1x = true;
        if (this.A1a != null) {
            A14(this);
            this.A0c.A00();
            VoipInCallNotifBanner voipInCallNotifBanner = this.A0d;
            ViewGroup.MarginLayoutParams A0a2 = AnonymousClass000.A0a(voipInCallNotifBanner);
            Log.i("VoipCallNewParticipantBanner/resetBannerYPosition");
            A0a2.bottomMargin = voipInCallNotifBanner.A02;
            voipInCallNotifBanner.setLayoutParams(A0a2);
        }
        if (!this.A1q) {
            this.A1W.A03(0);
            this.A1W.A01().setTranslationY(0.0f);
        }
        if (this.A0J.length() > 0) {
            this.A0C.setVisibility(0);
        }
    }

    private void A0L() {
        Log.i("VoipActivityV2 vm unbindService");
        try {
            this.A0s.A02(this);
        } catch (IllegalArgumentException e) {
            Log.e((Throwable) e);
        }
        AnonymousClass6YM r2 = this.A0r;
        if (r2 != null) {
            C36321k7.A1K(r2, "voip/service/resetVoipUiIfEquals ", AnonymousClass000.A0u());
            if (r2.A0t == this) {
                r2.A0t = null;
            }
            this.A0r = null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A0Q(int r8) {
        /*
            r7 = this;
            int r0 = r7.A00
            if (r0 == r8) goto L_0x00e1
            r7.A00 = r8
            X.7lo r0 = r7.A0k
            r0.Bcf()
            com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel r4 = r7.A0e
            r6 = 0
            r5 = 1
            boolean r0 = X.AnonymousClass000.A1S(r8, r5)
            r4.A0A = r0
            X.00s r3 = r4.A0O
            java.lang.Object r2 = X.C90524aI.A0c(r3)
            X.5yN r2 = (X.C124545yN) r2
            boolean r1 = r4.A0A
            r2.A06 = r1
            r0 = 1046898278(0x3e666666, float:0.225)
            if (r1 == 0) goto L_0x0029
            r0 = 1051260355(0x3ea8f5c3, float:0.33)
        L_0x0029:
            r2.A00 = r0
            r3.A0D(r2)
            com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel.A0I(r4)
            com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel.A0K(r4)
            if (r8 != 0) goto L_0x00f2
            X.1hi r1 = r4.A0l
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r6)
        L_0x003c:
            r1.A0D(r0)
        L_0x003f:
            boolean r0 = r4.A0C
            if (r0 == 0) goto L_0x0058
            boolean r3 = r4.A0A
            X.6Oa r2 = r4.A0U
            X.0wQ r1 = r4.A0P
            com.whatsapp.jid.UserJid r0 = r4.A04
            boolean r0 = r1.A0M(r0)
            if (r3 == 0) goto L_0x00e6
            if (r0 == 0) goto L_0x00e2
            X.6Ea r0 = r2.A0N
        L_0x0055:
            r0.A02()
        L_0x0058:
            X.6ro r0 = r7.A0l
            if (r0 == 0) goto L_0x0069
            r1 = 1
            if (r8 == 0) goto L_0x0062
            if (r8 == r1) goto L_0x0062
            r1 = 0
        L_0x0062:
            X.6wd r0 = r0.A09
            r0.A0C = r1
            X.C147076wd.A01(r0)
        L_0x0069:
            com.whatsapp.calling.callgrid.viewmodel.InCallBannerViewModel r0 = r7.A0f
            r2 = 3
            boolean r1 = X.C36381kD.A1U(r8, r2)
            r0.A00 = r1
            X.1Rs r0 = r0.A08
            X.C36341k9.A18(r0, r1)
            X.6T1 r5 = r7.A0t
            if (r5 == 0) goto L_0x0099
            boolean r0 = r5.A03
            if (r0 == 0) goto L_0x0099
            X.1hi r0 = r5.A09
            java.lang.Object r0 = X.C36401kF.A0m(r0)
            X.6PK r0 = (X.AnonymousClass6PK) r0
            boolean r4 = X.C36381kD.A1U(r8, r2)
            int r3 = r0.A01
            float r2 = r0.A00
            boolean r1 = r0.A03
            X.6PK r0 = new X.6PK
            r0.<init>(r2, r3, r4, r1)
            X.AnonymousClass6T1.A00(r5, r0)
        L_0x0099:
            boolean r0 = r7.A1q
            if (r0 == 0) goto L_0x00e1
            X.005 r0 = r7.A1e
            java.lang.Object r1 = r0.get()
            X.5yo r1 = (X.C124795yo) r1
            r3 = 1
            if (r8 == r3) goto L_0x00ab
            if (r8 == 0) goto L_0x00ab
            r3 = 0
        L_0x00ab:
            X.05L r2 = r1.A07
            java.lang.Object r0 = r2.getValue()
            boolean r0 = X.AnonymousClass000.A1X(r0)
            if (r0 == 0) goto L_0x00c3
            if (r3 != 0) goto L_0x00c3
            X.05L r1 = r1.A08
            r0 = 0
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r1.setValue(r0)
        L_0x00c3:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            r2.setValue(r0)
            X.005 r0 = r7.A1d
            java.lang.Object r0 = r0.get()
            X.5xi r0 = (X.C124175xi) r0
            X.05L r1 = r0.A04
            r0 = 1
            if (r8 == r0) goto L_0x00da
            if (r8 == 0) goto L_0x00da
            r0 = 0
        L_0x00da:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1.setValue(r0)
        L_0x00e1:
            return
        L_0x00e2:
            X.6Ea r0 = r2.A0K
            goto L_0x0055
        L_0x00e6:
            if (r0 == 0) goto L_0x00ef
            X.6Ea r0 = r2.A0N
        L_0x00ea:
            r0.A00()
            goto L_0x0058
        L_0x00ef:
            X.6Ea r0 = r2.A0K
            goto L_0x00ea
        L_0x00f2:
            r0 = 2
            X.1hi r1 = r4.A0l
            if (r8 != r0) goto L_0x00fd
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
            goto L_0x003c
        L_0x00fd:
            boolean r0 = r4.A0A
            r5 = r5 ^ r0
            X.C36341k9.A18(r1, r5)
            android.graphics.Rect r1 = r4.A01
            if (r1 == 0) goto L_0x010c
            X.1hi r0 = r4.A0r
            r0.A0D(r1)
        L_0x010c:
            X.C95504lc.A04(r4)
            goto L_0x003f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.VoipActivityV2.A0Q(int):void");
    }

    private void A0h(int i, int i2) {
        AnonymousClass6EE r0;
        VoipCallControlBottomSheetV2 voipCallControlBottomSheetV2 = this.A1a;
        if (voipCallControlBottomSheetV2 != null) {
            voipCallControlBottomSheetV2.A03 = i2;
            VoipCallFooter voipCallFooter = voipCallControlBottomSheetV2.A0U;
            if (voipCallFooter != null) {
                voipCallFooter.A03(i2);
            }
        }
        if (!this.A1q) {
            ViewGroup viewGroup = this.A0G;
            C18740tg.A04(viewGroup);
            viewGroup.setRotation((float) i2);
        }
        if (!C90474aD.A1X(this.A1k) && !this.A1q) {
            ImageButton imageButton = this.A0H;
            C18740tg.A04(imageButton);
            imageButton.setRotation((float) i2);
        }
        this.A0C.setRotation((float) i2);
        CallGridViewModel callGridViewModel = this.A0e;
        callGridViewModel.A00 = i;
        if (!(callGridViewModel.A05 == null || (r0 = (AnonymousClass6EE) callGridViewModel.A0Q.A05().A04.get(callGridViewModel.A05)) == null)) {
            CallGridViewModel.A0F(r0, callGridViewModel);
        }
        if (callGridViewModel.A0C && !callGridViewModel.A0P.A0M(callGridViewModel.A04)) {
            C131176Oa r3 = callGridViewModel.A0U;
            int i3 = callGridViewModel.A00;
            boolean z = true;
            if (!(i3 == 1 || i3 == 3)) {
                z = false;
            }
            C128896Ea r1 = r3.A0J;
            if (!z) {
                r1.A00();
            } else if (!r1.A01) {
                r1.A02();
            }
        }
        C95504lc.A03(callGridViewModel);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x002c, code lost:
        if (r1.A04.equals(r3) != false) goto L_0x002e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A0i(android.content.Intent r5, com.whatsapp.voipcalling.CallInfo r6) {
        /*
            r4 = this;
            java.lang.String r0 = X.C114145gi.A00
            boolean r1 = X.C90514aH.A1W(r5, r0)
            java.lang.String r0 = "should only be called if intent action is ACTION_ACCEPT_INCOMING_CALL"
            X.C18740tg.A0D(r1, r0)
            java.lang.String r0 = "call_id"
            java.lang.String r3 = r5.getStringExtra(r0)
            boolean r0 = X.C34681hT.A0T(r6)
            if (r0 == 0) goto L_0x003e
            java.lang.String r0 = r6.callId
            boolean r0 = r0.equals(r3)
            r2 = 1
            if (r0 != 0) goto L_0x002e
            X.3Az r1 = r6.callWaitingInfo
            int r0 = r1.A01
            if (r0 != r2) goto L_0x003e
            java.lang.String r0 = r1.A04
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x003e
        L_0x002e:
            r4.A1m = r2
            X.6YM r0 = r4.A0r
            if (r0 == 0) goto L_0x004f
            r1 = 0
            java.lang.String r0 = "call_ui_action"
            int r0 = r5.getIntExtra(r0, r1)
            A19(r4, r0)
        L_0x003e:
            com.whatsapp.jid.GroupJid r2 = r6.groupJid
            if (r2 != 0) goto L_0x0048
            com.whatsapp.jid.UserJid r2 = r6.getCreatorJid()
            if (r2 == 0) goto L_0x004e
        L_0x0048:
            X.1NM r1 = r4.A1A
            r0 = 5
            r1.A0B(r2, r0)
        L_0x004e:
            return
        L_0x004f:
            r4.A2I = r2
            goto L_0x003e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.VoipActivityV2.A0i(android.content.Intent, com.whatsapp.voipcalling.CallInfo):void");
    }

    private void A0j(Intent intent, CallInfo callInfo) {
        C18740tg.A0D(C90514aH.A1W(intent, "com.whatsapp.intent.action.SHOW_ALERT_MESSAGE_IN_ACTIVE_CALL"), "should only be called if intent action is ACTION_SHOW_ALERT_MESSAGE_IN_ACTIVE_CALL");
        if (callInfo.callState == CallState.ACTIVE) {
            String stringExtra = intent.getStringExtra("alertMessage");
            AnonymousClass00C.A0D(stringExtra, 0);
            NonActivityDismissDialogFragment nonActivityDismissDialogFragment = new NonActivityDismissDialogFragment();
            Bundle A0I2 = C36431kI.A0I("text", stringExtra);
            A0I2.putBoolean("dismiss", false);
            nonActivityDismissDialogFragment.A17(A0I2);
            A3o(nonActivityDismissDialogFragment, "NonActivityDismissDialogFragment");
            return;
        }
        Log.i("voip/VoipActivityV2/new-intent call is gone, ignore the request to show alert message");
        finish();
    }

    public static void A0l(View view) {
        C36321k7.A1T("calling/VoipUiUtils/animateButtonIn delay:", AnonymousClass000.A0u(), 100);
        ScaleAnimation scaleAnimation = new ScaleAnimation(0.0f, 1.0f, 0.0f, 1.0f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setInterpolator(new OvershootInterpolator(1.0f));
        scaleAnimation.setDuration(300);
        scaleAnimation.setStartOffset((long) 100);
        view.startAnimation(scaleAnimation);
    }

    public static void A0m(AnonymousClass04S r6, VoipActivityV2 voipActivityV2, boolean z) {
        String string;
        C36331k8.A0w(C90474aD.A0F(voipActivityV2.A0Z), "screen_sharing_backward_compat_shown", true);
        C39001qm A002 = AnonymousClass3LW.A00(voipActivityV2);
        int i = R.string.f12nameremoved;
        if (z) {
            i = R.string.f12nameremoved;
        }
        A002.A0d(i);
        if (z) {
            string = voipActivityV2.getString(R.string.f12nameremoved);
        } else {
            Object[] objArr = new Object[1];
            AnonymousClass000.A1L(objArr, voipActivityV2.A0D.A07(3694), 0);
            string = voipActivityV2.getString(R.string.f12nameremoved, objArr);
        }
        A002.A0p(string);
        A002.A0m(voipActivityV2, r6, R.string.f12nameremoved);
        A002.A0l(voipActivityV2, (AnonymousClass04S) null, R.string.f12nameremoved);
        AnonymousClass0FM create = A002.create();
        AnonymousClass00C.A0D(create, 0);
        voipActivityV2.A3n(new VoipDialogManagerActivity$DialogWrapperFragment(create), new AnonymousClass6P2(false, true), "ScreenSharingBackwardCompatDialog");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002d, code lost:
        if (r7.A00 != 2) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0078, code lost:
        if (r7.A00 != 2) goto L_0x007a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0080, code lost:
        if (r7.A00 == 3) goto L_0x0082;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0082, code lost:
        r5 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0083, code lost:
        r0 = r8.A0h;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0085, code lost:
        if (r0 == null) goto L_0x00cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x008d, code lost:
        if (r0.A05.A04() == null) goto L_0x00cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x008f, code lost:
        r1 = X.C36341k9.A07(r8.A0h.A05);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0097, code lost:
        if (r2 == false) goto L_0x00b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0099, code lost:
        r2 = 0;
        com.whatsapp.voipcalling.Voip.videoDeviceAndDisplayOrientationChanged(r1 * 90, 0, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00a3, code lost:
        if (com.whatsapp.voipcalling.Voip.setEnableFixedVideoOrientation(r5) == false) goto L_0x00ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00a5, code lost:
        com.whatsapp.voipcalling.Voip.videoDeviceAndDisplayOrientationChanged(r1 * 90, r2 * 90, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00b7, code lost:
        r2 = (((android.hardware.display.DisplayManager) r8.getSystemService("display")).getDisplay(0).getRotation() + r1) % 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00cb, code lost:
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00cf, code lost:
        if (r7.A00 == 0) goto L_0x0082;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00d2, code lost:
        r5 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001a, code lost:
        if (X.C36351kA.A1W(r3.A0n) == false) goto L_0x001c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A0n(X.AnonymousClass6PI r7, com.whatsapp.voipcalling.VoipActivityV2 r8) {
        /*
            com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel r3 = r8.A0e
            if (r7 == 0) goto L_0x0025
            X.1hi r2 = r3.A0o
            X.1Hw r0 = r3.A0c
            boolean r0 = r0.A00()
            if (r0 != 0) goto L_0x001c
            int r1 = r7.A00
            r0 = 3
            if (r1 == r0) goto L_0x001c
            X.1hi r0 = r3.A0n
            boolean r1 = X.C36351kA.A1W(r0)
            r0 = 1
            if (r1 != 0) goto L_0x001d
        L_0x001c:
            r0 = 0
        L_0x001d:
            X.C36341k9.A18(r2, r0)
            X.1hi r0 = r3.A0i
            r0.A0D(r7)
        L_0x0025:
            r2 = 2
            r3 = 1
            r4 = 0
            if (r7 == 0) goto L_0x002f
            int r1 = r7.A00
            r0 = 1
            if (r1 == r2) goto L_0x0030
        L_0x002f:
            r0 = 0
        L_0x0030:
            r8.A2L = r0
            X.64k r1 = r8.A0c
            if (r1 == 0) goto L_0x003a
            r0 = r0 ^ 1
            r1.A02 = r0
        L_0x003a:
            if (r7 == 0) goto L_0x00ac
            android.view.View r0 = r8.A0A
            if (r0 == 0) goto L_0x006c
            android.view.ViewParent r6 = r0.getParent()
            android.view.View r6 = (android.view.View) r6
            android.content.res.Resources r1 = r8.getResources()
            r0 = 2131165538(0x7f070162, float:1.7945296E38)
            int r5 = r1.getDimensionPixelSize(r0)
            android.view.View r0 = r8.A0A
            android.view.ViewGroup$MarginLayoutParams r2 = X.AnonymousClass000.A0a(r0)
            boolean r0 = r8.A2L
            if (r0 == 0) goto L_0x00d4
            int r1 = r6.getHeight()
            android.graphics.Rect r0 = r7.A01
            int r0 = r0.top
            int r1 = r1 - r0
            int r1 = r1 + r5
        L_0x0065:
            r2.bottomMargin = r1
            android.view.View r0 = r8.A0A
            r0.setLayoutParams(r2)
        L_0x006c:
            X.1Hw r0 = r8.A1J
            boolean r5 = r0.A00()
            if (r5 == 0) goto L_0x007a
            int r1 = r7.A00
            r0 = 2
            r2 = 1
            if (r1 == r0) goto L_0x00cd
        L_0x007a:
            r2 = 0
            if (r5 != 0) goto L_0x00cd
            int r1 = r7.A00
            r0 = 3
            if (r1 != r0) goto L_0x00d2
        L_0x0082:
            r5 = 0
        L_0x0083:
            com.whatsapp.calling.callgrid.viewmodel.OrientationViewModel r0 = r8.A0h
            if (r0 == 0) goto L_0x00cb
            X.00s r0 = r0.A05
            java.lang.Object r0 = r0.A04()
            if (r0 == 0) goto L_0x00cb
            com.whatsapp.calling.callgrid.viewmodel.OrientationViewModel r0 = r8.A0h
            X.00s r0 = r0.A05
            int r1 = X.C36341k9.A07(r0)
        L_0x0097:
            if (r2 == 0) goto L_0x00b7
            r2 = 0
            int r0 = r1 * 90
            com.whatsapp.voipcalling.Voip.videoDeviceAndDisplayOrientationChanged(r0, r4, r3)
        L_0x009f:
            boolean r0 = com.whatsapp.voipcalling.Voip.setEnableFixedVideoOrientation(r5)
            if (r0 == 0) goto L_0x00ac
            int r1 = r1 * 90
            int r0 = r2 * 90
            com.whatsapp.voipcalling.Voip.videoDeviceAndDisplayOrientationChanged(r1, r0, r3)
        L_0x00ac:
            com.whatsapp.voipcalling.CallInfo r0 = A01(r8)
            A17(r8)
            A0t(r0, r8)
            return
        L_0x00b7:
            java.lang.String r0 = "display"
            java.lang.Object r0 = r8.getSystemService(r0)
            android.hardware.display.DisplayManager r0 = (android.hardware.display.DisplayManager) r0
            android.view.Display r0 = r0.getDisplay(r4)
            int r0 = r0.getRotation()
            int r0 = r0 + r1
            int r2 = r0 % 4
            goto L_0x009f
        L_0x00cb:
            r1 = 0
            goto L_0x0097
        L_0x00cd:
            int r0 = r7.A00
            if (r0 != 0) goto L_0x00d2
            goto L_0x0082
        L_0x00d2:
            r5 = 1
            goto L_0x0083
        L_0x00d4:
            r1 = 0
            goto L_0x0065
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.VoipActivityV2.A0n(X.6PI, com.whatsapp.voipcalling.VoipActivityV2):void");
    }

    private void A0p(CallInfo callInfo) {
        AnonymousClass6YM r1;
        AnonymousClass6EE r0;
        if (!this.A1r && (r1 = this.A0r) != null && r1.A0r(callInfo.callId) && callInfo.callState == CallState.ACTIVE && (r0 = callInfo.self) != null && r0.A0C) {
            Log.i("voip/VoipActivityV2/checkToShowResumeCallButton");
            String string = getString(R.string.f12nameremoved);
            String string2 = getString(R.string.f12nameremoved);
            View.OnClickListener onClickListener = this.A25;
            this.A0J.setText(string);
            this.A0C.setVisibility(0);
            if (string2 == null) {
                C011504z.A04((Drawable) null, this.A0C);
                this.A0B.setVisibility(8);
                this.A0T.setVisibility(8);
                return;
            }
            C18740tg.A0D(AnonymousClass000.A1V(onClickListener), "buttonOnClickListener must be set together with buttonText");
            C011504z.A04(this.A04, this.A0C);
            this.A0B.setVisibility(0);
            this.A0T.setVisibility(0);
            this.A0T.setText(string2);
            AnonymousClass3YC.A00(this.A0T, this, onClickListener, 49);
        }
    }

    private void A0q(CallInfo callInfo) {
        boolean z;
        int i;
        if (this.A0K == null || this.A27 == null || this.A0H == null) {
            C18740tg.A0D(this.A1q, "header elements cannot be null when call controls m1 is disabled");
            return;
        }
        ViewGroup.LayoutParams A022 = this.A1W.A02();
        boolean A1V2 = AnonymousClass000.A1V(callInfo.groupJid);
        boolean z2 = callInfo.videoEnabled;
        Resources resources = getResources();
        int i2 = R.dimen.f7nameremoved;
        if (z2) {
            i2 = R.dimen.f7nameremoved;
        }
        A022.height = resources.getDimensionPixelSize(i2) + this.A01;
        this.A1W.A06(A022);
        this.A1W.A01().setPadding(this.A1W.A01().getPaddingLeft(), this.A01, this.A1W.A01().getPaddingRight(), this.A1W.A01().getPaddingBottom());
        ImageButton imageButton = this.A0H;
        float f = -1.0f;
        if (C36351kA.A1Y(this.A00)) {
            f = 1.0f;
        }
        imageButton.setScaleX(f);
        boolean A092 = AnonymousClass3UL.A09(this.A14, callInfo);
        if (A1T(this) && C34681hT.A0G(this.A0D)) {
            this.A0K.setText(R.string.f12nameremoved);
            A18(this);
        } else if (A092 && C34681hT.A0G(this.A0D)) {
            C1498172w.A02(this.A04, this, callInfo, 16);
        }
        View A023 = C012005e.A02(this.A0A, R.id.top_bar_layout);
        if (callInfo.videoEnabled) {
            int i3 = R.color.f6nameremoved;
            if (z2) {
                i3 = R.color.f6nameremoved;
            }
            int A002 = AnonymousClass00F.A00(this, i3);
            A023.setVisibility(0);
            View A012 = this.A1W.A01();
            GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
            int[] A1O2 = C36441kJ.A1O();
            A1O2[0] = A002;
            A1O2[1] = AnonymousClass00F.A00(this, R.color.f6nameremoved);
            A012.setBackground(new GradientDrawable(orientation, A1O2));
            this.A27.setImageAlpha(255);
            C36331k8.A0r(this, this.A0K, R.color.f6nameremoved);
        } else {
            this.A27.setImageAlpha(153);
            C36331k8.A0r(this, this.A0K, R.color.f6nameremoved);
            A023.setVisibility(0);
            this.A1W.A03(0);
        }
        if (this.A0G == null || this.A0L == null || this.A0I == null) {
            C18740tg.A0D(this.A1q, "Add participant btn/count/icon cannot be null when call controls m1 is disabled");
        } else {
            if (C110325aU.A00(callInfo.participants) > 8) {
                z = true;
                i = R.drawable.vec_ic_voip_group_participant_count;
            } else {
                z = false;
                GroupJid groupJid = callInfo.groupJid;
                i = R.drawable.call_add_participant_flat;
                if (groupJid != null) {
                    i = R.drawable.vec_ic_voip_linked_group_participants;
                }
            }
            this.A0I.setImageResource(i);
            TextView textView = this.A0L;
            if (z) {
                textView.setText(String.valueOf(C110325aU.A00(callInfo.participants)));
                this.A0L.setVisibility(0);
            } else {
                textView.setVisibility(8);
            }
            if (A1T(this) && C34681hT.A0G(this.A0D)) {
                this.A0G.setVisibility(4);
            } else if (AnonymousClass3UL.A09(this.A14, callInfo) && C34681hT.A0G(this.A0D)) {
                C1498172w.A02(this.A04, this, callInfo, 14);
            }
        }
        A1K(A1V2);
    }

    public static void A0r(CallInfo callInfo, VoipActivityV2 voipActivityV2) {
        if (Voip.A09(callInfo.callState)) {
            C20810yC r1 = voipActivityV2.A0D;
            if (!callInfo.isGroupCall && r1.A0E(5923)) {
                return;
            }
        }
        CallState callState = callInfo.callState;
        if (!A1R(callState, voipActivityV2, callInfo.isGroupCall)) {
            return;
        }
        if (callState != CallState.LINK || !callInfo.isInLonelyState()) {
            CallDetailsLayout callDetailsLayout = voipActivityV2.A0W;
            C18740tg.A04(callDetailsLayout);
            callDetailsLayout.A02(callInfo);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0018, code lost:
        if (r4.A0D.A0E(4773) == false) goto L_0x001a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A0t(com.whatsapp.voipcalling.CallInfo r3, com.whatsapp.voipcalling.VoipActivityV2 r4) {
        /*
            if (r3 == 0) goto L_0x0067
            com.whatsapp.calling.screenshare.ScreenShareViewModel r0 = r4.A0q
            r2 = 1
            if (r0 == 0) goto L_0x001a
            X.1hi r0 = r0.A0D
            boolean r0 = X.C36351kA.A1W(r0)
            if (r0 == 0) goto L_0x001a
            X.0yC r1 = r4.A0D
            r0 = 4773(0x12a5, float:6.688E-42)
            boolean r0 = r1.A0E(r0)
            r1 = 1
            if (r0 != 0) goto L_0x001b
        L_0x001a:
            r1 = 0
        L_0x001b:
            boolean r0 = r3.videoEnabled
            if (r0 == 0) goto L_0x0068
            if (r1 != 0) goto L_0x0068
            com.whatsapp.calling.callgrid.viewmodel.OrientationViewModel r3 = r4.A0h
            if (r3 == 0) goto L_0x0067
            X.4d9 r1 = r3.A01
            if (r1 != 0) goto L_0x0030
            X.4d9 r1 = new X.4d9
            r1.<init>(r4, r3)
            r3.A01 = r1
        L_0x0030:
            boolean r0 = r3.A02
            if (r0 != 0) goto L_0x0046
            boolean r0 = r1.canDetectOrientation()
            if (r0 == 0) goto L_0x0046
            java.lang.String r0 = "voip/OrientationViewModel/enableOrientationListener"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.4d9 r0 = r3.A01
            r0.enable()
            r3.A02 = r2
        L_0x0046:
            android.hardware.display.DisplayManager$DisplayListener r0 = r3.A00
            if (r0 != 0) goto L_0x0067
            r1 = 0
            X.7r8 r0 = new X.7r8
            r0.<init>(r3, r1)
            r3.A00 = r0
            X.0wG r0 = r3.A06
            android.content.Context r1 = r0.A00
            java.lang.String r0 = "display"
            java.lang.Object r2 = r1.getSystemService(r0)
            android.hardware.display.DisplayManager r2 = (android.hardware.display.DisplayManager) r2
            android.hardware.display.DisplayManager$DisplayListener r1 = r3.A00
            android.os.Handler r0 = X.C36341k9.A0H()
            r2.registerDisplayListener(r1, r0)
        L_0x0067:
            return
        L_0x0068:
            r4.A1I(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.VoipActivityV2.A0t(com.whatsapp.voipcalling.CallInfo, com.whatsapp.voipcalling.VoipActivityV2):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001f, code lost:
        if (r0.A0B() == true) goto L_0x0021;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A0v(com.whatsapp.voipcalling.CallInfo r2, com.whatsapp.voipcalling.VoipActivityV2 r3) {
        /*
            com.whatsapp.calling.screenshare.ScreenShareViewModel r0 = r3.A0q
            if (r0 == 0) goto L_0x0012
            X.1hi r0 = r0.A0D
            boolean r0 = X.C36351kA.A1W(r0)
            if (r0 == 0) goto L_0x0012
            java.lang.String r0 = "Screen sharing active, skip capture pause"
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x0011:
            return
        L_0x0012:
            X.6ro r0 = r3.A0l
            if (r0 == 0) goto L_0x0061
            X.9nR r0 = X.C108915Vl.A00
            r1 = 1
            if (r0 == 0) goto L_0x0061
            boolean r0 = r0.A0B()
            if (r0 != r1) goto L_0x0061
        L_0x0021:
            boolean r0 = r3.A1n
            if (r0 == 0) goto L_0x0027
            if (r1 == 0) goto L_0x0069
        L_0x0027:
            com.whatsapp.calling.avatar.viewmodel.CallAvatarViewModel r0 = r3.A0a
            X.1hi r1 = r0.A0F
            java.lang.Object r0 = r1.A04()
            boolean r0 = r0 instanceof X.AnonymousClass52P
            if (r0 != 0) goto L_0x0069
            java.lang.Object r0 = r1.A04()
            boolean r0 = r0 instanceof X.AnonymousClass52L
            if (r0 != 0) goto L_0x0069
            java.lang.Object r0 = r1.A04()
            boolean r0 = r0 instanceof X.AnonymousClass52R
            if (r0 != 0) goto L_0x0069
            com.whatsapp.calling.avatar.viewmodel.CallAvatarViewModel r0 = r3.A0a
            X.1hi r1 = r0.A0F
            java.lang.Object r0 = r1.A04()
            boolean r0 = r0 instanceof X.AnonymousClass52N
            if (r0 != 0) goto L_0x0063
            java.lang.Object r0 = r1.A04()
            boolean r0 = r0 instanceof X.AnonymousClass52O
            if (r0 != 0) goto L_0x0063
            boolean r0 = r2.isCallOnHold()
            if (r0 != 0) goto L_0x0011
            com.whatsapp.voipcalling.Voip.startVideoCaptureStream()
            return
        L_0x0061:
            r1 = 0
            goto L_0x0021
        L_0x0063:
            X.711 r0 = r3.A0x
            r0.A06()
            return
        L_0x0069:
            com.whatsapp.voipcalling.Voip.stopVideoCaptureStream()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.VoipActivityV2.A0v(com.whatsapp.voipcalling.CallInfo, com.whatsapp.voipcalling.VoipActivityV2):void");
    }

    public static void A0w(CallInfo callInfo, VoipActivityV2 voipActivityV2, boolean z) {
        int i;
        AnonymousClass3FU r1;
        if (voipActivityV2.A0r != null) {
            voipActivityV2.A04.Bp1(new AnonymousClass752(voipActivityV2, callInfo, 31, z));
        }
        if (voipActivityV2.A1a == null || (callInfo.groupJid == null && (!z || C110325aU.A00(callInfo.participants) <= 8))) {
            if (64 == callInfo.participants.size()) {
                i = 4;
                r1 = new AnonymousClass3FU();
            } else if (callInfo.isCallFull()) {
                i = 5;
                r1 = new C162727p3(voipActivityV2, 1);
            } else {
                A12(voipActivityV2);
                return;
            }
            voipActivityV2.A3o(VoipErrorDialogFragment.A05(r1, i), "VoipErrorDialogFragment");
            return;
        }
        AnonymousClass6X3 r12 = voipActivityV2.A1a.A0L;
        if (r12 != null) {
            AnonymousClass6X3.A01(r12, 3);
        }
    }

    private void A0x(CallInfo callInfo, String str) {
        C18740tg.A0D(C114145gi.A08.equals(str), "should only be called if intent action is ACTION_START_CALL");
        CallInfo callInfo2 = callInfo;
        if (callInfo2.callState == CallState.PRECALLING && callInfo2.groupJid != null) {
            Log.i("voip/VoipActivityV2/startCall");
            AnonymousClass141 A0D2 = this.A12.A0D(callInfo2.groupJid);
            List A042 = AnonymousClass3UL.A04(this.A02, this.A12, this.A1G, A0D2);
            if (!A042.isEmpty()) {
                AnonymousClass1ND r6 = this.A0j;
                AnonymousClass1NE r62 = (AnonymousClass1NE) r6;
                AnonymousClass1NE.A00(this, r62, callInfo2.groupJid, (Integer) null, callInfo2.callId, callInfo2.scheduledId, A042, 4, 0, callInfo2.videoEnabled, false, false, false);
            }
        }
    }

    public static void A0y(VoipActivityV2 voipActivityV2) {
        C36391kE.A1K(voipActivityV2.A0J);
        voipActivityV2.A0C.setVisibility(8);
    }

    public static void A0z(VoipActivityV2 voipActivityV2) {
        C18740tg.A0D(AnonymousClass000.A1V(voipActivityV2.A17), "contact picker fragment should not be null");
        ContactPickerFragment contactPickerFragment = voipActivityV2.A17;
        if (contactPickerFragment != null) {
            if (AnonymousClass000.A1Q(contactPickerFragment.A2P.A07.getVisibility())) {
                contactPickerFragment.A2P.A02(false);
            }
            voipActivityV2.A17 = null;
            A11(voipActivityV2);
            voipActivityV2.A3q("VoipContactPickerDialogFragment");
            if (voipActivityV2.A2N) {
                A14(voipActivityV2);
                voipActivityV2.A2N = false;
            }
        }
    }

    public static void A10(VoipActivityV2 voipActivityV2) {
        Log.i("voip/VoipActivityV2/call/end");
        AnonymousClass6YM r2 = voipActivityV2.A0r;
        if (r2 != null) {
            AnonymousClass6YM.A0A(r2, (CallInfo) null, (String) null, 1);
        }
        if (voipActivityV2.A1q) {
            ((C124795yo) voipActivityV2.A1e.get()).A01 = true;
        }
        voipActivityV2.A2J = true;
    }

    public static void A11(VoipActivityV2 voipActivityV2) {
        if (voipActivityV2.A1s) {
            ContactPickerFragment contactPickerFragment = voipActivityV2.A17;
            if (contactPickerFragment == null || contactPickerFragment.A0i) {
                voipActivityV2.A0C.A01(voipActivityV2.A26);
            }
        }
    }

    public static void A12(VoipActivityV2 voipActivityV2) {
        if (voipActivityV2.A17 != null) {
            Log.i("contact picker is already shown, ignore new events");
        } else if (A01(voipActivityV2) != null) {
            C1497472p r3 = new C1497472p(voipActivityV2, 38);
            if (voipActivityV2.A0D.A0E(5102)) {
                voipActivityV2.A1G(r3);
                return;
            }
            KeyguardManager A062 = voipActivityV2.A08.A06();
            if (A062 != null && (A062.isKeyguardLocked() || A062.inKeyguardRestrictedInputMode())) {
                voipActivityV2.A1J(false);
            }
            r3.run();
        }
    }

    public static void A14(VoipActivityV2 voipActivityV2) {
        if (voipActivityV2.A1a != null && !voipActivityV2.isFinishing()) {
            if (voipActivityV2.A17 != null) {
                voipActivityV2.A2N = true;
                return;
            }
            voipActivityV2.A1a.A1f(voipActivityV2.getSupportFragmentManager(), "CallControlSheet");
            AnonymousClass6T1 r1 = voipActivityV2.A0t;
            if (r1 != null) {
                r1.A00 = voipActivityV2.A1a.A0A;
            }
        }
    }

    public static void A15(VoipActivityV2 voipActivityV2) {
        int i;
        if (voipActivityV2.A0D.A0E(4624)) {
            i = 0;
        } else {
            i = 1;
        }
        voipActivityV2.A3o(new SwitchConfirmationFragment(new C111975d9(voipActivityV2, i)), "SwitchConfirmationFragment");
    }

    public static void A18(VoipActivityV2 voipActivityV2) {
        if (voipActivityV2.A27 == null) {
            C18740tg.A0D(voipActivityV2.A1q, "e2eePadLock cannot be null when call controls m1 is disabled");
            return;
        }
        voipActivityV2.A27.setImageDrawable(AnonymousClass3UF.A08(C36381kD.A0H(voipActivityV2, R.drawable.ic_provider_info), voipActivityV2.getResources().getColor(R.color.f6nameremoved)));
        AnonymousClass1JZ.A03(voipActivityV2.A27, 0, 10);
    }

    public static void A19(VoipActivityV2 voipActivityV2, int i) {
        int i2;
        Log.i("voip/VoipActivityV2/call/accept");
        CallInfo A012 = A01(voipActivityV2);
        if (A012 != null && A012.callState != CallState.NONE) {
            if (!voipActivityV2.A1m) {
                C107275Ni r1 = voipActivityV2.A1X;
                if (r1 != null) {
                    r1.A01(true);
                }
                A14(voipActivityV2);
            } else {
                Log.w("callAccepted is true when calling acceptCall()");
            }
            voipActivityV2.A1m = true;
            if (voipActivityV2.A0r != null) {
                if (Build.VERSION.SDK_INT < 23) {
                    boolean A0C2 = true ^ voipActivityV2.A1E.A0C();
                    boolean z = A012.videoEnabled;
                    boolean A082 = AnonymousClass3UD.A08(voipActivityV2.A1E, voipActivityV2.A1U, z);
                    if (A0C2 || A082) {
                        StringBuilder A0u2 = AnonymousClass000.A0u();
                        A0u2.append("voip/service/accept noRecordPermission = ");
                        A0u2.append(A0C2);
                        Log.w(C36371kC.A0z(", noCameraPermission = ", A0u2, A082));
                        if (A082) {
                            i2 = R.string.f12nameremoved;
                            if (A0C2) {
                                i2 = R.string.f12nameremoved;
                            }
                        } else {
                            i2 = R.string.f12nameremoved;
                        }
                        voipActivityV2.A0r.A0R(30, voipActivityV2.getString(i2));
                        return;
                    }
                }
                voipActivityV2.A0r.A2P.A06();
                UserJid A0M2 = C90494aF.A0M(A012);
                boolean z2 = A012.videoEnabled;
                int i3 = -1;
                if (A012.isPeerRequestingUpgrade()) {
                    i3 = 2;
                }
                if (!A1N(A0M2, voipActivityV2, i3, z2)) {
                    return;
                }
                if (Voip.A09(A012.callState)) {
                    voipActivityV2.A0r.A0h(voipActivityV2.A1i, i, false);
                } else if (A012.isPeerRequestingUpgrade()) {
                    AnonymousClass6YM r0 = voipActivityV2.A0r;
                    C90464aC.A14(r0);
                    r0.A1E.execute(AnonymousClass74U.A00);
                }
            } else {
                Log.e("voip/VoipActivityV2/call/accept voiceService is null");
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (r2.self.A0K == false) goto L_0x001c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A1A(com.whatsapp.voipcalling.VoipActivityV2 r9, int r10) {
        /*
            X.0yC r1 = r9.A0D
            com.whatsapp.voipcalling.CallInfo r2 = A01(r9)
            r0 = 3153(0xc51, float:4.418E-42)
            int r1 = r1.A07(r0)
            r0 = 4
            if (r1 < r0) goto L_0x001c
            if (r2 == 0) goto L_0x001c
            boolean r0 = r2.videoEnabled
            if (r0 == 0) goto L_0x001c
            X.6EE r0 = r2.self
            boolean r0 = r0.A0K
            r4 = 1
            if (r0 != 0) goto L_0x001d
        L_0x001c:
            r4 = 0
        L_0x001d:
            java.lang.String r0 = "display"
            java.lang.Object r1 = r9.getSystemService(r0)
            android.hardware.display.DisplayManager r1 = (android.hardware.display.DisplayManager) r1
            r0 = 0
            android.view.Display r0 = r1.getDisplay(r0)
            int r3 = r0.getRotation()
            if (r4 == 0) goto L_0x0045
            X.5x3 r2 = r9.A0n
            boolean r1 = r9.A1r
            boolean r0 = X.AnonymousClass000.A1Q(r3)
            if (r1 == 0) goto L_0x0164
            if (r0 != 0) goto L_0x0164
            X.6Ea r1 = r2.A05
            boolean r0 = r1.A01
            if (r0 != 0) goto L_0x0045
            r1.A02()
        L_0x0045:
            int r0 = r10 + r3
            int r2 = r0 % 4
            X.004 r0 = r9.A1k
            boolean r0 = X.C90474aD.A1X(r0)
            r5 = 0
            if (r0 == 0) goto L_0x009b
            android.content.ContentResolver r1 = r9.getContentResolver()
            java.lang.String r0 = "accelerometer_rotation"
            int r8 = android.provider.Settings.System.getInt(r1, r0, r5)
            if (r4 == 0) goto L_0x008d
            X.5x3 r6 = r9.A0n
            boolean r7 = X.AnonymousClass000.A1Q(r8)
            int r0 = r6.A00
            if (r10 == r0) goto L_0x008d
            r3 = 1
            if (r7 == 0) goto L_0x0071
            long r0 = r6.A01
            long r0 = r0 + r3
            r6.A01 = r0
        L_0x0071:
            long r0 = r6.A02
            long r0 = r0 + r3
            r6.A02 = r0
            r1 = 1
            if (r10 == r1) goto L_0x007d
            r0 = 3
            if (r10 == r0) goto L_0x007d
            r1 = 0
        L_0x007d:
            X.6Ea r0 = r6.A03
            if (r1 == 0) goto L_0x015a
            r0.A02()
            if (r7 == 0) goto L_0x008b
            X.6Ea r0 = r6.A04
            r0.A02()
        L_0x008b:
            r6.A00 = r10
        L_0x008d:
            X.0yC r1 = r9.A0D
            r0 = 3538(0xdd2, float:4.958E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x009b
            if (r8 != 0) goto L_0x009b
            r10 = 0
            r2 = 0
        L_0x009b:
            X.6ro r0 = r9.A0l
            if (r0 == 0) goto L_0x0157
            X.9nR r0 = X.C108915Vl.A00
            r1 = 1
            if (r0 == 0) goto L_0x0157
            boolean r0 = r0.A0B()
            if (r0 != r1) goto L_0x0157
        L_0x00aa:
            int r3 = r5 * 90
            X.004 r0 = r9.A1l
            boolean r0 = X.C90474aD.A1X(r0)
            r6 = 0
            if (r0 != 0) goto L_0x00c8
            X.004 r0 = r9.A1k
            boolean r0 = X.C90474aD.A1X(r0)
            if (r0 == 0) goto L_0x0153
            X.0yC r1 = r9.A0D
            r0 = 3153(0xc51, float:4.418E-42)
            int r1 = r1.A07(r0)
            r0 = 3
            if (r1 < r0) goto L_0x0153
        L_0x00c8:
            int r0 = r2 * 90
            com.whatsapp.voipcalling.Voip.videoDeviceAndDisplayOrientationChanged(r3, r0, r6)
            boolean r0 = r9.A1r
            if (r0 == 0) goto L_0x00d7
            if (r5 == r2) goto L_0x00d7
            r0 = 2
            if (r5 == r0) goto L_0x00d7
            r6 = 1
        L_0x00d7:
            X.53T r0 = r9.A0v
            com.whatsapp.jid.UserJid r4 = r0.A0S()
            if (r4 == 0) goto L_0x00ff
            com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel r3 = r9.A0e
            boolean r0 = r3.A0A
            if (r0 == 0) goto L_0x014b
            java.util.LinkedHashMap r0 = r3.A0z
            int r1 = r0.size()
            r0 = 2
            if (r1 > r0) goto L_0x014b
            com.whatsapp.jid.UserJid r0 = r3.A05
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x014b
            X.711 r0 = r3.A0Y
            X.70u r0 = r0.A03(r4)
        L_0x00fc:
            r0.setScaleType(r6)
        L_0x00ff:
            com.whatsapp.voipcalling.camera.VoipCameraManager r0 = r9.A1b
            r0.updateCameraPreviewOrientation()
            X.0yC r1 = r9.A0D
            r0 = 6064(0x17b0, float:8.497E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x0113
            com.whatsapp.voipcalling.camera.VoipCameraManager r0 = r9.A1b
            r0.maybeUpdateCameraProcessorOrientation(r5)
        L_0x0113:
            X.004 r0 = r9.A1j
            boolean r0 = X.C90474aD.A1X(r0)
            if (r0 == 0) goto L_0x0143
            r0 = 0
            r9.A0h(r0, r0)
        L_0x011f:
            X.6T1 r4 = r9.A0t
            if (r4 == 0) goto L_0x013d
            boolean r0 = r4.A03
            if (r0 == 0) goto L_0x013d
            X.1hi r0 = r4.A09
            java.lang.Object r0 = X.C36401kF.A0m(r0)
            X.6PK r0 = (X.AnonymousClass6PK) r0
            boolean r3 = r0.A02
            float r2 = r0.A00
            boolean r1 = r0.A03
            X.6PK r0 = new X.6PK
            r0.<init>(r2, r5, r3, r1)
            X.AnonymousClass6T1.A00(r4, r0)
        L_0x013d:
            X.7lo r0 = r9.A0k
            r0.Bc1()
            return
        L_0x0143:
            int r0 = X.C90504aG.A07(r2)
            r9.A0h(r2, r0)
            goto L_0x011f
        L_0x014b:
            X.711 r0 = r3.A0Y
            X.70u r0 = r0.A03(r4)
            r6 = 0
            goto L_0x00fc
        L_0x0153:
            com.whatsapp.voipcalling.Voip.videoDeviceAndDisplayOrientationChanged(r3, r3, r6)
            goto L_0x00ff
        L_0x0157:
            r5 = r10
            goto L_0x00aa
        L_0x015a:
            r0.A00()
            X.6Ea r0 = r6.A04
            r0.A00()
            goto L_0x008b
        L_0x0164:
            X.6Ea r0 = r2.A05
            r0.A00()
            goto L_0x0045
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.VoipActivityV2.A1A(com.whatsapp.voipcalling.VoipActivityV2, int):void");
    }

    public static void A1C(VoipActivityV2 voipActivityV2, int i, int i2) {
        voipActivityV2.A0m.A01(Integer.valueOf(i2), i, 16);
    }

    public static void A1D(VoipActivityV2 voipActivityV2, String str) {
        voipActivityV2.A05.removeMessages(7);
        voipActivityV2.A05.removeMessages(8);
        DialogFragment dialogFragment = voipActivityV2.A0N;
        if (dialogFragment != null && dialogFragment.A12()) {
            voipActivityV2.A3q("NonActivityDismissDialogFragment");
            voipActivityV2.A0N = null;
        }
        AnonymousClass00C.A0D(str, 0);
        NonActivityDismissDialogFragment nonActivityDismissDialogFragment = new NonActivityDismissDialogFragment();
        Bundle A0I2 = C36431kI.A0I("text", str);
        A0I2.putBoolean("dismiss", true);
        nonActivityDismissDialogFragment.A17(A0I2);
        voipActivityV2.A0N = nonActivityDismissDialogFragment;
        voipActivityV2.A05.sendEmptyMessage(8);
        voipActivityV2.A05.sendEmptyMessageDelayed(7, 6000);
    }

    public static void A1F(VoipActivityV2 voipActivityV2, boolean z) {
        voipActivityV2.A21 = voipActivityV2.A01;
        voipActivityV2.A20 = 0;
        int dimensionPixelSize = (voipActivityV2.A1z - voipActivityV2.getResources().getDimensionPixelSize(R.dimen.f7nameremoved)) - (voipActivityV2.getResources().getDimensionPixelSize(R.dimen.f7nameremoved) / 2);
        if (!z) {
            if (voipActivityV2.A1q) {
                voipActivityV2.A21 += C36441kJ.A06(voipActivityV2.getResources(), R.dimen.f7nameremoved, voipActivityV2.getResources().getDimensionPixelSize(R.dimen.f7nameremoved));
            }
            voipActivityV2.A21 += voipActivityV2.A22;
        } else if (!C90504aG.A1V(voipActivityV2.A08)) {
            return;
        }
        voipActivityV2.A20 += dimensionPixelSize;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0019, code lost:
        if (r0 != false) goto L_0x001b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A1G(java.lang.Runnable r5) {
        /*
            r4 = this;
            X.0yb r0 = r4.A08
            android.app.KeyguardManager r3 = r0.A06()
            r2 = 0
            if (r3 == 0) goto L_0x002d
            boolean r1 = X.C19550w8.A05()
            boolean r0 = r3.isKeyguardLocked()
            if (r1 != 0) goto L_0x0019
            if (r0 != 0) goto L_0x001b
            boolean r0 = r3.inKeyguardRestrictedInputMode()
        L_0x0019:
            if (r0 == 0) goto L_0x002d
        L_0x001b:
            boolean r0 = X.C19550w8.A03()
            if (r0 == 0) goto L_0x002a
            X.4ad r0 = new X.4ad
            r0.<init>(r4, r5)
            r3.requestDismissKeyguard(r4, r0)
            return
        L_0x002a:
            r4.A1J(r2)
        L_0x002d:
            r5.run()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.VoipActivityV2.A1G(java.lang.Runnable):void");
    }

    private void A1I(boolean z) {
        boolean z2;
        OrientationViewModel orientationViewModel = this.A0h;
        if (orientationViewModel != null) {
            if (!orientationViewModel.A02 || orientationViewModel.A01 == null) {
                z2 = false;
            } else {
                z2 = true;
                Log.i("voip/OrientationViewModel/disableOrientationListener");
                orientationViewModel.A01.disable();
                orientationViewModel.A02 = false;
            }
            if (orientationViewModel.A00 != null) {
                ((DisplayManager) orientationViewModel.A06.A00.getSystemService("display")).unregisterDisplayListener(orientationViewModel.A00);
                orientationViewModel.A00 = null;
            }
            if (z2 && z) {
                A0h(0, 0);
            }
        }
    }

    private void A1J(boolean z) {
        Dialog dialog;
        Window window = getWindow();
        if (z) {
            window.addFlags(524288);
        } else {
            window.clearFlags(524288);
        }
        VoipCallControlBottomSheetV2 voipCallControlBottomSheetV2 = this.A1a;
        if (voipCallControlBottomSheetV2 != null && (dialog = voipCallControlBottomSheetV2.A02) != null && dialog.getWindow() != null) {
            Window window2 = voipCallControlBottomSheetV2.A02.getWindow();
            if (z) {
                window2.addFlags(524288);
            } else {
                window2.clearFlags(524288);
            }
        }
    }

    private void A1K(boolean z) {
        String string;
        int i;
        ViewGroup viewGroup = this.A0G;
        if (viewGroup == null) {
            C18740tg.A0D(this.A1q, "Add participant btn cannot be null when call controls m1 is disabled");
            return;
        }
        if (z) {
            string = getString(R.string.f12nameremoved);
            i = R.string.f12nameremoved;
        } else {
            string = getString(R.string.f12nameremoved);
            i = R.string.f12nameremoved;
        }
        AnonymousClass3UE.A07(viewGroup, string, getString(i), true);
    }

    private boolean A1L() {
        C21060yb r2 = this.A08;
        AppOpsManager appOpsManager = r2.A00;
        if (appOpsManager == null) {
            appOpsManager = (AppOpsManager) C21060yb.A03(r2, "appops", true);
            r2.A00 = appOpsManager;
        }
        C18740tg.A06(appOpsManager);
        try {
            if (appOpsManager.checkOp("android:picture_in_picture", Process.myUid(), getPackageName()) != 0) {
                return false;
            }
            return true;
        } catch (SecurityException e) {
            C36321k7.A1L(e, "voip/VoipActivityV2/isPictureInPictureAllowed", AnonymousClass000.A0u());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        if (r3.videoEnabled == false) goto L_0x0007;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A1O(com.whatsapp.voipcalling.CallInfo r3, com.whatsapp.voipcalling.VoipActivityV2 r4) {
        /*
            if (r3 == 0) goto L_0x0007
            boolean r1 = r3.videoEnabled
            r0 = 1
            if (r1 != 0) goto L_0x0008
        L_0x0007:
            r0 = 0
        L_0x0008:
            r2 = 0
            if (r0 == 0) goto L_0x004a
            int r0 = r4.A00
            if (r0 == 0) goto L_0x004a
            com.whatsapp.voipcalling.CallState r1 = r4.A07(r3)
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.ACTIVE
            if (r1 != r0) goto L_0x001d
            boolean r0 = r3.isInLonelyState()
            if (r0 == 0) goto L_0x0023
        L_0x001d:
            com.whatsapp.voipcalling.CallState r1 = r3.callState
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.CONNECTED_LONELY
            if (r1 != r0) goto L_0x004a
        L_0x0023:
            boolean r0 = r3.isEitherSideRequestingUpgrade()
            if (r0 != 0) goto L_0x004a
            android.app.PictureInPictureParams$Builder r1 = r4.A03
            java.lang.String r0 = "PiP Params Builder is null"
            X.C18740tg.A07(r1, r0)
            android.app.PictureInPictureParams r0 = r1.build()
            boolean r0 = r4.enterPictureInPictureMode(r0)     // Catch:{ Exception -> 0x003f }
            if (r0 == 0) goto L_0x0045
            r4.A0Q(r2)
            r0 = 1
            return r0
        L_0x003f:
            r1 = move-exception
            java.lang.String r0 = "voip/VoipActivityV2/minimize exception trying to enter PIP mode"
            com.whatsapp.util.Log.w(r0, r1)
        L_0x0045:
            java.lang.String r0 = "voip/VoipActivityV2/minimize failed to enter PIP mode"
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x004a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.VoipActivityV2.A1O(com.whatsapp.voipcalling.CallInfo, com.whatsapp.voipcalling.VoipActivityV2):boolean");
    }

    public static boolean A1P(CallInfo callInfo, VoipActivityV2 voipActivityV2) {
        if (!(!C36371kC.A1U(C27631Pa.A00(voipActivityV2.A0Z), "screen_sharing_backward_compat_shown")) || !voipActivityV2.A0e.A0C || C110325aU.A00(callInfo.participants) != voipActivityV2.A0D.A07(3694)) {
            return false;
        }
        return true;
    }

    public static boolean A1R(CallState callState, VoipActivityV2 voipActivityV2, boolean z) {
        if (voipActivityV2.A0W == null) {
            return false;
        }
        if (!voipActivityV2.A1q || callState == CallState.LINK) {
            return true;
        }
        if (z || callState != CallState.RECEIVED_CALL) {
            return false;
        }
        return true;
    }

    public static boolean A1S(VoipActivityV2 voipActivityV2) {
        if (Build.VERSION.SDK_INT < 26 || !voipActivityV2.A08.A0P("android.software.picture_in_picture") || !voipActivityV2.A1L()) {
            return false;
        }
        return true;
    }

    public static boolean A1T(VoipActivityV2 voipActivityV2) {
        AnonymousClass6YM r0 = voipActivityV2.A0r;
        if (r0 == null || !"capi".equals(r0.A1B)) {
            return false;
        }
        return true;
    }

    public void A2X() {
        this.A1R.A03((AnonymousClass11F) null, 16);
        super.A2X();
    }

    public void A2x(int i) {
        ContactPickerFragment contactPickerFragment = this.A17;
        if (contactPickerFragment != null) {
            contactPickerFragment.A1n(i);
        }
    }

    public /* synthetic */ Boolean A3r(AnonymousClass00S r4) {
        boolean z;
        boolean z2 = true;
        if (Build.VERSION.SDK_INT >= 31) {
            z = this.A1E.A0E();
        } else {
            z = true;
        }
        if (!Boolean.valueOf(z).booleanValue()) {
            C1498172w.A01(this.A05, this, r4, 19);
            z2 = false;
        }
        return Boolean.valueOf(z2);
    }

    public void A3s() {
        if (this.A29 != null) {
            A3q("MessageDialogFragment");
            this.A29 = null;
            this.A1h = null;
        }
        A3q("VoipErrorDialogFragment");
    }

    public /* synthetic */ void A3t() {
        ScreenShareViewModel screenShareViewModel = this.A0q;
        if (screenShareViewModel != null) {
            if (!C36351kA.A1W(screenShareViewModel.A0D)) {
                this.A0p.A09++;
            }
            if (C34681hT.A0F(this.A08)) {
                A1B(this, 1);
                return;
            }
            if (!C36351kA.A1W(this.A0q.A0D) && !isFinishing()) {
                C27631Pa r4 = this.A0Z;
                int A072 = r4.A01.A07(4536);
                boolean z = false;
                if (A072 != 0 && A072 > C27631Pa.A00(r4).getInt("ss_permission_dialog_show_count", 0)) {
                    z = true;
                }
                if (z) {
                    ScreenSharePermissionDialogFragment screenSharePermissionDialogFragment = new ScreenSharePermissionDialogFragment();
                    Bundle A073 = AnonymousClass001.A07();
                    A073.putInt("BodyTextId", R.string.f12nameremoved);
                    A073.putBoolean("CancelEnabled", true);
                    screenSharePermissionDialogFragment.A17(A073);
                    A3o(screenSharePermissionDialogFragment, "ScreenSharePermissionDialogFragment");
                    C27631Pa r3 = this.A0Z;
                    C36341k9.A0v(C90474aD.A0F(r3), "ss_permission_dialog_show_count", C27631Pa.A00(r3).getInt("ss_permission_dialog_show_count", 0) + 1);
                    if (r3.A02.BLK()) {
                        C36341k9.A0v(C90474aD.A0F(r3), "as_permission_dialog_show_count", C27631Pa.A00(r3).getInt("as_permission_dialog_show_count", 0) + 1);
                        return;
                    }
                    return;
                }
                C27631Pa r2 = this.A0Z;
                if (r2.A01.A07(4536) != 0 && r2.A02.BLK() && C27631Pa.A00(r2).getInt("as_permission_dialog_show_count", 0) < 1) {
                    ScreenSharePermissionDialogFragment screenSharePermissionDialogFragment2 = new ScreenSharePermissionDialogFragment();
                    Bundle A074 = AnonymousClass001.A07();
                    A074.putInt("BodyTextId", R.string.f12nameremoved);
                    A074.putBoolean("CancelEnabled", false);
                    screenSharePermissionDialogFragment2.A17(A074);
                    A3o(screenSharePermissionDialogFragment2, "ScreenSharePermissionDialogFragment");
                    C27631Pa r22 = this.A0Z;
                    int i = C27631Pa.A00(r22).getInt("as_permission_dialog_show_count", 0) + 1;
                    C36341k9.A0v(C90474aD.A0F(r22), "as_permission_dialog_show_count", i);
                    this.A0p.A00 = i;
                    return;
                }
            }
            if (this.A0D.A0E(5102)) {
                A1G(new C1497472p(this, 41));
                return;
            }
            KeyguardManager A062 = this.A08.A06();
            if (A062 == null || (!A062.isKeyguardLocked() && !A062.inKeyguardRestrictedInputMode())) {
                this.A0q.A0S(C108075Sb.BOTTOM_SHEET);
            } else {
                A1J(false);
            }
        }
    }

    public /* synthetic */ void A3u(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (i != i5 || i3 != i7 || i2 != i6 || i4 != i8) {
            Rect A062 = AnonymousClass001.A06();
            this.A2A.getGlobalVisibleRect(A062);
            if (A1S(this) && this.A00 == 3) {
                PictureInPictureParams.Builder builder = this.A03;
                C18740tg.A07(builder, "PiP Params Builder is null");
                builder.setSourceRectHint(A062);
                setPictureInPictureParams(this.A03.build());
            }
            CallGridViewModel callGridViewModel = this.A0e;
            boolean A1T2 = C90474aD.A1T(A062.width(), A062.height());
            C34831hi r1 = callGridViewModel.A0j;
            if (C36351kA.A1W(r1) != A1T2) {
                C36341k9.A18(r1, A1T2);
                CallGridViewModel.A0I(callGridViewModel);
                CallGridViewModel.A0H(callGridViewModel.A0Q.A05(), callGridViewModel, true);
            }
        }
    }

    public /* synthetic */ void A3v(Pair pair) {
        C130806Mm r2;
        AnonymousClass2Q9 r1;
        if (pair != null) {
            C119375pi r22 = (C119375pi) pair.first;
            int A032 = C36381kD.A03(pair);
            A3q("MenuBottomSheet");
            if (A032 == 6) {
                String str = r22.A00;
                boolean z = r22.A01;
                AnonymousClass3XL A042 = AnonymousClass3UE.A04(this, str, z);
                if (A042 != null) {
                    startActivity(AnonymousClass190.A12(this, A042.A01));
                }
                r2 = this.A0u;
                r1 = AnonymousClass3UD.A02((String) null, 3, 5, z);
            } else if (A032 == 7) {
                String str2 = r22.A00;
                boolean z2 = r22.A01;
                AnonymousClass3MV.A01(this.A05, this.A08, AnonymousClass3UD.A05(str2, z2));
                r2 = this.A0u;
                r1 = AnonymousClass3UD.A02((String) null, 1, 5, z2);
            } else if (A032 == 8) {
                String str3 = r22.A00;
                boolean z3 = r22.A01;
                AnonymousClass3XL A043 = AnonymousClass3UE.A04(this, str3, z3);
                if (Build.VERSION.SDK_INT < 22) {
                    C130806Mm r23 = this.A0u;
                    r23.A00.Bly(AnonymousClass3UD.A02((String) null, 2, 5, z3));
                }
                if (A043 != null) {
                    startActivity(AnonymousClass3UD.A00(this, A043.A01, A043.A00, 5, z3));
                    return;
                }
                return;
            } else {
                return;
            }
            r2.A00.Bly(r1);
        }
    }

    public C68733cN BCU() {
        C68733cN r0 = this.A2E;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass547 r02 = new AnonymousClass547(this, this);
        this.A2E = r02;
        return r02;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0115, code lost:
        if (r0 != null) goto L_0x0117;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x011c, code lost:
        if (r0.intValue() == 0) goto L_0x011e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x011e, code lost:
        r1 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x011f, code lost:
        X.C18740tg.A0D(r1, "Bug in loading call lobby entry point");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0157, code lost:
        if (r3 != null) goto L_0x00d2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0171  */
    /* JADX WARNING: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BgL(X.AnonymousClass6YM r22) {
        /*
            r21 = this;
            java.lang.String r0 = "voip/VoipActivityV2/onServiceConnected"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r8 = r21
            r0 = r22
            r8.A0r = r0
            r0.A0V(r8)
            X.6YM r0 = r8.A0r
            r4 = 0
            r0.A1R = r4
            com.whatsapp.voipcalling.CallInfo r3 = A01(r8)
            if (r3 == 0) goto L_0x0088
            X.1NF r2 = r8.A0o
            java.lang.String r1 = r3.callId
            java.lang.String r0 = "voice_service_connected"
            r2.A03(r1, r0)
            X.1NF r2 = r8.A0o
            java.lang.String r1 = r3.callId
            r0 = 2
            r2.A04(r1, r0)
            boolean r0 = A1T(r8)
            if (r0 == 0) goto L_0x0072
            X.0yC r1 = r8.A0D
            r0 = 4067(0xfe3, float:5.699E-42)
            int r1 = r1.A07(r0)
            r0 = 2
            if (r1 < r0) goto L_0x0072
            X.0yC r1 = r8.A0D
            r0 = 4455(0x1167, float:6.243E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x0072
            com.whatsapp.jid.UserJid r6 = r3.getPeerJid()
            X.171 r5 = r8.A15
            if (r6 == 0) goto L_0x0072
            X.005 r0 = r5.A05
            java.lang.Object r0 = r0.get()
            X.16D r0 = (X.AnonymousClass16D) r0
            X.141 r2 = r0.A08(r6)
            if (r2 == 0) goto L_0x0072
            r1 = -1
            r0 = 1
            X.34G r0 = r5.A0E(r2, r1, r0, r0)
            X.2ol r1 = r0.A00
            X.2ol r0 = X.C52022ol.PHONE_NUMBER
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0072
            X.0wU r1 = r8.A04
            r0 = 12
            X.C1498172w.A02(r1, r8, r6, r0)
        L_0x0072:
            boolean r0 = A1S(r8)
            if (r0 != 0) goto L_0x0088
            X.6EE r0 = r3.self
            int r1 = r0.A06
            r0 = 2
            if (r1 != r0) goto L_0x0088
            X.6YM r0 = r8.A0r
            java.util.concurrent.ScheduledThreadPoolExecutor r1 = r0.A1E
            X.74Y r0 = X.AnonymousClass74Y.A00
            r1.execute(r0)
        L_0x0088:
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.NONE
            r8.callStateChanged(r0, r3)
            X.6YM r2 = r8.A0r
            java.lang.String r0 = "voip/restoreProximitySensor"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            boolean r0 = r2.A1H
            if (r0 == 0) goto L_0x00a6
            r2.A1H = r4
            android.os.Handler r0 = r2.A0c
            r1 = 14
            r0.removeMessages(r1)
            android.os.Handler r0 = r2.A0c
            r0.sendEmptyMessage(r1)
        L_0x00a6:
            X.6YM r1 = r8.A0r
            boolean r0 = r1.A1I
            if (r0 == 0) goto L_0x015b
            X.AnonymousClass6YM.A05(r1)
        L_0x00af:
            boolean r0 = r8.A2I
            if (r0 == 0) goto L_0x0157
            android.content.Intent r0 = r8.getIntent()
            if (r0 == 0) goto L_0x0157
            if (r3 == 0) goto L_0x0165
            com.whatsapp.voipcalling.CallState r0 = r3.callState
            boolean r0 = com.whatsapp.voipcalling.Voip.A09(r0)
            if (r0 == 0) goto L_0x00d2
            android.content.Intent r1 = r8.getIntent()
            java.lang.String r0 = "call_ui_action"
            int r0 = r1.getIntExtra(r0, r4)
            A19(r8, r0)
            r8.A2I = r4
        L_0x00d2:
            com.whatsapp.voipcalling.CallState r7 = r3.callState
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.REJOINING
            if (r7 == r0) goto L_0x00e0
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.RECEIVED_CALL
            if (r7 == r0) goto L_0x00e0
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.LINK
            if (r7 != r0) goto L_0x0165
        L_0x00e0:
            boolean r0 = r3.isCaller
            if (r0 != 0) goto L_0x0165
            boolean r0 = r3.isGroupCall
            if (r0 == 0) goto L_0x0165
            X.6YM r6 = r8.A0r
            long r4 = r6.A0U
            r1 = 0
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x00f8
            long r0 = java.lang.System.currentTimeMillis()
            r6.A0U = r0
        L_0x00f8:
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.LINK
            if (r7 == r0) goto L_0x0165
            android.content.Intent r2 = r8.getIntent()
            java.lang.String r1 = "lobbyEntryPoint"
            r0 = -1
            int r2 = r2.getIntExtra(r1, r0)
            if (r2 == r0) goto L_0x0124
            X.6YM r1 = r8.A0r
            java.lang.Integer r0 = r1.A15
            if (r0 != 0) goto L_0x0117
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r1.A15 = r0
            if (r0 == 0) goto L_0x011e
        L_0x0117:
            int r0 = r0.intValue()
            r1 = 1
            if (r0 != 0) goto L_0x011f
        L_0x011e:
            r1 = 0
        L_0x011f:
            java.lang.String r0 = "Bug in loading call lobby entry point"
            X.C18740tg.A0D(r1, r0)
        L_0x0124:
            com.whatsapp.voipcalling.CallState r1 = r3.callState
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.RECEIVED_CALL
            if (r1 != r0) goto L_0x0165
            java.util.HashSet r4 = X.C36441kJ.A16()
            java.util.Map r0 = r3.participants
            java.util.Iterator r3 = X.AnonymousClass000.A0z(r0)
        L_0x0134:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0160
            X.6EE r2 = X.C90524aI.A0J(r3)
            boolean r0 = r2.A0J
            if (r0 != 0) goto L_0x0134
            int r1 = r2.A02
            r0 = 1
            if (r1 != r0) goto L_0x0134
            com.whatsapp.jid.UserJid r1 = r2.A08
            X.13u r0 = com.whatsapp.jid.DeviceJid.Companion
            if (r1 == 0) goto L_0x0155
            com.whatsapp.jid.DeviceJid r0 = r1.getPrimaryDevice()
        L_0x0151:
            r4.add(r0)
            goto L_0x0134
        L_0x0155:
            r0 = 0
            goto L_0x0151
        L_0x0157:
            if (r3 == 0) goto L_0x0165
            goto L_0x00d2
        L_0x015b:
            X.AnonymousClass6YM.A04(r1)
            goto L_0x00af
        L_0x0160:
            X.6YM r0 = r8.A0r
            r0.A0j(r4)
        L_0x0165:
            X.0yC r0 = r8.A0D
            boolean r0 = X.C34681hT.A0J(r0)
            if (r0 == 0) goto L_0x01d8
            X.6ro r0 = r8.A0l
            if (r0 != 0) goto L_0x01d8
            android.view.View r1 = r8.A0A
            r0 = 2131434097(0x7f0b1a71, float:1.8489998E38)
            android.view.View r1 = X.C012005e.A02(r1, r0)
            r8.A0E = r1
            r0 = 2131434096(0x7f0b1a70, float:1.8489996E38)
            android.view.View r9 = X.C012005e.A02(r1, r0)
            android.view.ViewStub r9 = (android.view.ViewStub) r9
            X.5il r1 = r8.A0R
            X.01z r10 = r8.getSupportFragmentManager()
            r0 = 11
            X.7sr r3 = new X.7sr
            r3.<init>(r8, r0)
            r0 = 10
            X.7sr r2 = new X.7sr
            r2.<init>(r8, r0)
            X.1Mz r0 = r1.A00
            X.0tq r4 = r0.A01
            X.0yC r15 = X.C36341k9.A0V(r4)
            X.0yE r14 = X.C36351kA.A0X(r4)
            X.0tt r1 = r4.A00
            X.6wd r17 = X.C18830tt.A5a(r1)
            X.004 r0 = r4.A74
            java.lang.Object r13 = r0.get()
            X.1PW r13 = (X.AnonymousClass1PW) r13
            X.004 r0 = r1.A1m
            java.lang.Object r1 = r0.get()
            X.5lz r1 = (X.C117275lz) r1
            X.0wU r18 = X.C36341k9.A0Z(r4)
            X.17Y r11 = X.C36351kA.A0M(r4)
            X.004 r0 = r4.A8z
            java.lang.Object r12 = r0.get()
            X.1Pa r12 = (X.C27631Pa) r12
            X.6ro r7 = new X.6ro
            r16 = r1
            r19 = r3
            r20 = r2
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            r8.A0l = r7
        L_0x01d8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.VoipActivityV2.BgL(X.6YM):void");
    }

    public void BnL(int i) {
        Log.i("voip/VoipActivityV2/call/reject");
        CallInfo A012 = A01(this);
        if (A012 != null && A012.callState != CallState.NONE) {
            C107275Ni r1 = this.A1X;
            if (r1 != null) {
                r1.A01(true);
            }
            AnonymousClass6YM r2 = this.A0r;
            if (r2 == null) {
                return;
            }
            if (Voip.A09(A012.callState)) {
                r2.A0i(A012.callId, (String) null, i);
            } else if (A012.isPeerRequestingUpgrade()) {
                this.A0r.A1E.execute(new AnonymousClass72j(0, 2));
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002d, code lost:
        if (r1.A0G(r10.callId) == false) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0041, code lost:
        if (X.C36351kA.A1W(r0.A0D) == false) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0052, code lost:
        if (r0.A0B() != true) goto L_0x0054;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x006f, code lost:
        if (X.C36351kA.A1W(r0.A0D) == false) goto L_0x0071;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00a8, code lost:
        if (r6 != null) goto L_0x00aa;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Bwh(com.whatsapp.voipcalling.CallInfo r18) {
        /*
            r17 = this;
            r4 = r17
            r10 = r18
            com.whatsapp.voipcalling.CallState r1 = r4.A07(r10)
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.NONE
            if (r1 == r0) goto L_0x0127
            boolean r0 = com.whatsapp.voipcalling.Voip.A0A(r1)
            if (r0 != 0) goto L_0x0127
            com.whatsapp.voipcalling.VoipCallControlBottomSheetV2 r0 = r4.A1a
            r3 = 1
            r2 = 0
            if (r0 == 0) goto L_0x00d9
            com.whatsapp.calling.views.VoipCallFooter r9 = r0.A0U
            if (r9 == 0) goto L_0x00d9
            X.6YM r0 = r4.A0r
            if (r0 == 0) goto L_0x0147
            java.lang.String r11 = r0.A1B
            X.6zT r1 = r0.A2E
            int r12 = r1.A00
            java.lang.String r0 = r10.callId
            boolean r0 = r1.A0G(r0)
            r13 = 1
            if (r0 != 0) goto L_0x0030
        L_0x002f:
            r13 = 0
        L_0x0030:
            com.whatsapp.calling.avatar.viewmodel.CallAvatarViewModel r0 = r4.A0a
            boolean r14 = r0.A0T()
            com.whatsapp.calling.screenshare.ScreenShareViewModel r0 = r4.A0q
            if (r0 == 0) goto L_0x0043
            X.1hi r0 = r0.A0D
            boolean r0 = X.C36351kA.A1W(r0)
            r15 = 1
            if (r0 != 0) goto L_0x0044
        L_0x0043:
            r15 = 0
        L_0x0044:
            X.6ro r0 = r4.A0l
            if (r0 == 0) goto L_0x0054
            X.9nR r0 = X.C108915Vl.A00
            if (r0 == 0) goto L_0x0054
            boolean r0 = r0.A0B()
            r16 = 1
            if (r0 == r3) goto L_0x0056
        L_0x0054:
            r16 = 0
        L_0x0056:
            r9.A04(r10, r11, r12, r13, r14, r15, r16)
            X.6T1 r0 = r4.A0t
            if (r0 == 0) goto L_0x0060
            r0.A01(r10)
        L_0x0060:
            X.6ro r1 = r4.A0l
            if (r1 == 0) goto L_0x00d9
            com.whatsapp.calling.screenshare.ScreenShareViewModel r0 = r4.A0q
            if (r0 == 0) goto L_0x0071
            X.1hi r0 = r0.A0D
            boolean r0 = X.C36351kA.A1W(r0)
            r9 = 1
            if (r0 != 0) goto L_0x0072
        L_0x0071:
            r9 = 0
        L_0x0072:
            X.6wd r8 = r1.A09
            X.9nR r5 = X.C108915Vl.A00
            if (r5 == 0) goto L_0x0095
            com.whatsapp.voipcalling.CallState r1 = r10.callState
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.ACTIVE
            boolean r7 = X.C36361kB.A1a(r1, r0)
            boolean r0 = r5.A07
            if (r0 == r7) goto L_0x0095
            r5.A07 = r7
            X.9gt r6 = r5.A0B
            X.9gk r5 = X.AnonymousClass9AO.A01
            java.lang.String r1 = "sup:MediaStreamController"
            if (r7 == 0) goto L_0x012f
            java.lang.String r0 = "User has entered live format"
            r5.A01(r1, r0)
            r6.A0N = r3
        L_0x0095:
            X.6EE r6 = r10.self
            if (r6 == 0) goto L_0x00a7
            int r0 = r6.A06
            if (r0 != 0) goto L_0x00a7
            boolean r0 = r10.isGroupCall
            if (r0 != 0) goto L_0x012c
            com.whatsapp.voipcalling.CallState r1 = r10.callState
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.ACTIVE
            if (r1 != r0) goto L_0x012c
        L_0x00a7:
            r5 = 1
            if (r6 == 0) goto L_0x00c7
        L_0x00aa:
            int r1 = r6.A06
            r0 = 6
            boolean r0 = X.AnonymousClass000.A1S(r1, r0)
            if (r0 == r3) goto L_0x00b7
            int r0 = r6.A06
            if (r0 != 0) goto L_0x00c7
        L_0x00b7:
            X.9nR r1 = X.C108915Vl.A00
            if (r1 == 0) goto L_0x00c7
            boolean r0 = r1.A0B()
            if (r0 != r3) goto L_0x00c7
            r1.A06()
            X.C147076wd.A01(r8)
        L_0x00c7:
            boolean r0 = r8.A0D
            if (r9 != r0) goto L_0x00cf
            boolean r0 = r8.A0A
            if (r0 == r5) goto L_0x00d9
        L_0x00cf:
            r8.A0A = r5
            r8.A0D = r9
            X.C147076wd.A01(r8)
            X.C147076wd.A00(r8)
        L_0x00d9:
            boolean r0 = r4.A1q
            if (r0 != 0) goto L_0x0127
            android.view.ViewGroup r1 = r4.A0G
            X.C18740tg.A04(r1)
            android.widget.ImageButton r0 = r4.A0H
            X.C18740tg.A04(r0)
            int r0 = r1.getVisibility()
            if (r0 != 0) goto L_0x010e
            android.view.ViewGroup r7 = r4.A0G
            com.whatsapp.jid.GroupJid r0 = r10.groupJid
            if (r0 != 0) goto L_0x010b
            X.0yC r6 = r4.A0D
            com.whatsapp.voipcalling.CallState r5 = r10.callState
            boolean r1 = r10.isGroupCall
            java.lang.String r0 = "options.enable_add_participant_while_calling_receiver"
            java.lang.Boolean r0 = com.whatsapp.voipcalling.Voip.A03(r0)
            boolean r0 = X.C34681hT.A0Q(r6, r5, r0, r1)
            if (r0 == 0) goto L_0x012a
            boolean r0 = r10.isEitherSideRequestingUpgrade()
            if (r0 != 0) goto L_0x012a
        L_0x010b:
            X.AnonymousClass3UE.A08(r7, r3)
        L_0x010e:
            android.widget.ImageButton r3 = r4.A0H
            com.whatsapp.voipcalling.CallState r1 = r10.callState
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.ACTIVE
            if (r1 == r0) goto L_0x011e
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.CONNECTED_LONELY
            if (r1 == r0) goto L_0x011e
            boolean r0 = r4.A1m
            if (r0 == 0) goto L_0x0128
        L_0x011e:
            boolean r0 = r10.enableAudioVideoSwitch()
            if (r0 == 0) goto L_0x0128
        L_0x0124:
            r3.setVisibility(r2)
        L_0x0127:
            return
        L_0x0128:
            r2 = 4
            goto L_0x0124
        L_0x012a:
            r3 = 0
            goto L_0x010b
        L_0x012c:
            r5 = 0
            goto L_0x00aa
        L_0x012f:
            java.lang.String r0 = "User has exited live format"
            r5.A01(r1, r0)
            r6.A0N = r2
            boolean r0 = r6.A0M
            if (r0 == 0) goto L_0x0142
            java.lang.Integer r0 = X.C023109s.A0V
            r6.A0A(r0)
            r6.A04()
        L_0x0142:
            r6.A05()
            goto L_0x0095
        L_0x0147:
            r11 = 0
            r12 = 0
            goto L_0x002f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.VoipActivityV2.Bwh(com.whatsapp.voipcalling.CallInfo):void");
    }

    public void BxK(CallInfo callInfo) {
        if (callInfo.callId.equals(this.A1i)) {
            this.A1p = false;
            this.A05.removeMessages(10);
            CallState callState = callInfo.callState;
            if (callState != CallState.NONE && !callInfo.callEnding) {
                if (A1R(callState, this, callInfo.isGroupCall)) {
                    this.A0W.clearAnimation();
                }
                if (callInfo.isEitherSideRequestingUpgrade()) {
                    this.A1m = false;
                }
                A0t(callInfo, this);
                A0u(callInfo, this);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:144:0x02ba, code lost:
        if (r2 == 2) goto L_0x02bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0140, code lost:
        if (r2 == 1) goto L_0x0142;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0156, code lost:
        if (r1 != com.whatsapp.voipcalling.CallState.REJOINING) goto L_0x0158;
     */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x018c  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x01b2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void callStateChanged(com.whatsapp.voipcalling.CallState r20, com.whatsapp.voipcalling.CallInfo r21) {
        /*
            r19 = this;
            r3 = r19
            r4 = r21
            if (r21 != 0) goto L_0x000f
            java.lang.String r0 = "voip/VoipActivityV2/callStateChanged info == NULL finishing current activity"
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x000b:
            r3.finish()
        L_0x000e:
            return
        L_0x000f:
            com.whatsapp.voipcalling.CallState r11 = r3.A07(r4)
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.LINK
            r1 = r20
            if (r1 != r0) goto L_0x0025
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.CONNECTED_LONELY
            if (r11 == r0) goto L_0x0021
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.ACTIVE
            if (r11 != r0) goto L_0x0025
        L_0x0021:
            java.lang.String r0 = r4.callId
            r3.A1i = r0
        L_0x0025:
            java.lang.String r2 = r4.callId
            java.lang.String r0 = r3.A1i
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x000e
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "voip/VoipActivityV2/callStateChanged from "
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = " to "
            X.C36321k7.A1K(r11, r0, r2)
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.NONE
            if (r1 != r0) goto L_0x0047
            r3.A3s()
        L_0x0047:
            if (r11 != r0) goto L_0x035d
            androidx.fragment.app.DialogFragment r0 = r3.A0O
            if (r0 == 0) goto L_0x0055
            java.lang.String r0 = "EndCallConfirmationDialogFragment"
            r3.A3q(r0)
            r0 = 0
            r3.A0O = r0
        L_0x0055:
            android.view.Window r2 = r3.getWindow()
            r0 = 128(0x80, float:1.794E-43)
            r2.clearFlags(r0)
            int r8 = r4.callResult
            java.lang.String r2 = r3.A1h
            r6 = 0
            r5 = 1
            if (r2 == 0) goto L_0x00d3
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "voip/VoipActivityV2/callStateChanged state == NONE showing text: "
            X.C36321k7.A1Q(r0, r2, r1)
            boolean r0 = r3.A1s
            if (r0 == 0) goto L_0x008c
            java.lang.String r0 = r3.A1h
            r3.A1H(r0)
        L_0x0078:
            X.3Az r1 = r4.callWaitingInfo
            int r0 = r1.A01
            if (r0 != r5) goto L_0x0089
            java.lang.String r1 = r1.A04
            r3.A1i = r1
            com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel r0 = r3.A0e
            X.5Fb r0 = r0.A0Q
            r0.A0B(r1)
        L_0x0089:
            r3.A1m = r6
            return
        L_0x008c:
            X.0zA r0 = r3.A0Q
            boolean r0 = r0.A00
            if (r0 == 0) goto L_0x009e
            X.17Y r1 = r3.A05
            X.14r r0 = r1.A00
            if (r0 == 0) goto L_0x009e
            java.lang.String r0 = r3.A1h
            r1.A0K(r0, r5)
            goto L_0x0078
        L_0x009e:
            X.6YM r7 = r3.A0r
            if (r7 == 0) goto L_0x00cd
            java.lang.String r2 = r3.A1h
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "voip/showCallFailedMessage "
            X.C36321k7.A1Q(r0, r2, r1)
            X.0zA r0 = r7.A25
            boolean r0 = r0.A00
            r0 = r0 ^ 1
            android.content.Context r7 = r7.A22
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r0)
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r5)
            r9 = 0
            r12 = r9
            r11 = r9
            android.content.Intent r1 = X.AnonymousClass190.A0z(r7, r8, r9, r10, r11, r12)
            java.lang.String r0 = "showCallFailedMessage"
            r1.putExtra(r0, r2)
            r7.startActivity(r1)
            goto L_0x0078
        L_0x00cd:
            java.lang.String r0 = "can not show call failed message because voice service is null."
            com.whatsapp.util.Log.w((java.lang.String) r0)
            goto L_0x0078
        L_0x00d3:
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.ACCEPT_SENT
            r9 = 10
            if (r1 != r0) goto L_0x0103
            if (r8 == r9) goto L_0x00df
            r0 = 25
            if (r8 != r0) goto L_0x0103
        L_0x00df:
            X.6YM r0 = r3.A0r
            if (r0 == 0) goto L_0x0103
            int r2 = r0.A3R
            r0 = 26
            if (r2 != r0) goto L_0x0103
            r2 = 7
        L_0x00ea:
            android.os.Bundle r1 = X.AnonymousClass001.A07()
            java.lang.String r0 = "finish"
            r1.putBoolean(r0, r5)
            X.7p3 r0 = new X.7p3
            r0.<init>(r3, r6)
            com.whatsapp.voipcalling.VoipErrorDialogFragment r1 = com.whatsapp.voipcalling.VoipErrorDialogFragment.A03(r1, r0, r2)
            java.lang.String r0 = "VoipErrorDialogFragment"
            r3.A3o(r1, r0)
            goto L_0x0078
        L_0x0103:
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.CALLING
            if (r1 == r0) goto L_0x0119
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.REJOINING
            if (r1 == r0) goto L_0x0119
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.PRE_ACCEPT_RECEIVED
            if (r1 == r0) goto L_0x0119
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.ACCEPT_SENT
            if (r1 == r0) goto L_0x0119
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.ACTIVE
            if (r1 != r0) goto L_0x01d4
            if (r8 == r5) goto L_0x01d4
        L_0x0119:
            boolean r0 = r3.A2J
            if (r0 != 0) goto L_0x01d4
            X.6YM r0 = r3.A0r
            if (r0 == 0) goto L_0x01d4
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "voip/VoipActivityV2/callStateChanged state == NONE showing call failed screen, result="
            X.C36321k7.A1T(r0, r2, r8)
            boolean r0 = r4.videoEnabled
            if (r0 == 0) goto L_0x0146
            boolean r0 = r3.A1q
            if (r0 != 0) goto L_0x0146
            com.whatsapp.calling.CallDetailsLayout r10 = r3.A0W
            X.C18740tg.A04(r10)
            boolean r7 = r10.A06(r4)
            int r2 = r3.A00
            if (r2 == 0) goto L_0x0142
            r0 = 0
            if (r2 != r5) goto L_0x0143
        L_0x0142:
            r0 = 1
        L_0x0143:
            r10.A04(r11, r7, r0)
        L_0x0146:
            r7 = 17
            r2 = 2
            if (r8 == r2) goto L_0x0170
            if (r8 == r7) goto L_0x0170
            r0 = 4
            if (r8 != r0) goto L_0x016a
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.REJOINING
            if (r1 == r0) goto L_0x0170
        L_0x0154:
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.REJOINING
            if (r1 == r0) goto L_0x0165
        L_0x0158:
            com.whatsapp.jid.UserJid r7 = X.C90494aF.A0M(r4)
            boolean r9 = r4.videoEnabled
            if (r7 != 0) goto L_0x01f8
            java.lang.String r0 = "VoipActivityV2 vm showCallFailedScreen: cannot show buttons. got null jid"
        L_0x0162:
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x0165:
            r3.finish()
            goto L_0x0078
        L_0x016a:
            if (r8 != r9) goto L_0x0154
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.ACCEPT_SENT
            if (r1 != r0) goto L_0x0154
        L_0x0170:
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.REJOINING
            if (r1 != r0) goto L_0x01bf
            boolean r0 = r4.isEndedByMe
            if (r0 != 0) goto L_0x000b
            r0 = 2131895936(0x7f122680, float:1.942672E38)
        L_0x017b:
            java.lang.String r1 = r3.getString(r0)
        L_0x017f:
            X.0yb r0 = r3.A08
            X.C33521fV.A00(r3, r0, r1)
            android.view.View r0 = r3.A0C
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x01b2
            r3.A3w(r1)
        L_0x018f:
            X.0wU r2 = r3.A04
            r1 = 37
            X.72p r0 = new X.72p
            r0.<init>(r3, r1)
            r2.Boy(r0)
            android.os.Handler r0 = r3.A05
            r7 = 9
            r0.removeMessages(r7)
            r0 = 17
            if (r8 == r0) goto L_0x0158
            r0 = 2
            if (r8 == r0) goto L_0x0158
            android.os.Handler r2 = r3.A05
            r0 = 2000(0x7d0, double:9.88E-321)
            r2.sendEmptyMessageDelayed(r7, r0)
            goto L_0x0078
        L_0x01b2:
            boolean r0 = r3.A1q
            if (r0 != 0) goto L_0x018f
            com.whatsapp.calling.CallDetailsLayout r0 = r3.A0W
            X.C18740tg.A04(r0)
            r0.A05(r1, r1)
            goto L_0x018f
        L_0x01bf:
            if (r8 != r7) goto L_0x01c5
            r0 = 2131896050(0x7f1226f2, float:1.942695E38)
            goto L_0x017b
        L_0x01c5:
            if (r8 != r2) goto L_0x01cb
            r0 = 2131895893(0x7f122655, float:1.9426632E38)
            goto L_0x017b
        L_0x01cb:
            com.whatsapp.jid.UserJid r0 = X.C90494aF.A0M(r4)
            java.lang.String r1 = r3.A0F(r0, r8)
            goto L_0x017f
        L_0x01d4:
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.ACCEPT_SENT
            if (r1 != r0) goto L_0x01e8
            boolean r0 = r4.isGroupCall
            if (r0 == 0) goto L_0x01e8
            boolean r0 = r4.isEndedByMe
            if (r0 != 0) goto L_0x01e8
            int r0 = r4.callResult
            if (r0 != r9) goto L_0x01e8
            r2 = 8
            goto L_0x00ea
        L_0x01e8:
            boolean r0 = r3.A1r
            if (r0 == 0) goto L_0x01f4
            X.17Y r1 = r3.A05
            r0 = 2131895867(0x7f12263b, float:1.942658E38)
            r1.A06(r0, r5)
        L_0x01f4:
            java.lang.String r0 = "voip/VoipActivityV2/callStateChanged state == NONE finishing current activity"
            goto L_0x0162
        L_0x01f8:
            r3.A0L()
            X.5Su r0 = X.C108255Su.CALL_FAILED_SCREEN
            r3.A3p(r0)
            java.lang.String r1 = r3.A0F(r7, r8)
            boolean r0 = r3.A1q
            if (r0 != 0) goto L_0x0210
            com.whatsapp.calling.CallDetailsLayout r0 = r3.A0W
            X.C18740tg.A04(r0)
            r0.A05(r1, r1)
        L_0x0210:
            if (r1 == 0) goto L_0x0217
            X.0yb r0 = r3.A08
            X.C33521fV.A00(r3, r0, r1)
        L_0x0217:
            java.lang.String r0 = "voip/VoipCallControlBottomSheetV2 detaching bottom sheet"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            com.whatsapp.voipcalling.VoipCallControlBottomSheetV2 r0 = r3.A1a
            if (r0 == 0) goto L_0x0225
            java.lang.String r0 = "CallControlSheet"
            r3.A3D(r0)
        L_0x0225:
            android.view.ViewGroup r0 = r3.A0F
            if (r0 != 0) goto L_0x0243
            r0 = 2131428462(0x7f0b046e, float:1.847857E38)
            android.view.View r2 = r3.findViewById(r0)
            android.view.ViewStub r2 = (android.view.ViewStub) r2
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "voip/VoipActivityV2/showCallFailedScreen found callFailedButtonsStub:"
            X.C36321k7.A1K(r2, r0, r1)
            android.view.View r0 = r2.inflate()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r3.A0F = r0
        L_0x0243:
            com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel r0 = r3.A0e
            X.1hi r2 = r0.A0g
            java.lang.Object r0 = r2.A04()
            X.69u r0 = (X.C1278269u) r0
            android.graphics.Bitmap r1 = r0.A01
            X.69u r0 = new X.69u
            r0.<init>(r6, r1)
            r2.A0D(r0)
            java.lang.String r0 = "VoipActivityV2 vm showing call failed screen from coordinator"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r1 = 4
            X.6cn r0 = new X.6cn
            r0.<init>(r3, r7, r1)
            android.view.ViewGroup r7 = r3.A0F
            X.C18740tg.A04(r7)
            android.view.View$OnClickListener r14 = r3.A07
            android.view.View$OnClickListener r15 = r3.A06
            X.6Cr r13 = new X.6Cr
            r18 = r9
            r17 = r8
            r16 = r0
            r13.<init>(r14, r15, r16, r17, r18)
            X.AnonymousClass00C.A0D(r7, r6)
            r7.setVisibility(r6)
            r0 = 2131428561(0x7f0b04d1, float:1.847877E38)
            android.view.View r11 = X.C36361kB.A0F(r7, r0)
            android.view.ViewGroup r11 = (android.view.ViewGroup) r11
            int r10 = r11.getChildCount()
            r2 = 0
        L_0x028a:
            if (r2 >= r10) goto L_0x0298
            android.view.View r1 = r11.getChildAt(r2)
            android.view.View$OnClickListener r0 = r13.A01
            r1.setOnClickListener(r0)
            int r2 = r2 + 1
            goto L_0x028a
        L_0x0298:
            r0 = 2131428562(0x7f0b04d2, float:1.8478772E38)
            android.widget.ImageView r1 = X.C36391kE.A0N(r7, r0)
            r0 = 2131233907(0x7f080c73, float:1.8083965E38)
            r1.setImageResource(r0)
            A0l(r1)
            r0 = 2131428436(0x7f0b0454, float:1.8478516E38)
            android.view.View r10 = r7.findViewById(r0)
            r12 = r10
            android.view.ViewGroup r12 = (android.view.ViewGroup) r12
            int r2 = r13.A00
            r0 = 17
            if (r2 == r0) goto L_0x02bc
            r1 = 2
            r0 = 0
            if (r2 != r1) goto L_0x02bd
        L_0x02bc:
            r0 = 1
        L_0x02bd:
            r1 = r0 ^ 1
            X.AnonymousClass00C.A0B(r12)
            r11 = 0
            int r0 = X.C36351kA.A00(r1)
            r12.setVisibility(r0)
            if (r1 == 0) goto L_0x0301
            X.AnonymousClass00C.A08(r10)
            r0 = 2131428437(0x7f0b0455, float:1.8478518E38)
            android.widget.ImageView r10 = X.C36361kB.A0M(r7, r0)
            r0 = 2131233573(0x7f080b25, float:1.8083287E38)
            r10.setBackgroundResource(r0)
            boolean r1 = r13.A04
            r0 = 2131233880(0x7f080c58, float:1.808391E38)
            if (r1 == 0) goto L_0x02e6
            r0 = 2131233878(0x7f080c56, float:1.8083906E38)
        L_0x02e6:
            r7.setBackgroundColor(r6)
            r10.setImageResource(r0)
            int r2 = r12.getChildCount()
        L_0x02f0:
            if (r11 >= r2) goto L_0x02fe
            android.view.View r1 = r12.getChildAt(r11)
            android.view.View$OnClickListener r0 = r13.A03
            r1.setOnClickListener(r0)
            int r11 = r11 + 1
            goto L_0x02f0
        L_0x02fe:
            A0l(r10)
        L_0x0301:
            r0 = 2131431720(0x7f0b1128, float:1.8485177E38)
            X.1RJ r0 = X.C36341k9.A0Y(r7, r0)
            r11 = 0
            android.view.View r10 = X.C36391kE.A0L(r0, r6)
            X.AnonymousClass00C.A08(r10)
            android.view.ViewGroup r10 = (android.view.ViewGroup) r10
            int r2 = r10.getChildCount()
        L_0x0316:
            if (r11 >= r2) goto L_0x0324
            android.view.View r1 = r10.getChildAt(r11)
            android.view.View$OnClickListener r0 = r13.A02
            r1.setOnClickListener(r0)
            int r11 = r11 + 1
            goto L_0x0316
        L_0x0324:
            r0 = 2131431726(0x7f0b112e, float:1.848519E38)
            android.view.View r0 = r7.findViewById(r0)
            A0l(r0)
            r0 = 17
            if (r8 == r0) goto L_0x0335
            r0 = 2
            if (r8 != r0) goto L_0x033e
        L_0x0335:
            android.os.Handler r7 = r3.A05
            r2 = 9
            r0 = 15000(0x3a98, double:7.411E-320)
            r7.sendEmptyMessageDelayed(r2, r0)
        L_0x033e:
            X.6Ke r1 = r3.A11
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            r1.A02 = r0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r9)
            r1.A00 = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
            r1.A01 = r0
            X.6ro r0 = r3.A0l
            if (r0 == 0) goto L_0x0078
            X.6wd r0 = r0.A09
            r0.A02()
            goto L_0x0078
        L_0x035d:
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.ACTIVE
            if (r11 != r0) goto L_0x03b2
            boolean r0 = r4.videoEnabled
            if (r0 == 0) goto L_0x0372
            boolean r0 = r3.A2O
            if (r0 != 0) goto L_0x036d
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.LINK
            if (r1 != r0) goto L_0x0372
        L_0x036d:
            X.711 r0 = r3.A0x
            r0.A06()
        L_0x0372:
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.ACCEPT_SENT
            if (r1 != r0) goto L_0x039b
            com.whatsapp.calling.avatar.viewmodel.CallAvatarViewModel r5 = r3.A0a
            java.lang.String r0 = "voip/CallAvatarViewModel/onNewCallActive"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1hi r0 = r5.A0F
            java.lang.Object r0 = r0.A04()
            boolean r0 = r0 instanceof X.AnonymousClass52S
            if (r0 != 0) goto L_0x0394
            X.040 r2 = X.C109325Xd.A00(r5)
            r1 = 0
            com.whatsapp.calling.avatar.viewmodel.CallAvatarViewModel$onNewCallActive$1 r0 = new com.whatsapp.calling.avatar.viewmodel.CallAvatarViewModel$onNewCallActive$1
            r0.<init>(r5, r1)
            X.C36331k8.A1T(r0, r2)
        L_0x0394:
            X.6ro r0 = r3.A0l
            if (r0 == 0) goto L_0x039b
            r0.A01()
        L_0x039b:
            com.whatsapp.voipcalling.CallState r0 = r4.callState
            int r0 = r0.ordinal()
            switch(r0) {
                case 0: goto L_0x03aa;
                case 1: goto L_0x03a8;
                case 2: goto L_0x03a8;
                case 3: goto L_0x03ad;
                case 4: goto L_0x03a8;
                case 5: goto L_0x03a8;
                case 6: goto L_0x03a8;
                case 7: goto L_0x03a4;
                case 8: goto L_0x03a4;
                case 9: goto L_0x03a4;
                case 10: goto L_0x03a8;
                default: goto L_0x03a4;
            }
        L_0x03a4:
            A0u(r4, r3)
            return
        L_0x03a8:
            r0 = 0
            goto L_0x03ae
        L_0x03aa:
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L_0x03ae
        L_0x03ad:
            r0 = 2
        L_0x03ae:
            r3.setVolumeControlStream(r0)
            goto L_0x03a4
        L_0x03b2:
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.CONNECTED_LONELY
            if (r11 != r0) goto L_0x039b
            boolean r0 = r4.videoEnabled
            if (r0 == 0) goto L_0x039b
            X.711 r0 = r3.A0x
            r0.A06()
            goto L_0x039b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.VoipActivityV2.callStateChanged(com.whatsapp.voipcalling.CallState, com.whatsapp.voipcalling.CallInfo):void");
    }

    public void finish() {
        Log.i("voip/VoipActivityV2/finish");
        super.finish();
        C130216Ke r1 = this.A11;
        if (r1.A02 != null || r1.A00 != null || r1.A01 != null) {
            C130216Ke.A00(r1);
        }
    }

    public Window getWindow() {
        Window A2k;
        if (this.A17 == null || (A2k = A2k("VoipContactPickerDialogFragment")) == null) {
            return super.getWindow();
        }
        return A2k;
    }

    public void onBackPressed() {
        ContactPickerFragment contactPickerFragment = this.A17;
        if (contactPickerFragment == null) {
            CallGridViewModel callGridViewModel = this.A0e;
            C001700s r1 = callGridViewModel.A0I;
            if (r1.A04() != null) {
                CallGridViewModel.A0L(callGridViewModel, (UserJid) r1.A04());
            } else if (!A1S(this) || !A1O(A01(this), this)) {
                this.A11.A02 = C36381kD.A0m();
                super.onBackPressed();
            }
        } else if (!contactPickerFragment.A21()) {
            A0z(this);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0395, code lost:
        if (r7.equalsIgnoreCase("davinciin") == false) goto L_0x0399;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x030d, code lost:
        if (r8.equalsIgnoreCase("OP4A57") == false) goto L_0x030f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x037b, code lost:
        if (r8.startsWith("PD1818") == false) goto L_0x037d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x0415 A[Catch:{ IllegalStateException -> 0x0289, all -> 0x07ee }] */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x043a A[Catch:{ IllegalStateException -> 0x0289, all -> 0x07ee }] */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x0453 A[Catch:{ IllegalStateException -> 0x0289, all -> 0x07ee }] */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x046f A[Catch:{ IllegalStateException -> 0x0289, all -> 0x07ee }] */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x04dc A[Catch:{ IllegalStateException -> 0x0289, all -> 0x07ee }] */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x05da A[Catch:{ IllegalStateException -> 0x0289, all -> 0x07ee }] */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x065f A[Catch:{ IllegalStateException -> 0x0289, all -> 0x07ee }] */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x0692 A[Catch:{ IllegalStateException -> 0x0289, all -> 0x07ee }] */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x06c9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r28) {
        /*
            r27 = this;
            r2 = r27
            r0 = r28
            super.onCreate(r0)
            X.0yC r1 = r2.A0D
            r0 = 1807(0x70f, float:2.532E-42)
            boolean r16 = r1.A0E(r0)
            java.lang.String r10 = "VoipActivityV2"
            java.lang.String r1 = "VoipActivityV2_onCreate"
            if (r16 == 0) goto L_0x001f
            X.11e r0 = r2.A02     // Catch:{ all -> 0x07ee }
            r0.A0A(r10)     // Catch:{ all -> 0x07ee }
            X.11e r0 = r2.A02     // Catch:{ all -> 0x07ee }
            r0.A09(r1)     // Catch:{ all -> 0x07ee }
        L_0x001f:
            r0 = 2131895866(0x7f12263a, float:1.9426577E38)
            r2.setTitle(r0)     // Catch:{ all -> 0x07ee }
            X.30f r0 = r2.A0X     // Catch:{ all -> 0x07ee }
            java.util.ArrayList r0 = r0.A00     // Catch:{ all -> 0x07ee }
            java.util.Iterator r3 = r0.iterator()     // Catch:{ all -> 0x07ee }
        L_0x002d:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x07ee }
            if (r0 == 0) goto L_0x003d
            java.lang.Object r0 = r3.next()     // Catch:{ all -> 0x07ee }
            X.4PP r0 = (X.AnonymousClass4PP) r0     // Catch:{ all -> 0x07ee }
            r0.B7O()     // Catch:{ all -> 0x07ee }
            goto L_0x002d
        L_0x003d:
            android.content.Intent r3 = r2.getIntent()     // Catch:{ all -> 0x07ee }
            java.lang.String r0 = "call_id"
            java.lang.String r0 = r3.getStringExtra(r0)     // Catch:{ all -> 0x07ee }
            r2.A1i = r0     // Catch:{ all -> 0x07ee }
            com.whatsapp.voipcalling.CallInfo r5 = A01(r2)     // Catch:{ all -> 0x07ee }
            java.lang.String r0 = r2.A1i     // Catch:{ all -> 0x07ee }
            if (r0 != 0) goto L_0x0057
            if (r5 == 0) goto L_0x0057
            java.lang.String r0 = r5.callId     // Catch:{ all -> 0x07ee }
            r2.A1i = r0     // Catch:{ all -> 0x07ee }
        L_0x0057:
            r12 = 0
            r4 = 1
            r6 = 0
            if (r5 == 0) goto L_0x06d6
            com.whatsapp.voipcalling.CallState r3 = r5.callState     // Catch:{ all -> 0x07ee }
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.NONE     // Catch:{ all -> 0x07ee }
            if (r3 == r0) goto L_0x06d6
            android.content.Intent r7 = r2.getIntent()     // Catch:{ all -> 0x07ee }
            java.lang.String r3 = "lobbyEntryPoint"
            r0 = -1
            int r7 = r7.getIntExtra(r3, r0)     // Catch:{ all -> 0x07ee }
            java.lang.String r17 = X.C114145gi.A00     // Catch:{ all -> 0x07ee }
            r0 = r17
            boolean r0 = X.C90484aE.A1R(r2, r0)     // Catch:{ all -> 0x07ee }
            r3 = 2
            if (r0 != 0) goto L_0x0080
            r0 = 7
            if (r7 == r0) goto L_0x0080
            if (r7 == r3) goto L_0x0080
            if (r7 == r4) goto L_0x0080
            goto L_0x0088
        L_0x0080:
            X.1NF r7 = r2.A0o     // Catch:{ all -> 0x07ee }
            java.lang.String r0 = r2.A1i     // Catch:{ all -> 0x07ee }
            r7.A01(r0)     // Catch:{ all -> 0x07ee }
            goto L_0x0091
        L_0x0088:
            X.1NF r8 = r2.A0o     // Catch:{ all -> 0x07ee }
            java.lang.String r7 = r2.A1i     // Catch:{ all -> 0x07ee }
            java.lang.String r0 = "voipactivity_oncreate_start"
            r8.A03(r7, r0)     // Catch:{ all -> 0x07ee }
        L_0x0091:
            r2.A0E = r6     // Catch:{ all -> 0x07ee }
            r2.A1J(r4)     // Catch:{ all -> 0x07ee }
            android.view.Window r7 = r2.getWindow()     // Catch:{ all -> 0x07ee }
            r0 = 2097152(0x200000, float:2.938736E-39)
            r7.addFlags(r0)     // Catch:{ all -> 0x07ee }
            int r7 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x07ee }
            r0 = 27
            if (r7 < r0) goto L_0x00a8
            r2.setTurnScreenOn(r4)     // Catch:{ all -> 0x07ee }
        L_0x00a8:
            r0 = 2131626509(0x7f0e0a0d, float:1.8880256E38)
            r2.setContentView((int) r0)     // Catch:{ all -> 0x07ee }
            r0 = 2131428500(0x7f0b0494, float:1.8478646E38)
            android.view.View r0 = r2.findViewById(r0)     // Catch:{ all -> 0x07ee }
            r2.A0A = r0     // Catch:{ all -> 0x07ee }
            r0 = 2131428494(0x7f0b048e, float:1.8478634E38)
            android.view.View r0 = r2.findViewById(r0)     // Catch:{ all -> 0x07ee }
            r2.A09 = r0     // Catch:{ all -> 0x07ee }
            r0 = 2131428438(0x7f0b0456, float:1.847852E38)
            android.view.View r0 = r2.findViewById(r0)     // Catch:{ all -> 0x07ee }
            com.whatsapp.WaImageView r0 = (com.whatsapp.WaImageView) r0     // Catch:{ all -> 0x07ee }
            r2.A0S = r0     // Catch:{ all -> 0x07ee }
            r7 = 20
            X.6cl r0 = new X.6cl     // Catch:{ all -> 0x07ee }
            r0.<init>(r2, r7)     // Catch:{ all -> 0x07ee }
            r2.A07 = r0     // Catch:{ all -> 0x07ee }
            r0 = 2131428442(0x7f0b045a, float:1.8478529E38)
            android.view.View r7 = r2.findViewById(r0)     // Catch:{ all -> 0x07ee }
            X.1RJ r0 = new X.1RJ     // Catch:{ all -> 0x07ee }
            r0.<init>(r7)     // Catch:{ all -> 0x07ee }
            r2.A2G = r0     // Catch:{ all -> 0x07ee }
            android.view.Window r0 = r2.getWindow()     // Catch:{ all -> 0x07ee }
            android.view.View r7 = r0.getDecorView()     // Catch:{ all -> 0x07ee }
            int r0 = r7.getSystemUiVisibility()     // Catch:{ all -> 0x07ee }
            r0 = r0 | 1024(0x400, float:1.435E-42)
            r7.setSystemUiVisibility(r0)     // Catch:{ all -> 0x07ee }
            android.content.res.Resources r9 = r2.getResources()     // Catch:{ all -> 0x07ee }
            java.lang.String r8 = "status_bar_height"
            java.lang.String r7 = "dimen"
            java.lang.String r0 = "android"
            int r0 = r9.getIdentifier(r8, r7, r0)     // Catch:{ all -> 0x07ee }
            if (r0 <= 0) goto L_0x0123
            int r0 = X.C36361kB.A02(r2, r0)     // Catch:{ all -> 0x07ee }
        L_0x0107:
            r2.A01 = r0     // Catch:{ all -> 0x07ee }
            X.0yC r7 = r2.A0D     // Catch:{ all -> 0x07ee }
            X.185 r0 = r2.A14     // Catch:{ all -> 0x07ee }
            boolean r0 = X.AnonymousClass3UL.A09(r0, r5)     // Catch:{ all -> 0x07ee }
            boolean r0 = X.C34681hT.A0R(r7, r0)     // Catch:{ all -> 0x07ee }
            r2.A1q = r0     // Catch:{ all -> 0x07ee }
            android.content.res.Resources r8 = r2.getResources()     // Catch:{ all -> 0x07ee }
            boolean r7 = r2.A1q     // Catch:{ all -> 0x07ee }
            r0 = 2131166913(0x7f0706c1, float:1.7948085E38)
            if (r7 == 0) goto L_0x0129
            goto L_0x0126
        L_0x0123:
            r0 = 25
            goto L_0x0107
        L_0x0126:
            r0 = 2131165548(0x7f07016c, float:1.7945316E38)
        L_0x0129:
            int r0 = r8.getDimensionPixelSize(r0)     // Catch:{ all -> 0x07ee }
            r2.A22 = r0     // Catch:{ all -> 0x07ee }
            android.content.res.Resources r7 = r2.getResources()     // Catch:{ all -> 0x07ee }
            r0 = 2131165528(0x7f070158, float:1.7945276E38)
            int r8 = r7.getDimensionPixelSize(r0)     // Catch:{ all -> 0x07ee }
            android.content.res.Resources r7 = r2.getResources()     // Catch:{ all -> 0x07ee }
            r0 = 2131165535(0x7f07015f, float:1.794529E38)
            int r0 = X.C36441kJ.A06(r7, r0, r8)     // Catch:{ all -> 0x07ee }
            r2.A1z = r0     // Catch:{ all -> 0x07ee }
            boolean r0 = r5.videoEnabled     // Catch:{ all -> 0x07ee }
            boolean r0 = X.AnonymousClass000.A1P(r0)
            A1F(r2, r0)     // Catch:{ all -> 0x07ee }
            boolean r0 = A1S(r2)     // Catch:{ all -> 0x07ee }
            if (r0 == 0) goto L_0x015d
            android.app.PictureInPictureParams$Builder r0 = new android.app.PictureInPictureParams$Builder     // Catch:{ all -> 0x07ee }
            r0.<init>()     // Catch:{ all -> 0x07ee }
            r2.A03 = r0     // Catch:{ all -> 0x07ee }
        L_0x015d:
            X.04H r7 = X.C36441kJ.A0b(r2)     // Catch:{ all -> 0x07ee }
            java.lang.Class<com.whatsapp.calling.callgrid.viewmodel.MenuBottomSheetViewModel> r0 = com.whatsapp.calling.callgrid.viewmodel.MenuBottomSheetViewModel.class
            X.04R r0 = r7.A00(r0)     // Catch:{ all -> 0x07ee }
            com.whatsapp.calling.callgrid.viewmodel.MenuBottomSheetViewModel r0 = (com.whatsapp.calling.callgrid.viewmodel.MenuBottomSheetViewModel) r0     // Catch:{ all -> 0x07ee }
            r2.A0g = r0     // Catch:{ all -> 0x07ee }
            X.00s r7 = r0.A04     // Catch:{ all -> 0x07ee }
            r0 = 26
            X.C165197t2.A00(r2, r7, r0)     // Catch:{ all -> 0x07ee }
            com.whatsapp.calling.callgrid.viewmodel.MenuBottomSheetViewModel r0 = r2.A0g     // Catch:{ all -> 0x07ee }
            X.1Rs r7 = r0.A0C     // Catch:{ all -> 0x07ee }
            r0 = 22
            X.C165197t2.A00(r2, r7, r0)     // Catch:{ all -> 0x07ee }
            com.whatsapp.calling.callgrid.viewmodel.MenuBottomSheetViewModel r0 = r2.A0g     // Catch:{ all -> 0x07ee }
            X.1Rs r7 = r0.A0B     // Catch:{ all -> 0x07ee }
            r0 = 23
            X.C165197t2.A00(r2, r7, r0)     // Catch:{ all -> 0x07ee }
            X.04H r7 = X.C36441kJ.A0b(r2)     // Catch:{ all -> 0x07ee }
            java.lang.Class<com.whatsapp.calling.callgrid.viewmodel.OrientationViewModel> r0 = com.whatsapp.calling.callgrid.viewmodel.OrientationViewModel.class
            X.04R r0 = r7.A00(r0)     // Catch:{ all -> 0x07ee }
            com.whatsapp.calling.callgrid.viewmodel.OrientationViewModel r0 = (com.whatsapp.calling.callgrid.viewmodel.OrientationViewModel) r0     // Catch:{ all -> 0x07ee }
            r2.A0h = r0     // Catch:{ all -> 0x07ee }
            X.00s r7 = r0.A05     // Catch:{ all -> 0x07ee }
            r0 = 37
            X.C165197t2.A00(r2, r7, r0)     // Catch:{ all -> 0x07ee }
            android.view.View r7 = r2.A0A     // Catch:{ all -> 0x07ee }
            r0 = 2131428465(0x7f0b0471, float:1.8478575E38)
            android.view.View r0 = X.C012005e.A02(r7, r0)     // Catch:{ all -> 0x07ee }
            com.whatsapp.calling.callgrid.view.CallGrid r0 = (com.whatsapp.calling.callgrid.view.CallGrid) r0     // Catch:{ all -> 0x07ee }
            r2.A2A = r0     // Catch:{ all -> 0x07ee }
            X.01N r7 = r2.A06     // Catch:{ all -> 0x07ee }
            X.01Y r0 = r0.A0Y     // Catch:{ all -> 0x07ee }
            r7.A04(r0)     // Catch:{ all -> 0x07ee }
            com.whatsapp.calling.callgrid.view.CallGrid r7 = r2.A2A     // Catch:{ all -> 0x07ee }
            r0 = 12
            X.C163327q1.A00(r7, r2, r0)     // Catch:{ all -> 0x07ee }
            X.04H r7 = X.C36441kJ.A0b(r2)     // Catch:{ all -> 0x07ee }
            java.lang.Class<com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel> r0 = com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel.class
            X.04R r0 = r7.A00(r0)     // Catch:{ all -> 0x07ee }
            com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel r0 = (com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel) r0     // Catch:{ all -> 0x07ee }
            r2.A0e = r0     // Catch:{ all -> 0x07ee }
            java.lang.String r7 = r2.A1i     // Catch:{ all -> 0x07ee }
            X.5Fb r0 = r0.A0Q     // Catch:{ all -> 0x07ee }
            r0.A0B(r7)     // Catch:{ all -> 0x07ee }
            com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel r9 = r2.A0e     // Catch:{ all -> 0x07ee }
            android.util.DisplayMetrics r0 = X.AnonymousClass000.A0X(r2)     // Catch:{ all -> 0x07ee }
            int r8 = r0.widthPixels     // Catch:{ all -> 0x07ee }
            int r7 = r0.heightPixels     // Catch:{ all -> 0x07ee }
            android.util.Rational r0 = new android.util.Rational     // Catch:{ all -> 0x07ee }
            r0.<init>(r8, r7)     // Catch:{ all -> 0x07ee }
            r9.A0V(r0)     // Catch:{ all -> 0x07ee }
            com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel r0 = r2.A0e     // Catch:{ all -> 0x07ee }
            X.00s r7 = r0.A0I     // Catch:{ all -> 0x07ee }
            r0 = 32
            X.C165197t2.A00(r2, r7, r0)     // Catch:{ all -> 0x07ee }
            com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel r0 = r2.A0e     // Catch:{ all -> 0x07ee }
            X.00s r7 = r0.A0K     // Catch:{ all -> 0x07ee }
            r0 = 31
            X.C165197t2.A00(r2, r7, r0)     // Catch:{ all -> 0x07ee }
            com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel r0 = r2.A0e     // Catch:{ all -> 0x07ee }
            X.1Rs r7 = r0.A0w     // Catch:{ all -> 0x07ee }
            r0 = 43
            X.C165197t2.A00(r2, r7, r0)     // Catch:{ all -> 0x07ee }
            com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel r0 = r2.A0e     // Catch:{ all -> 0x07ee }
            X.1hi r7 = r0.A0n     // Catch:{ all -> 0x07ee }
            r0 = 33
            X.C165197t2.A00(r2, r7, r0)     // Catch:{ all -> 0x07ee }
            com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel r0 = r2.A0e     // Catch:{ all -> 0x07ee }
            X.1Rs r7 = r0.A0v     // Catch:{ all -> 0x07ee }
            r0 = 34
            X.C165197t2.A00(r2, r7, r0)     // Catch:{ all -> 0x07ee }
            com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel r0 = r2.A0e     // Catch:{ all -> 0x07ee }
            X.00s r7 = r0.A0J     // Catch:{ all -> 0x07ee }
            r0 = 44
            X.C165197t2.A00(r2, r7, r0)     // Catch:{ all -> 0x07ee }
            com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel r0 = r2.A0e     // Catch:{ all -> 0x07ee }
            X.1Rs r7 = r0.A0u     // Catch:{ all -> 0x07ee }
            r11 = 4
            X.3Ub r0 = new X.3Ub     // Catch:{ all -> 0x07ee }
            r0.<init>(r2, r11)     // Catch:{ all -> 0x07ee }
            r7.A08(r2, r0)     // Catch:{ all -> 0x07ee }
            com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel r0 = r2.A0e     // Catch:{ all -> 0x07ee }
            X.00s r7 = r0.A0M     // Catch:{ all -> 0x07ee }
            r0 = 24
            X.C165197t2.A00(r2, r7, r0)     // Catch:{ all -> 0x07ee }
            X.04H r7 = X.C36441kJ.A0b(r2)     // Catch:{ all -> 0x07ee }
            java.lang.Class<com.whatsapp.calling.avatar.viewmodel.CallAvatarViewModel> r0 = com.whatsapp.calling.avatar.viewmodel.CallAvatarViewModel.class
            X.04R r0 = r7.A00(r0)     // Catch:{ all -> 0x07ee }
            com.whatsapp.calling.avatar.viewmodel.CallAvatarViewModel r0 = (com.whatsapp.calling.avatar.viewmodel.CallAvatarViewModel) r0     // Catch:{ all -> 0x07ee }
            r2.A0a = r0     // Catch:{ all -> 0x07ee }
            X.1hi r7 = r0.A0F     // Catch:{ all -> 0x07ee }
            r0 = 25
            X.C165197t2.A00(r2, r7, r0)     // Catch:{ all -> 0x07ee }
            com.whatsapp.calling.avatar.viewmodel.CallAvatarViewModel r0 = r2.A0a     // Catch:{ all -> 0x07ee }
            X.1Rs r0 = r0.A0G     // Catch:{ all -> 0x07ee }
            r9 = 39
            X.C165197t2.A00(r2, r0, r9)     // Catch:{ all -> 0x07ee }
            com.whatsapp.calling.callgrid.view.CallGrid r7 = r2.A2A     // Catch:{ all -> 0x07ee }
            X.6rK r0 = new X.6rK     // Catch:{ all -> 0x07ee }
            r0.<init>(r2)     // Catch:{ all -> 0x07ee }
            r7.A04 = r0     // Catch:{ all -> 0x07ee }
            X.7lo r0 = r2.A0k     // Catch:{ all -> 0x07ee }
            X.00r r7 = r0.B9D()     // Catch:{ all -> 0x07ee }
            r0 = 29
            X.C165197t2.A00(r2, r7, r0)     // Catch:{ all -> 0x07ee }
            X.13J r0 = r2.A1U     // Catch:{ all -> 0x07ee }
            boolean r0 = r0.BMU()     // Catch:{ all -> 0x07ee }
            if (r0 == 0) goto L_0x02ae
            X.04H r7 = X.C36441kJ.A0b(r2)     // Catch:{ all -> 0x07ee }
            java.lang.Class<com.whatsapp.calling.screenshare.ScreenShareViewModel> r0 = com.whatsapp.calling.screenshare.ScreenShareViewModel.class
            X.04R r15 = r7.A00(r0)     // Catch:{ all -> 0x07ee }
            com.whatsapp.calling.screenshare.ScreenShareViewModel r15 = (com.whatsapp.calling.screenshare.ScreenShareViewModel) r15     // Catch:{ all -> 0x07ee }
            r2.A0q = r15     // Catch:{ all -> 0x07ee }
            X.01X r14 = r2.A04     // Catch:{ all -> 0x07ee }
            X.AnonymousClass00C.A0D(r14, r4)     // Catch:{ all -> 0x07ee }
            java.lang.String r13 = "screen_sharing_req"
            X.04a r8 = new X.04a     // Catch:{ IllegalStateException -> 0x0289 }
            r8.<init>()     // Catch:{ IllegalStateException -> 0x0289 }
            r7 = 8
            X.7tM r0 = new X.7tM     // Catch:{ IllegalStateException -> 0x0289 }
            r0.<init>(r15, r7)     // Catch:{ IllegalStateException -> 0x0289 }
            X.0sc r0 = r14.A01(r0, r8, r2, r13)     // Catch:{ IllegalStateException -> 0x0289 }
            r15.A02 = r0     // Catch:{ IllegalStateException -> 0x0289 }
            goto L_0x028f
        L_0x0289:
            r7 = move-exception
            java.lang.String r0 = "registerForActivityResult must be called before Activity is in STARTED state"
            X.C18740tg.A08(r0, r7)     // Catch:{ all -> 0x07ee }
        L_0x028f:
            com.whatsapp.calling.screenshare.ScreenShareViewModel r0 = r2.A0q     // Catch:{ all -> 0x07ee }
            X.1hi r7 = r0.A0D     // Catch:{ all -> 0x07ee }
            r0 = 35
            X.C165197t2.A00(r2, r7, r0)     // Catch:{ all -> 0x07ee }
            com.whatsapp.calling.screenshare.ScreenShareViewModel r0 = r2.A0q     // Catch:{ all -> 0x07ee }
            X.1Rs r8 = r0.A0E     // Catch:{ all -> 0x07ee }
            r7 = 5
            X.3Ub r0 = new X.3Ub     // Catch:{ all -> 0x07ee }
            r0.<init>(r2, r7)     // Catch:{ all -> 0x07ee }
            r8.A08(r2, r0)     // Catch:{ all -> 0x07ee }
            com.whatsapp.calling.screenshare.ScreenShareViewModel r0 = r2.A0q     // Catch:{ all -> 0x07ee }
            X.1Rs r7 = r0.A0F     // Catch:{ all -> 0x07ee }
            r0 = 40
            X.C165197t2.A00(r2, r7, r0)     // Catch:{ all -> 0x07ee }
        L_0x02ae:
            X.0yC r7 = r2.A0D     // Catch:{ all -> 0x07ee }
            r0 = 4833(0x12e1, float:6.772E-42)
            int r0 = r7.A07(r0)     // Catch:{ all -> 0x07ee }
            if (r0 < r4) goto L_0x02c6
            X.04H r7 = X.C36441kJ.A0b(r2)     // Catch:{ all -> 0x07ee }
            java.lang.Class<com.whatsapp.contact.picker.viewmodels.CallSuggestionsViewModel> r0 = com.whatsapp.contact.picker.viewmodels.CallSuggestionsViewModel.class
            X.04R r0 = r7.A00(r0)     // Catch:{ all -> 0x07ee }
            com.whatsapp.contact.picker.viewmodels.CallSuggestionsViewModel r0 = (com.whatsapp.contact.picker.viewmodels.CallSuggestionsViewModel) r0     // Catch:{ all -> 0x07ee }
            r2.A2F = r0     // Catch:{ all -> 0x07ee }
        L_0x02c6:
            android.view.Window r0 = r2.getWindow()     // Catch:{ all -> 0x07ee }
            android.view.View r7 = r0.getDecorView()     // Catch:{ all -> 0x07ee }
            android.graphics.Rect r0 = X.AnonymousClass001.A06()     // Catch:{ all -> 0x07ee }
            r7.getWindowVisibleDisplayFrame(r0)     // Catch:{ all -> 0x07ee }
            boolean r0 = r5.isCaller     // Catch:{ all -> 0x07ee }
            if (r0 != 0) goto L_0x0399
            java.lang.String r7 = android.os.Build.MANUFACTURER     // Catch:{ all -> 0x07ee }
            java.lang.String r0 = "asus"
            boolean r0 = r7.equalsIgnoreCase(r0)     // Catch:{ all -> 0x07ee }
            if (r0 == 0) goto L_0x02ed
            java.lang.String r8 = android.os.Build.DEVICE     // Catch:{ all -> 0x07ee }
            java.lang.String r0 = "ASUS_I01WD"
            boolean r0 = r8.equalsIgnoreCase(r0)     // Catch:{ all -> 0x07ee }
            if (r0 != 0) goto L_0x0397
        L_0x02ed:
            java.lang.String r0 = "oppo"
            boolean r0 = r7.equalsIgnoreCase(r0)     // Catch:{ all -> 0x07ee }
            if (r0 == 0) goto L_0x030f
            java.lang.String r8 = android.os.Build.DEVICE     // Catch:{ all -> 0x07ee }
            java.lang.String r0 = "OP4863"
            boolean r0 = r8.equalsIgnoreCase(r0)     // Catch:{ all -> 0x07ee }
            if (r0 != 0) goto L_0x0397
            java.lang.String r0 = "OP4B65L1"
            boolean r0 = r8.equalsIgnoreCase(r0)     // Catch:{ all -> 0x07ee }
            if (r0 != 0) goto L_0x0397
            java.lang.String r0 = "OP4A57"
            boolean r0 = r8.equalsIgnoreCase(r0)     // Catch:{ all -> 0x07ee }
            if (r0 != 0) goto L_0x0397
        L_0x030f:
            java.lang.String r0 = "Realme"
            boolean r0 = r7.equalsIgnoreCase(r0)     // Catch:{ all -> 0x07ee }
            if (r0 == 0) goto L_0x0321
            java.lang.String r8 = android.os.Build.DEVICE     // Catch:{ all -> 0x07ee }
            java.lang.String r0 = "RMX1901"
            boolean r0 = r8.equalsIgnoreCase(r0)     // Catch:{ all -> 0x07ee }
            if (r0 != 0) goto L_0x0397
        L_0x0321:
            java.lang.String r0 = "samsung"
            boolean r0 = r7.equalsIgnoreCase(r0)     // Catch:{ all -> 0x07ee }
            if (r0 == 0) goto L_0x0333
            java.lang.String r8 = android.os.Build.MODEL     // Catch:{ all -> 0x07ee }
            java.lang.String r0 = "r1q"
            boolean r0 = r8.equalsIgnoreCase(r0)     // Catch:{ all -> 0x07ee }
            if (r0 != 0) goto L_0x0397
        L_0x0333:
            java.lang.String r0 = "vivo"
            boolean r0 = r7.equalsIgnoreCase(r0)     // Catch:{ all -> 0x07ee }
            if (r0 == 0) goto L_0x037d
            java.lang.String r8 = android.os.Build.DEVICE     // Catch:{ all -> 0x07ee }
            java.lang.String r0 = "1805"
            boolean r0 = r8.equalsIgnoreCase(r0)     // Catch:{ all -> 0x07ee }
            if (r0 != 0) goto L_0x0397
            java.lang.String r0 = "PD1805"
            boolean r0 = r8.equalsIgnoreCase(r0)     // Catch:{ all -> 0x07ee }
            if (r0 != 0) goto L_0x0397
            java.lang.String r0 = "1909"
            boolean r0 = r8.equalsIgnoreCase(r0)     // Catch:{ all -> 0x07ee }
            if (r0 != 0) goto L_0x0397
            java.lang.String r0 = "1910"
            boolean r0 = r8.equalsIgnoreCase(r0)     // Catch:{ all -> 0x07ee }
            if (r0 != 0) goto L_0x0397
            java.lang.String r0 = "1910N"
            boolean r0 = r8.equalsIgnoreCase(r0)     // Catch:{ all -> 0x07ee }
            if (r0 != 0) goto L_0x0397
            java.lang.String r0 = "1819"
            boolean r0 = r8.equalsIgnoreCase(r0)     // Catch:{ all -> 0x07ee }
            if (r0 != 0) goto L_0x0397
            java.lang.String r0 = "1818"
            boolean r0 = r8.startsWith(r0)     // Catch:{ all -> 0x07ee }
            if (r0 != 0) goto L_0x0397
            java.lang.String r0 = "PD1818"
            boolean r0 = r8.startsWith(r0)     // Catch:{ all -> 0x07ee }
            if (r0 != 0) goto L_0x0397
        L_0x037d:
            java.lang.String r0 = "Xiaomi"
            boolean r0 = r7.equalsIgnoreCase(r0)     // Catch:{ all -> 0x07ee }
            if (r0 == 0) goto L_0x0399
            java.lang.String r7 = android.os.Build.DEVICE     // Catch:{ all -> 0x07ee }
            java.lang.String r0 = "raphaelin"
            boolean r0 = r7.equalsIgnoreCase(r0)     // Catch:{ all -> 0x07ee }
            if (r0 != 0) goto L_0x0397
            java.lang.String r0 = "davinciin"
            boolean r0 = r7.equalsIgnoreCase(r0)     // Catch:{ all -> 0x07ee }
            if (r0 == 0) goto L_0x0399
        L_0x0397:
            r0 = 1
            goto L_0x039a
        L_0x0399:
            r0 = 0
        L_0x039a:
            r2.A2O = r0     // Catch:{ all -> 0x07ee }
            r0 = 2131428697(0x7f0b0559, float:1.8479046E38)
            android.view.View r7 = r2.findViewById(r0)     // Catch:{ all -> 0x07ee }
            r2.A0C = r7     // Catch:{ all -> 0x07ee }
            r0 = 2131428698(0x7f0b055a, float:1.8479048E38)
            android.widget.TextView r0 = X.C36391kE.A0P(r7, r0)     // Catch:{ all -> 0x07ee }
            r2.A0J = r0     // Catch:{ all -> 0x07ee }
            android.view.View r7 = r2.A0C     // Catch:{ all -> 0x07ee }
            r0 = 2131428696(0x7f0b0558, float:1.8479044E38)
            android.view.View r0 = r7.findViewById(r0)     // Catch:{ all -> 0x07ee }
            r2.A0B = r0     // Catch:{ all -> 0x07ee }
            android.view.View r7 = r2.A0C     // Catch:{ all -> 0x07ee }
            r0 = 2131428695(0x7f0b0557, float:1.8479042E38)
            android.view.View r0 = r7.findViewById(r0)     // Catch:{ all -> 0x07ee }
            com.whatsapp.WaTextView r0 = (com.whatsapp.WaTextView) r0     // Catch:{ all -> 0x07ee }
            r2.A0T = r0     // Catch:{ all -> 0x07ee }
            X.C33511fU.A03(r0)     // Catch:{ all -> 0x07ee }
            r0 = 2131234439(0x7f080e87, float:1.8085044E38)
            android.graphics.drawable.Drawable r0 = X.AnonymousClass00E.A00(r2, r0)     // Catch:{ all -> 0x07ee }
            r2.A04 = r0     // Catch:{ all -> 0x07ee }
            r7 = 17
            X.6cl r0 = new X.6cl     // Catch:{ all -> 0x07ee }
            r0.<init>(r2, r7)     // Catch:{ all -> 0x07ee }
            r2.A08 = r0     // Catch:{ all -> 0x07ee }
            r7 = 18
            X.6cl r0 = new X.6cl     // Catch:{ all -> 0x07ee }
            r0.<init>(r2, r7)     // Catch:{ all -> 0x07ee }
            r2.A25 = r0     // Catch:{ all -> 0x07ee }
            r0 = 2131428459(0x7f0b046b, float:1.8478563E38)
            android.view.View r0 = X.C03570Gk.A0B(r2, r0)     // Catch:{ all -> 0x07ee }
            X.1RJ r13 = new X.1RJ     // Catch:{ all -> 0x07ee }
            r13.<init>(r0)     // Catch:{ all -> 0x07ee }
            r2.A1V = r13     // Catch:{ all -> 0x07ee }
            com.whatsapp.voipcalling.CallState r8 = r5.callState     // Catch:{ all -> 0x07ee }
            boolean r7 = r5.isGroupCall     // Catch:{ all -> 0x07ee }
            boolean r0 = r2.A1q     // Catch:{ all -> 0x07ee }
            if (r0 == 0) goto L_0x0404
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.LINK     // Catch:{ all -> 0x07ee }
            if (r8 == r0) goto L_0x0404
            if (r7 != 0) goto L_0x0411
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.RECEIVED_CALL     // Catch:{ all -> 0x07ee }
            if (r8 != r0) goto L_0x0411
        L_0x0404:
            android.view.View r7 = r13.A01()     // Catch:{ all -> 0x07ee }
            com.whatsapp.calling.CallDetailsLayout r7 = (com.whatsapp.calling.CallDetailsLayout) r7     // Catch:{ all -> 0x07ee }
            r2.A0W = r7     // Catch:{ all -> 0x07ee }
            int r0 = r2.A01     // Catch:{ all -> 0x07ee }
            r7.setPadding(r6, r0, r6, r6)     // Catch:{ all -> 0x07ee }
        L_0x0411:
            boolean r0 = r2.A1q     // Catch:{ all -> 0x07ee }
            if (r0 == 0) goto L_0x0430
            r0 = 2131428495(0x7f0b048f, float:1.8478636E38)
            android.view.View r0 = X.C03570Gk.A0B(r2, r0)     // Catch:{ all -> 0x07ee }
            android.view.ViewStub r0 = (android.view.ViewStub) r0     // Catch:{ all -> 0x07ee }
            r0.inflate()     // Catch:{ all -> 0x07ee }
            X.005 r0 = r2.A1e     // Catch:{ all -> 0x07ee }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x07ee }
            X.5yo r0 = (X.C124795yo) r0     // Catch:{ all -> 0x07ee }
            X.00r r7 = r0.A02     // Catch:{ all -> 0x07ee }
            r0 = 38
            X.C165197t2.A00(r2, r7, r0)     // Catch:{ all -> 0x07ee }
        L_0x0430:
            X.0yC r7 = r2.A0D     // Catch:{ all -> 0x07ee }
            r0 = 4624(0x1210, float:6.48E-42)
            boolean r0 = r7.A0E(r0)     // Catch:{ all -> 0x07ee }
            if (r0 == 0) goto L_0x0449
            X.005 r0 = r2.A1c     // Catch:{ all -> 0x07ee }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x07ee }
            X.6rn r0 = (X.C144196rn) r0     // Catch:{ all -> 0x07ee }
            X.00r r7 = r0.A02     // Catch:{ all -> 0x07ee }
            r0 = 28
            X.C165197t2.A00(r2, r7, r0)     // Catch:{ all -> 0x07ee }
        L_0x0449:
            X.0yC r7 = r2.A0D     // Catch:{ all -> 0x07ee }
            r0 = 3321(0xcf9, float:4.654E-42)
            boolean r0 = r7.A0E(r0)     // Catch:{ all -> 0x07ee }
            if (r0 == 0) goto L_0x0455
            X.17Z r0 = X.AnonymousClass17Z.$redex_init_class     // Catch:{ all -> 0x07ee }
        L_0x0455:
            android.view.View r7 = r2.A0A     // Catch:{ all -> 0x07ee }
            r0 = 2131434789(0x7f0b1d25, float:1.8491402E38)
            X.1RJ r0 = X.C36341k9.A0X(r7, r0)     // Catch:{ all -> 0x07ee }
            r2.A1W = r0     // Catch:{ all -> 0x07ee }
            android.view.View r7 = r2.A0A     // Catch:{ all -> 0x07ee }
            r0 = 2131428499(0x7f0b0493, float:1.8478644E38)
            X.1RJ r7 = X.C36341k9.A0X(r7, r0)     // Catch:{ all -> 0x07ee }
            r2.A2H = r7     // Catch:{ all -> 0x07ee }
            boolean r0 = r2.A1q     // Catch:{ all -> 0x07ee }
            if (r0 == 0) goto L_0x04dc
            r7.A03(r6)     // Catch:{ all -> 0x07ee }
        L_0x0472:
            X.04H r7 = X.C36441kJ.A0b(r2)     // Catch:{ all -> 0x07ee }
            java.lang.Class<com.whatsapp.calling.callgrid.viewmodel.InCallBannerViewModel> r0 = com.whatsapp.calling.callgrid.viewmodel.InCallBannerViewModel.class
            X.04R r0 = r7.A00(r0)     // Catch:{ all -> 0x07ee }
            com.whatsapp.calling.callgrid.viewmodel.InCallBannerViewModel r0 = (com.whatsapp.calling.callgrid.viewmodel.InCallBannerViewModel) r0     // Catch:{ all -> 0x07ee }
            r2.A0f = r0     // Catch:{ all -> 0x07ee }
            X.1Rs r7 = r0.A0D     // Catch:{ all -> 0x07ee }
            r0 = 36
            X.C165197t2.A00(r2, r7, r0)     // Catch:{ all -> 0x07ee }
            com.whatsapp.calling.callgrid.viewmodel.InCallBannerViewModel r0 = r2.A0f     // Catch:{ all -> 0x07ee }
            X.1Rs r7 = r0.A0B     // Catch:{ all -> 0x07ee }
            r0 = 45
            X.C165197t2.A00(r2, r7, r0)     // Catch:{ all -> 0x07ee }
            com.whatsapp.calling.callgrid.viewmodel.InCallBannerViewModel r0 = r2.A0f     // Catch:{ all -> 0x07ee }
            X.1Rs r0 = r0.A09     // Catch:{ all -> 0x07ee }
            r11 = 41
            X.C165197t2.A00(r2, r0, r11)     // Catch:{ all -> 0x07ee }
            com.whatsapp.calling.callgrid.viewmodel.InCallBannerViewModel r0 = r2.A0f     // Catch:{ all -> 0x07ee }
            X.1Rs r7 = r0.A0A     // Catch:{ all -> 0x07ee }
            r0 = 42
            X.C165197t2.A00(r2, r7, r0)     // Catch:{ all -> 0x07ee }
            android.view.View r7 = r2.A0A     // Catch:{ all -> 0x07ee }
            r0 = 2131430877(0x7f0b0ddd, float:1.8483467E38)
            android.view.View r10 = X.C012005e.A02(r7, r0)     // Catch:{ all -> 0x07ee }
            com.whatsapp.calling.callgrid.view.VoipInCallNotifBanner r10 = (com.whatsapp.calling.callgrid.view.VoipInCallNotifBanner) r10     // Catch:{ all -> 0x07ee }
            r2.A0d = r10     // Catch:{ all -> 0x07ee }
            com.whatsapp.calling.callgrid.viewmodel.InCallBannerViewModel r8 = r2.A0f     // Catch:{ all -> 0x07ee }
            r10.A04 = r8     // Catch:{ all -> 0x07ee }
            X.1Rs r7 = r8.A0C     // Catch:{ all -> 0x07ee }
            r0 = 40
            X.C165167sz.A00(r2, r7, r10, r0)     // Catch:{ all -> 0x07ee }
            X.1Rs r0 = r8.A08     // Catch:{ all -> 0x07ee }
            X.C165167sz.A00(r2, r0, r10, r11)     // Catch:{ all -> 0x07ee }
            X.1hi r0 = r8.A07     // Catch:{ all -> 0x07ee }
            X.C165167sz.A00(r2, r0, r10, r9)     // Catch:{ all -> 0x07ee }
            r2.A0I()     // Catch:{ all -> 0x07ee }
            r2.A0J()     // Catch:{ all -> 0x07ee }
            com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel r8 = r2.A0e     // Catch:{ all -> 0x07ee }
            int r9 = r2.A01     // Catch:{ all -> 0x07ee }
            int r10 = r2.A1z     // Catch:{ all -> 0x07ee }
            int r11 = r2.A22     // Catch:{ all -> 0x07ee }
            com.whatsapp.calling.callgrid.view.VoipInCallNotifBanner r0 = r2.A0d     // Catch:{ all -> 0x07ee }
            int r12 = r0.getBannerHeight()     // Catch:{ all -> 0x07ee }
            boolean r0 = r2.A2L     // Catch:{ all -> 0x07ee }
            goto L_0x05b0
        L_0x04dc:
            X.1RJ r0 = r2.A1W     // Catch:{ all -> 0x07ee }
            r0.A03(r6)     // Catch:{ all -> 0x07ee }
            r0 = 2131429760(0x7f0b0980, float:1.8481202E38)
            android.widget.TextView r0 = X.C36391kE.A0Q(r2, r0)     // Catch:{ all -> 0x07ee }
            r2.A0K = r0     // Catch:{ all -> 0x07ee }
            r0 = 2131429762(0x7f0b0982, float:1.8481206E38)
            android.widget.ImageView r0 = X.C36411kG.A0Q(r2, r0)     // Catch:{ all -> 0x07ee }
            r2.A27 = r0     // Catch:{ all -> 0x07ee }
            r0 = 2131429756(0x7f0b097c, float:1.8481194E38)
            android.view.View r8 = r2.findViewById(r0)     // Catch:{ all -> 0x07ee }
            r2.A0D = r8     // Catch:{ all -> 0x07ee }
            r7 = 5
            X.6cn r0 = new X.6cn     // Catch:{ all -> 0x07ee }
            r0.<init>(r2, r5, r7)     // Catch:{ all -> 0x07ee }
            r8.setOnClickListener(r0)     // Catch:{ all -> 0x07ee }
            android.view.View r8 = r2.A0D     // Catch:{ all -> 0x07ee }
            boolean r0 = r5.videoEnabled     // Catch:{ all -> 0x07ee }
            if (r0 == 0) goto L_0x058c
            r0 = 2131895917(0x7f12266d, float:1.942668E38)
            java.lang.String r13 = r2.getString(r0)     // Catch:{ all -> 0x07ee }
        L_0x0512:
            X.0yC r7 = r2.A0D     // Catch:{ all -> 0x07ee }
            r0 = 2541(0x9ed, float:3.56E-42)
            boolean r0 = r7.A0E(r0)     // Catch:{ all -> 0x07ee }
            if (r0 == 0) goto L_0x0523
            r0 = 2131895916(0x7f12266c, float:1.9426679E38)
            java.lang.String r12 = r2.getString(r0)     // Catch:{ all -> 0x07ee }
        L_0x0523:
            X.AnonymousClass3UE.A07(r8, r13, r12, r4)     // Catch:{ all -> 0x07ee }
            android.view.View r7 = r2.A0A     // Catch:{ all -> 0x07ee }
            r0 = 2131434797(0x7f0b1d2d, float:1.8491418E38)
            android.widget.ImageButton r0 = X.C90514aH.A0T(r7, r0)     // Catch:{ all -> 0x07ee }
            r2.A0H = r0     // Catch:{ all -> 0x07ee }
            android.view.View r7 = r2.A0A     // Catch:{ all -> 0x07ee }
            r0 = 2131434786(0x7f0b1d22, float:1.8491396E38)
            android.view.ViewGroup r0 = X.C36411kG.A0O(r7, r0)     // Catch:{ all -> 0x07ee }
            r2.A0G = r0     // Catch:{ all -> 0x07ee }
            android.view.View r7 = r2.A0A     // Catch:{ all -> 0x07ee }
            r0 = 2131427596(0x7f0b010c, float:1.8476813E38)
            android.widget.ImageView r0 = X.C36401kF.A0G(r7, r0)     // Catch:{ all -> 0x07ee }
            r2.A0I = r0     // Catch:{ all -> 0x07ee }
            android.view.View r7 = r2.A0A     // Catch:{ all -> 0x07ee }
            r0 = 2131427595(0x7f0b010b, float:1.847681E38)
            android.widget.TextView r0 = X.C36391kE.A0O(r7, r0)     // Catch:{ all -> 0x07ee }
            r2.A0L = r0     // Catch:{ all -> 0x07ee }
            boolean r0 = X.C222013h.A07     // Catch:{ all -> 0x07ee }
            if (r0 == 0) goto L_0x0568
            X.0wG r0 = r2.A1B     // Catch:{ all -> 0x07ee }
            android.content.res.Resources r7 = X.C36421kH.A0B(r0)     // Catch:{ all -> 0x07ee }
            r0 = 2131169057(0x7f070f21, float:1.7952433E38)
            int r7 = r7.getDimensionPixelSize(r0)     // Catch:{ all -> 0x07ee }
            android.widget.ImageView r0 = r2.A0I     // Catch:{ all -> 0x07ee }
            r0.setPadding(r6, r7, r6, r7)     // Catch:{ all -> 0x07ee }
        L_0x0568:
            android.widget.ImageButton r7 = r2.A0H     // Catch:{ all -> 0x07ee }
            android.view.View$OnClickListener r0 = r2.A2Q     // Catch:{ all -> 0x07ee }
            r7.setOnClickListener(r0)     // Catch:{ all -> 0x07ee }
            android.widget.ImageButton r8 = r2.A0H     // Catch:{ all -> 0x07ee }
            r0 = 2131895970(0x7f1226a2, float:1.9426788E38)
            java.lang.String r7 = r2.getString(r0)     // Catch:{ all -> 0x07ee }
            r0 = 2131895969(0x7f1226a1, float:1.9426786E38)
            java.lang.String r0 = r2.getString(r0)     // Catch:{ all -> 0x07ee }
            X.AnonymousClass3UE.A07(r8, r7, r0, r4)     // Catch:{ all -> 0x07ee }
            android.view.ViewGroup r7 = r2.A0G     // Catch:{ all -> 0x07ee }
            r0 = 19
            X.C36351kA.A1E(r7, r2, r0)     // Catch:{ all -> 0x07ee }
            com.whatsapp.jid.GroupJid r0 = r5.groupJid     // Catch:{ all -> 0x07ee }
            goto L_0x0595
        L_0x058c:
            r0 = 2131895919(0x7f12266f, float:1.9426685E38)
            java.lang.String r13 = r2.getString(r0)     // Catch:{ all -> 0x07ee }
            goto L_0x0512
        L_0x0595:
            boolean r0 = X.AnonymousClass000.A1V(r0)
            r2.A1K(r0)     // Catch:{ all -> 0x07ee }
            if (r16 == 0) goto L_0x0472
            X.11e r8 = r2.A02     // Catch:{ all -> 0x07ee }
            X.1RJ r0 = r2.A1W     // Catch:{ all -> 0x07ee }
            android.view.View r7 = r0.A01()     // Catch:{ all -> 0x07ee }
            X.72p r0 = new X.72p     // Catch:{ all -> 0x07ee }
            r0.<init>(r2, r9)     // Catch:{ all -> 0x07ee }
            r8.A05(r7, r0, r10, r11)     // Catch:{ all -> 0x07ee }
            goto L_0x0472
        L_0x05b0:
            boolean r13 = X.AnonymousClass000.A1Q(r0)
            X.64k r7 = new X.64k     // Catch:{ all -> 0x07ee }
            r7.<init>(r8, r9, r10, r11, r12, r13)     // Catch:{ all -> 0x07ee }
            r2.A0c = r7     // Catch:{ all -> 0x07ee }
            r0 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r0 = r2.findViewById(r0)     // Catch:{ all -> 0x07ee }
            r2.A26 = r0     // Catch:{ all -> 0x07ee }
            r0 = 2131435126(0x7f0b1e76, float:1.8492085E38)
            android.widget.ImageView r0 = X.C36411kG.A0Q(r2, r0)     // Catch:{ all -> 0x07ee }
            r2.A28 = r0     // Catch:{ all -> 0x07ee }
            r2.A0M()     // Catch:{ all -> 0x07ee }
            X.0yC r7 = r2.A0D     // Catch:{ all -> 0x07ee }
            r0 = 5341(0x14dd, float:7.484E-42)
            boolean r0 = r7.A0E(r0)     // Catch:{ all -> 0x07ee }
            if (r0 == 0) goto L_0x0610
            java.util.List r0 = X.AnonymousClass6T1.A0F     // Catch:{ all -> 0x07ee }
            X.0yb r12 = r2.A08     // Catch:{ all -> 0x07ee }
            X.0ts r11 = r2.A00     // Catch:{ all -> 0x07ee }
            X.0wo r10 = r2.A07     // Catch:{ all -> 0x07ee }
            X.0yC r9 = r2.A0D     // Catch:{ all -> 0x07ee }
            X.13J r8 = r2.A1U     // Catch:{ all -> 0x07ee }
            X.1Pa r7 = r2.A0Z     // Catch:{ all -> 0x07ee }
            androidx.lifecycle.LifecycleCoroutineScopeImpl r26 = X.C33311f5.A00(r2)     // Catch:{ all -> 0x07ee }
            X.6T1 r0 = new X.6T1     // Catch:{ all -> 0x07ee }
            r18 = r0
            r19 = r2
            r20 = r7
            r21 = r12
            r22 = r10
            r23 = r11
            r24 = r9
            r25 = r8
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26)     // Catch:{ all -> 0x07ee }
            r2.A0t = r0     // Catch:{ all -> 0x07ee }
            X.00s r7 = r0.A04     // Catch:{ all -> 0x07ee }
            r0 = 30
            X.C165197t2.A00(r2, r7, r0)     // Catch:{ all -> 0x07ee }
            X.6T1 r7 = r2.A0t     // Catch:{ all -> 0x07ee }
            android.view.View r0 = r2.A26     // Catch:{ all -> 0x07ee }
            r7.A01 = r0     // Catch:{ all -> 0x07ee }
        L_0x0610:
            android.content.Intent r7 = r2.getIntent()     // Catch:{ all -> 0x07ee }
            r2.setIntent(r7)     // Catch:{ all -> 0x07ee }
            java.lang.String r0 = "callAccepted"
            boolean r0 = r7.getBooleanExtra(r0, r6)     // Catch:{ all -> 0x07ee }
            r2.A1m = r0     // Catch:{ all -> 0x07ee }
            java.lang.StringBuilder r6 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x07ee }
            java.lang.String r0 = "voip/VoipActivityV2/create intent: "
            r6.append(r0)     // Catch:{ all -> 0x07ee }
            r6.append(r7)     // Catch:{ all -> 0x07ee }
            java.lang.String r0 = ", call info: "
            X.C36321k7.A1K(r5, r0, r6)     // Catch:{ all -> 0x07ee }
            r0 = 8
            X.7p5 r6 = new X.7p5     // Catch:{ all -> 0x07ee }
            r6.<init>(r2, r0)     // Catch:{ all -> 0x07ee }
            r2.A2D = r6     // Catch:{ all -> 0x07ee }
            X.16I r0 = r2.A13     // Catch:{ all -> 0x07ee }
            r0.registerObserver(r6)     // Catch:{ all -> 0x07ee }
            r0 = 10
            X.7qm r6 = new X.7qm     // Catch:{ all -> 0x07ee }
            r6.<init>(r2, r0)     // Catch:{ all -> 0x07ee }
            android.os.Handler r0 = new android.os.Handler     // Catch:{ all -> 0x07ee }
            r0.<init>(r6)     // Catch:{ all -> 0x07ee }
            r2.A05 = r0     // Catch:{ all -> 0x07ee }
            android.view.Window r0 = r2.getWindow()     // Catch:{ all -> 0x07ee }
            X.C24801Dv.A04(r0)     // Catch:{ all -> 0x07ee }
            java.lang.String r6 = r7.getAction()     // Catch:{ all -> 0x07ee }
            java.lang.String r0 = X.C114145gi.A08     // Catch:{ all -> 0x07ee }
            boolean r0 = r0.equals(r6)     // Catch:{ all -> 0x07ee }
            if (r0 == 0) goto L_0x0692
            java.lang.String r0 = r7.getAction()     // Catch:{ all -> 0x07ee }
            r2.A0x(r5, r0)     // Catch:{ all -> 0x07ee }
        L_0x0666:
            X.1Pm r4 = r2.A1Y     // Catch:{ all -> 0x07ee }
            X.1NK r0 = r2.A2S     // Catch:{ all -> 0x07ee }
            r4.registerObserver(r0)     // Catch:{ all -> 0x07ee }
            X.1NF r5 = r2.A0o     // Catch:{ all -> 0x07ee }
            java.lang.String r4 = r2.A1i     // Catch:{ all -> 0x07ee }
            java.lang.String r0 = "voipactivity_oncreate_done"
            r5.A03(r4, r0)     // Catch:{ all -> 0x07ee }
            X.04H r4 = X.C36441kJ.A0b(r2)     // Catch:{ all -> 0x07ee }
            java.lang.Class<com.whatsapp.calling.callheader.viewmodel.CallHeaderViewModel> r0 = com.whatsapp.calling.callheader.viewmodel.CallHeaderViewModel.class
            X.04R r0 = r4.A00(r0)     // Catch:{ all -> 0x07ee }
            com.whatsapp.calling.callheader.viewmodel.CallHeaderViewModel r0 = (com.whatsapp.calling.callheader.viewmodel.CallHeaderViewModel) r0     // Catch:{ all -> 0x07ee }
            r2.A2B = r0     // Catch:{ all -> 0x07ee }
            X.00s r4 = r0.A02     // Catch:{ all -> 0x07ee }
            r0 = 27
            X.C165197t2.A00(r2, r4, r0)     // Catch:{ all -> 0x07ee }
            X.004 r0 = r2.A1j     // Catch:{ all -> 0x07ee }
            boolean r0 = X.C90474aD.A1X(r0)     // Catch:{ all -> 0x07ee }
            goto L_0x06b8
        L_0x0692:
            r0 = r17
            boolean r0 = r0.equals(r6)     // Catch:{ all -> 0x07ee }
            if (r0 == 0) goto L_0x069e
            r2.A0i(r7, r5)     // Catch:{ all -> 0x07ee }
            goto L_0x0666
        L_0x069e:
            java.lang.String r0 = "com.whatsapp.intent.action.SHOW_ALERT_MESSAGE_IN_ACTIVE_CALL"
            boolean r0 = r0.equals(r6)     // Catch:{ all -> 0x07ee }
            if (r0 == 0) goto L_0x06aa
            r2.A0j(r7, r5)     // Catch:{ all -> 0x07ee }
            goto L_0x0666
        L_0x06aa:
            java.lang.String r0 = X.C114145gi.A07     // Catch:{ all -> 0x07ee }
            boolean r0 = r0.equals(r6)     // Catch:{ all -> 0x07ee }
            if (r0 == 0) goto L_0x0666
            r2.A1n = r4     // Catch:{ all -> 0x07ee }
            A0v(r5, r2)     // Catch:{ all -> 0x07ee }
            goto L_0x0666
        L_0x06b8:
            if (r0 == 0) goto L_0x06c7
            int r0 = X.C36341k9.A04(r2)     // Catch:{ all -> 0x07ee }
            if (r0 != r3) goto L_0x06c7
            android.content.res.Configuration r0 = X.AnonymousClass000.A0U(r2)     // Catch:{ all -> 0x07ee }
            r2.onConfigurationChanged(r0)     // Catch:{ all -> 0x07ee }
        L_0x06c7:
            if (r16 == 0) goto L_0x06ce
            X.11e r0 = r2.A02
            r0.A08(r1)
        L_0x06ce:
            android.view.View r1 = r2.A00
            X.17Y r0 = r2.A05
            r2.A2O(r1, r0)
            return
        L_0x06d6:
            android.content.Intent r3 = r2.getIntent()     // Catch:{ all -> 0x07ee }
            java.lang.String r0 = "joinable"
            boolean r0 = r3.getBooleanExtra(r0, r6)     // Catch:{ all -> 0x07ee }
            if (r0 == 0) goto L_0x0705
            java.lang.String r0 = r2.A1i     // Catch:{ all -> 0x07ee }
            if (r0 != 0) goto L_0x06eb
            r2.finish()     // Catch:{ all -> 0x07ee }
            goto L_0x07e6
        L_0x06eb:
            X.7gF r5 = r2.A2R     // Catch:{ all -> 0x07ee }
            X.1HJ r3 = r2.A1F     // Catch:{ all -> 0x07ee }
            X.1hO r0 = r2.A0z     // Catch:{ all -> 0x07ee }
            X.5M6 r7 = new X.5M6     // Catch:{ all -> 0x07ee }
            r7.<init>(r5, r0, r3)     // Catch:{ all -> 0x07ee }
            r2.A0i = r7     // Catch:{ all -> 0x07ee }
            X.0wU r5 = r2.A04     // Catch:{ all -> 0x07ee }
            java.lang.String[] r3 = new java.lang.String[r4]     // Catch:{ all -> 0x07ee }
            java.lang.String r0 = r2.A1i     // Catch:{ all -> 0x07ee }
            r3[r6] = r0     // Catch:{ all -> 0x07ee }
            r5.Box(r7, r3)     // Catch:{ all -> 0x07ee }
            goto L_0x07e6
        L_0x0705:
            r2.finish()     // Catch:{ all -> 0x07ee }
            android.content.Intent r3 = r2.getIntent()     // Catch:{ all -> 0x07ee }
            java.lang.String r0 = "fromCallNotification"
            boolean r0 = r3.getBooleanExtra(r0, r6)     // Catch:{ all -> 0x07ee }
            if (r0 == 0) goto L_0x076d
            X.1gO r0 = r2.A1N     // Catch:{ all -> 0x07ee }
            r0.A02()     // Catch:{ all -> 0x07ee }
            java.lang.Class<com.whatsapp.jid.UserJid> r5 = com.whatsapp.jid.UserJid.class
            android.content.Intent r3 = r2.getIntent()     // Catch:{ all -> 0x07ee }
            java.lang.String r0 = "jid"
            java.util.ArrayList r0 = X.C36401kF.A0u(r3, r5, r0)     // Catch:{ all -> 0x07ee }
            java.util.ArrayList r7 = X.AnonymousClass001.A0I()     // Catch:{ all -> 0x07ee }
            java.util.Iterator r5 = r0.iterator()     // Catch:{ all -> 0x07ee }
        L_0x072d:
            boolean r0 = r5.hasNext()     // Catch:{ all -> 0x07ee }
            if (r0 == 0) goto L_0x0741
            com.whatsapp.jid.UserJid r3 = X.C36441kJ.A0o(r5)     // Catch:{ all -> 0x07ee }
            X.16D r0 = r2.A12     // Catch:{ all -> 0x07ee }
            X.141 r0 = r0.A0D(r3)     // Catch:{ all -> 0x07ee }
            r7.add(r0)     // Catch:{ all -> 0x07ee }
            goto L_0x072d
        L_0x0741:
            int r0 = r7.size()     // Catch:{ all -> 0x07ee }
            if (r0 <= 0) goto L_0x075c
            int r0 = r7.size()     // Catch:{ all -> 0x07ee }
            int r0 = r0 - r4
            java.lang.Object r0 = r7.get(r0)     // Catch:{ all -> 0x07ee }
            X.141 r0 = (X.AnonymousClass141) r0     // Catch:{ all -> 0x07ee }
            X.11F r4 = r0.A0H     // Catch:{ all -> 0x07ee }
            if (r4 == 0) goto L_0x075c
            X.1NM r3 = r2.A1A     // Catch:{ all -> 0x07ee }
            r0 = 3
            r3.A0B(r4, r0)     // Catch:{ all -> 0x07ee }
        L_0x075c:
            X.1ND r5 = r2.A0j     // Catch:{ all -> 0x07ee }
            r4 = 5
            android.content.Intent r3 = r2.getIntent()     // Catch:{ all -> 0x07ee }
            java.lang.String r0 = "video_call"
            boolean r0 = r3.getBooleanExtra(r0, r6)     // Catch:{ all -> 0x07ee }
            r5.Bub(r2, r7, r4, r0)     // Catch:{ all -> 0x07ee }
            goto L_0x07e6
        L_0x076d:
            android.content.Intent r0 = r2.getIntent()     // Catch:{ all -> 0x07ee }
            java.lang.String r3 = r0.getAction()     // Catch:{ all -> 0x07ee }
            java.lang.String r0 = X.C114145gi.A04     // Catch:{ all -> 0x07ee }
            boolean r0 = X.C1901797e.A00(r3, r0)     // Catch:{ all -> 0x07ee }
            if (r0 == 0) goto L_0x07af
            android.content.Intent r5 = r2.getIntent()     // Catch:{ all -> 0x07ee }
            java.lang.String r0 = "scheduled_call_row_id"
            r3 = -1
            long r8 = r5.getLongExtra(r0, r3)     // Catch:{ all -> 0x07ee }
            android.content.Intent r3 = r2.getIntent()     // Catch:{ all -> 0x07ee }
            java.lang.String r0 = "group_jid"
            java.lang.String r3 = r3.getStringExtra(r0)     // Catch:{ all -> 0x07ee }
            X.6SZ r0 = com.whatsapp.jid.GroupJid.Companion     // Catch:{ all -> 0x07ee }
            com.whatsapp.jid.GroupJid r6 = r0.A02(r3)     // Catch:{ all -> 0x07ee }
            r3 = 0
            int r0 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x07e6
            if (r6 == 0) goto L_0x07e6
            X.0wU r3 = r2.A04     // Catch:{ all -> 0x07ee }
            r7 = 7
            X.735 r0 = new X.735     // Catch:{ all -> 0x07ee }
            r4 = r0
            r5 = r2
            r4.<init>(r5, r6, r7, r8)     // Catch:{ all -> 0x07ee }
            r3.Bp1(r0)     // Catch:{ all -> 0x07ee }
            goto L_0x07e6
        L_0x07af:
            java.lang.String r0 = "voip/VoipActivityV2/create/call_not_active"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x07ee }
            android.content.Intent r3 = r2.getIntent()     // Catch:{ all -> 0x07ee }
            java.lang.String r0 = "fgservice_start_failed"
            boolean r0 = r3.getBooleanExtra(r0, r6)     // Catch:{ all -> 0x07ee }
            if (r0 == 0) goto L_0x07e6
            X.2OC r3 = new X.2OC     // Catch:{ all -> 0x07ee }
            r3.<init>()     // Catch:{ all -> 0x07ee }
            java.lang.String r0 = "voip_call_lobby_open_fail_fgservice_restriction"
            r3.A00 = r0     // Catch:{ all -> 0x07ee }
            java.lang.String r0 = X.C114145gi.A00     // Catch:{ all -> 0x07ee }
            boolean r0 = X.C90484aE.A1R(r2, r0)     // Catch:{ all -> 0x07ee }
            if (r0 != 0) goto L_0x07e3
            java.lang.String r0 = "join_call"
            boolean r0 = X.C90484aE.A1R(r2, r0)     // Catch:{ all -> 0x07ee }
            if (r0 != 0) goto L_0x07e3
            java.lang.String r0 = "false"
        L_0x07db:
            r3.A01 = r0     // Catch:{ all -> 0x07ee }
            X.0yW r0 = r2.A1K     // Catch:{ all -> 0x07ee }
            r0.Bly(r3)     // Catch:{ all -> 0x07ee }
            goto L_0x07e6
        L_0x07e3:
            java.lang.String r0 = "true"
            goto L_0x07db
        L_0x07e6:
            if (r16 == 0) goto L_0x07ed
            X.11e r0 = r2.A02
            r0.A08(r1)
        L_0x07ed:
            return
        L_0x07ee:
            r3 = move-exception
            if (r16 == 0) goto L_0x07f6
            X.11e r0 = r2.A02
            r0.A08(r1)
        L_0x07f6:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.VoipActivityV2.onCreate(android.os.Bundle):void");
    }

    public Dialog onCreateDialog(int i) {
        AnonymousClass0FM A1b2;
        ContactPickerFragment contactPickerFragment = this.A17;
        if (contactPickerFragment == null || (A1b2 = contactPickerFragment.A1b(i)) == null) {
            return super.onCreateDialog(i);
        }
        return A1b2;
    }

    public void onGlobalLayout() {
        if (this.A26.getWidth() != this.A24 || this.A26.getHeight() != this.A23) {
            StringBuilder A0u2 = AnonymousClass000.A0u();
            A0u2.append("voip/VoipActivityV2/onGlobalLayout size: ");
            C90494aF.A1L(A0u2, this.A26.getWidth());
            A0u2.append(this.A26.getHeight());
            A0u2.append(", orientation: ");
            C36321k7.A1Y(A0u2, C36341k9.A04(this));
            this.A24 = this.A26.getWidth();
            this.A23 = this.A26.getHeight();
            this.A0k.onGlobalLayout();
            CallInfo A012 = A01(this);
            A0u(A012, this);
            if (!this.A1v || A012 == null || !A012.videoEnabled) {
                CallGrid callGrid = this.A2A;
                callGrid.A05.A06();
                callGrid.A06.A06();
            } else {
                this.A1b.updateCameraPreviewOrientation();
            }
            Log.i("voip/VoipActivityV2/onGlobalLayout/end");
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (this.A17 == null || menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        this.A17.A1e();
        A0z(this);
        return true;
    }

    public void onRestart() {
        if (!this.A1q && this.A0D.A0E(1807)) {
            this.A02.A06(this.A1W.A01(), new C1497472p(this, 40), "VoipActivityV2", 4);
        }
        super.onRestart();
    }

    public void onSaveInstanceState(Bundle bundle) {
        A3p(C108255Su.SAVE_INSTANCE_STATE);
        super.onSaveInstanceState(bundle);
    }

    public boolean onSearchRequested(SearchEvent searchEvent) {
        ContactPickerFragment contactPickerFragment = this.A17;
        if (contactPickerFragment == null) {
            return false;
        }
        contactPickerFragment.A1h();
        return true;
    }

    public void onUserLeaveHint() {
        ScreenShareViewModel screenShareViewModel;
        Log.i("voip/VoipActivityV2/onUserLeaveHint");
        if (this.A17 != null || (((screenShareViewModel = this.A0q) != null && screenShareViewModel.A05) || !A1S(this) || !A1O(A01(this), this))) {
            this.A1u = false;
            CallInfo A012 = A01(this);
            if (A012 != null && A012.callState == CallState.PRECALLING) {
                A10(this);
            }
        }
    }

    public void recreate() {
        if (this.A00 == 3) {
            super.recreate();
        }
    }

    public static CallInfo A01(VoipActivityV2 voipActivityV2) {
        if (Voip.A08()) {
            CallLinkInfo callLinkInfo = Voip.getCallLinkInfo();
            if (callLinkInfo != null) {
                return CallInfo.convertCallLinkInfoToCallInfo(callLinkInfo);
            }
            return null;
        }
        CallInfo B9F = voipActivityV2.A0Y.B9F();
        if (B9F == null) {
            return null;
        }
        String str = voipActivityV2.A1i;
        if (str == null || !C90514aH.A1X(B9F, str)) {
            return B9F;
        }
        return CallInfo.convertCallWaitingInfoToCallInfo(B9F);
    }

    private void A0G() {
        AnonymousClass02E A0N2 = getSupportFragmentManager().A0N("permission_request");
        if (A0N2 != null) {
            AnonymousClass09Y A0O2 = C36341k9.A0O(this);
            A0O2.A08(A0N2);
            A0O2.A04();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x007f, code lost:
        if (r1 == 1) goto L_0x0081;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00b3, code lost:
        if (com.whatsapp.voipcalling.Voip.A09(r4.callState) == false) goto L_0x00b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001e, code lost:
        if (r9.A1m != false) goto L_0x0020;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A0M() {
        /*
            r9 = this;
            X.C18740tg.A01()
            com.whatsapp.voipcalling.CallInfo r4 = A01(r9)
            if (r4 == 0) goto L_0x00dd
            com.whatsapp.voipcalling.CallState r1 = r4.callState
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.NONE
            if (r1 == r0) goto L_0x00dd
            com.whatsapp.voipcalling.CallState r6 = r9.A07(r4)
            boolean r0 = r4.isEitherSideRequestingUpgrade()
            r3 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0020
            boolean r0 = r9.A1m
            r8 = 1
            if (r0 == 0) goto L_0x0021
        L_0x0020:
            r8 = 0
        L_0x0021:
            boolean r0 = r4.videoEnabled
            r5 = 8
            if (r0 == 0) goto L_0x00f1
            r0 = 2131896051(0x7f1226f3, float:1.9426952E38)
            r9.setTitle(r0)
            java.lang.String r1 = r9.getString(r0)
            android.app.ActivityManager$TaskDescription r0 = new android.app.ActivityManager$TaskDescription
            r0.<init>(r1)
            r9.setTaskDescription(r0)
            com.whatsapp.contact.picker.ContactPickerFragment r0 = r9.A17
            if (r0 != 0) goto L_0x0059
            android.view.Window r1 = r9.getWindow()
            r0 = 2131102402(0x7f060ac2, float:1.781724E38)
            int r0 = X.AnonymousClass00F.A00(r9, r0)
            r1.setStatusBarColor(r0)
            android.view.Window r1 = r9.getWindow()
            r0 = 2131099848(0x7f0600c8, float:1.781206E38)
            int r0 = X.AnonymousClass00F.A00(r9, r0)
            r1.setNavigationBarColor(r0)
        L_0x0059:
            android.view.View r0 = r9.A0A
            r0.setBackgroundResource(r2)
            com.whatsapp.WaImageView r0 = r9.A0S
            if (r0 == 0) goto L_0x0065
            r0.setVisibility(r5)
        L_0x0065:
            boolean r0 = r9.A1q
            if (r0 != 0) goto L_0x006c
            r9.A0q(r4)
        L_0x006c:
            boolean r0 = r4.isGroupCall
            boolean r0 = A1R(r6, r9, r0)
            if (r0 == 0) goto L_0x0085
            com.whatsapp.calling.CallDetailsLayout r7 = r9.A0W
            boolean r5 = r7.A06(r4)
            int r1 = r9.A00
            if (r1 == 0) goto L_0x0081
            r0 = 0
            if (r1 != r3) goto L_0x0082
        L_0x0081:
            r0 = 1
        L_0x0082:
            r7.A04(r6, r5, r0)
        L_0x0085:
            r0 = 2131435120(0x7f0b1e70, float:1.8492073E38)
            android.view.View r1 = r9.findViewById(r0)
            if (r8 != 0) goto L_0x009a
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.ACTIVE
            if (r6 != r0) goto L_0x009a
            boolean r0 = r4.isInLonelyState()
            if (r0 != 0) goto L_0x009a
            r2 = 8
        L_0x009a:
            r1.setVisibility(r2)
            com.whatsapp.voipcalling.VoipCallControlBottomSheetV2 r0 = r9.A1a
            if (r0 == 0) goto L_0x00a8
            com.whatsapp.calling.views.VoipCallFooter r0 = r0.A0U
            if (r0 == 0) goto L_0x00a8
            r0.A02()
        L_0x00a8:
            boolean r0 = r4.isCaller
            if (r0 != 0) goto L_0x00b5
            com.whatsapp.voipcalling.CallState r0 = r4.callState
            boolean r1 = com.whatsapp.voipcalling.Voip.A09(r0)
            r0 = 1
            if (r1 != 0) goto L_0x00b6
        L_0x00b5:
            r0 = 0
        L_0x00b6:
            r2 = 128(0x80, float:1.794E-43)
            if (r0 != 0) goto L_0x00ca
            boolean r1 = X.C34681hT.A0T(r4)
            if (r1 == 0) goto L_0x00de
            boolean r0 = r4.videoEnabled
            if (r0 != 0) goto L_0x00ca
            boolean r0 = X.AnonymousClass6YG.A08()
            if (r0 == 0) goto L_0x00de
        L_0x00ca:
            android.view.Window r0 = r9.getWindow()
            r0.addFlags(r2)
        L_0x00d1:
            X.004 r0 = r9.A1j
            boolean r0 = X.C90474aD.A1X(r0)
            if (r0 == 0) goto L_0x00da
            r3 = 2
        L_0x00da:
            r9.setRequestedOrientation(r3)
        L_0x00dd:
            return
        L_0x00de:
            if (r1 == 0) goto L_0x00e9
            boolean r0 = r4.videoEnabled
            if (r0 != 0) goto L_0x00e9
            boolean r0 = r4.isGroupCall
            if (r0 == 0) goto L_0x00e9
            goto L_0x00ca
        L_0x00e9:
            android.view.Window r0 = r9.getWindow()
            r0.clearFlags(r2)
            goto L_0x00d1
        L_0x00f1:
            r0 = 2131895866(0x7f12263a, float:1.9426577E38)
            r9.setTitle(r0)
            java.lang.String r1 = r9.getString(r0)
            android.app.ActivityManager$TaskDescription r0 = new android.app.ActivityManager$TaskDescription
            r0.<init>(r1)
            r9.setTaskDescription(r0)
            com.whatsapp.contact.picker.ContactPickerFragment r0 = r9.A17
            if (r0 != 0) goto L_0x0123
            android.view.Window r1 = r9.getWindow()
            r0 = 2131102402(0x7f060ac2, float:1.781724E38)
            int r0 = X.AnonymousClass00F.A00(r9, r0)
            r1.setStatusBarColor(r0)
            android.view.Window r1 = r9.getWindow()
            r0 = 2131102491(0x7f060b1b, float:1.7817421E38)
            int r0 = X.AnonymousClass00F.A00(r9, r0)
            r1.setNavigationBarColor(r0)
        L_0x0123:
            boolean r0 = r9.A1q
            if (r0 != 0) goto L_0x012a
            r9.A0q(r4)
        L_0x012a:
            A0y(r9)
            boolean r0 = r4.isGroupCall
            boolean r0 = A1R(r6, r9, r0)
            if (r0 == 0) goto L_0x015f
            com.whatsapp.calling.CallDetailsLayout r1 = r9.A0W
            boolean r0 = r1.A06(r4)
            com.whatsapp.calling.CallDetailsLayout.A01(r1, r6, r0)
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.ACTIVE
            if (r6 == r0) goto L_0x01c0
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.CONNECTED_LONELY
            if (r6 == r0) goto L_0x01c0
            int r0 = r1.A01
            r1.setBackgroundColor(r0)
            r1.setVisibility(r2)
            r0 = 1065353216(0x3f800000, float:1.0)
            r1.setAlpha(r0)
            X.3SF r0 = r1.A06
            com.whatsapp.TextEmojiLabel r0 = r0.A01
            r0.setVisibility(r2)
            android.widget.TextView r0 = r1.A03
            r0.setVisibility(r2)
        L_0x015f:
            r0 = 2131435120(0x7f0b1e70, float:1.8492073E38)
            X.C36341k9.A13(r9, r0, r5)
            android.widget.ImageView r0 = r9.A28
            r0.setVisibility(r5)
            com.whatsapp.calling.callgrid.view.CallGrid r0 = r9.A2A
            X.C18740tg.A04(r0)
            r0.setVisibility(r2)
            boolean r0 = r9.A1q
            if (r0 != 0) goto L_0x0182
            X.1RJ r0 = r9.A1W
            android.view.View r1 = r0.A01()
            r0 = 2131102402(0x7f060ac2, float:1.781724E38)
            r1.setBackgroundResource(r0)
        L_0x0182:
            android.view.View r1 = r9.A0A
            r0 = 2131102492(0x7f060b1c, float:1.7817423E38)
            r1.setBackgroundResource(r0)
            com.whatsapp.WaImageView r0 = r9.A0S
            if (r0 == 0) goto L_0x0191
            r0.setVisibility(r2)
        L_0x0191:
            r9.A1x = r3
            com.whatsapp.voipcalling.VoipCallControlBottomSheetV2 r0 = r9.A1a
            if (r0 == 0) goto L_0x00a8
            com.whatsapp.calling.views.VoipCallFooter r0 = r0.A0U
            if (r0 == 0) goto L_0x00a8
            r0.A01()
            boolean r0 = A1T(r9)
            if (r0 == 0) goto L_0x00a8
            X.0yC r0 = r9.A0D
            boolean r0 = X.C34681hT.A0G(r0)
            if (r0 == 0) goto L_0x00a8
            com.whatsapp.voipcalling.VoipCallControlBottomSheetV2 r1 = r9.A1a
            com.whatsapp.calling.views.VoipCallControlBottomSheetDragIndicator r0 = r1.A0T
            if (r0 == 0) goto L_0x01b5
            r0.setVisibility(r5)
        L_0x01b5:
            X.6X3 r0 = r1.A0L
            if (r0 == 0) goto L_0x00a8
            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = r0.A0G
            r0.A0b(r2)
            goto L_0x00a8
        L_0x01c0:
            r1.setVisibility(r5)
            goto L_0x015f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.VoipActivityV2.A0M():void");
    }

    public static void A0k(Rational rational, VoipActivityV2 voipActivityV2) {
        if (A1S(voipActivityV2)) {
            PictureInPictureParams.Builder builder = voipActivityV2.A03;
            C18740tg.A07(builder, "PiP Params Builder is null");
            builder.setAspectRatio(rational);
            if (voipActivityV2.A1r) {
                voipActivityV2.setPictureInPictureParams(voipActivityV2.A03.build());
            }
        }
    }

    public static void A0o(UserJid userJid, VoipActivityV2 voipActivityV2, boolean z) {
        AnonymousClass6YM r0;
        CallInfo A012 = A01(voipActivityV2);
        if (A012 != null && A012.callState != CallState.NONE && (r0 = voipActivityV2.A0r) != null) {
            r0.A0Y(userJid, A012, z);
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x01a9, code lost:
        if (r0 != false) goto L_0x01ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x01bb, code lost:
        if (r0 != false) goto L_0x01bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x01d3, code lost:
        if (X.C110325aU.A00(r9.participants) == 2) goto L_0x018e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x0237, code lost:
        r8 = X.C36391kE.A0v(r10, X.C36381kD.A0u(r10.A12, r10.A15, X.C90494aF.A0M(r9)), new java.lang.Object[1], 0, com.whatsapp.R.string.f12nameremoved);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x0252, code lost:
        if (r0 != false) goto L_0x0254;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x0254, code lost:
        r1 = com.whatsapp.R.string.f12nameremoved;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x025b, code lost:
        r8 = r10.getString(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x025f, code lost:
        r1 = null;
        r5 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x005d, code lost:
        r0 = r10.A0W;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x005f, code lost:
        if (r1 != null) goto L_0x0062;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0061, code lost:
        r1 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0062, code lost:
        r0.A05(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0065, code lost:
        r10.A0W.A0H.A03(8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x007e, code lost:
        if (r1.A0E(5923) != false) goto L_0x0065;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0081, code lost:
        r4 = r9.isAudioChat();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0091, code lost:
        if (X.AnonymousClass3UL.A01(r10.A12, r10.A1L, r9.groupJid, r10.A1Q, r4) == null) goto L_0x00b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0093, code lost:
        r3 = X.C36441kJ.A0i(r10.A12, r9.getPeerJid());
        r0 = r9.videoEnabled;
        r2 = com.whatsapp.R.string.f12nameremoved;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00a2, code lost:
        if (r0 != false) goto L_0x00a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00a4, code lost:
        r2 = com.whatsapp.R.string.f12nameremoved;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00a7, code lost:
        r1 = new java.lang.Object[1];
        X.C36371kC.A1K(r10.A15, r3, r1, 0);
        r8 = r10.getString(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00b4, code lost:
        r1 = r9.isGroupCall;
        r0 = r9.videoEnabled;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00b8, code lost:
        if (r1 == false) goto L_0x00c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00ba, code lost:
        r1 = com.whatsapp.R.string.f12nameremoved;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00bd, code lost:
        if (r0 != false) goto L_0x025b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00bf, code lost:
        r1 = com.whatsapp.R.string.f12nameremoved;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00c4, code lost:
        r1 = com.whatsapp.R.string.f12nameremoved;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00c7, code lost:
        if (r0 != false) goto L_0x025b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00c9, code lost:
        r1 = com.whatsapp.R.string.f12nameremoved;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0173, code lost:
        if (r8 == null) goto L_0x0175;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x018c, code lost:
        if (r4.A0F != false) goto L_0x018e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0120  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A0s(com.whatsapp.voipcalling.CallInfo r9, com.whatsapp.voipcalling.VoipActivityV2 r10) {
        /*
            X.C18740tg.A01()
            int r0 = r10.A24
            if (r0 == 0) goto L_0x0018
            int r0 = r10.A23
            if (r0 == 0) goto L_0x0018
            boolean r0 = r10.A1p
            if (r0 != 0) goto L_0x0018
            com.whatsapp.calling.CallDetailsLayout r0 = r10.A0W
            if (r0 == 0) goto L_0x0019
            int r1 = r0.A00
            r0 = 1
            if (r1 != r0) goto L_0x0019
        L_0x0018:
            return
        L_0x0019:
            if (r9 == 0) goto L_0x0018
            boolean r0 = r9.callEnding
            if (r0 != 0) goto L_0x0018
            com.whatsapp.voipcalling.CallState r1 = r9.callState
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.NONE
            if (r1 == r0) goto L_0x0018
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.LINK
            if (r1 == r0) goto L_0x0018
            boolean r0 = r9.isInLonelyState()
            if (r0 != 0) goto L_0x0018
            X.6EE r0 = r9.self
            if (r0 == 0) goto L_0x0018
            com.whatsapp.calling.CallDetailsLayout r0 = r10.A0W
            if (r0 == 0) goto L_0x0272
            com.whatsapp.voipcalling.CallState r1 = r9.callState
            boolean r0 = r9.isGroupCall
            boolean r0 = A1R(r1, r10, r0)
            if (r0 == 0) goto L_0x0272
            java.lang.String r0 = r9.scheduledId
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x006e
            com.whatsapp.voipcalling.CallState r0 = r10.A07(r9)
            int r0 = r0.ordinal()
            r5 = 0
            r6 = 0
            r7 = 1
            switch(r0) {
                case 0: goto L_0x0018;
                case 1: goto L_0x022f;
                case 2: goto L_0x0223;
                case 3: goto L_0x0072;
                case 4: goto L_0x0258;
                case 5: goto L_0x0258;
                case 6: goto L_0x00ce;
                case 7: goto L_0x0018;
                case 8: goto L_0x0072;
                case 9: goto L_0x0057;
                case 10: goto L_0x0254;
                case 11: goto L_0x0081;
                default: goto L_0x0057;
            }
        L_0x0057:
            java.lang.String r0 = "voip/VoipActivityV2/updateCallStatusBar/unknownCallState"
            X.C18740tg.A0D(r6, r0)
            r1 = r5
        L_0x005d:
            com.whatsapp.calling.CallDetailsLayout r0 = r10.A0W
            if (r1 != 0) goto L_0x0062
            r1 = r5
        L_0x0062:
            r0.A05(r5, r1)
        L_0x0065:
            com.whatsapp.calling.CallDetailsLayout r0 = r10.A0W
            X.1RJ r1 = r0.A0H
            r0 = 8
            r1.A03(r0)
        L_0x006e:
            r10.A0p(r9)
            return
        L_0x0072:
            X.0yC r1 = r10.A0D
            boolean r0 = r9.isGroupCall
            if (r0 != 0) goto L_0x0081
            r0 = 5923(0x1723, float:8.3E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x0081
            goto L_0x0065
        L_0x0081:
            boolean r4 = r9.isAudioChat()
            com.whatsapp.jid.GroupJid r3 = r9.groupJid
            X.16D r2 = r10.A12
            X.1C6 r1 = r10.A1Q
            X.0xQ r0 = r10.A1L
            X.141 r0 = X.AnonymousClass3UL.A01(r2, r0, r3, r1, r4)
            if (r0 == 0) goto L_0x00b4
            X.16D r1 = r10.A12
            com.whatsapp.jid.UserJid r0 = r9.getPeerJid()
            X.141 r3 = X.C36441kJ.A0i(r1, r0)
            boolean r0 = r9.videoEnabled
            r2 = 2131889570(0x7f120da2, float:1.9413807E38)
            if (r0 != 0) goto L_0x00a7
            r2 = 2131889571(0x7f120da3, float:1.941381E38)
        L_0x00a7:
            java.lang.Object[] r1 = new java.lang.Object[r7]
            X.171 r0 = r10.A15
            X.C36371kC.A1K(r0, r3, r1, r6)
            java.lang.String r8 = r10.getString(r2, r1)
            goto L_0x025f
        L_0x00b4:
            boolean r1 = r9.isGroupCall
            boolean r0 = r9.videoEnabled
            if (r1 == 0) goto L_0x00c4
            r1 = 2131890336(0x7f1210a0, float:1.941536E38)
            if (r0 != 0) goto L_0x025b
            r1 = 2131890337(0x7f1210a1, float:1.9415363E38)
            goto L_0x025b
        L_0x00c4:
            r1 = 2131895640(0x7f122558, float:1.9426119E38)
            if (r0 != 0) goto L_0x025b
            r1 = 2131895884(0x7f12264c, float:1.9426614E38)
            goto L_0x025b
        L_0x00ce:
            boolean r0 = r9.isInLonelyState()
            if (r0 != 0) goto L_0x0254
            boolean r0 = r9.videoEnabled
            if (r0 == 0) goto L_0x00f8
            A0y(r10)
            r10.A0p(r9)
            boolean r0 = r10.A1o
            if (r0 != 0) goto L_0x0018
            long r5 = r10.A02
            r1 = 0
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0018
            long r3 = android.os.SystemClock.uptimeMillis()
            long r3 = r3 - r5
            r1 = 3000(0xbb8, double:1.482E-320)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0263
            r10.A1o = r7
            return
        L_0x00f8:
            boolean r0 = r9.isCallOnHold()
            if (r0 == 0) goto L_0x013e
            r0 = 2131896026(0x7f1226da, float:1.9426902E38)
        L_0x0101:
            java.lang.String r8 = r10.getString(r0)
        L_0x0105:
            boolean r0 = r10.A1o
            if (r0 != 0) goto L_0x011e
            long r0 = r10.A02
            r3 = 0
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 == 0) goto L_0x011e
            long r3 = android.os.SystemClock.uptimeMillis()
            long r3 = r3 - r0
            r1 = 3000(0xbb8, double:1.482E-320)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0136
            r10.A1o = r7
        L_0x011e:
            if (r8 != 0) goto L_0x025f
            X.0ts r2 = r10.A00
            long r0 = r9.callDuration
            long r0 = X.C36391kE.A0B(r0)
            java.lang.String r5 = X.AnonymousClass3UY.A07(r2, r0)
            X.0ts r2 = r10.A00
            long r0 = r9.callDuration
            java.lang.String r1 = X.AnonymousClass3UY.A0A(r2, r0)
            goto L_0x005d
        L_0x0136:
            r0 = 2131895869(0x7f12263d, float:1.9426583E38)
            java.lang.String r8 = r10.getString(r0)
            goto L_0x011e
        L_0x013e:
            boolean r0 = r9.isGroupCall
            if (r0 != 0) goto L_0x0220
            X.6EE r4 = r9.getDefaultPeerInfo()
            X.C18740tg.A06(r4)
            int r6 = com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel.A06(r4)
            if (r6 != 0) goto L_0x0175
            com.whatsapp.jid.UserJid r2 = r4.A08
            X.171 r1 = r10.A15
            X.16D r0 = r10.A12
            X.141 r0 = r0.A0D(r2)
            java.lang.String r2 = X.C36381kD.A0v(r1, r0)
            boolean r0 = r4.A0J
            if (r0 != 0) goto L_0x0175
            com.whatsapp.voipcalling.CallState r1 = r9.callState
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.ACTIVE
            if (r1 != r0) goto L_0x0175
            int r1 = r4.A06
            r3 = 3
            if (r1 != r3) goto L_0x01d6
            r0 = 2131896042(0x7f1226ea, float:1.9426934E38)
            java.lang.String r8 = X.C36351kA.A0w(r10, r2, r7, r0)
        L_0x0173:
            if (r8 != 0) goto L_0x0105
        L_0x0175:
            r8 = 0
            if (r6 != 0) goto L_0x0105
            com.whatsapp.jid.UserJid r2 = r4.A08
            X.171 r1 = r10.A15
            X.16D r0 = r10.A12
            X.141 r0 = r0.A0D(r2)
            java.lang.String r2 = X.C36381kD.A0v(r1, r0)
            boolean r0 = r9.videoEnabled
            if (r0 != 0) goto L_0x0197
            boolean r0 = r4.A0F
            if (r0 == 0) goto L_0x0105
        L_0x018e:
            r1 = 2131896028(0x7f1226dc, float:1.9426906E38)
        L_0x0191:
            java.lang.String r8 = X.C36351kA.A0w(r10, r2, r7, r1)
            goto L_0x0105
        L_0x0197:
            int r3 = r4.A06
            r0 = 6
            boolean r0 = X.AnonymousClass000.A1S(r3, r0)
            if (r0 == 0) goto L_0x01af
            boolean r0 = r4.A0F
            if (r0 == 0) goto L_0x01ab
            boolean r0 = r9.isGroupCall
            r1 = 2131896029(0x7f1226dd, float:1.9426908E38)
            if (r0 == 0) goto L_0x0191
        L_0x01ab:
            r1 = 2131896034(0x7f1226e2, float:1.9426918E38)
            goto L_0x0191
        L_0x01af:
            r1 = 2
            if (r3 != r1) goto L_0x01c1
            boolean r0 = r4.A0F
            if (r0 == 0) goto L_0x01bd
            boolean r0 = r9.isGroupCall
            r1 = 2131896030(0x7f1226de, float:1.942691E38)
            if (r0 == 0) goto L_0x0191
        L_0x01bd:
            r1 = 2131896033(0x7f1226e1, float:1.9426916E38)
            goto L_0x0191
        L_0x01c1:
            boolean r0 = r4.A0M
            if (r0 != 0) goto L_0x021b
            boolean r0 = r4.A0L
            if (r0 != 0) goto L_0x021b
            boolean r0 = r4.A0F
            if (r0 == 0) goto L_0x0105
            java.util.Map r0 = r9.participants
            int r0 = X.C110325aU.A00(r0)
            if (r0 != r1) goto L_0x0105
            goto L_0x018e
        L_0x01d6:
            boolean r0 = r9.isGroupCall
            if (r0 == 0) goto L_0x01ed
            int r2 = r4.A02
            r0 = 2
            if (r2 != r0) goto L_0x01e7
            r0 = 2131887488(0x7f120580, float:1.9409585E38)
        L_0x01e2:
            java.lang.String r8 = r10.getString(r0)
            goto L_0x0173
        L_0x01e7:
            if (r2 != r3) goto L_0x01ed
            r0 = 2131893755(0x7f121dfb, float:1.9422295E38)
            goto L_0x01e2
        L_0x01ed:
            X.6EE r0 = r9.self
            if (r0 == 0) goto L_0x01f9
            boolean r0 = r0.A0C
            if (r0 == 0) goto L_0x01f9
        L_0x01f5:
            r0 = 2131896026(0x7f1226da, float:1.9426902E38)
            goto L_0x01e2
        L_0x01f9:
            boolean r0 = r4.A0C
            if (r0 != 0) goto L_0x01f5
            boolean r0 = r4.A0G
            if (r0 == 0) goto L_0x0205
            r0 = 2131896040(0x7f1226e8, float:1.942693E38)
            goto L_0x01e2
        L_0x0205:
            boolean r0 = r9.videoEnabled
            if (r0 == 0) goto L_0x0175
            r0 = 6
            boolean r0 = X.AnonymousClass000.A1S(r1, r0)
            if (r0 != 0) goto L_0x0175
            boolean r0 = r4.A0O
            if (r0 != 0) goto L_0x0175
            r0 = 2
            if (r1 == r0) goto L_0x0175
            r0 = 2131895891(0x7f122653, float:1.9426628E38)
            goto L_0x01e2
        L_0x021b:
            r0 = 2131895642(0x7f12255a, float:1.9426123E38)
            goto L_0x0101
        L_0x0220:
            r8 = r5
            goto L_0x0105
        L_0x0223:
            X.6YM r0 = r10.A0r
            if (r0 == 0) goto L_0x022b
            boolean r0 = r0.A1P
            if (r0 != 0) goto L_0x0237
        L_0x022b:
            r1 = 2131895886(0x7f12264e, float:1.9426618E38)
            goto L_0x025b
        L_0x022f:
            X.6YM r0 = r10.A0r
            if (r0 == 0) goto L_0x024d
            boolean r0 = r0.A1P
            if (r0 == 0) goto L_0x024d
        L_0x0237:
            r4 = 2131892764(0x7f121a1c, float:1.9420286E38)
            java.lang.Object[] r3 = new java.lang.Object[r7]
            com.whatsapp.jid.UserJid r2 = X.C90494aF.A0M(r9)
            X.171 r1 = r10.A15
            X.16D r0 = r10.A12
            java.lang.String r0 = X.C36381kD.A0u(r0, r1, r2)
            java.lang.String r8 = X.C36391kE.A0v(r10, r0, r3, r6, r4)
            goto L_0x025f
        L_0x024d:
            boolean r0 = r9.isJoinableGroupCall
            r1 = 2131895885(0x7f12264d, float:1.9426616E38)
            if (r0 == 0) goto L_0x025b
        L_0x0254:
            r1 = 2131895999(0x7f1226bf, float:1.9426847E38)
            goto L_0x025b
        L_0x0258:
            r1 = 2131895891(0x7f122653, float:1.9426628E38)
        L_0x025b:
            java.lang.String r8 = r10.getString(r1)
        L_0x025f:
            r1 = r5
            r5 = r8
            goto L_0x005d
        L_0x0263:
            boolean r0 = r10.A1r
            if (r0 != 0) goto L_0x0018
            r0 = 2131895869(0x7f12263d, float:1.9426583E38)
            java.lang.String r0 = r10.getString(r0)
            r10.A3w(r0)
            return
        L_0x0272:
            com.whatsapp.voipcalling.CallState r1 = r9.callState
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.ACTIVE
            if (r1 != r0) goto L_0x0018
            boolean r0 = r9.videoEnabled
            if (r0 == 0) goto L_0x0018
            A0y(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.VoipActivityV2.A0s(com.whatsapp.voipcalling.CallInfo, com.whatsapp.voipcalling.VoipActivityV2):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:138:0x025a, code lost:
        if (r9.isGroupCallEnabled == false) goto L_0x025c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x010f, code lost:
        if (r10.A1a != null) goto L_0x0111;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0187, code lost:
        if (r9.isEitherSideRequestingUpgrade() == false) goto L_0x0189;
     */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x01b5  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x013e  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x017c  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x01a7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A0u(com.whatsapp.voipcalling.CallInfo r9, com.whatsapp.voipcalling.VoipActivityV2 r10) {
        /*
            boolean r0 = r10.isFinishing()
            if (r0 == 0) goto L_0x000c
            java.lang.String r0 = "voip/VoipActivityV2/updateUiState finishing do not update"
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x000b:
            return
        L_0x000c:
            if (r9 == 0) goto L_0x000b
            com.whatsapp.voipcalling.CallState r1 = r9.callState
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.NONE
            if (r1 == r0) goto L_0x000b
            boolean r0 = r10.A1r
            r2 = 1
            if (r0 == 0) goto L_0x0036
            java.lang.String r0 = X.C114145gi.A07
            boolean r0 = X.C90484aE.A1R(r10, r0)
            if (r0 != 0) goto L_0x0036
            boolean r0 = r9.videoEnabled
            if (r0 != 0) goto L_0x0036
            java.lang.String r0 = "voip/VoipActivityV2/updateUiState leave PIP mode due to voice call"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.17Y r1 = r10.A05
            r0 = 2131895868(0x7f12263c, float:1.9426581E38)
            r1.A06(r0, r2)
            r10.finish()
            return
        L_0x0036:
            boolean r0 = r9.hasOutgoingParticipantInActiveOneToOneCall()
            if (r0 != 0) goto L_0x0048
            boolean r0 = r9.isInLonelyState()
            if (r0 == 0) goto L_0x0052
            int r0 = r10.A00
            if (r0 == 0) goto L_0x0052
            if (r0 == r2) goto L_0x0052
        L_0x0048:
            boolean r0 = r10.A1x
            if (r0 != 0) goto L_0x0052
            boolean r0 = r9.videoEnabled
            if (r0 == 0) goto L_0x0052
            r10.A1x = r2
        L_0x0052:
            r10.A0M()
            A0r(r9, r10)
            A0s(r9, r10)
            com.whatsapp.voipcalling.CallState r2 = r9.callState
            X.1RJ r1 = r10.A1V
            android.view.View r0 = r1.A00
            if (r0 == 0) goto L_0x0074
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.ACTIVE
            if (r2 == r0) goto L_0x006b
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.CONNECTED_LONELY
            if (r2 != r0) goto L_0x0074
        L_0x006b:
            boolean r0 = r10.A1q
            if (r0 == 0) goto L_0x0074
            r0 = 8
            r1.A03(r0)
        L_0x0074:
            com.whatsapp.voipcalling.VoipCallControlBottomSheetV2 r2 = r10.A1a
            if (r2 == 0) goto L_0x00c5
            boolean r0 = r2.A12()
            if (r0 == 0) goto L_0x00c5
            boolean r1 = r9.videoEnabled
            boolean r0 = r2.A1m()
            if (r1 == r0) goto L_0x00c5
            r10.A0I()
            X.5Su r0 = X.C108255Su.AV_SWITCH
            r10.A3p(r0)
            boolean r0 = r10.A1q
            if (r0 != 0) goto L_0x009c
            X.1RJ r0 = r10.A1W
            android.view.View r1 = r0.A01()
            r0 = 0
            r1.setTranslationY(r0)
        L_0x009c:
            r10.A0J()
            boolean r0 = r9.videoEnabled
            com.whatsapp.calling.avatar.viewmodel.CallAvatarViewModel r3 = r10.A0a
            if (r0 == 0) goto L_0x01ca
            java.lang.String r0 = "voip/CallAvatarViewModel/onCallAvSwitchToVideoCall"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1hi r0 = r3.A0F
            java.lang.Object r1 = X.C36401kF.A0m(r0)
            X.5aQ r1 = (X.C110285aQ) r1
            boolean r0 = r1 instanceof X.AnonymousClass52M
            if (r0 == 0) goto L_0x00c5
            X.52M r1 = (X.AnonymousClass52M) r1
            X.5aP r0 = r1.A00
            boolean r0 = r0 instanceof X.AnonymousClass52I
            if (r0 == 0) goto L_0x00c5
            java.lang.String r0 = X.C90464aC.A0V()
            X.C95504lc.A01(r3, r0)
        L_0x00c5:
            com.whatsapp.voipcalling.CallState r1 = r9.callState
            android.view.ViewGroup r0 = r10.A0F
            X.C36341k9.A0y(r0)
            boolean r0 = r10.A1x
            r5 = 0
            if (r0 != 0) goto L_0x00fa
            X.5Ni r0 = r10.A1X
            if (r0 == 0) goto L_0x00d8
            r0.A01(r5)
        L_0x00d8:
            boolean r0 = r10.A1q
            if (r0 != 0) goto L_0x027b
            java.util.ArrayList r8 = X.AnonymousClass001.A0I()
            java.util.Map r0 = r9.participants
            java.util.Iterator r2 = X.AnonymousClass000.A0z(r0)
        L_0x00e6:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0200
            X.6EE r1 = X.C90524aI.A0J(r2)
            boolean r0 = r1.A0J
            if (r0 != 0) goto L_0x00e6
            com.whatsapp.jid.UserJid r0 = r1.A08
            r8.add(r0)
            goto L_0x00e6
        L_0x00fa:
            boolean r0 = com.whatsapp.voipcalling.Voip.A0A(r1)
            if (r0 == 0) goto L_0x0115
            boolean r0 = r10.A1m
            if (r0 != 0) goto L_0x0115
            java.lang.String r0 = "voip/VoipActivityV2/updateButtonStates/answerCallView/visible RECEIVED_CALL"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            boolean r0 = r9.isGroupCall
            if (r0 == 0) goto L_0x0135
            com.whatsapp.voipcalling.VoipCallControlBottomSheetV2 r0 = r10.A1a
            if (r0 == 0) goto L_0x0135
        L_0x0111:
            A14(r10)
            goto L_0x00d8
        L_0x0115:
            boolean r0 = r9.isPeerRequestingUpgrade()
            if (r0 == 0) goto L_0x01bc
            X.6EE r0 = r9.self
            int r1 = r0.A06
            r0 = 3
            if (r1 == r0) goto L_0x01bc
            boolean r0 = r10.A1m
            if (r0 != 0) goto L_0x01bc
            X.0yC r1 = r10.A0D
            r0 = 4624(0x1210, float:6.48E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 != 0) goto L_0x01bc
            java.lang.String r0 = "voip/VoipActivityV2/updateButtonStates/answerCallView/visible kVideoStateUpgradeRequest"
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x0135:
            java.lang.String r0 = "voip/VoipActivityV2/showAnswerCallView"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.5Ni r2 = r10.A1X
            if (r2 != 0) goto L_0x0161
            r0 = 2131427736(0x7f0b0198, float:1.8477097E38)
            android.view.View r2 = r10.findViewById(r0)
            android.view.ViewStub r2 = (android.view.ViewStub) r2
            android.view.View r0 = r2.inflate()
            X.5Ni r0 = (X.C107275Ni) r0
            r10.A1X = r0
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "voip/showAnswerCallView found answerCallViewStub:"
            X.C36321k7.A1K(r2, r0, r1)
            X.5Ni r2 = r10.A1X
            X.70r r0 = new X.70r
            r0.<init>(r10)
            r2.A01 = r0
        L_0x0161:
            android.content.Intent r0 = r10.getIntent()
            java.lang.String r1 = r0.getAction()
            X.0yb r0 = r10.A08
            boolean r0 = X.C90504aG.A1V(r0)
            r2.A02(r9, r1, r0)
            com.whatsapp.voipcalling.CallState r1 = r9.callState
            boolean r0 = r9.isGroupCall
            boolean r0 = A1R(r1, r10, r0)
            if (r0 == 0) goto L_0x01a1
            com.whatsapp.calling.CallDetailsLayout r4 = r10.A0W
            boolean r0 = r9.videoEnabled
            if (r0 == 0) goto L_0x0189
            boolean r0 = r9.isEitherSideRequestingUpgrade()
            r3 = 0
            if (r0 != 0) goto L_0x018a
        L_0x0189:
            r3 = 1
        L_0x018a:
            com.whatsapp.components.button.ThumbnailButton r2 = r4.A07
            r1 = 8
            int r0 = X.C36381kD.A09(r3)
            r2.setVisibility(r0)
            X.3SF r0 = r4.A06
            if (r3 == 0) goto L_0x019a
            r1 = 0
        L_0x019a:
            com.whatsapp.TextEmojiLabel r0 = r0.A01
            r0.setVisibility(r1)
            r4.A00 = r5
        L_0x01a1:
            boolean r0 = r9.isEitherSideRequestingUpgrade()
            if (r0 != 0) goto L_0x01ac
            X.5Su r0 = X.C108255Su.INCOMING_CALL
            r10.A3p(r0)
        L_0x01ac:
            java.lang.String r0 = "voip/VoipCallControlBottomSheetV2 detaching bottom sheet"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            com.whatsapp.voipcalling.VoipCallControlBottomSheetV2 r0 = r10.A1a
            if (r0 == 0) goto L_0x00d8
            java.lang.String r0 = "CallControlSheet"
            r10.A3D(r0)
            goto L_0x00d8
        L_0x01bc:
            java.lang.String r0 = "voip/VoipActivityV2/updateButtonStates"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.5Ni r0 = r10.A1X
            if (r0 == 0) goto L_0x0111
            r0.A01(r5)
            goto L_0x0111
        L_0x01ca:
            java.lang.String r0 = "voip/CallAvatarViewModel/onCallAvSwitchToAudioCall"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1hi r2 = r3.A0F
            java.lang.Object r1 = X.C36401kF.A0m(r2)
            X.5aQ r1 = (X.C110285aQ) r1
            boolean r0 = r1 instanceof X.AnonymousClass52Q
            if (r0 != 0) goto L_0x01ea
            boolean r0 = r1 instanceof X.AnonymousClass52M
            if (r0 == 0) goto L_0x00c5
            r0 = r1
            X.52M r0 = (X.AnonymousClass52M) r0
            X.5aP r0 = r0.A00
            boolean r0 = r0 instanceof X.AnonymousClass52J
            if (r0 != 0) goto L_0x01ea
            goto L_0x00c5
        L_0x01ea:
            boolean r0 = r1 instanceof X.AnonymousClass52M
            if (r0 != 0) goto L_0x01f4
            X.6WJ r1 = r3.A06
            r0 = 4
            r1.A04(r0)
        L_0x01f4:
            X.52I r1 = X.AnonymousClass52I.A00
            X.52M r0 = new X.52M
            r0.<init>(r1)
            r2.A0D(r0)
            goto L_0x00c5
        L_0x0200:
            android.view.View r2 = r10.A0D
            if (r2 == 0) goto L_0x03a0
            com.whatsapp.calling.CallDetailsLayout r0 = r10.A0W
            if (r0 == 0) goto L_0x03a0
            boolean r1 = A1Q(r9, r10)
            int r0 = X.C36351kA.A00(r1)
            r2.setVisibility(r0)
            if (r1 == 0) goto L_0x0240
            boolean r0 = r9.isGroupCall
            r3 = 0
            r2 = 1
            if (r0 == 0) goto L_0x033e
            boolean r0 = r9.isInLonelyState()
            if (r0 == 0) goto L_0x033e
            boolean r0 = r9.videoEnabled
            if (r0 != 0) goto L_0x033e
            android.view.View r1 = r10.A0D
            com.whatsapp.calling.CallDetailsLayout r0 = r10.A0W
            int r0 = r0.getVisibility()
            if (r0 == 0) goto L_0x0335
            com.whatsapp.calling.CallDetailsLayout r0 = r10.A0W
            java.lang.String r0 = r0.getNameViewContentDescription()
            if (r0 == 0) goto L_0x0335
            com.whatsapp.calling.CallDetailsLayout r0 = r10.A0W
            java.lang.String r0 = r0.getNameViewContentDescription()
        L_0x023d:
            X.AnonymousClass3UE.A07(r1, r0, r3, r2)
        L_0x0240:
            X.0yC r3 = r10.A0D
            com.whatsapp.voipcalling.CallState r2 = r9.callState
            boolean r1 = r9.isGroupCall
            java.lang.String r0 = "options.enable_add_participant_while_calling_receiver"
            java.lang.Boolean r0 = com.whatsapp.voipcalling.Voip.A03(r0)
            boolean r0 = X.C34681hT.A0Q(r3, r2, r0, r1)
            r3 = 0
            if (r0 != 0) goto L_0x0257
            boolean r0 = r10.A1m
            if (r0 == 0) goto L_0x025c
        L_0x0257:
            boolean r0 = r9.isGroupCallEnabled
            r2 = 1
            if (r0 != 0) goto L_0x025d
        L_0x025c:
            r2 = 0
        L_0x025d:
            boolean r0 = A1T(r10)
            if (r0 == 0) goto L_0x031c
            X.0yC r0 = r10.A0D
            boolean r0 = X.C34681hT.A0G(r0)
            if (r0 == 0) goto L_0x031c
            r2 = 0
        L_0x026c:
            boolean r0 = r10.A1q
            if (r0 != 0) goto L_0x027b
            android.view.ViewGroup r0 = r10.A0G
            X.C18740tg.A04(r0)
            if (r2 != 0) goto L_0x0278
            r3 = 4
        L_0x0278:
            r0.setVisibility(r3)
        L_0x027b:
            r10.Bwh(r9)
            boolean r0 = r9.videoEnabled
            if (r0 != 0) goto L_0x02b7
            com.whatsapp.WaImageView r1 = r10.A0S
            if (r1 == 0) goto L_0x02b7
            r0 = 2131234507(0x7f080ecb, float:1.8085182E38)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            java.lang.Object r0 = r1.getTag()
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x02b7
            r0 = 2131234507(0x7f080ecb, float:1.8085182E38)
            android.graphics.drawable.Drawable r2 = X.C36381kD.A0H(r10, r0)
            android.content.res.Resources r1 = r10.getResources()
            r0 = 2131102493(0x7f060b1d, float:1.7817425E38)
            int r0 = r1.getColor(r0)
            android.graphics.drawable.Drawable r1 = X.AnonymousClass3UF.A08(r2, r0)
            com.whatsapp.WaImageView r0 = r10.A0S
            r0.setImageDrawable(r1)
            com.whatsapp.WaImageView r0 = r10.A0S
            r0.setTag(r3)
        L_0x02b7:
            X.7lo r0 = r10.A0k
            X.00r r0 = r0.B9D()
            java.lang.Object r0 = r0.A04()
            X.6PI r0 = (X.AnonymousClass6PI) r0
            A0n(r0, r10)
            X.6EE r0 = r9.self
            int r1 = r0.A06
            r0 = 2
            boolean r1 = X.AnonymousClass000.A1S(r1, r0)
            boolean r0 = r9.videoEnabled
            if (r0 == 0) goto L_0x02fa
            if (r1 != 0) goto L_0x02fa
            boolean r0 = r9.isEitherSideRequestingUpgrade()
            if (r0 != 0) goto L_0x02fa
            com.whatsapp.calling.avatar.viewmodel.CallAvatarViewModel r0 = r10.A0a
            X.1hi r1 = r0.A0F
            java.lang.Object r0 = r1.A04()
            boolean r0 = r0 instanceof X.AnonymousClass52P
            if (r0 != 0) goto L_0x02f7
            java.lang.Object r0 = r1.A04()
            boolean r0 = r0 instanceof X.AnonymousClass52L
            if (r0 != 0) goto L_0x02f7
            java.lang.Object r0 = r1.A04()
            boolean r0 = r0 instanceof X.AnonymousClass52R
            if (r0 == 0) goto L_0x02fa
        L_0x02f7:
            A0v(r9, r10)
        L_0x02fa:
            com.whatsapp.voipcalling.CallState r1 = r9.callState
            boolean r0 = r9.isGroupCall
            boolean r0 = A1R(r1, r10, r0)
            if (r0 == 0) goto L_0x0309
            com.whatsapp.calling.CallDetailsLayout r0 = r10.A0W
            r0.A03(r9)
        L_0x0309:
            com.whatsapp.voipcalling.CallState r1 = r9.callState
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.CALLING
            if (r1 == r0) goto L_0x0313
            android.view.View$OnClickListener r0 = r10.A06
            if (r0 != 0) goto L_0x000b
        L_0x0313:
            r1 = 6
            X.6cn r0 = new X.6cn
            r0.<init>(r10, r9, r1)
            r10.A06 = r0
            return
        L_0x031c:
            X.185 r0 = r10.A14
            boolean r0 = X.AnonymousClass3UL.A09(r0, r9)
            if (r0 == 0) goto L_0x026c
            X.0yC r0 = r10.A0D
            boolean r0 = X.C34681hT.A0G(r0)
            if (r0 == 0) goto L_0x026c
            X.0wU r1 = r10.A04
            r0 = 15
            X.C1498172w.A02(r1, r10, r9, r0)
            goto L_0x026c
        L_0x0335:
            r0 = 2131897130(0x7f122b2a, float:1.942914E38)
            java.lang.String r0 = r10.getString(r0)
            goto L_0x023d
        L_0x033e:
            boolean r7 = r9.isAudioChat()
            com.whatsapp.jid.GroupJid r6 = r9.groupJid
            X.16D r5 = r10.A12
            X.171 r4 = r10.A15
            X.1C6 r1 = r10.A1Q
            X.0xQ r0 = r10.A1L
            X.141 r0 = X.AnonymousClass3UL.A01(r5, r0, r6, r1, r7)
            if (r0 == 0) goto L_0x0397
            java.lang.String r4 = X.C36381kD.A0v(r4, r0)
            if (r4 == 0) goto L_0x0397
        L_0x0358:
            android.view.View r5 = r10.A0D
            com.whatsapp.calling.CallDetailsLayout r0 = r10.A0W
            int r0 = r0.getVisibility()
            if (r0 == 0) goto L_0x0388
            if (r4 == 0) goto L_0x0388
            boolean r1 = r9.videoEnabled
            r0 = 2131895920(0x7f122670, float:1.9426687E38)
            if (r1 == 0) goto L_0x036e
            r0 = 2131895918(0x7f12266e, float:1.9426683E38)
        L_0x036e:
            java.lang.String r4 = X.C36351kA.A0w(r10, r4, r2, r0)
        L_0x0372:
            X.0yC r1 = r10.A0D
            r0 = 2541(0x9ed, float:3.56E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x0383
            r0 = 2131895916(0x7f12266c, float:1.9426679E38)
            java.lang.String r3 = r10.getString(r0)
        L_0x0383:
            X.AnonymousClass3UE.A07(r5, r4, r3, r2)
            goto L_0x0240
        L_0x0388:
            boolean r1 = r9.videoEnabled
            r0 = 2131895919(0x7f12266f, float:1.9426685E38)
            if (r1 == 0) goto L_0x0392
            r0 = 2131895917(0x7f12266d, float:1.942668E38)
        L_0x0392:
            java.lang.String r4 = r10.getString(r0)
            goto L_0x0372
        L_0x0397:
            X.16D r1 = r10.A12
            X.171 r0 = r10.A15
            java.lang.String r4 = X.C90514aH.A0t(r10, r1, r0, r8)
            goto L_0x0358
        L_0x03a0:
            boolean r1 = r10.A1q
            java.lang.String r0 = "E2ee container or call details cannot be null when call controls m1 is disabled"
            X.C18740tg.A0D(r1, r0)
            goto L_0x0240
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.VoipActivityV2.A0u(com.whatsapp.voipcalling.CallInfo, com.whatsapp.voipcalling.VoipActivityV2):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0028  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A13(com.whatsapp.voipcalling.VoipActivityV2 r4) {
        /*
            com.whatsapp.voipcalling.CallInfo r2 = A01(r4)
            if (r2 == 0) goto L_0x0046
            com.whatsapp.voipcalling.CallState r1 = r2.callState
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.NONE
            if (r1 == r0) goto L_0x0046
            boolean r0 = r4.A1x
            if (r0 == 0) goto L_0x0046
            boolean r0 = r4.A1v
            if (r0 == 0) goto L_0x0046
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.ACTIVE
            if (r1 != r0) goto L_0x0046
            boolean r0 = r2.videoEnabled
            if (r0 == 0) goto L_0x0046
            java.util.Map r0 = r2.participants
            java.util.Iterator r2 = X.AnonymousClass000.A0z(r0)
        L_0x0022:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0046
            X.6EE r1 = X.C90524aI.A0J(r2)
            boolean r0 = r1.A0O
            if (r0 != 0) goto L_0x0039
            int r1 = r1.A06
            r0 = 6
            boolean r0 = X.AnonymousClass000.A1S(r1, r0)
            if (r0 == 0) goto L_0x0022
        L_0x0039:
            android.os.Handler r0 = r4.A05
            r3 = 3
            r0.removeMessages(r3)
            android.os.Handler r2 = r4.A05
            r0 = 5000(0x1388, double:2.4703E-320)
            r2.sendEmptyMessageDelayed(r3, r0)
        L_0x0046:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.VoipActivityV2.A13(com.whatsapp.voipcalling.VoipActivityV2):void");
    }

    public static void A16(VoipActivityV2 voipActivityV2) {
        if (!A1S(voipActivityV2) || !A1O(A01(voipActivityV2), voipActivityV2)) {
            voipActivityV2.finish();
            if (voipActivityV2.getIntent().getBooleanExtra("isTaskRoot", true)) {
                voipActivityV2.startActivity(AnonymousClass190.A03(voipActivityV2));
            }
        }
    }

    public static void A17(VoipActivityV2 voipActivityV2) {
        boolean z;
        int i;
        int i2;
        CallInfo A012 = A01(voipActivityV2);
        if (A012 != null) {
            if (voipActivityV2.A1r || (!voipActivityV2.A2L && A012.videoEnabled && C110325aU.A00(A012.participants) <= 2)) {
                z = true;
            } else {
                z = false;
            }
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) voipActivityV2.A2A.getLayoutParams();
            layoutParams.removeRule(3);
            if (z) {
                voipActivityV2.A0e.A0T(0, 0);
            } else if (A012.videoEnabled || !voipActivityV2.A1q) {
                if (voipActivityV2.A2L) {
                    i = 0;
                } else {
                    i = voipActivityV2.A20;
                }
                voipActivityV2.A0e.A0T(voipActivityV2.A21, i);
            } else {
                layoutParams.addRule(3, R.id.call_screen_header_view);
                int dimensionPixelSize = voipActivityV2.getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
                if (voipActivityV2.A2L) {
                    i2 = 0;
                } else {
                    i2 = voipActivityV2.A20;
                }
                voipActivityV2.A0e.A0T(dimensionPixelSize, i2);
            }
            voipActivityV2.A2A.setLayoutParams(layoutParams);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002b, code lost:
        if (r1.A06 != false) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003b, code lost:
        if (r0 == false) goto L_0x003d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A1E(com.whatsapp.voipcalling.VoipActivityV2 r4, boolean r5) {
        /*
            com.whatsapp.voipcalling.CallInfo r3 = A01(r4)
            if (r3 == 0) goto L_0x0039
            r1 = 3
            r0 = 4
            if (r5 == 0) goto L_0x000b
            r0 = 5
        L_0x000b:
            A1C(r4, r1, r0)
            X.1Pa r0 = r4.A0Z
            android.content.SharedPreferences r1 = X.C27631Pa.A00(r0)
            java.lang.String r0 = "screen_sharing_backward_compat_shown"
            boolean r0 = X.C36371kC.A1U(r1, r0)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x002d
            com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel r1 = r4.A0e
            boolean r0 = r1.A09
            if (r0 != 0) goto L_0x002d
            boolean r0 = r1.A0C
            if (r0 == 0) goto L_0x002d
            boolean r0 = r1.A06
            r2 = 1
            if (r0 == 0) goto L_0x002e
        L_0x002d:
            r2 = 0
        L_0x002e:
            boolean r0 = A1P(r3, r4)
            if (r2 != 0) goto L_0x003a
            if (r0 != 0) goto L_0x003d
            A0w(r3, r4, r5)
        L_0x0039:
            return
        L_0x003a:
            r1 = 0
            if (r0 != 0) goto L_0x003e
        L_0x003d:
            r1 = 1
        L_0x003e:
            java.lang.String r0 = "voipactivityv2/onAddParticipantButtonClicked/ backward compat conditions should be exclusive"
            X.C18740tg.A0D(r1, r0)
            X.6i3 r0 = new X.6i3
            r0.<init>(r3, r4, r5)
            A0m(r0, r4, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.VoipActivityV2.A1E(com.whatsapp.voipcalling.VoipActivityV2, boolean):void");
    }

    private void A1H(String str) {
        C36321k7.A1Q("voip/VoipActivityV2/showCallFailedMessage ", str, AnonymousClass000.A0u());
        if (str != null) {
            A3s();
            AnonymousClass712 r2 = new AnonymousClass712(this);
            MessageDialogFragment messageDialogFragment = new MessageDialogFragment();
            messageDialogFragment.A01 = r2;
            messageDialogFragment.A17(C36431kI.A0I("message", str));
            this.A29 = messageDialogFragment;
            A3o(messageDialogFragment, "MessageDialogFragment");
            return;
        }
        C18740tg.A0D(false, "call failed message not defined");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0090, code lost:
        if (r9.getRepeatCount() == 0) goto L_0x0092;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean A1M(int r8, android.view.KeyEvent r9) {
        /*
            r7 = this;
            com.whatsapp.voipcalling.CallInfo r6 = A01(r7)
            X.6YM r2 = r7.A0r
            r5 = 0
            if (r2 == 0) goto L_0x003c
            if (r6 == 0) goto L_0x003c
            com.whatsapp.voipcalling.CallState r3 = r6.callState
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.NONE
            if (r3 == r0) goto L_0x003c
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.RECEIVED_CALL
            r4 = 1
            if (r3 != r0) goto L_0x003d
            r0 = 24
            if (r8 == r0) goto L_0x00af
            r0 = 25
            if (r8 == r0) goto L_0x00af
            r0 = 91
            if (r8 == r0) goto L_0x00af
            r0 = 164(0xa4, float:2.3E-43)
            if (r8 == r0) goto L_0x00af
            r0 = 5
            if (r8 == r0) goto L_0x00a4
            r0 = 126(0x7e, float:1.77E-43)
            if (r8 == r0) goto L_0x00a4
            r0 = 79
            if (r8 == r0) goto L_0x00a4
            r0 = 85
            if (r8 == r0) goto L_0x00a4
            r0 = 6
            if (r8 == r0) goto L_0x0099
            r0 = 86
            if (r8 == r0) goto L_0x0099
        L_0x003c:
            return r5
        L_0x003d:
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.PRECALLING
            java.lang.String r1 = "voip/VoipActivityV2/handleKeyActon end call from remote control"
            if (r3 != r0) goto L_0x005a
            r0 = 5
            if (r8 == r0) goto L_0x00b5
            r0 = 126(0x7e, float:1.77E-43)
            if (r8 == r0) goto L_0x00b5
            r0 = 79
            if (r8 == r0) goto L_0x00b5
            r0 = 85
            if (r8 == r0) goto L_0x00b5
            r0 = 6
            if (r8 == r0) goto L_0x0092
            r0 = 86
            if (r8 == r0) goto L_0x0092
            return r5
        L_0x005a:
            r0 = 6
            if (r8 == r0) goto L_0x0092
            r0 = 86
            if (r8 == r0) goto L_0x0092
            r0 = 79
            if (r8 == r0) goto L_0x008c
            r0 = 85
            if (r8 == r0) goto L_0x008c
            r0 = 24
            if (r8 == r0) goto L_0x00c0
            r0 = 25
            if (r8 == r0) goto L_0x00c1
            r0 = 131(0x83, float:1.84E-43)
            if (r8 != r0) goto L_0x0080
            java.lang.String r0 = "Should be used for automation only"
            X.C18740tg.A0D(r5, r0)
            java.lang.String r0 = "it can only be used in smoke or automation"
            X.C18740tg.A0D(r5, r0)
            return r5
        L_0x0080:
            r0 = 4
            if (r8 != r0) goto L_0x003c
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.REJOINING
            if (r3 != r0) goto L_0x003c
            r0 = 2
            r7.BnL(r0)
            return r5
        L_0x008c:
            int r0 = r9.getRepeatCount()
            if (r0 != 0) goto L_0x003c
        L_0x0092:
            com.whatsapp.util.Log.i((java.lang.String) r1)
            A10(r7)
            return r4
        L_0x0099:
            java.lang.String r0 = "voip/VoipActivityV2/handleKeyActon reject call from remote control"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = 9
            r7.BnL(r0)
            return r4
        L_0x00a4:
            java.lang.String r0 = "voip/VoipActivityV2/handleKeyActon accept call from remote control"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = 8
            A19(r7, r0)
            return r4
        L_0x00af:
            X.6XR r0 = r2.A2P
            r0.A06()
            return r4
        L_0x00b5:
            java.lang.String r0 = "voip/VoipActivityV2/handleKeyActon start call from remote control"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.String r0 = X.C114145gi.A08
            r7.A0x(r6, r0)
            return r4
        L_0x00c0:
            r5 = 1
        L_0x00c1:
            r1 = 0
            X.0yb r0 = r2.A2g     // Catch:{ all -> 0x012b }
            android.media.AudioManager r0 = r0.A0D()     // Catch:{ all -> 0x012b }
            if (r0 == 0) goto L_0x012f
            int r4 = r0.getStreamMaxVolume(r1)     // Catch:{ all -> 0x012b }
            int r3 = r0.getStreamVolume(r1)     // Catch:{ all -> 0x012b }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x012b }
            java.lang.String r0 = "voip/audio_route/adjustVoipStackAudioLevel direction "
            r1.append(r0)     // Catch:{ all -> 0x012b }
            if (r5 == 0) goto L_0x00e0
            java.lang.String r0 = " UP"
            goto L_0x00e2
        L_0x00e0:
            java.lang.String r0 = "DOWN"
        L_0x00e2:
            r1.append(r0)     // Catch:{ all -> 0x012b }
            java.lang.String r0 = ", volume "
            r1.append(r0)     // Catch:{ all -> 0x012b }
            r1.append(r3)     // Catch:{ all -> 0x012b }
            java.lang.String r0 = ", max volume "
            X.C36321k7.A1T(r0, r1, r4)     // Catch:{ all -> 0x012b }
            if (r5 == 0) goto L_0x0114
            if (r3 != r4) goto L_0x012f
            short r1 = r2.A1F     // Catch:{ all -> 0x012b }
            int r0 = r2.A0S     // Catch:{ all -> 0x012b }
            int r0 = r0 + 192
            if (r1 < r0) goto L_0x0104
            java.lang.String r0 = "voip/audio_route/adjustVoipStackAudioLevel no-op, auido level is 192"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x012b }
            goto L_0x012f
        L_0x0104:
            int r0 = r1 + 32
            short r0 = (short) r0     // Catch:{ all -> 0x012b }
            r2.A1F = r0     // Catch:{ all -> 0x012b }
            r1 = 37
            X.74e r0 = new X.74e     // Catch:{ all -> 0x012b }
            r0.<init>(r2, r1)     // Catch:{ all -> 0x012b }
            X.C90504aG.A17(r0, r2)     // Catch:{ all -> 0x012b }
            goto L_0x012f
        L_0x0114:
            short r1 = r2.A1F     // Catch:{ all -> 0x012b }
            int r0 = r2.A0S     // Catch:{ all -> 0x012b }
            if (r1 <= r0) goto L_0x012f
            int r0 = r1 + -32
            short r0 = (short) r0     // Catch:{ all -> 0x012b }
            r2.A1F = r0     // Catch:{ all -> 0x012b }
            r1 = 37
            X.74e r0 = new X.74e     // Catch:{ all -> 0x012b }
            r0.<init>(r2, r1)     // Catch:{ all -> 0x012b }
            X.C90504aG.A17(r0, r2)     // Catch:{ all -> 0x012b }
            r0 = 1
            return r0
        L_0x012b:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
        L_0x012f:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.VoipActivityV2.A1M(int, android.view.KeyEvent):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002a, code lost:
        if (r2 != false) goto L_0x002c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A1N(com.whatsapp.jid.UserJid r5, com.whatsapp.voipcalling.VoipActivityV2 r6, int r7, boolean r8) {
        /*
            r6.A0G()
            X.0yE r0 = r6.A1E
            boolean r0 = r0.A0C()
            r4 = 1
            if (r0 == 0) goto L_0x000d
            r4 = 0
        L_0x000d:
            X.13J r1 = r6.A1U
            X.0yE r0 = r6.A1E
            boolean r2 = X.AnonymousClass3UD.A08(r0, r1, r8)
            X.0yE r0 = r6.A1E
            boolean r1 = r0.A0G()
            if (r2 != 0) goto L_0x0023
            if (r4 != 0) goto L_0x0023
            if (r1 != 0) goto L_0x0023
            r0 = 1
            return r0
        L_0x0023:
            r0 = -1
            r3 = 0
            if (r7 != r0) goto L_0x002d
            if (r4 != 0) goto L_0x002c
            r7 = 3
            if (r2 == 0) goto L_0x002d
        L_0x002c:
            r7 = 0
        L_0x002d:
            com.whatsapp.calling.views.PermissionDialogFragment r2 = com.whatsapp.calling.views.PermissionDialogFragment.A00(r5, r7, r4, r2, r1)
            X.09Y r1 = X.C36341k9.A0O(r6)
            java.lang.String r0 = "permission_request"
            r1.A0D(r2, r0)
            r1.A04()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.VoipActivityV2.A1N(com.whatsapp.jid.UserJid, com.whatsapp.voipcalling.VoipActivityV2, int, boolean):boolean");
    }

    public C21710zg A2K() {
        C21710zg A2K2 = super.A2K();
        C36321k7.A0s(A2K2, this);
        return A2K2;
    }

    public void A2W() {
        CallInfo A012 = A01(this);
        if (A012 != null) {
            int i = 10;
            if (A012.videoEnabled) {
                i = 11;
            }
            this.A1O.A00(i, 0);
        }
    }

    public C18950u5 BGv() {
        return C19430v1.A01;
    }

    public void Bcc(int i) {
        AnonymousClass6YM r2;
        String str;
        A0G();
        if (this.A0r != null) {
            int intExtra = getIntent().getIntExtra("call_ui_action", 0);
            if (i == 0) {
                r2 = this.A0r;
                str = this.A1i;
            } else if (i == 1) {
                return;
            } else {
                if (i == 2) {
                    this.A0r.A1E.execute(new AnonymousClass72j(0, 2));
                    return;
                } else if (i != 3) {
                    C18740tg.A0D(false, "Unknown request code");
                    return;
                } else {
                    r2 = this.A0r;
                    str = this.A1i;
                    r2.A1M = true;
                }
            }
            r2.A0i(str, (String) null, intExtra);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00cb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Bcd(java.lang.String[] r9, int r10) {
        /*
            r8 = this;
            r8.A0G()
            com.whatsapp.voipcalling.CallInfo r5 = A01(r8)
            boolean r0 = X.C34681hT.A0T(r5)
            if (r0 == 0) goto L_0x003c
            X.6YM r0 = r8.A0r
            if (r0 == 0) goto L_0x003c
            int r6 = r9.length
            r4 = 0
            r2 = 0
        L_0x0014:
            r3 = 1
            if (r2 >= r6) goto L_0x00bb
            r1 = r9[r2]
            java.lang.String r0 = "android.permission.CAMERA"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00b7
            r2 = 1
        L_0x0022:
            boolean r0 = X.C19550w8.A0A()
            if (r0 == 0) goto L_0x008a
            if (r10 == 0) goto L_0x0083
            if (r10 == r3) goto L_0x0083
            r0 = 2
            if (r10 == r0) goto L_0x0083
        L_0x002f:
            if (r10 == r3) goto L_0x00cb
            r0 = 2
            if (r10 == r0) goto L_0x0068
            r0 = 3
            if (r10 == r0) goto L_0x003d
            java.lang.String r0 = "Unknown request code"
            X.C18740tg.A0D(r4, r0)
        L_0x003c:
            return
        L_0x003d:
            com.whatsapp.voipcalling.CallState r0 = r5.callState
            boolean r0 = com.whatsapp.voipcalling.Voip.A09(r0)
            if (r0 == 0) goto L_0x003c
            X.6YM r7 = r8.A0r
            java.lang.String r6 = r8.A1i
            boolean r0 = r7.A0r(r6)
            if (r0 != 0) goto L_0x00c7
            android.telephony.TelephonyManager r5 = r7.A23
            X.0yE r0 = r7.A2j
            int r2 = X.AnonymousClass3UL.A00(r5, r0)
            if (r2 == 0) goto L_0x00be
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "voip/acceptCall/cellularCallInProgress "
            X.C36321k7.A1U(r0, r1, r2)
            java.lang.String r0 = "busy"
            r7.A0i(r6, r0, r3)
            return
        L_0x0068:
            boolean r0 = r5.isPeerRequestingUpgrade()
            if (r0 == 0) goto L_0x003c
            com.whatsapp.voipcalling.Voip.refreshVideoDevice()
            X.711 r0 = r8.A0x
            r0.A06()
            X.6YM r0 = r8.A0r
            X.C90464aC.A14(r0)
            java.util.concurrent.ScheduledThreadPoolExecutor r1 = r0.A1E
            X.74U r0 = X.AnonymousClass74U.A00
            r1.execute(r0)
            return
        L_0x0083:
            X.1PW r1 = r8.A0s
            java.lang.String r0 = "refresh_notification"
            X.C132636Up.A00(r1, r0)
        L_0x008a:
            if (r10 != 0) goto L_0x002f
            boolean r0 = r5.videoEnabled
            if (r0 == 0) goto L_0x009a
            if (r2 == 0) goto L_0x009a
            com.whatsapp.voipcalling.Voip.refreshVideoDevice()
            X.711 r0 = r8.A0x
            r0.A06()
        L_0x009a:
            com.whatsapp.voipcalling.CallState r0 = r5.callState
            boolean r0 = com.whatsapp.voipcalling.Voip.A09(r0)
            if (r0 == 0) goto L_0x003c
            com.whatsapp.jid.UserJid r2 = X.C90494aF.A0M(r5)
            boolean r1 = r5.videoEnabled
            r0 = -1
            boolean r0 = A1N(r2, r8, r0, r1)
            if (r0 == 0) goto L_0x003c
            X.6YM r1 = r8.A0r
            java.lang.String r0 = r8.A1i
            r1.A0h(r0, r3, r4)
            return
        L_0x00b7:
            int r2 = r2 + 1
            goto L_0x0014
        L_0x00bb:
            r2 = 0
            goto L_0x0022
        L_0x00be:
            if (r5 == 0) goto L_0x00c7
            android.telephony.PhoneStateListener r1 = r7.A0i
            r0 = 32
            r5.listen(r1, r0)
        L_0x00c7:
            r7.A0h(r6, r3, r4)
            return
        L_0x00cb:
            java.lang.String r0 = "voip/VoipActivityV2/onPermissionsGranted switching to video call"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.6YM r0 = r8.A0r
            r0.A0P()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.VoipActivityV2.Bcd(java.lang.String[], int):void");
    }

    public void Bdp(boolean z) {
        C18740tg.A01();
        Window window = getWindow();
        View childAt = C36411kG.A0P(window.getDecorView(), 16908290).getChildAt(0);
        if (childAt == null) {
            Log.w("voip/voipactivity/ear-near - failed to get view.");
            return;
        }
        WindowManager.LayoutParams attributes = window.getAttributes();
        if (z) {
            Log.i("voip/voipactivity/ear-near. changing visibility of the window.");
            if (childAt.getVisibility() == 0) {
                attributes.flags |= EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH;
                attributes.screenBrightness = 0.1f;
                window.getDecorView().setSystemUiVisibility(window.getDecorView().getSystemUiVisibility() | 2);
                childAt.setVisibility(4);
                window.setAttributes(attributes);
            }
            this.A05.removeMessages(2);
            this.A05.sendEmptyMessageDelayed(2, 3000);
            return;
        }
        Log.i("voip/voipactivity/ear-far. changing visibility of the window.");
        if (childAt.getVisibility() == 4) {
            attributes.flags &= -1025;
            attributes.screenBrightness = -1.0f;
            window.getDecorView().setSystemUiVisibility(window.getDecorView().getSystemUiVisibility() & -3);
            childAt.setVisibility(0);
            window.setAttributes(attributes);
        }
        this.A05.removeMessages(2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0022, code lost:
        if (X.C36351kA.A1W(r0.A0D) == false) goto L_0x0024;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0033, code lost:
        if (r0.A0B() != true) goto L_0x0035;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BwZ(com.whatsapp.voipcalling.CallInfo r11, int r12, boolean r13) {
        /*
            r10 = this;
            X.C18740tg.A01()
            com.whatsapp.voipcalling.VoipCallControlBottomSheetV2 r0 = r10.A1a
            if (r0 == 0) goto L_0x0043
            com.whatsapp.calling.views.VoipCallFooter r2 = r0.A0U
            if (r2 == 0) goto L_0x0043
            X.6YM r0 = r10.A0r
            if (r0 == 0) goto L_0x0044
            java.lang.String r4 = r0.A1B
        L_0x0011:
            com.whatsapp.calling.avatar.viewmodel.CallAvatarViewModel r0 = r10.A0a
            boolean r7 = r0.A0T()
            com.whatsapp.calling.screenshare.ScreenShareViewModel r0 = r10.A0q
            if (r0 == 0) goto L_0x0024
            X.1hi r0 = r0.A0D
            boolean r0 = X.C36351kA.A1W(r0)
            r8 = 1
            if (r0 != 0) goto L_0x0025
        L_0x0024:
            r8 = 0
        L_0x0025:
            X.6ro r0 = r10.A0l
            if (r0 == 0) goto L_0x0035
            X.9nR r0 = X.C108915Vl.A00
            r1 = 1
            if (r0 == 0) goto L_0x0035
            boolean r0 = r0.A0B()
            r9 = 1
            if (r0 == r1) goto L_0x0036
        L_0x0035:
            r9 = 0
        L_0x0036:
            r3 = r11
            r5 = r12
            r6 = r13
            r2.A04(r3, r4, r5, r6, r7, r8, r9)
            X.6T1 r0 = r10.A0t
            if (r0 == 0) goto L_0x0043
            r0.A01(r11)
        L_0x0043:
            return
        L_0x0044:
            r4 = 0
            goto L_0x0011
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.VoipActivityV2.BwZ(com.whatsapp.voipcalling.CallInfo, int, boolean):void");
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return super.dispatchTouchEvent(motionEvent);
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        CallGridViewModel callGridViewModel = this.A0e;
        if (callGridViewModel == null) {
            return;
        }
        if (C90474aD.A1X(callGridViewModel.A10) || C90474aD.A1X(callGridViewModel.A12)) {
            boolean A1S2 = AnonymousClass000.A1S(configuration.orientation, 2);
            C34831hi r1 = callGridViewModel.A0k;
            if (C36351kA.A1W(r1) != A1S2) {
                C36341k9.A18(r1, A1S2);
            }
        }
    }

    public void onDestroy() {
        super.onDestroy();
        CallGrid callGrid = this.A2A;
        if (callGrid != null) {
            this.A06.A05(callGrid.A0Y);
        }
        Handler handler = this.A05;
        if (handler != null) {
            handler.removeCallbacksAndMessages((Object) null);
        }
        CallDetailsLayout callDetailsLayout = this.A0W;
        if (callDetailsLayout != null) {
            callDetailsLayout.A0C.A02();
        }
        C226815j r1 = this.A2D;
        if (r1 != null) {
            this.A13.unregisterObserver(r1);
        }
        AnonymousClass6YM r2 = this.A0r;
        if (r2 != null) {
            C36321k7.A1K(r2, "voip/service/resetVoipUiIfEquals ", AnonymousClass000.A0u());
            if (r2.A0t == this) {
                r2.A0t = null;
            }
        }
        A1I(false);
        Set<VideoPort> set = this.A0w.A02;
        for (VideoPort videoPort : set) {
            if (videoPort != null) {
                videoPort.release();
            }
        }
        set.clear();
        A0I();
        VoipInCallNotifBanner voipInCallNotifBanner = this.A0d;
        if (voipInCallNotifBanner != null) {
            voipInCallNotifBanner.A00();
            this.A0d.A0M.A02();
        }
        C144206ro r22 = this.A0l;
        if (r22 != null) {
            r22.A09.A02();
            C108915Vl.A00 = null;
            r22.A06.A02(r22);
            r22.A00 = null;
        }
        this.A1Y.unregisterObserver(this.A2S);
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        C36321k7.A1K(keyEvent, "voip/VoipActivityV2/onKeyDown ", AnonymousClass000.A0u());
        boolean A1M2 = A1M(i, keyEvent);
        this.A2M = true;
        if (A1M2 || super.onKeyDown(i, keyEvent)) {
            return true;
        }
        return false;
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        StringBuilder A0u2 = AnonymousClass000.A0u();
        A0u2.append("voip/VoipActivityV2/onKeyUp ");
        A0u2.append(keyEvent);
        A0u2.append(", keyDownPressed: ");
        C36331k8.A1S(A0u2, this.A2M);
        if (this.A2M) {
            this.A2M = false;
            return super.onKeyUp(i, keyEvent);
        } else if (A1M(i, keyEvent) || super.onKeyUp(i, keyEvent)) {
            return true;
        } else {
            return false;
        }
    }

    public void onNewIntent(Intent intent) {
        String str;
        String action = intent.getAction();
        StringBuilder A0u2 = AnonymousClass000.A0u();
        A0u2.append("voip/VoipActivityV2/onNewIntent ");
        A0u2.append(intent);
        A0u2.append(", action ");
        A0u2.append(action);
        A0u2.append(", is finishing ");
        C36331k8.A1S(A0u2, isFinishing());
        super.onNewIntent(intent);
        setIntent(intent);
        this.A1p = false;
        this.A2I = false;
        this.A1i = intent.getStringExtra("call_id");
        CallInfo A012 = A01(this);
        if (A012 != null) {
            if (this.A1i == null) {
                this.A1i = A012.callId;
            }
            if (Voip.A09(A012.callState)) {
                AnonymousClass1RJ r2 = this.A1V;
                if (r2.A00 == null) {
                    r2.A03(0);
                    this.A0W = (CallDetailsLayout) this.A1V.A01();
                }
            }
            CallHeaderViewModel callHeaderViewModel = this.A2B;
            if (callHeaderViewModel != null) {
                C95504lc.A02(callHeaderViewModel.A05, callHeaderViewModel);
            }
            CallGridViewModel callGridViewModel = this.A0e;
            if (callGridViewModel != null) {
                callGridViewModel.A0Q.A0B(this.A1i);
            }
            if (this.A0r == null) {
                this.A0s.A01(this);
            }
            ViewGroup viewGroup = this.A0F;
            boolean z = false;
            if (viewGroup != null && viewGroup.getVisibility() == 0) {
                z = true;
            }
            if (z) {
                this.A05.removeMessages(9);
                if (A012.videoEnabled) {
                    this.A0x.A06();
                }
            }
            A0t(A012, this);
            if (C114145gi.A00.equals(action)) {
                A0i(intent, A012);
            } else if (C114145gi.A08.equals(action)) {
                A0x(A012, action);
            } else if (C114145gi.A07.equals(action) || "join_call".equals(action)) {
                this.A0o.A01(A012.callId);
                this.A1m = false;
                this.A1x = true;
                if (this.A17 != null) {
                    A0z(this);
                }
                A0I();
                A0J();
                ScreenShareViewModel screenShareViewModel = this.A0q;
                if (screenShareViewModel != null && C36351kA.A1W(screenShareViewModel.A0D)) {
                    this.A0q.A0S(C108075Sb.PENDING_CALL_SCREEN);
                }
                A0u(A012, this);
                C132636Up.A00(this.A0s, "refresh_notification");
            } else if (C114145gi.A06.equals(action)) {
                String stringExtra = intent.getStringExtra("confirmationString");
                if (this.A0O == null && this.A10.A00()) {
                    Log.w("voip/VoipActivityV2/showEndCallConfirmationDialog.");
                    AnonymousClass00C.A0D(stringExtra, 1);
                    EndCallConfirmationDialogFragment endCallConfirmationDialogFragment = new EndCallConfirmationDialogFragment(this);
                    endCallConfirmationDialogFragment.A17(C36431kI.A0I("message", stringExtra));
                    this.A0O = endCallConfirmationDialogFragment;
                    A3o(endCallConfirmationDialogFragment, "EndCallConfirmationDialogFragment");
                }
            } else {
                int i = 2;
                if (C114145gi.A02.equals(action)) {
                    AnonymousClass6YM r1 = this.A0r;
                    if (r1 != null) {
                        AnonymousClass6YM.A0A(r1, (CallInfo) null, (String) null, 2);
                    }
                } else if ("com.whatsapp.intent.action.SHOW_ALERT_MESSAGE_IN_ACTIVE_CALL".equals(action)) {
                    A0j(intent, A012);
                } else if ("ACTION_AUTOMATION_BRING_TO_FRONT".equals(action)) {
                    C18740tg.A0D(false, "it can only be used in smoke or automation");
                } else if (C114145gi.A01.equals(action) && this.A10.A00()) {
                    this.A05.A06(R.string.f12nameremoved, 1);
                } else if (C114145gi.A05.equals(action)) {
                    if (A012.callState == CallState.PRECALLING) {
                        A10(this);
                    }
                    if (A012.isCallLinkLobbyOrJoiningState()) {
                        AnonymousClass6YM r12 = this.A0r;
                        if (r12 != null) {
                            String str2 = A012.callId;
                            Log.i("voip/call/reject");
                            r12.A1E.execute(new C1496872i(str2));
                        }
                        finish();
                    } else {
                        if (intent.getBooleanExtra("pendingCall", false)) {
                            i = 7;
                        }
                        BnL(i);
                    }
                } else if (C114145gi.A03.equals(action)) {
                    AnonymousClass6YM r13 = this.A0r;
                    if (r13 != null) {
                        Log.i("voip/call/join call link");
                        if (!r13.A2a.A09()) {
                            r13.A28.A04(R.string.f12nameremoved, 0);
                        } else {
                            r13.A1E.execute(AnonymousClass74V.A00);
                        }
                    }
                } else {
                    if (isFinishing()) {
                        str = "voip/VoipActivityV2/new-intent activity is finishing, do nothing";
                    } else if (C34681hT.A0T(A012)) {
                        str = "voip/VoipActivityV2/new-intent the WhatsApp call is active, do nothing";
                    } else {
                        if (this.A00 != 3) {
                            A0Q(3);
                        }
                        A0u(A012, this);
                        if (intent.getBooleanExtra("newCall", false)) {
                            Log.i("voip/VoipActivityV2/onNewIntent/NewCall clearing states");
                            this.A1m = intent.getBooleanExtra("callAccepted", false);
                            this.A05.removeMessages(9);
                            A3s();
                        }
                    }
                    Log.e(str);
                    return;
                }
            }
            this.A1D.A03(7, "VoipActivity1");
        }
    }

    public void onPause() {
        super.onPause();
        this.A1s = false;
        this.A2J = false;
        if (this.A00 == 0) {
            A0H();
        }
        AppSettingsWarningDialogFragment appSettingsWarningDialogFragment = this.A2C;
        if (appSettingsWarningDialogFragment != null && (!appSettingsWarningDialogFragment.A12() || appSettingsWarningDialogFragment.A00 == 1)) {
            A3q("AppSettingsWarningDialogFragment");
            this.A2C = null;
        }
        A3p(C108255Su.ACTIVITY_PAUSE);
    }

    public void onPictureInPictureModeChanged(boolean z, Configuration configuration) {
        super.onPictureInPictureModeChanged(z, configuration);
        C18740tg.A07(this.A03, "PiP params builder is null");
        boolean z2 = false;
        int i = 1;
        if (z) {
            this.A1r = true;
            CallGridViewModel callGridViewModel = this.A0e;
            C001700s r1 = callGridViewModel.A0I;
            if (r1.A04() != null) {
                CallGridViewModel.A0L(callGridViewModel, (UserJid) r1.A04());
            }
            A0H();
            A3p(C108255Su.PICTURE_IN_PICTURE);
            AnonymousClass6YM r2 = this.A0r;
            if (r2 != null) {
                Log.i("VoiceService:onEnterPictureInPicture");
                r2.A0W = System.currentTimeMillis();
            }
            if (this.A1t && getIntent().getBooleanExtra("isTaskRoot", true)) {
                startActivity(AnonymousClass190.A03(this));
            }
        } else {
            this.A1r = false;
            A0K();
            AnonymousClass6YM r0 = this.A0r;
            if (r0 != null) {
                r0.A0O();
            }
            this.A1t = false;
            i = 2;
        }
        A0Q(i);
        C20810yC r12 = this.A0D;
        CallInfo A012 = A01(this);
        if (r12.A07(3153) >= 4 && A012 != null && A012.videoEnabled && A012.self.A0K) {
            C123765x3 r13 = this.A0n;
            if (((DisplayManager) getSystemService("display")).getDisplay(0).getRotation() == 0) {
                z2 = true;
            }
            if (!z || z2) {
                r13.A05.A00();
            } else {
                C128896Ea r14 = r13.A05;
                if (!r14.A01) {
                    r14.A02();
                }
            }
        }
        CallInfo A013 = A01(this);
        if (A013 != null && A013.videoEnabled) {
            A17(this);
            C1265364k r15 = this.A0c;
            r15.A01 = 0.0f;
            r15.A00();
            Voip.processPipModeChange(z);
        }
    }

    public void onStart() {
        super.onStart();
        View view = this.A26;
        if (view != null) {
            this.A1v = true;
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
            AnonymousClass6YM r0 = this.A0r;
            if (r0 != null) {
                r0.A1R = false;
            }
            this.A0k.Bh9(this.A0A);
            CallInfo A012 = A01(this);
            if (A012 != null && A012.callState != CallState.NONE) {
                if (A012.isPeerRequestingUpgrade()) {
                    this.A1m = false;
                }
                A0t(A012, this);
                A0u(A012, this);
                C95504lc.A04(this.A0e);
                if (this.A2K || ("join_call".equals(getIntent().getAction()) && Voip.A0A(A012.callState))) {
                    C132636Up.A00(this.A0s, "refresh_notification");
                    this.A2K = false;
                }
                if (A012.videoEnabled) {
                    if (!C114145gi.A07.equals(getIntent().getAction()) && !AnonymousClass000.A1S(A012.self.A06, 6)) {
                        this.A1n = false;
                        A0v(A012, this);
                    }
                    AnonymousClass6YM r2 = this.A0r;
                    if (r2 != null && this.A1r) {
                        Log.i("VoiceService:onEnterPictureInPicture");
                        r2.A0W = System.currentTimeMillis();
                    }
                }
                Log.i("voip/VoipActivityV2/bindService");
                this.A0s.A01(this);
            } else if (getIntent().hasExtra("showCallFailedMessage")) {
                A1H(this.A1h);
            } else {
                finish();
                Log.e("voip/VoipActivityV2/onStart call_not_active, finishing");
            }
        }
    }

    public void onStop() {
        CallState callState;
        super.onStop();
        AnonymousClass5M6 r0 = this.A0i;
        if (r0 != null) {
            r0.A0D(true);
        }
        this.A0k.Bho();
        if (!getIntent().getBooleanExtra("joinable", false)) {
            A1I(false);
            this.A1v = false;
            View view = this.A26;
            if (view != null) {
                C36351kA.A1C(view, this);
            }
            Handler handler = this.A05;
            if (handler != null) {
                handler.removeCallbacksAndMessages((Object) null);
            }
            CallInfo A012 = A01(this);
            if (!(A012 == null || (callState = A012.callState) == CallState.NONE)) {
                if (callState == CallState.RECEIVED_CALL && !this.A0B.A01() && !this.A1m) {
                    Bundle A072 = AnonymousClass001.A07();
                    A072.putInt("notification_type", 1);
                    StringBuilder A0u2 = AnonymousClass000.A0u();
                    A0u2.append("voip/VoipActivityV2/onStop post ");
                    C36321k7.A1a(A0u2, "NOTIFICATION_HEADS_UP");
                    this.A0s.A00(new C132636Up("refresh_notification", A072));
                    this.A2K = true;
                }
                AnonymousClass6YM r1 = this.A0r;
                if (r1 != null && this.A1r) {
                    r1.A0O();
                }
                if (A012.videoEnabled) {
                    this.A1n = true;
                    A0v(A012, this);
                }
                if (this.A0r != null && !this.A0Q.A00) {
                    Log.i("voip/VoipActivityV2/onStop. App is put to background, mark to show VoipActivity again when foregrounded.");
                    this.A0r.A1R = true;
                }
            }
            A0L();
        }
    }

    public void setPictureInPictureParams(PictureInPictureParams pictureInPictureParams) {
        try {
            super.setPictureInPictureParams(pictureInPictureParams);
        } catch (IllegalArgumentException | IllegalStateException e) {
            Log.e("voip/VoipActivityV2/setPictureInPictureParams", e);
        }
    }

    public boolean onSearchRequested() {
        ContactPickerFragment contactPickerFragment = this.A17;
        if (contactPickerFragment == null) {
            return false;
        }
        contactPickerFragment.A1h();
        return true;
    }
}
