package X;

import java.io.Serializable;

/* renamed from: X.72G  reason: invalid class name */
public class AnonymousClass72G implements Serializable {
    public static final long serialVersionUID = 5218660121564017090L;
    public String code;
    public String encryptedBase64String;
    public String hmac;
    public String ki;
    public String oda;
    public String pid;
    public String skey;
    public String type;

    public AnonymousClass72G(String str, String str2, String str3) {
        this.ki = str;
        this.code = str2;
        this.encryptedBase64String = str3;
    }
}
