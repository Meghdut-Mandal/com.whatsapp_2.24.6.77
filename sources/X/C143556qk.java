package X;

import com.whatsapp.businessdirectory.view.activity.DirectorySetLocationMapActivity;
import java.util.HashMap;

/* renamed from: X.6qk  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C143556qk implements AnonymousClass7g2 {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C164537ry A02;

    public /* synthetic */ C143556qk(C164537ry r1, int i, int i2) {
        this.A02 = r1;
        this.A00 = i;
        this.A01 = i2;
    }

    public final void BOj() {
        String str;
        C164537ry r0 = this.A02;
        int i = this.A00;
        int i2 = this.A01;
        C142646pD r5 = ((DirectorySetLocationMapActivity) r0.A00).A06;
        HashMap A0J = AnonymousClass001.A0J();
        if (i != -1) {
            if (i == 3) {
                if (i2 == 1) {
                    A0J.put("error_type", "geocoder_error");
                    str = "Geocoder's addresses list response is either null or empty";
                } else if (i2 == 0) {
                    A0J.put("error_type", "geocoder_error");
                    str = "Geocoder's address string is empty or null";
                }
            }
            r5.BOk(A0J, 7, 26);
        }
        A0J.put("error_type", "network_error");
        str = "Network error is identified by location picker client code before calling the GeoCoder API";
        A0J.put("error_description", str);
        r5.BOk(A0J, 7, 26);
    }
}
