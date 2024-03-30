package X;

import android.app.Activity;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.6p7  reason: invalid class name and case insensitive filesystem */
public final class C142586p7 implements C159167iv {
    public final /* synthetic */ long A00;
    public final /* synthetic */ Activity A01;
    public final /* synthetic */ AnonymousClass54H A02;
    public final /* synthetic */ AnonymousClass11F A03;
    public final /* synthetic */ C206969uL A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ HashMap A08;
    public final /* synthetic */ HashMap A09;

    public C142586p7(Activity activity, AnonymousClass54H r2, AnonymousClass11F r3, C206969uL r4, String str, String str2, String str3, HashMap hashMap, HashMap hashMap2, long j) {
        this.A02 = r2;
        this.A01 = activity;
        this.A06 = str;
        this.A00 = j;
        this.A03 = r3;
        this.A05 = str2;
        this.A09 = hashMap;
        this.A04 = r4;
        this.A07 = str3;
        this.A08 = hashMap2;
    }

    public void onSuccess() {
        this.A02.A0H(this.A01, this.A03, this.A06, this.A05, this.A09, this.A00);
    }

    public void BXR(Map map) {
        C36321k7.A1J(map, "onFailure", AnonymousClass000.A0u());
        if (map.containsKey("validation_errors")) {
            C206969uL r4 = this.A04;
            HashMap A012 = C131866Qy.A01(r4.A01);
            C90484aE.A1I("validation_errors", A012, map);
            A012.remove("saved_addresses");
            AnonymousClass54H r2 = this.A02;
            Activity activity = this.A01;
            HashMap A002 = AnonymousClass54H.A00(activity, r2, r4, A012);
            r2.A0I(activity, r4, this.A06, this.A07, this.A08, A002, this.A00);
            return;
        }
        this.A02.A0H(this.A01, this.A03, this.A06, this.A05, this.A09, this.A00);
    }
}
