package X;

import android.provider.ContactsContract;
import android.util.SparseArray;
import com.whatsapp.R;
import com.whatsapp.util.Log;
import com.whatsapp.viewsharedcontacts.ViewSharedContactArrayActivity;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.2k9  reason: invalid class name */
public class AnonymousClass2k9 extends C132446Tt {
    public final AnonymousClass1N4 A00;
    public final AnonymousClass1X4 A01;
    public final C19970wo A02;
    public final C18820ts A03;
    public final AnonymousClass11F A04;
    public final AnonymousClass147 A05;
    public final C64933Qa A06;
    public final AnonymousClass1A1 A07;
    public final WeakReference A08;
    public final ArrayList A09;
    public final ArrayList A0A;
    public final boolean A0B;
    public final C20310xM A0C;

    public AnonymousClass2k9(AnonymousClass1N4 r2, AnonymousClass1X4 r3, C19970wo r4, C18820ts r5, C20310xM r6, AnonymousClass11F r7, AnonymousClass147 r8, C64933Qa r9, AnonymousClass1A1 r10, ViewSharedContactArrayActivity viewSharedContactArrayActivity, ArrayList arrayList, ArrayList arrayList2, boolean z) {
        super(viewSharedContactArrayActivity, true);
        this.A02 = r4;
        this.A01 = r3;
        this.A03 = r5;
        this.A0C = r6;
        this.A00 = r2;
        this.A07 = r10;
        this.A08 = AnonymousClass001.A0F(viewSharedContactArrayActivity);
        this.A04 = r7;
        this.A09 = arrayList;
        this.A0A = arrayList2;
        this.A0B = z;
        this.A06 = r9;
        this.A05 = r8;
    }

    public void A0A() {
        C225314u A0W = C36411kG.A0W(this.A08);
        if (A0W != null) {
            A0W.Bu2(R.string.f12nameremoved, R.string.f12nameremoved);
        }
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        Boolean bool = (Boolean) obj;
        C225314u A0W = C36411kG.A0W(this.A08);
        if (A0W != null) {
            A0W.Bnv();
            if (bool.booleanValue()) {
                C36331k8.A0m(A0W);
            } else {
                A0W.BO5(R.string.f12nameremoved);
            }
        }
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        ArrayList arrayList;
        AnonymousClass3T1 r10;
        ArrayList A0I = AnonymousClass001.A0I();
        int i = 0;
        while (true) {
            arrayList = this.A09;
            r10 = null;
            if (i >= arrayList.size()) {
                break;
            }
            C65643Sx r6 = (C65643Sx) arrayList.get(i);
            SparseArray sparseArray = (SparseArray) this.A0A.get(i);
            for (int i2 = 0; i2 < sparseArray.size(); i2++) {
                C598935r r8 = (C598935r) sparseArray.get(i2);
                if (!r8.A01) {
                    C36321k7.A1T("unchecked:", AnonymousClass000.A0u(), i2);
                    if (r8.A00 instanceof AnonymousClass3KL) {
                        AnonymousClass3KL r82 = (AnonymousClass3KL) r8.A00;
                        List list = (List) r6.A08.get(r82.A01);
                        if (list != null) {
                            list.remove(r82);
                            if (list.isEmpty()) {
                                r6.A08.remove(r82.A01);
                            }
                        }
                    } else {
                        Object obj = r8.A00;
                        if (obj instanceof AnonymousClass3A9) {
                            AnonymousClass3A9 r9 = (AnonymousClass3A9) obj;
                            r6.A03.remove(r9);
                            if (r9.A01 == ContactsContract.CommonDataKinds.Email.class) {
                                StringBuilder A0u = AnonymousClass000.A0u();
                                A0u.append("email");
                                C36321k7.A1N(r8.A00, A0u);
                            } else if (r9.A01 == ContactsContract.CommonDataKinds.StructuredPostal.class) {
                                StringBuilder A0u2 = AnonymousClass000.A0u();
                                A0u2.append("postal");
                                C36321k7.A1N(r8.A00, A0u2);
                            }
                        } else if (obj instanceof C607439e) {
                            r6.A06.remove(r8.A00);
                            StringBuilder A0u3 = AnonymousClass000.A0u();
                            A0u3.append("phone:");
                            C36321k7.A1N(r8.A00, A0u3);
                        } else if (r8.A00 instanceof AnonymousClass362) {
                            r6.A07.remove(r8.A00);
                            StringBuilder A0u4 = AnonymousClass000.A0u();
                            A0u4.append("website:");
                            C36321k7.A1N(r8.A00, A0u4);
                        } else if (r8.A00 instanceof C599735z) {
                            r6.A09.A01 = null;
                            StringBuilder A0u5 = AnonymousClass000.A0u();
                            A0u5.append("lid:");
                            C36321k7.A1N(r8.A00, A0u5);
                        }
                    }
                }
            }
            try {
                A0I.add(new C64643Ow(this.A00, this.A03).A01(r6));
                i++;
            } catch (AnonymousClass1YJ e) {
                Log.e((Throwable) e);
                return false;
            }
        }
        C64933Qa r1 = this.A06;
        if (r1 != null) {
            r10 = this.A07.A03(r1);
        } else {
            AnonymousClass147 r2 = this.A05;
            if (r2 != null) {
                r10 = C55162uB.A00(r2, (String) null, (String) null, C19970wo.A00(this.A02));
            }
        }
        if (arrayList.size() > 1) {
            AnonymousClass1X4 r22 = this.A01;
            AnonymousClass11F r0 = this.A04;
            r22.A0Z(r10, Collections.singletonList(r0), A0I, this.A0B);
        } else {
            AnonymousClass1X4 r92 = this.A01;
            AnonymousClass11F r12 = this.A04;
            r92.A0Y(r10, ((C65643Sx) arrayList.get(0)).A03(), C36421kH.A0e(A0I, 0), Collections.singletonList(r12), this.A0B);
        }
        return true;
    }
}
