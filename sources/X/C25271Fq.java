package X;

import android.app.Notification;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.DeadObjectException;
import android.text.TextUtils;
import android.util.Base64;
import com.whatsapp.util.Log;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: X.1Fq  reason: invalid class name and case insensitive filesystem */
public class C25271Fq {
    public final C007203c A00;
    public final C19970wo A01;
    public final C19420v0 A02;
    public final C25261Fp A03;

    public void A02(int i, Notification notification) {
        boolean z = true;
        if (i == 1) {
            z = false;
        }
        A01(notification, (String) null, i, z);
    }

    public void A03(int i, String str) {
        A04(i, (String) null, str);
    }

    public void A07(String str, int i, Notification notification) {
        A01(notification, str, i, true);
    }

    public static String A00(AnonymousClass11F r2) {
        if (r2 == null) {
            return null;
        }
        try {
            return Base64.encodeToString(MessageDigest.getInstance("SHA-256").digest(r2.getRawString().getBytes()), 0);
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }

    private void A01(Notification notification, String str, int i, boolean z) {
        String obj;
        int valueOf;
        int i2;
        if (Build.VERSION.SDK_INT < 26 || !TextUtils.isEmpty(notification.getChannelId())) {
            try {
                this.A00.A00(str, i, notification);
                C19420v0 r3 = this.A02;
                ((SharedPreferences) r3.A00.get()).edit().putLong("last_notif_posted_timestamp", C19970wo.A00(this.A01)).apply();
                if (z) {
                    C25261Fp r32 = this.A03;
                    if (i == 4) {
                        valueOf = 6;
                    } else {
                        int i3 = 21;
                        if (!(i == 23 || i == 27 || i == 51)) {
                            if (i == 5 || i == 46) {
                                i2 = 13;
                            } else if (i == 9 || i == 40 || i == 43 || i == 44 || i == 15 || i == 21 || i == 24) {
                                i2 = 12;
                            } else {
                                i3 = 28;
                                if (i == 28 || i == 29 || i == 30 || i == 37 || i == 38 || i == 47 || i == 26 || i == 17 || i == 22) {
                                    valueOf = 15;
                                } else {
                                    i2 = 20;
                                    if (i != 16) {
                                        if (i == 31) {
                                            i2 = 25;
                                        } else {
                                            i2 = 19;
                                            if (i != 6) {
                                                if (i != 55) {
                                                    if (i == 62) {
                                                        valueOf = 27;
                                                    } else {
                                                        valueOf = null;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            valueOf = Integer.valueOf(i2);
                        }
                        valueOf = Integer.valueOf(i3);
                    }
                    r32.A03.execute(new C35721j9(r32, valueOf, 3));
                }
            } catch (IllegalStateException | SecurityException e) {
                e = e;
                StringBuilder sb = new StringBuilder();
                sb.append("wanotificationmanager/notifyfailed/");
                sb.append(e);
                obj = sb.toString();
                Log.e(obj);
            } catch (RuntimeException e2) {
                e = e2;
                if (!(e.getCause() instanceof DeadObjectException)) {
                    throw e;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("wanotificationmanager/notifyfailed/");
                sb2.append(e);
                obj = sb2.toString();
                Log.e(obj);
            }
        } else {
            obj = "wanotificationmanager/notifyfailed/channelId empty";
            Log.e(obj);
        }
    }

    public void A06(AnonymousClass11F r3, String str) {
        int i = 1;
        if (r3 instanceof C28981Uw) {
            i = 59;
        }
        A04(i, A00(r3), str);
    }

    public C25271Fq(C19970wo r3, C19630wG r4, C19420v0 r5, C25261Fp r6) {
        this.A01 = r3;
        this.A02 = r5;
        this.A03 = r6;
        this.A00 = new C007203c(r4.A00);
    }

    public void A04(int i, String str, String str2) {
        C224714l.A02();
        try {
            this.A00.A00.cancel(str, i);
            if (i == 1) {
                A04(59, str, str2);
            }
        } catch (RuntimeException e) {
            if (e.getCause() instanceof DeadObjectException) {
                StringBuilder sb = new StringBuilder();
                sb.append("wanotificationmanager/cancelfailed/");
                sb.append(e);
                Log.e(sb.toString());
                return;
            }
            throw e;
        }
    }

    public void A05(Notification notification, AnonymousClass11F r6) {
        String A002 = A00(r6);
        int i = 1;
        if (r6 instanceof C28981Uw) {
            i = 59;
        }
        A01(notification, A002, i, false);
    }
}
