package X;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.view.MenuItem;
import android.view.View;
import com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate;
import com.whatsapp.R;
import com.whatsapp.businessdirectory.view.activity.DirectorySetLocationMapActivity;
import com.whatsapp.location.GroupChatLiveLocationsActivity2;
import com.whatsapp.location.LocationPicker2;

/* renamed from: X.7tS  reason: invalid class name and case insensitive filesystem */
public class C165457tS implements AnonymousClass7f7 {
    public Object A00;
    public final int A01;

    public C165457tS(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void BaS(C129186Fs r10) {
        C129186Fs r1;
        C98864s9 A002;
        switch (this.A01) {
            case 0:
                ((DirectorySetLocationMapActivity) this.A00).A3i(r10);
                return;
            case 1:
                AnonymousClass5B9 r12 = (AnonymousClass5B9) this.A00;
                if (r12.A08 == null) {
                    r12.A08 = r10;
                    r12.setLocationMode(r12.A03);
                    return;
                }
                return;
            case 2:
                GroupChatLiveLocationsActivity2 groupChatLiveLocationsActivity2 = (GroupChatLiveLocationsActivity2) this.A00;
                if (groupChatLiveLocationsActivity2.A06 == null) {
                    groupChatLiveLocationsActivity2.A06 = r10;
                    r10.A08(0, 0, 0, groupChatLiveLocationsActivity2.A01);
                    groupChatLiveLocationsActivity2.A01 = 0;
                    C18740tg.A06(groupChatLiveLocationsActivity2.A06);
                    C19890wg r0 = groupChatLiveLocationsActivity2.A0S;
                    String str = C19430v1.A0A;
                    int i = 0;
                    boolean z = r0.A00(str).getBoolean("live_location_show_traffic", false);
                    groupChatLiveLocationsActivity2.A06.A0M(z);
                    MenuItem menuItem = groupChatLiveLocationsActivity2.A03;
                    if (menuItem != null) {
                        menuItem.setChecked(z);
                    }
                    groupChatLiveLocationsActivity2.A06.A07(groupChatLiveLocationsActivity2.A0S.A00(str).getInt("live_location_map_type", 1));
                    groupChatLiveLocationsActivity2.A06.A0K(true);
                    try {
                        C133816a2 r7 = (C133816a2) groupChatLiveLocationsActivity2.A06.A01().A00;
                        Parcel A003 = C133816a2.A00(r7);
                        A003.writeInt(1);
                        r7.A03(2, A003);
                        try {
                            C133816a2 r13 = (C133816a2) groupChatLiveLocationsActivity2.A06.A01().A00;
                            Parcel A004 = C133816a2.A00(r13);
                            A004.writeInt(0);
                            r13.A03(1, A004);
                            groupChatLiveLocationsActivity2.A06.A01().A00();
                            groupChatLiveLocationsActivity2.A06.A0D(new C141436nF(groupChatLiveLocationsActivity2));
                            groupChatLiveLocationsActivity2.A06.A0I(new C163597qS(groupChatLiveLocationsActivity2, 0));
                            groupChatLiveLocationsActivity2.A06.A0F(new C138166hP(groupChatLiveLocationsActivity2, 1));
                            groupChatLiveLocationsActivity2.A06.A0E(new C164697sE(groupChatLiveLocationsActivity2, 1));
                            groupChatLiveLocationsActivity2.A06.A0H(new C163507qJ(groupChatLiveLocationsActivity2, 1));
                            groupChatLiveLocationsActivity2.A06.A0G(new C163587qR(groupChatLiveLocationsActivity2, 0));
                            GroupChatLiveLocationsActivity2.A0G(groupChatLiveLocationsActivity2);
                            if (groupChatLiveLocationsActivity2.A02 != null) {
                                C142466ov r2 = groupChatLiveLocationsActivity2.A0O;
                                View view = r2.A0C;
                                if (!r2.A0W || r2.A0O != null) {
                                    i = 8;
                                }
                                view.setVisibility(i);
                                groupChatLiveLocationsActivity2.A0N.setLocationMode(groupChatLiveLocationsActivity2.A02.getInt("map_location_mode", 2));
                                if (groupChatLiveLocationsActivity2.A02.containsKey("camera_zoom")) {
                                    groupChatLiveLocationsActivity2.A06.A0A(AnonymousClass6UP.A02(C90524aI.A0F(groupChatLiveLocationsActivity2.A02.getDouble("camera_lat"), groupChatLiveLocationsActivity2.A02.getDouble("camera_lng")), groupChatLiveLocationsActivity2.A02.getFloat("camera_zoom")));
                                }
                                groupChatLiveLocationsActivity2.A02 = null;
                            } else if (groupChatLiveLocationsActivity2.A0U.isEmpty()) {
                                SharedPreferences A005 = groupChatLiveLocationsActivity2.A0S.A00(str);
                                groupChatLiveLocationsActivity2.A06.A0A(AnonymousClass6UP.A01(C90524aI.A0F((double) A005.getFloat("live_location_lat", 37.389805f), (double) A005.getFloat("live_location_lng", -122.08141f))));
                                C129186Fs r4 = groupChatLiveLocationsActivity2.A06;
                                float f = A005.getFloat("live_location_zoom", 16.0f) - 0.2f;
                                try {
                                    ICameraUpdateFactoryDelegate iCameraUpdateFactoryDelegate = AnonymousClass6UP.A00;
                                    AnonymousClass006.A02(iCameraUpdateFactoryDelegate, "CameraUpdateFactory is not initialized");
                                    C133816a2 r22 = (C133816a2) iCameraUpdateFactoryDelegate;
                                    Parcel A006 = C133816a2.A00(r22);
                                    A006.writeFloat(f);
                                    r4.A0A(new C115065iH(C133816a2.A01(A006, r22, 4)));
                                } catch (RemoteException e) {
                                    throw AnonymousClass78K.A00(e);
                                }
                            } else {
                                GroupChatLiveLocationsActivity2.A0I(groupChatLiveLocationsActivity2, false);
                            }
                            if (AnonymousClass1RC.A0A(groupChatLiveLocationsActivity2)) {
                                r1 = groupChatLiveLocationsActivity2.A06;
                                A002 = C98864s9.A00(groupChatLiveLocationsActivity2, R.raw.night_map_style_json);
                                break;
                            } else {
                                return;
                            }
                        } catch (RemoteException e2) {
                            throw AnonymousClass78K.A00(e2);
                        }
                    } catch (RemoteException e3) {
                        throw AnonymousClass78K.A00(e3);
                    }
                } else {
                    return;
                }
            default:
                LocationPicker2 locationPicker2 = (LocationPicker2) this.A00;
                if (locationPicker2.A02 == null) {
                    locationPicker2.A02 = r10;
                    C18740tg.A06(r10);
                    locationPicker2.A0U = new C117345m7(r10);
                    r10.A0M(false);
                    locationPicker2.A02.A0K(true);
                    if (locationPicker2.A0L.A05() && !locationPicker2.A0W.A0i) {
                        locationPicker2.A02.A0L(true);
                    }
                    C129186Fs r3 = locationPicker2.A02;
                    C133586Zc r02 = locationPicker2.A0W;
                    r3.A08(0, 0, 0, Math.max(r02.A01, r02.A02));
                    locationPicker2.A02.A01().A00();
                    locationPicker2.A02.A0D(new C141446nG(locationPicker2));
                    locationPicker2.A02.A0I(new C163597qS(locationPicker2, 1));
                    locationPicker2.A02.A0G(new C163587qR(locationPicker2, 1));
                    locationPicker2.A02.A0H(new C163507qJ(locationPicker2, 2));
                    locationPicker2.A02.A0F(new C138166hP(locationPicker2, 2));
                    locationPicker2.A02.A0E(new C164697sE(locationPicker2, 2));
                    locationPicker2.A0W.A0U((Float) null, false);
                    C135096c8 r03 = locationPicker2.A0W.A0W;
                    if (r03 != null && !r03.A0D.isEmpty()) {
                        locationPicker2.A0W.A0N();
                    }
                    Bundle bundle = locationPicker2.A00;
                    if (bundle != null) {
                        locationPicker2.A0V.setLocationMode(bundle.getInt("map_location_mode", 2));
                        if (locationPicker2.A00.containsKey("camera_zoom")) {
                            locationPicker2.A02.A0A(AnonymousClass6UP.A02(C90524aI.A0F(locationPicker2.A00.getDouble("camera_lat"), locationPicker2.A00.getDouble("camera_lng")), locationPicker2.A00.getFloat("camera_zoom")));
                        }
                        locationPicker2.A00 = null;
                    } else {
                        SharedPreferences A007 = locationPicker2.A0a.A00(C19430v1.A0A);
                        locationPicker2.A02.A0A(AnonymousClass6UP.A02(C90524aI.A0F((double) A007.getFloat("share_location_lat", 37.389805f), (double) A007.getFloat("share_location_lon", -122.08141f)), A007.getFloat("share_location_zoom", 15.0f) - 0.2f));
                    }
                    if (AnonymousClass1RC.A0A(locationPicker2)) {
                        r1 = locationPicker2.A02;
                        A002 = C98864s9.A00(locationPicker2, R.raw.night_map_style_json);
                        break;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
        }
        r1.A0J(A002);
    }
}
