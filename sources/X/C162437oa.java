package X;

import com.whatsapp.businessapisearch.view.fragment.BusinessApiBrowseFragment;
import com.whatsapp.businessdirectory.view.fragment.BusinessDirectorySearchFragment;

/* renamed from: X.7oa  reason: invalid class name and case insensitive filesystem */
public class C162437oa extends AnonymousClass023 {
    public Object A00;
    public final int A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C162437oa(Object obj, int i) {
        super(true);
        this.A01 = i;
        this.A00 = obj;
    }

    public void A00() {
        if (this.A01 != 0) {
            ((BusinessDirectorySearchFragment) this.A00).A0B.A0T();
        } else {
            BusinessApiBrowseFragment.A00((BusinessApiBrowseFragment) this.A00).A3i();
        }
    }
}
