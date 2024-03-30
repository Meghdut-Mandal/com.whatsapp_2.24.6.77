package X;

import android.net.Uri;
import android.os.Bundle;
import com.whatsapp.mediacomposer.MediaComposerActivity;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.6Tg  reason: invalid class name and case insensitive filesystem */
public class C132366Tg {
    public final Map A00 = AnonymousClass001.A0J();

    public static int A00(Uri uri, AnonymousClass6VT r3) {
        return r3.A0C.A01(r3.A0B.A03(uri));
    }

    public static AnonymousClass6QO A01(Uri uri, Object obj) {
        return ((MediaComposerActivity) obj).A1r.A03(uri);
    }

    public AnonymousClass6QO A03(Uri uri) {
        Map map = this.A00;
        AnonymousClass6QO r0 = (AnonymousClass6QO) map.get(uri);
        if (r0 != null) {
            return r0;
        }
        Log.e("mediapreviewparams/get/item should be explicitly added");
        AnonymousClass6QO r02 = new AnonymousClass6QO(uri);
        map.put(uri, r02);
        return r02;
    }

    public ArrayList A04() {
        return C90494aF.A0g(this.A00);
    }

    public void A05(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("media_preview_params");
        if (bundle2 != null) {
            Map map = this.A00;
            map.clear();
            ArrayList parcelableArrayList = bundle2.getParcelableArrayList("items");
            if (parcelableArrayList != null) {
                Iterator it = parcelableArrayList.iterator();
                while (it.hasNext()) {
                    AnonymousClass6QO r1 = ((C134866bj) it.next()).A00;
                    map.put(r1.A0J, r1);
                }
            }
        }
    }

    public void A06(AnonymousClass6QO r4) {
        Map map = this.A00;
        Uri uri = r4.A0J;
        if (map.containsKey(uri)) {
            Log.e("mediapreviewparams/add/item was already added");
        }
        map.put(uri, r4);
    }

    public C132366Tg(AnonymousClass6QO r2) {
        A06(r2);
    }

    public static void A02(Bundle bundle, C132366Tg r19) {
        String str;
        ArrayList A0I = AnonymousClass001.A0I();
        Iterator A0z = AnonymousClass000.A0z(r19.A00);
        while (A0z.hasNext()) {
            AnonymousClass6QO r0 = (AnonymousClass6QO) A0z.next();
            AnonymousClass00C.A0D(r0, 1);
            Uri uri = r0.A0J;
            Integer A09 = r0.A09();
            File A08 = r0.A08();
            String A0A = r0.A0A();
            String A0C = r0.A0C();
            String A0B = r0.A0B();
            synchronized (r0) {
                str = r0.A0B;
            }
            int A02 = r0.A02();
            File A06 = r0.A06();
            C134866bj r4 = new C134866bj(r0.A03(), r0.A04(), uri, A08, A06, A09, A0A, A0C, A0B, str, A02, r0.A01(), r0.A0K());
            r4.A00 = r0;
            A0I.add(r4);
        }
        bundle.putParcelableArrayList("items", A0I);
    }

    public C132366Tg() {
    }
}
