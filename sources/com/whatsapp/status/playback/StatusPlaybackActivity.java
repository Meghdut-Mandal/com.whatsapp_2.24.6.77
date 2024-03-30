package com.whatsapp.status.playback;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass02E;
import X.AnonymousClass07S;
import X.AnonymousClass11F;
import X.AnonymousClass16E;
import X.AnonymousClass1CR;
import X.AnonymousClass1N6;
import X.AnonymousClass261;
import X.AnonymousClass332;
import X.AnonymousClass3BK;
import X.AnonymousClass3G6;
import X.AnonymousClass3LC;
import X.AnonymousClass3OH;
import X.AnonymousClass3PC;
import X.AnonymousClass3S6;
import X.AnonymousClass3TM;
import X.AnonymousClass5NR;
import X.AnonymousClass6KH;
import X.B44;
import X.C18740tg;
import X.C18950u5;
import X.C19430v1;
import X.C202289lT;
import X.C20830yE;
import X.C21710zg;
import X.C29731Xt;
import X.C35661j3;
import X.C36321k7;
import X.C36421kH;
import X.C36441kJ;
import X.C38971qi;
import X.C45592Ry;
import X.C47592fB;
import X.C61093An;
import X.C61103Ao;
import X.C64933Qa;
import X.C65303Rn;
import X.C67263Zd;
import X.C80473vS;
import X.C88164Rq;
import X.C88584Tg;
import android.content.Intent;
import android.graphics.Rect;
import android.media.AudioManager;
import android.os.Handler;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.animation.Interpolator;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment;
import com.whatsapp.status.playback.fragment.StatusPlaybackFragment;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class StatusPlaybackActivity extends AnonymousClass261 implements C88164Rq {
    public static final Interpolator A0Q = C67263Zd.A00;
    public C64933Qa A00;
    public Runnable A01;
    public boolean A02;
    public boolean A03;
    public boolean A04 = false;
    public int A05;
    public int A06 = 0;
    public int A07 = 0;
    public ViewPager A08;
    public C20830yE A09;
    public AnonymousClass16E A0A;
    public AnonymousClass1CR A0B;
    public C29731Xt A0C;
    public AnonymousClass3G6 A0D;
    public AnonymousClass3S6 A0E;
    public AnonymousClass3PC A0F;
    public AnonymousClass1N6 A0G;
    public AnonymousClass3OH A0H;
    public boolean A0I;
    public boolean A0J;
    public float A0K = 3.5f;
    public int A0L;
    public int A0M = -1;
    public long A0N;
    public C38971qi A0O;
    public final Rect A0P = AnonymousClass001.A06();

    public int A2I() {
        return 78318969;
    }

    public boolean A2g() {
        return false;
    }

    public static void A01(StatusPlaybackActivity statusPlaybackActivity, String str, int i, int i2) {
        int A002 = statusPlaybackActivity.A0D.A00(str);
        if (A002 >= 0 && A002 < statusPlaybackActivity.A0D.A01.size()) {
            if (A002 != statusPlaybackActivity.A08.getCurrentItem()) {
                statusPlaybackActivity.A0D.A01.remove(A002);
                int i3 = statusPlaybackActivity.A05;
                if (A002 <= i3) {
                    statusPlaybackActivity.A05 = i3 - 1;
                }
                int i4 = statusPlaybackActivity.A0M;
                if (A002 <= i4) {
                    statusPlaybackActivity.A0M = i4 - 1;
                }
                statusPlaybackActivity.A08.getAdapter().A09();
            } else if (statusPlaybackActivity.A02 || A002 == C36421kH.A06(statusPlaybackActivity.A0D.A01, 1)) {
                statusPlaybackActivity.finish();
            } else {
                statusPlaybackActivity.A01 = new C80473vS(statusPlaybackActivity, str, i, i2);
                statusPlaybackActivity.BZP(str, i, i2, true);
            }
        }
    }

    public StatusPlaybackFragment A3i(int i) {
        AnonymousClass3G6 r0 = this.A0D;
        if (r0 == null || i < 0 || i >= r0.A01.size()) {
            return null;
        }
        return A3j((AnonymousClass332) this.A0D.A01.get(i));
    }

    public StatusPlaybackFragment A3j(AnonymousClass332 r6) {
        String rawString;
        if (r6 == null || (rawString = r6.A00.A09.getRawString()) == null) {
            return null;
        }
        for (AnonymousClass02E r1 : A2m()) {
            if (r1 instanceof StatusPlaybackFragment) {
                StatusPlaybackFragment statusPlaybackFragment = (StatusPlaybackFragment) r1;
                if (rawString.equals(statusPlaybackFragment.A1Z())) {
                    return statusPlaybackFragment;
                }
            }
        }
        return null;
    }

    public boolean BZP(String str, int i, int i2, boolean z) {
        ViewPager viewPager;
        int i3;
        int A002 = this.A0D.A00(str);
        if (z) {
            this.A07 = i;
            this.A06 = i2;
            if (A002 >= C36421kH.A06(this.A0D.A01, 1) || this.A02) {
                finish();
                return true;
            }
            this.A0O.A00 = this.A0K;
            this.A0K = 3.5f;
            viewPager = this.A08;
            i3 = A002 + 1;
        } else if (A002 <= 0 || this.A02) {
            return false;
        } else {
            this.A0O.A00 = this.A0K;
            this.A0K = 3.5f;
            this.A07 = i;
            this.A06 = i2;
            viewPager = this.A08;
            i3 = A002 - 1;
        }
        viewPager.A0J(i3, true);
        this.A0O.A00 = 0.0f;
        return true;
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        float f;
        if (!this.A0O.isFinished() && this.A0O.timePassed() < this.A0O.getDuration() / 2) {
            return false;
        }
        if (motionEvent.getActionMasked() == 0) {
            long eventTime = motionEvent.getEventTime() - this.A0N;
            if (eventTime == 0 || eventTime > 1000) {
                f = 3.5f;
            } else {
                f = ((((float) eventTime) * 2.5f) / 1000.0f) + 1.0f;
            }
            this.A0K = f;
            this.A0N = motionEvent.getEventTime();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        boolean z = true;
        if (i == 10) {
            if (i2 != -1) {
                z = false;
            }
            this.A0I = z;
        } else if (i != 151) {
            super.onActivityResult(i, i2, intent);
        } else if (i2 == -1) {
            this.A03 = true;
            AnonymousClass07S adapter = this.A08.getAdapter();
            C18740tg.A06(adapter);
            adapter.A09();
            this.A08.setCurrentItem(this.A0L);
        } else {
            finish();
        }
    }

    public void onBackPressed() {
        AnonymousClass3LC A052;
        StatusPlaybackFragment A3i = A3i(this.A08.getCurrentItem());
        if (!(A3i == null || (A052 = StatusPlaybackContactFragment.A05((StatusPlaybackContactFragment) A3i)) == null)) {
            C47592fB r3 = (C47592fB) A052;
            BottomSheetBehavior bottomSheetBehavior = r3.A01;
            if (bottomSheetBehavior.A0J == 3) {
                bottomSheetBehavior.A0W(4);
                return;
            }
            AnonymousClass3BK A0E2 = r3.A0E();
            if (A0E2.A0F.A0K()) {
                A0E2.A0F.setExpanded(false);
                A0E2.A0A.setVisibility(A0E2.A0F.getVisibility());
                r3.A0H();
                return;
            }
            r3.A0D();
        }
        this.A07 = 3;
        super.onBackPressed();
    }

    public C21710zg A2K() {
        C21710zg A2K = super.A2K();
        C36321k7.A0s(A2K, this);
        return A2K;
    }

    public C18950u5 BGv() {
        return C19430v1.A01;
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int i;
        int keyCode = keyEvent.getKeyCode();
        if (keyEvent.getAction() != 0 || (keyCode != 24 && keyCode != 25)) {
            return super.dispatchKeyEvent(keyEvent);
        }
        AnonymousClass3S6 r8 = this.A0E;
        boolean A1S = AnonymousClass000.A1S(keyCode, 24);
        AudioManager A0D2 = r8.A06.A0D();
        if (A0D2 != null) {
            int streamVolume = A0D2.getStreamVolume(3);
            int streamMaxVolume = A0D2.getStreamMaxVolume(3);
            if (A1S) {
                if (streamVolume < streamMaxVolume) {
                    A0D2.adjustSuggestedStreamVolume(1, 3, 16);
                    i = streamVolume + 1;
                }
                i = streamVolume;
            } else {
                if (streamVolume > 0) {
                    A0D2.adjustSuggestedStreamVolume(-1, 3, 16);
                    i = streamVolume - 1;
                }
                i = streamVolume;
            }
            List<C88584Tg> list = r8.A02;
            if (list != null) {
                for (C88584Tg BRW : list) {
                    BRW.BRW(streamVolume, i, streamMaxVolume);
                }
            }
        }
        AnonymousClass3S6 r1 = this.A0E;
        if (r1.A03) {
            r1.A03 = false;
            List<C88584Tg> list2 = r1.A02;
            if (list2 != null) {
                for (C88584Tg BRU : list2) {
                    BRU.BRU(false);
                }
            }
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:66:0x01c7, code lost:
        if (r11.A0D.A0E(5558) == false) goto L_0x01c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01cf, code lost:
        if (r1 != false) goto L_0x01d1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01ff  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r12) {
        /*
            r11 = this;
            super.onCreate(r12)
            X.0yC r1 = r11.A0D
            r0 = 6210(0x1842, float:8.702E-42)
            boolean r0 = r1.A0E(r0)
            r5 = 0
            android.view.Window r1 = r11.getWindow()
            if (r0 == 0) goto L_0x0072
            X.AnonymousClass0Q4.A00(r1, r5)
            X.C36331k8.A0l(r11)
            android.view.Window r0 = r11.getWindow()
            r0.setStatusBarColor(r5)
        L_0x001f:
            android.view.Window r0 = r11.getWindow()
            X.C24801Dv.A04(r0)
            X.0yC r1 = r11.A0D
            r0 = 2511(0x9cf, float:3.519E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x0039
            android.view.Window r1 = r11.getWindow()
            r0 = 8192(0x2000, float:1.14794E-41)
            r1.setFlags(r0, r0)
        L_0x0039:
            r0 = 2131626256(0x7f0e0910, float:1.8879743E38)
            r11.setContentView((int) r0)
            android.view.Window r1 = r11.getWindow()
            r0 = 134217728(0x8000000, float:3.85186E-34)
            r1.addFlags(r0)
            r0 = 2131433484(0x7f0b180c, float:1.8488755E38)
            android.view.View r2 = r11.findViewById(r0)
            r1 = 3
            X.4ZQ r0 = new X.4ZQ
            r0.<init>(r11, r1)
            X.C011004s.A07(r2, r0)
            r0 = 2131432311(0x7f0b1377, float:1.8486376E38)
            android.view.View r0 = r11.findViewById(r0)
            androidx.viewpager.widget.ViewPager r0 = (androidx.viewpager.widget.ViewPager) r0
            r11.A08 = r0
            android.content.Context r2 = r0.getContext()
            android.view.animation.Interpolator r1 = A0Q
            X.1qi r0 = new X.1qi
            r0.<init>(r2, r1)
            r11.A0O = r0
            r4 = 1
            goto L_0x0078
        L_0x0072:
            r0 = 1024(0x400, float:1.435E-42)
            r1.setFlags(r0, r0)
            goto L_0x001f
        L_0x0078:
            java.lang.Class<androidx.viewpager.widget.ViewPager> r1 = androidx.viewpager.widget.ViewPager.class
            java.lang.String r0 = "mScroller"
            java.lang.reflect.Field r2 = r1.getDeclaredField(r0)     // Catch:{ IllegalAccessException | IllegalArgumentException | NoSuchFieldException -> 0x008a }
            r2.setAccessible(r4)     // Catch:{ IllegalAccessException | IllegalArgumentException | NoSuchFieldException -> 0x008a }
            androidx.viewpager.widget.ViewPager r1 = r11.A08     // Catch:{ IllegalAccessException | IllegalArgumentException | NoSuchFieldException -> 0x008a }
            X.1qi r0 = r11.A0O     // Catch:{ IllegalAccessException | IllegalArgumentException | NoSuchFieldException -> 0x008a }
            r2.set(r1, r0)     // Catch:{ IllegalAccessException | IllegalArgumentException | NoSuchFieldException -> 0x008a }
        L_0x008a:
            java.lang.String r2 = X.C36341k9.A0d(r11)
            X.13z r1 = X.C223613z.A00
            java.lang.String r0 = ""
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x01fc
            java.lang.String r0 = r1.getRawString()
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x01fc
            com.whatsapp.jid.UserJid r3 = X.C36431kI.A0l(r2)
        L_0x00a6:
            android.content.Intent r0 = r11.getIntent()
            X.3Qa r0 = X.AnonymousClass3UJ.A02(r0)
            r11.A00 = r0
            r11.A0L = r5
            X.3G6 r2 = new X.3G6
            r2.<init>()
            if (r0 != 0) goto L_0x01e0
            if (r3 != r1) goto L_0x00f4
            X.16E r0 = r11.A0A
            X.3Sz r6 = r0.A07()
            if (r6 == 0) goto L_0x00df
            boolean r0 = r6.A0C()
            if (r0 != 0) goto L_0x00df
            X.3Sz r1 = r6.A06()
            X.332 r0 = new X.332
            r0.<init>(r1)
            r2.A01(r0)
            int r0 = r6.A03()
            boolean r0 = X.AnonymousClass000.A1R(r0)
            r11.A0J = r0
        L_0x00df:
            java.util.List r0 = r2.A01
            int r0 = r0.size()
            if (r0 != 0) goto L_0x01ff
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "statusplaybackactivity/create/no statuses for "
            X.C36321k7.A1K(r3, r0, r1)
            r11.finish()
            return
        L_0x00f4:
            X.1CR r0 = r11.A0B
            boolean r0 = r0.A0l(r3)
            if (r0 != 0) goto L_0x01e0
            android.content.Intent r1 = r11.getIntent()
            java.lang.String r0 = "single_contact_update"
            boolean r10 = r1.getBooleanExtra(r0, r5)
            android.content.Intent r0 = r11.getIntent()
            java.lang.String r7 = "should_chain_viewed_statuses"
            boolean r1 = r0.getBooleanExtra(r7, r5)
            X.16E r0 = r11.A0A
            X.3Sz r0 = r0.A08(r3)
            if (r1 == 0) goto L_0x0191
            if (r0 == 0) goto L_0x0191
            int r0 = r0.A03()
            if (r0 <= 0) goto L_0x0191
            X.3PC r6 = r11.A0F
            X.16E r0 = r11.A0A
            java.util.ArrayList r0 = r0.A09()
            X.AnonymousClass00C.A0D(r0, r5)
            java.util.ArrayList r1 = X.C36441kJ.A15(r0)
            java.util.Comparator r0 = r6.A0C
            X.AnonymousClass03X.A08(r1, r0)
            X.0k1 r9 = new X.0k1
            r9.<init>(r1)
        L_0x0139:
            java.util.ArrayList r8 = X.AnonymousClass001.A0I()
            java.util.Iterator r6 = r9.iterator()
        L_0x0141:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x015d
            X.3Sz r1 = X.C36441kJ.A0h(r6)
            com.whatsapp.jid.UserJid r0 = r1.A09
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0141
            int r0 = r1.A03()
            boolean r0 = X.AnonymousClass000.A1R(r0)
            r11.A0J = r0
        L_0x015d:
            java.util.Iterator r9 = r9.iterator()
        L_0x0161:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x019d
            X.3Sz r6 = X.C36441kJ.A0h(r9)
            boolean r0 = r6.A0B()
            if (r0 != 0) goto L_0x0161
            boolean r0 = r11.A0J
            if (r0 == 0) goto L_0x017b
            int r0 = r6.A03()
            if (r0 <= 0) goto L_0x0161
        L_0x017b:
            X.1CR r0 = r11.A0B
            com.whatsapp.jid.UserJid r1 = r6.A09
            boolean r0 = r0.A0l(r1)
            if (r0 != 0) goto L_0x0161
            boolean r0 = r1.equals(r3)
            if (r0 != 0) goto L_0x018d
            if (r10 != 0) goto L_0x0161
        L_0x018d:
            r8.add(r6)
            goto L_0x0161
        L_0x0191:
            X.16E r0 = r11.A0A
            java.util.ArrayList r9 = r0.A09()
            X.3xV r0 = X.C81743xV.A00
            java.util.Collections.sort(r9, r0)
            goto L_0x0139
        L_0x019d:
            java.util.Iterator r6 = r8.iterator()
        L_0x01a1:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x01b4
            X.3Sz r1 = X.C36441kJ.A0h(r6)
            X.332 r0 = new X.332
            r0.<init>(r1)
            r2.A01(r0)
            goto L_0x01a1
        L_0x01b4:
            android.content.Intent r0 = r11.getIntent()
            boolean r0 = r0.getBooleanExtra(r7, r5)
            if (r0 == 0) goto L_0x01c9
            X.0yC r1 = r11.A0D
            r0 = 5558(0x15b6, float:7.788E-42)
            boolean r0 = r1.A0E(r0)
            r1 = 1
            if (r0 != 0) goto L_0x01ca
        L_0x01c9:
            r1 = 0
        L_0x01ca:
            boolean r0 = r11.A0J
            if (r0 != 0) goto L_0x01d1
            r0 = 1
            if (r1 == 0) goto L_0x01d2
        L_0x01d1:
            r0 = 0
        L_0x01d2:
            r11.A02 = r0
            java.lang.String r0 = r3.getRawString()
            int r0 = r2.A00(r0)
            r11.A0L = r0
            goto L_0x00df
        L_0x01e0:
            X.16E r0 = r11.A0A
            X.3Sz r1 = r0.A08(r3)
            if (r1 == 0) goto L_0x00df
            boolean r0 = r1.A0C()
            if (r0 != 0) goto L_0x00df
            X.3Sz r1 = r1.A06()
            X.332 r0 = new X.332
            r0.<init>(r1)
            r2.A01(r0)
            goto L_0x00df
        L_0x01fc:
            r3 = r1
            goto L_0x00a6
        L_0x01ff:
            X.0yE r0 = r11.A09
            boolean r0 = r0.A0B()
            if (r0 == 0) goto L_0x0216
            X.0yE r1 = r11.A09
            boolean r0 = X.C19550w8.A07()
            if (r0 != 0) goto L_0x0215
            boolean r0 = r1.A0D()
            if (r0 == 0) goto L_0x0216
        L_0x0215:
            r5 = 1
        L_0x0216:
            r11.A03 = r5
            if (r5 != 0) goto L_0x0235
            boolean r0 = X.C19550w8.A07()
            if (r0 != 0) goto L_0x0272
            r5 = 2131892973(0x7f121aed, float:1.942071E38)
        L_0x0223:
            r3 = 2131892974(0x7f121aee, float:1.9420711E38)
            r1 = 151(0x97, float:2.12E-43)
            boolean r0 = r11.isFinishing()
            if (r0 != 0) goto L_0x0235
            android.content.Intent r0 = X.AnonymousClass3US.A03(r11, r3, r5, r4)
            r11.startActivityForResult(r0, r1)
        L_0x0235:
            r11.A0D = r2
            androidx.viewpager.widget.ViewPager r2 = r11.A08
            X.01z r1 = r11.getSupportFragmentManager()
            X.2Ed r0 = new X.2Ed
            r0.<init>(r1, r11)
            r2.setAdapter(r0)
            androidx.viewpager.widget.ViewPager r1 = r11.A08
            int r0 = r11.A0L
            r1.setCurrentItem(r0)
            int r0 = r11.A0L
            r11.A05 = r0
            androidx.viewpager.widget.ViewPager r1 = r11.A08
            X.3be r0 = new X.3be
            r0.<init>(r11)
            r1.A0K(r0)
            androidx.viewpager.widget.ViewPager r1 = r11.A08
            r0 = 12
            X.C53912s6.A00(r1, r11, r0)
            X.3S6 r3 = r11.A0E
            android.os.Handler r0 = X.C36341k9.A0H()
            r3.A01 = r0
            X.0yb r2 = r3.A06
            android.media.AudioManager r0 = r2.A0D()
            if (r0 == 0) goto L_0x0294
            goto L_0x027f
        L_0x0272:
            boolean r0 = X.C19550w8.A09()
            r5 = 2131892976(0x7f121af0, float:1.9420715E38)
            if (r0 != 0) goto L_0x0223
            r5 = 2131892975(0x7f121aef, float:1.9420713E38)
            goto L_0x0223
        L_0x027f:
            int r1 = r0.getRingerMode()     // Catch:{ RuntimeException -> 0x0297 }
            r0 = 2
            if (r1 == r0) goto L_0x0294
            android.media.AudioManager r0 = r2.A0D()     // Catch:{ RuntimeException -> 0x0297 }
            if (r0 == 0) goto L_0x0292
            boolean r0 = r0.isMusicActive()     // Catch:{ RuntimeException -> 0x0297 }
            if (r0 != 0) goto L_0x0294
        L_0x0292:
            r0 = 1
            goto L_0x0295
        L_0x0294:
            r0 = 0
        L_0x0295:
            r3.A03 = r0     // Catch:{ RuntimeException -> 0x0297 }
        L_0x0297:
            androidx.viewpager.widget.ViewPager r0 = r11.A08
            r0.setKeepScreenOn(r4)
            X.C36401kF.A1C(r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.status.playback.StatusPlaybackActivity.onCreate(android.os.Bundle):void");
    }

    public void onDestroy() {
        super.onDestroy();
        AnonymousClass3S6 r2 = this.A0E;
        Handler handler = r2.A01;
        if (handler != null) {
            handler.removeCallbacks(r2.A07);
        }
        AnonymousClass3S6.A01(r2);
        r2.A02 = null;
        C29731Xt r5 = this.A0C;
        C61103Ao r0 = r5.A00;
        C65303Rn r4 = r5.A01;
        if (!(r0 == null || r4 == null)) {
            ArrayList A0I2 = AnonymousClass001.A0I();
            Iterator A0z = AnonymousClass000.A0z(r4.A0B);
            while (A0z.hasNext()) {
                C61093An r7 = (C61093An) A0z.next();
                C45592Ry r6 = new C45592Ry();
                r6.A05 = Long.valueOf(r7.A05);
                r6.A06 = Long.valueOf(r7.A06);
                r6.A01 = Integer.valueOf(r7.A03);
                r6.A02 = C36441kJ.A0y(r7.A00);
                r6.A00 = Integer.valueOf(r7.A02);
                r6.A04 = C36441kJ.A0y(r7.A01);
                r6.A03 = C36441kJ.A0y(r7.A04);
                String str = r7.A07;
                r6.A07 = str;
                if (str == null || str.length() == 0) {
                    r5.A07.Blw(r6);
                } else {
                    r5.A07.Bls(r6, AnonymousClass3TM.A00, true);
                }
                A0I2.addAll(r7.A08.values());
            }
            r5.A0C.Boy(new C35661j3(A0I2, r4, r5, 17));
            r5.A01 = null;
        }
        AnonymousClass3OH r52 = this.A0H;
        AnonymousClass5NR r02 = r52.A00;
        if (r02 != null) {
            r02.A0D();
        }
        r52.A00 = null;
        if (r52.A0B.A0E(5972)) {
            HashMap A0J2 = AnonymousClass001.A0J();
            C202289lT.A01(r52.A07.A00, AnonymousClass6KH.A00((AnonymousClass6KH) r52.A0J.get()), B44.A00, A0J2).A03();
        }
        this.A08.setAdapter((AnonymousClass07S) null);
    }

    public void onResume() {
        super.onResume();
        this.A0G.A02((AnonymousClass11F) null, 19);
    }
}
