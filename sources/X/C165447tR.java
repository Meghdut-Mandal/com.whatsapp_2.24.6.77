package X;

import android.content.SharedPreferences;
import android.os.Bundle;
import com.whatsapp.businessdirectory.util.FacebookMapPreview;
import com.whatsapp.location.GroupChatLiveLocationsActivity;
import com.whatsapp.location.LocationPicker;

/* renamed from: X.7tR  reason: invalid class name and case insensitive filesystem */
public class C165447tR implements AnonymousClass7eQ {
    public Object A00;
    public final int A01;

    public C165447tR(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void BaR(C139266jV r10) {
        C139266jV r3;
        float f;
        C1264964g r0;
        switch (this.A01) {
            case 0:
                FacebookMapPreview facebookMapPreview = (FacebookMapPreview) this.A00;
                if (r10 != null) {
                    AnonymousClass63E r1 = r10.A0S;
                    if (r1 != null) {
                        r1.A01 = false;
                        r1.A00();
                    }
                    r10.A0C = facebookMapPreview.A01;
                    return;
                }
                return;
            case 1:
                AnonymousClass5B8 r12 = (AnonymousClass5B8) this.A00;
                if (r12.A06 == null) {
                    r12.A06 = r10;
                    r12.setLocationMode(r12.A02);
                    return;
                }
                return;
            case 2:
                GroupChatLiveLocationsActivity groupChatLiveLocationsActivity = (GroupChatLiveLocationsActivity) this.A00;
                if (groupChatLiveLocationsActivity.A05 == null) {
                    groupChatLiveLocationsActivity.A05 = r10;
                    if (r10 != null) {
                        r10.A07(0, 0, groupChatLiveLocationsActivity.A01);
                        groupChatLiveLocationsActivity.A01 = 0;
                        C139266jV r02 = groupChatLiveLocationsActivity.A05;
                        C18740tg.A06(r02);
                        C139266jV r13 = r02.A0S.A00;
                        if (r13.A0F == null) {
                            C97614pz r03 = new C97614pz(r13);
                            r13.A0F = r03;
                            r13.A0B(r03);
                        }
                        AnonymousClass63E r04 = groupChatLiveLocationsActivity.A05.A0S;
                        r04.A01 = false;
                        r04.A00();
                        groupChatLiveLocationsActivity.A05.A09 = new C139236jS(groupChatLiveLocationsActivity);
                        C139266jV r14 = groupChatLiveLocationsActivity.A05;
                        r14.A0D = new C163577qQ(groupChatLiveLocationsActivity, 0);
                        r14.A0A = new C163477qG(groupChatLiveLocationsActivity, 2);
                        r14.A0C = new C163487qH(groupChatLiveLocationsActivity, 2);
                        r14.A0B = new C163567qP(groupChatLiveLocationsActivity, 0);
                        GroupChatLiveLocationsActivity.A0G(groupChatLiveLocationsActivity);
                        Bundle bundle = groupChatLiveLocationsActivity.A02;
                        if (bundle != null) {
                            groupChatLiveLocationsActivity.A0M.setLocationMode(bundle.getInt("map_location_mode", 2));
                            if (groupChatLiveLocationsActivity.A02.containsKey("camera_zoom")) {
                                groupChatLiveLocationsActivity.A05.A09(C1264964g.A00(C134976bv.A00(groupChatLiveLocationsActivity.A02.getDouble("camera_lat"), groupChatLiveLocationsActivity.A02.getDouble("camera_lng")), groupChatLiveLocationsActivity.A02.getFloat("camera_zoom")));
                            }
                            groupChatLiveLocationsActivity.A02 = null;
                            return;
                        } else if (groupChatLiveLocationsActivity.A0T.isEmpty()) {
                            SharedPreferences A002 = groupChatLiveLocationsActivity.A0R.A00(C19430v1.A0A);
                            C134976bv A003 = C134976bv.A00((double) A002.getFloat("live_location_lat", 37.389805f), (double) A002.getFloat("live_location_lng", -122.08141f));
                            C139266jV r15 = groupChatLiveLocationsActivity.A05;
                            C1264964g r05 = new C1264964g();
                            r05.A06 = A003;
                            r15.A09(r05);
                            r3 = groupChatLiveLocationsActivity.A05;
                            f = A002.getFloat("live_location_zoom", 16.0f) - 0.2f;
                            r0 = new C1264964g();
                            break;
                        } else {
                            GroupChatLiveLocationsActivity.A0I(groupChatLiveLocationsActivity, false);
                            return;
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            default:
                LocationPicker locationPicker = (LocationPicker) this.A00;
                if (locationPicker.A03 == null) {
                    locationPicker.A03 = r10;
                    if (r10 != null) {
                        C18740tg.A06(r10);
                        if (locationPicker.A0G.A05() && !locationPicker.A0P.A0i) {
                            locationPicker.A03.A0D(true);
                        }
                        C139266jV r2 = locationPicker.A03;
                        C133586Zc r06 = locationPicker.A0P;
                        r2.A07(0, 0, Math.max(r06.A01, r06.A02));
                        AnonymousClass63E r07 = locationPicker.A03.A0S;
                        r07.A01 = false;
                        r07.A00();
                        locationPicker.A03.A09 = new C139246jT(locationPicker);
                        C139266jV r22 = locationPicker.A03;
                        r22.A0D = new C163577qQ(locationPicker, 1);
                        r22.A0B = new C163567qP(locationPicker, 1);
                        r22.A0C = new C163487qH(locationPicker, 3);
                        r22.A0A = new C163477qG(locationPicker, 3);
                        locationPicker.A0P.A0U((Float) null, false);
                        C135096c8 r08 = locationPicker.A0P.A0W;
                        if (r08 != null && !r08.A0D.isEmpty()) {
                            locationPicker.A0P.A0N();
                        }
                        Bundle bundle2 = locationPicker.A02;
                        if (bundle2 == null) {
                            SharedPreferences A004 = locationPicker.A0T.A00(C19430v1.A0A);
                            C134976bv A005 = C134976bv.A00((double) A004.getFloat("share_location_lat", 37.389805f), (double) A004.getFloat("share_location_lon", -122.08141f));
                            r3 = locationPicker.A03;
                            f = A004.getFloat("share_location_zoom", 15.0f) - 0.2f;
                            r0 = new C1264964g();
                            r0.A06 = A005;
                            break;
                        } else {
                            locationPicker.A0O.setLocationMode(bundle2.getInt("map_location_mode", 2));
                            if (locationPicker.A02.containsKey("camera_zoom")) {
                                locationPicker.A03.A09(C1264964g.A00(C134976bv.A00(locationPicker.A02.getDouble("camera_lat"), locationPicker.A02.getDouble("camera_lng")), locationPicker.A02.getFloat("camera_zoom")));
                            }
                            locationPicker.A02 = null;
                            return;
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
        }
        r0.A01 = f;
        r3.A09(r0);
    }
}
