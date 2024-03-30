package X;

/* renamed from: X.8bf  reason: invalid class name and case insensitive filesystem */
public class C176158bf extends AnonymousClass197 {
    public final String index;
    public final byte[] mutationMac;
    public final C199769fw operation;
    public final int reason;
    public final AnonymousClass8SS syncActionValue;
    public final C201539jo syncdKeyId;
    public final int version;

    public C176158bf(C199769fw r3, C201539jo r4, AnonymousClass8SS r5, Integer num, String str, byte[] bArr, int i) {
        super(AnonymousClass000.A0r("MalformedMutationException with reason ", AnonymousClass000.A0u(), i));
        this.index = str;
        this.reason = i;
        this.version = C90484aE.A0B(num);
        this.syncdKeyId = r4;
        this.mutationMac = bArr;
        this.syncActionValue = r5;
        this.operation = r3;
    }

    public String getMessage() {
        return super.getMessage();
    }
}
