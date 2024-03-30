package X;

import com.whatsapp.R;
import java.io.File;

/* renamed from: X.5MJ  reason: invalid class name */
public class AnonymousClass5MJ extends C132446Tt {
    public final int A00;
    public final C117035lb A01;
    public final File A02;
    public final boolean A03;
    public final byte[] A04;

    public AnonymousClass5MJ(AnonymousClass012 r2, C117035lb r3, File file, byte[] bArr, int i, boolean z) {
        super(r2, true);
        this.A01 = r3;
        this.A04 = bArr;
        this.A00 = i;
        this.A03 = z;
        this.A02 = file;
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        C121485tD r8 = (C121485tD) obj;
        AnonymousClass6YT r6 = this.A01.A00;
        if (r6.A0A != null) {
            C012005e.A02(r6.A09, R.id.save_progress).setVisibility(8);
            if (r8 == null) {
                r6.A0a.A06(R.string.f12nameremoved, 1);
                r6.A12.BSr();
                return;
            }
            C21050ya A0O = r6.A0l.A0O();
            C18740tg.A06(A0O);
            AnonymousClass6YT.A0G(r6, new C145666uK(A0O, r8.A01, r8.A00, r8.A02), (AnonymousClass2Ty) null, true);
        }
    }
}
