package X;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import com.whatsapp.mediaview.MediaViewBaseFragment;
import com.whatsapp.mediaview.PhotoView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.4Vb  reason: invalid class name and case insensitive filesystem */
public class C89054Vb extends C06580Ud {
    public Object A00;
    public Object A01;
    public final int A02;

    public C89054Vb(Object obj, Object obj2, int i) {
        this.A02 = i;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public void A00(List list, List list2, List list3) {
        if (this.A02 != 0) {
            super.A00(list, list2, list3);
            return;
        }
        ((AnonymousClass01I) this.A01).A21((C06580Ud) null);
        C65393Rw r1 = (C65393Rw) this.A00;
        C011004s.A08(r1.A06, (String) null);
        C011004s.A08(r1.A08, (String) null);
        ImageView imageView = r1.A07;
        if (imageView != null) {
            C011004s.A08(imageView, (String) null);
        }
    }

    public void A02(List list, Map map) {
        View A06;
        ArrayList<String> stringArrayList;
        PhotoView A1b;
        if (this.A02 != 0) {
            MediaViewBaseFragment mediaViewBaseFragment = ((AnonymousClass2XV) this.A00).A00;
            Object A1e = mediaViewBaseFragment.A1e(mediaViewBaseFragment.A08.getCurrentItem());
            if (A1e != null && (stringArrayList = ((Bundle) this.A01).getStringArrayList("visible_shared_elements")) != null && stringArrayList.contains(AnonymousClass000.A0p("thumb-transition-", A1e.toString(), AnonymousClass000.A0u())) && (A1b = mediaViewBaseFragment.A1b(A1e)) != null) {
                Object A1d = mediaViewBaseFragment.A1d();
                C18740tg.A06(A1d);
                list.remove(AnonymousClass000.A0p("thumb-transition-", A1d.toString(), AnonymousClass000.A0u()));
                list.add(AnonymousClass000.A0p("thumb-transition-", A1e.toString(), AnonymousClass000.A0u()));
                map.put(AnonymousClass000.A0p("thumb-transition-", A1e.toString(), AnonymousClass000.A0u()), A1b);
                return;
            }
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String A0C = AnonymousClass001.A0C(it);
            if (!map.containsKey(A0C) && (A06 = AnonymousClass3U9.A06(C36361kB.A0C((Activity) this.A01), A0C)) != null) {
                map.put(A0C, A06);
            }
        }
    }
}
