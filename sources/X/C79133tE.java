package X;

import android.content.Context;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;

/* renamed from: X.3tE  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C79133tE implements AnonymousClass4SC {
    public final /* synthetic */ C207269up A00;
    public final /* synthetic */ C69403dT A01;
    public final /* synthetic */ UserJid A02;
    public final /* synthetic */ boolean A03;

    public /* synthetic */ C79133tE(C207269up r1, C69403dT r2, UserJid userJid, boolean z) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = userJid;
        this.A03 = z;
    }

    public final void BTp(View view, AnonymousClass3A6 r18) {
        C69403dT r3 = this.A01;
        C207269up r2 = this.A00;
        UserJid userJid = this.A02;
        boolean z = this.A03;
        if (view.getTag(R.id.loaded_image_url) != null) {
            C29461Ws r1 = r3.A0D;
            String str = r2.A0F;
            if (r1.A06((UserJid) null, str) == null) {
                r3.A08.A06(R.string.f12nameremoved, 0);
                Log.w("CatalogMediaCard/MediaThumbnailOnClick/product no longer exists");
                return;
            }
            C87034Nf r0 = r3.A01.A04;
            if (r0 != null) {
                C69273dG.A03(((C69383dR) r0).A00, 7);
            }
            int thumbnailPixelSize = r3.A01.A08.getThumbnailPixelSize();
            boolean A0M = r3.A09.A0M(userJid);
            String A002 = r3.A0A.A00(r3.A02);
            if ("UNBLOCKED".equals(A002)) {
                Context context = r3.A00;
                int i = 5;
                if (r3.A03 == null) {
                    i = 4;
                }
                Integer valueOf = Integer.valueOf(thumbnailPixelSize);
                AnonymousClass3SM.A03(context, r3.A0C, r3.A0E, userJid, valueOf, valueOf, str, i, A0M, A0M, z);
                return;
            }
            r3.A0E.A02(r3.A00, A002);
        }
    }
}
