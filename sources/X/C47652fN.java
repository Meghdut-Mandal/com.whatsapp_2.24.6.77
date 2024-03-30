package X;

import java.util.List;

/* renamed from: X.2fN  reason: invalid class name and case insensitive filesystem */
public class C47652fN extends C125445zv {
    public final /* synthetic */ boolean A00;
    public final /* synthetic */ AnonymousClass3HE A01;

    public C47652fN(AnonymousClass3HE r1, boolean z) {
        this.A01 = r1;
        this.A00 = z;
    }

    public void A00(List list) {
        list.size();
        boolean z = false;
        if (list.size() == 1 && ((AnonymousClass68B) list.get(0)).A0R) {
            z = true;
        }
        if (list.size() == 0 || z) {
            this.A01.A08.A00(new AnonymousClass75B(34, (Object) this, this.A00));
            return;
        }
        AnonymousClass3HE r2 = this.A01;
        C36331k8.A0w(C19420v0.A00(r2.A06.A04), "sticker_picker_initial_download", true);
        r2.A00(this.A00);
    }
}
