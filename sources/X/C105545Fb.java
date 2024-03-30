package X;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.CallInfo;
import com.whatsapp.voipcalling.CallLinkInfo;
import com.whatsapp.voipcalling.CallState;
import com.whatsapp.voipcalling.Voip;
import com.whatsapp.voipcalling.camera.VoipCameraManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* renamed from: X.5Fb  reason: invalid class name and case insensitive filesystem */
public class C105545Fb extends C19580wB {
    public Handler A00;
    public AnonymousClass6YM A01;
    public boolean A02;
    public long A03 = 0;
    public long A04;
    public String A05;
    public boolean A06 = false;
    public final C19730wQ A07;
    public final C20810yC A08;
    public final C19930wk A09;
    public final AnonymousClass13J A0A;
    public final VoipCameraManager A0B;
    public final Set A0C = C36441kJ.A16();
    public final C30531aM A0D;
    public final C19970wo A0E;
    public final AnonymousClass7dL A0F = new C1493770z(this);

    public static int A00(int i, int i2, int i3) {
        float f = (float) i3;
        int i4 = ((int) (1.402f * f)) + i;
        float f2 = (float) i2;
        int i5 = i - ((int) ((0.344f * f2) + (f * 0.714f)));
        return Math.min(255, Math.max(0, i + ((int) (f2 * 1.772f)))) | (Math.min(255, Math.max(0, i4)) << 16) | -16777216 | (Math.min(255, Math.max(0, i5)) << 8);
    }

    public AnonymousClass6OZ A05() {
        CallInfo A022 = A02(this, (CallInfo) null);
        if (A022 != null) {
            return new AnonymousClass6OZ(A022);
        }
        Map emptyMap = Collections.emptyMap();
        return new AnonymousClass6OZ(C20070wy.copyOf(emptyMap), (AnonymousClass6EE) null, (AnonymousClass147) null, (UserJid) null, (UserJid) null, CallState.NONE, "", (String) null, (String) null, 0, 0, 0, 0, false, false, false, false, false, false, false, false, false, false, false);
    }

    /* renamed from: A08 */
    public synchronized void registerObserver(C161057m5 r3) {
        boolean A1Q = AnonymousClass000.A1Q(C36361kB.A0s(this).hasNext() ? 1 : 0);
        super.registerObserver(r3);
        if (A1Q) {
            this.A0B.onCameraClosedListener = this.A0F;
        }
    }

    /* renamed from: A09 */
    public synchronized void unregisterObserver(C161057m5 r3) {
        super.unregisterObserver(r3);
        if (!C36361kB.A0s(this).hasNext()) {
            this.A00.removeCallbacksAndMessages((Object) null);
            this.A09.A02();
            this.A0B.onCameraClosedListener = null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x010a A[SYNTHETIC, Splitter:B:34:0x010a] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Bitmap A01(X.C124015xS r19) {
        /*
            r7 = r19
            int r8 = r7.A00
            byte[] r11 = r7.A05
            int r5 = r7.A03
            int r4 = r7.A01
            r0 = 1
            java.lang.String r10 = " got "
            r2 = 0
            if (r8 == r0) goto L_0x00a4
            r0 = 17
            if (r8 == r0) goto L_0x004f
            r0 = 35
            if (r8 == r0) goto L_0x002f
            r0 = 842094169(0x32315659, float:1.0322389E-8)
            if (r8 == r0) goto L_0x0028
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ OutOfMemoryError -> 0x00e6 }
            java.lang.String r0 = "convertFrameDataToARGB8888 unsupported format "
            X.C36321k7.A1T(r0, r1, r8)     // Catch:{ OutOfMemoryError -> 0x00e6 }
            goto L_0x0106
        L_0x0028:
            r0 = 0
            int[] r10 = A04(r11, r5, r4, r0)     // Catch:{ OutOfMemoryError -> 0x00e6 }
            goto L_0x0107
        L_0x002f:
            int r0 = r5 * 3
            int r0 = r0 * r4
            int r6 = r0 / 2
            int r3 = r11.length     // Catch:{ OutOfMemoryError -> 0x00e6 }
            if (r3 == r6) goto L_0x0048
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ OutOfMemoryError -> 0x00e6 }
            java.lang.String r0 = "convertFrameDataToARGB8888 YUV_420_888 expected length "
            r1.append(r0)     // Catch:{ OutOfMemoryError -> 0x00e6 }
            r1.append(r6)     // Catch:{ OutOfMemoryError -> 0x00e6 }
            X.C36321k7.A1S(r10, r1, r3)     // Catch:{ OutOfMemoryError -> 0x00e6 }
            goto L_0x0106
        L_0x0048:
            r0 = 1
            int[] r10 = A04(r11, r5, r4, r0)     // Catch:{ OutOfMemoryError -> 0x00e6 }
            goto L_0x0107
        L_0x004f:
            int r9 = r4 * r5
            int[] r10 = new int[r9]     // Catch:{ OutOfMemoryError -> 0x00e6 }
            r6 = 0
            r19 = 0
        L_0x0056:
            if (r6 >= r9) goto L_0x0107
            byte r0 = r11[r6]     // Catch:{ OutOfMemoryError -> 0x00e6 }
            r15 = r0 & 255(0xff, float:3.57E-43)
            int r18 = r6 + 1
            byte r0 = r11[r18]     // Catch:{ OutOfMemoryError -> 0x00e6 }
            r14 = r0 & 255(0xff, float:3.57E-43)
            int r17 = r5 + r6
            byte r0 = r11[r17]     // Catch:{ OutOfMemoryError -> 0x00e6 }
            r13 = r0 & 255(0xff, float:3.57E-43)
            int r16 = r17 + 1
            byte r0 = r11[r16]     // Catch:{ OutOfMemoryError -> 0x00e6 }
            r12 = r0 & 255(0xff, float:3.57E-43)
            int r3 = r9 + r19
            byte r0 = r11[r3]     // Catch:{ OutOfMemoryError -> 0x00e6 }
            r1 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r3 + 1
            byte r0 = r11[r0]     // Catch:{ OutOfMemoryError -> 0x00e6 }
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r3 = r0 + -128
            int r1 = r1 + -128
            int r0 = A00(r15, r3, r1)     // Catch:{ OutOfMemoryError -> 0x00e6 }
            r10[r6] = r0     // Catch:{ OutOfMemoryError -> 0x00e6 }
            int r0 = A00(r14, r3, r1)     // Catch:{ OutOfMemoryError -> 0x00e6 }
            r10[r18] = r0     // Catch:{ OutOfMemoryError -> 0x00e6 }
            int r0 = A00(r13, r3, r1)     // Catch:{ OutOfMemoryError -> 0x00e6 }
            r10[r17] = r0     // Catch:{ OutOfMemoryError -> 0x00e6 }
            int r0 = A00(r12, r3, r1)     // Catch:{ OutOfMemoryError -> 0x00e6 }
            r10[r16] = r0     // Catch:{ OutOfMemoryError -> 0x00e6 }
            if (r6 == 0) goto L_0x009f
            int r0 = r6 + 2
            int r0 = r0 % r5
            if (r0 != 0) goto L_0x009f
            r6 = r17
        L_0x009f:
            int r6 = r6 + 2
            int r19 = r19 + 2
            goto L_0x0056
        L_0x00a4:
            int r9 = r4 * r5
            int r6 = r9 * 4
            int r3 = r11.length     // Catch:{ OutOfMemoryError -> 0x00e6 }
            if (r3 == r6) goto L_0x00bb
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ OutOfMemoryError -> 0x00e6 }
            java.lang.String r0 = "convertFrameDataToARGB8888 RGBA expected length "
            r1.append(r0)     // Catch:{ OutOfMemoryError -> 0x00e6 }
            r1.append(r6)     // Catch:{ OutOfMemoryError -> 0x00e6 }
            X.C36321k7.A1S(r10, r1, r3)     // Catch:{ OutOfMemoryError -> 0x00e6 }
            goto L_0x0106
        L_0x00bb:
            int[] r10 = new int[r9]     // Catch:{ OutOfMemoryError -> 0x00e6 }
            r6 = 0
        L_0x00be:
            if (r6 >= r9) goto L_0x0107
            int r1 = r6 * 4
            byte r0 = r11[r1]     // Catch:{ OutOfMemoryError -> 0x00e6 }
            r13 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r1 + 1
            byte r0 = r11[r0]     // Catch:{ OutOfMemoryError -> 0x00e6 }
            r12 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r1 + 2
            byte r0 = r11[r0]     // Catch:{ OutOfMemoryError -> 0x00e6 }
            r3 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r1 + 3
            byte r0 = r11[r0]     // Catch:{ OutOfMemoryError -> 0x00e6 }
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r1 = r0 << 24
            int r0 = r13 << 16
            r1 = r1 | r0
            int r0 = r12 << 8
            r1 = r1 | r0
            r1 = r1 | r3
            r10[r6] = r1     // Catch:{ OutOfMemoryError -> 0x00e6 }
            int r6 = r6 + 1
            goto L_0x00be
        L_0x00e6:
            r3 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "convertFrameDataToARGB8888 OOM when convert data with format = "
            r1.append(r0)
            r1.append(r8)
            java.lang.String r0 = " width = "
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = "height = "
            java.lang.String r0 = X.AnonymousClass000.A0r(r0, r1, r4)
            com.whatsapp.util.Log.i(r0, r3)
            r10 = r2
            goto L_0x0107
        L_0x0106:
            r10 = r2
        L_0x0107:
            r9 = 0
            if (r10 == 0) goto L_0x0199
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ OutOfMemoryError -> 0x0192 }
            android.graphics.Bitmap r10 = android.graphics.Bitmap.createBitmap(r10, r5, r4, r0)     // Catch:{ OutOfMemoryError -> 0x0192 }
            boolean r0 = X.C113155f5.A00
            r1 = 320(0x140, float:4.48E-43)
            if (r0 == 0) goto L_0x0118
            r1 = 240(0xf0, float:3.36E-43)
        L_0x0118:
            int r0 = r10.getWidth()
            int r0 = r0 / 4
            int r8 = java.lang.Math.max(r1, r0)
            int r0 = r10.getWidth()
            if (r0 <= r8) goto L_0x0142
            int r0 = r10.getWidth()
            double r5 = (double) r0
            double r0 = (double) r8
            double r5 = r5 / r0
            int r0 = r10.getHeight()
            double r3 = (double) r0
            double r3 = r3 / r5
            int r1 = (int) r3
            r0 = 1
            android.graphics.Bitmap r10 = android.graphics.Bitmap.createScaledBitmap(r10, r8, r1, r0)     // Catch:{ OutOfMemoryError -> 0x013c }
            goto L_0x0142
        L_0x013c:
            r1 = move-exception
            java.lang.String r0 = "voip/CallDatasource/convertFrameInfoToBitmap OOM when scaling down bitmap"
            com.whatsapp.util.Log.i(r0, r1)
        L_0x0142:
            android.graphics.Matrix r15 = X.C90524aI.A0B()
            boolean r3 = r7.A04
            r1 = 1065353216(0x3f800000, float:1.0)
            r0 = 1065353216(0x3f800000, float:1.0)
            if (r3 == 0) goto L_0x0150
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
        L_0x0150:
            r15.preScale(r1, r0)
            int r0 = r7.A02
            float r0 = (float) r0
            r15.postRotate(r0)
            r11 = 0
            int r13 = r10.getWidth()     // Catch:{ OutOfMemoryError -> 0x0181 }
            int r14 = r10.getHeight()     // Catch:{ OutOfMemoryError -> 0x0181 }
            r16 = 1
            r12 = 0
            android.graphics.Bitmap r2 = android.graphics.Bitmap.createBitmap(r10, r11, r12, r13, r14, r15, r16)     // Catch:{ OutOfMemoryError -> 0x0181 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ OutOfMemoryError -> 0x0181 }
            java.lang.String r0 = "voip/CallDatasource/convertFrameInfoToBitmap screenshot done. size: "
            r1.append(r0)     // Catch:{ OutOfMemoryError -> 0x0181 }
            int r0 = r2.getWidth()     // Catch:{ OutOfMemoryError -> 0x0181 }
            X.C90494aF.A1L(r1, r0)     // Catch:{ OutOfMemoryError -> 0x0181 }
            int r0 = r2.getHeight()     // Catch:{ OutOfMemoryError -> 0x0181 }
            X.C36321k7.A1Y(r1, r0)     // Catch:{ OutOfMemoryError -> 0x0181 }
            goto L_0x0188
        L_0x0181:
            r1 = move-exception
            java.lang.String r0 = "voip/CallDatasource/convertFrameInfoToBitmap OOM when creating result bitmap"
            com.whatsapp.util.Log.i(r0, r1)
            goto L_0x018c
        L_0x0188:
            if (r2 == r10) goto L_0x018b
            r9 = r10
        L_0x018b:
            r10 = r9
        L_0x018c:
            if (r10 == 0) goto L_0x0199
            r10.recycle()
            return r2
        L_0x0192:
            r1 = move-exception
            java.lang.String r0 = "voip/CallDatasource/convertFrameInfoToBitmap OOM when creating raw bitmap"
            com.whatsapp.util.Log.i(r0, r1)
            return r2
        L_0x0199:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C105545Fb.A01(X.5xS):android.graphics.Bitmap");
    }

    public static CallInfo A02(C105545Fb r4, CallInfo callInfo) {
        String str;
        if (callInfo == null) {
            C30531aM r1 = r4.A0D;
            if (Voip.A08()) {
                CallLinkInfo callLinkInfo = Voip.getCallLinkInfo();
                C18740tg.A06(callLinkInfo);
                return CallInfo.convertCallLinkInfoToCallInfo(callLinkInfo);
            }
            callInfo = r1.B9F();
            if (callInfo == null) {
                return null;
            }
        }
        if (callInfo.isCallLinkLobbyOrJoiningState() || (str = r4.A05) == null) {
            return callInfo;
        }
        if (C90514aH.A1X(callInfo, str)) {
            return CallInfo.convertCallWaitingInfoToCallInfo(callInfo);
        }
        String str2 = callInfo.callId;
        if (str.equals(str2) || r4.A06) {
            return callInfo;
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("CallDatasource/getCallInfoForDisplay CallId ");
        A0u.append(str);
        C36321k7.A1P(" does not match current call's id ", str2, A0u);
        r4.A06 = true;
        return callInfo;
    }

    public static int[] A04(byte[] bArr, int i, int i2, boolean z) {
        int i3 = i * i2;
        int[] iArr = new int[i3];
        int i4 = 0;
        int i5 = 0;
        while (i4 < i3) {
            byte b = bArr[i4] & 255;
            int i6 = i4 + 1;
            byte b2 = bArr[i6] & 255;
            int i7 = i + i4;
            byte b3 = bArr[i7] & 255;
            int i8 = i7 + 1;
            byte b4 = bArr[i8] & 255;
            int i9 = i3 + i5;
            byte b5 = bArr[i9] & 255;
            byte b6 = bArr[i9 + (i3 / 4)] & 255;
            if (!z) {
                byte b7 = b5;
                b5 = b6;
                b6 = b7;
            }
            int i10 = b5 - 128;
            int i11 = b6 - 128;
            iArr[i4] = A00(b, i10, i11);
            iArr[i6] = A00(b2, i10, i11);
            iArr[i7] = A00(b3, i10, i11);
            iArr[i8] = A00(b4, i10, i11);
            if (i4 != 0 && (i4 + 2) % i == 0) {
                i4 = i7;
            }
            i4 += 2;
            i5++;
        }
        return iArr;
    }

    public void A06() {
        String str;
        AnonymousClass6YM r4 = this.A01;
        if (r4 != null) {
            CallInfo callInfo = Voip.getCallInfo();
            if (callInfo == null) {
                str = "voip/ringAll: Voip.getCallInfo failed";
            } else {
                ArrayList A0I = AnonymousClass001.A0I();
                Iterator A0z = AnonymousClass000.A0z(callInfo.participants);
                while (A0z.hasNext()) {
                    AnonymousClass6EE A0J = C90524aI.A0J(A0z);
                    if (A0J.A02 == 11) {
                        A0I.add(A0J.A08);
                    }
                }
                if (A0I.size() == 0) {
                    str = "voip/ringAll: Cannot ring any participant";
                } else {
                    C18740tg.A0D(C36401kF.A1a(A0I), "voip/invite: Empty list of peers to invite");
                    r4.A1E.execute(new AnonymousClass755(r4, A0I, callInfo, 5, true));
                    return;
                }
            }
            Log.e(str);
        }
    }

    public void A0B(String str) {
        String str2 = this.A05;
        if (!str.equals(str2)) {
            this.A04 = 0;
            if (str2 != null) {
                Iterator A0s = C36361kB.A0s(this);
                while (A0s.hasNext()) {
                    C90524aI.A0K(A0s).BSb();
                }
            }
            this.A05 = str;
            this.A06 = false;
            this.A02 = false;
            CallInfo A022 = A02(this, (CallInfo) null);
            if (A022 != null) {
                A0A(A022);
            }
        }
    }

    public C105545Fb(C19730wQ r4, C30531aM r5, C19970wo r6, C20810yC r7, AnonymousClass13J r8, C19770wU r9, VoipCameraManager voipCameraManager, AnonymousClass005 r11) {
        super(r11);
        this.A0E = r6;
        this.A08 = r7;
        this.A07 = r4;
        this.A0D = r5;
        this.A0A = r8;
        this.A0B = voipCameraManager;
        this.A00 = new Handler(Looper.getMainLooper(), new C163797qm(this, 2));
        this.A09 = new C19930wk(r9, true);
        Objects.requireNonNull(r5);
        voipCameraManager.setCaptureDeviceRefreshListener(new C1493570x(r5));
    }

    public static void A03(C105545Fb r6, CallInfo callInfo, boolean z) {
        if (C36361kB.A0s(r6).hasNext()) {
            long uptimeMillis = SystemClock.uptimeMillis();
            CallInfo A022 = A02(r6, callInfo);
            if (A022 != null) {
                AnonymousClass6OZ r4 = new AnonymousClass6OZ(A022);
                Iterator A0s = C36361kB.A0s(r6);
                if (z) {
                    while (A0s.hasNext()) {
                        C90524aI.A0K(A0s).BSo(r4);
                    }
                } else {
                    while (A0s.hasNext()) {
                        C90524aI.A0K(A0s).BSn(r4);
                    }
                    r6.A07(A022.callDuration, uptimeMillis);
                }
                r6.A03 = System.currentTimeMillis();
            }
        }
    }

    public void A07(long j, long j2) {
        if (C36361kB.A0s(this).hasNext() && j2 > this.A04) {
            Iterator A0s = C36361kB.A0s(this);
            while (A0s.hasNext()) {
                C90524aI.A0K(A0s).BSZ(j);
            }
            this.A04 = j2;
        }
    }

    public void A0A(CallInfo callInfo) {
        CallState callState;
        if (C36361kB.A0s(this).hasNext()) {
            Handler handler = this.A00;
            handler.removeMessages(2);
            long currentTimeMillis = System.currentTimeMillis();
            if (callInfo == null || !((callState = callInfo.callState) == CallState.NONE || callState == CallState.ACTIVE_ELSEWHERE)) {
                long j = this.A03;
                if (j != 0) {
                    long j2 = j + 250;
                    if (currentTimeMillis < j2) {
                        handler.sendEmptyMessageDelayed(2, j2 - currentTimeMillis);
                        return;
                    }
                }
            }
            A03(this, callInfo, false);
        }
    }
}
