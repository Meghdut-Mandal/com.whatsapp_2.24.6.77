package X;

import com.whatsapp.businessdirectory.viewmodel.BusinessDirectoryContextualSearchViewModel;
import java.util.Map;

/* renamed from: X.6qw  reason: invalid class name and case insensitive filesystem */
public class C143676qw implements C159367jF {
    public final /* synthetic */ int A00;
    public final /* synthetic */ BusinessDirectoryContextualSearchViewModel A01;
    public final /* synthetic */ C144416s9 A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ boolean A07;

    public C143676qw(BusinessDirectoryContextualSearchViewModel businessDirectoryContextualSearchViewModel, C144416s9 r2, String str, String str2, String str3, String str4, int i, boolean z) {
        this.A01 = businessDirectoryContextualSearchViewModel;
        this.A07 = z;
        this.A02 = r2;
        this.A00 = i;
        this.A05 = str;
        this.A06 = str2;
        this.A04 = str3;
        this.A03 = str4;
    }

    public void Bav() {
        BusinessDirectoryContextualSearchViewModel businessDirectoryContextualSearchViewModel = this.A01;
        C142646pD r2 = businessDirectoryContextualSearchViewModel.A0M;
        int i = 20;
        if (this.A07) {
            i = 19;
        }
        r2.A08(C129006Eo.A00(businessDirectoryContextualSearchViewModel), C36371kC.A0p(), (Map) null, 1, i, 1);
        C144416s9 r13 = this.A02;
        int i2 = this.A00 + 1;
        String str = this.A05;
        String str2 = this.A06;
        String str3 = this.A04;
        String str4 = this.A03;
        BusinessDirectoryContextualSearchViewModel.A0D(businessDirectoryContextualSearchViewModel, r13);
        businessDirectoryContextualSearchViewModel.A0Y.A01(r13.A02, 1, str, str2, businessDirectoryContextualSearchViewModel.A0R.A0K, r13.A0H, str3, str4, i2, 1);
        BusinessDirectoryContextualSearchViewModel.A0E(businessDirectoryContextualSearchViewModel, r13, str, str2, str3, str4, i2);
    }

    public void Bdd(Integer num, Integer num2, Integer num3, Integer num4) {
        BusinessDirectoryContextualSearchViewModel businessDirectoryContextualSearchViewModel = this.A01;
        C142646pD r2 = businessDirectoryContextualSearchViewModel.A0M;
        int i = 18;
        if (this.A07) {
            i = 17;
        }
        r2.A08(C129006Eo.A00(businessDirectoryContextualSearchViewModel), C36371kC.A0o(), (Map) null, 1, i, 1);
        C144416s9 r13 = this.A02;
        int i2 = this.A00 + 1;
        String str = this.A05;
        String str2 = this.A06;
        String str3 = this.A04;
        String str4 = this.A03;
        BusinessDirectoryContextualSearchViewModel.A0D(businessDirectoryContextualSearchViewModel, r13);
        businessDirectoryContextualSearchViewModel.A0Y.A01(r13.A02, C36381kD.A0m(), str, str2, businessDirectoryContextualSearchViewModel.A0R.A0K, r13.A0H, str3, str4, i2, 1);
        BusinessDirectoryContextualSearchViewModel.A0E(businessDirectoryContextualSearchViewModel, r13, str, str2, str3, str4, i2);
    }
}
