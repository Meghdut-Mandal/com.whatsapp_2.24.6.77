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
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.whatsapp.R;
import com.whatsapp.businessdirectory.view.activity.DirectorySetLocationMapActivity;
import com.whatsapp.location.GroupChatLiveLocationsActivity2;
import com.whatsapp.location.LocationPicker2;

/* renamed from: X.5B9  reason: invalid class name */
public abstract class AnonymousClass5B9 extends C99184sl {
    public float A00;
    public float A01;
    public float A02;
    public int A03 = 2;
    public long A04;
    public SensorManager A05 = this.A09.A0A();
    public Location A06;
    public Display A07 = this.A09.A0L().getDefaultDisplay();
    public C129186Fs A08;
    public C21060yb A09;
    public boolean A0A;
    public boolean A0B;
    public final SensorEventListener A0C = new C164127rJ(this, 1);
    public final C159117iq A0D = new C163207pp(this, 0);
    public final float[] A0E = new float[3];
    public final float[] A0F = new float[16];
    public final float[] A0G = new float[3];

    public void A0A(int i) {
        DirectorySetLocationMapActivity directorySetLocationMapActivity;
        ImageView imageView;
        int i2;
        ImageView imageView2;
        int i3;
        LocationPicker2 locationPicker2;
        ImageView imageView3;
        int i4;
        C162817pC r2 = (C162817pC) this;
        switch (r2.A01) {
            case 0:
                if (i != 0) {
                    directorySetLocationMapActivity = (DirectorySetLocationMapActivity) r2.A00;
                    imageView = directorySetLocationMapActivity.A0A.A04;
                    if (i != 1) {
                        i2 = R.drawable.btn_myl;
                    } else {
                        imageView.setImageResource(R.drawable.btn_myl_active);
                        directorySetLocationMapActivity.A0A.A0F = true;
                        return;
                    }
                } else {
                    directorySetLocationMapActivity = (DirectorySetLocationMapActivity) r2.A00;
                    imageView = directorySetLocationMapActivity.A0A.A04;
                    i2 = R.drawable.btn_compass_mode_tilt;
                }
                imageView.setImageResource(i2);
                directorySetLocationMapActivity.A0A.A0F = false;
                return;
            case 1:
                int i5 = 8;
                GroupChatLiveLocationsActivity2 groupChatLiveLocationsActivity2 = (GroupChatLiveLocationsActivity2) r2.A00;
                if (i == 0) {
                    C142466ov r0 = groupChatLiveLocationsActivity2.A0O;
                    r0.A0W = true;
                    r0.A0U = true;
                    View view = r0.A0C;
                    if (r0.A0O == null) {
                        i5 = 0;
                    }
                    view.setVisibility(i5);
                    imageView2 = groupChatLiveLocationsActivity2.A04;
                    i3 = R.drawable.btn_compass_mode_tilt;
                } else if (i != 1) {
                    groupChatLiveLocationsActivity2.A04.setImageResource(R.drawable.btn_myl);
                    groupChatLiveLocationsActivity2.A0O.A0U = false;
                    return;
                } else {
                    C142466ov r02 = groupChatLiveLocationsActivity2.A0O;
                    r02.A0W = true;
                    r02.A0U = true;
                    View view2 = r02.A0C;
                    if (r02.A0O == null) {
                        i5 = 0;
                    }
                    view2.setVisibility(i5);
                    imageView2 = groupChatLiveLocationsActivity2.A04;
                    i3 = R.drawable.btn_myl_active;
                }
                imageView2.setImageResource(i3);
                return;
            default:
                if (i != 0) {
                    locationPicker2 = (LocationPicker2) r2.A00;
                    imageView3 = locationPicker2.A0W.A0K;
                    if (i != 1) {
                        i4 = R.drawable.btn_myl;
                    } else {
                        imageView3.setImageResource(R.drawable.btn_myl_active);
                        locationPicker2.A0W.A0h = true;
                        return;
                    }
                } else {
                    locationPicker2 = (LocationPicker2) r2.A00;
                    imageView3 = locationPicker2.A0W.A0K;
                    i4 = R.drawable.btn_compass_mode_tilt;
                }
                imageView3.setImageResource(i4);
                locationPicker2.A0W.A0h = false;
                return;
        }
    }

    public static LatLng A01(LatLng latLng, double d) {
        return C90484aE.A0R(latLng, d, 50.0d / 6378137.0d);
    }

    public void A09() {
        SensorManager sensorManager = this.A05;
        if (sensorManager != null) {
            Sensor defaultSensor = sensorManager.getDefaultSensor(11);
            this.A0B = AnonymousClass000.A1V(defaultSensor);
            if (defaultSensor != null) {
                sensorManager.registerListener(this.A0C, defaultSensor, 1);
            }
        }
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.A03 != 2) {
            this.A03 = 2;
            A0A(2);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public void setLocationMode(int i) {
        LatLng latLng;
        LatLng latLng2;
        int i2;
        C129186Fs r4 = this.A08;
        if (r4 != null) {
            CameraPosition A022 = r4.A02();
            if (i != 0) {
                if (i == 1) {
                    Location location = this.A06;
                    if (location != null) {
                        latLng2 = C90524aI.A0F(location.getLatitude(), this.A06.getLongitude());
                        this.A03 = 1;
                        i2 = 1;
                    } else {
                        latLng2 = A022.A03;
                        this.A03 = 2;
                        i2 = 2;
                    }
                    A0A(i2);
                    AnonymousClass67C r1 = new AnonymousClass67C();
                    AnonymousClass006.A02(latLng2, "location must not be null.");
                    r1.A03 = latLng2;
                    r1.A00 = A022.A02;
                    r1.A01 = 0.0f;
                    r1.A02 = 0.0f;
                    r4.A09(AnonymousClass6UP.A00(r1.A00()));
                    return;
                } else if (i == 2) {
                    this.A03 = 2;
                    A0A(2);
                    return;
                } else {
                    return;
                }
            } else if (this.A0B) {
                this.A01 = A022.A02;
                i = 0;
                A0A(0);
                Location location2 = this.A06;
                if (location2 != null) {
                    latLng = C90524aI.A0F(location2.getLatitude(), this.A06.getLongitude());
                } else {
                    latLng = A022.A03;
                }
                r4.A0B(AnonymousClass6UP.A00(C92744eX.A00(latLng, this)), this.A0D);
            } else {
                return;
            }
        }
        this.A03 = i;
    }

    public AnonymousClass5B9(Context context, GoogleMapOptions googleMapOptions) {
        super(context, googleMapOptions);
        A07(new C165457tS(this, 1));
    }

    public C129186Fs A08(AnonymousClass7f7 r2) {
        C18740tg.A01();
        C129186Fs r0 = this.A08;
        if (r0 != null) {
            r2.BaS(r0);
            return this.A08;
        }
        A07(r2);
        return null;
    }

    public int getLocationMode() {
        return this.A03;
    }

    public void setMyLocation(Location location) {
        this.A06 = location;
    }
}
