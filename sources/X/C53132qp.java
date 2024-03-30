package X;

import com.whatsapp.R;

/* renamed from: X.2qp  reason: invalid class name and case insensitive filesystem */
public abstract class C53132qp {
    public static AnonymousClass0FM A00(C24801Dv r9, C225314u r10, AnonymousClass4P4 r11, C33751fs r12, AnonymousClass11F r13, C20380xT r14, boolean z) {
        C225314u r6 = r10;
        C39001qm A00 = AnonymousClass3LW.A00(r10);
        boolean z2 = r13 instanceof C28981Uw;
        AnonymousClass4XL A002 = AnonymousClass4XL.A00(r11, 4);
        AnonymousClass3VH r4 = new AnonymousClass3VH(r9, r6, r11, r12, r14, z2);
        AnonymousClass4XV r1 = new AnonymousClass4XV(r11, 3);
        int i = R.string.f12nameremoved;
        if (z) {
            i = R.string.f12nameremoved;
        }
        if (z2) {
            i = R.string.f12nameremoved;
            if (z) {
                i = R.string.f12nameremoved;
            }
        }
        A00.A0Z(C36401kF.A0o(r6, i));
        A00.setPositiveButton(R.string.f12nameremoved, A002);
        A00.setNegativeButton(R.string.f12nameremoved, r4);
        A00.A0a(true);
        A00.A0N(r1);
        return A00.create();
    }
}
