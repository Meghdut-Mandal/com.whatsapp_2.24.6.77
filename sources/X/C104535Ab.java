package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.Map;

/* renamed from: X.5Ab  reason: invalid class name and case insensitive filesystem */
public class C104535Ab extends C146036uv {
    public final String A00;
    public final String A01;
    public final String A02;

    public void Blp(C160087kR r3) {
        C20810yC r1 = this.A03;
        if (!r1.A0E(5333) || !r1.A0E(1319)) {
            super.Blp(r3);
        } else {
            r3.BWk(C90514aH.A0s("extensions-business-endpoint-response-error"));
        }
    }

    public C104535Ab(C20050ww r14, C19420v0 r15, C20810yC r16, AnonymousClass1WF r17, AnonymousClass005 r18, String str, String str2, String str3, AnonymousClass004 r22, AnonymousClass004 r23) {
        super(r14, r15, r16, r17, r18, "WA|471011608249857|4b543e9203c0b420cb5617b71ff0b80a", (Map) null, r22, r23, 6295637663798499L);
        this.A02 = str;
        this.A01 = str2;
        this.A00 = str3;
        A07(PublicKeyCredentialControllerUtility.JSON_KEY_EXTENSTIONS);
    }
}
