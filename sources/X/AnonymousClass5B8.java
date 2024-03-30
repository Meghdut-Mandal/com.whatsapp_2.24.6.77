package X;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.location.Location;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import com.whatsapp.R;
import com.whatsapp.location.GroupChatLiveLocationsActivity;
import com.whatsapp.location.LocationPicker;

/* renamed from: X.5B8  reason: invalid class name */
public class AnonymousClass5B8 extends C97684q6 {
    public float A00;
    public float A01;
    public int A02 = 2;
    public long A03;
    public SensorManager A04;
    public Display A05;
    public C139266jV A06;
    public C97604py A07;
    public C108545Tx A08 = C108545Tx.BOTTOM_RIGHT;
    public C32691e2 A09;
    public C21060yb A0A;
    public AnonymousClass6LS A0B;
    public boolean A0C;
    public final SensorEventListener A0D = new C164127rJ(this, 0);
    public final AnonymousClass7eQ A0E = new C165447tR(this, 1);
    public final float[] A0F = new float[3];
    public final float[] A0G = new float[16];
    public final float[] A0H = new float[3];

    private void setupInfoButtonForFacebookMap(Context context) {
        A0H(new C165327tF(context, this, 2));
    }

    public void A0K() {
        SensorManager sensorManager = this.A04;
        if (sensorManager != null) {
            Sensor defaultSensor = sensorManager.getDefaultSensor(11);
            this.A0C = AnonymousClass000.A1V(defaultSensor);
            if (defaultSensor != null) {
                sensorManager.registerListener(this.A0D, defaultSensor, 16000);
            }
        }
    }

    public void A0L(int i) {
        ImageView imageView;
        int i2;
        LocationPicker locationPicker;
        ImageView imageView2;
        int i3;
        if (this instanceof C162807pB) {
            C162807pB r2 = (C162807pB) this;
            if (r2.A01 != 0) {
                if (i != 0) {
                    locationPicker = (LocationPicker) r2.A00;
                    imageView2 = locationPicker.A0P.A0K;
                    if (i != 1) {
                        i3 = R.drawable.btn_myl;
                    } else {
                        imageView2.setImageResource(R.drawable.btn_myl_active);
                        locationPicker.A0P.A0h = true;
                        return;
                    }
                } else {
                    locationPicker = (LocationPicker) r2.A00;
                    imageView2 = locationPicker.A0P.A0K;
                    i3 = R.drawable.btn_compass_mode_tilt;
                }
                imageView2.setImageResource(i3);
                locationPicker.A0P.A0h = false;
                return;
            }
            int i4 = 8;
            GroupChatLiveLocationsActivity groupChatLiveLocationsActivity = (GroupChatLiveLocationsActivity) r2.A00;
            if (i == 0) {
                C142466ov r0 = groupChatLiveLocationsActivity.A0N;
                r0.A0W = true;
                r0.A0U = true;
                imageView = groupChatLiveLocationsActivity.A03;
                i2 = R.drawable.btn_compass_mode_tilt;
            } else if (i != 1) {
                groupChatLiveLocationsActivity.A03.setImageResource(R.drawable.btn_myl);
                groupChatLiveLocationsActivity.A0N.A0U = false;
                return;
            } else {
                C142466ov r02 = groupChatLiveLocationsActivity.A0N;
                r02.A0W = true;
                r02.A0U = true;
                imageView = groupChatLiveLocationsActivity.A03;
                i2 = R.drawable.btn_myl_active;
            }
            imageView.setImageResource(i2);
            C142466ov r03 = groupChatLiveLocationsActivity.A0N;
            View view = r03.A0C;
            if (r03.A0O == null) {
                i4 = 0;
            }
            view.setVisibility(i4);
        }
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.A02 != 2) {
            this.A02 = 2;
            A0L(2);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public Location getMyLocation() {
        C139266jV A0J = A0J(this.A0E);
        if (A0J == null || !A0J.A0M || A0J.A0G == null) {
            return null;
        }
        return A0J.A0U.A00;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0062, code lost:
        if (r3 != null) goto L_0x0033;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setLocationMode(int r6) {
        /*
            r5 = this;
            X.7eQ r0 = r5.A0E
            X.6jV r4 = r5.A0J(r0)
            if (r4 != 0) goto L_0x000b
            r5.A02 = r6
        L_0x000a:
            return
        L_0x000b:
            X.6bx r3 = r4.A02()
            if (r6 == 0) goto L_0x001d
            r2 = 1
            r1 = 2
            if (r6 == r2) goto L_0x0065
            if (r6 != r1) goto L_0x000a
            r5.A02 = r1
            r5.A0L(r1)
            return
        L_0x001d:
            boolean r0 = r5.A0C
            if (r0 == 0) goto L_0x000a
            float r0 = r3.A02
            r5.A01 = r0
            r0 = 0
            r5.A0L(r0)
            android.location.Location r0 = r5.getMyLocation()
            if (r0 == 0) goto L_0x0060
            X.6bv r3 = X.C134976bv.A01(r0)
        L_0x0033:
            X.62T r2 = new X.62T
            r2.<init>()
            float r0 = r5.A00
            r2.A00 = r0
            float r1 = r5.A01
            r0 = 1097859072(0x41700000, float:15.0)
            float r0 = java.lang.Math.max(r1, r0)
            r2.A01 = r0
            r2.A02 = r3
            X.6bx r0 = r2.A00()
            X.64g r0 = X.AnonymousClass6GS.A00(r0)
            r4.A08(r0)
        L_0x0053:
            r0 = 31
            X.3vA r2 = new X.3vA
            r2.<init>(r5, r4, r0)
            r0 = 1000(0x3e8, double:4.94E-321)
            r5.postDelayed(r2, r0)
            return
        L_0x0060:
            X.6bv r3 = r3.A03
            if (r3 == 0) goto L_0x0053
            goto L_0x0033
        L_0x0065:
            android.location.Location r0 = r5.getMyLocation()
            if (r0 == 0) goto L_0x008f
            X.6bv r0 = X.C134976bv.A01(r0)
            r5.A02 = r2
            r1 = 1
        L_0x0072:
            r5.A0L(r1)
            X.62T r1 = new X.62T
            r1.<init>()
            r1.A02 = r0
            float r0 = r3.A02
            r1.A01 = r0
            r0 = 0
            r1.A00 = r0
            X.6bx r0 = r1.A00()
            X.64g r0 = X.AnonymousClass6GS.A00(r0)
            r4.A08(r0)
            return
        L_0x008f:
            X.6bv r0 = r3.A03
            r5.A02 = r1
            goto L_0x0072
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5B8.setLocationMode(int):void");
    }

    public AnonymousClass5B8(Context context, C124515yJ r4) {
        super(context, r4);
        this.A08 = r4.A01;
        this.A04 = this.A0A.A0A();
        this.A05 = this.A0A.A0L().getDefaultDisplay();
        setupInfoButtonForFacebookMap(getContext());
    }

    public C139266jV A0J(AnonymousClass7eQ r2) {
        C18740tg.A01();
        C139266jV r0 = this.A06;
        if (r0 != null) {
            r2.BaR(r0);
            return this.A06;
        }
        A0H(r2);
        return null;
    }

    public int getLocationMode() {
        return this.A02;
    }

    public void setInfoButtonPosition(C108545Tx r1) {
        this.A08 = r1;
    }
}
