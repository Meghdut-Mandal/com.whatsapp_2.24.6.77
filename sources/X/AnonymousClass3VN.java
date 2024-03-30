package X;

import android.content.DialogInterface;
import android.os.Bundle;
import com.whatsapp.util.Log;

/* renamed from: X.3VN  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3VN implements DialogInterface.OnClickListener {
    public final /* synthetic */ C225314u A00;
    public final /* synthetic */ AnonymousClass3DY A01;
    public final /* synthetic */ C19600wD A02;
    public final /* synthetic */ C21060yb A03;
    public final /* synthetic */ C20830yE A04;
    public final /* synthetic */ AnonymousClass1CF A05;
    public final /* synthetic */ AnonymousClass3UV A06;
    public final /* synthetic */ C19770wU A07;

    public /* synthetic */ AnonymousClass3VN(C225314u r1, AnonymousClass3DY r2, C19600wD r3, C21060yb r4, C20830yE r5, AnonymousClass1CF r6, AnonymousClass3UV r7, C19770wU r8) {
        this.A00 = r1;
        this.A07 = r8;
        this.A01 = r2;
        this.A03 = r4;
        this.A05 = r6;
        this.A04 = r5;
        this.A06 = r7;
        this.A02 = r3;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C225314u r4 = this.A00;
        C19770wU r1 = this.A07;
        AnonymousClass3DY r5 = this.A01;
        C21060yb r7 = this.A03;
        AnonymousClass1CF r10 = this.A05;
        C20830yE r8 = this.A04;
        AnonymousClass3UV r11 = this.A06;
        C19600wD r6 = this.A02;
        Log.i("RegistrationUtils/createCannotConnectDialog/dialog/cant-connect/button/checkstatus");
        AnonymousClass3SJ.A00(r4, 109);
        C36441kJ.A1E(new C50072kA((Bundle) null, r4, r5, r6, r7, r8, (AnonymousClass3XH) null, r10, r11, "reg/cant-connect", true, true, false), r1);
    }
}
