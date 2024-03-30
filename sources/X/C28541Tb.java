package X;

/* renamed from: X.1Tb  reason: invalid class name and case insensitive filesystem */
public class C28541Tb extends C28531Ta {
    public String description;
    public final Integer e2eFailureReason;

    public C28541Tb(Integer num) {
        this.description = null;
        this.e2eFailureReason = num;
    }

    public C28541Tb(Exception exc, Integer num) {
        super(exc);
        this.description = null;
        this.e2eFailureReason = num;
    }

    public C28541Tb(Integer num, String str) {
        this.e2eFailureReason = num;
        this.description = str;
    }
}
