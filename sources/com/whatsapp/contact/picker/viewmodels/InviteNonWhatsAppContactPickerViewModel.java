package com.whatsapp.contact.picker.viewmodels;

import X.AnonymousClass001;
import X.AnonymousClass00C;
import X.AnonymousClass08S;
import X.AnonymousClass08X;
import X.AnonymousClass141;
import X.AnonymousClass16D;
import X.AnonymousClass171;
import X.C001600r;
import X.C001700s;
import X.C18820ts;
import X.C20810yC;
import X.C28201Rs;
import X.C28271Rz;
import X.C36321k7;
import X.C36431kI;
import X.C36441kJ;
import android.app.Application;
import com.whatsapp.util.Log;
import java.util.List;
import java.util.Map;

public final class InviteNonWhatsAppContactPickerViewModel extends AnonymousClass08X {
    public String A00;
    public boolean A01;
    public final C001600r A02;
    public final C001600r A03;
    public final C001600r A04;
    public final C001600r A05;
    public final C001600r A06;
    public final C001600r A07;
    public final AnonymousClass08S A08;
    public final AnonymousClass08S A09 = C36441kJ.A0Y();
    public final C001700s A0A;
    public final C001700s A0B;
    public final C001700s A0C;
    public final C001700s A0D;
    public final C001700s A0E;
    public final AnonymousClass16D A0F;
    public final AnonymousClass171 A0G;
    public final C18820ts A0H;
    public final C20810yC A0I;
    public final C28271Rz A0J;
    public final C28201Rs A0K;
    public final List A0L;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InviteNonWhatsAppContactPickerViewModel(Application application, AnonymousClass16D r3, AnonymousClass171 r4, C18820ts r5, C20810yC r6, C28271Rz r7) {
        super(application);
        C36321k7.A1B(application, r6, r3, r5, r4);
        AnonymousClass00C.A0D(r7, 6);
        this.A0I = r6;
        this.A0F = r3;
        this.A0H = r5;
        this.A0G = r4;
        this.A0J = r7;
        C28201Rs A0t = C36441kJ.A0t();
        this.A0K = A0t;
        this.A02 = A0t;
        C001700s A0S = C36431kI.A0S();
        this.A0D = A0S;
        this.A07 = A0S;
        AnonymousClass08S A0Y = C36441kJ.A0Y();
        this.A08 = A0Y;
        this.A06 = A0Y;
        this.A0E = C36431kI.A0S();
        C001700s A0S2 = C36431kI.A0S();
        this.A0C = A0S2;
        this.A05 = A0S2;
        C001700s A0S3 = C36431kI.A0S();
        this.A0B = A0S3;
        this.A04 = A0S3;
        C001700s A0S4 = C36431kI.A0S();
        this.A0A = A0S4;
        this.A03 = A0S4;
        this.A0L = AnonymousClass001.A0I();
    }

    public static final void A01(AnonymousClass141 r2, Map map) {
        String A0J2 = r2.A0J();
        if (A0J2 == null || A0J2.length() == 0) {
            Log.i("InviteNonWhatsAppContactPickerViewModel/fillNameToContactMap/display name missing");
            return;
        }
        List list = (List) map.get(A0J2);
        if (list == null) {
            list = AnonymousClass001.A0I();
        }
        list.add(r2);
        map.put(A0J2, list);
    }
}
