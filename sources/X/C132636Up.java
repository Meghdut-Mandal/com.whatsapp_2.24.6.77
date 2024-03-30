package X;

import android.os.Bundle;
import android.os.Message;

/* renamed from: X.6Up  reason: invalid class name and case insensitive filesystem */
public class C132636Up {
    public final Bundle A00;
    public final Message A01;
    public final Object A02;
    public final String A03;

    public C132636Up(String str) {
        C18740tg.A0B(true);
        this.A03 = str;
        this.A00 = null;
        this.A01 = null;
        this.A02 = null;
    }

    public static void A00(AnonymousClass1PW r1, String str) {
        r1.A00(new C132636Up(str));
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("action=");
        A0u.append(this.A03);
        A0u.append(", args=");
        A0u.append(this.A00);
        A0u.append(", message=");
        return AnonymousClass000.A0o(this.A01, A0u);
    }

    public C132636Up(Message message, String str) {
        C18740tg.A0B(true);
        this.A03 = str;
        this.A00 = null;
        this.A01 = message;
        this.A02 = null;
    }

    public C132636Up(String str, Bundle bundle) {
        C18740tg.A0B(true);
        this.A03 = str;
        this.A00 = bundle;
        this.A01 = null;
        this.A02 = null;
    }

    public C132636Up(String str, Object obj) {
        C18740tg.A0B(true);
        this.A03 = str;
        this.A00 = null;
        this.A01 = null;
        this.A02 = obj;
    }
}
