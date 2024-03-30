package X;

import android.content.Context;
import android.content.SharedPreferences;
import com.whatsapp.Me;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.0wQ  reason: invalid class name and case insensitive filesystem */
public class C19730wQ {
    public Me A00;
    public C177508du A01;
    public C223413x A02;
    public PhoneUserJid A03;
    public C223313w A04;
    public String A05;
    public boolean A06 = false;
    public final C19990wq A07;
    public final C20000wr A08 = new C20000wr();
    public final C19630wG A09;
    public final C19900wh A0A;
    public final C19750wS A0B;
    public final C19420v0 A0C;
    public final List A0D = new ArrayList();
    public volatile AnonymousClass142 A0E;

    private synchronized void A00() {
        if (!this.A06) {
            A02(Jid.Companion.A02(((SharedPreferences) this.A0C.A00.get()).getString("self_lid", "")));
            this.A06 = true;
        }
    }

    private synchronized void A02(Jid jid) {
        C177508du r0;
        if (jid instanceof C223313w) {
            C223313w r4 = (C223313w) jid;
            this.A04 = r4;
            try {
                int i = this.A07.A01.A01.getInt("registration_device_id", 0);
                if (i == 99) {
                    r0 = new C177608e4(r4, i);
                } else {
                    r0 = new C177508du(r4, i);
                }
                this.A01 = r0;
            } catch (C19740wR e) {
                Log.w("memanager/setMyLidDeviceJid/invalid_jid_error", e);
            }
        } else if (jid instanceof C177508du) {
            C177508du r42 = (C177508du) jid;
            UserJid userJid = r42.userJid;
            AnonymousClass00C.A0E(userJid, "null cannot be cast to non-null type com.whatsapp.jid.LidUserJid");
            this.A04 = (C223313w) userJid;
            this.A01 = r42;
        }
    }

    public synchronized C177508du A07() {
        A00();
        return this.A01;
    }

    public synchronized C223313w A08() {
        A00();
        return this.A04;
    }

    public synchronized C223313w A09() {
        C223313w r0;
        A00();
        r0 = this.A04;
        C18740tg.A06(r0);
        return r0;
    }

    public synchronized String A0C() {
        String string;
        string = ((SharedPreferences) this.A0C.A00.get()).getString("self_display_name", "");
        if (AnonymousClass14B.A0F(string)) {
            string = null;
        }
        return string;
    }

    public synchronized void A0H(Jid jid) {
        if (!jid.equals(A08()) && ((jid instanceof C223313w) || (jid instanceof C177508du))) {
            this.A0C.A1m("self_lid", jid.getRawString());
            A02(jid);
        }
    }

    public synchronized void A0K(String str) {
        this.A0C.A1m("self_display_name", str);
    }

    public boolean A0P(DeviceJid deviceJid) {
        return (deviceJid == null || !A0M(deviceJid.userJid) || deviceJid.getDevice() == this.A07.A01.A01.getInt("registration_device_id", 0)) ? false : true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x002e A[Catch:{ 0wR -> 0x0036 }] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00b4 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0017 A[Catch:{ 0wR -> 0x0036 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A01(com.whatsapp.Me r5, X.C19730wQ r6) {
        /*
            r6.A00 = r5
            r4 = 0
            r2 = 0
            if (r5 == 0) goto L_0x0007
            goto L_0x0009
        L_0x0007:
            r3 = r2
            goto L_0x0013
        L_0x0009:
            java.lang.String r1 = r5.jabber_id     // Catch:{ 0wR -> 0x0036 }
            if (r1 == 0) goto L_0x0007
            android.os.Parcelable$Creator r0 = com.whatsapp.jid.PhoneUserJid.CREATOR     // Catch:{ 0wR -> 0x0036 }
            com.whatsapp.jid.PhoneUserJid r3 = X.C222913s.A00(r1)     // Catch:{ 0wR -> 0x0036 }
        L_0x0013:
            r6.A03 = r3     // Catch:{ 0wR -> 0x0036 }
            if (r3 == 0) goto L_0x002e
            X.0wq r0 = r6.A07     // Catch:{ 0wR -> 0x0036 }
            X.0wh r0 = r0.A01     // Catch:{ 0wR -> 0x0036 }
            android.content.SharedPreferences r1 = r0.A01     // Catch:{ 0wR -> 0x0036 }
            java.lang.String r0 = "registration_device_id"
            int r1 = r1.getInt(r0, r4)     // Catch:{ 0wR -> 0x0036 }
            X.13u r0 = com.whatsapp.jid.DeviceJid.Companion     // Catch:{ 0wR -> 0x0036 }
            com.whatsapp.jid.DeviceJid r0 = r0.A01(r3, r1)     // Catch:{ 0wR -> 0x0036 }
            X.13x r0 = (X.C223413x) r0     // Catch:{ 0wR -> 0x0036 }
            r6.A02 = r0     // Catch:{ 0wR -> 0x0036 }
            goto L_0x0045
        L_0x002e:
            r6.A02 = r2     // Catch:{ 0wR -> 0x0036 }
            X.0wq r0 = r6.A07     // Catch:{ 0wR -> 0x0036 }
            r0.A00(r4)     // Catch:{ 0wR -> 0x0036 }
            goto L_0x0045
        L_0x0036:
            r1 = move-exception
            java.lang.String r0 = "memanager/setMe/invalid_jid_error"
            com.whatsapp.util.Log.e(r0, r1)
            r6.A03 = r2
            r6.A02 = r2
            X.0wq r0 = r6.A07
            r0.A00(r4)
        L_0x0045:
            com.whatsapp.jid.PhoneUserJid r1 = r6.A03
            if (r1 != 0) goto L_0x008c
            r6.A0E = r2
        L_0x004b:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "memanager/setMe me: "
            r1.append(r0)
            com.whatsapp.Me r0 = r6.A00
            r1.append(r0)
            java.lang.String r0 = ", myUserJid: "
            r1.append(r0)
            com.whatsapp.jid.PhoneUserJid r0 = r6.A03
            r1.append(r0)
            java.lang.String r0 = ", myDeviceJid: "
            r1.append(r0)
            X.13x r0 = r6.A02
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.util.List r0 = r6.A0D
            java.util.Iterator r1 = r0.iterator()
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00b4
            r1.next()
            java.lang.String r1 = "onChange"
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r1)
            throw r0
        L_0x008c:
            X.142 r0 = new X.142
            r0.<init>(r1)
            r6.A0E = r0
            X.142 r1 = r6.A0E
            X.0wh r3 = r6.A0A
            android.content.SharedPreferences r2 = r3.A01
            java.lang.String r0 = "profile_photo_thumb_id"
            int r0 = r2.getInt(r0, r4)
            r1.A06 = r0
            X.142 r1 = r6.A0E
            java.lang.String r0 = "profile_photo_full_id"
            int r0 = r2.getInt(r0, r4)
            r1.A05 = r0
            X.142 r1 = r6.A0E
            java.lang.String r0 = r3.A02()
            r1.A0a = r0
            goto L_0x004b
        L_0x00b4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19730wQ.A01(com.whatsapp.Me, X.0wQ):void");
    }

    public static boolean A03(Me me, C19730wQ r5, String str) {
        StringBuilder sb;
        String str2;
        ObjectOutputStream objectOutputStream;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("memanager/save ");
        sb2.append(str);
        Log.i(sb2.toString());
        try {
            objectOutputStream = new ObjectOutputStream(r5.A09.A00.openFileOutput(str, 0));
            objectOutputStream.writeObject(me);
            objectOutputStream.close();
            return true;
        } catch (FileNotFoundException e) {
            e = e;
            sb = new StringBuilder();
            str2 = "memanager/save/notfounderror ";
            sb.append(str2);
            sb.append(str);
            Log.e(sb.toString(), e);
            return false;
        } catch (IOException e2) {
            e = e2;
            sb = new StringBuilder();
            str2 = "memanager/save/ioerror ";
            sb.append(str2);
            sb.append(str);
            Log.e(sb.toString(), e);
            return false;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    public int A04() {
        return this.A07.A01.A01.getInt("registration_device_id", 0);
    }

    public Me A05() {
        C222413l r2;
        Log.i("memanager/getoldme");
        A0G();
        Context context = this.A09.A00;
        Me me = null;
        if (new File(context.getFilesDir(), "me_old").exists()) {
            try {
                FileInputStream openFileInput = context.openFileInput("me_old");
                try {
                    r2 = new C222413l(this, openFileInput);
                    Me me2 = (Me) r2.readObject();
                    try {
                        r2.close();
                        if (openFileInput != null) {
                            try {
                                openFileInput.close();
                            } catch (ClassNotFoundException e) {
                                e = e;
                                me = me2;
                            } catch (IOException e2) {
                                e = e2;
                                me = me2;
                                Log.e("memanager/read_old_me/io_error", e);
                                return me;
                            }
                        }
                        return me2;
                    } catch (Throwable th) {
                        th = th;
                        me = me2;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (openFileInput != null) {
                        try {
                            openFileInput.close();
                        } catch (Throwable th3) {
                            th.addSuppressed(th3);
                        }
                    }
                    throw th;
                }
            } catch (ClassNotFoundException e3) {
                e = e3;
                Log.w("memanager/read_old_me/serialization_error", e);
                return me;
            } catch (IOException e4) {
                e = e4;
                Log.e("memanager/read_old_me/io_error", e);
                return me;
            }
        }
        return me;
        throw th;
    }

    public String A0B() {
        String str = this.A05;
        if (str == null) {
            str = ((SharedPreferences) this.A0C.A00.get()).getString("self_user_name", "");
            if (str.isEmpty()) {
                return "";
            }
            this.A05 = str;
        }
        return str;
    }

    public void A0D() {
        Log.i("memanager/clearMe");
        A0G();
        A01((Me) null, this);
    }

    public void A0E() {
        Log.i("memanager/deleteoldme");
        A0G();
        new File(this.A09.A00.getFilesDir(), "me").delete();
    }

    public void A0F() {
        Log.i("memanager/deleteoldme");
        A0G();
        new File(this.A09.A00.getFilesDir(), "me_old").delete();
    }

    public void A0G() {
        C20000wr r1 = this.A08;
        if (r1.A06()) {
            r1.A04(new C222313k(this));
            r1.A00();
        }
    }

    public void A0I(String str) {
        String str2 = this.A05;
        if (!str.equals(str2)) {
            if (str2 == null) {
                str2 = "";
            }
            this.A0C.A1m("self_user_name", str);
            this.A05 = str;
            C19750wS r0 = this.A0B;
            C223613z r2 = C223613z.A00;
            Iterable<AnonymousClass194> observers = r0.getObservers();
            AnonymousClass00C.A08(observers);
            for (AnonymousClass194 BkB : observers) {
                BkB.BkB(r2, str2, str);
            }
        }
    }

    public void A0J(String str) {
        this.A0A.A01.edit().putString("push_name", str).apply();
        A0G();
        AnonymousClass142 r0 = this.A0E;
        if (r0 != null) {
            r0.A0a = str;
        }
    }

    public boolean A0M(AnonymousClass11F r2) {
        if (r2 == null) {
            return false;
        }
        A0G();
        if (r2.equals(this.A03) || r2.equals(A08())) {
            return true;
        }
        return false;
    }

    public boolean A0N(DeviceJid deviceJid) {
        if (deviceJid == null || !A0M(deviceJid.userJid) || deviceJid.getDevice() == 0) {
            return false;
        }
        return true;
    }

    public C19730wQ(C19750wS r2, C19990wq r3, C19630wG r4, C19420v0 r5, C19900wh r6) {
        this.A09 = r4;
        this.A0B = r2;
        this.A0C = r5;
        this.A07 = r3;
        this.A0A = r6;
    }

    public Me A06() {
        A0G();
        return this.A00;
    }

    public PhoneUserJid A0A() {
        A0G();
        return this.A03;
    }

    public boolean A0L() {
        A0G();
        if (this.A07.A01.A01.getInt("registration_device_id", 0) > 0) {
            return true;
        }
        return false;
    }

    public boolean A0O(DeviceJid deviceJid) {
        A0G();
        if (deviceJid.equals(this.A02) || deviceJid.equals(A07())) {
            return true;
        }
        return false;
    }
}
