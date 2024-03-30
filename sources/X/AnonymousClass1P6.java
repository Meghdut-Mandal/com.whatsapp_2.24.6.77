package X;

import android.app.ActivityManager;
import android.content.Context;
import android.location.Location;
import android.text.TextUtils;
import com.whatsapp.Me;
import com.whatsapp.util.Log;

/* renamed from: X.1P6  reason: invalid class name */
public class AnonymousClass1P6 {
    public static final String[] A09 = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"};
    public boolean A00;
    public final C237019m A01;
    public final C19730wQ A02;
    public final C21060yb A03;
    public final C19970wo A04;
    public final C19630wG A05;
    public final C20810yC A06;
    public final C19420v0 A07;
    public volatile Boolean A08;

    public static boolean A01(Location location, Location location2) {
        return location2 == null || location2.getTime() + 120000 < location.getTime() || location2.getAccuracy() > location.getAccuracy() || (TextUtils.equals(location2.getProvider(), location.getProvider()) && location2.distanceTo(location) > Math.max(10.0f, location.getAccuracy()));
    }

    public static void A00(AnonymousClass8K6 r4, C63593Kq r5, Integer num) {
        double d = r5.A00;
        r4.A0S();
        C173448Rs r3 = (C173448Rs) r4.A00;
        C173448Rs r0 = C173448Rs.DEFAULT_INSTANCE;
        r3.bitField0_ |= 1;
        r3.degreesLatitude_ = d;
        double d2 = r5.A01;
        r4.A0S();
        C173448Rs r32 = (C173448Rs) r4.A00;
        r32.bitField0_ |= 2;
        r32.degreesLongitude_ = d2;
        int i = r5.A03;
        if (i != -1) {
            r4.A0S();
            C173448Rs r1 = (C173448Rs) r4.A00;
            r1.bitField0_ |= 4;
            r1.accuracyInMeters_ = i;
        }
        float f = r5.A02;
        if (f != -1.0f) {
            r4.A0S();
            C173448Rs r12 = (C173448Rs) r4.A00;
            r12.bitField0_ |= 8;
            r12.speedInMps_ = f;
        }
        int i2 = r5.A04;
        if (i2 != -1) {
            r4.A0S();
            C173448Rs r13 = (C173448Rs) r4.A00;
            r13.bitField0_ |= 16;
            r13.degreesClockwiseFromMagneticNorth_ = i2;
        }
        if (num != null) {
            int intValue = num.intValue();
            r4.A0S();
            C173448Rs r14 = (C173448Rs) r4.A00;
            r14.bitField0_ |= 128;
            r14.timeOffset_ = intValue;
        }
    }

    public AnonymousClass8SX A02(C63593Kq r3, Integer num) {
        AnonymousClass8NL r1 = (AnonymousClass8NL) AnonymousClass8SX.DEFAULT_INSTANCE.A0p();
        C173448Rs r0 = ((AnonymousClass8SX) r1.A00).liveLocationMessage_;
        if (r0 == null) {
            r0 = C173448Rs.DEFAULT_INSTANCE;
        }
        AnonymousClass8K6 r02 = (AnonymousClass8K6) r0.A0q();
        A00(r02, r3, num);
        r1.A0b(r02);
        return (AnonymousClass8SX) r1.A0R();
    }

    public void A03(Context context) {
        String A012;
        C19730wQ r0 = this.A02;
        r0.A0G();
        Me me = r0.A00;
        if (me == null) {
            A012 = "ZZ";
        } else {
            A012 = AnonymousClass1M4.A01(me.cc, me.number);
        }
        AnonymousClass6UZ.A03 = A012;
        if (C112705eK.A00 == null) {
            C112705eK.A00 = new C139306jZ(this.A01);
        }
        AnonymousClass6UZ.A01(context, AnonymousClass6JD.A0B);
        AnonymousClass6UZ.A02(true);
        AnonymousClass5Y9.A00(context);
    }

    public void A04(Context context) {
        if (C112705eK.A00 == null) {
            C112705eK.A00 = new C139306jZ(this.A01);
        }
        AnonymousClass6UZ.A01(context, AnonymousClass6JD.A0B);
        AnonymousClass5Y9.A00(context);
    }

    public boolean A05(Context context) {
        boolean z;
        if (this.A08 == null) {
            synchronized (this) {
                if (this.A08 != null) {
                    z = this.A08.booleanValue();
                } else {
                    z = false;
                    if (C34201gc.A00(context) == 0) {
                        z = true;
                    }
                    if (!C20800yB.A01(C21000yV.A02, this.A06, 4269)) {
                        boolean z2 = false;
                        if (z && AnonymousClass6II.A00(context) == 0) {
                            ActivityManager A042 = this.A03.A04();
                            if (A042 == null) {
                                Log.w("app/has-google-maps-v2 am=false");
                            } else if (A042.getDeviceConfigurationInfo().reqGlEsVersion >= 131072) {
                                z2 = true;
                            }
                        }
                        z = z2;
                    }
                }
            }
            this.A08 = Boolean.valueOf(z);
        }
        return this.A08.booleanValue();
    }

    public AnonymousClass1P6(C237019m r1, C19730wQ r2, C21060yb r3, C19970wo r4, C19630wG r5, C19420v0 r6, C20810yC r7) {
        this.A04 = r4;
        this.A06 = r7;
        this.A05 = r5;
        this.A02 = r2;
        this.A03 = r3;
        this.A07 = r6;
        this.A01 = r1;
    }
}
