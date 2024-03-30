package com.whatsapp.calling;

import X.AnonymousClass000;
import X.AnonymousClass141;
import X.AnonymousClass16D;
import X.AnonymousClass171;
import X.AnonymousClass1C6;
import X.AnonymousClass1LI;
import X.AnonymousClass1Pp;
import X.AnonymousClass1QZ;
import X.AnonymousClass1RJ;
import X.AnonymousClass1RY;
import X.AnonymousClass3SF;
import X.AnonymousClass3U5;
import X.AnonymousClass3UL;
import X.C011504z;
import X.C012005e;
import X.C1497172m;
import X.C162457oc;
import X.C18700tb;
import X.C18800tq;
import X.C20350xQ;
import X.C20810yC;
import X.C27731Pn;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36371kC;
import X.C36381kD;
import X.C36391kE;
import X.C36441kJ;
import X.C88514Sz;
import X.C90514aH;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.components.button.ThumbnailButton;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.voipcalling.CallInfo;
import com.whatsapp.voipcalling.CallState;
import com.whatsapp.voipcalling.Voip;
import java.util.List;

@Deprecated
public class CallDetailsLayout extends LinearLayout implements C18700tb {
    public int A00;
    public int A01;
    public FrameLayout A02;
    public TextView A03;
    public TextView A04;
    public AnonymousClass1LI A05;
    public AnonymousClass3SF A06;
    public ThumbnailButton A07;
    public AnonymousClass1Pp A08;
    public AnonymousClass16D A09;
    public AnonymousClass171 A0A;
    public C88514Sz A0B;
    public AnonymousClass1RY A0C;
    public C27731Pn A0D;
    public C20810yC A0E;
    public C20350xQ A0F;
    public AnonymousClass1C6 A0G;
    public AnonymousClass1RJ A0H;
    public AnonymousClass1RJ A0I;
    public AnonymousClass1RJ A0J;
    public AnonymousClass1RJ A0K;
    public AnonymousClass1QZ A0L;
    public boolean A0M;

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0017, code lost:
        if (r15.A00 != 1) goto L_0x0128;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0021  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x011f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A01(com.whatsapp.calling.CallDetailsLayout r15, com.whatsapp.voipcalling.CallState r16, boolean r17) {
        /*
            r3 = 0
            r4 = r15
            r5 = r16
            if (r17 != 0) goto L_0x0128
            boolean r0 = com.whatsapp.voipcalling.Voip.A0A(r5)
            r2 = 1
            if (r0 != 0) goto L_0x0019
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.CALLING
            if (r5 == r0) goto L_0x0019
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.PRE_ACCEPT_RECEIVED
            if (r5 == r0) goto L_0x0019
            int r0 = r15.A00
            if (r0 != r2) goto L_0x0128
        L_0x0019:
            com.whatsapp.components.button.ThumbnailButton r0 = r15.A07
            int r1 = r0.getVisibility()
            if (r1 != 0) goto L_0x011f
            if (r2 != 0) goto L_0x0123
            java.lang.String r1 = "voip/CallDetailsLayout/animateAvatarLayout"
            com.whatsapp.util.Log.i((java.lang.String) r1)
            com.whatsapp.voipcalling.CallState r1 = com.whatsapp.voipcalling.CallState.NONE
            if (r5 != r1) goto L_0x005d
            java.lang.String r0 = "voip/CallDetailsLayout/animateAvatarLayout return directly, no call is going on"
        L_0x002e:
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x0031:
            android.content.res.Resources r1 = r4.getResources()
            r0 = 2131166913(0x7f0706c1, float:1.7948085E38)
            int r3 = r1.getDimensionPixelSize(r0)
            if (r2 == 0) goto L_0x0055
            android.content.res.Resources r1 = r4.getResources()
            r0 = 2131165510(0x7f070146, float:1.794524E38)
            int r3 = X.C36441kJ.A06(r1, r0, r3)
            android.content.res.Resources r1 = r4.getResources()
            r0 = 2131165511(0x7f070147, float:1.7945241E38)
            int r0 = r1.getDimensionPixelSize(r0)
            int r3 = r3 - r0
        L_0x0055:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            A00(r4, r0)
            return
        L_0x005d:
            int r5 = r15.A00
            r14 = 1
            if (r5 != r14) goto L_0x006d
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "voip/CallDetailsLayout/animateAvatarLayout return directly, avatarAnimationState: "
            java.lang.String r0 = X.AnonymousClass000.A0r(r0, r1, r5)
            goto L_0x002e
        L_0x006d:
            int r5 = r0.getVisibility()
            r1 = 8
            if (r5 != r1) goto L_0x0078
            java.lang.String r0 = "voip/CallDetailsLayout/animateAvatarLayout return directly, peerAvatarLayout.getVisibility() == View.GONE "
            goto L_0x002e
        L_0x0078:
            int r1 = r0.getHeight()
            if (r1 != 0) goto L_0x0089
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r3)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r3)
            r0.measure(r5, r1)
        L_0x0089:
            r15.A00 = r14
            r1 = 3
            android.animation.ObjectAnimator[] r5 = new android.animation.ObjectAnimator[r1]
            if (r17 != 0) goto L_0x00aa
            android.view.ViewPropertyAnimator r1 = r0.animate()
            r0 = 0
            android.view.ViewPropertyAnimator r3 = r1.alpha(r0)
            r0 = 200(0xc8, double:9.9E-322)
            android.view.ViewPropertyAnimator r3 = r3.setDuration(r0)
            r1 = 12
            X.7oQ r0 = new X.7oQ
            r0.<init>(r15, r1)
            X.C90514aH.A1E(r0, r3)
            goto L_0x0031
        L_0x00aa:
            int r1 = r0.getMeasuredHeight()
            r10 = 1065353216(0x3f800000, float:1.0)
            r11 = 0
            r6 = 125(0x7d, double:6.2E-322)
            r15 = 1056964608(0x3f000000, float:0.5)
            android.view.animation.ScaleAnimation r9 = new android.view.animation.ScaleAnimation
            r12 = 1065353216(0x3f800000, float:1.0)
            r13 = 0
            r16 = 1
            r17 = 1056964608(0x3f000000, float:0.5)
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17)
            android.view.animation.DecelerateInterpolator r8 = new android.view.animation.DecelerateInterpolator
            r8.<init>()
            r9.setInterpolator(r8)
            r9.setDuration(r6)
            r0.startAnimation(r9)
            int r1 = -r1
            float r8 = (float) r1
            java.lang.String r7 = "translationY"
            float[] r1 = new float[r14]
            r1[r3] = r8
            android.animation.ObjectAnimator r6 = android.animation.ObjectAnimator.ofFloat(r0, r7, r1)
            X.C36391kE.A13(r6)
            r0 = 125(0x7d, double:6.2E-322)
            r6.setDuration(r0)
            r5[r3] = r6
            android.widget.TextView r1 = r4.A04
            float[] r0 = new float[r14]
            r0[r3] = r8
            android.animation.ObjectAnimator r6 = android.animation.ObjectAnimator.ofFloat(r1, r7, r0)
            X.C36391kE.A13(r6)
            r0 = 125(0x7d, double:6.2E-322)
            r6.setDuration(r0)
            r5[r14] = r6
            r6 = 2
            android.widget.TextView r1 = r4.A03
            float[] r0 = new float[r14]
            r0[r3] = r8
            android.animation.ObjectAnimator r3 = android.animation.ObjectAnimator.ofFloat(r1, r7, r0)
            X.C36391kE.A13(r3)
            r0 = 125(0x7d, double:6.2E-322)
            r3.setDuration(r0)
            r5[r6] = r3
            android.animation.AnimatorSet r1 = X.C36441kJ.A0C()
            r1.playTogether(r5)
            r1.start()
            r0 = 11
            X.C162337oQ.A00(r1, r4, r0)
            goto L_0x0031
        L_0x011f:
            if (r2 != 0) goto L_0x0123
            r3 = 8
        L_0x0123:
            r0.setVisibility(r3)
            goto L_0x0031
        L_0x0128:
            r2 = 0
            goto L_0x0019
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.CallDetailsLayout.A01(com.whatsapp.calling.CallDetailsLayout, com.whatsapp.voipcalling.CallState, boolean):void");
    }

    private void setCallDetailsDescription(List list, CallInfo callInfo) {
        String str;
        String str2;
        setFocusable(true);
        C011504z.A06(this.A07, 1);
        boolean isAudioChat = callInfo.isAudioChat();
        GroupJid groupJid = callInfo.groupJid;
        AnonymousClass16D r10 = this.A09;
        AnonymousClass171 r9 = this.A0A;
        AnonymousClass141 A012 = AnonymousClass3UL.A01(r10, this.A0F, groupJid, this.A0G, isAudioChat);
        if (A012 != null) {
            str = C36381kD.A0v(r9, A012);
        } else {
            str = null;
        }
        String str3 = str;
        if (str == null) {
            str = C90514aH.A0t(getContext(), r10, r9, list);
        }
        if (Voip.A0A(callInfo.callState)) {
            Context context = getContext();
            boolean z = callInfo.videoEnabled;
            int i = R.string.f12nameremoved;
            if (z) {
                i = R.string.f12nameremoved;
            }
            str2 = context.getString(i);
            C011504z.A06(this.A03, 2);
            if (str3 != null) {
                TextView textView = this.A04;
                Context context2 = getContext();
                Object[] A1Q = C36441kJ.A1Q();
                A1Q[0] = str2;
                C36371kC.A1K(r9, C36441kJ.A0i(r10, callInfo.getPeerJid()), A1Q, 1);
                textView.setContentDescription(C36391kE.A0v(context2, str, A1Q, 2, R.string.f12nameremoved));
                return;
            }
        } else if (!callInfo.isGroupCall || (!callInfo.isInLonelyState() && callInfo.callState != CallState.CALLING)) {
            Context context3 = getContext();
            boolean z2 = callInfo.videoEnabled;
            int i2 = R.string.f12nameremoved;
            if (z2) {
                i2 = R.string.f12nameremoved;
            }
            str2 = context3.getString(i2);
            TextView textView2 = this.A03;
            C011504z.A06(textView2, 1);
            textView2.setFocusable(true);
        } else {
            TextView textView3 = this.A04;
            Context context4 = getContext();
            boolean z3 = callInfo.videoEnabled;
            int i3 = R.string.f12nameremoved;
            if (z3) {
                i3 = R.string.f12nameremoved;
            }
            textView3.setContentDescription(C36351kA.A0w(context4, str, 1, i3));
            C011504z.A06(this.A03, 2);
            return;
        }
        TextView textView4 = this.A04;
        Context context5 = getContext();
        Object[] objArr = new Object[2];
        objArr[0] = str2;
        textView4.setContentDescription(C36391kE.A0v(context5, str, objArr, 1, R.string.f12nameremoved));
    }

    public void A04(CallState callState, boolean z, boolean z2) {
        if (!z2 && callState != CallState.ACTIVE && callState != CallState.CONNECTED_LONELY && callState != CallState.ACCEPT_SENT) {
            A01(this, callState, z);
            setAlpha(1.0f);
            setVisibility(0);
            setBackgroundColor(0);
        } else if (this.A00 != 1) {
            setVisibility(8);
            this.A07.setVisibility(8);
        }
    }

    public void A03(CallInfo callInfo) {
        AnonymousClass141 A0D2;
        ThumbnailButton thumbnailButton = this.A07;
        if (thumbnailButton.getVisibility() != 8) {
            if (callInfo.isGroupCall) {
                boolean isAudioChat = callInfo.isAudioChat();
                GroupJid groupJid = callInfo.groupJid;
                A0D2 = AnonymousClass3UL.A01(this.A09, this.A0F, groupJid, this.A0G, isAudioChat);
                if (A0D2 == null) {
                    return;
                }
            } else {
                UserJid peerJid = callInfo.getPeerJid();
                if (peerJid != null) {
                    A0D2 = this.A09.A0D(peerJid);
                } else {
                    return;
                }
            }
            if (this.A0E.A0E(5923)) {
                this.A0K.A03(0);
            }
            this.A0C.A06(thumbnailButton, this.A0B, A0D2, true);
        }
    }

    public void A05(String str, String str2) {
        TextView textView = this.A03;
        int i = 0;
        if (str == null) {
            i = 8;
        }
        textView.setVisibility(i);
        textView.setText(str);
        textView.setContentDescription(str2);
        if (!textView.isSelected()) {
            postDelayed(new C1497172m(this, 39), 2500);
        }
    }

    public boolean A06(CallInfo callInfo) {
        if (callInfo.isGroupCall) {
            if (callInfo.videoEnabled) {
                return true;
            }
            boolean isAudioChat = callInfo.isAudioChat();
            GroupJid groupJid = callInfo.groupJid;
            if (AnonymousClass3UL.A01(this.A09, this.A0F, groupJid, this.A0G, isAudioChat) == null) {
                return true;
            }
        }
        if (Voip.A0A(callInfo.callState) || !callInfo.videoEnabled) {
            return false;
        }
        return true;
    }

    public void clearAnimation() {
        ThumbnailButton thumbnailButton = this.A07;
        thumbnailButton.clearAnimation();
        thumbnailButton.setTranslationY(0.0f);
        thumbnailButton.setAlpha(1.0f);
        TextView textView = this.A03;
        textView.clearAnimation();
        textView.setTranslationY(0.0f);
        TextView textView2 = this.A04;
        textView2.clearAnimation();
        textView2.setTranslationY(0.0f);
        thumbnailButton.setScaleX(1.0f);
        thumbnailButton.setScaleY(1.0f);
    }

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A0L;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A0L = r0;
        }
        return r0.generatedComponent();
    }

    public String getNameViewContentDescription() {
        TextView textView = this.A04;
        if (textView.getContentDescription() != null) {
            return textView.getContentDescription().toString();
        }
        return null;
    }

    public CallDetailsLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (!this.A0M) {
            this.A0M = true;
            C18800tq A0W = C36391kE.A0W(generatedComponent());
            this.A0E = C36341k9.A0V(A0W);
            this.A0G = (AnonymousClass1C6) A0W.A7s.get();
            this.A09 = C36341k9.A0R(A0W);
            this.A0A = C36341k9.A0S(A0W);
            this.A0F = (C20350xQ) A0W.A3k.get();
            this.A08 = C36361kB.A0V(A0W);
            this.A0D = C36351kA.A0T(A0W);
            this.A05 = C36361kB.A0S(A0W);
        }
        LayoutInflater.from(context).inflate(R.layout.f9nameremoved, this, true);
        this.A04 = C36391kE.A0P(this, R.id.name);
        this.A02 = C36441kJ.A0T(this, R.id.push_name_container);
        this.A06 = AnonymousClass3SF.A01(this, this.A05, R.id.name);
        this.A03 = C36391kE.A0P(this, R.id.call_status);
        this.A01 = getResources().getColor(R.color.f6nameremoved);
        this.A0I = C36341k9.A0X(this, R.id.group_in_common);
        this.A0J = C36341k9.A0X(this, R.id.group_in_common_title);
        this.A0K = C36341k9.A0X(this, R.id.whatsapp_logo);
        C012005e.A0V(this.A03, new C162457oc(this, 3));
        ThumbnailButton thumbnailButton = (ThumbnailButton) C012005e.A02(this, R.id.contact_photo);
        this.A07 = thumbnailButton;
        thumbnailButton.A01 = -1.0f;
        this.A0B = new AnonymousClass3U5(this.A08, 1);
        this.A0H = C36341k9.A0X(this, R.id.call_details_additional_info_stub);
        this.A0C = this.A0D.A06("peer-avatar-photo", 0.0f, getResources().getDimensionPixelSize(R.dimen.f7nameremoved));
    }

    public static void A00(View view, Integer num) {
        int intValue;
        ViewGroup.MarginLayoutParams A0a = AnonymousClass000.A0a(view);
        if (num == null) {
            intValue = A0a.topMargin;
        } else {
            intValue = num.intValue();
        }
        Integer valueOf = Integer.valueOf(intValue);
        int i = A0a.bottomMargin;
        int i2 = A0a.topMargin;
        int intValue2 = valueOf.intValue();
        if (i2 != intValue2 || i != i) {
            A0a.topMargin = intValue2;
            A0a.bottomMargin = i;
            view.setLayoutParams(A0a);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0132  */
    /* JADX WARNING: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A02(com.whatsapp.voipcalling.CallInfo r10) {
        /*
            r9 = this;
            java.util.ArrayList r6 = X.AnonymousClass001.A0I()
            java.util.ArrayList r5 = X.AnonymousClass001.A0I()
            java.util.Map r0 = r10.participants
            java.util.Iterator r4 = X.AnonymousClass000.A0z(r0)
        L_0x000e:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x002b
            X.6EE r3 = X.C90524aI.A0J(r4)
            boolean r0 = r3.A0J
            if (r0 != 0) goto L_0x000e
            int r2 = r3.A02
            r1 = 1
            com.whatsapp.jid.UserJid r0 = r3.A08
            if (r2 != r1) goto L_0x0027
            r6.add(r0)
            goto L_0x000e
        L_0x0027:
            r5.add(r0)
            goto L_0x000e
        L_0x002b:
            java.util.ArrayList r6 = X.C36441kJ.A15(r6)
            r6.addAll(r5)
            r9.setCallDetailsDescription(r6, r10)
            boolean r4 = r10.isAudioChat()
            com.whatsapp.jid.GroupJid r3 = r10.groupJid
            X.16D r5 = r9.A09
            X.171 r2 = r9.A0A
            X.1C6 r1 = r9.A0G
            X.0xQ r0 = r9.A0F
            X.141 r0 = X.AnonymousClass3UL.A01(r5, r0, r3, r1, r4)
            if (r0 == 0) goto L_0x0136
            java.lang.String r7 = X.C36381kD.A0v(r2, r0)
        L_0x004d:
            int r8 = r6.size()
            boolean r0 = r10.isInLonelyState()
            if (r0 != 0) goto L_0x005a
            if (r8 != 0) goto L_0x005a
        L_0x0059:
            return
        L_0x005a:
            com.whatsapp.jid.UserJid r0 = r10.getInitialPeerJid()
            X.C18740tg.A06(r0)
            boolean r0 = r10.isInLonelyState()
            r4 = 1
            r3 = 0
            if (r0 != 0) goto L_0x0125
            com.whatsapp.voipcalling.CallState r1 = r10.callState
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.ACTIVE
            if (r1 == r0) goto L_0x0077
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.ACCEPT_SENT
            if (r1 == r0) goto L_0x0077
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.ACCEPT_RECEIVED
            if (r1 != r0) goto L_0x0125
        L_0x0077:
            r1 = 1
        L_0x0078:
            if (r8 != r4) goto L_0x0100
            com.whatsapp.jid.UserJid r0 = r10.getInitialPeerJid()
            boolean r0 = r6.contains(r0)
            if (r0 == 0) goto L_0x00f9
            com.whatsapp.jid.UserJid r0 = r10.getInitialPeerJid()
        L_0x0088:
            X.141 r6 = r5.A0D(r0)
            X.3SF r0 = r9.A06
            r0.A05(r6)
        L_0x0091:
            android.widget.FrameLayout r5 = r9.A02
            int r0 = r5.getChildCount()
            if (r0 <= r4) goto L_0x00ec
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "CallDetailsLayout/updatePushNameViews: Too many children("
            r1.append(r0)
            int r0 = r5.getChildCount()
            r1.append(r0)
            java.lang.String r0 = ")"
            X.C36321k7.A1Z(r1, r0)
            r5.removeAllViews()
        L_0x00b1:
            r0 = 0
        L_0x00b2:
            if (r6 == 0) goto L_0x0128
            X.3IL r1 = r6.A0F
            if (r1 != 0) goto L_0x0128
            boolean r1 = r10.isCaller
            if (r1 != 0) goto L_0x0128
            X.0yC r4 = r9.A0E
            r1 = 4095(0xfff, float:5.738E-42)
            boolean r1 = r4.A0E(r1)
            if (r1 == 0) goto L_0x0128
            r1 = 2131896511(0x7f1228bf, float:1.9427885E38)
            java.lang.String r2 = X.AnonymousClass171.A03(r2, r6, r1)
            boolean r1 = r2.isEmpty()
            if (r1 != 0) goto L_0x0128
            if (r0 != 0) goto L_0x00e5
            android.content.Context r1 = r9.getContext()
            r0 = 2131624303(0x7f0e016f, float:1.8875782E38)
            android.view.View r0 = X.C36421kH.A0D(r1, r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r5.addView(r0)
        L_0x00e5:
            r0.setVisibility(r3)
            r0.setText(r2)
            return
        L_0x00ec:
            int r0 = r5.getChildCount()
            if (r0 != r4) goto L_0x00b1
            android.view.View r0 = r5.getChildAt(r3)
            android.widget.TextView r0 = (android.widget.TextView) r0
            goto L_0x00b2
        L_0x00f9:
            java.lang.Object r0 = r6.get(r3)
            X.11F r0 = (X.AnonymousClass11F) r0
            goto L_0x0088
        L_0x0100:
            if (r7 != 0) goto L_0x0113
            boolean r0 = r10.videoEnabled
            if (r0 != 0) goto L_0x011c
            if (r1 == 0) goto L_0x011c
            android.content.Context r1 = r9.getContext()
            r0 = 2131890338(0x7f1210a2, float:1.9415365E38)
            java.lang.String r7 = r1.getString(r0)
        L_0x0113:
            X.3SF r1 = r9.A06
            r0 = 0
            r1.A09(r0, r7)
            r6 = 0
            goto L_0x0091
        L_0x011c:
            android.content.Context r0 = r9.getContext()
            java.lang.String r7 = X.C90514aH.A0t(r0, r5, r2, r6)
            goto L_0x0113
        L_0x0125:
            r1 = 0
            goto L_0x0078
        L_0x0128:
            if (r0 == 0) goto L_0x0059
            int r2 = r0.getVisibility()
            r1 = 8
            if (r2 == r1) goto L_0x0059
            r0.setVisibility(r1)
            return
        L_0x0136:
            r7 = 0
            goto L_0x004d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.CallDetailsLayout.A02(com.whatsapp.voipcalling.CallInfo):void");
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.A0C.A02();
    }

    public CallDetailsLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CallDetailsLayout(Context context) {
        this(context, (AttributeSet) null);
    }
}
