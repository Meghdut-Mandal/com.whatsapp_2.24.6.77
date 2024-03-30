package X;

import android.graphics.drawable.ColorDrawable;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.CircularProgressBar;
import com.whatsapp.R;
import com.whatsapp.businessdirectory.view.activity.DirectorySetLocationMapActivity;
import com.whatsapp.nativelibloader.WhatsAppLibLoader;

/* renamed from: X.6Za  reason: invalid class name and case insensitive filesystem */
public class C133566Za implements LocationListener {
    public Location A00;
    public View A01;
    public View A02;
    public View A03;
    public ImageView A04;
    public TextView A05;
    public CircularProgressBar A06;
    public AnonymousClass155 A07;
    public AnonymousClass6QG A08;
    public Double A09;
    public Double A0A;
    public Float A0B = Float.valueOf(16.0f);
    public String A0C;
    public boolean A0D = false;
    public boolean A0E = false;
    public boolean A0F = false;
    public boolean A0G = false;
    public final C237019m A0H;
    public final C19730wQ A0I;
    public final AnonymousClass5DR A0J;
    public final C129006Eo A0K;
    public final C21060yb A0L;
    public final WhatsAppLibLoader A0M;
    public final /* synthetic */ DirectorySetLocationMapActivity A0N;

    public void A00() {
        this.A0C = null;
        this.A05.setText(R.string.f12nameremoved);
        C36331k8.A0r(this.A07, this.A05, R.color.f6nameremoved);
    }

    public void onProviderDisabled(String str) {
    }

    public void onProviderEnabled(String str) {
    }

    public void onStatusChanged(String str, int i, Bundle bundle) {
    }

    public C133566Za(C237019m r2, C19730wQ r3, AnonymousClass5DR r4, C129006Eo r5, DirectorySetLocationMapActivity directorySetLocationMapActivity, C21060yb r7, WhatsAppLibLoader whatsAppLibLoader) {
        this.A0N = directorySetLocationMapActivity;
        this.A0I = r3;
        this.A0L = r7;
        this.A0M = whatsAppLibLoader;
        this.A0H = r2;
        this.A0K = r5;
        this.A0J = r4;
    }

    public void A01() {
        LocationManager A0C2 = this.A0L.A0C();
        if (A0C2 != null && !A0C2.isProviderEnabled("gps") && !A0C2.isProviderEnabled("network")) {
            AnonymousClass3SJ.A01(this.A07, 2);
        }
    }

    public void A02(AnonymousClass4PN r7) {
        View A0D2 = C36421kH.A0D(this.A07, R.layout.f9nameremoved);
        TextView A0O = C36391kE.A0O(A0D2, R.id.permission_message);
        ImageView A0G2 = C36401kF.A0G(A0D2, R.id.permission_image_1);
        View A022 = C012005e.A02(A0D2, R.id.submit);
        View A023 = C012005e.A02(A0D2, R.id.cancel);
        A0O.setText(R.string.f12nameremoved);
        A0G2.setImageResource(R.drawable.permission_location);
        C39001qm A002 = AnonymousClass3LW.A00(this.A07);
        A002.A0j(A0D2);
        A002.A0r(true);
        AnonymousClass0FM create = A002.create();
        if (create.getWindow() != null) {
            create.getWindow().setBackgroundDrawable(new ColorDrawable(AnonymousClass00F.A00(this.A07, R.color.f6nameremoved)));
        }
        C67113Yo.A00(A022, this, r7, create, 12);
        C36361kB.A18(A023, create, 41);
        create.show();
        this.A0E = true;
        C36331k8.A0w(C90474aD.A0H(this.A0J.A03), "DIRECTORY_LOCATION_INFO_SHOWN", true);
    }

    public void A03(String str) {
        this.A0C = str;
        if (!TextUtils.isEmpty(str)) {
            this.A05.setText(str);
            C36321k7.A0M(this.A07, this.A05, R.attr.f4nameremoved, R.color.f6nameremoved);
        }
    }

    public void onLocationChanged(Location location) {
        if (location != null) {
            if (this.A00 == null) {
                DirectorySetLocationMapActivity directorySetLocationMapActivity = this.A0N;
                if (directorySetLocationMapActivity.A01 != null && this.A09 == null && this.A0A == null) {
                    directorySetLocationMapActivity.A0E.setLocationMode(1);
                    directorySetLocationMapActivity.A01.A0A(AnonymousClass6UP.A01(C90474aD.A0N(location)));
                }
            }
            DirectorySetLocationMapActivity directorySetLocationMapActivity2 = this.A0N;
            if (directorySetLocationMapActivity2.A0A.A0F && directorySetLocationMapActivity2.A01 != null) {
                directorySetLocationMapActivity2.A01.A09(AnonymousClass6UP.A01(C90474aD.A0N(location)));
            }
            directorySetLocationMapActivity2.A0E.A06 = location;
            if (AnonymousClass1P6.A01(location, this.A00)) {
                this.A00 = location;
            }
        }
    }
}
