package com.whatsapp.storage;

import X.AnonymousClass001;
import X.AnonymousClass01z;
import X.AnonymousClass1X4;
import X.AnonymousClass3F7;
import X.AnonymousClass3LW;
import X.AnonymousClass3T1;
import X.AnonymousClass4XQ;
import X.C177528dw;
import X.C19770wU;
import X.C36381kD;
import X.C36391kE;
import X.C39001qm;
import X.C601036m;
import X.C88254Rz;
import X.C90264Zs;
import android.app.Dialog;
import android.os.Bundle;
import com.whatsapp.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class StorageUsageDeleteMessagesDialogFragment extends Hilt_StorageUsageDeleteMessagesDialogFragment {
    public AnonymousClass1X4 A00;
    public C88254Rz A01;
    public C19770wU A02;
    public Collection A03;
    public Collection A04;
    public boolean A05;
    public boolean A06;

    public static StorageUsageDeleteMessagesDialogFragment A03(C88254Rz r5, Collection collection, Collection collection2) {
        StorageUsageDeleteMessagesDialogFragment storageUsageDeleteMessagesDialogFragment = new StorageUsageDeleteMessagesDialogFragment();
        storageUsageDeleteMessagesDialogFragment.A04 = collection;
        ArrayList A0I = AnonymousClass001.A0I();
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            AnonymousClass3T1 A0l = C36391kE.A0l(it);
            if (!(A0l.A1J.A00 instanceof C177528dw)) {
                A0I.add(A0l);
            }
        }
        storageUsageDeleteMessagesDialogFragment.A03 = A0I;
        storageUsageDeleteMessagesDialogFragment.A01 = r5;
        return storageUsageDeleteMessagesDialogFragment;
    }

    public Dialog A1a(Bundle bundle) {
        boolean z;
        boolean z2;
        int i;
        String str;
        C90264Zs r3;
        Iterator it = this.A04.iterator();
        while (true) {
            if (it.hasNext()) {
                if (C36391kE.A0l(it).A15) {
                    z = true;
                    break;
                }
            } else {
                z = false;
                break;
            }
        }
        Iterator it2 = this.A03.iterator();
        while (true) {
            if (it2.hasNext()) {
                if (C36391kE.A0l(it2).A15) {
                    z2 = true;
                    break;
                }
            } else {
                z2 = false;
                break;
            }
        }
        if (z) {
            int size = this.A04.size();
            i = R.string.f12nameremoved;
            if (size == 1) {
                i = R.string.f12nameremoved;
            }
        } else if (z2 || this.A03.size() <= this.A04.size()) {
            int size2 = this.A04.size();
            i = R.string.f12nameremoved;
            if (size2 == 1) {
                i = R.string.f12nameremoved;
            }
        } else {
            int size3 = this.A04.size();
            i = R.string.f12nameremoved;
            if (size3 == 1) {
                i = R.string.f12nameremoved;
            }
        }
        String A0n = A0n(i);
        AnonymousClass3F7 r6 = new AnonymousClass3F7(A1D());
        int size4 = this.A04.size();
        int i2 = R.string.f12nameremoved;
        if (size4 == 1) {
            i2 = R.string.f12nameremoved;
        }
        r6.A06 = A0n(i2);
        r6.A05 = A0n;
        if (z) {
            if (this.A04.size() == 1) {
                this.A06 = true;
            } else {
                str = A0n(R.string.f12nameremoved);
                r3 = new C90264Zs(this, 0);
                r6.A07.add(new C601036m(r3, str, false));
            }
        } else if (!z2 && this.A03.size() > this.A04.size()) {
            str = A0n(R.string.f12nameremoved);
            r3 = new C90264Zs(this, 1);
            r6.A07.add(new C601036m(r3, str, false));
        }
        AnonymousClass4XQ r1 = new AnonymousClass4XQ(this, 8);
        C39001qm A022 = AnonymousClass3LW.A02(this);
        A022.A0j(r6.A00());
        A022.A0h(r1, R.string.f12nameremoved);
        A022.A0f(new AnonymousClass4XQ(this, 9), R.string.f12nameremoved);
        A022.A0r(true);
        return A022.create();
    }

    public void A1f(AnonymousClass01z r1, String str) {
        C36381kD.A1F(this, r1, str);
    }
}
