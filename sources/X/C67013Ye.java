package X;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import com.whatsapp.biz.profile.TrustSignalItem;

/* renamed from: X.3Ye  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C67013Ye implements View.OnClickListener {
    public final /* synthetic */ Uri A00;
    public final /* synthetic */ C24801Dv A01;
    public final /* synthetic */ TrustSignalItem A02;
    public final /* synthetic */ C201549jr A03;
    public final /* synthetic */ C206949uI A04;
    public final /* synthetic */ C134766bZ A05;
    public final /* synthetic */ Integer A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ boolean A08;
    public final /* synthetic */ boolean A09;

    public /* synthetic */ C67013Ye(Uri uri, C24801Dv r2, TrustSignalItem trustSignalItem, C201549jr r4, C206949uI r5, C134766bZ r6, Integer num, String str, boolean z, boolean z2) {
        this.A00 = uri;
        this.A01 = r2;
        this.A02 = trustSignalItem;
        this.A05 = r6;
        this.A03 = r4;
        this.A07 = str;
        this.A06 = num;
        this.A08 = z;
        this.A09 = z2;
        this.A04 = r5;
    }

    public final void onClick(View view) {
        Uri uri = this.A00;
        C24801Dv r5 = this.A01;
        TrustSignalItem trustSignalItem = this.A02;
        C134766bZ r0 = this.A05;
        C201549jr r7 = this.A03;
        String str = this.A07;
        Integer num = this.A06;
        boolean z = this.A08;
        boolean z2 = this.A09;
        C206949uI r2 = this.A04;
        Context context = trustSignalItem.getContext();
        r7.A05(num, Integer.valueOf(r0.A00), str, 15, trustSignalItem.A00, z);
        C36361kB.A0y(context, uri, r5);
        if (z2) {
            r7.A02(r2, 11);
        }
    }
}
