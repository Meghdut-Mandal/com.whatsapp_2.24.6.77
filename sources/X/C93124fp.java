package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.WaImageView;
import com.whatsapp.calling.views.VoipReturnToCallBanner;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.CallInfo;
import com.whatsapp.voipcalling.Voip;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.4fp  reason: invalid class name and case insensitive filesystem */
public abstract class C93124fp extends RelativeLayout implements C88814Ud {
    public C30531aM A00;
    public AnonymousClass1MK A01;
    public AnonymousClass6BK A02;
    public AnonymousClass7gL A03;
    public AnonymousClass16D A04;
    public AnonymousClass16I A05;
    public AnonymousClass171 A06;
    public C21060yb A07;
    public C18820ts A08;
    public AnonymousClass1HJ A09;
    public AnonymousClass1HO A0A;
    public C20810yC A0B;
    public C20350xQ A0C;
    public AnonymousClass11F A0D;
    public AnonymousClass11F A0E;
    public AnonymousClass1C6 A0F;
    public C27721Pm A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M = false;
    public boolean A0N;
    public final Runnable A0O = new C1501574e(this, 47);
    public final C226815j A0P = new C162747p5(this, 4);
    public final AnonymousClass1NK A0Q = new C163667qZ(this, 0);

    public void A01() {
        VoipReturnToCallBanner voipReturnToCallBanner = (VoipReturnToCallBanner) this;
        if (voipReturnToCallBanner.getContext() == null) {
            Log.w("voip/VoipReturnToCallBanner no context when call start");
            return;
        }
        WaImageView waImageView = voipReturnToCallBanner.A04;
        waImageView.setVisibility(0);
        boolean z = voipReturnToCallBanner.A0K;
        int i = R.drawable.ic_groupcall_voice;
        if (z) {
            i = R.drawable.ic_groupcall_video;
        }
        waImageView.setImageResource(i);
        Context context = voipReturnToCallBanner.getContext();
        boolean z2 = voipReturnToCallBanner.A0K;
        int i2 = R.string.f12nameremoved;
        if (z2) {
            i2 = R.string.f12nameremoved;
        }
        C36331k8.A0q(context, waImageView, i2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x006e, code lost:
        if (r4 == null) goto L_0x0070;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A02() {
        /*
            r5 = this;
            r3 = r5
            com.whatsapp.calling.views.VoipReturnToCallBanner r3 = (com.whatsapp.calling.views.VoipReturnToCallBanner) r3
            android.content.Context r0 = r3.getContext()
            if (r0 != 0) goto L_0x000f
            java.lang.String r0 = "voip/VoipReturnToCallBanner no context when call start"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            return
        L_0x000f:
            X.11F r1 = r3.A0D
            if (r1 == 0) goto L_0x0047
            X.11F r0 = r3.A0E
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0047
        L_0x001b:
            android.content.Context r1 = r3.getContext()
            r0 = 2131894890(0x7f12226a, float:1.9424598E38)
            java.lang.String r4 = r1.getString(r0)
            android.content.Context r2 = r3.getContext()
            boolean r1 = r3.A0K
            r0 = 2131886634(0x7f12022a, float:1.9407852E38)
            if (r1 == 0) goto L_0x0034
            r0 = 2131886633(0x7f120229, float:1.940785E38)
        L_0x0034:
            java.lang.String r2 = r2.getString(r0)
            com.whatsapp.WaImageView r1 = r3.A04
            r0 = 2
            X.C011504z.A06(r1, r0)
        L_0x003e:
            android.widget.TextView r0 = r3.A03
            r0.setText(r4)
            r0.setContentDescription(r2)
            return
        L_0x0047:
            X.11F r0 = r3.A0D
            if (r0 == 0) goto L_0x005f
            boolean r0 = r0 instanceof com.whatsapp.jid.GroupJid
            if (r0 != 0) goto L_0x005f
            boolean r0 = r3.A0M
            if (r0 != 0) goto L_0x001b
            java.lang.String r4 = r3.getTitleForContact()
            com.whatsapp.WaImageView r1 = r3.A04
            r0 = 1
        L_0x005a:
            X.C011504z.A06(r1, r0)
            r2 = r4
            goto L_0x003e
        L_0x005f:
            boolean r0 = r3.A0M
            if (r0 != 0) goto L_0x0070
            java.lang.String r4 = r3.getTitleForGroup()
            com.whatsapp.WaImageView r1 = r3.A04
            r0 = 1
            X.C011504z.A06(r1, r0)
            r2 = r4
            if (r4 != 0) goto L_0x003e
        L_0x0070:
            android.content.Context r2 = r3.getContext()
            boolean r0 = r3.A0J
            if (r0 == 0) goto L_0x0083
            r1 = 2131895999(0x7f1226bf, float:1.9426847E38)
        L_0x007b:
            java.lang.String r4 = r2.getString(r1)
            com.whatsapp.WaImageView r1 = r3.A04
            r0 = 2
            goto L_0x005a
        L_0x0083:
            boolean r0 = r3.A0K
            r1 = 2131887312(0x7f1204d0, float:1.9409228E38)
            if (r0 == 0) goto L_0x007b
            r1 = 2131887311(0x7f1204cf, float:1.9409226E38)
            goto L_0x007b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C93124fp.A02():void");
    }

    public void A03() {
        AnonymousClass11F A0M2;
        VoipReturnToCallBanner voipReturnToCallBanner = (VoipReturnToCallBanner) this;
        Boolean bool = C18750th.A01;
        CallInfo callInfo = Voip.getCallInfo();
        if (callInfo != null) {
            if (callInfo.isAudioChat()) {
                voipReturnToCallBanner.setVisibility(8);
                return;
            }
            if (callInfo.isGroupCall) {
                A0M2 = callInfo.groupJid;
            } else {
                A0M2 = C90494aF.A0M(callInfo);
            }
            voipReturnToCallBanner.A0D = A0M2;
            voipReturnToCallBanner.A0K = callInfo.videoEnabled;
            voipReturnToCallBanner.A02();
            voipReturnToCallBanner.A01();
        }
        voipReturnToCallBanner.A02.setVisibility(8);
    }

    public abstract void setCallNotificationTimer(long j);

    public void setTimerAccessibility(View view) {
        C012005e.A0V(view, new C162457oc(this, 6));
    }

    public static void A00(C93124fp r3, Collection collection) {
        AnonymousClass11F r0 = r3.A0D;
        if (r0 != null && (r0 instanceof GroupJid)) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                AnonymousClass11F r1 = C36391kE.A0f(it).A0H;
                if (r1 != null && r1.equals(r3.A0D)) {
                    r3.A02();
                }
            }
        }
    }

    public CallInfo getCallInfo() {
        Boolean bool = C18750th.A01;
        return Voip.getCallInfo();
    }

    public String getTitleForContact() {
        AnonymousClass141 A082;
        AnonymousClass11F r1 = this.A0D;
        if (r1 == null || (A082 = this.A04.A08(r1)) == null) {
            return null;
        }
        return this.A06.A0H(A082);
    }

    public String getTitleForGroup() {
        GroupJid groupJid;
        AnonymousClass11F r5 = this.A0D;
        if (r5 != null) {
            groupJid = (GroupJid) r5;
        } else {
            groupJid = null;
        }
        AnonymousClass16D r4 = this.A04;
        AnonymousClass171 r3 = this.A06;
        AnonymousClass141 A012 = AnonymousClass3UL.A01(r4, this.A0C, groupJid, this.A0F, false);
        if (A012 != null) {
            return C36381kD.A0v(r3, A012);
        }
        return null;
    }

    public void setBannerClickListener(Context context, View view) {
        C48812i6.A00(view, context, this, 27);
    }

    public void setShouldHideBanner(boolean z) {
        this.A0N = z;
        setVisibility(C36351kA.A00(this.A01.A00() ? 1 : 0));
    }

    public void setShouldHideCallDuration(boolean z) {
        this.A0L = z;
        setVisibility(C36351kA.A00(this.A01.A00() ? 1 : 0));
    }

    public void setShouldShowGenericContactOrGroupName(boolean z) {
        this.A0M = z;
        A02();
    }

    public void setVisibility(int i) {
        AnonymousClass7gL r1;
        removeCallbacks(this.A0O);
        int visibility = getVisibility();
        if (this.A0N) {
            i = 8;
        }
        super.setVisibility(i);
        VoipReturnToCallBanner voipReturnToCallBanner = (VoipReturnToCallBanner) this;
        int i2 = 8;
        voipReturnToCallBanner.A04.setVisibility(C36381kD.A00(voipReturnToCallBanner.A0L ? 1 : 0));
        TextView textView = voipReturnToCallBanner.A02;
        if (!voipReturnToCallBanner.A0L && voipReturnToCallBanner.A0H) {
            i2 = 0;
        }
        textView.setVisibility(i2);
        if (visibility != getVisibility() && (r1 = this.A03) != null) {
            r1.BkW(getVisibility());
        }
    }

    public C93124fp(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public int getBackgroundColorRes() {
        return C224514j.A00(getContext(), R.attr.f4nameremoved, R.color.f6nameremoved);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.A05.registerObserver(this.A0P);
        AnonymousClass7gL r1 = this.A03;
        if (r1 != null) {
            r1.BkW(getVisibility());
        }
        if (this.A02 != null && this.A0B.A0E(6989)) {
            AnonymousClass6BK r0 = this.A02;
            boolean z = r0.A02;
            boolean z2 = r0.A01;
            boolean z3 = r0.A00;
            if (z) {
                setVisibility(8);
            } else {
                this.A0J = z2;
                this.A0I = z3;
                A03();
                this.A0O.run();
            }
        }
        this.A02 = null;
        this.A0G.registerObserver(this.A0Q);
        A03();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.A0H = false;
        this.A0G.unregisterObserver(this.A0Q);
        this.A05.unregisterObserver(this.A0P);
    }

    public void setCallLogData(AnonymousClass6BK r1) {
        this.A02 = r1;
    }

    public void setContainerChatJid(AnonymousClass11F r1) {
        this.A0E = r1;
    }

    public void setVisibilityChangeListener(AnonymousClass7gL r1) {
        this.A03 = r1;
    }
}
