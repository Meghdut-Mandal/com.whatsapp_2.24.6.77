package X;

import android.content.Context;
import android.os.Handler;
import java.util.HashMap;

/* renamed from: X.1RL  reason: invalid class name */
public final class AnonymousClass1RL {
    public Boolean A00;
    public Boolean A01;
    public final HashMap A02 = new HashMap();
    public final C20810yC A03;
    public final C19770wU A04;
    public final AnonymousClass19W A05;

    public AnonymousClass1RL(C20810yC r2, C19770wU r3, AnonymousClass19W r4) {
        AnonymousClass00C.A0D(r2, 1);
        AnonymousClass00C.A0D(r3, 2);
        AnonymousClass00C.A0D(r4, 3);
        this.A03 = r2;
        this.A04 = r3;
        this.A05 = r4;
    }

    public final AnonymousClass1RO A00(Context context) {
        boolean z;
        AnonymousClass1RM r3;
        Boolean bool = this.A00;
        if (bool == null) {
            bool = Boolean.valueOf(C20800yB.A01(C21000yV.A02, this.A03, 8016));
            this.A00 = bool;
        }
        if (AnonymousClass00C.A0J(bool, true)) {
            r3 = new C75373n7(new Handler(this.A05.A00()), this.A02);
        } else {
            Boolean bool2 = this.A01;
            if (bool2 == null) {
                bool2 = Boolean.valueOf(C20800yB.A01(C21000yV.A02, this.A03, 7969));
                this.A01 = bool2;
            }
            C19770wU r2 = this.A04;
            HashMap hashMap = this.A02;
            if (bool2 != null) {
                z = bool2.booleanValue();
            } else {
                z = false;
            }
            r3 = new AnonymousClass1RN(r2, hashMap, z);
        }
        return new AnonymousClass1RO(context, r3);
    }
}
