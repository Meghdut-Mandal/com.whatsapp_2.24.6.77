package X;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.zzw;

/* renamed from: X.6nW  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C141606nW implements OnSuccessListener {
    public final /* synthetic */ AnonymousClass7cL A00;
    public final /* synthetic */ C118725od A01;
    public final /* synthetic */ C590532l A02;
    public final /* synthetic */ byte[] A03;

    public /* synthetic */ C141606nW(AnonymousClass7cL r1, C118725od r2, C590532l r3, byte[] bArr) {
        this.A01 = r2;
        this.A03 = bArr;
        this.A00 = r1;
        this.A02 = r3;
    }

    public final void onSuccess(Object obj) {
        C118725od r3 = this.A01;
        byte[] bArr = this.A03;
        AnonymousClass7cL r7 = this.A00;
        C590532l r5 = this.A02;
        Boolean bool = (Boolean) obj;
        r3.A00 = bool.booleanValue();
        C36321k7.A1K(bool, "BackupTokenUtils/setBlockStoreBytes/isE2EEAvailable ", AnonymousClass000.A0u());
        r3.A01 = bArr;
        AnonymousClass8Bh r6 = new AnonymousClass8Bh(bArr, r3.A00);
        C98754ry r72 = (C98754ry) r7;
        C07180Wq r4 = new C07180Wq((AnonymousClass0OR) null);
        r4.A03 = new C04520Ky[]{C114115gf.A03, C114115gf.A05};
        r4.A01 = new A3K(r6, r72);
        r4.A00 = 1645;
        r4.A02 = false;
        zzw A012 = C07590Yl.A01(r72, r4.A00(), 1);
        A012.addOnSuccessListener(new C141596nV(r5, bool));
        A012.addOnFailureListener(new C141576nT(r5, bool));
    }
}
