package X;

import android.app.Activity;
import android.text.TextUtils;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.9Xv  reason: invalid class name and case insensitive filesystem */
public class C196129Xv {
    public long A00 = -1;
    public final AnonymousClass17Y A01;
    public final C19970wo A02;
    public final C19630wG A03;
    public final AnonymousClass19A A04;
    public final C202269lR A05;
    public final AE0 A06;
    public final C29221Vu A07;
    public final C24601Db A08;
    public final Set A09 = C36441kJ.A16();
    public final AnonymousClass1NH A0A;

    public synchronized HashSet A00() {
        HashSet A16;
        A16 = C36441kJ.A16();
        for (AnonymousClass9Tt r0 : this.A09) {
            A16.add((String) r0.A00.A00);
        }
        return A16;
    }

    public void A01(Activity activity, C22952Az4 az4, C29121Vk r11, String str, boolean z) {
        this.A0A.A00(activity, new A8R(activity, this, az4, r11, str, z), z);
    }

    public synchronized void A02(C135086c7 r6, boolean z) {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("PAY: IndiaUpiBlockListManager before block vpa: ");
        A0u.append(r6);
        C36321k7.A1X(" blocked: ", A0u, z);
        if (z) {
            AnonymousClass9Tt r2 = new AnonymousClass9Tt(r6, this);
            Set<AnonymousClass9Tt> set = this.A09;
            if (!set.contains(r2)) {
                set.add(r2);
                C36321k7.A1K(r2, "PAY: IndiaUpiBlockListManager add vpa: ", AnonymousClass000.A0u());
                C24601Db r3 = this.A08;
                HashSet A16 = C36441kJ.A16();
                for (AnonymousClass9Tt r0 : set) {
                    A16.add(r0.A00.A00);
                }
                r3.A0L(TextUtils.join(";", A16));
            }
        } else {
            AnonymousClass9Tt r22 = new AnonymousClass9Tt(r6, this);
            Set<AnonymousClass9Tt> set2 = this.A09;
            if (set2.contains(r22)) {
                set2.remove(r22);
                C36321k7.A1K(r22, "PAY: IndiaUpiBlockListManager remove vpa: ", AnonymousClass000.A0u());
                C24601Db r32 = this.A08;
                HashSet A162 = C36441kJ.A16();
                for (AnonymousClass9Tt r02 : set2) {
                    A162.add(r02.A00.A00);
                }
                r32.A0L(TextUtils.join(";", A162));
            }
        }
    }

    public synchronized boolean A03(C135086c7 r3) {
        return this.A09.contains(new AnonymousClass9Tt(r3, this));
    }

    public C196129Xv(AnonymousClass1NH r7, AnonymousClass17Y r8, C19970wo r9, C19630wG r10, AnonymousClass19A r11, C202269lR r12, AE0 ae0, C29221Vu r14, C24601Db r15) {
        this.A03 = r10;
        this.A02 = r9;
        this.A0A = r7;
        this.A01 = r8;
        this.A04 = r11;
        this.A08 = r15;
        this.A05 = r12;
        this.A07 = r14;
        this.A06 = ae0;
        this.A00 = r15.A03().getLong("payments_block_list_last_sync_time", -1);
        String string = r15.A03().getString("payments_block_list", "");
        if (!TextUtils.isEmpty(string)) {
            for (String A0S : string.split(";")) {
                this.A09.add(new AnonymousClass9Tt(C165577te.A0S(A0S), this));
            }
        }
    }
}
