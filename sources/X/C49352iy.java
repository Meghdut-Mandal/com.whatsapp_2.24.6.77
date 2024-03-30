package X;

import com.whatsapp.community.CommunityDeleteDialogFragment;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.2iy  reason: invalid class name and case insensitive filesystem */
public final class C49352iy extends C132446Tt {
    public final /* synthetic */ long A00;
    public final /* synthetic */ CommunityDeleteDialogFragment A01;
    public final /* synthetic */ WeakReference A02;
    public final /* synthetic */ List A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C49352iy(C225314u r2, CommunityDeleteDialogFragment communityDeleteDialogFragment, WeakReference weakReference, List list, long j) {
        super(r2, true);
        this.A03 = list;
        this.A00 = j;
        this.A01 = communityDeleteDialogFragment;
        this.A02 = weakReference;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        List list = this.A03;
        CommunityDeleteDialogFragment communityDeleteDialogFragment = this.A01;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass11F A0a = C36401kF.A0a(it);
            AnonymousClass1X4 r1 = communityDeleteDialogFragment.A01;
            if (r1 != null) {
                r1.A0P(A0a, true);
            } else {
                throw C36331k8.A0d("userActions");
            }
        }
        C225314u.A0S(this.A00, 300);
        return null;
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        C225314u A0W = C36411kG.A0W(this.A02);
        if (A0W != null && !A0W.isFinishing()) {
            A0W.Bnv();
        }
        C24381Cf r1 = this.A01.A06;
        if (r1 != null) {
            r1.A01(0);
            return;
        }
        throw C36331k8.A0d("conversationObservers");
    }
}
