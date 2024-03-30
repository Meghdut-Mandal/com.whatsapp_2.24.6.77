package X;

import android.content.BroadcastReceiver;
import java.lang.ref.WeakReference;

/* renamed from: X.1l3  reason: invalid class name and case insensitive filesystem */
public final class C36671l3 extends BroadcastReceiver {
    public final C21060yb A00;
    public final C20830yE A01;
    public final Object A02;
    public final C19420v0 A03;
    public final AnonymousClass3UV A04;
    public final AnonymousClass2d1 A05;
    public final C19770wU A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final WeakReference A0A;
    public volatile boolean A0B;

    /* JADX WARNING: type inference failed for: r2v1, types: [boolean, int] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onReceive(android.content.Context r20, android.content.Intent r21) {
        /*
            r19 = this;
            r5 = r19
            boolean r0 = r5.A0B
            r2 = r20
            if (r0 != 0) goto L_0x001a
            java.lang.Object r1 = r5.A02
            monitor-enter(r1)
            boolean r0 = r5.A0B     // Catch:{ all -> 0x0017 }
            if (r0 != 0) goto L_0x0015
            X.C56042vd.A01(r2)     // Catch:{ all -> 0x0017 }
            r0 = 1
            r5.A0B = r0     // Catch:{ all -> 0x0017 }
        L_0x0015:
            monitor-exit(r1)     // Catch:{ all -> 0x0017 }
            goto L_0x001a
        L_0x0017:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0017 }
            throw r0
        L_0x001a:
            r3 = 0
            r4 = r21
            boolean r2 = X.C36341k9.A1a(r2, r4)
            java.lang.String r0 = "FlashCallReceiver/onReceive"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.String r0 = "state"
            java.lang.String r1 = r4.getStringExtra(r0)
            java.lang.String r0 = android.telephony.TelephonyManager.EXTRA_STATE_RINGING
            boolean r0 = X.AnonymousClass00C.A0J(r0, r1)
            if (r0 == 0) goto L_0x00f5
            java.lang.String r1 = "incoming_number"
            boolean r0 = r4.hasExtra(r1)
            if (r0 == 0) goto L_0x00f5
            java.lang.String r1 = r4.getStringExtra(r1)
            if (r1 == 0) goto L_0x014a
            java.lang.String r0 = "\\D"
            java.lang.String r1 = X.C36411kG.A0y(r1, r0)
        L_0x0048:
            java.lang.ref.WeakReference r0 = r5.A0A
            java.lang.Object r11 = r0.get()
            X.4UF r11 = (X.AnonymousClass4UF) r11
            if (r11 == 0) goto L_0x00f5
            if (r1 == 0) goto L_0x014d
            int r9 = r1.length()
            if (r9 == 0) goto L_0x014d
            java.lang.String r6 = r5.A07
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r6)
            java.util.regex.Matcher r8 = r0.matcher(r1)
            java.lang.String r4 = "\\D"
            java.lang.String r0 = ""
            java.lang.String r7 = r6.replaceAll(r4, r0)
            int r6 = r9 + -7
            int r0 = r6 + -1
            int r4 = r1.lastIndexOf(r7, r0)
            boolean r0 = r8.matches()
            if (r0 == 0) goto L_0x015b
            int r0 = r7.length()
            int r0 = r0 + 7
            if (r9 < r0) goto L_0x015b
            r0 = -1
            if (r4 == r0) goto L_0x015b
            java.lang.String r0 = r1.substring(r4, r6)
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x015b
            java.lang.String r0 = "FlashCallReceiver/incoming phone number matches CLI"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r4 = r11
            com.whatsapp.registration.verifyphone.VerifyPhoneNumber r4 = (com.whatsapp.registration.verifyphone.VerifyPhoneNumber) r4
            r4.A1O = r2
            com.whatsapp.registration.verifyphone.VerifyPhoneNumber.A1A(r4)
            boolean r0 = X.C36431kI.A1S(r4)
            if (r0 == 0) goto L_0x0143
            X.1tN r0 = r4.A0y
            r0.A0S()
            X.3Ey r0 = r4.A0x
            r0.A00()
            java.lang.String r0 = "VerifyPhoneNumber/receive-primary-flash-call/valid-phone-number"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = 2131895571(0x7f122513, float:1.9425979E38)
            com.whatsapp.registration.verifyphone.VerifyPhoneNumber.A1I(r4, r0)
        L_0x00b7:
            java.lang.String r0 = "FlashCallReceiver/sending code for verification"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.2d1 r10 = r5.A05
            X.0yE r0 = r5.A01
            boolean r0 = r0.A0A()
            java.lang.String r8 = "FlashCallReceiver/Cannot end call"
            if (r0 != 0) goto L_0x00f6
            com.whatsapp.util.Log.i((java.lang.String) r8)
        L_0x00cb:
            r0 = 0
        L_0x00cc:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r10.A00 = r0
            X.0wU r0 = r5.A06
            java.lang.String r12 = r5.A08
            java.lang.String r13 = r5.A09
            X.C18740tg.A06(r13)
            r17 = 2
            X.0v0 r7 = r5.A03
            X.3UV r8 = r5.A04
            r9 = 0
            java.lang.String r14 = "flash"
            r16 = r9
            r18 = 0
            X.2k8 r6 = new X.2k8
            r15 = r9
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            java.lang.String[] r2 = new java.lang.String[r2]
            r2[r3] = r1
            r0.Box(r6, r2)
        L_0x00f5:
            return
        L_0x00f6:
            int r6 = android.os.Build.VERSION.SDK_INT
            r4 = 28
            java.lang.String r9 = "FlashCallReceiver/End call successful"
            X.0yb r0 = r5.A00
            if (r6 < r4) goto L_0x010e
            android.telecom.TelecomManager r0 = r0.A0I()
            if (r0 == 0) goto L_0x00cb
            r0.endCall()
            com.whatsapp.util.Log.i((java.lang.String) r9)
        L_0x010c:
            r0 = 1
            goto L_0x00cc
        L_0x010e:
            android.telephony.TelephonyManager r7 = r0.A0K()
            if (r7 == 0) goto L_0x00cb
            java.lang.Class r6 = r7.getClass()     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x013e }
            java.lang.String r4 = "getITelephony"
            java.lang.Class[] r0 = new java.lang.Class[r3]     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x013e }
            java.lang.reflect.Method r4 = r6.getDeclaredMethod(r4, r0)     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x013e }
            r4.setAccessible(r2)     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x013e }
            java.lang.Object[] r0 = new java.lang.Object[r3]     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x013e }
            java.lang.Object r7 = r4.invoke(r7, r0)     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x013e }
            java.lang.Class r6 = r7.getClass()     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x013e }
            java.lang.String r4 = "endCall"
            java.lang.Class[] r0 = new java.lang.Class[r3]     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x013e }
            java.lang.reflect.Method r4 = r6.getDeclaredMethod(r4, r0)     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x013e }
            java.lang.Object[] r0 = new java.lang.Object[r3]     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x013e }
            r4.invoke(r7, r0)     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x013e }
            com.whatsapp.util.Log.i((java.lang.String) r9)     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x013e }
            goto L_0x010c
        L_0x013e:
            r0 = move-exception
            com.whatsapp.util.Log.i(r8, r0)
            goto L_0x00cb
        L_0x0143:
            java.lang.String r0 = "VerifyPhoneNumber/receive-secondary-flash-call"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            goto L_0x00b7
        L_0x014a:
            r1 = 0
            goto L_0x0048
        L_0x014d:
            java.lang.String r0 = "FlashCallReceiver/incomingCallPhoneNumber empty"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.2d1 r1 = r5.A05
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            r1.A02 = r0
            goto L_0x0168
        L_0x015b:
            java.lang.String r0 = "FlashCallReceiver/incoming phone number does not match CLI"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.2d1 r1 = r5.A05
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            r1.A01 = r0
        L_0x0168:
            com.whatsapp.registration.verifyphone.VerifyPhoneNumber r11 = (com.whatsapp.registration.verifyphone.VerifyPhoneNumber) r11
            r11.A1O = r3
            com.whatsapp.registration.verifyphone.VerifyPhoneNumber.A1A(r11)
            boolean r0 = X.C36431kI.A1S(r11)
            if (r0 == 0) goto L_0x0198
            X.1tN r0 = r11.A0y
            r0.A0S()
            X.3Ey r0 = r11.A0x
            r0.A00()
            java.lang.String r0 = "VerifyPhoneNumber/receive-primary-flash-call/invalid-phone-number"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.3LA r1 = r11.A16
            java.lang.String r0 = "sms"
            long r2 = r1.A02(r0)
            X.3LA r1 = r11.A16
            java.lang.String r0 = "voice"
            long r0 = r1.A02(r0)
            com.whatsapp.registration.verifyphone.VerifyPhoneNumber.A1J(r11, r2, r0)
            return
        L_0x0198:
            java.lang.String r0 = "VerifyPhoneNumber/receive-secondary-flash-call"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C36671l3.onReceive(android.content.Context, android.content.Intent):void");
    }

    public C36671l3(C21060yb r2, C20830yE r3, C19420v0 r4, AnonymousClass3UV r5, AnonymousClass2d1 r6, AnonymousClass4UF r7, C19770wU r8, String str, String str2, String str3) {
        this();
        this.A06 = r8;
        this.A00 = r2;
        this.A01 = r3;
        this.A03 = r4;
        this.A04 = r5;
        this.A07 = str;
        this.A08 = str2;
        this.A09 = str3;
        this.A05 = r6;
        this.A0A = AnonymousClass001.A0F(r7);
    }

    public C36671l3() {
        this.A0B = false;
        this.A02 = C36441kJ.A11();
    }
}
